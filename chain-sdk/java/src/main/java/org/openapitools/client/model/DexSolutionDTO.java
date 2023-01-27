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
import java.util.ArrayList;
import java.util.List;
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
 * DexSolutionDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-27T14:51:42.366435Z[Etc/UTC]")
public class DexSolutionDTO {
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

  public static final String SERIALIZED_NAME_BATCH = "batch";
  @SerializedName(SERIALIZED_NAME_BATCH)
  private String batch;

  public static final String SERIALIZED_NAME_SOLVER = "solver";
  @SerializedName(SERIALIZED_NAME_SOLVER)
  private String solver;

  public static final String SERIALIZED_NAME_FEE_REWARD = "fee_reward";
  @SerializedName(SERIALIZED_NAME_FEE_REWARD)
  private String feeReward;

  public static final String SERIALIZED_NAME_OBJECTIVE_VALUE = "objective_value";
  @SerializedName(SERIALIZED_NAME_OBJECTIVE_VALUE)
  private String objectiveValue;

  public static final String SERIALIZED_NAME_UTILITY = "utility";
  @SerializedName(SERIALIZED_NAME_UTILITY)
  private String utility;

  public static final String SERIALIZED_NAME_TRADES = "trades";
  @SerializedName(SERIALIZED_NAME_TRADES)
  private List<String> trades = null;

  public static final String SERIALIZED_NAME_CREATE_EPOCH = "create_epoch";
  @SerializedName(SERIALIZED_NAME_CREATE_EPOCH)
  private String createEpoch;

  public static final String SERIALIZED_NAME_REVERT_EPOCH = "revert_epoch";
  @SerializedName(SERIALIZED_NAME_REVERT_EPOCH)
  private String revertEpoch;

  public static final String SERIALIZED_NAME_TX_HASH = "tx_hash";
  @SerializedName(SERIALIZED_NAME_TX_HASH)
  private String txHash;

  public static final String SERIALIZED_NAME_TX_LOG_INDEX = "tx_log_index";
  @SerializedName(SERIALIZED_NAME_TX_LOG_INDEX)
  private String txLogIndex;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public DexSolutionDTO() {
  }

  public DexSolutionDTO entryTime(OffsetDateTime entryTime) {
    
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


  public DexSolutionDTO recvTime(OffsetDateTime recvTime) {
    
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


  public DexSolutionDTO blockNumber(Long blockNumber) {
    
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


  public DexSolutionDTO id(String id) {
    
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


  public DexSolutionDTO batch(String batch) {
    
    this.batch = batch;
    return this;
  }

   /**
   * 
   * @return batch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBatch() {
    return batch;
  }


  public void setBatch(String batch) {
    this.batch = batch;
  }


  public DexSolutionDTO solver(String solver) {
    
    this.solver = solver;
    return this;
  }

   /**
   * 
   * @return solver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSolver() {
    return solver;
  }


  public void setSolver(String solver) {
    this.solver = solver;
  }


  public DexSolutionDTO feeReward(String feeReward) {
    
    this.feeReward = feeReward;
    return this;
  }

   /**
   * 
   * @return feeReward
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFeeReward() {
    return feeReward;
  }


  public void setFeeReward(String feeReward) {
    this.feeReward = feeReward;
  }


  public DexSolutionDTO objectiveValue(String objectiveValue) {
    
    this.objectiveValue = objectiveValue;
    return this;
  }

   /**
   * 
   * @return objectiveValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getObjectiveValue() {
    return objectiveValue;
  }


  public void setObjectiveValue(String objectiveValue) {
    this.objectiveValue = objectiveValue;
  }


  public DexSolutionDTO utility(String utility) {
    
    this.utility = utility;
    return this;
  }

   /**
   * 
   * @return utility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUtility() {
    return utility;
  }


  public void setUtility(String utility) {
    this.utility = utility;
  }


  public DexSolutionDTO trades(List<String> trades) {
    
    this.trades = trades;
    return this;
  }

  public DexSolutionDTO addTradesItem(String tradesItem) {
    if (this.trades == null) {
      this.trades = new ArrayList<>();
    }
    this.trades.add(tradesItem);
    return this;
  }

   /**
   * 
   * @return trades
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTrades() {
    return trades;
  }


  public void setTrades(List<String> trades) {
    this.trades = trades;
  }


  public DexSolutionDTO createEpoch(String createEpoch) {
    
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


  public DexSolutionDTO revertEpoch(String revertEpoch) {
    
    this.revertEpoch = revertEpoch;
    return this;
  }

   /**
   * 
   * @return revertEpoch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRevertEpoch() {
    return revertEpoch;
  }


  public void setRevertEpoch(String revertEpoch) {
    this.revertEpoch = revertEpoch;
  }


  public DexSolutionDTO txHash(String txHash) {
    
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


  public DexSolutionDTO txLogIndex(String txLogIndex) {
    
    this.txLogIndex = txLogIndex;
    return this;
  }

   /**
   * 
   * @return txLogIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTxLogIndex() {
    return txLogIndex;
  }


  public void setTxLogIndex(String txLogIndex) {
    this.txLogIndex = txLogIndex;
  }


  public DexSolutionDTO vid(Long vid) {
    
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
    DexSolutionDTO dexSolutionDTO = (DexSolutionDTO) o;
    return Objects.equals(this.entryTime, dexSolutionDTO.entryTime) &&
        Objects.equals(this.recvTime, dexSolutionDTO.recvTime) &&
        Objects.equals(this.blockNumber, dexSolutionDTO.blockNumber) &&
        Objects.equals(this.id, dexSolutionDTO.id) &&
        Objects.equals(this.batch, dexSolutionDTO.batch) &&
        Objects.equals(this.solver, dexSolutionDTO.solver) &&
        Objects.equals(this.feeReward, dexSolutionDTO.feeReward) &&
        Objects.equals(this.objectiveValue, dexSolutionDTO.objectiveValue) &&
        Objects.equals(this.utility, dexSolutionDTO.utility) &&
        Objects.equals(this.trades, dexSolutionDTO.trades) &&
        Objects.equals(this.createEpoch, dexSolutionDTO.createEpoch) &&
        Objects.equals(this.revertEpoch, dexSolutionDTO.revertEpoch) &&
        Objects.equals(this.txHash, dexSolutionDTO.txHash) &&
        Objects.equals(this.txLogIndex, dexSolutionDTO.txLogIndex) &&
        Objects.equals(this.vid, dexSolutionDTO.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, batch, solver, feeReward, objectiveValue, utility, trades, createEpoch, revertEpoch, txHash, txLogIndex, vid);
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
    sb.append("class DexSolutionDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
    sb.append("    solver: ").append(toIndentedString(solver)).append("\n");
    sb.append("    feeReward: ").append(toIndentedString(feeReward)).append("\n");
    sb.append("    objectiveValue: ").append(toIndentedString(objectiveValue)).append("\n");
    sb.append("    utility: ").append(toIndentedString(utility)).append("\n");
    sb.append("    trades: ").append(toIndentedString(trades)).append("\n");
    sb.append("    createEpoch: ").append(toIndentedString(createEpoch)).append("\n");
    sb.append("    revertEpoch: ").append(toIndentedString(revertEpoch)).append("\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    txLogIndex: ").append(toIndentedString(txLogIndex)).append("\n");
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
    openapiFields.add("batch");
    openapiFields.add("solver");
    openapiFields.add("fee_reward");
    openapiFields.add("objective_value");
    openapiFields.add("utility");
    openapiFields.add("trades");
    openapiFields.add("create_epoch");
    openapiFields.add("revert_epoch");
    openapiFields.add("tx_hash");
    openapiFields.add("tx_log_index");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DexSolutionDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DexSolutionDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DexSolutionDTO is not found in the empty JSON string", DexSolutionDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DexSolutionDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DexSolutionDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("batch") != null && !jsonObj.get("batch").isJsonNull()) && !jsonObj.get("batch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch").toString()));
      }
      if ((jsonObj.get("solver") != null && !jsonObj.get("solver").isJsonNull()) && !jsonObj.get("solver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `solver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("solver").toString()));
      }
      if ((jsonObj.get("fee_reward") != null && !jsonObj.get("fee_reward").isJsonNull()) && !jsonObj.get("fee_reward").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee_reward` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee_reward").toString()));
      }
      if ((jsonObj.get("objective_value") != null && !jsonObj.get("objective_value").isJsonNull()) && !jsonObj.get("objective_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objective_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objective_value").toString()));
      }
      if ((jsonObj.get("utility") != null && !jsonObj.get("utility").isJsonNull()) && !jsonObj.get("utility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `utility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("utility").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("trades") != null && !jsonObj.get("trades").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `trades` to be an array in the JSON string but got `%s`", jsonObj.get("trades").toString()));
      }
      if ((jsonObj.get("create_epoch") != null && !jsonObj.get("create_epoch").isJsonNull()) && !jsonObj.get("create_epoch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_epoch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_epoch").toString()));
      }
      if ((jsonObj.get("revert_epoch") != null && !jsonObj.get("revert_epoch").isJsonNull()) && !jsonObj.get("revert_epoch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revert_epoch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revert_epoch").toString()));
      }
      if ((jsonObj.get("tx_hash") != null && !jsonObj.get("tx_hash").isJsonNull()) && !jsonObj.get("tx_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tx_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tx_hash").toString()));
      }
      if ((jsonObj.get("tx_log_index") != null && !jsonObj.get("tx_log_index").isJsonNull()) && !jsonObj.get("tx_log_index").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tx_log_index` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tx_log_index").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DexSolutionDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DexSolutionDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DexSolutionDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DexSolutionDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<DexSolutionDTO>() {
           @Override
           public void write(JsonWriter out, DexSolutionDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DexSolutionDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DexSolutionDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DexSolutionDTO
  * @throws IOException if the JSON string is invalid with respect to DexSolutionDTO
  */
  public static DexSolutionDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DexSolutionDTO.class);
  }

 /**
  * Convert an instance of DexSolutionDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

