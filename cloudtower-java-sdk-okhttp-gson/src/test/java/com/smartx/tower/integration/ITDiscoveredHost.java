package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.DiscoveredHostApi;
import com.smartx.tower.model.*;

public class ITDiscoveredHost extends ITBase {
  DiscoveredHostApi api = null;
  HashMap<String, Object> payloads = new HashMap<String, Object>();

  @DataProvider(name = "discoveredHostPayload")
  Object[][] data(Method m) {
    Object payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload.toString() } };
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
    payloads = gson.fromJson(ITUtils.readInputStream(stream), new TypeToken<HashMap<String, Object>>() {}.getType());
  }


  @Test(dataProvider = "discoveredHostPayload")
  public void getDiscoverHosts(String payload) {
    try {
      // parse params from json payload
      GetDiscoverHostsRequestBody params = gson.fromJson(payload, new TypeToken<GetDiscoverHostsRequestBody>() {}.getType());
      // do some modify to params(optional)
      List<DiscoveredHost> result = api.getDiscoverHosts(params, contentLanguage);
      assertThat(result).as("check result of getDiscoverHosts").isNotNull();
    } catch (ApiException e) {
      LOGGER.error(e.getResponseBody());
      LOGGER.error(e.getCode());
      assertThat(true).as(e.getResponseBody()).isFalse();
    }
  }

}
