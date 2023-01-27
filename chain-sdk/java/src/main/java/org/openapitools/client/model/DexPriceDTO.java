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
 * Token price in conjuction with batch id.
 */
@ApiModel(description = "Token price in conjuction with batch id.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-27T16:01:35.227471Z[Etc/UTC]")
public class DexPriceDTO {
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

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_BATCH_ID = "batch_id";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private String batchId;

  public static final String SERIALIZED_NAME_PRICE_IN_OWL_NUMERATOR = "price_in_owl_numerator";
  @SerializedName(SERIALIZED_NAME_PRICE_IN_OWL_NUMERATOR)
  private String priceInOwlNumerator;

  public static final String SERIALIZED_NAME_PRICE_IN_OWL_DENOMINATOR = "price_in_owl_denominator";
  @SerializedName(SERIALIZED_NAME_PRICE_IN_OWL_DENOMINATOR)
  private String priceInOwlDenominator;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private String volume;

  public static final String SERIALIZED_NAME_CREATE_EPOCH = "create_epoch";
  @SerializedName(SERIALIZED_NAME_CREATE_EPOCH)
  private String createEpoch;

  public static final String SERIALIZED_NAME_TX_HASH = "tx_hash";
  @SerializedName(SERIALIZED_NAME_TX_HASH)
  private String txHash;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public DexPriceDTO() {
  }

  public DexPriceDTO entryTime(OffsetDateTime entryTime) {
    
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


  public DexPriceDTO recvTime(OffsetDateTime recvTime) {
    
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


  public DexPriceDTO blockNumber(Long blockNumber) {
    
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


  public DexPriceDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier, format: (token id)-(batch id).
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier, format: (token id)-(batch id).")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DexPriceDTO token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Token identifier.
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token identifier.")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public DexPriceDTO batchId(String batchId) {
    
    this.batchId = batchId;
    return this;
  }

   /**
   * Batch identifier.
   * @return batchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Batch identifier.")

  public String getBatchId() {
    return batchId;
  }


  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }


  public DexPriceDTO priceInOwlNumerator(String priceInOwlNumerator) {
    
    this.priceInOwlNumerator = priceInOwlNumerator;
    return this;
  }

   /**
   * Price enumerator in OWL (derivative of the GNO token).
   * @return priceInOwlNumerator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Price enumerator in OWL (derivative of the GNO token).")

  public String getPriceInOwlNumerator() {
    return priceInOwlNumerator;
  }


  public void setPriceInOwlNumerator(String priceInOwlNumerator) {
    this.priceInOwlNumerator = priceInOwlNumerator;
  }


  public DexPriceDTO priceInOwlDenominator(String priceInOwlDenominator) {
    
    this.priceInOwlDenominator = priceInOwlDenominator;
    return this;
  }

   /**
   * Price denominator in OWL (derivative of the GNO token).
   * @return priceInOwlDenominator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Price denominator in OWL (derivative of the GNO token).")

  public String getPriceInOwlDenominator() {
    return priceInOwlDenominator;
  }


  public void setPriceInOwlDenominator(String priceInOwlDenominator) {
    this.priceInOwlDenominator = priceInOwlDenominator;
  }


  public DexPriceDTO volume(String volume) {
    
    this.volume = volume;
    return this;
  }

   /**
   * Volume.
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Volume.")

  public String getVolume() {
    return volume;
  }


  public void setVolume(String volume) {
    this.volume = volume;
  }


  public DexPriceDTO createEpoch(String createEpoch) {
    
    this.createEpoch = createEpoch;
    return this;
  }

   /**
   * Create epoch.
   * @return createEpoch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Create epoch.")

  public String getCreateEpoch() {
    return createEpoch;
  }


  public void setCreateEpoch(String createEpoch) {
    this.createEpoch = createEpoch;
  }


  public DexPriceDTO txHash(String txHash) {
    
    this.txHash = txHash;
    return this;
  }

   /**
   * Transaction hash.
   * @return txHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction hash.")

  public String getTxHash() {
    return txHash;
  }


  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }


  public DexPriceDTO vid(Long vid) {
    
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
    DexPriceDTO dexPriceDTO = (DexPriceDTO) o;
    return Objects.equals(this.entryTime, dexPriceDTO.entryTime) &&
        Objects.equals(this.recvTime, dexPriceDTO.recvTime) &&
        Objects.equals(this.blockNumber, dexPriceDTO.blockNumber) &&
        Objects.equals(this.id, dexPriceDTO.id) &&
        Objects.equals(this.token, dexPriceDTO.token) &&
        Objects.equals(this.batchId, dexPriceDTO.batchId) &&
        Objects.equals(this.priceInOwlNumerator, dexPriceDTO.priceInOwlNumerator) &&
        Objects.equals(this.priceInOwlDenominator, dexPriceDTO.priceInOwlDenominator) &&
        Objects.equals(this.volume, dexPriceDTO.volume) &&
        Objects.equals(this.createEpoch, dexPriceDTO.createEpoch) &&
        Objects.equals(this.txHash, dexPriceDTO.txHash) &&
        Objects.equals(this.vid, dexPriceDTO.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, token, batchId, priceInOwlNumerator, priceInOwlDenominator, volume, createEpoch, txHash, vid);
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
    sb.append("class DexPriceDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    priceInOwlNumerator: ").append(toIndentedString(priceInOwlNumerator)).append("\n");
    sb.append("    priceInOwlDenominator: ").append(toIndentedString(priceInOwlDenominator)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    createEpoch: ").append(toIndentedString(createEpoch)).append("\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
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
    openapiFields.add("token");
    openapiFields.add("batch_id");
    openapiFields.add("price_in_owl_numerator");
    openapiFields.add("price_in_owl_denominator");
    openapiFields.add("volume");
    openapiFields.add("create_epoch");
    openapiFields.add("tx_hash");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DexPriceDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DexPriceDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DexPriceDTO is not found in the empty JSON string", DexPriceDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DexPriceDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DexPriceDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("batch_id") != null && !jsonObj.get("batch_id").isJsonNull()) && !jsonObj.get("batch_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_id").toString()));
      }
      if ((jsonObj.get("price_in_owl_numerator") != null && !jsonObj.get("price_in_owl_numerator").isJsonNull()) && !jsonObj.get("price_in_owl_numerator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price_in_owl_numerator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price_in_owl_numerator").toString()));
      }
      if ((jsonObj.get("price_in_owl_denominator") != null && !jsonObj.get("price_in_owl_denominator").isJsonNull()) && !jsonObj.get("price_in_owl_denominator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price_in_owl_denominator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price_in_owl_denominator").toString()));
      }
      if ((jsonObj.get("volume") != null && !jsonObj.get("volume").isJsonNull()) && !jsonObj.get("volume").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volume` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volume").toString()));
      }
      if ((jsonObj.get("create_epoch") != null && !jsonObj.get("create_epoch").isJsonNull()) && !jsonObj.get("create_epoch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_epoch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_epoch").toString()));
      }
      if ((jsonObj.get("tx_hash") != null && !jsonObj.get("tx_hash").isJsonNull()) && !jsonObj.get("tx_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tx_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tx_hash").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DexPriceDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DexPriceDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DexPriceDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DexPriceDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<DexPriceDTO>() {
           @Override
           public void write(JsonWriter out, DexPriceDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DexPriceDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DexPriceDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DexPriceDTO
  * @throws IOException if the JSON string is invalid with respect to DexPriceDTO
  */
  public static DexPriceDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DexPriceDTO.class);
  }

 /**
  * Convert an instance of DexPriceDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

