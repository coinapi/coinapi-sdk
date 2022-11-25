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
 * The CurveContractVersionDTO model module.
 * @module model/CurveContractVersionDTO
 * @version v1
 */
class CurveContractVersionDTO {
    /**
     * Constructs a new <code>CurveContractVersionDTO</code>.
     * @alias module:model/CurveContractVersionDTO
     */
    constructor() { 
        
        CurveContractVersionDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CurveContractVersionDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CurveContractVersionDTO} obj Optional instance to populate.
     * @return {module:model/CurveContractVersionDTO} The populated <code>CurveContractVersionDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CurveContractVersionDTO();

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
            if (data.hasOwnProperty('contract')) {
                obj['contract'] = ApiClient.convertToType(data['contract'], 'String');
            }
            if (data.hasOwnProperty('address')) {
                obj['address'] = ApiClient.convertToType(data['address'], 'String');
            }
            if (data.hasOwnProperty('version')) {
                obj['version'] = ApiClient.convertToType(data['version'], 'String');
            }
            if (data.hasOwnProperty('added')) {
                obj['added'] = ApiClient.convertToType(data['added'], 'String');
            }
            if (data.hasOwnProperty('added_at_block')) {
                obj['added_at_block'] = ApiClient.convertToType(data['added_at_block'], 'String');
            }
            if (data.hasOwnProperty('added_at_transaction')) {
                obj['added_at_transaction'] = ApiClient.convertToType(data['added_at_transaction'], 'String');
            }
            if (data.hasOwnProperty('vid')) {
                obj['vid'] = ApiClient.convertToType(data['vid'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CurveContractVersionDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CurveContractVersionDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['contract'] && !(typeof data['contract'] === 'string' || data['contract'] instanceof String)) {
            throw new Error("Expected the field `contract` to be a primitive type in the JSON string but got " + data['contract']);
        }
        // ensure the json data is a string
        if (data['address'] && !(typeof data['address'] === 'string' || data['address'] instanceof String)) {
            throw new Error("Expected the field `address` to be a primitive type in the JSON string but got " + data['address']);
        }
        // ensure the json data is a string
        if (data['version'] && !(typeof data['version'] === 'string' || data['version'] instanceof String)) {
            throw new Error("Expected the field `version` to be a primitive type in the JSON string but got " + data['version']);
        }
        // ensure the json data is a string
        if (data['added'] && !(typeof data['added'] === 'string' || data['added'] instanceof String)) {
            throw new Error("Expected the field `added` to be a primitive type in the JSON string but got " + data['added']);
        }
        // ensure the json data is a string
        if (data['added_at_block'] && !(typeof data['added_at_block'] === 'string' || data['added_at_block'] instanceof String)) {
            throw new Error("Expected the field `added_at_block` to be a primitive type in the JSON string but got " + data['added_at_block']);
        }
        // ensure the json data is a string
        if (data['added_at_transaction'] && !(typeof data['added_at_transaction'] === 'string' || data['added_at_transaction'] instanceof String)) {
            throw new Error("Expected the field `added_at_transaction` to be a primitive type in the JSON string but got " + data['added_at_transaction']);
        }

        return true;
    }


}



/**
 * @member {Date} entry_time
 */
CurveContractVersionDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
CurveContractVersionDTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
CurveContractVersionDTO.prototype['block_number'] = undefined;

/**
 * 
 * @member {String} id
 */
CurveContractVersionDTO.prototype['id'] = undefined;

/**
 * 
 * @member {String} contract
 */
CurveContractVersionDTO.prototype['contract'] = undefined;

/**
 * 
 * @member {String} address
 */
CurveContractVersionDTO.prototype['address'] = undefined;

/**
 * 
 * @member {String} version
 */
CurveContractVersionDTO.prototype['version'] = undefined;

/**
 * 
 * @member {String} added
 */
CurveContractVersionDTO.prototype['added'] = undefined;

/**
 * 
 * @member {String} added_at_block
 */
CurveContractVersionDTO.prototype['added_at_block'] = undefined;

/**
 * 
 * @member {String} added_at_transaction
 */
CurveContractVersionDTO.prototype['added_at_transaction'] = undefined;

/**
 * 
 * @member {Number} vid
 */
CurveContractVersionDTO.prototype['vid'] = undefined;






export default CurveContractVersionDTO;

