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
 * Gets or Sets VdsOrderByInput
 */
@JsonAdapter(VdsOrderByInput.Adapter.class)
public enum VdsOrderByInput {
  
  BOND_MODE_ASC("bond_mode_ASC"),
  
  BOND_MODE_DESC("bond_mode_DESC"),
  
  CREATEDAT_ASC("createdAt_ASC"),
  
  CREATEDAT_DESC("createdAt_DESC"),
  
  ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),
  
  ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  INTERNAL_ASC("internal_ASC"),
  
  INTERNAL_DESC("internal_DESC"),
  
  LOCAL_ID_ASC("local_id_ASC"),
  
  LOCAL_ID_DESC("local_id_DESC"),
  
  NAME_ASC("name_ASC"),
  
  NAME_DESC("name_DESC"),
  
  OVSBR_NAME_ASC("ovsbr_name_ASC"),
  
  OVSBR_NAME_DESC("ovsbr_name_DESC"),
  
  TYPE_ASC("type_ASC"),
  
  TYPE_DESC("type_DESC"),
  
  UPDATEDAT_ASC("updatedAt_ASC"),
  
  UPDATEDAT_DESC("updatedAt_DESC"),
  
  VLANS_NUM_ASC("vlans_num_ASC"),
  
  VLANS_NUM_DESC("vlans_num_DESC");

  private String value;

  VdsOrderByInput(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VdsOrderByInput fromValue(String value) {
    for (VdsOrderByInput b : VdsOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<VdsOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final VdsOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VdsOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VdsOrderByInput.fromValue(value);
    }
  }
}

