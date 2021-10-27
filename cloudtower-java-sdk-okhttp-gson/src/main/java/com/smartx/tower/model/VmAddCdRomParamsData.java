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
 * VmAddCdRomParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T16:05:01.910402800+08:00[Asia/Shanghai]")
public class VmAddCdRomParamsData {
  public static final String SERIALIZED_NAME_VM_CD_ROMS = "vm_cd_roms";
  @SerializedName(SERIALIZED_NAME_VM_CD_ROMS)
  private List<Object> vmCdRoms = new ArrayList<Object>();


  public VmAddCdRomParamsData vmCdRoms(List<Object> vmCdRoms) {
    
    this.vmCdRoms = vmCdRoms;
    return this;
  }

  public VmAddCdRomParamsData addVmCdRomsItem(Object vmCdRomsItem) {
    this.vmCdRoms.add(vmCdRomsItem);
    return this;
  }

   /**
   * Get vmCdRoms
   * @return vmCdRoms
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getVmCdRoms() {
    return vmCdRoms;
  }


  public void setVmCdRoms(List<Object> vmCdRoms) {
    this.vmCdRoms = vmCdRoms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmAddCdRomParamsData vmAddCdRomParamsData = (VmAddCdRomParamsData) o;
    return Objects.equals(this.vmCdRoms, vmAddCdRomParamsData.vmCdRoms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmCdRoms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmAddCdRomParamsData {\n");
    sb.append("    vmCdRoms: ").append(toIndentedString(vmCdRoms)).append("\n");
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

