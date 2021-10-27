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
 * IscsiLunCommonParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:23:12.632307300+08:00[Asia/Shanghai]")
public class IscsiLunCommonParams {
  public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH = "bps_wr_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH)
  private Double bpsWrMaxLength;

  public static final String SERIALIZED_NAME_BPS_WR_MAX = "bps_wr_max";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX)
  private Double bpsWrMax;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH = "bps_rd_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH)
  private Double bpsRdMaxLength;

  public static final String SERIALIZED_NAME_BPS_RD_MAX = "bps_rd_max";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX)
  private Double bpsRdMax;

  public static final String SERIALIZED_NAME_BPS_MAX_LENGTH = "bps_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH)
  private Double bpsMaxLength;

  public static final String SERIALIZED_NAME_BPS_MAX = "bps_max";
  @SerializedName(SERIALIZED_NAME_BPS_MAX)
  private Double bpsMax;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH = "iops_wr_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH)
  private Double iopsWrMaxLength;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX = "iops_wr_max";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX)
  private Double iopsWrMax;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH = "iops_rd_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH)
  private Double iopsRdMaxLength;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX = "iops_rd_max";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX)
  private Double iopsRdMax;

  public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH = "iops_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH)
  private Double iopsMaxLength;

  public static final String SERIALIZED_NAME_IOPS_MAX = "iops_max";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX)
  private Double iopsMax;

  public static final String SERIALIZED_NAME_BPS_WR = "bps_wr";
  @SerializedName(SERIALIZED_NAME_BPS_WR)
  private Double bpsWr;

  public static final String SERIALIZED_NAME_BPS_RD = "bps_rd";
  @SerializedName(SERIALIZED_NAME_BPS_RD)
  private Double bpsRd;

  public static final String SERIALIZED_NAME_BPS = "bps";
  @SerializedName(SERIALIZED_NAME_BPS)
  private Double bps;

  public static final String SERIALIZED_NAME_IOPS_WR = "iops_wr";
  @SerializedName(SERIALIZED_NAME_IOPS_WR)
  private Double iopsWr;

  public static final String SERIALIZED_NAME_IOPS_RD = "iops_rd";
  @SerializedName(SERIALIZED_NAME_IOPS_RD)
  private Double iopsRd;

  public static final String SERIALIZED_NAME_IOPS = "iops";
  @SerializedName(SERIALIZED_NAME_IOPS)
  private Double iops;

  public static final String SERIALIZED_NAME_ALLOWED_INITIATORS = "allowed_initiators";
  @SerializedName(SERIALIZED_NAME_ALLOWED_INITIATORS)
  private String allowedInitiators;


  public IscsiLunCommonParams bpsWrMaxLength(Double bpsWrMaxLength) {
    
    this.bpsWrMaxLength = bpsWrMaxLength;
    return this;
  }

   /**
   * Get bpsWrMaxLength
   * @return bpsWrMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsWrMaxLength() {
    return bpsWrMaxLength;
  }


  public void setBpsWrMaxLength(Double bpsWrMaxLength) {
    this.bpsWrMaxLength = bpsWrMaxLength;
  }


  public IscsiLunCommonParams bpsWrMax(Double bpsWrMax) {
    
    this.bpsWrMax = bpsWrMax;
    return this;
  }

   /**
   * Get bpsWrMax
   * @return bpsWrMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsWrMax() {
    return bpsWrMax;
  }


  public void setBpsWrMax(Double bpsWrMax) {
    this.bpsWrMax = bpsWrMax;
  }


  public IscsiLunCommonParams bpsRdMaxLength(Double bpsRdMaxLength) {
    
    this.bpsRdMaxLength = bpsRdMaxLength;
    return this;
  }

   /**
   * Get bpsRdMaxLength
   * @return bpsRdMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsRdMaxLength() {
    return bpsRdMaxLength;
  }


  public void setBpsRdMaxLength(Double bpsRdMaxLength) {
    this.bpsRdMaxLength = bpsRdMaxLength;
  }


  public IscsiLunCommonParams bpsRdMax(Double bpsRdMax) {
    
    this.bpsRdMax = bpsRdMax;
    return this;
  }

   /**
   * Get bpsRdMax
   * @return bpsRdMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsRdMax() {
    return bpsRdMax;
  }


  public void setBpsRdMax(Double bpsRdMax) {
    this.bpsRdMax = bpsRdMax;
  }


  public IscsiLunCommonParams bpsMaxLength(Double bpsMaxLength) {
    
    this.bpsMaxLength = bpsMaxLength;
    return this;
  }

   /**
   * Get bpsMaxLength
   * @return bpsMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsMaxLength() {
    return bpsMaxLength;
  }


  public void setBpsMaxLength(Double bpsMaxLength) {
    this.bpsMaxLength = bpsMaxLength;
  }


  public IscsiLunCommonParams bpsMax(Double bpsMax) {
    
    this.bpsMax = bpsMax;
    return this;
  }

   /**
   * Get bpsMax
   * @return bpsMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsMax() {
    return bpsMax;
  }


  public void setBpsMax(Double bpsMax) {
    this.bpsMax = bpsMax;
  }


  public IscsiLunCommonParams iopsWrMaxLength(Double iopsWrMaxLength) {
    
    this.iopsWrMaxLength = iopsWrMaxLength;
    return this;
  }

   /**
   * Get iopsWrMaxLength
   * @return iopsWrMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsWrMaxLength() {
    return iopsWrMaxLength;
  }


  public void setIopsWrMaxLength(Double iopsWrMaxLength) {
    this.iopsWrMaxLength = iopsWrMaxLength;
  }


  public IscsiLunCommonParams iopsWrMax(Double iopsWrMax) {
    
    this.iopsWrMax = iopsWrMax;
    return this;
  }

   /**
   * Get iopsWrMax
   * @return iopsWrMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsWrMax() {
    return iopsWrMax;
  }


  public void setIopsWrMax(Double iopsWrMax) {
    this.iopsWrMax = iopsWrMax;
  }


  public IscsiLunCommonParams iopsRdMaxLength(Double iopsRdMaxLength) {
    
    this.iopsRdMaxLength = iopsRdMaxLength;
    return this;
  }

   /**
   * Get iopsRdMaxLength
   * @return iopsRdMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsRdMaxLength() {
    return iopsRdMaxLength;
  }


  public void setIopsRdMaxLength(Double iopsRdMaxLength) {
    this.iopsRdMaxLength = iopsRdMaxLength;
  }


  public IscsiLunCommonParams iopsRdMax(Double iopsRdMax) {
    
    this.iopsRdMax = iopsRdMax;
    return this;
  }

   /**
   * Get iopsRdMax
   * @return iopsRdMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsRdMax() {
    return iopsRdMax;
  }


  public void setIopsRdMax(Double iopsRdMax) {
    this.iopsRdMax = iopsRdMax;
  }


  public IscsiLunCommonParams iopsMaxLength(Double iopsMaxLength) {
    
    this.iopsMaxLength = iopsMaxLength;
    return this;
  }

   /**
   * Get iopsMaxLength
   * @return iopsMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsMaxLength() {
    return iopsMaxLength;
  }


  public void setIopsMaxLength(Double iopsMaxLength) {
    this.iopsMaxLength = iopsMaxLength;
  }


  public IscsiLunCommonParams iopsMax(Double iopsMax) {
    
    this.iopsMax = iopsMax;
    return this;
  }

   /**
   * Get iopsMax
   * @return iopsMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsMax() {
    return iopsMax;
  }


  public void setIopsMax(Double iopsMax) {
    this.iopsMax = iopsMax;
  }


  public IscsiLunCommonParams bpsWr(Double bpsWr) {
    
    this.bpsWr = bpsWr;
    return this;
  }

   /**
   * Get bpsWr
   * @return bpsWr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsWr() {
    return bpsWr;
  }


  public void setBpsWr(Double bpsWr) {
    this.bpsWr = bpsWr;
  }


  public IscsiLunCommonParams bpsRd(Double bpsRd) {
    
    this.bpsRd = bpsRd;
    return this;
  }

   /**
   * Get bpsRd
   * @return bpsRd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsRd() {
    return bpsRd;
  }


  public void setBpsRd(Double bpsRd) {
    this.bpsRd = bpsRd;
  }


  public IscsiLunCommonParams bps(Double bps) {
    
    this.bps = bps;
    return this;
  }

   /**
   * Get bps
   * @return bps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBps() {
    return bps;
  }


  public void setBps(Double bps) {
    this.bps = bps;
  }


  public IscsiLunCommonParams iopsWr(Double iopsWr) {
    
    this.iopsWr = iopsWr;
    return this;
  }

   /**
   * Get iopsWr
   * @return iopsWr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsWr() {
    return iopsWr;
  }


  public void setIopsWr(Double iopsWr) {
    this.iopsWr = iopsWr;
  }


  public IscsiLunCommonParams iopsRd(Double iopsRd) {
    
    this.iopsRd = iopsRd;
    return this;
  }

   /**
   * Get iopsRd
   * @return iopsRd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsRd() {
    return iopsRd;
  }


  public void setIopsRd(Double iopsRd) {
    this.iopsRd = iopsRd;
  }


  public IscsiLunCommonParams iops(Double iops) {
    
    this.iops = iops;
    return this;
  }

   /**
   * Get iops
   * @return iops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIops() {
    return iops;
  }


  public void setIops(Double iops) {
    this.iops = iops;
  }


  public IscsiLunCommonParams allowedInitiators(String allowedInitiators) {
    
    this.allowedInitiators = allowedInitiators;
    return this;
  }

   /**
   * Get allowedInitiators
   * @return allowedInitiators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAllowedInitiators() {
    return allowedInitiators;
  }


  public void setAllowedInitiators(String allowedInitiators) {
    this.allowedInitiators = allowedInitiators;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiLunCommonParams iscsiLunCommonParams = (IscsiLunCommonParams) o;
    return Objects.equals(this.bpsWrMaxLength, iscsiLunCommonParams.bpsWrMaxLength) &&
        Objects.equals(this.bpsWrMax, iscsiLunCommonParams.bpsWrMax) &&
        Objects.equals(this.bpsRdMaxLength, iscsiLunCommonParams.bpsRdMaxLength) &&
        Objects.equals(this.bpsRdMax, iscsiLunCommonParams.bpsRdMax) &&
        Objects.equals(this.bpsMaxLength, iscsiLunCommonParams.bpsMaxLength) &&
        Objects.equals(this.bpsMax, iscsiLunCommonParams.bpsMax) &&
        Objects.equals(this.iopsWrMaxLength, iscsiLunCommonParams.iopsWrMaxLength) &&
        Objects.equals(this.iopsWrMax, iscsiLunCommonParams.iopsWrMax) &&
        Objects.equals(this.iopsRdMaxLength, iscsiLunCommonParams.iopsRdMaxLength) &&
        Objects.equals(this.iopsRdMax, iscsiLunCommonParams.iopsRdMax) &&
        Objects.equals(this.iopsMaxLength, iscsiLunCommonParams.iopsMaxLength) &&
        Objects.equals(this.iopsMax, iscsiLunCommonParams.iopsMax) &&
        Objects.equals(this.bpsWr, iscsiLunCommonParams.bpsWr) &&
        Objects.equals(this.bpsRd, iscsiLunCommonParams.bpsRd) &&
        Objects.equals(this.bps, iscsiLunCommonParams.bps) &&
        Objects.equals(this.iopsWr, iscsiLunCommonParams.iopsWr) &&
        Objects.equals(this.iopsRd, iscsiLunCommonParams.iopsRd) &&
        Objects.equals(this.iops, iscsiLunCommonParams.iops) &&
        Objects.equals(this.allowedInitiators, iscsiLunCommonParams.allowedInitiators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bpsWrMaxLength, bpsWrMax, bpsRdMaxLength, bpsRdMax, bpsMaxLength, bpsMax, iopsWrMaxLength, iopsWrMax, iopsRdMaxLength, iopsRdMax, iopsMaxLength, iopsMax, bpsWr, bpsRd, bps, iopsWr, iopsRd, iops, allowedInitiators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiLunCommonParams {\n");
    sb.append("    bpsWrMaxLength: ").append(toIndentedString(bpsWrMaxLength)).append("\n");
    sb.append("    bpsWrMax: ").append(toIndentedString(bpsWrMax)).append("\n");
    sb.append("    bpsRdMaxLength: ").append(toIndentedString(bpsRdMaxLength)).append("\n");
    sb.append("    bpsRdMax: ").append(toIndentedString(bpsRdMax)).append("\n");
    sb.append("    bpsMaxLength: ").append(toIndentedString(bpsMaxLength)).append("\n");
    sb.append("    bpsMax: ").append(toIndentedString(bpsMax)).append("\n");
    sb.append("    iopsWrMaxLength: ").append(toIndentedString(iopsWrMaxLength)).append("\n");
    sb.append("    iopsWrMax: ").append(toIndentedString(iopsWrMax)).append("\n");
    sb.append("    iopsRdMaxLength: ").append(toIndentedString(iopsRdMaxLength)).append("\n");
    sb.append("    iopsRdMax: ").append(toIndentedString(iopsRdMax)).append("\n");
    sb.append("    iopsMaxLength: ").append(toIndentedString(iopsMaxLength)).append("\n");
    sb.append("    iopsMax: ").append(toIndentedString(iopsMax)).append("\n");
    sb.append("    bpsWr: ").append(toIndentedString(bpsWr)).append("\n");
    sb.append("    bpsRd: ").append(toIndentedString(bpsRd)).append("\n");
    sb.append("    bps: ").append(toIndentedString(bps)).append("\n");
    sb.append("    iopsWr: ").append(toIndentedString(iopsWr)).append("\n");
    sb.append("    iopsRd: ").append(toIndentedString(iopsRd)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    allowedInitiators: ").append(toIndentedString(allowedInitiators)).append("\n");
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

