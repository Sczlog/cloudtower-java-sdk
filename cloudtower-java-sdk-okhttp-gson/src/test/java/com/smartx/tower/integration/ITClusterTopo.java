package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.ClusterTopoApi;
import com.smartx.tower.model.*;

public class ITClusterTopo extends IT {
  ClusterTopoApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new ClusterTopoApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/ClusterTopo.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getClusterTopoes(String payload) {
    try {
      // parse params from json payload
      GetClusterTopoesRequestBody params = gson.fromJson(payload, GetClusterTopoesRequestBody.class);
      // do some modify to params(optional)
      List<ClusterTopo> result = api.getClusterTopoes("zh-CN", params);
      assertThat(result).as("check result of getClusterTopoes").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getClusterTopoesConnection(String payload) {
    try {
      // parse params from json payload
      GetClusterTopoesConnectionRequestBody params = gson.fromJson(payload, GetClusterTopoesConnectionRequestBody.class);
      // do some modify to params(optional)
      ClusterTopoConnection result = api.getClusterTopoesConnection("zh-CN", params);
      assertThat(result).as("check result of getClusterTopoesConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}