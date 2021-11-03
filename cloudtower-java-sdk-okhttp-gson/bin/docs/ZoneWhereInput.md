

# ZoneWhereInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AND** | [**List&lt;ZoneWhereInput&gt;**](ZoneWhereInput.md) |  |  [optional]
**cluster** | [**ClusterWhereInput**](ClusterWhereInput.md) |  |  [optional]
**datacenter** | [**DatacenterWhereInput**](DatacenterWhereInput.md) |  |  [optional]
**failureDataSpace** | **Double** |  |  [optional]
**failureDataSpaceGt** | **Double** |  |  [optional]
**failureDataSpaceGte** | **Double** |  |  [optional]
**failureDataSpaceIn** | **List&lt;Double&gt;** |  |  [optional]
**failureDataSpaceLt** | **Double** |  |  [optional]
**failureDataSpaceLte** | **Double** |  |  [optional]
**failureDataSpaceNot** | **Double** |  |  [optional]
**failureDataSpaceNotIn** | **List&lt;Double&gt;** |  |  [optional]
**hostNum** | **Double** |  |  [optional]
**hostNumGt** | **Double** |  |  [optional]
**hostNumGte** | **Double** |  |  [optional]
**hostNumIn** | **List&lt;Double&gt;** |  |  [optional]
**hostNumLt** | **Double** |  |  [optional]
**hostNumLte** | **Double** |  |  [optional]
**hostNumNot** | **Double** |  |  [optional]
**hostNumNotIn** | **List&lt;Double&gt;** |  |  [optional]
**hostsEvery** | [**HostWhereInput**](HostWhereInput.md) |  |  [optional]
**hostsNone** | [**HostWhereInput**](HostWhereInput.md) |  |  [optional]
**hostsSome** | [**HostWhereInput**](HostWhereInput.md) |  |  [optional]
**id** | **String** |  |  [optional]
**idContains** | **String** |  |  [optional]
**idEndsWith** | **String** |  |  [optional]
**idGt** | **String** |  |  [optional]
**idGte** | **String** |  |  [optional]
**idIn** | **List&lt;String&gt;** |  |  [optional]
**idLt** | **String** |  |  [optional]
**idLte** | **String** |  |  [optional]
**idNot** | **String** |  |  [optional]
**idNotContains** | **String** |  |  [optional]
**idNotEndsWith** | **String** |  |  [optional]
**idNotIn** | **List&lt;String&gt;** |  |  [optional]
**idNotStartsWith** | **String** |  |  [optional]
**idStartsWith** | **String** |  |  [optional]
**isPreferred** | **Boolean** |  |  [optional]
**isPreferredNot** | **Boolean** |  |  [optional]
**localId** | **String** |  |  [optional]
**localIdContains** | **String** |  |  [optional]
**localIdEndsWith** | **String** |  |  [optional]
**localIdGt** | **String** |  |  [optional]
**localIdGte** | **String** |  |  [optional]
**localIdIn** | **List&lt;String&gt;** |  |  [optional]
**localIdLt** | **String** |  |  [optional]
**localIdLte** | **String** |  |  [optional]
**localIdNot** | **String** |  |  [optional]
**localIdNotContains** | **String** |  |  [optional]
**localIdNotEndsWith** | **String** |  |  [optional]
**localIdNotIn** | **List&lt;String&gt;** |  |  [optional]
**localIdNotStartsWith** | **String** |  |  [optional]
**localIdStartsWith** | **String** |  |  [optional]
**NOT** | [**List&lt;ZoneWhereInput&gt;**](ZoneWhereInput.md) |  |  [optional]
**OR** | [**List&lt;ZoneWhereInput&gt;**](ZoneWhereInput.md) |  |  [optional]
**provisionedCpuCores** | **Double** |  |  [optional]
**provisionedCpuCoresForActiveVm** | **Double** |  |  [optional]
**provisionedCpuCoresForActiveVmGt** | **Double** |  |  [optional]
**provisionedCpuCoresForActiveVmGte** | **Double** |  |  [optional]
**provisionedCpuCoresForActiveVmIn** | **List&lt;Double&gt;** |  |  [optional]
**provisionedCpuCoresForActiveVmLt** | **Double** |  |  [optional]
**provisionedCpuCoresForActiveVmLte** | **Double** |  |  [optional]
**provisionedCpuCoresForActiveVmNot** | **Double** |  |  [optional]
**provisionedCpuCoresForActiveVmNotIn** | **List&lt;Double&gt;** |  |  [optional]
**provisionedCpuCoresGt** | **Double** |  |  [optional]
**provisionedCpuCoresGte** | **Double** |  |  [optional]
**provisionedCpuCoresIn** | **List&lt;Double&gt;** |  |  [optional]
**provisionedCpuCoresLt** | **Double** |  |  [optional]
**provisionedCpuCoresLte** | **Double** |  |  [optional]
**provisionedCpuCoresNot** | **Double** |  |  [optional]
**provisionedCpuCoresNotIn** | **List&lt;Double&gt;** |  |  [optional]
**provisionedDataSpace** | **Double** |  |  [optional]
**provisionedDataSpaceGt** | **Double** |  |  [optional]
**provisionedDataSpaceGte** | **Double** |  |  [optional]
**provisionedDataSpaceIn** | **List&lt;Double&gt;** |  |  [optional]
**provisionedDataSpaceLt** | **Double** |  |  [optional]
**provisionedDataSpaceLte** | **Double** |  |  [optional]
**provisionedDataSpaceNot** | **Double** |  |  [optional]
**provisionedDataSpaceNotIn** | **List&lt;Double&gt;** |  |  [optional]
**provisionedMemoryBytes** | **Double** |  |  [optional]
**provisionedMemoryBytesGt** | **Double** |  |  [optional]
**provisionedMemoryBytesGte** | **Double** |  |  [optional]
**provisionedMemoryBytesIn** | **List&lt;Double&gt;** |  |  [optional]
**provisionedMemoryBytesLt** | **Double** |  |  [optional]
**provisionedMemoryBytesLte** | **Double** |  |  [optional]
**provisionedMemoryBytesNot** | **Double** |  |  [optional]
**provisionedMemoryBytesNotIn** | **List&lt;Double&gt;** |  |  [optional]
**runningVmNum** | **Double** |  |  [optional]
**runningVmNumGt** | **Double** |  |  [optional]
**runningVmNumGte** | **Double** |  |  [optional]
**runningVmNumIn** | **List&lt;Double&gt;** |  |  [optional]
**runningVmNumLt** | **Double** |  |  [optional]
**runningVmNumLte** | **Double** |  |  [optional]
**runningVmNumNot** | **Double** |  |  [optional]
**runningVmNumNotIn** | **List&lt;Double&gt;** |  |  [optional]
**stoppedVmNum** | **Double** |  |  [optional]
**stoppedVmNumGt** | **Double** |  |  [optional]
**stoppedVmNumGte** | **Double** |  |  [optional]
**stoppedVmNumIn** | **List&lt;Double&gt;** |  |  [optional]
**stoppedVmNumLt** | **Double** |  |  [optional]
**stoppedVmNumLte** | **Double** |  |  [optional]
**stoppedVmNumNot** | **Double** |  |  [optional]
**stoppedVmNumNotIn** | **List&lt;Double&gt;** |  |  [optional]
**suspendedVmNum** | **Double** |  |  [optional]
**suspendedVmNumGt** | **Double** |  |  [optional]
**suspendedVmNumGte** | **Double** |  |  [optional]
**suspendedVmNumIn** | **List&lt;Double&gt;** |  |  [optional]
**suspendedVmNumLt** | **Double** |  |  [optional]
**suspendedVmNumLte** | **Double** |  |  [optional]
**suspendedVmNumNot** | **Double** |  |  [optional]
**suspendedVmNumNotIn** | **List&lt;Double&gt;** |  |  [optional]
**totalCacheCapacity** | **Double** |  |  [optional]
**totalCacheCapacityGt** | **Double** |  |  [optional]
**totalCacheCapacityGte** | **Double** |  |  [optional]
**totalCacheCapacityIn** | **List&lt;Double&gt;** |  |  [optional]
**totalCacheCapacityLt** | **Double** |  |  [optional]
**totalCacheCapacityLte** | **Double** |  |  [optional]
**totalCacheCapacityNot** | **Double** |  |  [optional]
**totalCacheCapacityNotIn** | **List&lt;Double&gt;** |  |  [optional]
**totalCpuCores** | **Double** |  |  [optional]
**totalCpuCoresGt** | **Double** |  |  [optional]
**totalCpuCoresGte** | **Double** |  |  [optional]
**totalCpuCoresIn** | **List&lt;Double&gt;** |  |  [optional]
**totalCpuCoresLt** | **Double** |  |  [optional]
**totalCpuCoresLte** | **Double** |  |  [optional]
**totalCpuCoresNot** | **Double** |  |  [optional]
**totalCpuCoresNotIn** | **List&lt;Double&gt;** |  |  [optional]
**totalCpuHz** | **Double** |  |  [optional]
**totalCpuHzGt** | **Double** |  |  [optional]
**totalCpuHzGte** | **Double** |  |  [optional]
**totalCpuHzIn** | **List&lt;Double&gt;** |  |  [optional]
**totalCpuHzLt** | **Double** |  |  [optional]
**totalCpuHzLte** | **Double** |  |  [optional]
**totalCpuHzNot** | **Double** |  |  [optional]
**totalCpuHzNotIn** | **List&lt;Double&gt;** |  |  [optional]
**totalDataCapacity** | **Double** |  |  [optional]
**totalDataCapacityGt** | **Double** |  |  [optional]
**totalDataCapacityGte** | **Double** |  |  [optional]
**totalDataCapacityIn** | **List&lt;Double&gt;** |  |  [optional]
**totalDataCapacityLt** | **Double** |  |  [optional]
**totalDataCapacityLte** | **Double** |  |  [optional]
**totalDataCapacityNot** | **Double** |  |  [optional]
**totalDataCapacityNotIn** | **List&lt;Double&gt;** |  |  [optional]
**totalMemoryBytes** | **Double** |  |  [optional]
**totalMemoryBytesGt** | **Double** |  |  [optional]
**totalMemoryBytesGte** | **Double** |  |  [optional]
**totalMemoryBytesIn** | **List&lt;Double&gt;** |  |  [optional]
**totalMemoryBytesLt** | **Double** |  |  [optional]
**totalMemoryBytesLte** | **Double** |  |  [optional]
**totalMemoryBytesNot** | **Double** |  |  [optional]
**totalMemoryBytesNotIn** | **List&lt;Double&gt;** |  |  [optional]
**usedDataSpace** | **Double** |  |  [optional]
**usedDataSpaceGt** | **Double** |  |  [optional]
**usedDataSpaceGte** | **Double** |  |  [optional]
**usedDataSpaceIn** | **List&lt;Double&gt;** |  |  [optional]
**usedDataSpaceLt** | **Double** |  |  [optional]
**usedDataSpaceLte** | **Double** |  |  [optional]
**usedDataSpaceNot** | **Double** |  |  [optional]
**usedDataSpaceNotIn** | **List&lt;Double&gt;** |  |  [optional]
**validDataSpace** | **Double** |  |  [optional]
**validDataSpaceGt** | **Double** |  |  [optional]
**validDataSpaceGte** | **Double** |  |  [optional]
**validDataSpaceIn** | **List&lt;Double&gt;** |  |  [optional]
**validDataSpaceLt** | **Double** |  |  [optional]
**validDataSpaceLte** | **Double** |  |  [optional]
**validDataSpaceNot** | **Double** |  |  [optional]
**validDataSpaceNotIn** | **List&lt;Double&gt;** |  |  [optional]
**vmNum** | **Double** |  |  [optional]
**vmNumGt** | **Double** |  |  [optional]
**vmNumGte** | **Double** |  |  [optional]
**vmNumIn** | **List&lt;Double&gt;** |  |  [optional]
**vmNumLt** | **Double** |  |  [optional]
**vmNumLte** | **Double** |  |  [optional]
**vmNumNot** | **Double** |  |  [optional]
**vmNumNotIn** | **List&lt;Double&gt;** |  |  [optional]


