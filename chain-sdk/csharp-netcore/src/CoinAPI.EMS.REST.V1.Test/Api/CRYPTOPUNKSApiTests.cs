/*
 * On Chain Dapps - REST API
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
    ///  Class for testing CRYPTOPUNKSApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class CRYPTOPUNKSApiTests : IDisposable
    {
        private CRYPTOPUNKSApi instance;

        public CRYPTOPUNKSApiTests()
        {
            instance = new CRYPTOPUNKSApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of CRYPTOPUNKSApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' CRYPTOPUNKSApi
            //Assert.IsType<CRYPTOPUNKSApi>(instance);
        }

        /// <summary>
        /// Test CRYPTOPUNKSBidsCurrent
        /// </summary>
        [Fact]
        public void CRYPTOPUNKSBidsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CRYPTOPUNKSBidsCurrent();
            //Assert.IsType<List<CRYPTOPUNKSBidDTO>>(response);
        }

        /// <summary>
        /// Test CRYPTOPUNKSCollectionDailySnapshotsCurrent
        /// </summary>
        [Fact]
        public void CRYPTOPUNKSCollectionDailySnapshotsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CRYPTOPUNKSCollectionDailySnapshotsCurrent();
            //Assert.IsType<List<CRYPTOPUNKSCollectionDailySnapshotDTO>>(response);
        }

        /// <summary>
        /// Test CRYPTOPUNKSCollectionsCurrent
        /// </summary>
        [Fact]
        public void CRYPTOPUNKSCollectionsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CRYPTOPUNKSCollectionsCurrent();
            //Assert.IsType<List<CRYPTOPUNKSCollectionDTO>>(response);
        }

        /// <summary>
        /// Test CRYPTOPUNKSDataSourcesCurrent
        /// </summary>
        [Fact]
        public void CRYPTOPUNKSDataSourcesCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CRYPTOPUNKSDataSourcesCurrent();
            //Assert.IsType<List<CRYPTOPUNKSDataSourcesDTO>>(response);
        }

        /// <summary>
        /// Test CRYPTOPUNKSGetBidsHistorical
        /// </summary>
        [Fact]
        public void CRYPTOPUNKSGetBidsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.CRYPTOPUNKSGetBidsHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<CRYPTOPUNKSBidDTO>>(response);
        }

        /// <summary>
        /// Test CRYPTOPUNKSGetCollectionDailySnapshotsHistorical
        /// </summary>
        [Fact]
        public void CRYPTOPUNKSGetCollectionDailySnapshotsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //var response = instance.CRYPTOPUNKSGetCollectionDailySnapshotsHistorical(startBlock, endBlock, startDate, endDate);
            //Assert.IsType<List<CRYPTOPUNKSCollectionDailySnapshotDTO>>(response);
        }

        /// <summary>
        /// Test CRYPTOPUNKSGetCollectionsHistorical
        /// </summary>
        [Fact]
        public void CRYPTOPUNKSGetCollectionsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.CRYPTOPUNKSGetCollectionsHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<CRYPTOPUNKSCollectionDTO>>(response);
        }

        /// <summary>
        /// Test CRYPTOPUNKSGetDataSourcesHistorical
        /// </summary>
        [Fact]
        public void CRYPTOPUNKSGetDataSourcesHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.CRYPTOPUNKSGetDataSourcesHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<CRYPTOPUNKSDataSourcesDTO>>(response);
        }

        /// <summary>
        /// Test CRYPTOPUNKSGetItemsHistorical
        /// </summary>
        [Fact]
        public void CRYPTOPUNKSGetItemsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //var response = instance.CRYPTOPUNKSGetItemsHistorical(startBlock, endBlock, startDate, endDate);
            //Assert.IsType<List<CRYPTOPUNKSItemDTO>>(response);
        }

        /// <summary>
        /// Test CRYPTOPUNKSGetMarketPlacesHistorical
        /// </summary>
        [Fact]
        public void CRYPTOPUNKSGetMarketPlacesHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.CRYPTOPUNKSGetMarketPlacesHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<CRYPTOPUNKSMarketPlaceDTO>>(response);
        }

        /// <summary>
        /// Test CRYPTOPUNKSGetMarketplaceDailySnapshotsHistorical
        /// </summary>
        [Fact]
        public void CRYPTOPUNKSGetMarketplaceDailySnapshotsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.CRYPTOPUNKSGetMarketplaceDailySnapshotsHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<CRYPTOPUNKSMarketplaceDailySnapshotDTO>>(response);
        }

        /// <summary>
        /// Test CRYPTOPUNKSGetTradesHistorical
        /// </summary>
        [Fact]
        public void CRYPTOPUNKSGetTradesHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.CRYPTOPUNKSGetTradesHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<CRYPTOPUNKSTradeDTO>>(response);
        }

        /// <summary>
        /// Test CRYPTOPUNKSGetUsersHistorical
        /// </summary>
        [Fact]
        public void CRYPTOPUNKSGetUsersHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.CRYPTOPUNKSGetUsersHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<CRYPTOPUNKSUserDTO>>(response);
        }

        /// <summary>
        /// Test CRYPTOPUNKSItemsCurrent
        /// </summary>
        [Fact]
        public void CRYPTOPUNKSItemsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CRYPTOPUNKSItemsCurrent();
            //Assert.IsType<List<CRYPTOPUNKSItemDTO>>(response);
        }

        /// <summary>
        /// Test CRYPTOPUNKSMarketPlacesCurrent
        /// </summary>
        [Fact]
        public void CRYPTOPUNKSMarketPlacesCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CRYPTOPUNKSMarketPlacesCurrent();
            //Assert.IsType<List<CRYPTOPUNKSMarketPlaceDTO>>(response);
        }

        /// <summary>
        /// Test CRYPTOPUNKSMarketplaceDailySnapshotsCurrent
        /// </summary>
        [Fact]
        public void CRYPTOPUNKSMarketplaceDailySnapshotsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CRYPTOPUNKSMarketplaceDailySnapshotsCurrent();
            //Assert.IsType<List<CRYPTOPUNKSMarketplaceDailySnapshotDTO>>(response);
        }

        /// <summary>
        /// Test CRYPTOPUNKSTradesCurrent
        /// </summary>
        [Fact]
        public void CRYPTOPUNKSTradesCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CRYPTOPUNKSTradesCurrent();
            //Assert.IsType<List<CRYPTOPUNKSTradeDTO>>(response);
        }

        /// <summary>
        /// Test CRYPTOPUNKSUsersCurrent
        /// </summary>
        [Fact]
        public void CRYPTOPUNKSUsersCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CRYPTOPUNKSUsersCurrent();
            //Assert.IsType<List<CRYPTOPUNKSUserDTO>>(response);
        }
    }
}
