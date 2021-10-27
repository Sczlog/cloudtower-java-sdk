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
import com.smartx.tower.model.VdsCreationParams;
import com.smartx.tower.model.VdsCreationWithMigrateVlanParamsAllOf;
import com.smartx.tower.model.VdsCreationWithMigrateVlanParamsAllOfVlan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * VdsCreationWithMAccessVlanParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:23:12.632307300+08:00[Asia/Shanghai]")
public class VdsCreationWithMAccessVlanParams {
  public static final String SERIALIZED_NAME_NIC_IDS = "nic_ids";
  @SerializedName(SERIALIZED_NAME_NIC_IDS)
  private List<String> nicIds = new ArrayList<String>();

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public static final String SERIALIZED_NAME_BOND_MODE = "bond_mode";
  @SerializedName(SERIALIZED_NAME_BOND_MODE)
  private String bondMode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VLAN = "vlan";
  @SerializedName(SERIALIZED_NAME_VLAN)
  private VdsCreationWithMigrateVlanParamsAllOfVlan vlan;


  public VdsCreationWithMAccessVlanParams nicIds(List<String> nicIds) {
    
    this.nicIds = nicIds;
    return this;
  }

  public VdsCreationWithMAccessVlanParams addNicIdsItem(String nicIdsItem) {
    this.nicIds.add(nicIdsItem);
    return this;
  }

   /**
   * Get nicIds
   * @return nicIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getNicIds() {
    return nicIds;
  }


  public void setNicIds(List<String> nicIds) {
    this.nicIds = nicIds;
  }


  public VdsCreationWithMAccessVlanParams clusterId(String clusterId) {
    
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getClusterId() {
    return clusterId;
  }


  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }


  public VdsCreationWithMAccessVlanParams bondMode(String bondMode) {
    
    this.bondMode = bondMode;
    return this;
  }

   /**
   * Get bondMode
   * @return bondMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBondMode() {
    return bondMode;
  }


  public void setBondMode(String bondMode) {
    this.bondMode = bondMode;
  }


  public VdsCreationWithMAccessVlanParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public VdsCreationWithMAccessVlanParams vlan(VdsCreationWithMigrateVlanParamsAllOfVlan vlan) {
    
    this.vlan = vlan;
    return this;
  }

   /**
   * Get vlan
   * @return vlan
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VdsCreationWithMigrateVlanParamsAllOfVlan getVlan() {
    return vlan;
  }


  public void setVlan(VdsCreationWithMigrateVlanParamsAllOfVlan vlan) {
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
    VdsCreationWithMAccessVlanParams vdsCreationWithMAccessVlanParams = (VdsCreationWithMAccessVlanParams) o;
    return Objects.equals(this.nicIds, vdsCreationWithMAccessVlanParams.nicIds) &&
        Objects.equals(this.clusterId, vdsCreationWithMAccessVlanParams.clusterId) &&
        Objects.equals(this.bondMode, vdsCreationWithMAccessVlanParams.bondMode) &&
        Objects.equals(this.name, vdsCreationWithMAccessVlanParams.name) &&
        Objects.equals(this.vlan, vdsCreationWithMAccessVlanParams.vlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nicIds, clusterId, bondMode, name, vlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VdsCreationWithMAccessVlanParams {\n");
    sb.append("    nicIds: ").append(toIndentedString(nicIds)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    bondMode: ").append(toIndentedString(bondMode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

