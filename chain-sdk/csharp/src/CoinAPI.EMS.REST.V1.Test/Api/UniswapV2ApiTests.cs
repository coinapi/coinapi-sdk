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
using NUnit.Framework;

using CoinAPI.EMS.REST.V1.Client;
using CoinAPI.EMS.REST.V1.Api;
using CoinAPI.EMS.REST.V1.Model;

namespace CoinAPI.EMS.REST.V1.Test
{
    /// <summary>
    ///  Class for testing UniswapV2Api
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class UniswapV2ApiTests
    {
        private UniswapV2Api instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new UniswapV2Api();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of UniswapV2Api
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOf' UniswapV2Api
            //Assert.IsInstanceOf(typeof(UniswapV2Api), instance);
        }

        
        /// <summary>
        /// Test UniswapV2BundlesCurrent
        /// </summary>
        [Test]
        public void UniswapV2BundlesCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2BundlesCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV2BundleDTO>), response, "response is List<UniswapV2BundleDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2BurnsCurrent
        /// </summary>
        [Test]
        public void UniswapV2BurnsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2BurnsCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV2BurnDTO>), response, "response is List<UniswapV2BurnDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetBundlesHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetBundlesHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV2GetBundlesHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsInstanceOf(typeof(List<UniswapV2BundleDTO>), response, "response is List<UniswapV2BundleDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetBurnsHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetBurnsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pair = null;
            //var response = instance.UniswapV2GetBurnsHistorical(startBlock, endBlock, startDate, endDate, id, pair);
            //Assert.IsInstanceOf(typeof(List<UniswapV2BurnDTO>), response, "response is List<UniswapV2BurnDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetLiquidityPositionSnapshotsHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetLiquidityPositionSnapshotsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string user = null;
            //string pair = null;
            //var response = instance.UniswapV2GetLiquidityPositionSnapshotsHistorical(startBlock, endBlock, startDate, endDate, id, user, pair);
            //Assert.IsInstanceOf(typeof(List<UniswapV2LiquidityPositionSnapshotDTO>), response, "response is List<UniswapV2LiquidityPositionSnapshotDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetLiquidityPositionsHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetLiquidityPositionsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string user = null;
            //string pair = null;
            //var response = instance.UniswapV2GetLiquidityPositionsHistorical(startBlock, endBlock, startDate, endDate, id, user, pair);
            //Assert.IsInstanceOf(typeof(List<UniswapV2LiquidityPositionDTO>), response, "response is List<UniswapV2LiquidityPositionDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetMintsHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetMintsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pair = null;
            //var response = instance.UniswapV2GetMintsHistorical(startBlock, endBlock, startDate, endDate, id, pair);
            //Assert.IsInstanceOf(typeof(List<UniswapV2MintDTO>), response, "response is List<UniswapV2MintDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetPairDayDatasHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetPairDayDatasHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string token0 = null;
            //string token1 = null;
            //var response = instance.UniswapV2GetPairDayDatasHistorical(startBlock, endBlock, startDate, endDate, id, token0, token1);
            //Assert.IsInstanceOf(typeof(List<UniswapV2PairDayDataDTO>), response, "response is List<UniswapV2PairDayDataDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetPairHourDatasHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetPairHourDatasHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pair = null;
            //var response = instance.UniswapV2GetPairHourDatasHistorical(startBlock, endBlock, startDate, endDate, id, pair);
            //Assert.IsInstanceOf(typeof(List<UniswapV2PairHourDataDTO>), response, "response is List<UniswapV2PairHourDataDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetPairsHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetPairsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string token0 = null;
            //string token1 = null;
            //var response = instance.UniswapV2GetPairsHistorical(startBlock, endBlock, startDate, endDate, id, token0, token1);
            //Assert.IsInstanceOf(typeof(List<UniswapV2PairDTO>), response, "response is List<UniswapV2PairDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetSwapsHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetSwapsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pair = null;
            //var response = instance.UniswapV2GetSwapsHistorical(startBlock, endBlock, startDate, endDate, id, pair);
            //Assert.IsInstanceOf(typeof(List<UniswapV2SwapDTO>), response, "response is List<UniswapV2SwapDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetTokenDayDatasHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetTokenDayDatasHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV2GetTokenDayDatasHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsInstanceOf(typeof(List<UniswapV2TokenDayDataDTO>), response, "response is List<UniswapV2TokenDayDataDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetTokensHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetTokensHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string symbol = null;
            //string name = null;
            //var response = instance.UniswapV2GetTokensHistorical(startBlock, endBlock, startDate, endDate, id, symbol, name);
            //Assert.IsInstanceOf(typeof(List<UniswapV2TokenDTO>), response, "response is List<UniswapV2TokenDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetTransactionsHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetTransactionsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV2GetTransactionsHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsInstanceOf(typeof(List<UniswapV2TransactionDTO>), response, "response is List<UniswapV2TransactionDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetUniswapDayDatasHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetUniswapDayDatasHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV2GetUniswapDayDatasHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsInstanceOf(typeof(List<UniswapV2UniswapDayDataDTO>), response, "response is List<UniswapV2UniswapDayDataDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetUniswapFactorysHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetUniswapFactorysHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV2GetUniswapFactorysHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsInstanceOf(typeof(List<UniswapV2UniswapFactoryDTO>), response, "response is List<UniswapV2UniswapFactoryDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetUsersHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetUsersHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV2GetUsersHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsInstanceOf(typeof(List<UniswapV2UserDTO>), response, "response is List<UniswapV2UserDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2LiquidityPositionSnapshotsCurrent
        /// </summary>
        [Test]
        public void UniswapV2LiquidityPositionSnapshotsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2LiquidityPositionSnapshotsCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV2LiquidityPositionSnapshotDTO>), response, "response is List<UniswapV2LiquidityPositionSnapshotDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2LiquidityPositionsCurrent
        /// </summary>
        [Test]
        public void UniswapV2LiquidityPositionsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2LiquidityPositionsCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV2LiquidityPositionDTO>), response, "response is List<UniswapV2LiquidityPositionDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2MintsCurrent
        /// </summary>
        [Test]
        public void UniswapV2MintsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2MintsCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV2MintDTO>), response, "response is List<UniswapV2MintDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2PairDayDatasCurrent
        /// </summary>
        [Test]
        public void UniswapV2PairDayDatasCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2PairDayDatasCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV2PairDayDataDTO>), response, "response is List<UniswapV2PairDayDataDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2PairHourDatasCurrent
        /// </summary>
        [Test]
        public void UniswapV2PairHourDatasCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2PairHourDatasCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV2PairHourDataDTO>), response, "response is List<UniswapV2PairHourDataDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2PairsCurrent
        /// </summary>
        [Test]
        public void UniswapV2PairsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //var response = instance.UniswapV2PairsCurrent(id);
            //Assert.IsInstanceOf(typeof(List<UniswapV2PairDTO>), response, "response is List<UniswapV2PairDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2SwapsCurrent
        /// </summary>
        [Test]
        public void UniswapV2SwapsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string pair = null;
            //var response = instance.UniswapV2SwapsCurrent(pair);
            //Assert.IsInstanceOf(typeof(List<UniswapV2SwapDTO>), response, "response is List<UniswapV2SwapDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2TokenDayDatasCurrent
        /// </summary>
        [Test]
        public void UniswapV2TokenDayDatasCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2TokenDayDatasCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV2TokenDayDataDTO>), response, "response is List<UniswapV2TokenDayDataDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2TokensCurrent
        /// </summary>
        [Test]
        public void UniswapV2TokensCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2TokensCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV2TokenDTO>), response, "response is List<UniswapV2TokenDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2TransactionsCurrent
        /// </summary>
        [Test]
        public void UniswapV2TransactionsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2TransactionsCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV2TransactionDTO>), response, "response is List<UniswapV2TransactionDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2UniswapDayDatasCurrent
        /// </summary>
        [Test]
        public void UniswapV2UniswapDayDatasCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2UniswapDayDatasCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV2UniswapDayDataDTO>), response, "response is List<UniswapV2UniswapDayDataDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2UniswapFactorysCurrent
        /// </summary>
        [Test]
        public void UniswapV2UniswapFactorysCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2UniswapFactorysCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV2UniswapFactoryDTO>), response, "response is List<UniswapV2UniswapFactoryDTO>");
        }
        
        /// <summary>
        /// Test UniswapV2UsersCurrent
        /// </summary>
        [Test]
        public void UniswapV2UsersCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2UsersCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV2UserDTO>), response, "response is List<UniswapV2UserDTO>");
        }
        
    }

}
