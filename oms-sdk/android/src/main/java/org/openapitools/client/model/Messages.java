/**
 * OMS - REST API .
 * OMS Project
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Messages {
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("exchange_id")
  private String exchangeId = null;
  @SerializedName("message")
  private String message = null;

  /**
   * Type of message
   **/
  @ApiModelProperty(value = "Type of message")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Exchange name
   **/
  @ApiModelProperty(value = "Exchange name")
  public String getExchangeId() {
    return exchangeId;
  }
  public void setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
  }

  /**
   * Message
   **/
  @ApiModelProperty(value = "Message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Messages messages = (Messages) o;
    return (this.type == null ? messages.type == null : this.type.equals(messages.type)) &&
        (this.exchangeId == null ? messages.exchangeId == null : this.exchangeId.equals(messages.exchangeId)) &&
        (this.message == null ? messages.message == null : this.message.equals(messages.message));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.exchangeId == null ? 0: this.exchangeId.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Messages {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  exchangeId: ").append(exchangeId).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
