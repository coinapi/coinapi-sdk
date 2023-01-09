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
 * Registered token.
 */
@ApiModel(description = "Registered token.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-09T11:00:55.253581Z[Etc/UTC]")
public class DexTokenDTO {
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

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_FROM_BATCH_ID = "from_batch_id";
  @SerializedName(SERIALIZED_NAME_FROM_BATCH_ID)
  private String fromBatchId;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_DECIMALS = "decimals";
  @SerializedName(SERIALIZED_NAME_DECIMALS)
  private String decimals;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SELL_VOLUME = "sell_volume";
  @SerializedName(SERIALIZED_NAME_SELL_VOLUME)
  private String sellVolume;

  public static final String SERIALIZED_NAME_CREATE_EPOCH = "create_epoch";
  @SerializedName(SERIALIZED_NAME_CREATE_EPOCH)
  private String createEpoch;

  public static final String SERIALIZED_NAME_TX_HASH = "tx_hash";
  @SerializedName(SERIALIZED_NAME_TX_HASH)
  private String txHash;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public static final String SERIALIZED_NAME_TOKEN_SYMBOL = "token_symbol";
  @SerializedName(SERIALIZED_NAME_TOKEN_SYMBOL)
  private String tokenSymbol;

  public DexTokenDTO() {
  }

  
  public DexTokenDTO(
     String tokenSymbol
  ) {
    this();
    this.tokenSymbol = tokenSymbol;
  }

  public DexTokenDTO entryTime(OffsetDateTime entryTime) {
    
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


  public DexTokenDTO recvTime(OffsetDateTime recvTime) {
    
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


  public DexTokenDTO blockNumber(Long blockNumber) {
    
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


  public DexTokenDTO id(String id) {
    
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


  public DexTokenDTO address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public DexTokenDTO fromBatchId(String fromBatchId) {
    
    this.fromBatchId = fromBatchId;
    return this;
  }

   /**
   * 
   * @return fromBatchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFromBatchId() {
    return fromBatchId;
  }


  public void setFromBatchId(String fromBatchId) {
    this.fromBatchId = fromBatchId;
  }


  public DexTokenDTO symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * 
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public DexTokenDTO decimals(String decimals) {
    
    this.decimals = decimals;
    return this;
  }

   /**
   * 
   * @return decimals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDecimals() {
    return decimals;
  }


  public void setDecimals(String decimals) {
    this.decimals = decimals;
  }


  public DexTokenDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DexTokenDTO sellVolume(String sellVolume) {
    
    this.sellVolume = sellVolume;
    return this;
  }

   /**
   * Cumulative sell volume.
   * @return sellVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cumulative sell volume.")

  public String getSellVolume() {
    return sellVolume;
  }


  public void setSellVolume(String sellVolume) {
    this.sellVolume = sellVolume;
  }


  public DexTokenDTO createEpoch(String createEpoch) {
    
    this.createEpoch = createEpoch;
    return this;
  }

   /**
   * 
   * @return createEpoch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreateEpoch() {
    return createEpoch;
  }


  public void setCreateEpoch(String createEpoch) {
    this.createEpoch = createEpoch;
  }


  public DexTokenDTO txHash(String txHash) {
    
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


  public DexTokenDTO vid(Long vid) {
    
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
   * Get tokenSymbol
   * @return tokenSymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTokenSymbol() {
    return tokenSymbol;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DexTokenDTO dexTokenDTO = (DexTokenDTO) o;
    return Objects.equals(this.entryTime, dexTokenDTO.entryTime) &&
        Objects.equals(this.recvTime, dexTokenDTO.recvTime) &&
        Objects.equals(this.blockNumber, dexTokenDTO.blockNumber) &&
        Objects.equals(this.id, dexTokenDTO.id) &&
        Objects.equals(this.address, dexTokenDTO.address) &&
        Objects.equals(this.fromBatchId, dexTokenDTO.fromBatchId) &&
        Objects.equals(this.symbol, dexTokenDTO.symbol) &&
        Objects.equals(this.decimals, dexTokenDTO.decimals) &&
        Objects.equals(this.name, dexTokenDTO.name) &&
        Objects.equals(this.sellVolume, dexTokenDTO.sellVolume) &&
        Objects.equals(this.createEpoch, dexTokenDTO.createEpoch) &&
        Objects.equals(this.txHash, dexTokenDTO.txHash) &&
        Objects.equals(this.vid, dexTokenDTO.vid) &&
        Objects.equals(this.tokenSymbol, dexTokenDTO.tokenSymbol);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, address, fromBatchId, symbol, decimals, name, sellVolume, createEpoch, txHash, vid, tokenSymbol);
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
    sb.append("class DexTokenDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    fromBatchId: ").append(toIndentedString(fromBatchId)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sellVolume: ").append(toIndentedString(sellVolume)).append("\n");
    sb.append("    createEpoch: ").append(toIndentedString(createEpoch)).append("\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
    sb.append("    tokenSymbol: ").append(toIndentedString(tokenSymbol)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("from_batch_id");
    openapiFields.add("symbol");
    openapiFields.add("decimals");
    openapiFields.add("name");
    openapiFields.add("sell_volume");
    openapiFields.add("create_epoch");
    openapiFields.add("tx_hash");
    openapiFields.add("vid");
    openapiFields.add("token_symbol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DexTokenDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DexTokenDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DexTokenDTO is not found in the empty JSON string", DexTokenDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DexTokenDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DexTokenDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("from_batch_id") != null && !jsonObj.get("from_batch_id").isJsonNull()) && !jsonObj.get("from_batch_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from_batch_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from_batch_id").toString()));
      }
      if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull()) && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
      if ((jsonObj.get("decimals") != null && !jsonObj.get("decimals").isJsonNull()) && !jsonObj.get("decimals").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `decimals` to be a primitive type in the JSON string but got `%s`", jsonObj.get("decimals").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("sell_volume") != null && !jsonObj.get("sell_volume").isJsonNull()) && !jsonObj.get("sell_volume").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sell_volume` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sell_volume").toString()));
      }
      if ((jsonObj.get("create_epoch") != null && !jsonObj.get("create_epoch").isJsonNull()) && !jsonObj.get("create_epoch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_epoch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_epoch").toString()));
      }
      if ((jsonObj.get("tx_hash") != null && !jsonObj.get("tx_hash").isJsonNull()) && !jsonObj.get("tx_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tx_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tx_hash").toString()));
      }
      if ((jsonObj.get("token_symbol") != null && !jsonObj.get("token_symbol").isJsonNull()) && !jsonObj.get("token_symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_symbol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DexTokenDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DexTokenDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DexTokenDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DexTokenDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<DexTokenDTO>() {
           @Override
           public void write(JsonWriter out, DexTokenDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DexTokenDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DexTokenDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DexTokenDTO
  * @throws IOException if the JSON string is invalid with respect to DexTokenDTO
  */
  public static DexTokenDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DexTokenDTO.class);
  }

 /**
  * Convert an instance of DexTokenDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

