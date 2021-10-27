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
import java.util.ArrayList;
import java.util.List;

/**
 * VmAddNicParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T16:05:01.910402800+08:00[Asia/Shanghai]")
public class VmAddNicParamsData {
  public static final String SERIALIZED_NAME_VM_NICS = "vm_nics";
  @SerializedName(SERIALIZED_NAME_VM_NICS)
  private List<Object> vmNics = new ArrayList<Object>();


  public VmAddNicParamsData vmNics(List<Object> vmNics) {
    
    this.vmNics = vmNics;
    return this;
  }

  public VmAddNicParamsData addVmNicsItem(Object vmNicsItem) {
    this.vmNics.add(vmNicsItem);
    return this;
  }

   /**
   * Get vmNics
   * @return vmNics
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getVmNics() {
    return vmNics;
  }


  public void setVmNics(List<Object> vmNics) {
    this.vmNics = vmNics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmAddNicParamsData vmAddNicParamsData = (VmAddNicParamsData) o;
    return Objects.equals(this.vmNics, vmAddNicParamsData.vmNics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmNics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmAddNicParamsData {\n");
    sb.append("    vmNics: ").append(toIndentedString(vmNics)).append("\n");
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

