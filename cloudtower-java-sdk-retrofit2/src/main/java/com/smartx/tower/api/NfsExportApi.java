package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.GetNfsExportsConnectionRequestBody;
import com.smartx.tower.model.GetNfsExportsRequestBody;
import com.smartx.tower.model.NfsExport;
import com.smartx.tower.model.NfsExportConnection;
import com.smartx.tower.model.NfsExportCreationParams;
import com.smartx.tower.model.NfsExportDeletionParams;
import com.smartx.tower.model.NfsExportUpdationParams;
import com.smartx.tower.model.WithTaskDeleteNfsExport;
import com.smartx.tower.model.WithTaskNfsExport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NfsExportApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param nfsExportCreationParams  (required)
   * @return Call&lt;List&lt;WithTaskNfsExport&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("create-nfs-export")
  Call<List<WithTaskNfsExport>> createNfsExport(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body List<NfsExportCreationParams> nfsExportCreationParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param nfsExportDeletionParams  (required)
   * @return Call&lt;List&lt;WithTaskDeleteNfsExport&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("delete-nfs-export")
  Call<List<WithTaskDeleteNfsExport>> deleteNfsExport(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body NfsExportDeletionParams nfsExportDeletionParams
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getNfsExportsRequestBody  (required)
   * @return Call&lt;List&lt;NfsExport&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-nfs-exports")
  Call<List<NfsExport>> getNfsExports(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetNfsExportsRequestBody getNfsExportsRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getNfsExportsConnectionRequestBody  (required)
   * @return Call&lt;NfsExportConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-nfs-exports-connection")
  Call<NfsExportConnection> getNfsExportsConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetNfsExportsConnectionRequestBody getNfsExportsConnectionRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param nfsExportUpdationParams  (required)
   * @return Call&lt;List&lt;WithTaskNfsExport&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("update-nfs-export")
  Call<List<WithTaskNfsExport>> updateNfsExport(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body NfsExportUpdationParams nfsExportUpdationParams
  );

}