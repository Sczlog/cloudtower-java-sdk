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
 * Gets or Sets GlobalSettingsOrderByInput
 */
@JsonAdapter(GlobalSettingsOrderByInput.Adapter.class)
public enum GlobalSettingsOrderByInput {
  
  CREATEDAT_ASC("createdAt_ASC"),
  
  CREATEDAT_DESC("createdAt_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  UPDATEDAT_ASC("updatedAt_ASC"),
  
  UPDATEDAT_DESC("updatedAt_DESC"),
  
  VM_RECYCLE_BIN_ASC("vm_recycle_bin_ASC"),
  
  VM_RECYCLE_BIN_DESC("vm_recycle_bin_DESC");

  private String value;

  GlobalSettingsOrderByInput(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GlobalSettingsOrderByInput fromValue(String value) {
    for (GlobalSettingsOrderByInput b : GlobalSettingsOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<GlobalSettingsOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final GlobalSettingsOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GlobalSettingsOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return GlobalSettingsOrderByInput.fromValue(value);
    }
  }
}

