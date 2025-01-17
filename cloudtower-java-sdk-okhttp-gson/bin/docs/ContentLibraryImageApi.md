# ContentLibraryImageApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getContentLibraryImages**](ContentLibraryImageApi.md#getContentLibraryImages) | **POST** /get-content-library-images | 
[**getContentLibraryImagesConnection**](ContentLibraryImageApi.md#getContentLibraryImagesConnection) | **POST** /get-content-library-images-connection | 


<a name="getContentLibraryImages"></a>
# **getContentLibraryImages**
> List&lt;ContentLibraryImage&gt; getContentLibraryImages(getContentLibraryImagesRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ContentLibraryImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ContentLibraryImageApi apiInstance = new ContentLibraryImageApi(defaultClient);
    GetContentLibraryImagesRequestBody getContentLibraryImagesRequestBody = new GetContentLibraryImagesRequestBody(); // GetContentLibraryImagesRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<ContentLibraryImage> result = apiInstance.getContentLibraryImages(getContentLibraryImagesRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentLibraryImageApi#getContentLibraryImages");
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
 **getContentLibraryImagesRequestBody** | [**GetContentLibraryImagesRequestBody**](GetContentLibraryImagesRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;ContentLibraryImage&gt;**](ContentLibraryImage.md)

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

<a name="getContentLibraryImagesConnection"></a>
# **getContentLibraryImagesConnection**
> ContentLibraryImageConnection getContentLibraryImagesConnection(getContentLibraryImagesConnectionRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ContentLibraryImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ContentLibraryImageApi apiInstance = new ContentLibraryImageApi(defaultClient);
    GetContentLibraryImagesConnectionRequestBody getContentLibraryImagesConnectionRequestBody = new GetContentLibraryImagesConnectionRequestBody(); // GetContentLibraryImagesConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      ContentLibraryImageConnection result = apiInstance.getContentLibraryImagesConnection(getContentLibraryImagesConnectionRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentLibraryImageApi#getContentLibraryImagesConnection");
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
 **getContentLibraryImagesConnectionRequestBody** | [**GetContentLibraryImagesConnectionRequestBody**](GetContentLibraryImagesConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**ContentLibraryImageConnection**](ContentLibraryImageConnection.md)

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

