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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NamespaceGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T16:05:01.910402800+08:00[Asia/Shanghai]")
public class NamespaceGroup {
  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<BrickTopoPowers> labels = null;

  public static final String SERIALIZED_NAME_LOCAL_CREATE_TIME = "local_create_time";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATE_TIME)
  private String localCreateTime;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACES = "namespaces";
  @SerializedName(SERIALIZED_NAME_NAMESPACES)
  private List<AlertRuleCluster> namespaces = null;

  public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM = "nvmf_subsystem";
  @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM)
  private AlertRuleCluster nvmfSubsystem;


  public NamespaceGroup entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public NamespaceGroup id(String id) {
    
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


  public NamespaceGroup labels(List<BrickTopoPowers> labels) {
    
    this.labels = labels;
    return this;
  }

  public NamespaceGroup addLabelsItem(BrickTopoPowers labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<BrickTopoPowers>();
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

  public List<BrickTopoPowers> getLabels() {
    return labels;
  }


  public void setLabels(List<BrickTopoPowers> labels) {
    this.labels = labels;
  }


  public NamespaceGroup localCreateTime(String localCreateTime) {
    
    this.localCreateTime = localCreateTime;
    return this;
  }

   /**
   * Get localCreateTime
   * @return localCreateTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocalCreateTime() {
    return localCreateTime;
  }


  public void setLocalCreateTime(String localCreateTime) {
    this.localCreateTime = localCreateTime;
  }


  public NamespaceGroup localId(String localId) {
    
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


  public NamespaceGroup name(String name) {
    
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


  public NamespaceGroup namespaces(List<AlertRuleCluster> namespaces) {
    
    this.namespaces = namespaces;
    return this;
  }

  public NamespaceGroup addNamespacesItem(AlertRuleCluster namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<AlertRuleCluster>();
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

  public List<AlertRuleCluster> getNamespaces() {
    return namespaces;
  }


  public void setNamespaces(List<AlertRuleCluster> namespaces) {
    this.namespaces = namespaces;
  }


  public NamespaceGroup nvmfSubsystem(AlertRuleCluster nvmfSubsystem) {
    
    this.nvmfSubsystem = nvmfSubsystem;
    return this;
  }

   /**
   * Get nvmfSubsystem
   * @return nvmfSubsystem
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AlertRuleCluster getNvmfSubsystem() {
    return nvmfSubsystem;
  }


  public void setNvmfSubsystem(AlertRuleCluster nvmfSubsystem) {
    this.nvmfSubsystem = nvmfSubsystem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamespaceGroup namespaceGroup = (NamespaceGroup) o;
    return Objects.equals(this.entityAsyncStatus, namespaceGroup.entityAsyncStatus) &&
        Objects.equals(this.id, namespaceGroup.id) &&
        Objects.equals(this.labels, namespaceGroup.labels) &&
        Objects.equals(this.localCreateTime, namespaceGroup.localCreateTime) &&
        Objects.equals(this.localId, namespaceGroup.localId) &&
        Objects.equals(this.name, namespaceGroup.name) &&
        Objects.equals(this.namespaces, namespaceGroup.namespaces) &&
        Objects.equals(this.nvmfSubsystem, namespaceGroup.nvmfSubsystem);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityAsyncStatus, id, labels, localCreateTime, localId, name, namespaces, nvmfSubsystem);
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
    sb.append("class NamespaceGroup {\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    localCreateTime: ").append(toIndentedString(localCreateTime)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    nvmfSubsystem: ").append(toIndentedString(nvmfSubsystem)).append("\n");
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

