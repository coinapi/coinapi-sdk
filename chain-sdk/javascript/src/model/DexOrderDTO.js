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
 * The DexOrderDTO model module.
 * @module model/DexOrderDTO
 * @version v1
 */
class DexOrderDTO {
    /**
     * Constructs a new <code>DexOrderDTO</code>.
     * Order submitted by an user. It has a validity (dates) so they can only be executed from/until some given batches. Partial executions of this trades must respect the limit price.
     * @alias module:model/DexOrderDTO
     */
    constructor() { 
        
        DexOrderDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DexOrderDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DexOrderDTO} obj Optional instance to populate.
     * @return {module:model/DexOrderDTO} The populated <code>DexOrderDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DexOrderDTO();

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
            if (data.hasOwnProperty('owner')) {
                obj['owner'] = ApiClient.convertToType(data['owner'], 'String');
            }
            if (data.hasOwnProperty('order_id')) {
                obj['order_id'] = ApiClient.convertToType(data['order_id'], 'Number');
            }
            if (data.hasOwnProperty('from_batch_id')) {
                obj['from_batch_id'] = ApiClient.convertToType(data['from_batch_id'], 'String');
            }
            if (data.hasOwnProperty('from_epoch')) {
                obj['from_epoch'] = ApiClient.convertToType(data['from_epoch'], 'String');
            }
            if (data.hasOwnProperty('until_batch_id')) {
                obj['until_batch_id'] = ApiClient.convertToType(data['until_batch_id'], 'String');
            }
            if (data.hasOwnProperty('until_epoch')) {
                obj['until_epoch'] = ApiClient.convertToType(data['until_epoch'], 'String');
            }
            if (data.hasOwnProperty('buy_token')) {
                obj['buy_token'] = ApiClient.convertToType(data['buy_token'], 'String');
            }
            if (data.hasOwnProperty('sell_token')) {
                obj['sell_token'] = ApiClient.convertToType(data['sell_token'], 'String');
            }
            if (data.hasOwnProperty('price_numerator')) {
                obj['price_numerator'] = ApiClient.convertToType(data['price_numerator'], 'String');
            }
            if (data.hasOwnProperty('price_denominator')) {
                obj['price_denominator'] = ApiClient.convertToType(data['price_denominator'], 'String');
            }
            if (data.hasOwnProperty('max_sell_amount')) {
                obj['max_sell_amount'] = ApiClient.convertToType(data['max_sell_amount'], 'String');
            }
            if (data.hasOwnProperty('min_receive_amount')) {
                obj['min_receive_amount'] = ApiClient.convertToType(data['min_receive_amount'], 'String');
            }
            if (data.hasOwnProperty('sold_volume')) {
                obj['sold_volume'] = ApiClient.convertToType(data['sold_volume'], 'String');
            }
            if (data.hasOwnProperty('bought_volume')) {
                obj['bought_volume'] = ApiClient.convertToType(data['bought_volume'], 'String');
            }
            if (data.hasOwnProperty('create_epoch')) {
                obj['create_epoch'] = ApiClient.convertToType(data['create_epoch'], 'String');
            }
            if (data.hasOwnProperty('cancel_epoch')) {
                obj['cancel_epoch'] = ApiClient.convertToType(data['cancel_epoch'], 'String');
            }
            if (data.hasOwnProperty('delete_epoch')) {
                obj['delete_epoch'] = ApiClient.convertToType(data['delete_epoch'], 'String');
            }
            if (data.hasOwnProperty('tx_hash')) {
                obj['tx_hash'] = ApiClient.convertToType(data['tx_hash'], 'String');
            }
            if (data.hasOwnProperty('tx_log_index')) {
                obj['tx_log_index'] = ApiClient.convertToType(data['tx_log_index'], 'String');
            }
            if (data.hasOwnProperty('vid')) {
                obj['vid'] = ApiClient.convertToType(data['vid'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>DexOrderDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>DexOrderDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['owner'] && !(typeof data['owner'] === 'string' || data['owner'] instanceof String)) {
            throw new Error("Expected the field `owner` to be a primitive type in the JSON string but got " + data['owner']);
        }
        // ensure the json data is a string
        if (data['from_batch_id'] && !(typeof data['from_batch_id'] === 'string' || data['from_batch_id'] instanceof String)) {
            throw new Error("Expected the field `from_batch_id` to be a primitive type in the JSON string but got " + data['from_batch_id']);
        }
        // ensure the json data is a string
        if (data['from_epoch'] && !(typeof data['from_epoch'] === 'string' || data['from_epoch'] instanceof String)) {
            throw new Error("Expected the field `from_epoch` to be a primitive type in the JSON string but got " + data['from_epoch']);
        }
        // ensure the json data is a string
        if (data['until_batch_id'] && !(typeof data['until_batch_id'] === 'string' || data['until_batch_id'] instanceof String)) {
            throw new Error("Expected the field `until_batch_id` to be a primitive type in the JSON string but got " + data['until_batch_id']);
        }
        // ensure the json data is a string
        if (data['until_epoch'] && !(typeof data['until_epoch'] === 'string' || data['until_epoch'] instanceof String)) {
            throw new Error("Expected the field `until_epoch` to be a primitive type in the JSON string but got " + data['until_epoch']);
        }
        // ensure the json data is a string
        if (data['buy_token'] && !(typeof data['buy_token'] === 'string' || data['buy_token'] instanceof String)) {
            throw new Error("Expected the field `buy_token` to be a primitive type in the JSON string but got " + data['buy_token']);
        }
        // ensure the json data is a string
        if (data['sell_token'] && !(typeof data['sell_token'] === 'string' || data['sell_token'] instanceof String)) {
            throw new Error("Expected the field `sell_token` to be a primitive type in the JSON string but got " + data['sell_token']);
        }
        // ensure the json data is a string
        if (data['price_numerator'] && !(typeof data['price_numerator'] === 'string' || data['price_numerator'] instanceof String)) {
            throw new Error("Expected the field `price_numerator` to be a primitive type in the JSON string but got " + data['price_numerator']);
        }
        // ensure the json data is a string
        if (data['price_denominator'] && !(typeof data['price_denominator'] === 'string' || data['price_denominator'] instanceof String)) {
            throw new Error("Expected the field `price_denominator` to be a primitive type in the JSON string but got " + data['price_denominator']);
        }
        // ensure the json data is a string
        if (data['max_sell_amount'] && !(typeof data['max_sell_amount'] === 'string' || data['max_sell_amount'] instanceof String)) {
            throw new Error("Expected the field `max_sell_amount` to be a primitive type in the JSON string but got " + data['max_sell_amount']);
        }
        // ensure the json data is a string
        if (data['min_receive_amount'] && !(typeof data['min_receive_amount'] === 'string' || data['min_receive_amount'] instanceof String)) {
            throw new Error("Expected the field `min_receive_amount` to be a primitive type in the JSON string but got " + data['min_receive_amount']);
        }
        // ensure the json data is a string
        if (data['sold_volume'] && !(typeof data['sold_volume'] === 'string' || data['sold_volume'] instanceof String)) {
            throw new Error("Expected the field `sold_volume` to be a primitive type in the JSON string but got " + data['sold_volume']);
        }
        // ensure the json data is a string
        if (data['bought_volume'] && !(typeof data['bought_volume'] === 'string' || data['bought_volume'] instanceof String)) {
            throw new Error("Expected the field `bought_volume` to be a primitive type in the JSON string but got " + data['bought_volume']);
        }
        // ensure the json data is a string
        if (data['create_epoch'] && !(typeof data['create_epoch'] === 'string' || data['create_epoch'] instanceof String)) {
            throw new Error("Expected the field `create_epoch` to be a primitive type in the JSON string but got " + data['create_epoch']);
        }
        // ensure the json data is a string
        if (data['cancel_epoch'] && !(typeof data['cancel_epoch'] === 'string' || data['cancel_epoch'] instanceof String)) {
            throw new Error("Expected the field `cancel_epoch` to be a primitive type in the JSON string but got " + data['cancel_epoch']);
        }
        // ensure the json data is a string
        if (data['delete_epoch'] && !(typeof data['delete_epoch'] === 'string' || data['delete_epoch'] instanceof String)) {
            throw new Error("Expected the field `delete_epoch` to be a primitive type in the JSON string but got " + data['delete_epoch']);
        }
        // ensure the json data is a string
        if (data['tx_hash'] && !(typeof data['tx_hash'] === 'string' || data['tx_hash'] instanceof String)) {
            throw new Error("Expected the field `tx_hash` to be a primitive type in the JSON string but got " + data['tx_hash']);
        }
        // ensure the json data is a string
        if (data['tx_log_index'] && !(typeof data['tx_log_index'] === 'string' || data['tx_log_index'] instanceof String)) {
            throw new Error("Expected the field `tx_log_index` to be a primitive type in the JSON string but got " + data['tx_log_index']);
        }

        return true;
    }


}



/**
 * @member {Date} entry_time
 */
DexOrderDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
DexOrderDTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
DexOrderDTO.prototype['block_number'] = undefined;

/**
 * Identifier, format: <owner address>-<order id>
 * @member {String} id
 */
DexOrderDTO.prototype['id'] = undefined;

/**
 * Reference to owner.
 * @member {String} owner
 */
DexOrderDTO.prototype['owner'] = undefined;

/**
 * Order id.
 * @member {Number} order_id
 */
DexOrderDTO.prototype['order_id'] = undefined;

/**
 * Batch id from which order became valid.
 * @member {String} from_batch_id
 */
DexOrderDTO.prototype['from_batch_id'] = undefined;

/**
 * Start of epoch in which order was placed and became valid.
 * @member {String} from_epoch
 */
DexOrderDTO.prototype['from_epoch'] = undefined;

/**
 * Batch id until which trade was still valid.
 * @member {String} until_batch_id
 */
DexOrderDTO.prototype['until_batch_id'] = undefined;

/**
 * End of epoch in which order was placed.
 * @member {String} until_epoch
 */
DexOrderDTO.prototype['until_epoch'] = undefined;

/**
 * Identifier of token that was bought.
 * @member {String} buy_token
 */
DexOrderDTO.prototype['buy_token'] = undefined;

/**
 * Identifier of token that was sold.
 * @member {String} sell_token
 */
DexOrderDTO.prototype['sell_token'] = undefined;

/**
 * Price enumerator.
 * @member {String} price_numerator
 */
DexOrderDTO.prototype['price_numerator'] = undefined;

/**
 * Price denominator.
 * @member {String} price_denominator
 */
DexOrderDTO.prototype['price_denominator'] = undefined;

/**
 * Maximum sell amount.
 * @member {String} max_sell_amount
 */
DexOrderDTO.prototype['max_sell_amount'] = undefined;

/**
 * Minimum receive amount.
 * @member {String} min_receive_amount
 */
DexOrderDTO.prototype['min_receive_amount'] = undefined;

/**
 * Sold volume.
 * @member {String} sold_volume
 */
DexOrderDTO.prototype['sold_volume'] = undefined;

/**
 * Bought volume.
 * @member {String} bought_volume
 */
DexOrderDTO.prototype['bought_volume'] = undefined;

/**
 * Epoch in which order was created.
 * @member {String} create_epoch
 */
DexOrderDTO.prototype['create_epoch'] = undefined;

/**
 * Epoch in which order was cancelled.
 * @member {String} cancel_epoch
 */
DexOrderDTO.prototype['cancel_epoch'] = undefined;

/**
 * Epoch in which order was deleted.
 * @member {String} delete_epoch
 */
DexOrderDTO.prototype['delete_epoch'] = undefined;

/**
 * Transaction hash.
 * @member {String} tx_hash
 */
DexOrderDTO.prototype['tx_hash'] = undefined;

/**
 * Event index within transaction.
 * @member {String} tx_log_index
 */
DexOrderDTO.prototype['tx_log_index'] = undefined;

/**
 * 
 * @member {Number} vid
 */
DexOrderDTO.prototype['vid'] = undefined;






export default DexOrderDTO;
