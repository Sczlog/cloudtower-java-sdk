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
 * Gets or Sets ClusterUpgradeHistoryOrderByInput
 */
@JsonAdapter(ClusterUpgradeHistoryOrderByInput.Adapter.class)
public enum ClusterUpgradeHistoryOrderByInput {
  
  CREATEDAT_ASC("createdAt_ASC"),
  
  CREATEDAT_DESC("createdAt_DESC"),
  
  DATE_ASC("date_ASC"),
  
  DATE_DESC("date_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  LOCAL_ID_ASC("local_id_ASC"),
  
  LOCAL_ID_DESC("local_id_DESC"),
  
  PROGRESS_ASC("progress_ASC"),
  
  PROGRESS_DESC("progress_DESC"),
  
  RESULT_ASC("result_ASC"),
  
  RESULT_DESC("result_DESC"),
  
  TASK_UUID_ASC("task_uuid_ASC"),
  
  TASK_UUID_DESC("task_uuid_DESC"),
  
  UPDATEDAT_ASC("updatedAt_ASC"),
  
  UPDATEDAT_DESC("updatedAt_DESC"),
  
  VERSION_ASC("version_ASC"),
  
  VERSION_DESC("version_DESC");

  private String value;

  ClusterUpgradeHistoryOrderByInput(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClusterUpgradeHistoryOrderByInput fromValue(String value) {
    for (ClusterUpgradeHistoryOrderByInput b : ClusterUpgradeHistoryOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClusterUpgradeHistoryOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClusterUpgradeHistoryOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClusterUpgradeHistoryOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClusterUpgradeHistoryOrderByInput.fromValue(value);
    }
  }
}

