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
import com.smartx.tower.model.ProtectSnapshotStatus;
import com.smartx.tower.model.SnapshotGroupDisks;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SnapshotGroupVmInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:23:12.632307300+08:00[Asia/Shanghai]")
public class SnapshotGroupVmInfo {
  public static final String SERIALIZED_NAME_VM_SNAPSHOT_STATUS = "vm_snapshot_status";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_STATUS)
  private ProtectSnapshotStatus vmSnapshotStatus;

  public static final String SERIALIZED_NAME_VM_NAME = "vm_name";
  @SerializedName(SERIALIZED_NAME_VM_NAME)
  private String vmName;

  public static final String SERIALIZED_NAME_VM_ID = "vm_id";
  @SerializedName(SERIALIZED_NAME_VM_ID)
  private String vmId;

  public static final String SERIALIZED_NAME_DISKS = "disks";
  @SerializedName(SERIALIZED_NAME_DISKS)
  private List<SnapshotGroupDisks> disks = new ArrayList<SnapshotGroupDisks>();


  public SnapshotGroupVmInfo vmSnapshotStatus(ProtectSnapshotStatus vmSnapshotStatus) {
    
    this.vmSnapshotStatus = vmSnapshotStatus;
    return this;
  }

   /**
   * Get vmSnapshotStatus
   * @return vmSnapshotStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProtectSnapshotStatus getVmSnapshotStatus() {
    return vmSnapshotStatus;
  }


  public void setVmSnapshotStatus(ProtectSnapshotStatus vmSnapshotStatus) {
    this.vmSnapshotStatus = vmSnapshotStatus;
  }


  public SnapshotGroupVmInfo vmName(String vmName) {
    
    this.vmName = vmName;
    return this;
  }

   /**
   * Get vmName
   * @return vmName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVmName() {
    return vmName;
  }


  public void setVmName(String vmName) {
    this.vmName = vmName;
  }


  public SnapshotGroupVmInfo vmId(String vmId) {
    
    this.vmId = vmId;
    return this;
  }

   /**
   * Get vmId
   * @return vmId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVmId() {
    return vmId;
  }


  public void setVmId(String vmId) {
    this.vmId = vmId;
  }


  public SnapshotGroupVmInfo disks(List<SnapshotGroupDisks> disks) {
    
    this.disks = disks;
    return this;
  }

  public SnapshotGroupVmInfo addDisksItem(SnapshotGroupDisks disksItem) {
    this.disks.add(disksItem);
    return this;
  }

   /**
   * Get disks
   * @return disks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<SnapshotGroupDisks> getDisks() {
    return disks;
  }


  public void setDisks(List<SnapshotGroupDisks> disks) {
    this.disks = disks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotGroupVmInfo snapshotGroupVmInfo = (SnapshotGroupVmInfo) o;
    return Objects.equals(this.vmSnapshotStatus, snapshotGroupVmInfo.vmSnapshotStatus) &&
        Objects.equals(this.vmName, snapshotGroupVmInfo.vmName) &&
        Objects.equals(this.vmId, snapshotGroupVmInfo.vmId) &&
        Objects.equals(this.disks, snapshotGroupVmInfo.disks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmSnapshotStatus, vmName, vmId, disks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotGroupVmInfo {\n");
    sb.append("    vmSnapshotStatus: ").append(toIndentedString(vmSnapshotStatus)).append("\n");
    sb.append("    vmName: ").append(toIndentedString(vmName)).append("\n");
    sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
    sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
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
