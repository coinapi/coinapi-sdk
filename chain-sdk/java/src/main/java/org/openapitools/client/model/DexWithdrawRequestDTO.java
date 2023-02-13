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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Withdraw request of an user
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T15:06:11.595492Z[Etc/UTC]")
public class DexWithdrawRequestDTO {
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

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_TOKEN_ADDRESS = "token_address";
  @SerializedName(SERIALIZED_NAME_TOKEN_ADDRESS)
  private String tokenAddress;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_WITHDRAWABLE_FROM_BATCH_ID = "withdrawable_from_batch_id";
  @SerializedName(SERIALIZED_NAME_WITHDRAWABLE_FROM_BATCH_ID)
  private String withdrawableFromBatchId;

  public static final String SERIALIZED_NAME_CREATE_EPOCH = "create_epoch";
  @SerializedName(SERIALIZED_NAME_CREATE_EPOCH)
  private String createEpoch;

  public static final String SERIALIZED_NAME_CREATE_BATCH_ID = "create_batch_id";
  @SerializedName(SERIALIZED_NAME_CREATE_BATCH_ID)
  private String createBatchId;

  public static final String SERIALIZED_NAME_TX_HASH = "tx_hash";
  @SerializedName(SERIALIZED_NAME_TX_HASH)
  private String txHash;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public DexWithdrawRequestDTO() {
  }

  public DexWithdrawRequestDTO entryTime(OffsetDateTime entryTime) {
    
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


  public DexWithdrawRequestDTO recvTime(OffsetDateTime recvTime) {
    
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


  public DexWithdrawRequestDTO blockNumber(Long blockNumber) {
    
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


  public DexWithdrawRequestDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier, format: (transaction hash)-(id).
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DexWithdrawRequestDTO user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * 
   * @return user
  **/
  @javax.annotation.Nullable

  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }


  public DexWithdrawRequestDTO tokenAddress(String tokenAddress) {
    
    this.tokenAddress = tokenAddress;
    return this;
  }

   /**
   * 
   * @return tokenAddress
  **/
  @javax.annotation.Nullable

  public String getTokenAddress() {
    return tokenAddress;
  }


  public void setTokenAddress(String tokenAddress) {
    this.tokenAddress = tokenAddress;
  }


  public DexWithdrawRequestDTO amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 
   * @return amount
  **/
  @javax.annotation.Nullable

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public DexWithdrawRequestDTO withdrawableFromBatchId(String withdrawableFromBatchId) {
    
    this.withdrawableFromBatchId = withdrawableFromBatchId;
    return this;
  }

   /**
   * 
   * @return withdrawableFromBatchId
  **/
  @javax.annotation.Nullable

  public String getWithdrawableFromBatchId() {
    return withdrawableFromBatchId;
  }


  public void setWithdrawableFromBatchId(String withdrawableFromBatchId) {
    this.withdrawableFromBatchId = withdrawableFromBatchId;
  }


  public DexWithdrawRequestDTO createEpoch(String createEpoch) {
    
    this.createEpoch = createEpoch;
    return this;
  }

   /**
   * 
   * @return createEpoch
  **/
  @javax.annotation.Nullable

  public String getCreateEpoch() {
    return createEpoch;
  }


  public void setCreateEpoch(String createEpoch) {
    this.createEpoch = createEpoch;
  }


  public DexWithdrawRequestDTO createBatchId(String createBatchId) {
    
    this.createBatchId = createBatchId;
    return this;
  }

   /**
   * 
   * @return createBatchId
  **/
  @javax.annotation.Nullable

  public String getCreateBatchId() {
    return createBatchId;
  }


  public void setCreateBatchId(String createBatchId) {
    this.createBatchId = createBatchId;
  }


  public DexWithdrawRequestDTO txHash(String txHash) {
    
    this.txHash = txHash;
    return this;
  }

   /**
   * 
   * @return txHash
  **/
  @javax.annotation.Nullable

  public String getTxHash() {
    return txHash;
  }


  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }


  public DexWithdrawRequestDTO vid(Long vid) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DexWithdrawRequestDTO dexWithdrawRequestDTO = (DexWithdrawRequestDTO) o;
    return Objects.equals(this.entryTime, dexWithdrawRequestDTO.entryTime) &&
        Objects.equals(this.recvTime, dexWithdrawRequestDTO.recvTime) &&
        Objects.equals(this.blockNumber, dexWithdrawRequestDTO.blockNumber) &&
        Objects.equals(this.id, dexWithdrawRequestDTO.id) &&
        Objects.equals(this.user, dexWithdrawRequestDTO.user) &&
        Objects.equals(this.tokenAddress, dexWithdrawRequestDTO.tokenAddress) &&
        Objects.equals(this.amount, dexWithdrawRequestDTO.amount) &&
        Objects.equals(this.withdrawableFromBatchId, dexWithdrawRequestDTO.withdrawableFromBatchId) &&
        Objects.equals(this.createEpoch, dexWithdrawRequestDTO.createEpoch) &&
        Objects.equals(this.createBatchId, dexWithdrawRequestDTO.createBatchId) &&
        Objects.equals(this.txHash, dexWithdrawRequestDTO.txHash) &&
        Objects.equals(this.vid, dexWithdrawRequestDTO.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, user, tokenAddress, amount, withdrawableFromBatchId, createEpoch, createBatchId, txHash, vid);
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
    sb.append("class DexWithdrawRequestDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    tokenAddress: ").append(toIndentedString(tokenAddress)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    withdrawableFromBatchId: ").append(toIndentedString(withdrawableFromBatchId)).append("\n");
    sb.append("    createEpoch: ").append(toIndentedString(createEpoch)).append("\n");
    sb.append("    createBatchId: ").append(toIndentedString(createBatchId)).append("\n");
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
    openapiFields.add("user");
    openapiFields.add("token_address");
    openapiFields.add("amount");
    openapiFields.add("withdrawable_from_batch_id");
    openapiFields.add("create_epoch");
    openapiFields.add("create_batch_id");
    openapiFields.add("tx_hash");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DexWithdrawRequestDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DexWithdrawRequestDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DexWithdrawRequestDTO is not found in the empty JSON string", DexWithdrawRequestDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DexWithdrawRequestDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DexWithdrawRequestDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
      if ((jsonObj.get("token_address") != null && !jsonObj.get("token_address").isJsonNull()) && !jsonObj.get("token_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_address").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("withdrawable_from_batch_id") != null && !jsonObj.get("withdrawable_from_batch_id").isJsonNull()) && !jsonObj.get("withdrawable_from_batch_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `withdrawable_from_batch_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("withdrawable_from_batch_id").toString()));
      }
      if ((jsonObj.get("create_epoch") != null && !jsonObj.get("create_epoch").isJsonNull()) && !jsonObj.get("create_epoch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_epoch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_epoch").toString()));
      }
      if ((jsonObj.get("create_batch_id") != null && !jsonObj.get("create_batch_id").isJsonNull()) && !jsonObj.get("create_batch_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_batch_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_batch_id").toString()));
      }
      if ((jsonObj.get("tx_hash") != null && !jsonObj.get("tx_hash").isJsonNull()) && !jsonObj.get("tx_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tx_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tx_hash").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DexWithdrawRequestDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DexWithdrawRequestDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DexWithdrawRequestDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DexWithdrawRequestDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<DexWithdrawRequestDTO>() {
           @Override
           public void write(JsonWriter out, DexWithdrawRequestDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DexWithdrawRequestDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DexWithdrawRequestDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DexWithdrawRequestDTO
  * @throws IOException if the JSON string is invalid with respect to DexWithdrawRequestDTO
  */
  public static DexWithdrawRequestDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DexWithdrawRequestDTO.class);
  }

 /**
  * Convert an instance of DexWithdrawRequestDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

