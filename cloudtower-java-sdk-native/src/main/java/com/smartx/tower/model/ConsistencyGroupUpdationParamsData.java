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
 * ConsistencyGroupUpdationParamsData
 */
@JsonPropertyOrder({
  ConsistencyGroupUpdationParamsData.JSON_PROPERTY_REMAIN_VOLUME_SNAPSHOT,
  ConsistencyGroupUpdationParamsData.JSON_PROPERTY_NAMESPACES_IDS,
  ConsistencyGroupUpdationParamsData.JSON_PROPERTY_ISCSI_LUNS_IDS,
  ConsistencyGroupUpdationParamsData.JSON_PROPERTY_DESCRIPTION,
  ConsistencyGroupUpdationParamsData.JSON_PROPERTY_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class ConsistencyGroupUpdationParamsData {
  public static final String JSON_PROPERTY_REMAIN_VOLUME_SNAPSHOT = "remain_volume_snapshot";
  private Boolean remainVolumeSnapshot;

  public static final String JSON_PROPERTY_NAMESPACES_IDS = "namespaces_ids";
  private List<String> namespacesIds = null;

  public static final String JSON_PROPERTY_ISCSI_LUNS_IDS = "iscsi_luns_ids";
  private List<String> iscsiLunsIds = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public ConsistencyGroupUpdationParamsData remainVolumeSnapshot(Boolean remainVolumeSnapshot) {
    this.remainVolumeSnapshot = remainVolumeSnapshot;
    return this;
  }

   /**
   * Get remainVolumeSnapshot
   * @return remainVolumeSnapshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REMAIN_VOLUME_SNAPSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRemainVolumeSnapshot() {
    return remainVolumeSnapshot;
  }


  @JsonProperty(JSON_PROPERTY_REMAIN_VOLUME_SNAPSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemainVolumeSnapshot(Boolean remainVolumeSnapshot) {
    this.remainVolumeSnapshot = remainVolumeSnapshot;
  }


  public ConsistencyGroupUpdationParamsData namespacesIds(List<String> namespacesIds) {
    this.namespacesIds = namespacesIds;
    return this;
  }

  public ConsistencyGroupUpdationParamsData addNamespacesIdsItem(String namespacesIdsItem) {
    if (this.namespacesIds == null) {
      this.namespacesIds = new ArrayList<>();
    }
    this.namespacesIds.add(namespacesIdsItem);
    return this;
  }

   /**
   * Get namespacesIds
   * @return namespacesIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAMESPACES_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getNamespacesIds() {
    return namespacesIds;
  }


  @JsonProperty(JSON_PROPERTY_NAMESPACES_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNamespacesIds(List<String> namespacesIds) {
    this.namespacesIds = namespacesIds;
  }


  public ConsistencyGroupUpdationParamsData iscsiLunsIds(List<String> iscsiLunsIds) {
    this.iscsiLunsIds = iscsiLunsIds;
    return this;
  }

  public ConsistencyGroupUpdationParamsData addIscsiLunsIdsItem(String iscsiLunsIdsItem) {
    if (this.iscsiLunsIds == null) {
      this.iscsiLunsIds = new ArrayList<>();
    }
    this.iscsiLunsIds.add(iscsiLunsIdsItem);
    return this;
  }

   /**
   * Get iscsiLunsIds
   * @return iscsiLunsIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ISCSI_LUNS_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIscsiLunsIds() {
    return iscsiLunsIds;
  }


  @JsonProperty(JSON_PROPERTY_ISCSI_LUNS_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIscsiLunsIds(List<String> iscsiLunsIds) {
    this.iscsiLunsIds = iscsiLunsIds;
  }


  public ConsistencyGroupUpdationParamsData description(String description) {
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


  public ConsistencyGroupUpdationParamsData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Return true if this ConsistencyGroupUpdationParams_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsistencyGroupUpdationParamsData consistencyGroupUpdationParamsData = (ConsistencyGroupUpdationParamsData) o;
    return Objects.equals(this.remainVolumeSnapshot, consistencyGroupUpdationParamsData.remainVolumeSnapshot) &&
        Objects.equals(this.namespacesIds, consistencyGroupUpdationParamsData.namespacesIds) &&
        Objects.equals(this.iscsiLunsIds, consistencyGroupUpdationParamsData.iscsiLunsIds) &&
        Objects.equals(this.description, consistencyGroupUpdationParamsData.description) &&
        Objects.equals(this.name, consistencyGroupUpdationParamsData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remainVolumeSnapshot, namespacesIds, iscsiLunsIds, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsistencyGroupUpdationParamsData {\n");
    sb.append("    remainVolumeSnapshot: ").append(toIndentedString(remainVolumeSnapshot)).append("\n");
    sb.append("    namespacesIds: ").append(toIndentedString(namespacesIds)).append("\n");
    sb.append("    iscsiLunsIds: ").append(toIndentedString(iscsiLunsIds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

