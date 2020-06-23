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
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using CoinAPI.OMS.API.SDK.Client;
using CoinAPI.OMS.API.SDK.Api;
using CoinAPI.OMS.API.SDK.Model;

namespace CoinAPI.OMS.API.SDK.Test
{
    /// <summary>
    ///  Class for testing PositionsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class PositionsApiTests : IDisposable
    {
        private PositionsApi instance;

        public PositionsApiTests()
        {
            instance = new PositionsApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of PositionsApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' PositionsApi
            //Assert.IsType(typeof(PositionsApi), instance, "instance is a PositionsApi");
        }

        
        /// <summary>
        /// Test V1PositionsGet
        /// </summary>
        [Fact]
        public void V1PositionsGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string exchangeId = null;
            //var response = instance.V1PositionsGet(exchangeId);
            //Assert.IsType<List<Position>> (response, "response is List<Position>");
        }
        
    }

}
