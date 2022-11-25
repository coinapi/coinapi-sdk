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
    instance = new OnChainDappsRestApi.CurveContractDTO();
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

  describe('CurveContractDTO', function() {
    it('should create an instance of CurveContractDTO', function() {
      // uncomment below and update the code to test CurveContractDTO
      //var instance = new OnChainDappsRestApi.CurveContractDTO();
      //expect(instance).to.be.a(OnChainDappsRestApi.CurveContractDTO);
    });

    it('should have the property entryTime (base name: "entry_time")', function() {
      // uncomment below and update the code to test the property entryTime
      //var instance = new OnChainDappsRestApi.CurveContractDTO();
      //expect(instance).to.be();
    });

    it('should have the property recvTime (base name: "recv_time")', function() {
      // uncomment below and update the code to test the property recvTime
      //var instance = new OnChainDappsRestApi.CurveContractDTO();
      //expect(instance).to.be();
    });

    it('should have the property blockNumber (base name: "block_number")', function() {
      // uncomment below and update the code to test the property blockNumber
      //var instance = new OnChainDappsRestApi.CurveContractDTO();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new OnChainDappsRestApi.CurveContractDTO();
      //expect(instance).to.be();
    });

    it('should have the property description (base name: "description")', function() {
      // uncomment below and update the code to test the property description
      //var instance = new OnChainDappsRestApi.CurveContractDTO();
      //expect(instance).to.be();
    });

    it('should have the property added (base name: "added")', function() {
      // uncomment below and update the code to test the property added
      //var instance = new OnChainDappsRestApi.CurveContractDTO();
      //expect(instance).to.be();
    });

    it('should have the property addedAtBlock (base name: "added_at_block")', function() {
      // uncomment below and update the code to test the property addedAtBlock
      //var instance = new OnChainDappsRestApi.CurveContractDTO();
      //expect(instance).to.be();
    });

    it('should have the property addedAtTransaction (base name: "added_at_transaction")', function() {
      // uncomment below and update the code to test the property addedAtTransaction
      //var instance = new OnChainDappsRestApi.CurveContractDTO();
      //expect(instance).to.be();
    });

    it('should have the property modified (base name: "modified")', function() {
      // uncomment below and update the code to test the property modified
      //var instance = new OnChainDappsRestApi.CurveContractDTO();
      //expect(instance).to.be();
    });

    it('should have the property modifiedAtBlock (base name: "modified_at_block")', function() {
      // uncomment below and update the code to test the property modifiedAtBlock
      //var instance = new OnChainDappsRestApi.CurveContractDTO();
      //expect(instance).to.be();
    });

    it('should have the property modifiedAtTransaction (base name: "modified_at_transaction")', function() {
      // uncomment below and update the code to test the property modifiedAtTransaction
      //var instance = new OnChainDappsRestApi.CurveContractDTO();
      //expect(instance).to.be();
    });

    it('should have the property vid (base name: "vid")', function() {
      // uncomment below and update the code to test the property vid
      //var instance = new OnChainDappsRestApi.CurveContractDTO();
      //expect(instance).to.be();
    });

  });

}));
