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
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.VmVmPolicy;
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
 * VmPlacementGroup
 */
@JsonPropertyOrder({
  VmPlacementGroup.JSON_PROPERTY_CLUSTER,
  VmPlacementGroup.JSON_PROPERTY_DESCRIPTION,
  VmPlacementGroup.JSON_PROPERTY_ENABLED,
  VmPlacementGroup.JSON_PROPERTY_ENTITY_ASYNC_STATUS,
  VmPlacementGroup.JSON_PROPERTY_ID,
  VmPlacementGroup.JSON_PROPERTY_LOCAL_CREATED_AT,
  VmPlacementGroup.JSON_PROPERTY_LOCAL_ID,
  VmPlacementGroup.JSON_PROPERTY_LOCAL_UPDATED_AT,
  VmPlacementGroup.JSON_PROPERTY_NAME,
  VmPlacementGroup.JSON_PROPERTY_VM_HOST_MUST_ENABLED,
  VmPlacementGroup.JSON_PROPERTY_VM_HOST_MUST_HOST_UUIDS,
  VmPlacementGroup.JSON_PROPERTY_VM_HOST_MUST_POLICY,
  VmPlacementGroup.JSON_PROPERTY_VM_HOST_PREFER_ENABLED,
  VmPlacementGroup.JSON_PROPERTY_VM_HOST_PREFER_HOST_UUIDS,
  VmPlacementGroup.JSON_PROPERTY_VM_HOST_PREFER_POLICY,
  VmPlacementGroup.JSON_PROPERTY_VM_VM_POLICY,
  VmPlacementGroup.JSON_PROPERTY_VM_VM_POLICY_ENABLED,
  VmPlacementGroup.JSON_PROPERTY_VMS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class VmPlacementGroup {
  public static final String JSON_PROPERTY_CLUSTER = "cluster";
  private AlertRuleCluster cluster;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  private JsonNullable<EntityAsyncStatus> entityAsyncStatus = JsonNullable.<EntityAsyncStatus>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LOCAL_CREATED_AT = "local_created_at";
  private String localCreatedAt;

  public static final String JSON_PROPERTY_LOCAL_ID = "local_id";
  private String localId;

  public static final String JSON_PROPERTY_LOCAL_UPDATED_AT = "local_updated_at";
  private String localUpdatedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VM_HOST_MUST_ENABLED = "vm_host_must_enabled";
  private Boolean vmHostMustEnabled;

  public static final String JSON_PROPERTY_VM_HOST_MUST_HOST_UUIDS = "vm_host_must_host_uuids";
  private JsonNullable<List<AlertRuleCluster>> vmHostMustHostUuids = JsonNullable.<List<AlertRuleCluster>>undefined();

  public static final String JSON_PROPERTY_VM_HOST_MUST_POLICY = "vm_host_must_policy";
  private Boolean vmHostMustPolicy;

  public static final String JSON_PROPERTY_VM_HOST_PREFER_ENABLED = "vm_host_prefer_enabled";
  private Boolean vmHostPreferEnabled;

  public static final String JSON_PROPERTY_VM_HOST_PREFER_HOST_UUIDS = "vm_host_prefer_host_uuids";
  private JsonNullable<List<AlertRuleCluster>> vmHostPreferHostUuids = JsonNullable.<List<AlertRuleCluster>>undefined();

  public static final String JSON_PROPERTY_VM_HOST_PREFER_POLICY = "vm_host_prefer_policy";
  private Boolean vmHostPreferPolicy;

  public static final String JSON_PROPERTY_VM_VM_POLICY = "vm_vm_policy";
  private VmVmPolicy vmVmPolicy;

  public static final String JSON_PROPERTY_VM_VM_POLICY_ENABLED = "vm_vm_policy_enabled";
  private Boolean vmVmPolicyEnabled;

  public static final String JSON_PROPERTY_VMS = "vms";
  private JsonNullable<List<AlertRuleCluster>> vms = JsonNullable.<List<AlertRuleCluster>>undefined();


  public VmPlacementGroup cluster(AlertRuleCluster cluster) {
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


  public VmPlacementGroup description(String description) {
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


  public VmPlacementGroup enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public VmPlacementGroup entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    this.entityAsyncStatus = JsonNullable.<EntityAsyncStatus>of(entityAsyncStatus);
    return this;
  }

   /**
   * Get entityAsyncStatus
   * @return entityAsyncStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public EntityAsyncStatus getEntityAsyncStatus() {
        return entityAsyncStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENTITY_ASYNC_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<EntityAsyncStatus> getEntityAsyncStatus_JsonNullable() {
    return entityAsyncStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTITY_ASYNC_STATUS)
  public void setEntityAsyncStatus_JsonNullable(JsonNullable<EntityAsyncStatus> entityAsyncStatus) {
    this.entityAsyncStatus = entityAsyncStatus;
  }

  public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    this.entityAsyncStatus = JsonNullable.<EntityAsyncStatus>of(entityAsyncStatus);
  }


  public VmPlacementGroup id(String id) {
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


  public VmPlacementGroup localCreatedAt(String localCreatedAt) {
    this.localCreatedAt = localCreatedAt;
    return this;
  }

   /**
   * Get localCreatedAt
   * @return localCreatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LOCAL_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLocalCreatedAt() {
    return localCreatedAt;
  }


  @JsonProperty(JSON_PROPERTY_LOCAL_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocalCreatedAt(String localCreatedAt) {
    this.localCreatedAt = localCreatedAt;
  }


  public VmPlacementGroup localId(String localId) {
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


  public VmPlacementGroup localUpdatedAt(String localUpdatedAt) {
    this.localUpdatedAt = localUpdatedAt;
    return this;
  }

   /**
   * Get localUpdatedAt
   * @return localUpdatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LOCAL_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLocalUpdatedAt() {
    return localUpdatedAt;
  }


  @JsonProperty(JSON_PROPERTY_LOCAL_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocalUpdatedAt(String localUpdatedAt) {
    this.localUpdatedAt = localUpdatedAt;
  }


  public VmPlacementGroup name(String name) {
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


  public VmPlacementGroup vmHostMustEnabled(Boolean vmHostMustEnabled) {
    this.vmHostMustEnabled = vmHostMustEnabled;
    return this;
  }

   /**
   * Get vmHostMustEnabled
   * @return vmHostMustEnabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VM_HOST_MUST_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getVmHostMustEnabled() {
    return vmHostMustEnabled;
  }


  @JsonProperty(JSON_PROPERTY_VM_HOST_MUST_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVmHostMustEnabled(Boolean vmHostMustEnabled) {
    this.vmHostMustEnabled = vmHostMustEnabled;
  }


  public VmPlacementGroup vmHostMustHostUuids(List<AlertRuleCluster> vmHostMustHostUuids) {
    this.vmHostMustHostUuids = JsonNullable.<List<AlertRuleCluster>>of(vmHostMustHostUuids);
    return this;
  }

  public VmPlacementGroup addVmHostMustHostUuidsItem(AlertRuleCluster vmHostMustHostUuidsItem) {
    if (this.vmHostMustHostUuids == null || !this.vmHostMustHostUuids.isPresent()) {
      this.vmHostMustHostUuids = JsonNullable.<List<AlertRuleCluster>>of(new ArrayList<>());
    }
    try {
      this.vmHostMustHostUuids.get().add(vmHostMustHostUuidsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get vmHostMustHostUuids
   * @return vmHostMustHostUuids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<AlertRuleCluster> getVmHostMustHostUuids() {
        return vmHostMustHostUuids.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VM_HOST_MUST_HOST_UUIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AlertRuleCluster>> getVmHostMustHostUuids_JsonNullable() {
    return vmHostMustHostUuids;
  }
  
  @JsonProperty(JSON_PROPERTY_VM_HOST_MUST_HOST_UUIDS)
  public void setVmHostMustHostUuids_JsonNullable(JsonNullable<List<AlertRuleCluster>> vmHostMustHostUuids) {
    this.vmHostMustHostUuids = vmHostMustHostUuids;
  }

  public void setVmHostMustHostUuids(List<AlertRuleCluster> vmHostMustHostUuids) {
    this.vmHostMustHostUuids = JsonNullable.<List<AlertRuleCluster>>of(vmHostMustHostUuids);
  }


  public VmPlacementGroup vmHostMustPolicy(Boolean vmHostMustPolicy) {
    this.vmHostMustPolicy = vmHostMustPolicy;
    return this;
  }

   /**
   * Get vmHostMustPolicy
   * @return vmHostMustPolicy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VM_HOST_MUST_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getVmHostMustPolicy() {
    return vmHostMustPolicy;
  }


  @JsonProperty(JSON_PROPERTY_VM_HOST_MUST_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVmHostMustPolicy(Boolean vmHostMustPolicy) {
    this.vmHostMustPolicy = vmHostMustPolicy;
  }


  public VmPlacementGroup vmHostPreferEnabled(Boolean vmHostPreferEnabled) {
    this.vmHostPreferEnabled = vmHostPreferEnabled;
    return this;
  }

   /**
   * Get vmHostPreferEnabled
   * @return vmHostPreferEnabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VM_HOST_PREFER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getVmHostPreferEnabled() {
    return vmHostPreferEnabled;
  }


  @JsonProperty(JSON_PROPERTY_VM_HOST_PREFER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVmHostPreferEnabled(Boolean vmHostPreferEnabled) {
    this.vmHostPreferEnabled = vmHostPreferEnabled;
  }


  public VmPlacementGroup vmHostPreferHostUuids(List<AlertRuleCluster> vmHostPreferHostUuids) {
    this.vmHostPreferHostUuids = JsonNullable.<List<AlertRuleCluster>>of(vmHostPreferHostUuids);
    return this;
  }

  public VmPlacementGroup addVmHostPreferHostUuidsItem(AlertRuleCluster vmHostPreferHostUuidsItem) {
    if (this.vmHostPreferHostUuids == null || !this.vmHostPreferHostUuids.isPresent()) {
      this.vmHostPreferHostUuids = JsonNullable.<List<AlertRuleCluster>>of(new ArrayList<>());
    }
    try {
      this.vmHostPreferHostUuids.get().add(vmHostPreferHostUuidsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get vmHostPreferHostUuids
   * @return vmHostPreferHostUuids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<AlertRuleCluster> getVmHostPreferHostUuids() {
        return vmHostPreferHostUuids.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VM_HOST_PREFER_HOST_UUIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AlertRuleCluster>> getVmHostPreferHostUuids_JsonNullable() {
    return vmHostPreferHostUuids;
  }
  
  @JsonProperty(JSON_PROPERTY_VM_HOST_PREFER_HOST_UUIDS)
  public void setVmHostPreferHostUuids_JsonNullable(JsonNullable<List<AlertRuleCluster>> vmHostPreferHostUuids) {
    this.vmHostPreferHostUuids = vmHostPreferHostUuids;
  }

  public void setVmHostPreferHostUuids(List<AlertRuleCluster> vmHostPreferHostUuids) {
    this.vmHostPreferHostUuids = JsonNullable.<List<AlertRuleCluster>>of(vmHostPreferHostUuids);
  }


  public VmPlacementGroup vmHostPreferPolicy(Boolean vmHostPreferPolicy) {
    this.vmHostPreferPolicy = vmHostPreferPolicy;
    return this;
  }

   /**
   * Get vmHostPreferPolicy
   * @return vmHostPreferPolicy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VM_HOST_PREFER_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getVmHostPreferPolicy() {
    return vmHostPreferPolicy;
  }


  @JsonProperty(JSON_PROPERTY_VM_HOST_PREFER_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVmHostPreferPolicy(Boolean vmHostPreferPolicy) {
    this.vmHostPreferPolicy = vmHostPreferPolicy;
  }


  public VmPlacementGroup vmVmPolicy(VmVmPolicy vmVmPolicy) {
    this.vmVmPolicy = vmVmPolicy;
    return this;
  }

   /**
   * Get vmVmPolicy
   * @return vmVmPolicy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VM_VM_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public VmVmPolicy getVmVmPolicy() {
    return vmVmPolicy;
  }


  @JsonProperty(JSON_PROPERTY_VM_VM_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVmVmPolicy(VmVmPolicy vmVmPolicy) {
    this.vmVmPolicy = vmVmPolicy;
  }


  public VmPlacementGroup vmVmPolicyEnabled(Boolean vmVmPolicyEnabled) {
    this.vmVmPolicyEnabled = vmVmPolicyEnabled;
    return this;
  }

   /**
   * Get vmVmPolicyEnabled
   * @return vmVmPolicyEnabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VM_VM_POLICY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getVmVmPolicyEnabled() {
    return vmVmPolicyEnabled;
  }


  @JsonProperty(JSON_PROPERTY_VM_VM_POLICY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVmVmPolicyEnabled(Boolean vmVmPolicyEnabled) {
    this.vmVmPolicyEnabled = vmVmPolicyEnabled;
  }


  public VmPlacementGroup vms(List<AlertRuleCluster> vms) {
    this.vms = JsonNullable.<List<AlertRuleCluster>>of(vms);
    return this;
  }

  public VmPlacementGroup addVmsItem(AlertRuleCluster vmsItem) {
    if (this.vms == null || !this.vms.isPresent()) {
      this.vms = JsonNullable.<List<AlertRuleCluster>>of(new ArrayList<>());
    }
    try {
      this.vms.get().add(vmsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get vms
   * @return vms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<AlertRuleCluster> getVms() {
        return vms.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AlertRuleCluster>> getVms_JsonNullable() {
    return vms;
  }
  
  @JsonProperty(JSON_PROPERTY_VMS)
  public void setVms_JsonNullable(JsonNullable<List<AlertRuleCluster>> vms) {
    this.vms = vms;
  }

  public void setVms(List<AlertRuleCluster> vms) {
    this.vms = JsonNullable.<List<AlertRuleCluster>>of(vms);
  }


  /**
   * Return true if this VmPlacementGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmPlacementGroup vmPlacementGroup = (VmPlacementGroup) o;
    return Objects.equals(this.cluster, vmPlacementGroup.cluster) &&
        Objects.equals(this.description, vmPlacementGroup.description) &&
        Objects.equals(this.enabled, vmPlacementGroup.enabled) &&
        equalsNullable(this.entityAsyncStatus, vmPlacementGroup.entityAsyncStatus) &&
        Objects.equals(this.id, vmPlacementGroup.id) &&
        Objects.equals(this.localCreatedAt, vmPlacementGroup.localCreatedAt) &&
        Objects.equals(this.localId, vmPlacementGroup.localId) &&
        Objects.equals(this.localUpdatedAt, vmPlacementGroup.localUpdatedAt) &&
        Objects.equals(this.name, vmPlacementGroup.name) &&
        Objects.equals(this.vmHostMustEnabled, vmPlacementGroup.vmHostMustEnabled) &&
        equalsNullable(this.vmHostMustHostUuids, vmPlacementGroup.vmHostMustHostUuids) &&
        Objects.equals(this.vmHostMustPolicy, vmPlacementGroup.vmHostMustPolicy) &&
        Objects.equals(this.vmHostPreferEnabled, vmPlacementGroup.vmHostPreferEnabled) &&
        equalsNullable(this.vmHostPreferHostUuids, vmPlacementGroup.vmHostPreferHostUuids) &&
        Objects.equals(this.vmHostPreferPolicy, vmPlacementGroup.vmHostPreferPolicy) &&
        Objects.equals(this.vmVmPolicy, vmPlacementGroup.vmVmPolicy) &&
        Objects.equals(this.vmVmPolicyEnabled, vmPlacementGroup.vmVmPolicyEnabled) &&
        equalsNullable(this.vms, vmPlacementGroup.vms);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, description, enabled, hashCodeNullable(entityAsyncStatus), id, localCreatedAt, localId, localUpdatedAt, name, vmHostMustEnabled, hashCodeNullable(vmHostMustHostUuids), vmHostMustPolicy, vmHostPreferEnabled, hashCodeNullable(vmHostPreferHostUuids), vmHostPreferPolicy, vmVmPolicy, vmVmPolicyEnabled, hashCodeNullable(vms));
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
    sb.append("class VmPlacementGroup {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    localUpdatedAt: ").append(toIndentedString(localUpdatedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vmHostMustEnabled: ").append(toIndentedString(vmHostMustEnabled)).append("\n");
    sb.append("    vmHostMustHostUuids: ").append(toIndentedString(vmHostMustHostUuids)).append("\n");
    sb.append("    vmHostMustPolicy: ").append(toIndentedString(vmHostMustPolicy)).append("\n");
    sb.append("    vmHostPreferEnabled: ").append(toIndentedString(vmHostPreferEnabled)).append("\n");
    sb.append("    vmHostPreferHostUuids: ").append(toIndentedString(vmHostPreferHostUuids)).append("\n");
    sb.append("    vmHostPreferPolicy: ").append(toIndentedString(vmHostPreferPolicy)).append("\n");
    sb.append("    vmVmPolicy: ").append(toIndentedString(vmVmPolicy)).append("\n");
    sb.append("    vmVmPolicyEnabled: ").append(toIndentedString(vmVmPolicyEnabled)).append("\n");
    sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
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

