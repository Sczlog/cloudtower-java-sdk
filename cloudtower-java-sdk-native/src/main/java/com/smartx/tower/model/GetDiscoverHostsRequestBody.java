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
import com.smartx.tower.model.ClusterWhereUniqueInput;
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
 * GetDiscoverHostsRequestBody
 */
@JsonPropertyOrder({
  GetDiscoverHostsRequestBody.JSON_PROPERTY_CLUSTER,
  GetDiscoverHostsRequestBody.JSON_PROPERTY_HOST_ADDRESS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class GetDiscoverHostsRequestBody {
  public static final String JSON_PROPERTY_CLUSTER = "cluster";
  private ClusterWhereUniqueInput cluster;

  public static final String JSON_PROPERTY_HOST_ADDRESS = "host_address";
  private JsonNullable<List<String>> hostAddress = JsonNullable.<List<String>>undefined();


  public GetDiscoverHostsRequestBody cluster(ClusterWhereUniqueInput cluster) {
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

  public ClusterWhereUniqueInput getCluster() {
    return cluster;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCluster(ClusterWhereUniqueInput cluster) {
    this.cluster = cluster;
  }


  public GetDiscoverHostsRequestBody hostAddress(List<String> hostAddress) {
    this.hostAddress = JsonNullable.<List<String>>of(hostAddress);
    return this;
  }

  public GetDiscoverHostsRequestBody addHostAddressItem(String hostAddressItem) {
    if (this.hostAddress == null || !this.hostAddress.isPresent()) {
      this.hostAddress = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.hostAddress.get().add(hostAddressItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get hostAddress
   * @return hostAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<String> getHostAddress() {
        return hostAddress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HOST_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getHostAddress_JsonNullable() {
    return hostAddress;
  }
  
  @JsonProperty(JSON_PROPERTY_HOST_ADDRESS)
  public void setHostAddress_JsonNullable(JsonNullable<List<String>> hostAddress) {
    this.hostAddress = hostAddress;
  }

  public void setHostAddress(List<String> hostAddress) {
    this.hostAddress = JsonNullable.<List<String>>of(hostAddress);
  }


  /**
   * Return true if this GetDiscoverHostsRequestBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDiscoverHostsRequestBody getDiscoverHostsRequestBody = (GetDiscoverHostsRequestBody) o;
    return Objects.equals(this.cluster, getDiscoverHostsRequestBody.cluster) &&
        equalsNullable(this.hostAddress, getDiscoverHostsRequestBody.hostAddress);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, hashCodeNullable(hostAddress));
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
    sb.append("class GetDiscoverHostsRequestBody {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    hostAddress: ").append(toIndentedString(hostAddress)).append("\n");
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

