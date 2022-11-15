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
            //var response = instance.UniswapV2GetBundlesHistorical(startBlock, endBlock, startDate, endDate);
            //Assert.IsInstanceOf(typeof(List<UniswapV2BundleV2DTO>), response, "response is List<UniswapV2BundleV2DTO>");
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
            //string poolId = null;
            //var response = instance.UniswapV2GetBurnsHistorical(startBlock, endBlock, startDate, endDate, poolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV2BurnV2DTO>), response, "response is List<UniswapV2BurnV2DTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetDayDataHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetDayDataHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //var response = instance.UniswapV2GetDayDataHistorical(startBlock, endBlock, startDate, endDate);
            //Assert.IsInstanceOf(typeof(List<UniswapV2UniswapDayDataV2DTO>), response, "response is List<UniswapV2UniswapDayDataV2DTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetFactoryHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetFactoryHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //var response = instance.UniswapV2GetFactoryHistorical(startBlock, endBlock, startDate, endDate);
            //Assert.IsInstanceOf(typeof(List<UniswapV2UniswapFactoryV2DTO>), response, "response is List<UniswapV2UniswapFactoryV2DTO>");
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
            //string poolId = null;
            //var response = instance.UniswapV2GetLiquidityPositionsHistorical(startBlock, endBlock, startDate, endDate, poolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV2LiquidityPositionV2DTO>), response, "response is List<UniswapV2LiquidityPositionV2DTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetLiquidityPositionsSnapshotsHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetLiquidityPositionsSnapshotsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string poolId = null;
            //var response = instance.UniswapV2GetLiquidityPositionsSnapshotsHistorical(startBlock, endBlock, startDate, endDate, poolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV2LiquidityPositionSnapshotV2DTO>), response, "response is List<UniswapV2LiquidityPositionSnapshotV2DTO>");
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
            //string poolId = null;
            //var response = instance.UniswapV2GetMintsHistorical(startBlock, endBlock, startDate, endDate, poolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV2MintV2DTO>), response, "response is List<UniswapV2MintV2DTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetPoolsCurrent
        /// </summary>
        [Test]
        public void UniswapV2GetPoolsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filterPoolId = null;
            //var response = instance.UniswapV2GetPoolsCurrent(filterPoolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV2PairV2DTO>), response, "response is List<UniswapV2PairV2DTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetPoolsDayDataHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetPoolsDayDataHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string poolId = null;
            //var response = instance.UniswapV2GetPoolsDayDataHistorical(startBlock, endBlock, startDate, endDate, poolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV2PairDayDataV2DTO>), response, "response is List<UniswapV2PairDayDataV2DTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetPoolsHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetPoolsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string poolId = null;
            //var response = instance.UniswapV2GetPoolsHistorical(startBlock, endBlock, startDate, endDate, poolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV2PairV2DTO>), response, "response is List<UniswapV2PairV2DTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetPoolsHourDataHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetPoolsHourDataHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string poolId = null;
            //var response = instance.UniswapV2GetPoolsHourDataHistorical(startBlock, endBlock, startDate, endDate, poolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV2PairHourDataV2DTO>), response, "response is List<UniswapV2PairHourDataV2DTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetSwapsCurrent
        /// </summary>
        [Test]
        public void UniswapV2GetSwapsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2GetSwapsCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV2SwapV2DTO>), response, "response is List<UniswapV2SwapV2DTO>");
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
            //string poolId = null;
            //var response = instance.UniswapV2GetSwapsHistorical(startBlock, endBlock, startDate, endDate, poolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV2SwapV2DTO>), response, "response is List<UniswapV2SwapV2DTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetTokensCurrent
        /// </summary>
        [Test]
        public void UniswapV2GetTokensCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2GetTokensCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV2TokenV2DTO>), response, "response is List<UniswapV2TokenV2DTO>");
        }
        
        /// <summary>
        /// Test UniswapV2GetTokensDayDataHistorical
        /// </summary>
        [Test]
        public void UniswapV2GetTokensDayDataHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string tokenId = null;
            //var response = instance.UniswapV2GetTokensDayDataHistorical(startBlock, endBlock, startDate, endDate, tokenId);
            //Assert.IsInstanceOf(typeof(List<UniswapV2TokenDayDataV2DTO>), response, "response is List<UniswapV2TokenDayDataV2DTO>");
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
            //string tokenId = null;
            //var response = instance.UniswapV2GetTokensHistorical(startBlock, endBlock, startDate, endDate, tokenId);
            //Assert.IsInstanceOf(typeof(List<UniswapV2TokenV2DTO>), response, "response is List<UniswapV2TokenV2DTO>");
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
            //var response = instance.UniswapV2GetTransactionsHistorical(startBlock, endBlock, startDate, endDate);
            //Assert.IsInstanceOf(typeof(List<UniswapV2TransactionV2DTO>), response, "response is List<UniswapV2TransactionV2DTO>");
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
            //var response = instance.UniswapV2GetUsersHistorical(startBlock, endBlock, startDate, endDate);
            //Assert.IsInstanceOf(typeof(List<UniswapV2UserV2DTO>), response, "response is List<UniswapV2UserV2DTO>");
        }
        
    }

}
