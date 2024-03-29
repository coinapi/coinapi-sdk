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
 * CRYPTOPUNKSDataSourcesDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-19T09:56:11.979115Z[Etc/UTC]")
public class CRYPTOPUNKSDataSourcesDTO {
  public static final String SERIALIZED_NAME_ENTRY_TIME = "entry_time";
  @SerializedName(SERIALIZED_NAME_ENTRY_TIME)
  private OffsetDateTime entryTime;

  public static final String SERIALIZED_NAME_RECV_TIME = "recv_time";
  @SerializedName(SERIALIZED_NAME_RECV_TIME)
  private OffsetDateTime recvTime;

  public static final String SERIALIZED_NAME_BLOCK_NUMBER = "block_number";
  @SerializedName(SERIALIZED_NAME_BLOCK_NUMBER)
  private Long blockNumber;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Integer vid;

  public static final String SERIALIZED_NAME_BLOCK_RANGE = "block_range";
  @SerializedName(SERIALIZED_NAME_BLOCK_RANGE)
  private String blockRange;

  public static final String SERIALIZED_NAME_CAUSALITY_REGION = "causality_region";
  @SerializedName(SERIALIZED_NAME_CAUSALITY_REGION)
  private Integer causalityRegion;

  public static final String SERIALIZED_NAME_MANIFEST_IDX = "manifest_idx";
  @SerializedName(SERIALIZED_NAME_MANIFEST_IDX)
  private Integer manifestIdx;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private Integer parent;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PARAM = "param";
  @SerializedName(SERIALIZED_NAME_PARAM)
  private String param;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private String context;

  public static final String SERIALIZED_NAME_DONE_AT = "done_at";
  @SerializedName(SERIALIZED_NAME_DONE_AT)
  private Integer doneAt;

  public CRYPTOPUNKSDataSourcesDTO() {
  }

  public CRYPTOPUNKSDataSourcesDTO entryTime(OffsetDateTime entryTime) {
    
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


  public CRYPTOPUNKSDataSourcesDTO recvTime(OffsetDateTime recvTime) {
    
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


  public CRYPTOPUNKSDataSourcesDTO blockNumber(Long blockNumber) {
    
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


  public CRYPTOPUNKSDataSourcesDTO vid(Integer vid) {
    
    this.vid = vid;
    return this;
  }

   /**
   * 
   * @return vid
  **/
  @javax.annotation.Nullable
  public Integer getVid() {
    return vid;
  }


  public void setVid(Integer vid) {
    this.vid = vid;
  }


  public CRYPTOPUNKSDataSourcesDTO blockRange(String blockRange) {
    
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


  public CRYPTOPUNKSDataSourcesDTO causalityRegion(Integer causalityRegion) {
    
    this.causalityRegion = causalityRegion;
    return this;
  }

   /**
   * 
   * @return causalityRegion
  **/
  @javax.annotation.Nullable
  public Integer getCausalityRegion() {
    return causalityRegion;
  }


  public void setCausalityRegion(Integer causalityRegion) {
    this.causalityRegion = causalityRegion;
  }


  public CRYPTOPUNKSDataSourcesDTO manifestIdx(Integer manifestIdx) {
    
    this.manifestIdx = manifestIdx;
    return this;
  }

   /**
   * 
   * @return manifestIdx
  **/
  @javax.annotation.Nullable
  public Integer getManifestIdx() {
    return manifestIdx;
  }


  public void setManifestIdx(Integer manifestIdx) {
    this.manifestIdx = manifestIdx;
  }


  public CRYPTOPUNKSDataSourcesDTO parent(Integer parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * 
   * @return parent
  **/
  @javax.annotation.Nullable
  public Integer getParent() {
    return parent;
  }


  public void setParent(Integer parent) {
    this.parent = parent;
  }


  public CRYPTOPUNKSDataSourcesDTO id(String id) {
    
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


  public CRYPTOPUNKSDataSourcesDTO param(String param) {
    
    this.param = param;
    return this;
  }

   /**
   * 
   * @return param
  **/
  @javax.annotation.Nullable
  public String getParam() {
    return param;
  }


  public void setParam(String param) {
    this.param = param;
  }


  public CRYPTOPUNKSDataSourcesDTO context(String context) {
    
    this.context = context;
    return this;
  }

   /**
   * 
   * @return context
  **/
  @javax.annotation.Nullable
  public String getContext() {
    return context;
  }


  public void setContext(String context) {
    this.context = context;
  }


  public CRYPTOPUNKSDataSourcesDTO doneAt(Integer doneAt) {
    
    this.doneAt = doneAt;
    return this;
  }

   /**
   * 
   * @return doneAt
  **/
  @javax.annotation.Nullable
  public Integer getDoneAt() {
    return doneAt;
  }


  public void setDoneAt(Integer doneAt) {
    this.doneAt = doneAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRYPTOPUNKSDataSourcesDTO crYPTOPUNKSDataSourcesDTO = (CRYPTOPUNKSDataSourcesDTO) o;
    return Objects.equals(this.entryTime, crYPTOPUNKSDataSourcesDTO.entryTime) &&
        Objects.equals(this.recvTime, crYPTOPUNKSDataSourcesDTO.recvTime) &&
        Objects.equals(this.blockNumber, crYPTOPUNKSDataSourcesDTO.blockNumber) &&
        Objects.equals(this.vid, crYPTOPUNKSDataSourcesDTO.vid) &&
        Objects.equals(this.blockRange, crYPTOPUNKSDataSourcesDTO.blockRange) &&
        Objects.equals(this.causalityRegion, crYPTOPUNKSDataSourcesDTO.causalityRegion) &&
        Objects.equals(this.manifestIdx, crYPTOPUNKSDataSourcesDTO.manifestIdx) &&
        Objects.equals(this.parent, crYPTOPUNKSDataSourcesDTO.parent) &&
        Objects.equals(this.id, crYPTOPUNKSDataSourcesDTO.id) &&
        Objects.equals(this.param, crYPTOPUNKSDataSourcesDTO.param) &&
        Objects.equals(this.context, crYPTOPUNKSDataSourcesDTO.context) &&
        Objects.equals(this.doneAt, crYPTOPUNKSDataSourcesDTO.doneAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, vid, blockRange, causalityRegion, manifestIdx, parent, id, param, context, doneAt);
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
    sb.append("class CRYPTOPUNKSDataSourcesDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
    sb.append("    blockRange: ").append(toIndentedString(blockRange)).append("\n");
    sb.append("    causalityRegion: ").append(toIndentedString(causalityRegion)).append("\n");
    sb.append("    manifestIdx: ").append(toIndentedString(manifestIdx)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    param: ").append(toIndentedString(param)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    doneAt: ").append(toIndentedString(doneAt)).append("\n");
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
    openapiFields.add("causality_region");
    openapiFields.add("manifest_idx");
    openapiFields.add("parent");
    openapiFields.add("id");
    openapiFields.add("param");
    openapiFields.add("context");
    openapiFields.add("done_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CRYPTOPUNKSDataSourcesDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CRYPTOPUNKSDataSourcesDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CRYPTOPUNKSDataSourcesDTO is not found in the empty JSON string", CRYPTOPUNKSDataSourcesDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CRYPTOPUNKSDataSourcesDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CRYPTOPUNKSDataSourcesDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("block_range") != null && !jsonObj.get("block_range").isJsonNull()) && !jsonObj.get("block_range").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `block_range` to be a primitive type in the JSON string but got `%s`", jsonObj.get("block_range").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("param") != null && !jsonObj.get("param").isJsonNull()) && !jsonObj.get("param").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `param` to be a primitive type in the JSON string but got `%s`", jsonObj.get("param").toString()));
      }
      if ((jsonObj.get("context") != null && !jsonObj.get("context").isJsonNull()) && !jsonObj.get("context").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `context` to be a primitive type in the JSON string but got `%s`", jsonObj.get("context").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CRYPTOPUNKSDataSourcesDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CRYPTOPUNKSDataSourcesDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CRYPTOPUNKSDataSourcesDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CRYPTOPUNKSDataSourcesDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<CRYPTOPUNKSDataSourcesDTO>() {
           @Override
           public void write(JsonWriter out, CRYPTOPUNKSDataSourcesDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CRYPTOPUNKSDataSourcesDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CRYPTOPUNKSDataSourcesDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CRYPTOPUNKSDataSourcesDTO
  * @throws IOException if the JSON string is invalid with respect to CRYPTOPUNKSDataSourcesDTO
  */
  public static CRYPTOPUNKSDataSourcesDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CRYPTOPUNKSDataSourcesDTO.class);
  }

 /**
  * Convert an instance of CRYPTOPUNKSDataSourcesDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

