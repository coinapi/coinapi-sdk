/*
 * OnChain API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * BigInteger
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-04T09:38:01.556661Z[Etc/UTC]")
public class BigInteger {
  public static final String SERIALIZED_NAME_IS_POWER_OF_TWO = "is_power_of_two";
  @SerializedName(SERIALIZED_NAME_IS_POWER_OF_TWO)
  private Boolean isPowerOfTwo;

  public static final String SERIALIZED_NAME_IS_ZERO = "is_zero";
  @SerializedName(SERIALIZED_NAME_IS_ZERO)
  private Boolean isZero;

  public static final String SERIALIZED_NAME_IS_ONE = "is_one";
  @SerializedName(SERIALIZED_NAME_IS_ONE)
  private Boolean isOne;

  public static final String SERIALIZED_NAME_IS_EVEN = "is_even";
  @SerializedName(SERIALIZED_NAME_IS_EVEN)
  private Boolean isEven;

  public static final String SERIALIZED_NAME_SIGN = "sign";
  @SerializedName(SERIALIZED_NAME_SIGN)
  private Integer sign;

  public BigInteger() {
  }

  
  public BigInteger(
     Boolean isPowerOfTwo, 
     Boolean isZero, 
     Boolean isOne, 
     Boolean isEven, 
     Integer sign
  ) {
    this();
    this.isPowerOfTwo = isPowerOfTwo;
    this.isZero = isZero;
    this.isOne = isOne;
    this.isEven = isEven;
    this.sign = sign;
  }

   /**
   * Get isPowerOfTwo
   * @return isPowerOfTwo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsPowerOfTwo() {
    return isPowerOfTwo;
  }




   /**
   * Get isZero
   * @return isZero
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsZero() {
    return isZero;
  }




   /**
   * Get isOne
   * @return isOne
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsOne() {
    return isOne;
  }




   /**
   * Get isEven
   * @return isEven
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsEven() {
    return isEven;
  }




   /**
   * Get sign
   * @return sign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSign() {
    return sign;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BigInteger bigInteger = (BigInteger) o;
    return Objects.equals(this.isPowerOfTwo, bigInteger.isPowerOfTwo) &&
        Objects.equals(this.isZero, bigInteger.isZero) &&
        Objects.equals(this.isOne, bigInteger.isOne) &&
        Objects.equals(this.isEven, bigInteger.isEven) &&
        Objects.equals(this.sign, bigInteger.sign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPowerOfTwo, isZero, isOne, isEven, sign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BigInteger {\n");
    sb.append("    isPowerOfTwo: ").append(toIndentedString(isPowerOfTwo)).append("\n");
    sb.append("    isZero: ").append(toIndentedString(isZero)).append("\n");
    sb.append("    isOne: ").append(toIndentedString(isOne)).append("\n");
    sb.append("    isEven: ").append(toIndentedString(isEven)).append("\n");
    sb.append("    sign: ").append(toIndentedString(sign)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("is_power_of_two");
    openapiFields.add("is_zero");
    openapiFields.add("is_one");
    openapiFields.add("is_even");
    openapiFields.add("sign");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BigInteger
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BigInteger.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BigInteger is not found in the empty JSON string", BigInteger.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BigInteger.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BigInteger` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BigInteger.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BigInteger' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BigInteger> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BigInteger.class));

       return (TypeAdapter<T>) new TypeAdapter<BigInteger>() {
           @Override
           public void write(JsonWriter out, BigInteger value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BigInteger read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BigInteger given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BigInteger
  * @throws IOException if the JSON string is invalid with respect to BigInteger
  */
  public static BigInteger fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BigInteger.class);
  }

 /**
  * Convert an instance of BigInteger to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

