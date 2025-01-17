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


import com.smartx.tower.model.GetSnmpTransportsConnectionRequestBody;
import com.smartx.tower.model.GetSnmpTransportsRequestBody;
import com.smartx.tower.model.SnmpTransport;
import com.smartx.tower.model.SnmpTransportConnection;
import com.smartx.tower.model.SnmpTransportCreationParams;
import com.smartx.tower.model.SnmpTransportDeletionParams;
import com.smartx.tower.model.SnmpTransportUpdationParams;
import com.smartx.tower.model.WithTaskDeleteSnmpTransport;
import com.smartx.tower.model.WithTaskSnmpTransport;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SnmpTransportApi {
    private ApiClient localVarApiClient;

    public SnmpTransportApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SnmpTransportApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createSnmpTransport
     * @param snmpTransportCreationParams  (required)
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
    public okhttp3.Call createSnmpTransportCall(List<SnmpTransportCreationParams> snmpTransportCreationParams, String contentLanguage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = snmpTransportCreationParams;

        // create path and map variables
        String localVarPath = "/create-snmp-transport";

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
    private okhttp3.Call createSnmpTransportValidateBeforeCall(List<SnmpTransportCreationParams> snmpTransportCreationParams, String contentLanguage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'snmpTransportCreationParams' is set
        if (snmpTransportCreationParams == null) {
            throw new ApiException("Missing the required parameter 'snmpTransportCreationParams' when calling createSnmpTransport(Async)");
        }
        

        okhttp3.Call localVarCall = createSnmpTransportCall(snmpTransportCreationParams, contentLanguage, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param snmpTransportCreationParams  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return List&lt;WithTaskSnmpTransport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskSnmpTransport> createSnmpTransport(List<SnmpTransportCreationParams> snmpTransportCreationParams, String contentLanguage) throws ApiException {
        ApiResponse<List<WithTaskSnmpTransport>> localVarResp = createSnmpTransportWithHttpInfo(snmpTransportCreationParams, contentLanguage);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param snmpTransportCreationParams  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return ApiResponse&lt;List&lt;WithTaskSnmpTransport&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskSnmpTransport>> createSnmpTransportWithHttpInfo(List<SnmpTransportCreationParams> snmpTransportCreationParams, String contentLanguage) throws ApiException {
        okhttp3.Call localVarCall = createSnmpTransportValidateBeforeCall(snmpTransportCreationParams, contentLanguage, null);
        Type localVarReturnType = new TypeToken<List<WithTaskSnmpTransport>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param snmpTransportCreationParams  (required)
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
    public okhttp3.Call createSnmpTransportAsync(List<SnmpTransportCreationParams> snmpTransportCreationParams, String contentLanguage, final ApiCallback<List<WithTaskSnmpTransport>> _callback) throws ApiException {

        okhttp3.Call localVarCall = createSnmpTransportValidateBeforeCall(snmpTransportCreationParams, contentLanguage, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskSnmpTransport>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteSnmpTransport
     * @param snmpTransportDeletionParams  (required)
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
    public okhttp3.Call deleteSnmpTransportCall(SnmpTransportDeletionParams snmpTransportDeletionParams, String contentLanguage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = snmpTransportDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-snmp-transport";

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
    private okhttp3.Call deleteSnmpTransportValidateBeforeCall(SnmpTransportDeletionParams snmpTransportDeletionParams, String contentLanguage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'snmpTransportDeletionParams' is set
        if (snmpTransportDeletionParams == null) {
            throw new ApiException("Missing the required parameter 'snmpTransportDeletionParams' when calling deleteSnmpTransport(Async)");
        }
        

        okhttp3.Call localVarCall = deleteSnmpTransportCall(snmpTransportDeletionParams, contentLanguage, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param snmpTransportDeletionParams  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return List&lt;WithTaskDeleteSnmpTransport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskDeleteSnmpTransport> deleteSnmpTransport(SnmpTransportDeletionParams snmpTransportDeletionParams, String contentLanguage) throws ApiException {
        ApiResponse<List<WithTaskDeleteSnmpTransport>> localVarResp = deleteSnmpTransportWithHttpInfo(snmpTransportDeletionParams, contentLanguage);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param snmpTransportDeletionParams  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteSnmpTransport&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskDeleteSnmpTransport>> deleteSnmpTransportWithHttpInfo(SnmpTransportDeletionParams snmpTransportDeletionParams, String contentLanguage) throws ApiException {
        okhttp3.Call localVarCall = deleteSnmpTransportValidateBeforeCall(snmpTransportDeletionParams, contentLanguage, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteSnmpTransport>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param snmpTransportDeletionParams  (required)
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
    public okhttp3.Call deleteSnmpTransportAsync(SnmpTransportDeletionParams snmpTransportDeletionParams, String contentLanguage, final ApiCallback<List<WithTaskDeleteSnmpTransport>> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteSnmpTransportValidateBeforeCall(snmpTransportDeletionParams, contentLanguage, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteSnmpTransport>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSnmpTransports
     * @param getSnmpTransportsRequestBody  (required)
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
    public okhttp3.Call getSnmpTransportsCall(GetSnmpTransportsRequestBody getSnmpTransportsRequestBody, String contentLanguage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getSnmpTransportsRequestBody;

        // create path and map variables
        String localVarPath = "/get-snmp-transports";

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
    private okhttp3.Call getSnmpTransportsValidateBeforeCall(GetSnmpTransportsRequestBody getSnmpTransportsRequestBody, String contentLanguage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getSnmpTransportsRequestBody' is set
        if (getSnmpTransportsRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getSnmpTransportsRequestBody' when calling getSnmpTransports(Async)");
        }
        

        okhttp3.Call localVarCall = getSnmpTransportsCall(getSnmpTransportsRequestBody, contentLanguage, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getSnmpTransportsRequestBody  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return List&lt;SnmpTransport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<SnmpTransport> getSnmpTransports(GetSnmpTransportsRequestBody getSnmpTransportsRequestBody, String contentLanguage) throws ApiException {
        ApiResponse<List<SnmpTransport>> localVarResp = getSnmpTransportsWithHttpInfo(getSnmpTransportsRequestBody, contentLanguage);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getSnmpTransportsRequestBody  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return ApiResponse&lt;List&lt;SnmpTransport&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<SnmpTransport>> getSnmpTransportsWithHttpInfo(GetSnmpTransportsRequestBody getSnmpTransportsRequestBody, String contentLanguage) throws ApiException {
        okhttp3.Call localVarCall = getSnmpTransportsValidateBeforeCall(getSnmpTransportsRequestBody, contentLanguage, null);
        Type localVarReturnType = new TypeToken<List<SnmpTransport>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getSnmpTransportsRequestBody  (required)
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
    public okhttp3.Call getSnmpTransportsAsync(GetSnmpTransportsRequestBody getSnmpTransportsRequestBody, String contentLanguage, final ApiCallback<List<SnmpTransport>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSnmpTransportsValidateBeforeCall(getSnmpTransportsRequestBody, contentLanguage, _callback);
        Type localVarReturnType = new TypeToken<List<SnmpTransport>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSnmpTransportsConnection
     * @param getSnmpTransportsConnectionRequestBody  (required)
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
    public okhttp3.Call getSnmpTransportsConnectionCall(GetSnmpTransportsConnectionRequestBody getSnmpTransportsConnectionRequestBody, String contentLanguage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getSnmpTransportsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-snmp-transports-connection";

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
    private okhttp3.Call getSnmpTransportsConnectionValidateBeforeCall(GetSnmpTransportsConnectionRequestBody getSnmpTransportsConnectionRequestBody, String contentLanguage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getSnmpTransportsConnectionRequestBody' is set
        if (getSnmpTransportsConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getSnmpTransportsConnectionRequestBody' when calling getSnmpTransportsConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getSnmpTransportsConnectionCall(getSnmpTransportsConnectionRequestBody, contentLanguage, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getSnmpTransportsConnectionRequestBody  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return SnmpTransportConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public SnmpTransportConnection getSnmpTransportsConnection(GetSnmpTransportsConnectionRequestBody getSnmpTransportsConnectionRequestBody, String contentLanguage) throws ApiException {
        ApiResponse<SnmpTransportConnection> localVarResp = getSnmpTransportsConnectionWithHttpInfo(getSnmpTransportsConnectionRequestBody, contentLanguage);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getSnmpTransportsConnectionRequestBody  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return ApiResponse&lt;SnmpTransportConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SnmpTransportConnection> getSnmpTransportsConnectionWithHttpInfo(GetSnmpTransportsConnectionRequestBody getSnmpTransportsConnectionRequestBody, String contentLanguage) throws ApiException {
        okhttp3.Call localVarCall = getSnmpTransportsConnectionValidateBeforeCall(getSnmpTransportsConnectionRequestBody, contentLanguage, null);
        Type localVarReturnType = new TypeToken<SnmpTransportConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getSnmpTransportsConnectionRequestBody  (required)
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
    public okhttp3.Call getSnmpTransportsConnectionAsync(GetSnmpTransportsConnectionRequestBody getSnmpTransportsConnectionRequestBody, String contentLanguage, final ApiCallback<SnmpTransportConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSnmpTransportsConnectionValidateBeforeCall(getSnmpTransportsConnectionRequestBody, contentLanguage, _callback);
        Type localVarReturnType = new TypeToken<SnmpTransportConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateSnmpTransport
     * @param snmpTransportUpdationParams  (required)
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
    public okhttp3.Call updateSnmpTransportCall(SnmpTransportUpdationParams snmpTransportUpdationParams, String contentLanguage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = snmpTransportUpdationParams;

        // create path and map variables
        String localVarPath = "/update-snmp-transport";

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
    private okhttp3.Call updateSnmpTransportValidateBeforeCall(SnmpTransportUpdationParams snmpTransportUpdationParams, String contentLanguage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'snmpTransportUpdationParams' is set
        if (snmpTransportUpdationParams == null) {
            throw new ApiException("Missing the required parameter 'snmpTransportUpdationParams' when calling updateSnmpTransport(Async)");
        }
        

        okhttp3.Call localVarCall = updateSnmpTransportCall(snmpTransportUpdationParams, contentLanguage, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param snmpTransportUpdationParams  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return List&lt;WithTaskSnmpTransport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskSnmpTransport> updateSnmpTransport(SnmpTransportUpdationParams snmpTransportUpdationParams, String contentLanguage) throws ApiException {
        ApiResponse<List<WithTaskSnmpTransport>> localVarResp = updateSnmpTransportWithHttpInfo(snmpTransportUpdationParams, contentLanguage);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param snmpTransportUpdationParams  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return ApiResponse&lt;List&lt;WithTaskSnmpTransport&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskSnmpTransport>> updateSnmpTransportWithHttpInfo(SnmpTransportUpdationParams snmpTransportUpdationParams, String contentLanguage) throws ApiException {
        okhttp3.Call localVarCall = updateSnmpTransportValidateBeforeCall(snmpTransportUpdationParams, contentLanguage, null);
        Type localVarReturnType = new TypeToken<List<WithTaskSnmpTransport>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param snmpTransportUpdationParams  (required)
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
    public okhttp3.Call updateSnmpTransportAsync(SnmpTransportUpdationParams snmpTransportUpdationParams, String contentLanguage, final ApiCallback<List<WithTaskSnmpTransport>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateSnmpTransportValidateBeforeCall(snmpTransportUpdationParams, contentLanguage, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskSnmpTransport>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
