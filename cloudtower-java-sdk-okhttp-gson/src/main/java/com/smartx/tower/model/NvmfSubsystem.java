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
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.NestedCluster;
import com.smartx.tower.model.NestedLabel;
import com.smartx.tower.model.NestedNamespaceGroup;
import com.smartx.tower.model.NestedNvmfNamespace;
import com.smartx.tower.model.NvmfSubsystemPolicyType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NvmfSubsystem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NvmfSubsystem {
  public static final String SERIALIZED_NAME_BPS = "bps";
  @SerializedName(SERIALIZED_NAME_BPS)
  private Double bps;

  public static final String SERIALIZED_NAME_BPS_MAX = "bps_max";
  @SerializedName(SERIALIZED_NAME_BPS_MAX)
  private Double bpsMax;

  public static final String SERIALIZED_NAME_BPS_MAX_LENGTH = "bps_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH)
  private Double bpsMaxLength;

  public static final String SERIALIZED_NAME_BPS_RD = "bps_rd";
  @SerializedName(SERIALIZED_NAME_BPS_RD)
  private Double bpsRd;

  public static final String SERIALIZED_NAME_BPS_RD_MAX = "bps_rd_max";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX)
  private Double bpsRdMax;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH = "bps_rd_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH)
  private Double bpsRdMaxLength;

  public static final String SERIALIZED_NAME_BPS_WR = "bps_wr";
  @SerializedName(SERIALIZED_NAME_BPS_WR)
  private Double bpsWr;

  public static final String SERIALIZED_NAME_BPS_WR_MAX = "bps_wr_max";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX)
  private Double bpsWrMax;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH = "bps_wr_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH)
  private Double bpsWrMaxLength;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private NestedCluster cluster;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_EXTERNAL_USE = "external_use";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_USE)
  private Boolean externalUse;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_IO_SIZE = "io_size";
  @SerializedName(SERIALIZED_NAME_IO_SIZE)
  private Double ioSize;

  public static final String SERIALIZED_NAME_IOPS = "iops";
  @SerializedName(SERIALIZED_NAME_IOPS)
  private Double iops;

  public static final String SERIALIZED_NAME_IOPS_MAX = "iops_max";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX)
  private Double iopsMax;

  public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH = "iops_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH)
  private Double iopsMaxLength;

  public static final String SERIALIZED_NAME_IOPS_RD = "iops_rd";
  @SerializedName(SERIALIZED_NAME_IOPS_RD)
  private Double iopsRd;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX = "iops_rd_max";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX)
  private Double iopsRdMax;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH = "iops_rd_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH)
  private Double iopsRdMaxLength;

  public static final String SERIALIZED_NAME_IOPS_WR = "iops_wr";
  @SerializedName(SERIALIZED_NAME_IOPS_WR)
  private Double iopsWr;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX = "iops_wr_max";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX)
  private Double iopsWrMax;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH = "iops_wr_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH)
  private Double iopsWrMaxLength;

  public static final String SERIALIZED_NAME_IP_WHITELIST = "ip_whitelist";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST)
  private String ipWhitelist;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<NestedLabel> labels = null;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE_GROUPS = "namespace_groups";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUPS)
  private List<NestedNamespaceGroup> namespaceGroups = null;

  public static final String SERIALIZED_NAME_NAMESPACES = "namespaces";
  @SerializedName(SERIALIZED_NAME_NAMESPACES)
  private List<NestedNvmfNamespace> namespaces = null;

  public static final String SERIALIZED_NAME_NQN_NAME = "nqn_name";
  @SerializedName(SERIALIZED_NAME_NQN_NAME)
  private String nqnName;

  public static final String SERIALIZED_NAME_NQN_WHITELIST = "nqn_whitelist";
  @SerializedName(SERIALIZED_NAME_NQN_WHITELIST)
  private String nqnWhitelist;

  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private NvmfSubsystemPolicyType policy;

  public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
  private Integer replicaNum;

  public static final String SERIALIZED_NAME_STRIPE_NUM = "stripe_num";
  @SerializedName(SERIALIZED_NAME_STRIPE_NUM)
  private Integer stripeNum;

  public static final String SERIALIZED_NAME_STRIPE_SIZE = "stripe_size";
  @SerializedName(SERIALIZED_NAME_STRIPE_SIZE)
  private Double stripeSize;

  public static final String SERIALIZED_NAME_THIN_PROVISION = "thin_provision";
  @SerializedName(SERIALIZED_NAME_THIN_PROVISION)
  private Boolean thinProvision;


  public NvmfSubsystem bps(Double bps) {
    
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


  public NvmfSubsystem bpsMax(Double bpsMax) {
    
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


  public NvmfSubsystem bpsMaxLength(Double bpsMaxLength) {
    
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


  public NvmfSubsystem bpsRd(Double bpsRd) {
    
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


  public NvmfSubsystem bpsRdMax(Double bpsRdMax) {
    
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


  public NvmfSubsystem bpsRdMaxLength(Double bpsRdMaxLength) {
    
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


  public NvmfSubsystem bpsWr(Double bpsWr) {
    
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


  public NvmfSubsystem bpsWrMax(Double bpsWrMax) {
    
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


  public NvmfSubsystem bpsWrMaxLength(Double bpsWrMaxLength) {
    
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


  public NvmfSubsystem cluster(NestedCluster cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedCluster getCluster() {
    return cluster;
  }


  public void setCluster(NestedCluster cluster) {
    this.cluster = cluster;
  }


  public NvmfSubsystem description(String description) {
    
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


  public NvmfSubsystem entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
    this.entityAsyncStatus = entityAsyncStatus;
    return this;
  }

   /**
   * Get entityAsyncStatus
   * @return entityAsyncStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityAsyncStatus getEntityAsyncStatus() {
    return entityAsyncStatus;
  }


  public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    this.entityAsyncStatus = entityAsyncStatus;
  }


  public NvmfSubsystem externalUse(Boolean externalUse) {
    
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


  public NvmfSubsystem id(String id) {
    
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


  public NvmfSubsystem internal(Boolean internal) {
    
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


  public NvmfSubsystem ioSize(Double ioSize) {
    
    this.ioSize = ioSize;
    return this;
  }

   /**
   * Get ioSize
   * @return ioSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIoSize() {
    return ioSize;
  }


  public void setIoSize(Double ioSize) {
    this.ioSize = ioSize;
  }


  public NvmfSubsystem iops(Double iops) {
    
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


  public NvmfSubsystem iopsMax(Double iopsMax) {
    
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


  public NvmfSubsystem iopsMaxLength(Double iopsMaxLength) {
    
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


  public NvmfSubsystem iopsRd(Double iopsRd) {
    
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


  public NvmfSubsystem iopsRdMax(Double iopsRdMax) {
    
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


  public NvmfSubsystem iopsRdMaxLength(Double iopsRdMaxLength) {
    
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


  public NvmfSubsystem iopsWr(Double iopsWr) {
    
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


  public NvmfSubsystem iopsWrMax(Double iopsWrMax) {
    
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


  public NvmfSubsystem iopsWrMaxLength(Double iopsWrMaxLength) {
    
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


  public NvmfSubsystem ipWhitelist(String ipWhitelist) {
    
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


  public NvmfSubsystem labels(List<NestedLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public NvmfSubsystem addLabelsItem(NestedLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<NestedLabel>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedLabel> getLabels() {
    return labels;
  }


  public void setLabels(List<NestedLabel> labels) {
    this.labels = labels;
  }


  public NvmfSubsystem localId(String localId) {
    
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


  public NvmfSubsystem name(String name) {
    
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


  public NvmfSubsystem namespaceGroups(List<NestedNamespaceGroup> namespaceGroups) {
    
    this.namespaceGroups = namespaceGroups;
    return this;
  }

  public NvmfSubsystem addNamespaceGroupsItem(NestedNamespaceGroup namespaceGroupsItem) {
    if (this.namespaceGroups == null) {
      this.namespaceGroups = new ArrayList<NestedNamespaceGroup>();
    }
    this.namespaceGroups.add(namespaceGroupsItem);
    return this;
  }

   /**
   * Get namespaceGroups
   * @return namespaceGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedNamespaceGroup> getNamespaceGroups() {
    return namespaceGroups;
  }


  public void setNamespaceGroups(List<NestedNamespaceGroup> namespaceGroups) {
    this.namespaceGroups = namespaceGroups;
  }


  public NvmfSubsystem namespaces(List<NestedNvmfNamespace> namespaces) {
    
    this.namespaces = namespaces;
    return this;
  }

  public NvmfSubsystem addNamespacesItem(NestedNvmfNamespace namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<NestedNvmfNamespace>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

   /**
   * Get namespaces
   * @return namespaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedNvmfNamespace> getNamespaces() {
    return namespaces;
  }


  public void setNamespaces(List<NestedNvmfNamespace> namespaces) {
    this.namespaces = namespaces;
  }


  public NvmfSubsystem nqnName(String nqnName) {
    
    this.nqnName = nqnName;
    return this;
  }

   /**
   * Get nqnName
   * @return nqnName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNqnName() {
    return nqnName;
  }


  public void setNqnName(String nqnName) {
    this.nqnName = nqnName;
  }


  public NvmfSubsystem nqnWhitelist(String nqnWhitelist) {
    
    this.nqnWhitelist = nqnWhitelist;
    return this;
  }

   /**
   * Get nqnWhitelist
   * @return nqnWhitelist
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNqnWhitelist() {
    return nqnWhitelist;
  }


  public void setNqnWhitelist(String nqnWhitelist) {
    this.nqnWhitelist = nqnWhitelist;
  }


  public NvmfSubsystem policy(NvmfSubsystemPolicyType policy) {
    
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NvmfSubsystemPolicyType getPolicy() {
    return policy;
  }


  public void setPolicy(NvmfSubsystemPolicyType policy) {
    this.policy = policy;
  }


  public NvmfSubsystem replicaNum(Integer replicaNum) {
    
    this.replicaNum = replicaNum;
    return this;
  }

   /**
   * Get replicaNum
   * @return replicaNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getReplicaNum() {
    return replicaNum;
  }


  public void setReplicaNum(Integer replicaNum) {
    this.replicaNum = replicaNum;
  }


  public NvmfSubsystem stripeNum(Integer stripeNum) {
    
    this.stripeNum = stripeNum;
    return this;
  }

   /**
   * Get stripeNum
   * @return stripeNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getStripeNum() {
    return stripeNum;
  }


  public void setStripeNum(Integer stripeNum) {
    this.stripeNum = stripeNum;
  }


  public NvmfSubsystem stripeSize(Double stripeSize) {
    
    this.stripeSize = stripeSize;
    return this;
  }

   /**
   * Get stripeSize
   * @return stripeSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getStripeSize() {
    return stripeSize;
  }


  public void setStripeSize(Double stripeSize) {
    this.stripeSize = stripeSize;
  }


  public NvmfSubsystem thinProvision(Boolean thinProvision) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NvmfSubsystem nvmfSubsystem = (NvmfSubsystem) o;
    return Objects.equals(this.bps, nvmfSubsystem.bps) &&
        Objects.equals(this.bpsMax, nvmfSubsystem.bpsMax) &&
        Objects.equals(this.bpsMaxLength, nvmfSubsystem.bpsMaxLength) &&
        Objects.equals(this.bpsRd, nvmfSubsystem.bpsRd) &&
        Objects.equals(this.bpsRdMax, nvmfSubsystem.bpsRdMax) &&
        Objects.equals(this.bpsRdMaxLength, nvmfSubsystem.bpsRdMaxLength) &&
        Objects.equals(this.bpsWr, nvmfSubsystem.bpsWr) &&
        Objects.equals(this.bpsWrMax, nvmfSubsystem.bpsWrMax) &&
        Objects.equals(this.bpsWrMaxLength, nvmfSubsystem.bpsWrMaxLength) &&
        Objects.equals(this.cluster, nvmfSubsystem.cluster) &&
        Objects.equals(this.description, nvmfSubsystem.description) &&
        Objects.equals(this.entityAsyncStatus, nvmfSubsystem.entityAsyncStatus) &&
        Objects.equals(this.externalUse, nvmfSubsystem.externalUse) &&
        Objects.equals(this.id, nvmfSubsystem.id) &&
        Objects.equals(this.internal, nvmfSubsystem.internal) &&
        Objects.equals(this.ioSize, nvmfSubsystem.ioSize) &&
        Objects.equals(this.iops, nvmfSubsystem.iops) &&
        Objects.equals(this.iopsMax, nvmfSubsystem.iopsMax) &&
        Objects.equals(this.iopsMaxLength, nvmfSubsystem.iopsMaxLength) &&
        Objects.equals(this.iopsRd, nvmfSubsystem.iopsRd) &&
        Objects.equals(this.iopsRdMax, nvmfSubsystem.iopsRdMax) &&
        Objects.equals(this.iopsRdMaxLength, nvmfSubsystem.iopsRdMaxLength) &&
        Objects.equals(this.iopsWr, nvmfSubsystem.iopsWr) &&
        Objects.equals(this.iopsWrMax, nvmfSubsystem.iopsWrMax) &&
        Objects.equals(this.iopsWrMaxLength, nvmfSubsystem.iopsWrMaxLength) &&
        Objects.equals(this.ipWhitelist, nvmfSubsystem.ipWhitelist) &&
        Objects.equals(this.labels, nvmfSubsystem.labels) &&
        Objects.equals(this.localId, nvmfSubsystem.localId) &&
        Objects.equals(this.name, nvmfSubsystem.name) &&
        Objects.equals(this.namespaceGroups, nvmfSubsystem.namespaceGroups) &&
        Objects.equals(this.namespaces, nvmfSubsystem.namespaces) &&
        Objects.equals(this.nqnName, nvmfSubsystem.nqnName) &&
        Objects.equals(this.nqnWhitelist, nvmfSubsystem.nqnWhitelist) &&
        Objects.equals(this.policy, nvmfSubsystem.policy) &&
        Objects.equals(this.replicaNum, nvmfSubsystem.replicaNum) &&
        Objects.equals(this.stripeNum, nvmfSubsystem.stripeNum) &&
        Objects.equals(this.stripeSize, nvmfSubsystem.stripeSize) &&
        Objects.equals(this.thinProvision, nvmfSubsystem.thinProvision);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bps, bpsMax, bpsMaxLength, bpsRd, bpsRdMax, bpsRdMaxLength, bpsWr, bpsWrMax, bpsWrMaxLength, cluster, description, entityAsyncStatus, externalUse, id, internal, ioSize, iops, iopsMax, iopsMaxLength, iopsRd, iopsRdMax, iopsRdMaxLength, iopsWr, iopsWrMax, iopsWrMaxLength, ipWhitelist, labels, localId, name, namespaceGroups, namespaces, nqnName, nqnWhitelist, policy, replicaNum, stripeNum, stripeSize, thinProvision);
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
    sb.append("class NvmfSubsystem {\n");
    sb.append("    bps: ").append(toIndentedString(bps)).append("\n");
    sb.append("    bpsMax: ").append(toIndentedString(bpsMax)).append("\n");
    sb.append("    bpsMaxLength: ").append(toIndentedString(bpsMaxLength)).append("\n");
    sb.append("    bpsRd: ").append(toIndentedString(bpsRd)).append("\n");
    sb.append("    bpsRdMax: ").append(toIndentedString(bpsRdMax)).append("\n");
    sb.append("    bpsRdMaxLength: ").append(toIndentedString(bpsRdMaxLength)).append("\n");
    sb.append("    bpsWr: ").append(toIndentedString(bpsWr)).append("\n");
    sb.append("    bpsWrMax: ").append(toIndentedString(bpsWrMax)).append("\n");
    sb.append("    bpsWrMaxLength: ").append(toIndentedString(bpsWrMaxLength)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    externalUse: ").append(toIndentedString(externalUse)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    ioSize: ").append(toIndentedString(ioSize)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    iopsMax: ").append(toIndentedString(iopsMax)).append("\n");
    sb.append("    iopsMaxLength: ").append(toIndentedString(iopsMaxLength)).append("\n");
    sb.append("    iopsRd: ").append(toIndentedString(iopsRd)).append("\n");
    sb.append("    iopsRdMax: ").append(toIndentedString(iopsRdMax)).append("\n");
    sb.append("    iopsRdMaxLength: ").append(toIndentedString(iopsRdMaxLength)).append("\n");
    sb.append("    iopsWr: ").append(toIndentedString(iopsWr)).append("\n");
    sb.append("    iopsWrMax: ").append(toIndentedString(iopsWrMax)).append("\n");
    sb.append("    iopsWrMaxLength: ").append(toIndentedString(iopsWrMaxLength)).append("\n");
    sb.append("    ipWhitelist: ").append(toIndentedString(ipWhitelist)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaceGroups: ").append(toIndentedString(namespaceGroups)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    nqnName: ").append(toIndentedString(nqnName)).append("\n");
    sb.append("    nqnWhitelist: ").append(toIndentedString(nqnWhitelist)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
    sb.append("    stripeNum: ").append(toIndentedString(stripeNum)).append("\n");
    sb.append("    stripeSize: ").append(toIndentedString(stripeSize)).append("\n");
    sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
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

