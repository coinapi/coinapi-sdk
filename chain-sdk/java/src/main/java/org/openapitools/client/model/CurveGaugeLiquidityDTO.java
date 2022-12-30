/*
 * On Chain Dapps - REST API
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
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * CurveGaugeLiquidityDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-30T09:47:49.441837Z[Etc/UTC]")
public class CurveGaugeLiquidityDTO {
  public static final String SERIALIZED_NAME_ENTRY_TIME = "entry_time";
  @SerializedName(SERIALIZED_NAME_ENTRY_TIME)
  private OffsetDateTime entryTime;

  public static final String SERIALIZED_NAME_RECV_TIME = "recv_time";
  @SerializedName(SERIALIZED_NAME_RECV_TIME)
  private OffsetDateTime recvTime;

  public static final String SERIALIZED_NAME_BLOCK_NUMBER = "block_number";
  @SerializedName(SERIALIZED_NAME_BLOCK_NUMBER)
  private Long blockNumber;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_GAUGE = "gauge";
  @SerializedName(SERIALIZED_NAME_GAUGE)
  private String gauge;

  public static final String SERIALIZED_NAME_ORIGINAL_BALANCE = "original_balance";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_BALANCE)
  private String originalBalance;

  public static final String SERIALIZED_NAME_ORIGINAL_SUPPLY = "original_supply";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_SUPPLY)
  private String originalSupply;

  public static final String SERIALIZED_NAME_WORKING_BALANCE = "working_balance";
  @SerializedName(SERIALIZED_NAME_WORKING_BALANCE)
  private String workingBalance;

  public static final String SERIALIZED_NAME_WORKING_SUPPLY = "working_supply";
  @SerializedName(SERIALIZED_NAME_WORKING_SUPPLY)
  private String workingSupply;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_BLOCK = "block";
  @SerializedName(SERIALIZED_NAME_BLOCK)
  private String block;

  public static final String SERIALIZED_NAME_TRANSACTION = "transaction";
  @SerializedName(SERIALIZED_NAME_TRANSACTION)
  private String transaction;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public CurveGaugeLiquidityDTO() {
  }

  public CurveGaugeLiquidityDTO entryTime(OffsetDateTime entryTime) {
    
    this.entryTime = entryTime;
    return this;
  }

   /**
   * Get entryTime
   * @return entryTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEntryTime() {
    return entryTime;
  }


  public void setEntryTime(OffsetDateTime entryTime) {
    this.entryTime = entryTime;
  }


  public CurveGaugeLiquidityDTO recvTime(OffsetDateTime recvTime) {
    
    this.recvTime = recvTime;
    return this;
  }

   /**
   * Get recvTime
   * @return recvTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getRecvTime() {
    return recvTime;
  }


  public void setRecvTime(OffsetDateTime recvTime) {
    this.recvTime = recvTime;
  }


  public CurveGaugeLiquidityDTO blockNumber(Long blockNumber) {
    
    this.blockNumber = blockNumber;
    return this;
  }

   /**
   * Number of block in which entity was recorded.
   * @return blockNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of block in which entity was recorded.")

  public Long getBlockNumber() {
    return blockNumber;
  }


  public void setBlockNumber(Long blockNumber) {
    this.blockNumber = blockNumber;
  }


  public CurveGaugeLiquidityDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CurveGaugeLiquidityDTO user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * 
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }


  public CurveGaugeLiquidityDTO gauge(String gauge) {
    
    this.gauge = gauge;
    return this;
  }

   /**
   * 
   * @return gauge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGauge() {
    return gauge;
  }


  public void setGauge(String gauge) {
    this.gauge = gauge;
  }


  public CurveGaugeLiquidityDTO originalBalance(String originalBalance) {
    
    this.originalBalance = originalBalance;
    return this;
  }

   /**
   * 
   * @return originalBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalBalance() {
    return originalBalance;
  }


  public void setOriginalBalance(String originalBalance) {
    this.originalBalance = originalBalance;
  }


  public CurveGaugeLiquidityDTO originalSupply(String originalSupply) {
    
    this.originalSupply = originalSupply;
    return this;
  }

   /**
   * 
   * @return originalSupply
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalSupply() {
    return originalSupply;
  }


  public void setOriginalSupply(String originalSupply) {
    this.originalSupply = originalSupply;
  }


  public CurveGaugeLiquidityDTO workingBalance(String workingBalance) {
    
    this.workingBalance = workingBalance;
    return this;
  }

   /**
   * 
   * @return workingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWorkingBalance() {
    return workingBalance;
  }


  public void setWorkingBalance(String workingBalance) {
    this.workingBalance = workingBalance;
  }


  public CurveGaugeLiquidityDTO workingSupply(String workingSupply) {
    
    this.workingSupply = workingSupply;
    return this;
  }

   /**
   * 
   * @return workingSupply
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWorkingSupply() {
    return workingSupply;
  }


  public void setWorkingSupply(String workingSupply) {
    this.workingSupply = workingSupply;
  }


  public CurveGaugeLiquidityDTO timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * 
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public CurveGaugeLiquidityDTO block(String block) {
    
    this.block = block;
    return this;
  }

   /**
   * 
   * @return block
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBlock() {
    return block;
  }


  public void setBlock(String block) {
    this.block = block;
  }


  public CurveGaugeLiquidityDTO transaction(String transaction) {
    
    this.transaction = transaction;
    return this;
  }

   /**
   * 
   * @return transaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTransaction() {
    return transaction;
  }


  public void setTransaction(String transaction) {
    this.transaction = transaction;
  }


  public CurveGaugeLiquidityDTO vid(Long vid) {
    
    this.vid = vid;
    return this;
  }

   /**
   * 
   * @return vid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getVid() {
    return vid;
  }


  public void setVid(Long vid) {
    this.vid = vid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurveGaugeLiquidityDTO curveGaugeLiquidityDTO = (CurveGaugeLiquidityDTO) o;
    return Objects.equals(this.entryTime, curveGaugeLiquidityDTO.entryTime) &&
        Objects.equals(this.recvTime, curveGaugeLiquidityDTO.recvTime) &&
        Objects.equals(this.blockNumber, curveGaugeLiquidityDTO.blockNumber) &&
        Objects.equals(this.id, curveGaugeLiquidityDTO.id) &&
        Objects.equals(this.user, curveGaugeLiquidityDTO.user) &&
        Objects.equals(this.gauge, curveGaugeLiquidityDTO.gauge) &&
        Objects.equals(this.originalBalance, curveGaugeLiquidityDTO.originalBalance) &&
        Objects.equals(this.originalSupply, curveGaugeLiquidityDTO.originalSupply) &&
        Objects.equals(this.workingBalance, curveGaugeLiquidityDTO.workingBalance) &&
        Objects.equals(this.workingSupply, curveGaugeLiquidityDTO.workingSupply) &&
        Objects.equals(this.timestamp, curveGaugeLiquidityDTO.timestamp) &&
        Objects.equals(this.block, curveGaugeLiquidityDTO.block) &&
        Objects.equals(this.transaction, curveGaugeLiquidityDTO.transaction) &&
        Objects.equals(this.vid, curveGaugeLiquidityDTO.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, user, gauge, originalBalance, originalSupply, workingBalance, workingSupply, timestamp, block, transaction, vid);
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
    sb.append("class CurveGaugeLiquidityDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    gauge: ").append(toIndentedString(gauge)).append("\n");
    sb.append("    originalBalance: ").append(toIndentedString(originalBalance)).append("\n");
    sb.append("    originalSupply: ").append(toIndentedString(originalSupply)).append("\n");
    sb.append("    workingBalance: ").append(toIndentedString(workingBalance)).append("\n");
    sb.append("    workingSupply: ").append(toIndentedString(workingSupply)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
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
    openapiFields.add("entry_time");
    openapiFields.add("recv_time");
    openapiFields.add("block_number");
    openapiFields.add("id");
    openapiFields.add("user");
    openapiFields.add("gauge");
    openapiFields.add("original_balance");
    openapiFields.add("original_supply");
    openapiFields.add("working_balance");
    openapiFields.add("working_supply");
    openapiFields.add("timestamp");
    openapiFields.add("block");
    openapiFields.add("transaction");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CurveGaugeLiquidityDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CurveGaugeLiquidityDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CurveGaugeLiquidityDTO is not found in the empty JSON string", CurveGaugeLiquidityDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CurveGaugeLiquidityDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CurveGaugeLiquidityDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
      if ((jsonObj.get("gauge") != null && !jsonObj.get("gauge").isJsonNull()) && !jsonObj.get("gauge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gauge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gauge").toString()));
      }
      if ((jsonObj.get("original_balance") != null && !jsonObj.get("original_balance").isJsonNull()) && !jsonObj.get("original_balance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_balance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_balance").toString()));
      }
      if ((jsonObj.get("original_supply") != null && !jsonObj.get("original_supply").isJsonNull()) && !jsonObj.get("original_supply").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_supply` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_supply").toString()));
      }
      if ((jsonObj.get("working_balance") != null && !jsonObj.get("working_balance").isJsonNull()) && !jsonObj.get("working_balance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `working_balance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("working_balance").toString()));
      }
      if ((jsonObj.get("working_supply") != null && !jsonObj.get("working_supply").isJsonNull()) && !jsonObj.get("working_supply").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `working_supply` to be a primitive type in the JSON string but got `%s`", jsonObj.get("working_supply").toString()));
      }
      if ((jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull()) && !jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
      if ((jsonObj.get("block") != null && !jsonObj.get("block").isJsonNull()) && !jsonObj.get("block").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `block` to be a primitive type in the JSON string but got `%s`", jsonObj.get("block").toString()));
      }
      if ((jsonObj.get("transaction") != null && !jsonObj.get("transaction").isJsonNull()) && !jsonObj.get("transaction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CurveGaugeLiquidityDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CurveGaugeLiquidityDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CurveGaugeLiquidityDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CurveGaugeLiquidityDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<CurveGaugeLiquidityDTO>() {
           @Override
           public void write(JsonWriter out, CurveGaugeLiquidityDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CurveGaugeLiquidityDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CurveGaugeLiquidityDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CurveGaugeLiquidityDTO
  * @throws IOException if the JSON string is invalid with respect to CurveGaugeLiquidityDTO
  */
  public static CurveGaugeLiquidityDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CurveGaugeLiquidityDTO.class);
  }

 /**
  * Convert an instance of CurveGaugeLiquidityDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

