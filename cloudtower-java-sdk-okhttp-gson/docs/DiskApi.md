# DiskApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDisks**](DiskApi.md#getDisks) | **POST** /get-disks | 
[**getDisksConnection**](DiskApi.md#getDisksConnection) | **POST** /get-disks-connection | 
[**mountDisk**](DiskApi.md#mountDisk) | **POST** /mount-disk | 
[**unmountDisk**](DiskApi.md#unmountDisk) | **POST** /unmount-disk | 


<a name="getDisks"></a>
# **getDisks**
> List&lt;Disk&gt; getDisks(contentLanguage, getDisksRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DiskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    DiskApi apiInstance = new DiskApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetDisksRequestBody getDisksRequestBody = new GetDisksRequestBody(); // GetDisksRequestBody | 
    try {
      List<Disk> result = apiInstance.getDisks(contentLanguage, getDisksRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiskApi#getDisks");
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
 **getDisksRequestBody** | [**GetDisksRequestBody**](GetDisksRequestBody.md)|  |

### Return type

[**List&lt;Disk&gt;**](Disk.md)

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

<a name="getDisksConnection"></a>
# **getDisksConnection**
> DiskConnection getDisksConnection(contentLanguage, getDisksConnectionRequestBody)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DiskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    DiskApi apiInstance = new DiskApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    GetDisksConnectionRequestBody getDisksConnectionRequestBody = new GetDisksConnectionRequestBody(); // GetDisksConnectionRequestBody | 
    try {
      DiskConnection result = apiInstance.getDisksConnection(contentLanguage, getDisksConnectionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiskApi#getDisksConnection");
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
 **getDisksConnectionRequestBody** | [**GetDisksConnectionRequestBody**](GetDisksConnectionRequestBody.md)|  |

### Return type

[**DiskConnection**](DiskConnection.md)

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

<a name="mountDisk"></a>
# **mountDisk**
> List&lt;WithTaskDisk&gt; mountDisk(contentLanguage, diskMountParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DiskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    DiskApi apiInstance = new DiskApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    DiskMountParams diskMountParams = new DiskMountParams(); // DiskMountParams | 
    try {
      List<WithTaskDisk> result = apiInstance.mountDisk(contentLanguage, diskMountParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiskApi#mountDisk");
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
 **diskMountParams** | [**DiskMountParams**](DiskMountParams.md)|  |

### Return type

[**List&lt;WithTaskDisk&gt;**](WithTaskDisk.md)

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

<a name="unmountDisk"></a>
# **unmountDisk**
> List&lt;WithTaskDisk&gt; unmountDisk(contentLanguage, diskUnmountParams)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.DiskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    DiskApi apiInstance = new DiskApi(defaultClient);
    String contentLanguage = "zh-CN"; // String | 
    DiskUnmountParams diskUnmountParams = new DiskUnmountParams(); // DiskUnmountParams | 
    try {
      List<WithTaskDisk> result = apiInstance.unmountDisk(contentLanguage, diskUnmountParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiskApi#unmountDisk");
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
 **diskUnmountParams** | [**DiskUnmountParams**](DiskUnmountParams.md)|  |

### Return type

[**List&lt;WithTaskDisk&gt;**](WithTaskDisk.md)

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
