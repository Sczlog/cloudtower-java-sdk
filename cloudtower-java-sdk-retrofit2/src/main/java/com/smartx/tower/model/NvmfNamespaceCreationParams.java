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
import com.smartx.tower.model.NvmfNamespaceCommonParams;
import com.smartx.tower.model.NvmfNamespaceCreationParamsAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NvmfNamespaceCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:23:54.291904700+08:00[Asia/Shanghai]")
public class NvmfNamespaceCreationParams {
  public static final String SERIALIZED_NAME_NAMESPACE_ID = "namespace_id";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_ID)
  private Double namespaceId;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_IS_SHARED = "is_shared";
  @SerializedName(SERIALIZED_NAME_IS_SHARED)
  private Boolean isShared;

  public static final String SERIALIZED_NAME_ASSIGNED_SIZE = "assigned_size";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE)
  private Double assignedSize;

  public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
  private Double replicaNum;

  public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM_ID = "nvmf_subsystem_id";
  @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM_ID)
  private String nvmfSubsystemId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH = "bps_wr_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH)
  private Double bpsWrMaxLength;

  public static final String SERIALIZED_NAME_BPS_WR_MAX = "bps_wr_max";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX)
  private Double bpsWrMax;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH = "bps_rd_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH)
  private Double bpsRdMaxLength;

  public static final String SERIALIZED_NAME_BPS_RD_MAX = "bps_rd_max";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX)
  private Double bpsRdMax;

  public static final String SERIALIZED_NAME_BPS_MAX_LENGTH = "bps_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH)
  private Double bpsMaxLength;

  public static final String SERIALIZED_NAME_BPS_MAX = "bps_max";
  @SerializedName(SERIALIZED_NAME_BPS_MAX)
  private Double bpsMax;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH = "iops_wr_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH)
  private Double iopsWrMaxLength;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX = "iops_wr_max";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX)
  private Double iopsWrMax;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH = "iops_rd_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH)
  private Double iopsRdMaxLength;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX = "iops_rd_max";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX)
  private Double iopsRdMax;

  public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH = "iops_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH)
  private Double iopsMaxLength;

  public static final String SERIALIZED_NAME_IOPS_MAX = "iops_max";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX)
  private Double iopsMax;

  public static final String SERIALIZED_NAME_BPS_WR = "bps_wr";
  @SerializedName(SERIALIZED_NAME_BPS_WR)
  private Double bpsWr;

  public static final String SERIALIZED_NAME_BPS_RD = "bps_rd";
  @SerializedName(SERIALIZED_NAME_BPS_RD)
  private Double bpsRd;

  public static final String SERIALIZED_NAME_BPS = "bps";
  @SerializedName(SERIALIZED_NAME_BPS)
  private Double bps;

  public static final String SERIALIZED_NAME_IOPS_WR = "iops_wr";
  @SerializedName(SERIALIZED_NAME_IOPS_WR)
  private Double iopsWr;

  public static final String SERIALIZED_NAME_IOPS_RD = "iops_rd";
  @SerializedName(SERIALIZED_NAME_IOPS_RD)
  private Double iopsRd;

  public static final String SERIALIZED_NAME_IOPS = "iops";
  @SerializedName(SERIALIZED_NAME_IOPS)
  private Double iops;

  public static final String SERIALIZED_NAME_NQN_WHITELIST = "nqn_whitelist";
  @SerializedName(SERIALIZED_NAME_NQN_WHITELIST)
  private String nqnWhitelist;


  public NvmfNamespaceCreationParams namespaceId(Double namespaceId) {
    
    this.namespaceId = namespaceId;
    return this;
  }

   /**
   * Get namespaceId
   * @return namespaceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getNamespaceId() {
    return namespaceId;
  }


  public void setNamespaceId(Double namespaceId) {
    this.namespaceId = namespaceId;
  }


  public NvmfNamespaceCreationParams groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public NvmfNamespaceCreationParams isShared(Boolean isShared) {
    
    this.isShared = isShared;
    return this;
  }

   /**
   * Get isShared
   * @return isShared
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsShared() {
    return isShared;
  }


  public void setIsShared(Boolean isShared) {
    this.isShared = isShared;
  }


  public NvmfNamespaceCreationParams assignedSize(Double assignedSize) {
    
    this.assignedSize = assignedSize;
    return this;
  }

   /**
   * Get assignedSize
   * @return assignedSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getAssignedSize() {
    return assignedSize;
  }


  public void setAssignedSize(Double assignedSize) {
    this.assignedSize = assignedSize;
  }


  public NvmfNamespaceCreationParams replicaNum(Double replicaNum) {
    
    this.replicaNum = replicaNum;
    return this;
  }

   /**
   * Get replicaNum
   * @return replicaNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getReplicaNum() {
    return replicaNum;
  }


  public void setReplicaNum(Double replicaNum) {
    this.replicaNum = replicaNum;
  }


  public NvmfNamespaceCreationParams nvmfSubsystemId(String nvmfSubsystemId) {
    
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


  public NvmfNamespaceCreationParams name(String name) {
    
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


  public NvmfNamespaceCreationParams bpsWrMaxLength(Double bpsWrMaxLength) {
    
    this.bpsWrMaxLength = bpsWrMaxLength;
    return this;
  }

   /**
   * Get bpsWrMaxLength
   * @return bpsWrMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsWrMaxLength() {
    return bpsWrMaxLength;
  }


  public void setBpsWrMaxLength(Double bpsWrMaxLength) {
    this.bpsWrMaxLength = bpsWrMaxLength;
  }


  public NvmfNamespaceCreationParams bpsWrMax(Double bpsWrMax) {
    
    this.bpsWrMax = bpsWrMax;
    return this;
  }

   /**
   * Get bpsWrMax
   * @return bpsWrMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsWrMax() {
    return bpsWrMax;
  }


  public void setBpsWrMax(Double bpsWrMax) {
    this.bpsWrMax = bpsWrMax;
  }


  public NvmfNamespaceCreationParams bpsRdMaxLength(Double bpsRdMaxLength) {
    
    this.bpsRdMaxLength = bpsRdMaxLength;
    return this;
  }

   /**
   * Get bpsRdMaxLength
   * @return bpsRdMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsRdMaxLength() {
    return bpsRdMaxLength;
  }


  public void setBpsRdMaxLength(Double bpsRdMaxLength) {
    this.bpsRdMaxLength = bpsRdMaxLength;
  }


  public NvmfNamespaceCreationParams bpsRdMax(Double bpsRdMax) {
    
    this.bpsRdMax = bpsRdMax;
    return this;
  }

   /**
   * Get bpsRdMax
   * @return bpsRdMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsRdMax() {
    return bpsRdMax;
  }


  public void setBpsRdMax(Double bpsRdMax) {
    this.bpsRdMax = bpsRdMax;
  }


  public NvmfNamespaceCreationParams bpsMaxLength(Double bpsMaxLength) {
    
    this.bpsMaxLength = bpsMaxLength;
    return this;
  }

   /**
   * Get bpsMaxLength
   * @return bpsMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsMaxLength() {
    return bpsMaxLength;
  }


  public void setBpsMaxLength(Double bpsMaxLength) {
    this.bpsMaxLength = bpsMaxLength;
  }


  public NvmfNamespaceCreationParams bpsMax(Double bpsMax) {
    
    this.bpsMax = bpsMax;
    return this;
  }

   /**
   * Get bpsMax
   * @return bpsMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsMax() {
    return bpsMax;
  }


  public void setBpsMax(Double bpsMax) {
    this.bpsMax = bpsMax;
  }


  public NvmfNamespaceCreationParams iopsWrMaxLength(Double iopsWrMaxLength) {
    
    this.iopsWrMaxLength = iopsWrMaxLength;
    return this;
  }

   /**
   * Get iopsWrMaxLength
   * @return iopsWrMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsWrMaxLength() {
    return iopsWrMaxLength;
  }


  public void setIopsWrMaxLength(Double iopsWrMaxLength) {
    this.iopsWrMaxLength = iopsWrMaxLength;
  }


  public NvmfNamespaceCreationParams iopsWrMax(Double iopsWrMax) {
    
    this.iopsWrMax = iopsWrMax;
    return this;
  }

   /**
   * Get iopsWrMax
   * @return iopsWrMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsWrMax() {
    return iopsWrMax;
  }


  public void setIopsWrMax(Double iopsWrMax) {
    this.iopsWrMax = iopsWrMax;
  }


  public NvmfNamespaceCreationParams iopsRdMaxLength(Double iopsRdMaxLength) {
    
    this.iopsRdMaxLength = iopsRdMaxLength;
    return this;
  }

   /**
   * Get iopsRdMaxLength
   * @return iopsRdMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsRdMaxLength() {
    return iopsRdMaxLength;
  }


  public void setIopsRdMaxLength(Double iopsRdMaxLength) {
    this.iopsRdMaxLength = iopsRdMaxLength;
  }


  public NvmfNamespaceCreationParams iopsRdMax(Double iopsRdMax) {
    
    this.iopsRdMax = iopsRdMax;
    return this;
  }

   /**
   * Get iopsRdMax
   * @return iopsRdMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsRdMax() {
    return iopsRdMax;
  }


  public void setIopsRdMax(Double iopsRdMax) {
    this.iopsRdMax = iopsRdMax;
  }


  public NvmfNamespaceCreationParams iopsMaxLength(Double iopsMaxLength) {
    
    this.iopsMaxLength = iopsMaxLength;
    return this;
  }

   /**
   * Get iopsMaxLength
   * @return iopsMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsMaxLength() {
    return iopsMaxLength;
  }


  public void setIopsMaxLength(Double iopsMaxLength) {
    this.iopsMaxLength = iopsMaxLength;
  }


  public NvmfNamespaceCreationParams iopsMax(Double iopsMax) {
    
    this.iopsMax = iopsMax;
    return this;
  }

   /**
   * Get iopsMax
   * @return iopsMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsMax() {
    return iopsMax;
  }


  public void setIopsMax(Double iopsMax) {
    this.iopsMax = iopsMax;
  }


  public NvmfNamespaceCreationParams bpsWr(Double bpsWr) {
    
    this.bpsWr = bpsWr;
    return this;
  }

   /**
   * Get bpsWr
   * @return bpsWr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsWr() {
    return bpsWr;
  }


  public void setBpsWr(Double bpsWr) {
    this.bpsWr = bpsWr;
  }


  public NvmfNamespaceCreationParams bpsRd(Double bpsRd) {
    
    this.bpsRd = bpsRd;
    return this;
  }

   /**
   * Get bpsRd
   * @return bpsRd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsRd() {
    return bpsRd;
  }


  public void setBpsRd(Double bpsRd) {
    this.bpsRd = bpsRd;
  }


  public NvmfNamespaceCreationParams bps(Double bps) {
    
    this.bps = bps;
    return this;
  }

   /**
   * Get bps
   * @return bps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBps() {
    return bps;
  }


  public void setBps(Double bps) {
    this.bps = bps;
  }


  public NvmfNamespaceCreationParams iopsWr(Double iopsWr) {
    
    this.iopsWr = iopsWr;
    return this;
  }

   /**
   * Get iopsWr
   * @return iopsWr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsWr() {
    return iopsWr;
  }


  public void setIopsWr(Double iopsWr) {
    this.iopsWr = iopsWr;
  }


  public NvmfNamespaceCreationParams iopsRd(Double iopsRd) {
    
    this.iopsRd = iopsRd;
    return this;
  }

   /**
   * Get iopsRd
   * @return iopsRd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsRd() {
    return iopsRd;
  }


  public void setIopsRd(Double iopsRd) {
    this.iopsRd = iopsRd;
  }


  public NvmfNamespaceCreationParams iops(Double iops) {
    
    this.iops = iops;
    return this;
  }

   /**
   * Get iops
   * @return iops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIops() {
    return iops;
  }


  public void setIops(Double iops) {
    this.iops = iops;
  }


  public NvmfNamespaceCreationParams nqnWhitelist(String nqnWhitelist) {
    
    this.nqnWhitelist = nqnWhitelist;
    return this;
  }

   /**
   * Get nqnWhitelist
   * @return nqnWhitelist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNqnWhitelist() {
    return nqnWhitelist;
  }


  public void setNqnWhitelist(String nqnWhitelist) {
    this.nqnWhitelist = nqnWhitelist;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NvmfNamespaceCreationParams nvmfNamespaceCreationParams = (NvmfNamespaceCreationParams) o;
    return Objects.equals(this.namespaceId, nvmfNamespaceCreationParams.namespaceId) &&
        Objects.equals(this.groupId, nvmfNamespaceCreationParams.groupId) &&
        Objects.equals(this.isShared, nvmfNamespaceCreationParams.isShared) &&
        Objects.equals(this.assignedSize, nvmfNamespaceCreationParams.assignedSize) &&
        Objects.equals(this.replicaNum, nvmfNamespaceCreationParams.replicaNum) &&
        Objects.equals(this.nvmfSubsystemId, nvmfNamespaceCreationParams.nvmfSubsystemId) &&
        Objects.equals(this.name, nvmfNamespaceCreationParams.name) &&
        Objects.equals(this.bpsWrMaxLength, nvmfNamespaceCreationParams.bpsWrMaxLength) &&
        Objects.equals(this.bpsWrMax, nvmfNamespaceCreationParams.bpsWrMax) &&
        Objects.equals(this.bpsRdMaxLength, nvmfNamespaceCreationParams.bpsRdMaxLength) &&
        Objects.equals(this.bpsRdMax, nvmfNamespaceCreationParams.bpsRdMax) &&
        Objects.equals(this.bpsMaxLength, nvmfNamespaceCreationParams.bpsMaxLength) &&
        Objects.equals(this.bpsMax, nvmfNamespaceCreationParams.bpsMax) &&
        Objects.equals(this.iopsWrMaxLength, nvmfNamespaceCreationParams.iopsWrMaxLength) &&
        Objects.equals(this.iopsWrMax, nvmfNamespaceCreationParams.iopsWrMax) &&
        Objects.equals(this.iopsRdMaxLength, nvmfNamespaceCreationParams.iopsRdMaxLength) &&
        Objects.equals(this.iopsRdMax, nvmfNamespaceCreationParams.iopsRdMax) &&
        Objects.equals(this.iopsMaxLength, nvmfNamespaceCreationParams.iopsMaxLength) &&
        Objects.equals(this.iopsMax, nvmfNamespaceCreationParams.iopsMax) &&
        Objects.equals(this.bpsWr, nvmfNamespaceCreationParams.bpsWr) &&
        Objects.equals(this.bpsRd, nvmfNamespaceCreationParams.bpsRd) &&
        Objects.equals(this.bps, nvmfNamespaceCreationParams.bps) &&
        Objects.equals(this.iopsWr, nvmfNamespaceCreationParams.iopsWr) &&
        Objects.equals(this.iopsRd, nvmfNamespaceCreationParams.iopsRd) &&
        Objects.equals(this.iops, nvmfNamespaceCreationParams.iops) &&
        Objects.equals(this.nqnWhitelist, nvmfNamespaceCreationParams.nqnWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespaceId, groupId, isShared, assignedSize, replicaNum, nvmfSubsystemId, name, bpsWrMaxLength, bpsWrMax, bpsRdMaxLength, bpsRdMax, bpsMaxLength, bpsMax, iopsWrMaxLength, iopsWrMax, iopsRdMaxLength, iopsRdMax, iopsMaxLength, iopsMax, bpsWr, bpsRd, bps, iopsWr, iopsRd, iops, nqnWhitelist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NvmfNamespaceCreationParams {\n");
    sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
    sb.append("    assignedSize: ").append(toIndentedString(assignedSize)).append("\n");
    sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
    sb.append("    nvmfSubsystemId: ").append(toIndentedString(nvmfSubsystemId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bpsWrMaxLength: ").append(toIndentedString(bpsWrMaxLength)).append("\n");
    sb.append("    bpsWrMax: ").append(toIndentedString(bpsWrMax)).append("\n");
    sb.append("    bpsRdMaxLength: ").append(toIndentedString(bpsRdMaxLength)).append("\n");
    sb.append("    bpsRdMax: ").append(toIndentedString(bpsRdMax)).append("\n");
    sb.append("    bpsMaxLength: ").append(toIndentedString(bpsMaxLength)).append("\n");
    sb.append("    bpsMax: ").append(toIndentedString(bpsMax)).append("\n");
    sb.append("    iopsWrMaxLength: ").append(toIndentedString(iopsWrMaxLength)).append("\n");
    sb.append("    iopsWrMax: ").append(toIndentedString(iopsWrMax)).append("\n");
    sb.append("    iopsRdMaxLength: ").append(toIndentedString(iopsRdMaxLength)).append("\n");
    sb.append("    iopsRdMax: ").append(toIndentedString(iopsRdMax)).append("\n");
    sb.append("    iopsMaxLength: ").append(toIndentedString(iopsMaxLength)).append("\n");
    sb.append("    iopsMax: ").append(toIndentedString(iopsMax)).append("\n");
    sb.append("    bpsWr: ").append(toIndentedString(bpsWr)).append("\n");
    sb.append("    bpsRd: ").append(toIndentedString(bpsRd)).append("\n");
    sb.append("    bps: ").append(toIndentedString(bps)).append("\n");
    sb.append("    iopsWr: ").append(toIndentedString(iopsWr)).append("\n");
    sb.append("    iopsRd: ").append(toIndentedString(iopsRd)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    nqnWhitelist: ").append(toIndentedString(nqnWhitelist)).append("\n");
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

