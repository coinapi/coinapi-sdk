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
 * The DexPriceDTO model module.
 * @module model/DexPriceDTO
 * @version v1
 */
class DexPriceDTO {
    /**
     * Constructs a new <code>DexPriceDTO</code>.
     * Token price in conjuction with batch id.
     * @alias module:model/DexPriceDTO
     */
    constructor() { 
        
        DexPriceDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DexPriceDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DexPriceDTO} obj Optional instance to populate.
     * @return {module:model/DexPriceDTO} The populated <code>DexPriceDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DexPriceDTO();

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
            if (data.hasOwnProperty('token')) {
                obj['token'] = ApiClient.convertToType(data['token'], 'String');
            }
            if (data.hasOwnProperty('batch_id')) {
                obj['batch_id'] = ApiClient.convertToType(data['batch_id'], 'String');
            }
            if (data.hasOwnProperty('price_in_owl_numerator')) {
                obj['price_in_owl_numerator'] = ApiClient.convertToType(data['price_in_owl_numerator'], 'String');
            }
            if (data.hasOwnProperty('price_in_owl_denominator')) {
                obj['price_in_owl_denominator'] = ApiClient.convertToType(data['price_in_owl_denominator'], 'String');
            }
            if (data.hasOwnProperty('volume')) {
                obj['volume'] = ApiClient.convertToType(data['volume'], 'String');
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
     * Validates the JSON data with respect to <code>DexPriceDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>DexPriceDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['token'] && !(typeof data['token'] === 'string' || data['token'] instanceof String)) {
            throw new Error("Expected the field `token` to be a primitive type in the JSON string but got " + data['token']);
        }
        // ensure the json data is a string
        if (data['batch_id'] && !(typeof data['batch_id'] === 'string' || data['batch_id'] instanceof String)) {
            throw new Error("Expected the field `batch_id` to be a primitive type in the JSON string but got " + data['batch_id']);
        }
        // ensure the json data is a string
        if (data['price_in_owl_numerator'] && !(typeof data['price_in_owl_numerator'] === 'string' || data['price_in_owl_numerator'] instanceof String)) {
            throw new Error("Expected the field `price_in_owl_numerator` to be a primitive type in the JSON string but got " + data['price_in_owl_numerator']);
        }
        // ensure the json data is a string
        if (data['price_in_owl_denominator'] && !(typeof data['price_in_owl_denominator'] === 'string' || data['price_in_owl_denominator'] instanceof String)) {
            throw new Error("Expected the field `price_in_owl_denominator` to be a primitive type in the JSON string but got " + data['price_in_owl_denominator']);
        }
        // ensure the json data is a string
        if (data['volume'] && !(typeof data['volume'] === 'string' || data['volume'] instanceof String)) {
            throw new Error("Expected the field `volume` to be a primitive type in the JSON string but got " + data['volume']);
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
DexPriceDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
DexPriceDTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
DexPriceDTO.prototype['block_number'] = undefined;

/**
 * Identifier, format: (token id)-(batch id).
 * @member {String} id
 */
DexPriceDTO.prototype['id'] = undefined;

/**
 * Token identifier.
 * @member {String} token
 */
DexPriceDTO.prototype['token'] = undefined;

/**
 * Batch identifier.
 * @member {String} batch_id
 */
DexPriceDTO.prototype['batch_id'] = undefined;

/**
 * Price enumerator in OWL (derivative of the GNO token).
 * @member {String} price_in_owl_numerator
 */
DexPriceDTO.prototype['price_in_owl_numerator'] = undefined;

/**
 * Price denominator in OWL (derivative of the GNO token).
 * @member {String} price_in_owl_denominator
 */
DexPriceDTO.prototype['price_in_owl_denominator'] = undefined;

/**
 * Volume.
 * @member {String} volume
 */
DexPriceDTO.prototype['volume'] = undefined;

/**
 * Create epoch.
 * @member {String} create_epoch
 */
DexPriceDTO.prototype['create_epoch'] = undefined;

/**
 * Transaction hash.
 * @member {String} tx_hash
 */
DexPriceDTO.prototype['tx_hash'] = undefined;

/**
 * 
 * @member {Number} vid
 */
DexPriceDTO.prototype['vid'] = undefined;






export default DexPriceDTO;

