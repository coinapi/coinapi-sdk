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
        /// Test ChainsChainIdDappsUniswapv3BundleCurrentGet
        /// </summary>
        [Test]
        public void ChainsChainIdDappsUniswapv3BundleCurrentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string chainId = null;
            //var response = instance.ChainsChainIdDappsUniswapv3BundleCurrentGet(chainId);
            //Assert.IsInstanceOf(typeof(List<BundleV3DTO>), response, "response is List<BundleV3DTO>");
        }
        
        /// <summary>
        /// Test ChainsChainIdDappsUniswapv3BurnsCurrentGet
        /// </summary>
        [Test]
        public void ChainsChainIdDappsUniswapv3BurnsCurrentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string chainId = null;
            //string filterPoolId = null;
            //var response = instance.ChainsChainIdDappsUniswapv3BurnsCurrentGet(chainId, filterPoolId);
            //Assert.IsInstanceOf(typeof(List<BurnV3DTO>), response, "response is List<BurnV3DTO>");
        }
        
        /// <summary>
        /// Test ChainsChainIdDappsUniswapv3FactoryCurrentGet
        /// </summary>
        [Test]
        public void ChainsChainIdDappsUniswapv3FactoryCurrentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string chainId = null;
            //var response = instance.ChainsChainIdDappsUniswapv3FactoryCurrentGet(chainId);
            //Assert.IsInstanceOf(typeof(List<FactoryV3DTO>), response, "response is List<FactoryV3DTO>");
        }
        
        /// <summary>
        /// Test ChainsChainIdDappsUniswapv3MintsCurrentGet
        /// </summary>
        [Test]
        public void ChainsChainIdDappsUniswapv3MintsCurrentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string chainId = null;
            //string filterPoolId = null;
            //var response = instance.ChainsChainIdDappsUniswapv3MintsCurrentGet(chainId, filterPoolId);
            //Assert.IsInstanceOf(typeof(List<MintV3DTO>), response, "response is List<MintV3DTO>");
        }
        
        /// <summary>
        /// Test ChainsChainIdDappsUniswapv3PoolsCurrentGet
        /// </summary>
        [Test]
        public void ChainsChainIdDappsUniswapv3PoolsCurrentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string chainId = null;
            //string filterPoolId = null;
            //var response = instance.ChainsChainIdDappsUniswapv3PoolsCurrentGet(chainId, filterPoolId);
            //Assert.IsInstanceOf(typeof(List<PoolV3DTO>), response, "response is List<PoolV3DTO>");
        }
        
        /// <summary>
        /// Test ChainsChainIdDappsUniswapv3PoolsDayDataCurrentGet
        /// </summary>
        [Test]
        public void ChainsChainIdDappsUniswapv3PoolsDayDataCurrentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string chainId = null;
            //string filterPoolId = null;
            //var response = instance.ChainsChainIdDappsUniswapv3PoolsDayDataCurrentGet(chainId, filterPoolId);
            //Assert.IsInstanceOf(typeof(List<PoolDayDataV3DTO>), response, "response is List<PoolDayDataV3DTO>");
        }
        
        /// <summary>
        /// Test ChainsChainIdDappsUniswapv3PoolsHourDataCurrentGet
        /// </summary>
        [Test]
        public void ChainsChainIdDappsUniswapv3PoolsHourDataCurrentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string chainId = null;
            //string filterPoolId = null;
            //var response = instance.ChainsChainIdDappsUniswapv3PoolsHourDataCurrentGet(chainId, filterPoolId);
            //Assert.IsInstanceOf(typeof(List<PoolHourDataV3DTO>), response, "response is List<PoolHourDataV3DTO>");
        }
        
        /// <summary>
        /// Test ChainsChainIdDappsUniswapv3PositionSnapshotsCurrentGet
        /// </summary>
        [Test]
        public void ChainsChainIdDappsUniswapv3PositionSnapshotsCurrentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string chainId = null;
            //string filterPoolId = null;
            //var response = instance.ChainsChainIdDappsUniswapv3PositionSnapshotsCurrentGet(chainId, filterPoolId);
            //Assert.IsInstanceOf(typeof(List<PositionSnapshotV3DTO>), response, "response is List<PositionSnapshotV3DTO>");
        }
        
        /// <summary>
        /// Test ChainsChainIdDappsUniswapv3PositionsCurrentGet
        /// </summary>
        [Test]
        public void ChainsChainIdDappsUniswapv3PositionsCurrentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string chainId = null;
            //string filterPoolId = null;
            //var response = instance.ChainsChainIdDappsUniswapv3PositionsCurrentGet(chainId, filterPoolId);
            //Assert.IsInstanceOf(typeof(List<PositionV3DTO>), response, "response is List<PositionV3DTO>");
        }
        
        /// <summary>
        /// Test ChainsChainIdDappsUniswapv3SwapsCurrentGet
        /// </summary>
        [Test]
        public void ChainsChainIdDappsUniswapv3SwapsCurrentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string chainId = null;
            //string filterPoolId = null;
            //var response = instance.ChainsChainIdDappsUniswapv3SwapsCurrentGet(chainId, filterPoolId);
            //Assert.IsInstanceOf(typeof(List<SwapV3DTO>), response, "response is List<SwapV3DTO>");
        }
        
        /// <summary>
        /// Test ChainsChainIdDappsUniswapv3TicksCurrentGet
        /// </summary>
        [Test]
        public void ChainsChainIdDappsUniswapv3TicksCurrentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string chainId = null;
            //string filterPoolId = null;
            //var response = instance.ChainsChainIdDappsUniswapv3TicksCurrentGet(chainId, filterPoolId);
            //Assert.IsInstanceOf(typeof(List<TickV3DTO>), response, "response is List<TickV3DTO>");
        }
        
        /// <summary>
        /// Test ChainsChainIdDappsUniswapv3TicksDayDataCurrentGet
        /// </summary>
        [Test]
        public void ChainsChainIdDappsUniswapv3TicksDayDataCurrentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string chainId = null;
            //string filterPoolId = null;
            //var response = instance.ChainsChainIdDappsUniswapv3TicksDayDataCurrentGet(chainId, filterPoolId);
            //Assert.IsInstanceOf(typeof(List<TickDayDataV3DTO>), response, "response is List<TickDayDataV3DTO>");
        }
        
        /// <summary>
        /// Test ChainsChainIdDappsUniswapv3TokensCurrentGet
        /// </summary>
        [Test]
        public void ChainsChainIdDappsUniswapv3TokensCurrentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string chainId = null;
            //string filterTokenId = null;
            //var response = instance.ChainsChainIdDappsUniswapv3TokensCurrentGet(chainId, filterTokenId);
            //Assert.IsInstanceOf(typeof(List<TokenV3DTO>), response, "response is List<TokenV3DTO>");
        }
        
        /// <summary>
        /// Test ChainsChainIdDappsUniswapv3TokensDayDataCurrentGet
        /// </summary>
        [Test]
        public void ChainsChainIdDappsUniswapv3TokensDayDataCurrentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string chainId = null;
            //string filterTokenId = null;
            //var response = instance.ChainsChainIdDappsUniswapv3TokensDayDataCurrentGet(chainId, filterTokenId);
            //Assert.IsInstanceOf(typeof(List<TokenV3DayDataDTO>), response, "response is List<TokenV3DayDataDTO>");
        }
        
        /// <summary>
        /// Test ChainsChainIdDappsUniswapv3TokensHourDataCurrentGet
        /// </summary>
        [Test]
        public void ChainsChainIdDappsUniswapv3TokensHourDataCurrentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string chainId = null;
            //string filterTokenId = null;
            //var response = instance.ChainsChainIdDappsUniswapv3TokensHourDataCurrentGet(chainId, filterTokenId);
            //Assert.IsInstanceOf(typeof(List<TokenHourDataV3DTO>), response, "response is List<TokenHourDataV3DTO>");
        }
        
        /// <summary>
        /// Test ChainsChainIdDappsUniswapv3UniswapDayDataCurrentGet
        /// </summary>
        [Test]
        public void ChainsChainIdDappsUniswapv3UniswapDayDataCurrentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string chainId = null;
            //var response = instance.ChainsChainIdDappsUniswapv3UniswapDayDataCurrentGet(chainId);
            //Assert.IsInstanceOf(typeof(List<UniswapDayDataV3DTO>), response, "response is List<UniswapDayDataV3DTO>");
        }
        
    }

}