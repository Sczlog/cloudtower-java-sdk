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


import com.smartx.tower.model.GetRackTopoesConnectionRequestBody;
import com.smartx.tower.model.GetRackTopoesRequestBody;
import com.smartx.tower.model.RackTopo;
import com.smartx.tower.model.RackTopoConnection;
import com.smartx.tower.model.RackTopoCreationParams;
import com.smartx.tower.model.RackTopoDeletionParams;
import com.smartx.tower.model.RackTopoUpdationParams;
import com.smartx.tower.model.WithTaskDeleteRackTopo;
import com.smartx.tower.model.WithTaskRackTopo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RackTopoApi {
    private ApiClient localVarApiClient;

    public RackTopoApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RackTopoApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createRackTopo
     * @param contentLanguage  (required)
     * @param rackTopoCreationParams  (required)
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
    public okhttp3.Call createRackTopoCall(String contentLanguage, List<RackTopoCreationParams> rackTopoCreationParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = rackTopoCreationParams;

        // create path and map variables
        String localVarPath = "/create-rack-topo";

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
    private okhttp3.Call createRackTopoValidateBeforeCall(String contentLanguage, List<RackTopoCreationParams> rackTopoCreationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling createRackTopo(Async)");
        }
        
        // verify the required parameter 'rackTopoCreationParams' is set
        if (rackTopoCreationParams == null) {
            throw new ApiException("Missing the required parameter 'rackTopoCreationParams' when calling createRackTopo(Async)");
        }
        

        okhttp3.Call localVarCall = createRackTopoCall(contentLanguage, rackTopoCreationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param rackTopoCreationParams  (required)
     * @return List&lt;WithTaskRackTopo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskRackTopo> createRackTopo(String contentLanguage, List<RackTopoCreationParams> rackTopoCreationParams) throws ApiException {
        ApiResponse<List<WithTaskRackTopo>> localVarResp = createRackTopoWithHttpInfo(contentLanguage, rackTopoCreationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param rackTopoCreationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskRackTopo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskRackTopo>> createRackTopoWithHttpInfo(String contentLanguage, List<RackTopoCreationParams> rackTopoCreationParams) throws ApiException {
        okhttp3.Call localVarCall = createRackTopoValidateBeforeCall(contentLanguage, rackTopoCreationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskRackTopo>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param rackTopoCreationParams  (required)
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
    public okhttp3.Call createRackTopoAsync(String contentLanguage, List<RackTopoCreationParams> rackTopoCreationParams, final ApiCallback<List<WithTaskRackTopo>> _callback) throws ApiException {

        okhttp3.Call localVarCall = createRackTopoValidateBeforeCall(contentLanguage, rackTopoCreationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskRackTopo>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteRackTopo
     * @param contentLanguage  (required)
     * @param rackTopoDeletionParams  (required)
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
    public okhttp3.Call deleteRackTopoCall(String contentLanguage, RackTopoDeletionParams rackTopoDeletionParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = rackTopoDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-rack-topo";

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
    private okhttp3.Call deleteRackTopoValidateBeforeCall(String contentLanguage, RackTopoDeletionParams rackTopoDeletionParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling deleteRackTopo(Async)");
        }
        
        // verify the required parameter 'rackTopoDeletionParams' is set
        if (rackTopoDeletionParams == null) {
            throw new ApiException("Missing the required parameter 'rackTopoDeletionParams' when calling deleteRackTopo(Async)");
        }
        

        okhttp3.Call localVarCall = deleteRackTopoCall(contentLanguage, rackTopoDeletionParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param rackTopoDeletionParams  (required)
     * @return List&lt;WithTaskDeleteRackTopo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskDeleteRackTopo> deleteRackTopo(String contentLanguage, RackTopoDeletionParams rackTopoDeletionParams) throws ApiException {
        ApiResponse<List<WithTaskDeleteRackTopo>> localVarResp = deleteRackTopoWithHttpInfo(contentLanguage, rackTopoDeletionParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param rackTopoDeletionParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteRackTopo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskDeleteRackTopo>> deleteRackTopoWithHttpInfo(String contentLanguage, RackTopoDeletionParams rackTopoDeletionParams) throws ApiException {
        okhttp3.Call localVarCall = deleteRackTopoValidateBeforeCall(contentLanguage, rackTopoDeletionParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteRackTopo>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param rackTopoDeletionParams  (required)
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
    public okhttp3.Call deleteRackTopoAsync(String contentLanguage, RackTopoDeletionParams rackTopoDeletionParams, final ApiCallback<List<WithTaskDeleteRackTopo>> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteRackTopoValidateBeforeCall(contentLanguage, rackTopoDeletionParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteRackTopo>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRackTopoes
     * @param contentLanguage  (required)
     * @param getRackTopoesRequestBody  (required)
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
    public okhttp3.Call getRackTopoesCall(String contentLanguage, GetRackTopoesRequestBody getRackTopoesRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getRackTopoesRequestBody;

        // create path and map variables
        String localVarPath = "/get-rack-topoes";

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
    private okhttp3.Call getRackTopoesValidateBeforeCall(String contentLanguage, GetRackTopoesRequestBody getRackTopoesRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getRackTopoes(Async)");
        }
        
        // verify the required parameter 'getRackTopoesRequestBody' is set
        if (getRackTopoesRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getRackTopoesRequestBody' when calling getRackTopoes(Async)");
        }
        

        okhttp3.Call localVarCall = getRackTopoesCall(contentLanguage, getRackTopoesRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getRackTopoesRequestBody  (required)
     * @return List&lt;RackTopo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<RackTopo> getRackTopoes(String contentLanguage, GetRackTopoesRequestBody getRackTopoesRequestBody) throws ApiException {
        ApiResponse<List<RackTopo>> localVarResp = getRackTopoesWithHttpInfo(contentLanguage, getRackTopoesRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getRackTopoesRequestBody  (required)
     * @return ApiResponse&lt;List&lt;RackTopo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<RackTopo>> getRackTopoesWithHttpInfo(String contentLanguage, GetRackTopoesRequestBody getRackTopoesRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getRackTopoesValidateBeforeCall(contentLanguage, getRackTopoesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<RackTopo>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getRackTopoesRequestBody  (required)
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
    public okhttp3.Call getRackTopoesAsync(String contentLanguage, GetRackTopoesRequestBody getRackTopoesRequestBody, final ApiCallback<List<RackTopo>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRackTopoesValidateBeforeCall(contentLanguage, getRackTopoesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<RackTopo>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRackTopoesConnection
     * @param contentLanguage  (required)
     * @param getRackTopoesConnectionRequestBody  (required)
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
    public okhttp3.Call getRackTopoesConnectionCall(String contentLanguage, GetRackTopoesConnectionRequestBody getRackTopoesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getRackTopoesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-rack-topoes-connection";

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
    private okhttp3.Call getRackTopoesConnectionValidateBeforeCall(String contentLanguage, GetRackTopoesConnectionRequestBody getRackTopoesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getRackTopoesConnection(Async)");
        }
        
        // verify the required parameter 'getRackTopoesConnectionRequestBody' is set
        if (getRackTopoesConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getRackTopoesConnectionRequestBody' when calling getRackTopoesConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getRackTopoesConnectionCall(contentLanguage, getRackTopoesConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getRackTopoesConnectionRequestBody  (required)
     * @return RackTopoConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public RackTopoConnection getRackTopoesConnection(String contentLanguage, GetRackTopoesConnectionRequestBody getRackTopoesConnectionRequestBody) throws ApiException {
        ApiResponse<RackTopoConnection> localVarResp = getRackTopoesConnectionWithHttpInfo(contentLanguage, getRackTopoesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getRackTopoesConnectionRequestBody  (required)
     * @return ApiResponse&lt;RackTopoConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RackTopoConnection> getRackTopoesConnectionWithHttpInfo(String contentLanguage, GetRackTopoesConnectionRequestBody getRackTopoesConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getRackTopoesConnectionValidateBeforeCall(contentLanguage, getRackTopoesConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<RackTopoConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getRackTopoesConnectionRequestBody  (required)
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
    public okhttp3.Call getRackTopoesConnectionAsync(String contentLanguage, GetRackTopoesConnectionRequestBody getRackTopoesConnectionRequestBody, final ApiCallback<RackTopoConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRackTopoesConnectionValidateBeforeCall(contentLanguage, getRackTopoesConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<RackTopoConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateRackTopo
     * @param contentLanguage  (required)
     * @param rackTopoUpdationParams  (required)
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
    public okhttp3.Call updateRackTopoCall(String contentLanguage, RackTopoUpdationParams rackTopoUpdationParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = rackTopoUpdationParams;

        // create path and map variables
        String localVarPath = "/update-rack-topo";

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
    private okhttp3.Call updateRackTopoValidateBeforeCall(String contentLanguage, RackTopoUpdationParams rackTopoUpdationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling updateRackTopo(Async)");
        }
        
        // verify the required parameter 'rackTopoUpdationParams' is set
        if (rackTopoUpdationParams == null) {
            throw new ApiException("Missing the required parameter 'rackTopoUpdationParams' when calling updateRackTopo(Async)");
        }
        

        okhttp3.Call localVarCall = updateRackTopoCall(contentLanguage, rackTopoUpdationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param rackTopoUpdationParams  (required)
     * @return List&lt;WithTaskRackTopo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskRackTopo> updateRackTopo(String contentLanguage, RackTopoUpdationParams rackTopoUpdationParams) throws ApiException {
        ApiResponse<List<WithTaskRackTopo>> localVarResp = updateRackTopoWithHttpInfo(contentLanguage, rackTopoUpdationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param rackTopoUpdationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskRackTopo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskRackTopo>> updateRackTopoWithHttpInfo(String contentLanguage, RackTopoUpdationParams rackTopoUpdationParams) throws ApiException {
        okhttp3.Call localVarCall = updateRackTopoValidateBeforeCall(contentLanguage, rackTopoUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskRackTopo>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param rackTopoUpdationParams  (required)
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
    public okhttp3.Call updateRackTopoAsync(String contentLanguage, RackTopoUpdationParams rackTopoUpdationParams, final ApiCallback<List<WithTaskRackTopo>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateRackTopoValidateBeforeCall(contentLanguage, rackTopoUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskRackTopo>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
