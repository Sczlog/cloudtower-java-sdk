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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ConsistencyGroupCreationParams
 */
@JsonPropertyOrder({
  ConsistencyGroupCreationParams.JSON_PROPERTY_NAMESPACES_IDS,
  ConsistencyGroupCreationParams.JSON_PROPERTY_ISCSI_LUNS_IDS,
  ConsistencyGroupCreationParams.JSON_PROPERTY_DESCRIPTION,
  ConsistencyGroupCreationParams.JSON_PROPERTY_CLUSTER_ID,
  ConsistencyGroupCreationParams.JSON_PROPERTY_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class ConsistencyGroupCreationParams {
  public static final String JSON_PROPERTY_NAMESPACES_IDS = "namespaces_ids";
  private List<String> namespacesIds = new ArrayList<>();

  public static final String JSON_PROPERTY_ISCSI_LUNS_IDS = "iscsi_luns_ids";
  private List<String> iscsiLunsIds = new ArrayList<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CLUSTER_ID = "cluster_id";
  private String clusterId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public ConsistencyGroupCreationParams namespacesIds(List<String> namespacesIds) {
    this.namespacesIds = namespacesIds;
    return this;
  }

  public ConsistencyGroupCreationParams addNamespacesIdsItem(String namespacesIdsItem) {
    this.namespacesIds.add(namespacesIdsItem);
    return this;
  }

   /**
   * Get namespacesIds
   * @return namespacesIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAMESPACES_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getNamespacesIds() {
    return namespacesIds;
  }


  @JsonProperty(JSON_PROPERTY_NAMESPACES_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNamespacesIds(List<String> namespacesIds) {
    this.namespacesIds = namespacesIds;
  }


  public ConsistencyGroupCreationParams iscsiLunsIds(List<String> iscsiLunsIds) {
    this.iscsiLunsIds = iscsiLunsIds;
    return this;
  }

  public ConsistencyGroupCreationParams addIscsiLunsIdsItem(String iscsiLunsIdsItem) {
    this.iscsiLunsIds.add(iscsiLunsIdsItem);
    return this;
  }

   /**
   * Get iscsiLunsIds
   * @return iscsiLunsIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ISCSI_LUNS_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getIscsiLunsIds() {
    return iscsiLunsIds;
  }


  @JsonProperty(JSON_PROPERTY_ISCSI_LUNS_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIscsiLunsIds(List<String> iscsiLunsIds) {
    this.iscsiLunsIds = iscsiLunsIds;
  }


  public ConsistencyGroupCreationParams description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ConsistencyGroupCreationParams clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClusterId() {
    return clusterId;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }


  public ConsistencyGroupCreationParams name(String name) {
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


  /**
   * Return true if this ConsistencyGroupCreationParams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsistencyGroupCreationParams consistencyGroupCreationParams = (ConsistencyGroupCreationParams) o;
    return Objects.equals(this.namespacesIds, consistencyGroupCreationParams.namespacesIds) &&
        Objects.equals(this.iscsiLunsIds, consistencyGroupCreationParams.iscsiLunsIds) &&
        Objects.equals(this.description, consistencyGroupCreationParams.description) &&
        Objects.equals(this.clusterId, consistencyGroupCreationParams.clusterId) &&
        Objects.equals(this.name, consistencyGroupCreationParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespacesIds, iscsiLunsIds, description, clusterId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsistencyGroupCreationParams {\n");
    sb.append("    namespacesIds: ").append(toIndentedString(namespacesIds)).append("\n");
    sb.append("    iscsiLunsIds: ").append(toIndentedString(iscsiLunsIds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

