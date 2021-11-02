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


import com.smartx.tower.model.ConsistencyGroupSnapshot;
import com.smartx.tower.model.ConsistencyGroupSnapshotConnection;
import com.smartx.tower.model.ConsistencyGroupSnapshotCreationParams;
import com.smartx.tower.model.ConsistencyGroupSnapshotDeletionParams;
import com.smartx.tower.model.ConsistencyGroupSnapshotUpdationParams;
import com.smartx.tower.model.GetConsistencyGroupSnapshotsConnectionRequestBody;
import com.smartx.tower.model.GetConsistencyGroupSnapshotsRequestBody;
import com.smartx.tower.model.WithTaskConsistencyGroupSnapshot;
import com.smartx.tower.model.WithTaskDeleteConsistencyGroupSnapshot;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsistencyGroupSnapshotApi {
    private ApiClient localVarApiClient;

    public ConsistencyGroupSnapshotApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConsistencyGroupSnapshotApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createConsistencyGroupSnapshot
     * @param contentLanguage  (required)
     * @param consistencyGroupSnapshotCreationParams  (required)
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
    public okhttp3.Call createConsistencyGroupSnapshotCall(String contentLanguage, List<ConsistencyGroupSnapshotCreationParams> consistencyGroupSnapshotCreationParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = consistencyGroupSnapshotCreationParams;

        // create path and map variables
        String localVarPath = "/create-consistency-snapshot-group";

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
    private okhttp3.Call createConsistencyGroupSnapshotValidateBeforeCall(String contentLanguage, List<ConsistencyGroupSnapshotCreationParams> consistencyGroupSnapshotCreationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling createConsistencyGroupSnapshot(Async)");
        }
        
        // verify the required parameter 'consistencyGroupSnapshotCreationParams' is set
        if (consistencyGroupSnapshotCreationParams == null) {
            throw new ApiException("Missing the required parameter 'consistencyGroupSnapshotCreationParams' when calling createConsistencyGroupSnapshot(Async)");
        }
        

        okhttp3.Call localVarCall = createConsistencyGroupSnapshotCall(contentLanguage, consistencyGroupSnapshotCreationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param consistencyGroupSnapshotCreationParams  (required)
     * @return List&lt;WithTaskConsistencyGroupSnapshot&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskConsistencyGroupSnapshot> createConsistencyGroupSnapshot(String contentLanguage, List<ConsistencyGroupSnapshotCreationParams> consistencyGroupSnapshotCreationParams) throws ApiException {
        ApiResponse<List<WithTaskConsistencyGroupSnapshot>> localVarResp = createConsistencyGroupSnapshotWithHttpInfo(contentLanguage, consistencyGroupSnapshotCreationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param consistencyGroupSnapshotCreationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskConsistencyGroupSnapshot&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskConsistencyGroupSnapshot>> createConsistencyGroupSnapshotWithHttpInfo(String contentLanguage, List<ConsistencyGroupSnapshotCreationParams> consistencyGroupSnapshotCreationParams) throws ApiException {
        okhttp3.Call localVarCall = createConsistencyGroupSnapshotValidateBeforeCall(contentLanguage, consistencyGroupSnapshotCreationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskConsistencyGroupSnapshot>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param consistencyGroupSnapshotCreationParams  (required)
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
    public okhttp3.Call createConsistencyGroupSnapshotAsync(String contentLanguage, List<ConsistencyGroupSnapshotCreationParams> consistencyGroupSnapshotCreationParams, final ApiCallback<List<WithTaskConsistencyGroupSnapshot>> _callback) throws ApiException {

        okhttp3.Call localVarCall = createConsistencyGroupSnapshotValidateBeforeCall(contentLanguage, consistencyGroupSnapshotCreationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskConsistencyGroupSnapshot>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteConsistencyGroupSnapshot
     * @param contentLanguage  (required)
     * @param consistencyGroupSnapshotDeletionParams  (required)
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
    public okhttp3.Call deleteConsistencyGroupSnapshotCall(String contentLanguage, ConsistencyGroupSnapshotDeletionParams consistencyGroupSnapshotDeletionParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = consistencyGroupSnapshotDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-consistency-snapshot-group";

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
    private okhttp3.Call deleteConsistencyGroupSnapshotValidateBeforeCall(String contentLanguage, ConsistencyGroupSnapshotDeletionParams consistencyGroupSnapshotDeletionParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling deleteConsistencyGroupSnapshot(Async)");
        }
        
        // verify the required parameter 'consistencyGroupSnapshotDeletionParams' is set
        if (consistencyGroupSnapshotDeletionParams == null) {
            throw new ApiException("Missing the required parameter 'consistencyGroupSnapshotDeletionParams' when calling deleteConsistencyGroupSnapshot(Async)");
        }
        

        okhttp3.Call localVarCall = deleteConsistencyGroupSnapshotCall(contentLanguage, consistencyGroupSnapshotDeletionParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param consistencyGroupSnapshotDeletionParams  (required)
     * @return List&lt;WithTaskDeleteConsistencyGroupSnapshot&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskDeleteConsistencyGroupSnapshot> deleteConsistencyGroupSnapshot(String contentLanguage, ConsistencyGroupSnapshotDeletionParams consistencyGroupSnapshotDeletionParams) throws ApiException {
        ApiResponse<List<WithTaskDeleteConsistencyGroupSnapshot>> localVarResp = deleteConsistencyGroupSnapshotWithHttpInfo(contentLanguage, consistencyGroupSnapshotDeletionParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param consistencyGroupSnapshotDeletionParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteConsistencyGroupSnapshot&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskDeleteConsistencyGroupSnapshot>> deleteConsistencyGroupSnapshotWithHttpInfo(String contentLanguage, ConsistencyGroupSnapshotDeletionParams consistencyGroupSnapshotDeletionParams) throws ApiException {
        okhttp3.Call localVarCall = deleteConsistencyGroupSnapshotValidateBeforeCall(contentLanguage, consistencyGroupSnapshotDeletionParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteConsistencyGroupSnapshot>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param consistencyGroupSnapshotDeletionParams  (required)
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
    public okhttp3.Call deleteConsistencyGroupSnapshotAsync(String contentLanguage, ConsistencyGroupSnapshotDeletionParams consistencyGroupSnapshotDeletionParams, final ApiCallback<List<WithTaskDeleteConsistencyGroupSnapshot>> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteConsistencyGroupSnapshotValidateBeforeCall(contentLanguage, consistencyGroupSnapshotDeletionParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteConsistencyGroupSnapshot>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getConsistencyGroupSnapshots
     * @param contentLanguage  (required)
     * @param getConsistencyGroupSnapshotsRequestBody  (required)
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
    public okhttp3.Call getConsistencyGroupSnapshotsCall(String contentLanguage, GetConsistencyGroupSnapshotsRequestBody getConsistencyGroupSnapshotsRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getConsistencyGroupSnapshotsRequestBody;

        // create path and map variables
        String localVarPath = "/get-consistency-group-snapshots";

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
    private okhttp3.Call getConsistencyGroupSnapshotsValidateBeforeCall(String contentLanguage, GetConsistencyGroupSnapshotsRequestBody getConsistencyGroupSnapshotsRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getConsistencyGroupSnapshots(Async)");
        }
        
        // verify the required parameter 'getConsistencyGroupSnapshotsRequestBody' is set
        if (getConsistencyGroupSnapshotsRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getConsistencyGroupSnapshotsRequestBody' when calling getConsistencyGroupSnapshots(Async)");
        }
        

        okhttp3.Call localVarCall = getConsistencyGroupSnapshotsCall(contentLanguage, getConsistencyGroupSnapshotsRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getConsistencyGroupSnapshotsRequestBody  (required)
     * @return List&lt;ConsistencyGroupSnapshot&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<ConsistencyGroupSnapshot> getConsistencyGroupSnapshots(String contentLanguage, GetConsistencyGroupSnapshotsRequestBody getConsistencyGroupSnapshotsRequestBody) throws ApiException {
        ApiResponse<List<ConsistencyGroupSnapshot>> localVarResp = getConsistencyGroupSnapshotsWithHttpInfo(contentLanguage, getConsistencyGroupSnapshotsRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getConsistencyGroupSnapshotsRequestBody  (required)
     * @return ApiResponse&lt;List&lt;ConsistencyGroupSnapshot&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ConsistencyGroupSnapshot>> getConsistencyGroupSnapshotsWithHttpInfo(String contentLanguage, GetConsistencyGroupSnapshotsRequestBody getConsistencyGroupSnapshotsRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getConsistencyGroupSnapshotsValidateBeforeCall(contentLanguage, getConsistencyGroupSnapshotsRequestBody, null);
        Type localVarReturnType = new TypeToken<List<ConsistencyGroupSnapshot>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getConsistencyGroupSnapshotsRequestBody  (required)
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
    public okhttp3.Call getConsistencyGroupSnapshotsAsync(String contentLanguage, GetConsistencyGroupSnapshotsRequestBody getConsistencyGroupSnapshotsRequestBody, final ApiCallback<List<ConsistencyGroupSnapshot>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConsistencyGroupSnapshotsValidateBeforeCall(contentLanguage, getConsistencyGroupSnapshotsRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<ConsistencyGroupSnapshot>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getConsistencyGroupSnapshotsConnection
     * @param contentLanguage  (required)
     * @param getConsistencyGroupSnapshotsConnectionRequestBody  (required)
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
    public okhttp3.Call getConsistencyGroupSnapshotsConnectionCall(String contentLanguage, GetConsistencyGroupSnapshotsConnectionRequestBody getConsistencyGroupSnapshotsConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getConsistencyGroupSnapshotsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-consistency-group-snapshots-connection";

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
    private okhttp3.Call getConsistencyGroupSnapshotsConnectionValidateBeforeCall(String contentLanguage, GetConsistencyGroupSnapshotsConnectionRequestBody getConsistencyGroupSnapshotsConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getConsistencyGroupSnapshotsConnection(Async)");
        }
        
        // verify the required parameter 'getConsistencyGroupSnapshotsConnectionRequestBody' is set
        if (getConsistencyGroupSnapshotsConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getConsistencyGroupSnapshotsConnectionRequestBody' when calling getConsistencyGroupSnapshotsConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getConsistencyGroupSnapshotsConnectionCall(contentLanguage, getConsistencyGroupSnapshotsConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getConsistencyGroupSnapshotsConnectionRequestBody  (required)
     * @return ConsistencyGroupSnapshotConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ConsistencyGroupSnapshotConnection getConsistencyGroupSnapshotsConnection(String contentLanguage, GetConsistencyGroupSnapshotsConnectionRequestBody getConsistencyGroupSnapshotsConnectionRequestBody) throws ApiException {
        ApiResponse<ConsistencyGroupSnapshotConnection> localVarResp = getConsistencyGroupSnapshotsConnectionWithHttpInfo(contentLanguage, getConsistencyGroupSnapshotsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getConsistencyGroupSnapshotsConnectionRequestBody  (required)
     * @return ApiResponse&lt;ConsistencyGroupSnapshotConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ConsistencyGroupSnapshotConnection> getConsistencyGroupSnapshotsConnectionWithHttpInfo(String contentLanguage, GetConsistencyGroupSnapshotsConnectionRequestBody getConsistencyGroupSnapshotsConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getConsistencyGroupSnapshotsConnectionValidateBeforeCall(contentLanguage, getConsistencyGroupSnapshotsConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<ConsistencyGroupSnapshotConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getConsistencyGroupSnapshotsConnectionRequestBody  (required)
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
    public okhttp3.Call getConsistencyGroupSnapshotsConnectionAsync(String contentLanguage, GetConsistencyGroupSnapshotsConnectionRequestBody getConsistencyGroupSnapshotsConnectionRequestBody, final ApiCallback<ConsistencyGroupSnapshotConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConsistencyGroupSnapshotsConnectionValidateBeforeCall(contentLanguage, getConsistencyGroupSnapshotsConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<ConsistencyGroupSnapshotConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateConsistencyGroupSnapshot
     * @param contentLanguage  (required)
     * @param consistencyGroupSnapshotUpdationParams  (required)
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
    public okhttp3.Call updateConsistencyGroupSnapshotCall(String contentLanguage, ConsistencyGroupSnapshotUpdationParams consistencyGroupSnapshotUpdationParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = consistencyGroupSnapshotUpdationParams;

        // create path and map variables
        String localVarPath = "/rollback-consistency-snapshot-group";

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
    private okhttp3.Call updateConsistencyGroupSnapshotValidateBeforeCall(String contentLanguage, ConsistencyGroupSnapshotUpdationParams consistencyGroupSnapshotUpdationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling updateConsistencyGroupSnapshot(Async)");
        }
        
        // verify the required parameter 'consistencyGroupSnapshotUpdationParams' is set
        if (consistencyGroupSnapshotUpdationParams == null) {
            throw new ApiException("Missing the required parameter 'consistencyGroupSnapshotUpdationParams' when calling updateConsistencyGroupSnapshot(Async)");
        }
        

        okhttp3.Call localVarCall = updateConsistencyGroupSnapshotCall(contentLanguage, consistencyGroupSnapshotUpdationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param consistencyGroupSnapshotUpdationParams  (required)
     * @return List&lt;WithTaskConsistencyGroupSnapshot&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskConsistencyGroupSnapshot> updateConsistencyGroupSnapshot(String contentLanguage, ConsistencyGroupSnapshotUpdationParams consistencyGroupSnapshotUpdationParams) throws ApiException {
        ApiResponse<List<WithTaskConsistencyGroupSnapshot>> localVarResp = updateConsistencyGroupSnapshotWithHttpInfo(contentLanguage, consistencyGroupSnapshotUpdationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param consistencyGroupSnapshotUpdationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskConsistencyGroupSnapshot&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskConsistencyGroupSnapshot>> updateConsistencyGroupSnapshotWithHttpInfo(String contentLanguage, ConsistencyGroupSnapshotUpdationParams consistencyGroupSnapshotUpdationParams) throws ApiException {
        okhttp3.Call localVarCall = updateConsistencyGroupSnapshotValidateBeforeCall(contentLanguage, consistencyGroupSnapshotUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskConsistencyGroupSnapshot>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param consistencyGroupSnapshotUpdationParams  (required)
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
    public okhttp3.Call updateConsistencyGroupSnapshotAsync(String contentLanguage, ConsistencyGroupSnapshotUpdationParams consistencyGroupSnapshotUpdationParams, final ApiCallback<List<WithTaskConsistencyGroupSnapshot>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateConsistencyGroupSnapshotValidateBeforeCall(contentLanguage, consistencyGroupSnapshotUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskConsistencyGroupSnapshot>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}