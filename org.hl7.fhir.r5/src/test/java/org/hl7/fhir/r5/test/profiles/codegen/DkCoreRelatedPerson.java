package org.hl7.fhir.r5.test.profiles.codegen;

import java.util.List;
import java.util.ArrayList;
import javax.annotation.Nullable;
import java.util.Date;


import org.hl7.fhir.r5.context.IWorkerContext;
import org.hl7.fhir.r5.model.*;
import org.hl7.fhir.r5.profilemodel.PEBuilder;
import org.hl7.fhir.r5.profilemodel.PEInstance;
import org.hl7.fhir.r5.profilemodel.PEBuilder.PEElementPropertiesPolicy;
import org.hl7.fhir.r5.profilemodel.gen.PEGeneratedBase;
import org.hl7.fhir.r5.profilemodel.gen.Min;
import org.hl7.fhir.r5.profilemodel.gen.Max;
import org.hl7.fhir.r5.profilemodel.gen.Label;
import org.hl7.fhir.r5.profilemodel.gen.Doco;
import org.hl7.fhir.r5.profilemodel.gen.BindingStrength;
import org.hl7.fhir.r5.profilemodel.gen.ValueSet;
import org.hl7.fhir.r5.profilemodel.gen.MustSupport;
import org.hl7.fhir.r5.profilemodel.gen.Definition;


// Generated by the HAPI Java Profile Generator, 5/11/24, 6:00 pm

/**
 * Information about a person that is involved in the care for a patient, but who 
 * is not the target of healthcare, nor has a formal responsibility in the care 
 * process.
 *
 */
public class DkCoreRelatedPerson extends PEGeneratedBase {

  public static final String CANONICAL_URL = "http://hl7.dk/fhir/core/StructureDefinition/dk-core-related-person|3.2.0";

  @Min("0") @Max("1") @Doco("")
  private String id;  // 

  @Min("0") @Max("*") @Doco("Additional content defined by implementations")
  @Definition("May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.")
  private List<Extension> extensions = new ArrayList<>();  // Additional content defined by implementations

  @Min("0") @Max("*") @Doco("Extensions that cannot be ignored")
  @Definition("May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.\n\nModifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).")
  private List<Extension> modifierExtensions = new ArrayList<>();  // Extensions that cannot be ignored

  @Min("0") @Max("*") @Doco("A human identifier for this person")
  @Definition("Identifier for a person within a particular scope.")
  private List<Identifier> identifiers = new ArrayList<>();  // A human identifier for this person

  @Min("0") @Max("1") @Doco("[DA] cpr-nummer, som det fremgår af CPR registeret")
  @Definition("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
  private DkCoreCprIdentifier cpr;  // [DA] cpr-nummer, som det fremgår af CPR registeret

  @Min("0") @Max("1") @Doco("[DA] X-eCPR, tildelt fra den nationale eCPR service")
  @Definition("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
  private DkCoreXeCprIdentifier xEcpr;  // [DA] X-eCPR, tildelt fra den nationale eCPR service

  @Min("0") @Max("1") @Doco("[DA] D-eCPR, decentral eCPR")
  @Definition("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
  private DkCoreDeCprIdentifier dEcpr;  // [DA] D-eCPR, decentral eCPR

  @Min("1") @Max("1") @Doco("The patient this person is related to")
  @Definition("The patient this person is related to.")
  private Reference patient;// @NotNull  // The patient this person is related to

  @Min("0") @Max("1") @Doco("[DA] Officielt navn, som det fremgår af CPR registeret")
  @Definition("A name associated with the person.")
  private HumanName official;  // [DA] Officielt navn, som det fremgår af CPR registeret

  @Min("0") @Max("*") @Doco("A contact detail for the person")
  @Definition("A contact detail for the person, e.g. a telephone number or an email address.")
  private List<ContactPoint> telecoms = new ArrayList<>();  // A contact detail for the person

  @Min("0") @Max("*") @Doco("Image of the person")
  @Definition("Image of the person.")
  private List<Attachment> photos = new ArrayList<>();  // Image of the person

  @Min("0") @Max("1") @Doco("Period of time that this relationship is considered valid")
  @Definition("The period of time during which this relationship is or was active. If there are no dates defined, then the interval is unknown.")
  private Period period;  // Period of time that this relationship is considered valid

  @Min("0") @Max("*") @Doco("A language which may be used to communicate with about the patient's health")
  @Definition("A language which may be used to communicate with about the patient's health.")
  private List<BackboneElement> communications = new ArrayList<>();  // A language which may be used to communicate with about the patient's health


  /**
   * Parameter-less constructor.
   *
   */
  public DkCoreRelatedPerson() {
  }

  /**
   * Construct an instance of the object, and fill out all the fixed values 
   *
   */
  public DkCoreRelatedPerson(IWorkerContext context) {
    workerContext = context;
    PEBuilder builder = new PEBuilder(context, PEElementPropertiesPolicy.EXTENSION, true);
    PEInstance src = builder.buildPEInstance(CANONICAL_URL, builder.createResource(CANONICAL_URL, false));
    load(src);
  }

  /**
   * Populate an instance of the object based on this source object 
   *
   */
  public static DkCoreRelatedPerson fromSource(IWorkerContext context, RelatedPerson source) {
    DkCoreRelatedPerson theThing = new DkCoreRelatedPerson();
    theThing.workerContext = context;
    PEBuilder builder = new PEBuilder(context, PEElementPropertiesPolicy.EXTENSION, true);
    PEInstance src = builder.buildPEInstance(CANONICAL_URL, source);
    theThing.load(src);
    return theThing;
  }


  public void load(PEInstance src) {
    clear();
    if (src.hasChild("id")) {
      id = ((IdType) src.child("id").asDataType()).getValue();
    }
    for (PEInstance item : src.children("extension")) {
      extensions.add((Extension) item.asDataType());
    }
    for (PEInstance item : src.children("modifierExtension")) {
      modifierExtensions.add((Extension) item.asDataType());
    }
    for (PEInstance item : src.children("identifier")) {
      identifiers.add((Identifier) item.asDataType());
    }
    if (src.hasChild("cpr")) {
      cpr = DkCoreCprIdentifier.fromSource(src.child("cpr"));
    }
    if (src.hasChild("x-ecpr")) {
      xEcpr = DkCoreXeCprIdentifier.fromSource(src.child("x-ecpr"));
    }
    if (src.hasChild("d-ecpr")) {
      dEcpr = DkCoreDeCprIdentifier.fromSource(src.child("d-ecpr"));
    }
    if (src.hasChild("patient")) {
      patient = (Reference) src.child("patient").asDataType();
    }
    if (src.hasChild("official")) {
      official = (HumanName) src.child("official").asDataType();
    }
    for (PEInstance item : src.children("telecom")) {
      telecoms.add((ContactPoint) item.asDataType());
    }
    for (PEInstance item : src.children("photo")) {
      photos.add((Attachment) item.asDataType());
    }
    if (src.hasChild("period")) {
      period = (Period) src.child("period").asDataType();
    }
    for (PEInstance item : src.children("communication")) {
      communications.add((BackboneElement) item.asElement());
    }

  }

  /**
   * Build a instance of the underlying object based on this wrapping object 
   *
   */
  public RelatedPerson build(IWorkerContext context) {
    workerContext = context;
    return build();
  }

  /**
   * Build a instance of the underlying object based on this wrapping object 
   *
   */
  public RelatedPerson build() {
    RelatedPerson theThing = new RelatedPerson();
    PEBuilder builder = new PEBuilder(workerContext, PEElementPropertiesPolicy.EXTENSION, true);
    PEInstance tgt = builder.buildPEInstance(CANONICAL_URL, theThing);
    save(tgt, false);
    return theThing;
  }

  /**
   * Save this profile class into an existing resource (overwriting anything that 
   * exists in the profile) 
   *
   */
  public void save(IWorkerContext context, RelatedPerson dest, boolean nulls) {
    workerContext = context;
    PEBuilder builder = new PEBuilder(context, PEElementPropertiesPolicy.EXTENSION, true);
    PEInstance tgt = builder.buildPEInstance(CANONICAL_URL, dest);
    save(tgt, nulls);
  }

  public void save(PEInstance tgt, boolean nulls) {
    tgt.clear("id");
    if (id != null) {
      tgt.makeChild("id").data().setProperty("value", new IdType(id));
    }
    tgt.clear("extension");
    for (Extension item : extensions) {
      tgt.addChild("extension", item);
    }
    tgt.clear("modifierExtension");
    for (Extension item : modifierExtensions) {
      tgt.addChild("modifierExtension", item);
    }
    tgt.clear("identifier");
    for (Identifier item : identifiers) {
      tgt.addChild("identifier", item);
    }
    tgt.clear("cpr");
    if (cpr != null) {
      cpr.save(tgt.makeChild("cpr"), nulls);
    }
    tgt.clear("x-ecpr");
    if (xEcpr != null) {
      xEcpr.save(tgt.makeChild("x-ecpr"), nulls);
    }
    tgt.clear("d-ecpr");
    if (dEcpr != null) {
      dEcpr.save(tgt.makeChild("d-ecpr"), nulls);
    }
    tgt.clear("patient");
    if (patient != null) {
      tgt.addChild("patient", patient);
    }
    tgt.clear("official");
    if (official != null) {
      tgt.addChild("official", official);
    }
    tgt.clear("telecom");
    for (ContactPoint item : telecoms) {
      tgt.addChild("telecom", item);
    }
    tgt.clear("photo");
    for (Attachment item : photos) {
      tgt.addChild("photo", item);
    }
    tgt.clear("period");
    if (period != null) {
      tgt.addChild("period", period);
    }
    tgt.clear("communication");
    for (BackboneElement item : communications) {
      tgt.addChild("communication", item);
    }

  }

  public String getId() {
    return id;
  }

  public DkCoreRelatedPerson setId(String value) {
    this.id = value;
    return this;
  }

  public boolean hasId() {
    return id != null;
  }

  /**
   * May be used to represent additional information that is not part of the basic 
   * definition of the resource. To make the use of extensions safe and manageable, 
   * there is a strict set of governance  applied to the definition and use of 
   * extensions. Though any implementer can define an extension, there is a set of 
   * requirements that SHALL be met as part of the definition of the extension.
   *
   */
  public List<Extension> getExtensions() {
    if (extensions == null) { extensions = new ArrayList<>(); }
    return extensions;
  }

  public boolean hasExtensions() {
    return extensions != null && !extensions.isEmpty();
  }

  public Extension addExtension() {
    Extension theThing = new Extension();
    getExtensions().add(theThing);
    return theThing;
  }

  public boolean hasExtension(Extension item) {
    return hasExtensions() && extensions.contains(item);
  }

  public void removeExtension(Extension item) {
    if (hasExtension(item)) {
      extensions.remove(item);
    }
  }


  /**
   * May be used to represent additional information that is not part of the basic 
   * definition of the resource and that modifies the understanding of the element 
   * that contains it and/or the understanding of the containing element's 
   * descendants. Usually modifier elements provide negation or qualification. To 
   * make the use of extensions safe and manageable, there is a strict set of 
   * governance applied to the definition and use of extensions. Though any 
   * implementer is allowed to define an extension, there is a set of requirements 
   * that SHALL be met as part of the definition of the extension. Applications 
   * processing a resource are required to check for modifier extensions.
   *
   * 
   *
   * Modifier extensions SHALL NOT change the meaning of any elements on Resource or 
   * DomainResource (including cannot change the meaning of modifierExtension 
   * itself).
   *
   */
  public List<Extension> getModifierExtensions() {
    if (modifierExtensions == null) { modifierExtensions = new ArrayList<>(); }
    return modifierExtensions;
  }

  public boolean hasModifierExtensions() {
    return modifierExtensions != null && !modifierExtensions.isEmpty();
  }

  public Extension addModifierExtension() {
    Extension theThing = new Extension();
    getModifierExtensions().add(theThing);
    return theThing;
  }

  public boolean hasModifierExtension(Extension item) {
    return hasModifierExtensions() && modifierExtensions.contains(item);
  }

  public void removeModifierExtension(Extension item) {
    if (hasModifierExtension(item)) {
      modifierExtensions.remove(item);
    }
  }


  /**
   * Identifier for a person within a particular scope.
   *
   */
  public List<Identifier> getIdentifiers() {
    if (identifiers == null) { identifiers = new ArrayList<>(); }
    return identifiers;
  }

  public boolean hasIdentifiers() {
    return identifiers != null && !identifiers.isEmpty();
  }

  public Identifier addIdentifier() {
    Identifier theThing = new Identifier();
    getIdentifiers().add(theThing);
    return theThing;
  }

  public boolean hasIdentifier(Identifier item) {
    return hasIdentifiers() && identifiers.contains(item);
  }

  public void removeIdentifier(Identifier item) {
    if (hasIdentifier(item)) {
      identifiers.remove(item);
    }
  }


  /**
   * An identifier - identifies some entity uniquely and unambiguously. Typically 
   * this is used for business identifiers.
   *
   */
  public DkCoreCprIdentifier getCpr() {
    if (cpr == null) { cpr = new DkCoreCprIdentifier(); }
    return cpr;
  }

  public DkCoreRelatedPerson setCpr(DkCoreCprIdentifier value) {
    this.cpr = value;
    return this;
  }
  public boolean hasCpr() {
    return cpr != null;
  }

  /**
   * An identifier - identifies some entity uniquely and unambiguously. Typically 
   * this is used for business identifiers.
   *
   */
  public DkCoreXeCprIdentifier getXEcpr() {
    if (xEcpr == null) { xEcpr = new DkCoreXeCprIdentifier(); }
    return xEcpr;
  }

  public DkCoreRelatedPerson setXEcpr(DkCoreXeCprIdentifier value) {
    this.xEcpr = value;
    return this;
  }
  public boolean hasXEcpr() {
    return xEcpr != null;
  }

  /**
   * An identifier - identifies some entity uniquely and unambiguously. Typically 
   * this is used for business identifiers.
   *
   */
  public DkCoreDeCprIdentifier getDEcpr() {
    if (dEcpr == null) { dEcpr = new DkCoreDeCprIdentifier(); }
    return dEcpr;
  }

  public DkCoreRelatedPerson setDEcpr(DkCoreDeCprIdentifier value) {
    this.dEcpr = value;
    return this;
  }
  public boolean hasDEcpr() {
    return dEcpr != null;
  }

  /**
   * The patient this person is related to.
   *
   */
  public Reference getPatient() {
    if (patient == null) { patient = new Reference(); }
    return patient;
  }

  public DkCoreRelatedPerson setPatient(Reference value) {
    this.patient = value;
    return this;
  }
  public boolean hasPatient() {
    return patient != null;
  }

  /**
   * A name associated with the person.
   *
   */
  public HumanName getOfficial() {
    if (official == null) { official = new HumanName(); }
    return official;
  }

  public DkCoreRelatedPerson setOfficial(HumanName value) {
    this.official = value;
    return this;
  }
  public boolean hasOfficial() {
    return official != null;
  }

  /**
   * A contact detail for the person, e.g. a telephone number or an email address.
   *
   */
  public List<ContactPoint> getTelecoms() {
    if (telecoms == null) { telecoms = new ArrayList<>(); }
    return telecoms;
  }

  public boolean hasTelecoms() {
    return telecoms != null && !telecoms.isEmpty();
  }

  public ContactPoint addTelecom() {
    ContactPoint theThing = new ContactPoint();
    getTelecoms().add(theThing);
    return theThing;
  }

  public boolean hasTelecom(ContactPoint item) {
    return hasTelecoms() && telecoms.contains(item);
  }

  public void removeTelecom(ContactPoint item) {
    if (hasTelecom(item)) {
      telecoms.remove(item);
    }
  }


  /**
   * Image of the person.
   *
   */
  public List<Attachment> getPhotos() {
    if (photos == null) { photos = new ArrayList<>(); }
    return photos;
  }

  public boolean hasPhotos() {
    return photos != null && !photos.isEmpty();
  }

  public Attachment addPhoto() {
    Attachment theThing = new Attachment();
    getPhotos().add(theThing);
    return theThing;
  }

  public boolean hasPhoto(Attachment item) {
    return hasPhotos() && photos.contains(item);
  }

  public void removePhoto(Attachment item) {
    if (hasPhoto(item)) {
      photos.remove(item);
    }
  }


  /**
   * The period of time during which this relationship is or was active. If there are 
   * no dates defined, then the interval is unknown.
   *
   */
  public Period getPeriod() {
    if (period == null) { period = new Period(); }
    return period;
  }

  public DkCoreRelatedPerson setPeriod(Period value) {
    this.period = value;
    return this;
  }
  public boolean hasPeriod() {
    return period != null;
  }

  /**
   * A language which may be used to communicate with about the patient's health.
   *
   */
  public List<BackboneElement> getCommunications() {
    if (communications == null) { communications = new ArrayList<>(); }
    return communications;
  }

  public boolean hasCommunications() {
    return communications != null && !communications.isEmpty();
  }

  public boolean hasCommunication(BackboneElement item) {
    return hasCommunications() && communications.contains(item);
  }

  public void removeCommunication(BackboneElement item) {
    if (hasCommunication(item)) {
      communications.remove(item);
    }
  }




  public void clear() {
    id = null;
    extensions.clear();
    modifierExtensions.clear();
    identifiers.clear();
    cpr = null;
    xEcpr = null;
    dEcpr = null;
    patient = null;
    official = null;
    telecoms.clear();
    photos.clear();
    period = null;
    communications.clear();

  }

}
