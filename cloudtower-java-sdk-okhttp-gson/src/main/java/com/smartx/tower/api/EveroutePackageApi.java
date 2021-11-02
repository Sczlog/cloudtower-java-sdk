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


import com.smartx.tower.model.EveroutePackage;
import com.smartx.tower.model.EveroutePackageConnection;
import com.smartx.tower.model.GetEveroutePackagesConnectionRequestBody;
import com.smartx.tower.model.GetEveroutePackagesRequestBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EveroutePackageApi {
    private ApiClient localVarApiClient;

    public EveroutePackageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EveroutePackageApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getEveroutePackages
     * @param contentLanguage  (required)
     * @param getEveroutePackagesRequestBody  (required)
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
    public okhttp3.Call getEveroutePackagesCall(String contentLanguage, GetEveroutePackagesRequestBody getEveroutePackagesRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getEveroutePackagesRequestBody;

        // create path and map variables
        String localVarPath = "/get-everoute-packages";

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
    private okhttp3.Call getEveroutePackagesValidateBeforeCall(String contentLanguage, GetEveroutePackagesRequestBody getEveroutePackagesRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getEveroutePackages(Async)");
        }
        
        // verify the required parameter 'getEveroutePackagesRequestBody' is set
        if (getEveroutePackagesRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getEveroutePackagesRequestBody' when calling getEveroutePackages(Async)");
        }
        

        okhttp3.Call localVarCall = getEveroutePackagesCall(contentLanguage, getEveroutePackagesRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getEveroutePackagesRequestBody  (required)
     * @return List&lt;EveroutePackage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<EveroutePackage> getEveroutePackages(String contentLanguage, GetEveroutePackagesRequestBody getEveroutePackagesRequestBody) throws ApiException {
        ApiResponse<List<EveroutePackage>> localVarResp = getEveroutePackagesWithHttpInfo(contentLanguage, getEveroutePackagesRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getEveroutePackagesRequestBody  (required)
     * @return ApiResponse&lt;List&lt;EveroutePackage&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<EveroutePackage>> getEveroutePackagesWithHttpInfo(String contentLanguage, GetEveroutePackagesRequestBody getEveroutePackagesRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getEveroutePackagesValidateBeforeCall(contentLanguage, getEveroutePackagesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<EveroutePackage>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getEveroutePackagesRequestBody  (required)
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
    public okhttp3.Call getEveroutePackagesAsync(String contentLanguage, GetEveroutePackagesRequestBody getEveroutePackagesRequestBody, final ApiCallback<List<EveroutePackage>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getEveroutePackagesValidateBeforeCall(contentLanguage, getEveroutePackagesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<EveroutePackage>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getEveroutePackagesConnection
     * @param contentLanguage  (required)
     * @param getEveroutePackagesConnectionRequestBody  (required)
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
    public okhttp3.Call getEveroutePackagesConnectionCall(String contentLanguage, GetEveroutePackagesConnectionRequestBody getEveroutePackagesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getEveroutePackagesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-everoute-packages-connection";

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
    private okhttp3.Call getEveroutePackagesConnectionValidateBeforeCall(String contentLanguage, GetEveroutePackagesConnectionRequestBody getEveroutePackagesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getEveroutePackagesConnection(Async)");
        }
        
        // verify the required parameter 'getEveroutePackagesConnectionRequestBody' is set
        if (getEveroutePackagesConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getEveroutePackagesConnectionRequestBody' when calling getEveroutePackagesConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getEveroutePackagesConnectionCall(contentLanguage, getEveroutePackagesConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getEveroutePackagesConnectionRequestBody  (required)
     * @return EveroutePackageConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public EveroutePackageConnection getEveroutePackagesConnection(String contentLanguage, GetEveroutePackagesConnectionRequestBody getEveroutePackagesConnectionRequestBody) throws ApiException {
        ApiResponse<EveroutePackageConnection> localVarResp = getEveroutePackagesConnectionWithHttpInfo(contentLanguage, getEveroutePackagesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getEveroutePackagesConnectionRequestBody  (required)
     * @return ApiResponse&lt;EveroutePackageConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EveroutePackageConnection> getEveroutePackagesConnectionWithHttpInfo(String contentLanguage, GetEveroutePackagesConnectionRequestBody getEveroutePackagesConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getEveroutePackagesConnectionValidateBeforeCall(contentLanguage, getEveroutePackagesConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<EveroutePackageConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getEveroutePackagesConnectionRequestBody  (required)
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
    public okhttp3.Call getEveroutePackagesConnectionAsync(String contentLanguage, GetEveroutePackagesConnectionRequestBody getEveroutePackagesConnectionRequestBody, final ApiCallback<EveroutePackageConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getEveroutePackagesConnectionValidateBeforeCall(contentLanguage, getEveroutePackagesConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<EveroutePackageConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}