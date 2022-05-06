/*
 * EMS - REST API
 *
 * This section will provide necessary information about the `CoinAPI EMS REST API` protocol. <br/> This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       <br/><br/> Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  <br/><br/> If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: <br/><br/> `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this:  <br/><br/> `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
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
    /// Order time in force options are documented in the separate section: &lt;a href&#x3D;\&quot;#ems-order-params-tif\&quot;&gt;EMS / Starter Guide / Order parameters / Time in force&lt;/a&gt; 
    /// </summary>
    /// <value>Order time in force options are documented in the separate section: &lt;a href&#x3D;\&quot;#ems-order-params-tif\&quot;&gt;EMS / Starter Guide / Order parameters / Time in force&lt;/a&gt; </value>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum TimeInForce
    {
        /// <summary>
        /// Enum GOODTILLCANCEL for value: GOOD_TILL_CANCEL
        /// </summary>
        [EnumMember(Value = "GOOD_TILL_CANCEL")]
        GOODTILLCANCEL = 1,

        /// <summary>
        /// Enum GOODTILLTIMEEXCHANGE for value: GOOD_TILL_TIME_EXCHANGE
        /// </summary>
        [EnumMember(Value = "GOOD_TILL_TIME_EXCHANGE")]
        GOODTILLTIMEEXCHANGE = 2,

        /// <summary>
        /// Enum GOODTILLTIMEOMS for value: GOOD_TILL_TIME_OMS
        /// </summary>
        [EnumMember(Value = "GOOD_TILL_TIME_OMS")]
        GOODTILLTIMEOMS = 3,

        /// <summary>
        /// Enum FILLORKILL for value: FILL_OR_KILL
        /// </summary>
        [EnumMember(Value = "FILL_OR_KILL")]
        FILLORKILL = 4,

        /// <summary>
        /// Enum IMMEDIATEORCANCEL for value: IMMEDIATE_OR_CANCEL
        /// </summary>
        [EnumMember(Value = "IMMEDIATE_OR_CANCEL")]
        IMMEDIATEORCANCEL = 5

    }

}
