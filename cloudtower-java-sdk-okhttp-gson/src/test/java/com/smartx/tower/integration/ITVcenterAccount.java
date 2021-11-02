package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.VcenterAccountApi;
import com.smartx.tower.model.*;

public class ITVcenterAccount extends IT {
  VcenterAccountApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new VcenterAccountApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VcenterAccount.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getVcenterAccounts(String payload) {
    try {
      // parse params from json payload
      GetVcenterAccountsRequestBody params = gson.fromJson(payload, GetVcenterAccountsRequestBody.class);
      // do some modify to params(optional)
      List<VcenterAccount> result = api.getVcenterAccounts("zh-CN", params);
      assertThat(result).as("check result of getVcenterAccounts").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getVcenterAccountsConnection(String payload) {
    try {
      // parse params from json payload
      GetVcenterAccountsConnectionRequestBody params = gson.fromJson(payload, GetVcenterAccountsConnectionRequestBody.class);
      // do some modify to params(optional)
      VcenterAccountConnection result = api.getVcenterAccountsConnection("zh-CN", params);
      assertThat(result).as("check result of getVcenterAccountsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
