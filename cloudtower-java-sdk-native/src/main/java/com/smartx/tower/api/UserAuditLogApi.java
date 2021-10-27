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

import com.smartx.tower.model.GetUserAuditLogsConnectionRequestBody;
import com.smartx.tower.model.GetUserAuditLogsRequestBody;
import com.smartx.tower.model.UserAuditLog;
import com.smartx.tower.model.UserAuditLogConnection;

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
public class UserAuditLogApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public UserAuditLogApi() {
    this(new ApiClient());
  }

  public UserAuditLogApi(ApiClient apiClient) {
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
   * @param getUserAuditLogsRequestBody  (required)
   * @return List&lt;UserAuditLog&gt;
   * @throws ApiException if fails to make API call
   */
  public List<UserAuditLog> getUserAuditLogs(String contentLanguage, GetUserAuditLogsRequestBody getUserAuditLogsRequestBody) throws ApiException {
    ApiResponse<List<UserAuditLog>> localVarResponse = getUserAuditLogsWithHttpInfo(contentLanguage, getUserAuditLogsRequestBody);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getUserAuditLogsRequestBody  (required)
   * @return ApiResponse&lt;List&lt;UserAuditLog&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<UserAuditLog>> getUserAuditLogsWithHttpInfo(String contentLanguage, GetUserAuditLogsRequestBody getUserAuditLogsRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getUserAuditLogsRequestBuilder(contentLanguage, getUserAuditLogsRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("getUserAuditLogs", localVarResponse);
      }
      return new ApiResponse<List<UserAuditLog>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<UserAuditLog>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getUserAuditLogsRequestBuilder(String contentLanguage, GetUserAuditLogsRequestBody getUserAuditLogsRequestBody) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling getUserAuditLogs");
    }
    // verify the required parameter 'getUserAuditLogsRequestBody' is set
    if (getUserAuditLogsRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'getUserAuditLogsRequestBody' when calling getUserAuditLogs");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/get-user-audit-logs";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(getUserAuditLogsRequestBody);
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
   * @param getUserAuditLogsConnectionRequestBody  (required)
   * @return UserAuditLogConnection
   * @throws ApiException if fails to make API call
   */
  public UserAuditLogConnection getUserAuditLogsConnection(String contentLanguage, GetUserAuditLogsConnectionRequestBody getUserAuditLogsConnectionRequestBody) throws ApiException {
    ApiResponse<UserAuditLogConnection> localVarResponse = getUserAuditLogsConnectionWithHttpInfo(contentLanguage, getUserAuditLogsConnectionRequestBody);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getUserAuditLogsConnectionRequestBody  (required)
   * @return ApiResponse&lt;UserAuditLogConnection&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserAuditLogConnection> getUserAuditLogsConnectionWithHttpInfo(String contentLanguage, GetUserAuditLogsConnectionRequestBody getUserAuditLogsConnectionRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getUserAuditLogsConnectionRequestBuilder(contentLanguage, getUserAuditLogsConnectionRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("getUserAuditLogsConnection", localVarResponse);
      }
      return new ApiResponse<UserAuditLogConnection>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<UserAuditLogConnection>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getUserAuditLogsConnectionRequestBuilder(String contentLanguage, GetUserAuditLogsConnectionRequestBody getUserAuditLogsConnectionRequestBody) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling getUserAuditLogsConnection");
    }
    // verify the required parameter 'getUserAuditLogsConnectionRequestBody' is set
    if (getUserAuditLogsConnectionRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'getUserAuditLogsConnectionRequestBody' when calling getUserAuditLogsConnection");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/get-user-audit-logs-connection";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(getUserAuditLogsConnectionRequestBody);
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
