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
import com.smartx.tower.model.LicenseType;
import com.smartx.tower.model.SoftwareEdition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * License
 */
@JsonPropertyOrder({
  License.JSON_PROPERTY_EXPIRE_DATE,
  License.JSON_PROPERTY_ID,
  License.JSON_PROPERTY_LICENSE_SERIAL,
  License.JSON_PROPERTY_MAINTENANCE_END_DATE,
  License.JSON_PROPERTY_MAINTENANCE_START_DATE,
  License.JSON_PROPERTY_MAX_CHUNK_NUM,
  License.JSON_PROPERTY_MAX_CLUSTER_NUM,
  License.JSON_PROPERTY_SIGN_DATE,
  License.JSON_PROPERTY_SOFTWARE_EDITION,
  License.JSON_PROPERTY_TYPE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class License {
  public static final String JSON_PROPERTY_EXPIRE_DATE = "expire_date";
  private String expireDate;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LICENSE_SERIAL = "license_serial";
  private String licenseSerial;

  public static final String JSON_PROPERTY_MAINTENANCE_END_DATE = "maintenance_end_date";
  private JsonNullable<String> maintenanceEndDate = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MAINTENANCE_START_DATE = "maintenance_start_date";
  private JsonNullable<String> maintenanceStartDate = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MAX_CHUNK_NUM = "max_chunk_num";
  private Double maxChunkNum;

  public static final String JSON_PROPERTY_MAX_CLUSTER_NUM = "max_cluster_num";
  private Double maxClusterNum;

  public static final String JSON_PROPERTY_SIGN_DATE = "sign_date";
  private String signDate;

  public static final String JSON_PROPERTY_SOFTWARE_EDITION = "software_edition";
  private SoftwareEdition softwareEdition;

  public static final String JSON_PROPERTY_TYPE = "type";
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
  @JsonProperty(JSON_PROPERTY_EXPIRE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExpireDate() {
    return expireDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @JsonProperty(JSON_PROPERTY_LICENSE_SERIAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLicenseSerial() {
    return licenseSerial;
  }


  @JsonProperty(JSON_PROPERTY_LICENSE_SERIAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLicenseSerial(String licenseSerial) {
    this.licenseSerial = licenseSerial;
  }


  public License maintenanceEndDate(String maintenanceEndDate) {
    this.maintenanceEndDate = JsonNullable.<String>of(maintenanceEndDate);
    return this;
  }

   /**
   * Get maintenanceEndDate
   * @return maintenanceEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getMaintenanceEndDate() {
        return maintenanceEndDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAINTENANCE_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMaintenanceEndDate_JsonNullable() {
    return maintenanceEndDate;
  }
  
  @JsonProperty(JSON_PROPERTY_MAINTENANCE_END_DATE)
  public void setMaintenanceEndDate_JsonNullable(JsonNullable<String> maintenanceEndDate) {
    this.maintenanceEndDate = maintenanceEndDate;
  }

  public void setMaintenanceEndDate(String maintenanceEndDate) {
    this.maintenanceEndDate = JsonNullable.<String>of(maintenanceEndDate);
  }


  public License maintenanceStartDate(String maintenanceStartDate) {
    this.maintenanceStartDate = JsonNullable.<String>of(maintenanceStartDate);
    return this;
  }

   /**
   * Get maintenanceStartDate
   * @return maintenanceStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getMaintenanceStartDate() {
        return maintenanceStartDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAINTENANCE_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMaintenanceStartDate_JsonNullable() {
    return maintenanceStartDate;
  }
  
  @JsonProperty(JSON_PROPERTY_MAINTENANCE_START_DATE)
  public void setMaintenanceStartDate_JsonNullable(JsonNullable<String> maintenanceStartDate) {
    this.maintenanceStartDate = maintenanceStartDate;
  }

  public void setMaintenanceStartDate(String maintenanceStartDate) {
    this.maintenanceStartDate = JsonNullable.<String>of(maintenanceStartDate);
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
  @JsonProperty(JSON_PROPERTY_MAX_CHUNK_NUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getMaxChunkNum() {
    return maxChunkNum;
  }


  @JsonProperty(JSON_PROPERTY_MAX_CHUNK_NUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @JsonProperty(JSON_PROPERTY_MAX_CLUSTER_NUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getMaxClusterNum() {
    return maxClusterNum;
  }


  @JsonProperty(JSON_PROPERTY_MAX_CLUSTER_NUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @JsonProperty(JSON_PROPERTY_SIGN_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSignDate() {
    return signDate;
  }


  @JsonProperty(JSON_PROPERTY_SIGN_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @JsonProperty(JSON_PROPERTY_SOFTWARE_EDITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SoftwareEdition getSoftwareEdition() {
    return softwareEdition;
  }


  @JsonProperty(JSON_PROPERTY_SOFTWARE_EDITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LicenseType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(LicenseType type) {
    this.type = type;
  }


  /**
   * Return true if this License object is equal to o.
   */
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
        equalsNullable(this.maintenanceEndDate, license.maintenanceEndDate) &&
        equalsNullable(this.maintenanceStartDate, license.maintenanceStartDate) &&
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
    return Objects.hash(expireDate, id, licenseSerial, hashCodeNullable(maintenanceEndDate), hashCodeNullable(maintenanceStartDate), maxChunkNum, maxClusterNum, signDate, softwareEdition, type);
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

