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
import java.util.ArrayList;
import java.util.List;

/**
 * VdsUpdationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:23:12.632307300+08:00[Asia/Shanghai]")
public class VdsUpdationParamsData {
  public static final String SERIALIZED_NAME_NIC_IDS = "nicIds";
  @SerializedName(SERIALIZED_NAME_NIC_IDS)
  private List<String> nicIds = null;

  public static final String SERIALIZED_NAME_BOND_MODE = "bond_mode";
  @SerializedName(SERIALIZED_NAME_BOND_MODE)
  private String bondMode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public VdsUpdationParamsData nicIds(List<String> nicIds) {
    
    this.nicIds = nicIds;
    return this;
  }

  public VdsUpdationParamsData addNicIdsItem(String nicIdsItem) {
    if (this.nicIds == null) {
      this.nicIds = new ArrayList<String>();
    }
    this.nicIds.add(nicIdsItem);
    return this;
  }

   /**
   * Get nicIds
   * @return nicIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNicIds() {
    return nicIds;
  }


  public void setNicIds(List<String> nicIds) {
    this.nicIds = nicIds;
  }


  public VdsUpdationParamsData bondMode(String bondMode) {
    
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


  public VdsUpdationParamsData name(String name) {
    
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
    VdsUpdationParamsData vdsUpdationParamsData = (VdsUpdationParamsData) o;
    return Objects.equals(this.nicIds, vdsUpdationParamsData.nicIds) &&
        Objects.equals(this.bondMode, vdsUpdationParamsData.bondMode) &&
        Objects.equals(this.name, vdsUpdationParamsData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nicIds, bondMode, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VdsUpdationParamsData {\n");
    sb.append("    nicIds: ").append(toIndentedString(nicIds)).append("\n");
    sb.append("    bondMode: ").append(toIndentedString(bondMode)).append("\n");
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
