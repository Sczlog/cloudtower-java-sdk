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
import com.smartx.tower.model.NestedLabel;
import com.smartx.tower.model.NestedNfsExport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NfsInode
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NfsInode {
  public static final String SERIALIZED_NAME_ASSIGNED_SIZE = "assigned_size";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE)
  private Double assignedSize;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private Boolean file;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<NestedLabel> labels = null;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT = "local_updated_at";
  @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT)
  private String localUpdatedAt;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NFS_EXPORT = "nfs_export";
  @SerializedName(SERIALIZED_NAME_NFS_EXPORT)
  private NestedNfsExport nfsExport;

  public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_SHARED_SIZE = "shared_size";
  @SerializedName(SERIALIZED_NAME_SHARED_SIZE)
  private Double sharedSize;

  public static final String SERIALIZED_NAME_SNAPSHOT_NUM = "snapshot_num";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM)
  private Integer snapshotNum;

  public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";
  @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
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

  public Double getAssignedSize() {
    return assignedSize;
  }


  public void setAssignedSize(Double assignedSize) {
    this.assignedSize = assignedSize;
  }


  public NfsInode entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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

  public Boolean getFile() {
    return file;
  }


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

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public NfsInode labels(List<NestedLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public NfsInode addLabelsItem(NestedLabel labelsItem) {
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

  public String getLocalId() {
    return localId;
  }


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

  public String getLocalUpdatedAt() {
    return localUpdatedAt;
  }


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

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NfsInode nfsExport(NestedNfsExport nfsExport) {
    
    this.nfsExport = nfsExport;
    return this;
  }

   /**
   * Get nfsExport
   * @return nfsExport
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedNfsExport getNfsExport() {
    return nfsExport;
  }


  public void setNfsExport(NestedNfsExport nfsExport) {
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

  public String getParentId() {
    return parentId;
  }


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

  public Double getSharedSize() {
    return sharedSize;
  }


  public void setSharedSize(Double sharedSize) {
    this.sharedSize = sharedSize;
  }


  public NfsInode snapshotNum(Integer snapshotNum) {
    
    this.snapshotNum = snapshotNum;
    return this;
  }

   /**
   * Get snapshotNum
   * @return snapshotNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSnapshotNum() {
    return snapshotNum;
  }


  public void setSnapshotNum(Integer snapshotNum) {
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

  public Double getUniqueSize() {
    return uniqueSize;
  }


  public void setUniqueSize(Double uniqueSize) {
    this.uniqueSize = uniqueSize;
  }


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
        Objects.equals(this.entityAsyncStatus, nfsInode.entityAsyncStatus) &&
        Objects.equals(this.file, nfsInode.file) &&
        Objects.equals(this.id, nfsInode.id) &&
        Objects.equals(this.labels, nfsInode.labels) &&
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
    return Objects.hash(assignedSize, entityAsyncStatus, file, id, labels, localId, localUpdatedAt, name, nfsExport, parentId, sharedSize, snapshotNum, uniqueSize);
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

