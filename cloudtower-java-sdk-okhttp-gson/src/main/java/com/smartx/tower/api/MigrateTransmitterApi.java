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


import com.smartx.tower.model.GetMigrateTransmittersConnectionRequestBody;
import com.smartx.tower.model.GetMigrateTransmittersRequestBody;
import com.smartx.tower.model.MigrateTransmitter;
import com.smartx.tower.model.MigrateTransmitterConnection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigrateTransmitterApi {
    private ApiClient localVarApiClient;

    public MigrateTransmitterApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MigrateTransmitterApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getMigrateTransmitters
     * @param getMigrateTransmittersRequestBody  (required)
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
    public okhttp3.Call getMigrateTransmittersCall(GetMigrateTransmittersRequestBody getMigrateTransmittersRequestBody, String contentLanguage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getMigrateTransmittersRequestBody;

        // create path and map variables
        String localVarPath = "/get-migrate-transmitters";

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
    private okhttp3.Call getMigrateTransmittersValidateBeforeCall(GetMigrateTransmittersRequestBody getMigrateTransmittersRequestBody, String contentLanguage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getMigrateTransmittersRequestBody' is set
        if (getMigrateTransmittersRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getMigrateTransmittersRequestBody' when calling getMigrateTransmitters(Async)");
        }
        

        okhttp3.Call localVarCall = getMigrateTransmittersCall(getMigrateTransmittersRequestBody, contentLanguage, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getMigrateTransmittersRequestBody  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return List&lt;MigrateTransmitter&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<MigrateTransmitter> getMigrateTransmitters(GetMigrateTransmittersRequestBody getMigrateTransmittersRequestBody, String contentLanguage) throws ApiException {
        ApiResponse<List<MigrateTransmitter>> localVarResp = getMigrateTransmittersWithHttpInfo(getMigrateTransmittersRequestBody, contentLanguage);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getMigrateTransmittersRequestBody  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return ApiResponse&lt;List&lt;MigrateTransmitter&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<MigrateTransmitter>> getMigrateTransmittersWithHttpInfo(GetMigrateTransmittersRequestBody getMigrateTransmittersRequestBody, String contentLanguage) throws ApiException {
        okhttp3.Call localVarCall = getMigrateTransmittersValidateBeforeCall(getMigrateTransmittersRequestBody, contentLanguage, null);
        Type localVarReturnType = new TypeToken<List<MigrateTransmitter>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getMigrateTransmittersRequestBody  (required)
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
    public okhttp3.Call getMigrateTransmittersAsync(GetMigrateTransmittersRequestBody getMigrateTransmittersRequestBody, String contentLanguage, final ApiCallback<List<MigrateTransmitter>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMigrateTransmittersValidateBeforeCall(getMigrateTransmittersRequestBody, contentLanguage, _callback);
        Type localVarReturnType = new TypeToken<List<MigrateTransmitter>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMigrateTransmittersConnection
     * @param getMigrateTransmittersConnectionRequestBody  (required)
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
    public okhttp3.Call getMigrateTransmittersConnectionCall(GetMigrateTransmittersConnectionRequestBody getMigrateTransmittersConnectionRequestBody, String contentLanguage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getMigrateTransmittersConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-migrate-transmitters-connection";

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
    private okhttp3.Call getMigrateTransmittersConnectionValidateBeforeCall(GetMigrateTransmittersConnectionRequestBody getMigrateTransmittersConnectionRequestBody, String contentLanguage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getMigrateTransmittersConnectionRequestBody' is set
        if (getMigrateTransmittersConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getMigrateTransmittersConnectionRequestBody' when calling getMigrateTransmittersConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getMigrateTransmittersConnectionCall(getMigrateTransmittersConnectionRequestBody, contentLanguage, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getMigrateTransmittersConnectionRequestBody  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return MigrateTransmitterConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public MigrateTransmitterConnection getMigrateTransmittersConnection(GetMigrateTransmittersConnectionRequestBody getMigrateTransmittersConnectionRequestBody, String contentLanguage) throws ApiException {
        ApiResponse<MigrateTransmitterConnection> localVarResp = getMigrateTransmittersConnectionWithHttpInfo(getMigrateTransmittersConnectionRequestBody, contentLanguage);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getMigrateTransmittersConnectionRequestBody  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return ApiResponse&lt;MigrateTransmitterConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MigrateTransmitterConnection> getMigrateTransmittersConnectionWithHttpInfo(GetMigrateTransmittersConnectionRequestBody getMigrateTransmittersConnectionRequestBody, String contentLanguage) throws ApiException {
        okhttp3.Call localVarCall = getMigrateTransmittersConnectionValidateBeforeCall(getMigrateTransmittersConnectionRequestBody, contentLanguage, null);
        Type localVarReturnType = new TypeToken<MigrateTransmitterConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getMigrateTransmittersConnectionRequestBody  (required)
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
    public okhttp3.Call getMigrateTransmittersConnectionAsync(GetMigrateTransmittersConnectionRequestBody getMigrateTransmittersConnectionRequestBody, String contentLanguage, final ApiCallback<MigrateTransmitterConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMigrateTransmittersConnectionValidateBeforeCall(getMigrateTransmittersConnectionRequestBody, contentLanguage, _callback);
        Type localVarReturnType = new TypeToken<MigrateTransmitterConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
