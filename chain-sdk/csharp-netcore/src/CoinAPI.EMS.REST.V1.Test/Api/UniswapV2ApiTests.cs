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
        /// Test UniswapV2GetBundleV2sHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetBundleV2sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV2GetBundleV2sHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<UniswapV2BundleV2DTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetBurnV2sHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetBurnV2sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pair = null;
            //var response = instance.UniswapV2GetBurnV2sHistorical(startBlock, endBlock, startDate, endDate, id, pair);
            //Assert.IsType<List<UniswapV2BurnV2DTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetLiquidityPositionSnapshotV2sHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetLiquidityPositionSnapshotV2sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string user = null;
            //string pair = null;
            //var response = instance.UniswapV2GetLiquidityPositionSnapshotV2sHistorical(startBlock, endBlock, startDate, endDate, id, user, pair);
            //Assert.IsType<List<UniswapV2LiquidityPositionSnapshotV2DTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetLiquidityPositionV2sHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetLiquidityPositionV2sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string user = null;
            //string pair = null;
            //var response = instance.UniswapV2GetLiquidityPositionV2sHistorical(startBlock, endBlock, startDate, endDate, id, user, pair);
            //Assert.IsType<List<UniswapV2LiquidityPositionV2DTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetMintV2sHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetMintV2sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pair = null;
            //var response = instance.UniswapV2GetMintV2sHistorical(startBlock, endBlock, startDate, endDate, id, pair);
            //Assert.IsType<List<UniswapV2MintV2DTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetPairDayDataV2sHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetPairDayDataV2sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string token0 = null;
            //string token1 = null;
            //var response = instance.UniswapV2GetPairDayDataV2sHistorical(startBlock, endBlock, startDate, endDate, id, token0, token1);
            //Assert.IsType<List<UniswapV2PairDayDataV2DTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetPairHourDataV2sHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetPairHourDataV2sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pair = null;
            //var response = instance.UniswapV2GetPairHourDataV2sHistorical(startBlock, endBlock, startDate, endDate, id, pair);
            //Assert.IsType<List<UniswapV2PairHourDataV2DTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetPairV2sHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetPairV2sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string token0 = null;
            //string token1 = null;
            //var response = instance.UniswapV2GetPairV2sHistorical(startBlock, endBlock, startDate, endDate, id, token0, token1);
            //Assert.IsType<List<UniswapV2PairV2DTO>>(response);
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
            //Assert.IsType<List<UniswapV2PairV2DTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetSwapV2sHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetSwapV2sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pair = null;
            //var response = instance.UniswapV2GetSwapV2sHistorical(startBlock, endBlock, startDate, endDate, id, pair);
            //Assert.IsType<List<UniswapV2SwapV2DTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetSwapsCurrent
        /// </summary>
        [Fact]
        public void UniswapV2GetSwapsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2GetSwapsCurrent();
            //Assert.IsType<List<UniswapV2SwapV2DTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetTokenDayDataV2sHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetTokenDayDataV2sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV2GetTokenDayDataV2sHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<UniswapV2TokenDayDataV2DTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetTokenV2sHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetTokenV2sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string symbol = null;
            //string name = null;
            //var response = instance.UniswapV2GetTokenV2sHistorical(startBlock, endBlock, startDate, endDate, id, symbol, name);
            //Assert.IsType<List<UniswapV2TokenV2DTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetTokensCurrent
        /// </summary>
        [Fact]
        public void UniswapV2GetTokensCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.UniswapV2GetTokensCurrent();
            //Assert.IsType<List<UniswapV2TokenV2DTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetTransactionV2sHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetTransactionV2sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV2GetTransactionV2sHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<UniswapV2TransactionV2DTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetUniswapDayDataV2sHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetUniswapDayDataV2sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV2GetUniswapDayDataV2sHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<UniswapV2UniswapDayDataV2DTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetUniswapFactoryV2sHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetUniswapFactoryV2sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV2GetUniswapFactoryV2sHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<UniswapV2UniswapFactoryV2DTO>>(response);
        }

        /// <summary>
        /// Test UniswapV2GetUserV2sHistorical
        /// </summary>
        [Fact]
        public void UniswapV2GetUserV2sHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.UniswapV2GetUserV2sHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<UniswapV2UserV2DTO>>(response);
        }
    }
}
