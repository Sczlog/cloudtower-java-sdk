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
 * NamespaceGroupCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:23:54.291904700+08:00[Asia/Shanghai]")
public class NamespaceGroupCreationParams {
  public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM_ID = "nvmf_subsystem_id";
  @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM_ID)
  private String nvmfSubsystemId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public NamespaceGroupCreationParams nvmfSubsystemId(String nvmfSubsystemId) {
    
    this.nvmfSubsystemId = nvmfSubsystemId;
    return this;
  }

   /**
   * Get nvmfSubsystemId
   * @return nvmfSubsystemId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNvmfSubsystemId() {
    return nvmfSubsystemId;
  }


  public void setNvmfSubsystemId(String nvmfSubsystemId) {
    this.nvmfSubsystemId = nvmfSubsystemId;
  }


  public NamespaceGroupCreationParams name(String name) {
    
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
    NamespaceGroupCreationParams namespaceGroupCreationParams = (NamespaceGroupCreationParams) o;
    return Objects.equals(this.nvmfSubsystemId, namespaceGroupCreationParams.nvmfSubsystemId) &&
        Objects.equals(this.name, namespaceGroupCreationParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nvmfSubsystemId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamespaceGroupCreationParams {\n");
    sb.append("    nvmfSubsystemId: ").append(toIndentedString(nvmfSubsystemId)).append("\n");
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

