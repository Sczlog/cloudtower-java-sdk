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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.smartx.tower.model.AlertRuleCluster;
import com.smartx.tower.model.BrickTopoPowers;
import com.smartx.tower.model.EntityAsyncStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NfsInode
 */
@JsonPropertyOrder({
  NfsInode.JSON_PROPERTY_ASSIGNED_SIZE,
  NfsInode.JSON_PROPERTY_ENTITY_ASYNC_STATUS,
  NfsInode.JSON_PROPERTY_FILE,
  NfsInode.JSON_PROPERTY_ID,
  NfsInode.JSON_PROPERTY_LABELS,
  NfsInode.JSON_PROPERTY_LOCAL_ID,
  NfsInode.JSON_PROPERTY_LOCAL_UPDATED_AT,
  NfsInode.JSON_PROPERTY_NAME,
  NfsInode.JSON_PROPERTY_NFS_EXPORT,
  NfsInode.JSON_PROPERTY_PARENT_ID,
  NfsInode.JSON_PROPERTY_SHARED_SIZE,
  NfsInode.JSON_PROPERTY_SNAPSHOT_NUM,
  NfsInode.JSON_PROPERTY_UNIQUE_SIZE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class NfsInode {
  public static final String JSON_PROPERTY_ASSIGNED_SIZE = "assigned_size";
  private Double assignedSize;

  public static final String JSON_PROPERTY_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  private JsonNullable<EntityAsyncStatus> entityAsyncStatus = JsonNullable.<EntityAsyncStatus>undefined();

  public static final String JSON_PROPERTY_FILE = "file";
  private Boolean file;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private JsonNullable<List<BrickTopoPowers>> labels = JsonNullable.<List<BrickTopoPowers>>undefined();

  public static final String JSON_PROPERTY_LOCAL_ID = "local_id";
  private String localId;

  public static final String JSON_PROPERTY_LOCAL_UPDATED_AT = "local_updated_at";
  private String localUpdatedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NFS_EXPORT = "nfs_export";
  private AlertRuleCluster nfsExport;

  public static final String JSON_PROPERTY_PARENT_ID = "parent_id";
  private String parentId;

  public static final String JSON_PROPERTY_SHARED_SIZE = "shared_size";
  private Double sharedSize;

  public static final String JSON_PROPERTY_SNAPSHOT_NUM = "snapshot_num";
  private Double snapshotNum;

  public static final String JSON_PROPERTY_UNIQUE_SIZE = "unique_size";
  private Double uniqueSize;


  public NfsInode assignedSize(Double assignedSize) {
    this.assignedSize = assignedSize;
    return this;
  }

   /**
   * Get assignedSize
   * @return assignedSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ASSIGNED_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getAssignedSize() {
    return assignedSize;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNED_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAssignedSize(Double assignedSize) {
    this.assignedSize = assignedSize;
  }


  public NfsInode entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    this.entityAsyncStatus = JsonNullable.<EntityAsyncStatus>of(entityAsyncStatus);
    return this;
  }

   /**
   * Get entityAsyncStatus
   * @return entityAsyncStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public EntityAsyncStatus getEntityAsyncStatus() {
        return entityAsyncStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENTITY_ASYNC_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<EntityAsyncStatus> getEntityAsyncStatus_JsonNullable() {
    return entityAsyncStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTITY_ASYNC_STATUS)
  public void setEntityAsyncStatus_JsonNullable(JsonNullable<EntityAsyncStatus> entityAsyncStatus) {
    this.entityAsyncStatus = entityAsyncStatus;
  }

  public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    this.entityAsyncStatus = JsonNullable.<EntityAsyncStatus>of(entityAsyncStatus);
  }


  public NfsInode file(Boolean file) {
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getFile() {
    return file;
  }


  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFile(Boolean file) {
    this.file = file;
  }


  public NfsInode id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public NfsInode labels(List<BrickTopoPowers> labels) {
    this.labels = JsonNullable.<List<BrickTopoPowers>>of(labels);
    return this;
  }

  public NfsInode addLabelsItem(BrickTopoPowers labelsItem) {
    if (this.labels == null || !this.labels.isPresent()) {
      this.labels = JsonNullable.<List<BrickTopoPowers>>of(new ArrayList<>());
    }
    try {
      this.labels.get().add(labelsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<BrickTopoPowers> getLabels() {
        return labels.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<BrickTopoPowers>> getLabels_JsonNullable() {
    return labels;
  }
  
  @JsonProperty(JSON_PROPERTY_LABELS)
  public void setLabels_JsonNullable(JsonNullable<List<BrickTopoPowers>> labels) {
    this.labels = labels;
  }

  public void setLabels(List<BrickTopoPowers> labels) {
    this.labels = JsonNullable.<List<BrickTopoPowers>>of(labels);
  }


  public NfsInode localId(String localId) {
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LOCAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLocalId() {
    return localId;
  }


  @JsonProperty(JSON_PROPERTY_LOCAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public NfsInode localUpdatedAt(String localUpdatedAt) {
    this.localUpdatedAt = localUpdatedAt;
    return this;
  }

   /**
   * Get localUpdatedAt
   * @return localUpdatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LOCAL_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLocalUpdatedAt() {
    return localUpdatedAt;
  }


  @JsonProperty(JSON_PROPERTY_LOCAL_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocalUpdatedAt(String localUpdatedAt) {
    this.localUpdatedAt = localUpdatedAt;
  }


  public NfsInode name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public NfsInode nfsExport(AlertRuleCluster nfsExport) {
    this.nfsExport = nfsExport;
    return this;
  }

   /**
   * Get nfsExport
   * @return nfsExport
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NFS_EXPORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AlertRuleCluster getNfsExport() {
    return nfsExport;
  }


  @JsonProperty(JSON_PROPERTY_NFS_EXPORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNfsExport(AlertRuleCluster nfsExport) {
    this.nfsExport = nfsExport;
  }


  public NfsInode parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getParentId() {
    return parentId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public NfsInode sharedSize(Double sharedSize) {
    this.sharedSize = sharedSize;
    return this;
  }

   /**
   * Get sharedSize
   * @return sharedSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SHARED_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getSharedSize() {
    return sharedSize;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSharedSize(Double sharedSize) {
    this.sharedSize = sharedSize;
  }


  public NfsInode snapshotNum(Double snapshotNum) {
    this.snapshotNum = snapshotNum;
    return this;
  }

   /**
   * Get snapshotNum
   * @return snapshotNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_NUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getSnapshotNum() {
    return snapshotNum;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT_NUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSnapshotNum(Double snapshotNum) {
    this.snapshotNum = snapshotNum;
  }


  public NfsInode uniqueSize(Double uniqueSize) {
    this.uniqueSize = uniqueSize;
    return this;
  }

   /**
   * Get uniqueSize
   * @return uniqueSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UNIQUE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getUniqueSize() {
    return uniqueSize;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUniqueSize(Double uniqueSize) {
    this.uniqueSize = uniqueSize;
  }


  /**
   * Return true if this NfsInode object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfsInode nfsInode = (NfsInode) o;
    return Objects.equals(this.assignedSize, nfsInode.assignedSize) &&
        equalsNullable(this.entityAsyncStatus, nfsInode.entityAsyncStatus) &&
        Objects.equals(this.file, nfsInode.file) &&
        Objects.equals(this.id, nfsInode.id) &&
        equalsNullable(this.labels, nfsInode.labels) &&
        Objects.equals(this.localId, nfsInode.localId) &&
        Objects.equals(this.localUpdatedAt, nfsInode.localUpdatedAt) &&
        Objects.equals(this.name, nfsInode.name) &&
        Objects.equals(this.nfsExport, nfsInode.nfsExport) &&
        Objects.equals(this.parentId, nfsInode.parentId) &&
        Objects.equals(this.sharedSize, nfsInode.sharedSize) &&
        Objects.equals(this.snapshotNum, nfsInode.snapshotNum) &&
        Objects.equals(this.uniqueSize, nfsInode.uniqueSize);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedSize, hashCodeNullable(entityAsyncStatus), file, id, hashCodeNullable(labels), localId, localUpdatedAt, name, nfsExport, parentId, sharedSize, snapshotNum, uniqueSize);
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
    sb.append("class NfsInode {\n");
    sb.append("    assignedSize: ").append(toIndentedString(assignedSize)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    localUpdatedAt: ").append(toIndentedString(localUpdatedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nfsExport: ").append(toIndentedString(nfsExport)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    sharedSize: ").append(toIndentedString(sharedSize)).append("\n");
    sb.append("    snapshotNum: ").append(toIndentedString(snapshotNum)).append("\n");
    sb.append("    uniqueSize: ").append(toIndentedString(uniqueSize)).append("\n");
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

