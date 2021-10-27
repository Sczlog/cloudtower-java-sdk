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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * VmTemplateCreationParams
 */
@JsonPropertyOrder({
  VmTemplateCreationParams.JSON_PROPERTY_CLUSTER_ID,
  VmTemplateCreationParams.JSON_PROPERTY_CLOUD_INIT_SUPPORTED,
  VmTemplateCreationParams.JSON_PROPERTY_VM_ID,
  VmTemplateCreationParams.JSON_PROPERTY_DESCRIPTION,
  VmTemplateCreationParams.JSON_PROPERTY_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class VmTemplateCreationParams {
  public static final String JSON_PROPERTY_CLUSTER_ID = "cluster_id";
  private String clusterId;

  public static final String JSON_PROPERTY_CLOUD_INIT_SUPPORTED = "cloud_init_supported";
  private Boolean cloudInitSupported;

  public static final String JSON_PROPERTY_VM_ID = "vm_id";
  private String vmId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public VmTemplateCreationParams clusterId(String clusterId) {
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


  public VmTemplateCreationParams cloudInitSupported(Boolean cloudInitSupported) {
    this.cloudInitSupported = cloudInitSupported;
    return this;
  }

   /**
   * Get cloudInitSupported
   * @return cloudInitSupported
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_INIT_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCloudInitSupported() {
    return cloudInitSupported;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_INIT_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCloudInitSupported(Boolean cloudInitSupported) {
    this.cloudInitSupported = cloudInitSupported;
  }


  public VmTemplateCreationParams vmId(String vmId) {
    this.vmId = vmId;
    return this;
  }

   /**
   * Get vmId
   * @return vmId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVmId() {
    return vmId;
  }


  @JsonProperty(JSON_PROPERTY_VM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVmId(String vmId) {
    this.vmId = vmId;
  }


  public VmTemplateCreationParams description(String description) {
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


  public VmTemplateCreationParams name(String name) {
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
   * Return true if this VmTemplateCreationParams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmTemplateCreationParams vmTemplateCreationParams = (VmTemplateCreationParams) o;
    return Objects.equals(this.clusterId, vmTemplateCreationParams.clusterId) &&
        Objects.equals(this.cloudInitSupported, vmTemplateCreationParams.cloudInitSupported) &&
        Objects.equals(this.vmId, vmTemplateCreationParams.vmId) &&
        Objects.equals(this.description, vmTemplateCreationParams.description) &&
        Objects.equals(this.name, vmTemplateCreationParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, cloudInitSupported, vmId, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmTemplateCreationParams {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    cloudInitSupported: ").append(toIndentedString(cloudInitSupported)).append("\n");
    sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
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

