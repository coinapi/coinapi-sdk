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
 * Mint entities are created for every emitted Mint event on the Uniswap core contracts. The Mint entity stores key data about the event like token amounts, who sent the transaction, and more.
 */
@ApiModel(description = "Mint entities are created for every emitted Mint event on the Uniswap core contracts. The Mint entity stores key data about the event like token amounts, who sent the transaction, and more.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-30T08:02:47.520670Z[Etc/UTC]")
public class UniswapV3MintDTO {
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

  public UniswapV3MintDTO() {
  }

  public UniswapV3MintDTO entryTime(OffsetDateTime entryTime) {
    
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


  public UniswapV3MintDTO recvTime(OffsetDateTime recvTime) {
    
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


  public UniswapV3MintDTO blockNumber(Long blockNumber) {
    
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


  public UniswapV3MintDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Transaction hash + &#39;#&#39; + index in mints Transaction array.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction hash + '#' + index in mints Transaction array.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UniswapV3MintDTO transaction(String transaction) {
    
    this.transaction = transaction;
    return this;
  }

   /**
   * Which txn the mint was included in.
   * @return transaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Which txn the mint was included in.")

  public String getTransaction() {
    return transaction;
  }


  public void setTransaction(String transaction) {
    this.transaction = transaction;
  }


  public UniswapV3MintDTO timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Time of transaction.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time of transaction.")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public UniswapV3MintDTO pool(String pool) {
    
    this.pool = pool;
    return this;
  }

   /**
   * Pool address.
   * @return pool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pool address.")

  public String getPool() {
    return pool;
  }


  public void setPool(String pool) {
    this.pool = pool;
  }


  public UniswapV3MintDTO token0(String token0) {
    
    this.token0 = token0;
    return this;
  }

   /**
   * Reference to token0 as stored in pool contract.
   * @return token0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to token0 as stored in pool contract.")

  public String getToken0() {
    return token0;
  }


  public void setToken0(String token0) {
    this.token0 = token0;
  }


  public UniswapV3MintDTO token1(String token1) {
    
    this.token1 = token1;
    return this;
  }

   /**
   * Reference to token1 as stored in pool contract.
   * @return token1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to token1 as stored in pool contract.")

  public String getToken1() {
    return token1;
  }


  public void setToken1(String token1) {
    this.token1 = token1;
  }


  public UniswapV3MintDTO owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Owner of position where liquidity minted to.
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Owner of position where liquidity minted to.")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public UniswapV3MintDTO sender(String sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * The address that minted the liquidity.
   * @return sender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The address that minted the liquidity.")

  public String getSender() {
    return sender;
  }


  public void setSender(String sender) {
    this.sender = sender;
  }


  public UniswapV3MintDTO origin(String origin) {
    
    this.origin = origin;
    return this;
  }

   /**
   * Transaction origin: the EOA (Externally Owned Account) that initiated the transaction.
   * @return origin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction origin: the EOA (Externally Owned Account) that initiated the transaction.")

  public String getOrigin() {
    return origin;
  }


  public void setOrigin(String origin) {
    this.origin = origin;
  }


  public UniswapV3MintDTO amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Amount of liquidity minted.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of liquidity minted.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public UniswapV3MintDTO amount0(String amount0) {
    
    this.amount0 = amount0;
    return this;
  }

   /**
   * Amount of token 0 minted.
   * @return amount0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token 0 minted.")

  public String getAmount0() {
    return amount0;
  }


  public void setAmount0(String amount0) {
    this.amount0 = amount0;
  }


  public UniswapV3MintDTO amount1(String amount1) {
    
    this.amount1 = amount1;
    return this;
  }

   /**
   * Amount of token 1 minted.
   * @return amount1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token 1 minted.")

  public String getAmount1() {
    return amount1;
  }


  public void setAmount1(String amount1) {
    this.amount1 = amount1;
  }


  public UniswapV3MintDTO amountUsd(String amountUsd) {
    
    this.amountUsd = amountUsd;
    return this;
  }

   /**
   * Derived amount based on available prices of tokens.
   * @return amountUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Derived amount based on available prices of tokens.")

  public String getAmountUsd() {
    return amountUsd;
  }


  public void setAmountUsd(String amountUsd) {
    this.amountUsd = amountUsd;
  }


  public UniswapV3MintDTO tickLower(String tickLower) {
    
    this.tickLower = tickLower;
    return this;
  }

   /**
   * Lower tick of the position.
   * @return tickLower
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lower tick of the position.")

  public String getTickLower() {
    return tickLower;
  }


  public void setTickLower(String tickLower) {
    this.tickLower = tickLower;
  }


  public UniswapV3MintDTO tickUpper(String tickUpper) {
    
    this.tickUpper = tickUpper;
    return this;
  }

   /**
   * Upper tick of the position.
   * @return tickUpper
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Upper tick of the position.")

  public String getTickUpper() {
    return tickUpper;
  }


  public void setTickUpper(String tickUpper) {
    this.tickUpper = tickUpper;
  }


  public UniswapV3MintDTO logIndex(String logIndex) {
    
    this.logIndex = logIndex;
    return this;
  }

   /**
   * Order within the transaction.
   * @return logIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order within the transaction.")

  public String getLogIndex() {
    return logIndex;
  }


  public void setLogIndex(String logIndex) {
    this.logIndex = logIndex;
  }


  public UniswapV3MintDTO vid(Long vid) {
    
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
    UniswapV3MintDTO uniswapV3MintDTO = (UniswapV3MintDTO) o;
    return Objects.equals(this.entryTime, uniswapV3MintDTO.entryTime) &&
        Objects.equals(this.recvTime, uniswapV3MintDTO.recvTime) &&
        Objects.equals(this.blockNumber, uniswapV3MintDTO.blockNumber) &&
        Objects.equals(this.id, uniswapV3MintDTO.id) &&
        Objects.equals(this.transaction, uniswapV3MintDTO.transaction) &&
        Objects.equals(this.timestamp, uniswapV3MintDTO.timestamp) &&
        Objects.equals(this.pool, uniswapV3MintDTO.pool) &&
        Objects.equals(this.token0, uniswapV3MintDTO.token0) &&
        Objects.equals(this.token1, uniswapV3MintDTO.token1) &&
        Objects.equals(this.owner, uniswapV3MintDTO.owner) &&
        Objects.equals(this.sender, uniswapV3MintDTO.sender) &&
        Objects.equals(this.origin, uniswapV3MintDTO.origin) &&
        Objects.equals(this.amount, uniswapV3MintDTO.amount) &&
        Objects.equals(this.amount0, uniswapV3MintDTO.amount0) &&
        Objects.equals(this.amount1, uniswapV3MintDTO.amount1) &&
        Objects.equals(this.amountUsd, uniswapV3MintDTO.amountUsd) &&
        Objects.equals(this.tickLower, uniswapV3MintDTO.tickLower) &&
        Objects.equals(this.tickUpper, uniswapV3MintDTO.tickUpper) &&
        Objects.equals(this.logIndex, uniswapV3MintDTO.logIndex) &&
        Objects.equals(this.vid, uniswapV3MintDTO.vid);
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
    sb.append("class UniswapV3MintDTO {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to UniswapV3MintDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UniswapV3MintDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UniswapV3MintDTO is not found in the empty JSON string", UniswapV3MintDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UniswapV3MintDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UniswapV3MintDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
       if (!UniswapV3MintDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UniswapV3MintDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UniswapV3MintDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UniswapV3MintDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UniswapV3MintDTO>() {
           @Override
           public void write(JsonWriter out, UniswapV3MintDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UniswapV3MintDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UniswapV3MintDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UniswapV3MintDTO
  * @throws IOException if the JSON string is invalid with respect to UniswapV3MintDTO
  */
  public static UniswapV3MintDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UniswapV3MintDTO.class);
  }

 /**
  * Convert an instance of UniswapV3MintDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

