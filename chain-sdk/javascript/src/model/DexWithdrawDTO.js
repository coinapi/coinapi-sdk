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
 * The DexWithdrawDTO model module.
 * @module model/DexWithdrawDTO
 * @version v1
 */
class DexWithdrawDTO {
    /**
     * Constructs a new <code>DexWithdrawDTO</code>.
     * Withdraw of an user.
     * @alias module:model/DexWithdrawDTO
     */
    constructor() { 
        
        DexWithdrawDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DexWithdrawDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DexWithdrawDTO} obj Optional instance to populate.
     * @return {module:model/DexWithdrawDTO} The populated <code>DexWithdrawDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DexWithdrawDTO();

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
            if (data.hasOwnProperty('user')) {
                obj['user'] = ApiClient.convertToType(data['user'], 'String');
            }
            if (data.hasOwnProperty('token_address')) {
                obj['token_address'] = ApiClient.convertToType(data['token_address'], 'String');
            }
            if (data.hasOwnProperty('amount')) {
                obj['amount'] = ApiClient.convertToType(data['amount'], 'String');
            }
            if (data.hasOwnProperty('create_epoch')) {
                obj['create_epoch'] = ApiClient.convertToType(data['create_epoch'], 'String');
            }
            if (data.hasOwnProperty('create_batch_id')) {
                obj['create_batch_id'] = ApiClient.convertToType(data['create_batch_id'], 'String');
            }
            if (data.hasOwnProperty('tx_hash')) {
                obj['tx_hash'] = ApiClient.convertToType(data['tx_hash'], 'String');
            }
            if (data.hasOwnProperty('vid')) {
                obj['vid'] = ApiClient.convertToType(data['vid'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>DexWithdrawDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>DexWithdrawDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['user'] && !(typeof data['user'] === 'string' || data['user'] instanceof String)) {
            throw new Error("Expected the field `user` to be a primitive type in the JSON string but got " + data['user']);
        }
        // ensure the json data is a string
        if (data['token_address'] && !(typeof data['token_address'] === 'string' || data['token_address'] instanceof String)) {
            throw new Error("Expected the field `token_address` to be a primitive type in the JSON string but got " + data['token_address']);
        }
        // ensure the json data is a string
        if (data['amount'] && !(typeof data['amount'] === 'string' || data['amount'] instanceof String)) {
            throw new Error("Expected the field `amount` to be a primitive type in the JSON string but got " + data['amount']);
        }
        // ensure the json data is a string
        if (data['create_epoch'] && !(typeof data['create_epoch'] === 'string' || data['create_epoch'] instanceof String)) {
            throw new Error("Expected the field `create_epoch` to be a primitive type in the JSON string but got " + data['create_epoch']);
        }
        // ensure the json data is a string
        if (data['create_batch_id'] && !(typeof data['create_batch_id'] === 'string' || data['create_batch_id'] instanceof String)) {
            throw new Error("Expected the field `create_batch_id` to be a primitive type in the JSON string but got " + data['create_batch_id']);
        }
        // ensure the json data is a string
        if (data['tx_hash'] && !(typeof data['tx_hash'] === 'string' || data['tx_hash'] instanceof String)) {
            throw new Error("Expected the field `tx_hash` to be a primitive type in the JSON string but got " + data['tx_hash']);
        }

        return true;
    }


}



/**
 * @member {Date} entry_time
 */
DexWithdrawDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
DexWithdrawDTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
DexWithdrawDTO.prototype['block_number'] = undefined;

/**
 * Identifier, format: (transaction hash)-(id).
 * @member {String} id
 */
DexWithdrawDTO.prototype['id'] = undefined;

/**
 * 
 * @member {String} user
 */
DexWithdrawDTO.prototype['user'] = undefined;

/**
 * 
 * @member {String} token_address
 */
DexWithdrawDTO.prototype['token_address'] = undefined;

/**
 * 
 * @member {String} amount
 */
DexWithdrawDTO.prototype['amount'] = undefined;

/**
 * 
 * @member {String} create_epoch
 */
DexWithdrawDTO.prototype['create_epoch'] = undefined;

/**
 * 
 * @member {String} create_batch_id
 */
DexWithdrawDTO.prototype['create_batch_id'] = undefined;

/**
 * 
 * @member {String} tx_hash
 */
DexWithdrawDTO.prototype['tx_hash'] = undefined;

/**
 * 
 * @member {Number} vid
 */
DexWithdrawDTO.prototype['vid'] = undefined;






export default DexWithdrawDTO;

