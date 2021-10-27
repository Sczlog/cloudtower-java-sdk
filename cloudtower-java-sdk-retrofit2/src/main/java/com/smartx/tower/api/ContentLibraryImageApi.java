package com.smartx.tower.api;

import com.smartx.tower.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.smartx.tower.model.ContentLibraryImage;
import com.smartx.tower.model.ContentLibraryImageConnection;
import com.smartx.tower.model.GetContentLibraryImagesConnectionRequestBody;
import com.smartx.tower.model.GetContentLibraryImagesRequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ContentLibraryImageApi {
  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getContentLibraryImagesRequestBody  (required)
   * @return Call&lt;List&lt;ContentLibraryImage&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-content-library-images")
  Call<List<ContentLibraryImage>> getContentLibraryImages(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetContentLibraryImagesRequestBody getContentLibraryImagesRequestBody
  );

  /**
   * 
   * 
   * @param contentLanguage  (required)
   * @param getContentLibraryImagesConnectionRequestBody  (required)
   * @return Call&lt;ContentLibraryImageConnection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("get-content-library-images-connection")
  Call<ContentLibraryImageConnection> getContentLibraryImagesConnection(
    @retrofit2.http.Header("content-language") String contentLanguage, @retrofit2.http.Body GetContentLibraryImagesConnectionRequestBody getContentLibraryImagesConnectionRequestBody
  );

}
