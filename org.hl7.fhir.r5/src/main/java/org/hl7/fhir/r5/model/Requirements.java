package org.hl7.fhir.r5.model;


/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, \
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this \
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, \
     this list of conditions and the following disclaimer in the documentation \
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND \
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED \
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. \
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, \
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT \
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR \
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, \
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) \
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE \
  POSSIBILITY OF SUCH DAMAGE.
  */

// Generated on Mon, Sep 5, 2022 20:11+1000 for FHIR vcurrent

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r5.model.Enumerations.*;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;

/**
 * The Requirements resource is used to describe an actor - a human or an application that plays a role in data exchange, and that may have obligations associated with the role the actor plays.
 */
@ResourceDef(name="Requirements", profile="http://hl7.org/fhir/StructureDefinition/Requirements")
public class Requirements extends CanonicalResource {

    public enum ConformanceExpectation {
        /**
         * Support for the specified capability is required to be considered conformant.
         */
        SHALL, 
        /**
         * Support for the specified capability is strongly encouraged, and failure to support it should only occur after careful consideration.
         */
        SHOULD, 
        /**
         * Support for the specified capability is not necessary to be considered conformant, and the requirement should be considered strictly optional.
         */
        MAY, 
        /**
         * Support for the specified capability is strongly discouraged and should occur only after careful consideration.
         */
        SHOULDNOT, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static ConformanceExpectation fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("SHALL".equals(codeString))
          return SHALL;
        if ("SHOULD".equals(codeString))
          return SHOULD;
        if ("MAY".equals(codeString))
          return MAY;
        if ("SHOULD-NOT".equals(codeString))
          return SHOULDNOT;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown ConformanceExpectation code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case SHALL: return "SHALL";
            case SHOULD: return "SHOULD";
            case MAY: return "MAY";
            case SHOULDNOT: return "SHOULD-NOT";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case SHALL: return "http://hl7.org/fhir/conformance-expectation";
            case SHOULD: return "http://hl7.org/fhir/conformance-expectation";
            case MAY: return "http://hl7.org/fhir/conformance-expectation";
            case SHOULDNOT: return "http://hl7.org/fhir/conformance-expectation";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case SHALL: return "Support for the specified capability is required to be considered conformant.";
            case SHOULD: return "Support for the specified capability is strongly encouraged, and failure to support it should only occur after careful consideration.";
            case MAY: return "Support for the specified capability is not necessary to be considered conformant, and the requirement should be considered strictly optional.";
            case SHOULDNOT: return "Support for the specified capability is strongly discouraged and should occur only after careful consideration.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case SHALL: return "SHALL";
            case SHOULD: return "SHOULD";
            case MAY: return "MAY";
            case SHOULDNOT: return "SHOULD-NOT";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class ConformanceExpectationEnumFactory implements EnumFactory<ConformanceExpectation> {
    public ConformanceExpectation fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("SHALL".equals(codeString))
          return ConformanceExpectation.SHALL;
        if ("SHOULD".equals(codeString))
          return ConformanceExpectation.SHOULD;
        if ("MAY".equals(codeString))
          return ConformanceExpectation.MAY;
        if ("SHOULD-NOT".equals(codeString))
          return ConformanceExpectation.SHOULDNOT;
        throw new IllegalArgumentException("Unknown ConformanceExpectation code '"+codeString+"'");
        }
        public Enumeration<ConformanceExpectation> fromType(Base code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ConformanceExpectation>(this);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("SHALL".equals(codeString))
          return new Enumeration<ConformanceExpectation>(this, ConformanceExpectation.SHALL);
        if ("SHOULD".equals(codeString))
          return new Enumeration<ConformanceExpectation>(this, ConformanceExpectation.SHOULD);
        if ("MAY".equals(codeString))
          return new Enumeration<ConformanceExpectation>(this, ConformanceExpectation.MAY);
        if ("SHOULD-NOT".equals(codeString))
          return new Enumeration<ConformanceExpectation>(this, ConformanceExpectation.SHOULDNOT);
        throw new FHIRException("Unknown ConformanceExpectation code '"+codeString+"'");
        }
    public String toCode(ConformanceExpectation code) {
      if (code == ConformanceExpectation.SHALL)
        return "SHALL";
      if (code == ConformanceExpectation.SHOULD)
        return "SHOULD";
      if (code == ConformanceExpectation.MAY)
        return "MAY";
      if (code == ConformanceExpectation.SHOULDNOT)
        return "SHOULD-NOT";
      return "?";
      }
    public String toSystem(ConformanceExpectation code) {
      return code.getSystem();
      }
    }

    @Block()
    public static class RequirementsStatementComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Key that identifies this statement (unique within this resource).
         */
        @Child(name = "key", type = {IdType.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Key that identifies this statement", formalDefinition="Key that identifies this statement (unique within this resource)." )
        protected IdType key;

        /**
         * A short human usable label for this statement.
         */
        @Child(name = "label", type = {StringType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Short Human label for this statement", formalDefinition="A short human usable label for this statement." )
        protected StringType label;

        /**
         * A short human usable label for this statement.
         */
        @Child(name = "conformance", type = {CodeType.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="SHALL | SHOULD | MAY | SHOULD-NOT", formalDefinition="A short human usable label for this statement." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/conformance-expectation")
        protected List<Enumeration<ConformanceExpectation>> conformance;

        /**
         * The actual requirement for human consumption.
         */
        @Child(name = "requirement", type = {MarkdownType.class}, order=4, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The actual requirement", formalDefinition="The actual requirement for human consumption." )
        protected MarkdownType requirement;

        /**
         * Another statement on one of the requirements that this requirement clarifies or restricts.
         */
        @Child(name = "derivedFrom", type = {StringType.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Another statement this clarifies/restricts ([url#]key)", formalDefinition="Another statement on one of the requirements that this requirement clarifies or restricts." )
        protected StringType derivedFrom;

        /**
         * A reference to another artifact that satisfies this requirement. This could be a Profile, extension, or an element in one of those, or a CapabilityStatement, OperationDefinition, SearchParameter, CodeSystem(/code), ValueSet, Libary etc.
         */
        @Child(name = "satisfiedBy", type = {UrlType.class}, order=6, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Design artifact that satisfies this requirement", formalDefinition="A reference to another artifact that satisfies this requirement. This could be a Profile, extension, or an element in one of those, or a CapabilityStatement, OperationDefinition, SearchParameter, CodeSystem(/code), ValueSet, Libary etc." )
        protected List<UrlType> satisfiedBy;

        /**
         * A reference to another artifact that created this requirement. This could be a Profile, etc, or external regulation, or business requirements expressed elsewhere.
         */
        @Child(name = "reference", type = {UrlType.class}, order=7, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="External artifact (rule/document etc that) created this requirement", formalDefinition="A reference to another artifact that created this requirement. This could be a Profile, etc, or external regulation, or business requirements expressed elsewhere." )
        protected List<UrlType> reference;

        /**
         * Who asked for this statement to be a requirement. By default, it's assumed that the publisher knows who it is if it matters.
         */
        @Child(name = "source", type = {Practitioner.class, Organization.class, CareTeam.class, Group.class}, order=8, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Who asked for this statement", formalDefinition="Who asked for this statement to be a requirement. By default, it's assumed that the publisher knows who it is if it matters." )
        protected List<Reference> source;

        private static final long serialVersionUID = -811662792L;

    /**
     * Constructor
     */
      public RequirementsStatementComponent() {
        super();
      }

    /**
     * Constructor
     */
      public RequirementsStatementComponent(String key, String requirement) {
        super();
        this.setKey(key);
        this.setRequirement(requirement);
      }

        /**
         * @return {@link #key} (Key that identifies this statement (unique within this resource).). This is the underlying object with id, value and extensions. The accessor "getKey" gives direct access to the value
         */
        public IdType getKeyElement() { 
          if (this.key == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create RequirementsStatementComponent.key");
            else if (Configuration.doAutoCreate())
              this.key = new IdType(); // bb
          return this.key;
        }

        public boolean hasKeyElement() { 
          return this.key != null && !this.key.isEmpty();
        }

        public boolean hasKey() { 
          return this.key != null && !this.key.isEmpty();
        }

        /**
         * @param value {@link #key} (Key that identifies this statement (unique within this resource).). This is the underlying object with id, value and extensions. The accessor "getKey" gives direct access to the value
         */
        public RequirementsStatementComponent setKeyElement(IdType value) { 
          this.key = value;
          return this;
        }

        /**
         * @return Key that identifies this statement (unique within this resource).
         */
        public String getKey() { 
          return this.key == null ? null : this.key.getValue();
        }

        /**
         * @param value Key that identifies this statement (unique within this resource).
         */
        public RequirementsStatementComponent setKey(String value) { 
            if (this.key == null)
              this.key = new IdType();
            this.key.setValue(value);
          return this;
        }

        /**
         * @return {@link #label} (A short human usable label for this statement.). This is the underlying object with id, value and extensions. The accessor "getLabel" gives direct access to the value
         */
        public StringType getLabelElement() { 
          if (this.label == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create RequirementsStatementComponent.label");
            else if (Configuration.doAutoCreate())
              this.label = new StringType(); // bb
          return this.label;
        }

        public boolean hasLabelElement() { 
          return this.label != null && !this.label.isEmpty();
        }

        public boolean hasLabel() { 
          return this.label != null && !this.label.isEmpty();
        }

        /**
         * @param value {@link #label} (A short human usable label for this statement.). This is the underlying object with id, value and extensions. The accessor "getLabel" gives direct access to the value
         */
        public RequirementsStatementComponent setLabelElement(StringType value) { 
          this.label = value;
          return this;
        }

        /**
         * @return A short human usable label for this statement.
         */
        public String getLabel() { 
          return this.label == null ? null : this.label.getValue();
        }

        /**
         * @param value A short human usable label for this statement.
         */
        public RequirementsStatementComponent setLabel(String value) { 
          if (Utilities.noString(value))
            this.label = null;
          else {
            if (this.label == null)
              this.label = new StringType();
            this.label.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #conformance} (A short human usable label for this statement.)
         */
        public List<Enumeration<ConformanceExpectation>> getConformance() { 
          if (this.conformance == null)
            this.conformance = new ArrayList<Enumeration<ConformanceExpectation>>();
          return this.conformance;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public RequirementsStatementComponent setConformance(List<Enumeration<ConformanceExpectation>> theConformance) { 
          this.conformance = theConformance;
          return this;
        }

        public boolean hasConformance() { 
          if (this.conformance == null)
            return false;
          for (Enumeration<ConformanceExpectation> item : this.conformance)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #conformance} (A short human usable label for this statement.)
         */
        public Enumeration<ConformanceExpectation> addConformanceElement() {//2 
          Enumeration<ConformanceExpectation> t = new Enumeration<ConformanceExpectation>(new ConformanceExpectationEnumFactory());
          if (this.conformance == null)
            this.conformance = new ArrayList<Enumeration<ConformanceExpectation>>();
          this.conformance.add(t);
          return t;
        }

        /**
         * @param value {@link #conformance} (A short human usable label for this statement.)
         */
        public RequirementsStatementComponent addConformance(ConformanceExpectation value) { //1
          Enumeration<ConformanceExpectation> t = new Enumeration<ConformanceExpectation>(new ConformanceExpectationEnumFactory());
          t.setValue(value);
          if (this.conformance == null)
            this.conformance = new ArrayList<Enumeration<ConformanceExpectation>>();
          this.conformance.add(t);
          return this;
        }

        /**
         * @param value {@link #conformance} (A short human usable label for this statement.)
         */
        public boolean hasConformance(ConformanceExpectation value) { 
            if (this.conformance == null)
            return false;
          for (Enumeration<ConformanceExpectation> v : this.conformance)
            if (v.getValue().equals(value)) // code
              return true;
          return false;
        }

        /**
         * @return {@link #requirement} (The actual requirement for human consumption.). This is the underlying object with id, value and extensions. The accessor "getRequirement" gives direct access to the value
         */
        public MarkdownType getRequirementElement() { 
          if (this.requirement == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create RequirementsStatementComponent.requirement");
            else if (Configuration.doAutoCreate())
              this.requirement = new MarkdownType(); // bb
          return this.requirement;
        }

        public boolean hasRequirementElement() { 
          return this.requirement != null && !this.requirement.isEmpty();
        }

        public boolean hasRequirement() { 
          return this.requirement != null && !this.requirement.isEmpty();
        }

        /**
         * @param value {@link #requirement} (The actual requirement for human consumption.). This is the underlying object with id, value and extensions. The accessor "getRequirement" gives direct access to the value
         */
        public RequirementsStatementComponent setRequirementElement(MarkdownType value) { 
          this.requirement = value;
          return this;
        }

        /**
         * @return The actual requirement for human consumption.
         */
        public String getRequirement() { 
          return this.requirement == null ? null : this.requirement.getValue();
        }

        /**
         * @param value The actual requirement for human consumption.
         */
        public RequirementsStatementComponent setRequirement(String value) { 
            if (this.requirement == null)
              this.requirement = new MarkdownType();
            this.requirement.setValue(value);
          return this;
        }

        /**
         * @return {@link #derivedFrom} (Another statement on one of the requirements that this requirement clarifies or restricts.). This is the underlying object with id, value and extensions. The accessor "getDerivedFrom" gives direct access to the value
         */
        public StringType getDerivedFromElement() { 
          if (this.derivedFrom == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create RequirementsStatementComponent.derivedFrom");
            else if (Configuration.doAutoCreate())
              this.derivedFrom = new StringType(); // bb
          return this.derivedFrom;
        }

        public boolean hasDerivedFromElement() { 
          return this.derivedFrom != null && !this.derivedFrom.isEmpty();
        }

        public boolean hasDerivedFrom() { 
          return this.derivedFrom != null && !this.derivedFrom.isEmpty();
        }

        /**
         * @param value {@link #derivedFrom} (Another statement on one of the requirements that this requirement clarifies or restricts.). This is the underlying object with id, value and extensions. The accessor "getDerivedFrom" gives direct access to the value
         */
        public RequirementsStatementComponent setDerivedFromElement(StringType value) { 
          this.derivedFrom = value;
          return this;
        }

        /**
         * @return Another statement on one of the requirements that this requirement clarifies or restricts.
         */
        public String getDerivedFrom() { 
          return this.derivedFrom == null ? null : this.derivedFrom.getValue();
        }

        /**
         * @param value Another statement on one of the requirements that this requirement clarifies or restricts.
         */
        public RequirementsStatementComponent setDerivedFrom(String value) { 
          if (Utilities.noString(value))
            this.derivedFrom = null;
          else {
            if (this.derivedFrom == null)
              this.derivedFrom = new StringType();
            this.derivedFrom.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #satisfiedBy} (A reference to another artifact that satisfies this requirement. This could be a Profile, extension, or an element in one of those, or a CapabilityStatement, OperationDefinition, SearchParameter, CodeSystem(/code), ValueSet, Libary etc.)
         */
        public List<UrlType> getSatisfiedBy() { 
          if (this.satisfiedBy == null)
            this.satisfiedBy = new ArrayList<UrlType>();
          return this.satisfiedBy;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public RequirementsStatementComponent setSatisfiedBy(List<UrlType> theSatisfiedBy) { 
          this.satisfiedBy = theSatisfiedBy;
          return this;
        }

        public boolean hasSatisfiedBy() { 
          if (this.satisfiedBy == null)
            return false;
          for (UrlType item : this.satisfiedBy)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #satisfiedBy} (A reference to another artifact that satisfies this requirement. This could be a Profile, extension, or an element in one of those, or a CapabilityStatement, OperationDefinition, SearchParameter, CodeSystem(/code), ValueSet, Libary etc.)
         */
        public UrlType addSatisfiedByElement() {//2 
          UrlType t = new UrlType();
          if (this.satisfiedBy == null)
            this.satisfiedBy = new ArrayList<UrlType>();
          this.satisfiedBy.add(t);
          return t;
        }

        /**
         * @param value {@link #satisfiedBy} (A reference to another artifact that satisfies this requirement. This could be a Profile, extension, or an element in one of those, or a CapabilityStatement, OperationDefinition, SearchParameter, CodeSystem(/code), ValueSet, Libary etc.)
         */
        public RequirementsStatementComponent addSatisfiedBy(String value) { //1
          UrlType t = new UrlType();
          t.setValue(value);
          if (this.satisfiedBy == null)
            this.satisfiedBy = new ArrayList<UrlType>();
          this.satisfiedBy.add(t);
          return this;
        }

        /**
         * @param value {@link #satisfiedBy} (A reference to another artifact that satisfies this requirement. This could be a Profile, extension, or an element in one of those, or a CapabilityStatement, OperationDefinition, SearchParameter, CodeSystem(/code), ValueSet, Libary etc.)
         */
        public boolean hasSatisfiedBy(String value) { 
          if (this.satisfiedBy == null)
            return false;
          for (UrlType v : this.satisfiedBy)
            if (v.getValue().equals(value)) // url
              return true;
          return false;
        }

        /**
         * @return {@link #reference} (A reference to another artifact that created this requirement. This could be a Profile, etc, or external regulation, or business requirements expressed elsewhere.)
         */
        public List<UrlType> getReference() { 
          if (this.reference == null)
            this.reference = new ArrayList<UrlType>();
          return this.reference;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public RequirementsStatementComponent setReference(List<UrlType> theReference) { 
          this.reference = theReference;
          return this;
        }

        public boolean hasReference() { 
          if (this.reference == null)
            return false;
          for (UrlType item : this.reference)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #reference} (A reference to another artifact that created this requirement. This could be a Profile, etc, or external regulation, or business requirements expressed elsewhere.)
         */
        public UrlType addReferenceElement() {//2 
          UrlType t = new UrlType();
          if (this.reference == null)
            this.reference = new ArrayList<UrlType>();
          this.reference.add(t);
          return t;
        }

        /**
         * @param value {@link #reference} (A reference to another artifact that created this requirement. This could be a Profile, etc, or external regulation, or business requirements expressed elsewhere.)
         */
        public RequirementsStatementComponent addReference(String value) { //1
          UrlType t = new UrlType();
          t.setValue(value);
          if (this.reference == null)
            this.reference = new ArrayList<UrlType>();
          this.reference.add(t);
          return this;
        }

        /**
         * @param value {@link #reference} (A reference to another artifact that created this requirement. This could be a Profile, etc, or external regulation, or business requirements expressed elsewhere.)
         */
        public boolean hasReference(String value) { 
          if (this.reference == null)
            return false;
          for (UrlType v : this.reference)
            if (v.getValue().equals(value)) // url
              return true;
          return false;
        }

        /**
         * @return {@link #source} (Who asked for this statement to be a requirement. By default, it's assumed that the publisher knows who it is if it matters.)
         */
        public List<Reference> getSource() { 
          if (this.source == null)
            this.source = new ArrayList<Reference>();
          return this.source;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public RequirementsStatementComponent setSource(List<Reference> theSource) { 
          this.source = theSource;
          return this;
        }

        public boolean hasSource() { 
          if (this.source == null)
            return false;
          for (Reference item : this.source)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Reference addSource() { //3
          Reference t = new Reference();
          if (this.source == null)
            this.source = new ArrayList<Reference>();
          this.source.add(t);
          return t;
        }

        public RequirementsStatementComponent addSource(Reference t) { //3
          if (t == null)
            return this;
          if (this.source == null)
            this.source = new ArrayList<Reference>();
          this.source.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #source}, creating it if it does not already exist {3}
         */
        public Reference getSourceFirstRep() { 
          if (getSource().isEmpty()) {
            addSource();
          }
          return getSource().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("key", "id", "Key that identifies this statement (unique within this resource).", 0, 1, key));
          children.add(new Property("label", "string", "A short human usable label for this statement.", 0, 1, label));
          children.add(new Property("conformance", "code", "A short human usable label for this statement.", 0, java.lang.Integer.MAX_VALUE, conformance));
          children.add(new Property("requirement", "markdown", "The actual requirement for human consumption.", 0, 1, requirement));
          children.add(new Property("derivedFrom", "string", "Another statement on one of the requirements that this requirement clarifies or restricts.", 0, 1, derivedFrom));
          children.add(new Property("satisfiedBy", "url", "A reference to another artifact that satisfies this requirement. This could be a Profile, extension, or an element in one of those, or a CapabilityStatement, OperationDefinition, SearchParameter, CodeSystem(/code), ValueSet, Libary etc.", 0, java.lang.Integer.MAX_VALUE, satisfiedBy));
          children.add(new Property("reference", "url", "A reference to another artifact that created this requirement. This could be a Profile, etc, or external regulation, or business requirements expressed elsewhere.", 0, java.lang.Integer.MAX_VALUE, reference));
          children.add(new Property("source", "Reference(Practitioner|Organization|CareTeam|Group)", "Who asked for this statement to be a requirement. By default, it's assumed that the publisher knows who it is if it matters.", 0, java.lang.Integer.MAX_VALUE, source));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 106079: /*key*/  return new Property("key", "id", "Key that identifies this statement (unique within this resource).", 0, 1, key);
          case 102727412: /*label*/  return new Property("label", "string", "A short human usable label for this statement.", 0, 1, label);
          case 1374858133: /*conformance*/  return new Property("conformance", "code", "A short human usable label for this statement.", 0, java.lang.Integer.MAX_VALUE, conformance);
          case 363387971: /*requirement*/  return new Property("requirement", "markdown", "The actual requirement for human consumption.", 0, 1, requirement);
          case 1077922663: /*derivedFrom*/  return new Property("derivedFrom", "string", "Another statement on one of the requirements that this requirement clarifies or restricts.", 0, 1, derivedFrom);
          case -1268787159: /*satisfiedBy*/  return new Property("satisfiedBy", "url", "A reference to another artifact that satisfies this requirement. This could be a Profile, extension, or an element in one of those, or a CapabilityStatement, OperationDefinition, SearchParameter, CodeSystem(/code), ValueSet, Libary etc.", 0, java.lang.Integer.MAX_VALUE, satisfiedBy);
          case -925155509: /*reference*/  return new Property("reference", "url", "A reference to another artifact that created this requirement. This could be a Profile, etc, or external regulation, or business requirements expressed elsewhere.", 0, java.lang.Integer.MAX_VALUE, reference);
          case -896505829: /*source*/  return new Property("source", "Reference(Practitioner|Organization|CareTeam|Group)", "Who asked for this statement to be a requirement. By default, it's assumed that the publisher knows who it is if it matters.", 0, java.lang.Integer.MAX_VALUE, source);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 106079: /*key*/ return this.key == null ? new Base[0] : new Base[] {this.key}; // IdType
        case 102727412: /*label*/ return this.label == null ? new Base[0] : new Base[] {this.label}; // StringType
        case 1374858133: /*conformance*/ return this.conformance == null ? new Base[0] : this.conformance.toArray(new Base[this.conformance.size()]); // Enumeration<ConformanceExpectation>
        case 363387971: /*requirement*/ return this.requirement == null ? new Base[0] : new Base[] {this.requirement}; // MarkdownType
        case 1077922663: /*derivedFrom*/ return this.derivedFrom == null ? new Base[0] : new Base[] {this.derivedFrom}; // StringType
        case -1268787159: /*satisfiedBy*/ return this.satisfiedBy == null ? new Base[0] : this.satisfiedBy.toArray(new Base[this.satisfiedBy.size()]); // UrlType
        case -925155509: /*reference*/ return this.reference == null ? new Base[0] : this.reference.toArray(new Base[this.reference.size()]); // UrlType
        case -896505829: /*source*/ return this.source == null ? new Base[0] : this.source.toArray(new Base[this.source.size()]); // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 106079: // key
          this.key = TypeConvertor.castToId(value); // IdType
          return value;
        case 102727412: // label
          this.label = TypeConvertor.castToString(value); // StringType
          return value;
        case 1374858133: // conformance
          value = new ConformanceExpectationEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.getConformance().add((Enumeration) value); // Enumeration<ConformanceExpectation>
          return value;
        case 363387971: // requirement
          this.requirement = TypeConvertor.castToMarkdown(value); // MarkdownType
          return value;
        case 1077922663: // derivedFrom
          this.derivedFrom = TypeConvertor.castToString(value); // StringType
          return value;
        case -1268787159: // satisfiedBy
          this.getSatisfiedBy().add(TypeConvertor.castToUrl(value)); // UrlType
          return value;
        case -925155509: // reference
          this.getReference().add(TypeConvertor.castToUrl(value)); // UrlType
          return value;
        case -896505829: // source
          this.getSource().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("key")) {
          this.key = TypeConvertor.castToId(value); // IdType
        } else if (name.equals("label")) {
          this.label = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("conformance")) {
          value = new ConformanceExpectationEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.getConformance().add((Enumeration) value);
        } else if (name.equals("requirement")) {
          this.requirement = TypeConvertor.castToMarkdown(value); // MarkdownType
        } else if (name.equals("derivedFrom")) {
          this.derivedFrom = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("satisfiedBy")) {
          this.getSatisfiedBy().add(TypeConvertor.castToUrl(value));
        } else if (name.equals("reference")) {
          this.getReference().add(TypeConvertor.castToUrl(value));
        } else if (name.equals("source")) {
          this.getSource().add(TypeConvertor.castToReference(value));
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 106079:  return getKeyElement();
        case 102727412:  return getLabelElement();
        case 1374858133:  return addConformanceElement();
        case 363387971:  return getRequirementElement();
        case 1077922663:  return getDerivedFromElement();
        case -1268787159:  return addSatisfiedByElement();
        case -925155509:  return addReferenceElement();
        case -896505829:  return addSource(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 106079: /*key*/ return new String[] {"id"};
        case 102727412: /*label*/ return new String[] {"string"};
        case 1374858133: /*conformance*/ return new String[] {"code"};
        case 363387971: /*requirement*/ return new String[] {"markdown"};
        case 1077922663: /*derivedFrom*/ return new String[] {"string"};
        case -1268787159: /*satisfiedBy*/ return new String[] {"url"};
        case -925155509: /*reference*/ return new String[] {"url"};
        case -896505829: /*source*/ return new String[] {"Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("key")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.statement.key");
        }
        else if (name.equals("label")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.statement.label");
        }
        else if (name.equals("conformance")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.statement.conformance");
        }
        else if (name.equals("requirement")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.statement.requirement");
        }
        else if (name.equals("derivedFrom")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.statement.derivedFrom");
        }
        else if (name.equals("satisfiedBy")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.statement.satisfiedBy");
        }
        else if (name.equals("reference")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.statement.reference");
        }
        else if (name.equals("source")) {
          return addSource();
        }
        else
          return super.addChild(name);
      }

      public RequirementsStatementComponent copy() {
        RequirementsStatementComponent dst = new RequirementsStatementComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(RequirementsStatementComponent dst) {
        super.copyValues(dst);
        dst.key = key == null ? null : key.copy();
        dst.label = label == null ? null : label.copy();
        if (conformance != null) {
          dst.conformance = new ArrayList<Enumeration<ConformanceExpectation>>();
          for (Enumeration<ConformanceExpectation> i : conformance)
            dst.conformance.add(i.copy());
        };
        dst.requirement = requirement == null ? null : requirement.copy();
        dst.derivedFrom = derivedFrom == null ? null : derivedFrom.copy();
        if (satisfiedBy != null) {
          dst.satisfiedBy = new ArrayList<UrlType>();
          for (UrlType i : satisfiedBy)
            dst.satisfiedBy.add(i.copy());
        };
        if (reference != null) {
          dst.reference = new ArrayList<UrlType>();
          for (UrlType i : reference)
            dst.reference.add(i.copy());
        };
        if (source != null) {
          dst.source = new ArrayList<Reference>();
          for (Reference i : source)
            dst.source.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof RequirementsStatementComponent))
          return false;
        RequirementsStatementComponent o = (RequirementsStatementComponent) other_;
        return compareDeep(key, o.key, true) && compareDeep(label, o.label, true) && compareDeep(conformance, o.conformance, true)
           && compareDeep(requirement, o.requirement, true) && compareDeep(derivedFrom, o.derivedFrom, true)
           && compareDeep(satisfiedBy, o.satisfiedBy, true) && compareDeep(reference, o.reference, true) && compareDeep(source, o.source, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof RequirementsStatementComponent))
          return false;
        RequirementsStatementComponent o = (RequirementsStatementComponent) other_;
        return compareValues(key, o.key, true) && compareValues(label, o.label, true) && compareValues(conformance, o.conformance, true)
           && compareValues(requirement, o.requirement, true) && compareValues(derivedFrom, o.derivedFrom, true)
           && compareValues(satisfiedBy, o.satisfiedBy, true) && compareValues(reference, o.reference, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(key, label, conformance
          , requirement, derivedFrom, satisfiedBy, reference, source);
      }

  public String fhirType() {
    return "Requirements.statement";

  }

  }

    /**
     * An absolute URI that is used to identify this Requirements when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this Requirements is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the Requirements is stored on different servers.
     */
    @Child(name = "url", type = {UriType.class}, order=0, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Canonical identifier for this Requirements, represented as a URI (globally unique)", formalDefinition="An absolute URI that is used to identify this Requirements when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this Requirements is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the Requirements is stored on different servers." )
    protected UriType url;

    /**
     * A formal identifier that is used to identify this Requirements when it is represented in other formats, or referenced in a specification, model, design or an instance.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=1, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Additional identifier for the Requirements (business identifier)", formalDefinition="A formal identifier that is used to identify this Requirements when it is represented in other formats, or referenced in a specification, model, design or an instance." )
    protected List<Identifier> identifier;

    /**
     * The identifier that is used to identify this version of the Requirements when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Requirements author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
     */
    @Child(name = "version", type = {StringType.class}, order=2, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Business version of the Requirements", formalDefinition="The identifier that is used to identify this version of the Requirements when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Requirements author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence." )
    protected StringType version;

    /**
     * A natural language name identifying the Requirements. This name should be usable as an identifier for the module by machine processing applications such as code generation.
     */
    @Child(name = "name", type = {StringType.class}, order=3, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Name for this Requirements (computer friendly)", formalDefinition="A natural language name identifying the Requirements. This name should be usable as an identifier for the module by machine processing applications such as code generation." )
    protected StringType name;

    /**
     * A short, descriptive, user-friendly title for the Requirements.
     */
    @Child(name = "title", type = {StringType.class}, order=4, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Name for this Requirements (human friendly)", formalDefinition="A short, descriptive, user-friendly title for the Requirements." )
    protected StringType title;

    /**
     * The status of this Requirements. Enables tracking the life-cycle of the content.
     */
    @Child(name = "status", type = {CodeType.class}, order=5, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="draft | active | retired | unknown", formalDefinition="The status of this Requirements. Enables tracking the life-cycle of the content." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/publication-status")
    protected Enumeration<PublicationStatus> status;

    /**
     * A Boolean value to indicate that this Requirements is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
     */
    @Child(name = "experimental", type = {BooleanType.class}, order=6, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="For testing purposes, not real usage", formalDefinition="A Boolean value to indicate that this Requirements is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage." )
    protected BooleanType experimental;

    /**
     * The date  (and optionally time) when the Requirements was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the Requirements changes.
     */
    @Child(name = "date", type = {DateTimeType.class}, order=7, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Date last changed", formalDefinition="The date  (and optionally time) when the Requirements was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the Requirements changes." )
    protected DateTimeType date;

    /**
     * The name of the organization or individual responsible for the release and ongoing maintenance of the Requirements.
     */
    @Child(name = "publisher", type = {StringType.class}, order=8, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Name of the publisher/steward (organization or individual)", formalDefinition="The name of the organization or individual responsible for the release and ongoing maintenance of the Requirements." )
    protected StringType publisher;

    /**
     * Contact details to assist a user in finding and communicating with the publisher.
     */
    @Child(name = "contact", type = {ContactDetail.class}, order=9, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Contact details for the publisher", formalDefinition="Contact details to assist a user in finding and communicating with the publisher." )
    protected List<ContactDetail> contact;

    /**
     * A free text natural language description of the actor.
     */
    @Child(name = "description", type = {MarkdownType.class}, order=10, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Natural language description of the actor", formalDefinition="A free text natural language description of the actor." )
    protected MarkdownType description;

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate Requirements instances.
     */
    @Child(name = "useContext", type = {UsageContext.class}, order=11, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="The context that the content is intended to support", formalDefinition="The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate Requirements instances." )
    protected List<UsageContext> useContext;

    /**
     * A legal or geographic region in which the Requirements is intended to be used.
     */
    @Child(name = "jurisdiction", type = {CodeableConcept.class}, order=12, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Intended jurisdiction for Requirements (if applicable)", formalDefinition="A legal or geographic region in which the Requirements is intended to be used." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/jurisdiction")
    protected List<CodeableConcept> jurisdiction;

    /**
     * Explanation of why this Requirements is needed and why it has been designed as it has.
     */
    @Child(name = "purpose", type = {MarkdownType.class}, order=13, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Why this Requirements is defined", formalDefinition="Explanation of why this Requirements is needed and why it has been designed as it has." )
    protected MarkdownType purpose;

    /**
     * A copyright statement relating to the Requirements and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the Requirements.
     */
    @Child(name = "copyright", type = {MarkdownType.class}, order=14, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Use and/or publishing restrictions", formalDefinition="A copyright statement relating to the Requirements and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the Requirements." )
    protected MarkdownType copyright;

    /**
     * A short string (<50 characters), suitable for inclusion in a page footer that identifies the copyright holder, effective period, and optionally whether rights are resctricted. (e.g. 'All rights reserved', 'Some rights reserved').
     */
    @Child(name = "copyrightLabel", type = {StringType.class}, order=15, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Copyright holder and year(s)", formalDefinition="A short string (<50 characters), suitable for inclusion in a page footer that identifies the copyright holder, effective period, and optionally whether rights are resctricted. (e.g. 'All rights reserved', 'Some rights reserved')." )
    protected StringType copyrightLabel;

    /**
     * Another set of Requirements that this set of Requirements builds on and updates.
     */
    @Child(name = "derivedFrom", type = {CanonicalType.class}, order=16, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Other set of Requirements this builds on", formalDefinition="Another set of Requirements that this set of Requirements builds on and updates." )
    protected List<CanonicalType> derivedFrom;

    /**
     * An actor these requirements are in regard to.
     */
    @Child(name = "actor", type = {CanonicalType.class}, order=17, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Actor for these requirements", formalDefinition="An actor these requirements are in regard to." )
    protected List<CanonicalType> actor;

    /**
     * A statement of requirements.
     */
    @Child(name = "statement", type = {}, order=18, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Statement of requirements", formalDefinition="A statement of requirements." )
    protected List<RequirementsStatementComponent> statement;

    private static final long serialVersionUID = -173486958L;

  /**
   * Constructor
   */
    public Requirements() {
      super();
    }

  /**
   * Constructor
   */
    public Requirements(PublicationStatus status) {
      super();
      this.setStatus(status);
    }

    /**
     * @return {@link #url} (An absolute URI that is used to identify this Requirements when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this Requirements is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the Requirements is stored on different servers.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() { 
      if (this.url == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Requirements.url");
        else if (Configuration.doAutoCreate())
          this.url = new UriType(); // bb
      return this.url;
    }

    public boolean hasUrlElement() { 
      return this.url != null && !this.url.isEmpty();
    }

    public boolean hasUrl() { 
      return this.url != null && !this.url.isEmpty();
    }

    /**
     * @param value {@link #url} (An absolute URI that is used to identify this Requirements when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this Requirements is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the Requirements is stored on different servers.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public Requirements setUrlElement(UriType value) { 
      this.url = value;
      return this;
    }

    /**
     * @return An absolute URI that is used to identify this Requirements when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this Requirements is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the Requirements is stored on different servers.
     */
    public String getUrl() { 
      return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value An absolute URI that is used to identify this Requirements when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this Requirements is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the Requirements is stored on different servers.
     */
    public Requirements setUrl(String value) { 
      if (Utilities.noString(value))
        this.url = null;
      else {
        if (this.url == null)
          this.url = new UriType();
        this.url.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #identifier} (A formal identifier that is used to identify this Requirements when it is represented in other formats, or referenced in a specification, model, design or an instance.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Requirements setIdentifier(List<Identifier> theIdentifier) { 
      this.identifier = theIdentifier;
      return this;
    }

    public boolean hasIdentifier() { 
      if (this.identifier == null)
        return false;
      for (Identifier item : this.identifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    public Requirements addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist {3}
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #version} (The identifier that is used to identify this version of the Requirements when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Requirements author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() { 
      if (this.version == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Requirements.version");
        else if (Configuration.doAutoCreate())
          this.version = new StringType(); // bb
      return this.version;
    }

    public boolean hasVersionElement() { 
      return this.version != null && !this.version.isEmpty();
    }

    public boolean hasVersion() { 
      return this.version != null && !this.version.isEmpty();
    }

    /**
     * @param value {@link #version} (The identifier that is used to identify this version of the Requirements when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Requirements author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public Requirements setVersionElement(StringType value) { 
      this.version = value;
      return this;
    }

    /**
     * @return The identifier that is used to identify this version of the Requirements when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Requirements author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
     */
    public String getVersion() { 
      return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The identifier that is used to identify this version of the Requirements when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Requirements author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
     */
    public Requirements setVersion(String value) { 
      if (Utilities.noString(value))
        this.version = null;
      else {
        if (this.version == null)
          this.version = new StringType();
        this.version.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #name} (A natural language name identifying the Requirements. This name should be usable as an identifier for the module by machine processing applications such as code generation.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() { 
      if (this.name == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Requirements.name");
        else if (Configuration.doAutoCreate())
          this.name = new StringType(); // bb
      return this.name;
    }

    public boolean hasNameElement() { 
      return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() { 
      return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (A natural language name identifying the Requirements. This name should be usable as an identifier for the module by machine processing applications such as code generation.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public Requirements setNameElement(StringType value) { 
      this.name = value;
      return this;
    }

    /**
     * @return A natural language name identifying the Requirements. This name should be usable as an identifier for the module by machine processing applications such as code generation.
     */
    public String getName() { 
      return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A natural language name identifying the Requirements. This name should be usable as an identifier for the module by machine processing applications such as code generation.
     */
    public Requirements setName(String value) { 
      if (Utilities.noString(value))
        this.name = null;
      else {
        if (this.name == null)
          this.name = new StringType();
        this.name.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #title} (A short, descriptive, user-friendly title for the Requirements.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public StringType getTitleElement() { 
      if (this.title == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Requirements.title");
        else if (Configuration.doAutoCreate())
          this.title = new StringType(); // bb
      return this.title;
    }

    public boolean hasTitleElement() { 
      return this.title != null && !this.title.isEmpty();
    }

    public boolean hasTitle() { 
      return this.title != null && !this.title.isEmpty();
    }

    /**
     * @param value {@link #title} (A short, descriptive, user-friendly title for the Requirements.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public Requirements setTitleElement(StringType value) { 
      this.title = value;
      return this;
    }

    /**
     * @return A short, descriptive, user-friendly title for the Requirements.
     */
    public String getTitle() { 
      return this.title == null ? null : this.title.getValue();
    }

    /**
     * @param value A short, descriptive, user-friendly title for the Requirements.
     */
    public Requirements setTitle(String value) { 
      if (Utilities.noString(value))
        this.title = null;
      else {
        if (this.title == null)
          this.title = new StringType();
        this.title.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #status} (The status of this Requirements. Enables tracking the life-cycle of the content.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<PublicationStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Requirements.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<PublicationStatus>(new PublicationStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of this Requirements. Enables tracking the life-cycle of the content.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Requirements setStatusElement(Enumeration<PublicationStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The status of this Requirements. Enables tracking the life-cycle of the content.
     */
    public PublicationStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of this Requirements. Enables tracking the life-cycle of the content.
     */
    public Requirements setStatus(PublicationStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<PublicationStatus>(new PublicationStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #experimental} (A Boolean value to indicate that this Requirements is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public BooleanType getExperimentalElement() { 
      if (this.experimental == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Requirements.experimental");
        else if (Configuration.doAutoCreate())
          this.experimental = new BooleanType(); // bb
      return this.experimental;
    }

    public boolean hasExperimentalElement() { 
      return this.experimental != null && !this.experimental.isEmpty();
    }

    public boolean hasExperimental() { 
      return this.experimental != null && !this.experimental.isEmpty();
    }

    /**
     * @param value {@link #experimental} (A Boolean value to indicate that this Requirements is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public Requirements setExperimentalElement(BooleanType value) { 
      this.experimental = value;
      return this;
    }

    /**
     * @return A Boolean value to indicate that this Requirements is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
     */
    public boolean getExperimental() { 
      return this.experimental == null || this.experimental.isEmpty() ? false : this.experimental.getValue();
    }

    /**
     * @param value A Boolean value to indicate that this Requirements is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
     */
    public Requirements setExperimental(boolean value) { 
        if (this.experimental == null)
          this.experimental = new BooleanType();
        this.experimental.setValue(value);
      return this;
    }

    /**
     * @return {@link #date} (The date  (and optionally time) when the Requirements was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the Requirements changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() { 
      if (this.date == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Requirements.date");
        else if (Configuration.doAutoCreate())
          this.date = new DateTimeType(); // bb
      return this.date;
    }

    public boolean hasDateElement() { 
      return this.date != null && !this.date.isEmpty();
    }

    public boolean hasDate() { 
      return this.date != null && !this.date.isEmpty();
    }

    /**
     * @param value {@link #date} (The date  (and optionally time) when the Requirements was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the Requirements changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public Requirements setDateElement(DateTimeType value) { 
      this.date = value;
      return this;
    }

    /**
     * @return The date  (and optionally time) when the Requirements was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the Requirements changes.
     */
    public Date getDate() { 
      return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date  (and optionally time) when the Requirements was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the Requirements changes.
     */
    public Requirements setDate(Date value) { 
      if (value == null)
        this.date = null;
      else {
        if (this.date == null)
          this.date = new DateTimeType();
        this.date.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #publisher} (The name of the organization or individual responsible for the release and ongoing maintenance of the Requirements.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public StringType getPublisherElement() { 
      if (this.publisher == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Requirements.publisher");
        else if (Configuration.doAutoCreate())
          this.publisher = new StringType(); // bb
      return this.publisher;
    }

    public boolean hasPublisherElement() { 
      return this.publisher != null && !this.publisher.isEmpty();
    }

    public boolean hasPublisher() { 
      return this.publisher != null && !this.publisher.isEmpty();
    }

    /**
     * @param value {@link #publisher} (The name of the organization or individual responsible for the release and ongoing maintenance of the Requirements.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public Requirements setPublisherElement(StringType value) { 
      this.publisher = value;
      return this;
    }

    /**
     * @return The name of the organization or individual responsible for the release and ongoing maintenance of the Requirements.
     */
    public String getPublisher() { 
      return this.publisher == null ? null : this.publisher.getValue();
    }

    /**
     * @param value The name of the organization or individual responsible for the release and ongoing maintenance of the Requirements.
     */
    public Requirements setPublisher(String value) { 
      if (Utilities.noString(value))
        this.publisher = null;
      else {
        if (this.publisher == null)
          this.publisher = new StringType();
        this.publisher.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #contact} (Contact details to assist a user in finding and communicating with the publisher.)
     */
    public List<ContactDetail> getContact() { 
      if (this.contact == null)
        this.contact = new ArrayList<ContactDetail>();
      return this.contact;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Requirements setContact(List<ContactDetail> theContact) { 
      this.contact = theContact;
      return this;
    }

    public boolean hasContact() { 
      if (this.contact == null)
        return false;
      for (ContactDetail item : this.contact)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ContactDetail addContact() { //3
      ContactDetail t = new ContactDetail();
      if (this.contact == null)
        this.contact = new ArrayList<ContactDetail>();
      this.contact.add(t);
      return t;
    }

    public Requirements addContact(ContactDetail t) { //3
      if (t == null)
        return this;
      if (this.contact == null)
        this.contact = new ArrayList<ContactDetail>();
      this.contact.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #contact}, creating it if it does not already exist {3}
     */
    public ContactDetail getContactFirstRep() { 
      if (getContact().isEmpty()) {
        addContact();
      }
      return getContact().get(0);
    }

    /**
     * @return {@link #description} (A free text natural language description of the actor.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public MarkdownType getDescriptionElement() { 
      if (this.description == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Requirements.description");
        else if (Configuration.doAutoCreate())
          this.description = new MarkdownType(); // bb
      return this.description;
    }

    public boolean hasDescriptionElement() { 
      return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() { 
      return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (A free text natural language description of the actor.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public Requirements setDescriptionElement(MarkdownType value) { 
      this.description = value;
      return this;
    }

    /**
     * @return A free text natural language description of the actor.
     */
    public String getDescription() { 
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A free text natural language description of the actor.
     */
    public Requirements setDescription(String value) { 
      if (value == null)
        this.description = null;
      else {
        if (this.description == null)
          this.description = new MarkdownType();
        this.description.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #useContext} (The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate Requirements instances.)
     */
    public List<UsageContext> getUseContext() { 
      if (this.useContext == null)
        this.useContext = new ArrayList<UsageContext>();
      return this.useContext;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Requirements setUseContext(List<UsageContext> theUseContext) { 
      this.useContext = theUseContext;
      return this;
    }

    public boolean hasUseContext() { 
      if (this.useContext == null)
        return false;
      for (UsageContext item : this.useContext)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public UsageContext addUseContext() { //3
      UsageContext t = new UsageContext();
      if (this.useContext == null)
        this.useContext = new ArrayList<UsageContext>();
      this.useContext.add(t);
      return t;
    }

    public Requirements addUseContext(UsageContext t) { //3
      if (t == null)
        return this;
      if (this.useContext == null)
        this.useContext = new ArrayList<UsageContext>();
      this.useContext.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #useContext}, creating it if it does not already exist {3}
     */
    public UsageContext getUseContextFirstRep() { 
      if (getUseContext().isEmpty()) {
        addUseContext();
      }
      return getUseContext().get(0);
    }

    /**
     * @return {@link #jurisdiction} (A legal or geographic region in which the Requirements is intended to be used.)
     */
    public List<CodeableConcept> getJurisdiction() { 
      if (this.jurisdiction == null)
        this.jurisdiction = new ArrayList<CodeableConcept>();
      return this.jurisdiction;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Requirements setJurisdiction(List<CodeableConcept> theJurisdiction) { 
      this.jurisdiction = theJurisdiction;
      return this;
    }

    public boolean hasJurisdiction() { 
      if (this.jurisdiction == null)
        return false;
      for (CodeableConcept item : this.jurisdiction)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addJurisdiction() { //3
      CodeableConcept t = new CodeableConcept();
      if (this.jurisdiction == null)
        this.jurisdiction = new ArrayList<CodeableConcept>();
      this.jurisdiction.add(t);
      return t;
    }

    public Requirements addJurisdiction(CodeableConcept t) { //3
      if (t == null)
        return this;
      if (this.jurisdiction == null)
        this.jurisdiction = new ArrayList<CodeableConcept>();
      this.jurisdiction.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #jurisdiction}, creating it if it does not already exist {3}
     */
    public CodeableConcept getJurisdictionFirstRep() { 
      if (getJurisdiction().isEmpty()) {
        addJurisdiction();
      }
      return getJurisdiction().get(0);
    }

    /**
     * @return {@link #purpose} (Explanation of why this Requirements is needed and why it has been designed as it has.). This is the underlying object with id, value and extensions. The accessor "getPurpose" gives direct access to the value
     */
    public MarkdownType getPurposeElement() { 
      if (this.purpose == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Requirements.purpose");
        else if (Configuration.doAutoCreate())
          this.purpose = new MarkdownType(); // bb
      return this.purpose;
    }

    public boolean hasPurposeElement() { 
      return this.purpose != null && !this.purpose.isEmpty();
    }

    public boolean hasPurpose() { 
      return this.purpose != null && !this.purpose.isEmpty();
    }

    /**
     * @param value {@link #purpose} (Explanation of why this Requirements is needed and why it has been designed as it has.). This is the underlying object with id, value and extensions. The accessor "getPurpose" gives direct access to the value
     */
    public Requirements setPurposeElement(MarkdownType value) { 
      this.purpose = value;
      return this;
    }

    /**
     * @return Explanation of why this Requirements is needed and why it has been designed as it has.
     */
    public String getPurpose() { 
      return this.purpose == null ? null : this.purpose.getValue();
    }

    /**
     * @param value Explanation of why this Requirements is needed and why it has been designed as it has.
     */
    public Requirements setPurpose(String value) { 
      if (value == null)
        this.purpose = null;
      else {
        if (this.purpose == null)
          this.purpose = new MarkdownType();
        this.purpose.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #copyright} (A copyright statement relating to the Requirements and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the Requirements.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public MarkdownType getCopyrightElement() { 
      if (this.copyright == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Requirements.copyright");
        else if (Configuration.doAutoCreate())
          this.copyright = new MarkdownType(); // bb
      return this.copyright;
    }

    public boolean hasCopyrightElement() { 
      return this.copyright != null && !this.copyright.isEmpty();
    }

    public boolean hasCopyright() { 
      return this.copyright != null && !this.copyright.isEmpty();
    }

    /**
     * @param value {@link #copyright} (A copyright statement relating to the Requirements and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the Requirements.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public Requirements setCopyrightElement(MarkdownType value) { 
      this.copyright = value;
      return this;
    }

    /**
     * @return A copyright statement relating to the Requirements and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the Requirements.
     */
    public String getCopyright() { 
      return this.copyright == null ? null : this.copyright.getValue();
    }

    /**
     * @param value A copyright statement relating to the Requirements and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the Requirements.
     */
    public Requirements setCopyright(String value) { 
      if (value == null)
        this.copyright = null;
      else {
        if (this.copyright == null)
          this.copyright = new MarkdownType();
        this.copyright.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #copyrightLabel} (A short string (<50 characters), suitable for inclusion in a page footer that identifies the copyright holder, effective period, and optionally whether rights are resctricted. (e.g. 'All rights reserved', 'Some rights reserved').). This is the underlying object with id, value and extensions. The accessor "getCopyrightLabel" gives direct access to the value
     */
    public StringType getCopyrightLabelElement() { 
      if (this.copyrightLabel == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Requirements.copyrightLabel");
        else if (Configuration.doAutoCreate())
          this.copyrightLabel = new StringType(); // bb
      return this.copyrightLabel;
    }

    public boolean hasCopyrightLabelElement() { 
      return this.copyrightLabel != null && !this.copyrightLabel.isEmpty();
    }

    public boolean hasCopyrightLabel() { 
      return this.copyrightLabel != null && !this.copyrightLabel.isEmpty();
    }

    /**
     * @param value {@link #copyrightLabel} (A short string (<50 characters), suitable for inclusion in a page footer that identifies the copyright holder, effective period, and optionally whether rights are resctricted. (e.g. 'All rights reserved', 'Some rights reserved').). This is the underlying object with id, value and extensions. The accessor "getCopyrightLabel" gives direct access to the value
     */
    public Requirements setCopyrightLabelElement(StringType value) { 
      this.copyrightLabel = value;
      return this;
    }

    /**
     * @return A short string (<50 characters), suitable for inclusion in a page footer that identifies the copyright holder, effective period, and optionally whether rights are resctricted. (e.g. 'All rights reserved', 'Some rights reserved').
     */
    public String getCopyrightLabel() { 
      return this.copyrightLabel == null ? null : this.copyrightLabel.getValue();
    }

    /**
     * @param value A short string (<50 characters), suitable for inclusion in a page footer that identifies the copyright holder, effective period, and optionally whether rights are resctricted. (e.g. 'All rights reserved', 'Some rights reserved').
     */
    public Requirements setCopyrightLabel(String value) { 
      if (Utilities.noString(value))
        this.copyrightLabel = null;
      else {
        if (this.copyrightLabel == null)
          this.copyrightLabel = new StringType();
        this.copyrightLabel.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #derivedFrom} (Another set of Requirements that this set of Requirements builds on and updates.)
     */
    public List<CanonicalType> getDerivedFrom() { 
      if (this.derivedFrom == null)
        this.derivedFrom = new ArrayList<CanonicalType>();
      return this.derivedFrom;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Requirements setDerivedFrom(List<CanonicalType> theDerivedFrom) { 
      this.derivedFrom = theDerivedFrom;
      return this;
    }

    public boolean hasDerivedFrom() { 
      if (this.derivedFrom == null)
        return false;
      for (CanonicalType item : this.derivedFrom)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #derivedFrom} (Another set of Requirements that this set of Requirements builds on and updates.)
     */
    public CanonicalType addDerivedFromElement() {//2 
      CanonicalType t = new CanonicalType();
      if (this.derivedFrom == null)
        this.derivedFrom = new ArrayList<CanonicalType>();
      this.derivedFrom.add(t);
      return t;
    }

    /**
     * @param value {@link #derivedFrom} (Another set of Requirements that this set of Requirements builds on and updates.)
     */
    public Requirements addDerivedFrom(String value) { //1
      CanonicalType t = new CanonicalType();
      t.setValue(value);
      if (this.derivedFrom == null)
        this.derivedFrom = new ArrayList<CanonicalType>();
      this.derivedFrom.add(t);
      return this;
    }

    /**
     * @param value {@link #derivedFrom} (Another set of Requirements that this set of Requirements builds on and updates.)
     */
    public boolean hasDerivedFrom(String value) { 
      if (this.derivedFrom == null)
        return false;
      for (CanonicalType v : this.derivedFrom)
        if (v.getValue().equals(value)) // canonical
          return true;
      return false;
    }

    /**
     * @return {@link #actor} (An actor these requirements are in regard to.)
     */
    public List<CanonicalType> getActor() { 
      if (this.actor == null)
        this.actor = new ArrayList<CanonicalType>();
      return this.actor;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Requirements setActor(List<CanonicalType> theActor) { 
      this.actor = theActor;
      return this;
    }

    public boolean hasActor() { 
      if (this.actor == null)
        return false;
      for (CanonicalType item : this.actor)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #actor} (An actor these requirements are in regard to.)
     */
    public CanonicalType addActorElement() {//2 
      CanonicalType t = new CanonicalType();
      if (this.actor == null)
        this.actor = new ArrayList<CanonicalType>();
      this.actor.add(t);
      return t;
    }

    /**
     * @param value {@link #actor} (An actor these requirements are in regard to.)
     */
    public Requirements addActor(String value) { //1
      CanonicalType t = new CanonicalType();
      t.setValue(value);
      if (this.actor == null)
        this.actor = new ArrayList<CanonicalType>();
      this.actor.add(t);
      return this;
    }

    /**
     * @param value {@link #actor} (An actor these requirements are in regard to.)
     */
    public boolean hasActor(String value) { 
      if (this.actor == null)
        return false;
      for (CanonicalType v : this.actor)
        if (v.getValue().equals(value)) // canonical
          return true;
      return false;
    }

    /**
     * @return {@link #statement} (A statement of requirements.)
     */
    public List<RequirementsStatementComponent> getStatement() { 
      if (this.statement == null)
        this.statement = new ArrayList<RequirementsStatementComponent>();
      return this.statement;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Requirements setStatement(List<RequirementsStatementComponent> theStatement) { 
      this.statement = theStatement;
      return this;
    }

    public boolean hasStatement() { 
      if (this.statement == null)
        return false;
      for (RequirementsStatementComponent item : this.statement)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public RequirementsStatementComponent addStatement() { //3
      RequirementsStatementComponent t = new RequirementsStatementComponent();
      if (this.statement == null)
        this.statement = new ArrayList<RequirementsStatementComponent>();
      this.statement.add(t);
      return t;
    }

    public Requirements addStatement(RequirementsStatementComponent t) { //3
      if (t == null)
        return this;
      if (this.statement == null)
        this.statement = new ArrayList<RequirementsStatementComponent>();
      this.statement.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #statement}, creating it if it does not already exist {3}
     */
    public RequirementsStatementComponent getStatementFirstRep() { 
      if (getStatement().isEmpty()) {
        addStatement();
      }
      return getStatement().get(0);
    }

    /**
     * not supported on this implementation
     */
    @Override
    public int getVersionAlgorithmMax() { 
      return 0;
    }
    /**
     * @return {@link #versionAlgorithm} (Indicates the mechanism used to compare versions to determine which is more current.)
     */
    public DataType getVersionAlgorithm() { 
      throw new Error("The resource type \"Requirements\" does not implement the property \"versionAlgorithm[x]\""); 
    }
    /**
     * @return {@link #versionAlgorithm} (Indicates the mechanism used to compare versions to determine which is more current.)
     */
    public StringType getVersionAlgorithmStringType() { 
      throw new Error("The resource type \"Requirements\" does not implement the property \"versionAlgorithm[x]\""); 
    }
    public boolean hasVersionAlgorithmStringType() { 
      return false;////K 
    }
    /**
     * @return {@link #versionAlgorithm} (Indicates the mechanism used to compare versions to determine which is more current.)
     */
    public Coding getVersionAlgorithmCoding() { 
      throw new Error("The resource type \"Requirements\" does not implement the property \"versionAlgorithm[x]\""); 
    }
    public boolean hasVersionAlgorithmCoding() { 
      return false;////K 
    }
    public boolean hasVersionAlgorithm() { 
      return false;
    }
    /**
     * @param value {@link #versionAlgorithm} (Indicates the mechanism used to compare versions to determine which is more current.)
     */
    public Requirements setVersionAlgorithm(DataType value) { 
      throw new Error("The resource type \"Requirements\" does not implement the property \"versionAlgorithm[x]\""); 
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("url", "uri", "An absolute URI that is used to identify this Requirements when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this Requirements is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the Requirements is stored on different servers.", 0, 1, url));
        children.add(new Property("identifier", "Identifier", "A formal identifier that is used to identify this Requirements when it is represented in other formats, or referenced in a specification, model, design or an instance.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("version", "string", "The identifier that is used to identify this version of the Requirements when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Requirements author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.", 0, 1, version));
        children.add(new Property("name", "string", "A natural language name identifying the Requirements. This name should be usable as an identifier for the module by machine processing applications such as code generation.", 0, 1, name));
        children.add(new Property("title", "string", "A short, descriptive, user-friendly title for the Requirements.", 0, 1, title));
        children.add(new Property("status", "code", "The status of this Requirements. Enables tracking the life-cycle of the content.", 0, 1, status));
        children.add(new Property("experimental", "boolean", "A Boolean value to indicate that this Requirements is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.", 0, 1, experimental));
        children.add(new Property("date", "dateTime", "The date  (and optionally time) when the Requirements was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the Requirements changes.", 0, 1, date));
        children.add(new Property("publisher", "string", "The name of the organization or individual responsible for the release and ongoing maintenance of the Requirements.", 0, 1, publisher));
        children.add(new Property("contact", "ContactDetail", "Contact details to assist a user in finding and communicating with the publisher.", 0, java.lang.Integer.MAX_VALUE, contact));
        children.add(new Property("description", "markdown", "A free text natural language description of the actor.", 0, 1, description));
        children.add(new Property("useContext", "UsageContext", "The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate Requirements instances.", 0, java.lang.Integer.MAX_VALUE, useContext));
        children.add(new Property("jurisdiction", "CodeableConcept", "A legal or geographic region in which the Requirements is intended to be used.", 0, java.lang.Integer.MAX_VALUE, jurisdiction));
        children.add(new Property("purpose", "markdown", "Explanation of why this Requirements is needed and why it has been designed as it has.", 0, 1, purpose));
        children.add(new Property("copyright", "markdown", "A copyright statement relating to the Requirements and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the Requirements.", 0, 1, copyright));
        children.add(new Property("copyrightLabel", "string", "A short string (<50 characters), suitable for inclusion in a page footer that identifies the copyright holder, effective period, and optionally whether rights are resctricted. (e.g. 'All rights reserved', 'Some rights reserved').", 0, 1, copyrightLabel));
        children.add(new Property("derivedFrom", "canonical(Requirements)", "Another set of Requirements that this set of Requirements builds on and updates.", 0, java.lang.Integer.MAX_VALUE, derivedFrom));
        children.add(new Property("actor", "canonical(ActorDefinition)", "An actor these requirements are in regard to.", 0, java.lang.Integer.MAX_VALUE, actor));
        children.add(new Property("statement", "", "A statement of requirements.", 0, java.lang.Integer.MAX_VALUE, statement));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case 116079: /*url*/  return new Property("url", "uri", "An absolute URI that is used to identify this Requirements when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this Requirements is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the Requirements is stored on different servers.", 0, 1, url);
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "A formal identifier that is used to identify this Requirements when it is represented in other formats, or referenced in a specification, model, design or an instance.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case 351608024: /*version*/  return new Property("version", "string", "The identifier that is used to identify this version of the Requirements when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Requirements author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.", 0, 1, version);
        case 3373707: /*name*/  return new Property("name", "string", "A natural language name identifying the Requirements. This name should be usable as an identifier for the module by machine processing applications such as code generation.", 0, 1, name);
        case 110371416: /*title*/  return new Property("title", "string", "A short, descriptive, user-friendly title for the Requirements.", 0, 1, title);
        case -892481550: /*status*/  return new Property("status", "code", "The status of this Requirements. Enables tracking the life-cycle of the content.", 0, 1, status);
        case -404562712: /*experimental*/  return new Property("experimental", "boolean", "A Boolean value to indicate that this Requirements is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.", 0, 1, experimental);
        case 3076014: /*date*/  return new Property("date", "dateTime", "The date  (and optionally time) when the Requirements was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the Requirements changes.", 0, 1, date);
        case 1447404028: /*publisher*/  return new Property("publisher", "string", "The name of the organization or individual responsible for the release and ongoing maintenance of the Requirements.", 0, 1, publisher);
        case 951526432: /*contact*/  return new Property("contact", "ContactDetail", "Contact details to assist a user in finding and communicating with the publisher.", 0, java.lang.Integer.MAX_VALUE, contact);
        case -1724546052: /*description*/  return new Property("description", "markdown", "A free text natural language description of the actor.", 0, 1, description);
        case -669707736: /*useContext*/  return new Property("useContext", "UsageContext", "The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate Requirements instances.", 0, java.lang.Integer.MAX_VALUE, useContext);
        case -507075711: /*jurisdiction*/  return new Property("jurisdiction", "CodeableConcept", "A legal or geographic region in which the Requirements is intended to be used.", 0, java.lang.Integer.MAX_VALUE, jurisdiction);
        case -220463842: /*purpose*/  return new Property("purpose", "markdown", "Explanation of why this Requirements is needed and why it has been designed as it has.", 0, 1, purpose);
        case 1522889671: /*copyright*/  return new Property("copyright", "markdown", "A copyright statement relating to the Requirements and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the Requirements.", 0, 1, copyright);
        case 765157229: /*copyrightLabel*/  return new Property("copyrightLabel", "string", "A short string (<50 characters), suitable for inclusion in a page footer that identifies the copyright holder, effective period, and optionally whether rights are resctricted. (e.g. 'All rights reserved', 'Some rights reserved').", 0, 1, copyrightLabel);
        case 1077922663: /*derivedFrom*/  return new Property("derivedFrom", "canonical(Requirements)", "Another set of Requirements that this set of Requirements builds on and updates.", 0, java.lang.Integer.MAX_VALUE, derivedFrom);
        case 92645877: /*actor*/  return new Property("actor", "canonical(ActorDefinition)", "An actor these requirements are in regard to.", 0, java.lang.Integer.MAX_VALUE, actor);
        case -2085148305: /*statement*/  return new Property("statement", "", "A statement of requirements.", 0, java.lang.Integer.MAX_VALUE, statement);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 116079: /*url*/ return this.url == null ? new Base[0] : new Base[] {this.url}; // UriType
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case 351608024: /*version*/ return this.version == null ? new Base[0] : new Base[] {this.version}; // StringType
        case 3373707: /*name*/ return this.name == null ? new Base[0] : new Base[] {this.name}; // StringType
        case 110371416: /*title*/ return this.title == null ? new Base[0] : new Base[] {this.title}; // StringType
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<PublicationStatus>
        case -404562712: /*experimental*/ return this.experimental == null ? new Base[0] : new Base[] {this.experimental}; // BooleanType
        case 3076014: /*date*/ return this.date == null ? new Base[0] : new Base[] {this.date}; // DateTimeType
        case 1447404028: /*publisher*/ return this.publisher == null ? new Base[0] : new Base[] {this.publisher}; // StringType
        case 951526432: /*contact*/ return this.contact == null ? new Base[0] : this.contact.toArray(new Base[this.contact.size()]); // ContactDetail
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // MarkdownType
        case -669707736: /*useContext*/ return this.useContext == null ? new Base[0] : this.useContext.toArray(new Base[this.useContext.size()]); // UsageContext
        case -507075711: /*jurisdiction*/ return this.jurisdiction == null ? new Base[0] : this.jurisdiction.toArray(new Base[this.jurisdiction.size()]); // CodeableConcept
        case -220463842: /*purpose*/ return this.purpose == null ? new Base[0] : new Base[] {this.purpose}; // MarkdownType
        case 1522889671: /*copyright*/ return this.copyright == null ? new Base[0] : new Base[] {this.copyright}; // MarkdownType
        case 765157229: /*copyrightLabel*/ return this.copyrightLabel == null ? new Base[0] : new Base[] {this.copyrightLabel}; // StringType
        case 1077922663: /*derivedFrom*/ return this.derivedFrom == null ? new Base[0] : this.derivedFrom.toArray(new Base[this.derivedFrom.size()]); // CanonicalType
        case 92645877: /*actor*/ return this.actor == null ? new Base[0] : this.actor.toArray(new Base[this.actor.size()]); // CanonicalType
        case -2085148305: /*statement*/ return this.statement == null ? new Base[0] : this.statement.toArray(new Base[this.statement.size()]); // RequirementsStatementComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 116079: // url
          this.url = TypeConvertor.castToUri(value); // UriType
          return value;
        case -1618432855: // identifier
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
          return value;
        case 351608024: // version
          this.version = TypeConvertor.castToString(value); // StringType
          return value;
        case 3373707: // name
          this.name = TypeConvertor.castToString(value); // StringType
          return value;
        case 110371416: // title
          this.title = TypeConvertor.castToString(value); // StringType
          return value;
        case -892481550: // status
          value = new PublicationStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<PublicationStatus>
          return value;
        case -404562712: // experimental
          this.experimental = TypeConvertor.castToBoolean(value); // BooleanType
          return value;
        case 3076014: // date
          this.date = TypeConvertor.castToDateTime(value); // DateTimeType
          return value;
        case 1447404028: // publisher
          this.publisher = TypeConvertor.castToString(value); // StringType
          return value;
        case 951526432: // contact
          this.getContact().add(TypeConvertor.castToContactDetail(value)); // ContactDetail
          return value;
        case -1724546052: // description
          this.description = TypeConvertor.castToMarkdown(value); // MarkdownType
          return value;
        case -669707736: // useContext
          this.getUseContext().add(TypeConvertor.castToUsageContext(value)); // UsageContext
          return value;
        case -507075711: // jurisdiction
          this.getJurisdiction().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -220463842: // purpose
          this.purpose = TypeConvertor.castToMarkdown(value); // MarkdownType
          return value;
        case 1522889671: // copyright
          this.copyright = TypeConvertor.castToMarkdown(value); // MarkdownType
          return value;
        case 765157229: // copyrightLabel
          this.copyrightLabel = TypeConvertor.castToString(value); // StringType
          return value;
        case 1077922663: // derivedFrom
          this.getDerivedFrom().add(TypeConvertor.castToCanonical(value)); // CanonicalType
          return value;
        case 92645877: // actor
          this.getActor().add(TypeConvertor.castToCanonical(value)); // CanonicalType
          return value;
        case -2085148305: // statement
          this.getStatement().add((RequirementsStatementComponent) value); // RequirementsStatementComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("url")) {
          this.url = TypeConvertor.castToUri(value); // UriType
        } else if (name.equals("identifier")) {
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("version")) {
          this.version = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("name")) {
          this.name = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("title")) {
          this.title = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("status")) {
          value = new PublicationStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<PublicationStatus>
        } else if (name.equals("experimental")) {
          this.experimental = TypeConvertor.castToBoolean(value); // BooleanType
        } else if (name.equals("date")) {
          this.date = TypeConvertor.castToDateTime(value); // DateTimeType
        } else if (name.equals("publisher")) {
          this.publisher = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("contact")) {
          this.getContact().add(TypeConvertor.castToContactDetail(value));
        } else if (name.equals("description")) {
          this.description = TypeConvertor.castToMarkdown(value); // MarkdownType
        } else if (name.equals("useContext")) {
          this.getUseContext().add(TypeConvertor.castToUsageContext(value));
        } else if (name.equals("jurisdiction")) {
          this.getJurisdiction().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("purpose")) {
          this.purpose = TypeConvertor.castToMarkdown(value); // MarkdownType
        } else if (name.equals("copyright")) {
          this.copyright = TypeConvertor.castToMarkdown(value); // MarkdownType
        } else if (name.equals("copyrightLabel")) {
          this.copyrightLabel = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("derivedFrom")) {
          this.getDerivedFrom().add(TypeConvertor.castToCanonical(value));
        } else if (name.equals("actor")) {
          this.getActor().add(TypeConvertor.castToCanonical(value));
        } else if (name.equals("statement")) {
          this.getStatement().add((RequirementsStatementComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 116079:  return getUrlElement();
        case -1618432855:  return addIdentifier(); 
        case 351608024:  return getVersionElement();
        case 3373707:  return getNameElement();
        case 110371416:  return getTitleElement();
        case -892481550:  return getStatusElement();
        case -404562712:  return getExperimentalElement();
        case 3076014:  return getDateElement();
        case 1447404028:  return getPublisherElement();
        case 951526432:  return addContact(); 
        case -1724546052:  return getDescriptionElement();
        case -669707736:  return addUseContext(); 
        case -507075711:  return addJurisdiction(); 
        case -220463842:  return getPurposeElement();
        case 1522889671:  return getCopyrightElement();
        case 765157229:  return getCopyrightLabelElement();
        case 1077922663:  return addDerivedFromElement();
        case 92645877:  return addActorElement();
        case -2085148305:  return addStatement(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 116079: /*url*/ return new String[] {"uri"};
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case 351608024: /*version*/ return new String[] {"string"};
        case 3373707: /*name*/ return new String[] {"string"};
        case 110371416: /*title*/ return new String[] {"string"};
        case -892481550: /*status*/ return new String[] {"code"};
        case -404562712: /*experimental*/ return new String[] {"boolean"};
        case 3076014: /*date*/ return new String[] {"dateTime"};
        case 1447404028: /*publisher*/ return new String[] {"string"};
        case 951526432: /*contact*/ return new String[] {"ContactDetail"};
        case -1724546052: /*description*/ return new String[] {"markdown"};
        case -669707736: /*useContext*/ return new String[] {"UsageContext"};
        case -507075711: /*jurisdiction*/ return new String[] {"CodeableConcept"};
        case -220463842: /*purpose*/ return new String[] {"markdown"};
        case 1522889671: /*copyright*/ return new String[] {"markdown"};
        case 765157229: /*copyrightLabel*/ return new String[] {"string"};
        case 1077922663: /*derivedFrom*/ return new String[] {"canonical"};
        case 92645877: /*actor*/ return new String[] {"canonical"};
        case -2085148305: /*statement*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("url")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.url");
        }
        else if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("version")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.version");
        }
        else if (name.equals("name")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.name");
        }
        else if (name.equals("title")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.title");
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.status");
        }
        else if (name.equals("experimental")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.experimental");
        }
        else if (name.equals("date")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.date");
        }
        else if (name.equals("publisher")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.publisher");
        }
        else if (name.equals("contact")) {
          return addContact();
        }
        else if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.description");
        }
        else if (name.equals("useContext")) {
          return addUseContext();
        }
        else if (name.equals("jurisdiction")) {
          return addJurisdiction();
        }
        else if (name.equals("purpose")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.purpose");
        }
        else if (name.equals("copyright")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.copyright");
        }
        else if (name.equals("copyrightLabel")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.copyrightLabel");
        }
        else if (name.equals("derivedFrom")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.derivedFrom");
        }
        else if (name.equals("actor")) {
          throw new FHIRException("Cannot call addChild on a primitive type Requirements.actor");
        }
        else if (name.equals("statement")) {
          return addStatement();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "Requirements";

  }

      public Requirements copy() {
        Requirements dst = new Requirements();
        copyValues(dst);
        return dst;
      }

      public void copyValues(Requirements dst) {
        super.copyValues(dst);
        dst.url = url == null ? null : url.copy();
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.version = version == null ? null : version.copy();
        dst.name = name == null ? null : name.copy();
        dst.title = title == null ? null : title.copy();
        dst.status = status == null ? null : status.copy();
        dst.experimental = experimental == null ? null : experimental.copy();
        dst.date = date == null ? null : date.copy();
        dst.publisher = publisher == null ? null : publisher.copy();
        if (contact != null) {
          dst.contact = new ArrayList<ContactDetail>();
          for (ContactDetail i : contact)
            dst.contact.add(i.copy());
        };
        dst.description = description == null ? null : description.copy();
        if (useContext != null) {
          dst.useContext = new ArrayList<UsageContext>();
          for (UsageContext i : useContext)
            dst.useContext.add(i.copy());
        };
        if (jurisdiction != null) {
          dst.jurisdiction = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : jurisdiction)
            dst.jurisdiction.add(i.copy());
        };
        dst.purpose = purpose == null ? null : purpose.copy();
        dst.copyright = copyright == null ? null : copyright.copy();
        dst.copyrightLabel = copyrightLabel == null ? null : copyrightLabel.copy();
        if (derivedFrom != null) {
          dst.derivedFrom = new ArrayList<CanonicalType>();
          for (CanonicalType i : derivedFrom)
            dst.derivedFrom.add(i.copy());
        };
        if (actor != null) {
          dst.actor = new ArrayList<CanonicalType>();
          for (CanonicalType i : actor)
            dst.actor.add(i.copy());
        };
        if (statement != null) {
          dst.statement = new ArrayList<RequirementsStatementComponent>();
          for (RequirementsStatementComponent i : statement)
            dst.statement.add(i.copy());
        };
      }

      protected Requirements typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof Requirements))
          return false;
        Requirements o = (Requirements) other_;
        return compareDeep(url, o.url, true) && compareDeep(identifier, o.identifier, true) && compareDeep(version, o.version, true)
           && compareDeep(name, o.name, true) && compareDeep(title, o.title, true) && compareDeep(status, o.status, true)
           && compareDeep(experimental, o.experimental, true) && compareDeep(date, o.date, true) && compareDeep(publisher, o.publisher, true)
           && compareDeep(contact, o.contact, true) && compareDeep(description, o.description, true) && compareDeep(useContext, o.useContext, true)
           && compareDeep(jurisdiction, o.jurisdiction, true) && compareDeep(purpose, o.purpose, true) && compareDeep(copyright, o.copyright, true)
           && compareDeep(copyrightLabel, o.copyrightLabel, true) && compareDeep(derivedFrom, o.derivedFrom, true)
           && compareDeep(actor, o.actor, true) && compareDeep(statement, o.statement, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof Requirements))
          return false;
        Requirements o = (Requirements) other_;
        return compareValues(url, o.url, true) && compareValues(version, o.version, true) && compareValues(name, o.name, true)
           && compareValues(title, o.title, true) && compareValues(status, o.status, true) && compareValues(experimental, o.experimental, true)
           && compareValues(date, o.date, true) && compareValues(publisher, o.publisher, true) && compareValues(description, o.description, true)
           && compareValues(purpose, o.purpose, true) && compareValues(copyright, o.copyright, true) && compareValues(copyrightLabel, o.copyrightLabel, true)
           && compareValues(derivedFrom, o.derivedFrom, true) && compareValues(actor, o.actor, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(url, identifier, version
          , name, title, status, experimental, date, publisher, contact, description, useContext
          , jurisdiction, purpose, copyright, copyrightLabel, derivedFrom, actor, statement
          );
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Requirements;
   }

 /**
   * Search parameter: <b>actor</b>
   * <p>
   * Description: <b>An actor these requirements are for</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Requirements.actor</b><br>
   * </p>
   */
  @SearchParamDefinition(name="actor", path="Requirements.actor", description="An actor these requirements are for", type="reference", target={ActorDefinition.class } )
  public static final String SP_ACTOR = "actor";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>actor</b>
   * <p>
   * Description: <b>An actor these requirements are for</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Requirements.actor</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ACTOR = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ACTOR);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Requirements:actor</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ACTOR = new ca.uhn.fhir.model.api.Include("Requirements:actor").toLocked();

 /**
   * Search parameter: <b>context-quantity</b>
   * <p>
   * Description: <b>A quantity- or range-valued use context assigned to the requirements</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>(Requirements.useContext.value as Quantity) | (Requirements.useContext.value as Range)</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-quantity", path="(Requirements.useContext.value as Quantity) | (Requirements.useContext.value as Range)", description="A quantity- or range-valued use context assigned to the requirements", type="quantity" )
  public static final String SP_CONTEXT_QUANTITY = "context-quantity";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-quantity</b>
   * <p>
   * Description: <b>A quantity- or range-valued use context assigned to the requirements</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>(Requirements.useContext.value as Quantity) | (Requirements.useContext.value as Range)</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.QuantityClientParam CONTEXT_QUANTITY = new ca.uhn.fhir.rest.gclient.QuantityClientParam(SP_CONTEXT_QUANTITY);

 /**
   * Search parameter: <b>context-type-quantity</b>
   * <p>
   * Description: <b>A use context type and quantity- or range-based value assigned to the requirements</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>Requirements.useContext</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-type-quantity", path="Requirements.useContext", description="A use context type and quantity- or range-based value assigned to the requirements", type="composite", compositeOf={"context-type", "context-quantity"} )
  public static final String SP_CONTEXT_TYPE_QUANTITY = "context-type-quantity";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type-quantity</b>
   * <p>
   * Description: <b>A use context type and quantity- or range-based value assigned to the requirements</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>Requirements.useContext</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.QuantityClientParam> CONTEXT_TYPE_QUANTITY = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.QuantityClientParam>(SP_CONTEXT_TYPE_QUANTITY);

 /**
   * Search parameter: <b>context-type-value</b>
   * <p>
   * Description: <b>A use context type and value assigned to the requirements</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>Requirements.useContext</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-type-value", path="Requirements.useContext", description="A use context type and value assigned to the requirements", type="composite", compositeOf={"context-type", "context"} )
  public static final String SP_CONTEXT_TYPE_VALUE = "context-type-value";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type-value</b>
   * <p>
   * Description: <b>A use context type and value assigned to the requirements</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>Requirements.useContext</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.TokenClientParam> CONTEXT_TYPE_VALUE = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.TokenClientParam>(SP_CONTEXT_TYPE_VALUE);

 /**
   * Search parameter: <b>context-type</b>
   * <p>
   * Description: <b>A type of use context assigned to the requirements</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Requirements.useContext.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-type", path="Requirements.useContext.code", description="A type of use context assigned to the requirements", type="token" )
  public static final String SP_CONTEXT_TYPE = "context-type";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type</b>
   * <p>
   * Description: <b>A type of use context assigned to the requirements</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Requirements.useContext.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONTEXT_TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CONTEXT_TYPE);

 /**
   * Search parameter: <b>context</b>
   * <p>
   * Description: <b>A use context assigned to the requirements</b><br>
   * Type: <b>token</b><br>
   * Path: <b>(Requirements.useContext.value as CodeableConcept)</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context", path="(Requirements.useContext.value as CodeableConcept)", description="A use context assigned to the requirements", type="token" )
  public static final String SP_CONTEXT = "context";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context</b>
   * <p>
   * Description: <b>A use context assigned to the requirements</b><br>
   * Type: <b>token</b><br>
   * Path: <b>(Requirements.useContext.value as CodeableConcept)</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONTEXT = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CONTEXT);

 /**
   * Search parameter: <b>date</b>
   * <p>
   * Description: <b>The requirements publication date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Requirements.date</b><br>
   * </p>
   */
  @SearchParamDefinition(name="date", path="Requirements.date", description="The requirements publication date", type="date" )
  public static final String SP_DATE = "date";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>date</b>
   * <p>
   * Description: <b>The requirements publication date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Requirements.date</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_DATE);

 /**
   * Search parameter: <b>derived-from</b>
   * <p>
   * Description: <b>The requirements these are derived from</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Requirements.derivedFrom</b><br>
   * </p>
   */
  @SearchParamDefinition(name="derived-from", path="Requirements.derivedFrom", description="The requirements these are derived from", type="reference", target={Requirements.class } )
  public static final String SP_DERIVED_FROM = "derived-from";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>derived-from</b>
   * <p>
   * Description: <b>The requirements these are derived from</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Requirements.derivedFrom</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam DERIVED_FROM = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_DERIVED_FROM);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Requirements:derived-from</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_DERIVED_FROM = new ca.uhn.fhir.model.api.Include("Requirements:derived-from").toLocked();

 /**
   * Search parameter: <b>description</b>
   * <p>
   * Description: <b>The description of the requirements</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Requirements.description</b><br>
   * </p>
   */
  @SearchParamDefinition(name="description", path="Requirements.description", description="The description of the requirements", type="string" )
  public static final String SP_DESCRIPTION = "description";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>description</b>
   * <p>
   * Description: <b>The description of the requirements</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Requirements.description</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam DESCRIPTION = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_DESCRIPTION);

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>External identifier for the requirements</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Requirements.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="Requirements.identifier", description="External identifier for the requirements", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>External identifier for the requirements</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Requirements.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>jurisdiction</b>
   * <p>
   * Description: <b>Intended jurisdiction for the requirements</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Requirements.jurisdiction</b><br>
   * </p>
   */
  @SearchParamDefinition(name="jurisdiction", path="Requirements.jurisdiction", description="Intended jurisdiction for the requirements", type="token" )
  public static final String SP_JURISDICTION = "jurisdiction";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>jurisdiction</b>
   * <p>
   * Description: <b>Intended jurisdiction for the requirements</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Requirements.jurisdiction</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam JURISDICTION = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_JURISDICTION);

 /**
   * Search parameter: <b>name</b>
   * <p>
   * Description: <b>Computationally friendly name of the requirements</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Requirements.name</b><br>
   * </p>
   */
  @SearchParamDefinition(name="name", path="Requirements.name", description="Computationally friendly name of the requirements", type="string" )
  public static final String SP_NAME = "name";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>name</b>
   * <p>
   * Description: <b>Computationally friendly name of the requirements</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Requirements.name</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam NAME = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_NAME);

 /**
   * Search parameter: <b>publisher</b>
   * <p>
   * Description: <b>Name of the publisher of the requirements</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Requirements.publisher</b><br>
   * </p>
   */
  @SearchParamDefinition(name="publisher", path="Requirements.publisher", description="Name of the publisher of the requirements", type="string" )
  public static final String SP_PUBLISHER = "publisher";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>publisher</b>
   * <p>
   * Description: <b>Name of the publisher of the requirements</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Requirements.publisher</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam PUBLISHER = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_PUBLISHER);

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>The current status of the requirements</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Requirements.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="Requirements.status", description="The current status of the requirements", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>The current status of the requirements</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Requirements.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);

 /**
   * Search parameter: <b>title</b>
   * <p>
   * Description: <b>The human-friendly name of the requirements</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Requirements.title</b><br>
   * </p>
   */
  @SearchParamDefinition(name="title", path="Requirements.title", description="The human-friendly name of the requirements", type="string" )
  public static final String SP_TITLE = "title";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>title</b>
   * <p>
   * Description: <b>The human-friendly name of the requirements</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Requirements.title</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam TITLE = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_TITLE);

 /**
   * Search parameter: <b>url</b>
   * <p>
   * Description: <b>The uri that identifies the requirements</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>Requirements.url</b><br>
   * </p>
   */
  @SearchParamDefinition(name="url", path="Requirements.url", description="The uri that identifies the requirements", type="uri" )
  public static final String SP_URL = "url";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>url</b>
   * <p>
   * Description: <b>The uri that identifies the requirements</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>Requirements.url</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.UriClientParam URL = new ca.uhn.fhir.rest.gclient.UriClientParam(SP_URL);

 /**
   * Search parameter: <b>version</b>
   * <p>
   * Description: <b>The business version of the requirements</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Requirements.version</b><br>
   * </p>
   */
  @SearchParamDefinition(name="version", path="Requirements.version", description="The business version of the requirements", type="token" )
  public static final String SP_VERSION = "version";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>version</b>
   * <p>
   * Description: <b>The business version of the requirements</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Requirements.version</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam VERSION = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_VERSION);


}
