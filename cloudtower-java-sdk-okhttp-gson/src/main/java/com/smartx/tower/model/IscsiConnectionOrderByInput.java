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
 * Gets or Sets IscsiConnectionOrderByInput
 */
@JsonAdapter(IscsiConnectionOrderByInput.Adapter.class)
public enum IscsiConnectionOrderByInput {
  
  CLIENT_PORT_ASC("client_port_ASC"),
  
  CLIENT_PORT_DESC("client_port_DESC"),
  
  CREATEDAT_ASC("createdAt_ASC"),
  
  CREATEDAT_DESC("createdAt_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  INITIATOR_IP_ASC("initiator_ip_ASC"),
  
  INITIATOR_IP_DESC("initiator_ip_DESC"),
  
  TYPE_ASC("type_ASC"),
  
  TYPE_DESC("type_DESC"),
  
  UPDATEDAT_ASC("updatedAt_ASC"),
  
  UPDATEDAT_DESC("updatedAt_DESC");

  private String value;

  IscsiConnectionOrderByInput(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IscsiConnectionOrderByInput fromValue(String value) {
    for (IscsiConnectionOrderByInput b : IscsiConnectionOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<IscsiConnectionOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final IscsiConnectionOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IscsiConnectionOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IscsiConnectionOrderByInput.fromValue(value);
    }
  }
}
