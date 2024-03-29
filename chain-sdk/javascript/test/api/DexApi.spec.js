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
    instance = new OnChainDappsRestApi.DexApi();
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

  describe('DexApi', function() {
    describe('dexBatchesCurrent', function() {
      it('should call dexBatchesCurrent successfully', function(done) {
        //uncomment below and update the code to test dexBatchesCurrent
        //instance.dexBatchesCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexDepositsCurrent', function() {
      it('should call dexDepositsCurrent successfully', function(done) {
        //uncomment below and update the code to test dexDepositsCurrent
        //instance.dexDepositsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexGetBatchesHistorical', function() {
      it('should call dexGetBatchesHistorical successfully', function(done) {
        //uncomment below and update the code to test dexGetBatchesHistorical
        //instance.dexGetBatchesHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexGetDepositsHistorical', function() {
      it('should call dexGetDepositsHistorical successfully', function(done) {
        //uncomment below and update the code to test dexGetDepositsHistorical
        //instance.dexGetDepositsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexGetOrdersHistorical', function() {
      it('should call dexGetOrdersHistorical successfully', function(done) {
        //uncomment below and update the code to test dexGetOrdersHistorical
        //instance.dexGetOrdersHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexGetPricesHistorical', function() {
      it('should call dexGetPricesHistorical successfully', function(done) {
        //uncomment below and update the code to test dexGetPricesHistorical
        //instance.dexGetPricesHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexGetSolutionsHistorical', function() {
      it('should call dexGetSolutionsHistorical successfully', function(done) {
        //uncomment below and update the code to test dexGetSolutionsHistorical
        //instance.dexGetSolutionsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexGetStatsHistorical', function() {
      it('should call dexGetStatsHistorical successfully', function(done) {
        //uncomment below and update the code to test dexGetStatsHistorical
        //instance.dexGetStatsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexGetTokensHistorical', function() {
      it('should call dexGetTokensHistorical successfully', function(done) {
        //uncomment below and update the code to test dexGetTokensHistorical
        //instance.dexGetTokensHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexGetTradesHistorical', function() {
      it('should call dexGetTradesHistorical successfully', function(done) {
        //uncomment below and update the code to test dexGetTradesHistorical
        //instance.dexGetTradesHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexGetUsersHistorical', function() {
      it('should call dexGetUsersHistorical successfully', function(done) {
        //uncomment below and update the code to test dexGetUsersHistorical
        //instance.dexGetUsersHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexGetWithdrawRequestsHistorical', function() {
      it('should call dexGetWithdrawRequestsHistorical successfully', function(done) {
        //uncomment below and update the code to test dexGetWithdrawRequestsHistorical
        //instance.dexGetWithdrawRequestsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexGetWithdrawsHistorical', function() {
      it('should call dexGetWithdrawsHistorical successfully', function(done) {
        //uncomment below and update the code to test dexGetWithdrawsHistorical
        //instance.dexGetWithdrawsHistorical(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexOrdersCurrent', function() {
      it('should call dexOrdersCurrent successfully', function(done) {
        //uncomment below and update the code to test dexOrdersCurrent
        //instance.dexOrdersCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexPricesCurrent', function() {
      it('should call dexPricesCurrent successfully', function(done) {
        //uncomment below and update the code to test dexPricesCurrent
        //instance.dexPricesCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexSolutionsCurrent', function() {
      it('should call dexSolutionsCurrent successfully', function(done) {
        //uncomment below and update the code to test dexSolutionsCurrent
        //instance.dexSolutionsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexStatsCurrent', function() {
      it('should call dexStatsCurrent successfully', function(done) {
        //uncomment below and update the code to test dexStatsCurrent
        //instance.dexStatsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexTokensCurrent', function() {
      it('should call dexTokensCurrent successfully', function(done) {
        //uncomment below and update the code to test dexTokensCurrent
        //instance.dexTokensCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexTradesCurrent', function() {
      it('should call dexTradesCurrent successfully', function(done) {
        //uncomment below and update the code to test dexTradesCurrent
        //instance.dexTradesCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexUsersCurrent', function() {
      it('should call dexUsersCurrent successfully', function(done) {
        //uncomment below and update the code to test dexUsersCurrent
        //instance.dexUsersCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexWithdrawRequestsCurrent', function() {
      it('should call dexWithdrawRequestsCurrent successfully', function(done) {
        //uncomment below and update the code to test dexWithdrawRequestsCurrent
        //instance.dexWithdrawRequestsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('dexWithdrawsCurrent', function() {
      it('should call dexWithdrawsCurrent successfully', function(done) {
        //uncomment below and update the code to test dexWithdrawsCurrent
        //instance.dexWithdrawsCurrent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
