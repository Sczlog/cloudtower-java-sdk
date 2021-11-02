package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetNamespaceGroupsConnectionRequestBody;
import com.smartx.tower.model.GetNamespaceGroupsRequestBody;
import com.smartx.tower.model.NamespaceGroup;
import com.smartx.tower.model.NamespaceGroupConnection;
import com.smartx.tower.model.NamespaceGroupCreationParams;
import com.smartx.tower.model.NamespaceGroupDeletionParams;
import com.smartx.tower.model.NamespaceGroupUpdationParams;
import com.smartx.tower.model.WithTaskDeleteNamespaceGroup;
import com.smartx.tower.model.WithTaskNamespaceGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NamespaceGroupApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param namespaceGroupCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskNamespaceGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-namespace-group")
  Call<List<WithTaskNamespaceGroup>> createNamespaceGroup(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<NamespaceGroupCreationParams> namespaceGroupCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param namespaceGroupDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteNamespaceGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-namespace-group")
  Call<List<WithTaskDeleteNamespaceGroup>> deleteNamespaceGroup(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body NamespaceGroupDeletionParams namespaceGroupDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getNamespaceGroupsRequestBody  (required)
   * @return Call&lt;List&lt;NamespaceGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-namespace-groups")
  Call<List<NamespaceGroup>> getNamespaceGroups(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetNamespaceGroupsRequestBody getNamespaceGroupsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getNamespaceGroupsConnectionRequestBody  (required)
   * @return Call&lt;NamespaceGroupConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-namespace-groups-connection")
  Call<NamespaceGroupConnection> getNamespaceGroupsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetNamespaceGroupsConnectionRequestBody getNamespaceGroupsConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param namespaceGroupUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskNamespaceGroup&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-namespace-group")
  Call<List<WithTaskNamespaceGroup>> updateNamespaceGroup(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body NamespaceGroupUpdationParams namespaceGroupUpdationParams
  );

}