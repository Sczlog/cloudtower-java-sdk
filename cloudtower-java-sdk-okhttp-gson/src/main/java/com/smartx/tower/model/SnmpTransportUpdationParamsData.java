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
import com.smartx.tower.model.SnmpAuthProtocol;
import com.smartx.tower.model.SnmpPrivacyProtocol;
import com.smartx.tower.model.SnmpProtocol;
import com.smartx.tower.model.SnmpVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SnmpTransportUpdationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T16:05:01.910402800+08:00[Asia/Shanghai]")
public class SnmpTransportUpdationParamsData {
  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_PRIVACY_PROTOCOL = "privacy_protocol";
  @SerializedName(SERIALIZED_NAME_PRIVACY_PROTOCOL)
  private SnmpPrivacyProtocol privacyProtocol;

  public static final String SERIALIZED_NAME_PRIVACY_PASS_PHRASE = "privacy_pass_phrase";
  @SerializedName(SERIALIZED_NAME_PRIVACY_PASS_PHRASE)
  private String privacyPassPhrase;

  public static final String SERIALIZED_NAME_AUTH_PROTOCOL = "auth_protocol";
  @SerializedName(SERIALIZED_NAME_AUTH_PROTOCOL)
  private SnmpAuthProtocol authProtocol;

  public static final String SERIALIZED_NAME_AUTH_PASS_PHRASE = "auth_pass_phrase";
  @SerializedName(SERIALIZED_NAME_AUTH_PASS_PHRASE)
  private String authPassPhrase;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_COMMUNITY = "community";
  @SerializedName(SERIALIZED_NAME_COMMUNITY)
  private String community;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Double port;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private SnmpProtocol protocol;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private SnmpVersion version;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public SnmpTransportUpdationParamsData disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public SnmpTransportUpdationParamsData privacyProtocol(SnmpPrivacyProtocol privacyProtocol) {
    
    this.privacyProtocol = privacyProtocol;
    return this;
  }

   /**
   * Get privacyProtocol
   * @return privacyProtocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SnmpPrivacyProtocol getPrivacyProtocol() {
    return privacyProtocol;
  }


  public void setPrivacyProtocol(SnmpPrivacyProtocol privacyProtocol) {
    this.privacyProtocol = privacyProtocol;
  }


  public SnmpTransportUpdationParamsData privacyPassPhrase(String privacyPassPhrase) {
    
    this.privacyPassPhrase = privacyPassPhrase;
    return this;
  }

   /**
   * Get privacyPassPhrase
   * @return privacyPassPhrase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrivacyPassPhrase() {
    return privacyPassPhrase;
  }


  public void setPrivacyPassPhrase(String privacyPassPhrase) {
    this.privacyPassPhrase = privacyPassPhrase;
  }


  public SnmpTransportUpdationParamsData authProtocol(SnmpAuthProtocol authProtocol) {
    
    this.authProtocol = authProtocol;
    return this;
  }

   /**
   * Get authProtocol
   * @return authProtocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SnmpAuthProtocol getAuthProtocol() {
    return authProtocol;
  }


  public void setAuthProtocol(SnmpAuthProtocol authProtocol) {
    this.authProtocol = authProtocol;
  }


  public SnmpTransportUpdationParamsData authPassPhrase(String authPassPhrase) {
    
    this.authPassPhrase = authPassPhrase;
    return this;
  }

   /**
   * Get authPassPhrase
   * @return authPassPhrase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthPassPhrase() {
    return authPassPhrase;
  }


  public void setAuthPassPhrase(String authPassPhrase) {
    this.authPassPhrase = authPassPhrase;
  }


  public SnmpTransportUpdationParamsData username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public SnmpTransportUpdationParamsData community(String community) {
    
    this.community = community;
    return this;
  }

   /**
   * Get community
   * @return community
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCommunity() {
    return community;
  }


  public void setCommunity(String community) {
    this.community = community;
  }


  public SnmpTransportUpdationParamsData port(Double port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getPort() {
    return port;
  }


  public void setPort(Double port) {
    this.port = port;
  }


  public SnmpTransportUpdationParamsData protocol(SnmpProtocol protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SnmpProtocol getProtocol() {
    return protocol;
  }


  public void setProtocol(SnmpProtocol protocol) {
    this.protocol = protocol;
  }


  public SnmpTransportUpdationParamsData version(SnmpVersion version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SnmpVersion getVersion() {
    return version;
  }


  public void setVersion(SnmpVersion version) {
    this.version = version;
  }


  public SnmpTransportUpdationParamsData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnmpTransportUpdationParamsData snmpTransportUpdationParamsData = (SnmpTransportUpdationParamsData) o;
    return Objects.equals(this.disabled, snmpTransportUpdationParamsData.disabled) &&
        Objects.equals(this.privacyProtocol, snmpTransportUpdationParamsData.privacyProtocol) &&
        Objects.equals(this.privacyPassPhrase, snmpTransportUpdationParamsData.privacyPassPhrase) &&
        Objects.equals(this.authProtocol, snmpTransportUpdationParamsData.authProtocol) &&
        Objects.equals(this.authPassPhrase, snmpTransportUpdationParamsData.authPassPhrase) &&
        Objects.equals(this.username, snmpTransportUpdationParamsData.username) &&
        Objects.equals(this.community, snmpTransportUpdationParamsData.community) &&
        Objects.equals(this.port, snmpTransportUpdationParamsData.port) &&
        Objects.equals(this.protocol, snmpTransportUpdationParamsData.protocol) &&
        Objects.equals(this.version, snmpTransportUpdationParamsData.version) &&
        Objects.equals(this.name, snmpTransportUpdationParamsData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, privacyProtocol, privacyPassPhrase, authProtocol, authPassPhrase, username, community, port, protocol, version, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnmpTransportUpdationParamsData {\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    privacyProtocol: ").append(toIndentedString(privacyProtocol)).append("\n");
    sb.append("    privacyPassPhrase: ").append(toIndentedString(privacyPassPhrase)).append("\n");
    sb.append("    authProtocol: ").append(toIndentedString(authProtocol)).append("\n");
    sb.append("    authPassPhrase: ").append(toIndentedString(authPassPhrase)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    community: ").append(toIndentedString(community)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

