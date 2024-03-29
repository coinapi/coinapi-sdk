/*
 * On Chain Dapps - REST API
 *
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
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
    /// Defines Transactions.ETradeAggressiveSide
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum TransactionsETradeAggressiveSide
    {
        /// <summary>
        /// Enum Buy for value: Buy
        /// </summary>
        [EnumMember(Value = "Buy")]
        Buy = 1,

        /// <summary>
        /// Enum Sell for value: Sell
        /// </summary>
        [EnumMember(Value = "Sell")]
        Sell = 2,

        /// <summary>
        /// Enum EstimatedBuy for value: EstimatedBuy
        /// </summary>
        [EnumMember(Value = "EstimatedBuy")]
        EstimatedBuy = 3,

        /// <summary>
        /// Enum EstimatedSell for value: EstimatedSell
        /// </summary>
        [EnumMember(Value = "EstimatedSell")]
        EstimatedSell = 4,

        /// <summary>
        /// Enum Unknown for value: Unknown
        /// </summary>
        [EnumMember(Value = "Unknown")]
        Unknown = 5

    }

}
