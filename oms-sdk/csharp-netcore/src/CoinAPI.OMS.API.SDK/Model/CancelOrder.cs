/* 
 * OMS - REST API .
 *
 * OMS Project
 *
 * The version of the OpenAPI document: v1
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = CoinAPI.OMS.API.SDK.Client.OpenAPIDateConverter;

namespace CoinAPI.OMS.API.SDK.Model
{
    /// <summary>
    /// CancelOrder
    /// </summary>
    [DataContract]
    public partial class CancelOrder :  IEquatable<CancelOrder>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CancelOrder" /> class.
        /// </summary>
        /// <param name="exchangeId">Exchange name.</param>
        /// <param name="exchangeOrderId">Order Id.</param>
        /// <param name="clientOrderId">Client order Id.</param>
        public CancelOrder(string exchangeId = default(string), string exchangeOrderId = default(string), string clientOrderId = default(string))
        {
            this.ExchangeId = exchangeId;
            this.ExchangeOrderId = exchangeOrderId;
            this.ClientOrderId = clientOrderId;
        }
        
        /// <summary>
        /// Exchange name
        /// </summary>
        /// <value>Exchange name</value>
        [DataMember(Name="exchange_id", EmitDefaultValue=false)]
        public string ExchangeId { get; set; }

        /// <summary>
        /// Order Id
        /// </summary>
        /// <value>Order Id</value>
        [DataMember(Name="exchange_order_id", EmitDefaultValue=false)]
        public string ExchangeOrderId { get; set; }

        /// <summary>
        /// Client order Id
        /// </summary>
        /// <value>Client order Id</value>
        [DataMember(Name="client_order_id", EmitDefaultValue=false)]
        public string ClientOrderId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CancelOrder {\n");
            sb.Append("  ExchangeId: ").Append(ExchangeId).Append("\n");
            sb.Append("  ExchangeOrderId: ").Append(ExchangeOrderId).Append("\n");
            sb.Append("  ClientOrderId: ").Append(ClientOrderId).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as CancelOrder);
        }

        /// <summary>
        /// Returns true if CancelOrder instances are equal
        /// </summary>
        /// <param name="input">Instance of CancelOrder to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CancelOrder input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ExchangeId == input.ExchangeId ||
                    (this.ExchangeId != null &&
                    this.ExchangeId.Equals(input.ExchangeId))
                ) && 
                (
                    this.ExchangeOrderId == input.ExchangeOrderId ||
                    (this.ExchangeOrderId != null &&
                    this.ExchangeOrderId.Equals(input.ExchangeOrderId))
                ) && 
                (
                    this.ClientOrderId == input.ClientOrderId ||
                    (this.ClientOrderId != null &&
                    this.ClientOrderId.Equals(input.ClientOrderId))
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
                if (this.ExchangeId != null)
                    hashCode = hashCode * 59 + this.ExchangeId.GetHashCode();
                if (this.ExchangeOrderId != null)
                    hashCode = hashCode * 59 + this.ExchangeOrderId.GetHashCode();
                if (this.ClientOrderId != null)
                    hashCode = hashCode * 59 + this.ClientOrderId.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
