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
import com.smartx.tower.model.LogCollectionStatus;
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
 * LogCollection
 */
@JsonPropertyOrder({
  LogCollection.JSON_PROPERTY_CLUSTER,
  LogCollection.JSON_PROPERTY_HOSTS,
  LogCollection.JSON_PROPERTY_ID,
  LogCollection.JSON_PROPERTY_LOCAL_ID,
  LogCollection.JSON_PROPERTY_LOG_ENDED_AT,
  LogCollection.JSON_PROPERTY_LOG_STARTED_AT,
  LogCollection.JSON_PROPERTY_OWNER,
  LogCollection.JSON_PROPERTY_PATH,
  LogCollection.JSON_PROPERTY_PROGRESS,
  LogCollection.JSON_PROPERTY_SIZE,
  LogCollection.JSON_PROPERTY_STARTED_AT,
  LogCollection.JSON_PROPERTY_STATUS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class LogCollection {
  public static final String JSON_PROPERTY_CLUSTER = "cluster";
  private AlertRuleCluster cluster;

  public static final String JSON_PROPERTY_HOSTS = "hosts";
  private JsonNullable<List<AlertRuleCluster>> hosts = JsonNullable.<List<AlertRuleCluster>>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LOCAL_ID = "local_id";
  private String localId;

  public static final String JSON_PROPERTY_LOG_ENDED_AT = "log_ended_at";
  private String logEndedAt;

  public static final String JSON_PROPERTY_LOG_STARTED_AT = "log_started_at";
  private String logStartedAt;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_PROGRESS = "progress";
  private Double progress;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Double size;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private String startedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private LogCollectionStatus status;


  public LogCollection cluster(AlertRuleCluster cluster) {
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


  public LogCollection hosts(List<AlertRuleCluster> hosts) {
    this.hosts = JsonNullable.<List<AlertRuleCluster>>of(hosts);
    return this;
  }

  public LogCollection addHostsItem(AlertRuleCluster hostsItem) {
    if (this.hosts == null || !this.hosts.isPresent()) {
      this.hosts = JsonNullable.<List<AlertRuleCluster>>of(new ArrayList<>());
    }
    try {
      this.hosts.get().add(hostsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get hosts
   * @return hosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<AlertRuleCluster> getHosts() {
        return hosts.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AlertRuleCluster>> getHosts_JsonNullable() {
    return hosts;
  }
  
  @JsonProperty(JSON_PROPERTY_HOSTS)
  public void setHosts_JsonNullable(JsonNullable<List<AlertRuleCluster>> hosts) {
    this.hosts = hosts;
  }

  public void setHosts(List<AlertRuleCluster> hosts) {
    this.hosts = JsonNullable.<List<AlertRuleCluster>>of(hosts);
  }


  public LogCollection id(String id) {
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


  public LogCollection localId(String localId) {
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


  public LogCollection logEndedAt(String logEndedAt) {
    this.logEndedAt = logEndedAt;
    return this;
  }

   /**
   * Get logEndedAt
   * @return logEndedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LOG_ENDED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLogEndedAt() {
    return logEndedAt;
  }


  @JsonProperty(JSON_PROPERTY_LOG_ENDED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLogEndedAt(String logEndedAt) {
    this.logEndedAt = logEndedAt;
  }


  public LogCollection logStartedAt(String logStartedAt) {
    this.logStartedAt = logStartedAt;
    return this;
  }

   /**
   * Get logStartedAt
   * @return logStartedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LOG_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLogStartedAt() {
    return logStartedAt;
  }


  @JsonProperty(JSON_PROPERTY_LOG_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLogStartedAt(String logStartedAt) {
    this.logStartedAt = logStartedAt;
  }


  public LogCollection owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOwner(String owner) {
    this.owner = owner;
  }


  public LogCollection path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPath(String path) {
    this.path = path;
  }


  public LogCollection progress(Double progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getProgress() {
    return progress;
  }


  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProgress(Double progress) {
    this.progress = progress;
  }


  public LogCollection size(Double size) {
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


  public LogCollection startedAt(String startedAt) {
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStartedAt() {
    return startedAt;
  }


  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }


  public LogCollection status(LogCollectionStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LogCollectionStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(LogCollectionStatus status) {
    this.status = status;
  }


  /**
   * Return true if this LogCollection object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogCollection logCollection = (LogCollection) o;
    return Objects.equals(this.cluster, logCollection.cluster) &&
        equalsNullable(this.hosts, logCollection.hosts) &&
        Objects.equals(this.id, logCollection.id) &&
        Objects.equals(this.localId, logCollection.localId) &&
        Objects.equals(this.logEndedAt, logCollection.logEndedAt) &&
        Objects.equals(this.logStartedAt, logCollection.logStartedAt) &&
        Objects.equals(this.owner, logCollection.owner) &&
        Objects.equals(this.path, logCollection.path) &&
        Objects.equals(this.progress, logCollection.progress) &&
        Objects.equals(this.size, logCollection.size) &&
        Objects.equals(this.startedAt, logCollection.startedAt) &&
        Objects.equals(this.status, logCollection.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, hashCodeNullable(hosts), id, localId, logEndedAt, logStartedAt, owner, path, progress, size, startedAt, status);
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
    sb.append("class LogCollection {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    logEndedAt: ").append(toIndentedString(logEndedAt)).append("\n");
    sb.append("    logStartedAt: ").append(toIndentedString(logStartedAt)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

