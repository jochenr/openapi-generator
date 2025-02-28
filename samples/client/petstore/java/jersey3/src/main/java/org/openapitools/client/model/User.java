/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import org.openapitools.client.JSON;


/**
 * User
 */
@JsonPropertyOrder({
  User.JSON_PROPERTY_ID,
  User.JSON_PROPERTY_USERNAME,
  User.JSON_PROPERTY_FIRST_NAME,
  User.JSON_PROPERTY_LAST_NAME,
  User.JSON_PROPERTY_EMAIL,
  User.JSON_PROPERTY_PASSWORD,
  User.JSON_PROPERTY_PHONE,
  User.JSON_PROPERTY_USER_STATUS,
  User.JSON_PROPERTY_OBJECT_WITH_NO_DECLARED_PROPS,
  User.JSON_PROPERTY_OBJECT_WITH_NO_DECLARED_PROPS_NULLABLE,
  User.JSON_PROPERTY_ANY_TYPE_PROP,
  User.JSON_PROPERTY_ANY_TYPE_PROP_NULLABLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0-SNAPSHOT")
public class User {
  public static final String JSON_PROPERTY_ID = "id";
  @jakarta.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_USERNAME = "username";
  @jakarta.annotation.Nullable
  private String username;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  @jakarta.annotation.Nullable
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  @jakarta.annotation.Nullable
  private String lastName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  @jakarta.annotation.Nullable
  private String email;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @jakarta.annotation.Nullable
  private String password;

  public static final String JSON_PROPERTY_PHONE = "phone";
  @jakarta.annotation.Nullable
  private String phone;

  public static final String JSON_PROPERTY_USER_STATUS = "userStatus";
  @jakarta.annotation.Nullable
  private Integer userStatus;

  public static final String JSON_PROPERTY_OBJECT_WITH_NO_DECLARED_PROPS = "objectWithNoDeclaredProps";
  @jakarta.annotation.Nullable
  private Object objectWithNoDeclaredProps;

  public static final String JSON_PROPERTY_OBJECT_WITH_NO_DECLARED_PROPS_NULLABLE = "objectWithNoDeclaredPropsNullable";
  private JsonNullable<Object> objectWithNoDeclaredPropsNullable = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_ANY_TYPE_PROP = "anyTypeProp";
  private JsonNullable<Object> anyTypeProp = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ANY_TYPE_PROP_NULLABLE = "anyTypePropNullable";
  private JsonNullable<Object> anyTypePropNullable = JsonNullable.<Object>of(null);

  public User() { 
  }

  public User id(@jakarta.annotation.Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@jakarta.annotation.Nullable Long id) {
    this.id = id;
  }


  public User username(@jakarta.annotation.Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(@jakarta.annotation.Nullable String username) {
    this.username = username;
  }


  public User firstName(@jakarta.annotation.Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(@jakarta.annotation.Nullable String firstName) {
    this.firstName = firstName;
  }


  public User lastName(@jakarta.annotation.Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(@jakarta.annotation.Nullable String lastName) {
    this.lastName = lastName;
  }


  public User email(@jakarta.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(@jakarta.annotation.Nullable String email) {
    this.email = email;
  }


  public User password(@jakarta.annotation.Nullable String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(@jakarta.annotation.Nullable String password) {
    this.password = password;
  }


  public User phone(@jakarta.annotation.Nullable String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(@jakarta.annotation.Nullable String phone) {
    this.phone = phone;
  }


  public User userStatus(@jakarta.annotation.Nullable Integer userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  /**
   * User Status
   * @return userStatus
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUserStatus() {
    return userStatus;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserStatus(@jakarta.annotation.Nullable Integer userStatus) {
    this.userStatus = userStatus;
  }


  public User objectWithNoDeclaredProps(@jakarta.annotation.Nullable Object objectWithNoDeclaredProps) {
    this.objectWithNoDeclaredProps = objectWithNoDeclaredProps;
    return this;
  }

  /**
   * test code generation for objects Value must be a map of strings to values. It cannot be the &#39;null&#39; value.
   * @return objectWithNoDeclaredProps
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_OBJECT_WITH_NO_DECLARED_PROPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getObjectWithNoDeclaredProps() {
    return objectWithNoDeclaredProps;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT_WITH_NO_DECLARED_PROPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjectWithNoDeclaredProps(@jakarta.annotation.Nullable Object objectWithNoDeclaredProps) {
    this.objectWithNoDeclaredProps = objectWithNoDeclaredProps;
  }


  public User objectWithNoDeclaredPropsNullable(@jakarta.annotation.Nullable Object objectWithNoDeclaredPropsNullable) {
    this.objectWithNoDeclaredPropsNullable = JsonNullable.<Object>of(objectWithNoDeclaredPropsNullable);
    return this;
  }

  /**
   * test code generation for nullable objects. Value must be a map of strings to values or the &#39;null&#39; value.
   * @return objectWithNoDeclaredPropsNullable
   */
  @jakarta.annotation.Nullable

  @JsonIgnore

  public Object getObjectWithNoDeclaredPropsNullable() {
        return objectWithNoDeclaredPropsNullable.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OBJECT_WITH_NO_DECLARED_PROPS_NULLABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getObjectWithNoDeclaredPropsNullable_JsonNullable() {
    return objectWithNoDeclaredPropsNullable;
  }
  
  @JsonProperty(JSON_PROPERTY_OBJECT_WITH_NO_DECLARED_PROPS_NULLABLE)
  public void setObjectWithNoDeclaredPropsNullable_JsonNullable(JsonNullable<Object> objectWithNoDeclaredPropsNullable) {
    this.objectWithNoDeclaredPropsNullable = objectWithNoDeclaredPropsNullable;
  }

  public void setObjectWithNoDeclaredPropsNullable(@jakarta.annotation.Nullable Object objectWithNoDeclaredPropsNullable) {
    this.objectWithNoDeclaredPropsNullable = JsonNullable.<Object>of(objectWithNoDeclaredPropsNullable);
  }


  public User anyTypeProp(@jakarta.annotation.Nullable Object anyTypeProp) {
    this.anyTypeProp = JsonNullable.<Object>of(anyTypeProp);
    return this;
  }

  /**
   * test code generation for any type Here the &#39;type&#39; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. See https://github.com/OAI/OpenAPI-Specification/issues/1389
   * @return anyTypeProp
   */
  @jakarta.annotation.Nullable

  @JsonIgnore

  public Object getAnyTypeProp() {
        return anyTypeProp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ANY_TYPE_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAnyTypeProp_JsonNullable() {
    return anyTypeProp;
  }
  
  @JsonProperty(JSON_PROPERTY_ANY_TYPE_PROP)
  public void setAnyTypeProp_JsonNullable(JsonNullable<Object> anyTypeProp) {
    this.anyTypeProp = anyTypeProp;
  }

  public void setAnyTypeProp(@jakarta.annotation.Nullable Object anyTypeProp) {
    this.anyTypeProp = JsonNullable.<Object>of(anyTypeProp);
  }


  public User anyTypePropNullable(@jakarta.annotation.Nullable Object anyTypePropNullable) {
    this.anyTypePropNullable = JsonNullable.<Object>of(anyTypePropNullable);
    return this;
  }

  /**
   * test code generation for any type Here the &#39;type&#39; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. The &#39;nullable&#39; attribute does not change the allowed values.
   * @return anyTypePropNullable
   */
  @jakarta.annotation.Nullable

  @JsonIgnore

  public Object getAnyTypePropNullable() {
        return anyTypePropNullable.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ANY_TYPE_PROP_NULLABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAnyTypePropNullable_JsonNullable() {
    return anyTypePropNullable;
  }
  
  @JsonProperty(JSON_PROPERTY_ANY_TYPE_PROP_NULLABLE)
  public void setAnyTypePropNullable_JsonNullable(JsonNullable<Object> anyTypePropNullable) {
    this.anyTypePropNullable = anyTypePropNullable;
  }

  public void setAnyTypePropNullable(@jakarta.annotation.Nullable Object anyTypePropNullable) {
    this.anyTypePropNullable = JsonNullable.<Object>of(anyTypePropNullable);
  }


  /**
   * Return true if this User object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o, false, null, true);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
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
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    objectWithNoDeclaredProps: ").append(toIndentedString(objectWithNoDeclaredProps)).append("\n");
    sb.append("    objectWithNoDeclaredPropsNullable: ").append(toIndentedString(objectWithNoDeclaredPropsNullable)).append("\n");
    sb.append("    anyTypeProp: ").append(toIndentedString(anyTypeProp)).append("\n");
    sb.append("    anyTypePropNullable: ").append(toIndentedString(anyTypePropNullable)).append("\n");
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

