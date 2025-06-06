package org.hl7.fhir.convertors.loaders.loaderR5;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

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


import org.hl7.fhir.convertors.advisors.impl.BaseAdvisor_14_50;
import org.hl7.fhir.convertors.factory.VersionConvertorFactory_14_50;
import org.hl7.fhir.convertors.txClient.TerminologyClientFactory;
import org.hl7.fhir.dstu2016may.formats.JsonParser;
import org.hl7.fhir.dstu2016may.formats.XmlParser;
import org.hl7.fhir.dstu2016may.model.Resource;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r5.context.SimpleWorkerContext.PackageResourceLoader;
import org.hl7.fhir.r5.model.Bundle;
import org.hl7.fhir.r5.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.r5.model.Bundle.BundleType;
import org.hl7.fhir.r5.model.CanonicalResource;
import org.hl7.fhir.r5.model.CodeSystem;
import org.hl7.fhir.r5.model.StructureDefinition;
import org.hl7.fhir.r5.model.StructureDefinition.StructureDefinitionKind;
import org.hl7.fhir.r5.terminologies.client.TerminologyClientManager.ITerminologyClientFactory;

public class R2016MayToR5Loader extends BaseLoaderR5 {

  private final BaseAdvisor_14_50 advisor = new BaseAdvisor_14_50();

  public R2016MayToR5Loader(Set<String> types, ILoaderKnowledgeProviderR5 lkp) {
    super(types, lkp);
  }

  @Override
  public Bundle loadBundle(InputStream stream, boolean isJson) throws FHIRException, IOException {
    Resource r2016may = null;
    if (isJson)
      r2016may = new JsonParser().parse(stream);
    else
      r2016may = new XmlParser().parse(stream);
    org.hl7.fhir.r5.model.Resource r5 = VersionConvertorFactory_14_50.convertResource(r2016may, advisor);

    Bundle b;
    if (r5 instanceof Bundle)
      b = (Bundle) r5;
    else {
      b = new Bundle();
      b.setId(UUID.randomUUID().toString().toLowerCase());
      b.setType(BundleType.COLLECTION);
      b.addEntry().setResource(r5).setFullUrl(r5 instanceof CanonicalResource ? ((CanonicalResource) r5).getUrl() : null);
    }

    for (CodeSystem cs : advisor.getCslist()) {
      BundleEntryComponent be = b.addEntry();
      be.setFullUrl(cs.getUrl());
      be.setResource(cs);
    }
    if (killPrimitives) {
      List<BundleEntryComponent> remove = new ArrayList<BundleEntryComponent>();
      for (BundleEntryComponent be : b.getEntry()) {
        if (be.hasResource() && be.getResource() instanceof StructureDefinition) {
          StructureDefinition sd = (StructureDefinition) be.getResource();
          if (sd.getKind() == StructureDefinitionKind.PRIMITIVETYPE)
            remove.add(be);
        }
      }
      b.getEntry().removeAll(remove);
    }
    if (patchUrls) {
      for (BundleEntryComponent be : b.getEntry()) {
        if (be.hasResource()) {
          doPatchUrls(be.getResource());
        }
      }
    }
    return b;
  }

  @Override
  public org.hl7.fhir.r5.model.Resource loadResource(InputStream stream, boolean isJson) throws FHIRException, IOException {
    Resource r2016may = null;
    if (isJson)
      r2016may = new JsonParser().parse(stream);
    else
      r2016may = new XmlParser().parse(stream);
    org.hl7.fhir.r5.model.Resource r5 = VersionConvertorFactory_14_50.convertResource(r2016may);
    setPath(r5);

    if (!advisor.getCslist().isEmpty()) {
      throw new FHIRException("Error: Cannot have included code systems");
    }
    if (killPrimitives) {
      throw new FHIRException("Cannot kill primitives when using deferred loading");
    }
    if (patchUrls) {
      doPatchUrls(r5);
    }
    return r5;
  }


  @Override
  public List<CodeSystem> getCodeSystems() {
    return new ArrayList<>();
  }

  @Override
  protected String versionString() {
    return "4.3";
  }

  @Override
  public ITerminologyClientFactory txFactory() {
    return new TerminologyClientFactory(versionString());
  }


  @Override
  public Set<String> reviewActualTypes(Set<String> types) {
    // this isn't correct, but we don't care anymore for R2B IGs
    return types;
  }
  

  @Override
  public PackageResourceLoader editInfo(PackageResourceLoader pri) {
    return pri;
  }
}