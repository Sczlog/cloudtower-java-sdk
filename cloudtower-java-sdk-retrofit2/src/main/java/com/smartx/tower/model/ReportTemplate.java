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
import com.smartx.tower.model.BrickTopoPowers;
import com.smartx.tower.model.ReportTemplateResourceMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ReportTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:23:54.291904700+08:00[Asia/Shanghai]")
public class ReportTemplate {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXECUTE_PLAN = "execute_plan";
  @SerializedName(SERIALIZED_NAME_EXECUTE_PLAN)
  private List<BrickTopoPowers> executePlan = new ArrayList<BrickTopoPowers>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRESET = "preset";
  @SerializedName(SERIALIZED_NAME_PRESET)
  private String preset;

  public static final String SERIALIZED_NAME_RESOURCE_META = "resource_meta";
  @SerializedName(SERIALIZED_NAME_RESOURCE_META)
  private List<ReportTemplateResourceMeta> resourceMeta = new ArrayList<ReportTemplateResourceMeta>();

  public static final String SERIALIZED_NAME_TASK_NUM = "task_num";
  @SerializedName(SERIALIZED_NAME_TASK_NUM)
  private Double taskNum;

  public static final String SERIALIZED_NAME_TASKS = "tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private List<AlertRuleCluster> tasks = null;


  public ReportTemplate createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public ReportTemplate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ReportTemplate executePlan(List<BrickTopoPowers> executePlan) {
    
    this.executePlan = executePlan;
    return this;
  }

  public ReportTemplate addExecutePlanItem(BrickTopoPowers executePlanItem) {
    this.executePlan.add(executePlanItem);
    return this;
  }

   /**
   * Get executePlan
   * @return executePlan
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<BrickTopoPowers> getExecutePlan() {
    return executePlan;
  }


  public void setExecutePlan(List<BrickTopoPowers> executePlan) {
    this.executePlan = executePlan;
  }


  public ReportTemplate id(String id) {
    
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


  public ReportTemplate name(String name) {
    
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


  public ReportTemplate preset(String preset) {
    
    this.preset = preset;
    return this;
  }

   /**
   * Get preset
   * @return preset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPreset() {
    return preset;
  }


  public void setPreset(String preset) {
    this.preset = preset;
  }


  public ReportTemplate resourceMeta(List<ReportTemplateResourceMeta> resourceMeta) {
    
    this.resourceMeta = resourceMeta;
    return this;
  }

  public ReportTemplate addResourceMetaItem(ReportTemplateResourceMeta resourceMetaItem) {
    this.resourceMeta.add(resourceMetaItem);
    return this;
  }

   /**
   * Get resourceMeta
   * @return resourceMeta
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ReportTemplateResourceMeta> getResourceMeta() {
    return resourceMeta;
  }


  public void setResourceMeta(List<ReportTemplateResourceMeta> resourceMeta) {
    this.resourceMeta = resourceMeta;
  }


  public ReportTemplate taskNum(Double taskNum) {
    
    this.taskNum = taskNum;
    return this;
  }

   /**
   * Get taskNum
   * @return taskNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getTaskNum() {
    return taskNum;
  }


  public void setTaskNum(Double taskNum) {
    this.taskNum = taskNum;
  }


  public ReportTemplate tasks(List<AlertRuleCluster> tasks) {
    
    this.tasks = tasks;
    return this;
  }

  public ReportTemplate addTasksItem(AlertRuleCluster tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<AlertRuleCluster>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AlertRuleCluster> getTasks() {
    return tasks;
  }


  public void setTasks(List<AlertRuleCluster> tasks) {
    this.tasks = tasks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportTemplate reportTemplate = (ReportTemplate) o;
    return Objects.equals(this.createdAt, reportTemplate.createdAt) &&
        Objects.equals(this.description, reportTemplate.description) &&
        Objects.equals(this.executePlan, reportTemplate.executePlan) &&
        Objects.equals(this.id, reportTemplate.id) &&
        Objects.equals(this.name, reportTemplate.name) &&
        Objects.equals(this.preset, reportTemplate.preset) &&
        Objects.equals(this.resourceMeta, reportTemplate.resourceMeta) &&
        Objects.equals(this.taskNum, reportTemplate.taskNum) &&
        Objects.equals(this.tasks, reportTemplate.tasks);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, executePlan, id, name, preset, resourceMeta, taskNum, tasks);
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
    sb.append("class ReportTemplate {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    executePlan: ").append(toIndentedString(executePlan)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
    sb.append("    resourceMeta: ").append(toIndentedString(resourceMeta)).append("\n");
    sb.append("    taskNum: ").append(toIndentedString(taskNum)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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

