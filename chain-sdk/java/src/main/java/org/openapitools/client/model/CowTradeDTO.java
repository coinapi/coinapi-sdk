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
 * Trade entity.
 */
@ApiModel(description = "Trade entity.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-27T15:59:31.022525Z[Etc/UTC]")
public class CowTradeDTO {
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

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_GAS_PRICE = "gas_price";
  @SerializedName(SERIALIZED_NAME_GAS_PRICE)
  private String gasPrice;

  public static final String SERIALIZED_NAME_GAS_LIMIT = "gas_limit";
  @SerializedName(SERIALIZED_NAME_GAS_LIMIT)
  private String gasLimit;

  public static final String SERIALIZED_NAME_FEE_AMOUNT = "fee_amount";
  @SerializedName(SERIALIZED_NAME_FEE_AMOUNT)
  private String feeAmount;

  public static final String SERIALIZED_NAME_TX_HASH = "tx_hash";
  @SerializedName(SERIALIZED_NAME_TX_HASH)
  private String txHash;

  public static final String SERIALIZED_NAME_SETTLEMENT = "settlement";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT)
  private String settlement;

  public static final String SERIALIZED_NAME_BUY_AMOUNT = "buy_amount";
  @SerializedName(SERIALIZED_NAME_BUY_AMOUNT)
  private String buyAmount;

  public static final String SERIALIZED_NAME_SELL_AMOUNT = "sell_amount";
  @SerializedName(SERIALIZED_NAME_SELL_AMOUNT)
  private String sellAmount;

  public static final String SERIALIZED_NAME_SELL_TOKEN = "sell_token";
  @SerializedName(SERIALIZED_NAME_SELL_TOKEN)
  private String sellToken;

  public static final String SERIALIZED_NAME_BUY_TOKEN = "buy_token";
  @SerializedName(SERIALIZED_NAME_BUY_TOKEN)
  private String buyToken;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private String order;

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

  public CowTradeDTO() {
  }

  
  public CowTradeDTO(
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

  public CowTradeDTO entryTime(OffsetDateTime entryTime) {
    
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


  public CowTradeDTO recvTime(OffsetDateTime recvTime) {
    
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


  public CowTradeDTO blockNumber(Long blockNumber) {
    
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


  public CowTradeDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier, format: (order id)|(transaction hash)|(event index).
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier, format: (order id)|(transaction hash)|(event index).")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CowTradeDTO timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Block&#39;s timestamp.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block's timestamp.")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public CowTradeDTO gasPrice(String gasPrice) {
    
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * Transaction&#39;s gas price.
   * @return gasPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction's gas price.")

  public String getGasPrice() {
    return gasPrice;
  }


  public void setGasPrice(String gasPrice) {
    this.gasPrice = gasPrice;
  }


  public CowTradeDTO gasLimit(String gasLimit) {
    
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Transaction&#39;s gas limit.
   * @return gasLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction's gas limit.")

  public String getGasLimit() {
    return gasLimit;
  }


  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }


  public CowTradeDTO feeAmount(String feeAmount) {
    
    this.feeAmount = feeAmount;
    return this;
  }

   /**
   * Trade&#39;s fee amount.
   * @return feeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Trade's fee amount.")

  public String getFeeAmount() {
    return feeAmount;
  }


  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }


  public CowTradeDTO txHash(String txHash) {
    
    this.txHash = txHash;
    return this;
  }

   /**
   * Trade event transaction hash.
   * @return txHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Trade event transaction hash.")

  public String getTxHash() {
    return txHash;
  }


  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }


  public CowTradeDTO settlement(String settlement) {
    
    this.settlement = settlement;
    return this;
  }

   /**
   * Reference to settlement.
   * @return settlement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to settlement.")

  public String getSettlement() {
    return settlement;
  }


  public void setSettlement(String settlement) {
    this.settlement = settlement;
  }


  public CowTradeDTO buyAmount(String buyAmount) {
    
    this.buyAmount = buyAmount;
    return this;
  }

   /**
   * Buy amount.
   * @return buyAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Buy amount.")

  public String getBuyAmount() {
    return buyAmount;
  }


  public void setBuyAmount(String buyAmount) {
    this.buyAmount = buyAmount;
  }


  public CowTradeDTO sellAmount(String sellAmount) {
    
    this.sellAmount = sellAmount;
    return this;
  }

   /**
   * Sell amount.
   * @return sellAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sell amount.")

  public String getSellAmount() {
    return sellAmount;
  }


  public void setSellAmount(String sellAmount) {
    this.sellAmount = sellAmount;
  }


  public CowTradeDTO sellToken(String sellToken) {
    
    this.sellToken = sellToken;
    return this;
  }

   /**
   * Address of token that is sold.
   * @return sellToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address of token that is sold.")

  public String getSellToken() {
    return sellToken;
  }


  public void setSellToken(String sellToken) {
    this.sellToken = sellToken;
  }


  public CowTradeDTO buyToken(String buyToken) {
    
    this.buyToken = buyToken;
    return this;
  }

   /**
   * Address of token that is bought.
   * @return buyToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address of token that is bought.")

  public String getBuyToken() {
    return buyToken;
  }


  public void setBuyToken(String buyToken) {
    this.buyToken = buyToken;
  }


  public CowTradeDTO order(String order) {
    
    this.order = order;
    return this;
  }

   /**
   * Reference to order.
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to order.")

  public String getOrder() {
    return order;
  }


  public void setOrder(String order) {
    this.order = order;
  }


  public CowTradeDTO vid(Long vid) {
    
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




  public CowTradeDTO evaluatedAggressor(TransactionsETradeAggressiveSide evaluatedAggressor) {
    
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
    CowTradeDTO cowTradeDTO = (CowTradeDTO) o;
    return Objects.equals(this.entryTime, cowTradeDTO.entryTime) &&
        Objects.equals(this.recvTime, cowTradeDTO.recvTime) &&
        Objects.equals(this.blockNumber, cowTradeDTO.blockNumber) &&
        Objects.equals(this.id, cowTradeDTO.id) &&
        Objects.equals(this.timestamp, cowTradeDTO.timestamp) &&
        Objects.equals(this.gasPrice, cowTradeDTO.gasPrice) &&
        Objects.equals(this.gasLimit, cowTradeDTO.gasLimit) &&
        Objects.equals(this.feeAmount, cowTradeDTO.feeAmount) &&
        Objects.equals(this.txHash, cowTradeDTO.txHash) &&
        Objects.equals(this.settlement, cowTradeDTO.settlement) &&
        Objects.equals(this.buyAmount, cowTradeDTO.buyAmount) &&
        Objects.equals(this.sellAmount, cowTradeDTO.sellAmount) &&
        Objects.equals(this.sellToken, cowTradeDTO.sellToken) &&
        Objects.equals(this.buyToken, cowTradeDTO.buyToken) &&
        Objects.equals(this.order, cowTradeDTO.order) &&
        Objects.equals(this.vid, cowTradeDTO.vid) &&
        Objects.equals(this.poolId, cowTradeDTO.poolId) &&
        Objects.equals(this.transactionId, cowTradeDTO.transactionId) &&
        Objects.equals(this.evaluatedPrice, cowTradeDTO.evaluatedPrice) &&
        Objects.equals(this.evaluatedAmount, cowTradeDTO.evaluatedAmount) &&
        Objects.equals(this.evaluatedAggressor, cowTradeDTO.evaluatedAggressor);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, timestamp, gasPrice, gasLimit, feeAmount, txHash, settlement, buyAmount, sellAmount, sellToken, buyToken, order, vid, poolId, transactionId, evaluatedPrice, evaluatedAmount, evaluatedAggressor);
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
    sb.append("class CowTradeDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    settlement: ").append(toIndentedString(settlement)).append("\n");
    sb.append("    buyAmount: ").append(toIndentedString(buyAmount)).append("\n");
    sb.append("    sellAmount: ").append(toIndentedString(sellAmount)).append("\n");
    sb.append("    sellToken: ").append(toIndentedString(sellToken)).append("\n");
    sb.append("    buyToken: ").append(toIndentedString(buyToken)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
    openapiFields.add("timestamp");
    openapiFields.add("gas_price");
    openapiFields.add("gas_limit");
    openapiFields.add("fee_amount");
    openapiFields.add("tx_hash");
    openapiFields.add("settlement");
    openapiFields.add("buy_amount");
    openapiFields.add("sell_amount");
    openapiFields.add("sell_token");
    openapiFields.add("buy_token");
    openapiFields.add("order");
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
  * @throws IOException if the JSON Object is invalid with respect to CowTradeDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CowTradeDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CowTradeDTO is not found in the empty JSON string", CowTradeDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CowTradeDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CowTradeDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull()) && !jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
      if ((jsonObj.get("gas_price") != null && !jsonObj.get("gas_price").isJsonNull()) && !jsonObj.get("gas_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gas_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gas_price").toString()));
      }
      if ((jsonObj.get("gas_limit") != null && !jsonObj.get("gas_limit").isJsonNull()) && !jsonObj.get("gas_limit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gas_limit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gas_limit").toString()));
      }
      if ((jsonObj.get("fee_amount") != null && !jsonObj.get("fee_amount").isJsonNull()) && !jsonObj.get("fee_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee_amount").toString()));
      }
      if ((jsonObj.get("tx_hash") != null && !jsonObj.get("tx_hash").isJsonNull()) && !jsonObj.get("tx_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tx_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tx_hash").toString()));
      }
      if ((jsonObj.get("settlement") != null && !jsonObj.get("settlement").isJsonNull()) && !jsonObj.get("settlement").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement").toString()));
      }
      if ((jsonObj.get("buy_amount") != null && !jsonObj.get("buy_amount").isJsonNull()) && !jsonObj.get("buy_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buy_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buy_amount").toString()));
      }
      if ((jsonObj.get("sell_amount") != null && !jsonObj.get("sell_amount").isJsonNull()) && !jsonObj.get("sell_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sell_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sell_amount").toString()));
      }
      if ((jsonObj.get("sell_token") != null && !jsonObj.get("sell_token").isJsonNull()) && !jsonObj.get("sell_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sell_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sell_token").toString()));
      }
      if ((jsonObj.get("buy_token") != null && !jsonObj.get("buy_token").isJsonNull()) && !jsonObj.get("buy_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buy_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buy_token").toString()));
      }
      if ((jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) && !jsonObj.get("order").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order").toString()));
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
       if (!CowTradeDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CowTradeDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CowTradeDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CowTradeDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<CowTradeDTO>() {
           @Override
           public void write(JsonWriter out, CowTradeDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CowTradeDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CowTradeDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CowTradeDTO
  * @throws IOException if the JSON string is invalid with respect to CowTradeDTO
  */
  public static CowTradeDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CowTradeDTO.class);
  }

 /**
  * Convert an instance of CowTradeDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

