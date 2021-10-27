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
import com.smartx.tower.model.AlertDisk;
import com.smartx.tower.model.AlertRuleCluster;
import com.smartx.tower.model.VmNicModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * VmNic
 */
@JsonPropertyOrder({
  VmNic.JSON_PROPERTY_ENABLED,
  VmNic.JSON_PROPERTY_GATEWAY,
  VmNic.JSON_PROPERTY_ID,
  VmNic.JSON_PROPERTY_INTERFACE_ID,
  VmNic.JSON_PROPERTY_IP_ADDRESS,
  VmNic.JSON_PROPERTY_LOCAL_ID,
  VmNic.JSON_PROPERTY_MAC_ADDRESS,
  VmNic.JSON_PROPERTY_MIRROR,
  VmNic.JSON_PROPERTY_MODEL,
  VmNic.JSON_PROPERTY_NIC,
  VmNic.JSON_PROPERTY_ORDER,
  VmNic.JSON_PROPERTY_SUBNET_MASK,
  VmNic.JSON_PROPERTY_VLAN,
  VmNic.JSON_PROPERTY_VM
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class VmNic {
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private JsonNullable<Boolean> enabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_GATEWAY = "gateway";
  private JsonNullable<String> gateway = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INTERFACE_ID = "interface_id";
  private JsonNullable<String> interfaceId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IP_ADDRESS = "ip_address";
  private JsonNullable<String> ipAddress = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOCAL_ID = "local_id";
  private String localId;

  public static final String JSON_PROPERTY_MAC_ADDRESS = "mac_address";
  private JsonNullable<String> macAddress = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MIRROR = "mirror";
  private JsonNullable<Boolean> mirror = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_MODEL = "model";
  private JsonNullable<VmNicModel> model = JsonNullable.<VmNicModel>undefined();

  public static final String JSON_PROPERTY_NIC = "nic";
  private JsonNullable<AlertDisk> nic = JsonNullable.<AlertDisk>undefined();

  public static final String JSON_PROPERTY_ORDER = "order";
  private JsonNullable<Double> order = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_SUBNET_MASK = "subnet_mask";
  private JsonNullable<String> subnetMask = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VLAN = "vlan";
  private JsonNullable<AlertDisk> vlan = JsonNullable.<AlertDisk>undefined();

  public static final String JSON_PROPERTY_VM = "vm";
  private AlertRuleCluster vm;


  public VmNic enabled(Boolean enabled) {
    this.enabled = JsonNullable.<Boolean>of(enabled);
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Boolean getEnabled() {
        return enabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getEnabled_JsonNullable() {
    return enabled;
  }
  
  @JsonProperty(JSON_PROPERTY_ENABLED)
  public void setEnabled_JsonNullable(JsonNullable<Boolean> enabled) {
    this.enabled = enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = JsonNullable.<Boolean>of(enabled);
  }


  public VmNic gateway(String gateway) {
    this.gateway = JsonNullable.<String>of(gateway);
    return this;
  }

   /**
   * Get gateway
   * @return gateway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getGateway() {
        return gateway.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GATEWAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getGateway_JsonNullable() {
    return gateway;
  }
  
  @JsonProperty(JSON_PROPERTY_GATEWAY)
  public void setGateway_JsonNullable(JsonNullable<String> gateway) {
    this.gateway = gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = JsonNullable.<String>of(gateway);
  }


  public VmNic id(String id) {
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


  public VmNic interfaceId(String interfaceId) {
    this.interfaceId = JsonNullable.<String>of(interfaceId);
    return this;
  }

   /**
   * Get interfaceId
   * @return interfaceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getInterfaceId() {
        return interfaceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTERFACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getInterfaceId_JsonNullable() {
    return interfaceId;
  }
  
  @JsonProperty(JSON_PROPERTY_INTERFACE_ID)
  public void setInterfaceId_JsonNullable(JsonNullable<String> interfaceId) {
    this.interfaceId = interfaceId;
  }

  public void setInterfaceId(String interfaceId) {
    this.interfaceId = JsonNullable.<String>of(interfaceId);
  }


  public VmNic ipAddress(String ipAddress) {
    this.ipAddress = JsonNullable.<String>of(ipAddress);
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getIpAddress() {
        return ipAddress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIpAddress_JsonNullable() {
    return ipAddress;
  }
  
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  public void setIpAddress_JsonNullable(JsonNullable<String> ipAddress) {
    this.ipAddress = ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = JsonNullable.<String>of(ipAddress);
  }


  public VmNic localId(String localId) {
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


  public VmNic macAddress(String macAddress) {
    this.macAddress = JsonNullable.<String>of(macAddress);
    return this;
  }

   /**
   * Get macAddress
   * @return macAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getMacAddress() {
        return macAddress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAC_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMacAddress_JsonNullable() {
    return macAddress;
  }
  
  @JsonProperty(JSON_PROPERTY_MAC_ADDRESS)
  public void setMacAddress_JsonNullable(JsonNullable<String> macAddress) {
    this.macAddress = macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = JsonNullable.<String>of(macAddress);
  }


  public VmNic mirror(Boolean mirror) {
    this.mirror = JsonNullable.<Boolean>of(mirror);
    return this;
  }

   /**
   * Get mirror
   * @return mirror
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Boolean getMirror() {
        return mirror.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIRROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getMirror_JsonNullable() {
    return mirror;
  }
  
  @JsonProperty(JSON_PROPERTY_MIRROR)
  public void setMirror_JsonNullable(JsonNullable<Boolean> mirror) {
    this.mirror = mirror;
  }

  public void setMirror(Boolean mirror) {
    this.mirror = JsonNullable.<Boolean>of(mirror);
  }


  public VmNic model(VmNicModel model) {
    this.model = JsonNullable.<VmNicModel>of(model);
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public VmNicModel getModel() {
        return model.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<VmNicModel> getModel_JsonNullable() {
    return model;
  }
  
  @JsonProperty(JSON_PROPERTY_MODEL)
  public void setModel_JsonNullable(JsonNullable<VmNicModel> model) {
    this.model = model;
  }

  public void setModel(VmNicModel model) {
    this.model = JsonNullable.<VmNicModel>of(model);
  }


  public VmNic nic(AlertDisk nic) {
    this.nic = JsonNullable.<AlertDisk>of(nic);
    return this;
  }

   /**
   * Get nic
   * @return nic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public AlertDisk getNic() {
        return nic.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<AlertDisk> getNic_JsonNullable() {
    return nic;
  }
  
  @JsonProperty(JSON_PROPERTY_NIC)
  public void setNic_JsonNullable(JsonNullable<AlertDisk> nic) {
    this.nic = nic;
  }

  public void setNic(AlertDisk nic) {
    this.nic = JsonNullable.<AlertDisk>of(nic);
  }


  public VmNic order(Double order) {
    this.order = JsonNullable.<Double>of(order);
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Double getOrder() {
        return order.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getOrder_JsonNullable() {
    return order;
  }
  
  @JsonProperty(JSON_PROPERTY_ORDER)
  public void setOrder_JsonNullable(JsonNullable<Double> order) {
    this.order = order;
  }

  public void setOrder(Double order) {
    this.order = JsonNullable.<Double>of(order);
  }


  public VmNic subnetMask(String subnetMask) {
    this.subnetMask = JsonNullable.<String>of(subnetMask);
    return this;
  }

   /**
   * Get subnetMask
   * @return subnetMask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getSubnetMask() {
        return subnetMask.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBNET_MASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSubnetMask_JsonNullable() {
    return subnetMask;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBNET_MASK)
  public void setSubnetMask_JsonNullable(JsonNullable<String> subnetMask) {
    this.subnetMask = subnetMask;
  }

  public void setSubnetMask(String subnetMask) {
    this.subnetMask = JsonNullable.<String>of(subnetMask);
  }


  public VmNic vlan(AlertDisk vlan) {
    this.vlan = JsonNullable.<AlertDisk>of(vlan);
    return this;
  }

   /**
   * Get vlan
   * @return vlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public AlertDisk getVlan() {
        return vlan.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<AlertDisk> getVlan_JsonNullable() {
    return vlan;
  }
  
  @JsonProperty(JSON_PROPERTY_VLAN)
  public void setVlan_JsonNullable(JsonNullable<AlertDisk> vlan) {
    this.vlan = vlan;
  }

  public void setVlan(AlertDisk vlan) {
    this.vlan = JsonNullable.<AlertDisk>of(vlan);
  }


  public VmNic vm(AlertRuleCluster vm) {
    this.vm = vm;
    return this;
  }

   /**
   * Get vm
   * @return vm
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AlertRuleCluster getVm() {
    return vm;
  }


  @JsonProperty(JSON_PROPERTY_VM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVm(AlertRuleCluster vm) {
    this.vm = vm;
  }


  /**
   * Return true if this VmNic object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmNic vmNic = (VmNic) o;
    return equalsNullable(this.enabled, vmNic.enabled) &&
        equalsNullable(this.gateway, vmNic.gateway) &&
        Objects.equals(this.id, vmNic.id) &&
        equalsNullable(this.interfaceId, vmNic.interfaceId) &&
        equalsNullable(this.ipAddress, vmNic.ipAddress) &&
        Objects.equals(this.localId, vmNic.localId) &&
        equalsNullable(this.macAddress, vmNic.macAddress) &&
        equalsNullable(this.mirror, vmNic.mirror) &&
        equalsNullable(this.model, vmNic.model) &&
        equalsNullable(this.nic, vmNic.nic) &&
        equalsNullable(this.order, vmNic.order) &&
        equalsNullable(this.subnetMask, vmNic.subnetMask) &&
        equalsNullable(this.vlan, vmNic.vlan) &&
        Objects.equals(this.vm, vmNic.vm);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(enabled), hashCodeNullable(gateway), id, hashCodeNullable(interfaceId), hashCodeNullable(ipAddress), localId, hashCodeNullable(macAddress), hashCodeNullable(mirror), hashCodeNullable(model), hashCodeNullable(nic), hashCodeNullable(order), hashCodeNullable(subnetMask), hashCodeNullable(vlan), vm);
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
    sb.append("class VmNic {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interfaceId: ").append(toIndentedString(interfaceId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    nic: ").append(toIndentedString(nic)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
    sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
    sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
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

