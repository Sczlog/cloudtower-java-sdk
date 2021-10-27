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


import com.smartx.tower.model.ElfDataStore;
import com.smartx.tower.model.ElfDataStoreConnection;
import com.smartx.tower.model.GetElfDataStoresConnectionRequestBody;
import com.smartx.tower.model.GetElfDataStoresRequestBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElfDataStoreApi {
    private ApiClient localVarApiClient;

    public ElfDataStoreApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ElfDataStoreApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getElfDataStores
     * @param contentLanguage  (required)
     * @param getElfDataStoresRequestBody  (required)
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
    public okhttp3.Call getElfDataStoresCall(String contentLanguage, GetElfDataStoresRequestBody getElfDataStoresRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getElfDataStoresRequestBody;

        // create path and map variables
        String localVarPath = "/get-elf-data-stores";

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
    private okhttp3.Call getElfDataStoresValidateBeforeCall(String contentLanguage, GetElfDataStoresRequestBody getElfDataStoresRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getElfDataStores(Async)");
        }
        
        // verify the required parameter 'getElfDataStoresRequestBody' is set
        if (getElfDataStoresRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getElfDataStoresRequestBody' when calling getElfDataStores(Async)");
        }
        

        okhttp3.Call localVarCall = getElfDataStoresCall(contentLanguage, getElfDataStoresRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getElfDataStoresRequestBody  (required)
     * @return List&lt;ElfDataStore&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<ElfDataStore> getElfDataStores(String contentLanguage, GetElfDataStoresRequestBody getElfDataStoresRequestBody) throws ApiException {
        ApiResponse<List<ElfDataStore>> localVarResp = getElfDataStoresWithHttpInfo(contentLanguage, getElfDataStoresRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getElfDataStoresRequestBody  (required)
     * @return ApiResponse&lt;List&lt;ElfDataStore&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ElfDataStore>> getElfDataStoresWithHttpInfo(String contentLanguage, GetElfDataStoresRequestBody getElfDataStoresRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getElfDataStoresValidateBeforeCall(contentLanguage, getElfDataStoresRequestBody, null);
        Type localVarReturnType = new TypeToken<List<ElfDataStore>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getElfDataStoresRequestBody  (required)
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
    public okhttp3.Call getElfDataStoresAsync(String contentLanguage, GetElfDataStoresRequestBody getElfDataStoresRequestBody, final ApiCallback<List<ElfDataStore>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getElfDataStoresValidateBeforeCall(contentLanguage, getElfDataStoresRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<ElfDataStore>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getElfDataStoresConnection
     * @param contentLanguage  (required)
     * @param getElfDataStoresConnectionRequestBody  (required)
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
    public okhttp3.Call getElfDataStoresConnectionCall(String contentLanguage, GetElfDataStoresConnectionRequestBody getElfDataStoresConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getElfDataStoresConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-elf-data-stores-connection";

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
    private okhttp3.Call getElfDataStoresConnectionValidateBeforeCall(String contentLanguage, GetElfDataStoresConnectionRequestBody getElfDataStoresConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getElfDataStoresConnection(Async)");
        }
        
        // verify the required parameter 'getElfDataStoresConnectionRequestBody' is set
        if (getElfDataStoresConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getElfDataStoresConnectionRequestBody' when calling getElfDataStoresConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getElfDataStoresConnectionCall(contentLanguage, getElfDataStoresConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getElfDataStoresConnectionRequestBody  (required)
     * @return ElfDataStoreConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ElfDataStoreConnection getElfDataStoresConnection(String contentLanguage, GetElfDataStoresConnectionRequestBody getElfDataStoresConnectionRequestBody) throws ApiException {
        ApiResponse<ElfDataStoreConnection> localVarResp = getElfDataStoresConnectionWithHttpInfo(contentLanguage, getElfDataStoresConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getElfDataStoresConnectionRequestBody  (required)
     * @return ApiResponse&lt;ElfDataStoreConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ElfDataStoreConnection> getElfDataStoresConnectionWithHttpInfo(String contentLanguage, GetElfDataStoresConnectionRequestBody getElfDataStoresConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getElfDataStoresConnectionValidateBeforeCall(contentLanguage, getElfDataStoresConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<ElfDataStoreConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getElfDataStoresConnectionRequestBody  (required)
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
    public okhttp3.Call getElfDataStoresConnectionAsync(String contentLanguage, GetElfDataStoresConnectionRequestBody getElfDataStoresConnectionRequestBody, final ApiCallback<ElfDataStoreConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getElfDataStoresConnectionValidateBeforeCall(contentLanguage, getElfDataStoresConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<ElfDataStoreConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
