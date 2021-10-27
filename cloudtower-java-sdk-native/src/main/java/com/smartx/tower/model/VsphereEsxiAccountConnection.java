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
import com.smartx.tower.model.AlertNotifierConnectionAggregate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * VsphereEsxiAccountConnection
 */
@JsonPropertyOrder({
  VsphereEsxiAccountConnection.JSON_PROPERTY_AGGREGATE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class VsphereEsxiAccountConnection {
  public static final String JSON_PROPERTY_AGGREGATE = "aggregate";
  private AlertNotifierConnectionAggregate aggregate;


  public VsphereEsxiAccountConnection aggregate(AlertNotifierConnectionAggregate aggregate) {
    this.aggregate = aggregate;
    return this;
  }

   /**
   * Get aggregate
   * @return aggregate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AGGREGATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AlertNotifierConnectionAggregate getAggregate() {
    return aggregate;
  }


  @JsonProperty(JSON_PROPERTY_AGGREGATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAggregate(AlertNotifierConnectionAggregate aggregate) {
    this.aggregate = aggregate;
  }


  /**
   * Return true if this VsphereEsxiAccountConnection object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VsphereEsxiAccountConnection vsphereEsxiAccountConnection = (VsphereEsxiAccountConnection) o;
    return Objects.equals(this.aggregate, vsphereEsxiAccountConnection.aggregate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VsphereEsxiAccountConnection {\n");
    sb.append("    aggregate: ").append(toIndentedString(aggregate)).append("\n");
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

