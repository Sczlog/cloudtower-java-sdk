package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.UserAuditLogApi;
import com.smartx.tower.model.*;

public class ITUserAuditLog extends IT {
  UserAuditLogApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new UserAuditLogApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/UserAuditLog.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getUserAuditLogs(String payload) {
    try {
      // parse params from json payload
      GetUserAuditLogsRequestBody params = gson.fromJson(payload, GetUserAuditLogsRequestBody.class);
      // do some modify to params(optional)
      List<UserAuditLog> result = api.getUserAuditLogs("zh-CN", params);
      assertThat(result).as("check result of getUserAuditLogs").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getUserAuditLogsConnection(String payload) {
    try {
      // parse params from json payload
      GetUserAuditLogsConnectionRequestBody params = gson.fromJson(payload, GetUserAuditLogsConnectionRequestBody.class);
      // do some modify to params(optional)
      UserAuditLogConnection result = api.getUserAuditLogsConnection("zh-CN", params);
      assertThat(result).as("check result of getUserAuditLogsConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}