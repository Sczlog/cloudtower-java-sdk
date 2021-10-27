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

/**
 * IscsiTargetInitiatorChaps
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T16:05:01.910402800+08:00[Asia/Shanghai]")
public class IscsiTargetInitiatorChaps {
  public static final String SERIALIZED_NAME_INITIATOR_IQN = "initiator_iqn";
  @SerializedName(SERIALIZED_NAME_INITIATOR_IQN)
  private String initiatorIqn;

  public static final String SERIALIZED_NAME_CHAP_SECRET = "chap_secret";
  @SerializedName(SERIALIZED_NAME_CHAP_SECRET)
  private String chapSecret;

  public static final String SERIALIZED_NAME_CHAP_NAME = "chap_name";
  @SerializedName(SERIALIZED_NAME_CHAP_NAME)
  private String chapName;


  public IscsiTargetInitiatorChaps initiatorIqn(String initiatorIqn) {
    
    this.initiatorIqn = initiatorIqn;
    return this;
  }

   /**
   * Get initiatorIqn
   * @return initiatorIqn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getInitiatorIqn() {
    return initiatorIqn;
  }


  public void setInitiatorIqn(String initiatorIqn) {
    this.initiatorIqn = initiatorIqn;
  }


  public IscsiTargetInitiatorChaps chapSecret(String chapSecret) {
    
    this.chapSecret = chapSecret;
    return this;
  }

   /**
   * Get chapSecret
   * @return chapSecret
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getChapSecret() {
    return chapSecret;
  }


  public void setChapSecret(String chapSecret) {
    this.chapSecret = chapSecret;
  }


  public IscsiTargetInitiatorChaps chapName(String chapName) {
    
    this.chapName = chapName;
    return this;
  }

   /**
   * Get chapName
   * @return chapName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getChapName() {
    return chapName;
  }


  public void setChapName(String chapName) {
    this.chapName = chapName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiTargetInitiatorChaps iscsiTargetInitiatorChaps = (IscsiTargetInitiatorChaps) o;
    return Objects.equals(this.initiatorIqn, iscsiTargetInitiatorChaps.initiatorIqn) &&
        Objects.equals(this.chapSecret, iscsiTargetInitiatorChaps.chapSecret) &&
        Objects.equals(this.chapName, iscsiTargetInitiatorChaps.chapName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initiatorIqn, chapSecret, chapName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiTargetInitiatorChaps {\n");
    sb.append("    initiatorIqn: ").append(toIndentedString(initiatorIqn)).append("\n");
    sb.append("    chapSecret: ").append(toIndentedString(chapSecret)).append("\n");
    sb.append("    chapName: ").append(toIndentedString(chapName)).append("\n");
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

