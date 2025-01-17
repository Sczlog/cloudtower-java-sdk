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
import com.smartx.tower.model.SnmpLanguageCode;
import com.smartx.tower.model.SnmpPrivacyProtocol;
import com.smartx.tower.model.SnmpProtocol;
import com.smartx.tower.model.SnmpVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SnmpTrapReceiverUpdationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SnmpTrapReceiverUpdationParamsData {
  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_INFORM = "inform";
  @SerializedName(SERIALIZED_NAME_INFORM)
  private Boolean inform;

  public static final String SERIALIZED_NAME_ENGINE_ID = "engine_id";
  @SerializedName(SERIALIZED_NAME_ENGINE_ID)
  private String engineId;

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

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private SnmpLanguageCode languageCode;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private SnmpProtocol protocol;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private SnmpVersion version;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public SnmpTrapReceiverUpdationParamsData disabled(Boolean disabled) {
    
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


  public SnmpTrapReceiverUpdationParamsData inform(Boolean inform) {
    
    this.inform = inform;
    return this;
  }

   /**
   * Get inform
   * @return inform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInform() {
    return inform;
  }


  public void setInform(Boolean inform) {
    this.inform = inform;
  }


  public SnmpTrapReceiverUpdationParamsData engineId(String engineId) {
    
    this.engineId = engineId;
    return this;
  }

   /**
   * Get engineId
   * @return engineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEngineId() {
    return engineId;
  }


  public void setEngineId(String engineId) {
    this.engineId = engineId;
  }


  public SnmpTrapReceiverUpdationParamsData privacyProtocol(SnmpPrivacyProtocol privacyProtocol) {
    
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


  public SnmpTrapReceiverUpdationParamsData privacyPassPhrase(String privacyPassPhrase) {
    
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


  public SnmpTrapReceiverUpdationParamsData authProtocol(SnmpAuthProtocol authProtocol) {
    
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


  public SnmpTrapReceiverUpdationParamsData authPassPhrase(String authPassPhrase) {
    
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


  public SnmpTrapReceiverUpdationParamsData username(String username) {
    
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


  public SnmpTrapReceiverUpdationParamsData community(String community) {
    
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


  public SnmpTrapReceiverUpdationParamsData languageCode(SnmpLanguageCode languageCode) {
    
    this.languageCode = languageCode;
    return this;
  }

   /**
   * Get languageCode
   * @return languageCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SnmpLanguageCode getLanguageCode() {
    return languageCode;
  }


  public void setLanguageCode(SnmpLanguageCode languageCode) {
    this.languageCode = languageCode;
  }


  public SnmpTrapReceiverUpdationParamsData port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public SnmpTrapReceiverUpdationParamsData host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public SnmpTrapReceiverUpdationParamsData protocol(SnmpProtocol protocol) {
    
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


  public SnmpTrapReceiverUpdationParamsData version(SnmpVersion version) {
    
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


  public SnmpTrapReceiverUpdationParamsData name(String name) {
    
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
    SnmpTrapReceiverUpdationParamsData snmpTrapReceiverUpdationParamsData = (SnmpTrapReceiverUpdationParamsData) o;
    return Objects.equals(this.disabled, snmpTrapReceiverUpdationParamsData.disabled) &&
        Objects.equals(this.inform, snmpTrapReceiverUpdationParamsData.inform) &&
        Objects.equals(this.engineId, snmpTrapReceiverUpdationParamsData.engineId) &&
        Objects.equals(this.privacyProtocol, snmpTrapReceiverUpdationParamsData.privacyProtocol) &&
        Objects.equals(this.privacyPassPhrase, snmpTrapReceiverUpdationParamsData.privacyPassPhrase) &&
        Objects.equals(this.authProtocol, snmpTrapReceiverUpdationParamsData.authProtocol) &&
        Objects.equals(this.authPassPhrase, snmpTrapReceiverUpdationParamsData.authPassPhrase) &&
        Objects.equals(this.username, snmpTrapReceiverUpdationParamsData.username) &&
        Objects.equals(this.community, snmpTrapReceiverUpdationParamsData.community) &&
        Objects.equals(this.languageCode, snmpTrapReceiverUpdationParamsData.languageCode) &&
        Objects.equals(this.port, snmpTrapReceiverUpdationParamsData.port) &&
        Objects.equals(this.host, snmpTrapReceiverUpdationParamsData.host) &&
        Objects.equals(this.protocol, snmpTrapReceiverUpdationParamsData.protocol) &&
        Objects.equals(this.version, snmpTrapReceiverUpdationParamsData.version) &&
        Objects.equals(this.name, snmpTrapReceiverUpdationParamsData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, inform, engineId, privacyProtocol, privacyPassPhrase, authProtocol, authPassPhrase, username, community, languageCode, port, host, protocol, version, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnmpTrapReceiverUpdationParamsData {\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    inform: ").append(toIndentedString(inform)).append("\n");
    sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
    sb.append("    privacyProtocol: ").append(toIndentedString(privacyProtocol)).append("\n");
    sb.append("    privacyPassPhrase: ").append(toIndentedString(privacyPassPhrase)).append("\n");
    sb.append("    authProtocol: ").append(toIndentedString(authProtocol)).append("\n");
    sb.append("    authPassPhrase: ").append(toIndentedString(authPassPhrase)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    community: ").append(toIndentedString(community)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
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

