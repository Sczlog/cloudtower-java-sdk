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
 * Gets or Sets GraphOrderByInput
 */
public enum GraphOrderByInput {
  
  CREATEDAT_ASC("createdAt_ASC"),
  
  CREATEDAT_DESC("createdAt_DESC"),
  
  ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),
  
  ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  LOCAL_ID_ASC("local_id_ASC"),
  
  LOCAL_ID_DESC("local_id_DESC"),
  
  METRIC_COUNT_ASC("metric_count_ASC"),
  
  METRIC_COUNT_DESC("metric_count_DESC"),
  
  METRIC_NAME_ASC("metric_name_ASC"),
  
  METRIC_NAME_DESC("metric_name_DESC"),
  
  METRIC_TYPE_ASC("metric_type_ASC"),
  
  METRIC_TYPE_DESC("metric_type_DESC"),
  
  NETWORK_ASC("network_ASC"),
  
  NETWORK_DESC("network_DESC"),
  
  RESOURCE_TYPE_ASC("resource_type_ASC"),
  
  RESOURCE_TYPE_DESC("resource_type_DESC"),
  
  SERVICE_ASC("service_ASC"),
  
  SERVICE_DESC("service_DESC"),
  
  TARGETS_ASC("targets_ASC"),
  
  TARGETS_DESC("targets_DESC"),
  
  TITLE_ASC("title_ASC"),
  
  TITLE_DESC("title_DESC"),
  
  TYPE_ASC("type_ASC"),
  
  TYPE_DESC("type_DESC"),
  
  UPDATEDAT_ASC("updatedAt_ASC"),
  
  UPDATEDAT_DESC("updatedAt_DESC");

  private String value;

  GraphOrderByInput(String value) {
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
  public static GraphOrderByInput fromValue(String value) {
    for (GraphOrderByInput b : GraphOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

