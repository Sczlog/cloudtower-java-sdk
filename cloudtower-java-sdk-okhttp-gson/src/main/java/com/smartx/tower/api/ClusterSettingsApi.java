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


import com.smartx.tower.model.ClusterSettings;
import com.smartx.tower.model.ClusterSettingsConnection;
import com.smartx.tower.model.GetClusterSettingsesConnectionRequestBody;
import com.smartx.tower.model.GetClusterSettingsesRequestBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClusterSettingsApi {
    private ApiClient localVarApiClient;

    public ClusterSettingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ClusterSettingsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getClusterSettingses
     * @param contentLanguage  (required)
     * @param getClusterSettingsesRequestBody  (required)
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
    public okhttp3.Call getClusterSettingsesCall(String contentLanguage, GetClusterSettingsesRequestBody getClusterSettingsesRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getClusterSettingsesRequestBody;

        // create path and map variables
        String localVarPath = "/get-cluster-settingses";

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
    private okhttp3.Call getClusterSettingsesValidateBeforeCall(String contentLanguage, GetClusterSettingsesRequestBody getClusterSettingsesRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getClusterSettingses(Async)");
        }
        
        // verify the required parameter 'getClusterSettingsesRequestBody' is set
        if (getClusterSettingsesRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getClusterSettingsesRequestBody' when calling getClusterSettingses(Async)");
        }
        

        okhttp3.Call localVarCall = getClusterSettingsesCall(contentLanguage, getClusterSettingsesRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getClusterSettingsesRequestBody  (required)
     * @return List&lt;ClusterSettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<ClusterSettings> getClusterSettingses(String contentLanguage, GetClusterSettingsesRequestBody getClusterSettingsesRequestBody) throws ApiException {
        ApiResponse<List<ClusterSettings>> localVarResp = getClusterSettingsesWithHttpInfo(contentLanguage, getClusterSettingsesRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getClusterSettingsesRequestBody  (required)
     * @return ApiResponse&lt;List&lt;ClusterSettings&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ClusterSettings>> getClusterSettingsesWithHttpInfo(String contentLanguage, GetClusterSettingsesRequestBody getClusterSettingsesRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getClusterSettingsesValidateBeforeCall(contentLanguage, getClusterSettingsesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<ClusterSettings>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getClusterSettingsesRequestBody  (required)
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
    public okhttp3.Call getClusterSettingsesAsync(String contentLanguage, GetClusterSettingsesRequestBody getClusterSettingsesRequestBody, final ApiCallback<List<ClusterSettings>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getClusterSettingsesValidateBeforeCall(contentLanguage, getClusterSettingsesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<ClusterSettings>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getClusterSettingsesConnection
     * @param contentLanguage  (required)
     * @param getClusterSettingsesConnectionRequestBody  (required)
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
    public okhttp3.Call getClusterSettingsesConnectionCall(String contentLanguage, GetClusterSettingsesConnectionRequestBody getClusterSettingsesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getClusterSettingsesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-cluster-settingses-connection";

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
    private okhttp3.Call getClusterSettingsesConnectionValidateBeforeCall(String contentLanguage, GetClusterSettingsesConnectionRequestBody getClusterSettingsesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getClusterSettingsesConnection(Async)");
        }
        
        // verify the required parameter 'getClusterSettingsesConnectionRequestBody' is set
        if (getClusterSettingsesConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getClusterSettingsesConnectionRequestBody' when calling getClusterSettingsesConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getClusterSettingsesConnectionCall(contentLanguage, getClusterSettingsesConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getClusterSettingsesConnectionRequestBody  (required)
     * @return ClusterSettingsConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ClusterSettingsConnection getClusterSettingsesConnection(String contentLanguage, GetClusterSettingsesConnectionRequestBody getClusterSettingsesConnectionRequestBody) throws ApiException {
        ApiResponse<ClusterSettingsConnection> localVarResp = getClusterSettingsesConnectionWithHttpInfo(contentLanguage, getClusterSettingsesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getClusterSettingsesConnectionRequestBody  (required)
     * @return ApiResponse&lt;ClusterSettingsConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ClusterSettingsConnection> getClusterSettingsesConnectionWithHttpInfo(String contentLanguage, GetClusterSettingsesConnectionRequestBody getClusterSettingsesConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getClusterSettingsesConnectionValidateBeforeCall(contentLanguage, getClusterSettingsesConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<ClusterSettingsConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getClusterSettingsesConnectionRequestBody  (required)
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
    public okhttp3.Call getClusterSettingsesConnectionAsync(String contentLanguage, GetClusterSettingsesConnectionRequestBody getClusterSettingsesConnectionRequestBody, final ApiCallback<ClusterSettingsConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getClusterSettingsesConnectionValidateBeforeCall(contentLanguage, getClusterSettingsesConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<ClusterSettingsConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}