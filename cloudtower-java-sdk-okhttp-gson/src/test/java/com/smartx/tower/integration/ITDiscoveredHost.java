package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.DiscoveredHostApi;
import com.smartx.tower.model.*;

public class ITDiscoveredHost extends IT {
  DiscoveredHostApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new DiscoveredHostApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/DiscoveredHost.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getDiscoverHosts(String payload) {
    try {
      // parse params from json payload
      GetDiscoverHostsRequestBody params = gson.fromJson(payload, GetDiscoverHostsRequestBody.class);
      // do some modify to params(optional)
      List<DiscoveredHost> result = api.getDiscoverHosts("zh-CN", params);
      assertThat(result).as("check result of getDiscoverHosts").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
