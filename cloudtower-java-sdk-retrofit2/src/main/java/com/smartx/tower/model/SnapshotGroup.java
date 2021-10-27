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
import com.smartx.tower.model.AlertRuleCluster;
import com.smartx.tower.model.BrickTopoPowers;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.SnapshotGroupVmInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SnapshotGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:23:54.291904700+08:00[Asia/Shanghai]")
public class SnapshotGroup {
  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private AlertRuleCluster cluster;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME = "estimated_recycling_time";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME)
  private String estimatedRecyclingTime;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_KEEP = "keep";
  @SerializedName(SERIALIZED_NAME_KEEP)
  private Boolean keep;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
  private String localCreatedAt;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES = "logical_size_bytes";
  @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES)
  private Double logicalSizeBytes;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OBJECT_NUM = "object_num";
  @SerializedName(SERIALIZED_NAME_OBJECT_NUM)
  private Double objectNum;

  public static final String SERIALIZED_NAME_SNAPSHOT_PLAN_TASK = "snapshotPlanTask";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_PLAN_TASK)
  private BrickTopoPowers snapshotPlanTask;

  public static final String SERIALIZED_NAME_VM_INFO = "vm_info";
  @SerializedName(SERIALIZED_NAME_VM_INFO)
  private List<SnapshotGroupVmInfo> vmInfo = new ArrayList<SnapshotGroupVmInfo>();

  public static final String SERIALIZED_NAME_VM_SNAPSHOTS = "vm_snapshots";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS)
  private List<AlertRuleCluster> vmSnapshots = null;


  public SnapshotGroup cluster(AlertRuleCluster cluster) {
    
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


  public SnapshotGroup deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public SnapshotGroup entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public SnapshotGroup estimatedRecyclingTime(String estimatedRecyclingTime) {
    
    this.estimatedRecyclingTime = estimatedRecyclingTime;
    return this;
  }

   /**
   * Get estimatedRecyclingTime
   * @return estimatedRecyclingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEstimatedRecyclingTime() {
    return estimatedRecyclingTime;
  }


  public void setEstimatedRecyclingTime(String estimatedRecyclingTime) {
    this.estimatedRecyclingTime = estimatedRecyclingTime;
  }


  public SnapshotGroup id(String id) {
    
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


  public SnapshotGroup internal(Boolean internal) {
    
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInternal() {
    return internal;
  }


  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public SnapshotGroup keep(Boolean keep) {
    
    this.keep = keep;
    return this;
  }

   /**
   * Get keep
   * @return keep
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getKeep() {
    return keep;
  }


  public void setKeep(Boolean keep) {
    this.keep = keep;
  }


  public SnapshotGroup localCreatedAt(String localCreatedAt) {
    
    this.localCreatedAt = localCreatedAt;
    return this;
  }

   /**
   * Get localCreatedAt
   * @return localCreatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocalCreatedAt() {
    return localCreatedAt;
  }


  public void setLocalCreatedAt(String localCreatedAt) {
    this.localCreatedAt = localCreatedAt;
  }


  public SnapshotGroup localId(String localId) {
    
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


  public SnapshotGroup logicalSizeBytes(Double logicalSizeBytes) {
    
    this.logicalSizeBytes = logicalSizeBytes;
    return this;
  }

   /**
   * Get logicalSizeBytes
   * @return logicalSizeBytes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getLogicalSizeBytes() {
    return logicalSizeBytes;
  }


  public void setLogicalSizeBytes(Double logicalSizeBytes) {
    this.logicalSizeBytes = logicalSizeBytes;
  }


  public SnapshotGroup name(String name) {
    
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


  public SnapshotGroup objectNum(Double objectNum) {
    
    this.objectNum = objectNum;
    return this;
  }

   /**
   * Get objectNum
   * @return objectNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getObjectNum() {
    return objectNum;
  }


  public void setObjectNum(Double objectNum) {
    this.objectNum = objectNum;
  }


  public SnapshotGroup snapshotPlanTask(BrickTopoPowers snapshotPlanTask) {
    
    this.snapshotPlanTask = snapshotPlanTask;
    return this;
  }

   /**
   * Get snapshotPlanTask
   * @return snapshotPlanTask
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BrickTopoPowers getSnapshotPlanTask() {
    return snapshotPlanTask;
  }


  public void setSnapshotPlanTask(BrickTopoPowers snapshotPlanTask) {
    this.snapshotPlanTask = snapshotPlanTask;
  }


  public SnapshotGroup vmInfo(List<SnapshotGroupVmInfo> vmInfo) {
    
    this.vmInfo = vmInfo;
    return this;
  }

  public SnapshotGroup addVmInfoItem(SnapshotGroupVmInfo vmInfoItem) {
    this.vmInfo.add(vmInfoItem);
    return this;
  }

   /**
   * Get vmInfo
   * @return vmInfo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<SnapshotGroupVmInfo> getVmInfo() {
    return vmInfo;
  }


  public void setVmInfo(List<SnapshotGroupVmInfo> vmInfo) {
    this.vmInfo = vmInfo;
  }


  public SnapshotGroup vmSnapshots(List<AlertRuleCluster> vmSnapshots) {
    
    this.vmSnapshots = vmSnapshots;
    return this;
  }

  public SnapshotGroup addVmSnapshotsItem(AlertRuleCluster vmSnapshotsItem) {
    if (this.vmSnapshots == null) {
      this.vmSnapshots = new ArrayList<AlertRuleCluster>();
    }
    this.vmSnapshots.add(vmSnapshotsItem);
    return this;
  }

   /**
   * Get vmSnapshots
   * @return vmSnapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AlertRuleCluster> getVmSnapshots() {
    return vmSnapshots;
  }


  public void setVmSnapshots(List<AlertRuleCluster> vmSnapshots) {
    this.vmSnapshots = vmSnapshots;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotGroup snapshotGroup = (SnapshotGroup) o;
    return Objects.equals(this.cluster, snapshotGroup.cluster) &&
        Objects.equals(this.deleted, snapshotGroup.deleted) &&
        Objects.equals(this.entityAsyncStatus, snapshotGroup.entityAsyncStatus) &&
        Objects.equals(this.estimatedRecyclingTime, snapshotGroup.estimatedRecyclingTime) &&
        Objects.equals(this.id, snapshotGroup.id) &&
        Objects.equals(this.internal, snapshotGroup.internal) &&
        Objects.equals(this.keep, snapshotGroup.keep) &&
        Objects.equals(this.localCreatedAt, snapshotGroup.localCreatedAt) &&
        Objects.equals(this.localId, snapshotGroup.localId) &&
        Objects.equals(this.logicalSizeBytes, snapshotGroup.logicalSizeBytes) &&
        Objects.equals(this.name, snapshotGroup.name) &&
        Objects.equals(this.objectNum, snapshotGroup.objectNum) &&
        Objects.equals(this.snapshotPlanTask, snapshotGroup.snapshotPlanTask) &&
        Objects.equals(this.vmInfo, snapshotGroup.vmInfo) &&
        Objects.equals(this.vmSnapshots, snapshotGroup.vmSnapshots);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, deleted, entityAsyncStatus, estimatedRecyclingTime, id, internal, keep, localCreatedAt, localId, logicalSizeBytes, name, objectNum, snapshotPlanTask, vmInfo, vmSnapshots);
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
    sb.append("class SnapshotGroup {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    estimatedRecyclingTime: ").append(toIndentedString(estimatedRecyclingTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    keep: ").append(toIndentedString(keep)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    logicalSizeBytes: ").append(toIndentedString(logicalSizeBytes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objectNum: ").append(toIndentedString(objectNum)).append("\n");
    sb.append("    snapshotPlanTask: ").append(toIndentedString(snapshotPlanTask)).append("\n");
    sb.append("    vmInfo: ").append(toIndentedString(vmInfo)).append("\n");
    sb.append("    vmSnapshots: ").append(toIndentedString(vmSnapshots)).append("\n");
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

