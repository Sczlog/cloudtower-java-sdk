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
import com.smartx.tower.model.IsolationPolicyEgress;
import com.smartx.tower.model.SecurityPolicyApplyTo;
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
 * SecurityPolicy
 */
@JsonPropertyOrder({
  SecurityPolicy.JSON_PROPERTY_APPLY_TO,
  SecurityPolicy.JSON_PROPERTY_DESCRIPTION,
  SecurityPolicy.JSON_PROPERTY_EGRESS,
  SecurityPolicy.JSON_PROPERTY_EVEROUTE_CLUSTER,
  SecurityPolicy.JSON_PROPERTY_ID,
  SecurityPolicy.JSON_PROPERTY_INGRESS,
  SecurityPolicy.JSON_PROPERTY_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class SecurityPolicy {
  public static final String JSON_PROPERTY_APPLY_TO = "apply_to";
  private List<SecurityPolicyApplyTo> applyTo = new ArrayList<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EGRESS = "egress";
  private JsonNullable<List<IsolationPolicyEgress>> egress = JsonNullable.<List<IsolationPolicyEgress>>undefined();

  public static final String JSON_PROPERTY_EVEROUTE_CLUSTER = "everoute_cluster";
  private AlertRuleCluster everouteCluster;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INGRESS = "ingress";
  private JsonNullable<List<IsolationPolicyEgress>> ingress = JsonNullable.<List<IsolationPolicyEgress>>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public SecurityPolicy applyTo(List<SecurityPolicyApplyTo> applyTo) {
    this.applyTo = applyTo;
    return this;
  }

  public SecurityPolicy addApplyToItem(SecurityPolicyApplyTo applyToItem) {
    this.applyTo.add(applyToItem);
    return this;
  }

   /**
   * Get applyTo
   * @return applyTo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_APPLY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SecurityPolicyApplyTo> getApplyTo() {
    return applyTo;
  }


  @JsonProperty(JSON_PROPERTY_APPLY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApplyTo(List<SecurityPolicyApplyTo> applyTo) {
    this.applyTo = applyTo;
  }


  public SecurityPolicy description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public SecurityPolicy egress(List<IsolationPolicyEgress> egress) {
    this.egress = JsonNullable.<List<IsolationPolicyEgress>>of(egress);
    return this;
  }

  public SecurityPolicy addEgressItem(IsolationPolicyEgress egressItem) {
    if (this.egress == null || !this.egress.isPresent()) {
      this.egress = JsonNullable.<List<IsolationPolicyEgress>>of(new ArrayList<>());
    }
    try {
      this.egress.get().add(egressItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get egress
   * @return egress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<IsolationPolicyEgress> getEgress() {
        return egress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EGRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<IsolationPolicyEgress>> getEgress_JsonNullable() {
    return egress;
  }
  
  @JsonProperty(JSON_PROPERTY_EGRESS)
  public void setEgress_JsonNullable(JsonNullable<List<IsolationPolicyEgress>> egress) {
    this.egress = egress;
  }

  public void setEgress(List<IsolationPolicyEgress> egress) {
    this.egress = JsonNullable.<List<IsolationPolicyEgress>>of(egress);
  }


  public SecurityPolicy everouteCluster(AlertRuleCluster everouteCluster) {
    this.everouteCluster = everouteCluster;
    return this;
  }

   /**
   * Get everouteCluster
   * @return everouteCluster
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EVEROUTE_CLUSTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AlertRuleCluster getEverouteCluster() {
    return everouteCluster;
  }


  @JsonProperty(JSON_PROPERTY_EVEROUTE_CLUSTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEverouteCluster(AlertRuleCluster everouteCluster) {
    this.everouteCluster = everouteCluster;
  }


  public SecurityPolicy id(String id) {
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


  public SecurityPolicy ingress(List<IsolationPolicyEgress> ingress) {
    this.ingress = JsonNullable.<List<IsolationPolicyEgress>>of(ingress);
    return this;
  }

  public SecurityPolicy addIngressItem(IsolationPolicyEgress ingressItem) {
    if (this.ingress == null || !this.ingress.isPresent()) {
      this.ingress = JsonNullable.<List<IsolationPolicyEgress>>of(new ArrayList<>());
    }
    try {
      this.ingress.get().add(ingressItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get ingress
   * @return ingress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<IsolationPolicyEgress> getIngress() {
        return ingress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INGRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<IsolationPolicyEgress>> getIngress_JsonNullable() {
    return ingress;
  }
  
  @JsonProperty(JSON_PROPERTY_INGRESS)
  public void setIngress_JsonNullable(JsonNullable<List<IsolationPolicyEgress>> ingress) {
    this.ingress = ingress;
  }

  public void setIngress(List<IsolationPolicyEgress> ingress) {
    this.ingress = JsonNullable.<List<IsolationPolicyEgress>>of(ingress);
  }


  public SecurityPolicy name(String name) {
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


  /**
   * Return true if this SecurityPolicy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityPolicy securityPolicy = (SecurityPolicy) o;
    return Objects.equals(this.applyTo, securityPolicy.applyTo) &&
        Objects.equals(this.description, securityPolicy.description) &&
        equalsNullable(this.egress, securityPolicy.egress) &&
        Objects.equals(this.everouteCluster, securityPolicy.everouteCluster) &&
        Objects.equals(this.id, securityPolicy.id) &&
        equalsNullable(this.ingress, securityPolicy.ingress) &&
        Objects.equals(this.name, securityPolicy.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyTo, description, hashCodeNullable(egress), everouteCluster, id, hashCodeNullable(ingress), name);
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
    sb.append("class SecurityPolicy {\n");
    sb.append("    applyTo: ").append(toIndentedString(applyTo)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
    sb.append("    everouteCluster: ").append(toIndentedString(everouteCluster)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

