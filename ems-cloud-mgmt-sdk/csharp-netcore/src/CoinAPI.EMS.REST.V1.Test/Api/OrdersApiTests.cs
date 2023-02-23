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
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using CoinAPI.EMS.REST.V1.Client;
using CoinAPI.EMS.REST.V1.Api;
// uncomment below to import models
//using CoinAPI.EMS.REST.V1.Model;

namespace CoinAPI.EMS.REST.V1.Test.Api
{
    /// <summary>
    ///  Class for testing OrdersApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class OrdersApiTests : IDisposable
    {
        private OrdersApi instance;

        public OrdersApiTests()
        {
            instance = new OrdersApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of OrdersApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' OrdersApi
            //Assert.IsType<OrdersApi>(instance);
        }

        /// <summary>
        /// Test V1OrdersCancelAllPost
        /// </summary>
        [Fact]
        public void V1OrdersCancelAllPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //OrderCancelAllRequest orderCancelAllRequest = null;
            //var response = instance.V1OrdersCancelAllPost(orderCancelAllRequest);
            //Assert.IsType<MessageReject>(response);
        }

        /// <summary>
        /// Test V1OrdersCancelPost
        /// </summary>
        [Fact]
        public void V1OrdersCancelPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //OrderCancelSingleRequest orderCancelSingleRequest = null;
            //var response = instance.V1OrdersCancelPost(orderCancelSingleRequest);
            //Assert.IsType<OrderExecutionReport>(response);
        }

        /// <summary>
        /// Test V1OrdersGet
        /// </summary>
        [Fact]
        public void V1OrdersGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string exchangeId = null;
            //var response = instance.V1OrdersGet(exchangeId);
            //Assert.IsType<List<OrderExecutionReport>>(response);
        }

        /// <summary>
        /// Test V1OrdersHistoryTimeStartTimeEndGet
        /// </summary>
        [Fact]
        public void V1OrdersHistoryTimeStartTimeEndGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string timeStart = null;
            //string timeEnd = null;
            //var response = instance.V1OrdersHistoryTimeStartTimeEndGet(timeStart, timeEnd);
            //Assert.IsType<List<OrderHistory>>(response);
        }

        /// <summary>
        /// Test V1OrdersPost
        /// </summary>
        [Fact]
        public void V1OrdersPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //OrderNewSingleRequest orderNewSingleRequest = null;
            //var response = instance.V1OrdersPost(orderNewSingleRequest);
            //Assert.IsType<OrderExecutionReport>(response);
        }

        /// <summary>
        /// Test V1OrdersStatusClientOrderIdGet
        /// </summary>
        [Fact]
        public void V1OrdersStatusClientOrderIdGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string clientOrderId = null;
            //var response = instance.V1OrdersStatusClientOrderIdGet(clientOrderId);
            //Assert.IsType<OrderExecutionReport>(response);
        }
    }
}
