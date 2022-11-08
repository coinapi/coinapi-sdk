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
    ///  Class for testing UniswapV3Api
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class UniswapV3ApiTests
    {
        private UniswapV3Api instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new UniswapV3Api();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of UniswapV3Api
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOf' UniswapV3Api
            //Assert.IsInstanceOf(typeof(UniswapV3Api), instance);
        }

        
        /// <summary>
        /// Test UniswapV3GetBundlesCurrent
        /// </summary>
        [Test]
        public void UniswapV3GetBundlesCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV3GetBundlesCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV3BundleV3DTO>), response, "response is List<UniswapV3BundleV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetBundlesHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetBundlesHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //var response = instance.UniswapV3GetBundlesHistorical(startBlock, endBlock, startDate, endDate);
            //Assert.IsInstanceOf(typeof(List<UniswapV3BundleV3DTO>), response, "response is List<UniswapV3BundleV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetBurnsCurrent
        /// </summary>
        [Test]
        public void UniswapV3GetBurnsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filterPoolId = null;
            //var response = instance.UniswapV3GetBurnsCurrent(filterPoolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3BurnV3DTO>), response, "response is List<UniswapV3BurnV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetBurnsHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetBurnsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string poolId = null;
            //var response = instance.UniswapV3GetBurnsHistorical(startBlock, endBlock, startDate, endDate, poolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3BurnV3DTO>), response, "response is List<UniswapV3BurnV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetDayDataCurrent
        /// </summary>
        [Test]
        public void UniswapV3GetDayDataCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV3GetDayDataCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV3UniswapDayDataV3DTO>), response, "response is List<UniswapV3UniswapDayDataV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetDayDataHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetDayDataHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //var response = instance.UniswapV3GetDayDataHistorical(startBlock, endBlock, startDate, endDate);
            //Assert.IsInstanceOf(typeof(List<UniswapV3UniswapDayDataV3DTO>), response, "response is List<UniswapV3UniswapDayDataV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetFactoryCurrent
        /// </summary>
        [Test]
        public void UniswapV3GetFactoryCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV3GetFactoryCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV3FactoryV3DTO>), response, "response is List<UniswapV3FactoryV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetFactoryHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetFactoryHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //var response = instance.UniswapV3GetFactoryHistorical(startBlock, endBlock, startDate, endDate);
            //Assert.IsInstanceOf(typeof(List<UniswapV3FactoryV3DTO>), response, "response is List<UniswapV3FactoryV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetMintsCurrent
        /// </summary>
        [Test]
        public void UniswapV3GetMintsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filterPoolId = null;
            //var response = instance.UniswapV3GetMintsCurrent(filterPoolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3MintV3DTO>), response, "response is List<UniswapV3MintV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetMintsHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetMintsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string poolId = null;
            //var response = instance.UniswapV3GetMintsHistorical(startBlock, endBlock, startDate, endDate, poolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3MintV3DTO>), response, "response is List<UniswapV3MintV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetPoolsCurrent
        /// </summary>
        [Test]
        public void UniswapV3GetPoolsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filterPoolId = null;
            //var response = instance.UniswapV3GetPoolsCurrent(filterPoolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PoolV3DTO>), response, "response is List<UniswapV3PoolV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetPoolsDayDataCurrent
        /// </summary>
        [Test]
        public void UniswapV3GetPoolsDayDataCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filterPoolId = null;
            //var response = instance.UniswapV3GetPoolsDayDataCurrent(filterPoolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PoolDayDataV3DTO>), response, "response is List<UniswapV3PoolDayDataV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetPoolsDayDataHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetPoolsDayDataHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string poolId = null;
            //var response = instance.UniswapV3GetPoolsDayDataHistorical(startBlock, endBlock, startDate, endDate, poolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PoolDayDataV3DTO>), response, "response is List<UniswapV3PoolDayDataV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetPoolsHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetPoolsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string poolId = null;
            //var response = instance.UniswapV3GetPoolsHistorical(startBlock, endBlock, startDate, endDate, poolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PoolV3DTO>), response, "response is List<UniswapV3PoolV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetPoolsHourDataCurrent
        /// </summary>
        [Test]
        public void UniswapV3GetPoolsHourDataCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filterPoolId = null;
            //var response = instance.UniswapV3GetPoolsHourDataCurrent(filterPoolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PoolHourDataV3DTO>), response, "response is List<UniswapV3PoolHourDataV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetPoolsHourDataHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetPoolsHourDataHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string poolId = null;
            //var response = instance.UniswapV3GetPoolsHourDataHistorical(startBlock, endBlock, startDate, endDate, poolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PoolHourDataV3DTO>), response, "response is List<UniswapV3PoolHourDataV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetPositionsCurrent
        /// </summary>
        [Test]
        public void UniswapV3GetPositionsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filterPoolId = null;
            //var response = instance.UniswapV3GetPositionsCurrent(filterPoolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PositionV3DTO>), response, "response is List<UniswapV3PositionV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetPositionsHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetPositionsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string poolId = null;
            //var response = instance.UniswapV3GetPositionsHistorical(startBlock, endBlock, startDate, endDate, poolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PositionV3DTO>), response, "response is List<UniswapV3PositionV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetPositionsSnaphotsHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetPositionsSnaphotsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string poolId = null;
            //var response = instance.UniswapV3GetPositionsSnaphotsHistorical(startBlock, endBlock, startDate, endDate, poolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PositionSnapshotV3DTO>), response, "response is List<UniswapV3PositionSnapshotV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetPositionsSnapshotsCurrent
        /// </summary>
        [Test]
        public void UniswapV3GetPositionsSnapshotsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filterPoolId = null;
            //var response = instance.UniswapV3GetPositionsSnapshotsCurrent(filterPoolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PositionSnapshotV3DTO>), response, "response is List<UniswapV3PositionSnapshotV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetSwapsCurrent
        /// </summary>
        [Test]
        public void UniswapV3GetSwapsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filterPoolId = null;
            //var response = instance.UniswapV3GetSwapsCurrent(filterPoolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3SwapV3DTO>), response, "response is List<UniswapV3SwapV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetSwapsHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetSwapsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string poolId = null;
            //var response = instance.UniswapV3GetSwapsHistorical(startBlock, endBlock, startDate, endDate, poolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3SwapV3DTO>), response, "response is List<UniswapV3SwapV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetTicksCurrent
        /// </summary>
        [Test]
        public void UniswapV3GetTicksCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filterPoolId = null;
            //var response = instance.UniswapV3GetTicksCurrent(filterPoolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TickV3DTO>), response, "response is List<UniswapV3TickV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetTicksDayDataCurrent
        /// </summary>
        [Test]
        public void UniswapV3GetTicksDayDataCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filterPoolId = null;
            //var response = instance.UniswapV3GetTicksDayDataCurrent(filterPoolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TickDayDataV3DTO>), response, "response is List<UniswapV3TickDayDataV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetTicksDayDataHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetTicksDayDataHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string poolId = null;
            //var response = instance.UniswapV3GetTicksDayDataHistorical(startBlock, endBlock, startDate, endDate, poolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TickDayDataV3DTO>), response, "response is List<UniswapV3TickDayDataV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetTicksHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetTicksHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string poolId = null;
            //var response = instance.UniswapV3GetTicksHistorical(startBlock, endBlock, startDate, endDate, poolId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TickV3DTO>), response, "response is List<UniswapV3TickV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetTokensCurrent
        /// </summary>
        [Test]
        public void UniswapV3GetTokensCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filterTokenId = null;
            //var response = instance.UniswapV3GetTokensCurrent(filterTokenId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TokenV3DTO>), response, "response is List<UniswapV3TokenV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetTokensDayDataCurrent
        /// </summary>
        [Test]
        public void UniswapV3GetTokensDayDataCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filterTokenId = null;
            //var response = instance.UniswapV3GetTokensDayDataCurrent(filterTokenId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TokenV3DayDataDTO>), response, "response is List<UniswapV3TokenV3DayDataDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetTokensDayDataHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetTokensDayDataHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string tokenId = null;
            //var response = instance.UniswapV3GetTokensDayDataHistorical(startBlock, endBlock, startDate, endDate, tokenId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TokenV3DayDataDTO>), response, "response is List<UniswapV3TokenV3DayDataDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetTokensHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetTokensHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string tokenId = null;
            //var response = instance.UniswapV3GetTokensHistorical(startBlock, endBlock, startDate, endDate, tokenId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TokenV3DTO>), response, "response is List<UniswapV3TokenV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetTokensHourDataCurrent
        /// </summary>
        [Test]
        public void UniswapV3GetTokensHourDataCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filterTokenId = null;
            //var response = instance.UniswapV3GetTokensHourDataCurrent(filterTokenId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TokenHourDataV3DTO>), response, "response is List<UniswapV3TokenHourDataV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetTokensHourDataHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetTokensHourDataHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string tokenId = null;
            //var response = instance.UniswapV3GetTokensHourDataHistorical(startBlock, endBlock, startDate, endDate, tokenId);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TokenHourDataV3DTO>), response, "response is List<UniswapV3TokenHourDataV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetTransactionsHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetTransactionsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //var response = instance.UniswapV3GetTransactionsHistorical(startBlock, endBlock, startDate, endDate);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TransactionV3DTO>), response, "response is List<UniswapV3TransactionV3DTO>");
        }
        
    }

}
