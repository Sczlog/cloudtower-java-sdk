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
import com.smartx.tower.model.NestedLabel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NestedSecurityPolicyApply
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NestedSecurityPolicyApply {
  public static final String SERIALIZED_NAME_COMMUNICABLE = "communicable";
  @SerializedName(SERIALIZED_NAME_COMMUNICABLE)
  private Boolean communicable;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private List<NestedLabel> selector = new ArrayList<NestedLabel>();

  public static final String SERIALIZED_NAME_SELECTOR_IDS = "selector_ids";
  @SerializedName(SERIALIZED_NAME_SELECTOR_IDS)
  private List<String> selectorIds = new ArrayList<String>();


  public NestedSecurityPolicyApply communicable(Boolean communicable) {
    
    this.communicable = communicable;
    return this;
  }

   /**
   * Get communicable
   * @return communicable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCommunicable() {
    return communicable;
  }


  public void setCommunicable(Boolean communicable) {
    this.communicable = communicable;
  }


  public NestedSecurityPolicyApply selector(List<NestedLabel> selector) {
    
    this.selector = selector;
    return this;
  }

  public NestedSecurityPolicyApply addSelectorItem(NestedLabel selectorItem) {
    this.selector.add(selectorItem);
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<NestedLabel> getSelector() {
    return selector;
  }


  public void setSelector(List<NestedLabel> selector) {
    this.selector = selector;
  }


  public NestedSecurityPolicyApply selectorIds(List<String> selectorIds) {
    
    this.selectorIds = selectorIds;
    return this;
  }

  public NestedSecurityPolicyApply addSelectorIdsItem(String selectorIdsItem) {
    this.selectorIds.add(selectorIdsItem);
    return this;
  }

   /**
   * Get selectorIds
   * @return selectorIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getSelectorIds() {
    return selectorIds;
  }


  public void setSelectorIds(List<String> selectorIds) {
    this.selectorIds = selectorIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedSecurityPolicyApply nestedSecurityPolicyApply = (NestedSecurityPolicyApply) o;
    return Objects.equals(this.communicable, nestedSecurityPolicyApply.communicable) &&
        Objects.equals(this.selector, nestedSecurityPolicyApply.selector) &&
        Objects.equals(this.selectorIds, nestedSecurityPolicyApply.selectorIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communicable, selector, selectorIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedSecurityPolicyApply {\n");
    sb.append("    communicable: ").append(toIndentedString(communicable)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    selectorIds: ").append(toIndentedString(selectorIds)).append("\n");
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

