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
import com.smartx.tower.model.AlertRuleCluster;
import com.smartx.tower.model.EverouteClusterStatusControllersMetrics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * EverouteClusterStatusControllersInstances
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:23:12.632307300+08:00[Asia/Shanghai]")
public class EverouteClusterStatusControllersInstances {
  public static final String SERIALIZED_NAME_VM_I_D = "vmID";
  @SerializedName(SERIALIZED_NAME_VM_I_D)
  private String vmID;

  public static final String SERIALIZED_NAME_VM = "vm";
  @SerializedName(SERIALIZED_NAME_VM)
  private AlertRuleCluster vm;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private EverouteClusterStatusControllersMetrics metrics;

  public static final String SERIALIZED_NAME_IS_HEALTH = "isHealth";
  @SerializedName(SERIALIZED_NAME_IS_HEALTH)
  private Boolean isHealth;


  public EverouteClusterStatusControllersInstances vmID(String vmID) {
    
    this.vmID = vmID;
    return this;
  }

   /**
   * Get vmID
   * @return vmID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVmID() {
    return vmID;
  }


  public void setVmID(String vmID) {
    this.vmID = vmID;
  }


  public EverouteClusterStatusControllersInstances vm(AlertRuleCluster vm) {
    
    this.vm = vm;
    return this;
  }

   /**
   * Get vm
   * @return vm
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AlertRuleCluster getVm() {
    return vm;
  }


  public void setVm(AlertRuleCluster vm) {
    this.vm = vm;
  }


  public EverouteClusterStatusControllersInstances metrics(EverouteClusterStatusControllersMetrics metrics) {
    
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EverouteClusterStatusControllersMetrics getMetrics() {
    return metrics;
  }


  public void setMetrics(EverouteClusterStatusControllersMetrics metrics) {
    this.metrics = metrics;
  }


  public EverouteClusterStatusControllersInstances isHealth(Boolean isHealth) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EverouteClusterStatusControllersInstances everouteClusterStatusControllersInstances = (EverouteClusterStatusControllersInstances) o;
    return Objects.equals(this.vmID, everouteClusterStatusControllersInstances.vmID) &&
        Objects.equals(this.vm, everouteClusterStatusControllersInstances.vm) &&
        Objects.equals(this.metrics, everouteClusterStatusControllersInstances.metrics) &&
        Objects.equals(this.isHealth, everouteClusterStatusControllersInstances.isHealth);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmID, vm, metrics, isHealth);
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
    sb.append("class EverouteClusterStatusControllersInstances {\n");
    sb.append("    vmID: ").append(toIndentedString(vmID)).append("\n");
    sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    isHealth: ").append(toIndentedString(isHealth)).append("\n");
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

