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

import com.smartx.tower.model.ConsistencyGroup;
import com.smartx.tower.model.ConsistencyGroupConnection;
import com.smartx.tower.model.ConsistencyGroupCreationParams;
import com.smartx.tower.model.ConsistencyGroupDeletionParams;
import com.smartx.tower.model.ConsistencyGroupUpdationParams;
import com.smartx.tower.model.GetConsistencyGroupsConnectionRequestBody;
import com.smartx.tower.model.GetConsistencyGroupsRequestBody;
import com.smartx.tower.model.WithTaskConsistencyGroup;
import com.smartx.tower.model.WithTaskDeleteConsistencyGroup;

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
public class ConsistencyGroupApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public ConsistencyGroupApi() {
    this(new ApiClient());
  }

  public ConsistencyGroupApi(ApiClient apiClient) {
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
   * @param consistencyGroupCreationParams  (required)
   * @return List&lt;WithTaskConsistencyGroup&gt;
   * @throws ApiException if fails to make API call
   */
  public List<WithTaskConsistencyGroup> createConsistencyGroup(String contentLanguage, List<ConsistencyGroupCreationParams> consistencyGroupCreationParams) throws ApiException {
    ApiResponse<List<WithTaskConsistencyGroup>> localVarResponse = createConsistencyGroupWithHttpInfo(contentLanguage, consistencyGroupCreationParams);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param consistencyGroupCreationParams  (required)
   * @return ApiResponse&lt;List&lt;WithTaskConsistencyGroup&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WithTaskConsistencyGroup>> createConsistencyGroupWithHttpInfo(String contentLanguage, List<ConsistencyGroupCreationParams> consistencyGroupCreationParams) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createConsistencyGroupRequestBuilder(contentLanguage, consistencyGroupCreationParams);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("createConsistencyGroup", localVarResponse);
      }
      return new ApiResponse<List<WithTaskConsistencyGroup>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<WithTaskConsistencyGroup>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder createConsistencyGroupRequestBuilder(String contentLanguage, List<ConsistencyGroupCreationParams> consistencyGroupCreationParams) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling createConsistencyGroup");
    }
    // verify the required parameter 'consistencyGroupCreationParams' is set
    if (consistencyGroupCreationParams == null) {
      throw new ApiException(400, "Missing the required parameter 'consistencyGroupCreationParams' when calling createConsistencyGroup");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/create-consistency-group";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(consistencyGroupCreationParams);
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
   * @param consistencyGroupDeletionParams  (required)
   * @return List&lt;WithTaskDeleteConsistencyGroup&gt;
   * @throws ApiException if fails to make API call
   */
  public List<WithTaskDeleteConsistencyGroup> deleteConsistencyGroup(String contentLanguage, ConsistencyGroupDeletionParams consistencyGroupDeletionParams) throws ApiException {
    ApiResponse<List<WithTaskDeleteConsistencyGroup>> localVarResponse = deleteConsistencyGroupWithHttpInfo(contentLanguage, consistencyGroupDeletionParams);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param consistencyGroupDeletionParams  (required)
   * @return ApiResponse&lt;List&lt;WithTaskDeleteConsistencyGroup&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WithTaskDeleteConsistencyGroup>> deleteConsistencyGroupWithHttpInfo(String contentLanguage, ConsistencyGroupDeletionParams consistencyGroupDeletionParams) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteConsistencyGroupRequestBuilder(contentLanguage, consistencyGroupDeletionParams);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("deleteConsistencyGroup", localVarResponse);
      }
      return new ApiResponse<List<WithTaskDeleteConsistencyGroup>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<WithTaskDeleteConsistencyGroup>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder deleteConsistencyGroupRequestBuilder(String contentLanguage, ConsistencyGroupDeletionParams consistencyGroupDeletionParams) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling deleteConsistencyGroup");
    }
    // verify the required parameter 'consistencyGroupDeletionParams' is set
    if (consistencyGroupDeletionParams == null) {
      throw new ApiException(400, "Missing the required parameter 'consistencyGroupDeletionParams' when calling deleteConsistencyGroup");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/delete-consistency-group";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(consistencyGroupDeletionParams);
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
   * @param getConsistencyGroupsRequestBody  (required)
   * @return List&lt;ConsistencyGroup&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ConsistencyGroup> getConsistencyGroups(String contentLanguage, GetConsistencyGroupsRequestBody getConsistencyGroupsRequestBody) throws ApiException {
    ApiResponse<List<ConsistencyGroup>> localVarResponse = getConsistencyGroupsWithHttpInfo(contentLanguage, getConsistencyGroupsRequestBody);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getConsistencyGroupsRequestBody  (required)
   * @return ApiResponse&lt;List&lt;ConsistencyGroup&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<ConsistencyGroup>> getConsistencyGroupsWithHttpInfo(String contentLanguage, GetConsistencyGroupsRequestBody getConsistencyGroupsRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getConsistencyGroupsRequestBuilder(contentLanguage, getConsistencyGroupsRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("getConsistencyGroups", localVarResponse);
      }
      return new ApiResponse<List<ConsistencyGroup>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<ConsistencyGroup>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getConsistencyGroupsRequestBuilder(String contentLanguage, GetConsistencyGroupsRequestBody getConsistencyGroupsRequestBody) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling getConsistencyGroups");
    }
    // verify the required parameter 'getConsistencyGroupsRequestBody' is set
    if (getConsistencyGroupsRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'getConsistencyGroupsRequestBody' when calling getConsistencyGroups");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/get-consistency-groups";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(getConsistencyGroupsRequestBody);
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
   * @param getConsistencyGroupsConnectionRequestBody  (required)
   * @return ConsistencyGroupConnection
   * @throws ApiException if fails to make API call
   */
  public ConsistencyGroupConnection getConsistencyGroupsConnection(String contentLanguage, GetConsistencyGroupsConnectionRequestBody getConsistencyGroupsConnectionRequestBody) throws ApiException {
    ApiResponse<ConsistencyGroupConnection> localVarResponse = getConsistencyGroupsConnectionWithHttpInfo(contentLanguage, getConsistencyGroupsConnectionRequestBody);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getConsistencyGroupsConnectionRequestBody  (required)
   * @return ApiResponse&lt;ConsistencyGroupConnection&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConsistencyGroupConnection> getConsistencyGroupsConnectionWithHttpInfo(String contentLanguage, GetConsistencyGroupsConnectionRequestBody getConsistencyGroupsConnectionRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getConsistencyGroupsConnectionRequestBuilder(contentLanguage, getConsistencyGroupsConnectionRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("getConsistencyGroupsConnection", localVarResponse);
      }
      return new ApiResponse<ConsistencyGroupConnection>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ConsistencyGroupConnection>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getConsistencyGroupsConnectionRequestBuilder(String contentLanguage, GetConsistencyGroupsConnectionRequestBody getConsistencyGroupsConnectionRequestBody) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling getConsistencyGroupsConnection");
    }
    // verify the required parameter 'getConsistencyGroupsConnectionRequestBody' is set
    if (getConsistencyGroupsConnectionRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'getConsistencyGroupsConnectionRequestBody' when calling getConsistencyGroupsConnection");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/get-consistency-groups-connection";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(getConsistencyGroupsConnectionRequestBody);
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
   * @param consistencyGroupUpdationParams  (required)
   * @return List&lt;WithTaskConsistencyGroup&gt;
   * @throws ApiException if fails to make API call
   */
  public List<WithTaskConsistencyGroup> updateConsistencyGroup(String contentLanguage, ConsistencyGroupUpdationParams consistencyGroupUpdationParams) throws ApiException {
    ApiResponse<List<WithTaskConsistencyGroup>> localVarResponse = updateConsistencyGroupWithHttpInfo(contentLanguage, consistencyGroupUpdationParams);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param consistencyGroupUpdationParams  (required)
   * @return ApiResponse&lt;List&lt;WithTaskConsistencyGroup&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WithTaskConsistencyGroup>> updateConsistencyGroupWithHttpInfo(String contentLanguage, ConsistencyGroupUpdationParams consistencyGroupUpdationParams) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateConsistencyGroupRequestBuilder(contentLanguage, consistencyGroupUpdationParams);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("updateConsistencyGroup", localVarResponse);
      }
      return new ApiResponse<List<WithTaskConsistencyGroup>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<WithTaskConsistencyGroup>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder updateConsistencyGroupRequestBuilder(String contentLanguage, ConsistencyGroupUpdationParams consistencyGroupUpdationParams) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling updateConsistencyGroup");
    }
    // verify the required parameter 'consistencyGroupUpdationParams' is set
    if (consistencyGroupUpdationParams == null) {
      throw new ApiException(400, "Missing the required parameter 'consistencyGroupUpdationParams' when calling updateConsistencyGroup");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/update-consistency-group";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(consistencyGroupUpdationParams);
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
