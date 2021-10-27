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

import com.smartx.tower.model.GetOrganizationsConnectionRequestBody;
import com.smartx.tower.model.GetOrganizationsRequestBody;
import com.smartx.tower.model.Organization;
import com.smartx.tower.model.OrganizationConnection;
import com.smartx.tower.model.OrganizationCreationParams;
import com.smartx.tower.model.OrganizationDeletionParams;
import com.smartx.tower.model.OrganizationUpdationParams;
import com.smartx.tower.model.WithTaskDeleteOrganization;
import com.smartx.tower.model.WithTaskOrganization;

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
public class OrganizationApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public OrganizationApi() {
    this(new ApiClient());
  }

  public OrganizationApi(ApiClient apiClient) {
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
   * @param organizationCreationParams  (required)
   * @return List&lt;WithTaskOrganization&gt;
   * @throws ApiException if fails to make API call
   */
  public List<WithTaskOrganization> createOrganization(String contentLanguage, List<OrganizationCreationParams> organizationCreationParams) throws ApiException {
    ApiResponse<List<WithTaskOrganization>> localVarResponse = createOrganizationWithHttpInfo(contentLanguage, organizationCreationParams);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param organizationCreationParams  (required)
   * @return ApiResponse&lt;List&lt;WithTaskOrganization&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WithTaskOrganization>> createOrganizationWithHttpInfo(String contentLanguage, List<OrganizationCreationParams> organizationCreationParams) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createOrganizationRequestBuilder(contentLanguage, organizationCreationParams);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("createOrganization", localVarResponse);
      }
      return new ApiResponse<List<WithTaskOrganization>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<WithTaskOrganization>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder createOrganizationRequestBuilder(String contentLanguage, List<OrganizationCreationParams> organizationCreationParams) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling createOrganization");
    }
    // verify the required parameter 'organizationCreationParams' is set
    if (organizationCreationParams == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationCreationParams' when calling createOrganization");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/create-organization";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(organizationCreationParams);
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
   * @param organizationDeletionParams  (required)
   * @return List&lt;WithTaskDeleteOrganization&gt;
   * @throws ApiException if fails to make API call
   */
  public List<WithTaskDeleteOrganization> deleteOrganization(String contentLanguage, OrganizationDeletionParams organizationDeletionParams) throws ApiException {
    ApiResponse<List<WithTaskDeleteOrganization>> localVarResponse = deleteOrganizationWithHttpInfo(contentLanguage, organizationDeletionParams);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param organizationDeletionParams  (required)
   * @return ApiResponse&lt;List&lt;WithTaskDeleteOrganization&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WithTaskDeleteOrganization>> deleteOrganizationWithHttpInfo(String contentLanguage, OrganizationDeletionParams organizationDeletionParams) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteOrganizationRequestBuilder(contentLanguage, organizationDeletionParams);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("deleteOrganization", localVarResponse);
      }
      return new ApiResponse<List<WithTaskDeleteOrganization>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<WithTaskDeleteOrganization>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder deleteOrganizationRequestBuilder(String contentLanguage, OrganizationDeletionParams organizationDeletionParams) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling deleteOrganization");
    }
    // verify the required parameter 'organizationDeletionParams' is set
    if (organizationDeletionParams == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationDeletionParams' when calling deleteOrganization");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/delete-organization";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(organizationDeletionParams);
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
   * @param getOrganizationsRequestBody  (required)
   * @return List&lt;Organization&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Organization> getOrganizations(String contentLanguage, GetOrganizationsRequestBody getOrganizationsRequestBody) throws ApiException {
    ApiResponse<List<Organization>> localVarResponse = getOrganizationsWithHttpInfo(contentLanguage, getOrganizationsRequestBody);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getOrganizationsRequestBody  (required)
   * @return ApiResponse&lt;List&lt;Organization&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Organization>> getOrganizationsWithHttpInfo(String contentLanguage, GetOrganizationsRequestBody getOrganizationsRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getOrganizationsRequestBuilder(contentLanguage, getOrganizationsRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("getOrganizations", localVarResponse);
      }
      return new ApiResponse<List<Organization>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<Organization>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getOrganizationsRequestBuilder(String contentLanguage, GetOrganizationsRequestBody getOrganizationsRequestBody) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling getOrganizations");
    }
    // verify the required parameter 'getOrganizationsRequestBody' is set
    if (getOrganizationsRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'getOrganizationsRequestBody' when calling getOrganizations");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/get-organizations";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(getOrganizationsRequestBody);
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
   * @param getOrganizationsConnectionRequestBody  (required)
   * @return OrganizationConnection
   * @throws ApiException if fails to make API call
   */
  public OrganizationConnection getOrganizationsConnection(String contentLanguage, GetOrganizationsConnectionRequestBody getOrganizationsConnectionRequestBody) throws ApiException {
    ApiResponse<OrganizationConnection> localVarResponse = getOrganizationsConnectionWithHttpInfo(contentLanguage, getOrganizationsConnectionRequestBody);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getOrganizationsConnectionRequestBody  (required)
   * @return ApiResponse&lt;OrganizationConnection&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationConnection> getOrganizationsConnectionWithHttpInfo(String contentLanguage, GetOrganizationsConnectionRequestBody getOrganizationsConnectionRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getOrganizationsConnectionRequestBuilder(contentLanguage, getOrganizationsConnectionRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("getOrganizationsConnection", localVarResponse);
      }
      return new ApiResponse<OrganizationConnection>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<OrganizationConnection>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getOrganizationsConnectionRequestBuilder(String contentLanguage, GetOrganizationsConnectionRequestBody getOrganizationsConnectionRequestBody) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling getOrganizationsConnection");
    }
    // verify the required parameter 'getOrganizationsConnectionRequestBody' is set
    if (getOrganizationsConnectionRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'getOrganizationsConnectionRequestBody' when calling getOrganizationsConnection");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/get-organizations-connection";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(getOrganizationsConnectionRequestBody);
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
   * @param organizationUpdationParams  (required)
   * @return List&lt;WithTaskOrganization&gt;
   * @throws ApiException if fails to make API call
   */
  public List<WithTaskOrganization> updateOrganization(String contentLanguage, OrganizationUpdationParams organizationUpdationParams) throws ApiException {
    ApiResponse<List<WithTaskOrganization>> localVarResponse = updateOrganizationWithHttpInfo(contentLanguage, organizationUpdationParams);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param organizationUpdationParams  (required)
   * @return ApiResponse&lt;List&lt;WithTaskOrganization&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WithTaskOrganization>> updateOrganizationWithHttpInfo(String contentLanguage, OrganizationUpdationParams organizationUpdationParams) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateOrganizationRequestBuilder(contentLanguage, organizationUpdationParams);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("updateOrganization", localVarResponse);
      }
      return new ApiResponse<List<WithTaskOrganization>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<WithTaskOrganization>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder updateOrganizationRequestBuilder(String contentLanguage, OrganizationUpdationParams organizationUpdationParams) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling updateOrganization");
    }
    // verify the required parameter 'organizationUpdationParams' is set
    if (organizationUpdationParams == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationUpdationParams' when calling updateOrganization");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/update-organization";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(organizationUpdationParams);
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
