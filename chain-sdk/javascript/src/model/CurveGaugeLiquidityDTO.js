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
 * The CurveGaugeLiquidityDTO model module.
 * @module model/CurveGaugeLiquidityDTO
 * @version v1
 */
class CurveGaugeLiquidityDTO {
    /**
     * Constructs a new <code>CurveGaugeLiquidityDTO</code>.
     * @alias module:model/CurveGaugeLiquidityDTO
     */
    constructor() { 
        
        CurveGaugeLiquidityDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CurveGaugeLiquidityDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CurveGaugeLiquidityDTO} obj Optional instance to populate.
     * @return {module:model/CurveGaugeLiquidityDTO} The populated <code>CurveGaugeLiquidityDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CurveGaugeLiquidityDTO();

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
            if (data.hasOwnProperty('gauge')) {
                obj['gauge'] = ApiClient.convertToType(data['gauge'], 'String');
            }
            if (data.hasOwnProperty('original_balance')) {
                obj['original_balance'] = ApiClient.convertToType(data['original_balance'], 'String');
            }
            if (data.hasOwnProperty('original_supply')) {
                obj['original_supply'] = ApiClient.convertToType(data['original_supply'], 'String');
            }
            if (data.hasOwnProperty('working_balance')) {
                obj['working_balance'] = ApiClient.convertToType(data['working_balance'], 'String');
            }
            if (data.hasOwnProperty('working_supply')) {
                obj['working_supply'] = ApiClient.convertToType(data['working_supply'], 'String');
            }
            if (data.hasOwnProperty('timestamp')) {
                obj['timestamp'] = ApiClient.convertToType(data['timestamp'], 'String');
            }
            if (data.hasOwnProperty('block')) {
                obj['block'] = ApiClient.convertToType(data['block'], 'String');
            }
            if (data.hasOwnProperty('transaction')) {
                obj['transaction'] = ApiClient.convertToType(data['transaction'], 'String');
            }
            if (data.hasOwnProperty('vid')) {
                obj['vid'] = ApiClient.convertToType(data['vid'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CurveGaugeLiquidityDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CurveGaugeLiquidityDTO</code>.
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
        if (data['gauge'] && !(typeof data['gauge'] === 'string' || data['gauge'] instanceof String)) {
            throw new Error("Expected the field `gauge` to be a primitive type in the JSON string but got " + data['gauge']);
        }
        // ensure the json data is a string
        if (data['original_balance'] && !(typeof data['original_balance'] === 'string' || data['original_balance'] instanceof String)) {
            throw new Error("Expected the field `original_balance` to be a primitive type in the JSON string but got " + data['original_balance']);
        }
        // ensure the json data is a string
        if (data['original_supply'] && !(typeof data['original_supply'] === 'string' || data['original_supply'] instanceof String)) {
            throw new Error("Expected the field `original_supply` to be a primitive type in the JSON string but got " + data['original_supply']);
        }
        // ensure the json data is a string
        if (data['working_balance'] && !(typeof data['working_balance'] === 'string' || data['working_balance'] instanceof String)) {
            throw new Error("Expected the field `working_balance` to be a primitive type in the JSON string but got " + data['working_balance']);
        }
        // ensure the json data is a string
        if (data['working_supply'] && !(typeof data['working_supply'] === 'string' || data['working_supply'] instanceof String)) {
            throw new Error("Expected the field `working_supply` to be a primitive type in the JSON string but got " + data['working_supply']);
        }
        // ensure the json data is a string
        if (data['timestamp'] && !(typeof data['timestamp'] === 'string' || data['timestamp'] instanceof String)) {
            throw new Error("Expected the field `timestamp` to be a primitive type in the JSON string but got " + data['timestamp']);
        }
        // ensure the json data is a string
        if (data['block'] && !(typeof data['block'] === 'string' || data['block'] instanceof String)) {
            throw new Error("Expected the field `block` to be a primitive type in the JSON string but got " + data['block']);
        }
        // ensure the json data is a string
        if (data['transaction'] && !(typeof data['transaction'] === 'string' || data['transaction'] instanceof String)) {
            throw new Error("Expected the field `transaction` to be a primitive type in the JSON string but got " + data['transaction']);
        }

        return true;
    }


}



/**
 * @member {Date} entry_time
 */
CurveGaugeLiquidityDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
CurveGaugeLiquidityDTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
CurveGaugeLiquidityDTO.prototype['block_number'] = undefined;

/**
 * 
 * @member {String} id
 */
CurveGaugeLiquidityDTO.prototype['id'] = undefined;

/**
 * 
 * @member {String} user
 */
CurveGaugeLiquidityDTO.prototype['user'] = undefined;

/**
 * 
 * @member {String} gauge
 */
CurveGaugeLiquidityDTO.prototype['gauge'] = undefined;

/**
 * 
 * @member {String} original_balance
 */
CurveGaugeLiquidityDTO.prototype['original_balance'] = undefined;

/**
 * 
 * @member {String} original_supply
 */
CurveGaugeLiquidityDTO.prototype['original_supply'] = undefined;

/**
 * 
 * @member {String} working_balance
 */
CurveGaugeLiquidityDTO.prototype['working_balance'] = undefined;

/**
 * 
 * @member {String} working_supply
 */
CurveGaugeLiquidityDTO.prototype['working_supply'] = undefined;

/**
 * 
 * @member {String} timestamp
 */
CurveGaugeLiquidityDTO.prototype['timestamp'] = undefined;

/**
 * 
 * @member {String} block
 */
CurveGaugeLiquidityDTO.prototype['block'] = undefined;

/**
 * 
 * @member {String} transaction
 */
CurveGaugeLiquidityDTO.prototype['transaction'] = undefined;

/**
 * 
 * @member {Number} vid
 */
CurveGaugeLiquidityDTO.prototype['vid'] = undefined;






export default CurveGaugeLiquidityDTO;

