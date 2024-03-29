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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * CRYPTOPUNKSCollectionDailySnapshotDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-19T09:56:11.979115Z[Etc/UTC]")
public class CRYPTOPUNKSCollectionDailySnapshotDTO {
  public static final String SERIALIZED_NAME_ENTRY_TIME = "entry_time";
  @SerializedName(SERIALIZED_NAME_ENTRY_TIME)
  private OffsetDateTime entryTime;

  public static final String SERIALIZED_NAME_RECV_TIME = "recv_time";
  @SerializedName(SERIALIZED_NAME_RECV_TIME)
  private OffsetDateTime recvTime;

  public static final String SERIALIZED_NAME_BLOCK_NUMBER = "block_number";
  @SerializedName(SERIALIZED_NAME_BLOCK_NUMBER)
  private String blockNumber;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public static final String SERIALIZED_NAME_BLOCK_RANGE = "block_range";
  @SerializedName(SERIALIZED_NAME_BLOCK_RANGE)
  private String blockRange;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_COLLECTION = "collection";
  @SerializedName(SERIALIZED_NAME_COLLECTION)
  private String collection;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_ROYALTY_FEE = "royalty_fee";
  @SerializedName(SERIALIZED_NAME_ROYALTY_FEE)
  private String royaltyFee;

  public static final String SERIALIZED_NAME_DAILY_MIN_SALE_PRICE = "daily_min_sale_price";
  @SerializedName(SERIALIZED_NAME_DAILY_MIN_SALE_PRICE)
  private String dailyMinSalePrice;

  public static final String SERIALIZED_NAME_DAILY_MAX_SALE_PRICE = "daily_max_sale_price";
  @SerializedName(SERIALIZED_NAME_DAILY_MAX_SALE_PRICE)
  private String dailyMaxSalePrice;

  public static final String SERIALIZED_NAME_CUMULATIVE_TRADE_VOLUME_ETH = "cumulative_trade_volume_eth";
  @SerializedName(SERIALIZED_NAME_CUMULATIVE_TRADE_VOLUME_ETH)
  private String cumulativeTradeVolumeEth;

  public static final String SERIALIZED_NAME_DAILY_TRADE_VOLUME_ETH = "daily_trade_volume_eth";
  @SerializedName(SERIALIZED_NAME_DAILY_TRADE_VOLUME_ETH)
  private String dailyTradeVolumeEth;

  public static final String SERIALIZED_NAME_MARKETPLACE_REVENUE_ETH = "marketplace_revenue_eth";
  @SerializedName(SERIALIZED_NAME_MARKETPLACE_REVENUE_ETH)
  private String marketplaceRevenueEth;

  public static final String SERIALIZED_NAME_CREATOR_REVENUE_ETH = "creator_revenue_eth";
  @SerializedName(SERIALIZED_NAME_CREATOR_REVENUE_ETH)
  private String creatorRevenueEth;

  public static final String SERIALIZED_NAME_TOTAL_REVENUE_ETH = "total_revenue_eth";
  @SerializedName(SERIALIZED_NAME_TOTAL_REVENUE_ETH)
  private String totalRevenueEth;

  public static final String SERIALIZED_NAME_TRADE_COUNT = "trade_count";
  @SerializedName(SERIALIZED_NAME_TRADE_COUNT)
  private Integer tradeCount;

  public static final String SERIALIZED_NAME_DAILY_TRADED_ITEM_COUNT = "daily_traded_item_count";
  @SerializedName(SERIALIZED_NAME_DAILY_TRADED_ITEM_COUNT)
  private Integer dailyTradedItemCount;

  public CRYPTOPUNKSCollectionDailySnapshotDTO() {
  }

  public CRYPTOPUNKSCollectionDailySnapshotDTO entryTime(OffsetDateTime entryTime) {
    
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


  public CRYPTOPUNKSCollectionDailySnapshotDTO recvTime(OffsetDateTime recvTime) {
    
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


  public CRYPTOPUNKSCollectionDailySnapshotDTO blockNumber(String blockNumber) {
    
    this.blockNumber = blockNumber;
    return this;
  }

   /**
   * 
   * @return blockNumber
  **/
  @javax.annotation.Nullable
  public String getBlockNumber() {
    return blockNumber;
  }


  public void setBlockNumber(String blockNumber) {
    this.blockNumber = blockNumber;
  }


  public CRYPTOPUNKSCollectionDailySnapshotDTO vid(Long vid) {
    
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


  public CRYPTOPUNKSCollectionDailySnapshotDTO blockRange(String blockRange) {
    
    this.blockRange = blockRange;
    return this;
  }

   /**
   * 
   * @return blockRange
  **/
  @javax.annotation.Nullable
  public String getBlockRange() {
    return blockRange;
  }


  public void setBlockRange(String blockRange) {
    this.blockRange = blockRange;
  }


  public CRYPTOPUNKSCollectionDailySnapshotDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CRYPTOPUNKSCollectionDailySnapshotDTO collection(String collection) {
    
    this.collection = collection;
    return this;
  }

   /**
   * 
   * @return collection
  **/
  @javax.annotation.Nullable
  public String getCollection() {
    return collection;
  }


  public void setCollection(String collection) {
    this.collection = collection;
  }


  public CRYPTOPUNKSCollectionDailySnapshotDTO timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * 
   * @return timestamp
  **/
  @javax.annotation.Nullable
  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public CRYPTOPUNKSCollectionDailySnapshotDTO royaltyFee(String royaltyFee) {
    
    this.royaltyFee = royaltyFee;
    return this;
  }

   /**
   * 
   * @return royaltyFee
  **/
  @javax.annotation.Nullable
  public String getRoyaltyFee() {
    return royaltyFee;
  }


  public void setRoyaltyFee(String royaltyFee) {
    this.royaltyFee = royaltyFee;
  }


  public CRYPTOPUNKSCollectionDailySnapshotDTO dailyMinSalePrice(String dailyMinSalePrice) {
    
    this.dailyMinSalePrice = dailyMinSalePrice;
    return this;
  }

   /**
   * 
   * @return dailyMinSalePrice
  **/
  @javax.annotation.Nullable
  public String getDailyMinSalePrice() {
    return dailyMinSalePrice;
  }


  public void setDailyMinSalePrice(String dailyMinSalePrice) {
    this.dailyMinSalePrice = dailyMinSalePrice;
  }


  public CRYPTOPUNKSCollectionDailySnapshotDTO dailyMaxSalePrice(String dailyMaxSalePrice) {
    
    this.dailyMaxSalePrice = dailyMaxSalePrice;
    return this;
  }

   /**
   * 
   * @return dailyMaxSalePrice
  **/
  @javax.annotation.Nullable
  public String getDailyMaxSalePrice() {
    return dailyMaxSalePrice;
  }


  public void setDailyMaxSalePrice(String dailyMaxSalePrice) {
    this.dailyMaxSalePrice = dailyMaxSalePrice;
  }


  public CRYPTOPUNKSCollectionDailySnapshotDTO cumulativeTradeVolumeEth(String cumulativeTradeVolumeEth) {
    
    this.cumulativeTradeVolumeEth = cumulativeTradeVolumeEth;
    return this;
  }

   /**
   * 
   * @return cumulativeTradeVolumeEth
  **/
  @javax.annotation.Nullable
  public String getCumulativeTradeVolumeEth() {
    return cumulativeTradeVolumeEth;
  }


  public void setCumulativeTradeVolumeEth(String cumulativeTradeVolumeEth) {
    this.cumulativeTradeVolumeEth = cumulativeTradeVolumeEth;
  }


  public CRYPTOPUNKSCollectionDailySnapshotDTO dailyTradeVolumeEth(String dailyTradeVolumeEth) {
    
    this.dailyTradeVolumeEth = dailyTradeVolumeEth;
    return this;
  }

   /**
   * 
   * @return dailyTradeVolumeEth
  **/
  @javax.annotation.Nullable
  public String getDailyTradeVolumeEth() {
    return dailyTradeVolumeEth;
  }


  public void setDailyTradeVolumeEth(String dailyTradeVolumeEth) {
    this.dailyTradeVolumeEth = dailyTradeVolumeEth;
  }


  public CRYPTOPUNKSCollectionDailySnapshotDTO marketplaceRevenueEth(String marketplaceRevenueEth) {
    
    this.marketplaceRevenueEth = marketplaceRevenueEth;
    return this;
  }

   /**
   * 
   * @return marketplaceRevenueEth
  **/
  @javax.annotation.Nullable
  public String getMarketplaceRevenueEth() {
    return marketplaceRevenueEth;
  }


  public void setMarketplaceRevenueEth(String marketplaceRevenueEth) {
    this.marketplaceRevenueEth = marketplaceRevenueEth;
  }


  public CRYPTOPUNKSCollectionDailySnapshotDTO creatorRevenueEth(String creatorRevenueEth) {
    
    this.creatorRevenueEth = creatorRevenueEth;
    return this;
  }

   /**
   * 
   * @return creatorRevenueEth
  **/
  @javax.annotation.Nullable
  public String getCreatorRevenueEth() {
    return creatorRevenueEth;
  }


  public void setCreatorRevenueEth(String creatorRevenueEth) {
    this.creatorRevenueEth = creatorRevenueEth;
  }


  public CRYPTOPUNKSCollectionDailySnapshotDTO totalRevenueEth(String totalRevenueEth) {
    
    this.totalRevenueEth = totalRevenueEth;
    return this;
  }

   /**
   * 
   * @return totalRevenueEth
  **/
  @javax.annotation.Nullable
  public String getTotalRevenueEth() {
    return totalRevenueEth;
  }


  public void setTotalRevenueEth(String totalRevenueEth) {
    this.totalRevenueEth = totalRevenueEth;
  }


  public CRYPTOPUNKSCollectionDailySnapshotDTO tradeCount(Integer tradeCount) {
    
    this.tradeCount = tradeCount;
    return this;
  }

   /**
   * 
   * @return tradeCount
  **/
  @javax.annotation.Nullable
  public Integer getTradeCount() {
    return tradeCount;
  }


  public void setTradeCount(Integer tradeCount) {
    this.tradeCount = tradeCount;
  }


  public CRYPTOPUNKSCollectionDailySnapshotDTO dailyTradedItemCount(Integer dailyTradedItemCount) {
    
    this.dailyTradedItemCount = dailyTradedItemCount;
    return this;
  }

   /**
   * 
   * @return dailyTradedItemCount
  **/
  @javax.annotation.Nullable
  public Integer getDailyTradedItemCount() {
    return dailyTradedItemCount;
  }


  public void setDailyTradedItemCount(Integer dailyTradedItemCount) {
    this.dailyTradedItemCount = dailyTradedItemCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRYPTOPUNKSCollectionDailySnapshotDTO crYPTOPUNKSCollectionDailySnapshotDTO = (CRYPTOPUNKSCollectionDailySnapshotDTO) o;
    return Objects.equals(this.entryTime, crYPTOPUNKSCollectionDailySnapshotDTO.entryTime) &&
        Objects.equals(this.recvTime, crYPTOPUNKSCollectionDailySnapshotDTO.recvTime) &&
        Objects.equals(this.blockNumber, crYPTOPUNKSCollectionDailySnapshotDTO.blockNumber) &&
        Objects.equals(this.vid, crYPTOPUNKSCollectionDailySnapshotDTO.vid) &&
        Objects.equals(this.blockRange, crYPTOPUNKSCollectionDailySnapshotDTO.blockRange) &&
        Objects.equals(this.id, crYPTOPUNKSCollectionDailySnapshotDTO.id) &&
        Objects.equals(this.collection, crYPTOPUNKSCollectionDailySnapshotDTO.collection) &&
        Objects.equals(this.timestamp, crYPTOPUNKSCollectionDailySnapshotDTO.timestamp) &&
        Objects.equals(this.royaltyFee, crYPTOPUNKSCollectionDailySnapshotDTO.royaltyFee) &&
        Objects.equals(this.dailyMinSalePrice, crYPTOPUNKSCollectionDailySnapshotDTO.dailyMinSalePrice) &&
        Objects.equals(this.dailyMaxSalePrice, crYPTOPUNKSCollectionDailySnapshotDTO.dailyMaxSalePrice) &&
        Objects.equals(this.cumulativeTradeVolumeEth, crYPTOPUNKSCollectionDailySnapshotDTO.cumulativeTradeVolumeEth) &&
        Objects.equals(this.dailyTradeVolumeEth, crYPTOPUNKSCollectionDailySnapshotDTO.dailyTradeVolumeEth) &&
        Objects.equals(this.marketplaceRevenueEth, crYPTOPUNKSCollectionDailySnapshotDTO.marketplaceRevenueEth) &&
        Objects.equals(this.creatorRevenueEth, crYPTOPUNKSCollectionDailySnapshotDTO.creatorRevenueEth) &&
        Objects.equals(this.totalRevenueEth, crYPTOPUNKSCollectionDailySnapshotDTO.totalRevenueEth) &&
        Objects.equals(this.tradeCount, crYPTOPUNKSCollectionDailySnapshotDTO.tradeCount) &&
        Objects.equals(this.dailyTradedItemCount, crYPTOPUNKSCollectionDailySnapshotDTO.dailyTradedItemCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, vid, blockRange, id, collection, timestamp, royaltyFee, dailyMinSalePrice, dailyMaxSalePrice, cumulativeTradeVolumeEth, dailyTradeVolumeEth, marketplaceRevenueEth, creatorRevenueEth, totalRevenueEth, tradeCount, dailyTradedItemCount);
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
    sb.append("class CRYPTOPUNKSCollectionDailySnapshotDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
    sb.append("    blockRange: ").append(toIndentedString(blockRange)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    royaltyFee: ").append(toIndentedString(royaltyFee)).append("\n");
    sb.append("    dailyMinSalePrice: ").append(toIndentedString(dailyMinSalePrice)).append("\n");
    sb.append("    dailyMaxSalePrice: ").append(toIndentedString(dailyMaxSalePrice)).append("\n");
    sb.append("    cumulativeTradeVolumeEth: ").append(toIndentedString(cumulativeTradeVolumeEth)).append("\n");
    sb.append("    dailyTradeVolumeEth: ").append(toIndentedString(dailyTradeVolumeEth)).append("\n");
    sb.append("    marketplaceRevenueEth: ").append(toIndentedString(marketplaceRevenueEth)).append("\n");
    sb.append("    creatorRevenueEth: ").append(toIndentedString(creatorRevenueEth)).append("\n");
    sb.append("    totalRevenueEth: ").append(toIndentedString(totalRevenueEth)).append("\n");
    sb.append("    tradeCount: ").append(toIndentedString(tradeCount)).append("\n");
    sb.append("    dailyTradedItemCount: ").append(toIndentedString(dailyTradedItemCount)).append("\n");
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
    openapiFields.add("block_range");
    openapiFields.add("id");
    openapiFields.add("collection");
    openapiFields.add("timestamp");
    openapiFields.add("royalty_fee");
    openapiFields.add("daily_min_sale_price");
    openapiFields.add("daily_max_sale_price");
    openapiFields.add("cumulative_trade_volume_eth");
    openapiFields.add("daily_trade_volume_eth");
    openapiFields.add("marketplace_revenue_eth");
    openapiFields.add("creator_revenue_eth");
    openapiFields.add("total_revenue_eth");
    openapiFields.add("trade_count");
    openapiFields.add("daily_traded_item_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CRYPTOPUNKSCollectionDailySnapshotDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CRYPTOPUNKSCollectionDailySnapshotDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CRYPTOPUNKSCollectionDailySnapshotDTO is not found in the empty JSON string", CRYPTOPUNKSCollectionDailySnapshotDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CRYPTOPUNKSCollectionDailySnapshotDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CRYPTOPUNKSCollectionDailySnapshotDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("block_number") != null && !jsonObj.get("block_number").isJsonNull()) && !jsonObj.get("block_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `block_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("block_number").toString()));
      }
      if ((jsonObj.get("block_range") != null && !jsonObj.get("block_range").isJsonNull()) && !jsonObj.get("block_range").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `block_range` to be a primitive type in the JSON string but got `%s`", jsonObj.get("block_range").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("collection") != null && !jsonObj.get("collection").isJsonNull()) && !jsonObj.get("collection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collection").toString()));
      }
      if ((jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull()) && !jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
      if ((jsonObj.get("royalty_fee") != null && !jsonObj.get("royalty_fee").isJsonNull()) && !jsonObj.get("royalty_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `royalty_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("royalty_fee").toString()));
      }
      if ((jsonObj.get("daily_min_sale_price") != null && !jsonObj.get("daily_min_sale_price").isJsonNull()) && !jsonObj.get("daily_min_sale_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `daily_min_sale_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("daily_min_sale_price").toString()));
      }
      if ((jsonObj.get("daily_max_sale_price") != null && !jsonObj.get("daily_max_sale_price").isJsonNull()) && !jsonObj.get("daily_max_sale_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `daily_max_sale_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("daily_max_sale_price").toString()));
      }
      if ((jsonObj.get("cumulative_trade_volume_eth") != null && !jsonObj.get("cumulative_trade_volume_eth").isJsonNull()) && !jsonObj.get("cumulative_trade_volume_eth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cumulative_trade_volume_eth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cumulative_trade_volume_eth").toString()));
      }
      if ((jsonObj.get("daily_trade_volume_eth") != null && !jsonObj.get("daily_trade_volume_eth").isJsonNull()) && !jsonObj.get("daily_trade_volume_eth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `daily_trade_volume_eth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("daily_trade_volume_eth").toString()));
      }
      if ((jsonObj.get("marketplace_revenue_eth") != null && !jsonObj.get("marketplace_revenue_eth").isJsonNull()) && !jsonObj.get("marketplace_revenue_eth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `marketplace_revenue_eth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("marketplace_revenue_eth").toString()));
      }
      if ((jsonObj.get("creator_revenue_eth") != null && !jsonObj.get("creator_revenue_eth").isJsonNull()) && !jsonObj.get("creator_revenue_eth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator_revenue_eth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator_revenue_eth").toString()));
      }
      if ((jsonObj.get("total_revenue_eth") != null && !jsonObj.get("total_revenue_eth").isJsonNull()) && !jsonObj.get("total_revenue_eth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_revenue_eth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_revenue_eth").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CRYPTOPUNKSCollectionDailySnapshotDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CRYPTOPUNKSCollectionDailySnapshotDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CRYPTOPUNKSCollectionDailySnapshotDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CRYPTOPUNKSCollectionDailySnapshotDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<CRYPTOPUNKSCollectionDailySnapshotDTO>() {
           @Override
           public void write(JsonWriter out, CRYPTOPUNKSCollectionDailySnapshotDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CRYPTOPUNKSCollectionDailySnapshotDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CRYPTOPUNKSCollectionDailySnapshotDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CRYPTOPUNKSCollectionDailySnapshotDTO
  * @throws IOException if the JSON string is invalid with respect to CRYPTOPUNKSCollectionDailySnapshotDTO
  */
  public static CRYPTOPUNKSCollectionDailySnapshotDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CRYPTOPUNKSCollectionDailySnapshotDTO.class);
  }

 /**
  * Convert an instance of CRYPTOPUNKSCollectionDailySnapshotDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

