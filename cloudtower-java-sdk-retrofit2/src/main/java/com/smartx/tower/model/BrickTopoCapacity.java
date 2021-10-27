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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * BrickTopoCapacity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:23:54.291904700+08:00[Asia/Shanghai]")
public class BrickTopoCapacity {
  public static final String SERIALIZED_NAME_ROW = "row";
  @SerializedName(SERIALIZED_NAME_ROW)
  private Double row;

  public static final String SERIALIZED_NAME_COLUMN = "column";
  @SerializedName(SERIALIZED_NAME_COLUMN)
  private Double column;


  public BrickTopoCapacity row(Double row) {
    
    this.row = row;
    return this;
  }

   /**
   * Get row
   * @return row
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getRow() {
    return row;
  }


  public void setRow(Double row) {
    this.row = row;
  }


  public BrickTopoCapacity column(Double column) {
    
    this.column = column;
    return this;
  }

   /**
   * Get column
   * @return column
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getColumn() {
    return column;
  }


  public void setColumn(Double column) {
    this.column = column;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrickTopoCapacity brickTopoCapacity = (BrickTopoCapacity) o;
    return Objects.equals(this.row, brickTopoCapacity.row) &&
        Objects.equals(this.column, brickTopoCapacity.column);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(row, column);
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
    sb.append("class BrickTopoCapacity {\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
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

