package org.hl7.fhir.r5.elementmodel;

/*-
 * #%L
 * org.hl7.fhir.r5
 * %%
 * Copyright (C) 2014 - 2019 Health Level 7
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.hl7.fhir.exceptions.DefinitionException;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.exceptions.FHIRFormatError;
import org.hl7.fhir.r5.context.IWorkerContext;
import org.hl7.fhir.r5.formats.IParser.OutputStyle;
import org.hl7.fhir.r5.model.StructureDefinition;
import org.hl7.fhir.r5.utils.StructureMapUtilities;

public class Manager {

  public enum FhirFormat { XML, JSON, TURTLE, TEXT, VBAR, MAP;

    public String getExtension() {
      switch (this) {
      case JSON:
        return "json";
      case TURTLE:
        return "ttl";
      case XML:
        return "xml";
      case TEXT:
        return "txt";
      case MAP:
        return "map";
      case VBAR:
        return "hl7";
      }
      return null;
    }
    
    static public FhirFormat getFhirFormat(String extension) {
      switch (extension) {
      case "json":
        return JSON;
      case "ttl":
        return TURTLE;
      case "xml":
        return XML;
      case "txt":
        return TEXT;
      case "map":
        return MAP;
      case "hl7":
        return VBAR;
      }
      return null;
    }
  }
  
  public static Element parse(IWorkerContext context, InputStream source, FhirFormat inputFormat) throws FHIRFormatError, DefinitionException, IOException, FHIRException {
    return makeParser(context, inputFormat).parse(source);
  }

  public static void compose(IWorkerContext context, Element e, OutputStream destination, FhirFormat outputFormat, OutputStyle style, String base) throws FHIRException, IOException {
    makeParser(context, outputFormat).compose(e, destination, style, base);
  }

  public static ParserBase makeParser(IWorkerContext context, FhirFormat format) {
    switch (format) {
    case JSON : return new JsonParser(context);
    case XML : return new XmlParser(context);
    case TURTLE : return new TurtleParser(context);
    case VBAR : return new VerticalBarParser(context);
    case MAP : return new StructureMapUtilities(context);
    case TEXT : throw new Error("Programming logic error: do not call makeParser for a text resource");
    }
    return null;
  }
  
  public static Element build(IWorkerContext context, StructureDefinition sd) {
    Property p = new Property(context, sd.getSnapshot().getElementFirstRep(), sd);
    Element e = new Element(null, p);
    return e;
  }

}
