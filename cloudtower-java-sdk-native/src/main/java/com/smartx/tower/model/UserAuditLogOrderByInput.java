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
 * Gets or Sets UserAuditLogOrderByInput
 */
public enum UserAuditLogOrderByInput {
  
  ACTION_ASC("action_ASC"),
  
  ACTION_DESC("action_DESC"),
  
  CREATEDAT_ASC("createdAt_ASC"),
  
  CREATEDAT_DESC("createdAt_DESC"),
  
  FINISHED_AT_ASC("finished_at_ASC"),
  
  FINISHED_AT_DESC("finished_at_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  IP_ADDRESS_ASC("ip_address_ASC"),
  
  IP_ADDRESS_DESC("ip_address_DESC"),
  
  MESSAGE_ASC("message_ASC"),
  
  MESSAGE_DESC("message_DESC"),
  
  RESOURCE_ID_ASC("resource_id_ASC"),
  
  RESOURCE_ID_DESC("resource_id_DESC"),
  
  RESOURCE_TYPE_ASC("resource_type_ASC"),
  
  RESOURCE_TYPE_DESC("resource_type_DESC"),
  
  STATUS_ASC("status_ASC"),
  
  STATUS_DESC("status_DESC"),
  
  UPDATEDAT_ASC("updatedAt_ASC"),
  
  UPDATEDAT_DESC("updatedAt_DESC");

  private String value;

  UserAuditLogOrderByInput(String value) {
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
  public static UserAuditLogOrderByInput fromValue(String value) {
    for (UserAuditLogOrderByInput b : UserAuditLogOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

