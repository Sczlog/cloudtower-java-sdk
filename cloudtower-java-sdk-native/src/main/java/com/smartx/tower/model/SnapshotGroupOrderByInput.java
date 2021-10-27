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
 * Gets or Sets SnapshotGroupOrderByInput
 */
public enum SnapshotGroupOrderByInput {
  
  CREATEDAT_ASC("createdAt_ASC"),
  
  CREATEDAT_DESC("createdAt_DESC"),
  
  DELETED_ASC("deleted_ASC"),
  
  DELETED_DESC("deleted_DESC"),
  
  ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),
  
  ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),
  
  ESTIMATED_RECYCLING_TIME_ASC("estimated_recycling_time_ASC"),
  
  ESTIMATED_RECYCLING_TIME_DESC("estimated_recycling_time_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  INTERNAL_ASC("internal_ASC"),
  
  INTERNAL_DESC("internal_DESC"),
  
  KEEP_ASC("keep_ASC"),
  
  KEEP_DESC("keep_DESC"),
  
  LOCAL_CREATED_AT_ASC("local_created_at_ASC"),
  
  LOCAL_CREATED_AT_DESC("local_created_at_DESC"),
  
  LOCAL_ID_ASC("local_id_ASC"),
  
  LOCAL_ID_DESC("local_id_DESC"),
  
  LOGICAL_SIZE_BYTES_ASC("logical_size_bytes_ASC"),
  
  LOGICAL_SIZE_BYTES_DESC("logical_size_bytes_DESC"),
  
  NAME_ASC("name_ASC"),
  
  NAME_DESC("name_DESC"),
  
  OBJECT_NUM_ASC("object_num_ASC"),
  
  OBJECT_NUM_DESC("object_num_DESC"),
  
  UPDATEDAT_ASC("updatedAt_ASC"),
  
  UPDATEDAT_DESC("updatedAt_DESC"),
  
  VM_INFO_ASC("vm_info_ASC"),
  
  VM_INFO_DESC("vm_info_DESC");

  private String value;

  SnapshotGroupOrderByInput(String value) {
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
  public static SnapshotGroupOrderByInput fromValue(String value) {
    for (SnapshotGroupOrderByInput b : SnapshotGroupOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

