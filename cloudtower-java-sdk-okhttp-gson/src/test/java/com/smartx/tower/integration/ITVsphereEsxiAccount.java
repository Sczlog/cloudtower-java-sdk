package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.VsphereEsxiAccountApi;
import com.smartx.tower.model.*;

public class ITVsphereEsxiAccount extends IT {
  VsphereEsxiAccountApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new VsphereEsxiAccountApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/VsphereEsxiAccount.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getVsphereEsxiAccounts(String payload) {
    try {
      // parse params from json payload
      GetVsphereEsxiAccountsRequestBody params = gson.fromJson(payload, GetVsphereEsxiAccountsRequestBody.class);
      // do some modify to params(optional)
      List<VsphereEsxiAccount> result = api.getVsphereEsxiAccounts("zh-CN", params);
      assertThat(result).as("check result of getVsphereEsxiAccounts").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getVsphereEsxiAccountsConnection(String payload) {
    try {
      // parse params from json payload
      GetVsphereEsxiAccountsConnectionRequestBody params = gson.fromJson(payload, GetVsphereEsxiAccountsConnectionRequestBody.class);
      // do some modify to params(optional)
      VsphereEsxiAccountConnection result = api.getVsphereEsxiAccountsConnection("zh-CN", params);
      assertThat(result).as("check result of getVsphereEsxiAccountsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
