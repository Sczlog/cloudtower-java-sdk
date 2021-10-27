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

import com.smartx.tower.ApiClient;
import com.smartx.tower.ApiException;
import com.smartx.tower.ApiResponse;
import com.smartx.tower.Pair;

import com.smartx.tower.model.GetIsolationPoliciesConnectionRequestBody;
import com.smartx.tower.model.GetIsolationPoliciesRequestBody;
import com.smartx.tower.model.IsolationPolicy;
import com.smartx.tower.model.IsolationPolicyConnection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.function.Consumer;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class IsolationPolicyApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public IsolationPolicyApi() {
    this(new ApiClient());
  }

  public IsolationPolicyApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getIsolationPoliciesRequestBody  (required)
   * @return List&lt;IsolationPolicy&gt;
   * @throws ApiException if fails to make API call
   */
  public List<IsolationPolicy> getIsolationPolicies(String contentLanguage, GetIsolationPoliciesRequestBody getIsolationPoliciesRequestBody) throws ApiException {
    ApiResponse<List<IsolationPolicy>> localVarResponse = getIsolationPoliciesWithHttpInfo(contentLanguage, getIsolationPoliciesRequestBody);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getIsolationPoliciesRequestBody  (required)
   * @return ApiResponse&lt;List&lt;IsolationPolicy&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<IsolationPolicy>> getIsolationPoliciesWithHttpInfo(String contentLanguage, GetIsolationPoliciesRequestBody getIsolationPoliciesRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getIsolationPoliciesRequestBuilder(contentLanguage, getIsolationPoliciesRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("getIsolationPolicies", localVarResponse);
      }
      return new ApiResponse<List<IsolationPolicy>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<IsolationPolicy>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getIsolationPoliciesRequestBuilder(String contentLanguage, GetIsolationPoliciesRequestBody getIsolationPoliciesRequestBody) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling getIsolationPolicies");
    }
    // verify the required parameter 'getIsolationPoliciesRequestBody' is set
    if (getIsolationPoliciesRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'getIsolationPoliciesRequestBody' when calling getIsolationPolicies");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/get-isolation-policies";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(getIsolationPoliciesRequestBody);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getIsolationPoliciesConnectionRequestBody  (required)
   * @return IsolationPolicyConnection
   * @throws ApiException if fails to make API call
   */
  public IsolationPolicyConnection getIsolationPoliciesConnection(String contentLanguage, GetIsolationPoliciesConnectionRequestBody getIsolationPoliciesConnectionRequestBody) throws ApiException {
    ApiResponse<IsolationPolicyConnection> localVarResponse = getIsolationPoliciesConnectionWithHttpInfo(contentLanguage, getIsolationPoliciesConnectionRequestBody);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getIsolationPoliciesConnectionRequestBody  (required)
   * @return ApiResponse&lt;IsolationPolicyConnection&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<IsolationPolicyConnection> getIsolationPoliciesConnectionWithHttpInfo(String contentLanguage, GetIsolationPoliciesConnectionRequestBody getIsolationPoliciesConnectionRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getIsolationPoliciesConnectionRequestBuilder(contentLanguage, getIsolationPoliciesConnectionRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("getIsolationPoliciesConnection", localVarResponse);
      }
      return new ApiResponse<IsolationPolicyConnection>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<IsolationPolicyConnection>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getIsolationPoliciesConnectionRequestBuilder(String contentLanguage, GetIsolationPoliciesConnectionRequestBody getIsolationPoliciesConnectionRequestBody) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling getIsolationPoliciesConnection");
    }
    // verify the required parameter 'getIsolationPoliciesConnectionRequestBody' is set
    if (getIsolationPoliciesConnectionRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'getIsolationPoliciesConnectionRequestBody' when calling getIsolationPoliciesConnection");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/get-isolation-policies-connection";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(getIsolationPoliciesConnectionRequestBody);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
