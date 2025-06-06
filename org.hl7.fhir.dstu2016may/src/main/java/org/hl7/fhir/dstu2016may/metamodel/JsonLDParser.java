package org.hl7.fhir.dstu2016may.metamodel;

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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.NotImplementedException;
import org.hl7.fhir.dstu2016may.formats.IParser.OutputStyle;
import org.hl7.fhir.dstu2016may.formats.JsonCreator;
import org.hl7.fhir.dstu2016may.formats.JsonCreatorCanonical;
import org.hl7.fhir.dstu2016may.formats.JsonCreatorGson;
import org.hl7.fhir.dstu2016may.utils.IWorkerContext;
import org.hl7.fhir.utilities.Utilities;

@Deprecated
public class JsonLDParser extends ParserBase {

  private JsonCreator json;
  private String base;

  public JsonLDParser(IWorkerContext context) {
    super(context);
  }

  @Override
  public Element parse(InputStream stream) throws Exception {
    throw new NotImplementedException("not done yet");
  }

  protected void prop(String name, String value) throws IOException {
    if (name != null)
      json.name(name);
    json.value(value);
  }

  protected void open(String name) throws IOException {
    if (name != null)
      json.name(name);
    json.beginObject();
  }

  protected void close() throws IOException {
    json.endObject();
  }

  protected void openArray(String name) throws IOException {
    if (name != null)
      json.name(name);
    json.beginArray();
  }

  protected void closeArray() throws IOException {
    json.endArray();
  }

  @Override
  public void compose(Element e, OutputStream stream, OutputStyle style, String base) throws Exception {
    this.base = base;
    OutputStreamWriter osw = new OutputStreamWriter(stream, "UTF-8");
    if (style == OutputStyle.CANONICAL)
      json = new JsonCreatorCanonical(osw);
    else
      json = new JsonCreatorGson(osw);
    json.setIndent(style == OutputStyle.PRETTY ? "  " : "");
    json.beginObject();
    prop("@context", "http://hl7.org/fhir/jsonld/" + e.getType());
    prop("resourceType", e.getType());
    Set<String> done = new HashSet<String>();
    for (Element child : e.getChildren()) {
      compose(e.getName(), e, done, child);
    }
    json.endObject();
    json.finish();
    osw.flush();
  }

  private void compose(String path, Element e, Set<String> done, Element child) throws IOException {
    if (!child.getProperty().isList()) {
      compose(path, child);
    } else if (!done.contains(child.getName())) {
      done.add(child.getName());
      List<Element> list = e.getChildrenByName(child.getName());
      composeList(path, list);
    }
  }

  private void composeList(String path, List<Element> list) throws IOException {
    // there will be at least one element
    String en = list.get(0).getProperty().getDefinition().getBase().getPath();
    if (en == null)
      en = list.get(0).getProperty().getDefinition().getPath();
    boolean doType = false;
    if (en.endsWith("[x]")) {
      en = en.substring(0, en.length() - 3);
      doType = true;
    }
    if (doType)
      en = en + Utilities.capitalize(list.get(0).getType());

    openArray(en);
    for (Element item : list) {
      open(null);
      if (item.isPrimitive() || ParserBase.isPrimitive(item.getType())) {
        if (item.hasValue())
          primitiveValue(item);
      }
      Set<String> done = new HashSet<String>();
      for (Element child : item.getChildren()) {
        compose(path + "." + item.getName(), item, done, child);
      }
      close();
    }
    closeArray();
  }

  private void primitiveValue(Element item) throws IOException {
    json.name("value");
    String type = item.getType();
    if (Utilities.existsInList(type, "boolean"))
      json.value(item.getValue().equals("true") ? new Boolean(true) : new Boolean(false));
    else if (Utilities.existsInList(type, "integer", "unsignedInt", "positiveInt"))
      json.value(new Integer(item.getValue()));
    else if (Utilities.existsInList(type, "decimal"))
      json.value(new BigDecimal(item.getValue()));
    else
      json.value(item.getValue());
  }

  private void compose(String path, Element element) throws IOException {
    String en = element.getProperty().getDefinition().getBase().getPath();
    if (en == null)
      en = element.getProperty().getDefinition().getPath();
    boolean doType = false;
    if (en.endsWith("[x]")) {
      en = en.substring(0, en.length() - 3);
      doType = true;
    }
    if (doType)
      en = en + Utilities.capitalize(element.getType());

    if (element.hasChildren() || element.hasComments() || element.hasValue()) {
      open(en);

      if (element.isPrimitive() || ParserBase.isPrimitive(element.getType())) {
        if (element.hasValue())
          primitiveValue(element);
      }
      if (element.getProperty().isResource()) {
        prop("resourceType", element.getType());
        element = element.getChildren().get(0);
      }
      Set<String> done = new HashSet<String>();
      for (Element child : element.getChildren()) {
        compose(path + "." + element.getName(), element, done, child);
      }
      if ("Coding".equals(element.getType()))
        decorateCoding(element);
      if ("CodeableConcept".equals(element.getType()))
        decorateCodeableConcept(element);
      if ("Reference".equals(element.getType()))
        decorateReference(element);

      close();
    }
  }

  private void decorateReference(Element element) throws IOException {
    String ref = element.getChildValue("reference");
    if (ref != null && (ref.startsWith("http://") || ref.startsWith("https://"))) {
      json.name("reference");
      json.value(ref);
    } else if (base != null && ref != null && ref.contains("/")) {
      json.name("reference");
      json.value(base + "/" + ref);
    }
  }

  protected void decorateCoding(Element coding) throws IOException {
    String system = coding.getChildValue("system");
    String code = coding.getChildValue("code");

    if (system == null)
      return;
    if ("http://snomed.info/sct".equals(system)) {
      json.name("concept");
      json.value("http://snomed.info/sct#" + code);
    } else if ("http://loinc.org".equals(system)) {
      json.name("concept");
      json.value("http://loinc.org/rdf#" + code);
    }
  }

  private void decorateCodeableConcept(Element element) throws IOException {
    for (Element c : element.getChildren("coding")) {
      decorateCoding(c);
    }
  }

}