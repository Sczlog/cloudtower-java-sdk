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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ConsistencyGroupSnapshotCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConsistencyGroupSnapshotCreationParams {
  public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_ID = "consistency_group_id";
  @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_ID)
  private String consistencyGroupId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public ConsistencyGroupSnapshotCreationParams consistencyGroupId(String consistencyGroupId) {
    
    this.consistencyGroupId = consistencyGroupId;
    return this;
  }

   /**
   * Get consistencyGroupId
   * @return consistencyGroupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getConsistencyGroupId() {
    return consistencyGroupId;
  }


  public void setConsistencyGroupId(String consistencyGroupId) {
    this.consistencyGroupId = consistencyGroupId;
  }


  public ConsistencyGroupSnapshotCreationParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsistencyGroupSnapshotCreationParams consistencyGroupSnapshotCreationParams = (ConsistencyGroupSnapshotCreationParams) o;
    return Objects.equals(this.consistencyGroupId, consistencyGroupSnapshotCreationParams.consistencyGroupId) &&
        Objects.equals(this.name, consistencyGroupSnapshotCreationParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consistencyGroupId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsistencyGroupSnapshotCreationParams {\n");
    sb.append("    consistencyGroupId: ").append(toIndentedString(consistencyGroupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

