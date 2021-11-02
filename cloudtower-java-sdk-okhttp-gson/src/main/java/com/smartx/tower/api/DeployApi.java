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


import com.smartx.tower.model.Deploy;
import com.smartx.tower.model.DeployConnection;
import com.smartx.tower.model.GetDeploysConnectionRequestBody;
import com.smartx.tower.model.GetDeploysRequestBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeployApi {
    private ApiClient localVarApiClient;

    public DeployApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DeployApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getDeploys
     * @param contentLanguage  (required)
     * @param getDeploysRequestBody  (required)
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
    public okhttp3.Call getDeploysCall(String contentLanguage, GetDeploysRequestBody getDeploysRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getDeploysRequestBody;

        // create path and map variables
        String localVarPath = "/get-deploys";

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
    private okhttp3.Call getDeploysValidateBeforeCall(String contentLanguage, GetDeploysRequestBody getDeploysRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getDeploys(Async)");
        }
        
        // verify the required parameter 'getDeploysRequestBody' is set
        if (getDeploysRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getDeploysRequestBody' when calling getDeploys(Async)");
        }
        

        okhttp3.Call localVarCall = getDeploysCall(contentLanguage, getDeploysRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getDeploysRequestBody  (required)
     * @return List&lt;Deploy&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<Deploy> getDeploys(String contentLanguage, GetDeploysRequestBody getDeploysRequestBody) throws ApiException {
        ApiResponse<List<Deploy>> localVarResp = getDeploysWithHttpInfo(contentLanguage, getDeploysRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getDeploysRequestBody  (required)
     * @return ApiResponse&lt;List&lt;Deploy&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Deploy>> getDeploysWithHttpInfo(String contentLanguage, GetDeploysRequestBody getDeploysRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getDeploysValidateBeforeCall(contentLanguage, getDeploysRequestBody, null);
        Type localVarReturnType = new TypeToken<List<Deploy>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getDeploysRequestBody  (required)
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
    public okhttp3.Call getDeploysAsync(String contentLanguage, GetDeploysRequestBody getDeploysRequestBody, final ApiCallback<List<Deploy>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDeploysValidateBeforeCall(contentLanguage, getDeploysRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<Deploy>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDeploysConnection
     * @param contentLanguage  (required)
     * @param getDeploysConnectionRequestBody  (required)
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
    public okhttp3.Call getDeploysConnectionCall(String contentLanguage, GetDeploysConnectionRequestBody getDeploysConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getDeploysConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-deploys-connection";

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
    private okhttp3.Call getDeploysConnectionValidateBeforeCall(String contentLanguage, GetDeploysConnectionRequestBody getDeploysConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getDeploysConnection(Async)");
        }
        
        // verify the required parameter 'getDeploysConnectionRequestBody' is set
        if (getDeploysConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getDeploysConnectionRequestBody' when calling getDeploysConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getDeploysConnectionCall(contentLanguage, getDeploysConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getDeploysConnectionRequestBody  (required)
     * @return DeployConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public DeployConnection getDeploysConnection(String contentLanguage, GetDeploysConnectionRequestBody getDeploysConnectionRequestBody) throws ApiException {
        ApiResponse<DeployConnection> localVarResp = getDeploysConnectionWithHttpInfo(contentLanguage, getDeploysConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getDeploysConnectionRequestBody  (required)
     * @return ApiResponse&lt;DeployConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeployConnection> getDeploysConnectionWithHttpInfo(String contentLanguage, GetDeploysConnectionRequestBody getDeploysConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getDeploysConnectionValidateBeforeCall(contentLanguage, getDeploysConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<DeployConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getDeploysConnectionRequestBody  (required)
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
    public okhttp3.Call getDeploysConnectionAsync(String contentLanguage, GetDeploysConnectionRequestBody getDeploysConnectionRequestBody, final ApiCallback<DeployConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDeploysConnectionValidateBeforeCall(contentLanguage, getDeploysConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<DeployConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}