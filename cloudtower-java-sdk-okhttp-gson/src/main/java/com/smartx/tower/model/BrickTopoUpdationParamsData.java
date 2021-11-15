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
import com.smartx.tower.model.NestedCapacity;
import com.smartx.tower.model.NestedTagPosition;
import com.smartx.tower.model.NodeTopoWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * BrickTopoUpdationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BrickTopoUpdationParamsData {
  public static final String SERIALIZED_NAME_TAG_POSITION_IN_BRICK = "tag_position_in_brick";
  @SerializedName(SERIALIZED_NAME_TAG_POSITION_IN_BRICK)
  private List<NestedTagPosition> tagPositionInBrick = null;

  public static final String SERIALIZED_NAME_NODE_TOPOES = "node_topoes";
  @SerializedName(SERIALIZED_NAME_NODE_TOPOES)
  private NodeTopoWhereInput nodeTopoes;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private NestedCapacity capacity;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;


  public BrickTopoUpdationParamsData tagPositionInBrick(List<NestedTagPosition> tagPositionInBrick) {
    
    this.tagPositionInBrick = tagPositionInBrick;
    return this;
  }

  public BrickTopoUpdationParamsData addTagPositionInBrickItem(NestedTagPosition tagPositionInBrickItem) {
    if (this.tagPositionInBrick == null) {
      this.tagPositionInBrick = new ArrayList<NestedTagPosition>();
    }
    this.tagPositionInBrick.add(tagPositionInBrickItem);
    return this;
  }

   /**
   * Get tagPositionInBrick
   * @return tagPositionInBrick
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedTagPosition> getTagPositionInBrick() {
    return tagPositionInBrick;
  }


  public void setTagPositionInBrick(List<NestedTagPosition> tagPositionInBrick) {
    this.tagPositionInBrick = tagPositionInBrick;
  }


  public BrickTopoUpdationParamsData nodeTopoes(NodeTopoWhereInput nodeTopoes) {
    
    this.nodeTopoes = nodeTopoes;
    return this;
  }

   /**
   * Get nodeTopoes
   * @return nodeTopoes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NodeTopoWhereInput getNodeTopoes() {
    return nodeTopoes;
  }


  public void setNodeTopoes(NodeTopoWhereInput nodeTopoes) {
    this.nodeTopoes = nodeTopoes;
  }


  public BrickTopoUpdationParamsData capacity(NestedCapacity capacity) {
    
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * @return capacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedCapacity getCapacity() {
    return capacity;
  }


  public void setCapacity(NestedCapacity capacity) {
    this.capacity = capacity;
  }


  public BrickTopoUpdationParamsData height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public BrickTopoUpdationParamsData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BrickTopoUpdationParamsData position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrickTopoUpdationParamsData brickTopoUpdationParamsData = (BrickTopoUpdationParamsData) o;
    return Objects.equals(this.tagPositionInBrick, brickTopoUpdationParamsData.tagPositionInBrick) &&
        Objects.equals(this.nodeTopoes, brickTopoUpdationParamsData.nodeTopoes) &&
        Objects.equals(this.capacity, brickTopoUpdationParamsData.capacity) &&
        Objects.equals(this.height, brickTopoUpdationParamsData.height) &&
        Objects.equals(this.name, brickTopoUpdationParamsData.name) &&
        Objects.equals(this.position, brickTopoUpdationParamsData.position);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagPositionInBrick, nodeTopoes, capacity, height, name, position);
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
    sb.append("class BrickTopoUpdationParamsData {\n");
    sb.append("    tagPositionInBrick: ").append(toIndentedString(tagPositionInBrick)).append("\n");
    sb.append("    nodeTopoes: ").append(toIndentedString(nodeTopoes)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

