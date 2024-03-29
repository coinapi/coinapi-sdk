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
 * The CurveTransferOwnershipEventDTO model module.
 * @module model/CurveTransferOwnershipEventDTO
 * @version v1
 */
class CurveTransferOwnershipEventDTO {
    /**
     * Constructs a new <code>CurveTransferOwnershipEventDTO</code>.
     * @alias module:model/CurveTransferOwnershipEventDTO
     */
    constructor() { 
        
        CurveTransferOwnershipEventDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CurveTransferOwnershipEventDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CurveTransferOwnershipEventDTO} obj Optional instance to populate.
     * @return {module:model/CurveTransferOwnershipEventDTO} The populated <code>CurveTransferOwnershipEventDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CurveTransferOwnershipEventDTO();

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
            if (data.hasOwnProperty('pool')) {
                obj['pool'] = ApiClient.convertToType(data['pool'], 'String');
            }
            if (data.hasOwnProperty('new_admin')) {
                obj['new_admin'] = ApiClient.convertToType(data['new_admin'], 'String');
            }
            if (data.hasOwnProperty('block')) {
                obj['block'] = ApiClient.convertToType(data['block'], 'String');
            }
            if (data.hasOwnProperty('timestamp')) {
                obj['timestamp'] = ApiClient.convertToType(data['timestamp'], 'String');
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
     * Validates the JSON data with respect to <code>CurveTransferOwnershipEventDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CurveTransferOwnershipEventDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['pool'] && !(typeof data['pool'] === 'string' || data['pool'] instanceof String)) {
            throw new Error("Expected the field `pool` to be a primitive type in the JSON string but got " + data['pool']);
        }
        // ensure the json data is a string
        if (data['new_admin'] && !(typeof data['new_admin'] === 'string' || data['new_admin'] instanceof String)) {
            throw new Error("Expected the field `new_admin` to be a primitive type in the JSON string but got " + data['new_admin']);
        }
        // ensure the json data is a string
        if (data['block'] && !(typeof data['block'] === 'string' || data['block'] instanceof String)) {
            throw new Error("Expected the field `block` to be a primitive type in the JSON string but got " + data['block']);
        }
        // ensure the json data is a string
        if (data['timestamp'] && !(typeof data['timestamp'] === 'string' || data['timestamp'] instanceof String)) {
            throw new Error("Expected the field `timestamp` to be a primitive type in the JSON string but got " + data['timestamp']);
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
CurveTransferOwnershipEventDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
CurveTransferOwnershipEventDTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
CurveTransferOwnershipEventDTO.prototype['block_number'] = undefined;

/**
 * 
 * @member {String} id
 */
CurveTransferOwnershipEventDTO.prototype['id'] = undefined;

/**
 * 
 * @member {String} pool
 */
CurveTransferOwnershipEventDTO.prototype['pool'] = undefined;

/**
 * 
 * @member {String} new_admin
 */
CurveTransferOwnershipEventDTO.prototype['new_admin'] = undefined;

/**
 * 
 * @member {String} block
 */
CurveTransferOwnershipEventDTO.prototype['block'] = undefined;

/**
 * 
 * @member {String} timestamp
 */
CurveTransferOwnershipEventDTO.prototype['timestamp'] = undefined;

/**
 * 
 * @member {String} transaction
 */
CurveTransferOwnershipEventDTO.prototype['transaction'] = undefined;

/**
 * 
 * @member {Number} vid
 */
CurveTransferOwnershipEventDTO.prototype['vid'] = undefined;






export default CurveTransferOwnershipEventDTO;

