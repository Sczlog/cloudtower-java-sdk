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
import com.smartx.tower.model.EverouteClusterStatusAgentsInstances;
import com.smartx.tower.model.EverouteClusterStatusAgentsManageVDSes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * EverouteClusterStatusAgents
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EverouteClusterStatusAgents {
  public static final String SERIALIZED_NAME_NUMBER_HEALTH = "numberHealth";
  @SerializedName(SERIALIZED_NAME_NUMBER_HEALTH)
  private Integer numberHealth;

  public static final String SERIALIZED_NAME_MANAGE_V_D_SES = "manageVDSes";
  @SerializedName(SERIALIZED_NAME_MANAGE_V_D_SES)
  private List<EverouteClusterStatusAgentsManageVDSes> manageVDSes = null;

  public static final String SERIALIZED_NAME_INSTANCES = "instances";
  @SerializedName(SERIALIZED_NAME_INSTANCES)
  private List<EverouteClusterStatusAgentsInstances> instances = null;

  public static final String SERIALIZED_NAME_EXPECT_NUMBER = "expectNumber";
  @SerializedName(SERIALIZED_NAME_EXPECT_NUMBER)
  private Integer expectNumber;

  public static final String SERIALIZED_NAME_ELF_CLUSTER_NUMBER = "elfClusterNumber";
  @SerializedName(SERIALIZED_NAME_ELF_CLUSTER_NUMBER)
  private Integer elfClusterNumber;

  public static final String SERIALIZED_NAME_CURRENT_NUMBER = "currentNumber";
  @SerializedName(SERIALIZED_NAME_CURRENT_NUMBER)
  private Integer currentNumber;


  public EverouteClusterStatusAgents numberHealth(Integer numberHealth) {
    
    this.numberHealth = numberHealth;
    return this;
  }

   /**
   * Get numberHealth
   * @return numberHealth
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getNumberHealth() {
    return numberHealth;
  }


  public void setNumberHealth(Integer numberHealth) {
    this.numberHealth = numberHealth;
  }


  public EverouteClusterStatusAgents manageVDSes(List<EverouteClusterStatusAgentsManageVDSes> manageVDSes) {
    
    this.manageVDSes = manageVDSes;
    return this;
  }

  public EverouteClusterStatusAgents addManageVDSesItem(EverouteClusterStatusAgentsManageVDSes manageVDSesItem) {
    if (this.manageVDSes == null) {
      this.manageVDSes = new ArrayList<EverouteClusterStatusAgentsManageVDSes>();
    }
    this.manageVDSes.add(manageVDSesItem);
    return this;
  }

   /**
   * Get manageVDSes
   * @return manageVDSes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EverouteClusterStatusAgentsManageVDSes> getManageVDSes() {
    return manageVDSes;
  }


  public void setManageVDSes(List<EverouteClusterStatusAgentsManageVDSes> manageVDSes) {
    this.manageVDSes = manageVDSes;
  }


  public EverouteClusterStatusAgents instances(List<EverouteClusterStatusAgentsInstances> instances) {
    
    this.instances = instances;
    return this;
  }

  public EverouteClusterStatusAgents addInstancesItem(EverouteClusterStatusAgentsInstances instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<EverouteClusterStatusAgentsInstances>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Get instances
   * @return instances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EverouteClusterStatusAgentsInstances> getInstances() {
    return instances;
  }


  public void setInstances(List<EverouteClusterStatusAgentsInstances> instances) {
    this.instances = instances;
  }


  public EverouteClusterStatusAgents expectNumber(Integer expectNumber) {
    
    this.expectNumber = expectNumber;
    return this;
  }

   /**
   * Get expectNumber
   * @return expectNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getExpectNumber() {
    return expectNumber;
  }


  public void setExpectNumber(Integer expectNumber) {
    this.expectNumber = expectNumber;
  }


  public EverouteClusterStatusAgents elfClusterNumber(Integer elfClusterNumber) {
    
    this.elfClusterNumber = elfClusterNumber;
    return this;
  }

   /**
   * Get elfClusterNumber
   * @return elfClusterNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getElfClusterNumber() {
    return elfClusterNumber;
  }


  public void setElfClusterNumber(Integer elfClusterNumber) {
    this.elfClusterNumber = elfClusterNumber;
  }


  public EverouteClusterStatusAgents currentNumber(Integer currentNumber) {
    
    this.currentNumber = currentNumber;
    return this;
  }

   /**
   * Get currentNumber
   * @return currentNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCurrentNumber() {
    return currentNumber;
  }


  public void setCurrentNumber(Integer currentNumber) {
    this.currentNumber = currentNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EverouteClusterStatusAgents everouteClusterStatusAgents = (EverouteClusterStatusAgents) o;
    return Objects.equals(this.numberHealth, everouteClusterStatusAgents.numberHealth) &&
        Objects.equals(this.manageVDSes, everouteClusterStatusAgents.manageVDSes) &&
        Objects.equals(this.instances, everouteClusterStatusAgents.instances) &&
        Objects.equals(this.expectNumber, everouteClusterStatusAgents.expectNumber) &&
        Objects.equals(this.elfClusterNumber, everouteClusterStatusAgents.elfClusterNumber) &&
        Objects.equals(this.currentNumber, everouteClusterStatusAgents.currentNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberHealth, manageVDSes, instances, expectNumber, elfClusterNumber, currentNumber);
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
    sb.append("class EverouteClusterStatusAgents {\n");
    sb.append("    numberHealth: ").append(toIndentedString(numberHealth)).append("\n");
    sb.append("    manageVDSes: ").append(toIndentedString(manageVDSes)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    expectNumber: ").append(toIndentedString(expectNumber)).append("\n");
    sb.append("    elfClusterNumber: ").append(toIndentedString(elfClusterNumber)).append("\n");
    sb.append("    currentNumber: ").append(toIndentedString(currentNumber)).append("\n");
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

