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
 * CurveSystemStateDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-16T12:16:34.841866Z[Etc/UTC]")
public class CurveSystemStateDTO {
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

  public static final String SERIALIZED_NAME_REGISTRY_CONTRACT = "registry_contract";
  @SerializedName(SERIALIZED_NAME_REGISTRY_CONTRACT)
  private String registryContract;

  public static final String SERIALIZED_NAME_CONTRACT_COUNT = "contract_count";
  @SerializedName(SERIALIZED_NAME_CONTRACT_COUNT)
  private String contractCount;

  public static final String SERIALIZED_NAME_GAUGE_COUNT = "gauge_count";
  @SerializedName(SERIALIZED_NAME_GAUGE_COUNT)
  private String gaugeCount;

  public static final String SERIALIZED_NAME_GAUGE_TYPE_COUNT = "gauge_type_count";
  @SerializedName(SERIALIZED_NAME_GAUGE_TYPE_COUNT)
  private String gaugeTypeCount;

  public static final String SERIALIZED_NAME_POOL_COUNT = "pool_count";
  @SerializedName(SERIALIZED_NAME_POOL_COUNT)
  private String poolCount;

  public static final String SERIALIZED_NAME_TOKEN_COUNT = "token_count";
  @SerializedName(SERIALIZED_NAME_TOKEN_COUNT)
  private String tokenCount;

  public static final String SERIALIZED_NAME_TOTAL_POOL_COUNT = "total_pool_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_POOL_COUNT)
  private String totalPoolCount;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private String updated;

  public static final String SERIALIZED_NAME_UPDATED_AT_BLOCK = "updated_at_block";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT_BLOCK)
  private String updatedAtBlock;

  public static final String SERIALIZED_NAME_UPDATED_AT_TRANSACTION = "updated_at_transaction";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT_TRANSACTION)
  private String updatedAtTransaction;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public CurveSystemStateDTO() {
  }

  public CurveSystemStateDTO entryTime(OffsetDateTime entryTime) {
    
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


  public CurveSystemStateDTO recvTime(OffsetDateTime recvTime) {
    
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


  public CurveSystemStateDTO blockNumber(Long blockNumber) {
    
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


  public CurveSystemStateDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Singleton ID, equals to &#39;current&#39;.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Singleton ID, equals to 'current'.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CurveSystemStateDTO registryContract(String registryContract) {
    
    this.registryContract = registryContract;
    return this;
  }

   /**
   * Current pool registry address.
   * @return registryContract
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current pool registry address.")

  public String getRegistryContract() {
    return registryContract;
  }


  public void setRegistryContract(String registryContract) {
    this.registryContract = registryContract;
  }


  public CurveSystemStateDTO contractCount(String contractCount) {
    
    this.contractCount = contractCount;
    return this;
  }

   /**
   * Number of contracts in the AddressProvider registry.
   * @return contractCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of contracts in the AddressProvider registry.")

  public String getContractCount() {
    return contractCount;
  }


  public void setContractCount(String contractCount) {
    this.contractCount = contractCount;
  }


  public CurveSystemStateDTO gaugeCount(String gaugeCount) {
    
    this.gaugeCount = gaugeCount;
    return this;
  }

   /**
   * Number of gauges registered.
   * @return gaugeCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of gauges registered.")

  public String getGaugeCount() {
    return gaugeCount;
  }


  public void setGaugeCount(String gaugeCount) {
    this.gaugeCount = gaugeCount;
  }


  public CurveSystemStateDTO gaugeTypeCount(String gaugeTypeCount) {
    
    this.gaugeTypeCount = gaugeTypeCount;
    return this;
  }

   /**
   * Number of gauge types registered.
   * @return gaugeTypeCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of gauge types registered.")

  public String getGaugeTypeCount() {
    return gaugeTypeCount;
  }


  public void setGaugeTypeCount(String gaugeTypeCount) {
    this.gaugeTypeCount = gaugeTypeCount;
  }


  public CurveSystemStateDTO poolCount(String poolCount) {
    
    this.poolCount = poolCount;
    return this;
  }

   /**
   * Number of active pools.
   * @return poolCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of active pools.")

  public String getPoolCount() {
    return poolCount;
  }


  public void setPoolCount(String poolCount) {
    this.poolCount = poolCount;
  }


  public CurveSystemStateDTO tokenCount(String tokenCount) {
    
    this.tokenCount = tokenCount;
    return this;
  }

   /**
   * Number of tokens registered.
   * @return tokenCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of tokens registered.")

  public String getTokenCount() {
    return tokenCount;
  }


  public void setTokenCount(String tokenCount) {
    this.tokenCount = tokenCount;
  }


  public CurveSystemStateDTO totalPoolCount(String totalPoolCount) {
    
    this.totalPoolCount = totalPoolCount;
    return this;
  }

   /**
   * Total number of pools (including removed ones).
   * @return totalPoolCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of pools (including removed ones).")

  public String getTotalPoolCount() {
    return totalPoolCount;
  }


  public void setTotalPoolCount(String totalPoolCount) {
    this.totalPoolCount = totalPoolCount;
  }


  public CurveSystemStateDTO updated(String updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * 
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdated() {
    return updated;
  }


  public void setUpdated(String updated) {
    this.updated = updated;
  }


  public CurveSystemStateDTO updatedAtBlock(String updatedAtBlock) {
    
    this.updatedAtBlock = updatedAtBlock;
    return this;
  }

   /**
   * 
   * @return updatedAtBlock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdatedAtBlock() {
    return updatedAtBlock;
  }


  public void setUpdatedAtBlock(String updatedAtBlock) {
    this.updatedAtBlock = updatedAtBlock;
  }


  public CurveSystemStateDTO updatedAtTransaction(String updatedAtTransaction) {
    
    this.updatedAtTransaction = updatedAtTransaction;
    return this;
  }

   /**
   * 
   * @return updatedAtTransaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdatedAtTransaction() {
    return updatedAtTransaction;
  }


  public void setUpdatedAtTransaction(String updatedAtTransaction) {
    this.updatedAtTransaction = updatedAtTransaction;
  }


  public CurveSystemStateDTO vid(Long vid) {
    
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
    CurveSystemStateDTO curveSystemStateDTO = (CurveSystemStateDTO) o;
    return Objects.equals(this.entryTime, curveSystemStateDTO.entryTime) &&
        Objects.equals(this.recvTime, curveSystemStateDTO.recvTime) &&
        Objects.equals(this.blockNumber, curveSystemStateDTO.blockNumber) &&
        Objects.equals(this.id, curveSystemStateDTO.id) &&
        Objects.equals(this.registryContract, curveSystemStateDTO.registryContract) &&
        Objects.equals(this.contractCount, curveSystemStateDTO.contractCount) &&
        Objects.equals(this.gaugeCount, curveSystemStateDTO.gaugeCount) &&
        Objects.equals(this.gaugeTypeCount, curveSystemStateDTO.gaugeTypeCount) &&
        Objects.equals(this.poolCount, curveSystemStateDTO.poolCount) &&
        Objects.equals(this.tokenCount, curveSystemStateDTO.tokenCount) &&
        Objects.equals(this.totalPoolCount, curveSystemStateDTO.totalPoolCount) &&
        Objects.equals(this.updated, curveSystemStateDTO.updated) &&
        Objects.equals(this.updatedAtBlock, curveSystemStateDTO.updatedAtBlock) &&
        Objects.equals(this.updatedAtTransaction, curveSystemStateDTO.updatedAtTransaction) &&
        Objects.equals(this.vid, curveSystemStateDTO.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, registryContract, contractCount, gaugeCount, gaugeTypeCount, poolCount, tokenCount, totalPoolCount, updated, updatedAtBlock, updatedAtTransaction, vid);
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
    sb.append("class CurveSystemStateDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    registryContract: ").append(toIndentedString(registryContract)).append("\n");
    sb.append("    contractCount: ").append(toIndentedString(contractCount)).append("\n");
    sb.append("    gaugeCount: ").append(toIndentedString(gaugeCount)).append("\n");
    sb.append("    gaugeTypeCount: ").append(toIndentedString(gaugeTypeCount)).append("\n");
    sb.append("    poolCount: ").append(toIndentedString(poolCount)).append("\n");
    sb.append("    tokenCount: ").append(toIndentedString(tokenCount)).append("\n");
    sb.append("    totalPoolCount: ").append(toIndentedString(totalPoolCount)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    updatedAtBlock: ").append(toIndentedString(updatedAtBlock)).append("\n");
    sb.append("    updatedAtTransaction: ").append(toIndentedString(updatedAtTransaction)).append("\n");
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
    openapiFields.add("registry_contract");
    openapiFields.add("contract_count");
    openapiFields.add("gauge_count");
    openapiFields.add("gauge_type_count");
    openapiFields.add("pool_count");
    openapiFields.add("token_count");
    openapiFields.add("total_pool_count");
    openapiFields.add("updated");
    openapiFields.add("updated_at_block");
    openapiFields.add("updated_at_transaction");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CurveSystemStateDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CurveSystemStateDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CurveSystemStateDTO is not found in the empty JSON string", CurveSystemStateDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CurveSystemStateDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CurveSystemStateDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("registry_contract") != null && !jsonObj.get("registry_contract").isJsonNull()) && !jsonObj.get("registry_contract").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registry_contract` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registry_contract").toString()));
      }
      if ((jsonObj.get("contract_count") != null && !jsonObj.get("contract_count").isJsonNull()) && !jsonObj.get("contract_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_count").toString()));
      }
      if ((jsonObj.get("gauge_count") != null && !jsonObj.get("gauge_count").isJsonNull()) && !jsonObj.get("gauge_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gauge_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gauge_count").toString()));
      }
      if ((jsonObj.get("gauge_type_count") != null && !jsonObj.get("gauge_type_count").isJsonNull()) && !jsonObj.get("gauge_type_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gauge_type_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gauge_type_count").toString()));
      }
      if ((jsonObj.get("pool_count") != null && !jsonObj.get("pool_count").isJsonNull()) && !jsonObj.get("pool_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pool_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pool_count").toString()));
      }
      if ((jsonObj.get("token_count") != null && !jsonObj.get("token_count").isJsonNull()) && !jsonObj.get("token_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_count").toString()));
      }
      if ((jsonObj.get("total_pool_count") != null && !jsonObj.get("total_pool_count").isJsonNull()) && !jsonObj.get("total_pool_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_pool_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_pool_count").toString()));
      }
      if ((jsonObj.get("updated") != null && !jsonObj.get("updated").isJsonNull()) && !jsonObj.get("updated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated").toString()));
      }
      if ((jsonObj.get("updated_at_block") != null && !jsonObj.get("updated_at_block").isJsonNull()) && !jsonObj.get("updated_at_block").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at_block` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at_block").toString()));
      }
      if ((jsonObj.get("updated_at_transaction") != null && !jsonObj.get("updated_at_transaction").isJsonNull()) && !jsonObj.get("updated_at_transaction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at_transaction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at_transaction").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CurveSystemStateDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CurveSystemStateDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CurveSystemStateDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CurveSystemStateDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<CurveSystemStateDTO>() {
           @Override
           public void write(JsonWriter out, CurveSystemStateDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CurveSystemStateDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CurveSystemStateDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CurveSystemStateDTO
  * @throws IOException if the JSON string is invalid with respect to CurveSystemStateDTO
  */
  public static CurveSystemStateDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CurveSystemStateDTO.class);
  }

 /**
  * Convert an instance of CurveSystemStateDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

