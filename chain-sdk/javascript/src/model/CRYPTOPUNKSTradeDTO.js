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
 * The CRYPTOPUNKSTradeDTO model module.
 * @module model/CRYPTOPUNKSTradeDTO
 * @version v1
 */
class CRYPTOPUNKSTradeDTO {
    /**
     * Constructs a new <code>CRYPTOPUNKSTradeDTO</code>.
     * @alias module:model/CRYPTOPUNKSTradeDTO
     */
    constructor() { 
        
        CRYPTOPUNKSTradeDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CRYPTOPUNKSTradeDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CRYPTOPUNKSTradeDTO} obj Optional instance to populate.
     * @return {module:model/CRYPTOPUNKSTradeDTO} The populated <code>CRYPTOPUNKSTradeDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CRYPTOPUNKSTradeDTO();

            if (data.hasOwnProperty('entry_time')) {
                obj['entry_time'] = ApiClient.convertToType(data['entry_time'], 'Date');
            }
            if (data.hasOwnProperty('recv_time')) {
                obj['recv_time'] = ApiClient.convertToType(data['recv_time'], 'Date');
            }
            if (data.hasOwnProperty('block_number')) {
                obj['block_number'] = ApiClient.convertToType(data['block_number'], 'String');
            }
            if (data.hasOwnProperty('vid')) {
                obj['vid'] = ApiClient.convertToType(data['vid'], 'Number');
            }
            if (data.hasOwnProperty('block_range')) {
                obj['block_range'] = ApiClient.convertToType(data['block_range'], 'String');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('transaction_hash')) {
                obj['transaction_hash'] = ApiClient.convertToType(data['transaction_hash'], 'String');
            }
            if (data.hasOwnProperty('log_index')) {
                obj['log_index'] = ApiClient.convertToType(data['log_index'], 'Number');
            }
            if (data.hasOwnProperty('timestamp')) {
                obj['timestamp'] = ApiClient.convertToType(data['timestamp'], 'String');
            }
            if (data.hasOwnProperty('is_bundle')) {
                obj['is_bundle'] = ApiClient.convertToType(data['is_bundle'], 'Boolean');
            }
            if (data.hasOwnProperty('collection')) {
                obj['collection'] = ApiClient.convertToType(data['collection'], 'String');
            }
            if (data.hasOwnProperty('token_id')) {
                obj['token_id'] = ApiClient.convertToType(data['token_id'], 'String');
            }
            if (data.hasOwnProperty('amount')) {
                obj['amount'] = ApiClient.convertToType(data['amount'], 'String');
            }
            if (data.hasOwnProperty('price_eth')) {
                obj['price_eth'] = ApiClient.convertToType(data['price_eth'], 'String');
            }
            if (data.hasOwnProperty('buyer')) {
                obj['buyer'] = ApiClient.convertToType(data['buyer'], 'String');
            }
            if (data.hasOwnProperty('seller')) {
                obj['seller'] = ApiClient.convertToType(data['seller'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CRYPTOPUNKSTradeDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CRYPTOPUNKSTradeDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['block_number'] && !(typeof data['block_number'] === 'string' || data['block_number'] instanceof String)) {
            throw new Error("Expected the field `block_number` to be a primitive type in the JSON string but got " + data['block_number']);
        }
        // ensure the json data is a string
        if (data['block_range'] && !(typeof data['block_range'] === 'string' || data['block_range'] instanceof String)) {
            throw new Error("Expected the field `block_range` to be a primitive type in the JSON string but got " + data['block_range']);
        }
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['transaction_hash'] && !(typeof data['transaction_hash'] === 'string' || data['transaction_hash'] instanceof String)) {
            throw new Error("Expected the field `transaction_hash` to be a primitive type in the JSON string but got " + data['transaction_hash']);
        }
        // ensure the json data is a string
        if (data['timestamp'] && !(typeof data['timestamp'] === 'string' || data['timestamp'] instanceof String)) {
            throw new Error("Expected the field `timestamp` to be a primitive type in the JSON string but got " + data['timestamp']);
        }
        // ensure the json data is a string
        if (data['collection'] && !(typeof data['collection'] === 'string' || data['collection'] instanceof String)) {
            throw new Error("Expected the field `collection` to be a primitive type in the JSON string but got " + data['collection']);
        }
        // ensure the json data is a string
        if (data['token_id'] && !(typeof data['token_id'] === 'string' || data['token_id'] instanceof String)) {
            throw new Error("Expected the field `token_id` to be a primitive type in the JSON string but got " + data['token_id']);
        }
        // ensure the json data is a string
        if (data['amount'] && !(typeof data['amount'] === 'string' || data['amount'] instanceof String)) {
            throw new Error("Expected the field `amount` to be a primitive type in the JSON string but got " + data['amount']);
        }
        // ensure the json data is a string
        if (data['price_eth'] && !(typeof data['price_eth'] === 'string' || data['price_eth'] instanceof String)) {
            throw new Error("Expected the field `price_eth` to be a primitive type in the JSON string but got " + data['price_eth']);
        }
        // ensure the json data is a string
        if (data['buyer'] && !(typeof data['buyer'] === 'string' || data['buyer'] instanceof String)) {
            throw new Error("Expected the field `buyer` to be a primitive type in the JSON string but got " + data['buyer']);
        }
        // ensure the json data is a string
        if (data['seller'] && !(typeof data['seller'] === 'string' || data['seller'] instanceof String)) {
            throw new Error("Expected the field `seller` to be a primitive type in the JSON string but got " + data['seller']);
        }

        return true;
    }


}



/**
 * @member {Date} entry_time
 */
CRYPTOPUNKSTradeDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
CRYPTOPUNKSTradeDTO.prototype['recv_time'] = undefined;

/**
 * 
 * @member {String} block_number
 */
CRYPTOPUNKSTradeDTO.prototype['block_number'] = undefined;

/**
 * 
 * @member {Number} vid
 */
CRYPTOPUNKSTradeDTO.prototype['vid'] = undefined;

/**
 * 
 * @member {String} block_range
 */
CRYPTOPUNKSTradeDTO.prototype['block_range'] = undefined;

/**
 * 
 * @member {String} id
 */
CRYPTOPUNKSTradeDTO.prototype['id'] = undefined;

/**
 * 
 * @member {String} transaction_hash
 */
CRYPTOPUNKSTradeDTO.prototype['transaction_hash'] = undefined;

/**
 * 
 * @member {Number} log_index
 */
CRYPTOPUNKSTradeDTO.prototype['log_index'] = undefined;

/**
 * 
 * @member {String} timestamp
 */
CRYPTOPUNKSTradeDTO.prototype['timestamp'] = undefined;

/**
 * 
 * @member {Boolean} is_bundle
 */
CRYPTOPUNKSTradeDTO.prototype['is_bundle'] = undefined;

/**
 * 
 * @member {String} collection
 */
CRYPTOPUNKSTradeDTO.prototype['collection'] = undefined;

/**
 * 
 * @member {String} token_id
 */
CRYPTOPUNKSTradeDTO.prototype['token_id'] = undefined;

/**
 * 
 * @member {String} amount
 */
CRYPTOPUNKSTradeDTO.prototype['amount'] = undefined;

/**
 * 
 * @member {String} price_eth
 */
CRYPTOPUNKSTradeDTO.prototype['price_eth'] = undefined;

/**
 * 
 * @member {String} buyer
 */
CRYPTOPUNKSTradeDTO.prototype['buyer'] = undefined;

/**
 * 
 * @member {String} seller
 */
CRYPTOPUNKSTradeDTO.prototype['seller'] = undefined;






export default CRYPTOPUNKSTradeDTO;

