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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * MintV3DTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-28T18:40:31.226497Z[Etc/UTC]")
public class MintV3DTO {
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

  public static final String SERIALIZED_NAME_TRANSACTION = "transaction";
  @SerializedName(SERIALIZED_NAME_TRANSACTION)
  private String transaction;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_POOL = "pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  private String pool;

  public static final String SERIALIZED_NAME_TOKEN0 = "token_0";
  @SerializedName(SERIALIZED_NAME_TOKEN0)
  private String token0;

  public static final String SERIALIZED_NAME_TOKEN1 = "token_1";
  @SerializedName(SERIALIZED_NAME_TOKEN1)
  private String token1;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private String sender;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private String origin;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_AMOUNT0 = "amount_0";
  @SerializedName(SERIALIZED_NAME_AMOUNT0)
  private String amount0;

  public static final String SERIALIZED_NAME_AMOUNT1 = "amount_1";
  @SerializedName(SERIALIZED_NAME_AMOUNT1)
  private String amount1;

  public static final String SERIALIZED_NAME_AMOUNT_USD = "amount_usd";
  @SerializedName(SERIALIZED_NAME_AMOUNT_USD)
  private String amountUsd;

  public static final String SERIALIZED_NAME_TICK_LOWER = "tick_lower";
  @SerializedName(SERIALIZED_NAME_TICK_LOWER)
  private String tickLower;

  public static final String SERIALIZED_NAME_TICK_UPPER = "tick_upper";
  @SerializedName(SERIALIZED_NAME_TICK_UPPER)
  private String tickUpper;

  public static final String SERIALIZED_NAME_LOG_INDEX = "log_index";
  @SerializedName(SERIALIZED_NAME_LOG_INDEX)
  private String logIndex;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public MintV3DTO() {
  }

  public MintV3DTO entryTime(OffsetDateTime entryTime) {
    
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


  public MintV3DTO recvTime(OffsetDateTime recvTime) {
    
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


  public MintV3DTO blockNumber(Long blockNumber) {
    
    this.blockNumber = blockNumber;
    return this;
  }

   /**
   * 
   * @return blockNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBlockNumber() {
    return blockNumber;
  }


  public void setBlockNumber(Long blockNumber) {
    this.blockNumber = blockNumber;
  }


  public MintV3DTO id(String id) {
    
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


  public MintV3DTO transaction(String transaction) {
    
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


  public MintV3DTO timestamp(String timestamp) {
    
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


  public MintV3DTO pool(String pool) {
    
    this.pool = pool;
    return this;
  }

   /**
   * 
   * @return pool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPool() {
    return pool;
  }


  public void setPool(String pool) {
    this.pool = pool;
  }


  public MintV3DTO token0(String token0) {
    
    this.token0 = token0;
    return this;
  }

   /**
   * 
   * @return token0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getToken0() {
    return token0;
  }


  public void setToken0(String token0) {
    this.token0 = token0;
  }


  public MintV3DTO token1(String token1) {
    
    this.token1 = token1;
    return this;
  }

   /**
   * 
   * @return token1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getToken1() {
    return token1;
  }


  public void setToken1(String token1) {
    this.token1 = token1;
  }


  public MintV3DTO owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * 
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public MintV3DTO sender(String sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * 
   * @return sender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSender() {
    return sender;
  }


  public void setSender(String sender) {
    this.sender = sender;
  }


  public MintV3DTO origin(String origin) {
    
    this.origin = origin;
    return this;
  }

   /**
   * 
   * @return origin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrigin() {
    return origin;
  }


  public void setOrigin(String origin) {
    this.origin = origin;
  }


  public MintV3DTO amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public MintV3DTO amount0(String amount0) {
    
    this.amount0 = amount0;
    return this;
  }

   /**
   * 
   * @return amount0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAmount0() {
    return amount0;
  }


  public void setAmount0(String amount0) {
    this.amount0 = amount0;
  }


  public MintV3DTO amount1(String amount1) {
    
    this.amount1 = amount1;
    return this;
  }

   /**
   * 
   * @return amount1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAmount1() {
    return amount1;
  }


  public void setAmount1(String amount1) {
    this.amount1 = amount1;
  }


  public MintV3DTO amountUsd(String amountUsd) {
    
    this.amountUsd = amountUsd;
    return this;
  }

   /**
   * 
   * @return amountUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAmountUsd() {
    return amountUsd;
  }


  public void setAmountUsd(String amountUsd) {
    this.amountUsd = amountUsd;
  }


  public MintV3DTO tickLower(String tickLower) {
    
    this.tickLower = tickLower;
    return this;
  }

   /**
   * 
   * @return tickLower
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTickLower() {
    return tickLower;
  }


  public void setTickLower(String tickLower) {
    this.tickLower = tickLower;
  }


  public MintV3DTO tickUpper(String tickUpper) {
    
    this.tickUpper = tickUpper;
    return this;
  }

   /**
   * 
   * @return tickUpper
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTickUpper() {
    return tickUpper;
  }


  public void setTickUpper(String tickUpper) {
    this.tickUpper = tickUpper;
  }


  public MintV3DTO logIndex(String logIndex) {
    
    this.logIndex = logIndex;
    return this;
  }

   /**
   * 
   * @return logIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogIndex() {
    return logIndex;
  }


  public void setLogIndex(String logIndex) {
    this.logIndex = logIndex;
  }


  public MintV3DTO vid(Long vid) {
    
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
    MintV3DTO mintV3DTO = (MintV3DTO) o;
    return Objects.equals(this.entryTime, mintV3DTO.entryTime) &&
        Objects.equals(this.recvTime, mintV3DTO.recvTime) &&
        Objects.equals(this.blockNumber, mintV3DTO.blockNumber) &&
        Objects.equals(this.id, mintV3DTO.id) &&
        Objects.equals(this.transaction, mintV3DTO.transaction) &&
        Objects.equals(this.timestamp, mintV3DTO.timestamp) &&
        Objects.equals(this.pool, mintV3DTO.pool) &&
        Objects.equals(this.token0, mintV3DTO.token0) &&
        Objects.equals(this.token1, mintV3DTO.token1) &&
        Objects.equals(this.owner, mintV3DTO.owner) &&
        Objects.equals(this.sender, mintV3DTO.sender) &&
        Objects.equals(this.origin, mintV3DTO.origin) &&
        Objects.equals(this.amount, mintV3DTO.amount) &&
        Objects.equals(this.amount0, mintV3DTO.amount0) &&
        Objects.equals(this.amount1, mintV3DTO.amount1) &&
        Objects.equals(this.amountUsd, mintV3DTO.amountUsd) &&
        Objects.equals(this.tickLower, mintV3DTO.tickLower) &&
        Objects.equals(this.tickUpper, mintV3DTO.tickUpper) &&
        Objects.equals(this.logIndex, mintV3DTO.logIndex) &&
        Objects.equals(this.vid, mintV3DTO.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, transaction, timestamp, pool, token0, token1, owner, sender, origin, amount, amount0, amount1, amountUsd, tickLower, tickUpper, logIndex, vid);
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
    sb.append("class MintV3DTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    token0: ").append(toIndentedString(token0)).append("\n");
    sb.append("    token1: ").append(toIndentedString(token1)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amount0: ").append(toIndentedString(amount0)).append("\n");
    sb.append("    amount1: ").append(toIndentedString(amount1)).append("\n");
    sb.append("    amountUsd: ").append(toIndentedString(amountUsd)).append("\n");
    sb.append("    tickLower: ").append(toIndentedString(tickLower)).append("\n");
    sb.append("    tickUpper: ").append(toIndentedString(tickUpper)).append("\n");
    sb.append("    logIndex: ").append(toIndentedString(logIndex)).append("\n");
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
    openapiFields.add("transaction");
    openapiFields.add("timestamp");
    openapiFields.add("pool");
    openapiFields.add("token_0");
    openapiFields.add("token_1");
    openapiFields.add("owner");
    openapiFields.add("sender");
    openapiFields.add("origin");
    openapiFields.add("amount");
    openapiFields.add("amount_0");
    openapiFields.add("amount_1");
    openapiFields.add("amount_usd");
    openapiFields.add("tick_lower");
    openapiFields.add("tick_upper");
    openapiFields.add("log_index");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MintV3DTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MintV3DTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MintV3DTO is not found in the empty JSON string", MintV3DTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MintV3DTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MintV3DTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("transaction") != null && !jsonObj.get("transaction").isJsonNull()) && !jsonObj.get("transaction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction").toString()));
      }
      if ((jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull()) && !jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
      if ((jsonObj.get("pool") != null && !jsonObj.get("pool").isJsonNull()) && !jsonObj.get("pool").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pool` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pool").toString()));
      }
      if ((jsonObj.get("token_0") != null && !jsonObj.get("token_0").isJsonNull()) && !jsonObj.get("token_0").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_0` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_0").toString()));
      }
      if ((jsonObj.get("token_1") != null && !jsonObj.get("token_1").isJsonNull()) && !jsonObj.get("token_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_1").toString()));
      }
      if ((jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) && !jsonObj.get("owner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      if ((jsonObj.get("sender") != null && !jsonObj.get("sender").isJsonNull()) && !jsonObj.get("sender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sender").toString()));
      }
      if ((jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("amount_0") != null && !jsonObj.get("amount_0").isJsonNull()) && !jsonObj.get("amount_0").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_0` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_0").toString()));
      }
      if ((jsonObj.get("amount_1") != null && !jsonObj.get("amount_1").isJsonNull()) && !jsonObj.get("amount_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_1").toString()));
      }
      if ((jsonObj.get("amount_usd") != null && !jsonObj.get("amount_usd").isJsonNull()) && !jsonObj.get("amount_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_usd").toString()));
      }
      if ((jsonObj.get("tick_lower") != null && !jsonObj.get("tick_lower").isJsonNull()) && !jsonObj.get("tick_lower").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tick_lower` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tick_lower").toString()));
      }
      if ((jsonObj.get("tick_upper") != null && !jsonObj.get("tick_upper").isJsonNull()) && !jsonObj.get("tick_upper").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tick_upper` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tick_upper").toString()));
      }
      if ((jsonObj.get("log_index") != null && !jsonObj.get("log_index").isJsonNull()) && !jsonObj.get("log_index").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `log_index` to be a primitive type in the JSON string but got `%s`", jsonObj.get("log_index").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MintV3DTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MintV3DTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MintV3DTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MintV3DTO.class));

       return (TypeAdapter<T>) new TypeAdapter<MintV3DTO>() {
           @Override
           public void write(JsonWriter out, MintV3DTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MintV3DTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MintV3DTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MintV3DTO
  * @throws IOException if the JSON string is invalid with respect to MintV3DTO
  */
  public static MintV3DTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MintV3DTO.class);
  }

 /**
  * Convert an instance of MintV3DTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

