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


import com.smartx.tower.model.GetTasksConnectionRequestBody;
import com.smartx.tower.model.GetTasksRequestBody;
import com.smartx.tower.model.Task;
import com.smartx.tower.model.TaskConnection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskApi {
    private ApiClient localVarApiClient;

    public TaskApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TaskApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getTasks
     * @param contentLanguage  (required)
     * @param getTasksRequestBody  (required)
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
    public okhttp3.Call getTasksCall(String contentLanguage, GetTasksRequestBody getTasksRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getTasksRequestBody;

        // create path and map variables
        String localVarPath = "/get-tasks";

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
    private okhttp3.Call getTasksValidateBeforeCall(String contentLanguage, GetTasksRequestBody getTasksRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getTasks(Async)");
        }
        
        // verify the required parameter 'getTasksRequestBody' is set
        if (getTasksRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getTasksRequestBody' when calling getTasks(Async)");
        }
        

        okhttp3.Call localVarCall = getTasksCall(contentLanguage, getTasksRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getTasksRequestBody  (required)
     * @return List&lt;Task&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<Task> getTasks(String contentLanguage, GetTasksRequestBody getTasksRequestBody) throws ApiException {
        ApiResponse<List<Task>> localVarResp = getTasksWithHttpInfo(contentLanguage, getTasksRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getTasksRequestBody  (required)
     * @return ApiResponse&lt;List&lt;Task&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Task>> getTasksWithHttpInfo(String contentLanguage, GetTasksRequestBody getTasksRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getTasksValidateBeforeCall(contentLanguage, getTasksRequestBody, null);
        Type localVarReturnType = new TypeToken<List<Task>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getTasksRequestBody  (required)
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
    public okhttp3.Call getTasksAsync(String contentLanguage, GetTasksRequestBody getTasksRequestBody, final ApiCallback<List<Task>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTasksValidateBeforeCall(contentLanguage, getTasksRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<Task>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTasksConnection
     * @param contentLanguage  (required)
     * @param getTasksConnectionRequestBody  (required)
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
    public okhttp3.Call getTasksConnectionCall(String contentLanguage, GetTasksConnectionRequestBody getTasksConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getTasksConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-tasks-connection";

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
    private okhttp3.Call getTasksConnectionValidateBeforeCall(String contentLanguage, GetTasksConnectionRequestBody getTasksConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getTasksConnection(Async)");
        }
        
        // verify the required parameter 'getTasksConnectionRequestBody' is set
        if (getTasksConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getTasksConnectionRequestBody' when calling getTasksConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getTasksConnectionCall(contentLanguage, getTasksConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getTasksConnectionRequestBody  (required)
     * @return TaskConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public TaskConnection getTasksConnection(String contentLanguage, GetTasksConnectionRequestBody getTasksConnectionRequestBody) throws ApiException {
        ApiResponse<TaskConnection> localVarResp = getTasksConnectionWithHttpInfo(contentLanguage, getTasksConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getTasksConnectionRequestBody  (required)
     * @return ApiResponse&lt;TaskConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaskConnection> getTasksConnectionWithHttpInfo(String contentLanguage, GetTasksConnectionRequestBody getTasksConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getTasksConnectionValidateBeforeCall(contentLanguage, getTasksConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<TaskConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getTasksConnectionRequestBody  (required)
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
    public okhttp3.Call getTasksConnectionAsync(String contentLanguage, GetTasksConnectionRequestBody getTasksConnectionRequestBody, final ApiCallback<TaskConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTasksConnectionValidateBeforeCall(contentLanguage, getTasksConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<TaskConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
