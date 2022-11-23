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
 * CurveContractDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-23T13:25:16.916230Z[Etc/UTC]")
public class CurveContractDTO {
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

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ADDED = "added";
  @SerializedName(SERIALIZED_NAME_ADDED)
  private String added;

  public static final String SERIALIZED_NAME_ADDED_AT_BLOCK = "added_at_block";
  @SerializedName(SERIALIZED_NAME_ADDED_AT_BLOCK)
  private String addedAtBlock;

  public static final String SERIALIZED_NAME_ADDED_AT_TRANSACTION = "added_at_transaction";
  @SerializedName(SERIALIZED_NAME_ADDED_AT_TRANSACTION)
  private String addedAtTransaction;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private String modified;

  public static final String SERIALIZED_NAME_MODIFIED_AT_BLOCK = "modified_at_block";
  @SerializedName(SERIALIZED_NAME_MODIFIED_AT_BLOCK)
  private String modifiedAtBlock;

  public static final String SERIALIZED_NAME_MODIFIED_AT_TRANSACTION = "modified_at_transaction";
  @SerializedName(SERIALIZED_NAME_MODIFIED_AT_TRANSACTION)
  private String modifiedAtTransaction;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public CurveContractDTO() {
  }

  public CurveContractDTO entryTime(OffsetDateTime entryTime) {
    
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


  public CurveContractDTO recvTime(OffsetDateTime recvTime) {
    
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


  public CurveContractDTO blockNumber(Long blockNumber) {
    
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


  public CurveContractDTO id(String id) {
    
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


  public CurveContractDTO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Human-readable description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Human-readable description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CurveContractDTO added(String added) {
    
    this.added = added;
    return this;
  }

   /**
   * 
   * @return added
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAdded() {
    return added;
  }


  public void setAdded(String added) {
    this.added = added;
  }


  public CurveContractDTO addedAtBlock(String addedAtBlock) {
    
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


  public CurveContractDTO addedAtTransaction(String addedAtTransaction) {
    
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


  public CurveContractDTO modified(String modified) {
    
    this.modified = modified;
    return this;
  }

   /**
   * 
   * @return modified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModified() {
    return modified;
  }


  public void setModified(String modified) {
    this.modified = modified;
  }


  public CurveContractDTO modifiedAtBlock(String modifiedAtBlock) {
    
    this.modifiedAtBlock = modifiedAtBlock;
    return this;
  }

   /**
   * 
   * @return modifiedAtBlock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModifiedAtBlock() {
    return modifiedAtBlock;
  }


  public void setModifiedAtBlock(String modifiedAtBlock) {
    this.modifiedAtBlock = modifiedAtBlock;
  }


  public CurveContractDTO modifiedAtTransaction(String modifiedAtTransaction) {
    
    this.modifiedAtTransaction = modifiedAtTransaction;
    return this;
  }

   /**
   * 
   * @return modifiedAtTransaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModifiedAtTransaction() {
    return modifiedAtTransaction;
  }


  public void setModifiedAtTransaction(String modifiedAtTransaction) {
    this.modifiedAtTransaction = modifiedAtTransaction;
  }


  public CurveContractDTO vid(Long vid) {
    
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
    CurveContractDTO curveContractDTO = (CurveContractDTO) o;
    return Objects.equals(this.entryTime, curveContractDTO.entryTime) &&
        Objects.equals(this.recvTime, curveContractDTO.recvTime) &&
        Objects.equals(this.blockNumber, curveContractDTO.blockNumber) &&
        Objects.equals(this.id, curveContractDTO.id) &&
        Objects.equals(this.description, curveContractDTO.description) &&
        Objects.equals(this.added, curveContractDTO.added) &&
        Objects.equals(this.addedAtBlock, curveContractDTO.addedAtBlock) &&
        Objects.equals(this.addedAtTransaction, curveContractDTO.addedAtTransaction) &&
        Objects.equals(this.modified, curveContractDTO.modified) &&
        Objects.equals(this.modifiedAtBlock, curveContractDTO.modifiedAtBlock) &&
        Objects.equals(this.modifiedAtTransaction, curveContractDTO.modifiedAtTransaction) &&
        Objects.equals(this.vid, curveContractDTO.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, description, added, addedAtBlock, addedAtTransaction, modified, modifiedAtBlock, modifiedAtTransaction, vid);
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
    sb.append("class CurveContractDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    addedAtBlock: ").append(toIndentedString(addedAtBlock)).append("\n");
    sb.append("    addedAtTransaction: ").append(toIndentedString(addedAtTransaction)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    modifiedAtBlock: ").append(toIndentedString(modifiedAtBlock)).append("\n");
    sb.append("    modifiedAtTransaction: ").append(toIndentedString(modifiedAtTransaction)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("added");
    openapiFields.add("added_at_block");
    openapiFields.add("added_at_transaction");
    openapiFields.add("modified");
    openapiFields.add("modified_at_block");
    openapiFields.add("modified_at_transaction");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CurveContractDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CurveContractDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CurveContractDTO is not found in the empty JSON string", CurveContractDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CurveContractDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CurveContractDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("added") != null && !jsonObj.get("added").isJsonNull()) && !jsonObj.get("added").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added").toString()));
      }
      if ((jsonObj.get("added_at_block") != null && !jsonObj.get("added_at_block").isJsonNull()) && !jsonObj.get("added_at_block").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added_at_block` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added_at_block").toString()));
      }
      if ((jsonObj.get("added_at_transaction") != null && !jsonObj.get("added_at_transaction").isJsonNull()) && !jsonObj.get("added_at_transaction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added_at_transaction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added_at_transaction").toString()));
      }
      if ((jsonObj.get("modified") != null && !jsonObj.get("modified").isJsonNull()) && !jsonObj.get("modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modified").toString()));
      }
      if ((jsonObj.get("modified_at_block") != null && !jsonObj.get("modified_at_block").isJsonNull()) && !jsonObj.get("modified_at_block").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modified_at_block` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modified_at_block").toString()));
      }
      if ((jsonObj.get("modified_at_transaction") != null && !jsonObj.get("modified_at_transaction").isJsonNull()) && !jsonObj.get("modified_at_transaction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modified_at_transaction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modified_at_transaction").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CurveContractDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CurveContractDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CurveContractDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CurveContractDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<CurveContractDTO>() {
           @Override
           public void write(JsonWriter out, CurveContractDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CurveContractDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CurveContractDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CurveContractDTO
  * @throws IOException if the JSON string is invalid with respect to CurveContractDTO
  */
  public static CurveContractDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CurveContractDTO.class);
  }

 /**
  * Convert an instance of CurveContractDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

