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


import com.smartx.tower.model.GetSecurityPoliciesConnectionRequestBody;
import com.smartx.tower.model.GetSecurityPoliciesRequestBody;
import com.smartx.tower.model.SecurityPolicy;
import com.smartx.tower.model.SecurityPolicyConnection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecurityPolicyApi {
    private ApiClient localVarApiClient;

    public SecurityPolicyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SecurityPolicyApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getSecurityPolicies
     * @param contentLanguage  (required)
     * @param getSecurityPoliciesRequestBody  (required)
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
    public okhttp3.Call getSecurityPoliciesCall(String contentLanguage, GetSecurityPoliciesRequestBody getSecurityPoliciesRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getSecurityPoliciesRequestBody;

        // create path and map variables
        String localVarPath = "/get-security-policies";

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
    private okhttp3.Call getSecurityPoliciesValidateBeforeCall(String contentLanguage, GetSecurityPoliciesRequestBody getSecurityPoliciesRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getSecurityPolicies(Async)");
        }
        
        // verify the required parameter 'getSecurityPoliciesRequestBody' is set
        if (getSecurityPoliciesRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getSecurityPoliciesRequestBody' when calling getSecurityPolicies(Async)");
        }
        

        okhttp3.Call localVarCall = getSecurityPoliciesCall(contentLanguage, getSecurityPoliciesRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getSecurityPoliciesRequestBody  (required)
     * @return List&lt;SecurityPolicy&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<SecurityPolicy> getSecurityPolicies(String contentLanguage, GetSecurityPoliciesRequestBody getSecurityPoliciesRequestBody) throws ApiException {
        ApiResponse<List<SecurityPolicy>> localVarResp = getSecurityPoliciesWithHttpInfo(contentLanguage, getSecurityPoliciesRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getSecurityPoliciesRequestBody  (required)
     * @return ApiResponse&lt;List&lt;SecurityPolicy&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<SecurityPolicy>> getSecurityPoliciesWithHttpInfo(String contentLanguage, GetSecurityPoliciesRequestBody getSecurityPoliciesRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getSecurityPoliciesValidateBeforeCall(contentLanguage, getSecurityPoliciesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<SecurityPolicy>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getSecurityPoliciesRequestBody  (required)
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
    public okhttp3.Call getSecurityPoliciesAsync(String contentLanguage, GetSecurityPoliciesRequestBody getSecurityPoliciesRequestBody, final ApiCallback<List<SecurityPolicy>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSecurityPoliciesValidateBeforeCall(contentLanguage, getSecurityPoliciesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<SecurityPolicy>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSecurityPoliciesConnection
     * @param contentLanguage  (required)
     * @param getSecurityPoliciesConnectionRequestBody  (required)
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
    public okhttp3.Call getSecurityPoliciesConnectionCall(String contentLanguage, GetSecurityPoliciesConnectionRequestBody getSecurityPoliciesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = getSecurityPoliciesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-security-policies-connection";

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
    private okhttp3.Call getSecurityPoliciesConnectionValidateBeforeCall(String contentLanguage, GetSecurityPoliciesConnectionRequestBody getSecurityPoliciesConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentLanguage' is set
        if (contentLanguage == null) {
            throw new ApiException("Missing the required parameter 'contentLanguage' when calling getSecurityPoliciesConnection(Async)");
        }
        
        // verify the required parameter 'getSecurityPoliciesConnectionRequestBody' is set
        if (getSecurityPoliciesConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getSecurityPoliciesConnectionRequestBody' when calling getSecurityPoliciesConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getSecurityPoliciesConnectionCall(contentLanguage, getSecurityPoliciesConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getSecurityPoliciesConnectionRequestBody  (required)
     * @return SecurityPolicyConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public SecurityPolicyConnection getSecurityPoliciesConnection(String contentLanguage, GetSecurityPoliciesConnectionRequestBody getSecurityPoliciesConnectionRequestBody) throws ApiException {
        ApiResponse<SecurityPolicyConnection> localVarResp = getSecurityPoliciesConnectionWithHttpInfo(contentLanguage, getSecurityPoliciesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param contentLanguage  (required)
     * @param getSecurityPoliciesConnectionRequestBody  (required)
     * @return ApiResponse&lt;SecurityPolicyConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SecurityPolicyConnection> getSecurityPoliciesConnectionWithHttpInfo(String contentLanguage, GetSecurityPoliciesConnectionRequestBody getSecurityPoliciesConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getSecurityPoliciesConnectionValidateBeforeCall(contentLanguage, getSecurityPoliciesConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<SecurityPolicyConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param contentLanguage  (required)
     * @param getSecurityPoliciesConnectionRequestBody  (required)
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
    public okhttp3.Call getSecurityPoliciesConnectionAsync(String contentLanguage, GetSecurityPoliciesConnectionRequestBody getSecurityPoliciesConnectionRequestBody, final ApiCallback<SecurityPolicyConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSecurityPoliciesConnectionValidateBeforeCall(contentLanguage, getSecurityPoliciesConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<SecurityPolicyConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
