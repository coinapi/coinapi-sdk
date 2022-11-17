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
    ///  Class for testing CurveApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class CurveApiTests : IDisposable
    {
        private CurveApi instance;

        public CurveApiTests()
        {
            instance = new CurveApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of CurveApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' CurveApi
            //Assert.IsType<CurveApi>(instance);
        }

        /// <summary>
        /// Test CurveAccountsCurrent
        /// </summary>
        [Fact]
        public void CurveAccountsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveAccountsCurrent();
            //Assert.IsType<List<CurveAccountDTO>>(response);
        }

        /// <summary>
        /// Test CurveAddLiquidityEventsCurrent
        /// </summary>
        [Fact]
        public void CurveAddLiquidityEventsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveAddLiquidityEventsCurrent();
            //Assert.IsType<List<CurveAddLiquidityEventDTO>>(response);
        }

        /// <summary>
        /// Test CurveAdminFeeChangeLogsCurrent
        /// </summary>
        [Fact]
        public void CurveAdminFeeChangeLogsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveAdminFeeChangeLogsCurrent();
            //Assert.IsType<List<CurveAdminFeeChangeLogDTO>>(response);
        }

        /// <summary>
        /// Test CurveAmplificationCoeffChangeLogsCurrent
        /// </summary>
        [Fact]
        public void CurveAmplificationCoeffChangeLogsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveAmplificationCoeffChangeLogsCurrent();
            //Assert.IsType<List<CurveAmplificationCoeffChangeLogDTO>>(response);
        }

        /// <summary>
        /// Test CurveCoinsCurrent
        /// </summary>
        [Fact]
        public void CurveCoinsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveCoinsCurrent();
            //Assert.IsType<List<CurveCoinDTO>>(response);
        }

        /// <summary>
        /// Test CurveContractVersionsCurrent
        /// </summary>
        [Fact]
        public void CurveContractVersionsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveContractVersionsCurrent();
            //Assert.IsType<List<CurveContractVersionDTO>>(response);
        }

        /// <summary>
        /// Test CurveContractsCurrent
        /// </summary>
        [Fact]
        public void CurveContractsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveContractsCurrent();
            //Assert.IsType<List<CurveContractDTO>>(response);
        }

        /// <summary>
        /// Test CurveDailyVolumesCurrent
        /// </summary>
        [Fact]
        public void CurveDailyVolumesCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveDailyVolumesCurrent();
            //Assert.IsType<List<CurveDailyVolumeDTO>>(response);
        }

        /// <summary>
        /// Test CurveExchangesCurrent
        /// </summary>
        [Fact]
        public void CurveExchangesCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string pool = null;
            //var response = instance.CurveExchangesCurrent(pool);
            //Assert.IsType<List<CurveExchangeDTO>>(response);
        }

        /// <summary>
        /// Test CurveFeeChangeLogsCurrent
        /// </summary>
        [Fact]
        public void CurveFeeChangeLogsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveFeeChangeLogsCurrent();
            //Assert.IsType<List<CurveFeeChangeLogDTO>>(response);
        }

        /// <summary>
        /// Test CurveGaugeDepositsCurrent
        /// </summary>
        [Fact]
        public void CurveGaugeDepositsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveGaugeDepositsCurrent();
            //Assert.IsType<List<CurveGaugeDepositDTO>>(response);
        }

        /// <summary>
        /// Test CurveGaugeLiquiditysCurrent
        /// </summary>
        [Fact]
        public void CurveGaugeLiquiditysCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveGaugeLiquiditysCurrent();
            //Assert.IsType<List<CurveGaugeLiquidityDTO>>(response);
        }

        /// <summary>
        /// Test CurveGaugeTotalWeightsCurrent
        /// </summary>
        [Fact]
        public void CurveGaugeTotalWeightsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveGaugeTotalWeightsCurrent();
            //Assert.IsType<List<CurveGaugeTotalWeightDTO>>(response);
        }

        /// <summary>
        /// Test CurveGaugeTypeWeightsCurrent
        /// </summary>
        [Fact]
        public void CurveGaugeTypeWeightsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveGaugeTypeWeightsCurrent();
            //Assert.IsType<List<CurveGaugeTypeWeightDTO>>(response);
        }

        /// <summary>
        /// Test CurveGaugeTypesCurrent
        /// </summary>
        [Fact]
        public void CurveGaugeTypesCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveGaugeTypesCurrent();
            //Assert.IsType<List<CurveGaugeTypeDTO>>(response);
        }

        /// <summary>
        /// Test CurveGaugeWeightVotesCurrent
        /// </summary>
        [Fact]
        public void CurveGaugeWeightVotesCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveGaugeWeightVotesCurrent();
            //Assert.IsType<List<CurveGaugeWeightVoteDTO>>(response);
        }

        /// <summary>
        /// Test CurveGaugeWeightsCurrent
        /// </summary>
        [Fact]
        public void CurveGaugeWeightsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveGaugeWeightsCurrent();
            //Assert.IsType<List<CurveGaugeWeightDTO>>(response);
        }

        /// <summary>
        /// Test CurveGaugeWithdrawsCurrent
        /// </summary>
        [Fact]
        public void CurveGaugeWithdrawsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveGaugeWithdrawsCurrent();
            //Assert.IsType<List<CurveGaugeWithdrawDTO>>(response);
        }

        /// <summary>
        /// Test CurveGaugesCurrent
        /// </summary>
        [Fact]
        public void CurveGaugesCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveGaugesCurrent();
            //Assert.IsType<List<CurveGaugeDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetAccountsHistorical
        /// </summary>
        [Fact]
        public void CurveGetAccountsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string address = null;
            //var response = instance.CurveGetAccountsHistorical(startBlock, endBlock, startDate, endDate, id, address);
            //Assert.IsType<List<CurveAccountDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetAddLiquidityEventsHistorical
        /// </summary>
        [Fact]
        public void CurveGetAddLiquidityEventsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.CurveGetAddLiquidityEventsHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsType<List<CurveAddLiquidityEventDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetAdminFeeChangeLogsHistorical
        /// </summary>
        [Fact]
        public void CurveGetAdminFeeChangeLogsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.CurveGetAdminFeeChangeLogsHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsType<List<CurveAdminFeeChangeLogDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetAmplificationCoeffChangeLogsHistorical
        /// </summary>
        [Fact]
        public void CurveGetAmplificationCoeffChangeLogsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.CurveGetAmplificationCoeffChangeLogsHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsType<List<CurveAmplificationCoeffChangeLogDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetCoinsHistorical
        /// </summary>
        [Fact]
        public void CurveGetCoinsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.CurveGetCoinsHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsType<List<CurveCoinDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetContractVersionsHistorical
        /// </summary>
        [Fact]
        public void CurveGetContractVersionsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string address = null;
            //var response = instance.CurveGetContractVersionsHistorical(startBlock, endBlock, startDate, endDate, id, address);
            //Assert.IsType<List<CurveContractVersionDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetContractsHistorical
        /// </summary>
        [Fact]
        public void CurveGetContractsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.CurveGetContractsHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<CurveContractDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetDailyVolumesHistorical
        /// </summary>
        [Fact]
        public void CurveGetDailyVolumesHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.CurveGetDailyVolumesHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsType<List<CurveDailyVolumeDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetExchangesHistorical
        /// </summary>
        [Fact]
        public void CurveGetExchangesHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.CurveGetExchangesHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsType<List<CurveExchangeDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetFeeChangeLogsHistorical
        /// </summary>
        [Fact]
        public void CurveGetFeeChangeLogsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.CurveGetFeeChangeLogsHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsType<List<CurveFeeChangeLogDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetGaugeDepositsHistorical
        /// </summary>
        [Fact]
        public void CurveGetGaugeDepositsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.CurveGetGaugeDepositsHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<CurveGaugeDepositDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetGaugeLiquiditysHistorical
        /// </summary>
        [Fact]
        public void CurveGetGaugeLiquiditysHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string user = null;
            //var response = instance.CurveGetGaugeLiquiditysHistorical(startBlock, endBlock, startDate, endDate, id, user);
            //Assert.IsType<List<CurveGaugeLiquidityDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetGaugeTotalWeightsHistorical
        /// </summary>
        [Fact]
        public void CurveGetGaugeTotalWeightsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.CurveGetGaugeTotalWeightsHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<CurveGaugeTotalWeightDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetGaugeTypeWeightsHistorical
        /// </summary>
        [Fact]
        public void CurveGetGaugeTypeWeightsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.CurveGetGaugeTypeWeightsHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<CurveGaugeTypeWeightDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetGaugeTypesHistorical
        /// </summary>
        [Fact]
        public void CurveGetGaugeTypesHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string name = null;
            //var response = instance.CurveGetGaugeTypesHistorical(startBlock, endBlock, startDate, endDate, id, name);
            //Assert.IsType<List<CurveGaugeTypeDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetGaugeWeightVotesHistorical
        /// </summary>
        [Fact]
        public void CurveGetGaugeWeightVotesHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string user = null;
            //var response = instance.CurveGetGaugeWeightVotesHistorical(startBlock, endBlock, startDate, endDate, id, user);
            //Assert.IsType<List<CurveGaugeWeightVoteDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetGaugeWeightsHistorical
        /// </summary>
        [Fact]
        public void CurveGetGaugeWeightsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.CurveGetGaugeWeightsHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<CurveGaugeWeightDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetGaugeWithdrawsHistorical
        /// </summary>
        [Fact]
        public void CurveGetGaugeWithdrawsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.CurveGetGaugeWithdrawsHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<CurveGaugeWithdrawDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetGaugesHistorical
        /// </summary>
        [Fact]
        public void CurveGetGaugesHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string address = null;
            //string pool = null;
            //var response = instance.CurveGetGaugesHistorical(startBlock, endBlock, startDate, endDate, id, address, pool);
            //Assert.IsType<List<CurveGaugeDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetHourlyVolumesHistorical
        /// </summary>
        [Fact]
        public void CurveGetHourlyVolumesHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.CurveGetHourlyVolumesHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsType<List<CurveHourlyVolumeDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetLpTokensHistorical
        /// </summary>
        [Fact]
        public void CurveGetLpTokensHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string address = null;
            //string name = null;
            //string symbol = null;
            //string pool = null;
            //var response = instance.CurveGetLpTokensHistorical(startBlock, endBlock, startDate, endDate, id, address, name, symbol, pool);
            //Assert.IsType<List<CurveLpTokenDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetPoolsHistorical
        /// </summary>
        [Fact]
        public void CurveGetPoolsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string name = null;
            //var response = instance.CurveGetPoolsHistorical(startBlock, endBlock, startDate, endDate, id, name);
            //Assert.IsType<List<CurvePoolDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetProposalVotesHistorical
        /// </summary>
        [Fact]
        public void CurveGetProposalVotesHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.CurveGetProposalVotesHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<CurveProposalVoteDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetProposalsHistorical
        /// </summary>
        [Fact]
        public void CurveGetProposalsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.CurveGetProposalsHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<CurveProposalDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetRemoveLiquidityEventsHistorical
        /// </summary>
        [Fact]
        public void CurveGetRemoveLiquidityEventsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.CurveGetRemoveLiquidityEventsHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsType<List<CurveRemoveLiquidityEventDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetRemoveLiquidityOneEventsHistorical
        /// </summary>
        [Fact]
        public void CurveGetRemoveLiquidityOneEventsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.CurveGetRemoveLiquidityOneEventsHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsType<List<CurveRemoveLiquidityOneEventDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetSystemStatesHistorical
        /// </summary>
        [Fact]
        public void CurveGetSystemStatesHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //var response = instance.CurveGetSystemStatesHistorical(startBlock, endBlock, startDate, endDate, id);
            //Assert.IsType<List<CurveSystemStateDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetTokensHistorical
        /// </summary>
        [Fact]
        public void CurveGetTokensHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string address = null;
            //string name = null;
            //string symbol = null;
            //var response = instance.CurveGetTokensHistorical(startBlock, endBlock, startDate, endDate, id, address, name, symbol);
            //Assert.IsType<List<CurveTokenDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetTransferOwnershipEventsHistorical
        /// </summary>
        [Fact]
        public void CurveGetTransferOwnershipEventsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.CurveGetTransferOwnershipEventsHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsType<List<CurveTransferOwnershipEventDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetUnderlyingCoinsHistorical
        /// </summary>
        [Fact]
        public void CurveGetUnderlyingCoinsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.CurveGetUnderlyingCoinsHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsType<List<CurveUnderlyingCoinDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetVotingAppsHistorical
        /// </summary>
        [Fact]
        public void CurveGetVotingAppsHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string address = null;
            //var response = instance.CurveGetVotingAppsHistorical(startBlock, endBlock, startDate, endDate, id, address);
            //Assert.IsType<List<CurveVotingAppDTO>>(response);
        }

        /// <summary>
        /// Test CurveGetWeeklyVolumesHistorical
        /// </summary>
        [Fact]
        public void CurveGetWeeklyVolumesHistoricalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? startBlock = null;
            //long? endBlock = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string id = null;
            //string pool = null;
            //var response = instance.CurveGetWeeklyVolumesHistorical(startBlock, endBlock, startDate, endDate, id, pool);
            //Assert.IsType<List<CurveWeeklyVolumeDTO>>(response);
        }

        /// <summary>
        /// Test CurveHourlyVolumesCurrent
        /// </summary>
        [Fact]
        public void CurveHourlyVolumesCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveHourlyVolumesCurrent();
            //Assert.IsType<List<CurveHourlyVolumeDTO>>(response);
        }

        /// <summary>
        /// Test CurveLpTokensCurrent
        /// </summary>
        [Fact]
        public void CurveLpTokensCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveLpTokensCurrent();
            //Assert.IsType<List<CurveLpTokenDTO>>(response);
        }

        /// <summary>
        /// Test CurvePoolsCurrent
        /// </summary>
        [Fact]
        public void CurvePoolsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //var response = instance.CurvePoolsCurrent(id);
            //Assert.IsType<List<CurvePoolDTO>>(response);
        }

        /// <summary>
        /// Test CurveProposalVotesCurrent
        /// </summary>
        [Fact]
        public void CurveProposalVotesCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveProposalVotesCurrent();
            //Assert.IsType<List<CurveProposalVoteDTO>>(response);
        }

        /// <summary>
        /// Test CurveProposalsCurrent
        /// </summary>
        [Fact]
        public void CurveProposalsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveProposalsCurrent();
            //Assert.IsType<List<CurveProposalDTO>>(response);
        }

        /// <summary>
        /// Test CurveRemoveLiquidityEventsCurrent
        /// </summary>
        [Fact]
        public void CurveRemoveLiquidityEventsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveRemoveLiquidityEventsCurrent();
            //Assert.IsType<List<CurveRemoveLiquidityEventDTO>>(response);
        }

        /// <summary>
        /// Test CurveRemoveLiquidityOneEventsCurrent
        /// </summary>
        [Fact]
        public void CurveRemoveLiquidityOneEventsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveRemoveLiquidityOneEventsCurrent();
            //Assert.IsType<List<CurveRemoveLiquidityOneEventDTO>>(response);
        }

        /// <summary>
        /// Test CurveSystemStatesCurrent
        /// </summary>
        [Fact]
        public void CurveSystemStatesCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveSystemStatesCurrent();
            //Assert.IsType<List<CurveSystemStateDTO>>(response);
        }

        /// <summary>
        /// Test CurveTokensCurrent
        /// </summary>
        [Fact]
        public void CurveTokensCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveTokensCurrent();
            //Assert.IsType<List<CurveTokenDTO>>(response);
        }

        /// <summary>
        /// Test CurveTransferOwnershipEventsCurrent
        /// </summary>
        [Fact]
        public void CurveTransferOwnershipEventsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveTransferOwnershipEventsCurrent();
            //Assert.IsType<List<CurveTransferOwnershipEventDTO>>(response);
        }

        /// <summary>
        /// Test CurveUnderlyingCoinsCurrent
        /// </summary>
        [Fact]
        public void CurveUnderlyingCoinsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveUnderlyingCoinsCurrent();
            //Assert.IsType<List<CurveUnderlyingCoinDTO>>(response);
        }

        /// <summary>
        /// Test CurveVotingAppsCurrent
        /// </summary>
        [Fact]
        public void CurveVotingAppsCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveVotingAppsCurrent();
            //Assert.IsType<List<CurveVotingAppDTO>>(response);
        }

        /// <summary>
        /// Test CurveWeeklyVolumesCurrent
        /// </summary>
        [Fact]
        public void CurveWeeklyVolumesCurrentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CurveWeeklyVolumesCurrent();
            //Assert.IsType<List<CurveWeeklyVolumeDTO>>(response);
        }
    }
}
