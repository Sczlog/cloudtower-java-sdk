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
import com.smartx.tower.model.VmDiskIoPolicy;
import com.smartx.tower.model.VmDiskIoRestrictType;
import com.smartx.tower.model.VmDiskParams;
import com.smartx.tower.model.VmFirmware;
import com.smartx.tower.model.VmGuestsOperationSystem;
import com.smartx.tower.model.VmStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * VmCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VmCreationParams {
  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY = "max_bandwidth_policy";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY)
  private VmDiskIoRestrictType maxBandwidthPolicy;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH = "max_bandwidth";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH)
  private Double maxBandwidth;

  public static final String SERIALIZED_NAME_MAX_IOPS_POLICY = "max_iops_policy";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY)
  private VmDiskIoRestrictType maxIopsPolicy;

  public static final String SERIALIZED_NAME_MAX_IOPS = "max_iops";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS)
  private Integer maxIops;

  public static final String SERIALIZED_NAME_IO_POLICY = "io_policy";
  @SerializedName(SERIALIZED_NAME_IO_POLICY)
  private VmDiskIoPolicy ioPolicy;

  public static final String SERIALIZED_NAME_VCPU = "vcpu";
  @SerializedName(SERIALIZED_NAME_VCPU)
  private Integer vcpu;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private VmStatus status;

  public static final String SERIALIZED_NAME_FIRMWARE = "firmware";
  @SerializedName(SERIALIZED_NAME_FIRMWARE)
  private VmFirmware firmware;

  public static final String SERIALIZED_NAME_HA = "ha";
  @SerializedName(SERIALIZED_NAME_HA)
  private Boolean ha;

  public static final String SERIALIZED_NAME_VM_NICS = "vm_nics";
  @SerializedName(SERIALIZED_NAME_VM_NICS)
  private List<VmNicParams> vmNics = new ArrayList<VmNicParams>();

  public static final String SERIALIZED_NAME_VM_DISKS = "vm_disks";
  @SerializedName(SERIALIZED_NAME_VM_DISKS)
  private VmDiskParams vmDisks;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Double memory;

  public static final String SERIALIZED_NAME_CPU_CORES = "cpu_cores";
  @SerializedName(SERIALIZED_NAME_CPU_CORES)
  private Integer cpuCores;

  public static final String SERIALIZED_NAME_CPU_SOCKETS = "cpu_sockets";
  @SerializedName(SERIALIZED_NAME_CPU_SOCKETS)
  private Integer cpuSockets;

  public static final String SERIALIZED_NAME_GUEST_OS_TYPE = "guest_os_type";
  @SerializedName(SERIALIZED_NAME_GUEST_OS_TYPE)
  private VmGuestsOperationSystem guestOsType;

  public static final String SERIALIZED_NAME_FOLDER_ID = "folder_id";
  @SerializedName(SERIALIZED_NAME_FOLDER_ID)
  private String folderId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_HOST_ID = "host_id";
  @SerializedName(SERIALIZED_NAME_HOST_ID)
  private String hostId;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;


  public VmCreationParams maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    
    this.maxBandwidthPolicy = maxBandwidthPolicy;
    return this;
  }

   /**
   * Get maxBandwidthPolicy
   * @return maxBandwidthPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskIoRestrictType getMaxBandwidthPolicy() {
    return maxBandwidthPolicy;
  }


  public void setMaxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    this.maxBandwidthPolicy = maxBandwidthPolicy;
  }


  public VmCreationParams maxBandwidth(Double maxBandwidth) {
    
    this.maxBandwidth = maxBandwidth;
    return this;
  }

   /**
   * Get maxBandwidth
   * @return maxBandwidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMaxBandwidth() {
    return maxBandwidth;
  }


  public void setMaxBandwidth(Double maxBandwidth) {
    this.maxBandwidth = maxBandwidth;
  }


  public VmCreationParams maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
    
    this.maxIopsPolicy = maxIopsPolicy;
    return this;
  }

   /**
   * Get maxIopsPolicy
   * @return maxIopsPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskIoRestrictType getMaxIopsPolicy() {
    return maxIopsPolicy;
  }


  public void setMaxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
    this.maxIopsPolicy = maxIopsPolicy;
  }


  public VmCreationParams maxIops(Integer maxIops) {
    
    this.maxIops = maxIops;
    return this;
  }

   /**
   * Get maxIops
   * @return maxIops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxIops() {
    return maxIops;
  }


  public void setMaxIops(Integer maxIops) {
    this.maxIops = maxIops;
  }


  public VmCreationParams ioPolicy(VmDiskIoPolicy ioPolicy) {
    
    this.ioPolicy = ioPolicy;
    return this;
  }

   /**
   * Get ioPolicy
   * @return ioPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskIoPolicy getIoPolicy() {
    return ioPolicy;
  }


  public void setIoPolicy(VmDiskIoPolicy ioPolicy) {
    this.ioPolicy = ioPolicy;
  }


  public VmCreationParams vcpu(Integer vcpu) {
    
    this.vcpu = vcpu;
    return this;
  }

   /**
   * Get vcpu
   * @return vcpu
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getVcpu() {
    return vcpu;
  }


  public void setVcpu(Integer vcpu) {
    this.vcpu = vcpu;
  }


  public VmCreationParams status(VmStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmStatus getStatus() {
    return status;
  }


  public void setStatus(VmStatus status) {
    this.status = status;
  }


  public VmCreationParams firmware(VmFirmware firmware) {
    
    this.firmware = firmware;
    return this;
  }

   /**
   * Get firmware
   * @return firmware
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmFirmware getFirmware() {
    return firmware;
  }


  public void setFirmware(VmFirmware firmware) {
    this.firmware = firmware;
  }


  public VmCreationParams ha(Boolean ha) {
    
    this.ha = ha;
    return this;
  }

   /**
   * Get ha
   * @return ha
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getHa() {
    return ha;
  }


  public void setHa(Boolean ha) {
    this.ha = ha;
  }


  public VmCreationParams vmNics(List<VmNicParams> vmNics) {
    
    this.vmNics = vmNics;
    return this;
  }

  public VmCreationParams addVmNicsItem(VmNicParams vmNicsItem) {
    this.vmNics.add(vmNicsItem);
    return this;
  }

   /**
   * Get vmNics
   * @return vmNics
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<VmNicParams> getVmNics() {
    return vmNics;
  }


  public void setVmNics(List<VmNicParams> vmNics) {
    this.vmNics = vmNics;
  }


  public VmCreationParams vmDisks(VmDiskParams vmDisks) {
    
    this.vmDisks = vmDisks;
    return this;
  }

   /**
   * Get vmDisks
   * @return vmDisks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmDiskParams getVmDisks() {
    return vmDisks;
  }


  public void setVmDisks(VmDiskParams vmDisks) {
    this.vmDisks = vmDisks;
  }


  public VmCreationParams memory(Double memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getMemory() {
    return memory;
  }


  public void setMemory(Double memory) {
    this.memory = memory;
  }


  public VmCreationParams cpuCores(Integer cpuCores) {
    
    this.cpuCores = cpuCores;
    return this;
  }

   /**
   * Get cpuCores
   * @return cpuCores
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCpuCores() {
    return cpuCores;
  }


  public void setCpuCores(Integer cpuCores) {
    this.cpuCores = cpuCores;
  }


  public VmCreationParams cpuSockets(Integer cpuSockets) {
    
    this.cpuSockets = cpuSockets;
    return this;
  }

   /**
   * Get cpuSockets
   * @return cpuSockets
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCpuSockets() {
    return cpuSockets;
  }


  public void setCpuSockets(Integer cpuSockets) {
    this.cpuSockets = cpuSockets;
  }


  public VmCreationParams guestOsType(VmGuestsOperationSystem guestOsType) {
    
    this.guestOsType = guestOsType;
    return this;
  }

   /**
   * Get guestOsType
   * @return guestOsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmGuestsOperationSystem getGuestOsType() {
    return guestOsType;
  }


  public void setGuestOsType(VmGuestsOperationSystem guestOsType) {
    this.guestOsType = guestOsType;
  }


  public VmCreationParams folderId(String folderId) {
    
    this.folderId = folderId;
    return this;
  }

   /**
   * Get folderId
   * @return folderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFolderId() {
    return folderId;
  }


  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }


  public VmCreationParams description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public VmCreationParams name(String name) {
    
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


  public VmCreationParams hostId(String hostId) {
    
    this.hostId = hostId;
    return this;
  }

   /**
   * Get hostId
   * @return hostId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostId() {
    return hostId;
  }


  public void setHostId(String hostId) {
    this.hostId = hostId;
  }


  public VmCreationParams clusterId(String clusterId) {
    
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getClusterId() {
    return clusterId;
  }


  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmCreationParams vmCreationParams = (VmCreationParams) o;
    return Objects.equals(this.maxBandwidthPolicy, vmCreationParams.maxBandwidthPolicy) &&
        Objects.equals(this.maxBandwidth, vmCreationParams.maxBandwidth) &&
        Objects.equals(this.maxIopsPolicy, vmCreationParams.maxIopsPolicy) &&
        Objects.equals(this.maxIops, vmCreationParams.maxIops) &&
        Objects.equals(this.ioPolicy, vmCreationParams.ioPolicy) &&
        Objects.equals(this.vcpu, vmCreationParams.vcpu) &&
        Objects.equals(this.status, vmCreationParams.status) &&
        Objects.equals(this.firmware, vmCreationParams.firmware) &&
        Objects.equals(this.ha, vmCreationParams.ha) &&
        Objects.equals(this.vmNics, vmCreationParams.vmNics) &&
        Objects.equals(this.vmDisks, vmCreationParams.vmDisks) &&
        Objects.equals(this.memory, vmCreationParams.memory) &&
        Objects.equals(this.cpuCores, vmCreationParams.cpuCores) &&
        Objects.equals(this.cpuSockets, vmCreationParams.cpuSockets) &&
        Objects.equals(this.guestOsType, vmCreationParams.guestOsType) &&
        Objects.equals(this.folderId, vmCreationParams.folderId) &&
        Objects.equals(this.description, vmCreationParams.description) &&
        Objects.equals(this.name, vmCreationParams.name) &&
        Objects.equals(this.hostId, vmCreationParams.hostId) &&
        Objects.equals(this.clusterId, vmCreationParams.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxBandwidthPolicy, maxBandwidth, maxIopsPolicy, maxIops, ioPolicy, vcpu, status, firmware, ha, vmNics, vmDisks, memory, cpuCores, cpuSockets, guestOsType, folderId, description, name, hostId, clusterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmCreationParams {\n");
    sb.append("    maxBandwidthPolicy: ").append(toIndentedString(maxBandwidthPolicy)).append("\n");
    sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
    sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
    sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
    sb.append("    ioPolicy: ").append(toIndentedString(ioPolicy)).append("\n");
    sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
    sb.append("    vmNics: ").append(toIndentedString(vmNics)).append("\n");
    sb.append("    vmDisks: ").append(toIndentedString(vmDisks)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
    sb.append("    cpuSockets: ").append(toIndentedString(cpuSockets)).append("\n");
    sb.append("    guestOsType: ").append(toIndentedString(guestOsType)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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

