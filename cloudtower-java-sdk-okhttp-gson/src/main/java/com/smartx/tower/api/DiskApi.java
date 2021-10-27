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
     * @param contentLanguage  (required)
     * @param getDisksRequestBody  (required)
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
    public okhttp3.Call getDisksCall(String contentLanguage, GetDisksRequestBody getDisksRequestBody, final ApiCallback _callback) throws ApiException {
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
    private okhttp3.Call getDisksValidateBeforeCall(String contentLanguage, GetDisksRequestBody getDisksRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getDisks(Async)");
        }
        
        // verify the required parameter 'getDisksRequestBody' is set
        if (getDisksRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getDisksRequestBody' when calling getDisks(Async)");
        }
        

        okhttp3.Call localVarCall = getDisksCall(contentLanguage, getDisksRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getDisksRequestBody  (required)
     * @return List&lt;Disk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<Disk> getDisks(String contentLanguage, GetDisksRequestBody getDisksRequestBody) throws ApiException {
        ApiResponse<List<Disk>> localVarResp = getDisksWithHttpInfo(contentLanguage, getDisksRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getDisksRequestBody  (required)
     * @return ApiResponse&lt;List&lt;Disk&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Disk>> getDisksWithHttpInfo(String contentLanguage, GetDisksRequestBody getDisksRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getDisksValidateBeforeCall(contentLanguage, getDisksRequestBody, null);
        Type localVarReturnType = new TypeToken<List<Disk>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getDisksRequestBody  (required)
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
    public okhttp3.Call getDisksAsync(String contentLanguage, GetDisksRequestBody getDisksRequestBody, final ApiCallback<List<Disk>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDisksValidateBeforeCall(contentLanguage, getDisksRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<Disk>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDisksConnection
     * @param contentLanguage  (required)
     * @param getDisksConnectionRequestBody  (required)
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
    public okhttp3.Call getDisksConnectionCall(String contentLanguage, GetDisksConnectionRequestBody getDisksConnectionRequestBody, final ApiCallback _callback) throws ApiException {
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
    private okhttp3.Call getDisksConnectionValidateBeforeCall(String contentLanguage, GetDisksConnectionRequestBody getDisksConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getDisksConnection(Async)");
        }
        
        // verify the required parameter 'getDisksConnectionRequestBody' is set
        if (getDisksConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getDisksConnectionRequestBody' when calling getDisksConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getDisksConnectionCall(contentLanguage, getDisksConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getDisksConnectionRequestBody  (required)
     * @return DiskConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public DiskConnection getDisksConnection(String contentLanguage, GetDisksConnectionRequestBody getDisksConnectionRequestBody) throws ApiException {
        ApiResponse<DiskConnection> localVarResp = getDisksConnectionWithHttpInfo(contentLanguage, getDisksConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getDisksConnectionRequestBody  (required)
     * @return ApiResponse&lt;DiskConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DiskConnection> getDisksConnectionWithHttpInfo(String contentLanguage, GetDisksConnectionRequestBody getDisksConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getDisksConnectionValidateBeforeCall(contentLanguage, getDisksConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<DiskConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getDisksConnectionRequestBody  (required)
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
    public okhttp3.Call getDisksConnectionAsync(String contentLanguage, GetDisksConnectionRequestBody getDisksConnectionRequestBody, final ApiCallback<DiskConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDisksConnectionValidateBeforeCall(contentLanguage, getDisksConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<DiskConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for mountDisk
     * @param contentLanguage  (required)
     * @param diskMountParams  (required)
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
    public okhttp3.Call mountDiskCall(String contentLanguage, DiskMountParams diskMountParams, final ApiCallback _callback) throws ApiException {
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
    private okhttp3.Call mountDiskValidateBeforeCall(String contentLanguage, DiskMountParams diskMountParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling mountDisk(Async)");
        }
        
        // verify the required parameter 'diskMountParams' is set
        if (diskMountParams == null) {
            throw new ApiException("Missing the required parameter 'diskMountParams' when calling mountDisk(Async)");
        }
        

        okhttp3.Call localVarCall = mountDiskCall(contentLanguage, diskMountParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param diskMountParams  (required)
     * @return List&lt;WithTaskDisk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskDisk> mountDisk(String contentLanguage, DiskMountParams diskMountParams) throws ApiException {
        ApiResponse<List<WithTaskDisk>> localVarResp = mountDiskWithHttpInfo(contentLanguage, diskMountParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param diskMountParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskDisk&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskDisk>> mountDiskWithHttpInfo(String contentLanguage, DiskMountParams diskMountParams) throws ApiException {
        okhttp3.Call localVarCall = mountDiskValidateBeforeCall(contentLanguage, diskMountParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDisk>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param diskMountParams  (required)
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
    public okhttp3.Call mountDiskAsync(String contentLanguage, DiskMountParams diskMountParams, final ApiCallback<List<WithTaskDisk>> _callback) throws ApiException {

        okhttp3.Call localVarCall = mountDiskValidateBeforeCall(contentLanguage, diskMountParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDisk>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for unmountDisk
     * @param contentLanguage  (required)
     * @param diskUnmountParams  (required)
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
    public okhttp3.Call unmountDiskCall(String contentLanguage, DiskUnmountParams diskUnmountParams, final ApiCallback _callback) throws ApiException {
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
    private okhttp3.Call unmountDiskValidateBeforeCall(String contentLanguage, DiskUnmountParams diskUnmountParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling unmountDisk(Async)");
        }
        
        // verify the required parameter 'diskUnmountParams' is set
        if (diskUnmountParams == null) {
            throw new ApiException("Missing the required parameter 'diskUnmountParams' when calling unmountDisk(Async)");
        }
        

        okhttp3.Call localVarCall = unmountDiskCall(contentLanguage, diskUnmountParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param diskUnmountParams  (required)
     * @return List&lt;WithTaskDisk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskDisk> unmountDisk(String contentLanguage, DiskUnmountParams diskUnmountParams) throws ApiException {
        ApiResponse<List<WithTaskDisk>> localVarResp = unmountDiskWithHttpInfo(contentLanguage, diskUnmountParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param diskUnmountParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskDisk&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskDisk>> unmountDiskWithHttpInfo(String contentLanguage, DiskUnmountParams diskUnmountParams) throws ApiException {
        okhttp3.Call localVarCall = unmountDiskValidateBeforeCall(contentLanguage, diskUnmountParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDisk>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param diskUnmountParams  (required)
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
    public okhttp3.Call unmountDiskAsync(String contentLanguage, DiskUnmountParams diskUnmountParams, final ApiCallback<List<WithTaskDisk>> _callback) throws ApiException {

        okhttp3.Call localVarCall = unmountDiskValidateBeforeCall(contentLanguage, diskUnmountParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDisk>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
