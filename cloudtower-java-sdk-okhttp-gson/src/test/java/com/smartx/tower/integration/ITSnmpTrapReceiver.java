package com.smartx.tower.integration;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.smartx.tower.ApiException;
import com.smartx.tower.api.SnmpTrapReceiverApi;
import com.smartx.tower.model.*;

public class ITSnmpTrapReceiver extends IT {
  SnmpTrapReceiverApi api = null;
  HashMap<String, String> payloads = new HashMap<String, String>();

  @DataProvider(name = "payload")
  Object[][] data(Method m) {
    String payload = payloads.get(m.getName());
    return payload == null ? new Object[][] { { "{}" } } : new Object[][] { { payload } };
  }

  @BeforeClass
  public void getService() throws IOException {
    api = new SnmpTrapReceiverApi(client);
    // get payloads from resource file
    InputStream stream = getClass().getResourceAsStream("/SnmpTrapReceiver.json");
    if (stream == null) {
      return;
    }
    // convert payloads string as map
    payloads = gson.fromJson(Utils.readInputStream(stream), HashMap.class);
  }


  @Test(dataProvider = "payload")
  public void getSnmpTrapReceivers(String payload) {
    try {
      // parse params from json payload
      GetSnmpTrapReceiversRequestBody params = gson.fromJson(payload, GetSnmpTrapReceiversRequestBody.class);
      // do some modify to params(optional)
      List<SnmpTrapReceiver> result = api.getSnmpTrapReceivers("zh-CN", params);
      assertThat(result).as("check result of getSnmpTrapReceivers").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void getSnmpTrapReceiversConnection(String payload) {
    try {
      // parse params from json payload
      GetSnmpTrapReceiversConnectionRequestBody params = gson.fromJson(payload, GetSnmpTrapReceiversConnectionRequestBody.class);
      // do some modify to params(optional)
      SnmpTrapReceiverConnection result = api.getSnmpTrapReceiversConnection("zh-CN", params);
      assertThat(result).as("check result of getSnmpTrapReceiversConnection").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void createSnmpTrapReceiver(String payload) {
    try {
      // parse params from json payload
      List<SnmpTrapReceiverCreationParams> params = gson.fromJson(payload, List.class);
      // do some modify to params(optional)
      List<WithTaskSnmpTrapReceiver> result = api.createSnmpTrapReceiver("zh-CN", params);
      assertThat(result).as("check result of createSnmpTrapReceiver").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void updateSnmpTrapReceiver(String payload) {
    try {
      // parse params from json payload
      SnmpTrapReceiverUpdationParams params = gson.fromJson(payload, SnmpTrapReceiverUpdationParams.class);
      // do some modify to params(optional)
      List<WithTaskSnmpTrapReceiver> result = api.updateSnmpTrapReceiver("zh-CN", params);
      assertThat(result).as("check result of updateSnmpTrapReceiver").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

  @Test(dataProvider = "payload")
  public void deleteSnmpTrapReceiver(String payload) {
    try {
      // parse params from json payload
      SnmpTrapReceiverDeletionParams params = gson.fromJson(payload, SnmpTrapReceiverDeletionParams.class);
      // do some modify to params(optional)
      List<WithTaskDeleteSnmpTrapReceiver> result = api.deleteSnmpTrapReceiver("zh-CN", params);
      assertThat(result).as("check result of deleteSnmpTrapReceiver").isNotNull();
    } catch (ApiException e) {
      assertThat(true).as(e.getMessage()).isFalse();
    }
  }

}
