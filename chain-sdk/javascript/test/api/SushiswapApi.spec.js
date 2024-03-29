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
    instance = new OnChainDappsRestApi.SushiswapApi();
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

  describe('SushiswapApi', function() {
    describe('sushiswapBundlesCurrent', function() {
      it('should call sushiswapBundlesCurrent successfully', function(done) {
        //uncomment below and update the code to test sushiswapBundlesCurrent
        //instance.sushiswapBundlesCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapBurnsCurrent', function() {
      it('should call sushiswapBurnsCurrent successfully', function(done) {
        //uncomment below and update the code to test sushiswapBurnsCurrent
        //instance.sushiswapBurnsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapDayDataCurrent', function() {
      it('should call sushiswapDayDataCurrent successfully', function(done) {
        //uncomment below and update the code to test sushiswapDayDataCurrent
        //instance.sushiswapDayDataCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapFactoriesCurrent', function() {
      it('should call sushiswapFactoriesCurrent successfully', function(done) {
        //uncomment below and update the code to test sushiswapFactoriesCurrent
        //instance.sushiswapFactoriesCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapGetBundlesHistorical', function() {
      it('should call sushiswapGetBundlesHistorical successfully', function(done) {
        //uncomment below and update the code to test sushiswapGetBundlesHistorical
        //instance.sushiswapGetBundlesHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapGetBurnsHistorical', function() {
      it('should call sushiswapGetBurnsHistorical successfully', function(done) {
        //uncomment below and update the code to test sushiswapGetBurnsHistorical
        //instance.sushiswapGetBurnsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapGetDayDataHistorical', function() {
      it('should call sushiswapGetDayDataHistorical successfully', function(done) {
        //uncomment below and update the code to test sushiswapGetDayDataHistorical
        //instance.sushiswapGetDayDataHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapGetFactoriesHistorical', function() {
      it('should call sushiswapGetFactoriesHistorical successfully', function(done) {
        //uncomment below and update the code to test sushiswapGetFactoriesHistorical
        //instance.sushiswapGetFactoriesHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapGetHourDataHistorical', function() {
      it('should call sushiswapGetHourDataHistorical successfully', function(done) {
        //uncomment below and update the code to test sushiswapGetHourDataHistorical
        //instance.sushiswapGetHourDataHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapGetLiquidityPositionSnapshotsHistorical', function() {
      it('should call sushiswapGetLiquidityPositionSnapshotsHistorical successfully', function(done) {
        //uncomment below and update the code to test sushiswapGetLiquidityPositionSnapshotsHistorical
        //instance.sushiswapGetLiquidityPositionSnapshotsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapGetLiquidityPositionsHistorical', function() {
      it('should call sushiswapGetLiquidityPositionsHistorical successfully', function(done) {
        //uncomment below and update the code to test sushiswapGetLiquidityPositionsHistorical
        //instance.sushiswapGetLiquidityPositionsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapGetMintsHistorical', function() {
      it('should call sushiswapGetMintsHistorical successfully', function(done) {
        //uncomment below and update the code to test sushiswapGetMintsHistorical
        //instance.sushiswapGetMintsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapGetPairDayDataHistorical', function() {
      it('should call sushiswapGetPairDayDataHistorical successfully', function(done) {
        //uncomment below and update the code to test sushiswapGetPairDayDataHistorical
        //instance.sushiswapGetPairDayDataHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapGetPairHourDataHistorical', function() {
      it('should call sushiswapGetPairHourDataHistorical successfully', function(done) {
        //uncomment below and update the code to test sushiswapGetPairHourDataHistorical
        //instance.sushiswapGetPairHourDataHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapGetPairsHistorical', function() {
      it('should call sushiswapGetPairsHistorical successfully', function(done) {
        //uncomment below and update the code to test sushiswapGetPairsHistorical
        //instance.sushiswapGetPairsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapGetSwapsHistorical', function() {
      it('should call sushiswapGetSwapsHistorical successfully', function(done) {
        //uncomment below and update the code to test sushiswapGetSwapsHistorical
        //instance.sushiswapGetSwapsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapGetTokenDayDataHistorical', function() {
      it('should call sushiswapGetTokenDayDataHistorical successfully', function(done) {
        //uncomment below and update the code to test sushiswapGetTokenDayDataHistorical
        //instance.sushiswapGetTokenDayDataHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapGetTokensHistorical', function() {
      it('should call sushiswapGetTokensHistorical successfully', function(done) {
        //uncomment below and update the code to test sushiswapGetTokensHistorical
        //instance.sushiswapGetTokensHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapGetTransactionsHistorical', function() {
      it('should call sushiswapGetTransactionsHistorical successfully', function(done) {
        //uncomment below and update the code to test sushiswapGetTransactionsHistorical
        //instance.sushiswapGetTransactionsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapGetUsersHistorical', function() {
      it('should call sushiswapGetUsersHistorical successfully', function(done) {
        //uncomment below and update the code to test sushiswapGetUsersHistorical
        //instance.sushiswapGetUsersHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapHourDataCurrent', function() {
      it('should call sushiswapHourDataCurrent successfully', function(done) {
        //uncomment below and update the code to test sushiswapHourDataCurrent
        //instance.sushiswapHourDataCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapLiquidityPositionSnapshotsCurrent', function() {
      it('should call sushiswapLiquidityPositionSnapshotsCurrent successfully', function(done) {
        //uncomment below and update the code to test sushiswapLiquidityPositionSnapshotsCurrent
        //instance.sushiswapLiquidityPositionSnapshotsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapLiquidityPositionsCurrent', function() {
      it('should call sushiswapLiquidityPositionsCurrent successfully', function(done) {
        //uncomment below and update the code to test sushiswapLiquidityPositionsCurrent
        //instance.sushiswapLiquidityPositionsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapMintsCurrent', function() {
      it('should call sushiswapMintsCurrent successfully', function(done) {
        //uncomment below and update the code to test sushiswapMintsCurrent
        //instance.sushiswapMintsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapPairDayDataCurrent', function() {
      it('should call sushiswapPairDayDataCurrent successfully', function(done) {
        //uncomment below and update the code to test sushiswapPairDayDataCurrent
        //instance.sushiswapPairDayDataCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapPairHourDataCurrent', function() {
      it('should call sushiswapPairHourDataCurrent successfully', function(done) {
        //uncomment below and update the code to test sushiswapPairHourDataCurrent
        //instance.sushiswapPairHourDataCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapPairsCurrent', function() {
      it('should call sushiswapPairsCurrent successfully', function(done) {
        //uncomment below and update the code to test sushiswapPairsCurrent
        //instance.sushiswapPairsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapSwapsCurrent', function() {
      it('should call sushiswapSwapsCurrent successfully', function(done) {
        //uncomment below and update the code to test sushiswapSwapsCurrent
        //instance.sushiswapSwapsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapTokenDayDataCurrent', function() {
      it('should call sushiswapTokenDayDataCurrent successfully', function(done) {
        //uncomment below and update the code to test sushiswapTokenDayDataCurrent
        //instance.sushiswapTokenDayDataCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapTokensCurrent', function() {
      it('should call sushiswapTokensCurrent successfully', function(done) {
        //uncomment below and update the code to test sushiswapTokensCurrent
        //instance.sushiswapTokensCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapTransactionsCurrent', function() {
      it('should call sushiswapTransactionsCurrent successfully', function(done) {
        //uncomment below and update the code to test sushiswapTransactionsCurrent
        //instance.sushiswapTransactionsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sushiswapUsersCurrent', function() {
      it('should call sushiswapUsersCurrent successfully', function(done) {
        //uncomment below and update the code to test sushiswapUsersCurrent
        //instance.sushiswapUsersCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
