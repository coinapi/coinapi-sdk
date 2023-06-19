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
 * CRYPTOPUNKSBidDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-19T09:28:48.156871Z[Etc/UTC]")
public class CRYPTOPUNKSBidDTO {
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

  public static final String SERIALIZED_NAME_TOKENS_BID = "tokens_bid";
  @SerializedName(SERIALIZED_NAME_TOKENS_BID)
  private String tokensBid;

  public static final String SERIALIZED_NAME_TOKEN_ID = "token_id";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_BIDDER = "bidder";
  @SerializedName(SERIALIZED_NAME_BIDDER)
  private String bidder;

  public CRYPTOPUNKSBidDTO() {
  }

  public CRYPTOPUNKSBidDTO entryTime(OffsetDateTime entryTime) {
    
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


  public CRYPTOPUNKSBidDTO recvTime(OffsetDateTime recvTime) {
    
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


  public CRYPTOPUNKSBidDTO blockNumber(String blockNumber) {
    
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


  public CRYPTOPUNKSBidDTO vid(Long vid) {
    
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


  public CRYPTOPUNKSBidDTO blockRange(String blockRange) {
    
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


  public CRYPTOPUNKSBidDTO id(String id) {
    
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


  public CRYPTOPUNKSBidDTO tokensBid(String tokensBid) {
    
    this.tokensBid = tokensBid;
    return this;
  }

   /**
   * 
   * @return tokensBid
  **/
  @javax.annotation.Nullable
  public String getTokensBid() {
    return tokensBid;
  }


  public void setTokensBid(String tokensBid) {
    this.tokensBid = tokensBid;
  }


  public CRYPTOPUNKSBidDTO tokenId(String tokenId) {
    
    this.tokenId = tokenId;
    return this;
  }

   /**
   * 
   * @return tokenId
  **/
  @javax.annotation.Nullable
  public String getTokenId() {
    return tokenId;
  }


  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public CRYPTOPUNKSBidDTO timestamp(String timestamp) {
    
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


  public CRYPTOPUNKSBidDTO bidder(String bidder) {
    
    this.bidder = bidder;
    return this;
  }

   /**
   * 
   * @return bidder
  **/
  @javax.annotation.Nullable
  public String getBidder() {
    return bidder;
  }


  public void setBidder(String bidder) {
    this.bidder = bidder;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRYPTOPUNKSBidDTO crYPTOPUNKSBidDTO = (CRYPTOPUNKSBidDTO) o;
    return Objects.equals(this.entryTime, crYPTOPUNKSBidDTO.entryTime) &&
        Objects.equals(this.recvTime, crYPTOPUNKSBidDTO.recvTime) &&
        Objects.equals(this.blockNumber, crYPTOPUNKSBidDTO.blockNumber) &&
        Objects.equals(this.vid, crYPTOPUNKSBidDTO.vid) &&
        Objects.equals(this.blockRange, crYPTOPUNKSBidDTO.blockRange) &&
        Objects.equals(this.id, crYPTOPUNKSBidDTO.id) &&
        Objects.equals(this.tokensBid, crYPTOPUNKSBidDTO.tokensBid) &&
        Objects.equals(this.tokenId, crYPTOPUNKSBidDTO.tokenId) &&
        Objects.equals(this.timestamp, crYPTOPUNKSBidDTO.timestamp) &&
        Objects.equals(this.bidder, crYPTOPUNKSBidDTO.bidder);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, vid, blockRange, id, tokensBid, tokenId, timestamp, bidder);
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
    sb.append("class CRYPTOPUNKSBidDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
    sb.append("    blockRange: ").append(toIndentedString(blockRange)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tokensBid: ").append(toIndentedString(tokensBid)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    bidder: ").append(toIndentedString(bidder)).append("\n");
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
    openapiFields.add("tokens_bid");
    openapiFields.add("token_id");
    openapiFields.add("timestamp");
    openapiFields.add("bidder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CRYPTOPUNKSBidDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CRYPTOPUNKSBidDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CRYPTOPUNKSBidDTO is not found in the empty JSON string", CRYPTOPUNKSBidDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CRYPTOPUNKSBidDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CRYPTOPUNKSBidDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if ((jsonObj.get("tokens_bid") != null && !jsonObj.get("tokens_bid").isJsonNull()) && !jsonObj.get("tokens_bid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tokens_bid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokens_bid").toString()));
      }
      if ((jsonObj.get("token_id") != null && !jsonObj.get("token_id").isJsonNull()) && !jsonObj.get("token_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_id").toString()));
      }
      if ((jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull()) && !jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
      if ((jsonObj.get("bidder") != null && !jsonObj.get("bidder").isJsonNull()) && !jsonObj.get("bidder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bidder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bidder").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CRYPTOPUNKSBidDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CRYPTOPUNKSBidDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CRYPTOPUNKSBidDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CRYPTOPUNKSBidDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<CRYPTOPUNKSBidDTO>() {
           @Override
           public void write(JsonWriter out, CRYPTOPUNKSBidDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CRYPTOPUNKSBidDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CRYPTOPUNKSBidDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CRYPTOPUNKSBidDTO
  * @throws IOException if the JSON string is invalid with respect to CRYPTOPUNKSBidDTO
  */
  public static CRYPTOPUNKSBidDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CRYPTOPUNKSBidDTO.class);
  }

 /**
  * Convert an instance of CRYPTOPUNKSBidDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

