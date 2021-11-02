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


import com.smartx.tower.model.ConsistencyGroup;
import com.smartx.tower.model.ConsistencyGroupConnection;
import com.smartx.tower.model.ConsistencyGroupCreationParams;
import com.smartx.tower.model.ConsistencyGroupDeletionParams;
import com.smartx.tower.model.ConsistencyGroupUpdationParams;
import com.smartx.tower.model.GetConsistencyGroupsConnectionRequestBody;
import com.smartx.tower.model.GetConsistencyGroupsRequestBody;
import com.smartx.tower.model.WithTaskConsistencyGroup;
import com.smartx.tower.model.WithTaskDeleteConsistencyGroup;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsistencyGroupApi {
    private ApiClient localVarApiClient;

    public ConsistencyGroupApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConsistencyGroupApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createConsistencyGroup
     * @param contentLanguage  (required)
     * @param consistencyGroupCreationParams  (required)
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
    public okhttp3.Call createConsistencyGroupCall(String contentLanguage, List<ConsistencyGroupCreationParams> consistencyGroupCreationParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = consistencyGroupCreationParams;

        // create path and map variables
        String localVarPath = "/create-consistency-group";

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
    private okhttp3.Call createConsistencyGroupValidateBeforeCall(String contentLanguage, List<ConsistencyGroupCreationParams> consistencyGroupCreationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling createConsistencyGroup(Async)");
        }
        
        // verify the required parameter 'consistencyGroupCreationParams' is set
        if (consistencyGroupCreationParams == null) {
            throw new ApiException("Missing the required parameter 'consistencyGroupCreationParams' when calling createConsistencyGroup(Async)");
        }
        

        okhttp3.Call localVarCall = createConsistencyGroupCall(contentLanguage, consistencyGroupCreationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param consistencyGroupCreationParams  (required)
     * @return List&lt;WithTaskConsistencyGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskConsistencyGroup> createConsistencyGroup(String contentLanguage, List<ConsistencyGroupCreationParams> consistencyGroupCreationParams) throws ApiException {
        ApiResponse<List<WithTaskConsistencyGroup>> localVarResp = createConsistencyGroupWithHttpInfo(contentLanguage, consistencyGroupCreationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param consistencyGroupCreationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskConsistencyGroup&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskConsistencyGroup>> createConsistencyGroupWithHttpInfo(String contentLanguage, List<ConsistencyGroupCreationParams> consistencyGroupCreationParams) throws ApiException {
        okhttp3.Call localVarCall = createConsistencyGroupValidateBeforeCall(contentLanguage, consistencyGroupCreationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskConsistencyGroup>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param consistencyGroupCreationParams  (required)
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
    public okhttp3.Call createConsistencyGroupAsync(String contentLanguage, List<ConsistencyGroupCreationParams> consistencyGroupCreationParams, final ApiCallback<List<WithTaskConsistencyGroup>> _callback) throws ApiException {

        okhttp3.Call localVarCall = createConsistencyGroupValidateBeforeCall(contentLanguage, consistencyGroupCreationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskConsistencyGroup>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteConsistencyGroup
     * @param contentLanguage  (required)
     * @param consistencyGroupDeletionParams  (required)
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
    public okhttp3.Call deleteConsistencyGroupCall(String contentLanguage, ConsistencyGroupDeletionParams consistencyGroupDeletionParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = consistencyGroupDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-consistency-group";

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
    private okhttp3.Call deleteConsistencyGroupValidateBeforeCall(String contentLanguage, ConsistencyGroupDeletionParams consistencyGroupDeletionParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling deleteConsistencyGroup(Async)");
        }
        
        // verify the required parameter 'consistencyGroupDeletionParams' is set
        if (consistencyGroupDeletionParams == null) {
            throw new ApiException("Missing the required parameter 'consistencyGroupDeletionParams' when calling deleteConsistencyGroup(Async)");
        }
        

        okhttp3.Call localVarCall = deleteConsistencyGroupCall(contentLanguage, consistencyGroupDeletionParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param consistencyGroupDeletionParams  (required)
     * @return List&lt;WithTaskDeleteConsistencyGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskDeleteConsistencyGroup> deleteConsistencyGroup(String contentLanguage, ConsistencyGroupDeletionParams consistencyGroupDeletionParams) throws ApiException {
        ApiResponse<List<WithTaskDeleteConsistencyGroup>> localVarResp = deleteConsistencyGroupWithHttpInfo(contentLanguage, consistencyGroupDeletionParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param consistencyGroupDeletionParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteConsistencyGroup&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskDeleteConsistencyGroup>> deleteConsistencyGroupWithHttpInfo(String contentLanguage, ConsistencyGroupDeletionParams consistencyGroupDeletionParams) throws ApiException {
        okhttp3.Call localVarCall = deleteConsistencyGroupValidateBeforeCall(contentLanguage, consistencyGroupDeletionParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteConsistencyGroup>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param consistencyGroupDeletionParams  (required)
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
    public okhttp3.Call deleteConsistencyGroupAsync(String contentLanguage, ConsistencyGroupDeletionParams consistencyGroupDeletionParams, final ApiCallback<List<WithTaskDeleteConsistencyGroup>> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteConsistencyGroupValidateBeforeCall(contentLanguage, consistencyGroupDeletionParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteConsistencyGroup>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getConsistencyGroups
     * @param contentLanguage  (required)
     * @param getConsistencyGroupsRequestBody  (required)
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
    public okhttp3.Call getConsistencyGroupsCall(String contentLanguage, GetConsistencyGroupsRequestBody getConsistencyGroupsRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getConsistencyGroupsRequestBody;

        // create path and map variables
        String localVarPath = "/get-consistency-groups";

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
    private okhttp3.Call getConsistencyGroupsValidateBeforeCall(String contentLanguage, GetConsistencyGroupsRequestBody getConsistencyGroupsRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getConsistencyGroups(Async)");
        }
        
        // verify the required parameter 'getConsistencyGroupsRequestBody' is set
        if (getConsistencyGroupsRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getConsistencyGroupsRequestBody' when calling getConsistencyGroups(Async)");
        }
        

        okhttp3.Call localVarCall = getConsistencyGroupsCall(contentLanguage, getConsistencyGroupsRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getConsistencyGroupsRequestBody  (required)
     * @return List&lt;ConsistencyGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<ConsistencyGroup> getConsistencyGroups(String contentLanguage, GetConsistencyGroupsRequestBody getConsistencyGroupsRequestBody) throws ApiException {
        ApiResponse<List<ConsistencyGroup>> localVarResp = getConsistencyGroupsWithHttpInfo(contentLanguage, getConsistencyGroupsRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getConsistencyGroupsRequestBody  (required)
     * @return ApiResponse&lt;List&lt;ConsistencyGroup&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ConsistencyGroup>> getConsistencyGroupsWithHttpInfo(String contentLanguage, GetConsistencyGroupsRequestBody getConsistencyGroupsRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getConsistencyGroupsValidateBeforeCall(contentLanguage, getConsistencyGroupsRequestBody, null);
        Type localVarReturnType = new TypeToken<List<ConsistencyGroup>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getConsistencyGroupsRequestBody  (required)
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
    public okhttp3.Call getConsistencyGroupsAsync(String contentLanguage, GetConsistencyGroupsRequestBody getConsistencyGroupsRequestBody, final ApiCallback<List<ConsistencyGroup>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConsistencyGroupsValidateBeforeCall(contentLanguage, getConsistencyGroupsRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<ConsistencyGroup>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getConsistencyGroupsConnection
     * @param contentLanguage  (required)
     * @param getConsistencyGroupsConnectionRequestBody  (required)
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
    public okhttp3.Call getConsistencyGroupsConnectionCall(String contentLanguage, GetConsistencyGroupsConnectionRequestBody getConsistencyGroupsConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getConsistencyGroupsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-consistency-groups-connection";

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
    private okhttp3.Call getConsistencyGroupsConnectionValidateBeforeCall(String contentLanguage, GetConsistencyGroupsConnectionRequestBody getConsistencyGroupsConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getConsistencyGroupsConnection(Async)");
        }
        
        // verify the required parameter 'getConsistencyGroupsConnectionRequestBody' is set
        if (getConsistencyGroupsConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getConsistencyGroupsConnectionRequestBody' when calling getConsistencyGroupsConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getConsistencyGroupsConnectionCall(contentLanguage, getConsistencyGroupsConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getConsistencyGroupsConnectionRequestBody  (required)
     * @return ConsistencyGroupConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ConsistencyGroupConnection getConsistencyGroupsConnection(String contentLanguage, GetConsistencyGroupsConnectionRequestBody getConsistencyGroupsConnectionRequestBody) throws ApiException {
        ApiResponse<ConsistencyGroupConnection> localVarResp = getConsistencyGroupsConnectionWithHttpInfo(contentLanguage, getConsistencyGroupsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getConsistencyGroupsConnectionRequestBody  (required)
     * @return ApiResponse&lt;ConsistencyGroupConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ConsistencyGroupConnection> getConsistencyGroupsConnectionWithHttpInfo(String contentLanguage, GetConsistencyGroupsConnectionRequestBody getConsistencyGroupsConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getConsistencyGroupsConnectionValidateBeforeCall(contentLanguage, getConsistencyGroupsConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<ConsistencyGroupConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getConsistencyGroupsConnectionRequestBody  (required)
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
    public okhttp3.Call getConsistencyGroupsConnectionAsync(String contentLanguage, GetConsistencyGroupsConnectionRequestBody getConsistencyGroupsConnectionRequestBody, final ApiCallback<ConsistencyGroupConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConsistencyGroupsConnectionValidateBeforeCall(contentLanguage, getConsistencyGroupsConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<ConsistencyGroupConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateConsistencyGroup
     * @param contentLanguage  (required)
     * @param consistencyGroupUpdationParams  (required)
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
    public okhttp3.Call updateConsistencyGroupCall(String contentLanguage, ConsistencyGroupUpdationParams consistencyGroupUpdationParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = consistencyGroupUpdationParams;

        // create path and map variables
        String localVarPath = "/update-consistency-group";

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
    private okhttp3.Call updateConsistencyGroupValidateBeforeCall(String contentLanguage, ConsistencyGroupUpdationParams consistencyGroupUpdationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling updateConsistencyGroup(Async)");
        }
        
        // verify the required parameter 'consistencyGroupUpdationParams' is set
        if (consistencyGroupUpdationParams == null) {
            throw new ApiException("Missing the required parameter 'consistencyGroupUpdationParams' when calling updateConsistencyGroup(Async)");
        }
        

        okhttp3.Call localVarCall = updateConsistencyGroupCall(contentLanguage, consistencyGroupUpdationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param consistencyGroupUpdationParams  (required)
     * @return List&lt;WithTaskConsistencyGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskConsistencyGroup> updateConsistencyGroup(String contentLanguage, ConsistencyGroupUpdationParams consistencyGroupUpdationParams) throws ApiException {
        ApiResponse<List<WithTaskConsistencyGroup>> localVarResp = updateConsistencyGroupWithHttpInfo(contentLanguage, consistencyGroupUpdationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param consistencyGroupUpdationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskConsistencyGroup&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskConsistencyGroup>> updateConsistencyGroupWithHttpInfo(String contentLanguage, ConsistencyGroupUpdationParams consistencyGroupUpdationParams) throws ApiException {
        okhttp3.Call localVarCall = updateConsistencyGroupValidateBeforeCall(contentLanguage, consistencyGroupUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskConsistencyGroup>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param consistencyGroupUpdationParams  (required)
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
    public okhttp3.Call updateConsistencyGroupAsync(String contentLanguage, ConsistencyGroupUpdationParams consistencyGroupUpdationParams, final ApiCallback<List<WithTaskConsistencyGroup>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateConsistencyGroupValidateBeforeCall(contentLanguage, consistencyGroupUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskConsistencyGroup>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}