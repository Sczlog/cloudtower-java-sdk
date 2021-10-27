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
import com.smartx.tower.model.AlertRuleCluster;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ZoneTopo
 */
@JsonPropertyOrder({
  ZoneTopo.JSON_PROPERTY_CLUSTER,
  ZoneTopo.JSON_PROPERTY_CLUSTER_TOPO,
  ZoneTopo.JSON_PROPERTY_ID,
  ZoneTopo.JSON_PROPERTY_LOCAL_ID,
  ZoneTopo.JSON_PROPERTY_RACK_TOPOES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class ZoneTopo {
  public static final String JSON_PROPERTY_CLUSTER = "cluster";
  private AlertRuleCluster cluster;

  public static final String JSON_PROPERTY_CLUSTER_TOPO = "cluster_topo";
  private AlertRuleCluster clusterTopo;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LOCAL_ID = "local_id";
  private String localId;

  public static final String JSON_PROPERTY_RACK_TOPOES = "rack_topoes";
  private JsonNullable<List<AlertRuleCluster>> rackTopoes = JsonNullable.<List<AlertRuleCluster>>undefined();


  public ZoneTopo cluster(AlertRuleCluster cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLUSTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AlertRuleCluster getCluster() {
    return cluster;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCluster(AlertRuleCluster cluster) {
    this.cluster = cluster;
  }


  public ZoneTopo clusterTopo(AlertRuleCluster clusterTopo) {
    this.clusterTopo = clusterTopo;
    return this;
  }

   /**
   * Get clusterTopo
   * @return clusterTopo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLUSTER_TOPO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AlertRuleCluster getClusterTopo() {
    return clusterTopo;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_TOPO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClusterTopo(AlertRuleCluster clusterTopo) {
    this.clusterTopo = clusterTopo;
  }


  public ZoneTopo id(String id) {
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


  public ZoneTopo localId(String localId) {
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LOCAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLocalId() {
    return localId;
  }


  @JsonProperty(JSON_PROPERTY_LOCAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public ZoneTopo rackTopoes(List<AlertRuleCluster> rackTopoes) {
    this.rackTopoes = JsonNullable.<List<AlertRuleCluster>>of(rackTopoes);
    return this;
  }

  public ZoneTopo addRackTopoesItem(AlertRuleCluster rackTopoesItem) {
    if (this.rackTopoes == null || !this.rackTopoes.isPresent()) {
      this.rackTopoes = JsonNullable.<List<AlertRuleCluster>>of(new ArrayList<>());
    }
    try {
      this.rackTopoes.get().add(rackTopoesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get rackTopoes
   * @return rackTopoes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<AlertRuleCluster> getRackTopoes() {
        return rackTopoes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RACK_TOPOES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AlertRuleCluster>> getRackTopoes_JsonNullable() {
    return rackTopoes;
  }
  
  @JsonProperty(JSON_PROPERTY_RACK_TOPOES)
  public void setRackTopoes_JsonNullable(JsonNullable<List<AlertRuleCluster>> rackTopoes) {
    this.rackTopoes = rackTopoes;
  }

  public void setRackTopoes(List<AlertRuleCluster> rackTopoes) {
    this.rackTopoes = JsonNullable.<List<AlertRuleCluster>>of(rackTopoes);
  }


  /**
   * Return true if this ZoneTopo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZoneTopo zoneTopo = (ZoneTopo) o;
    return Objects.equals(this.cluster, zoneTopo.cluster) &&
        Objects.equals(this.clusterTopo, zoneTopo.clusterTopo) &&
        Objects.equals(this.id, zoneTopo.id) &&
        Objects.equals(this.localId, zoneTopo.localId) &&
        equalsNullable(this.rackTopoes, zoneTopo.rackTopoes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, clusterTopo, id, localId, hashCodeNullable(rackTopoes));
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
    sb.append("class ZoneTopo {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    clusterTopo: ").append(toIndentedString(clusterTopo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    rackTopoes: ").append(toIndentedString(rackTopoes)).append("\n");
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

