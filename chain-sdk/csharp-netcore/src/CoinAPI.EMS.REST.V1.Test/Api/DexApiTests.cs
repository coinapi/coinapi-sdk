/*
 * OnChain API
 *
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
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
    ///  Class for testing DexApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class DexApiTests : IDisposable
    {
        private DexApi instance;

        public DexApiTests()
        {
            instance = new DexApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of DexApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' DexApi
            //Assert.IsType<DexApi>(instance);
        }

        /// <summary>
        /// Test DexBatchsCurrent
        /// </summary>
        [Fact]
        public void DexBatchsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.DexBatchsCurrent();
            //Assert.IsType<List<DexBatchDTO>>(response);
        }

        /// <summary>
        /// Test DexDepositsCurrent
        /// </summary>
        [Fact]
        public void DexDepositsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.DexDepositsCurrent();
            //Assert.IsType<List<DexDepositDTO>>(response);
        }

        /// <summary>
        /// Test DexGetBatchsHistorical
        /// </summary>
        [Fact]
        public void DexGetBatchsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.DexGetBatchsHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<DexBatchDTO>>(response);
        }

        /// <summary>
        /// Test DexGetDepositsHistorical
        /// </summary>
        [Fact]
        public void DexGetDepositsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string user = null;
            //var response = instance.DexGetDepositsHistorical(startBlock, endBlock, startDate, endDate, id, user);
            //Assert.IsType<List<DexDepositDTO>>(response);
        }

        /// <summary>
        /// Test DexGetOrdersHistorical
        /// </summary>
        [Fact]
        public void DexGetOrdersHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string buyToken = null;
            //string sellToken = null;
            //var response = instance.DexGetOrdersHistorical(startBlock, endBlock, startDate, endDate, id, buyToken, sellToken);
            //Assert.IsType<List<DexOrderDTO>>(response);
        }

        /// <summary>
        /// Test DexGetPricesHistorical
        /// </summary>
        [Fact]
        public void DexGetPricesHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.DexGetPricesHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<DexPriceDTO>>(response);
        }

        /// <summary>
        /// Test DexGetSolutionsHistorical
        /// </summary>
        [Fact]
        public void DexGetSolutionsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.DexGetSolutionsHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<DexSolutionDTO>>(response);
        }

        /// <summary>
        /// Test DexGetStatssHistorical
        /// </summary>
        [Fact]
        public void DexGetStatssHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.DexGetStatssHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<DexStatsDTO>>(response);
        }

        /// <summary>
        /// Test DexGetTokensHistorical
        /// </summary>
        [Fact]
        public void DexGetTokensHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string address = null;
            //string symbol = null;
            //string name = null;
            //var response = instance.DexGetTokensHistorical(startBlock, endBlock, startDate, endDate, id, address, symbol, name);
            //Assert.IsType<List<DexTokenDTO>>(response);
        }

        /// <summary>
        /// Test DexGetTradesHistorical
        /// </summary>
        [Fact]
        public void DexGetTradesHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string buyToken = null;
            //string sellToken = null;
            //var response = instance.DexGetTradesHistorical(startBlock, endBlock, startDate, endDate, id, buyToken, sellToken);
            //Assert.IsType<List<DexTradeDTO>>(response);
        }

        /// <summary>
        /// Test DexGetUsersHistorical
        /// </summary>
        [Fact]
        public void DexGetUsersHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.DexGetUsersHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<DexUserDTO>>(response);
        }

        /// <summary>
        /// Test DexGetWithdrawRequestsHistorical
        /// </summary>
        [Fact]
        public void DexGetWithdrawRequestsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string user = null;
            //var response = instance.DexGetWithdrawRequestsHistorical(startBlock, endBlock, startDate, endDate, id, user);
            //Assert.IsType<List<DexWithdrawRequestDTO>>(response);
        }

        /// <summary>
        /// Test DexGetWithdrawsHistorical
        /// </summary>
        [Fact]
        public void DexGetWithdrawsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string user = null;
            //var response = instance.DexGetWithdrawsHistorical(startBlock, endBlock, startDate, endDate, id, user);
            //Assert.IsType<List<DexWithdrawDTO>>(response);
        }

        /// <summary>
        /// Test DexOrdersCurrent
        /// </summary>
        [Fact]
        public void DexOrdersCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.DexOrdersCurrent();
            //Assert.IsType<List<DexOrderDTO>>(response);
        }

        /// <summary>
        /// Test DexPricesCurrent
        /// </summary>
        [Fact]
        public void DexPricesCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.DexPricesCurrent();
            //Assert.IsType<List<DexPriceDTO>>(response);
        }

        /// <summary>
        /// Test DexSolutionsCurrent
        /// </summary>
        [Fact]
        public void DexSolutionsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.DexSolutionsCurrent();
            //Assert.IsType<List<DexSolutionDTO>>(response);
        }

        /// <summary>
        /// Test DexStatssCurrent
        /// </summary>
        [Fact]
        public void DexStatssCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.DexStatssCurrent();
            //Assert.IsType<List<DexStatsDTO>>(response);
        }

        /// <summary>
        /// Test DexTokensCurrent
        /// </summary>
        [Fact]
        public void DexTokensCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.DexTokensCurrent();
            //Assert.IsType<List<DexTokenDTO>>(response);
        }

        /// <summary>
        /// Test DexTradesCurrent
        /// </summary>
        [Fact]
        public void DexTradesCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.DexTradesCurrent();
            //Assert.IsType<List<DexTradeDTO>>(response);
        }

        /// <summary>
        /// Test DexUsersCurrent
        /// </summary>
        [Fact]
        public void DexUsersCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.DexUsersCurrent();
            //Assert.IsType<List<DexUserDTO>>(response);
        }

        /// <summary>
        /// Test DexWithdrawRequestsCurrent
        /// </summary>
        [Fact]
        public void DexWithdrawRequestsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.DexWithdrawRequestsCurrent();
            //Assert.IsType<List<DexWithdrawRequestDTO>>(response);
        }

        /// <summary>
        /// Test DexWithdrawsCurrent
        /// </summary>
        [Fact]
        public void DexWithdrawsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.DexWithdrawsCurrent();
            //Assert.IsType<List<DexWithdrawDTO>>(response);
        }
    }
}
