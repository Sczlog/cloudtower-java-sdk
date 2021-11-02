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


import com.smartx.tower.model.GetIscsiLunSnapshotsConnectionRequestBody;
import com.smartx.tower.model.GetIscsiLunSnapshotsRequestBody;
import com.smartx.tower.model.IscsiLunSnapshot;
import com.smartx.tower.model.IscsiLunSnapshotConnection;
import com.smartx.tower.model.IscsiLunSnapshotCreationParams;
import com.smartx.tower.model.IscsiLunSnapshotDeletionParams;
import com.smartx.tower.model.WithTaskDeleteIscsiLunSnapshot;
import com.smartx.tower.model.WithTaskIscsiLunSnapshot;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IscsiLunSnapshotApi {
    private ApiClient localVarApiClient;

    public IscsiLunSnapshotApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IscsiLunSnapshotApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createIscsiLunSnapshot
     * @param contentLanguage  (required)
     * @param iscsiLunSnapshotCreationParams  (required)
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
    public okhttp3.Call createIscsiLunSnapshotCall(String contentLanguage, List<IscsiLunSnapshotCreationParams> iscsiLunSnapshotCreationParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = iscsiLunSnapshotCreationParams;

        // create path and map variables
        String localVarPath = "/create-iscsi-lun-snapshot";

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
    private okhttp3.Call createIscsiLunSnapshotValidateBeforeCall(String contentLanguage, List<IscsiLunSnapshotCreationParams> iscsiLunSnapshotCreationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling createIscsiLunSnapshot(Async)");
        }
        
        // verify the required parameter 'iscsiLunSnapshotCreationParams' is set
        if (iscsiLunSnapshotCreationParams == null) {
            throw new ApiException("Missing the required parameter 'iscsiLunSnapshotCreationParams' when calling createIscsiLunSnapshot(Async)");
        }
        

        okhttp3.Call localVarCall = createIscsiLunSnapshotCall(contentLanguage, iscsiLunSnapshotCreationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param iscsiLunSnapshotCreationParams  (required)
     * @return List&lt;WithTaskIscsiLunSnapshot&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskIscsiLunSnapshot> createIscsiLunSnapshot(String contentLanguage, List<IscsiLunSnapshotCreationParams> iscsiLunSnapshotCreationParams) throws ApiException {
        ApiResponse<List<WithTaskIscsiLunSnapshot>> localVarResp = createIscsiLunSnapshotWithHttpInfo(contentLanguage, iscsiLunSnapshotCreationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param iscsiLunSnapshotCreationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskIscsiLunSnapshot&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskIscsiLunSnapshot>> createIscsiLunSnapshotWithHttpInfo(String contentLanguage, List<IscsiLunSnapshotCreationParams> iscsiLunSnapshotCreationParams) throws ApiException {
        okhttp3.Call localVarCall = createIscsiLunSnapshotValidateBeforeCall(contentLanguage, iscsiLunSnapshotCreationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskIscsiLunSnapshot>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param iscsiLunSnapshotCreationParams  (required)
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
    public okhttp3.Call createIscsiLunSnapshotAsync(String contentLanguage, List<IscsiLunSnapshotCreationParams> iscsiLunSnapshotCreationParams, final ApiCallback<List<WithTaskIscsiLunSnapshot>> _callback) throws ApiException {

        okhttp3.Call localVarCall = createIscsiLunSnapshotValidateBeforeCall(contentLanguage, iscsiLunSnapshotCreationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskIscsiLunSnapshot>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteIscsiLunSnapshot
     * @param contentLanguage  (required)
     * @param iscsiLunSnapshotDeletionParams  (required)
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
    public okhttp3.Call deleteIscsiLunSnapshotCall(String contentLanguage, IscsiLunSnapshotDeletionParams iscsiLunSnapshotDeletionParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = iscsiLunSnapshotDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-iscsi-lun-snapshot";

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
    private okhttp3.Call deleteIscsiLunSnapshotValidateBeforeCall(String contentLanguage, IscsiLunSnapshotDeletionParams iscsiLunSnapshotDeletionParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling deleteIscsiLunSnapshot(Async)");
        }
        
        // verify the required parameter 'iscsiLunSnapshotDeletionParams' is set
        if (iscsiLunSnapshotDeletionParams == null) {
            throw new ApiException("Missing the required parameter 'iscsiLunSnapshotDeletionParams' when calling deleteIscsiLunSnapshot(Async)");
        }
        

        okhttp3.Call localVarCall = deleteIscsiLunSnapshotCall(contentLanguage, iscsiLunSnapshotDeletionParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param iscsiLunSnapshotDeletionParams  (required)
     * @return List&lt;WithTaskDeleteIscsiLunSnapshot&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskDeleteIscsiLunSnapshot> deleteIscsiLunSnapshot(String contentLanguage, IscsiLunSnapshotDeletionParams iscsiLunSnapshotDeletionParams) throws ApiException {
        ApiResponse<List<WithTaskDeleteIscsiLunSnapshot>> localVarResp = deleteIscsiLunSnapshotWithHttpInfo(contentLanguage, iscsiLunSnapshotDeletionParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param iscsiLunSnapshotDeletionParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteIscsiLunSnapshot&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskDeleteIscsiLunSnapshot>> deleteIscsiLunSnapshotWithHttpInfo(String contentLanguage, IscsiLunSnapshotDeletionParams iscsiLunSnapshotDeletionParams) throws ApiException {
        okhttp3.Call localVarCall = deleteIscsiLunSnapshotValidateBeforeCall(contentLanguage, iscsiLunSnapshotDeletionParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteIscsiLunSnapshot>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param iscsiLunSnapshotDeletionParams  (required)
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
    public okhttp3.Call deleteIscsiLunSnapshotAsync(String contentLanguage, IscsiLunSnapshotDeletionParams iscsiLunSnapshotDeletionParams, final ApiCallback<List<WithTaskDeleteIscsiLunSnapshot>> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteIscsiLunSnapshotValidateBeforeCall(contentLanguage, iscsiLunSnapshotDeletionParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteIscsiLunSnapshot>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getIscsiLunSnapshots
     * @param contentLanguage  (required)
     * @param getIscsiLunSnapshotsRequestBody  (required)
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
    public okhttp3.Call getIscsiLunSnapshotsCall(String contentLanguage, GetIscsiLunSnapshotsRequestBody getIscsiLunSnapshotsRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getIscsiLunSnapshotsRequestBody;

        // create path and map variables
        String localVarPath = "/get-iscsi-lun-snapshots";

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
    private okhttp3.Call getIscsiLunSnapshotsValidateBeforeCall(String contentLanguage, GetIscsiLunSnapshotsRequestBody getIscsiLunSnapshotsRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getIscsiLunSnapshots(Async)");
        }
        
        // verify the required parameter 'getIscsiLunSnapshotsRequestBody' is set
        if (getIscsiLunSnapshotsRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getIscsiLunSnapshotsRequestBody' when calling getIscsiLunSnapshots(Async)");
        }
        

        okhttp3.Call localVarCall = getIscsiLunSnapshotsCall(contentLanguage, getIscsiLunSnapshotsRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getIscsiLunSnapshotsRequestBody  (required)
     * @return List&lt;IscsiLunSnapshot&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<IscsiLunSnapshot> getIscsiLunSnapshots(String contentLanguage, GetIscsiLunSnapshotsRequestBody getIscsiLunSnapshotsRequestBody) throws ApiException {
        ApiResponse<List<IscsiLunSnapshot>> localVarResp = getIscsiLunSnapshotsWithHttpInfo(contentLanguage, getIscsiLunSnapshotsRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getIscsiLunSnapshotsRequestBody  (required)
     * @return ApiResponse&lt;List&lt;IscsiLunSnapshot&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<IscsiLunSnapshot>> getIscsiLunSnapshotsWithHttpInfo(String contentLanguage, GetIscsiLunSnapshotsRequestBody getIscsiLunSnapshotsRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getIscsiLunSnapshotsValidateBeforeCall(contentLanguage, getIscsiLunSnapshotsRequestBody, null);
        Type localVarReturnType = new TypeToken<List<IscsiLunSnapshot>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getIscsiLunSnapshotsRequestBody  (required)
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
    public okhttp3.Call getIscsiLunSnapshotsAsync(String contentLanguage, GetIscsiLunSnapshotsRequestBody getIscsiLunSnapshotsRequestBody, final ApiCallback<List<IscsiLunSnapshot>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIscsiLunSnapshotsValidateBeforeCall(contentLanguage, getIscsiLunSnapshotsRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<IscsiLunSnapshot>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getIscsiLunSnapshotsConnection
     * @param contentLanguage  (required)
     * @param getIscsiLunSnapshotsConnectionRequestBody  (required)
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
    public okhttp3.Call getIscsiLunSnapshotsConnectionCall(String contentLanguage, GetIscsiLunSnapshotsConnectionRequestBody getIscsiLunSnapshotsConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getIscsiLunSnapshotsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-iscsi-lun-snapshots-connection";

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
    private okhttp3.Call getIscsiLunSnapshotsConnectionValidateBeforeCall(String contentLanguage, GetIscsiLunSnapshotsConnectionRequestBody getIscsiLunSnapshotsConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getIscsiLunSnapshotsConnection(Async)");
        }
        
        // verify the required parameter 'getIscsiLunSnapshotsConnectionRequestBody' is set
        if (getIscsiLunSnapshotsConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getIscsiLunSnapshotsConnectionRequestBody' when calling getIscsiLunSnapshotsConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getIscsiLunSnapshotsConnectionCall(contentLanguage, getIscsiLunSnapshotsConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getIscsiLunSnapshotsConnectionRequestBody  (required)
     * @return IscsiLunSnapshotConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public IscsiLunSnapshotConnection getIscsiLunSnapshotsConnection(String contentLanguage, GetIscsiLunSnapshotsConnectionRequestBody getIscsiLunSnapshotsConnectionRequestBody) throws ApiException {
        ApiResponse<IscsiLunSnapshotConnection> localVarResp = getIscsiLunSnapshotsConnectionWithHttpInfo(contentLanguage, getIscsiLunSnapshotsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getIscsiLunSnapshotsConnectionRequestBody  (required)
     * @return ApiResponse&lt;IscsiLunSnapshotConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IscsiLunSnapshotConnection> getIscsiLunSnapshotsConnectionWithHttpInfo(String contentLanguage, GetIscsiLunSnapshotsConnectionRequestBody getIscsiLunSnapshotsConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getIscsiLunSnapshotsConnectionValidateBeforeCall(contentLanguage, getIscsiLunSnapshotsConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<IscsiLunSnapshotConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getIscsiLunSnapshotsConnectionRequestBody  (required)
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
    public okhttp3.Call getIscsiLunSnapshotsConnectionAsync(String contentLanguage, GetIscsiLunSnapshotsConnectionRequestBody getIscsiLunSnapshotsConnectionRequestBody, final ApiCallback<IscsiLunSnapshotConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIscsiLunSnapshotsConnectionValidateBeforeCall(contentLanguage, getIscsiLunSnapshotsConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<IscsiLunSnapshotConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}