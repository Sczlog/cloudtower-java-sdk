package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.ClusterUpgradeHistory;
import com.smartx.tower.model.ClusterUpgradeHistoryConnection;
import com.smartx.tower.model.GetClusterUpgradeHistoriesConnectionRequestBody;
import com.smartx.tower.model.GetClusterUpgradeHistoriesRequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ClusterUpgradeHistoryApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getClusterUpgradeHistoriesRequestBody  (required)
   * @return Call&lt;List&lt;ClusterUpgradeHistory&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-cluster-upgrade-histories")
  Call<List<ClusterUpgradeHistory>> getClusterUpgradeHistories(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetClusterUpgradeHistoriesRequestBody getClusterUpgradeHistoriesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getClusterUpgradeHistoriesConnectionRequestBody  (required)
   * @return Call&lt;ClusterUpgradeHistoryConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-cluster-upgrade-histories-connection")
  Call<ClusterUpgradeHistoryConnection> getClusterUpgradeHistoriesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetClusterUpgradeHistoriesConnectionRequestBody getClusterUpgradeHistoriesConnectionRequestBody
  );

}