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

import com.smartx.tower.model.AddLabelsToResourcesParams;
import com.smartx.tower.model.GetLabelsConnectionRequestBody;
import com.smartx.tower.model.GetLabelsRequestBody;
import com.smartx.tower.model.Label;
import com.smartx.tower.model.LabelConnection;
import com.smartx.tower.model.LabelCreationParams;
import com.smartx.tower.model.LabelDeletionParams;
import com.smartx.tower.model.LabelUpdationParams;
import com.smartx.tower.model.WithTaskDeleteLabel;
import com.smartx.tower.model.WithTaskLabel;

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
public class LabelApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public LabelApi() {
    this(new ApiClient());
  }

  public LabelApi(ApiClient apiClient) {
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
   * @param addLabelsToResourcesParams  (required)
   * @return List&lt;WithTaskLabel&gt;
   * @throws ApiException if fails to make API call
   */
  public List<WithTaskLabel> addLabelsToResources(String contentLanguage, AddLabelsToResourcesParams addLabelsToResourcesParams) throws ApiException {
    ApiResponse<List<WithTaskLabel>> localVarResponse = addLabelsToResourcesWithHttpInfo(contentLanguage, addLabelsToResourcesParams);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param addLabelsToResourcesParams  (required)
   * @return ApiResponse&lt;List&lt;WithTaskLabel&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WithTaskLabel>> addLabelsToResourcesWithHttpInfo(String contentLanguage, AddLabelsToResourcesParams addLabelsToResourcesParams) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = addLabelsToResourcesRequestBuilder(contentLanguage, addLabelsToResourcesParams);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("addLabelsToResources", localVarResponse);
      }
      return new ApiResponse<List<WithTaskLabel>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<WithTaskLabel>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder addLabelsToResourcesRequestBuilder(String contentLanguage, AddLabelsToResourcesParams addLabelsToResourcesParams) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling addLabelsToResources");
    }
    // verify the required parameter 'addLabelsToResourcesParams' is set
    if (addLabelsToResourcesParams == null) {
      throw new ApiException(400, "Missing the required parameter 'addLabelsToResourcesParams' when calling addLabelsToResources");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/add-labels-to-resources";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(addLabelsToResourcesParams);
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
   * @param labelCreationParams  (required)
   * @return List&lt;WithTaskLabel&gt;
   * @throws ApiException if fails to make API call
   */
  public List<WithTaskLabel> createLabel(String contentLanguage, List<LabelCreationParams> labelCreationParams) throws ApiException {
    ApiResponse<List<WithTaskLabel>> localVarResponse = createLabelWithHttpInfo(contentLanguage, labelCreationParams);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param labelCreationParams  (required)
   * @return ApiResponse&lt;List&lt;WithTaskLabel&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WithTaskLabel>> createLabelWithHttpInfo(String contentLanguage, List<LabelCreationParams> labelCreationParams) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createLabelRequestBuilder(contentLanguage, labelCreationParams);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("createLabel", localVarResponse);
      }
      return new ApiResponse<List<WithTaskLabel>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<WithTaskLabel>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder createLabelRequestBuilder(String contentLanguage, List<LabelCreationParams> labelCreationParams) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling createLabel");
    }
    // verify the required parameter 'labelCreationParams' is set
    if (labelCreationParams == null) {
      throw new ApiException(400, "Missing the required parameter 'labelCreationParams' when calling createLabel");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/create-label";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(labelCreationParams);
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
   * @param labelDeletionParams  (required)
   * @return List&lt;WithTaskDeleteLabel&gt;
   * @throws ApiException if fails to make API call
   */
  public List<WithTaskDeleteLabel> deleteLabel(String contentLanguage, LabelDeletionParams labelDeletionParams) throws ApiException {
    ApiResponse<List<WithTaskDeleteLabel>> localVarResponse = deleteLabelWithHttpInfo(contentLanguage, labelDeletionParams);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param labelDeletionParams  (required)
   * @return ApiResponse&lt;List&lt;WithTaskDeleteLabel&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WithTaskDeleteLabel>> deleteLabelWithHttpInfo(String contentLanguage, LabelDeletionParams labelDeletionParams) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteLabelRequestBuilder(contentLanguage, labelDeletionParams);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("deleteLabel", localVarResponse);
      }
      return new ApiResponse<List<WithTaskDeleteLabel>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<WithTaskDeleteLabel>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder deleteLabelRequestBuilder(String contentLanguage, LabelDeletionParams labelDeletionParams) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling deleteLabel");
    }
    // verify the required parameter 'labelDeletionParams' is set
    if (labelDeletionParams == null) {
      throw new ApiException(400, "Missing the required parameter 'labelDeletionParams' when calling deleteLabel");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/delete-label";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(labelDeletionParams);
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
   * @param getLabelsRequestBody  (required)
   * @return List&lt;Label&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Label> getLabels(String contentLanguage, GetLabelsRequestBody getLabelsRequestBody) throws ApiException {
    ApiResponse<List<Label>> localVarResponse = getLabelsWithHttpInfo(contentLanguage, getLabelsRequestBody);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getLabelsRequestBody  (required)
   * @return ApiResponse&lt;List&lt;Label&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Label>> getLabelsWithHttpInfo(String contentLanguage, GetLabelsRequestBody getLabelsRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getLabelsRequestBuilder(contentLanguage, getLabelsRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("getLabels", localVarResponse);
      }
      return new ApiResponse<List<Label>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<Label>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getLabelsRequestBuilder(String contentLanguage, GetLabelsRequestBody getLabelsRequestBody) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling getLabels");
    }
    // verify the required parameter 'getLabelsRequestBody' is set
    if (getLabelsRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'getLabelsRequestBody' when calling getLabels");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/get-labels";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(getLabelsRequestBody);
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
   * @param getLabelsConnectionRequestBody  (required)
   * @return LabelConnection
   * @throws ApiException if fails to make API call
   */
  public LabelConnection getLabelsConnection(String contentLanguage, GetLabelsConnectionRequestBody getLabelsConnectionRequestBody) throws ApiException {
    ApiResponse<LabelConnection> localVarResponse = getLabelsConnectionWithHttpInfo(contentLanguage, getLabelsConnectionRequestBody);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getLabelsConnectionRequestBody  (required)
   * @return ApiResponse&lt;LabelConnection&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LabelConnection> getLabelsConnectionWithHttpInfo(String contentLanguage, GetLabelsConnectionRequestBody getLabelsConnectionRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getLabelsConnectionRequestBuilder(contentLanguage, getLabelsConnectionRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("getLabelsConnection", localVarResponse);
      }
      return new ApiResponse<LabelConnection>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<LabelConnection>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getLabelsConnectionRequestBuilder(String contentLanguage, GetLabelsConnectionRequestBody getLabelsConnectionRequestBody) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling getLabelsConnection");
    }
    // verify the required parameter 'getLabelsConnectionRequestBody' is set
    if (getLabelsConnectionRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'getLabelsConnectionRequestBody' when calling getLabelsConnection");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/get-labels-connection";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(getLabelsConnectionRequestBody);
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
   * @param body  (required)
   * @return List&lt;WithTaskLabel&gt;
   * @throws ApiException if fails to make API call
   */
  public List<WithTaskLabel> removeLabelsFromResources(String contentLanguage, AddLabelsToResourcesParams body) throws ApiException {
    ApiResponse<List<WithTaskLabel>> localVarResponse = removeLabelsFromResourcesWithHttpInfo(contentLanguage, body);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param body  (required)
   * @return ApiResponse&lt;List&lt;WithTaskLabel&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WithTaskLabel>> removeLabelsFromResourcesWithHttpInfo(String contentLanguage, AddLabelsToResourcesParams body) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = removeLabelsFromResourcesRequestBuilder(contentLanguage, body);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("removeLabelsFromResources", localVarResponse);
      }
      return new ApiResponse<List<WithTaskLabel>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<WithTaskLabel>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder removeLabelsFromResourcesRequestBuilder(String contentLanguage, AddLabelsToResourcesParams body) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling removeLabelsFromResources");
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling removeLabelsFromResources");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/remove-labels-from-resources";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
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
   * @param labelUpdationParams  (required)
   * @return List&lt;WithTaskLabel&gt;
   * @throws ApiException if fails to make API call
   */
  public List<WithTaskLabel> updateLabel(String contentLanguage, LabelUpdationParams labelUpdationParams) throws ApiException {
    ApiResponse<List<WithTaskLabel>> localVarResponse = updateLabelWithHttpInfo(contentLanguage, labelUpdationParams);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param labelUpdationParams  (required)
   * @return ApiResponse&lt;List&lt;WithTaskLabel&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WithTaskLabel>> updateLabelWithHttpInfo(String contentLanguage, LabelUpdationParams labelUpdationParams) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateLabelRequestBuilder(contentLanguage, labelUpdationParams);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("updateLabel", localVarResponse);
      }
      return new ApiResponse<List<WithTaskLabel>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<WithTaskLabel>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder updateLabelRequestBuilder(String contentLanguage, LabelUpdationParams labelUpdationParams) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling updateLabel");
    }
    // verify the required parameter 'labelUpdationParams' is set
    if (labelUpdationParams == null) {
      throw new ApiException(400, "Missing the required parameter 'labelUpdationParams' when calling updateLabel");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/update-label";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(labelUpdationParams);
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
