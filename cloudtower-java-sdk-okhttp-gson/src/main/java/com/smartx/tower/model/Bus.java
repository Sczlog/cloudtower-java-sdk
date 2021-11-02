/*
 * Tower SDK API
 * cloudtower operation API and SDK
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Bus
 */
@JsonAdapter(Bus.Adapter.class)
public enum Bus {
  
  IDE("IDE"),
  
  SCSI("SCSI"),
  
  VIRTIO("VIRTIO");

  private String value;

  Bus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Bus fromValue(String value) {
    for (Bus b : Bus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Bus> {
    @Override
    public void write(final JsonWriter jsonWriter, final Bus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Bus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Bus.fromValue(value);
    }
  }
}
