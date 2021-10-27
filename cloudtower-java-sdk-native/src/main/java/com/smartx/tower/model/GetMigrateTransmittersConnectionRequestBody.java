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
import com.smartx.tower.model.MigrateTransmitterOrderByInput;
import com.smartx.tower.model.MigrateTransmitterWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetMigrateTransmittersConnectionRequestBody
 */
@JsonPropertyOrder({
  GetMigrateTransmittersConnectionRequestBody.JSON_PROPERTY_AFTER,
  GetMigrateTransmittersConnectionRequestBody.JSON_PROPERTY_BEFORE,
  GetMigrateTransmittersConnectionRequestBody.JSON_PROPERTY_FIRST,
  GetMigrateTransmittersConnectionRequestBody.JSON_PROPERTY_LAST,
  GetMigrateTransmittersConnectionRequestBody.JSON_PROPERTY_ORDER_BY,
  GetMigrateTransmittersConnectionRequestBody.JSON_PROPERTY_SKIP,
  GetMigrateTransmittersConnectionRequestBody.JSON_PROPERTY_WHERE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class GetMigrateTransmittersConnectionRequestBody {
  public static final String JSON_PROPERTY_AFTER = "after";
  private JsonNullable<String> after = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BEFORE = "before";
  private JsonNullable<String> before = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FIRST = "first";
  private JsonNullable<Double> first = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_LAST = "last";
  private JsonNullable<Double> last = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_ORDER_BY = "orderBy";
  private JsonNullable<MigrateTransmitterOrderByInput> orderBy = JsonNullable.<MigrateTransmitterOrderByInput>undefined();

  public static final String JSON_PROPERTY_SKIP = "skip";
  private JsonNullable<Double> skip = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_WHERE = "where";
  private JsonNullable<MigrateTransmitterWhereInput> where = JsonNullable.<MigrateTransmitterWhereInput>undefined();


  public GetMigrateTransmittersConnectionRequestBody after(String after) {
    this.after = JsonNullable.<String>of(after);
    return this;
  }

   /**
   * Get after
   * @return after
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getAfter() {
        return after.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAfter_JsonNullable() {
    return after;
  }
  
  @JsonProperty(JSON_PROPERTY_AFTER)
  public void setAfter_JsonNullable(JsonNullable<String> after) {
    this.after = after;
  }

  public void setAfter(String after) {
    this.after = JsonNullable.<String>of(after);
  }


  public GetMigrateTransmittersConnectionRequestBody before(String before) {
    this.before = JsonNullable.<String>of(before);
    return this;
  }

   /**
   * Get before
   * @return before
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getBefore() {
        return before.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BEFORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBefore_JsonNullable() {
    return before;
  }
  
  @JsonProperty(JSON_PROPERTY_BEFORE)
  public void setBefore_JsonNullable(JsonNullable<String> before) {
    this.before = before;
  }

  public void setBefore(String before) {
    this.before = JsonNullable.<String>of(before);
  }


  public GetMigrateTransmittersConnectionRequestBody first(Double first) {
    this.first = JsonNullable.<Double>of(first);
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Double getFirst() {
        return first.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getFirst_JsonNullable() {
    return first;
  }
  
  @JsonProperty(JSON_PROPERTY_FIRST)
  public void setFirst_JsonNullable(JsonNullable<Double> first) {
    this.first = first;
  }

  public void setFirst(Double first) {
    this.first = JsonNullable.<Double>of(first);
  }


  public GetMigrateTransmittersConnectionRequestBody last(Double last) {
    this.last = JsonNullable.<Double>of(last);
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Double getLast() {
        return last.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getLast_JsonNullable() {
    return last;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST)
  public void setLast_JsonNullable(JsonNullable<Double> last) {
    this.last = last;
  }

  public void setLast(Double last) {
    this.last = JsonNullable.<Double>of(last);
  }


  public GetMigrateTransmittersConnectionRequestBody orderBy(MigrateTransmitterOrderByInput orderBy) {
    this.orderBy = JsonNullable.<MigrateTransmitterOrderByInput>of(orderBy);
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public MigrateTransmitterOrderByInput getOrderBy() {
        return orderBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORDER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<MigrateTransmitterOrderByInput> getOrderBy_JsonNullable() {
    return orderBy;
  }
  
  @JsonProperty(JSON_PROPERTY_ORDER_BY)
  public void setOrderBy_JsonNullable(JsonNullable<MigrateTransmitterOrderByInput> orderBy) {
    this.orderBy = orderBy;
  }

  public void setOrderBy(MigrateTransmitterOrderByInput orderBy) {
    this.orderBy = JsonNullable.<MigrateTransmitterOrderByInput>of(orderBy);
  }


  public GetMigrateTransmittersConnectionRequestBody skip(Double skip) {
    this.skip = JsonNullable.<Double>of(skip);
    return this;
  }

   /**
   * Get skip
   * @return skip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Double getSkip() {
        return skip.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SKIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getSkip_JsonNullable() {
    return skip;
  }
  
  @JsonProperty(JSON_PROPERTY_SKIP)
  public void setSkip_JsonNullable(JsonNullable<Double> skip) {
    this.skip = skip;
  }

  public void setSkip(Double skip) {
    this.skip = JsonNullable.<Double>of(skip);
  }


  public GetMigrateTransmittersConnectionRequestBody where(MigrateTransmitterWhereInput where) {
    this.where = JsonNullable.<MigrateTransmitterWhereInput>of(where);
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public MigrateTransmitterWhereInput getWhere() {
        return where.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WHERE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<MigrateTransmitterWhereInput> getWhere_JsonNullable() {
    return where;
  }
  
  @JsonProperty(JSON_PROPERTY_WHERE)
  public void setWhere_JsonNullable(JsonNullable<MigrateTransmitterWhereInput> where) {
    this.where = where;
  }

  public void setWhere(MigrateTransmitterWhereInput where) {
    this.where = JsonNullable.<MigrateTransmitterWhereInput>of(where);
  }


  /**
   * Return true if this GetMigrateTransmittersConnectionRequestBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMigrateTransmittersConnectionRequestBody getMigrateTransmittersConnectionRequestBody = (GetMigrateTransmittersConnectionRequestBody) o;
    return equalsNullable(this.after, getMigrateTransmittersConnectionRequestBody.after) &&
        equalsNullable(this.before, getMigrateTransmittersConnectionRequestBody.before) &&
        equalsNullable(this.first, getMigrateTransmittersConnectionRequestBody.first) &&
        equalsNullable(this.last, getMigrateTransmittersConnectionRequestBody.last) &&
        equalsNullable(this.orderBy, getMigrateTransmittersConnectionRequestBody.orderBy) &&
        equalsNullable(this.skip, getMigrateTransmittersConnectionRequestBody.skip) &&
        equalsNullable(this.where, getMigrateTransmittersConnectionRequestBody.where);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(after), hashCodeNullable(before), hashCodeNullable(first), hashCodeNullable(last), hashCodeNullable(orderBy), hashCodeNullable(skip), hashCodeNullable(where));
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
    sb.append("class GetMigrateTransmittersConnectionRequestBody {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
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

