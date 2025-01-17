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


import com.smartx.tower.model.GetIscsiConnectionsRequestBody;
import com.smartx.tower.model.IscsiConnection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IscsiConnectionApi {
    private ApiClient localVarApiClient;

    public IscsiConnectionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IscsiConnectionApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getIscsiConnections
     * @param getIscsiConnectionsRequestBody  (required)
     * @param contentLanguage  (optional, default to en-US)
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
    public okhttp3.Call getIscsiConnectionsCall(GetIscsiConnectionsRequestBody getIscsiConnectionsRequestBody, String contentLanguage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getIscsiConnectionsRequestBody;

        // create path and map variables
        String localVarPath = "/get-iscsi-connections";

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
    private okhttp3.Call getIscsiConnectionsValidateBeforeCall(GetIscsiConnectionsRequestBody getIscsiConnectionsRequestBody, String contentLanguage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getIscsiConnectionsRequestBody' is set
        if (getIscsiConnectionsRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getIscsiConnectionsRequestBody' when calling getIscsiConnections(Async)");
        }
        

        okhttp3.Call localVarCall = getIscsiConnectionsCall(getIscsiConnectionsRequestBody, contentLanguage, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getIscsiConnectionsRequestBody  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return List&lt;IscsiConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<IscsiConnection> getIscsiConnections(GetIscsiConnectionsRequestBody getIscsiConnectionsRequestBody, String contentLanguage) throws ApiException {
        ApiResponse<List<IscsiConnection>> localVarResp = getIscsiConnectionsWithHttpInfo(getIscsiConnectionsRequestBody, contentLanguage);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getIscsiConnectionsRequestBody  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return ApiResponse&lt;List&lt;IscsiConnection&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<IscsiConnection>> getIscsiConnectionsWithHttpInfo(GetIscsiConnectionsRequestBody getIscsiConnectionsRequestBody, String contentLanguage) throws ApiException {
        okhttp3.Call localVarCall = getIscsiConnectionsValidateBeforeCall(getIscsiConnectionsRequestBody, contentLanguage, null);
        Type localVarReturnType = new TypeToken<List<IscsiConnection>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getIscsiConnectionsRequestBody  (required)
     * @param contentLanguage  (optional, default to en-US)
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
    public okhttp3.Call getIscsiConnectionsAsync(GetIscsiConnectionsRequestBody getIscsiConnectionsRequestBody, String contentLanguage, final ApiCallback<List<IscsiConnection>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIscsiConnectionsValidateBeforeCall(getIscsiConnectionsRequestBody, contentLanguage, _callback);
        Type localVarReturnType = new TypeToken<List<IscsiConnection>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
