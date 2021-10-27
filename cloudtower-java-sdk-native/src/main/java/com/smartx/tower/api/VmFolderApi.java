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

import com.smartx.tower.model.GetVmFoldersConnectionRequestBody;
import com.smartx.tower.model.GetVmFoldersRequestBody;
import com.smartx.tower.model.VmFolder;
import com.smartx.tower.model.VmFolderConnection;
import com.smartx.tower.model.VmFolderCreationParams;
import com.smartx.tower.model.VmFolderDeletionParams;
import com.smartx.tower.model.VmFolderUpdationParams;
import com.smartx.tower.model.WithTaskDeleteVmFolder;
import com.smartx.tower.model.WithTaskVmFolder;

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
public class VmFolderApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public VmFolderApi() {
    this(new ApiClient());
  }

  public VmFolderApi(ApiClient apiClient) {
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
   * @param vmFolderCreationParams  (required)
   * @return List&lt;WithTaskVmFolder&gt;
   * @throws ApiException if fails to make API call
   */
  public List<WithTaskVmFolder> createVmFolder(String contentLanguage, List<VmFolderCreationParams> vmFolderCreationParams) throws ApiException {
    ApiResponse<List<WithTaskVmFolder>> localVarResponse = createVmFolderWithHttpInfo(contentLanguage, vmFolderCreationParams);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmFolderCreationParams  (required)
   * @return ApiResponse&lt;List&lt;WithTaskVmFolder&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WithTaskVmFolder>> createVmFolderWithHttpInfo(String contentLanguage, List<VmFolderCreationParams> vmFolderCreationParams) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createVmFolderRequestBuilder(contentLanguage, vmFolderCreationParams);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("createVmFolder", localVarResponse);
      }
      return new ApiResponse<List<WithTaskVmFolder>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<WithTaskVmFolder>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder createVmFolderRequestBuilder(String contentLanguage, List<VmFolderCreationParams> vmFolderCreationParams) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling createVmFolder");
    }
    // verify the required parameter 'vmFolderCreationParams' is set
    if (vmFolderCreationParams == null) {
      throw new ApiException(400, "Missing the required parameter 'vmFolderCreationParams' when calling createVmFolder");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/create-vm-folder";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(vmFolderCreationParams);
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
   * @param vmFolderDeletionParams  (required)
   * @return List&lt;WithTaskDeleteVmFolder&gt;
   * @throws ApiException if fails to make API call
   */
  public List<WithTaskDeleteVmFolder> deleteVmFolder(String contentLanguage, VmFolderDeletionParams vmFolderDeletionParams) throws ApiException {
    ApiResponse<List<WithTaskDeleteVmFolder>> localVarResponse = deleteVmFolderWithHttpInfo(contentLanguage, vmFolderDeletionParams);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmFolderDeletionParams  (required)
   * @return ApiResponse&lt;List&lt;WithTaskDeleteVmFolder&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WithTaskDeleteVmFolder>> deleteVmFolderWithHttpInfo(String contentLanguage, VmFolderDeletionParams vmFolderDeletionParams) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteVmFolderRequestBuilder(contentLanguage, vmFolderDeletionParams);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("deleteVmFolder", localVarResponse);
      }
      return new ApiResponse<List<WithTaskDeleteVmFolder>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<WithTaskDeleteVmFolder>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder deleteVmFolderRequestBuilder(String contentLanguage, VmFolderDeletionParams vmFolderDeletionParams) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling deleteVmFolder");
    }
    // verify the required parameter 'vmFolderDeletionParams' is set
    if (vmFolderDeletionParams == null) {
      throw new ApiException(400, "Missing the required parameter 'vmFolderDeletionParams' when calling deleteVmFolder");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/delete-vm-folder";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(vmFolderDeletionParams);
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
   * @param getVmFoldersRequestBody  (required)
   * @return List&lt;VmFolder&gt;
   * @throws ApiException if fails to make API call
   */
  public List<VmFolder> getVmFolders(String contentLanguage, GetVmFoldersRequestBody getVmFoldersRequestBody) throws ApiException {
    ApiResponse<List<VmFolder>> localVarResponse = getVmFoldersWithHttpInfo(contentLanguage, getVmFoldersRequestBody);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVmFoldersRequestBody  (required)
   * @return ApiResponse&lt;List&lt;VmFolder&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<VmFolder>> getVmFoldersWithHttpInfo(String contentLanguage, GetVmFoldersRequestBody getVmFoldersRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getVmFoldersRequestBuilder(contentLanguage, getVmFoldersRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("getVmFolders", localVarResponse);
      }
      return new ApiResponse<List<VmFolder>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<VmFolder>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getVmFoldersRequestBuilder(String contentLanguage, GetVmFoldersRequestBody getVmFoldersRequestBody) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling getVmFolders");
    }
    // verify the required parameter 'getVmFoldersRequestBody' is set
    if (getVmFoldersRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'getVmFoldersRequestBody' when calling getVmFolders");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/get-vm-folders";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(getVmFoldersRequestBody);
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
   * @param getVmFoldersConnectionRequestBody  (required)
   * @return VmFolderConnection
   * @throws ApiException if fails to make API call
   */
  public VmFolderConnection getVmFoldersConnection(String contentLanguage, GetVmFoldersConnectionRequestBody getVmFoldersConnectionRequestBody) throws ApiException {
    ApiResponse<VmFolderConnection> localVarResponse = getVmFoldersConnectionWithHttpInfo(contentLanguage, getVmFoldersConnectionRequestBody);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVmFoldersConnectionRequestBody  (required)
   * @return ApiResponse&lt;VmFolderConnection&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VmFolderConnection> getVmFoldersConnectionWithHttpInfo(String contentLanguage, GetVmFoldersConnectionRequestBody getVmFoldersConnectionRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getVmFoldersConnectionRequestBuilder(contentLanguage, getVmFoldersConnectionRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("getVmFoldersConnection", localVarResponse);
      }
      return new ApiResponse<VmFolderConnection>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<VmFolderConnection>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getVmFoldersConnectionRequestBuilder(String contentLanguage, GetVmFoldersConnectionRequestBody getVmFoldersConnectionRequestBody) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling getVmFoldersConnection");
    }
    // verify the required parameter 'getVmFoldersConnectionRequestBody' is set
    if (getVmFoldersConnectionRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'getVmFoldersConnectionRequestBody' when calling getVmFoldersConnection");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/get-vm-folders-connection";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(getVmFoldersConnectionRequestBody);
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
   * @param vmFolderUpdationParams  (required)
   * @return List&lt;WithTaskVmFolder&gt;
   * @throws ApiException if fails to make API call
   */
  public List<WithTaskVmFolder> updateVmFolder(String contentLanguage, VmFolderUpdationParams vmFolderUpdationParams) throws ApiException {
    ApiResponse<List<WithTaskVmFolder>> localVarResponse = updateVmFolderWithHttpInfo(contentLanguage, vmFolderUpdationParams);
    return localVarResponse.getData();
  }

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param vmFolderUpdationParams  (required)
   * @return ApiResponse&lt;List&lt;WithTaskVmFolder&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WithTaskVmFolder>> updateVmFolderWithHttpInfo(String contentLanguage, VmFolderUpdationParams vmFolderUpdationParams) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateVmFolderRequestBuilder(contentLanguage, vmFolderUpdationParams);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw getApiException("updateVmFolder", localVarResponse);
      }
      return new ApiResponse<List<WithTaskVmFolder>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<WithTaskVmFolder>>() {})
        );
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder updateVmFolderRequestBuilder(String contentLanguage, VmFolderUpdationParams vmFolderUpdationParams) throws ApiException {
    // verify the required parameter 'contentLanguage' is set
    if (contentLanguage == null) {
      throw new ApiException(400, "Missing the required parameter 'contentLanguage' when calling updateVmFolder");
    }
    // verify the required parameter 'vmFolderUpdationParams' is set
    if (vmFolderUpdationParams == null) {
      throw new ApiException(400, "Missing the required parameter 'vmFolderUpdationParams' when calling updateVmFolder");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/update-vm-folder";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentLanguage != null) {
      localVarRequestBuilder.header("content-language", contentLanguage.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(vmFolderUpdationParams);
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
