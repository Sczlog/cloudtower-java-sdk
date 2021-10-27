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
 * Gets or Sets ReportTaskOrderByInput
 */
@JsonAdapter(ReportTaskOrderByInput.Adapter.class)
public enum ReportTaskOrderByInput {
  
  CREATEDAT_ASC("createdAt_ASC"),
  
  CREATEDAT_DESC("createdAt_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  INTERNAL_ASC("internal_ASC"),
  
  INTERNAL_DESC("internal_DESC"),
  
  NAME_ASC("name_ASC"),
  
  NAME_DESC("name_DESC"),
  
  PLAN_ID_ASC("plan_id_ASC"),
  
  PLAN_ID_DESC("plan_id_DESC"),
  
  STATUS_ASC("status_ASC"),
  
  STATUS_DESC("status_DESC"),
  
  UPDATEDAT_ASC("updatedAt_ASC"),
  
  UPDATEDAT_DESC("updatedAt_DESC");

  private String value;

  ReportTaskOrderByInput(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportTaskOrderByInput fromValue(String value) {
    for (ReportTaskOrderByInput b : ReportTaskOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportTaskOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportTaskOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportTaskOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportTaskOrderByInput.fromValue(value);
    }
  }
}

