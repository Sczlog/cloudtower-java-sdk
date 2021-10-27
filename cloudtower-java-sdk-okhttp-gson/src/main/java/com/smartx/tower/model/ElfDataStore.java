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
import com.smartx.tower.model.AlertDisk;
import com.smartx.tower.model.AlertRuleCluster;
import com.smartx.tower.model.ElfDataStoreType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ElfDataStore
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T16:05:01.910402800+08:00[Asia/Shanghai]")
public class ElfDataStore {
  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private AlertRuleCluster cluster;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXTERNAL_USE = "external_use";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_USE)
  private Boolean externalUse;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_IP_WHITELIST = "ip_whitelist";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST)
  private String ipWhitelist;

  public static final String SERIALIZED_NAME_ISCSI_TARGET = "iscsi_target";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET)
  private AlertDisk iscsiTarget;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NFS_EXPORT = "nfs_export";
  @SerializedName(SERIALIZED_NAME_NFS_EXPORT)
  private AlertDisk nfsExport;

  public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM = "nvmf_subsystem";
  @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM)
  private AlertDisk nvmfSubsystem;

  public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
  private Double replicaNum;

  public static final String SERIALIZED_NAME_THIN_PROVISION = "thin_provision";
  @SerializedName(SERIALIZED_NAME_THIN_PROVISION)
  private Boolean thinProvision;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ElfDataStoreType type;


  public ElfDataStore cluster(AlertRuleCluster cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AlertRuleCluster getCluster() {
    return cluster;
  }


  public void setCluster(AlertRuleCluster cluster) {
    this.cluster = cluster;
  }


  public ElfDataStore description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ElfDataStore externalUse(Boolean externalUse) {
    
    this.externalUse = externalUse;
    return this;
  }

   /**
   * Get externalUse
   * @return externalUse
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getExternalUse() {
    return externalUse;
  }


  public void setExternalUse(Boolean externalUse) {
    this.externalUse = externalUse;
  }


  public ElfDataStore id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ElfDataStore internal(Boolean internal) {
    
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getInternal() {
    return internal;
  }


  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public ElfDataStore ipWhitelist(String ipWhitelist) {
    
    this.ipWhitelist = ipWhitelist;
    return this;
  }

   /**
   * Get ipWhitelist
   * @return ipWhitelist
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIpWhitelist() {
    return ipWhitelist;
  }


  public void setIpWhitelist(String ipWhitelist) {
    this.ipWhitelist = ipWhitelist;
  }


  public ElfDataStore iscsiTarget(AlertDisk iscsiTarget) {
    
    this.iscsiTarget = iscsiTarget;
    return this;
  }

   /**
   * Get iscsiTarget
   * @return iscsiTarget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AlertDisk getIscsiTarget() {
    return iscsiTarget;
  }


  public void setIscsiTarget(AlertDisk iscsiTarget) {
    this.iscsiTarget = iscsiTarget;
  }


  public ElfDataStore localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public ElfDataStore name(String name) {
    
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


  public ElfDataStore nfsExport(AlertDisk nfsExport) {
    
    this.nfsExport = nfsExport;
    return this;
  }

   /**
   * Get nfsExport
   * @return nfsExport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AlertDisk getNfsExport() {
    return nfsExport;
  }


  public void setNfsExport(AlertDisk nfsExport) {
    this.nfsExport = nfsExport;
  }


  public ElfDataStore nvmfSubsystem(AlertDisk nvmfSubsystem) {
    
    this.nvmfSubsystem = nvmfSubsystem;
    return this;
  }

   /**
   * Get nvmfSubsystem
   * @return nvmfSubsystem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AlertDisk getNvmfSubsystem() {
    return nvmfSubsystem;
  }


  public void setNvmfSubsystem(AlertDisk nvmfSubsystem) {
    this.nvmfSubsystem = nvmfSubsystem;
  }


  public ElfDataStore replicaNum(Double replicaNum) {
    
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


  public ElfDataStore thinProvision(Boolean thinProvision) {
    
    this.thinProvision = thinProvision;
    return this;
  }

   /**
   * Get thinProvision
   * @return thinProvision
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getThinProvision() {
    return thinProvision;
  }


  public void setThinProvision(Boolean thinProvision) {
    this.thinProvision = thinProvision;
  }


  public ElfDataStore type(ElfDataStoreType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ElfDataStoreType getType() {
    return type;
  }


  public void setType(ElfDataStoreType type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElfDataStore elfDataStore = (ElfDataStore) o;
    return Objects.equals(this.cluster, elfDataStore.cluster) &&
        Objects.equals(this.description, elfDataStore.description) &&
        Objects.equals(this.externalUse, elfDataStore.externalUse) &&
        Objects.equals(this.id, elfDataStore.id) &&
        Objects.equals(this.internal, elfDataStore.internal) &&
        Objects.equals(this.ipWhitelist, elfDataStore.ipWhitelist) &&
        Objects.equals(this.iscsiTarget, elfDataStore.iscsiTarget) &&
        Objects.equals(this.localId, elfDataStore.localId) &&
        Objects.equals(this.name, elfDataStore.name) &&
        Objects.equals(this.nfsExport, elfDataStore.nfsExport) &&
        Objects.equals(this.nvmfSubsystem, elfDataStore.nvmfSubsystem) &&
        Objects.equals(this.replicaNum, elfDataStore.replicaNum) &&
        Objects.equals(this.thinProvision, elfDataStore.thinProvision) &&
        Objects.equals(this.type, elfDataStore.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, description, externalUse, id, internal, ipWhitelist, iscsiTarget, localId, name, nfsExport, nvmfSubsystem, replicaNum, thinProvision, type);
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
    sb.append("class ElfDataStore {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalUse: ").append(toIndentedString(externalUse)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    ipWhitelist: ").append(toIndentedString(ipWhitelist)).append("\n");
    sb.append("    iscsiTarget: ").append(toIndentedString(iscsiTarget)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nfsExport: ").append(toIndentedString(nfsExport)).append("\n");
    sb.append("    nvmfSubsystem: ").append(toIndentedString(nvmfSubsystem)).append("\n");
    sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
    sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

