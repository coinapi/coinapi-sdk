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
import java.io.IOException;
import java.time.OffsetDateTime;
import org.openapitools.client.model.NumericsBigInteger;
import org.openapitools.client.model.TransactionsETradeAggressiveSide;
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
 * Swap are created for each token swap within a pair.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-07T09:28:25.467314Z[Etc/UTC]")
public class UniswapV3SwapDTO {
  public static final String SERIALIZED_NAME_ENTRY_TIME = "entry_time";
  @SerializedName(SERIALIZED_NAME_ENTRY_TIME)
  private OffsetDateTime entryTime;

  public static final String SERIALIZED_NAME_RECV_TIME = "recv_time";
  @SerializedName(SERIALIZED_NAME_RECV_TIME)
  private OffsetDateTime recvTime;

  public static final String SERIALIZED_NAME_BLOCK_NUMBER = "block_number";
  @SerializedName(SERIALIZED_NAME_BLOCK_NUMBER)
  private Long blockNumber;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TRANSACTION = "transaction";
  @SerializedName(SERIALIZED_NAME_TRANSACTION)
  private String transaction;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_POOL = "pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  private String pool;

  public static final String SERIALIZED_NAME_TOKEN0 = "token_0";
  @SerializedName(SERIALIZED_NAME_TOKEN0)
  private String token0;

  public static final String SERIALIZED_NAME_TOKEN1 = "token_1";
  @SerializedName(SERIALIZED_NAME_TOKEN1)
  private String token1;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private String sender;

  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private String recipient;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private String origin;

  public static final String SERIALIZED_NAME_AMOUNT0 = "amount_0";
  @SerializedName(SERIALIZED_NAME_AMOUNT0)
  private String amount0;

  public static final String SERIALIZED_NAME_AMOUNT1 = "amount_1";
  @SerializedName(SERIALIZED_NAME_AMOUNT1)
  private String amount1;

  public static final String SERIALIZED_NAME_AMOUNT_USD = "amount_usd";
  @SerializedName(SERIALIZED_NAME_AMOUNT_USD)
  private String amountUsd;

  public static final String SERIALIZED_NAME_SQRT_PRICE_X96 = "sqrt_price_x96";
  @SerializedName(SERIALIZED_NAME_SQRT_PRICE_X96)
  private NumericsBigInteger sqrtPriceX96;

  public static final String SERIALIZED_NAME_TICK = "tick";
  @SerializedName(SERIALIZED_NAME_TICK)
  private NumericsBigInteger tick;

  public static final String SERIALIZED_NAME_LOG_INDEX = "log_index";
  @SerializedName(SERIALIZED_NAME_LOG_INDEX)
  private NumericsBigInteger logIndex;

  public static final String SERIALIZED_NAME_EVALUATED_PRICE = "evaluated_price";
  @SerializedName(SERIALIZED_NAME_EVALUATED_PRICE)
  private Double evaluatedPrice;

  public static final String SERIALIZED_NAME_EVALUATED_AMOUNT = "evaluated_amount";
  @SerializedName(SERIALIZED_NAME_EVALUATED_AMOUNT)
  private Double evaluatedAmount;

  public static final String SERIALIZED_NAME_EVALUATED_AGGRESSOR = "evaluated_aggressor";
  @SerializedName(SERIALIZED_NAME_EVALUATED_AGGRESSOR)
  private TransactionsETradeAggressiveSide evaluatedAggressor;

  public static final String SERIALIZED_NAME_POOL_ID = "pool_id";
  @SerializedName(SERIALIZED_NAME_POOL_ID)
  private String poolId;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public UniswapV3SwapDTO() {
  }

  
  public UniswapV3SwapDTO(
     Double evaluatedPrice, 
     Double evaluatedAmount, 
     String poolId, 
     String transactionId
  ) {
    this();
    this.evaluatedPrice = evaluatedPrice;
    this.evaluatedAmount = evaluatedAmount;
    this.poolId = poolId;
    this.transactionId = transactionId;
  }

  public UniswapV3SwapDTO entryTime(OffsetDateTime entryTime) {
    
    this.entryTime = entryTime;
    return this;
  }

   /**
   * Get entryTime
   * @return entryTime
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getEntryTime() {
    return entryTime;
  }


  public void setEntryTime(OffsetDateTime entryTime) {
    this.entryTime = entryTime;
  }


  public UniswapV3SwapDTO recvTime(OffsetDateTime recvTime) {
    
    this.recvTime = recvTime;
    return this;
  }

   /**
   * Get recvTime
   * @return recvTime
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getRecvTime() {
    return recvTime;
  }


  public void setRecvTime(OffsetDateTime recvTime) {
    this.recvTime = recvTime;
  }


  public UniswapV3SwapDTO blockNumber(Long blockNumber) {
    
    this.blockNumber = blockNumber;
    return this;
  }

   /**
   * Number of block in which entity was recorded.
   * @return blockNumber
  **/
  @javax.annotation.Nullable

  public Long getBlockNumber() {
    return blockNumber;
  }


  public void setBlockNumber(Long blockNumber) {
    this.blockNumber = blockNumber;
  }


  public UniswapV3SwapDTO vid(Long vid) {
    
    this.vid = vid;
    return this;
  }

   /**
   * 
   * @return vid
  **/
  @javax.annotation.Nullable

  public Long getVid() {
    return vid;
  }


  public void setVid(Long vid) {
    this.vid = vid;
  }


  public UniswapV3SwapDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier, format: (transaction hash) + # + (index in swaps Transaction array).
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UniswapV3SwapDTO transaction(String transaction) {
    
    this.transaction = transaction;
    return this;
  }

   /**
   * Pointer to transaction.
   * @return transaction
  **/
  @javax.annotation.Nullable

  public String getTransaction() {
    return transaction;
  }


  public void setTransaction(String transaction) {
    this.transaction = transaction;
  }


  public UniswapV3SwapDTO timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp of transaction.
   * @return timestamp
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public UniswapV3SwapDTO pool(String pool) {
    
    this.pool = pool;
    return this;
  }

   /**
   * Pool swap occured within.
   * @return pool
  **/
  @javax.annotation.Nullable

  public String getPool() {
    return pool;
  }


  public void setPool(String pool) {
    this.pool = pool;
  }


  public UniswapV3SwapDTO token0(String token0) {
    
    this.token0 = token0;
    return this;
  }

   /**
   * Reference to token0 as stored in pair contract.
   * @return token0
  **/
  @javax.annotation.Nullable

  public String getToken0() {
    return token0;
  }


  public void setToken0(String token0) {
    this.token0 = token0;
  }


  public UniswapV3SwapDTO token1(String token1) {
    
    this.token1 = token1;
    return this;
  }

   /**
   * Reference to token1 as stored in pair contract.
   * @return token1
  **/
  @javax.annotation.Nullable

  public String getToken1() {
    return token1;
  }


  public void setToken1(String token1) {
    this.token1 = token1;
  }


  public UniswapV3SwapDTO sender(String sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * Sender of the swap.
   * @return sender
  **/
  @javax.annotation.Nullable

  public String getSender() {
    return sender;
  }


  public void setSender(String sender) {
    this.sender = sender;
  }


  public UniswapV3SwapDTO recipient(String recipient) {
    
    this.recipient = recipient;
    return this;
  }

   /**
   * Recipient of the swap.
   * @return recipient
  **/
  @javax.annotation.Nullable

  public String getRecipient() {
    return recipient;
  }


  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }


  public UniswapV3SwapDTO origin(String origin) {
    
    this.origin = origin;
    return this;
  }

   /**
   * Transaction origin: the EOA (Externally Owned Account) that initiated the transaction
   * @return origin
  **/
  @javax.annotation.Nullable

  public String getOrigin() {
    return origin;
  }


  public void setOrigin(String origin) {
    this.origin = origin;
  }


  public UniswapV3SwapDTO amount0(String amount0) {
    
    this.amount0 = amount0;
    return this;
  }

   /**
   * Delta of token0 swapped.
   * @return amount0
  **/
  @javax.annotation.Nullable

  public String getAmount0() {
    return amount0;
  }


  public void setAmount0(String amount0) {
    this.amount0 = amount0;
  }


  public UniswapV3SwapDTO amount1(String amount1) {
    
    this.amount1 = amount1;
    return this;
  }

   /**
   * Delta of token1 swapped.
   * @return amount1
  **/
  @javax.annotation.Nullable

  public String getAmount1() {
    return amount1;
  }


  public void setAmount1(String amount1) {
    this.amount1 = amount1;
  }


  public UniswapV3SwapDTO amountUsd(String amountUsd) {
    
    this.amountUsd = amountUsd;
    return this;
  }

   /**
   * Derived amount of tokens sold in USD.
   * @return amountUsd
  **/
  @javax.annotation.Nullable

  public String getAmountUsd() {
    return amountUsd;
  }


  public void setAmountUsd(String amountUsd) {
    this.amountUsd = amountUsd;
  }


  public UniswapV3SwapDTO sqrtPriceX96(NumericsBigInteger sqrtPriceX96) {
    
    this.sqrtPriceX96 = sqrtPriceX96;
    return this;
  }

   /**
   * Get sqrtPriceX96
   * @return sqrtPriceX96
  **/
  @javax.annotation.Nullable

  public NumericsBigInteger getSqrtPriceX96() {
    return sqrtPriceX96;
  }


  public void setSqrtPriceX96(NumericsBigInteger sqrtPriceX96) {
    this.sqrtPriceX96 = sqrtPriceX96;
  }


  public UniswapV3SwapDTO tick(NumericsBigInteger tick) {
    
    this.tick = tick;
    return this;
  }

   /**
   * Get tick
   * @return tick
  **/
  @javax.annotation.Nullable

  public NumericsBigInteger getTick() {
    return tick;
  }


  public void setTick(NumericsBigInteger tick) {
    this.tick = tick;
  }


  public UniswapV3SwapDTO logIndex(NumericsBigInteger logIndex) {
    
    this.logIndex = logIndex;
    return this;
  }

   /**
   * Get logIndex
   * @return logIndex
  **/
  @javax.annotation.Nullable

  public NumericsBigInteger getLogIndex() {
    return logIndex;
  }


  public void setLogIndex(NumericsBigInteger logIndex) {
    this.logIndex = logIndex;
  }


   /**
   * Get evaluatedPrice
   * @return evaluatedPrice
  **/
  @javax.annotation.Nullable

  public Double getEvaluatedPrice() {
    return evaluatedPrice;
  }




   /**
   * Get evaluatedAmount
   * @return evaluatedAmount
  **/
  @javax.annotation.Nullable

  public Double getEvaluatedAmount() {
    return evaluatedAmount;
  }




  public UniswapV3SwapDTO evaluatedAggressor(TransactionsETradeAggressiveSide evaluatedAggressor) {
    
    this.evaluatedAggressor = evaluatedAggressor;
    return this;
  }

   /**
   * Get evaluatedAggressor
   * @return evaluatedAggressor
  **/
  @javax.annotation.Nullable

  public TransactionsETradeAggressiveSide getEvaluatedAggressor() {
    return evaluatedAggressor;
  }


  public void setEvaluatedAggressor(TransactionsETradeAggressiveSide evaluatedAggressor) {
    this.evaluatedAggressor = evaluatedAggressor;
  }


   /**
   * Get poolId
   * @return poolId
  **/
  @javax.annotation.Nullable

  public String getPoolId() {
    return poolId;
  }




   /**
   * Get transactionId
   * @return transactionId
  **/
  @javax.annotation.Nullable

  public String getTransactionId() {
    return transactionId;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniswapV3SwapDTO uniswapV3SwapDTO = (UniswapV3SwapDTO) o;
    return Objects.equals(this.entryTime, uniswapV3SwapDTO.entryTime) &&
        Objects.equals(this.recvTime, uniswapV3SwapDTO.recvTime) &&
        Objects.equals(this.blockNumber, uniswapV3SwapDTO.blockNumber) &&
        Objects.equals(this.vid, uniswapV3SwapDTO.vid) &&
        Objects.equals(this.id, uniswapV3SwapDTO.id) &&
        Objects.equals(this.transaction, uniswapV3SwapDTO.transaction) &&
        Objects.equals(this.timestamp, uniswapV3SwapDTO.timestamp) &&
        Objects.equals(this.pool, uniswapV3SwapDTO.pool) &&
        Objects.equals(this.token0, uniswapV3SwapDTO.token0) &&
        Objects.equals(this.token1, uniswapV3SwapDTO.token1) &&
        Objects.equals(this.sender, uniswapV3SwapDTO.sender) &&
        Objects.equals(this.recipient, uniswapV3SwapDTO.recipient) &&
        Objects.equals(this.origin, uniswapV3SwapDTO.origin) &&
        Objects.equals(this.amount0, uniswapV3SwapDTO.amount0) &&
        Objects.equals(this.amount1, uniswapV3SwapDTO.amount1) &&
        Objects.equals(this.amountUsd, uniswapV3SwapDTO.amountUsd) &&
        Objects.equals(this.sqrtPriceX96, uniswapV3SwapDTO.sqrtPriceX96) &&
        Objects.equals(this.tick, uniswapV3SwapDTO.tick) &&
        Objects.equals(this.logIndex, uniswapV3SwapDTO.logIndex) &&
        Objects.equals(this.evaluatedPrice, uniswapV3SwapDTO.evaluatedPrice) &&
        Objects.equals(this.evaluatedAmount, uniswapV3SwapDTO.evaluatedAmount) &&
        Objects.equals(this.evaluatedAggressor, uniswapV3SwapDTO.evaluatedAggressor) &&
        Objects.equals(this.poolId, uniswapV3SwapDTO.poolId) &&
        Objects.equals(this.transactionId, uniswapV3SwapDTO.transactionId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, vid, id, transaction, timestamp, pool, token0, token1, sender, recipient, origin, amount0, amount1, amountUsd, sqrtPriceX96, tick, logIndex, evaluatedPrice, evaluatedAmount, evaluatedAggressor, poolId, transactionId);
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
    sb.append("class UniswapV3SwapDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    token0: ").append(toIndentedString(token0)).append("\n");
    sb.append("    token1: ").append(toIndentedString(token1)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    amount0: ").append(toIndentedString(amount0)).append("\n");
    sb.append("    amount1: ").append(toIndentedString(amount1)).append("\n");
    sb.append("    amountUsd: ").append(toIndentedString(amountUsd)).append("\n");
    sb.append("    sqrtPriceX96: ").append(toIndentedString(sqrtPriceX96)).append("\n");
    sb.append("    tick: ").append(toIndentedString(tick)).append("\n");
    sb.append("    logIndex: ").append(toIndentedString(logIndex)).append("\n");
    sb.append("    evaluatedPrice: ").append(toIndentedString(evaluatedPrice)).append("\n");
    sb.append("    evaluatedAmount: ").append(toIndentedString(evaluatedAmount)).append("\n");
    sb.append("    evaluatedAggressor: ").append(toIndentedString(evaluatedAggressor)).append("\n");
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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
    openapiFields.add("vid");
    openapiFields.add("id");
    openapiFields.add("transaction");
    openapiFields.add("timestamp");
    openapiFields.add("pool");
    openapiFields.add("token_0");
    openapiFields.add("token_1");
    openapiFields.add("sender");
    openapiFields.add("recipient");
    openapiFields.add("origin");
    openapiFields.add("amount_0");
    openapiFields.add("amount_1");
    openapiFields.add("amount_usd");
    openapiFields.add("sqrt_price_x96");
    openapiFields.add("tick");
    openapiFields.add("log_index");
    openapiFields.add("evaluated_price");
    openapiFields.add("evaluated_amount");
    openapiFields.add("evaluated_aggressor");
    openapiFields.add("pool_id");
    openapiFields.add("transaction_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UniswapV3SwapDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UniswapV3SwapDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UniswapV3SwapDTO is not found in the empty JSON string", UniswapV3SwapDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UniswapV3SwapDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UniswapV3SwapDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("transaction") != null && !jsonObj.get("transaction").isJsonNull()) && !jsonObj.get("transaction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction").toString()));
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
      if ((jsonObj.get("sender") != null && !jsonObj.get("sender").isJsonNull()) && !jsonObj.get("sender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sender").toString()));
      }
      if ((jsonObj.get("recipient") != null && !jsonObj.get("recipient").isJsonNull()) && !jsonObj.get("recipient").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipient").toString()));
      }
      if ((jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
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
      // validate the optional field `sqrt_price_x96`
      if (jsonObj.get("sqrt_price_x96") != null && !jsonObj.get("sqrt_price_x96").isJsonNull()) {
        NumericsBigInteger.validateJsonObject(jsonObj.getAsJsonObject("sqrt_price_x96"));
      }
      // validate the optional field `tick`
      if (jsonObj.get("tick") != null && !jsonObj.get("tick").isJsonNull()) {
        NumericsBigInteger.validateJsonObject(jsonObj.getAsJsonObject("tick"));
      }
      // validate the optional field `log_index`
      if (jsonObj.get("log_index") != null && !jsonObj.get("log_index").isJsonNull()) {
        NumericsBigInteger.validateJsonObject(jsonObj.getAsJsonObject("log_index"));
      }
      if ((jsonObj.get("pool_id") != null && !jsonObj.get("pool_id").isJsonNull()) && !jsonObj.get("pool_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pool_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pool_id").toString()));
      }
      if ((jsonObj.get("transaction_id") != null && !jsonObj.get("transaction_id").isJsonNull()) && !jsonObj.get("transaction_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UniswapV3SwapDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UniswapV3SwapDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UniswapV3SwapDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UniswapV3SwapDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UniswapV3SwapDTO>() {
           @Override
           public void write(JsonWriter out, UniswapV3SwapDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UniswapV3SwapDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UniswapV3SwapDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UniswapV3SwapDTO
  * @throws IOException if the JSON string is invalid with respect to UniswapV3SwapDTO
  */
  public static UniswapV3SwapDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UniswapV3SwapDTO.class);
  }

 /**
  * Convert an instance of UniswapV3SwapDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

