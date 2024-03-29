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
 * The DexDepositDTO model module.
 * @module model/DexDepositDTO
 * @version v1
 */
class DexDepositDTO {
    /**
     * Constructs a new <code>DexDepositDTO</code>.
     * Deposit of an user.
     * @alias module:model/DexDepositDTO
     */
    constructor() { 
        
        DexDepositDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DexDepositDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DexDepositDTO} obj Optional instance to populate.
     * @return {module:model/DexDepositDTO} The populated <code>DexDepositDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DexDepositDTO();

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
            if (data.hasOwnProperty('batch_id')) {
                obj['batch_id'] = ApiClient.convertToType(data['batch_id'], 'String');
            }
            if (data.hasOwnProperty('create_epoch')) {
                obj['create_epoch'] = ApiClient.convertToType(data['create_epoch'], 'String');
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
     * Validates the JSON data with respect to <code>DexDepositDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>DexDepositDTO</code>.
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
        if (data['batch_id'] && !(typeof data['batch_id'] === 'string' || data['batch_id'] instanceof String)) {
            throw new Error("Expected the field `batch_id` to be a primitive type in the JSON string but got " + data['batch_id']);
        }
        // ensure the json data is a string
        if (data['create_epoch'] && !(typeof data['create_epoch'] === 'string' || data['create_epoch'] instanceof String)) {
            throw new Error("Expected the field `create_epoch` to be a primitive type in the JSON string but got " + data['create_epoch']);
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
DexDepositDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
DexDepositDTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
DexDepositDTO.prototype['block_number'] = undefined;

/**
 * Identifier, format: (transaction hash)-(token id).
 * @member {String} id
 */
DexDepositDTO.prototype['id'] = undefined;

/**
 * User address.
 * @member {String} user
 */
DexDepositDTO.prototype['user'] = undefined;

/**
 * Token address.
 * @member {String} token_address
 */
DexDepositDTO.prototype['token_address'] = undefined;

/**
 * Amount of deposit.
 * @member {String} amount
 */
DexDepositDTO.prototype['amount'] = undefined;

/**
 * Identifier (numerical).
 * @member {String} batch_id
 */
DexDepositDTO.prototype['batch_id'] = undefined;

/**
 * Create epoch.
 * @member {String} create_epoch
 */
DexDepositDTO.prototype['create_epoch'] = undefined;

/**
 * Transaction hash.
 * @member {String} tx_hash
 */
DexDepositDTO.prototype['tx_hash'] = undefined;

/**
 * 
 * @member {Number} vid
 */
DexDepositDTO.prototype['vid'] = undefined;






export default DexDepositDTO;

