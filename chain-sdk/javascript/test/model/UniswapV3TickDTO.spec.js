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
    instance = new OnChainDappsRestApi.UniswapV3TickDTO();
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

  describe('UniswapV3TickDTO', function() {
    it('should create an instance of UniswapV3TickDTO', function() {
      // uncomment below and update the code to test UniswapV3TickDTO
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be.a(OnChainDappsRestApi.UniswapV3TickDTO);
    });

    it('should have the property entryTime (base name: "entry_time")', function() {
      // uncomment below and update the code to test the property entryTime
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property recvTime (base name: "recv_time")', function() {
      // uncomment below and update the code to test the property recvTime
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property blockNumber (base name: "block_number")', function() {
      // uncomment below and update the code to test the property blockNumber
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property vid (base name: "vid")', function() {
      // uncomment below and update the code to test the property vid
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property poolAddress (base name: "pool_address")', function() {
      // uncomment below and update the code to test the property poolAddress
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property tickIdx (base name: "tick_idx")', function() {
      // uncomment below and update the code to test the property tickIdx
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property pool (base name: "pool")', function() {
      // uncomment below and update the code to test the property pool
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property liquidityGross (base name: "liquidity_gross")', function() {
      // uncomment below and update the code to test the property liquidityGross
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property liquidityNet (base name: "liquidity_net")', function() {
      // uncomment below and update the code to test the property liquidityNet
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property price0 (base name: "price_0")', function() {
      // uncomment below and update the code to test the property price0
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property price1 (base name: "price_1")', function() {
      // uncomment below and update the code to test the property price1
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property volumeToken0 (base name: "volume_token_0")', function() {
      // uncomment below and update the code to test the property volumeToken0
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property volumeToken1 (base name: "volume_token_1")', function() {
      // uncomment below and update the code to test the property volumeToken1
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property volumeUsd (base name: "volume_usd")', function() {
      // uncomment below and update the code to test the property volumeUsd
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property untrackedVolumeUsd (base name: "untracked_volume_usd")', function() {
      // uncomment below and update the code to test the property untrackedVolumeUsd
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property feesUsd (base name: "fees_usd")', function() {
      // uncomment below and update the code to test the property feesUsd
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property collectedFeesToken0 (base name: "collected_fees_token_0")', function() {
      // uncomment below and update the code to test the property collectedFeesToken0
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property collectedFeesToken1 (base name: "collected_fees_token_1")', function() {
      // uncomment below and update the code to test the property collectedFeesToken1
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property collectedFeesUsd (base name: "collected_fees_usd")', function() {
      // uncomment below and update the code to test the property collectedFeesUsd
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property createdAtTimestamp (base name: "created_at_timestamp")', function() {
      // uncomment below and update the code to test the property createdAtTimestamp
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property liquidityProviderCount (base name: "liquidity_provider_count")', function() {
      // uncomment below and update the code to test the property liquidityProviderCount
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property feeGrowthOutside0x128 (base name: "fee_growth_outside_0x128")', function() {
      // uncomment below and update the code to test the property feeGrowthOutside0x128
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

    it('should have the property feeGrowthOutside1x128 (base name: "fee_growth_outside_1x128")', function() {
      // uncomment below and update the code to test the property feeGrowthOutside1x128
      //var instance = new OnChainDappsRestApi.UniswapV3TickDTO();
      //expect(instance).to.be();
    });

  });

}));