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
import com.smartx.tower.model.FilterRuleAggregationEnum;
import com.smartx.tower.model.FilterRuleMetricEnum;
import com.smartx.tower.model.FilterRuleOpEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EntityFilterRules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:23:54.291904700+08:00[Asia/Shanghai]")
public class EntityFilterRules {
  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private Double threshold;

  public static final String SERIALIZED_NAME_QUANTILE = "quantile";
  @SerializedName(SERIALIZED_NAME_QUANTILE)
  private Double quantile;

  public static final String SERIALIZED_NAME_OP = "op";
  @SerializedName(SERIALIZED_NAME_OP)
  private FilterRuleOpEnum op;

  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private FilterRuleMetricEnum metric;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Double duration;

  public static final String SERIALIZED_NAME_AGGREGATION = "aggregation";
  @SerializedName(SERIALIZED_NAME_AGGREGATION)
  private FilterRuleAggregationEnum aggregation;


  public EntityFilterRules threshold(Double threshold) {
    
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getThreshold() {
    return threshold;
  }


  public void setThreshold(Double threshold) {
    this.threshold = threshold;
  }


  public EntityFilterRules quantile(Double quantile) {
    
    this.quantile = quantile;
    return this;
  }

   /**
   * Get quantile
   * @return quantile
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getQuantile() {
    return quantile;
  }


  public void setQuantile(Double quantile) {
    this.quantile = quantile;
  }


  public EntityFilterRules op(FilterRuleOpEnum op) {
    
    this.op = op;
    return this;
  }

   /**
   * Get op
   * @return op
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FilterRuleOpEnum getOp() {
    return op;
  }


  public void setOp(FilterRuleOpEnum op) {
    this.op = op;
  }


  public EntityFilterRules metric(FilterRuleMetricEnum metric) {
    
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FilterRuleMetricEnum getMetric() {
    return metric;
  }


  public void setMetric(FilterRuleMetricEnum metric) {
    this.metric = metric;
  }


  public EntityFilterRules duration(Double duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {
    this.duration = duration;
  }


  public EntityFilterRules aggregation(FilterRuleAggregationEnum aggregation) {
    
    this.aggregation = aggregation;
    return this;
  }

   /**
   * Get aggregation
   * @return aggregation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FilterRuleAggregationEnum getAggregation() {
    return aggregation;
  }


  public void setAggregation(FilterRuleAggregationEnum aggregation) {
    this.aggregation = aggregation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityFilterRules entityFilterRules = (EntityFilterRules) o;
    return Objects.equals(this.threshold, entityFilterRules.threshold) &&
        Objects.equals(this.quantile, entityFilterRules.quantile) &&
        Objects.equals(this.op, entityFilterRules.op) &&
        Objects.equals(this.metric, entityFilterRules.metric) &&
        Objects.equals(this.duration, entityFilterRules.duration) &&
        Objects.equals(this.aggregation, entityFilterRules.aggregation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threshold, quantile, op, metric, duration, aggregation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityFilterRules {\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    quantile: ").append(toIndentedString(quantile)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
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

