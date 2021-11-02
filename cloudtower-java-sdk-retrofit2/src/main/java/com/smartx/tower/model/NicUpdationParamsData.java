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
 * NicUpdationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:23:54.291904700+08:00[Asia/Shanghai]")
public class NicUpdationParamsData {
  public static final String SERIALIZED_NAME_TOTAL_VF_NUM = "total_vf_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM)
  private Double totalVfNum;

  public static final String SERIALIZED_NAME_MTU = "mtu";
  @SerializedName(SERIALIZED_NAME_MTU)
  private Double mtu;


  public NicUpdationParamsData totalVfNum(Double totalVfNum) {
    
    this.totalVfNum = totalVfNum;
    return this;
  }

   /**
   * Get totalVfNum
   * @return totalVfNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getTotalVfNum() {
    return totalVfNum;
  }


  public void setTotalVfNum(Double totalVfNum) {
    this.totalVfNum = totalVfNum;
  }


  public NicUpdationParamsData mtu(Double mtu) {
    
    this.mtu = mtu;
    return this;
  }

   /**
   * Get mtu
   * @return mtu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMtu() {
    return mtu;
  }


  public void setMtu(Double mtu) {
    this.mtu = mtu;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NicUpdationParamsData nicUpdationParamsData = (NicUpdationParamsData) o;
    return Objects.equals(this.totalVfNum, nicUpdationParamsData.totalVfNum) &&
        Objects.equals(this.mtu, nicUpdationParamsData.mtu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalVfNum, mtu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NicUpdationParamsData {\n");
    sb.append("    totalVfNum: ").append(toIndentedString(totalVfNum)).append("\n");
    sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
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
