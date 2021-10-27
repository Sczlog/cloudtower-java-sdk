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
import com.smartx.tower.model.VdsCreationWithMigrateVlanParamsAllOfVlanExtraIp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ManagementVlanUpdationParamsData
 */
@JsonPropertyOrder({
  ManagementVlanUpdationParamsData.JSON_PROPERTY_EXTRA_IP,
  ManagementVlanUpdationParamsData.JSON_PROPERTY_SUBNETMASK,
  ManagementVlanUpdationParamsData.JSON_PROPERTY_GATEWAY_IP,
  ManagementVlanUpdationParamsData.JSON_PROPERTY_VLAN_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class ManagementVlanUpdationParamsData {
  public static final String JSON_PROPERTY_EXTRA_IP = "extra_ip";
  private List<VdsCreationWithMigrateVlanParamsAllOfVlanExtraIp> extraIp = null;

  public static final String JSON_PROPERTY_SUBNETMASK = "subnetmask";
  private String subnetmask;

  public static final String JSON_PROPERTY_GATEWAY_IP = "gateway_ip";
  private String gatewayIp;

  public static final String JSON_PROPERTY_VLAN_ID = "vlan_id";
  private Double vlanId;


  public ManagementVlanUpdationParamsData extraIp(List<VdsCreationWithMigrateVlanParamsAllOfVlanExtraIp> extraIp) {
    this.extraIp = extraIp;
    return this;
  }

  public ManagementVlanUpdationParamsData addExtraIpItem(VdsCreationWithMigrateVlanParamsAllOfVlanExtraIp extraIpItem) {
    if (this.extraIp == null) {
      this.extraIp = new ArrayList<>();
    }
    this.extraIp.add(extraIpItem);
    return this;
  }

   /**
   * Get extraIp
   * @return extraIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTRA_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VdsCreationWithMigrateVlanParamsAllOfVlanExtraIp> getExtraIp() {
    return extraIp;
  }


  @JsonProperty(JSON_PROPERTY_EXTRA_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtraIp(List<VdsCreationWithMigrateVlanParamsAllOfVlanExtraIp> extraIp) {
    this.extraIp = extraIp;
  }


  public ManagementVlanUpdationParamsData subnetmask(String subnetmask) {
    this.subnetmask = subnetmask;
    return this;
  }

   /**
   * Get subnetmask
   * @return subnetmask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBNETMASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubnetmask() {
    return subnetmask;
  }


  @JsonProperty(JSON_PROPERTY_SUBNETMASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubnetmask(String subnetmask) {
    this.subnetmask = subnetmask;
  }


  public ManagementVlanUpdationParamsData gatewayIp(String gatewayIp) {
    this.gatewayIp = gatewayIp;
    return this;
  }

   /**
   * Get gatewayIp
   * @return gatewayIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GATEWAY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGatewayIp() {
    return gatewayIp;
  }


  @JsonProperty(JSON_PROPERTY_GATEWAY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGatewayIp(String gatewayIp) {
    this.gatewayIp = gatewayIp;
  }


  public ManagementVlanUpdationParamsData vlanId(Double vlanId) {
    this.vlanId = vlanId;
    return this;
  }

   /**
   * Get vlanId
   * @return vlanId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getVlanId() {
    return vlanId;
  }


  @JsonProperty(JSON_PROPERTY_VLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVlanId(Double vlanId) {
    this.vlanId = vlanId;
  }


  /**
   * Return true if this ManagementVlanUpdationParams_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementVlanUpdationParamsData managementVlanUpdationParamsData = (ManagementVlanUpdationParamsData) o;
    return Objects.equals(this.extraIp, managementVlanUpdationParamsData.extraIp) &&
        Objects.equals(this.subnetmask, managementVlanUpdationParamsData.subnetmask) &&
        Objects.equals(this.gatewayIp, managementVlanUpdationParamsData.gatewayIp) &&
        Objects.equals(this.vlanId, managementVlanUpdationParamsData.vlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraIp, subnetmask, gatewayIp, vlanId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagementVlanUpdationParamsData {\n");
    sb.append("    extraIp: ").append(toIndentedString(extraIp)).append("\n");
    sb.append("    subnetmask: ").append(toIndentedString(subnetmask)).append("\n");
    sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
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

