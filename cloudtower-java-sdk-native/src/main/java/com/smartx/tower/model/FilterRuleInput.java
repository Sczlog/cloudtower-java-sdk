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
import com.smartx.tower.model.FilterRuleAggregationEnum;
import com.smartx.tower.model.FilterRuleMetricEnum;
import com.smartx.tower.model.FilterRuleOpEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FilterRuleInput
 */
@JsonPropertyOrder({
  FilterRuleInput.JSON_PROPERTY_THRESHOLD,
  FilterRuleInput.JSON_PROPERTY_QUANTILE,
  FilterRuleInput.JSON_PROPERTY_OP,
  FilterRuleInput.JSON_PROPERTY_METRIC,
  FilterRuleInput.JSON_PROPERTY_DURATION,
  FilterRuleInput.JSON_PROPERTY_AGGREGATION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class FilterRuleInput {
  public static final String JSON_PROPERTY_THRESHOLD = "threshold";
  private Double threshold;

  public static final String JSON_PROPERTY_QUANTILE = "quantile";
  private Double quantile;

  public static final String JSON_PROPERTY_OP = "op";
  private FilterRuleOpEnum op;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private FilterRuleMetricEnum metric;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Double duration;

  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private FilterRuleAggregationEnum aggregation;


  public FilterRuleInput threshold(Double threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getThreshold() {
    return threshold;
  }


  @JsonProperty(JSON_PROPERTY_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThreshold(Double threshold) {
    this.threshold = threshold;
  }


  public FilterRuleInput quantile(Double quantile) {
    this.quantile = quantile;
    return this;
  }

   /**
   * Get quantile
   * @return quantile
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_QUANTILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getQuantile() {
    return quantile;
  }


  @JsonProperty(JSON_PROPERTY_QUANTILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuantile(Double quantile) {
    this.quantile = quantile;
  }


  public FilterRuleInput op(FilterRuleOpEnum op) {
    this.op = op;
    return this;
  }

   /**
   * Get op
   * @return op
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FilterRuleOpEnum getOp() {
    return op;
  }


  @JsonProperty(JSON_PROPERTY_OP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOp(FilterRuleOpEnum op) {
    this.op = op;
  }


  public FilterRuleInput metric(FilterRuleMetricEnum metric) {
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FilterRuleMetricEnum getMetric() {
    return metric;
  }


  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetric(FilterRuleMetricEnum metric) {
    this.metric = metric;
  }


  public FilterRuleInput duration(Double duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDuration(Double duration) {
    this.duration = duration;
  }


  public FilterRuleInput aggregation(FilterRuleAggregationEnum aggregation) {
    this.aggregation = aggregation;
    return this;
  }

   /**
   * Get aggregation
   * @return aggregation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FilterRuleAggregationEnum getAggregation() {
    return aggregation;
  }


  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAggregation(FilterRuleAggregationEnum aggregation) {
    this.aggregation = aggregation;
  }


  /**
   * Return true if this FilterRuleInput object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterRuleInput filterRuleInput = (FilterRuleInput) o;
    return Objects.equals(this.threshold, filterRuleInput.threshold) &&
        Objects.equals(this.quantile, filterRuleInput.quantile) &&
        Objects.equals(this.op, filterRuleInput.op) &&
        Objects.equals(this.metric, filterRuleInput.metric) &&
        Objects.equals(this.duration, filterRuleInput.duration) &&
        Objects.equals(this.aggregation, filterRuleInput.aggregation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threshold, quantile, op, metric, duration, aggregation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterRuleInput {\n");
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

