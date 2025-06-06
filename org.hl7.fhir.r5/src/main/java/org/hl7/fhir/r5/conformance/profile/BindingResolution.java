package org.hl7.fhir.r5.conformance.profile;

import org.hl7.fhir.utilities.MarkedToMoveToAdjunctPackage;

@MarkedToMoveToAdjunctPackage
public class BindingResolution {
  public BindingResolution(String display, String url) {
    this.display = display;
    this.url = url;
  }
  public BindingResolution() {
    // TODO Auto-generated constructor stub
  }
  public String display;
  public String url;
  public String uri;
  public boolean external;
}