package org.hl7.fhir.convertors.conv14_40.datatypes14_40;

import org.hl7.fhir.convertors.context.ConversionContext14_40;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Narrative;

public class Narrative14_40 {
  public static org.hl7.fhir.r4.model.Narrative convertNarrative(org.hl7.fhir.dstu2016may.model.Narrative src) throws FHIRException {
    if (src == null || src.isEmpty()) return null;
    org.hl7.fhir.r4.model.Narrative tgt = new org.hl7.fhir.r4.model.Narrative();
    ConversionContext14_40.INSTANCE.getVersionConvertor_14_40().copyElement(src, tgt);
    if (src.hasStatus()) tgt.setStatusElement(convertNarrativeStatus(src.getStatusElement()));
    tgt.setDiv(src.getDiv());
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Narrative convertNarrative(org.hl7.fhir.r4.model.Narrative src) throws FHIRException {
    if (src == null || src.isEmpty()) return null;
    org.hl7.fhir.dstu2016may.model.Narrative tgt = new org.hl7.fhir.dstu2016may.model.Narrative();
    ConversionContext14_40.INSTANCE.getVersionConvertor_14_40().copyElement(src, tgt);
    if (src.hasStatus()) tgt.setStatusElement(convertNarrativeStatus(src.getStatusElement()));
    tgt.setDiv(src.getDiv());
    return tgt;
  }

  static public org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Narrative.NarrativeStatus> convertNarrativeStatus(org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.Narrative.NarrativeStatus> src) throws FHIRException {
    if (src == null || src.isEmpty()) return null;
    org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Narrative.NarrativeStatus> tgt = new org.hl7.fhir.r4.model.Enumeration<>(new org.hl7.fhir.r4.model.Narrative.NarrativeStatusEnumFactory());
    ConversionContext14_40.INSTANCE.getVersionConvertor_14_40().copyElement(src, tgt);
    if (src.getValue() == null) {
    tgt.setValue(null);
} else {
      switch(src.getValue()) {
        case GENERATED:
            tgt.setValue(Narrative.NarrativeStatus.GENERATED);
            break;
          case EXTENSIONS:
            tgt.setValue(Narrative.NarrativeStatus.EXTENSIONS);
            break;
          case ADDITIONAL:
            tgt.setValue(Narrative.NarrativeStatus.ADDITIONAL);
            break;
          case EMPTY:
            tgt.setValue(Narrative.NarrativeStatus.EMPTY);
            break;
          default:
            tgt.setValue(Narrative.NarrativeStatus.NULL);
            break;
       }
}
    return tgt;
  }

  static public org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.Narrative.NarrativeStatus> convertNarrativeStatus(org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Narrative.NarrativeStatus> src) throws FHIRException {
    if (src == null || src.isEmpty()) return null;
    org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.Narrative.NarrativeStatus> tgt = new org.hl7.fhir.dstu2016may.model.Enumeration<>(new org.hl7.fhir.dstu2016may.model.Narrative.NarrativeStatusEnumFactory());
    ConversionContext14_40.INSTANCE.getVersionConvertor_14_40().copyElement(src, tgt);
    if (src.getValue() == null) {
    tgt.setValue(null);
} else {
      switch(src.getValue()) {
        case GENERATED:
            tgt.setValue(org.hl7.fhir.dstu2016may.model.Narrative.NarrativeStatus.GENERATED);
            break;
          case EXTENSIONS:
            tgt.setValue(org.hl7.fhir.dstu2016may.model.Narrative.NarrativeStatus.EXTENSIONS);
            break;
          case ADDITIONAL:
            tgt.setValue(org.hl7.fhir.dstu2016may.model.Narrative.NarrativeStatus.ADDITIONAL);
            break;
          case EMPTY:
            tgt.setValue(org.hl7.fhir.dstu2016may.model.Narrative.NarrativeStatus.EMPTY);
            break;
          default:
            tgt.setValue(org.hl7.fhir.dstu2016may.model.Narrative.NarrativeStatus.NULL);
            break;
       }
}
    return tgt;
  }
}
