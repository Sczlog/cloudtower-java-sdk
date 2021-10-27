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
import com.smartx.tower.model.SnmpAuthProtocol;
import com.smartx.tower.model.SnmpPrivacyProtocol;
import com.smartx.tower.model.SnmpProtocol;
import com.smartx.tower.model.SnmpVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SnmpTransportCreationParams
 */
@JsonPropertyOrder({
  SnmpTransportCreationParams.JSON_PROPERTY_DISABLED,
  SnmpTransportCreationParams.JSON_PROPERTY_PRIVACY_PROTOCOL,
  SnmpTransportCreationParams.JSON_PROPERTY_PRIVACY_PASS_PHRASE,
  SnmpTransportCreationParams.JSON_PROPERTY_AUTH_PROTOCOL,
  SnmpTransportCreationParams.JSON_PROPERTY_AUTH_PASS_PHRASE,
  SnmpTransportCreationParams.JSON_PROPERTY_USERNAME,
  SnmpTransportCreationParams.JSON_PROPERTY_COMMUNITY,
  SnmpTransportCreationParams.JSON_PROPERTY_PORT,
  SnmpTransportCreationParams.JSON_PROPERTY_PROTOCOL,
  SnmpTransportCreationParams.JSON_PROPERTY_VERSION,
  SnmpTransportCreationParams.JSON_PROPERTY_NAME,
  SnmpTransportCreationParams.JSON_PROPERTY_CLUSTER_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class SnmpTransportCreationParams {
  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_PRIVACY_PROTOCOL = "privacy_protocol";
  private SnmpPrivacyProtocol privacyProtocol;

  public static final String JSON_PROPERTY_PRIVACY_PASS_PHRASE = "privacy_pass_phrase";
  private String privacyPassPhrase;

  public static final String JSON_PROPERTY_AUTH_PROTOCOL = "auth_protocol";
  private SnmpAuthProtocol authProtocol;

  public static final String JSON_PROPERTY_AUTH_PASS_PHRASE = "auth_pass_phrase";
  private String authPassPhrase;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_COMMUNITY = "community";
  private String community;

  public static final String JSON_PROPERTY_PORT = "port";
  private Double port;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private SnmpProtocol protocol;

  public static final String JSON_PROPERTY_VERSION = "version";
  private SnmpVersion version;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CLUSTER_ID = "cluster_id";
  private String clusterId;


  public SnmpTransportCreationParams disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisabled() {
    return disabled;
  }


  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public SnmpTransportCreationParams privacyProtocol(SnmpPrivacyProtocol privacyProtocol) {
    this.privacyProtocol = privacyProtocol;
    return this;
  }

   /**
   * Get privacyProtocol
   * @return privacyProtocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIVACY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SnmpPrivacyProtocol getPrivacyProtocol() {
    return privacyProtocol;
  }


  @JsonProperty(JSON_PROPERTY_PRIVACY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivacyProtocol(SnmpPrivacyProtocol privacyProtocol) {
    this.privacyProtocol = privacyProtocol;
  }


  public SnmpTransportCreationParams privacyPassPhrase(String privacyPassPhrase) {
    this.privacyPassPhrase = privacyPassPhrase;
    return this;
  }

   /**
   * Get privacyPassPhrase
   * @return privacyPassPhrase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIVACY_PASS_PHRASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrivacyPassPhrase() {
    return privacyPassPhrase;
  }


  @JsonProperty(JSON_PROPERTY_PRIVACY_PASS_PHRASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivacyPassPhrase(String privacyPassPhrase) {
    this.privacyPassPhrase = privacyPassPhrase;
  }


  public SnmpTransportCreationParams authProtocol(SnmpAuthProtocol authProtocol) {
    this.authProtocol = authProtocol;
    return this;
  }

   /**
   * Get authProtocol
   * @return authProtocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTH_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SnmpAuthProtocol getAuthProtocol() {
    return authProtocol;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthProtocol(SnmpAuthProtocol authProtocol) {
    this.authProtocol = authProtocol;
  }


  public SnmpTransportCreationParams authPassPhrase(String authPassPhrase) {
    this.authPassPhrase = authPassPhrase;
    return this;
  }

   /**
   * Get authPassPhrase
   * @return authPassPhrase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTH_PASS_PHRASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthPassPhrase() {
    return authPassPhrase;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_PASS_PHRASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthPassPhrase(String authPassPhrase) {
    this.authPassPhrase = authPassPhrase;
  }


  public SnmpTransportCreationParams username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  public SnmpTransportCreationParams community(String community) {
    this.community = community;
    return this;
  }

   /**
   * Get community
   * @return community
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMMUNITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommunity() {
    return community;
  }


  @JsonProperty(JSON_PROPERTY_COMMUNITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommunity(String community) {
    this.community = community;
  }


  public SnmpTransportCreationParams port(Double port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPort(Double port) {
    this.port = port;
  }


  public SnmpTransportCreationParams protocol(SnmpProtocol protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SnmpProtocol getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProtocol(SnmpProtocol protocol) {
    this.protocol = protocol;
  }


  public SnmpTransportCreationParams version(SnmpVersion version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SnmpVersion getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(SnmpVersion version) {
    this.version = version;
  }


  public SnmpTransportCreationParams name(String name) {
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


  public SnmpTransportCreationParams clusterId(String clusterId) {
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


  /**
   * Return true if this SnmpTransportCreationParams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnmpTransportCreationParams snmpTransportCreationParams = (SnmpTransportCreationParams) o;
    return Objects.equals(this.disabled, snmpTransportCreationParams.disabled) &&
        Objects.equals(this.privacyProtocol, snmpTransportCreationParams.privacyProtocol) &&
        Objects.equals(this.privacyPassPhrase, snmpTransportCreationParams.privacyPassPhrase) &&
        Objects.equals(this.authProtocol, snmpTransportCreationParams.authProtocol) &&
        Objects.equals(this.authPassPhrase, snmpTransportCreationParams.authPassPhrase) &&
        Objects.equals(this.username, snmpTransportCreationParams.username) &&
        Objects.equals(this.community, snmpTransportCreationParams.community) &&
        Objects.equals(this.port, snmpTransportCreationParams.port) &&
        Objects.equals(this.protocol, snmpTransportCreationParams.protocol) &&
        Objects.equals(this.version, snmpTransportCreationParams.version) &&
        Objects.equals(this.name, snmpTransportCreationParams.name) &&
        Objects.equals(this.clusterId, snmpTransportCreationParams.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, privacyProtocol, privacyPassPhrase, authProtocol, authPassPhrase, username, community, port, protocol, version, name, clusterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnmpTransportCreationParams {\n");
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
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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

