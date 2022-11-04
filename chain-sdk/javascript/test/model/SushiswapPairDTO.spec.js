/**
 * OnChain API
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
    factory(root.expect, root.OnChainApi);
  }
}(this, function(expect, OnChainApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new OnChainApi.SushiswapPairDTO();
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

  describe('SushiswapPairDTO', function() {
    it('should create an instance of SushiswapPairDTO', function() {
      // uncomment below and update the code to test SushiswapPairDTO
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be.a(OnChainApi.SushiswapPairDTO);
    });

    it('should have the property entryTime (base name: "entry_time")', function() {
      // uncomment below and update the code to test the property entryTime
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property recvTime (base name: "recv_time")', function() {
      // uncomment below and update the code to test the property recvTime
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property blockNumber (base name: "block_number")', function() {
      // uncomment below and update the code to test the property blockNumber
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property factory (base name: "factory")', function() {
      // uncomment below and update the code to test the property factory
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property token0 (base name: "token_0")', function() {
      // uncomment below and update the code to test the property token0
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property token1 (base name: "token_1")', function() {
      // uncomment below and update the code to test the property token1
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property reserve0 (base name: "reserve_0")', function() {
      // uncomment below and update the code to test the property reserve0
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property reserve1 (base name: "reserve_1")', function() {
      // uncomment below and update the code to test the property reserve1
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property totalSupply (base name: "total_supply")', function() {
      // uncomment below and update the code to test the property totalSupply
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property reserveEth (base name: "reserve_eth")', function() {
      // uncomment below and update the code to test the property reserveEth
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property reserveUsd (base name: "reserve_usd")', function() {
      // uncomment below and update the code to test the property reserveUsd
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property trackedReserveEth (base name: "tracked_reserve_eth")', function() {
      // uncomment below and update the code to test the property trackedReserveEth
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property token0Price (base name: "token_0_price")', function() {
      // uncomment below and update the code to test the property token0Price
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property token1Price (base name: "token_1_price")', function() {
      // uncomment below and update the code to test the property token1Price
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property volumeToken0 (base name: "volume_token_0")', function() {
      // uncomment below and update the code to test the property volumeToken0
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property volumeToken1 (base name: "volume_token_1")', function() {
      // uncomment below and update the code to test the property volumeToken1
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property volumeUsd (base name: "volume_usd")', function() {
      // uncomment below and update the code to test the property volumeUsd
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property untrackedVolumeUsd (base name: "untracked_volume_usd")', function() {
      // uncomment below and update the code to test the property untrackedVolumeUsd
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property txCount (base name: "tx_count")', function() {
      // uncomment below and update the code to test the property txCount
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property liquidityProviderCount (base name: "liquidity_provider_count")', function() {
      // uncomment below and update the code to test the property liquidityProviderCount
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property timestamp (base name: "timestamp")', function() {
      // uncomment below and update the code to test the property timestamp
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property block (base name: "block")', function() {
      // uncomment below and update the code to test the property block
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property vid (base name: "vid")', function() {
      // uncomment below and update the code to test the property vid
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

    it('should have the property evaluatedAsk (base name: "evaluated_ask")', function() {
      // uncomment below and update the code to test the property evaluatedAsk
      //var instance = new OnChainApi.SushiswapPairDTO();
      //expect(instance).to.be();
    });

  });

}));
