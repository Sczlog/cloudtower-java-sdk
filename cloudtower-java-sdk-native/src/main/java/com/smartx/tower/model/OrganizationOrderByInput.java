/*
 * Tower SDK API
 * cloudtower operation API and SDK
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets OrganizationOrderByInput
 */
public enum OrganizationOrderByInput {
  
  CREATEDAT_ASC("createdAt_ASC"),
  
  CREATEDAT_DESC("createdAt_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  NAME_ASC("name_ASC"),
  
  NAME_DESC("name_DESC"),
  
  UPDATEDAT_ASC("updatedAt_ASC"),
  
  UPDATEDAT_DESC("updatedAt_DESC");

  private String value;

  OrganizationOrderByInput(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrganizationOrderByInput fromValue(String value) {
    for (OrganizationOrderByInput b : OrganizationOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

