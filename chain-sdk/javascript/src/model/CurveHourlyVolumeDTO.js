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

import ApiClient from '../ApiClient';

/**
 * The CurveHourlyVolumeDTO model module.
 * @module model/CurveHourlyVolumeDTO
 * @version v1
 */
class CurveHourlyVolumeDTO {
    /**
     * Constructs a new <code>CurveHourlyVolumeDTO</code>.
     * @alias module:model/CurveHourlyVolumeDTO
     */
    constructor() { 
        
        CurveHourlyVolumeDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CurveHourlyVolumeDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CurveHourlyVolumeDTO} obj Optional instance to populate.
     * @return {module:model/CurveHourlyVolumeDTO} The populated <code>CurveHourlyVolumeDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CurveHourlyVolumeDTO();

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
            if (data.hasOwnProperty('timestamp')) {
                obj['timestamp'] = ApiClient.convertToType(data['timestamp'], 'String');
            }
            if (data.hasOwnProperty('volume')) {
                obj['volume'] = ApiClient.convertToType(data['volume'], 'String');
            }
            if (data.hasOwnProperty('vid')) {
                obj['vid'] = ApiClient.convertToType(data['vid'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CurveHourlyVolumeDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CurveHourlyVolumeDTO</code>.
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
        if (data['timestamp'] && !(typeof data['timestamp'] === 'string' || data['timestamp'] instanceof String)) {
            throw new Error("Expected the field `timestamp` to be a primitive type in the JSON string but got " + data['timestamp']);
        }
        // ensure the json data is a string
        if (data['volume'] && !(typeof data['volume'] === 'string' || data['volume'] instanceof String)) {
            throw new Error("Expected the field `volume` to be a primitive type in the JSON string but got " + data['volume']);
        }

        return true;
    }


}



/**
 * @member {Date} entry_time
 */
CurveHourlyVolumeDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
CurveHourlyVolumeDTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
CurveHourlyVolumeDTO.prototype['block_number'] = undefined;

/**
 * 
 * @member {String} id
 */
CurveHourlyVolumeDTO.prototype['id'] = undefined;

/**
 * 
 * @member {String} pool
 */
CurveHourlyVolumeDTO.prototype['pool'] = undefined;

/**
 * 
 * @member {String} timestamp
 */
CurveHourlyVolumeDTO.prototype['timestamp'] = undefined;

/**
 * 
 * @member {String} volume
 */
CurveHourlyVolumeDTO.prototype['volume'] = undefined;

/**
 * 
 * @member {Number} vid
 */
CurveHourlyVolumeDTO.prototype['vid'] = undefined;






export default CurveHourlyVolumeDTO;

