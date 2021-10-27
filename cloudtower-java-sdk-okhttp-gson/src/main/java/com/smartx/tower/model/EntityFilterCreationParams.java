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
import com.smartx.tower.model.ClusterWhereInput;
import com.smartx.tower.model.FilterRuleInput;
import com.smartx.tower.model.VmWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EntityFilterCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:23:12.632307300+08:00[Asia/Shanghai]")
public class EntityFilterCreationParams {
  public static final String SERIALIZED_NAME_EXCLUDE_VMS = "exclude_vms";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_VMS)
  private VmWhereInput excludeVms;

  public static final String SERIALIZED_NAME_CLUSTERS = "clusters";
  @SerializedName(SERIALIZED_NAME_CLUSTERS)
  private ClusterWhereInput clusters;

  public static final String SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS = "apply_to_all_clusters";
  @SerializedName(SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS)
  private Boolean applyToAllClusters;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<FilterRuleInput> rules = new ArrayList<FilterRuleInput>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public EntityFilterCreationParams excludeVms(VmWhereInput excludeVms) {
    
    this.excludeVms = excludeVms;
    return this;
  }

   /**
   * Get excludeVms
   * @return excludeVms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getExcludeVms() {
    return excludeVms;
  }


  public void setExcludeVms(VmWhereInput excludeVms) {
    this.excludeVms = excludeVms;
  }


  public EntityFilterCreationParams clusters(ClusterWhereInput clusters) {
    
    this.clusters = clusters;
    return this;
  }

   /**
   * Get clusters
   * @return clusters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWhereInput getClusters() {
    return clusters;
  }


  public void setClusters(ClusterWhereInput clusters) {
    this.clusters = clusters;
  }


  public EntityFilterCreationParams applyToAllClusters(Boolean applyToAllClusters) {
    
    this.applyToAllClusters = applyToAllClusters;
    return this;
  }

   /**
   * Get applyToAllClusters
   * @return applyToAllClusters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getApplyToAllClusters() {
    return applyToAllClusters;
  }


  public void setApplyToAllClusters(Boolean applyToAllClusters) {
    this.applyToAllClusters = applyToAllClusters;
  }


  public EntityFilterCreationParams rules(List<FilterRuleInput> rules) {
    
    this.rules = rules;
    return this;
  }

  public EntityFilterCreationParams addRulesItem(FilterRuleInput rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<FilterRuleInput> getRules() {
    return rules;
  }


  public void setRules(List<FilterRuleInput> rules) {
    this.rules = rules;
  }


  public EntityFilterCreationParams name(String name) {
    
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
    EntityFilterCreationParams entityFilterCreationParams = (EntityFilterCreationParams) o;
    return Objects.equals(this.excludeVms, entityFilterCreationParams.excludeVms) &&
        Objects.equals(this.clusters, entityFilterCreationParams.clusters) &&
        Objects.equals(this.applyToAllClusters, entityFilterCreationParams.applyToAllClusters) &&
        Objects.equals(this.rules, entityFilterCreationParams.rules) &&
        Objects.equals(this.name, entityFilterCreationParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludeVms, clusters, applyToAllClusters, rules, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityFilterCreationParams {\n");
    sb.append("    excludeVms: ").append(toIndentedString(excludeVms)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    applyToAllClusters: ").append(toIndentedString(applyToAllClusters)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

