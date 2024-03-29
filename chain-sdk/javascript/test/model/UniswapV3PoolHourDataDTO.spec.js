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
    instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
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

  describe('UniswapV3PoolHourDataDTO', function() {
    it('should create an instance of UniswapV3PoolHourDataDTO', function() {
      // uncomment below and update the code to test UniswapV3PoolHourDataDTO
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be.a(OnChainDappsRestApi.UniswapV3PoolHourDataDTO);
    });

    it('should have the property entryTime (base name: "entry_time")', function() {
      // uncomment below and update the code to test the property entryTime
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property recvTime (base name: "recv_time")', function() {
      // uncomment below and update the code to test the property recvTime
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property blockNumber (base name: "block_number")', function() {
      // uncomment below and update the code to test the property blockNumber
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property periodStartUnix (base name: "period_start_unix")', function() {
      // uncomment below and update the code to test the property periodStartUnix
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property pool (base name: "pool")', function() {
      // uncomment below and update the code to test the property pool
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property liquidity (base name: "liquidity")', function() {
      // uncomment below and update the code to test the property liquidity
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property sqrtPrice (base name: "sqrt_price")', function() {
      // uncomment below and update the code to test the property sqrtPrice
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property token0Price (base name: "token_0_price")', function() {
      // uncomment below and update the code to test the property token0Price
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property token1Price (base name: "token_1_price")', function() {
      // uncomment below and update the code to test the property token1Price
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property tick (base name: "tick")', function() {
      // uncomment below and update the code to test the property tick
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property feeGrowthGlobal0x128 (base name: "fee_growth_global_0x128")', function() {
      // uncomment below and update the code to test the property feeGrowthGlobal0x128
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property feeGrowthGlobal1x128 (base name: "fee_growth_global_1x128")', function() {
      // uncomment below and update the code to test the property feeGrowthGlobal1x128
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property tvlUsd (base name: "tvl_usd")', function() {
      // uncomment below and update the code to test the property tvlUsd
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property volumeToken0 (base name: "volume_token_0")', function() {
      // uncomment below and update the code to test the property volumeToken0
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property volumeToken1 (base name: "volume_token_1")', function() {
      // uncomment below and update the code to test the property volumeToken1
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property volumeUsd (base name: "volume_usd")', function() {
      // uncomment below and update the code to test the property volumeUsd
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property feesUsd (base name: "fees_usd")', function() {
      // uncomment below and update the code to test the property feesUsd
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property txCount (base name: "tx_count")', function() {
      // uncomment below and update the code to test the property txCount
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property open (base name: "open")', function() {
      // uncomment below and update the code to test the property open
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property high (base name: "high")', function() {
      // uncomment below and update the code to test the property high
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property low (base name: "low")', function() {
      // uncomment below and update the code to test the property low
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property close (base name: "close")', function() {
      // uncomment below and update the code to test the property close
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

    it('should have the property vid (base name: "vid")', function() {
      // uncomment below and update the code to test the property vid
      //var instance = new OnChainDappsRestApi.UniswapV3PoolHourDataDTO();
      //expect(instance).to.be();
    });

  });

}));
