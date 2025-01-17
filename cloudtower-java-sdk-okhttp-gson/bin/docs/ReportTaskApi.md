# ReportTaskApi

All URIs are relative to *http://localhost/v2/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReportTasks**](ReportTaskApi.md#getReportTasks) | **POST** /get-report-tasks | 
[**getReportTasksConnection**](ReportTaskApi.md#getReportTasksConnection) | **POST** /get-report-tasks-connection | 


<a name="getReportTasks"></a>
# **getReportTasks**
> List&lt;ReportTask&gt; getReportTasks(getReportTasksRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ReportTaskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ReportTaskApi apiInstance = new ReportTaskApi(defaultClient);
    GetReportTasksRequestBody getReportTasksRequestBody = new GetReportTasksRequestBody(); // GetReportTasksRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      List<ReportTask> result = apiInstance.getReportTasks(getReportTasksRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportTaskApi#getReportTasks");
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
 **getReportTasksRequestBody** | [**GetReportTasksRequestBody**](GetReportTasksRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**List&lt;ReportTask&gt;**](ReportTask.md)

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

<a name="getReportTasksConnection"></a>
# **getReportTasksConnection**
> ReportTaskConnection getReportTasksConnection(getReportTasksConnectionRequestBody, contentLanguage)



### Example
```java
// Import classes:
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.Configuration;
import com.smartx.tower.auth.*;
import com.smartx.tower.models.*;
import com.smartx.tower.api.ReportTaskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v2/api");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ReportTaskApi apiInstance = new ReportTaskApi(defaultClient);
    GetReportTasksConnectionRequestBody getReportTasksConnectionRequestBody = new GetReportTasksConnectionRequestBody(); // GetReportTasksConnectionRequestBody | 
    String contentLanguage = "zh-CN"; // String | 
    try {
      ReportTaskConnection result = apiInstance.getReportTasksConnection(getReportTasksConnectionRequestBody, contentLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportTaskApi#getReportTasksConnection");
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
 **getReportTasksConnectionRequestBody** | [**GetReportTasksConnectionRequestBody**](GetReportTasksConnectionRequestBody.md)|  |
 **contentLanguage** | **String**|  | [optional] [default to en-US] [enum: zh-CN, en-US]

### Return type

[**ReportTaskConnection**](ReportTaskConnection.md)

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

