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
        /// Test UniswapV3BundlesCurrent
        /// </summary>
        [Test]
        public void UniswapV3BundlesCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV3BundlesCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV3BundleDTO>), response, "response is List<UniswapV3BundleDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3BurnsCurrent
        /// </summary>
        [Test]
        public void UniswapV3BurnsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV3BurnsCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV3BurnDTO>), response, "response is List<UniswapV3BurnDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3FactorysCurrent
        /// </summary>
        [Test]
        public void UniswapV3FactorysCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV3FactorysCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV3FactoryDTO>), response, "response is List<UniswapV3FactoryDTO>");
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
            //string id = null;
            //var response = instance.UniswapV3GetBundlesHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsInstanceOf(typeof(List<UniswapV3BundleDTO>), response, "response is List<UniswapV3BundleDTO>");
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
            //string id = null;
            //string pool = null;
            //string token0 = null;
            //string token1 = null;
            //var response = instance.UniswapV3GetBurnsHistorical(startBlock, endBlock, startDate, endDate, id, pool, token0, token1);
            //Assert.IsInstanceOf(typeof(List<UniswapV3BurnDTO>), response, "response is List<UniswapV3BurnDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetFactorysHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetFactorysHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV3GetFactorysHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsInstanceOf(typeof(List<UniswapV3FactoryDTO>), response, "response is List<UniswapV3FactoryDTO>");
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
            //string id = null;
            //string pool = null;
            //string token0 = null;
            //string token1 = null;
            //var response = instance.UniswapV3GetMintsHistorical(startBlock, endBlock, startDate, endDate, id, pool, token0, token1);
            //Assert.IsInstanceOf(typeof(List<UniswapV3MintDTO>), response, "response is List<UniswapV3MintDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetPoolDayDatasHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetPoolDayDatasHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.UniswapV3GetPoolDayDatasHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PoolDayDataDTO>), response, "response is List<UniswapV3PoolDayDataDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetPoolHourDatasHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetPoolHourDatasHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.UniswapV3GetPoolHourDatasHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PoolHourDataDTO>), response, "response is List<UniswapV3PoolHourDataDTO>");
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
            //string id = null;
            //string token0 = null;
            //string token1 = null;
            //var response = instance.UniswapV3GetPoolsHistorical(startBlock, endBlock, startDate, endDate, id, token0, token1);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PoolDTO>), response, "response is List<UniswapV3PoolDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetPositionSnapshotsHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetPositionSnapshotsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.UniswapV3GetPositionSnapshotsHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PositionSnapshotDTO>), response, "response is List<UniswapV3PositionSnapshotDTO>");
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
            //string id = null;
            //string pool = null;
            //string token0 = null;
            //string token1 = null;
            //var response = instance.UniswapV3GetPositionsHistorical(startBlock, endBlock, startDate, endDate, id, pool, token0, token1);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PositionDTO>), response, "response is List<UniswapV3PositionDTO>");
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
            //string id = null;
            //string pool = null;
            //string token0 = null;
            //string token1 = null;
            //var response = instance.UniswapV3GetSwapsHistorical(startBlock, endBlock, startDate, endDate, id, pool, token0, token1);
            //Assert.IsInstanceOf(typeof(List<UniswapV3SwapDTO>), response, "response is List<UniswapV3SwapDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetTickDayDatasHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetTickDayDatasHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.UniswapV3GetTickDayDatasHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TickDayDataDTO>), response, "response is List<UniswapV3TickDayDataDTO>");
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
            //string id = null;
            //string pool = null;
            //var response = instance.UniswapV3GetTicksHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TickDTO>), response, "response is List<UniswapV3TickDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetTokenHourDatasHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetTokenHourDatasHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV3GetTokenHourDatasHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TokenHourDataDTO>), response, "response is List<UniswapV3TokenHourDataDTO>");
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
            //string id = null;
            //string symbol = null;
            //string name = null;
            //var response = instance.UniswapV3GetTokensHistorical(startBlock, endBlock, startDate, endDate, id, symbol, name);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TokenDTO>), response, "response is List<UniswapV3TokenDTO>");
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
            //string id = null;
            //var response = instance.UniswapV3GetTransactionsHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsInstanceOf(typeof(List<UniswapV3TransactionDTO>), response, "response is List<UniswapV3TransactionDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3GetUniswapDayDatasHistorical
        /// </summary>
        [Test]
        public void UniswapV3GetUniswapDayDatasHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV3GetUniswapDayDatasHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsInstanceOf(typeof(List<UniswapV3UniswapDayDataDTO>), response, "response is List<UniswapV3UniswapDayDataDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3MintsCurrent
        /// </summary>
        [Test]
        public void UniswapV3MintsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV3MintsCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV3MintDTO>), response, "response is List<UniswapV3MintDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3PoolDayDatasCurrent
        /// </summary>
        [Test]
        public void UniswapV3PoolDayDatasCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV3PoolDayDatasCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV3PoolDayDataDTO>), response, "response is List<UniswapV3PoolDayDataDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3PoolHourDatasCurrent
        /// </summary>
        [Test]
        public void UniswapV3PoolHourDatasCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV3PoolHourDatasCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV3PoolHourDataDTO>), response, "response is List<UniswapV3PoolHourDataDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3PoolsCurrent
        /// </summary>
        [Test]
        public void UniswapV3PoolsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //var response = instance.UniswapV3PoolsCurrent(id);
            //Assert.IsInstanceOf(typeof(List<UniswapV3PoolDTO>), response, "response is List<UniswapV3PoolDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3PositionSnapshotsCurrent
        /// </summary>
        [Test]
        public void UniswapV3PositionSnapshotsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV3PositionSnapshotsCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV3PositionSnapshotDTO>), response, "response is List<UniswapV3PositionSnapshotDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3PositionsCurrent
        /// </summary>
        [Test]
        public void UniswapV3PositionsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV3PositionsCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV3PositionDTO>), response, "response is List<UniswapV3PositionDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3SwapsCurrent
        /// </summary>
        [Test]
        public void UniswapV3SwapsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string pool = null;
            //var response = instance.UniswapV3SwapsCurrent(pool);
            //Assert.IsInstanceOf(typeof(List<UniswapV3SwapDTO>), response, "response is List<UniswapV3SwapDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3TickDayDatasCurrent
        /// </summary>
        [Test]
        public void UniswapV3TickDayDatasCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV3TickDayDatasCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV3TickDayDataDTO>), response, "response is List<UniswapV3TickDayDataDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3TicksCurrent
        /// </summary>
        [Test]
        public void UniswapV3TicksCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV3TicksCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV3TickDTO>), response, "response is List<UniswapV3TickDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3TokenHourDatasCurrent
        /// </summary>
        [Test]
        public void UniswapV3TokenHourDatasCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV3TokenHourDatasCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV3TokenHourDataDTO>), response, "response is List<UniswapV3TokenHourDataDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3TokenV3DayDatasCurrent
        /// </summary>
        [Test]
        public void UniswapV3TokenV3DayDatasCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV3TokenV3DayDatasCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV3TokenV3DayDataDTO>), response, "response is List<UniswapV3TokenV3DayDataDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3TokensCurrent
        /// </summary>
        [Test]
        public void UniswapV3TokensCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV3TokensCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV3TokenDTO>), response, "response is List<UniswapV3TokenDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3TransactionsCurrent
        /// </summary>
        [Test]
        public void UniswapV3TransactionsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV3TransactionsCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV3TransactionDTO>), response, "response is List<UniswapV3TransactionDTO>");
        }
        
        /// <summary>
        /// Test UniswapV3UniswapDayDatasCurrent
        /// </summary>
        [Test]
        public void UniswapV3UniswapDayDatasCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV3UniswapDayDatasCurrent();
            //Assert.IsInstanceOf(typeof(List<UniswapV3UniswapDayDataDTO>), response, "response is List<UniswapV3UniswapDayDataDTO>");
        }
        
    }

}
