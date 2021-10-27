package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetVmEntityFilterResultsConnectionRequestBody;
import com.smartx.tower.model.GetVmEntityFilterResultsRequestBody;
import com.smartx.tower.model.VmEntityFilterResult;
import com.smartx.tower.model.VmEntityFilterResultConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VmEntityFilterResultApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVmEntityFilterResultsRequestBody  (required)
   * @return Call&lt;List&lt;VmEntityFilterResult&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vm-entity-filter-results")
  Call<List<VmEntityFilterResult>> getVmEntityFilterResults(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetVmEntityFilterResultsRequestBody getVmEntityFilterResultsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getVmEntityFilterResultsConnectionRequestBody  (required)
   * @return Call&lt;VmEntityFilterResultConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-vm-entity-filter-results-connection")
  Call<VmEntityFilterResultConnection> getVmEntityFilterResultsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetVmEntityFilterResultsConnectionRequestBody getVmEntityFilterResultsConnectionRequestBody
  );

}
