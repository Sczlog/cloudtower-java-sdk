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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.smartx.tower.model.AlertRuleObject;
import com.smartx.tower.model.AlertRuleThresholds;
import com.smartx.tower.model.AlertRuleUnit;
import com.smartx.tower.model.BrickTopoPowers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GlobalAlertRule
 */
@JsonPropertyOrder({
  GlobalAlertRule.JSON_PROPERTY_ALERT_RULES,
  GlobalAlertRule.JSON_PROPERTY_BOOLEAN,
  GlobalAlertRule.JSON_PROPERTY_CAUSE,
  GlobalAlertRule.JSON_PROPERTY_DEFAULT_THRESHOLDS,
  GlobalAlertRule.JSON_PROPERTY_DISABLED,
  GlobalAlertRule.JSON_PROPERTY_ID,
  GlobalAlertRule.JSON_PROPERTY_IMPACT,
  GlobalAlertRule.JSON_PROPERTY_MESSAGE,
  GlobalAlertRule.JSON_PROPERTY_NAME,
  GlobalAlertRule.JSON_PROPERTY_OBJECT,
  GlobalAlertRule.JSON_PROPERTY_OPERATOR,
  GlobalAlertRule.JSON_PROPERTY_SOLUTION,
  GlobalAlertRule.JSON_PROPERTY_THRESHOLDS,
  GlobalAlertRule.JSON_PROPERTY_UNIT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T15:59:14.939791800+08:00[Asia/Shanghai]")
public class GlobalAlertRule {
  public static final String JSON_PROPERTY_ALERT_RULES = "alert_rules";
  private JsonNullable<List<BrickTopoPowers>> alertRules = JsonNullable.<List<BrickTopoPowers>>undefined();

  public static final String JSON_PROPERTY_BOOLEAN = "boolean";
  private Boolean _boolean;

  public static final String JSON_PROPERTY_CAUSE = "cause";
  private String cause;

  public static final String JSON_PROPERTY_DEFAULT_THRESHOLDS = "default_thresholds";
  private List<AlertRuleThresholds> defaultThresholds = new ArrayList<>();

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IMPACT = "impact";
  private String impact;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private JsonNullable<AlertRuleObject> _object = JsonNullable.<AlertRuleObject>undefined();

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private String operator;

  public static final String JSON_PROPERTY_SOLUTION = "solution";
  private String solution;

  public static final String JSON_PROPERTY_THRESHOLDS = "thresholds";
  private List<AlertRuleThresholds> thresholds = new ArrayList<>();

  public static final String JSON_PROPERTY_UNIT = "unit";
  private AlertRuleUnit unit;


  public GlobalAlertRule alertRules(List<BrickTopoPowers> alertRules) {
    this.alertRules = JsonNullable.<List<BrickTopoPowers>>of(alertRules);
    return this;
  }

  public GlobalAlertRule addAlertRulesItem(BrickTopoPowers alertRulesItem) {
    if (this.alertRules == null || !this.alertRules.isPresent()) {
      this.alertRules = JsonNullable.<List<BrickTopoPowers>>of(new ArrayList<>());
    }
    try {
      this.alertRules.get().add(alertRulesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get alertRules
   * @return alertRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<BrickTopoPowers> getAlertRules() {
        return alertRules.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALERT_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<BrickTopoPowers>> getAlertRules_JsonNullable() {
    return alertRules;
  }
  
  @JsonProperty(JSON_PROPERTY_ALERT_RULES)
  public void setAlertRules_JsonNullable(JsonNullable<List<BrickTopoPowers>> alertRules) {
    this.alertRules = alertRules;
  }

  public void setAlertRules(List<BrickTopoPowers> alertRules) {
    this.alertRules = JsonNullable.<List<BrickTopoPowers>>of(alertRules);
  }


  public GlobalAlertRule _boolean(Boolean _boolean) {
    this._boolean = _boolean;
    return this;
  }

   /**
   * Get _boolean
   * @return _boolean
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getBoolean() {
    return _boolean;
  }


  @JsonProperty(JSON_PROPERTY_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBoolean(Boolean _boolean) {
    this._boolean = _boolean;
  }


  public GlobalAlertRule cause(String cause) {
    this.cause = cause;
    return this;
  }

   /**
   * Get cause
   * @return cause
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CAUSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCause() {
    return cause;
  }


  @JsonProperty(JSON_PROPERTY_CAUSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCause(String cause) {
    this.cause = cause;
  }


  public GlobalAlertRule defaultThresholds(List<AlertRuleThresholds> defaultThresholds) {
    this.defaultThresholds = defaultThresholds;
    return this;
  }

  public GlobalAlertRule addDefaultThresholdsItem(AlertRuleThresholds defaultThresholdsItem) {
    this.defaultThresholds.add(defaultThresholdsItem);
    return this;
  }

   /**
   * Get defaultThresholds
   * @return defaultThresholds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_THRESHOLDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AlertRuleThresholds> getDefaultThresholds() {
    return defaultThresholds;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_THRESHOLDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDefaultThresholds(List<AlertRuleThresholds> defaultThresholds) {
    this.defaultThresholds = defaultThresholds;
  }


  public GlobalAlertRule disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDisabled() {
    return disabled;
  }


  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public GlobalAlertRule id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public GlobalAlertRule impact(String impact) {
    this.impact = impact;
    return this;
  }

   /**
   * Get impact
   * @return impact
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IMPACT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getImpact() {
    return impact;
  }


  @JsonProperty(JSON_PROPERTY_IMPACT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImpact(String impact) {
    this.impact = impact;
  }


  public GlobalAlertRule message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(String message) {
    this.message = message;
  }


  public GlobalAlertRule name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public GlobalAlertRule _object(AlertRuleObject _object) {
    this._object = JsonNullable.<AlertRuleObject>of(_object);
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public AlertRuleObject getObject() {
        return _object.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<AlertRuleObject> getObject_JsonNullable() {
    return _object;
  }
  
  @JsonProperty(JSON_PROPERTY_OBJECT)
  public void setObject_JsonNullable(JsonNullable<AlertRuleObject> _object) {
    this._object = _object;
  }

  public void setObject(AlertRuleObject _object) {
    this._object = JsonNullable.<AlertRuleObject>of(_object);
  }


  public GlobalAlertRule operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOperator() {
    return operator;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperator(String operator) {
    this.operator = operator;
  }


  public GlobalAlertRule solution(String solution) {
    this.solution = solution;
    return this;
  }

   /**
   * Get solution
   * @return solution
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SOLUTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSolution() {
    return solution;
  }


  @JsonProperty(JSON_PROPERTY_SOLUTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSolution(String solution) {
    this.solution = solution;
  }


  public GlobalAlertRule thresholds(List<AlertRuleThresholds> thresholds) {
    this.thresholds = thresholds;
    return this;
  }

  public GlobalAlertRule addThresholdsItem(AlertRuleThresholds thresholdsItem) {
    this.thresholds.add(thresholdsItem);
    return this;
  }

   /**
   * Get thresholds
   * @return thresholds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_THRESHOLDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AlertRuleThresholds> getThresholds() {
    return thresholds;
  }


  @JsonProperty(JSON_PROPERTY_THRESHOLDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThresholds(List<AlertRuleThresholds> thresholds) {
    this.thresholds = thresholds;
  }


  public GlobalAlertRule unit(AlertRuleUnit unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AlertRuleUnit getUnit() {
    return unit;
  }


  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnit(AlertRuleUnit unit) {
    this.unit = unit;
  }


  /**
   * Return true if this GlobalAlertRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalAlertRule globalAlertRule = (GlobalAlertRule) o;
    return equalsNullable(this.alertRules, globalAlertRule.alertRules) &&
        Objects.equals(this._boolean, globalAlertRule._boolean) &&
        Objects.equals(this.cause, globalAlertRule.cause) &&
        Objects.equals(this.defaultThresholds, globalAlertRule.defaultThresholds) &&
        Objects.equals(this.disabled, globalAlertRule.disabled) &&
        Objects.equals(this.id, globalAlertRule.id) &&
        Objects.equals(this.impact, globalAlertRule.impact) &&
        Objects.equals(this.message, globalAlertRule.message) &&
        Objects.equals(this.name, globalAlertRule.name) &&
        equalsNullable(this._object, globalAlertRule._object) &&
        Objects.equals(this.operator, globalAlertRule.operator) &&
        Objects.equals(this.solution, globalAlertRule.solution) &&
        Objects.equals(this.thresholds, globalAlertRule.thresholds) &&
        Objects.equals(this.unit, globalAlertRule.unit);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(alertRules), _boolean, cause, defaultThresholds, disabled, id, impact, message, name, hashCodeNullable(_object), operator, solution, thresholds, unit);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalAlertRule {\n");
    sb.append("    alertRules: ").append(toIndentedString(alertRules)).append("\n");
    sb.append("    _boolean: ").append(toIndentedString(_boolean)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    defaultThresholds: ").append(toIndentedString(defaultThresholds)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

