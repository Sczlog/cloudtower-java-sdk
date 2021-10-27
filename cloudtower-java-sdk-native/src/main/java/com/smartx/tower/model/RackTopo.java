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
import com.smartx.tower.model.BrickTopoPowers;
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
 * RackTopo
 */
@JsonPropertyOrder({
  RackTopo.JSON_PROPERTY_BRICK_TOPOES,
  RackTopo.JSON_PROPERTY_CLUSTER,
  RackTopo.JSON_PROPERTY_HEIGHT,
  RackTopo.JSON_PROPERTY_ID,
  RackTopo.JSON_PROPERTY_LOCAL_ID,
  RackTopo.JSON_PROPERTY_NAME,
  RackTopo.JSON_PROPERTY_ZONE_TOPO
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class RackTopo {
  public static final String JSON_PROPERTY_BRICK_TOPOES = "brick_topoes";
  private JsonNullable<List<AlertRuleCluster>> brickTopoes = JsonNullable.<List<AlertRuleCluster>>undefined();

  public static final String JSON_PROPERTY_CLUSTER = "cluster";
  private AlertRuleCluster cluster;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Double height;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LOCAL_ID = "local_id";
  private String localId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ZONE_TOPO = "zone_topo";
  private BrickTopoPowers zoneTopo;


  public RackTopo brickTopoes(List<AlertRuleCluster> brickTopoes) {
    this.brickTopoes = JsonNullable.<List<AlertRuleCluster>>of(brickTopoes);
    return this;
  }

  public RackTopo addBrickTopoesItem(AlertRuleCluster brickTopoesItem) {
    if (this.brickTopoes == null || !this.brickTopoes.isPresent()) {
      this.brickTopoes = JsonNullable.<List<AlertRuleCluster>>of(new ArrayList<>());
    }
    try {
      this.brickTopoes.get().add(brickTopoesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get brickTopoes
   * @return brickTopoes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<AlertRuleCluster> getBrickTopoes() {
        return brickTopoes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BRICK_TOPOES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AlertRuleCluster>> getBrickTopoes_JsonNullable() {
    return brickTopoes;
  }
  
  @JsonProperty(JSON_PROPERTY_BRICK_TOPOES)
  public void setBrickTopoes_JsonNullable(JsonNullable<List<AlertRuleCluster>> brickTopoes) {
    this.brickTopoes = brickTopoes;
  }

  public void setBrickTopoes(List<AlertRuleCluster> brickTopoes) {
    this.brickTopoes = JsonNullable.<List<AlertRuleCluster>>of(brickTopoes);
  }


  public RackTopo cluster(AlertRuleCluster cluster) {
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


  public RackTopo height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHeight(Double height) {
    this.height = height;
  }


  public RackTopo id(String id) {
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


  public RackTopo localId(String localId) {
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


  public RackTopo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public RackTopo zoneTopo(BrickTopoPowers zoneTopo) {
    this.zoneTopo = zoneTopo;
    return this;
  }

   /**
   * Get zoneTopo
   * @return zoneTopo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ZONE_TOPO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BrickTopoPowers getZoneTopo() {
    return zoneTopo;
  }


  @JsonProperty(JSON_PROPERTY_ZONE_TOPO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setZoneTopo(BrickTopoPowers zoneTopo) {
    this.zoneTopo = zoneTopo;
  }


  /**
   * Return true if this RackTopo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RackTopo rackTopo = (RackTopo) o;
    return equalsNullable(this.brickTopoes, rackTopo.brickTopoes) &&
        Objects.equals(this.cluster, rackTopo.cluster) &&
        Objects.equals(this.height, rackTopo.height) &&
        Objects.equals(this.id, rackTopo.id) &&
        Objects.equals(this.localId, rackTopo.localId) &&
        Objects.equals(this.name, rackTopo.name) &&
        Objects.equals(this.zoneTopo, rackTopo.zoneTopo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(brickTopoes), cluster, height, id, localId, name, zoneTopo);
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
    sb.append("class RackTopo {\n");
    sb.append("    brickTopoes: ").append(toIndentedString(brickTopoes)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    zoneTopo: ").append(toIndentedString(zoneTopo)).append("\n");
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

