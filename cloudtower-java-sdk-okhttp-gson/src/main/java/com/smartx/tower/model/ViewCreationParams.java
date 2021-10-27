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
import com.smartx.tower.model.TimeUnit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ViewCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T16:05:01.910402800+08:00[Asia/Shanghai]")
public class ViewCreationParams {
  public static final String SERIALIZED_NAME_TIME_UNIT = "time_unit";
  @SerializedName(SERIALIZED_NAME_TIME_UNIT)
  private TimeUnit timeUnit;

  public static final String SERIALIZED_NAME_TIME_SPAN = "time_span";
  @SerializedName(SERIALIZED_NAME_TIME_SPAN)
  private Double timeSpan;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public ViewCreationParams timeUnit(TimeUnit timeUnit) {
    
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * Get timeUnit
   * @return timeUnit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TimeUnit getTimeUnit() {
    return timeUnit;
  }


  public void setTimeUnit(TimeUnit timeUnit) {
    this.timeUnit = timeUnit;
  }


  public ViewCreationParams timeSpan(Double timeSpan) {
    
    this.timeSpan = timeSpan;
    return this;
  }

   /**
   * Get timeSpan
   * @return timeSpan
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getTimeSpan() {
    return timeSpan;
  }


  public void setTimeSpan(Double timeSpan) {
    this.timeSpan = timeSpan;
  }


  public ViewCreationParams clusterId(String clusterId) {
    
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


  public ViewCreationParams name(String name) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewCreationParams viewCreationParams = (ViewCreationParams) o;
    return Objects.equals(this.timeUnit, viewCreationParams.timeUnit) &&
        Objects.equals(this.timeSpan, viewCreationParams.timeSpan) &&
        Objects.equals(this.clusterId, viewCreationParams.clusterId) &&
        Objects.equals(this.name, viewCreationParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeUnit, timeSpan, clusterId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewCreationParams {\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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

