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
 * CurveVotingAppDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-09T16:14:14.496338Z[Etc/UTC]")
public class CurveVotingAppDTO {
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

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CODENAME = "codename";
  @SerializedName(SERIALIZED_NAME_CODENAME)
  private String codename;

  public static final String SERIALIZED_NAME_MINIMUM_BALANCE = "minimum_balance";
  @SerializedName(SERIALIZED_NAME_MINIMUM_BALANCE)
  private String minimumBalance;

  public static final String SERIALIZED_NAME_MINIMUM_QUORUM = "minimum_quorum";
  @SerializedName(SERIALIZED_NAME_MINIMUM_QUORUM)
  private String minimumQuorum;

  public static final String SERIALIZED_NAME_MINIMUM_TIME = "minimum_time";
  @SerializedName(SERIALIZED_NAME_MINIMUM_TIME)
  private String minimumTime;

  public static final String SERIALIZED_NAME_REQUIRED_SUPPORT = "required_support";
  @SerializedName(SERIALIZED_NAME_REQUIRED_SUPPORT)
  private String requiredSupport;

  public static final String SERIALIZED_NAME_VOTE_TIME = "vote_time";
  @SerializedName(SERIALIZED_NAME_VOTE_TIME)
  private String voteTime;

  public static final String SERIALIZED_NAME_PROPOSAL_COUNT = "proposal_count";
  @SerializedName(SERIALIZED_NAME_PROPOSAL_COUNT)
  private String proposalCount;

  public static final String SERIALIZED_NAME_VOTE_COUNT = "vote_count";
  @SerializedName(SERIALIZED_NAME_VOTE_COUNT)
  private String voteCount;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public CurveVotingAppDTO() {
  }

  public CurveVotingAppDTO entryTime(OffsetDateTime entryTime) {
    
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


  public CurveVotingAppDTO recvTime(OffsetDateTime recvTime) {
    
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


  public CurveVotingAppDTO blockNumber(Long blockNumber) {
    
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


  public CurveVotingAppDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * App address.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "App address.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CurveVotingAppDTO address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public CurveVotingAppDTO codename(String codename) {
    
    this.codename = codename;
    return this;
  }

   /**
   * 
   * @return codename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCodename() {
    return codename;
  }


  public void setCodename(String codename) {
    this.codename = codename;
  }


  public CurveVotingAppDTO minimumBalance(String minimumBalance) {
    
    this.minimumBalance = minimumBalance;
    return this;
  }

   /**
   * Minimum balance needed to create a proposal.
   * @return minimumBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum balance needed to create a proposal.")

  public String getMinimumBalance() {
    return minimumBalance;
  }


  public void setMinimumBalance(String minimumBalance) {
    this.minimumBalance = minimumBalance;
  }


  public CurveVotingAppDTO minimumQuorum(String minimumQuorum) {
    
    this.minimumQuorum = minimumQuorum;
    return this;
  }

   /**
   * Percentage of positive votes in total possible votes for a proposal to be accepted.
   * @return minimumQuorum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage of positive votes in total possible votes for a proposal to be accepted.")

  public String getMinimumQuorum() {
    return minimumQuorum;
  }


  public void setMinimumQuorum(String minimumQuorum) {
    this.minimumQuorum = minimumQuorum;
  }


  public CurveVotingAppDTO minimumTime(String minimumTime) {
    
    this.minimumTime = minimumTime;
    return this;
  }

   /**
   * Minimum time needed to pass between user&#39;s previous proposal and a user creating a new proposal.
   * @return minimumTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum time needed to pass between user's previous proposal and a user creating a new proposal.")

  public String getMinimumTime() {
    return minimumTime;
  }


  public void setMinimumTime(String minimumTime) {
    this.minimumTime = minimumTime;
  }


  public CurveVotingAppDTO requiredSupport(String requiredSupport) {
    
    this.requiredSupport = requiredSupport;
    return this;
  }

   /**
   * Percentage of positive votes needed for a proposal to be accepted.
   * @return requiredSupport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage of positive votes needed for a proposal to be accepted.")

  public String getRequiredSupport() {
    return requiredSupport;
  }


  public void setRequiredSupport(String requiredSupport) {
    this.requiredSupport = requiredSupport;
  }


  public CurveVotingAppDTO voteTime(String voteTime) {
    
    this.voteTime = voteTime;
    return this;
  }

   /**
   * Seconds that a proposal will be open for vote (unless enough votes have been cast to make an early decision).
   * @return voteTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Seconds that a proposal will be open for vote (unless enough votes have been cast to make an early decision).")

  public String getVoteTime() {
    return voteTime;
  }


  public void setVoteTime(String voteTime) {
    this.voteTime = voteTime;
  }


  public CurveVotingAppDTO proposalCount(String proposalCount) {
    
    this.proposalCount = proposalCount;
    return this;
  }

   /**
   * Number of proposals created with this app.
   * @return proposalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of proposals created with this app.")

  public String getProposalCount() {
    return proposalCount;
  }


  public void setProposalCount(String proposalCount) {
    this.proposalCount = proposalCount;
  }


  public CurveVotingAppDTO voteCount(String voteCount) {
    
    this.voteCount = voteCount;
    return this;
  }

   /**
   * Number of votes received by all the proposals created with this app.
   * @return voteCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of votes received by all the proposals created with this app.")

  public String getVoteCount() {
    return voteCount;
  }


  public void setVoteCount(String voteCount) {
    this.voteCount = voteCount;
  }


  public CurveVotingAppDTO token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Address of the token used for voting.
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address of the token used for voting.")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public CurveVotingAppDTO vid(Long vid) {
    
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
    CurveVotingAppDTO curveVotingAppDTO = (CurveVotingAppDTO) o;
    return Objects.equals(this.entryTime, curveVotingAppDTO.entryTime) &&
        Objects.equals(this.recvTime, curveVotingAppDTO.recvTime) &&
        Objects.equals(this.blockNumber, curveVotingAppDTO.blockNumber) &&
        Objects.equals(this.id, curveVotingAppDTO.id) &&
        Objects.equals(this.address, curveVotingAppDTO.address) &&
        Objects.equals(this.codename, curveVotingAppDTO.codename) &&
        Objects.equals(this.minimumBalance, curveVotingAppDTO.minimumBalance) &&
        Objects.equals(this.minimumQuorum, curveVotingAppDTO.minimumQuorum) &&
        Objects.equals(this.minimumTime, curveVotingAppDTO.minimumTime) &&
        Objects.equals(this.requiredSupport, curveVotingAppDTO.requiredSupport) &&
        Objects.equals(this.voteTime, curveVotingAppDTO.voteTime) &&
        Objects.equals(this.proposalCount, curveVotingAppDTO.proposalCount) &&
        Objects.equals(this.voteCount, curveVotingAppDTO.voteCount) &&
        Objects.equals(this.token, curveVotingAppDTO.token) &&
        Objects.equals(this.vid, curveVotingAppDTO.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, address, codename, minimumBalance, minimumQuorum, minimumTime, requiredSupport, voteTime, proposalCount, voteCount, token, vid);
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
    sb.append("class CurveVotingAppDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    codename: ").append(toIndentedString(codename)).append("\n");
    sb.append("    minimumBalance: ").append(toIndentedString(minimumBalance)).append("\n");
    sb.append("    minimumQuorum: ").append(toIndentedString(minimumQuorum)).append("\n");
    sb.append("    minimumTime: ").append(toIndentedString(minimumTime)).append("\n");
    sb.append("    requiredSupport: ").append(toIndentedString(requiredSupport)).append("\n");
    sb.append("    voteTime: ").append(toIndentedString(voteTime)).append("\n");
    sb.append("    proposalCount: ").append(toIndentedString(proposalCount)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("codename");
    openapiFields.add("minimum_balance");
    openapiFields.add("minimum_quorum");
    openapiFields.add("minimum_time");
    openapiFields.add("required_support");
    openapiFields.add("vote_time");
    openapiFields.add("proposal_count");
    openapiFields.add("vote_count");
    openapiFields.add("token");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CurveVotingAppDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CurveVotingAppDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CurveVotingAppDTO is not found in the empty JSON string", CurveVotingAppDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CurveVotingAppDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CurveVotingAppDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("codename") != null && !jsonObj.get("codename").isJsonNull()) && !jsonObj.get("codename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codename").toString()));
      }
      if ((jsonObj.get("minimum_balance") != null && !jsonObj.get("minimum_balance").isJsonNull()) && !jsonObj.get("minimum_balance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minimum_balance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minimum_balance").toString()));
      }
      if ((jsonObj.get("minimum_quorum") != null && !jsonObj.get("minimum_quorum").isJsonNull()) && !jsonObj.get("minimum_quorum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minimum_quorum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minimum_quorum").toString()));
      }
      if ((jsonObj.get("minimum_time") != null && !jsonObj.get("minimum_time").isJsonNull()) && !jsonObj.get("minimum_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minimum_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minimum_time").toString()));
      }
      if ((jsonObj.get("required_support") != null && !jsonObj.get("required_support").isJsonNull()) && !jsonObj.get("required_support").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `required_support` to be a primitive type in the JSON string but got `%s`", jsonObj.get("required_support").toString()));
      }
      if ((jsonObj.get("vote_time") != null && !jsonObj.get("vote_time").isJsonNull()) && !jsonObj.get("vote_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vote_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vote_time").toString()));
      }
      if ((jsonObj.get("proposal_count") != null && !jsonObj.get("proposal_count").isJsonNull()) && !jsonObj.get("proposal_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proposal_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proposal_count").toString()));
      }
      if ((jsonObj.get("vote_count") != null && !jsonObj.get("vote_count").isJsonNull()) && !jsonObj.get("vote_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vote_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vote_count").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CurveVotingAppDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CurveVotingAppDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CurveVotingAppDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CurveVotingAppDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<CurveVotingAppDTO>() {
           @Override
           public void write(JsonWriter out, CurveVotingAppDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CurveVotingAppDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CurveVotingAppDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CurveVotingAppDTO
  * @throws IOException if the JSON string is invalid with respect to CurveVotingAppDTO
  */
  public static CurveVotingAppDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CurveVotingAppDTO.class);
  }

 /**
  * Convert an instance of CurveVotingAppDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

