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
import com.smartx.tower.model.AlertRuleCluster;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * VmEntityFilterResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:23:54.291904700+08:00[Asia/Shanghai]")
public class VmEntityFilterResult {
  public static final String SERIALIZED_NAME_ENTITY_FILTER = "entityFilter";
  @SerializedName(SERIALIZED_NAME_ENTITY_FILTER)
  private AlertRuleCluster entityFilter;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private List<Double> result = new ArrayList<Double>();

  public static final String SERIALIZED_NAME_VM = "vm";
  @SerializedName(SERIALIZED_NAME_VM)
  private AlertRuleCluster vm;


  public VmEntityFilterResult entityFilter(AlertRuleCluster entityFilter) {
    
    this.entityFilter = entityFilter;
    return this;
  }

   /**
   * Get entityFilter
   * @return entityFilter
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AlertRuleCluster getEntityFilter() {
    return entityFilter;
  }


  public void setEntityFilter(AlertRuleCluster entityFilter) {
    this.entityFilter = entityFilter;
  }


  public VmEntityFilterResult id(String id) {
    
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


  public VmEntityFilterResult result(List<Double> result) {
    
    this.result = result;
    return this;
  }

  public VmEntityFilterResult addResultItem(Double resultItem) {
    this.result.add(resultItem);
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Double> getResult() {
    return result;
  }


  public void setResult(List<Double> result) {
    this.result = result;
  }


  public VmEntityFilterResult vm(AlertRuleCluster vm) {
    
    this.vm = vm;
    return this;
  }

   /**
   * Get vm
   * @return vm
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AlertRuleCluster getVm() {
    return vm;
  }


  public void setVm(AlertRuleCluster vm) {
    this.vm = vm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmEntityFilterResult vmEntityFilterResult = (VmEntityFilterResult) o;
    return Objects.equals(this.entityFilter, vmEntityFilterResult.entityFilter) &&
        Objects.equals(this.id, vmEntityFilterResult.id) &&
        Objects.equals(this.result, vmEntityFilterResult.result) &&
        Objects.equals(this.vm, vmEntityFilterResult.vm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityFilter, id, result, vm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmEntityFilterResult {\n");
    sb.append("    entityFilter: ").append(toIndentedString(entityFilter)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
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

