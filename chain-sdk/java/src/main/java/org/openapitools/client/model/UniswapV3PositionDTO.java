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
 * Positions created through NonfungiblePositionManager. Positions are represented as NFTs (ERC-721 tokens) as opposed to the fungible ERC-20 tokens on Uniswap V1 and V2.
 */
@ApiModel(description = "Positions created through NonfungiblePositionManager. Positions are represented as NFTs (ERC-721 tokens) as opposed to the fungible ERC-20 tokens on Uniswap V1 and V2.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-02T13:09:40.576687Z[Etc/UTC]")
public class UniswapV3PositionDTO {
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

  public static final String SERIALIZED_NAME_POOL = "pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  private String pool;

  public static final String SERIALIZED_NAME_TOKEN0 = "token_0";
  @SerializedName(SERIALIZED_NAME_TOKEN0)
  private String token0;

  public static final String SERIALIZED_NAME_TOKEN1 = "token_1";
  @SerializedName(SERIALIZED_NAME_TOKEN1)
  private String token1;

  public static final String SERIALIZED_NAME_TICK_LOWER = "tick_lower";
  @SerializedName(SERIALIZED_NAME_TICK_LOWER)
  private String tickLower;

  public static final String SERIALIZED_NAME_TICK_UPPER = "tick_upper";
  @SerializedName(SERIALIZED_NAME_TICK_UPPER)
  private String tickUpper;

  public static final String SERIALIZED_NAME_LIQUIDITY = "liquidity";
  @SerializedName(SERIALIZED_NAME_LIQUIDITY)
  private String liquidity;

  public static final String SERIALIZED_NAME_DEPOSITED_TOKEN0 = "deposited_token_0";
  @SerializedName(SERIALIZED_NAME_DEPOSITED_TOKEN0)
  private String depositedToken0;

  public static final String SERIALIZED_NAME_DEPOSITED_TOKEN1 = "deposited_token_1";
  @SerializedName(SERIALIZED_NAME_DEPOSITED_TOKEN1)
  private String depositedToken1;

  public static final String SERIALIZED_NAME_WITHDRAWN_TOKEN0 = "withdrawn_token_0";
  @SerializedName(SERIALIZED_NAME_WITHDRAWN_TOKEN0)
  private String withdrawnToken0;

  public static final String SERIALIZED_NAME_WITHDRAWN_TOKEN1 = "withdrawn_token_1";
  @SerializedName(SERIALIZED_NAME_WITHDRAWN_TOKEN1)
  private String withdrawnToken1;

  public static final String SERIALIZED_NAME_COLLECTED_FEES_TOKEN0 = "collected_fees_token_0";
  @SerializedName(SERIALIZED_NAME_COLLECTED_FEES_TOKEN0)
  private String collectedFeesToken0;

  public static final String SERIALIZED_NAME_COLLECTED_FEES_TOKEN1 = "collected_fees_token_1";
  @SerializedName(SERIALIZED_NAME_COLLECTED_FEES_TOKEN1)
  private String collectedFeesToken1;

  public static final String SERIALIZED_NAME_TRANSACTION = "transaction";
  @SerializedName(SERIALIZED_NAME_TRANSACTION)
  private String transaction;

  public static final String SERIALIZED_NAME_FEE_GROWTH_INSIDE0_LAST_X128 = "fee_growth_inside_0_last_x128";
  @SerializedName(SERIALIZED_NAME_FEE_GROWTH_INSIDE0_LAST_X128)
  private String feeGrowthInside0LastX128;

  public static final String SERIALIZED_NAME_FEE_GROWTH_INSIDE1_LAST_X128 = "fee_growth_inside_1_last_x128";
  @SerializedName(SERIALIZED_NAME_FEE_GROWTH_INSIDE1_LAST_X128)
  private String feeGrowthInside1LastX128;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public UniswapV3PositionDTO() {
  }

  public UniswapV3PositionDTO entryTime(OffsetDateTime entryTime) {
    
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


  public UniswapV3PositionDTO recvTime(OffsetDateTime recvTime) {
    
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


  public UniswapV3PositionDTO blockNumber(Long blockNumber) {
    
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


  public UniswapV3PositionDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * NFT token identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NFT token identifier.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UniswapV3PositionDTO owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Owner of the NFT.
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Owner of the NFT.")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public UniswapV3PositionDTO pool(String pool) {
    
    this.pool = pool;
    return this;
  }

   /**
   * Pool position is within.
   * @return pool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pool position is within.")

  public String getPool() {
    return pool;
  }


  public void setPool(String pool) {
    this.pool = pool;
  }


  public UniswapV3PositionDTO token0(String token0) {
    
    this.token0 = token0;
    return this;
  }

   /**
   * Reference to token0 as stored in pair contract.
   * @return token0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to token0 as stored in pair contract.")

  public String getToken0() {
    return token0;
  }


  public void setToken0(String token0) {
    this.token0 = token0;
  }


  public UniswapV3PositionDTO token1(String token1) {
    
    this.token1 = token1;
    return this;
  }

   /**
   * Reference to token1 as stored in pair contract.
   * @return token1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to token1 as stored in pair contract.")

  public String getToken1() {
    return token1;
  }


  public void setToken1(String token1) {
    this.token1 = token1;
  }


  public UniswapV3PositionDTO tickLower(String tickLower) {
    
    this.tickLower = tickLower;
    return this;
  }

   /**
   * Lower tick of the position.
   * @return tickLower
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lower tick of the position.")

  public String getTickLower() {
    return tickLower;
  }


  public void setTickLower(String tickLower) {
    this.tickLower = tickLower;
  }


  public UniswapV3PositionDTO tickUpper(String tickUpper) {
    
    this.tickUpper = tickUpper;
    return this;
  }

   /**
   * Upper tick of the position.
   * @return tickUpper
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Upper tick of the position.")

  public String getTickUpper() {
    return tickUpper;
  }


  public void setTickUpper(String tickUpper) {
    this.tickUpper = tickUpper;
  }


  public UniswapV3PositionDTO liquidity(String liquidity) {
    
    this.liquidity = liquidity;
    return this;
  }

   /**
   * Total position liquidity.
   * @return liquidity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total position liquidity.")

  public String getLiquidity() {
    return liquidity;
  }


  public void setLiquidity(String liquidity) {
    this.liquidity = liquidity;
  }


  public UniswapV3PositionDTO depositedToken0(String depositedToken0) {
    
    this.depositedToken0 = depositedToken0;
    return this;
  }

   /**
   * Amount of token 0 ever deposited to position.
   * @return depositedToken0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token 0 ever deposited to position.")

  public String getDepositedToken0() {
    return depositedToken0;
  }


  public void setDepositedToken0(String depositedToken0) {
    this.depositedToken0 = depositedToken0;
  }


  public UniswapV3PositionDTO depositedToken1(String depositedToken1) {
    
    this.depositedToken1 = depositedToken1;
    return this;
  }

   /**
   * Amount of token 1 ever deposited to position.
   * @return depositedToken1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token 1 ever deposited to position.")

  public String getDepositedToken1() {
    return depositedToken1;
  }


  public void setDepositedToken1(String depositedToken1) {
    this.depositedToken1 = depositedToken1;
  }


  public UniswapV3PositionDTO withdrawnToken0(String withdrawnToken0) {
    
    this.withdrawnToken0 = withdrawnToken0;
    return this;
  }

   /**
   * Amount of token 0 ever withdrawn from position (without fees).
   * @return withdrawnToken0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token 0 ever withdrawn from position (without fees).")

  public String getWithdrawnToken0() {
    return withdrawnToken0;
  }


  public void setWithdrawnToken0(String withdrawnToken0) {
    this.withdrawnToken0 = withdrawnToken0;
  }


  public UniswapV3PositionDTO withdrawnToken1(String withdrawnToken1) {
    
    this.withdrawnToken1 = withdrawnToken1;
    return this;
  }

   /**
   * Amount of token 1 ever withdrawn from position (without fees).
   * @return withdrawnToken1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token 1 ever withdrawn from position (without fees).")

  public String getWithdrawnToken1() {
    return withdrawnToken1;
  }


  public void setWithdrawnToken1(String withdrawnToken1) {
    this.withdrawnToken1 = withdrawnToken1;
  }


  public UniswapV3PositionDTO collectedFeesToken0(String collectedFeesToken0) {
    
    this.collectedFeesToken0 = collectedFeesToken0;
    return this;
  }

   /**
   * All time collected fees in token0.
   * @return collectedFeesToken0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All time collected fees in token0.")

  public String getCollectedFeesToken0() {
    return collectedFeesToken0;
  }


  public void setCollectedFeesToken0(String collectedFeesToken0) {
    this.collectedFeesToken0 = collectedFeesToken0;
  }


  public UniswapV3PositionDTO collectedFeesToken1(String collectedFeesToken1) {
    
    this.collectedFeesToken1 = collectedFeesToken1;
    return this;
  }

   /**
   * All time collected fees in token1.
   * @return collectedFeesToken1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All time collected fees in token1.")

  public String getCollectedFeesToken1() {
    return collectedFeesToken1;
  }


  public void setCollectedFeesToken1(String collectedFeesToken1) {
    this.collectedFeesToken1 = collectedFeesToken1;
  }


  public UniswapV3PositionDTO transaction(String transaction) {
    
    this.transaction = transaction;
    return this;
  }

   /**
   * Transaction in which the position was initialized.
   * @return transaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction in which the position was initialized.")

  public String getTransaction() {
    return transaction;
  }


  public void setTransaction(String transaction) {
    this.transaction = transaction;
  }


  public UniswapV3PositionDTO feeGrowthInside0LastX128(String feeGrowthInside0LastX128) {
    
    this.feeGrowthInside0LastX128 = feeGrowthInside0LastX128;
    return this;
  }

   /**
   * Variable needed for fee computation.
   * @return feeGrowthInside0LastX128
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Variable needed for fee computation.")

  public String getFeeGrowthInside0LastX128() {
    return feeGrowthInside0LastX128;
  }


  public void setFeeGrowthInside0LastX128(String feeGrowthInside0LastX128) {
    this.feeGrowthInside0LastX128 = feeGrowthInside0LastX128;
  }


  public UniswapV3PositionDTO feeGrowthInside1LastX128(String feeGrowthInside1LastX128) {
    
    this.feeGrowthInside1LastX128 = feeGrowthInside1LastX128;
    return this;
  }

   /**
   * Variable needed for fee computation.
   * @return feeGrowthInside1LastX128
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Variable needed for fee computation.")

  public String getFeeGrowthInside1LastX128() {
    return feeGrowthInside1LastX128;
  }


  public void setFeeGrowthInside1LastX128(String feeGrowthInside1LastX128) {
    this.feeGrowthInside1LastX128 = feeGrowthInside1LastX128;
  }


  public UniswapV3PositionDTO vid(Long vid) {
    
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
    UniswapV3PositionDTO uniswapV3PositionDTO = (UniswapV3PositionDTO) o;
    return Objects.equals(this.entryTime, uniswapV3PositionDTO.entryTime) &&
        Objects.equals(this.recvTime, uniswapV3PositionDTO.recvTime) &&
        Objects.equals(this.blockNumber, uniswapV3PositionDTO.blockNumber) &&
        Objects.equals(this.id, uniswapV3PositionDTO.id) &&
        Objects.equals(this.owner, uniswapV3PositionDTO.owner) &&
        Objects.equals(this.pool, uniswapV3PositionDTO.pool) &&
        Objects.equals(this.token0, uniswapV3PositionDTO.token0) &&
        Objects.equals(this.token1, uniswapV3PositionDTO.token1) &&
        Objects.equals(this.tickLower, uniswapV3PositionDTO.tickLower) &&
        Objects.equals(this.tickUpper, uniswapV3PositionDTO.tickUpper) &&
        Objects.equals(this.liquidity, uniswapV3PositionDTO.liquidity) &&
        Objects.equals(this.depositedToken0, uniswapV3PositionDTO.depositedToken0) &&
        Objects.equals(this.depositedToken1, uniswapV3PositionDTO.depositedToken1) &&
        Objects.equals(this.withdrawnToken0, uniswapV3PositionDTO.withdrawnToken0) &&
        Objects.equals(this.withdrawnToken1, uniswapV3PositionDTO.withdrawnToken1) &&
        Objects.equals(this.collectedFeesToken0, uniswapV3PositionDTO.collectedFeesToken0) &&
        Objects.equals(this.collectedFeesToken1, uniswapV3PositionDTO.collectedFeesToken1) &&
        Objects.equals(this.transaction, uniswapV3PositionDTO.transaction) &&
        Objects.equals(this.feeGrowthInside0LastX128, uniswapV3PositionDTO.feeGrowthInside0LastX128) &&
        Objects.equals(this.feeGrowthInside1LastX128, uniswapV3PositionDTO.feeGrowthInside1LastX128) &&
        Objects.equals(this.vid, uniswapV3PositionDTO.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, owner, pool, token0, token1, tickLower, tickUpper, liquidity, depositedToken0, depositedToken1, withdrawnToken0, withdrawnToken1, collectedFeesToken0, collectedFeesToken1, transaction, feeGrowthInside0LastX128, feeGrowthInside1LastX128, vid);
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
    sb.append("class UniswapV3PositionDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    token0: ").append(toIndentedString(token0)).append("\n");
    sb.append("    token1: ").append(toIndentedString(token1)).append("\n");
    sb.append("    tickLower: ").append(toIndentedString(tickLower)).append("\n");
    sb.append("    tickUpper: ").append(toIndentedString(tickUpper)).append("\n");
    sb.append("    liquidity: ").append(toIndentedString(liquidity)).append("\n");
    sb.append("    depositedToken0: ").append(toIndentedString(depositedToken0)).append("\n");
    sb.append("    depositedToken1: ").append(toIndentedString(depositedToken1)).append("\n");
    sb.append("    withdrawnToken0: ").append(toIndentedString(withdrawnToken0)).append("\n");
    sb.append("    withdrawnToken1: ").append(toIndentedString(withdrawnToken1)).append("\n");
    sb.append("    collectedFeesToken0: ").append(toIndentedString(collectedFeesToken0)).append("\n");
    sb.append("    collectedFeesToken1: ").append(toIndentedString(collectedFeesToken1)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    feeGrowthInside0LastX128: ").append(toIndentedString(feeGrowthInside0LastX128)).append("\n");
    sb.append("    feeGrowthInside1LastX128: ").append(toIndentedString(feeGrowthInside1LastX128)).append("\n");
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
    openapiFields.add("pool");
    openapiFields.add("token_0");
    openapiFields.add("token_1");
    openapiFields.add("tick_lower");
    openapiFields.add("tick_upper");
    openapiFields.add("liquidity");
    openapiFields.add("deposited_token_0");
    openapiFields.add("deposited_token_1");
    openapiFields.add("withdrawn_token_0");
    openapiFields.add("withdrawn_token_1");
    openapiFields.add("collected_fees_token_0");
    openapiFields.add("collected_fees_token_1");
    openapiFields.add("transaction");
    openapiFields.add("fee_growth_inside_0_last_x128");
    openapiFields.add("fee_growth_inside_1_last_x128");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UniswapV3PositionDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UniswapV3PositionDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UniswapV3PositionDTO is not found in the empty JSON string", UniswapV3PositionDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UniswapV3PositionDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UniswapV3PositionDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) && !jsonObj.get("owner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      if ((jsonObj.get("pool") != null && !jsonObj.get("pool").isJsonNull()) && !jsonObj.get("pool").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pool` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pool").toString()));
      }
      if ((jsonObj.get("token_0") != null && !jsonObj.get("token_0").isJsonNull()) && !jsonObj.get("token_0").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_0` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_0").toString()));
      }
      if ((jsonObj.get("token_1") != null && !jsonObj.get("token_1").isJsonNull()) && !jsonObj.get("token_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_1").toString()));
      }
      if ((jsonObj.get("tick_lower") != null && !jsonObj.get("tick_lower").isJsonNull()) && !jsonObj.get("tick_lower").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tick_lower` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tick_lower").toString()));
      }
      if ((jsonObj.get("tick_upper") != null && !jsonObj.get("tick_upper").isJsonNull()) && !jsonObj.get("tick_upper").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tick_upper` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tick_upper").toString()));
      }
      if ((jsonObj.get("liquidity") != null && !jsonObj.get("liquidity").isJsonNull()) && !jsonObj.get("liquidity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `liquidity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("liquidity").toString()));
      }
      if ((jsonObj.get("deposited_token_0") != null && !jsonObj.get("deposited_token_0").isJsonNull()) && !jsonObj.get("deposited_token_0").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deposited_token_0` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deposited_token_0").toString()));
      }
      if ((jsonObj.get("deposited_token_1") != null && !jsonObj.get("deposited_token_1").isJsonNull()) && !jsonObj.get("deposited_token_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deposited_token_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deposited_token_1").toString()));
      }
      if ((jsonObj.get("withdrawn_token_0") != null && !jsonObj.get("withdrawn_token_0").isJsonNull()) && !jsonObj.get("withdrawn_token_0").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `withdrawn_token_0` to be a primitive type in the JSON string but got `%s`", jsonObj.get("withdrawn_token_0").toString()));
      }
      if ((jsonObj.get("withdrawn_token_1") != null && !jsonObj.get("withdrawn_token_1").isJsonNull()) && !jsonObj.get("withdrawn_token_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `withdrawn_token_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("withdrawn_token_1").toString()));
      }
      if ((jsonObj.get("collected_fees_token_0") != null && !jsonObj.get("collected_fees_token_0").isJsonNull()) && !jsonObj.get("collected_fees_token_0").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collected_fees_token_0` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collected_fees_token_0").toString()));
      }
      if ((jsonObj.get("collected_fees_token_1") != null && !jsonObj.get("collected_fees_token_1").isJsonNull()) && !jsonObj.get("collected_fees_token_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collected_fees_token_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collected_fees_token_1").toString()));
      }
      if ((jsonObj.get("transaction") != null && !jsonObj.get("transaction").isJsonNull()) && !jsonObj.get("transaction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction").toString()));
      }
      if ((jsonObj.get("fee_growth_inside_0_last_x128") != null && !jsonObj.get("fee_growth_inside_0_last_x128").isJsonNull()) && !jsonObj.get("fee_growth_inside_0_last_x128").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee_growth_inside_0_last_x128` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee_growth_inside_0_last_x128").toString()));
      }
      if ((jsonObj.get("fee_growth_inside_1_last_x128") != null && !jsonObj.get("fee_growth_inside_1_last_x128").isJsonNull()) && !jsonObj.get("fee_growth_inside_1_last_x128").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee_growth_inside_1_last_x128` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee_growth_inside_1_last_x128").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UniswapV3PositionDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UniswapV3PositionDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UniswapV3PositionDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UniswapV3PositionDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UniswapV3PositionDTO>() {
           @Override
           public void write(JsonWriter out, UniswapV3PositionDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UniswapV3PositionDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UniswapV3PositionDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UniswapV3PositionDTO
  * @throws IOException if the JSON string is invalid with respect to UniswapV3PositionDTO
  */
  public static UniswapV3PositionDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UniswapV3PositionDTO.class);
  }

 /**
  * Convert an instance of UniswapV3PositionDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

