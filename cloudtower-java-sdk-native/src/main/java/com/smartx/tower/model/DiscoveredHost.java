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
import com.smartx.tower.model.DiscoveredHostDimms;
import com.smartx.tower.model.DiscoveredHostDisks;
import com.smartx.tower.model.DiscoveredHostIfaces;
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
 * DiscoveredHost
 */
@JsonPropertyOrder({
  DiscoveredHost.JSON_PROPERTY_ALL_FLASH,
  DiscoveredHost.JSON_PROPERTY_DEPLOYED,
  DiscoveredHost.JSON_PROPERTY_DIMMS,
  DiscoveredHost.JSON_PROPERTY_DISKS,
  DiscoveredHost.JSON_PROPERTY_HOST_IP,
  DiscoveredHost.JSON_PROPERTY_HOST_UUID,
  DiscoveredHost.JSON_PROPERTY_HOSTNAME,
  DiscoveredHost.JSON_PROPERTY_IFACES,
  DiscoveredHost.JSON_PROPERTY_IPMI_IP,
  DiscoveredHost.JSON_PROPERTY_IS_OS_IN_RAID1,
  DiscoveredHost.JSON_PROPERTY_PRODUCT,
  DiscoveredHost.JSON_PROPERTY_SERIAL,
  DiscoveredHost.JSON_PROPERTY_VERSION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class DiscoveredHost {
  public static final String JSON_PROPERTY_ALL_FLASH = "all_flash";
  private Boolean allFlash;

  public static final String JSON_PROPERTY_DEPLOYED = "deployed";
  private JsonNullable<Boolean> deployed = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_DIMMS = "dimms";
  private JsonNullable<List<DiscoveredHostDimms>> dimms = JsonNullable.<List<DiscoveredHostDimms>>undefined();

  public static final String JSON_PROPERTY_DISKS = "disks";
  private List<DiscoveredHostDisks> disks = new ArrayList<>();

  public static final String JSON_PROPERTY_HOST_IP = "host_ip";
  private String hostIp;

  public static final String JSON_PROPERTY_HOST_UUID = "host_uuid";
  private String hostUuid;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_IFACES = "ifaces";
  private List<DiscoveredHostIfaces> ifaces = new ArrayList<>();

  public static final String JSON_PROPERTY_IPMI_IP = "ipmi_ip";
  private JsonNullable<String> ipmiIp = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_OS_IN_RAID1 = "is_os_in_raid1";
  private JsonNullable<Boolean> isOsInRaid1 = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_PRODUCT = "product";
  private JsonNullable<String> product = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SERIAL = "serial";
  private String serial;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;


  public DiscoveredHost allFlash(Boolean allFlash) {
    this.allFlash = allFlash;
    return this;
  }

   /**
   * Get allFlash
   * @return allFlash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ALL_FLASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAllFlash() {
    return allFlash;
  }


  @JsonProperty(JSON_PROPERTY_ALL_FLASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllFlash(Boolean allFlash) {
    this.allFlash = allFlash;
  }


  public DiscoveredHost deployed(Boolean deployed) {
    this.deployed = JsonNullable.<Boolean>of(deployed);
    return this;
  }

   /**
   * Get deployed
   * @return deployed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Boolean getDeployed() {
        return deployed.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEPLOYED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getDeployed_JsonNullable() {
    return deployed;
  }
  
  @JsonProperty(JSON_PROPERTY_DEPLOYED)
  public void setDeployed_JsonNullable(JsonNullable<Boolean> deployed) {
    this.deployed = deployed;
  }

  public void setDeployed(Boolean deployed) {
    this.deployed = JsonNullable.<Boolean>of(deployed);
  }


  public DiscoveredHost dimms(List<DiscoveredHostDimms> dimms) {
    this.dimms = JsonNullable.<List<DiscoveredHostDimms>>of(dimms);
    return this;
  }

  public DiscoveredHost addDimmsItem(DiscoveredHostDimms dimmsItem) {
    if (this.dimms == null || !this.dimms.isPresent()) {
      this.dimms = JsonNullable.<List<DiscoveredHostDimms>>of(new ArrayList<>());
    }
    try {
      this.dimms.get().add(dimmsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get dimms
   * @return dimms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<DiscoveredHostDimms> getDimms() {
        return dimms.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DIMMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<DiscoveredHostDimms>> getDimms_JsonNullable() {
    return dimms;
  }
  
  @JsonProperty(JSON_PROPERTY_DIMMS)
  public void setDimms_JsonNullable(JsonNullable<List<DiscoveredHostDimms>> dimms) {
    this.dimms = dimms;
  }

  public void setDimms(List<DiscoveredHostDimms> dimms) {
    this.dimms = JsonNullable.<List<DiscoveredHostDimms>>of(dimms);
  }


  public DiscoveredHost disks(List<DiscoveredHostDisks> disks) {
    this.disks = disks;
    return this;
  }

  public DiscoveredHost addDisksItem(DiscoveredHostDisks disksItem) {
    this.disks.add(disksItem);
    return this;
  }

   /**
   * Get disks
   * @return disks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DISKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<DiscoveredHostDisks> getDisks() {
    return disks;
  }


  @JsonProperty(JSON_PROPERTY_DISKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisks(List<DiscoveredHostDisks> disks) {
    this.disks = disks;
  }


  public DiscoveredHost hostIp(String hostIp) {
    this.hostIp = hostIp;
    return this;
  }

   /**
   * Get hostIp
   * @return hostIp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HOST_IP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHostIp() {
    return hostIp;
  }


  @JsonProperty(JSON_PROPERTY_HOST_IP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHostIp(String hostIp) {
    this.hostIp = hostIp;
  }


  public DiscoveredHost hostUuid(String hostUuid) {
    this.hostUuid = hostUuid;
    return this;
  }

   /**
   * Get hostUuid
   * @return hostUuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HOST_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHostUuid() {
    return hostUuid;
  }


  @JsonProperty(JSON_PROPERTY_HOST_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHostUuid(String hostUuid) {
    this.hostUuid = hostUuid;
  }


  public DiscoveredHost hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHostname() {
    return hostname;
  }


  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public DiscoveredHost ifaces(List<DiscoveredHostIfaces> ifaces) {
    this.ifaces = ifaces;
    return this;
  }

  public DiscoveredHost addIfacesItem(DiscoveredHostIfaces ifacesItem) {
    this.ifaces.add(ifacesItem);
    return this;
  }

   /**
   * Get ifaces
   * @return ifaces
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IFACES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<DiscoveredHostIfaces> getIfaces() {
    return ifaces;
  }


  @JsonProperty(JSON_PROPERTY_IFACES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIfaces(List<DiscoveredHostIfaces> ifaces) {
    this.ifaces = ifaces;
  }


  public DiscoveredHost ipmiIp(String ipmiIp) {
    this.ipmiIp = JsonNullable.<String>of(ipmiIp);
    return this;
  }

   /**
   * Get ipmiIp
   * @return ipmiIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getIpmiIp() {
        return ipmiIp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IPMI_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIpmiIp_JsonNullable() {
    return ipmiIp;
  }
  
  @JsonProperty(JSON_PROPERTY_IPMI_IP)
  public void setIpmiIp_JsonNullable(JsonNullable<String> ipmiIp) {
    this.ipmiIp = ipmiIp;
  }

  public void setIpmiIp(String ipmiIp) {
    this.ipmiIp = JsonNullable.<String>of(ipmiIp);
  }


  public DiscoveredHost isOsInRaid1(Boolean isOsInRaid1) {
    this.isOsInRaid1 = JsonNullable.<Boolean>of(isOsInRaid1);
    return this;
  }

   /**
   * Get isOsInRaid1
   * @return isOsInRaid1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Boolean getIsOsInRaid1() {
        return isOsInRaid1.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_OS_IN_RAID1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsOsInRaid1_JsonNullable() {
    return isOsInRaid1;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_OS_IN_RAID1)
  public void setIsOsInRaid1_JsonNullable(JsonNullable<Boolean> isOsInRaid1) {
    this.isOsInRaid1 = isOsInRaid1;
  }

  public void setIsOsInRaid1(Boolean isOsInRaid1) {
    this.isOsInRaid1 = JsonNullable.<Boolean>of(isOsInRaid1);
  }


  public DiscoveredHost product(String product) {
    this.product = JsonNullable.<String>of(product);
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getProduct() {
        return product.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProduct_JsonNullable() {
    return product;
  }
  
  @JsonProperty(JSON_PROPERTY_PRODUCT)
  public void setProduct_JsonNullable(JsonNullable<String> product) {
    this.product = product;
  }

  public void setProduct(String product) {
    this.product = JsonNullable.<String>of(product);
  }


  public DiscoveredHost serial(String serial) {
    this.serial = serial;
    return this;
  }

   /**
   * Get serial
   * @return serial
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SERIAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSerial() {
    return serial;
  }


  @JsonProperty(JSON_PROPERTY_SERIAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSerial(String serial) {
    this.serial = serial;
  }


  public DiscoveredHost version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * Return true if this DiscoveredHost object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscoveredHost discoveredHost = (DiscoveredHost) o;
    return Objects.equals(this.allFlash, discoveredHost.allFlash) &&
        equalsNullable(this.deployed, discoveredHost.deployed) &&
        equalsNullable(this.dimms, discoveredHost.dimms) &&
        Objects.equals(this.disks, discoveredHost.disks) &&
        Objects.equals(this.hostIp, discoveredHost.hostIp) &&
        Objects.equals(this.hostUuid, discoveredHost.hostUuid) &&
        Objects.equals(this.hostname, discoveredHost.hostname) &&
        Objects.equals(this.ifaces, discoveredHost.ifaces) &&
        equalsNullable(this.ipmiIp, discoveredHost.ipmiIp) &&
        equalsNullable(this.isOsInRaid1, discoveredHost.isOsInRaid1) &&
        equalsNullable(this.product, discoveredHost.product) &&
        Objects.equals(this.serial, discoveredHost.serial) &&
        Objects.equals(this.version, discoveredHost.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allFlash, hashCodeNullable(deployed), hashCodeNullable(dimms), disks, hostIp, hostUuid, hostname, ifaces, hashCodeNullable(ipmiIp), hashCodeNullable(isOsInRaid1), hashCodeNullable(product), serial, version);
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
    sb.append("class DiscoveredHost {\n");
    sb.append("    allFlash: ").append(toIndentedString(allFlash)).append("\n");
    sb.append("    deployed: ").append(toIndentedString(deployed)).append("\n");
    sb.append("    dimms: ").append(toIndentedString(dimms)).append("\n");
    sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
    sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
    sb.append("    hostUuid: ").append(toIndentedString(hostUuid)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ifaces: ").append(toIndentedString(ifaces)).append("\n");
    sb.append("    ipmiIp: ").append(toIndentedString(ipmiIp)).append("\n");
    sb.append("    isOsInRaid1: ").append(toIndentedString(isOsInRaid1)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

