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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets UserAuditLogOrderByInput
 */
@JsonAdapter(UserAuditLogOrderByInput.Adapter.class)
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

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserAuditLogOrderByInput fromValue(String value) {
    for (UserAuditLogOrderByInput b : UserAuditLogOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<UserAuditLogOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final UserAuditLogOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UserAuditLogOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UserAuditLogOrderByInput.fromValue(value);
    }
  }
}
