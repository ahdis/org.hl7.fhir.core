package org.hl7.fhir.r4b.utils.validation.constants;

import org.hl7.fhir.utilities.MarkedToMoveToAdjunctPackage;

@MarkedToMoveToAdjunctPackage
public enum ReferenceValidationPolicy {
  IGNORE, CHECK_TYPE_IF_EXISTS, CHECK_EXISTS, CHECK_EXISTS_AND_TYPE, CHECK_VALID;

  public boolean ignore() {
    return this == IGNORE;
  }

  public boolean checkExists() {
    return this == CHECK_EXISTS_AND_TYPE || this == CHECK_EXISTS || this == CHECK_VALID || this == CHECK_TYPE_IF_EXISTS;
  }

  public boolean checkType() {
    return this == CHECK_TYPE_IF_EXISTS || this == CHECK_EXISTS_AND_TYPE || this == CHECK_VALID;
  }

  public boolean checkValid() {
    return this == CHECK_VALID;
  }
}
