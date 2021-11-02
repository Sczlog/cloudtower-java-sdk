# ClusterImageApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClusterImages**](ClusterImageApi.md#getClusterImages) | **POST** get-cluster-images | 
[**getClusterImagesConnection**](ClusterImageApi.md#getClusterImagesConnection) | **POST** get-cluster-images-connection | 



## getClusterImages

> List&lt;ClusterImage&gt; getClusterImages(contentLanguage, getClusterImagesRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ClusterImageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ClusterImageApi apiInstance = new ClusterImageApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetClusterImagesRequestBody getClusterImagesRequestBody = new GetClusterImagesRequestBody(); // GetClusterImagesRequestBody | 
        try {
            List<ClusterImage> result = apiInstance.getClusterImages(contentLanguage, getClusterImagesRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterImageApi#getClusterImages");
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
 **getClusterImagesRequestBody** | [**GetClusterImagesRequestBody**](GetClusterImagesRequestBody.md)|  |

### Return type

[**List&lt;ClusterImage&gt;**](ClusterImage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** |  |  -  |


## getClusterImagesConnection

> ClusterImageConnection getClusterImagesConnection(contentLanguage, getClusterImagesConnectionRequestBody)



### Example

```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ClusterImageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v2/api");
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        ClusterImageApi apiInstance = new ClusterImageApi(defaultClient);
        String contentLanguage = "zh-CN"; // String | 
        GetClusterImagesConnectionRequestBody getClusterImagesConnectionRequestBody = new GetClusterImagesConnectionRequestBody(); // GetClusterImagesConnectionRequestBody | 
        try {
            ClusterImageConnection result = apiInstance.getClusterImagesConnection(contentLanguage, getClusterImagesConnectionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterImageApi#getClusterImagesConnection");
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
 **getClusterImagesConnectionRequestBody** | [**GetClusterImagesConnectionRequestBody**](GetClusterImagesConnectionRequestBody.md)|  |

### Return type

[**ClusterImageConnection**](ClusterImageConnection.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** |  |  -  |
