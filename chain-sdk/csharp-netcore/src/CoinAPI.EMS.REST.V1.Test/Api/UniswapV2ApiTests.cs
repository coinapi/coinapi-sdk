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
    ///  Class for testing UniswapV2Api
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class UniswapV2ApiTests : IDisposable
    {
        private UniswapV2Api instance;

        public UniswapV2ApiTests()
        {
            instance = new UniswapV2Api();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of UniswapV2Api
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' UniswapV2Api
            //Assert.IsType<UniswapV2Api>(instance);
        }

        /// <summary>
        /// Test UniswapV2BundlesCurrent
        /// </summary>
        [Fact]
        public void UniswapV2BundlesCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2BundlesCurrent();
            //Assert.IsType<List<UniswapV2BundleDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2BurnsCurrent
        /// </summary>
        [Fact]
        public void UniswapV2BurnsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2BurnsCurrent();
            //Assert.IsType<List<UniswapV2BurnDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetBundlesHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetBundlesHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV2GetBundlesHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<UniswapV2BundleDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetBurnsHistorical
        /// </summary>
        [Fact]
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
            //Assert.IsType<List<UniswapV2BurnDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetLiquidityPositionSnapshotsHistorical
        /// </summary>
        [Fact]
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
            //Assert.IsType<List<UniswapV2LiquidityPositionSnapshotDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetLiquidityPositionsHistorical
        /// </summary>
        [Fact]
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
            //Assert.IsType<List<UniswapV2LiquidityPositionDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetMintsHistorical
        /// </summary>
        [Fact]
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
            //Assert.IsType<List<UniswapV2MintDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetPairDayDatasHistorical
        /// </summary>
        [Fact]
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
            //Assert.IsType<List<UniswapV2PairDayDataDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetPairHourDatasHistorical
        /// </summary>
        [Fact]
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
            //Assert.IsType<List<UniswapV2PairHourDataDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetPairsHistorical
        /// </summary>
        [Fact]
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
            //Assert.IsType<List<UniswapV2PairDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetPoolsCurrent
        /// </summary>
        [Fact]
        public void UniswapV2GetPoolsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filterPoolId = null;
            //var response = instance.UniswapV2GetPoolsCurrent(filterPoolId);
            //Assert.IsType<List<UniswapV2PairDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetSwapsCurrent
        /// </summary>
        [Fact]
        public void UniswapV2GetSwapsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2GetSwapsCurrent();
            //Assert.IsType<List<UniswapV2SwapDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetSwapsHistorical
        /// </summary>
        [Fact]
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
            //Assert.IsType<List<UniswapV2SwapDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetTokenDayDatasHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetTokenDayDatasHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV2GetTokenDayDatasHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<UniswapV2TokenDayDataDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetTokensCurrent
        /// </summary>
        [Fact]
        public void UniswapV2GetTokensCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2GetTokensCurrent();
            //Assert.IsType<List<UniswapV2TokenDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetTokensHistorical
        /// </summary>
        [Fact]
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
            //Assert.IsType<List<UniswapV2TokenDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetTransactionsHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetTransactionsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV2GetTransactionsHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<UniswapV2TransactionDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetUniswapDayDatasHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetUniswapDayDatasHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV2GetUniswapDayDatasHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<UniswapV2UniswapDayDataDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetUniswapFactorysHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetUniswapFactorysHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV2GetUniswapFactorysHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<UniswapV2UniswapFactoryDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetUsersHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetUsersHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV2GetUsersHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<UniswapV2UserDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2LiquidityPositionSnapshotsCurrent
        /// </summary>
        [Fact]
        public void UniswapV2LiquidityPositionSnapshotsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2LiquidityPositionSnapshotsCurrent();
            //Assert.IsType<List<UniswapV2LiquidityPositionSnapshotDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2LiquidityPositionsCurrent
        /// </summary>
        [Fact]
        public void UniswapV2LiquidityPositionsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2LiquidityPositionsCurrent();
            //Assert.IsType<List<UniswapV2LiquidityPositionDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2MintsCurrent
        /// </summary>
        [Fact]
        public void UniswapV2MintsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2MintsCurrent();
            //Assert.IsType<List<UniswapV2MintDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2PairDayDatasCurrent
        /// </summary>
        [Fact]
        public void UniswapV2PairDayDatasCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2PairDayDatasCurrent();
            //Assert.IsType<List<UniswapV2PairDayDataDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2PairHourDatasCurrent
        /// </summary>
        [Fact]
        public void UniswapV2PairHourDatasCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2PairHourDatasCurrent();
            //Assert.IsType<List<UniswapV2PairHourDataDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2PairsCurrent
        /// </summary>
        [Fact]
        public void UniswapV2PairsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //var response = instance.UniswapV2PairsCurrent(id);
            //Assert.IsType<List<UniswapV2PairDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2TokenDayDatasCurrent
        /// </summary>
        [Fact]
        public void UniswapV2TokenDayDatasCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2TokenDayDatasCurrent();
            //Assert.IsType<List<UniswapV2TokenDayDataDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2TransactionsCurrent
        /// </summary>
        [Fact]
        public void UniswapV2TransactionsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2TransactionsCurrent();
            //Assert.IsType<List<UniswapV2TransactionDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2UniswapDayDatasCurrent
        /// </summary>
        [Fact]
        public void UniswapV2UniswapDayDatasCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2UniswapDayDatasCurrent();
            //Assert.IsType<List<UniswapV2UniswapDayDataDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2UniswapFactorysCurrent
        /// </summary>
        [Fact]
        public void UniswapV2UniswapFactorysCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2UniswapFactorysCurrent();
            //Assert.IsType<List<UniswapV2UniswapFactoryDTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2UsersCurrent
        /// </summary>
        [Fact]
        public void UniswapV2UsersCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2UsersCurrent();
            //Assert.IsType<List<UniswapV2UserDTO>>(response);
        }
    }
}
