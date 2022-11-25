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

import ApiClient from '../ApiClient';

/**
 * The CurveProposalDTO model module.
 * @module model/CurveProposalDTO
 * @version v1
 */
class CurveProposalDTO {
    /**
     * Constructs a new <code>CurveProposalDTO</code>.
     * @alias module:model/CurveProposalDTO
     */
    constructor() { 
        
        CurveProposalDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CurveProposalDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CurveProposalDTO} obj Optional instance to populate.
     * @return {module:model/CurveProposalDTO} The populated <code>CurveProposalDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CurveProposalDTO();

            if (data.hasOwnProperty('entry_time')) {
                obj['entry_time'] = ApiClient.convertToType(data['entry_time'], 'Date');
            }
            if (data.hasOwnProperty('recv_time')) {
                obj['recv_time'] = ApiClient.convertToType(data['recv_time'], 'Date');
            }
            if (data.hasOwnProperty('block_number')) {
                obj['block_number'] = ApiClient.convertToType(data['block_number'], 'Number');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('number')) {
                obj['number'] = ApiClient.convertToType(data['number'], 'String');
            }
            if (data.hasOwnProperty('app')) {
                obj['app'] = ApiClient.convertToType(data['app'], 'String');
            }
            if (data.hasOwnProperty('creator')) {
                obj['creator'] = ApiClient.convertToType(data['creator'], 'String');
            }
            if (data.hasOwnProperty('execution_script')) {
                obj['execution_script'] = ApiClient.convertToType(data['execution_script'], 'String');
            }
            if (data.hasOwnProperty('expire_date')) {
                obj['expire_date'] = ApiClient.convertToType(data['expire_date'], 'String');
            }
            if (data.hasOwnProperty('minimum_quorum')) {
                obj['minimum_quorum'] = ApiClient.convertToType(data['minimum_quorum'], 'String');
            }
            if (data.hasOwnProperty('required_support')) {
                obj['required_support'] = ApiClient.convertToType(data['required_support'], 'String');
            }
            if (data.hasOwnProperty('snapshot_block')) {
                obj['snapshot_block'] = ApiClient.convertToType(data['snapshot_block'], 'String');
            }
            if (data.hasOwnProperty('voting_power')) {
                obj['voting_power'] = ApiClient.convertToType(data['voting_power'], 'String');
            }
            if (data.hasOwnProperty('metadata')) {
                obj['metadata'] = ApiClient.convertToType(data['metadata'], 'String');
            }
            if (data.hasOwnProperty('text')) {
                obj['text'] = ApiClient.convertToType(data['text'], 'String');
            }
            if (data.hasOwnProperty('vote_count')) {
                obj['vote_count'] = ApiClient.convertToType(data['vote_count'], 'String');
            }
            if (data.hasOwnProperty('positive_vote_count')) {
                obj['positive_vote_count'] = ApiClient.convertToType(data['positive_vote_count'], 'String');
            }
            if (data.hasOwnProperty('negative_vote_count')) {
                obj['negative_vote_count'] = ApiClient.convertToType(data['negative_vote_count'], 'String');
            }
            if (data.hasOwnProperty('current_quorum')) {
                obj['current_quorum'] = ApiClient.convertToType(data['current_quorum'], 'String');
            }
            if (data.hasOwnProperty('current_support')) {
                obj['current_support'] = ApiClient.convertToType(data['current_support'], 'String');
            }
            if (data.hasOwnProperty('staked_support')) {
                obj['staked_support'] = ApiClient.convertToType(data['staked_support'], 'String');
            }
            if (data.hasOwnProperty('total_staked')) {
                obj['total_staked'] = ApiClient.convertToType(data['total_staked'], 'String');
            }
            if (data.hasOwnProperty('created')) {
                obj['created'] = ApiClient.convertToType(data['created'], 'String');
            }
            if (data.hasOwnProperty('created_at_block')) {
                obj['created_at_block'] = ApiClient.convertToType(data['created_at_block'], 'String');
            }
            if (data.hasOwnProperty('created_at_transaction')) {
                obj['created_at_transaction'] = ApiClient.convertToType(data['created_at_transaction'], 'String');
            }
            if (data.hasOwnProperty('updated')) {
                obj['updated'] = ApiClient.convertToType(data['updated'], 'String');
            }
            if (data.hasOwnProperty('updated_at_block')) {
                obj['updated_at_block'] = ApiClient.convertToType(data['updated_at_block'], 'String');
            }
            if (data.hasOwnProperty('updated_at_transaction')) {
                obj['updated_at_transaction'] = ApiClient.convertToType(data['updated_at_transaction'], 'String');
            }
            if (data.hasOwnProperty('executed')) {
                obj['executed'] = ApiClient.convertToType(data['executed'], 'String');
            }
            if (data.hasOwnProperty('executed_at_block')) {
                obj['executed_at_block'] = ApiClient.convertToType(data['executed_at_block'], 'String');
            }
            if (data.hasOwnProperty('executed_at_transaction')) {
                obj['executed_at_transaction'] = ApiClient.convertToType(data['executed_at_transaction'], 'String');
            }
            if (data.hasOwnProperty('vid')) {
                obj['vid'] = ApiClient.convertToType(data['vid'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CurveProposalDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CurveProposalDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['number'] && !(typeof data['number'] === 'string' || data['number'] instanceof String)) {
            throw new Error("Expected the field `number` to be a primitive type in the JSON string but got " + data['number']);
        }
        // ensure the json data is a string
        if (data['app'] && !(typeof data['app'] === 'string' || data['app'] instanceof String)) {
            throw new Error("Expected the field `app` to be a primitive type in the JSON string but got " + data['app']);
        }
        // ensure the json data is a string
        if (data['creator'] && !(typeof data['creator'] === 'string' || data['creator'] instanceof String)) {
            throw new Error("Expected the field `creator` to be a primitive type in the JSON string but got " + data['creator']);
        }
        // ensure the json data is a string
        if (data['execution_script'] && !(typeof data['execution_script'] === 'string' || data['execution_script'] instanceof String)) {
            throw new Error("Expected the field `execution_script` to be a primitive type in the JSON string but got " + data['execution_script']);
        }
        // ensure the json data is a string
        if (data['expire_date'] && !(typeof data['expire_date'] === 'string' || data['expire_date'] instanceof String)) {
            throw new Error("Expected the field `expire_date` to be a primitive type in the JSON string but got " + data['expire_date']);
        }
        // ensure the json data is a string
        if (data['minimum_quorum'] && !(typeof data['minimum_quorum'] === 'string' || data['minimum_quorum'] instanceof String)) {
            throw new Error("Expected the field `minimum_quorum` to be a primitive type in the JSON string but got " + data['minimum_quorum']);
        }
        // ensure the json data is a string
        if (data['required_support'] && !(typeof data['required_support'] === 'string' || data['required_support'] instanceof String)) {
            throw new Error("Expected the field `required_support` to be a primitive type in the JSON string but got " + data['required_support']);
        }
        // ensure the json data is a string
        if (data['snapshot_block'] && !(typeof data['snapshot_block'] === 'string' || data['snapshot_block'] instanceof String)) {
            throw new Error("Expected the field `snapshot_block` to be a primitive type in the JSON string but got " + data['snapshot_block']);
        }
        // ensure the json data is a string
        if (data['voting_power'] && !(typeof data['voting_power'] === 'string' || data['voting_power'] instanceof String)) {
            throw new Error("Expected the field `voting_power` to be a primitive type in the JSON string but got " + data['voting_power']);
        }
        // ensure the json data is a string
        if (data['metadata'] && !(typeof data['metadata'] === 'string' || data['metadata'] instanceof String)) {
            throw new Error("Expected the field `metadata` to be a primitive type in the JSON string but got " + data['metadata']);
        }
        // ensure the json data is a string
        if (data['text'] && !(typeof data['text'] === 'string' || data['text'] instanceof String)) {
            throw new Error("Expected the field `text` to be a primitive type in the JSON string but got " + data['text']);
        }
        // ensure the json data is a string
        if (data['vote_count'] && !(typeof data['vote_count'] === 'string' || data['vote_count'] instanceof String)) {
            throw new Error("Expected the field `vote_count` to be a primitive type in the JSON string but got " + data['vote_count']);
        }
        // ensure the json data is a string
        if (data['positive_vote_count'] && !(typeof data['positive_vote_count'] === 'string' || data['positive_vote_count'] instanceof String)) {
            throw new Error("Expected the field `positive_vote_count` to be a primitive type in the JSON string but got " + data['positive_vote_count']);
        }
        // ensure the json data is a string
        if (data['negative_vote_count'] && !(typeof data['negative_vote_count'] === 'string' || data['negative_vote_count'] instanceof String)) {
            throw new Error("Expected the field `negative_vote_count` to be a primitive type in the JSON string but got " + data['negative_vote_count']);
        }
        // ensure the json data is a string
        if (data['current_quorum'] && !(typeof data['current_quorum'] === 'string' || data['current_quorum'] instanceof String)) {
            throw new Error("Expected the field `current_quorum` to be a primitive type in the JSON string but got " + data['current_quorum']);
        }
        // ensure the json data is a string
        if (data['current_support'] && !(typeof data['current_support'] === 'string' || data['current_support'] instanceof String)) {
            throw new Error("Expected the field `current_support` to be a primitive type in the JSON string but got " + data['current_support']);
        }
        // ensure the json data is a string
        if (data['staked_support'] && !(typeof data['staked_support'] === 'string' || data['staked_support'] instanceof String)) {
            throw new Error("Expected the field `staked_support` to be a primitive type in the JSON string but got " + data['staked_support']);
        }
        // ensure the json data is a string
        if (data['total_staked'] && !(typeof data['total_staked'] === 'string' || data['total_staked'] instanceof String)) {
            throw new Error("Expected the field `total_staked` to be a primitive type in the JSON string but got " + data['total_staked']);
        }
        // ensure the json data is a string
        if (data['created'] && !(typeof data['created'] === 'string' || data['created'] instanceof String)) {
            throw new Error("Expected the field `created` to be a primitive type in the JSON string but got " + data['created']);
        }
        // ensure the json data is a string
        if (data['created_at_block'] && !(typeof data['created_at_block'] === 'string' || data['created_at_block'] instanceof String)) {
            throw new Error("Expected the field `created_at_block` to be a primitive type in the JSON string but got " + data['created_at_block']);
        }
        // ensure the json data is a string
        if (data['created_at_transaction'] && !(typeof data['created_at_transaction'] === 'string' || data['created_at_transaction'] instanceof String)) {
            throw new Error("Expected the field `created_at_transaction` to be a primitive type in the JSON string but got " + data['created_at_transaction']);
        }
        // ensure the json data is a string
        if (data['updated'] && !(typeof data['updated'] === 'string' || data['updated'] instanceof String)) {
            throw new Error("Expected the field `updated` to be a primitive type in the JSON string but got " + data['updated']);
        }
        // ensure the json data is a string
        if (data['updated_at_block'] && !(typeof data['updated_at_block'] === 'string' || data['updated_at_block'] instanceof String)) {
            throw new Error("Expected the field `updated_at_block` to be a primitive type in the JSON string but got " + data['updated_at_block']);
        }
        // ensure the json data is a string
        if (data['updated_at_transaction'] && !(typeof data['updated_at_transaction'] === 'string' || data['updated_at_transaction'] instanceof String)) {
            throw new Error("Expected the field `updated_at_transaction` to be a primitive type in the JSON string but got " + data['updated_at_transaction']);
        }
        // ensure the json data is a string
        if (data['executed'] && !(typeof data['executed'] === 'string' || data['executed'] instanceof String)) {
            throw new Error("Expected the field `executed` to be a primitive type in the JSON string but got " + data['executed']);
        }
        // ensure the json data is a string
        if (data['executed_at_block'] && !(typeof data['executed_at_block'] === 'string' || data['executed_at_block'] instanceof String)) {
            throw new Error("Expected the field `executed_at_block` to be a primitive type in the JSON string but got " + data['executed_at_block']);
        }
        // ensure the json data is a string
        if (data['executed_at_transaction'] && !(typeof data['executed_at_transaction'] === 'string' || data['executed_at_transaction'] instanceof String)) {
            throw new Error("Expected the field `executed_at_transaction` to be a primitive type in the JSON string but got " + data['executed_at_transaction']);
        }

        return true;
    }


}



/**
 * @member {Date} entry_time
 */
CurveProposalDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
CurveProposalDTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
CurveProposalDTO.prototype['block_number'] = undefined;

/**
 * 
 * @member {String} id
 */
CurveProposalDTO.prototype['id'] = undefined;

/**
 * Sequential number in related to the realted voting app.
 * @member {String} number
 */
CurveProposalDTO.prototype['number'] = undefined;

/**
 * Voting app instance.
 * @member {String} app
 */
CurveProposalDTO.prototype['app'] = undefined;

/**
 * Proposal creator's account.
 * @member {String} creator
 */
CurveProposalDTO.prototype['creator'] = undefined;

/**
 * 
 * @member {String} execution_script
 */
CurveProposalDTO.prototype['execution_script'] = undefined;

/**
 * 
 * @member {String} expire_date
 */
CurveProposalDTO.prototype['expire_date'] = undefined;

/**
 * Percentage of positive votes in total possible votes for this proposal to be accepted.
 * @member {String} minimum_quorum
 */
CurveProposalDTO.prototype['minimum_quorum'] = undefined;

/**
 * Percentage of positive votes needed for this proposal to be accepted.
 * @member {String} required_support
 */
CurveProposalDTO.prototype['required_support'] = undefined;

/**
 * 
 * @member {String} snapshot_block
 */
CurveProposalDTO.prototype['snapshot_block'] = undefined;

/**
 * 
 * @member {String} voting_power
 */
CurveProposalDTO.prototype['voting_power'] = undefined;

/**
 * Link to metadata file.
 * @member {String} metadata
 */
CurveProposalDTO.prototype['metadata'] = undefined;

/**
 * Proposal description text.
 * @member {String} text
 */
CurveProposalDTO.prototype['text'] = undefined;

/**
 * Number of votes received by the proposal.
 * @member {String} vote_count
 */
CurveProposalDTO.prototype['vote_count'] = undefined;

/**
 * Number of positive votes (yes) received by the proposal.
 * @member {String} positive_vote_count
 */
CurveProposalDTO.prototype['positive_vote_count'] = undefined;

/**
 * Number of negative votes (no) received by the proposal.
 * @member {String} negative_vote_count
 */
CurveProposalDTO.prototype['negative_vote_count'] = undefined;

/**
 * 
 * @member {String} current_quorum
 */
CurveProposalDTO.prototype['current_quorum'] = undefined;

/**
 * 
 * @member {String} current_support
 */
CurveProposalDTO.prototype['current_support'] = undefined;

/**
 * 
 * @member {String} staked_support
 */
CurveProposalDTO.prototype['staked_support'] = undefined;

/**
 * 
 * @member {String} total_staked
 */
CurveProposalDTO.prototype['total_staked'] = undefined;

/**
 * 
 * @member {String} created
 */
CurveProposalDTO.prototype['created'] = undefined;

/**
 * 
 * @member {String} created_at_block
 */
CurveProposalDTO.prototype['created_at_block'] = undefined;

/**
 * 
 * @member {String} created_at_transaction
 */
CurveProposalDTO.prototype['created_at_transaction'] = undefined;

/**
 * 
 * @member {String} updated
 */
CurveProposalDTO.prototype['updated'] = undefined;

/**
 * 
 * @member {String} updated_at_block
 */
CurveProposalDTO.prototype['updated_at_block'] = undefined;

/**
 * 
 * @member {String} updated_at_transaction
 */
CurveProposalDTO.prototype['updated_at_transaction'] = undefined;

/**
 * 
 * @member {String} executed
 */
CurveProposalDTO.prototype['executed'] = undefined;

/**
 * 
 * @member {String} executed_at_block
 */
CurveProposalDTO.prototype['executed_at_block'] = undefined;

/**
 * 
 * @member {String} executed_at_transaction
 */
CurveProposalDTO.prototype['executed_at_transaction'] = undefined;

/**
 * 
 * @member {Number} vid
 */
CurveProposalDTO.prototype['vid'] = undefined;






export default CurveProposalDTO;

