package org.hl7.fhir.r5.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r5.context.SimpleWorkerContext;
import org.hl7.fhir.r5.elementmodel.Element;
import org.hl7.fhir.r5.elementmodel.Manager;
import org.hl7.fhir.r5.elementmodel.Manager.FhirFormat;
import org.hl7.fhir.r5.formats.IParser.OutputStyle;
import org.hl7.fhir.utilities.FileUtilities;
import org.hl7.fhir.utilities.filesystem.ManagedFileAccess;

public class ValidationTestConvertor {

  /**
   * @param args
   * @throws FHIRException
   * @throws IOException
   * @throws FileNotFoundException
   */
  public static void main(String[] args) throws FileNotFoundException, IOException, FHIRException {
    SimpleWorkerContext context = new SimpleWorkerContext.SimpleWorkerContextBuilder().fromPack("C:\\work\\org.hl7.fhir\\build\\publish\\validation-min.xml.zip");
    for (File f : ManagedFileAccess.file("C:\\work\\org.hl7.fhir\\build\\tests\\validation-examples").listFiles()) {
      if (f.getAbsolutePath().endsWith(".xml")) {
        File t = ManagedFileAccess.file(FileUtilities.changeFileExt(f.getAbsolutePath(), ".ttl"));
        if (!t.exists()) {
          try {
            System.out.print("Process " + f.getAbsolutePath());
            Element e = Manager.parseSingle(context, ManagedFileAccess.inStream(f), FhirFormat.XML);
            Manager.compose(context, e, ManagedFileAccess.outStream(t), FhirFormat.TURTLE, OutputStyle.PRETTY, null);
            System.out.println("   .... success");
          } catch (Exception e) {
            System.out.println("   .... fail: " + e.getMessage());
          }
        }
      }
      if (f.getAbsolutePath().endsWith(".json")) {
        if (!ManagedFileAccess.file(FileUtilities.changeFileExt(f.getAbsolutePath(), ".ttl")).exists()) {
          File t = ManagedFileAccess.file(FileUtilities.changeFileExt(f.getAbsolutePath(), ".ttl"));
          if (!t.exists()) {
            try {
              System.out.print("Process " + f.getAbsolutePath());
              Element e = Manager.parseSingle(context, ManagedFileAccess.inStream(f), FhirFormat.JSON);
              Manager.compose(context, e, ManagedFileAccess.outStream(t), FhirFormat.TURTLE, OutputStyle.PRETTY, null);
              System.out.println("   .... success");
            } catch (Exception e) {
              System.out.println("   .... fail: " + e.getMessage());
            }
          }
        }
      }
    }
  }
}