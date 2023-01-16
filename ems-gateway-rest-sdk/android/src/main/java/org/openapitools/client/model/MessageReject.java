/**
 * EMS - REST API
 * This section will provide necessary information about the `CoinAPI EMS REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>        Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints  <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this: `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.RejectReason;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class MessageReject {
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("reject_reason")
  private RejectReason rejectReason = null;
  @SerializedName("exchange_id")
  private String exchangeId = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("rejected_message")
  private String rejectedMessage = null;

  /**
   * Message type, constant.
   **/
  @ApiModelProperty(value = "Message type, constant.")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public RejectReason getRejectReason() {
    return rejectReason;
  }
  public void setRejectReason(RejectReason rejectReason) {
    this.rejectReason = rejectReason;
  }

  /**
   * If the message related to exchange, then the identifier of the exchange will be provided.
   **/
  @ApiModelProperty(value = "If the message related to exchange, then the identifier of the exchange will be provided.")
  public String getExchangeId() {
    return exchangeId;
  }
  public void setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
  }

  /**
   * Message text.
   **/
  @ApiModelProperty(value = "Message text.")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Value of rejected request, if available.
   **/
  @ApiModelProperty(value = "Value of rejected request, if available.")
  public String getRejectedMessage() {
    return rejectedMessage;
  }
  public void setRejectedMessage(String rejectedMessage) {
    this.rejectedMessage = rejectedMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageReject messageReject = (MessageReject) o;
    return (this.type == null ? messageReject.type == null : this.type.equals(messageReject.type)) &&
        (this.rejectReason == null ? messageReject.rejectReason == null : this.rejectReason.equals(messageReject.rejectReason)) &&
        (this.exchangeId == null ? messageReject.exchangeId == null : this.exchangeId.equals(messageReject.exchangeId)) &&
        (this.message == null ? messageReject.message == null : this.message.equals(messageReject.message)) &&
        (this.rejectedMessage == null ? messageReject.rejectedMessage == null : this.rejectedMessage.equals(messageReject.rejectedMessage));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.rejectReason == null ? 0: this.rejectReason.hashCode());
    result = 31 * result + (this.exchangeId == null ? 0: this.exchangeId.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    result = 31 * result + (this.rejectedMessage == null ? 0: this.rejectedMessage.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageReject {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  rejectReason: ").append(rejectReason).append("\n");
    sb.append("  exchangeId: ").append(exchangeId).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  rejectedMessage: ").append(rejectedMessage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
