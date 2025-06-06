package org.hl7.fhir.r4b.test.misc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.xml.parsers.ParserConfigurationException;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.exceptions.FHIRFormatError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@Disabled
public class StructureMapTests {

  public static Stream<Arguments> data() throws ParserConfigurationException, IOException, FHIRFormatError {

    List<String> files = new ArrayList<>();
//    File dir = ManagedFileAccess.file(Utilities.path(TestingUtilities.home(), "implementations",  "r3maps", "R3toR4"));
//    for (File f : dir.listFiles())
//      if (f.getName().endsWith(".map"))
//        files.add(f.getAbsolutePath());
//    dir = ManagedFileAccess.file(Utilities.path(TestingUtilities.home(), "implementations",  "r3maps", "R4toR3"));
//    for (File f : dir.listFiles())
//      if (f.getName().endsWith(".map"))
//        files.add(f.getAbsolutePath());
    List<Arguments> objects = new ArrayList<>();
//    for (String fn : files) {
//      objects.add(new Object[] { ManagedFileAccess.file(fn).getName(), fn });
//    }
    return objects.stream();
  }

  @ParameterizedTest
  @MethodSource("data")
  public void test(String name, String filename) throws FHIRException, FileNotFoundException, IOException {
//    if (TestingUtilities.context == null) {
//      TestingUtilities.context = SimpleWorkerContext.fromPack(Utilities.path(TestingUtilities.content(), "definitions.xml.zip"));
//    }
//
//    String source = FileUtilities.fileToString(filename);
//    StructureMapUtilities utils = new StructureMapUtilities(TestingUtilities.context);
//    StructureMap map = utils.parse(source, filename);
//    String output = utils.render(map);
//    
//    source = source.replace("\t", " ").replace("  ", " ").replace(" \r\n", "\r\n").replace("\r\n\r\n", "\r\n");
//    output = output.replace("\t", " ").replace("  ", " ").replace(" \r\n", "\r\n").replace("\r\n\r\n", "\r\n");
//    String s = TestingUtilities.checkTextIsSame(source, output);
//    Assert.assertTrue(s, s == null);
  }

//  private void testParse(String path) throws FileNotFoundException, IOException, FHIRException {
//    if (TestingUtilities.context == null)
//    	TestingUtilities.context = SimpleWorkerContext.fromPack(Utilities.path(TestingUtilities.content(), "definitions.xml.zip"));
//    
//    StructureMapUtilities scm = new StructureMapUtilities(TestingUtilities.context, null, null);
//    StructureMap map = scm.parse(FileUtilities.fileToString(Utilities.path(TestingUtilities.home(), path)), path);
//    FileUtilities.stringToFile(scm.render(map), Utilities.path(TestingUtilities.home(), path+".out"));
//  }

//  @Test
//  public void testParseAny() throws FHIRException, IOException {
//    testParse("guides\\ccda2\\mapping\\map\\any.map");
//  }
//
//  @Test
//  public void testParseBL() throws FHIRException, IOException {
//    testParse("guides\\ccda2\\mapping\\map\\bl.map");
//  }
//
//  @Test
//  public void testParseED() throws FHIRException, IOException {
//    testParse("guides\\ccda2\\mapping\\map\\ed.map");
//  }
//
//  @Test
//  public void testParseCD() throws FHIRException, IOException {
//    testParse("guides\\ccda2\\mapping\\map\\cd.map");
//  }
//
//  @Test
//  public void testParseAD() throws FHIRException, IOException {
//    testParse("guides\\ccda2\\mapping\\map\\ad.map");
//  }
//
//  @Test
//  public void testParsePQ() throws FHIRException, IOException {
//    testParse("guides\\ccda2\\mapping\\map\\pq.map");
//  }
//
//  @Test
//  public void testParseIVLTS() throws FHIRException, IOException {
//    testParse("guides\\ccda2\\mapping\\map\\ivl-ts.map");
//  }
//
//  @Test
//  public void testParseCDA() throws FHIRException, IOException {
//    testParse("guides\\ccda2\\mapping\\map\\cda.map");
//  }

//  @Test
//  public void testTransformCDA() throws FileNotFoundException, Exception {
//    Map<String, StructureMap> maps = new HashMap<String, StructureMap>();
//
//    if (TestingUtilities.context == null)
//    	TestingUtilities.context = SimpleWorkerContext.fromPack(Utilities.path(TestingUtilities.content(), "definitions.xml.zip"));
//
//    StructureMapUtilities scu = new StructureMapUtilities(TestingUtilities.context, maps, null);
//    
//    for (String f : ManagedFileAccess.file(Utilities.path(TestingUtilities.home(), "guides", "ccda2", "mapping", "logical")).list()) {
//      try {
//        StructureDefinition sd = (StructureDefinition) new XmlParser().parse(ManagedFileAccess.inStream(Utilities.path(TestingUtilities.home(), "guides", "ccda2", "mapping", "logical", f)));
//        ((SimpleWorkerContext) TestingUtilities.context).seeResource(sd.getUrl(), sd);
//      } catch (Exception e) {
//        e.printStackTrace();
//      }
//    }
//   
//    for (String f : ManagedFileAccess.file(Utilities.path(TestingUtilities.home(), "guides", "ccda2", "mapping", "map")).list()) {
//      try {
//        StructureMap map = scu.parse(FileUtilities.fileToString(Utilities.path(TestingUtilities.home(), "guides", "ccda2", "mapping", "map", f)));
//        maps.put(map.getUrl(), map);
//      } catch (Exception e) {
//        e.printStackTrace();
//      }
//    }
//        
//    Element cda = Manager.parse(TestingUtilities.context, ManagedFileAccess.inStream("C:\\work\\org.hl7.fhir\\build\\guides\\ccda2\\mapping\\example\\ccd.xml"), FhirFormat.XML);
//    Manager.compose(TestingUtilities.context, cda, ManagedFileAccess.outStream("C:\\work\\org.hl7.fhir\\build\\guides\\ccda2\\mapping\\example\\ccd.out.json"), FhirFormat.JSON, OutputStyle.PRETTY, null);
//    Manager.compose(TestingUtilities.context, cda, ManagedFileAccess.outStream("C:\\work\\org.hl7.fhir\\build\\guides\\ccda2\\mapping\\example\\ccd.out.xml"), FhirFormat.XML, OutputStyle.PRETTY, null);
//    Bundle bundle = new Bundle();
//    scu.transform(null, cda, maps.get("http://hl7.org/fhir/StructureMap/cda"), bundle);
//    new XmlParser().setOutputStyle(OutputStyle.PRETTY).compose(ManagedFileAccess.outStream(Utilities.path("[tmp]", "bundle.xml"), bundle);
//  }
//
//  @Test
//  public void testTransformProfilesCDA() throws FileNotFoundException, Exception {
//    Map<String, StructureMap> maps = new HashMap<String, StructureMap>();
//
//    if (TestingUtilities.context == null)
//      TestingUtilities.context = SimpleWorkerContext.fromPack("C:\\work\\org.hl7.fhir\\build\\publish\\validation-min.xml.zip");
//
//    StructureMapUtilities scu = new StructureMapUtilities(TestingUtilities.context, maps, null);
//    
//    for (String f : ManagedFileAccess.file("C:\\work\\org.hl7.fhir\\build\\guides\\ccda\\CDA").list()) {
//      try {
//        StructureDefinition sd = (StructureDefinition) new XmlParser().parse(ManagedFileAccess.inStream("C:\\work\\org.hl7.fhir\\build\\guides\\ccda\\CDA\\"+f));
//        ((SimpleWorkerContext) TestingUtilities.context).seeResource(sd.getUrl(), sd);
//      } catch (Exception e) {
//      }
//    }
//
//    for (String f : ManagedFileAccess.file("C:\\work\\org.hl7.fhir\\build\\guides\\ccda2\\mapping\\map").list()) {
//      try {
//        StructureMap map = scu.parse(FileUtilities.fileToString("C:\\work\\org.hl7.fhir\\build\\guides\\ccda2\\mapping\\map\\"+ f));
//        maps.put(map.getUrl(), map);
//      } catch (Exception e) {
//      }
//    }
//        
//    List<StructureDefinition> result = scu.analyse(null, maps.get("http://hl7.org/fhir/StructureMap/cda")).getProfiles();
//    for (StructureDefinition sd : result)
//      new XmlParser().setOutputStyle(OutputStyle.PRETTY).compose(ManagedFileAccess.outStream(Utilities.path("[tmp]", "res-"+sd.getId()+".xml"), sd);
//  }
//
}