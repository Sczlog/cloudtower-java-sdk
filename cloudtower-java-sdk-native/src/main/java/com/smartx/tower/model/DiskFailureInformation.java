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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DiskFailureInformation
 */
@JsonPropertyOrder({
  DiskFailureInformation.JSON_PROPERTY_SMART_CHECK,
  DiskFailureInformation.JSON_PROPERTY_IOSTAT_LATENCY_MS,
  DiskFailureInformation.JSON_PROPERTY_IOSTAT_LATENCY,
  DiskFailureInformation.JSON_PROPERTY_CHUNK_WARNFLAG,
  DiskFailureInformation.JSON_PROPERTY_CHUNK_IO_ERROR,
  DiskFailureInformation.JSON_PROPERTY_CHUNK_ERRFLAG,
  DiskFailureInformation.JSON_PROPERTY_CHUNK_CHECKSUM_ERROR
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class DiskFailureInformation {
  public static final String JSON_PROPERTY_SMART_CHECK = "smart_check";
  private JsonNullable<Boolean> smartCheck = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IOSTAT_LATENCY_MS = "iostat_latency_ms";
  private JsonNullable<Double> iostatLatencyMs = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_IOSTAT_LATENCY = "iostat_latency";
  private JsonNullable<Boolean> iostatLatency = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_CHUNK_WARNFLAG = "chunk_warnflag";
  private JsonNullable<Boolean> chunkWarnflag = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_CHUNK_IO_ERROR = "chunk_io_error";
  private JsonNullable<Boolean> chunkIoError = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_CHUNK_ERRFLAG = "chunk_errflag";
  private JsonNullable<Boolean> chunkErrflag = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_CHUNK_CHECKSUM_ERROR = "chunk_checksum_error";
  private JsonNullable<Boolean> chunkChecksumError = JsonNullable.<Boolean>undefined();


  public DiskFailureInformation smartCheck(Boolean smartCheck) {
    this.smartCheck = JsonNullable.<Boolean>of(smartCheck);
    return this;
  }

   /**
   * Get smartCheck
   * @return smartCheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Boolean getSmartCheck() {
        return smartCheck.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SMART_CHECK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getSmartCheck_JsonNullable() {
    return smartCheck;
  }
  
  @JsonProperty(JSON_PROPERTY_SMART_CHECK)
  public void setSmartCheck_JsonNullable(JsonNullable<Boolean> smartCheck) {
    this.smartCheck = smartCheck;
  }

  public void setSmartCheck(Boolean smartCheck) {
    this.smartCheck = JsonNullable.<Boolean>of(smartCheck);
  }


  public DiskFailureInformation iostatLatencyMs(Double iostatLatencyMs) {
    this.iostatLatencyMs = JsonNullable.<Double>of(iostatLatencyMs);
    return this;
  }

   /**
   * Get iostatLatencyMs
   * @return iostatLatencyMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Double getIostatLatencyMs() {
        return iostatLatencyMs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IOSTAT_LATENCY_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getIostatLatencyMs_JsonNullable() {
    return iostatLatencyMs;
  }
  
  @JsonProperty(JSON_PROPERTY_IOSTAT_LATENCY_MS)
  public void setIostatLatencyMs_JsonNullable(JsonNullable<Double> iostatLatencyMs) {
    this.iostatLatencyMs = iostatLatencyMs;
  }

  public void setIostatLatencyMs(Double iostatLatencyMs) {
    this.iostatLatencyMs = JsonNullable.<Double>of(iostatLatencyMs);
  }


  public DiskFailureInformation iostatLatency(Boolean iostatLatency) {
    this.iostatLatency = JsonNullable.<Boolean>of(iostatLatency);
    return this;
  }

   /**
   * Get iostatLatency
   * @return iostatLatency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Boolean getIostatLatency() {
        return iostatLatency.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IOSTAT_LATENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIostatLatency_JsonNullable() {
    return iostatLatency;
  }
  
  @JsonProperty(JSON_PROPERTY_IOSTAT_LATENCY)
  public void setIostatLatency_JsonNullable(JsonNullable<Boolean> iostatLatency) {
    this.iostatLatency = iostatLatency;
  }

  public void setIostatLatency(Boolean iostatLatency) {
    this.iostatLatency = JsonNullable.<Boolean>of(iostatLatency);
  }


  public DiskFailureInformation chunkWarnflag(Boolean chunkWarnflag) {
    this.chunkWarnflag = JsonNullable.<Boolean>of(chunkWarnflag);
    return this;
  }

   /**
   * Get chunkWarnflag
   * @return chunkWarnflag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Boolean getChunkWarnflag() {
        return chunkWarnflag.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHUNK_WARNFLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getChunkWarnflag_JsonNullable() {
    return chunkWarnflag;
  }
  
  @JsonProperty(JSON_PROPERTY_CHUNK_WARNFLAG)
  public void setChunkWarnflag_JsonNullable(JsonNullable<Boolean> chunkWarnflag) {
    this.chunkWarnflag = chunkWarnflag;
  }

  public void setChunkWarnflag(Boolean chunkWarnflag) {
    this.chunkWarnflag = JsonNullable.<Boolean>of(chunkWarnflag);
  }


  public DiskFailureInformation chunkIoError(Boolean chunkIoError) {
    this.chunkIoError = JsonNullable.<Boolean>of(chunkIoError);
    return this;
  }

   /**
   * Get chunkIoError
   * @return chunkIoError
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Boolean getChunkIoError() {
        return chunkIoError.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHUNK_IO_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getChunkIoError_JsonNullable() {
    return chunkIoError;
  }
  
  @JsonProperty(JSON_PROPERTY_CHUNK_IO_ERROR)
  public void setChunkIoError_JsonNullable(JsonNullable<Boolean> chunkIoError) {
    this.chunkIoError = chunkIoError;
  }

  public void setChunkIoError(Boolean chunkIoError) {
    this.chunkIoError = JsonNullable.<Boolean>of(chunkIoError);
  }


  public DiskFailureInformation chunkErrflag(Boolean chunkErrflag) {
    this.chunkErrflag = JsonNullable.<Boolean>of(chunkErrflag);
    return this;
  }

   /**
   * Get chunkErrflag
   * @return chunkErrflag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Boolean getChunkErrflag() {
        return chunkErrflag.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHUNK_ERRFLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getChunkErrflag_JsonNullable() {
    return chunkErrflag;
  }
  
  @JsonProperty(JSON_PROPERTY_CHUNK_ERRFLAG)
  public void setChunkErrflag_JsonNullable(JsonNullable<Boolean> chunkErrflag) {
    this.chunkErrflag = chunkErrflag;
  }

  public void setChunkErrflag(Boolean chunkErrflag) {
    this.chunkErrflag = JsonNullable.<Boolean>of(chunkErrflag);
  }


  public DiskFailureInformation chunkChecksumError(Boolean chunkChecksumError) {
    this.chunkChecksumError = JsonNullable.<Boolean>of(chunkChecksumError);
    return this;
  }

   /**
   * Get chunkChecksumError
   * @return chunkChecksumError
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Boolean getChunkChecksumError() {
        return chunkChecksumError.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHUNK_CHECKSUM_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getChunkChecksumError_JsonNullable() {
    return chunkChecksumError;
  }
  
  @JsonProperty(JSON_PROPERTY_CHUNK_CHECKSUM_ERROR)
  public void setChunkChecksumError_JsonNullable(JsonNullable<Boolean> chunkChecksumError) {
    this.chunkChecksumError = chunkChecksumError;
  }

  public void setChunkChecksumError(Boolean chunkChecksumError) {
    this.chunkChecksumError = JsonNullable.<Boolean>of(chunkChecksumError);
  }


  /**
   * Return true if this Disk_failure_information object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiskFailureInformation diskFailureInformation = (DiskFailureInformation) o;
    return equalsNullable(this.smartCheck, diskFailureInformation.smartCheck) &&
        equalsNullable(this.iostatLatencyMs, diskFailureInformation.iostatLatencyMs) &&
        equalsNullable(this.iostatLatency, diskFailureInformation.iostatLatency) &&
        equalsNullable(this.chunkWarnflag, diskFailureInformation.chunkWarnflag) &&
        equalsNullable(this.chunkIoError, diskFailureInformation.chunkIoError) &&
        equalsNullable(this.chunkErrflag, diskFailureInformation.chunkErrflag) &&
        equalsNullable(this.chunkChecksumError, diskFailureInformation.chunkChecksumError);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(smartCheck), hashCodeNullable(iostatLatencyMs), hashCodeNullable(iostatLatency), hashCodeNullable(chunkWarnflag), hashCodeNullable(chunkIoError), hashCodeNullable(chunkErrflag), hashCodeNullable(chunkChecksumError));
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
    sb.append("class DiskFailureInformation {\n");
    sb.append("    smartCheck: ").append(toIndentedString(smartCheck)).append("\n");
    sb.append("    iostatLatencyMs: ").append(toIndentedString(iostatLatencyMs)).append("\n");
    sb.append("    iostatLatency: ").append(toIndentedString(iostatLatency)).append("\n");
    sb.append("    chunkWarnflag: ").append(toIndentedString(chunkWarnflag)).append("\n");
    sb.append("    chunkIoError: ").append(toIndentedString(chunkIoError)).append("\n");
    sb.append("    chunkErrflag: ").append(toIndentedString(chunkErrflag)).append("\n");
    sb.append("    chunkChecksumError: ").append(toIndentedString(chunkChecksumError)).append("\n");
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

