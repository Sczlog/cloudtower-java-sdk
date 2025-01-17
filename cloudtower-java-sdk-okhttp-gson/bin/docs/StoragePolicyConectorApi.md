# StoragePolicyConectorApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStoragePoliciesConnector**](StoragePolicyConectorApi.md#getStoragePoliciesConnector) | **POST** /get-storage-policies-connector | 


<a name="getStoragePoliciesConnector"></a>
# **getStoragePoliciesConnector**
> List&lt;StoragePolicyConector&gt; getStoragePoliciesConnector(getStoragePoliciesConnectorRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.StoragePolicyConectorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    StoragePolicyConectorApi apiInstance = new StoragePolicyConectorApi(defaultClient);
    GetStoragePoliciesConnectorRequestBody getStoragePoliciesConnectorRequestBody = new GetStoragePoliciesConnectorRequestBody(); // GetStoragePoliciesConnectorRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<StoragePolicyConector> result = apiInstance.getStoragePoliciesConnector(getStoragePoliciesConnectorRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePolicyConectorApi#getStoragePoliciesConnector");
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
 **getStoragePoliciesConnectorRequestBody** | [**GetStoragePoliciesConnectorRequestBody**](GetStoragePoliciesConnectorRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;StoragePolicyConector&gt;**](StoragePolicyConector.md)

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

