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
 * IscsiLunSnapshotCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T16:05:01.910402800+08:00[Asia/Shanghai]")
public class IscsiLunSnapshotCreationParams {
  public static final String SERIALIZED_NAME_ISCSI_TARGET_ID = "iscsi_target_id";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_ID)
  private String iscsiTargetId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ISCSI_LUN_ID = "iscsi_lun_id";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID)
  private String iscsiLunId;


  public IscsiLunSnapshotCreationParams iscsiTargetId(String iscsiTargetId) {
    
    this.iscsiTargetId = iscsiTargetId;
    return this;
  }

   /**
   * Get iscsiTargetId
   * @return iscsiTargetId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIscsiTargetId() {
    return iscsiTargetId;
  }


  public void setIscsiTargetId(String iscsiTargetId) {
    this.iscsiTargetId = iscsiTargetId;
  }


  public IscsiLunSnapshotCreationParams name(String name) {
    
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


  public IscsiLunSnapshotCreationParams iscsiLunId(String iscsiLunId) {
    
    this.iscsiLunId = iscsiLunId;
    return this;
  }

   /**
   * Get iscsiLunId
   * @return iscsiLunId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIscsiLunId() {
    return iscsiLunId;
  }


  public void setIscsiLunId(String iscsiLunId) {
    this.iscsiLunId = iscsiLunId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiLunSnapshotCreationParams iscsiLunSnapshotCreationParams = (IscsiLunSnapshotCreationParams) o;
    return Objects.equals(this.iscsiTargetId, iscsiLunSnapshotCreationParams.iscsiTargetId) &&
        Objects.equals(this.name, iscsiLunSnapshotCreationParams.name) &&
        Objects.equals(this.iscsiLunId, iscsiLunSnapshotCreationParams.iscsiLunId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iscsiTargetId, name, iscsiLunId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiLunSnapshotCreationParams {\n");
    sb.append("    iscsiTargetId: ").append(toIndentedString(iscsiTargetId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    iscsiLunId: ").append(toIndentedString(iscsiLunId)).append("\n");
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

