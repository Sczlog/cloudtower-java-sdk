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


package com.smartx.tower.api;

import com.smartx.tower.ApiCallback;
import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Configuration;
import com.smartx.tower.Pair;
import com.smartx.tower.ProgressRequestBody;
import com.smartx.tower.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.smartx.tower.model.GetReportTasksConnectionRequestBody;
import com.smartx.tower.model.GetReportTasksRequestBody;
import com.smartx.tower.model.ReportTask;
import com.smartx.tower.model.ReportTaskConnection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportTaskApi {
    private ApiClient localVarApiClient;

    public ReportTaskApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportTaskApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getReportTasks
     * @param contentLanguage  (required)
     * @param getReportTasksRequestBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportTasksCall(String contentLanguage, GetReportTasksRequestBody getReportTasksRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getReportTasksRequestBody;

        // create path and map variables
        String localVarPath = "/get-report-tasks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (contentLanguage != null) {
            localVarHeaderParams.put("content-language", localVarApiClient.parameterToString(contentLanguage));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getReportTasksValidateBeforeCall(String contentLanguage, GetReportTasksRequestBody getReportTasksRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getReportTasks(Async)");
        }
        
        // verify the required parameter 'getReportTasksRequestBody' is set
        if (getReportTasksRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getReportTasksRequestBody' when calling getReportTasks(Async)");
        }
        

        okhttp3.Call localVarCall = getReportTasksCall(contentLanguage, getReportTasksRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getReportTasksRequestBody  (required)
     * @return List&lt;ReportTask&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<ReportTask> getReportTasks(String contentLanguage, GetReportTasksRequestBody getReportTasksRequestBody) throws ApiException {
        ApiResponse<List<ReportTask>> localVarResp = getReportTasksWithHttpInfo(contentLanguage, getReportTasksRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getReportTasksRequestBody  (required)
     * @return ApiResponse&lt;List&lt;ReportTask&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ReportTask>> getReportTasksWithHttpInfo(String contentLanguage, GetReportTasksRequestBody getReportTasksRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getReportTasksValidateBeforeCall(contentLanguage, getReportTasksRequestBody, null);
        Type localVarReturnType = new TypeToken<List<ReportTask>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getReportTasksRequestBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportTasksAsync(String contentLanguage, GetReportTasksRequestBody getReportTasksRequestBody, final ApiCallback<List<ReportTask>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getReportTasksValidateBeforeCall(contentLanguage, getReportTasksRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<ReportTask>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getReportTasksConnection
     * @param contentLanguage  (required)
     * @param getReportTasksConnectionRequestBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportTasksConnectionCall(String contentLanguage, GetReportTasksConnectionRequestBody getReportTasksConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getReportTasksConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-report-tasks-connection";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (contentLanguage != null) {
            localVarHeaderParams.put("content-language", localVarApiClient.parameterToString(contentLanguage));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getReportTasksConnectionValidateBeforeCall(String contentLanguage, GetReportTasksConnectionRequestBody getReportTasksConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getReportTasksConnection(Async)");
        }
        
        // verify the required parameter 'getReportTasksConnectionRequestBody' is set
        if (getReportTasksConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getReportTasksConnectionRequestBody' when calling getReportTasksConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getReportTasksConnectionCall(contentLanguage, getReportTasksConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getReportTasksConnectionRequestBody  (required)
     * @return ReportTaskConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ReportTaskConnection getReportTasksConnection(String contentLanguage, GetReportTasksConnectionRequestBody getReportTasksConnectionRequestBody) throws ApiException {
        ApiResponse<ReportTaskConnection> localVarResp = getReportTasksConnectionWithHttpInfo(contentLanguage, getReportTasksConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getReportTasksConnectionRequestBody  (required)
     * @return ApiResponse&lt;ReportTaskConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportTaskConnection> getReportTasksConnectionWithHttpInfo(String contentLanguage, GetReportTasksConnectionRequestBody getReportTasksConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getReportTasksConnectionValidateBeforeCall(contentLanguage, getReportTasksConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<ReportTaskConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getReportTasksConnectionRequestBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportTasksConnectionAsync(String contentLanguage, GetReportTasksConnectionRequestBody getReportTasksConnectionRequestBody, final ApiCallback<ReportTaskConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getReportTasksConnectionValidateBeforeCall(contentLanguage, getReportTasksConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<ReportTaskConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}