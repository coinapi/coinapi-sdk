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
@ApiModel(description = "Swap are created for each token swap within a pair.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-04T13:02:49.513858Z[Etc/UTC]")
public class SushiswapSwapDTO {
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

  public static final String SERIALIZED_NAME_PAIR = "pair";
  @SerializedName(SERIALIZED_NAME_PAIR)
  private String pair;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private String sender;

  public static final String SERIALIZED_NAME_AMOUNT0_IN = "amount_0_in";
  @SerializedName(SERIALIZED_NAME_AMOUNT0_IN)
  private String amount0In;

  public static final String SERIALIZED_NAME_AMOUNT1_IN = "amount_1_in";
  @SerializedName(SERIALIZED_NAME_AMOUNT1_IN)
  private String amount1In;

  public static final String SERIALIZED_NAME_AMOUNT0_OUT = "amount_0_out";
  @SerializedName(SERIALIZED_NAME_AMOUNT0_OUT)
  private String amount0Out;

  public static final String SERIALIZED_NAME_AMOUNT1_OUT = "amount_1_out";
  @SerializedName(SERIALIZED_NAME_AMOUNT1_OUT)
  private String amount1Out;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_LOG_INDEX = "log_index";
  @SerializedName(SERIALIZED_NAME_LOG_INDEX)
  private String logIndex;

  public static final String SERIALIZED_NAME_AMOUNT_USD = "amount_usd";
  @SerializedName(SERIALIZED_NAME_AMOUNT_USD)
  private String amountUsd;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public static final String SERIALIZED_NAME_POOL_ID = "pool_id";
  @SerializedName(SERIALIZED_NAME_POOL_ID)
  private String poolId;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_EVALUATED_PRICE = "evaluated_price";
  @SerializedName(SERIALIZED_NAME_EVALUATED_PRICE)
  private Double evaluatedPrice;

  public static final String SERIALIZED_NAME_EVALUATED_AMOUNT = "evaluated_amount";
  @SerializedName(SERIALIZED_NAME_EVALUATED_AMOUNT)
  private Double evaluatedAmount;

  public static final String SERIALIZED_NAME_EVALUATED_AGGRESSOR = "evaluated_aggressor";
  @SerializedName(SERIALIZED_NAME_EVALUATED_AGGRESSOR)
  private TransactionsETradeAggressiveSide evaluatedAggressor;

  public SushiswapSwapDTO() {
  }

  
  public SushiswapSwapDTO(
     String poolId, 
     String transactionId, 
     Double evaluatedPrice, 
     Double evaluatedAmount
  ) {
    this();
    this.poolId = poolId;
    this.transactionId = transactionId;
    this.evaluatedPrice = evaluatedPrice;
    this.evaluatedAmount = evaluatedAmount;
  }

  public SushiswapSwapDTO entryTime(OffsetDateTime entryTime) {
    
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


  public SushiswapSwapDTO recvTime(OffsetDateTime recvTime) {
    
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


  public SushiswapSwapDTO blockNumber(Long blockNumber) {
    
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


  public SushiswapSwapDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Transaction hash plus index in Transaction swap array.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction hash plus index in Transaction swap array.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SushiswapSwapDTO transaction(String transaction) {
    
    this.transaction = transaction;
    return this;
  }

   /**
   * Reference to transaction swap was included in.
   * @return transaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to transaction swap was included in.")

  public String getTransaction() {
    return transaction;
  }


  public void setTransaction(String transaction) {
    this.transaction = transaction;
  }


  public SushiswapSwapDTO timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp of swap, used for sorted lookups.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of swap, used for sorted lookups.")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public SushiswapSwapDTO pair(String pair) {
    
    this.pair = pair;
    return this;
  }

   /**
   * Reference to pair.
   * @return pair
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to pair.")

  public String getPair() {
    return pair;
  }


  public void setPair(String pair) {
    this.pair = pair;
  }


  public SushiswapSwapDTO sender(String sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * Address that initiated the swap.
   * @return sender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address that initiated the swap.")

  public String getSender() {
    return sender;
  }


  public void setSender(String sender) {
    this.sender = sender;
  }


  public SushiswapSwapDTO amount0In(String amount0In) {
    
    this.amount0In = amount0In;
    return this;
  }

   /**
   * Amount of token0 sold.
   * @return amount0In
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token0 sold.")

  public String getAmount0In() {
    return amount0In;
  }


  public void setAmount0In(String amount0In) {
    this.amount0In = amount0In;
  }


  public SushiswapSwapDTO amount1In(String amount1In) {
    
    this.amount1In = amount1In;
    return this;
  }

   /**
   * Amount of token1 sold.
   * @return amount1In
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token1 sold.")

  public String getAmount1In() {
    return amount1In;
  }


  public void setAmount1In(String amount1In) {
    this.amount1In = amount1In;
  }


  public SushiswapSwapDTO amount0Out(String amount0Out) {
    
    this.amount0Out = amount0Out;
    return this;
  }

   /**
   * Amount of token0 received.
   * @return amount0Out
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token0 received.")

  public String getAmount0Out() {
    return amount0Out;
  }


  public void setAmount0Out(String amount0Out) {
    this.amount0Out = amount0Out;
  }


  public SushiswapSwapDTO amount1Out(String amount1Out) {
    
    this.amount1Out = amount1Out;
    return this;
  }

   /**
   * Amount of token1 received.
   * @return amount1Out
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token1 received.")

  public String getAmount1Out() {
    return amount1Out;
  }


  public void setAmount1Out(String amount1Out) {
    this.amount1Out = amount1Out;
  }


  public SushiswapSwapDTO to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * Recipient of output tokens.
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Recipient of output tokens.")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public SushiswapSwapDTO logIndex(String logIndex) {
    
    this.logIndex = logIndex;
    return this;
  }

   /**
   * Event index within transaction.
   * @return logIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Event index within transaction.")

  public String getLogIndex() {
    return logIndex;
  }


  public void setLogIndex(String logIndex) {
    this.logIndex = logIndex;
  }


  public SushiswapSwapDTO amountUsd(String amountUsd) {
    
    this.amountUsd = amountUsd;
    return this;
  }

   /**
   * Derived amount of tokens sold in USD.
   * @return amountUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Derived amount of tokens sold in USD.")

  public String getAmountUsd() {
    return amountUsd;
  }


  public void setAmountUsd(String amountUsd) {
    this.amountUsd = amountUsd;
  }


  public SushiswapSwapDTO vid(Long vid) {
    
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


   /**
   * Get poolId
   * @return poolId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPoolId() {
    return poolId;
  }




   /**
   * Get transactionId
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTransactionId() {
    return transactionId;
  }




   /**
   * Get evaluatedPrice
   * @return evaluatedPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getEvaluatedPrice() {
    return evaluatedPrice;
  }




   /**
   * Get evaluatedAmount
   * @return evaluatedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getEvaluatedAmount() {
    return evaluatedAmount;
  }




  public SushiswapSwapDTO evaluatedAggressor(TransactionsETradeAggressiveSide evaluatedAggressor) {
    
    this.evaluatedAggressor = evaluatedAggressor;
    return this;
  }

   /**
   * Get evaluatedAggressor
   * @return evaluatedAggressor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionsETradeAggressiveSide getEvaluatedAggressor() {
    return evaluatedAggressor;
  }


  public void setEvaluatedAggressor(TransactionsETradeAggressiveSide evaluatedAggressor) {
    this.evaluatedAggressor = evaluatedAggressor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SushiswapSwapDTO sushiswapSwapDTO = (SushiswapSwapDTO) o;
    return Objects.equals(this.entryTime, sushiswapSwapDTO.entryTime) &&
        Objects.equals(this.recvTime, sushiswapSwapDTO.recvTime) &&
        Objects.equals(this.blockNumber, sushiswapSwapDTO.blockNumber) &&
        Objects.equals(this.id, sushiswapSwapDTO.id) &&
        Objects.equals(this.transaction, sushiswapSwapDTO.transaction) &&
        Objects.equals(this.timestamp, sushiswapSwapDTO.timestamp) &&
        Objects.equals(this.pair, sushiswapSwapDTO.pair) &&
        Objects.equals(this.sender, sushiswapSwapDTO.sender) &&
        Objects.equals(this.amount0In, sushiswapSwapDTO.amount0In) &&
        Objects.equals(this.amount1In, sushiswapSwapDTO.amount1In) &&
        Objects.equals(this.amount0Out, sushiswapSwapDTO.amount0Out) &&
        Objects.equals(this.amount1Out, sushiswapSwapDTO.amount1Out) &&
        Objects.equals(this.to, sushiswapSwapDTO.to) &&
        Objects.equals(this.logIndex, sushiswapSwapDTO.logIndex) &&
        Objects.equals(this.amountUsd, sushiswapSwapDTO.amountUsd) &&
        Objects.equals(this.vid, sushiswapSwapDTO.vid) &&
        Objects.equals(this.poolId, sushiswapSwapDTO.poolId) &&
        Objects.equals(this.transactionId, sushiswapSwapDTO.transactionId) &&
        Objects.equals(this.evaluatedPrice, sushiswapSwapDTO.evaluatedPrice) &&
        Objects.equals(this.evaluatedAmount, sushiswapSwapDTO.evaluatedAmount) &&
        Objects.equals(this.evaluatedAggressor, sushiswapSwapDTO.evaluatedAggressor);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, transaction, timestamp, pair, sender, amount0In, amount1In, amount0Out, amount1Out, to, logIndex, amountUsd, vid, poolId, transactionId, evaluatedPrice, evaluatedAmount, evaluatedAggressor);
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
    sb.append("class SushiswapSwapDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    pair: ").append(toIndentedString(pair)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    amount0In: ").append(toIndentedString(amount0In)).append("\n");
    sb.append("    amount1In: ").append(toIndentedString(amount1In)).append("\n");
    sb.append("    amount0Out: ").append(toIndentedString(amount0Out)).append("\n");
    sb.append("    amount1Out: ").append(toIndentedString(amount1Out)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    logIndex: ").append(toIndentedString(logIndex)).append("\n");
    sb.append("    amountUsd: ").append(toIndentedString(amountUsd)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    evaluatedPrice: ").append(toIndentedString(evaluatedPrice)).append("\n");
    sb.append("    evaluatedAmount: ").append(toIndentedString(evaluatedAmount)).append("\n");
    sb.append("    evaluatedAggressor: ").append(toIndentedString(evaluatedAggressor)).append("\n");
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
    openapiFields.add("pair");
    openapiFields.add("sender");
    openapiFields.add("amount_0_in");
    openapiFields.add("amount_1_in");
    openapiFields.add("amount_0_out");
    openapiFields.add("amount_1_out");
    openapiFields.add("to");
    openapiFields.add("log_index");
    openapiFields.add("amount_usd");
    openapiFields.add("vid");
    openapiFields.add("pool_id");
    openapiFields.add("transaction_id");
    openapiFields.add("evaluated_price");
    openapiFields.add("evaluated_amount");
    openapiFields.add("evaluated_aggressor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SushiswapSwapDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SushiswapSwapDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SushiswapSwapDTO is not found in the empty JSON string", SushiswapSwapDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SushiswapSwapDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SushiswapSwapDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if ((jsonObj.get("pair") != null && !jsonObj.get("pair").isJsonNull()) && !jsonObj.get("pair").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pair` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pair").toString()));
      }
      if ((jsonObj.get("sender") != null && !jsonObj.get("sender").isJsonNull()) && !jsonObj.get("sender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sender").toString()));
      }
      if ((jsonObj.get("amount_0_in") != null && !jsonObj.get("amount_0_in").isJsonNull()) && !jsonObj.get("amount_0_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_0_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_0_in").toString()));
      }
      if ((jsonObj.get("amount_1_in") != null && !jsonObj.get("amount_1_in").isJsonNull()) && !jsonObj.get("amount_1_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_1_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_1_in").toString()));
      }
      if ((jsonObj.get("amount_0_out") != null && !jsonObj.get("amount_0_out").isJsonNull()) && !jsonObj.get("amount_0_out").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_0_out` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_0_out").toString()));
      }
      if ((jsonObj.get("amount_1_out") != null && !jsonObj.get("amount_1_out").isJsonNull()) && !jsonObj.get("amount_1_out").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_1_out` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_1_out").toString()));
      }
      if ((jsonObj.get("to") != null && !jsonObj.get("to").isJsonNull()) && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if ((jsonObj.get("log_index") != null && !jsonObj.get("log_index").isJsonNull()) && !jsonObj.get("log_index").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `log_index` to be a primitive type in the JSON string but got `%s`", jsonObj.get("log_index").toString()));
      }
      if ((jsonObj.get("amount_usd") != null && !jsonObj.get("amount_usd").isJsonNull()) && !jsonObj.get("amount_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_usd").toString()));
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
       if (!SushiswapSwapDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SushiswapSwapDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SushiswapSwapDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SushiswapSwapDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<SushiswapSwapDTO>() {
           @Override
           public void write(JsonWriter out, SushiswapSwapDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SushiswapSwapDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SushiswapSwapDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SushiswapSwapDTO
  * @throws IOException if the JSON string is invalid with respect to SushiswapSwapDTO
  */
  public static SushiswapSwapDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SushiswapSwapDTO.class);
  }

 /**
  * Convert an instance of SushiswapSwapDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

