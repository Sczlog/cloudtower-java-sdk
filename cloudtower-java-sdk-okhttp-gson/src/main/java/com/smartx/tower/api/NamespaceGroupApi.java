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


import com.smartx.tower.model.GetNamespaceGroupsConnectionRequestBody;
import com.smartx.tower.model.GetNamespaceGroupsRequestBody;
import com.smartx.tower.model.NamespaceGroup;
import com.smartx.tower.model.NamespaceGroupConnection;
import com.smartx.tower.model.NamespaceGroupCreationParams;
import com.smartx.tower.model.NamespaceGroupDeletionParams;
import com.smartx.tower.model.NamespaceGroupUpdationParams;
import com.smartx.tower.model.WithTaskDeleteNamespaceGroup;
import com.smartx.tower.model.WithTaskNamespaceGroup;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NamespaceGroupApi {
    private ApiClient localVarApiClient;

    public NamespaceGroupApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NamespaceGroupApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createNamespaceGroup
     * @param contentLanguage  (required)
     * @param namespaceGroupCreationParams  (required)
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
    public okhttp3.Call createNamespaceGroupCall(String contentLanguage, List<NamespaceGroupCreationParams> namespaceGroupCreationParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = namespaceGroupCreationParams;

        // create path and map variables
        String localVarPath = "/create-namespace-group";

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
    private okhttp3.Call createNamespaceGroupValidateBeforeCall(String contentLanguage, List<NamespaceGroupCreationParams> namespaceGroupCreationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling createNamespaceGroup(Async)");
        }
        
        // verify the required parameter 'namespaceGroupCreationParams' is set
        if (namespaceGroupCreationParams == null) {
            throw new ApiException("Missing the required parameter 'namespaceGroupCreationParams' when calling createNamespaceGroup(Async)");
        }
        

        okhttp3.Call localVarCall = createNamespaceGroupCall(contentLanguage, namespaceGroupCreationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param namespaceGroupCreationParams  (required)
     * @return List&lt;WithTaskNamespaceGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskNamespaceGroup> createNamespaceGroup(String contentLanguage, List<NamespaceGroupCreationParams> namespaceGroupCreationParams) throws ApiException {
        ApiResponse<List<WithTaskNamespaceGroup>> localVarResp = createNamespaceGroupWithHttpInfo(contentLanguage, namespaceGroupCreationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param namespaceGroupCreationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskNamespaceGroup&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskNamespaceGroup>> createNamespaceGroupWithHttpInfo(String contentLanguage, List<NamespaceGroupCreationParams> namespaceGroupCreationParams) throws ApiException {
        okhttp3.Call localVarCall = createNamespaceGroupValidateBeforeCall(contentLanguage, namespaceGroupCreationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskNamespaceGroup>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param namespaceGroupCreationParams  (required)
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
    public okhttp3.Call createNamespaceGroupAsync(String contentLanguage, List<NamespaceGroupCreationParams> namespaceGroupCreationParams, final ApiCallback<List<WithTaskNamespaceGroup>> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNamespaceGroupValidateBeforeCall(contentLanguage, namespaceGroupCreationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskNamespaceGroup>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteNamespaceGroup
     * @param contentLanguage  (required)
     * @param namespaceGroupDeletionParams  (required)
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
    public okhttp3.Call deleteNamespaceGroupCall(String contentLanguage, NamespaceGroupDeletionParams namespaceGroupDeletionParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = namespaceGroupDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-namespace-group";

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
    private okhttp3.Call deleteNamespaceGroupValidateBeforeCall(String contentLanguage, NamespaceGroupDeletionParams namespaceGroupDeletionParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling deleteNamespaceGroup(Async)");
        }
        
        // verify the required parameter 'namespaceGroupDeletionParams' is set
        if (namespaceGroupDeletionParams == null) {
            throw new ApiException("Missing the required parameter 'namespaceGroupDeletionParams' when calling deleteNamespaceGroup(Async)");
        }
        

        okhttp3.Call localVarCall = deleteNamespaceGroupCall(contentLanguage, namespaceGroupDeletionParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param namespaceGroupDeletionParams  (required)
     * @return List&lt;WithTaskDeleteNamespaceGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskDeleteNamespaceGroup> deleteNamespaceGroup(String contentLanguage, NamespaceGroupDeletionParams namespaceGroupDeletionParams) throws ApiException {
        ApiResponse<List<WithTaskDeleteNamespaceGroup>> localVarResp = deleteNamespaceGroupWithHttpInfo(contentLanguage, namespaceGroupDeletionParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param namespaceGroupDeletionParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteNamespaceGroup&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskDeleteNamespaceGroup>> deleteNamespaceGroupWithHttpInfo(String contentLanguage, NamespaceGroupDeletionParams namespaceGroupDeletionParams) throws ApiException {
        okhttp3.Call localVarCall = deleteNamespaceGroupValidateBeforeCall(contentLanguage, namespaceGroupDeletionParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteNamespaceGroup>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param namespaceGroupDeletionParams  (required)
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
    public okhttp3.Call deleteNamespaceGroupAsync(String contentLanguage, NamespaceGroupDeletionParams namespaceGroupDeletionParams, final ApiCallback<List<WithTaskDeleteNamespaceGroup>> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteNamespaceGroupValidateBeforeCall(contentLanguage, namespaceGroupDeletionParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteNamespaceGroup>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getNamespaceGroups
     * @param contentLanguage  (required)
     * @param getNamespaceGroupsRequestBody  (required)
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
    public okhttp3.Call getNamespaceGroupsCall(String contentLanguage, GetNamespaceGroupsRequestBody getNamespaceGroupsRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getNamespaceGroupsRequestBody;

        // create path and map variables
        String localVarPath = "/get-namespace-groups";

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
    private okhttp3.Call getNamespaceGroupsValidateBeforeCall(String contentLanguage, GetNamespaceGroupsRequestBody getNamespaceGroupsRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getNamespaceGroups(Async)");
        }
        
        // verify the required parameter 'getNamespaceGroupsRequestBody' is set
        if (getNamespaceGroupsRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getNamespaceGroupsRequestBody' when calling getNamespaceGroups(Async)");
        }
        

        okhttp3.Call localVarCall = getNamespaceGroupsCall(contentLanguage, getNamespaceGroupsRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getNamespaceGroupsRequestBody  (required)
     * @return List&lt;NamespaceGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<NamespaceGroup> getNamespaceGroups(String contentLanguage, GetNamespaceGroupsRequestBody getNamespaceGroupsRequestBody) throws ApiException {
        ApiResponse<List<NamespaceGroup>> localVarResp = getNamespaceGroupsWithHttpInfo(contentLanguage, getNamespaceGroupsRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getNamespaceGroupsRequestBody  (required)
     * @return ApiResponse&lt;List&lt;NamespaceGroup&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<NamespaceGroup>> getNamespaceGroupsWithHttpInfo(String contentLanguage, GetNamespaceGroupsRequestBody getNamespaceGroupsRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getNamespaceGroupsValidateBeforeCall(contentLanguage, getNamespaceGroupsRequestBody, null);
        Type localVarReturnType = new TypeToken<List<NamespaceGroup>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getNamespaceGroupsRequestBody  (required)
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
    public okhttp3.Call getNamespaceGroupsAsync(String contentLanguage, GetNamespaceGroupsRequestBody getNamespaceGroupsRequestBody, final ApiCallback<List<NamespaceGroup>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getNamespaceGroupsValidateBeforeCall(contentLanguage, getNamespaceGroupsRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<NamespaceGroup>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getNamespaceGroupsConnection
     * @param contentLanguage  (required)
     * @param getNamespaceGroupsConnectionRequestBody  (required)
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
    public okhttp3.Call getNamespaceGroupsConnectionCall(String contentLanguage, GetNamespaceGroupsConnectionRequestBody getNamespaceGroupsConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getNamespaceGroupsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-namespace-groups-connection";

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
    private okhttp3.Call getNamespaceGroupsConnectionValidateBeforeCall(String contentLanguage, GetNamespaceGroupsConnectionRequestBody getNamespaceGroupsConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getNamespaceGroupsConnection(Async)");
        }
        
        // verify the required parameter 'getNamespaceGroupsConnectionRequestBody' is set
        if (getNamespaceGroupsConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getNamespaceGroupsConnectionRequestBody' when calling getNamespaceGroupsConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getNamespaceGroupsConnectionCall(contentLanguage, getNamespaceGroupsConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getNamespaceGroupsConnectionRequestBody  (required)
     * @return NamespaceGroupConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public NamespaceGroupConnection getNamespaceGroupsConnection(String contentLanguage, GetNamespaceGroupsConnectionRequestBody getNamespaceGroupsConnectionRequestBody) throws ApiException {
        ApiResponse<NamespaceGroupConnection> localVarResp = getNamespaceGroupsConnectionWithHttpInfo(contentLanguage, getNamespaceGroupsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getNamespaceGroupsConnectionRequestBody  (required)
     * @return ApiResponse&lt;NamespaceGroupConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<NamespaceGroupConnection> getNamespaceGroupsConnectionWithHttpInfo(String contentLanguage, GetNamespaceGroupsConnectionRequestBody getNamespaceGroupsConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getNamespaceGroupsConnectionValidateBeforeCall(contentLanguage, getNamespaceGroupsConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<NamespaceGroupConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getNamespaceGroupsConnectionRequestBody  (required)
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
    public okhttp3.Call getNamespaceGroupsConnectionAsync(String contentLanguage, GetNamespaceGroupsConnectionRequestBody getNamespaceGroupsConnectionRequestBody, final ApiCallback<NamespaceGroupConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getNamespaceGroupsConnectionValidateBeforeCall(contentLanguage, getNamespaceGroupsConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<NamespaceGroupConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateNamespaceGroup
     * @param contentLanguage  (required)
     * @param namespaceGroupUpdationParams  (required)
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
    public okhttp3.Call updateNamespaceGroupCall(String contentLanguage, NamespaceGroupUpdationParams namespaceGroupUpdationParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = namespaceGroupUpdationParams;

        // create path and map variables
        String localVarPath = "/update-namespace-group";

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
    private okhttp3.Call updateNamespaceGroupValidateBeforeCall(String contentLanguage, NamespaceGroupUpdationParams namespaceGroupUpdationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling updateNamespaceGroup(Async)");
        }
        
        // verify the required parameter 'namespaceGroupUpdationParams' is set
        if (namespaceGroupUpdationParams == null) {
            throw new ApiException("Missing the required parameter 'namespaceGroupUpdationParams' when calling updateNamespaceGroup(Async)");
        }
        

        okhttp3.Call localVarCall = updateNamespaceGroupCall(contentLanguage, namespaceGroupUpdationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param namespaceGroupUpdationParams  (required)
     * @return List&lt;WithTaskNamespaceGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskNamespaceGroup> updateNamespaceGroup(String contentLanguage, NamespaceGroupUpdationParams namespaceGroupUpdationParams) throws ApiException {
        ApiResponse<List<WithTaskNamespaceGroup>> localVarResp = updateNamespaceGroupWithHttpInfo(contentLanguage, namespaceGroupUpdationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param namespaceGroupUpdationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskNamespaceGroup&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskNamespaceGroup>> updateNamespaceGroupWithHttpInfo(String contentLanguage, NamespaceGroupUpdationParams namespaceGroupUpdationParams) throws ApiException {
        okhttp3.Call localVarCall = updateNamespaceGroupValidateBeforeCall(contentLanguage, namespaceGroupUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskNamespaceGroup>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param namespaceGroupUpdationParams  (required)
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
    public okhttp3.Call updateNamespaceGroupAsync(String contentLanguage, NamespaceGroupUpdationParams namespaceGroupUpdationParams, final ApiCallback<List<WithTaskNamespaceGroup>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateNamespaceGroupValidateBeforeCall(contentLanguage, namespaceGroupUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskNamespaceGroup>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}