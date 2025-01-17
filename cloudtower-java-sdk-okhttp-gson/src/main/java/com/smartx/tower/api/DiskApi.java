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


import com.smartx.tower.model.Disk;
import com.smartx.tower.model.DiskConnection;
import com.smartx.tower.model.DiskMountParams;
import com.smartx.tower.model.DiskUnmountParams;
import com.smartx.tower.model.GetDisksConnectionRequestBody;
import com.smartx.tower.model.GetDisksRequestBody;
import com.smartx.tower.model.WithTaskDisk;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiskApi {
    private ApiClient localVarApiClient;

    public DiskApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DiskApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getDisks
     * @param getDisksRequestBody  (required)
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
    public okhttp3.Call getDisksCall(GetDisksRequestBody getDisksRequestBody, String contentLanguage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getDisksRequestBody;

        // create path and map variables
        String localVarPath = "/get-disks";

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
    private okhttp3.Call getDisksValidateBeforeCall(GetDisksRequestBody getDisksRequestBody, String contentLanguage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getDisksRequestBody' is set
        if (getDisksRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getDisksRequestBody' when calling getDisks(Async)");
        }
        

        okhttp3.Call localVarCall = getDisksCall(getDisksRequestBody, contentLanguage, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getDisksRequestBody  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return List&lt;Disk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<Disk> getDisks(GetDisksRequestBody getDisksRequestBody, String contentLanguage) throws ApiException {
        ApiResponse<List<Disk>> localVarResp = getDisksWithHttpInfo(getDisksRequestBody, contentLanguage);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getDisksRequestBody  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return ApiResponse&lt;List&lt;Disk&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Disk>> getDisksWithHttpInfo(GetDisksRequestBody getDisksRequestBody, String contentLanguage) throws ApiException {
        okhttp3.Call localVarCall = getDisksValidateBeforeCall(getDisksRequestBody, contentLanguage, null);
        Type localVarReturnType = new TypeToken<List<Disk>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getDisksRequestBody  (required)
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
    public okhttp3.Call getDisksAsync(GetDisksRequestBody getDisksRequestBody, String contentLanguage, final ApiCallback<List<Disk>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDisksValidateBeforeCall(getDisksRequestBody, contentLanguage, _callback);
        Type localVarReturnType = new TypeToken<List<Disk>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDisksConnection
     * @param getDisksConnectionRequestBody  (required)
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
    public okhttp3.Call getDisksConnectionCall(GetDisksConnectionRequestBody getDisksConnectionRequestBody, String contentLanguage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getDisksConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-disks-connection";

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
    private okhttp3.Call getDisksConnectionValidateBeforeCall(GetDisksConnectionRequestBody getDisksConnectionRequestBody, String contentLanguage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getDisksConnectionRequestBody' is set
        if (getDisksConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getDisksConnectionRequestBody' when calling getDisksConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getDisksConnectionCall(getDisksConnectionRequestBody, contentLanguage, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getDisksConnectionRequestBody  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return DiskConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public DiskConnection getDisksConnection(GetDisksConnectionRequestBody getDisksConnectionRequestBody, String contentLanguage) throws ApiException {
        ApiResponse<DiskConnection> localVarResp = getDisksConnectionWithHttpInfo(getDisksConnectionRequestBody, contentLanguage);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getDisksConnectionRequestBody  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return ApiResponse&lt;DiskConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DiskConnection> getDisksConnectionWithHttpInfo(GetDisksConnectionRequestBody getDisksConnectionRequestBody, String contentLanguage) throws ApiException {
        okhttp3.Call localVarCall = getDisksConnectionValidateBeforeCall(getDisksConnectionRequestBody, contentLanguage, null);
        Type localVarReturnType = new TypeToken<DiskConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getDisksConnectionRequestBody  (required)
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
    public okhttp3.Call getDisksConnectionAsync(GetDisksConnectionRequestBody getDisksConnectionRequestBody, String contentLanguage, final ApiCallback<DiskConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDisksConnectionValidateBeforeCall(getDisksConnectionRequestBody, contentLanguage, _callback);
        Type localVarReturnType = new TypeToken<DiskConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for mountDisk
     * @param diskMountParams  (required)
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
    public okhttp3.Call mountDiskCall(DiskMountParams diskMountParams, String contentLanguage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = diskMountParams;

        // create path and map variables
        String localVarPath = "/mount-disk";

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
    private okhttp3.Call mountDiskValidateBeforeCall(DiskMountParams diskMountParams, String contentLanguage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'diskMountParams' is set
        if (diskMountParams == null) {
            throw new ApiException("Missing the required parameter 'diskMountParams' when calling mountDisk(Async)");
        }
        

        okhttp3.Call localVarCall = mountDiskCall(diskMountParams, contentLanguage, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param diskMountParams  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return List&lt;WithTaskDisk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskDisk> mountDisk(DiskMountParams diskMountParams, String contentLanguage) throws ApiException {
        ApiResponse<List<WithTaskDisk>> localVarResp = mountDiskWithHttpInfo(diskMountParams, contentLanguage);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param diskMountParams  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return ApiResponse&lt;List&lt;WithTaskDisk&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskDisk>> mountDiskWithHttpInfo(DiskMountParams diskMountParams, String contentLanguage) throws ApiException {
        okhttp3.Call localVarCall = mountDiskValidateBeforeCall(diskMountParams, contentLanguage, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDisk>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param diskMountParams  (required)
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
    public okhttp3.Call mountDiskAsync(DiskMountParams diskMountParams, String contentLanguage, final ApiCallback<List<WithTaskDisk>> _callback) throws ApiException {

        okhttp3.Call localVarCall = mountDiskValidateBeforeCall(diskMountParams, contentLanguage, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDisk>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for unmountDisk
     * @param diskUnmountParams  (required)
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
    public okhttp3.Call unmountDiskCall(DiskUnmountParams diskUnmountParams, String contentLanguage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = diskUnmountParams;

        // create path and map variables
        String localVarPath = "/unmount-disk";

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
    private okhttp3.Call unmountDiskValidateBeforeCall(DiskUnmountParams diskUnmountParams, String contentLanguage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'diskUnmountParams' is set
        if (diskUnmountParams == null) {
            throw new ApiException("Missing the required parameter 'diskUnmountParams' when calling unmountDisk(Async)");
        }
        

        okhttp3.Call localVarCall = unmountDiskCall(diskUnmountParams, contentLanguage, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param diskUnmountParams  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return List&lt;WithTaskDisk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskDisk> unmountDisk(DiskUnmountParams diskUnmountParams, String contentLanguage) throws ApiException {
        ApiResponse<List<WithTaskDisk>> localVarResp = unmountDiskWithHttpInfo(diskUnmountParams, contentLanguage);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param diskUnmountParams  (required)
     * @param contentLanguage  (optional, default to en-US)
     * @return ApiResponse&lt;List&lt;WithTaskDisk&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskDisk>> unmountDiskWithHttpInfo(DiskUnmountParams diskUnmountParams, String contentLanguage) throws ApiException {
        okhttp3.Call localVarCall = unmountDiskValidateBeforeCall(diskUnmountParams, contentLanguage, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDisk>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param diskUnmountParams  (required)
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
    public okhttp3.Call unmountDiskAsync(DiskUnmountParams diskUnmountParams, String contentLanguage, final ApiCallback<List<WithTaskDisk>> _callback) throws ApiException {

        okhttp3.Call localVarCall = unmountDiskValidateBeforeCall(diskUnmountParams, contentLanguage, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDisk>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
