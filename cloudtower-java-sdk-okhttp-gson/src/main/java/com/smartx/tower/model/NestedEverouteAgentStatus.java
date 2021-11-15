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
import com.smartx.tower.model.EverouteClusterPhase;
import com.smartx.tower.model.NestedHost;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NestedEverouteAgentStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NestedEverouteAgentStatus {
  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private NestedHost host;

  public static final String SERIALIZED_NAME_HOST_I_D = "hostID";
  @SerializedName(SERIALIZED_NAME_HOST_I_D)
  private String hostID;

  public static final String SERIALIZED_NAME_IP_ADDR = "ipAddr";
  @SerializedName(SERIALIZED_NAME_IP_ADDR)
  private String ipAddr;

  public static final String SERIALIZED_NAME_IS_HEALTH = "isHealth";
  @SerializedName(SERIALIZED_NAME_IS_HEALTH)
  private Boolean isHealth;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private EverouteClusterPhase phase;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;


  public NestedEverouteAgentStatus host(NestedHost host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedHost getHost() {
    return host;
  }


  public void setHost(NestedHost host) {
    this.host = host;
  }


  public NestedEverouteAgentStatus hostID(String hostID) {
    
    this.hostID = hostID;
    return this;
  }

   /**
   * Get hostID
   * @return hostID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getHostID() {
    return hostID;
  }


  public void setHostID(String hostID) {
    this.hostID = hostID;
  }


  public NestedEverouteAgentStatus ipAddr(String ipAddr) {
    
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


  public NestedEverouteAgentStatus isHealth(Boolean isHealth) {
    
    this.isHealth = isHealth;
    return this;
  }

   /**
   * Get isHealth
   * @return isHealth
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsHealth() {
    return isHealth;
  }


  public void setIsHealth(Boolean isHealth) {
    this.isHealth = isHealth;
  }


  public NestedEverouteAgentStatus message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public NestedEverouteAgentStatus phase(EverouteClusterPhase phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EverouteClusterPhase getPhase() {
    return phase;
  }


  public void setPhase(EverouteClusterPhase phase) {
    this.phase = phase;
  }


  public NestedEverouteAgentStatus reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedEverouteAgentStatus nestedEverouteAgentStatus = (NestedEverouteAgentStatus) o;
    return Objects.equals(this.host, nestedEverouteAgentStatus.host) &&
        Objects.equals(this.hostID, nestedEverouteAgentStatus.hostID) &&
        Objects.equals(this.ipAddr, nestedEverouteAgentStatus.ipAddr) &&
        Objects.equals(this.isHealth, nestedEverouteAgentStatus.isHealth) &&
        Objects.equals(this.message, nestedEverouteAgentStatus.message) &&
        Objects.equals(this.phase, nestedEverouteAgentStatus.phase) &&
        Objects.equals(this.reason, nestedEverouteAgentStatus.reason);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, hostID, ipAddr, isHealth, message, phase, reason);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedEverouteAgentStatus {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    hostID: ").append(toIndentedString(hostID)).append("\n");
    sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
    sb.append("    isHealth: ").append(toIndentedString(isHealth)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
