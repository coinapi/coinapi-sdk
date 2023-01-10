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
 * This entity is used to store data about a user&#39;s liquidity position. This information, along with information from the pair itself can be used to provide position sizes, token deposits, and more.
 */
@ApiModel(description = "This entity is used to store data about a user's liquidity position. This information, along with information from the pair itself can be used to provide position sizes, token deposits, and more.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T16:46:33.341002Z[Etc/UTC]")
public class UniswapV2LiquidityPositionDTO {
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

  public static final String SERIALIZED_NAME_PAIR = "pair";
  @SerializedName(SERIALIZED_NAME_PAIR)
  private String pair;

  public static final String SERIALIZED_NAME_LIQUIDITY_TOKEN_BALANCE = "liquidity_token_balance";
  @SerializedName(SERIALIZED_NAME_LIQUIDITY_TOKEN_BALANCE)
  private String liquidityTokenBalance;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public UniswapV2LiquidityPositionDTO() {
  }

  public UniswapV2LiquidityPositionDTO entryTime(OffsetDateTime entryTime) {
    
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


  public UniswapV2LiquidityPositionDTO recvTime(OffsetDateTime recvTime) {
    
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


  public UniswapV2LiquidityPositionDTO blockNumber(Long blockNumber) {
    
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


  public UniswapV2LiquidityPositionDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * User address and pair address concatenated with a dash.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User address and pair address concatenated with a dash.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UniswapV2LiquidityPositionDTO user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * Reference to user.
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to user.")

  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }


  public UniswapV2LiquidityPositionDTO pair(String pair) {
    
    this.pair = pair;
    return this;
  }

   /**
   * Reference to the pair liquidity is being provided on.
   * @return pair
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to the pair liquidity is being provided on.")

  public String getPair() {
    return pair;
  }


  public void setPair(String pair) {
    this.pair = pair;
  }


  public UniswapV2LiquidityPositionDTO liquidityTokenBalance(String liquidityTokenBalance) {
    
    this.liquidityTokenBalance = liquidityTokenBalance;
    return this;
  }

   /**
   * Amount of LP tokens minted for this position.
   * @return liquidityTokenBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of LP tokens minted for this position.")

  public String getLiquidityTokenBalance() {
    return liquidityTokenBalance;
  }


  public void setLiquidityTokenBalance(String liquidityTokenBalance) {
    this.liquidityTokenBalance = liquidityTokenBalance;
  }


  public UniswapV2LiquidityPositionDTO vid(Long vid) {
    
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
    UniswapV2LiquidityPositionDTO uniswapV2LiquidityPositionDTO = (UniswapV2LiquidityPositionDTO) o;
    return Objects.equals(this.entryTime, uniswapV2LiquidityPositionDTO.entryTime) &&
        Objects.equals(this.recvTime, uniswapV2LiquidityPositionDTO.recvTime) &&
        Objects.equals(this.blockNumber, uniswapV2LiquidityPositionDTO.blockNumber) &&
        Objects.equals(this.id, uniswapV2LiquidityPositionDTO.id) &&
        Objects.equals(this.user, uniswapV2LiquidityPositionDTO.user) &&
        Objects.equals(this.pair, uniswapV2LiquidityPositionDTO.pair) &&
        Objects.equals(this.liquidityTokenBalance, uniswapV2LiquidityPositionDTO.liquidityTokenBalance) &&
        Objects.equals(this.vid, uniswapV2LiquidityPositionDTO.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, user, pair, liquidityTokenBalance, vid);
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
    sb.append("class UniswapV2LiquidityPositionDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    pair: ").append(toIndentedString(pair)).append("\n");
    sb.append("    liquidityTokenBalance: ").append(toIndentedString(liquidityTokenBalance)).append("\n");
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
    openapiFields.add("pair");
    openapiFields.add("liquidity_token_balance");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UniswapV2LiquidityPositionDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UniswapV2LiquidityPositionDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UniswapV2LiquidityPositionDTO is not found in the empty JSON string", UniswapV2LiquidityPositionDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UniswapV2LiquidityPositionDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UniswapV2LiquidityPositionDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
      if ((jsonObj.get("pair") != null && !jsonObj.get("pair").isJsonNull()) && !jsonObj.get("pair").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pair` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pair").toString()));
      }
      if ((jsonObj.get("liquidity_token_balance") != null && !jsonObj.get("liquidity_token_balance").isJsonNull()) && !jsonObj.get("liquidity_token_balance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `liquidity_token_balance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("liquidity_token_balance").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UniswapV2LiquidityPositionDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UniswapV2LiquidityPositionDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UniswapV2LiquidityPositionDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UniswapV2LiquidityPositionDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UniswapV2LiquidityPositionDTO>() {
           @Override
           public void write(JsonWriter out, UniswapV2LiquidityPositionDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UniswapV2LiquidityPositionDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UniswapV2LiquidityPositionDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UniswapV2LiquidityPositionDTO
  * @throws IOException if the JSON string is invalid with respect to UniswapV2LiquidityPositionDTO
  */
  public static UniswapV2LiquidityPositionDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UniswapV2LiquidityPositionDTO.class);
  }

 /**
  * Convert an instance of UniswapV2LiquidityPositionDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

