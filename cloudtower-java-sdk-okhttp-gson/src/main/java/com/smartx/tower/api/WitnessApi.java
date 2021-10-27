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


import com.smartx.tower.model.GetWitnessesConnectionRequestBody;
import com.smartx.tower.model.GetWitnessesRequestBody;
import com.smartx.tower.model.Witness;
import com.smartx.tower.model.WitnessConnection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WitnessApi {
    private ApiClient localVarApiClient;

    public WitnessApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WitnessApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getWitnesses
     * @param contentLanguage  (required)
     * @param getWitnessesRequestBody  (required)
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
    public okhttp3.Call getWitnessesCall(String contentLanguage, GetWitnessesRequestBody getWitnessesRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getWitnessesRequestBody;

        // create path and map variables
        String localVarPath = "/get-witnesses";

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
    private okhttp3.Call getWitnessesValidateBeforeCall(String contentLanguage, GetWitnessesRequestBody getWitnessesRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getWitnesses(Async)");
        }
        
        // verify the required parameter 'getWitnessesRequestBody' is set
        if (getWitnessesRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getWitnessesRequestBody' when calling getWitnesses(Async)");
        }
        

        okhttp3.Call localVarCall = getWitnessesCall(contentLanguage, getWitnessesRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getWitnessesRequestBody  (required)
     * @return List&lt;Witness&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<Witness> getWitnesses(String contentLanguage, GetWitnessesRequestBody getWitnessesRequestBody) throws ApiException {
        ApiResponse<List<Witness>> localVarResp = getWitnessesWithHttpInfo(contentLanguage, getWitnessesRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getWitnessesRequestBody  (required)
     * @return ApiResponse&lt;List&lt;Witness&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Witness>> getWitnessesWithHttpInfo(String contentLanguage, GetWitnessesRequestBody getWitnessesRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getWitnessesValidateBeforeCall(contentLanguage, getWitnessesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<Witness>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getWitnessesRequestBody  (required)
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
    public okhttp3.Call getWitnessesAsync(String contentLanguage, GetWitnessesRequestBody getWitnessesRequestBody, final ApiCallback<List<Witness>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWitnessesValidateBeforeCall(contentLanguage, getWitnessesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<Witness>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getWitnessesConnection
     * @param contentLanguage  (required)
     * @param getWitnessesConnectionRequestBody  (required)
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
    public okhttp3.Call getWitnessesConnectionCall(String contentLanguage, GetWitnessesConnectionRequestBody getWitnessesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getWitnessesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-witnesses-connection";

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
    private okhttp3.Call getWitnessesConnectionValidateBeforeCall(String contentLanguage, GetWitnessesConnectionRequestBody getWitnessesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getWitnessesConnection(Async)");
        }
        
        // verify the required parameter 'getWitnessesConnectionRequestBody' is set
        if (getWitnessesConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getWitnessesConnectionRequestBody' when calling getWitnessesConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getWitnessesConnectionCall(contentLanguage, getWitnessesConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getWitnessesConnectionRequestBody  (required)
     * @return WitnessConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public WitnessConnection getWitnessesConnection(String contentLanguage, GetWitnessesConnectionRequestBody getWitnessesConnectionRequestBody) throws ApiException {
        ApiResponse<WitnessConnection> localVarResp = getWitnessesConnectionWithHttpInfo(contentLanguage, getWitnessesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getWitnessesConnectionRequestBody  (required)
     * @return ApiResponse&lt;WitnessConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WitnessConnection> getWitnessesConnectionWithHttpInfo(String contentLanguage, GetWitnessesConnectionRequestBody getWitnessesConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getWitnessesConnectionValidateBeforeCall(contentLanguage, getWitnessesConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<WitnessConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getWitnessesConnectionRequestBody  (required)
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
    public okhttp3.Call getWitnessesConnectionAsync(String contentLanguage, GetWitnessesConnectionRequestBody getWitnessesConnectionRequestBody, final ApiCallback<WitnessConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWitnessesConnectionValidateBeforeCall(contentLanguage, getWitnessesConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<WitnessConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
