# DeployApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDeploys**](DeployApi.md#getDeploys) | **POST** /get-deploys | 
[**getDeploysConnection**](DeployApi.md#getDeploysConnection) | **POST** /get-deploys-connection | 


<a name="getDeploys"></a>
# **getDeploys**
> List&lt;Deploy&gt; getDeploys(contentLanguage, getDeploysRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DeployApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    DeployApi apiInstance = new DeployApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetDeploysRequestBody getDeploysRequestBody = new GetDeploysRequestBody(); // GetDeploysRequestBody | 
    try {
      List<Deploy> result = apiInstance.getDeploys(contentLanguage, getDeploysRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeployApi#getDeploys");
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getDeploysRequestBody** | [**GetDeploysRequestBody**](GetDeploysRequestBody.md)|  |

### Return type

[**List&lt;Deploy&gt;**](Deploy.md)

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

<a name="getDeploysConnection"></a>
# **getDeploysConnection**
> DeployConnection getDeploysConnection(contentLanguage, getDeploysConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DeployApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    DeployApi apiInstance = new DeployApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetDeploysConnectionRequestBody getDeploysConnectionRequestBody = new GetDeploysConnectionRequestBody(); // GetDeploysConnectionRequestBody | 
    try {
      DeployConnection result = apiInstance.getDeploysConnection(contentLanguage, getDeploysConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeployApi#getDeploysConnection");
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
 **contentLanguage** | **String**|  | [enum: zh-CN, en-US]
 **getDeploysConnectionRequestBody** | [**GetDeploysConnectionRequestBody**](GetDeploysConnectionRequestBody.md)|  |

### Return type

[**DeployConnection**](DeployConnection.md)

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
