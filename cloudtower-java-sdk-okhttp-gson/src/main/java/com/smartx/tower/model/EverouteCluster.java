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
import com.smartx.tower.model.AlertRuleCluster;
import com.smartx.tower.model.EverouteClusterControllerInstances;
import com.smartx.tower.model.EverouteClusterControllerTemplate;
import com.smartx.tower.model.EverouteClusterPhase;
import com.smartx.tower.model.EverouteClusterStatus;
import com.smartx.tower.model.GlobalPolicyAction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * EverouteCluster
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:23:12.632307300+08:00[Asia/Shanghai]")
public class EverouteCluster {
  public static final String SERIALIZED_NAME_AGENT_ELF_CLUSTERS = "agent_elf_clusters";
  @SerializedName(SERIALIZED_NAME_AGENT_ELF_CLUSTERS)
  private List<AlertRuleCluster> agentElfClusters = null;

  public static final String SERIALIZED_NAME_AGENT_ELF_VDSES = "agent_elf_vdses";
  @SerializedName(SERIALIZED_NAME_AGENT_ELF_VDSES)
  private List<AlertRuleCluster> agentElfVdses = null;

  public static final String SERIALIZED_NAME_CONTROLLER_INSTANCES = "controller_instances";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_INSTANCES)
  private List<EverouteClusterControllerInstances> controllerInstances = new ArrayList<EverouteClusterControllerInstances>();

  public static final String SERIALIZED_NAME_CONTROLLER_TEMPLATE = "controller_template";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_TEMPLATE)
  private EverouteClusterControllerTemplate controllerTemplate;

  public static final String SERIALIZED_NAME_GLOBAL_DEFAULT_ACTION = "global_default_action";
  @SerializedName(SERIALIZED_NAME_GLOBAL_DEFAULT_ACTION)
  private GlobalPolicyAction globalDefaultAction;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private EverouteClusterPhase phase;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private EverouteClusterStatus status;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public EverouteCluster agentElfClusters(List<AlertRuleCluster> agentElfClusters) {
    
    this.agentElfClusters = agentElfClusters;
    return this;
  }

  public EverouteCluster addAgentElfClustersItem(AlertRuleCluster agentElfClustersItem) {
    if (this.agentElfClusters == null) {
      this.agentElfClusters = new ArrayList<AlertRuleCluster>();
    }
    this.agentElfClusters.add(agentElfClustersItem);
    return this;
  }

   /**
   * Get agentElfClusters
   * @return agentElfClusters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AlertRuleCluster> getAgentElfClusters() {
    return agentElfClusters;
  }


  public void setAgentElfClusters(List<AlertRuleCluster> agentElfClusters) {
    this.agentElfClusters = agentElfClusters;
  }


  public EverouteCluster agentElfVdses(List<AlertRuleCluster> agentElfVdses) {
    
    this.agentElfVdses = agentElfVdses;
    return this;
  }

  public EverouteCluster addAgentElfVdsesItem(AlertRuleCluster agentElfVdsesItem) {
    if (this.agentElfVdses == null) {
      this.agentElfVdses = new ArrayList<AlertRuleCluster>();
    }
    this.agentElfVdses.add(agentElfVdsesItem);
    return this;
  }

   /**
   * Get agentElfVdses
   * @return agentElfVdses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AlertRuleCluster> getAgentElfVdses() {
    return agentElfVdses;
  }


  public void setAgentElfVdses(List<AlertRuleCluster> agentElfVdses) {
    this.agentElfVdses = agentElfVdses;
  }


  public EverouteCluster controllerInstances(List<EverouteClusterControllerInstances> controllerInstances) {
    
    this.controllerInstances = controllerInstances;
    return this;
  }

  public EverouteCluster addControllerInstancesItem(EverouteClusterControllerInstances controllerInstancesItem) {
    this.controllerInstances.add(controllerInstancesItem);
    return this;
  }

   /**
   * Get controllerInstances
   * @return controllerInstances
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EverouteClusterControllerInstances> getControllerInstances() {
    return controllerInstances;
  }


  public void setControllerInstances(List<EverouteClusterControllerInstances> controllerInstances) {
    this.controllerInstances = controllerInstances;
  }


  public EverouteCluster controllerTemplate(EverouteClusterControllerTemplate controllerTemplate) {
    
    this.controllerTemplate = controllerTemplate;
    return this;
  }

   /**
   * Get controllerTemplate
   * @return controllerTemplate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EverouteClusterControllerTemplate getControllerTemplate() {
    return controllerTemplate;
  }


  public void setControllerTemplate(EverouteClusterControllerTemplate controllerTemplate) {
    this.controllerTemplate = controllerTemplate;
  }


  public EverouteCluster globalDefaultAction(GlobalPolicyAction globalDefaultAction) {
    
    this.globalDefaultAction = globalDefaultAction;
    return this;
  }

   /**
   * Get globalDefaultAction
   * @return globalDefaultAction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GlobalPolicyAction getGlobalDefaultAction() {
    return globalDefaultAction;
  }


  public void setGlobalDefaultAction(GlobalPolicyAction globalDefaultAction) {
    this.globalDefaultAction = globalDefaultAction;
  }


  public EverouteCluster id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public EverouteCluster name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public EverouteCluster phase(EverouteClusterPhase phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EverouteClusterPhase getPhase() {
    return phase;
  }


  public void setPhase(EverouteClusterPhase phase) {
    this.phase = phase;
  }


  public EverouteCluster status(EverouteClusterStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EverouteClusterStatus getStatus() {
    return status;
  }


  public void setStatus(EverouteClusterStatus status) {
    this.status = status;
  }


  public EverouteCluster version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EverouteCluster everouteCluster = (EverouteCluster) o;
    return Objects.equals(this.agentElfClusters, everouteCluster.agentElfClusters) &&
        Objects.equals(this.agentElfVdses, everouteCluster.agentElfVdses) &&
        Objects.equals(this.controllerInstances, everouteCluster.controllerInstances) &&
        Objects.equals(this.controllerTemplate, everouteCluster.controllerTemplate) &&
        Objects.equals(this.globalDefaultAction, everouteCluster.globalDefaultAction) &&
        Objects.equals(this.id, everouteCluster.id) &&
        Objects.equals(this.name, everouteCluster.name) &&
        Objects.equals(this.phase, everouteCluster.phase) &&
        Objects.equals(this.status, everouteCluster.status) &&
        Objects.equals(this.version, everouteCluster.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentElfClusters, agentElfVdses, controllerInstances, controllerTemplate, globalDefaultAction, id, name, phase, status, version);
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
    sb.append("class EverouteCluster {\n");
    sb.append("    agentElfClusters: ").append(toIndentedString(agentElfClusters)).append("\n");
    sb.append("    agentElfVdses: ").append(toIndentedString(agentElfVdses)).append("\n");
    sb.append("    controllerInstances: ").append(toIndentedString(controllerInstances)).append("\n");
    sb.append("    controllerTemplate: ").append(toIndentedString(controllerTemplate)).append("\n");
    sb.append("    globalDefaultAction: ").append(toIndentedString(globalDefaultAction)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

