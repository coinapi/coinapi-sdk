/*
 * EMS - REST API
 *
 * This section will provide necessary information about the `CoinAPI EMS REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>        Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints  <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this: `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using Xunit;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using CoinAPI.EMS.REST.V1.Api;
using CoinAPI.EMS.REST.V1.Model;
using CoinAPI.EMS.REST.V1.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace CoinAPI.EMS.REST.V1.Test.Model
{
    /// <summary>
    ///  Class for testing PositionDataInner
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class PositionDataInnerTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for PositionDataInner
        //private PositionDataInner instance;

        public PositionDataInnerTests()
        {
            // TODO uncomment below to create an instance of PositionDataInner
            //instance = new PositionDataInner();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of PositionDataInner
        /// </summary>
        [Fact]
        public void PositionDataInnerInstanceTest()
        {
            // TODO uncomment below to test "IsType" PositionDataInner
            //Assert.IsType<PositionDataInner>(instance);
        }


        /// <summary>
        /// Test the property 'SymbolIdExchange'
        /// </summary>
        [Fact]
        public void SymbolIdExchangeTest()
        {
            // TODO unit test for the property 'SymbolIdExchange'
        }
        /// <summary>
        /// Test the property 'SymbolIdCoinapi'
        /// </summary>
        [Fact]
        public void SymbolIdCoinapiTest()
        {
            // TODO unit test for the property 'SymbolIdCoinapi'
        }
        /// <summary>
        /// Test the property 'AvgEntryPrice'
        /// </summary>
        [Fact]
        public void AvgEntryPriceTest()
        {
            // TODO unit test for the property 'AvgEntryPrice'
        }
        /// <summary>
        /// Test the property 'Quantity'
        /// </summary>
        [Fact]
        public void QuantityTest()
        {
            // TODO unit test for the property 'Quantity'
        }
        /// <summary>
        /// Test the property 'Side'
        /// </summary>
        [Fact]
        public void SideTest()
        {
            // TODO unit test for the property 'Side'
        }
        /// <summary>
        /// Test the property 'UnrealizedPnl'
        /// </summary>
        [Fact]
        public void UnrealizedPnlTest()
        {
            // TODO unit test for the property 'UnrealizedPnl'
        }
        /// <summary>
        /// Test the property 'Leverage'
        /// </summary>
        [Fact]
        public void LeverageTest()
        {
            // TODO unit test for the property 'Leverage'
        }
        /// <summary>
        /// Test the property 'CrossMargin'
        /// </summary>
        [Fact]
        public void CrossMarginTest()
        {
            // TODO unit test for the property 'CrossMargin'
        }
        /// <summary>
        /// Test the property 'LiquidationPrice'
        /// </summary>
        [Fact]
        public void LiquidationPriceTest()
        {
            // TODO unit test for the property 'LiquidationPrice'
        }
        /// <summary>
        /// Test the property 'RawData'
        /// </summary>
        [Fact]
        public void RawDataTest()
        {
            // TODO unit test for the property 'RawData'
        }

    }

}
