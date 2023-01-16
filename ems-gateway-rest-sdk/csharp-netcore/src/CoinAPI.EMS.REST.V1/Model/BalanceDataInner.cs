/*
 * EMS - REST API
 *
 * This section will provide necessary information about the `CoinAPI EMS REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>        Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints  <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this: `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = CoinAPI.EMS.REST.V1.Client.OpenAPIDateConverter;

namespace CoinAPI.EMS.REST.V1.Model
{
    /// <summary>
    /// BalanceDataInner
    /// </summary>
    [DataContract(Name = "Balance_data_inner")]
    public partial class BalanceDataInner : IEquatable<BalanceDataInner>, IValidatableObject
    {
        /// <summary>
        /// Source of the last modification. 
        /// </summary>
        /// <value>Source of the last modification. </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum LastUpdatedByEnum
        {
            /// <summary>
            /// Enum INITIALIZATION for value: INITIALIZATION
            /// </summary>
            [EnumMember(Value = "INITIALIZATION")]
            INITIALIZATION = 1,

            /// <summary>
            /// Enum BALANCEMANAGER for value: BALANCE_MANAGER
            /// </summary>
            [EnumMember(Value = "BALANCE_MANAGER")]
            BALANCEMANAGER = 2,

            /// <summary>
            /// Enum EXCHANGE for value: EXCHANGE
            /// </summary>
            [EnumMember(Value = "EXCHANGE")]
            EXCHANGE = 3

        }


        /// <summary>
        /// Source of the last modification. 
        /// </summary>
        /// <value>Source of the last modification. </value>
        [DataMember(Name = "last_updated_by", EmitDefaultValue = false)]
        public LastUpdatedByEnum? LastUpdatedBy { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="BalanceDataInner" /> class.
        /// </summary>
        /// <param name="assetIdExchange">Exchange currency code..</param>
        /// <param name="assetIdCoinapi">CoinAPI currency code..</param>
        /// <param name="balance">Value of the current total currency balance on the exchange..</param>
        /// <param name="available">Value of the current available currency balance on the exchange that can be used as collateral..</param>
        /// <param name="locked">Value of the current locked currency balance by the exchange..</param>
        /// <param name="lastUpdatedBy">Source of the last modification. .</param>
        /// <param name="rateUsd">Current exchange rate to the USD for the single unit of the currency. .</param>
        /// <param name="traded">Value of the current total traded..</param>
        public BalanceDataInner(string assetIdExchange = default(string), string assetIdCoinapi = default(string), double balance = default(double), double available = default(double), double locked = default(double), LastUpdatedByEnum? lastUpdatedBy = default(LastUpdatedByEnum?), double rateUsd = default(double), double traded = default(double))
        {
            this.AssetIdExchange = assetIdExchange;
            this.AssetIdCoinapi = assetIdCoinapi;
            this.Balance = balance;
            this.Available = available;
            this.Locked = locked;
            this.LastUpdatedBy = lastUpdatedBy;
            this.RateUsd = rateUsd;
            this.Traded = traded;
        }

        /// <summary>
        /// Exchange currency code.
        /// </summary>
        /// <value>Exchange currency code.</value>
        [DataMember(Name = "asset_id_exchange", EmitDefaultValue = false)]
        public string AssetIdExchange { get; set; }

        /// <summary>
        /// CoinAPI currency code.
        /// </summary>
        /// <value>CoinAPI currency code.</value>
        [DataMember(Name = "asset_id_coinapi", EmitDefaultValue = false)]
        public string AssetIdCoinapi { get; set; }

        /// <summary>
        /// Value of the current total currency balance on the exchange.
        /// </summary>
        /// <value>Value of the current total currency balance on the exchange.</value>
        [DataMember(Name = "balance", EmitDefaultValue = false)]
        public double Balance { get; set; }

        /// <summary>
        /// Value of the current available currency balance on the exchange that can be used as collateral.
        /// </summary>
        /// <value>Value of the current available currency balance on the exchange that can be used as collateral.</value>
        [DataMember(Name = "available", EmitDefaultValue = false)]
        public double Available { get; set; }

        /// <summary>
        /// Value of the current locked currency balance by the exchange.
        /// </summary>
        /// <value>Value of the current locked currency balance by the exchange.</value>
        [DataMember(Name = "locked", EmitDefaultValue = false)]
        public double Locked { get; set; }

        /// <summary>
        /// Current exchange rate to the USD for the single unit of the currency. 
        /// </summary>
        /// <value>Current exchange rate to the USD for the single unit of the currency. </value>
        [DataMember(Name = "rate_usd", EmitDefaultValue = false)]
        public double RateUsd { get; set; }

        /// <summary>
        /// Value of the current total traded.
        /// </summary>
        /// <value>Value of the current total traded.</value>
        [DataMember(Name = "traded", EmitDefaultValue = false)]
        public double Traded { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BalanceDataInner {\n");
            sb.Append("  AssetIdExchange: ").Append(AssetIdExchange).Append("\n");
            sb.Append("  AssetIdCoinapi: ").Append(AssetIdCoinapi).Append("\n");
            sb.Append("  Balance: ").Append(Balance).Append("\n");
            sb.Append("  Available: ").Append(Available).Append("\n");
            sb.Append("  Locked: ").Append(Locked).Append("\n");
            sb.Append("  LastUpdatedBy: ").Append(LastUpdatedBy).Append("\n");
            sb.Append("  RateUsd: ").Append(RateUsd).Append("\n");
            sb.Append("  Traded: ").Append(Traded).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as BalanceDataInner);
        }

        /// <summary>
        /// Returns true if BalanceDataInner instances are equal
        /// </summary>
        /// <param name="input">Instance of BalanceDataInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BalanceDataInner input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.AssetIdExchange == input.AssetIdExchange ||
                    (this.AssetIdExchange != null &&
                    this.AssetIdExchange.Equals(input.AssetIdExchange))
                ) && 
                (
                    this.AssetIdCoinapi == input.AssetIdCoinapi ||
                    (this.AssetIdCoinapi != null &&
                    this.AssetIdCoinapi.Equals(input.AssetIdCoinapi))
                ) && 
                (
                    this.Balance == input.Balance ||
                    this.Balance.Equals(input.Balance)
                ) && 
                (
                    this.Available == input.Available ||
                    this.Available.Equals(input.Available)
                ) && 
                (
                    this.Locked == input.Locked ||
                    this.Locked.Equals(input.Locked)
                ) && 
                (
                    this.LastUpdatedBy == input.LastUpdatedBy ||
                    this.LastUpdatedBy.Equals(input.LastUpdatedBy)
                ) && 
                (
                    this.RateUsd == input.RateUsd ||
                    this.RateUsd.Equals(input.RateUsd)
                ) && 
                (
                    this.Traded == input.Traded ||
                    this.Traded.Equals(input.Traded)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.AssetIdExchange != null)
                {
                    hashCode = (hashCode * 59) + this.AssetIdExchange.GetHashCode();
                }
                if (this.AssetIdCoinapi != null)
                {
                    hashCode = (hashCode * 59) + this.AssetIdCoinapi.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Balance.GetHashCode();
                hashCode = (hashCode * 59) + this.Available.GetHashCode();
                hashCode = (hashCode * 59) + this.Locked.GetHashCode();
                hashCode = (hashCode * 59) + this.LastUpdatedBy.GetHashCode();
                hashCode = (hashCode * 59) + this.RateUsd.GetHashCode();
                hashCode = (hashCode * 59) + this.Traded.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
