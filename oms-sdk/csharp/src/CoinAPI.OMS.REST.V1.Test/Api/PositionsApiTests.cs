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
using NUnit.Framework;

using CoinAPI.OMS.REST.V1.Client;
using CoinAPI.OMS.REST.V1.Api;
using CoinAPI.OMS.REST.V1.Model;

namespace CoinAPI.OMS.REST.V1.Test
{
    /// <summary>
    ///  Class for testing PositionsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class PositionsApiTests
    {
        private PositionsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new PositionsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of PositionsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOf' PositionsApi
            //Assert.IsInstanceOf(typeof(PositionsApi), instance);
        }

        
        /// <summary>
        /// Test V1PositionsGet
        /// </summary>
        [Test]
        public void V1PositionsGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string exchangeId = null;
            //var response = instance.V1PositionsGet(exchangeId);
            //Assert.IsInstanceOf(typeof(List<Position>), response, "response is List<Position>");
        }
        
    }

}
