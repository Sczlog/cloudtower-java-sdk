

# VdsWhereInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AND** | [**List&lt;VdsWhereInput&gt;**](VdsWhereInput.md) |  |  [optional]
**bondMode** | **String** |  |  [optional]
**bondModeContains** | **String** |  |  [optional]
**bondModeEndsWith** | **String** |  |  [optional]
**bondModeGt** | **String** |  |  [optional]
**bondModeGte** | **String** |  |  [optional]
**bondModeIn** | **List&lt;String&gt;** |  |  [optional]
**bondModeLt** | **String** |  |  [optional]
**bondModeLte** | **String** |  |  [optional]
**bondModeNot** | **String** |  |  [optional]
**bondModeNotContains** | **String** |  |  [optional]
**bondModeNotEndsWith** | **String** |  |  [optional]
**bondModeNotIn** | **List&lt;String&gt;** |  |  [optional]
**bondModeNotStartsWith** | **String** |  |  [optional]
**bondModeStartsWith** | **String** |  |  [optional]
**cluster** | [**ClusterWhereInput**](ClusterWhereInput.md) |  |  [optional]
**entityAsyncStatus** | [**EntityAsyncStatus**](EntityAsyncStatus.md) |  |  [optional]
**entityAsyncStatusIn** | **List&lt;EntityAsyncStatus&gt;** |  |  [optional]
**entityAsyncStatusNot** | [**EntityAsyncStatus**](EntityAsyncStatus.md) |  |  [optional]
**entityAsyncStatusNotIn** | **List&lt;EntityAsyncStatus&gt;** |  |  [optional]
**everouteCluster** | [**EverouteClusterWhereInput**](EverouteClusterWhereInput.md) |  |  [optional]
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
**internal** | **Boolean** |  |  [optional]
**internalNot** | **Boolean** |  |  [optional]
**labelsEvery** | [**LabelWhereInput**](LabelWhereInput.md) |  |  [optional]
**labelsNone** | [**LabelWhereInput**](LabelWhereInput.md) |  |  [optional]
**labelsSome** | [**LabelWhereInput**](LabelWhereInput.md) |  |  [optional]
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
**name** | **String** |  |  [optional]
**nameContains** | **String** |  |  [optional]
**nameEndsWith** | **String** |  |  [optional]
**nameGt** | **String** |  |  [optional]
**nameGte** | **String** |  |  [optional]
**nameIn** | **List&lt;String&gt;** |  |  [optional]
**nameLt** | **String** |  |  [optional]
**nameLte** | **String** |  |  [optional]
**nameNot** | **String** |  |  [optional]
**nameNotContains** | **String** |  |  [optional]
**nameNotEndsWith** | **String** |  |  [optional]
**nameNotIn** | **List&lt;String&gt;** |  |  [optional]
**nameNotStartsWith** | **String** |  |  [optional]
**nameStartsWith** | **String** |  |  [optional]
**nicsEvery** | [**NicWhereInput**](NicWhereInput.md) |  |  [optional]
**nicsNone** | [**NicWhereInput**](NicWhereInput.md) |  |  [optional]
**nicsSome** | [**NicWhereInput**](NicWhereInput.md) |  |  [optional]
**NOT** | [**List&lt;VdsWhereInput&gt;**](VdsWhereInput.md) |  |  [optional]
**OR** | [**List&lt;VdsWhereInput&gt;**](VdsWhereInput.md) |  |  [optional]
**ovsbrName** | **String** |  |  [optional]
**ovsbrNameContains** | **String** |  |  [optional]
**ovsbrNameEndsWith** | **String** |  |  [optional]
**ovsbrNameGt** | **String** |  |  [optional]
**ovsbrNameGte** | **String** |  |  [optional]
**ovsbrNameIn** | **List&lt;String&gt;** |  |  [optional]
**ovsbrNameLt** | **String** |  |  [optional]
**ovsbrNameLte** | **String** |  |  [optional]
**ovsbrNameNot** | **String** |  |  [optional]
**ovsbrNameNotContains** | **String** |  |  [optional]
**ovsbrNameNotEndsWith** | **String** |  |  [optional]
**ovsbrNameNotIn** | **List&lt;String&gt;** |  |  [optional]
**ovsbrNameNotStartsWith** | **String** |  |  [optional]
**ovsbrNameStartsWith** | **String** |  |  [optional]
**type** | [**NetworkType**](NetworkType.md) |  |  [optional]
**typeIn** | **List&lt;NetworkType&gt;** |  |  [optional]
**typeNot** | [**NetworkType**](NetworkType.md) |  |  [optional]
**typeNotIn** | **List&lt;NetworkType&gt;** |  |  [optional]
**vlansEvery** | [**VlanWhereInput**](VlanWhereInput.md) |  |  [optional]
**vlansNone** | [**VlanWhereInput**](VlanWhereInput.md) |  |  [optional]
**vlansNum** | **Integer** |  |  [optional]
**vlansNumGt** | **Integer** |  |  [optional]
**vlansNumGte** | **Integer** |  |  [optional]
**vlansNumIn** | **List&lt;Integer&gt;** |  |  [optional]
**vlansNumLt** | **Integer** |  |  [optional]
**vlansNumLte** | **Integer** |  |  [optional]
**vlansNumNot** | **Integer** |  |  [optional]
**vlansNumNotIn** | **List&lt;Integer&gt;** |  |  [optional]
**vlansSome** | [**VlanWhereInput**](VlanWhereInput.md) |  |  [optional]



