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

import com.smartx.tower.model.GetSnapshotPlanTasksConnectionRequestBody;
import com.smartx.tower.model.GetSnapshotPlanTasksRequestBody;
import com.smartx.tower.model.SnapshotPlanTask;
import com.smartx.tower.model.SnapshotPlanTaskConnection;

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
public class SnapshotPlanTaskApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public SnapshotPlanTaskApi() {
    this(new ApiClient());
  }

  public SnapshotPlanTaskApi(ApiClient apiClient) {
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
   * @param getSnapshotPlanTasksRequestBody  (required)
   * @return List&lt;SnapshotPlanTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<SnapshotPlanTask> getSnapshotPlanTasks(String contentLanguage, GetSnapshotPlanTasksRequestBody getSnapshotPlanTasksRequestBody) throws ApiException {
    ApiResponse<List<SnapshotPlanTask>> localVarResponse = getSnapshotPlanTasksWithHttpInfo(contentLanguage, getSnapshotPlanTasksRequestBody);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getSnapshotPlanTasksRequestBody  (required)
   * @return ApiResponse&lt;List&lt;SnapshotPlanTask&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<SnapshotPlanTask>> getSnapshotPlanTasksWithHttpInfo(String contentLanguage, GetSnapshotPlanTasksRequestBody getSnapshotPlanTasksRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getSnapshotPlanTasksRequestBuilder(contentLanguage, getSnapshotPlanTasksRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("getSnapshotPlanTasks", localVarResponse);
      }
      return new ApiResponse<List<SnapshotPlanTask>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<SnapshotPlanTask>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getSnapshotPlanTasksRequestBuilder(String contentLanguage, GetSnapshotPlanTasksRequestBody getSnapshotPlanTasksRequestBody) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling getSnapshotPlanTasks");
    }
    // verify the required parameter 'getSnapshotPlanTasksRequestBody' is set
    if (getSnapshotPlanTasksRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'getSnapshotPlanTasksRequestBody' when calling getSnapshotPlanTasks");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/get-snapshot-plan-tasks";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(getSnapshotPlanTasksRequestBody);
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
   * @param getSnapshotPlanTasksConnectionRequestBody  (required)
   * @return SnapshotPlanTaskConnection
   * @throws ApiException if fails to make API call
   */
  public SnapshotPlanTaskConnection getSnapshotPlanTasksConnection(String contentLanguage, GetSnapshotPlanTasksConnectionRequestBody getSnapshotPlanTasksConnectionRequestBody) throws ApiException {
    ApiResponse<SnapshotPlanTaskConnection> localVarResponse = getSnapshotPlanTasksConnectionWithHttpInfo(contentLanguage, getSnapshotPlanTasksConnectionRequestBody);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getSnapshotPlanTasksConnectionRequestBody  (required)
   * @return ApiResponse&lt;SnapshotPlanTaskConnection&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SnapshotPlanTaskConnection> getSnapshotPlanTasksConnectionWithHttpInfo(String contentLanguage, GetSnapshotPlanTasksConnectionRequestBody getSnapshotPlanTasksConnectionRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getSnapshotPlanTasksConnectionRequestBuilder(contentLanguage, getSnapshotPlanTasksConnectionRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("getSnapshotPlanTasksConnection", localVarResponse);
      }
      return new ApiResponse<SnapshotPlanTaskConnection>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SnapshotPlanTaskConnection>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getSnapshotPlanTasksConnectionRequestBuilder(String contentLanguage, GetSnapshotPlanTasksConnectionRequestBody getSnapshotPlanTasksConnectionRequestBody) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling getSnapshotPlanTasksConnection");
    }
    // verify the required parameter 'getSnapshotPlanTasksConnectionRequestBody' is set
    if (getSnapshotPlanTasksConnectionRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'getSnapshotPlanTasksConnectionRequestBody' when calling getSnapshotPlanTasksConnection");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/get-snapshot-plan-tasks-connection";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(getSnapshotPlanTasksConnectionRequestBody);
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
