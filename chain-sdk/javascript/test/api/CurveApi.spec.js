/**
 * On Chain Dapps - REST API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.OnChainDappsRestApi);
  }
}(this, function(expect, OnChainDappsRestApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new OnChainDappsRestApi.CurveApi();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('CurveApi', function() {
    describe('curveAccountsCurrent', function() {
      it('should call curveAccountsCurrent successfully', function(done) {
        //uncomment below and update the code to test curveAccountsCurrent
        //instance.curveAccountsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveAddLiquidityEventsCurrent', function() {
      it('should call curveAddLiquidityEventsCurrent successfully', function(done) {
        //uncomment below and update the code to test curveAddLiquidityEventsCurrent
        //instance.curveAddLiquidityEventsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveAdminFeeChangeLogsCurrent', function() {
      it('should call curveAdminFeeChangeLogsCurrent successfully', function(done) {
        //uncomment below and update the code to test curveAdminFeeChangeLogsCurrent
        //instance.curveAdminFeeChangeLogsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveAmplificationCoeffChangeLogsCurrent', function() {
      it('should call curveAmplificationCoeffChangeLogsCurrent successfully', function(done) {
        //uncomment below and update the code to test curveAmplificationCoeffChangeLogsCurrent
        //instance.curveAmplificationCoeffChangeLogsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveCoinsCurrent', function() {
      it('should call curveCoinsCurrent successfully', function(done) {
        //uncomment below and update the code to test curveCoinsCurrent
        //instance.curveCoinsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveContractVersionsCurrent', function() {
      it('should call curveContractVersionsCurrent successfully', function(done) {
        //uncomment below and update the code to test curveContractVersionsCurrent
        //instance.curveContractVersionsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveContractsCurrent', function() {
      it('should call curveContractsCurrent successfully', function(done) {
        //uncomment below and update the code to test curveContractsCurrent
        //instance.curveContractsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveDailyVolumesCurrent', function() {
      it('should call curveDailyVolumesCurrent successfully', function(done) {
        //uncomment below and update the code to test curveDailyVolumesCurrent
        //instance.curveDailyVolumesCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveExchangesCurrent', function() {
      it('should call curveExchangesCurrent successfully', function(done) {
        //uncomment below and update the code to test curveExchangesCurrent
        //instance.curveExchangesCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveFeeChangeLogsCurrent', function() {
      it('should call curveFeeChangeLogsCurrent successfully', function(done) {
        //uncomment below and update the code to test curveFeeChangeLogsCurrent
        //instance.curveFeeChangeLogsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGaugeDepositsCurrent', function() {
      it('should call curveGaugeDepositsCurrent successfully', function(done) {
        //uncomment below and update the code to test curveGaugeDepositsCurrent
        //instance.curveGaugeDepositsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGaugeLiquiditiesCurrent', function() {
      it('should call curveGaugeLiquiditiesCurrent successfully', function(done) {
        //uncomment below and update the code to test curveGaugeLiquiditiesCurrent
        //instance.curveGaugeLiquiditiesCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGaugeTotalWeightsCurrent', function() {
      it('should call curveGaugeTotalWeightsCurrent successfully', function(done) {
        //uncomment below and update the code to test curveGaugeTotalWeightsCurrent
        //instance.curveGaugeTotalWeightsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGaugeTypeWeightsCurrent', function() {
      it('should call curveGaugeTypeWeightsCurrent successfully', function(done) {
        //uncomment below and update the code to test curveGaugeTypeWeightsCurrent
        //instance.curveGaugeTypeWeightsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGaugeTypesCurrent', function() {
      it('should call curveGaugeTypesCurrent successfully', function(done) {
        //uncomment below and update the code to test curveGaugeTypesCurrent
        //instance.curveGaugeTypesCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGaugeWeightVotesCurrent', function() {
      it('should call curveGaugeWeightVotesCurrent successfully', function(done) {
        //uncomment below and update the code to test curveGaugeWeightVotesCurrent
        //instance.curveGaugeWeightVotesCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGaugeWeightsCurrent', function() {
      it('should call curveGaugeWeightsCurrent successfully', function(done) {
        //uncomment below and update the code to test curveGaugeWeightsCurrent
        //instance.curveGaugeWeightsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGaugeWithdrawsCurrent', function() {
      it('should call curveGaugeWithdrawsCurrent successfully', function(done) {
        //uncomment below and update the code to test curveGaugeWithdrawsCurrent
        //instance.curveGaugeWithdrawsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGaugesCurrent', function() {
      it('should call curveGaugesCurrent successfully', function(done) {
        //uncomment below and update the code to test curveGaugesCurrent
        //instance.curveGaugesCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetAccountsHistorical', function() {
      it('should call curveGetAccountsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetAccountsHistorical
        //instance.curveGetAccountsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetAddLiquidityEventsHistorical', function() {
      it('should call curveGetAddLiquidityEventsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetAddLiquidityEventsHistorical
        //instance.curveGetAddLiquidityEventsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetAdminFeeChangeLogsHistorical', function() {
      it('should call curveGetAdminFeeChangeLogsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetAdminFeeChangeLogsHistorical
        //instance.curveGetAdminFeeChangeLogsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetAmplificationCoeffChangeLogsHistorical', function() {
      it('should call curveGetAmplificationCoeffChangeLogsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetAmplificationCoeffChangeLogsHistorical
        //instance.curveGetAmplificationCoeffChangeLogsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetCoinsHistorical', function() {
      it('should call curveGetCoinsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetCoinsHistorical
        //instance.curveGetCoinsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetContractVersionsHistorical', function() {
      it('should call curveGetContractVersionsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetContractVersionsHistorical
        //instance.curveGetContractVersionsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetContractsHistorical', function() {
      it('should call curveGetContractsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetContractsHistorical
        //instance.curveGetContractsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetDailyVolumesHistorical', function() {
      it('should call curveGetDailyVolumesHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetDailyVolumesHistorical
        //instance.curveGetDailyVolumesHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetExchangesHistorical', function() {
      it('should call curveGetExchangesHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetExchangesHistorical
        //instance.curveGetExchangesHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetFeeChangeLogsHistorical', function() {
      it('should call curveGetFeeChangeLogsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetFeeChangeLogsHistorical
        //instance.curveGetFeeChangeLogsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetGaugeDepositsHistorical', function() {
      it('should call curveGetGaugeDepositsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetGaugeDepositsHistorical
        //instance.curveGetGaugeDepositsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetGaugeLiquiditiesHistorical', function() {
      it('should call curveGetGaugeLiquiditiesHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetGaugeLiquiditiesHistorical
        //instance.curveGetGaugeLiquiditiesHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetGaugeTotalWeightsHistorical', function() {
      it('should call curveGetGaugeTotalWeightsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetGaugeTotalWeightsHistorical
        //instance.curveGetGaugeTotalWeightsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetGaugeTypeWeightsHistorical', function() {
      it('should call curveGetGaugeTypeWeightsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetGaugeTypeWeightsHistorical
        //instance.curveGetGaugeTypeWeightsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetGaugeTypesHistorical', function() {
      it('should call curveGetGaugeTypesHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetGaugeTypesHistorical
        //instance.curveGetGaugeTypesHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetGaugeWeightVotesHistorical', function() {
      it('should call curveGetGaugeWeightVotesHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetGaugeWeightVotesHistorical
        //instance.curveGetGaugeWeightVotesHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetGaugeWeightsHistorical', function() {
      it('should call curveGetGaugeWeightsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetGaugeWeightsHistorical
        //instance.curveGetGaugeWeightsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetGaugeWithdrawsHistorical', function() {
      it('should call curveGetGaugeWithdrawsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetGaugeWithdrawsHistorical
        //instance.curveGetGaugeWithdrawsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetGaugesHistorical', function() {
      it('should call curveGetGaugesHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetGaugesHistorical
        //instance.curveGetGaugesHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetHourlyVolumesHistorical', function() {
      it('should call curveGetHourlyVolumesHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetHourlyVolumesHistorical
        //instance.curveGetHourlyVolumesHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetLpTokensHistorical', function() {
      it('should call curveGetLpTokensHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetLpTokensHistorical
        //instance.curveGetLpTokensHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetPoolsHistorical', function() {
      it('should call curveGetPoolsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetPoolsHistorical
        //instance.curveGetPoolsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetProposalVotesHistorical', function() {
      it('should call curveGetProposalVotesHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetProposalVotesHistorical
        //instance.curveGetProposalVotesHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetProposalsHistorical', function() {
      it('should call curveGetProposalsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetProposalsHistorical
        //instance.curveGetProposalsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetRemoveLiquidityEventsHistorical', function() {
      it('should call curveGetRemoveLiquidityEventsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetRemoveLiquidityEventsHistorical
        //instance.curveGetRemoveLiquidityEventsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetRemoveLiquidityOneEventsHistorical', function() {
      it('should call curveGetRemoveLiquidityOneEventsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetRemoveLiquidityOneEventsHistorical
        //instance.curveGetRemoveLiquidityOneEventsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetSystemStatesHistorical', function() {
      it('should call curveGetSystemStatesHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetSystemStatesHistorical
        //instance.curveGetSystemStatesHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetTokensHistorical', function() {
      it('should call curveGetTokensHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetTokensHistorical
        //instance.curveGetTokensHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetTransferOwnershipEventsHistorical', function() {
      it('should call curveGetTransferOwnershipEventsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetTransferOwnershipEventsHistorical
        //instance.curveGetTransferOwnershipEventsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetUnderlyingCoinsHistorical', function() {
      it('should call curveGetUnderlyingCoinsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetUnderlyingCoinsHistorical
        //instance.curveGetUnderlyingCoinsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetVotingAppsHistorical', function() {
      it('should call curveGetVotingAppsHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetVotingAppsHistorical
        //instance.curveGetVotingAppsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveGetWeeklyVolumesHistorical', function() {
      it('should call curveGetWeeklyVolumesHistorical successfully', function(done) {
        //uncomment below and update the code to test curveGetWeeklyVolumesHistorical
        //instance.curveGetWeeklyVolumesHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveHourlyVolumesCurrent', function() {
      it('should call curveHourlyVolumesCurrent successfully', function(done) {
        //uncomment below and update the code to test curveHourlyVolumesCurrent
        //instance.curveHourlyVolumesCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveLpTokensCurrent', function() {
      it('should call curveLpTokensCurrent successfully', function(done) {
        //uncomment below and update the code to test curveLpTokensCurrent
        //instance.curveLpTokensCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curvePoolsCurrent', function() {
      it('should call curvePoolsCurrent successfully', function(done) {
        //uncomment below and update the code to test curvePoolsCurrent
        //instance.curvePoolsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveProposalVotesCurrent', function() {
      it('should call curveProposalVotesCurrent successfully', function(done) {
        //uncomment below and update the code to test curveProposalVotesCurrent
        //instance.curveProposalVotesCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveProposalsCurrent', function() {
      it('should call curveProposalsCurrent successfully', function(done) {
        //uncomment below and update the code to test curveProposalsCurrent
        //instance.curveProposalsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveRemoveLiquidityEventsCurrent', function() {
      it('should call curveRemoveLiquidityEventsCurrent successfully', function(done) {
        //uncomment below and update the code to test curveRemoveLiquidityEventsCurrent
        //instance.curveRemoveLiquidityEventsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveRemoveLiquidityOneEventsCurrent', function() {
      it('should call curveRemoveLiquidityOneEventsCurrent successfully', function(done) {
        //uncomment below and update the code to test curveRemoveLiquidityOneEventsCurrent
        //instance.curveRemoveLiquidityOneEventsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveSystemStatesCurrent', function() {
      it('should call curveSystemStatesCurrent successfully', function(done) {
        //uncomment below and update the code to test curveSystemStatesCurrent
        //instance.curveSystemStatesCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveTokensCurrent', function() {
      it('should call curveTokensCurrent successfully', function(done) {
        //uncomment below and update the code to test curveTokensCurrent
        //instance.curveTokensCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveTransferOwnershipEventsCurrent', function() {
      it('should call curveTransferOwnershipEventsCurrent successfully', function(done) {
        //uncomment below and update the code to test curveTransferOwnershipEventsCurrent
        //instance.curveTransferOwnershipEventsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveUnderlyingCoinsCurrent', function() {
      it('should call curveUnderlyingCoinsCurrent successfully', function(done) {
        //uncomment below and update the code to test curveUnderlyingCoinsCurrent
        //instance.curveUnderlyingCoinsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveVotingAppsCurrent', function() {
      it('should call curveVotingAppsCurrent successfully', function(done) {
        //uncomment below and update the code to test curveVotingAppsCurrent
        //instance.curveVotingAppsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('curveWeeklyVolumesCurrent', function() {
      it('should call curveWeeklyVolumesCurrent successfully', function(done) {
        //uncomment below and update the code to test curveWeeklyVolumesCurrent
        //instance.curveWeeklyVolumesCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
