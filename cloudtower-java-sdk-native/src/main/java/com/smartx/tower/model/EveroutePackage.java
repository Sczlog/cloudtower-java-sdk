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
import com.smartx.tower.model.AlertAlertRule;
import com.smartx.tower.model.Architecture;
import com.smartx.tower.model.EntityAsyncStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EveroutePackage
 */
@JsonPropertyOrder({
  EveroutePackage.JSON_PROPERTY_ARCH,
  EveroutePackage.JSON_PROPERTY_DESCRIPTION,
  EveroutePackage.JSON_PROPERTY_ENTITY_ASYNC_STATUS,
  EveroutePackage.JSON_PROPERTY_ID,
  EveroutePackage.JSON_PROPERTY_LOCAL_CREATED_AT,
  EveroutePackage.JSON_PROPERTY_NAME,
  EveroutePackage.JSON_PROPERTY_PVC_NAME,
  EveroutePackage.JSON_PROPERTY_SIZE,
  EveroutePackage.JSON_PROPERTY_UPLOAD_TASK,
  EveroutePackage.JSON_PROPERTY_VERSION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class EveroutePackage {
  public static final String JSON_PROPERTY_ARCH = "arch";
  private Architecture arch;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  private JsonNullable<EntityAsyncStatus> entityAsyncStatus = JsonNullable.<EntityAsyncStatus>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LOCAL_CREATED_AT = "local_created_at";
  private String localCreatedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PVC_NAME = "pvc_name";
  private String pvcName;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Double size;

  public static final String JSON_PROPERTY_UPLOAD_TASK = "upload_task";
  private JsonNullable<AlertAlertRule> uploadTask = JsonNullable.<AlertAlertRule>undefined();

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;


  public EveroutePackage arch(Architecture arch) {
    this.arch = arch;
    return this;
  }

   /**
   * Get arch
   * @return arch
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Architecture getArch() {
    return arch;
  }


  @JsonProperty(JSON_PROPERTY_ARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setArch(Architecture arch) {
    this.arch = arch;
  }


  public EveroutePackage description(String description) {
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


  public EveroutePackage entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
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


  public EveroutePackage id(String id) {
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


  public EveroutePackage localCreatedAt(String localCreatedAt) {
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


  public EveroutePackage name(String name) {
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


  public EveroutePackage pvcName(String pvcName) {
    this.pvcName = pvcName;
    return this;
  }

   /**
   * Get pvcName
   * @return pvcName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PVC_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPvcName() {
    return pvcName;
  }


  @JsonProperty(JSON_PROPERTY_PVC_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPvcName(String pvcName) {
    this.pvcName = pvcName;
  }


  public EveroutePackage size(Double size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSize(Double size) {
    this.size = size;
  }


  public EveroutePackage uploadTask(AlertAlertRule uploadTask) {
    this.uploadTask = JsonNullable.<AlertAlertRule>of(uploadTask);
    return this;
  }

   /**
   * Get uploadTask
   * @return uploadTask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public AlertAlertRule getUploadTask() {
        return uploadTask.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UPLOAD_TASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<AlertAlertRule> getUploadTask_JsonNullable() {
    return uploadTask;
  }
  
  @JsonProperty(JSON_PROPERTY_UPLOAD_TASK)
  public void setUploadTask_JsonNullable(JsonNullable<AlertAlertRule> uploadTask) {
    this.uploadTask = uploadTask;
  }

  public void setUploadTask(AlertAlertRule uploadTask) {
    this.uploadTask = JsonNullable.<AlertAlertRule>of(uploadTask);
  }


  public EveroutePackage version(String version) {
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
   * Return true if this EveroutePackage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EveroutePackage everoutePackage = (EveroutePackage) o;
    return Objects.equals(this.arch, everoutePackage.arch) &&
        Objects.equals(this.description, everoutePackage.description) &&
        equalsNullable(this.entityAsyncStatus, everoutePackage.entityAsyncStatus) &&
        Objects.equals(this.id, everoutePackage.id) &&
        Objects.equals(this.localCreatedAt, everoutePackage.localCreatedAt) &&
        Objects.equals(this.name, everoutePackage.name) &&
        Objects.equals(this.pvcName, everoutePackage.pvcName) &&
        Objects.equals(this.size, everoutePackage.size) &&
        equalsNullable(this.uploadTask, everoutePackage.uploadTask) &&
        Objects.equals(this.version, everoutePackage.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(arch, description, hashCodeNullable(entityAsyncStatus), id, localCreatedAt, name, pvcName, size, hashCodeNullable(uploadTask), version);
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
    sb.append("class EveroutePackage {\n");
    sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pvcName: ").append(toIndentedString(pvcName)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    uploadTask: ").append(toIndentedString(uploadTask)).append("\n");
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

