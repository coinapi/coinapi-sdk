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
    instance = new OnChainDappsRestApi.CowSettlementDTO();
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

  describe('CowSettlementDTO', function() {
    it('should create an instance of CowSettlementDTO', function() {
      // uncomment below and update the code to test CowSettlementDTO
      //var instance = new OnChainDappsRestApi.CowSettlementDTO();
      //expect(instance).to.be.a(OnChainDappsRestApi.CowSettlementDTO);
    });

    it('should have the property entryTime (base name: "entry_time")', function() {
      // uncomment below and update the code to test the property entryTime
      //var instance = new OnChainDappsRestApi.CowSettlementDTO();
      //expect(instance).to.be();
    });

    it('should have the property recvTime (base name: "recv_time")', function() {
      // uncomment below and update the code to test the property recvTime
      //var instance = new OnChainDappsRestApi.CowSettlementDTO();
      //expect(instance).to.be();
    });

    it('should have the property blockNumber (base name: "block_number")', function() {
      // uncomment below and update the code to test the property blockNumber
      //var instance = new OnChainDappsRestApi.CowSettlementDTO();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new OnChainDappsRestApi.CowSettlementDTO();
      //expect(instance).to.be();
    });

    it('should have the property solver (base name: "solver")', function() {
      // uncomment below and update the code to test the property solver
      //var instance = new OnChainDappsRestApi.CowSettlementDTO();
      //expect(instance).to.be();
    });

    it('should have the property txHash (base name: "tx_hash")', function() {
      // uncomment below and update the code to test the property txHash
      //var instance = new OnChainDappsRestApi.CowSettlementDTO();
      //expect(instance).to.be();
    });

    it('should have the property firstTradeTimestamp (base name: "first_trade_timestamp")', function() {
      // uncomment below and update the code to test the property firstTradeTimestamp
      //var instance = new OnChainDappsRestApi.CowSettlementDTO();
      //expect(instance).to.be();
    });

    it('should have the property vid (base name: "vid")', function() {
      // uncomment below and update the code to test the property vid
      //var instance = new OnChainDappsRestApi.CowSettlementDTO();
      //expect(instance).to.be();
    });

  });

}));
