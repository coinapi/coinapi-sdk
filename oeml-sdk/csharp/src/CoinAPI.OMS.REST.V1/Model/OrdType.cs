/* 
 * OEML - REST API
 *
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
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
using OpenAPIDateConverter = CoinAPI.OMS.REST.V1.Client.OpenAPIDateConverter;

namespace CoinAPI.OMS.REST.V1.Model
{
    /// <summary>
    /// Order types are documented in the separate section: &lt;a href&#x3D;\&quot;#oeml-order-params-type\&quot;&gt;OEML / Starter Guide / Order parameters / Order type&lt;/a&gt; 
    /// </summary>
    /// <value>Order types are documented in the separate section: &lt;a href&#x3D;\&quot;#oeml-order-params-type\&quot;&gt;OEML / Starter Guide / Order parameters / Order type&lt;/a&gt; </value>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum OrdType
    {
        /// <summary>
        /// Enum LIMIT for value: LIMIT
        /// </summary>
        [EnumMember(Value = "LIMIT")]
        LIMIT = 1

    }

}
