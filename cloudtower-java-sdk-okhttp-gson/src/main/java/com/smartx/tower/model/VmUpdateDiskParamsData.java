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
import com.smartx.tower.model.Bus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VmUpdateDiskParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T16:05:01.910402800+08:00[Asia/Shanghai]")
public class VmUpdateDiskParamsData {
  public static final String SERIALIZED_NAME_ELF_IMAGE_ID = "elf_image_id";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGE_ID)
  private String elfImageId;

  public static final String SERIALIZED_NAME_VM_VOLUME_ID = "vm_volume_id";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_ID)
  private String vmVolumeId;

  public static final String SERIALIZED_NAME_VM_DISK_ID = "vm_disk_id";
  @SerializedName(SERIALIZED_NAME_VM_DISK_ID)
  private String vmDiskId;

  public static final String SERIALIZED_NAME_BUS = "bus";
  @SerializedName(SERIALIZED_NAME_BUS)
  private Bus bus;


  public VmUpdateDiskParamsData elfImageId(String elfImageId) {
    
    this.elfImageId = elfImageId;
    return this;
  }

   /**
   * Get elfImageId
   * @return elfImageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getElfImageId() {
    return elfImageId;
  }


  public void setElfImageId(String elfImageId) {
    this.elfImageId = elfImageId;
  }


  public VmUpdateDiskParamsData vmVolumeId(String vmVolumeId) {
    
    this.vmVolumeId = vmVolumeId;
    return this;
  }

   /**
   * Get vmVolumeId
   * @return vmVolumeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmVolumeId() {
    return vmVolumeId;
  }


  public void setVmVolumeId(String vmVolumeId) {
    this.vmVolumeId = vmVolumeId;
  }


  public VmUpdateDiskParamsData vmDiskId(String vmDiskId) {
    
    this.vmDiskId = vmDiskId;
    return this;
  }

   /**
   * Get vmDiskId
   * @return vmDiskId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVmDiskId() {
    return vmDiskId;
  }


  public void setVmDiskId(String vmDiskId) {
    this.vmDiskId = vmDiskId;
  }


  public VmUpdateDiskParamsData bus(Bus bus) {
    
    this.bus = bus;
    return this;
  }

   /**
   * Get bus
   * @return bus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Bus getBus() {
    return bus;
  }


  public void setBus(Bus bus) {
    this.bus = bus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmUpdateDiskParamsData vmUpdateDiskParamsData = (VmUpdateDiskParamsData) o;
    return Objects.equals(this.elfImageId, vmUpdateDiskParamsData.elfImageId) &&
        Objects.equals(this.vmVolumeId, vmUpdateDiskParamsData.vmVolumeId) &&
        Objects.equals(this.vmDiskId, vmUpdateDiskParamsData.vmDiskId) &&
        Objects.equals(this.bus, vmUpdateDiskParamsData.bus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(elfImageId, vmVolumeId, vmDiskId, bus);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmUpdateDiskParamsData {\n");
    sb.append("    elfImageId: ").append(toIndentedString(elfImageId)).append("\n");
    sb.append("    vmVolumeId: ").append(toIndentedString(vmVolumeId)).append("\n");
    sb.append("    vmDiskId: ").append(toIndentedString(vmDiskId)).append("\n");
    sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
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

