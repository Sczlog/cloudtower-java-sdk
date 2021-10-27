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


import com.smartx.tower.model.ElfImage;
import com.smartx.tower.model.ElfImageConnection;
import com.smartx.tower.model.ElfImageDeletionParams;
import com.smartx.tower.model.ElfImageUpdationParams;
import java.io.File;
import com.smartx.tower.model.GetElfImagesConnectionRequestBody;
import com.smartx.tower.model.GetElfImagesRequestBody;
import com.smartx.tower.model.UploadTask;
import com.smartx.tower.model.WithTaskDeleteElfImage;
import com.smartx.tower.model.WithTaskElfImage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElfImageApi {
    private ApiClient localVarApiClient;

    public ElfImageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ElfImageApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createElfImage
     * @param contentLanguage  (required)
     * @param file  (required)
     * @param clusterId  (required)
     * @param name  (required)
     * @param size  (required)
     * @param description  (required)
     * @param uploadTaskId  (required)
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
    public okhttp3.Call createElfImageCall(String contentLanguage, File file, String clusterId, String name, String size, String description, String uploadTaskId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/upload-elf-image";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (file != null) {
            localVarFormParams.put("file", file);
        }

        if (clusterId != null) {
            localVarFormParams.put("cluster_id", clusterId);
        }

        if (name != null) {
            localVarFormParams.put("name", name);
        }

        if (size != null) {
            localVarFormParams.put("size", size);
        }

        if (description != null) {
            localVarFormParams.put("description", description);
        }

        if (uploadTaskId != null) {
            localVarFormParams.put("upload_task_id", uploadTaskId);
        }

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
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createElfImageValidateBeforeCall(String contentLanguage, File file, String clusterId, String name, String size, String description, String uploadTaskId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling createElfImage(Async)");
        }
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling createElfImage(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling createElfImage(Async)");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling createElfImage(Async)");
        }
        
        // verify the required parameter 'size' is set
        if (size == null) {
            throw new ApiException("Missing the required parameter 'size' when calling createElfImage(Async)");
        }
        
        // verify the required parameter 'description' is set
        if (description == null) {
            throw new ApiException("Missing the required parameter 'description' when calling createElfImage(Async)");
        }
        
        // verify the required parameter 'uploadTaskId' is set
        if (uploadTaskId == null) {
            throw new ApiException("Missing the required parameter 'uploadTaskId' when calling createElfImage(Async)");
        }
        

        okhttp3.Call localVarCall = createElfImageCall(contentLanguage, file, clusterId, name, size, description, uploadTaskId, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param file  (required)
     * @param clusterId  (required)
     * @param name  (required)
     * @param size  (required)
     * @param description  (required)
     * @param uploadTaskId  (required)
     * @return List&lt;UploadTask&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<UploadTask> createElfImage(String contentLanguage, File file, String clusterId, String name, String size, String description, String uploadTaskId) throws ApiException {
        ApiResponse<List<UploadTask>> localVarResp = createElfImageWithHttpInfo(contentLanguage, file, clusterId, name, size, description, uploadTaskId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param file  (required)
     * @param clusterId  (required)
     * @param name  (required)
     * @param size  (required)
     * @param description  (required)
     * @param uploadTaskId  (required)
     * @return ApiResponse&lt;List&lt;UploadTask&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<UploadTask>> createElfImageWithHttpInfo(String contentLanguage, File file, String clusterId, String name, String size, String description, String uploadTaskId) throws ApiException {
        okhttp3.Call localVarCall = createElfImageValidateBeforeCall(contentLanguage, file, clusterId, name, size, description, uploadTaskId, null);
        Type localVarReturnType = new TypeToken<List<UploadTask>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param file  (required)
     * @param clusterId  (required)
     * @param name  (required)
     * @param size  (required)
     * @param description  (required)
     * @param uploadTaskId  (required)
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
    public okhttp3.Call createElfImageAsync(String contentLanguage, File file, String clusterId, String name, String size, String description, String uploadTaskId, final ApiCallback<List<UploadTask>> _callback) throws ApiException {

        okhttp3.Call localVarCall = createElfImageValidateBeforeCall(contentLanguage, file, clusterId, name, size, description, uploadTaskId, _callback);
        Type localVarReturnType = new TypeToken<List<UploadTask>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteElfImage
     * @param contentLanguage  (required)
     * @param elfImageDeletionParams  (required)
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
    public okhttp3.Call deleteElfImageCall(String contentLanguage, ElfImageDeletionParams elfImageDeletionParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = elfImageDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-elf-image";

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
    private okhttp3.Call deleteElfImageValidateBeforeCall(String contentLanguage, ElfImageDeletionParams elfImageDeletionParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling deleteElfImage(Async)");
        }
        
        // verify the required parameter 'elfImageDeletionParams' is set
        if (elfImageDeletionParams == null) {
            throw new ApiException("Missing the required parameter 'elfImageDeletionParams' when calling deleteElfImage(Async)");
        }
        

        okhttp3.Call localVarCall = deleteElfImageCall(contentLanguage, elfImageDeletionParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param elfImageDeletionParams  (required)
     * @return List&lt;WithTaskDeleteElfImage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskDeleteElfImage> deleteElfImage(String contentLanguage, ElfImageDeletionParams elfImageDeletionParams) throws ApiException {
        ApiResponse<List<WithTaskDeleteElfImage>> localVarResp = deleteElfImageWithHttpInfo(contentLanguage, elfImageDeletionParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param elfImageDeletionParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteElfImage&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskDeleteElfImage>> deleteElfImageWithHttpInfo(String contentLanguage, ElfImageDeletionParams elfImageDeletionParams) throws ApiException {
        okhttp3.Call localVarCall = deleteElfImageValidateBeforeCall(contentLanguage, elfImageDeletionParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteElfImage>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param elfImageDeletionParams  (required)
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
    public okhttp3.Call deleteElfImageAsync(String contentLanguage, ElfImageDeletionParams elfImageDeletionParams, final ApiCallback<List<WithTaskDeleteElfImage>> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteElfImageValidateBeforeCall(contentLanguage, elfImageDeletionParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteElfImage>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getElfImages
     * @param contentLanguage  (required)
     * @param getElfImagesRequestBody  (required)
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
    public okhttp3.Call getElfImagesCall(String contentLanguage, GetElfImagesRequestBody getElfImagesRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getElfImagesRequestBody;

        // create path and map variables
        String localVarPath = "/get-elf-images";

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
    private okhttp3.Call getElfImagesValidateBeforeCall(String contentLanguage, GetElfImagesRequestBody getElfImagesRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getElfImages(Async)");
        }
        
        // verify the required parameter 'getElfImagesRequestBody' is set
        if (getElfImagesRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getElfImagesRequestBody' when calling getElfImages(Async)");
        }
        

        okhttp3.Call localVarCall = getElfImagesCall(contentLanguage, getElfImagesRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getElfImagesRequestBody  (required)
     * @return List&lt;ElfImage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<ElfImage> getElfImages(String contentLanguage, GetElfImagesRequestBody getElfImagesRequestBody) throws ApiException {
        ApiResponse<List<ElfImage>> localVarResp = getElfImagesWithHttpInfo(contentLanguage, getElfImagesRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getElfImagesRequestBody  (required)
     * @return ApiResponse&lt;List&lt;ElfImage&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ElfImage>> getElfImagesWithHttpInfo(String contentLanguage, GetElfImagesRequestBody getElfImagesRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getElfImagesValidateBeforeCall(contentLanguage, getElfImagesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<ElfImage>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getElfImagesRequestBody  (required)
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
    public okhttp3.Call getElfImagesAsync(String contentLanguage, GetElfImagesRequestBody getElfImagesRequestBody, final ApiCallback<List<ElfImage>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getElfImagesValidateBeforeCall(contentLanguage, getElfImagesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<ElfImage>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getElfImagesConnection
     * @param contentLanguage  (required)
     * @param getElfImagesConnectionRequestBody  (required)
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
    public okhttp3.Call getElfImagesConnectionCall(String contentLanguage, GetElfImagesConnectionRequestBody getElfImagesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getElfImagesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-elf-images-connection";

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
    private okhttp3.Call getElfImagesConnectionValidateBeforeCall(String contentLanguage, GetElfImagesConnectionRequestBody getElfImagesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getElfImagesConnection(Async)");
        }
        
        // verify the required parameter 'getElfImagesConnectionRequestBody' is set
        if (getElfImagesConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getElfImagesConnectionRequestBody' when calling getElfImagesConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getElfImagesConnectionCall(contentLanguage, getElfImagesConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getElfImagesConnectionRequestBody  (required)
     * @return ElfImageConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ElfImageConnection getElfImagesConnection(String contentLanguage, GetElfImagesConnectionRequestBody getElfImagesConnectionRequestBody) throws ApiException {
        ApiResponse<ElfImageConnection> localVarResp = getElfImagesConnectionWithHttpInfo(contentLanguage, getElfImagesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getElfImagesConnectionRequestBody  (required)
     * @return ApiResponse&lt;ElfImageConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ElfImageConnection> getElfImagesConnectionWithHttpInfo(String contentLanguage, GetElfImagesConnectionRequestBody getElfImagesConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getElfImagesConnectionValidateBeforeCall(contentLanguage, getElfImagesConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<ElfImageConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getElfImagesConnectionRequestBody  (required)
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
    public okhttp3.Call getElfImagesConnectionAsync(String contentLanguage, GetElfImagesConnectionRequestBody getElfImagesConnectionRequestBody, final ApiCallback<ElfImageConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getElfImagesConnectionValidateBeforeCall(contentLanguage, getElfImagesConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<ElfImageConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateElfImage
     * @param contentLanguage  (required)
     * @param elfImageUpdationParams  (required)
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
    public okhttp3.Call updateElfImageCall(String contentLanguage, ElfImageUpdationParams elfImageUpdationParams, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = elfImageUpdationParams;

        // create path and map variables
        String localVarPath = "/update-elf-image";

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
    private okhttp3.Call updateElfImageValidateBeforeCall(String contentLanguage, ElfImageUpdationParams elfImageUpdationParams, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling updateElfImage(Async)");
        }
        
        // verify the required parameter 'elfImageUpdationParams' is set
        if (elfImageUpdationParams == null) {
            throw new ApiException("Missing the required parameter 'elfImageUpdationParams' when calling updateElfImage(Async)");
        }
        

        okhttp3.Call localVarCall = updateElfImageCall(contentLanguage, elfImageUpdationParams, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param elfImageUpdationParams  (required)
     * @return List&lt;WithTaskElfImage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WithTaskElfImage> updateElfImage(String contentLanguage, ElfImageUpdationParams elfImageUpdationParams) throws ApiException {
        ApiResponse<List<WithTaskElfImage>> localVarResp = updateElfImageWithHttpInfo(contentLanguage, elfImageUpdationParams);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param elfImageUpdationParams  (required)
     * @return ApiResponse&lt;List&lt;WithTaskElfImage&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WithTaskElfImage>> updateElfImageWithHttpInfo(String contentLanguage, ElfImageUpdationParams elfImageUpdationParams) throws ApiException {
        okhttp3.Call localVarCall = updateElfImageValidateBeforeCall(contentLanguage, elfImageUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskElfImage>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param elfImageUpdationParams  (required)
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
    public okhttp3.Call updateElfImageAsync(String contentLanguage, ElfImageUpdationParams elfImageUpdationParams, final ApiCallback<List<WithTaskElfImage>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateElfImageValidateBeforeCall(contentLanguage, elfImageUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskElfImage>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
