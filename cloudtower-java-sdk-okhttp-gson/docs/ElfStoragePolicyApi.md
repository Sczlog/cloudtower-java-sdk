# ElfStoragePolicyApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getElfStoragePolicies**](ElfStoragePolicyApi.md#getElfStoragePolicies) | **POST** /get-elf-storage-policies | 
[**getElfStoragePoliciesConnection**](ElfStoragePolicyApi.md#getElfStoragePoliciesConnection) | **POST** /get-elf-storage-policies-connection | 


<a name="getElfStoragePolicies"></a>
# **getElfStoragePolicies**
> List&lt;ElfStoragePolicy&gt; getElfStoragePolicies(getElfStoragePoliciesRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ElfStoragePolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ElfStoragePolicyApi apiInstance = new ElfStoragePolicyApi(defaultClient);
    GetElfStoragePoliciesRequestBody getElfStoragePoliciesRequestBody = new GetElfStoragePoliciesRequestBody(); // GetElfStoragePoliciesRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<ElfStoragePolicy> result = apiInstance.getElfStoragePolicies(getElfStoragePoliciesRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElfStoragePolicyApi#getElfStoragePolicies");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getElfStoragePoliciesRequestBody** | [**GetElfStoragePoliciesRequestBody**](GetElfStoragePoliciesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;ElfStoragePolicy&gt;**](ElfStoragePolicy.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** |  |  -  |

<a name="getElfStoragePoliciesConnection"></a>
# **getElfStoragePoliciesConnection**
> ElfStoragePolicyConnection getElfStoragePoliciesConnection(getElfStoragePoliciesConnectionRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ElfStoragePolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ElfStoragePolicyApi apiInstance = new ElfStoragePolicyApi(defaultClient);
    GetElfStoragePoliciesConnectionRequestBody getElfStoragePoliciesConnectionRequestBody = new GetElfStoragePoliciesConnectionRequestBody(); // GetElfStoragePoliciesConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      ElfStoragePolicyConnection result = apiInstance.getElfStoragePoliciesConnection(getElfStoragePoliciesConnectionRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElfStoragePolicyApi#getElfStoragePoliciesConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getElfStoragePoliciesConnectionRequestBody** | [**GetElfStoragePoliciesConnectionRequestBody**](GetElfStoragePoliciesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**ElfStoragePolicyConnection**](ElfStoragePolicyConnection.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** |  |  -  |

