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
import com.smartx.tower.model.NameIdPair;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ZoneTopo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZoneTopo {
  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private NameIdPair cluster;

  public static final String SERIALIZED_NAME_CLUSTER_TOPO = "cluster_topo";
  @SerializedName(SERIALIZED_NAME_CLUSTER_TOPO)
  private NameIdPair clusterTopo;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_RACK_TOPOES = "rack_topoes";
  @SerializedName(SERIALIZED_NAME_RACK_TOPOES)
  private List<NameIdPair> rackTopoes = null;


  public ZoneTopo cluster(NameIdPair cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NameIdPair getCluster() {
    return cluster;
  }


  public void setCluster(NameIdPair cluster) {
    this.cluster = cluster;
  }


  public ZoneTopo clusterTopo(NameIdPair clusterTopo) {
    
    this.clusterTopo = clusterTopo;
    return this;
  }

   /**
   * Get clusterTopo
   * @return clusterTopo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NameIdPair getClusterTopo() {
    return clusterTopo;
  }


  public void setClusterTopo(NameIdPair clusterTopo) {
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

  public String getId() {
    return id;
  }


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

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public ZoneTopo rackTopoes(List<NameIdPair> rackTopoes) {
    
    this.rackTopoes = rackTopoes;
    return this;
  }

  public ZoneTopo addRackTopoesItem(NameIdPair rackTopoesItem) {
    if (this.rackTopoes == null) {
      this.rackTopoes = new ArrayList<NameIdPair>();
    }
    this.rackTopoes.add(rackTopoesItem);
    return this;
  }

   /**
   * Get rackTopoes
   * @return rackTopoes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NameIdPair> getRackTopoes() {
    return rackTopoes;
  }


  public void setRackTopoes(List<NameIdPair> rackTopoes) {
    this.rackTopoes = rackTopoes;
  }


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
        Objects.equals(this.rackTopoes, zoneTopo.rackTopoes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, clusterTopo, id, localId, rackTopoes);
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

