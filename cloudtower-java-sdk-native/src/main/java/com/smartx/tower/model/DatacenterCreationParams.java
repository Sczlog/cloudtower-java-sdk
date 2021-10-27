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
import com.smartx.tower.model.ClusterWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DatacenterCreationParams
 */
@JsonPropertyOrder({
  DatacenterCreationParams.JSON_PROPERTY_CLUSTERS,
  DatacenterCreationParams.JSON_PROPERTY_ORGANIZATION_ID,
  DatacenterCreationParams.JSON_PROPERTY_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class DatacenterCreationParams {
  public static final String JSON_PROPERTY_CLUSTERS = "clusters";
  private ClusterWhereInput clusters;

  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organization_id";
  private String organizationId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public DatacenterCreationParams clusters(ClusterWhereInput clusters) {
    this.clusters = clusters;
    return this;
  }

   /**
   * Get clusters
   * @return clusters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLUSTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ClusterWhereInput getClusters() {
    return clusters;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClusters(ClusterWhereInput clusters) {
    this.clusters = clusters;
  }


  public DatacenterCreationParams organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOrganizationId() {
    return organizationId;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  public DatacenterCreationParams name(String name) {
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
   * Return true if this DatacenterCreationParams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatacenterCreationParams datacenterCreationParams = (DatacenterCreationParams) o;
    return Objects.equals(this.clusters, datacenterCreationParams.clusters) &&
        Objects.equals(this.organizationId, datacenterCreationParams.organizationId) &&
        Objects.equals(this.name, datacenterCreationParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusters, organizationId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatacenterCreationParams {\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
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

