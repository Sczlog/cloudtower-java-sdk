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
import com.smartx.tower.model.NameIdPair;
import com.smartx.tower.model.BrickTopoPowers;
import com.smartx.tower.model.DiskFailureInformation;
import com.smartx.tower.model.DiskFunction;
import com.smartx.tower.model.DiskHealthStatus;
import com.smartx.tower.model.DiskPartitions;
import com.smartx.tower.model.DiskType;
import com.smartx.tower.model.DiskUsage;
import com.smartx.tower.model.DiskUsageStatus;
import com.smartx.tower.model.EntityAsyncStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Disk
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Disk {
  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_FAILURE_INFORMATION = "failure_information";
  @SerializedName(SERIALIZED_NAME_FAILURE_INFORMATION)
  private DiskFailureInformation failureInformation;

  public static final String SERIALIZED_NAME_FIRMWARE = "firmware";
  @SerializedName(SERIALIZED_NAME_FIRMWARE)
  private String firmware;

  public static final String SERIALIZED_NAME_FUNCTION = "function";
  @SerializedName(SERIALIZED_NAME_FUNCTION)
  private DiskFunction function;

  public static final String SERIALIZED_NAME_HEALTH_STATUS = "health_status";
  @SerializedName(SERIALIZED_NAME_HEALTH_STATUS)
  private DiskHealthStatus healthStatus;

  public static final String SERIALIZED_NAME_HEALTHY = "healthy";
  @SerializedName(SERIALIZED_NAME_HEALTHY)
  private Boolean healthy;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private NameIdPair host;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<BrickTopoPowers> labels = null;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_MOUNTED = "mounted";
  @SerializedName(SERIALIZED_NAME_MOUNTED)
  private Boolean mounted;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NUMA_NODE = "numa_node";
  @SerializedName(SERIALIZED_NAME_NUMA_NODE)
  private Double numaNode;

  public static final String SERIALIZED_NAME_OFFLINE = "offline";
  @SerializedName(SERIALIZED_NAME_OFFLINE)
  private Boolean offline;

  public static final String SERIALIZED_NAME_PARTITIONS = "partitions";
  @SerializedName(SERIALIZED_NAME_PARTITIONS)
  private List<DiskPartitions> partitions = new ArrayList<DiskPartitions>();

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE = "persistent_memory_type";
  @SerializedName(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE)
  private String persistentMemoryType;

  public static final String SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK = "physical_slot_on_brick";
  @SerializedName(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK)
  private Double physicalSlotOnBrick;

  public static final String SERIALIZED_NAME_PMEM_DIMMS = "pmem_dimms";
  @SerializedName(SERIALIZED_NAME_PMEM_DIMMS)
  private List<NameIdPair> pmemDimms = null;

  public static final String SERIALIZED_NAME_RECOMMENDED_USAGE = "recommended_usage";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED_USAGE)
  private DiskUsage recommendedUsage;

  public static final String SERIALIZED_NAME_REMAINING_LIFE_PERCENT = "remaining_life_percent";
  @SerializedName(SERIALIZED_NAME_REMAINING_LIFE_PERCENT)
  private Double remainingLifePercent;

  public static final String SERIALIZED_NAME_SERIAL = "serial";
  @SerializedName(SERIALIZED_NAME_SERIAL)
  private String serial;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Double size;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private DiskType type;

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private DiskUsage usage;

  public static final String SERIALIZED_NAME_USAGE_STATUS = "usage_status";
  @SerializedName(SERIALIZED_NAME_USAGE_STATUS)
  private DiskUsageStatus usageStatus;


  public Disk entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
    this.entityAsyncStatus = entityAsyncStatus;
    return this;
  }

   /**
   * Get entityAsyncStatus
   * @return entityAsyncStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityAsyncStatus getEntityAsyncStatus() {
    return entityAsyncStatus;
  }


  public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    this.entityAsyncStatus = entityAsyncStatus;
  }


  public Disk failureInformation(DiskFailureInformation failureInformation) {
    
    this.failureInformation = failureInformation;
    return this;
  }

   /**
   * Get failureInformation
   * @return failureInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DiskFailureInformation getFailureInformation() {
    return failureInformation;
  }


  public void setFailureInformation(DiskFailureInformation failureInformation) {
    this.failureInformation = failureInformation;
  }


  public Disk firmware(String firmware) {
    
    this.firmware = firmware;
    return this;
  }

   /**
   * Get firmware
   * @return firmware
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFirmware() {
    return firmware;
  }


  public void setFirmware(String firmware) {
    this.firmware = firmware;
  }


  public Disk function(DiskFunction function) {
    
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DiskFunction getFunction() {
    return function;
  }


  public void setFunction(DiskFunction function) {
    this.function = function;
  }


  public Disk healthStatus(DiskHealthStatus healthStatus) {
    
    this.healthStatus = healthStatus;
    return this;
  }

   /**
   * Get healthStatus
   * @return healthStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DiskHealthStatus getHealthStatus() {
    return healthStatus;
  }


  public void setHealthStatus(DiskHealthStatus healthStatus) {
    this.healthStatus = healthStatus;
  }


  public Disk healthy(Boolean healthy) {
    
    this.healthy = healthy;
    return this;
  }

   /**
   * Get healthy
   * @return healthy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getHealthy() {
    return healthy;
  }


  public void setHealthy(Boolean healthy) {
    this.healthy = healthy;
  }


  public Disk host(NameIdPair host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NameIdPair getHost() {
    return host;
  }


  public void setHost(NameIdPair host) {
    this.host = host;
  }


  public Disk id(String id) {
    
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


  public Disk labels(List<BrickTopoPowers> labels) {
    
    this.labels = labels;
    return this;
  }

  public Disk addLabelsItem(BrickTopoPowers labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<BrickTopoPowers>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BrickTopoPowers> getLabels() {
    return labels;
  }


  public void setLabels(List<BrickTopoPowers> labels) {
    this.labels = labels;
  }


  public Disk localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public Disk model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public Disk mounted(Boolean mounted) {
    
    this.mounted = mounted;
    return this;
  }

   /**
   * Get mounted
   * @return mounted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getMounted() {
    return mounted;
  }


  public void setMounted(Boolean mounted) {
    this.mounted = mounted;
  }


  public Disk name(String name) {
    
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


  public Disk numaNode(Double numaNode) {
    
    this.numaNode = numaNode;
    return this;
  }

   /**
   * Get numaNode
   * @return numaNode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getNumaNode() {
    return numaNode;
  }


  public void setNumaNode(Double numaNode) {
    this.numaNode = numaNode;
  }


  public Disk offline(Boolean offline) {
    
    this.offline = offline;
    return this;
  }

   /**
   * Get offline
   * @return offline
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getOffline() {
    return offline;
  }


  public void setOffline(Boolean offline) {
    this.offline = offline;
  }


  public Disk partitions(List<DiskPartitions> partitions) {
    
    this.partitions = partitions;
    return this;
  }

  public Disk addPartitionsItem(DiskPartitions partitionsItem) {
    this.partitions.add(partitionsItem);
    return this;
  }

   /**
   * Get partitions
   * @return partitions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<DiskPartitions> getPartitions() {
    return partitions;
  }


  public void setPartitions(List<DiskPartitions> partitions) {
    this.partitions = partitions;
  }


  public Disk path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public Disk persistentMemoryType(String persistentMemoryType) {
    
    this.persistentMemoryType = persistentMemoryType;
    return this;
  }

   /**
   * Get persistentMemoryType
   * @return persistentMemoryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPersistentMemoryType() {
    return persistentMemoryType;
  }


  public void setPersistentMemoryType(String persistentMemoryType) {
    this.persistentMemoryType = persistentMemoryType;
  }


  public Disk physicalSlotOnBrick(Double physicalSlotOnBrick) {
    
    this.physicalSlotOnBrick = physicalSlotOnBrick;
    return this;
  }

   /**
   * Get physicalSlotOnBrick
   * @return physicalSlotOnBrick
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getPhysicalSlotOnBrick() {
    return physicalSlotOnBrick;
  }


  public void setPhysicalSlotOnBrick(Double physicalSlotOnBrick) {
    this.physicalSlotOnBrick = physicalSlotOnBrick;
  }


  public Disk pmemDimms(List<NameIdPair> pmemDimms) {
    
    this.pmemDimms = pmemDimms;
    return this;
  }

  public Disk addPmemDimmsItem(NameIdPair pmemDimmsItem) {
    if (this.pmemDimms == null) {
      this.pmemDimms = new ArrayList<NameIdPair>();
    }
    this.pmemDimms.add(pmemDimmsItem);
    return this;
  }

   /**
   * Get pmemDimms
   * @return pmemDimms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NameIdPair> getPmemDimms() {
    return pmemDimms;
  }


  public void setPmemDimms(List<NameIdPair> pmemDimms) {
    this.pmemDimms = pmemDimms;
  }


  public Disk recommendedUsage(DiskUsage recommendedUsage) {
    
    this.recommendedUsage = recommendedUsage;
    return this;
  }

   /**
   * Get recommendedUsage
   * @return recommendedUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DiskUsage getRecommendedUsage() {
    return recommendedUsage;
  }


  public void setRecommendedUsage(DiskUsage recommendedUsage) {
    this.recommendedUsage = recommendedUsage;
  }


  public Disk remainingLifePercent(Double remainingLifePercent) {
    
    this.remainingLifePercent = remainingLifePercent;
    return this;
  }

   /**
   * Get remainingLifePercent
   * @return remainingLifePercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getRemainingLifePercent() {
    return remainingLifePercent;
  }


  public void setRemainingLifePercent(Double remainingLifePercent) {
    this.remainingLifePercent = remainingLifePercent;
  }


  public Disk serial(String serial) {
    
    this.serial = serial;
    return this;
  }

   /**
   * Get serial
   * @return serial
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSerial() {
    return serial;
  }


  public void setSerial(String serial) {
    this.serial = serial;
  }


  public Disk size(Double size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getSize() {
    return size;
  }


  public void setSize(Double size) {
    this.size = size;
  }


  public Disk type(DiskType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DiskType getType() {
    return type;
  }


  public void setType(DiskType type) {
    this.type = type;
  }


  public Disk usage(DiskUsage usage) {
    
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DiskUsage getUsage() {
    return usage;
  }


  public void setUsage(DiskUsage usage) {
    this.usage = usage;
  }


  public Disk usageStatus(DiskUsageStatus usageStatus) {
    
    this.usageStatus = usageStatus;
    return this;
  }

   /**
   * Get usageStatus
   * @return usageStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DiskUsageStatus getUsageStatus() {
    return usageStatus;
  }


  public void setUsageStatus(DiskUsageStatus usageStatus) {
    this.usageStatus = usageStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Disk disk = (Disk) o;
    return Objects.equals(this.entityAsyncStatus, disk.entityAsyncStatus) &&
        Objects.equals(this.failureInformation, disk.failureInformation) &&
        Objects.equals(this.firmware, disk.firmware) &&
        Objects.equals(this.function, disk.function) &&
        Objects.equals(this.healthStatus, disk.healthStatus) &&
        Objects.equals(this.healthy, disk.healthy) &&
        Objects.equals(this.host, disk.host) &&
        Objects.equals(this.id, disk.id) &&
        Objects.equals(this.labels, disk.labels) &&
        Objects.equals(this.localId, disk.localId) &&
        Objects.equals(this.model, disk.model) &&
        Objects.equals(this.mounted, disk.mounted) &&
        Objects.equals(this.name, disk.name) &&
        Objects.equals(this.numaNode, disk.numaNode) &&
        Objects.equals(this.offline, disk.offline) &&
        Objects.equals(this.partitions, disk.partitions) &&
        Objects.equals(this.path, disk.path) &&
        Objects.equals(this.persistentMemoryType, disk.persistentMemoryType) &&
        Objects.equals(this.physicalSlotOnBrick, disk.physicalSlotOnBrick) &&
        Objects.equals(this.pmemDimms, disk.pmemDimms) &&
        Objects.equals(this.recommendedUsage, disk.recommendedUsage) &&
        Objects.equals(this.remainingLifePercent, disk.remainingLifePercent) &&
        Objects.equals(this.serial, disk.serial) &&
        Objects.equals(this.size, disk.size) &&
        Objects.equals(this.type, disk.type) &&
        Objects.equals(this.usage, disk.usage) &&
        Objects.equals(this.usageStatus, disk.usageStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityAsyncStatus, failureInformation, firmware, function, healthStatus, healthy, host, id, labels, localId, model, mounted, name, numaNode, offline, partitions, path, persistentMemoryType, physicalSlotOnBrick, pmemDimms, recommendedUsage, remainingLifePercent, serial, size, type, usage, usageStatus);
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
    sb.append("class Disk {\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    failureInformation: ").append(toIndentedString(failureInformation)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
    sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    mounted: ").append(toIndentedString(mounted)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numaNode: ").append(toIndentedString(numaNode)).append("\n");
    sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
    sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    persistentMemoryType: ").append(toIndentedString(persistentMemoryType)).append("\n");
    sb.append("    physicalSlotOnBrick: ").append(toIndentedString(physicalSlotOnBrick)).append("\n");
    sb.append("    pmemDimms: ").append(toIndentedString(pmemDimms)).append("\n");
    sb.append("    recommendedUsage: ").append(toIndentedString(recommendedUsage)).append("\n");
    sb.append("    remainingLifePercent: ").append(toIndentedString(remainingLifePercent)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    usageStatus: ").append(toIndentedString(usageStatus)).append("\n");
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

