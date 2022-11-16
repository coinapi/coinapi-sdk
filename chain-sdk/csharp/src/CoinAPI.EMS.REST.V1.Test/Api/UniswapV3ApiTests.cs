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
        /// Test UniswapV3GetBundleV3sHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetBundleV3sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV3GetBundleV3sHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsInstanceOf(typeof(List<UniswapV3BundleV3DTO>), response, "response is List<UniswapV3BundleV3DTO>");
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
        /// Test UniswapV3GetBurnV3sHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetBurnV3sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //string token0 = null;
            //string token1 = null;
            //var response = instance.UniswapV3GetBurnV3sHistorical(startBlock, endBlock, startDate, endDate, id, pool, token0, token1);
            //Assert.IsInstanceOf(typeof(List<UniswapV3BurnV3DTO>), response, "response is List<UniswapV3BurnV3DTO>");
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
        /// Test UniswapV3GetFactoryV3sHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetFactoryV3sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV3GetFactoryV3sHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsInstanceOf(typeof(List<UniswapV3FactoryV3DTO>), response, "response is List<UniswapV3FactoryV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetMintV3sHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetMintV3sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //string token0 = null;
            //string token1 = null;
            //var response = instance.UniswapV3GetMintV3sHistorical(startBlock, endBlock, startDate, endDate, id, pool, token0, token1);
            //Assert.IsInstanceOf(typeof(List<UniswapV3MintV3DTO>), response, "response is List<UniswapV3MintV3DTO>");
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
        /// Test UniswapV3GetPoolDayDataV3sHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetPoolDayDataV3sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.UniswapV3GetPoolDayDataV3sHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PoolDayDataV3DTO>), response, "response is List<UniswapV3PoolDayDataV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetPoolHourDataV3sHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetPoolHourDataV3sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.UniswapV3GetPoolHourDataV3sHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PoolHourDataV3DTO>), response, "response is List<UniswapV3PoolHourDataV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetPoolV3sHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetPoolV3sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string token0 = null;
            //string token1 = null;
            //var response = instance.UniswapV3GetPoolV3sHistorical(startBlock, endBlock, startDate, endDate, id, token0, token1);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PoolV3DTO>), response, "response is List<UniswapV3PoolV3DTO>");
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
        /// Test UniswapV3GetPositionSnapshotV3sHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetPositionSnapshotV3sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.UniswapV3GetPositionSnapshotV3sHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PositionSnapshotV3DTO>), response, "response is List<UniswapV3PositionSnapshotV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetPositionV3sHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetPositionV3sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //string token0 = null;
            //string token1 = null;
            //var response = instance.UniswapV3GetPositionV3sHistorical(startBlock, endBlock, startDate, endDate, id, pool, token0, token1);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PositionV3DTO>), response, "response is List<UniswapV3PositionV3DTO>");
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
        /// Test UniswapV3GetSwapV3sHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetSwapV3sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //string token0 = null;
            //string token1 = null;
            //var response = instance.UniswapV3GetSwapV3sHistorical(startBlock, endBlock, startDate, endDate, id, pool, token0, token1);
            //Assert.IsInstanceOf(typeof(List<UniswapV3SwapV3DTO>), response, "response is List<UniswapV3SwapV3DTO>");
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
        /// Test UniswapV3GetTickDayDataV3sHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetTickDayDataV3sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.UniswapV3GetTickDayDataV3sHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TickDayDataV3DTO>), response, "response is List<UniswapV3TickDayDataV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetTickV3sHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetTickV3sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.UniswapV3GetTickV3sHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TickV3DTO>), response, "response is List<UniswapV3TickV3DTO>");
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
        /// Test UniswapV3GetTokenHourDataV3sHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetTokenHourDataV3sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV3GetTokenHourDataV3sHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TokenHourDataV3DTO>), response, "response is List<UniswapV3TokenHourDataV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetTokenV3DayDatasHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetTokenV3DayDatasHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV3GetTokenV3DayDatasHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TokenV3DayDataDTO>), response, "response is List<UniswapV3TokenV3DayDataDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetTokenV3sHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetTokenV3sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string symbol = null;
            //string name = null;
            //var response = instance.UniswapV3GetTokenV3sHistorical(startBlock, endBlock, startDate, endDate, id, symbol, name);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TokenV3DTO>), response, "response is List<UniswapV3TokenV3DTO>");
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
        /// Test UniswapV3GetTransactionV3sHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetTransactionV3sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV3GetTransactionV3sHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TransactionV3DTO>), response, "response is List<UniswapV3TransactionV3DTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetUniswapDayDataV3sHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetUniswapDayDataV3sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV3GetUniswapDayDataV3sHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsInstanceOf(typeof(List<UniswapV3UniswapDayDataV3DTO>), response, "response is List<UniswapV3UniswapDayDataV3DTO>");
        }
        
    }

}
