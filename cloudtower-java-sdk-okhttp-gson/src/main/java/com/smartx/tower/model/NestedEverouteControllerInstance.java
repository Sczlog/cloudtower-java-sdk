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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NestedEverouteControllerInstance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NestedEverouteControllerInstance {
  public static final String SERIALIZED_NAME_IP_ADDR = "ipAddr";
  @SerializedName(SERIALIZED_NAME_IP_ADDR)
  private String ipAddr;

  public static final String SERIALIZED_NAME_VLAN = "vlan";
  @SerializedName(SERIALIZED_NAME_VLAN)
  private String vlan;


  public NestedEverouteControllerInstance ipAddr(String ipAddr) {
    
    this.ipAddr = ipAddr;
    return this;
  }

   /**
   * Get ipAddr
   * @return ipAddr
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIpAddr() {
    return ipAddr;
  }


  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }


  public NestedEverouteControllerInstance vlan(String vlan) {
    
    this.vlan = vlan;
    return this;
  }

   /**
   * Get vlan
   * @return vlan
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVlan() {
    return vlan;
  }


  public void setVlan(String vlan) {
    this.vlan = vlan;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedEverouteControllerInstance nestedEverouteControllerInstance = (NestedEverouteControllerInstance) o;
    return Objects.equals(this.ipAddr, nestedEverouteControllerInstance.ipAddr) &&
        Objects.equals(this.vlan, nestedEverouteControllerInstance.vlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddr, vlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedEverouteControllerInstance {\n");
    sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
    sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
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

