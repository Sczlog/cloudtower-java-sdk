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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * VmUpdateParamsData
 */
@JsonPropertyOrder({
  VmUpdateParamsData.JSON_PROPERTY_VCPU,
  VmUpdateParamsData.JSON_PROPERTY_HA,
  VmUpdateParamsData.JSON_PROPERTY_MEMORY,
  VmUpdateParamsData.JSON_PROPERTY_CPU_CORES,
  VmUpdateParamsData.JSON_PROPERTY_CPU_SOCKETS,
  VmUpdateParamsData.JSON_PROPERTY_DESCRIPTION,
  VmUpdateParamsData.JSON_PROPERTY_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class VmUpdateParamsData {
  public static final String JSON_PROPERTY_VCPU = "vcpu";
  private Double vcpu;

  public static final String JSON_PROPERTY_HA = "ha";
  private Boolean ha;

  public static final String JSON_PROPERTY_MEMORY = "memory";
  private Double memory;

  public static final String JSON_PROPERTY_CPU_CORES = "cpu_cores";
  private Double cpuCores;

  public static final String JSON_PROPERTY_CPU_SOCKETS = "cpu_sockets";
  private Double cpuSockets;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public VmUpdateParamsData vcpu(Double vcpu) {
    this.vcpu = vcpu;
    return this;
  }

   /**
   * Get vcpu
   * @return vcpu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VCPU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getVcpu() {
    return vcpu;
  }


  @JsonProperty(JSON_PROPERTY_VCPU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVcpu(Double vcpu) {
    this.vcpu = vcpu;
  }


  public VmUpdateParamsData ha(Boolean ha) {
    this.ha = ha;
    return this;
  }

   /**
   * Get ha
   * @return ha
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHa() {
    return ha;
  }


  @JsonProperty(JSON_PROPERTY_HA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHa(Boolean ha) {
    this.ha = ha;
  }


  public VmUpdateParamsData memory(Double memory) {
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEMORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMemory() {
    return memory;
  }


  @JsonProperty(JSON_PROPERTY_MEMORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemory(Double memory) {
    this.memory = memory;
  }


  public VmUpdateParamsData cpuCores(Double cpuCores) {
    this.cpuCores = cpuCores;
    return this;
  }

   /**
   * Get cpuCores
   * @return cpuCores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CPU_CORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCpuCores() {
    return cpuCores;
  }


  @JsonProperty(JSON_PROPERTY_CPU_CORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpuCores(Double cpuCores) {
    this.cpuCores = cpuCores;
  }


  public VmUpdateParamsData cpuSockets(Double cpuSockets) {
    this.cpuSockets = cpuSockets;
    return this;
  }

   /**
   * Get cpuSockets
   * @return cpuSockets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CPU_SOCKETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCpuSockets() {
    return cpuSockets;
  }


  @JsonProperty(JSON_PROPERTY_CPU_SOCKETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpuSockets(Double cpuSockets) {
    this.cpuSockets = cpuSockets;
  }


  public VmUpdateParamsData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public VmUpdateParamsData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Return true if this VmUpdateParams_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmUpdateParamsData vmUpdateParamsData = (VmUpdateParamsData) o;
    return Objects.equals(this.vcpu, vmUpdateParamsData.vcpu) &&
        Objects.equals(this.ha, vmUpdateParamsData.ha) &&
        Objects.equals(this.memory, vmUpdateParamsData.memory) &&
        Objects.equals(this.cpuCores, vmUpdateParamsData.cpuCores) &&
        Objects.equals(this.cpuSockets, vmUpdateParamsData.cpuSockets) &&
        Objects.equals(this.description, vmUpdateParamsData.description) &&
        Objects.equals(this.name, vmUpdateParamsData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vcpu, ha, memory, cpuCores, cpuSockets, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmUpdateParamsData {\n");
    sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
    sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
    sb.append("    cpuSockets: ").append(toIndentedString(cpuSockets)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

