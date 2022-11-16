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
 * The CurveGaugeWeightDTO model module.
 * @module model/CurveGaugeWeightDTO
 * @version v1
 */
class CurveGaugeWeightDTO {
    /**
     * Constructs a new <code>CurveGaugeWeightDTO</code>.
     * @alias module:model/CurveGaugeWeightDTO
     */
    constructor() { 
        
        CurveGaugeWeightDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CurveGaugeWeightDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CurveGaugeWeightDTO} obj Optional instance to populate.
     * @return {module:model/CurveGaugeWeightDTO} The populated <code>CurveGaugeWeightDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CurveGaugeWeightDTO();

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
            if (data.hasOwnProperty('gauge')) {
                obj['gauge'] = ApiClient.convertToType(data['gauge'], 'String');
            }
            if (data.hasOwnProperty('time')) {
                obj['time'] = ApiClient.convertToType(data['time'], 'String');
            }
            if (data.hasOwnProperty('weight')) {
                obj['weight'] = ApiClient.convertToType(data['weight'], 'String');
            }
            if (data.hasOwnProperty('vid')) {
                obj['vid'] = ApiClient.convertToType(data['vid'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CurveGaugeWeightDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CurveGaugeWeightDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['gauge'] && !(typeof data['gauge'] === 'string' || data['gauge'] instanceof String)) {
            throw new Error("Expected the field `gauge` to be a primitive type in the JSON string but got " + data['gauge']);
        }
        // ensure the json data is a string
        if (data['time'] && !(typeof data['time'] === 'string' || data['time'] instanceof String)) {
            throw new Error("Expected the field `time` to be a primitive type in the JSON string but got " + data['time']);
        }
        // ensure the json data is a string
        if (data['weight'] && !(typeof data['weight'] === 'string' || data['weight'] instanceof String)) {
            throw new Error("Expected the field `weight` to be a primitive type in the JSON string but got " + data['weight']);
        }

        return true;
    }


}



/**
 * @member {Date} entry_time
 */
CurveGaugeWeightDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
CurveGaugeWeightDTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
CurveGaugeWeightDTO.prototype['block_number'] = undefined;

/**
 * 
 * @member {String} id
 */
CurveGaugeWeightDTO.prototype['id'] = undefined;

/**
 * 
 * @member {String} gauge
 */
CurveGaugeWeightDTO.prototype['gauge'] = undefined;

/**
 * 
 * @member {String} time
 */
CurveGaugeWeightDTO.prototype['time'] = undefined;

/**
 * 
 * @member {String} weight
 */
CurveGaugeWeightDTO.prototype['weight'] = undefined;

/**
 * 
 * @member {Number} vid
 */
CurveGaugeWeightDTO.prototype['vid'] = undefined;






export default CurveGaugeWeightDTO;

