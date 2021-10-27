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
import com.smartx.tower.model.ClusterMetroAvailabilityChecklistZoneAndZoneItems;
import com.smartx.tower.model.MetroCheckStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClusterMetroAvailabilityChecklistZoneAndZone
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:23:12.632307300+08:00[Asia/Shanghai]")
public class ClusterMetroAvailabilityChecklistZoneAndZone {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private MetroCheckStatusEnum status;

  public static final String SERIALIZED_NAME_NOTICE = "notice";
  @SerializedName(SERIALIZED_NAME_NOTICE)
  private Double notice;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<ClusterMetroAvailabilityChecklistZoneAndZoneItems> items = new ArrayList<ClusterMetroAvailabilityChecklistZoneAndZoneItems>();

  public static final String SERIALIZED_NAME_INFO = "info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private Double info;

  public static final String SERIALIZED_NAME_CRITICAL = "critical";
  @SerializedName(SERIALIZED_NAME_CRITICAL)
  private Double critical;


  public ClusterMetroAvailabilityChecklistZoneAndZone status(MetroCheckStatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MetroCheckStatusEnum getStatus() {
    return status;
  }


  public void setStatus(MetroCheckStatusEnum status) {
    this.status = status;
  }


  public ClusterMetroAvailabilityChecklistZoneAndZone notice(Double notice) {
    
    this.notice = notice;
    return this;
  }

   /**
   * Get notice
   * @return notice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getNotice() {
    return notice;
  }


  public void setNotice(Double notice) {
    this.notice = notice;
  }


  public ClusterMetroAvailabilityChecklistZoneAndZone items(List<ClusterMetroAvailabilityChecklistZoneAndZoneItems> items) {
    
    this.items = items;
    return this;
  }

  public ClusterMetroAvailabilityChecklistZoneAndZone addItemsItem(ClusterMetroAvailabilityChecklistZoneAndZoneItems itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ClusterMetroAvailabilityChecklistZoneAndZoneItems> getItems() {
    return items;
  }


  public void setItems(List<ClusterMetroAvailabilityChecklistZoneAndZoneItems> items) {
    this.items = items;
  }


  public ClusterMetroAvailabilityChecklistZoneAndZone info(Double info) {
    
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getInfo() {
    return info;
  }


  public void setInfo(Double info) {
    this.info = info;
  }


  public ClusterMetroAvailabilityChecklistZoneAndZone critical(Double critical) {
    
    this.critical = critical;
    return this;
  }

   /**
   * Get critical
   * @return critical
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getCritical() {
    return critical;
  }


  public void setCritical(Double critical) {
    this.critical = critical;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterMetroAvailabilityChecklistZoneAndZone clusterMetroAvailabilityChecklistZoneAndZone = (ClusterMetroAvailabilityChecklistZoneAndZone) o;
    return Objects.equals(this.status, clusterMetroAvailabilityChecklistZoneAndZone.status) &&
        Objects.equals(this.notice, clusterMetroAvailabilityChecklistZoneAndZone.notice) &&
        Objects.equals(this.items, clusterMetroAvailabilityChecklistZoneAndZone.items) &&
        Objects.equals(this.info, clusterMetroAvailabilityChecklistZoneAndZone.info) &&
        Objects.equals(this.critical, clusterMetroAvailabilityChecklistZoneAndZone.critical);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, notice, items, info, critical);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterMetroAvailabilityChecklistZoneAndZone {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    notice: ").append(toIndentedString(notice)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
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

