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
import com.smartx.tower.model.NestedBrickTopo;
import com.smartx.tower.model.NestedCluster;
import com.smartx.tower.model.NestedZoneTopo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * RackTopo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RackTopo {
  public static final String SERIALIZED_NAME_BRICK_TOPOES = "brick_topoes";
  @SerializedName(SERIALIZED_NAME_BRICK_TOPOES)
  private List<NestedBrickTopo> brickTopoes = null;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private NestedCluster cluster;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ZONE_TOPO = "zone_topo";
  @SerializedName(SERIALIZED_NAME_ZONE_TOPO)
  private NestedZoneTopo zoneTopo;


  public RackTopo brickTopoes(List<NestedBrickTopo> brickTopoes) {
    
    this.brickTopoes = brickTopoes;
    return this;
  }

  public RackTopo addBrickTopoesItem(NestedBrickTopo brickTopoesItem) {
    if (this.brickTopoes == null) {
      this.brickTopoes = new ArrayList<NestedBrickTopo>();
    }
    this.brickTopoes.add(brickTopoesItem);
    return this;
  }

   /**
   * Get brickTopoes
   * @return brickTopoes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedBrickTopo> getBrickTopoes() {
    return brickTopoes;
  }


  public void setBrickTopoes(List<NestedBrickTopo> brickTopoes) {
    this.brickTopoes = brickTopoes;
  }


  public RackTopo cluster(NestedCluster cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedCluster getCluster() {
    return cluster;
  }


  public void setCluster(NestedCluster cluster) {
    this.cluster = cluster;
  }


  public RackTopo height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
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

  public String getId() {
    return id;
  }


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

  public String getLocalId() {
    return localId;
  }


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

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RackTopo zoneTopo(NestedZoneTopo zoneTopo) {
    
    this.zoneTopo = zoneTopo;
    return this;
  }

   /**
   * Get zoneTopo
   * @return zoneTopo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedZoneTopo getZoneTopo() {
    return zoneTopo;
  }


  public void setZoneTopo(NestedZoneTopo zoneTopo) {
    this.zoneTopo = zoneTopo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RackTopo rackTopo = (RackTopo) o;
    return Objects.equals(this.brickTopoes, rackTopo.brickTopoes) &&
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
    return Objects.hash(brickTopoes, cluster, height, id, localId, name, zoneTopo);
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

