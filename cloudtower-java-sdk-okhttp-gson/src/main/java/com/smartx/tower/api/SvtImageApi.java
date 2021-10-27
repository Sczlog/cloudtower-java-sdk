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


import com.smartx.tower.model.GetSvtImagesConnectionRequestBody;
import com.smartx.tower.model.GetSvtImagesRequestBody;
import com.smartx.tower.model.SvtImage;
import com.smartx.tower.model.SvtImageConnection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SvtImageApi {
    private ApiClient localVarApiClient;

    public SvtImageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SvtImageApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getSvtImages
     * @param contentLanguage  (required)
     * @param getSvtImagesRequestBody  (required)
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
    public okhttp3.Call getSvtImagesCall(String contentLanguage, GetSvtImagesRequestBody getSvtImagesRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getSvtImagesRequestBody;

        // create path and map variables
        String localVarPath = "/get-svt-images";

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
    private okhttp3.Call getSvtImagesValidateBeforeCall(String contentLanguage, GetSvtImagesRequestBody getSvtImagesRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getSvtImages(Async)");
        }
        
        // verify the required parameter 'getSvtImagesRequestBody' is set
        if (getSvtImagesRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getSvtImagesRequestBody' when calling getSvtImages(Async)");
        }
        

        okhttp3.Call localVarCall = getSvtImagesCall(contentLanguage, getSvtImagesRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getSvtImagesRequestBody  (required)
     * @return List&lt;SvtImage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<SvtImage> getSvtImages(String contentLanguage, GetSvtImagesRequestBody getSvtImagesRequestBody) throws ApiException {
        ApiResponse<List<SvtImage>> localVarResp = getSvtImagesWithHttpInfo(contentLanguage, getSvtImagesRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getSvtImagesRequestBody  (required)
     * @return ApiResponse&lt;List&lt;SvtImage&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<SvtImage>> getSvtImagesWithHttpInfo(String contentLanguage, GetSvtImagesRequestBody getSvtImagesRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getSvtImagesValidateBeforeCall(contentLanguage, getSvtImagesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<SvtImage>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getSvtImagesRequestBody  (required)
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
    public okhttp3.Call getSvtImagesAsync(String contentLanguage, GetSvtImagesRequestBody getSvtImagesRequestBody, final ApiCallback<List<SvtImage>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSvtImagesValidateBeforeCall(contentLanguage, getSvtImagesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<SvtImage>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSvtImagesConnection
     * @param contentLanguage  (required)
     * @param getSvtImagesConnectionRequestBody  (required)
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
    public okhttp3.Call getSvtImagesConnectionCall(String contentLanguage, GetSvtImagesConnectionRequestBody getSvtImagesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getSvtImagesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-svt-images-connection";

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
    private okhttp3.Call getSvtImagesConnectionValidateBeforeCall(String contentLanguage, GetSvtImagesConnectionRequestBody getSvtImagesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getSvtImagesConnection(Async)");
        }
        
        // verify the required parameter 'getSvtImagesConnectionRequestBody' is set
        if (getSvtImagesConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getSvtImagesConnectionRequestBody' when calling getSvtImagesConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getSvtImagesConnectionCall(contentLanguage, getSvtImagesConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getSvtImagesConnectionRequestBody  (required)
     * @return SvtImageConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public SvtImageConnection getSvtImagesConnection(String contentLanguage, GetSvtImagesConnectionRequestBody getSvtImagesConnectionRequestBody) throws ApiException {
        ApiResponse<SvtImageConnection> localVarResp = getSvtImagesConnectionWithHttpInfo(contentLanguage, getSvtImagesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getSvtImagesConnectionRequestBody  (required)
     * @return ApiResponse&lt;SvtImageConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SvtImageConnection> getSvtImagesConnectionWithHttpInfo(String contentLanguage, GetSvtImagesConnectionRequestBody getSvtImagesConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getSvtImagesConnectionValidateBeforeCall(contentLanguage, getSvtImagesConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<SvtImageConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getSvtImagesConnectionRequestBody  (required)
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
    public okhttp3.Call getSvtImagesConnectionAsync(String contentLanguage, GetSvtImagesConnectionRequestBody getSvtImagesConnectionRequestBody, final ApiCallback<SvtImageConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSvtImagesConnectionValidateBeforeCall(contentLanguage, getSvtImagesConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<SvtImageConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
