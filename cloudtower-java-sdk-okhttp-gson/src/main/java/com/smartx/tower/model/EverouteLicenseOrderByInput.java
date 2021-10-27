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
 * Gets or Sets EverouteLicenseOrderByInput
 */
@JsonAdapter(EverouteLicenseOrderByInput.Adapter.class)
public enum EverouteLicenseOrderByInput {
  
  CREATEDAT_ASC("createdAt_ASC"),
  
  CREATEDAT_DESC("createdAt_DESC"),
  
  EXPIRE_DATE_ASC("expire_date_ASC"),
  
  EXPIRE_DATE_DESC("expire_date_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  LICENSE_SERIAL_ASC("license_serial_ASC"),
  
  LICENSE_SERIAL_DESC("license_serial_DESC"),
  
  MAX_SOCKET_NUM_ASC("max_socket_num_ASC"),
  
  MAX_SOCKET_NUM_DESC("max_socket_num_DESC"),
  
  SIGN_DATE_ASC("sign_date_ASC"),
  
  SIGN_DATE_DESC("sign_date_DESC"),
  
  SOFTWARE_EDITION_ASC("software_edition_ASC"),
  
  SOFTWARE_EDITION_DESC("software_edition_DESC"),
  
  TYPE_ASC("type_ASC"),
  
  TYPE_DESC("type_DESC"),
  
  UPDATEDAT_ASC("updatedAt_ASC"),
  
  UPDATEDAT_DESC("updatedAt_DESC");

  private String value;

  EverouteLicenseOrderByInput(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EverouteLicenseOrderByInput fromValue(String value) {
    for (EverouteLicenseOrderByInput b : EverouteLicenseOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EverouteLicenseOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final EverouteLicenseOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EverouteLicenseOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EverouteLicenseOrderByInput.fromValue(value);
    }
  }
}

