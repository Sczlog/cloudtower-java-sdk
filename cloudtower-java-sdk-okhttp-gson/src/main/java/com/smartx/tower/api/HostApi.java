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


import com.smartx.tower.model.GetHostsConnectionRequestBody;
import com.smartx.tower.model.GetHostsRequestBody;
import com.smartx.tower.model.Host;
import com.smartx.tower.model.HostConnection;
import com.smartx.tower.model.HostCreationParams;
import com.smartx.tower.model.HostUpdationParams;
import com.smartx.tower.model.TriggerDiskBlinkParams;
import com.smartx.tower.model.WithTaskBatchHosts;
import com.smartx.tower.model.WithTaskHost;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HostApi {
    private ApiClient localVarApiClient;

    public HostApi() {
        this(Configuration.getDefaultApiClient());
    }

    public HostApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createHost
     * @param contentLanguage  (required)
     * @param hostCreationParams  (required)
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
    public okhttp3.Call createHostCall(String contentLanguage, List<HostCreationParams> hostCreationParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = hostCreationParams;

        // create path and map variables
        String localVarPath = "/create-host";

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
    private okhttp3.Call createHostValidateBeforeCall(String contentLanguage, List<HostCreationParams> hostCreationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling createHost(Async)");
        }
        
        // verify the required parameter 'hostCreationParams' is set
        if (hostCreationParams == null) {
            throw new ApiException("Missing the required parameter 'hostCreationParams' when calling createHost(Async)");
        }
        

        okhttp3.Call localVarCall = createHostCall(contentLanguage, hostCreationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param hostCreationParams  (required)
     * @return List&lt;WithTaskBatchHosts&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskBatchHosts> createHost(String contentLanguage, List<HostCreationParams> hostCreationParams) throws ApiException {
        ApiResponse<List<WithTaskBatchHosts>> localVarResp = createHostWithHttpInfo(contentLanguage, hostCreationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param hostCreationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskBatchHosts&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskBatchHosts>> createHostWithHttpInfo(String contentLanguage, List<HostCreationParams> hostCreationParams) throws ApiException {
        okhttp3.Call localVarCall = createHostValidateBeforeCall(contentLanguage, hostCreationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskBatchHosts>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param hostCreationParams  (required)
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
    public okhttp3.Call createHostAsync(String contentLanguage, List<HostCreationParams> hostCreationParams, final ApiCallback<List<WithTaskBatchHosts>> _callback) throws ApiException {

        okhttp3.Call localVarCall = createHostValidateBeforeCall(contentLanguage, hostCreationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskBatchHosts>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getHosts
     * @param contentLanguage  (required)
     * @param getHostsRequestBody  (required)
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
    public okhttp3.Call getHostsCall(String contentLanguage, GetHostsRequestBody getHostsRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getHostsRequestBody;

        // create path and map variables
        String localVarPath = "/get-hosts";

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
    private okhttp3.Call getHostsValidateBeforeCall(String contentLanguage, GetHostsRequestBody getHostsRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getHosts(Async)");
        }
        
        // verify the required parameter 'getHostsRequestBody' is set
        if (getHostsRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getHostsRequestBody' when calling getHosts(Async)");
        }
        

        okhttp3.Call localVarCall = getHostsCall(contentLanguage, getHostsRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getHostsRequestBody  (required)
     * @return List&lt;Host&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<Host> getHosts(String contentLanguage, GetHostsRequestBody getHostsRequestBody) throws ApiException {
        ApiResponse<List<Host>> localVarResp = getHostsWithHttpInfo(contentLanguage, getHostsRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getHostsRequestBody  (required)
     * @return ApiResponse&lt;List&lt;Host&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Host>> getHostsWithHttpInfo(String contentLanguage, GetHostsRequestBody getHostsRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getHostsValidateBeforeCall(contentLanguage, getHostsRequestBody, null);
        Type localVarReturnType = new TypeToken<List<Host>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getHostsRequestBody  (required)
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
    public okhttp3.Call getHostsAsync(String contentLanguage, GetHostsRequestBody getHostsRequestBody, final ApiCallback<List<Host>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getHostsValidateBeforeCall(contentLanguage, getHostsRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<Host>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getHostsConnection
     * @param contentLanguage  (required)
     * @param getHostsConnectionRequestBody  (required)
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
    public okhttp3.Call getHostsConnectionCall(String contentLanguage, GetHostsConnectionRequestBody getHostsConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getHostsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-hosts-connection";

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
    private okhttp3.Call getHostsConnectionValidateBeforeCall(String contentLanguage, GetHostsConnectionRequestBody getHostsConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getHostsConnection(Async)");
        }
        
        // verify the required parameter 'getHostsConnectionRequestBody' is set
        if (getHostsConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getHostsConnectionRequestBody' when calling getHostsConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getHostsConnectionCall(contentLanguage, getHostsConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getHostsConnectionRequestBody  (required)
     * @return HostConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public HostConnection getHostsConnection(String contentLanguage, GetHostsConnectionRequestBody getHostsConnectionRequestBody) throws ApiException {
        ApiResponse<HostConnection> localVarResp = getHostsConnectionWithHttpInfo(contentLanguage, getHostsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getHostsConnectionRequestBody  (required)
     * @return ApiResponse&lt;HostConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<HostConnection> getHostsConnectionWithHttpInfo(String contentLanguage, GetHostsConnectionRequestBody getHostsConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getHostsConnectionValidateBeforeCall(contentLanguage, getHostsConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<HostConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getHostsConnectionRequestBody  (required)
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
    public okhttp3.Call getHostsConnectionAsync(String contentLanguage, GetHostsConnectionRequestBody getHostsConnectionRequestBody, final ApiCallback<HostConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getHostsConnectionValidateBeforeCall(contentLanguage, getHostsConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<HostConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for triggerDiskBlink
     * @param contentLanguage  (required)
     * @param triggerDiskBlinkParams  (required)
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
    public okhttp3.Call triggerDiskBlinkCall(String contentLanguage, List<TriggerDiskBlinkParams> triggerDiskBlinkParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = triggerDiskBlinkParams;

        // create path and map variables
        String localVarPath = "/trigger-disk-blink";

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
    private okhttp3.Call triggerDiskBlinkValidateBeforeCall(String contentLanguage, List<TriggerDiskBlinkParams> triggerDiskBlinkParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling triggerDiskBlink(Async)");
        }
        
        // verify the required parameter 'triggerDiskBlinkParams' is set
        if (triggerDiskBlinkParams == null) {
            throw new ApiException("Missing the required parameter 'triggerDiskBlinkParams' when calling triggerDiskBlink(Async)");
        }
        

        okhttp3.Call localVarCall = triggerDiskBlinkCall(contentLanguage, triggerDiskBlinkParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param triggerDiskBlinkParams  (required)
     * @return List&lt;WithTaskHost&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskHost> triggerDiskBlink(String contentLanguage, List<TriggerDiskBlinkParams> triggerDiskBlinkParams) throws ApiException {
        ApiResponse<List<WithTaskHost>> localVarResp = triggerDiskBlinkWithHttpInfo(contentLanguage, triggerDiskBlinkParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param triggerDiskBlinkParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskHost&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskHost>> triggerDiskBlinkWithHttpInfo(String contentLanguage, List<TriggerDiskBlinkParams> triggerDiskBlinkParams) throws ApiException {
        okhttp3.Call localVarCall = triggerDiskBlinkValidateBeforeCall(contentLanguage, triggerDiskBlinkParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskHost>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param triggerDiskBlinkParams  (required)
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
    public okhttp3.Call triggerDiskBlinkAsync(String contentLanguage, List<TriggerDiskBlinkParams> triggerDiskBlinkParams, final ApiCallback<List<WithTaskHost>> _callback) throws ApiException {

        okhttp3.Call localVarCall = triggerDiskBlinkValidateBeforeCall(contentLanguage, triggerDiskBlinkParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskHost>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateHost
     * @param contentLanguage  (required)
     * @param hostUpdationParams  (required)
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
    public okhttp3.Call updateHostCall(String contentLanguage, HostUpdationParams hostUpdationParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = hostUpdationParams;

        // create path and map variables
        String localVarPath = "/update-host";

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
    private okhttp3.Call updateHostValidateBeforeCall(String contentLanguage, HostUpdationParams hostUpdationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling updateHost(Async)");
        }
        
        // verify the required parameter 'hostUpdationParams' is set
        if (hostUpdationParams == null) {
            throw new ApiException("Missing the required parameter 'hostUpdationParams' when calling updateHost(Async)");
        }
        

        okhttp3.Call localVarCall = updateHostCall(contentLanguage, hostUpdationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param hostUpdationParams  (required)
     * @return List&lt;WithTaskHost&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskHost> updateHost(String contentLanguage, HostUpdationParams hostUpdationParams) throws ApiException {
        ApiResponse<List<WithTaskHost>> localVarResp = updateHostWithHttpInfo(contentLanguage, hostUpdationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param hostUpdationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskHost&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskHost>> updateHostWithHttpInfo(String contentLanguage, HostUpdationParams hostUpdationParams) throws ApiException {
        okhttp3.Call localVarCall = updateHostValidateBeforeCall(contentLanguage, hostUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskHost>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param hostUpdationParams  (required)
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
    public okhttp3.Call updateHostAsync(String contentLanguage, HostUpdationParams hostUpdationParams, final ApiCallback<List<WithTaskHost>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateHostValidateBeforeCall(contentLanguage, hostUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskHost>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}