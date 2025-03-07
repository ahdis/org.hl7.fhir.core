package org.hl7.fhir.dstu3.utils;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
    
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
 */



import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.utilities.Utilities;


@Deprecated
public class TypesUtilities {

  public static class WildcardInformation {
    private String typeName;
    private String comment;
    public WildcardInformation(String typeName, String comment) {
      super();
      this.typeName = typeName;
      this.comment = comment;
    }
    public WildcardInformation(String typeName) {
      super();
      this.typeName = typeName;
    }
    public String getTypeName() {
      return typeName;
    }
    public String getComment() {
      return comment;
    }
    
  }
  
  public static List<String> wildcardTypes() {
    List<String> res = new ArrayList<String>();
    for (WildcardInformation wi : wildcards())
      res.add(wi.getTypeName());
    return res;
  }
  
  // this is the master list for what data types are allowed where the types = *
  // that this list is incomplete means that the following types cannot have fixed values in a profile:
  //   Narrative
  //   Meta
  //   Any of the IDMP data types
  // You have to walk into them to profile them.
  //
  public static List<WildcardInformation> wildcards() {
    List<WildcardInformation> res = new ArrayList<WildcardInformation>();

    // primitive types
    res.add(new WildcardInformation("base64Binary"));
    res.add(new WildcardInformation("boolean"));
    res.add(new WildcardInformation("canonical"));
    res.add(new WildcardInformation("code", "(only if the extension definition provides a <a href=\"terminologies.html#code\">fixed</a> binding to a suitable set of codes)"));
    res.add(new WildcardInformation("date"));
    res.add(new WildcardInformation("dateTime"));
    res.add(new WildcardInformation("decimal"));
    res.add(new WildcardInformation("id"));
    res.add(new WildcardInformation("instant"));
    res.add(new WildcardInformation("integer"));
    res.add(new WildcardInformation("markdown"));
    res.add(new WildcardInformation("oid"));
    res.add(new WildcardInformation("positiveInt"));
    res.add(new WildcardInformation("string"));
    res.add(new WildcardInformation("time"));
    res.add(new WildcardInformation("unsignedInt"));
    res.add(new WildcardInformation("uri"));
    res.add(new WildcardInformation("url"));
    res.add(new WildcardInformation("uuid"));

    // Complex general purpose data types
    res.add(new WildcardInformation("Address"));
    res.add(new WildcardInformation("Age"));
    res.add(new WildcardInformation("Annotation"));
    res.add(new WildcardInformation("Attachment"));
    res.add(new WildcardInformation("CodeableConcept"));
    res.add(new WildcardInformation("Coding"));
    res.add(new WildcardInformation("ContactPoint"));
    res.add(new WildcardInformation("Count"));
    res.add(new WildcardInformation("Distance"));
    res.add(new WildcardInformation("Duration"));
    res.add(new WildcardInformation("HumanName"));
    res.add(new WildcardInformation("Identifier"));
    res.add(new WildcardInformation("Money"));
    res.add(new WildcardInformation("Period"));
    res.add(new WildcardInformation("Quantity"));
    res.add(new WildcardInformation("Range"));
    res.add(new WildcardInformation("Ratio"));
    res.add(new WildcardInformation("Reference", " - a reference to another resource"));
    res.add(new WildcardInformation("SampledData"));
    res.add(new WildcardInformation("Signature"));
    res.add(new WildcardInformation("Timing"));
    
    // metadata types
    res.add(new WildcardInformation("ParameterDefinition"));
    res.add(new WildcardInformation("DataRequirement"));
    res.add(new WildcardInformation("RelatedArtifact"));
    res.add(new WildcardInformation("ContactDetail"));
    res.add(new WildcardInformation("Contributor"));
    res.add(new WildcardInformation("TriggerDefinition"));
    res.add(new WildcardInformation("Expression"));
    res.add(new WildcardInformation("UsageContext"));
    
    // special cases
    res.add(new WildcardInformation("Dosage"));
    return res;
  }

  public static boolean isPrimitive(String code) {
    return Utilities.existsInList(code, "boolean", "integer", "string", "decimal", "uri", "url", "canonical", "base64Binary", "instant", "date", "dateTime", "time", "code", "oid", "id", "markdown", "unsignedInt", "positiveInt", "xhtml");
  }
}