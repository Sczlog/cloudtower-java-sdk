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
 * VmAddDiskParamsDataVmDisks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:23:54.291904700+08:00[Asia/Shanghai]")
public class VmAddDiskParamsDataVmDisks {
  public static final String SERIALIZED_NAME_MOUNT_DISKS = "mount_disks";
  @SerializedName(SERIALIZED_NAME_MOUNT_DISKS)
  private List<Object> mountDisks = null;

  public static final String SERIALIZED_NAME_MOUNT_NEW_CREATE_DISKS = "mount_new_create_disks";
  @SerializedName(SERIALIZED_NAME_MOUNT_NEW_CREATE_DISKS)
  private List<Object> mountNewCreateDisks = null;


  public VmAddDiskParamsDataVmDisks mountDisks(List<Object> mountDisks) {
    
    this.mountDisks = mountDisks;
    return this;
  }

  public VmAddDiskParamsDataVmDisks addMountDisksItem(Object mountDisksItem) {
    if (this.mountDisks == null) {
      this.mountDisks = new ArrayList<Object>();
    }
    this.mountDisks.add(mountDisksItem);
    return this;
  }

   /**
   * Get mountDisks
   * @return mountDisks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getMountDisks() {
    return mountDisks;
  }


  public void setMountDisks(List<Object> mountDisks) {
    this.mountDisks = mountDisks;
  }


  public VmAddDiskParamsDataVmDisks mountNewCreateDisks(List<Object> mountNewCreateDisks) {
    
    this.mountNewCreateDisks = mountNewCreateDisks;
    return this;
  }

  public VmAddDiskParamsDataVmDisks addMountNewCreateDisksItem(Object mountNewCreateDisksItem) {
    if (this.mountNewCreateDisks == null) {
      this.mountNewCreateDisks = new ArrayList<Object>();
    }
    this.mountNewCreateDisks.add(mountNewCreateDisksItem);
    return this;
  }

   /**
   * Get mountNewCreateDisks
   * @return mountNewCreateDisks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getMountNewCreateDisks() {
    return mountNewCreateDisks;
  }


  public void setMountNewCreateDisks(List<Object> mountNewCreateDisks) {
    this.mountNewCreateDisks = mountNewCreateDisks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmAddDiskParamsDataVmDisks vmAddDiskParamsDataVmDisks = (VmAddDiskParamsDataVmDisks) o;
    return Objects.equals(this.mountDisks, vmAddDiskParamsDataVmDisks.mountDisks) &&
        Objects.equals(this.mountNewCreateDisks, vmAddDiskParamsDataVmDisks.mountNewCreateDisks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountDisks, mountNewCreateDisks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmAddDiskParamsDataVmDisks {\n");
    sb.append("    mountDisks: ").append(toIndentedString(mountDisks)).append("\n");
    sb.append("    mountNewCreateDisks: ").append(toIndentedString(mountNewCreateDisks)).append("\n");
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
