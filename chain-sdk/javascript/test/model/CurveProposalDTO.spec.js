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
    instance = new OnChainApi.CurveProposalDTO();
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

  describe('CurveProposalDTO', function() {
    it('should create an instance of CurveProposalDTO', function() {
      // uncomment below and update the code to test CurveProposalDTO
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be.a(OnChainApi.CurveProposalDTO);
    });

    it('should have the property entryTime (base name: "entry_time")', function() {
      // uncomment below and update the code to test the property entryTime
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property recvTime (base name: "recv_time")', function() {
      // uncomment below and update the code to test the property recvTime
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property blockNumber (base name: "block_number")', function() {
      // uncomment below and update the code to test the property blockNumber
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property number (base name: "number")', function() {
      // uncomment below and update the code to test the property number
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property app (base name: "app")', function() {
      // uncomment below and update the code to test the property app
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property creator (base name: "creator")', function() {
      // uncomment below and update the code to test the property creator
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property executionScript (base name: "execution_script")', function() {
      // uncomment below and update the code to test the property executionScript
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property expireDate (base name: "expire_date")', function() {
      // uncomment below and update the code to test the property expireDate
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property minimumQuorum (base name: "minimum_quorum")', function() {
      // uncomment below and update the code to test the property minimumQuorum
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property requiredSupport (base name: "required_support")', function() {
      // uncomment below and update the code to test the property requiredSupport
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property snapshotBlock (base name: "snapshot_block")', function() {
      // uncomment below and update the code to test the property snapshotBlock
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property votingPower (base name: "voting_power")', function() {
      // uncomment below and update the code to test the property votingPower
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property text (base name: "text")', function() {
      // uncomment below and update the code to test the property text
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property voteCount (base name: "vote_count")', function() {
      // uncomment below and update the code to test the property voteCount
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property positiveVoteCount (base name: "positive_vote_count")', function() {
      // uncomment below and update the code to test the property positiveVoteCount
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property negativeVoteCount (base name: "negative_vote_count")', function() {
      // uncomment below and update the code to test the property negativeVoteCount
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property currentQuorum (base name: "current_quorum")', function() {
      // uncomment below and update the code to test the property currentQuorum
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property currentSupport (base name: "current_support")', function() {
      // uncomment below and update the code to test the property currentSupport
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property stakedSupport (base name: "staked_support")', function() {
      // uncomment below and update the code to test the property stakedSupport
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property totalStaked (base name: "total_staked")', function() {
      // uncomment below and update the code to test the property totalStaked
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property created (base name: "created")', function() {
      // uncomment below and update the code to test the property created
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property createdAtBlock (base name: "created_at_block")', function() {
      // uncomment below and update the code to test the property createdAtBlock
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property createdAtTransaction (base name: "created_at_transaction")', function() {
      // uncomment below and update the code to test the property createdAtTransaction
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property updated (base name: "updated")', function() {
      // uncomment below and update the code to test the property updated
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property updatedAtBlock (base name: "updated_at_block")', function() {
      // uncomment below and update the code to test the property updatedAtBlock
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property updatedAtTransaction (base name: "updated_at_transaction")', function() {
      // uncomment below and update the code to test the property updatedAtTransaction
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property executed (base name: "executed")', function() {
      // uncomment below and update the code to test the property executed
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property executedAtBlock (base name: "executed_at_block")', function() {
      // uncomment below and update the code to test the property executedAtBlock
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property executedAtTransaction (base name: "executed_at_transaction")', function() {
      // uncomment below and update the code to test the property executedAtTransaction
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

    it('should have the property vid (base name: "vid")', function() {
      // uncomment below and update the code to test the property vid
      //var instance = new OnChainApi.CurveProposalDTO();
      //expect(instance).to.be();
    });

  });

}));
