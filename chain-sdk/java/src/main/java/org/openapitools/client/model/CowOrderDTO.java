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
 * CowOrderDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-09T10:37:09.866129Z[Etc/UTC]")
public class CowOrderDTO {
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

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_TRADES_TIMESTAMP = "trades_timestamp";
  @SerializedName(SERIALIZED_NAME_TRADES_TIMESTAMP)
  private String tradesTimestamp;

  public static final String SERIALIZED_NAME_INVALIDATE_TIMESTAMP = "invalidate_timestamp";
  @SerializedName(SERIALIZED_NAME_INVALIDATE_TIMESTAMP)
  private String invalidateTimestamp;

  public static final String SERIALIZED_NAME_PRESIGN_TIMESTAMP = "presign_timestamp";
  @SerializedName(SERIALIZED_NAME_PRESIGN_TIMESTAMP)
  private String presignTimestamp;

  public static final String SERIALIZED_NAME_IS_SIGNED = "is_signed";
  @SerializedName(SERIALIZED_NAME_IS_SIGNED)
  private Boolean isSigned;

  public static final String SERIALIZED_NAME_IS_VALID = "is_valid";
  @SerializedName(SERIALIZED_NAME_IS_VALID)
  private Boolean isValid;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public CowOrderDTO() {
  }

  public CowOrderDTO entryTime(OffsetDateTime entryTime) {
    
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


  public CowOrderDTO recvTime(OffsetDateTime recvTime) {
    
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


  public CowOrderDTO blockNumber(Long blockNumber) {
    
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


  public CowOrderDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * User&#39;s address.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User's address.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CowOrderDTO owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * User&#39;s address.
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User's address.")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public CowOrderDTO tradesTimestamp(String tradesTimestamp) {
    
    this.tradesTimestamp = tradesTimestamp;
    return this;
  }

   /**
   * Block&#39;s timestamp on trade event.
   * @return tradesTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block's timestamp on trade event.")

  public String getTradesTimestamp() {
    return tradesTimestamp;
  }


  public void setTradesTimestamp(String tradesTimestamp) {
    this.tradesTimestamp = tradesTimestamp;
  }


  public CowOrderDTO invalidateTimestamp(String invalidateTimestamp) {
    
    this.invalidateTimestamp = invalidateTimestamp;
    return this;
  }

   /**
   * Block&#39;s timestamp on invalidate event.
   * @return invalidateTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block's timestamp on invalidate event.")

  public String getInvalidateTimestamp() {
    return invalidateTimestamp;
  }


  public void setInvalidateTimestamp(String invalidateTimestamp) {
    this.invalidateTimestamp = invalidateTimestamp;
  }


  public CowOrderDTO presignTimestamp(String presignTimestamp) {
    
    this.presignTimestamp = presignTimestamp;
    return this;
  }

   /**
   * Block&#39;s timestamp on presign event.
   * @return presignTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block's timestamp on presign event.")

  public String getPresignTimestamp() {
    return presignTimestamp;
  }


  public void setPresignTimestamp(String presignTimestamp) {
    this.presignTimestamp = presignTimestamp;
  }


  public CowOrderDTO isSigned(Boolean isSigned) {
    
    this.isSigned = isSigned;
    return this;
  }

   /**
   * Determines whether order is signed.
   * @return isSigned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether order is signed.")

  public Boolean getIsSigned() {
    return isSigned;
  }


  public void setIsSigned(Boolean isSigned) {
    this.isSigned = isSigned;
  }


  public CowOrderDTO isValid(Boolean isValid) {
    
    this.isValid = isValid;
    return this;
  }

   /**
   * Determines whether order is valid.
   * @return isValid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether order is valid.")

  public Boolean getIsValid() {
    return isValid;
  }


  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }


  public CowOrderDTO vid(Long vid) {
    
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
    CowOrderDTO cowOrderDTO = (CowOrderDTO) o;
    return Objects.equals(this.entryTime, cowOrderDTO.entryTime) &&
        Objects.equals(this.recvTime, cowOrderDTO.recvTime) &&
        Objects.equals(this.blockNumber, cowOrderDTO.blockNumber) &&
        Objects.equals(this.id, cowOrderDTO.id) &&
        Objects.equals(this.owner, cowOrderDTO.owner) &&
        Objects.equals(this.tradesTimestamp, cowOrderDTO.tradesTimestamp) &&
        Objects.equals(this.invalidateTimestamp, cowOrderDTO.invalidateTimestamp) &&
        Objects.equals(this.presignTimestamp, cowOrderDTO.presignTimestamp) &&
        Objects.equals(this.isSigned, cowOrderDTO.isSigned) &&
        Objects.equals(this.isValid, cowOrderDTO.isValid) &&
        Objects.equals(this.vid, cowOrderDTO.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, owner, tradesTimestamp, invalidateTimestamp, presignTimestamp, isSigned, isValid, vid);
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
    sb.append("class CowOrderDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    tradesTimestamp: ").append(toIndentedString(tradesTimestamp)).append("\n");
    sb.append("    invalidateTimestamp: ").append(toIndentedString(invalidateTimestamp)).append("\n");
    sb.append("    presignTimestamp: ").append(toIndentedString(presignTimestamp)).append("\n");
    sb.append("    isSigned: ").append(toIndentedString(isSigned)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
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
    openapiFields.add("owner");
    openapiFields.add("trades_timestamp");
    openapiFields.add("invalidate_timestamp");
    openapiFields.add("presign_timestamp");
    openapiFields.add("is_signed");
    openapiFields.add("is_valid");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CowOrderDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CowOrderDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CowOrderDTO is not found in the empty JSON string", CowOrderDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CowOrderDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CowOrderDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) && !jsonObj.get("owner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      if ((jsonObj.get("trades_timestamp") != null && !jsonObj.get("trades_timestamp").isJsonNull()) && !jsonObj.get("trades_timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trades_timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trades_timestamp").toString()));
      }
      if ((jsonObj.get("invalidate_timestamp") != null && !jsonObj.get("invalidate_timestamp").isJsonNull()) && !jsonObj.get("invalidate_timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invalidate_timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invalidate_timestamp").toString()));
      }
      if ((jsonObj.get("presign_timestamp") != null && !jsonObj.get("presign_timestamp").isJsonNull()) && !jsonObj.get("presign_timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `presign_timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("presign_timestamp").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CowOrderDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CowOrderDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CowOrderDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CowOrderDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<CowOrderDTO>() {
           @Override
           public void write(JsonWriter out, CowOrderDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CowOrderDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CowOrderDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CowOrderDTO
  * @throws IOException if the JSON string is invalid with respect to CowOrderDTO
  */
  public static CowOrderDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CowOrderDTO.class);
  }

 /**
  * Convert an instance of CowOrderDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

