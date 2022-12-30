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
 * CurvePoolDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-30T08:06:43.957538Z[Etc/UTC]")
public class CurvePoolDTO {
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

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_META = "is_meta";
  @SerializedName(SERIALIZED_NAME_IS_META)
  private Boolean isMeta;

  public static final String SERIALIZED_NAME_REGISTRY_ADDRESS = "registry_address";
  @SerializedName(SERIALIZED_NAME_REGISTRY_ADDRESS)
  private String registryAddress;

  public static final String SERIALIZED_NAME_SWAP_ADDRESS = "swap_address";
  @SerializedName(SERIALIZED_NAME_SWAP_ADDRESS)
  private String swapAddress;

  public static final String SERIALIZED_NAME_LP_TOKEN = "lp_token";
  @SerializedName(SERIALIZED_NAME_LP_TOKEN)
  private String lpToken;

  public static final String SERIALIZED_NAME_COIN_COUNT = "coin_count";
  @SerializedName(SERIALIZED_NAME_COIN_COUNT)
  private String coinCount;

  public static final String SERIALIZED_NAME_UNDERLYING_COUNT = "underlying_count";
  @SerializedName(SERIALIZED_NAME_UNDERLYING_COUNT)
  private String underlyingCount;

  public static final String SERIALIZED_NAME_A = "a";
  @SerializedName(SERIALIZED_NAME_A)
  private String a;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private String fee;

  public static final String SERIALIZED_NAME_ADMIN_FEE = "admin_fee";
  @SerializedName(SERIALIZED_NAME_ADMIN_FEE)
  private String adminFee;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_VIRTUAL_PRICE = "virtual_price";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_PRICE)
  private String virtualPrice;

  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private String locked;

  public static final String SERIALIZED_NAME_ADDED_AT = "added_at";
  @SerializedName(SERIALIZED_NAME_ADDED_AT)
  private OffsetDateTime addedAt;

  public static final String SERIALIZED_NAME_ADDED_AT_BLOCK = "added_at_block";
  @SerializedName(SERIALIZED_NAME_ADDED_AT_BLOCK)
  private String addedAtBlock;

  public static final String SERIALIZED_NAME_ADDED_AT_TRANSACTION = "added_at_transaction";
  @SerializedName(SERIALIZED_NAME_ADDED_AT_TRANSACTION)
  private String addedAtTransaction;

  public static final String SERIALIZED_NAME_REMOVED_AT = "removed_at";
  @SerializedName(SERIALIZED_NAME_REMOVED_AT)
  private String removedAt;

  public static final String SERIALIZED_NAME_REMOVED_AT_BLOCK = "removed_at_block";
  @SerializedName(SERIALIZED_NAME_REMOVED_AT_BLOCK)
  private String removedAtBlock;

  public static final String SERIALIZED_NAME_REMOVED_AT_TRANSACTION = "removed_at_transaction";
  @SerializedName(SERIALIZED_NAME_REMOVED_AT_TRANSACTION)
  private String removedAtTransaction;

  public static final String SERIALIZED_NAME_EXCHANGE_COUNT = "exchange_count";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_COUNT)
  private String exchangeCount;

  public static final String SERIALIZED_NAME_GAUGE_COUNT = "gauge_count";
  @SerializedName(SERIALIZED_NAME_GAUGE_COUNT)
  private String gaugeCount;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public static final String SERIALIZED_NAME_EVALUATED_ASK = "evaluated_ask";
  @SerializedName(SERIALIZED_NAME_EVALUATED_ASK)
  private Double evaluatedAsk;

  public CurvePoolDTO() {
  }

  
  public CurvePoolDTO(
     Double evaluatedAsk
  ) {
    this();
    this.evaluatedAsk = evaluatedAsk;
  }

  public CurvePoolDTO entryTime(OffsetDateTime entryTime) {
    
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


  public CurvePoolDTO recvTime(OffsetDateTime recvTime) {
    
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


  public CurvePoolDTO blockNumber(Long blockNumber) {
    
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


  public CurvePoolDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Pool address.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pool address.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CurvePoolDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Pool&#39;s human-readable name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pool's human-readable name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CurvePoolDTO isMeta(Boolean isMeta) {
    
    this.isMeta = isMeta;
    return this;
  }

   /**
   * Identify whether pool is a metapool.
   * @return isMeta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identify whether pool is a metapool.")

  public Boolean getIsMeta() {
    return isMeta;
  }


  public void setIsMeta(Boolean isMeta) {
    this.isMeta = isMeta;
  }


  public CurvePoolDTO registryAddress(String registryAddress) {
    
    this.registryAddress = registryAddress;
    return this;
  }

   /**
   * Registry contract address from where this pool was registered.
   * @return registryAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Registry contract address from where this pool was registered.")

  public String getRegistryAddress() {
    return registryAddress;
  }


  public void setRegistryAddress(String registryAddress) {
    this.registryAddress = registryAddress;
  }


  public CurvePoolDTO swapAddress(String swapAddress) {
    
    this.swapAddress = swapAddress;
    return this;
  }

   /**
   * Swap contract address.
   * @return swapAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Swap contract address.")

  public String getSwapAddress() {
    return swapAddress;
  }


  public void setSwapAddress(String swapAddress) {
    this.swapAddress = swapAddress;
  }


  public CurvePoolDTO lpToken(String lpToken) {
    
    this.lpToken = lpToken;
    return this;
  }

   /**
   * Address of the token representing LP share.
   * @return lpToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address of the token representing LP share.")

  public String getLpToken() {
    return lpToken;
  }


  public void setLpToken(String lpToken) {
    this.lpToken = lpToken;
  }


  public CurvePoolDTO coinCount(String coinCount) {
    
    this.coinCount = coinCount;
    return this;
  }

   /**
   * Number of coins composing the pool.
   * @return coinCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of coins composing the pool.")

  public String getCoinCount() {
    return coinCount;
  }


  public void setCoinCount(String coinCount) {
    this.coinCount = coinCount;
  }


  public CurvePoolDTO underlyingCount(String underlyingCount) {
    
    this.underlyingCount = underlyingCount;
    return this;
  }

   /**
   * Number of underlying coins composing the pool.
   * @return underlyingCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of underlying coins composing the pool.")

  public String getUnderlyingCount() {
    return underlyingCount;
  }


  public void setUnderlyingCount(String underlyingCount) {
    this.underlyingCount = underlyingCount;
  }


  public CurvePoolDTO a(String a) {
    
    this.a = a;
    return this;
  }

   /**
   * Amplification coefficient multiplied by n * (n - 1).
   * @return a
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amplification coefficient multiplied by n * (n - 1).")

  public String getA() {
    return a;
  }


  public void setA(String a) {
    this.a = a;
  }


  public CurvePoolDTO fee(String fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Fee to charge for exchanges.
   * @return fee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fee to charge for exchanges.")

  public String getFee() {
    return fee;
  }


  public void setFee(String fee) {
    this.fee = fee;
  }


  public CurvePoolDTO adminFee(String adminFee) {
    
    this.adminFee = adminFee;
    return this;
  }

   /**
   * Admin fee is represented as a percentage of the total fee collected on a swap.
   * @return adminFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Admin fee is represented as a percentage of the total fee collected on a swap.")

  public String getAdminFee() {
    return adminFee;
  }


  public void setAdminFee(String adminFee) {
    this.adminFee = adminFee;
  }


  public CurvePoolDTO owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Admin address.
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Admin address.")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public CurvePoolDTO virtualPrice(String virtualPrice) {
    
    this.virtualPrice = virtualPrice;
    return this;
  }

   /**
   * Average dollar value of pool token.
   * @return virtualPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average dollar value of pool token.")

  public String getVirtualPrice() {
    return virtualPrice;
  }


  public void setVirtualPrice(String virtualPrice) {
    this.virtualPrice = virtualPrice;
  }


  public CurvePoolDTO locked(String locked) {
    
    this.locked = locked;
    return this;
  }

   /**
   * 
   * @return locked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocked() {
    return locked;
  }


  public void setLocked(String locked) {
    this.locked = locked;
  }


  public CurvePoolDTO addedAt(OffsetDateTime addedAt) {
    
    this.addedAt = addedAt;
    return this;
  }

   /**
   * 
   * @return addedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getAddedAt() {
    return addedAt;
  }


  public void setAddedAt(OffsetDateTime addedAt) {
    this.addedAt = addedAt;
  }


  public CurvePoolDTO addedAtBlock(String addedAtBlock) {
    
    this.addedAtBlock = addedAtBlock;
    return this;
  }

   /**
   * 
   * @return addedAtBlock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddedAtBlock() {
    return addedAtBlock;
  }


  public void setAddedAtBlock(String addedAtBlock) {
    this.addedAtBlock = addedAtBlock;
  }


  public CurvePoolDTO addedAtTransaction(String addedAtTransaction) {
    
    this.addedAtTransaction = addedAtTransaction;
    return this;
  }

   /**
   * 
   * @return addedAtTransaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddedAtTransaction() {
    return addedAtTransaction;
  }


  public void setAddedAtTransaction(String addedAtTransaction) {
    this.addedAtTransaction = addedAtTransaction;
  }


  public CurvePoolDTO removedAt(String removedAt) {
    
    this.removedAt = removedAt;
    return this;
  }

   /**
   * 
   * @return removedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRemovedAt() {
    return removedAt;
  }


  public void setRemovedAt(String removedAt) {
    this.removedAt = removedAt;
  }


  public CurvePoolDTO removedAtBlock(String removedAtBlock) {
    
    this.removedAtBlock = removedAtBlock;
    return this;
  }

   /**
   * 
   * @return removedAtBlock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRemovedAtBlock() {
    return removedAtBlock;
  }


  public void setRemovedAtBlock(String removedAtBlock) {
    this.removedAtBlock = removedAtBlock;
  }


  public CurvePoolDTO removedAtTransaction(String removedAtTransaction) {
    
    this.removedAtTransaction = removedAtTransaction;
    return this;
  }

   /**
   * 
   * @return removedAtTransaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRemovedAtTransaction() {
    return removedAtTransaction;
  }


  public void setRemovedAtTransaction(String removedAtTransaction) {
    this.removedAtTransaction = removedAtTransaction;
  }


  public CurvePoolDTO exchangeCount(String exchangeCount) {
    
    this.exchangeCount = exchangeCount;
    return this;
  }

   /**
   * 
   * @return exchangeCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExchangeCount() {
    return exchangeCount;
  }


  public void setExchangeCount(String exchangeCount) {
    this.exchangeCount = exchangeCount;
  }


  public CurvePoolDTO gaugeCount(String gaugeCount) {
    
    this.gaugeCount = gaugeCount;
    return this;
  }

   /**
   * 
   * @return gaugeCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGaugeCount() {
    return gaugeCount;
  }


  public void setGaugeCount(String gaugeCount) {
    this.gaugeCount = gaugeCount;
  }


  public CurvePoolDTO vid(Long vid) {
    
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
   * Get evaluatedAsk
   * @return evaluatedAsk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getEvaluatedAsk() {
    return evaluatedAsk;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurvePoolDTO curvePoolDTO = (CurvePoolDTO) o;
    return Objects.equals(this.entryTime, curvePoolDTO.entryTime) &&
        Objects.equals(this.recvTime, curvePoolDTO.recvTime) &&
        Objects.equals(this.blockNumber, curvePoolDTO.blockNumber) &&
        Objects.equals(this.id, curvePoolDTO.id) &&
        Objects.equals(this.name, curvePoolDTO.name) &&
        Objects.equals(this.isMeta, curvePoolDTO.isMeta) &&
        Objects.equals(this.registryAddress, curvePoolDTO.registryAddress) &&
        Objects.equals(this.swapAddress, curvePoolDTO.swapAddress) &&
        Objects.equals(this.lpToken, curvePoolDTO.lpToken) &&
        Objects.equals(this.coinCount, curvePoolDTO.coinCount) &&
        Objects.equals(this.underlyingCount, curvePoolDTO.underlyingCount) &&
        Objects.equals(this.a, curvePoolDTO.a) &&
        Objects.equals(this.fee, curvePoolDTO.fee) &&
        Objects.equals(this.adminFee, curvePoolDTO.adminFee) &&
        Objects.equals(this.owner, curvePoolDTO.owner) &&
        Objects.equals(this.virtualPrice, curvePoolDTO.virtualPrice) &&
        Objects.equals(this.locked, curvePoolDTO.locked) &&
        Objects.equals(this.addedAt, curvePoolDTO.addedAt) &&
        Objects.equals(this.addedAtBlock, curvePoolDTO.addedAtBlock) &&
        Objects.equals(this.addedAtTransaction, curvePoolDTO.addedAtTransaction) &&
        Objects.equals(this.removedAt, curvePoolDTO.removedAt) &&
        Objects.equals(this.removedAtBlock, curvePoolDTO.removedAtBlock) &&
        Objects.equals(this.removedAtTransaction, curvePoolDTO.removedAtTransaction) &&
        Objects.equals(this.exchangeCount, curvePoolDTO.exchangeCount) &&
        Objects.equals(this.gaugeCount, curvePoolDTO.gaugeCount) &&
        Objects.equals(this.vid, curvePoolDTO.vid) &&
        Objects.equals(this.evaluatedAsk, curvePoolDTO.evaluatedAsk);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, name, isMeta, registryAddress, swapAddress, lpToken, coinCount, underlyingCount, a, fee, adminFee, owner, virtualPrice, locked, addedAt, addedAtBlock, addedAtTransaction, removedAt, removedAtBlock, removedAtTransaction, exchangeCount, gaugeCount, vid, evaluatedAsk);
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
    sb.append("class CurvePoolDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isMeta: ").append(toIndentedString(isMeta)).append("\n");
    sb.append("    registryAddress: ").append(toIndentedString(registryAddress)).append("\n");
    sb.append("    swapAddress: ").append(toIndentedString(swapAddress)).append("\n");
    sb.append("    lpToken: ").append(toIndentedString(lpToken)).append("\n");
    sb.append("    coinCount: ").append(toIndentedString(coinCount)).append("\n");
    sb.append("    underlyingCount: ").append(toIndentedString(underlyingCount)).append("\n");
    sb.append("    a: ").append(toIndentedString(a)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    adminFee: ").append(toIndentedString(adminFee)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    virtualPrice: ").append(toIndentedString(virtualPrice)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    addedAt: ").append(toIndentedString(addedAt)).append("\n");
    sb.append("    addedAtBlock: ").append(toIndentedString(addedAtBlock)).append("\n");
    sb.append("    addedAtTransaction: ").append(toIndentedString(addedAtTransaction)).append("\n");
    sb.append("    removedAt: ").append(toIndentedString(removedAt)).append("\n");
    sb.append("    removedAtBlock: ").append(toIndentedString(removedAtBlock)).append("\n");
    sb.append("    removedAtTransaction: ").append(toIndentedString(removedAtTransaction)).append("\n");
    sb.append("    exchangeCount: ").append(toIndentedString(exchangeCount)).append("\n");
    sb.append("    gaugeCount: ").append(toIndentedString(gaugeCount)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
    sb.append("    evaluatedAsk: ").append(toIndentedString(evaluatedAsk)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("is_meta");
    openapiFields.add("registry_address");
    openapiFields.add("swap_address");
    openapiFields.add("lp_token");
    openapiFields.add("coin_count");
    openapiFields.add("underlying_count");
    openapiFields.add("a");
    openapiFields.add("fee");
    openapiFields.add("admin_fee");
    openapiFields.add("owner");
    openapiFields.add("virtual_price");
    openapiFields.add("locked");
    openapiFields.add("added_at");
    openapiFields.add("added_at_block");
    openapiFields.add("added_at_transaction");
    openapiFields.add("removed_at");
    openapiFields.add("removed_at_block");
    openapiFields.add("removed_at_transaction");
    openapiFields.add("exchange_count");
    openapiFields.add("gauge_count");
    openapiFields.add("vid");
    openapiFields.add("evaluated_ask");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CurvePoolDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CurvePoolDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CurvePoolDTO is not found in the empty JSON string", CurvePoolDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CurvePoolDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CurvePoolDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("registry_address") != null && !jsonObj.get("registry_address").isJsonNull()) && !jsonObj.get("registry_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registry_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registry_address").toString()));
      }
      if ((jsonObj.get("swap_address") != null && !jsonObj.get("swap_address").isJsonNull()) && !jsonObj.get("swap_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `swap_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("swap_address").toString()));
      }
      if ((jsonObj.get("lp_token") != null && !jsonObj.get("lp_token").isJsonNull()) && !jsonObj.get("lp_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lp_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lp_token").toString()));
      }
      if ((jsonObj.get("coin_count") != null && !jsonObj.get("coin_count").isJsonNull()) && !jsonObj.get("coin_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coin_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coin_count").toString()));
      }
      if ((jsonObj.get("underlying_count") != null && !jsonObj.get("underlying_count").isJsonNull()) && !jsonObj.get("underlying_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `underlying_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("underlying_count").toString()));
      }
      if ((jsonObj.get("a") != null && !jsonObj.get("a").isJsonNull()) && !jsonObj.get("a").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `a` to be a primitive type in the JSON string but got `%s`", jsonObj.get("a").toString()));
      }
      if ((jsonObj.get("fee") != null && !jsonObj.get("fee").isJsonNull()) && !jsonObj.get("fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee").toString()));
      }
      if ((jsonObj.get("admin_fee") != null && !jsonObj.get("admin_fee").isJsonNull()) && !jsonObj.get("admin_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `admin_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("admin_fee").toString()));
      }
      if ((jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) && !jsonObj.get("owner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      if ((jsonObj.get("virtual_price") != null && !jsonObj.get("virtual_price").isJsonNull()) && !jsonObj.get("virtual_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `virtual_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("virtual_price").toString()));
      }
      if ((jsonObj.get("locked") != null && !jsonObj.get("locked").isJsonNull()) && !jsonObj.get("locked").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locked` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locked").toString()));
      }
      if ((jsonObj.get("added_at_block") != null && !jsonObj.get("added_at_block").isJsonNull()) && !jsonObj.get("added_at_block").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added_at_block` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added_at_block").toString()));
      }
      if ((jsonObj.get("added_at_transaction") != null && !jsonObj.get("added_at_transaction").isJsonNull()) && !jsonObj.get("added_at_transaction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added_at_transaction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added_at_transaction").toString()));
      }
      if ((jsonObj.get("removed_at") != null && !jsonObj.get("removed_at").isJsonNull()) && !jsonObj.get("removed_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `removed_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("removed_at").toString()));
      }
      if ((jsonObj.get("removed_at_block") != null && !jsonObj.get("removed_at_block").isJsonNull()) && !jsonObj.get("removed_at_block").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `removed_at_block` to be a primitive type in the JSON string but got `%s`", jsonObj.get("removed_at_block").toString()));
      }
      if ((jsonObj.get("removed_at_transaction") != null && !jsonObj.get("removed_at_transaction").isJsonNull()) && !jsonObj.get("removed_at_transaction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `removed_at_transaction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("removed_at_transaction").toString()));
      }
      if ((jsonObj.get("exchange_count") != null && !jsonObj.get("exchange_count").isJsonNull()) && !jsonObj.get("exchange_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exchange_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exchange_count").toString()));
      }
      if ((jsonObj.get("gauge_count") != null && !jsonObj.get("gauge_count").isJsonNull()) && !jsonObj.get("gauge_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gauge_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gauge_count").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CurvePoolDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CurvePoolDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CurvePoolDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CurvePoolDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<CurvePoolDTO>() {
           @Override
           public void write(JsonWriter out, CurvePoolDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CurvePoolDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CurvePoolDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CurvePoolDTO
  * @throws IOException if the JSON string is invalid with respect to CurvePoolDTO
  */
  public static CurvePoolDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CurvePoolDTO.class);
  }

 /**
  * Convert an instance of CurvePoolDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

