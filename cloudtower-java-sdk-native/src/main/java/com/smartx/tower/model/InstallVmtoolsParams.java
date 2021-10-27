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
import com.smartx.tower.model.InstallVmtoolsParamsData;
import com.smartx.tower.model.VmWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * InstallVmtoolsParams
 */
@JsonPropertyOrder({
  InstallVmtoolsParams.JSON_PROPERTY_DATA,
  InstallVmtoolsParams.JSON_PROPERTY_WHERE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class InstallVmtoolsParams {
  public static final String JSON_PROPERTY_DATA = "data";
  private InstallVmtoolsParamsData data;

  public static final String JSON_PROPERTY_WHERE = "where";
  private VmWhereInput where;


  public InstallVmtoolsParams data(InstallVmtoolsParamsData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public InstallVmtoolsParamsData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(InstallVmtoolsParamsData data) {
    this.data = data;
  }


  public InstallVmtoolsParams where(VmWhereInput where) {
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WHERE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public VmWhereInput getWhere() {
    return where;
  }


  @JsonProperty(JSON_PROPERTY_WHERE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWhere(VmWhereInput where) {
    this.where = where;
  }


  /**
   * Return true if this InstallVmtoolsParams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallVmtoolsParams installVmtoolsParams = (InstallVmtoolsParams) o;
    return Objects.equals(this.data, installVmtoolsParams.data) &&
        Objects.equals(this.where, installVmtoolsParams.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallVmtoolsParams {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

