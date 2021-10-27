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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * VmRemoveNicParamsData
 */
@JsonPropertyOrder({
  VmRemoveNicParamsData.JSON_PROPERTY_NIC_INDEX
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class VmRemoveNicParamsData {
  public static final String JSON_PROPERTY_NIC_INDEX = "nic_index";
  private List<Double> nicIndex = new ArrayList<>();


  public VmRemoveNicParamsData nicIndex(List<Double> nicIndex) {
    this.nicIndex = nicIndex;
    return this;
  }

  public VmRemoveNicParamsData addNicIndexItem(Double nicIndexItem) {
    this.nicIndex.add(nicIndexItem);
    return this;
  }

   /**
   * Get nicIndex
   * @return nicIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NIC_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Double> getNicIndex() {
    return nicIndex;
  }


  @JsonProperty(JSON_PROPERTY_NIC_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNicIndex(List<Double> nicIndex) {
    this.nicIndex = nicIndex;
  }


  /**
   * Return true if this VmRemoveNicParams_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmRemoveNicParamsData vmRemoveNicParamsData = (VmRemoveNicParamsData) o;
    return Objects.equals(this.nicIndex, vmRemoveNicParamsData.nicIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nicIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmRemoveNicParamsData {\n");
    sb.append("    nicIndex: ").append(toIndentedString(nicIndex)).append("\n");
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

