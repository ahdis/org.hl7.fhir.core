package org.hl7.fhir.r5.test.profiles;

import java.io.IOException;
import java.util.UUID;

import org.hl7.fhir.r5.context.IWorkerContext;
import org.hl7.fhir.r5.formats.JsonParser;
import org.hl7.fhir.r5.model.MedicinalProductDefinition;
import org.hl7.fhir.r5.model.Resource;
import org.hl7.fhir.r5.test.profiles.codegen.DkCoreDeCprIdentifier;
import org.hl7.fhir.r5.test.profiles.codegen.DkCorePatient;
import org.hl7.fhir.r5.test.profiles.codegen.MedicinalProductDefinitionUvEpi;
import org.hl7.fhir.r5.test.utils.TestPackageLoader;
import org.hl7.fhir.r5.test.utils.TestingUtilities;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.utilities.npm.FilesystemPackageCacheManager;
import org.hl7.fhir.utilities.npm.NpmPackage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * The files in org.hl7.fhir.r5.test.profiles.codegen are generated 
 * by running the validator with these parameters:
 * 
 *   -codegen -version R5 -ig hl7.fhir.dk.core#3.2.0 -ig hl7.fhir.uv.emedicinal-product-info#1.0.0 -profiles http://hl7.dk/fhir/core/StructureDefinition/* -output /Users/grahamegrieve/work/core/org.hl7.fhir.r5/src/test/java/org/hl7/fhir/r5/test/profiles -package-name org.hl7.fhir.r5.test.profiles -profiles http://hl7.org/fhir/uv/emedicinal-product-info/StructureDefinition/*
 * 
 * They should be regenerated by this command prior to running these tests for a full test of the code gen framework
 * Todo: change this test to generate them (easy) and compile them on the fly (not so easy)
 * 
 */
public class PECodeGenTests {


  private IWorkerContext ctxt;
  private NpmPackage dkcore;
  private NpmPackage emed;


  public void load() throws IOException {
    if (ctxt == null) {
      ctxt = TestingUtilities.getSharedWorkerContext();
      FilesystemPackageCacheManager pc = new FilesystemPackageCacheManager.Builder().build();
      TestPackageLoader loader = new TestPackageLoader(Utilities.stringSet("StructureDefinition", "ValueSet", "CodeSystem"));
      dkcore = pc.loadPackage("hl7.fhir.dk.core", "3.2.0");
      ctxt.loadFromPackage(dkcore, loader);
      emed = pc.loadPackage("hl7.fhir.uv.emedicinal-product-info", "1.0.0");
      ctxt.loadFromPackage(emed, loader);      
    }
  }


  @Test
  public void testConstruct1() throws IOException {
    load();
    var patient = new DkCorePatient(ctxt).setDEcpr(new DkCoreDeCprIdentifier().setSystem(DkCoreDeCprIdentifier.DkCoreDeCPRValueSet.URNOID122081761613).setValue(UUID.randomUUID().toString()));
    var pat = patient.build(ctxt);
  }
  
  @Test
  public void testProfile() throws IOException {
    load();
    MedicinalProductDefinition res = (MedicinalProductDefinition) new JsonParser().parse(emed.load("example", "MedicinalProductDefinition-800a51a2-d81d-49a4-a4eb-f2417d301837.json"));
    Assertions.assertEquals("800a51a2-d81d-49a4-a4eb-f2417d301837", res.getIdBase());
    MedicinalProductDefinitionUvEpi pr = MedicinalProductDefinitionUvEpi.fromSource(ctxt, res);
    Assertions.assertEquals("800a51a2-d81d-49a4-a4eb-f2417d301837", pr.getId());
    Assertions.assertEquals("http://example.org/sid/product", pr.getIdentifiers().get(0).getSystem());
//    
//    PEDefinition pe = new PEBuilder(ctxt, PEElementPropertiesPolicy.EXTENSION, true).buildPEDefinition("http://hl7.org/fhir/test/StructureDefinition/pe-profile1");
//
//    Assertions.assertEquals("TestProfile", pe.name());
//    Assertions.assertEquals("Observation", pe.schemaName());
//    Assertions.assertEquals(0, pe.min());
//    Assertions.assertEquals(Integer.MAX_VALUE, pe.max());
//    Assertions.assertEquals("Observation", pe.types().get(0).getType());
//    Assertions.assertEquals("TestProfile", pe.types().get(0).getName());
//    Assertions.assertNotNull(pe.definition());
//    Assertions.assertNotNull(pe.baseDefinition());
//    Assertions.assertEquals("Test Observation Profile", pe.shortDocumentation());
//    Assertions.assertEquals("Test Observation Profile.", pe.documentation());
//
//    List<PEDefinition> children = pe.children("Observation");
//    
//    checkElement(pe, "Observation", "TestProfile", 0, Integer.MAX_VALUE, false, "http://hl7.org/fhir/test/StructureDefinition/pe-profile1", 18, "Observation");
//    checkElement(children.get(0), "id", "id", 0, 1, false, null, 0, "id");
//    checkElement(children.get(1), "meta", "meta", 0, 1, false, "http://hl7.org/fhir/StructureDefinition/Meta", 7, "meta");
//    checkElement(children.get(2), "language", "language", 0, 1, false, "http://hl7.org/fhir/StructureDefinition/code", 2, "language");
//    checkElement(children.get(3), "text", "text", 0, 1, false, "http://hl7.org/fhir/StructureDefinition/Narrative", 3, "text");
//    checkElement(children.get(4), "contained", "contained", 0, Integer.MAX_VALUE, false, "http://hl7.org/fhir/StructureDefinition/Resource", 4, "contained");
//    checkElement(children.get(5), "extension", "extension", 0, Integer.MAX_VALUE, false, "http://hl7.org/fhir/StructureDefinition/Extension", 2, "extension.where(((url = 'http://hl7.org/fhir/test/StructureDefinition/pe-extension-simple') or (url = 'http://hl7.org/fhir/test/StructureDefinition/pe-extension-complex')).not())");
//    checkElement(children.get(6), "extension", "simple", 0, 1, false, "http://hl7.org/fhir/StructureDefinition/code", 2, "extension('http://hl7.org/fhir/test/StructureDefinition/pe-extension-simple').value");
//    checkElement(children.get(7), "extension", "complex", 0, 1, false, "http://hl7.org/fhir/test/StructureDefinition/pe-extension-complex", 4, "extension('http://hl7.org/fhir/test/StructureDefinition/pe-extension-complex')");
//    checkElement(children.get(8), "identifier", "identifier", 0, 1, false, "http://hl7.org/fhir/StructureDefinition/Identifier", 7, "identifier");
//    checkElement(children.get(9), "status", "status", 1, 1, true, "http://hl7.org/fhir/StructureDefinition/code", 2, "status");
//    checkElement(children.get(10), "category", "category", 1, 1, false, "http://hl7.org/fhir/StructureDefinition/CodeableConcept", 3, "category");
//    checkElement(children.get(11), "code", "code", 1, 1, true, "http://hl7.org/fhir/StructureDefinition/CodeableConcept", 3, "code");
//    checkElement(children.get(12), "subject", "subject", 1, 1, false, "http://hl7.org/fhir/StructureDefinition/Reference", 5, "subject");
//    checkElement(children.get(13), "encounter", "encounter", 0, 1, false, "http://hl7.org/fhir/StructureDefinition/Reference", 5, "encounter");
//    checkElement(children.get(14), "effective[x]", "effective[x]", 1, 1, false, "http://hl7.org/fhir/StructureDefinition/dateTime", 2, "effective");
//    checkElement(children.get(15), "issued", "issued", 0, 1, false, "http://hl7.org/fhir/StructureDefinition/instant", 2, "issued");
//    checkElement(children.get(16), "performer", "performer", 0, Integer.MAX_VALUE, false, "http://hl7.org/fhir/StructureDefinition/Reference", 5, "performer");
//    checkElement(children.get(17), "value[x]", "valueCodeableConcept", 0, 1, false, "http://hl7.org/fhir/test/StructureDefinition/pe-profile2", 4, "value.ofType(CodeableConcept)");
//
//    List<PEDefinition> gchildren = children.get(11).children();
//    checkElement(gchildren.get(0), "extension", "extension", 0, Integer.MAX_VALUE, true, "http://hl7.org/fhir/StructureDefinition/Extension", 2, "extension");
//    checkElement(gchildren.get(1), "coding", "coding", 0, Integer.MAX_VALUE, true, "http://hl7.org/fhir/StructureDefinition/Coding", 6, "coding");
//    checkElement(gchildren.get(2), "text", "text", 0, 1, true, "http://hl7.org/fhir/StructureDefinition/string", 2, "text");
//    
//
//    gchildren = children.get(17).children("http://hl7.org/fhir/test/StructureDefinition/pe-profile2");
//    checkElement(gchildren.get(0), "coding", "coding", 1, 2, false, "http://hl7.org/fhir/StructureDefinition/Coding", 6, "coding.where(((system = 'http://snomed.info/sct') or (system = 'http://loinc.org')).not())");
//    checkElement(gchildren.get(1), "coding", "snomedct", 1, 1, false, "http://hl7.org/fhir/StructureDefinition/Coding", 5, "coding.where(system = 'http://snomed.info/sct')");
//    checkElement(gchildren.get(2), "coding", "loinc", 0, 1, false, "http://hl7.org/fhir/StructureDefinition/Coding", 5, "coding.where(system = 'http://loinc.org')");
//    checkElement(gchildren.get(3), "text", "text", 1, 1, false, "http://hl7.org/fhir/StructureDefinition/string", 2, "text");
//    
//    List<PEDefinition> ggchildren = gchildren.get(3).children("http://hl7.org/fhir/StructureDefinition/string");
//    checkElement(ggchildren.get(0), "extension", "extension", 0, Integer.MAX_VALUE, false, "http://hl7.org/fhir/StructureDefinition/Extension", 2, "extension");
//    checkElement(ggchildren.get(1), "value", "value", 1, 1, false, null, 3, "value");
//    
//    gchildren = children.get(7).children("http://hl7.org/fhir/StructureDefinition/Extension");
//    checkElement(gchildren.get(0), "extension", "extension", 0, Integer.MAX_VALUE, false, "http://hl7.org/fhir/StructureDefinition/Extension", 2, "extension.where(((url = 'slice1') or (url = 'slice2') or (url = 'slice3')).not())");
//    checkElement(gchildren.get(1), "extension", "slice1", 0, 2, false, "http://hl7.org/fhir/StructureDefinition/Coding", 6, "extension('slice1').value");
//    checkElement(gchildren.get(2), "extension", "slice2", 0, Integer.MAX_VALUE, false, "http://hl7.org/fhir/StructureDefinition/string", 2, "extension('slice2').value");
//    checkElement(gchildren.get(3), "extension", "slice3", 1, 1, false, "http://hl7.org/fhir/StructureDefinition/Extension", 3, "extension('slice3')");
//
//    ggchildren = gchildren.get(3).children("http://hl7.org/fhir/StructureDefinition/Extension");
//    checkElement(ggchildren.get(0), "extension", "extension", 0, Integer.MAX_VALUE, false, "http://hl7.org/fhir/StructureDefinition/Extension", 2, "extension");
//    checkElement(ggchildren.get(1), "extension", "slice3a", 0, 2, false, "http://hl7.org/fhir/StructureDefinition/Coding", 6, "extension('slice3a').value");
//    checkElement(ggchildren.get(2), "extension", "slice3b", 0, Integer.MAX_VALUE, false, "http://hl7.org/fhir/StructureDefinition/string", 2, "extension('slice3b').value");
  }


}
