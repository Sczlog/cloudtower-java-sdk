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
import com.smartx.tower.model.ConsistentType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * VmSnapshotCreationParamsData
 */
@JsonPropertyOrder({
  VmSnapshotCreationParamsData.JSON_PROPERTY_CONSISTENT_TYPE,
  VmSnapshotCreationParamsData.JSON_PROPERTY_NAME,
  VmSnapshotCreationParamsData.JSON_PROPERTY_VM_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class VmSnapshotCreationParamsData {
  public static final String JSON_PROPERTY_CONSISTENT_TYPE = "consistent_type";
  private ConsistentType consistentType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VM_ID = "vm_id";
  private String vmId;


  public VmSnapshotCreationParamsData consistentType(ConsistentType consistentType) {
    this.consistentType = consistentType;
    return this;
  }

   /**
   * Get consistentType
   * @return consistentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONSISTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConsistentType getConsistentType() {
    return consistentType;
  }


  @JsonProperty(JSON_PROPERTY_CONSISTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsistentType(ConsistentType consistentType) {
    this.consistentType = consistentType;
  }


  public VmSnapshotCreationParamsData name(String name) {
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


  public VmSnapshotCreationParamsData vmId(String vmId) {
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


  /**
   * Return true if this VmSnapshotCreationParams_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmSnapshotCreationParamsData vmSnapshotCreationParamsData = (VmSnapshotCreationParamsData) o;
    return Objects.equals(this.consistentType, vmSnapshotCreationParamsData.consistentType) &&
        Objects.equals(this.name, vmSnapshotCreationParamsData.name) &&
        Objects.equals(this.vmId, vmSnapshotCreationParamsData.vmId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consistentType, name, vmId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmSnapshotCreationParamsData {\n");
    sb.append("    consistentType: ").append(toIndentedString(consistentType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
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

