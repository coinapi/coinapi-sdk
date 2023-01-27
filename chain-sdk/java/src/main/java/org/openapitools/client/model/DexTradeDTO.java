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
 * Trade for a single user, as part of a ring trade. It&#39;s part of the solution submitted by a solver for a given batch.
 */
@ApiModel(description = "Trade for a single user, as part of a ring trade. It's part of the solution submitted by a solver for a given batch.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-27T00:36:56.415636Z[Etc/UTC]")
public class DexTradeDTO {
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

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private String order;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_SELL_VOLUME = "sell_volume";
  @SerializedName(SERIALIZED_NAME_SELL_VOLUME)
  private String sellVolume;

  public static final String SERIALIZED_NAME_BUY_VOLUME = "buy_volume";
  @SerializedName(SERIALIZED_NAME_BUY_VOLUME)
  private String buyVolume;

  public static final String SERIALIZED_NAME_TRADE_BATCH_ID = "trade_batch_id";
  @SerializedName(SERIALIZED_NAME_TRADE_BATCH_ID)
  private String tradeBatchId;

  public static final String SERIALIZED_NAME_TRADE_EPOCH = "trade_epoch";
  @SerializedName(SERIALIZED_NAME_TRADE_EPOCH)
  private String tradeEpoch;

  public static final String SERIALIZED_NAME_BUY_TOKEN = "buy_token";
  @SerializedName(SERIALIZED_NAME_BUY_TOKEN)
  private String buyToken;

  public static final String SERIALIZED_NAME_SELL_TOKEN = "sell_token";
  @SerializedName(SERIALIZED_NAME_SELL_TOKEN)
  private String sellToken;

  public static final String SERIALIZED_NAME_CREATE_EPOCH = "create_epoch";
  @SerializedName(SERIALIZED_NAME_CREATE_EPOCH)
  private String createEpoch;

  public static final String SERIALIZED_NAME_REVERT_EPOCH = "revert_epoch";
  @SerializedName(SERIALIZED_NAME_REVERT_EPOCH)
  private String revertEpoch;

  public static final String SERIALIZED_NAME_TX_HASH = "tx_hash";
  @SerializedName(SERIALIZED_NAME_TX_HASH)
  private String txHash;

  public static final String SERIALIZED_NAME_TX_LOG_INDEX = "tx_log_index";
  @SerializedName(SERIALIZED_NAME_TX_LOG_INDEX)
  private String txLogIndex;

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

  public DexTradeDTO() {
  }

  
  public DexTradeDTO(
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

  public DexTradeDTO entryTime(OffsetDateTime entryTime) {
    
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


  public DexTradeDTO recvTime(OffsetDateTime recvTime) {
    
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


  public DexTradeDTO blockNumber(Long blockNumber) {
    
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


  public DexTradeDTO id(String id) {
    
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


  public DexTradeDTO order(String order) {
    
    this.order = order;
    return this;
  }

   /**
   * 
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrder() {
    return order;
  }


  public void setOrder(String order) {
    this.order = order;
  }


  public DexTradeDTO owner(String owner) {
    
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


  public DexTradeDTO sellVolume(String sellVolume) {
    
    this.sellVolume = sellVolume;
    return this;
  }

   /**
   * 
   * @return sellVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSellVolume() {
    return sellVolume;
  }


  public void setSellVolume(String sellVolume) {
    this.sellVolume = sellVolume;
  }


  public DexTradeDTO buyVolume(String buyVolume) {
    
    this.buyVolume = buyVolume;
    return this;
  }

   /**
   * 
   * @return buyVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBuyVolume() {
    return buyVolume;
  }


  public void setBuyVolume(String buyVolume) {
    this.buyVolume = buyVolume;
  }


  public DexTradeDTO tradeBatchId(String tradeBatchId) {
    
    this.tradeBatchId = tradeBatchId;
    return this;
  }

   /**
   * 
   * @return tradeBatchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTradeBatchId() {
    return tradeBatchId;
  }


  public void setTradeBatchId(String tradeBatchId) {
    this.tradeBatchId = tradeBatchId;
  }


  public DexTradeDTO tradeEpoch(String tradeEpoch) {
    
    this.tradeEpoch = tradeEpoch;
    return this;
  }

   /**
   * The date of the end of the batch.
   * @return tradeEpoch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date of the end of the batch.")

  public String getTradeEpoch() {
    return tradeEpoch;
  }


  public void setTradeEpoch(String tradeEpoch) {
    this.tradeEpoch = tradeEpoch;
  }


  public DexTradeDTO buyToken(String buyToken) {
    
    this.buyToken = buyToken;
    return this;
  }

   /**
   * 
   * @return buyToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBuyToken() {
    return buyToken;
  }


  public void setBuyToken(String buyToken) {
    this.buyToken = buyToken;
  }


  public DexTradeDTO sellToken(String sellToken) {
    
    this.sellToken = sellToken;
    return this;
  }

   /**
   * 
   * @return sellToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSellToken() {
    return sellToken;
  }


  public void setSellToken(String sellToken) {
    this.sellToken = sellToken;
  }


  public DexTradeDTO createEpoch(String createEpoch) {
    
    this.createEpoch = createEpoch;
    return this;
  }

   /**
   * The date where the transaction was mined.
   * @return createEpoch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date where the transaction was mined.")

  public String getCreateEpoch() {
    return createEpoch;
  }


  public void setCreateEpoch(String createEpoch) {
    this.createEpoch = createEpoch;
  }


  public DexTradeDTO revertEpoch(String revertEpoch) {
    
    this.revertEpoch = revertEpoch;
    return this;
  }

   /**
   * 
   * @return revertEpoch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRevertEpoch() {
    return revertEpoch;
  }


  public void setRevertEpoch(String revertEpoch) {
    this.revertEpoch = revertEpoch;
  }


  public DexTradeDTO txHash(String txHash) {
    
    this.txHash = txHash;
    return this;
  }

   /**
   * 
   * @return txHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTxHash() {
    return txHash;
  }


  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }


  public DexTradeDTO txLogIndex(String txLogIndex) {
    
    this.txLogIndex = txLogIndex;
    return this;
  }

   /**
   * 
   * @return txLogIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTxLogIndex() {
    return txLogIndex;
  }


  public void setTxLogIndex(String txLogIndex) {
    this.txLogIndex = txLogIndex;
  }


  public DexTradeDTO vid(Long vid) {
    
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




  public DexTradeDTO evaluatedAggressor(TransactionsETradeAggressiveSide evaluatedAggressor) {
    
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
    DexTradeDTO dexTradeDTO = (DexTradeDTO) o;
    return Objects.equals(this.entryTime, dexTradeDTO.entryTime) &&
        Objects.equals(this.recvTime, dexTradeDTO.recvTime) &&
        Objects.equals(this.blockNumber, dexTradeDTO.blockNumber) &&
        Objects.equals(this.id, dexTradeDTO.id) &&
        Objects.equals(this.order, dexTradeDTO.order) &&
        Objects.equals(this.owner, dexTradeDTO.owner) &&
        Objects.equals(this.sellVolume, dexTradeDTO.sellVolume) &&
        Objects.equals(this.buyVolume, dexTradeDTO.buyVolume) &&
        Objects.equals(this.tradeBatchId, dexTradeDTO.tradeBatchId) &&
        Objects.equals(this.tradeEpoch, dexTradeDTO.tradeEpoch) &&
        Objects.equals(this.buyToken, dexTradeDTO.buyToken) &&
        Objects.equals(this.sellToken, dexTradeDTO.sellToken) &&
        Objects.equals(this.createEpoch, dexTradeDTO.createEpoch) &&
        Objects.equals(this.revertEpoch, dexTradeDTO.revertEpoch) &&
        Objects.equals(this.txHash, dexTradeDTO.txHash) &&
        Objects.equals(this.txLogIndex, dexTradeDTO.txLogIndex) &&
        Objects.equals(this.vid, dexTradeDTO.vid) &&
        Objects.equals(this.poolId, dexTradeDTO.poolId) &&
        Objects.equals(this.transactionId, dexTradeDTO.transactionId) &&
        Objects.equals(this.evaluatedPrice, dexTradeDTO.evaluatedPrice) &&
        Objects.equals(this.evaluatedAmount, dexTradeDTO.evaluatedAmount) &&
        Objects.equals(this.evaluatedAggressor, dexTradeDTO.evaluatedAggressor);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, order, owner, sellVolume, buyVolume, tradeBatchId, tradeEpoch, buyToken, sellToken, createEpoch, revertEpoch, txHash, txLogIndex, vid, poolId, transactionId, evaluatedPrice, evaluatedAmount, evaluatedAggressor);
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
    sb.append("class DexTradeDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    sellVolume: ").append(toIndentedString(sellVolume)).append("\n");
    sb.append("    buyVolume: ").append(toIndentedString(buyVolume)).append("\n");
    sb.append("    tradeBatchId: ").append(toIndentedString(tradeBatchId)).append("\n");
    sb.append("    tradeEpoch: ").append(toIndentedString(tradeEpoch)).append("\n");
    sb.append("    buyToken: ").append(toIndentedString(buyToken)).append("\n");
    sb.append("    sellToken: ").append(toIndentedString(sellToken)).append("\n");
    sb.append("    createEpoch: ").append(toIndentedString(createEpoch)).append("\n");
    sb.append("    revertEpoch: ").append(toIndentedString(revertEpoch)).append("\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    txLogIndex: ").append(toIndentedString(txLogIndex)).append("\n");
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
    openapiFields.add("order");
    openapiFields.add("owner");
    openapiFields.add("sell_volume");
    openapiFields.add("buy_volume");
    openapiFields.add("trade_batch_id");
    openapiFields.add("trade_epoch");
    openapiFields.add("buy_token");
    openapiFields.add("sell_token");
    openapiFields.add("create_epoch");
    openapiFields.add("revert_epoch");
    openapiFields.add("tx_hash");
    openapiFields.add("tx_log_index");
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
  * @throws IOException if the JSON Object is invalid with respect to DexTradeDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DexTradeDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DexTradeDTO is not found in the empty JSON string", DexTradeDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DexTradeDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DexTradeDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) && !jsonObj.get("order").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order").toString()));
      }
      if ((jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) && !jsonObj.get("owner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      if ((jsonObj.get("sell_volume") != null && !jsonObj.get("sell_volume").isJsonNull()) && !jsonObj.get("sell_volume").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sell_volume` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sell_volume").toString()));
      }
      if ((jsonObj.get("buy_volume") != null && !jsonObj.get("buy_volume").isJsonNull()) && !jsonObj.get("buy_volume").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buy_volume` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buy_volume").toString()));
      }
      if ((jsonObj.get("trade_batch_id") != null && !jsonObj.get("trade_batch_id").isJsonNull()) && !jsonObj.get("trade_batch_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_batch_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_batch_id").toString()));
      }
      if ((jsonObj.get("trade_epoch") != null && !jsonObj.get("trade_epoch").isJsonNull()) && !jsonObj.get("trade_epoch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_epoch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_epoch").toString()));
      }
      if ((jsonObj.get("buy_token") != null && !jsonObj.get("buy_token").isJsonNull()) && !jsonObj.get("buy_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buy_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buy_token").toString()));
      }
      if ((jsonObj.get("sell_token") != null && !jsonObj.get("sell_token").isJsonNull()) && !jsonObj.get("sell_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sell_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sell_token").toString()));
      }
      if ((jsonObj.get("create_epoch") != null && !jsonObj.get("create_epoch").isJsonNull()) && !jsonObj.get("create_epoch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_epoch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_epoch").toString()));
      }
      if ((jsonObj.get("revert_epoch") != null && !jsonObj.get("revert_epoch").isJsonNull()) && !jsonObj.get("revert_epoch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revert_epoch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revert_epoch").toString()));
      }
      if ((jsonObj.get("tx_hash") != null && !jsonObj.get("tx_hash").isJsonNull()) && !jsonObj.get("tx_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tx_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tx_hash").toString()));
      }
      if ((jsonObj.get("tx_log_index") != null && !jsonObj.get("tx_log_index").isJsonNull()) && !jsonObj.get("tx_log_index").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tx_log_index` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tx_log_index").toString()));
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
       if (!DexTradeDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DexTradeDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DexTradeDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DexTradeDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<DexTradeDTO>() {
           @Override
           public void write(JsonWriter out, DexTradeDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DexTradeDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DexTradeDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DexTradeDTO
  * @throws IOException if the JSON string is invalid with respect to DexTradeDTO
  */
  public static DexTradeDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DexTradeDTO.class);
  }

 /**
  * Convert an instance of DexTradeDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

