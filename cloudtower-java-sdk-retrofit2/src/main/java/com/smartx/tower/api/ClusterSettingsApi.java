package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.ClusterSettings;
import com.smartx.tower.model.ClusterSettingsConnection;
import com.smartx.tower.model.GetClusterSettingsesConnectionRequestBody;
import com.smartx.tower.model.GetClusterSettingsesRequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ClusterSettingsApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getClusterSettingsesRequestBody  (required)
   * @return Call&lt;List&lt;ClusterSettings&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-cluster-settingses")
  Call<List<ClusterSettings>> getClusterSettingses(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetClusterSettingsesRequestBody getClusterSettingsesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getClusterSettingsesConnectionRequestBody  (required)
   * @return Call&lt;ClusterSettingsConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-cluster-settingses-connection")
  Call<ClusterSettingsConnection> getClusterSettingsesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetClusterSettingsesConnectionRequestBody getClusterSettingsesConnectionRequestBody
  );

}