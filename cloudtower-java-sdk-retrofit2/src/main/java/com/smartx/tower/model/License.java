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
import com.smartx.tower.model.LicenseType;
import com.smartx.tower.model.SoftwareEdition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * License
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:23:54.291904700+08:00[Asia/Shanghai]")
public class License {
  public static final String SERIALIZED_NAME_EXPIRE_DATE = "expire_date";
  @SerializedName(SERIALIZED_NAME_EXPIRE_DATE)
  private String expireDate;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LICENSE_SERIAL = "license_serial";
  @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL)
  private String licenseSerial;

  public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE = "maintenance_end_date";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE)
  private String maintenanceEndDate;

  public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE = "maintenance_start_date";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE)
  private String maintenanceStartDate;

  public static final String SERIALIZED_NAME_MAX_CHUNK_NUM = "max_chunk_num";
  @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM)
  private Double maxChunkNum;

  public static final String SERIALIZED_NAME_MAX_CLUSTER_NUM = "max_cluster_num";
  @SerializedName(SERIALIZED_NAME_MAX_CLUSTER_NUM)
  private Double maxClusterNum;

  public static final String SERIALIZED_NAME_SIGN_DATE = "sign_date";
  @SerializedName(SERIALIZED_NAME_SIGN_DATE)
  private String signDate;

  public static final String SERIALIZED_NAME_SOFTWARE_EDITION = "software_edition";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_EDITION)
  private SoftwareEdition softwareEdition;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private LicenseType type;


  public License expireDate(String expireDate) {
    
    this.expireDate = expireDate;
    return this;
  }

   /**
   * Get expireDate
   * @return expireDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getExpireDate() {
    return expireDate;
  }


  public void setExpireDate(String expireDate) {
    this.expireDate = expireDate;
  }


  public License id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public License licenseSerial(String licenseSerial) {
    
    this.licenseSerial = licenseSerial;
    return this;
  }

   /**
   * Get licenseSerial
   * @return licenseSerial
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLicenseSerial() {
    return licenseSerial;
  }


  public void setLicenseSerial(String licenseSerial) {
    this.licenseSerial = licenseSerial;
  }


  public License maintenanceEndDate(String maintenanceEndDate) {
    
    this.maintenanceEndDate = maintenanceEndDate;
    return this;
  }

   /**
   * Get maintenanceEndDate
   * @return maintenanceEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMaintenanceEndDate() {
    return maintenanceEndDate;
  }


  public void setMaintenanceEndDate(String maintenanceEndDate) {
    this.maintenanceEndDate = maintenanceEndDate;
  }


  public License maintenanceStartDate(String maintenanceStartDate) {
    
    this.maintenanceStartDate = maintenanceStartDate;
    return this;
  }

   /**
   * Get maintenanceStartDate
   * @return maintenanceStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMaintenanceStartDate() {
    return maintenanceStartDate;
  }


  public void setMaintenanceStartDate(String maintenanceStartDate) {
    this.maintenanceStartDate = maintenanceStartDate;
  }


  public License maxChunkNum(Double maxChunkNum) {
    
    this.maxChunkNum = maxChunkNum;
    return this;
  }

   /**
   * Get maxChunkNum
   * @return maxChunkNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getMaxChunkNum() {
    return maxChunkNum;
  }


  public void setMaxChunkNum(Double maxChunkNum) {
    this.maxChunkNum = maxChunkNum;
  }


  public License maxClusterNum(Double maxClusterNum) {
    
    this.maxClusterNum = maxClusterNum;
    return this;
  }

   /**
   * Get maxClusterNum
   * @return maxClusterNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getMaxClusterNum() {
    return maxClusterNum;
  }


  public void setMaxClusterNum(Double maxClusterNum) {
    this.maxClusterNum = maxClusterNum;
  }


  public License signDate(String signDate) {
    
    this.signDate = signDate;
    return this;
  }

   /**
   * Get signDate
   * @return signDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSignDate() {
    return signDate;
  }


  public void setSignDate(String signDate) {
    this.signDate = signDate;
  }


  public License softwareEdition(SoftwareEdition softwareEdition) {
    
    this.softwareEdition = softwareEdition;
    return this;
  }

   /**
   * Get softwareEdition
   * @return softwareEdition
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SoftwareEdition getSoftwareEdition() {
    return softwareEdition;
  }


  public void setSoftwareEdition(SoftwareEdition softwareEdition) {
    this.softwareEdition = softwareEdition;
  }


  public License type(LicenseType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LicenseType getType() {
    return type;
  }


  public void setType(LicenseType type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    License license = (License) o;
    return Objects.equals(this.expireDate, license.expireDate) &&
        Objects.equals(this.id, license.id) &&
        Objects.equals(this.licenseSerial, license.licenseSerial) &&
        Objects.equals(this.maintenanceEndDate, license.maintenanceEndDate) &&
        Objects.equals(this.maintenanceStartDate, license.maintenanceStartDate) &&
        Objects.equals(this.maxChunkNum, license.maxChunkNum) &&
        Objects.equals(this.maxClusterNum, license.maxClusterNum) &&
        Objects.equals(this.signDate, license.signDate) &&
        Objects.equals(this.softwareEdition, license.softwareEdition) &&
        Objects.equals(this.type, license.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(expireDate, id, licenseSerial, maintenanceEndDate, maintenanceStartDate, maxChunkNum, maxClusterNum, signDate, softwareEdition, type);
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
    sb.append("class License {\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    licenseSerial: ").append(toIndentedString(licenseSerial)).append("\n");
    sb.append("    maintenanceEndDate: ").append(toIndentedString(maintenanceEndDate)).append("\n");
    sb.append("    maintenanceStartDate: ").append(toIndentedString(maintenanceStartDate)).append("\n");
    sb.append("    maxChunkNum: ").append(toIndentedString(maxChunkNum)).append("\n");
    sb.append("    maxClusterNum: ").append(toIndentedString(maxClusterNum)).append("\n");
    sb.append("    signDate: ").append(toIndentedString(signDate)).append("\n");
    sb.append("    softwareEdition: ").append(toIndentedString(softwareEdition)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

