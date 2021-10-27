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
import com.smartx.tower.model.HostBatchCreateIfaceFunction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * HostBatchCreateIfaceInput
 */
@JsonPropertyOrder({
  HostBatchCreateIfaceInput.JSON_PROPERTY_NETMASK,
  HostBatchCreateIfaceInput.JSON_PROPERTY_NAME,
  HostBatchCreateIfaceInput.JSON_PROPERTY_IP,
  HostBatchCreateIfaceInput.JSON_PROPERTY_FUNCTION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class HostBatchCreateIfaceInput {
  public static final String JSON_PROPERTY_NETMASK = "netmask";
  private String netmask;

  public static final String JSON_PROPERTY_NAME = "name";
  private List<String> name = new ArrayList<>();

  public static final String JSON_PROPERTY_IP = "ip";
  private String ip;

  public static final String JSON_PROPERTY_FUNCTION = "function";
  private HostBatchCreateIfaceFunction function;


  public HostBatchCreateIfaceInput netmask(String netmask) {
    this.netmask = netmask;
    return this;
  }

   /**
   * Get netmask
   * @return netmask
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NETMASK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNetmask() {
    return netmask;
  }


  @JsonProperty(JSON_PROPERTY_NETMASK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNetmask(String netmask) {
    this.netmask = netmask;
  }


  public HostBatchCreateIfaceInput name(List<String> name) {
    this.name = name;
    return this;
  }

  public HostBatchCreateIfaceInput addNameItem(String nameItem) {
    this.name.add(nameItem);
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

  public List<String> getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(List<String> name) {
    this.name = name;
  }


  public HostBatchCreateIfaceInput ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIp() {
    return ip;
  }


  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIp(String ip) {
    this.ip = ip;
  }


  public HostBatchCreateIfaceInput function(HostBatchCreateIfaceFunction function) {
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public HostBatchCreateIfaceFunction getFunction() {
    return function;
  }


  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFunction(HostBatchCreateIfaceFunction function) {
    this.function = function;
  }


  /**
   * Return true if this HostBatchCreateIfaceInput object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostBatchCreateIfaceInput hostBatchCreateIfaceInput = (HostBatchCreateIfaceInput) o;
    return Objects.equals(this.netmask, hostBatchCreateIfaceInput.netmask) &&
        Objects.equals(this.name, hostBatchCreateIfaceInput.name) &&
        Objects.equals(this.ip, hostBatchCreateIfaceInput.ip) &&
        Objects.equals(this.function, hostBatchCreateIfaceInput.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netmask, name, ip, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostBatchCreateIfaceInput {\n");
    sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
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

