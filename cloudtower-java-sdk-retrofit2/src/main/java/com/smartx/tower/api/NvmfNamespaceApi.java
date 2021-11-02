package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetNvmfNamespacesConnectionRequestBody;
import com.smartx.tower.model.GetNvmfNamespacesRequestBody;
import com.smartx.tower.model.NvmfNamespace;
import com.smartx.tower.model.NvmfNamespaceCloneParams;
import com.smartx.tower.model.NvmfNamespaceConnection;
import com.smartx.tower.model.NvmfNamespaceCreationParams;
import com.smartx.tower.model.NvmfNamespaceDeletionParams;
import com.smartx.tower.model.NvmfNamespaceRollbackParams;
import com.smartx.tower.model.NvmfNamespaceUpdationParams;
import com.smartx.tower.model.WithTaskDeleteNvmfNamespace;
import com.smartx.tower.model.WithTaskNvmfNamespace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NvmfNamespaceApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param nvmfNamespaceCloneParams  (required)
   * @return Call&lt;List&lt;WithTaskNvmfNamespace&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("clone-nvmf-namespace-from-snapshot")
  Call<List<WithTaskNvmfNamespace>> cloneNvmfNamespaceFromSnapshot(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<NvmfNamespaceCloneParams> nvmfNamespaceCloneParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param nvmfNamespaceCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskNvmfNamespace&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-nvmf-namespace")
  Call<List<WithTaskNvmfNamespace>> createNvmfNamespace(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<NvmfNamespaceCreationParams> nvmfNamespaceCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param nvmfNamespaceDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteNvmfNamespace&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-nvmf-namespace")
  Call<List<WithTaskDeleteNvmfNamespace>> deleteNvmfNamespace(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body NvmfNamespaceDeletionParams nvmfNamespaceDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getNvmfNamespacesRequestBody  (required)
   * @return Call&lt;List&lt;NvmfNamespace&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-nvmf-namespaces")
  Call<List<NvmfNamespace>> getNvmfNamespaces(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetNvmfNamespacesRequestBody getNvmfNamespacesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getNvmfNamespacesConnectionRequestBody  (required)
   * @return Call&lt;NvmfNamespaceConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-nvmf-namespaces-connection")
  Call<NvmfNamespaceConnection> getNvmfNamespacesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetNvmfNamespacesConnectionRequestBody getNvmfNamespacesConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param nvmfNamespaceRollbackParams  (required)
   * @return Call&lt;List&lt;WithTaskNvmfNamespace&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("rollback-nvmf-namespace-from-snapshot")
  Call<List<WithTaskNvmfNamespace>> rollbackNvmfNamespaceFromSnapshot(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<NvmfNamespaceRollbackParams> nvmfNamespaceRollbackParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param nvmfNamespaceUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskNvmfNamespace&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-nvmf-namespace")
  Call<List<WithTaskNvmfNamespace>> updateNvmfNamespace(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body NvmfNamespaceUpdationParams nvmfNamespaceUpdationParams
  );

}