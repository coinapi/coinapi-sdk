// tslint:disable
/**
 * On Chain Dapps - REST API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type {
    TransactionsETradeAggressiveSide,
} from './';

/**
 * Trade entity.
 * @export
 * @interface CowTradeDTO
 */
export interface CowTradeDTO {
    /**
     * @type {string}
     * @memberof CowTradeDTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof CowTradeDTO
     */
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     * @type {number}
     * @memberof CowTradeDTO
     */
    block_number?: number;
    /**
     * Identifier, format: (order id)|(transaction hash)|(event index).
     * @type {string}
     * @memberof CowTradeDTO
     */
    id?: string | null;
    /**
     * Block\'s timestamp.
     * @type {string}
     * @memberof CowTradeDTO
     */
    timestamp?: string | null;
    /**
     * Transaction\'s gas price.
     * @type {string}
     * @memberof CowTradeDTO
     */
    gas_price?: string | null;
    /**
     * Transaction\'s gas limit.
     * @type {string}
     * @memberof CowTradeDTO
     */
    gas_limit?: string | null;
    /**
     * Trade\'s fee amount.
     * @type {string}
     * @memberof CowTradeDTO
     */
    fee_amount?: string | null;
    /**
     * Trade event transaction hash.
     * @type {string}
     * @memberof CowTradeDTO
     */
    tx_hash?: string | null;
    /**
     * Reference to settlement.
     * @type {string}
     * @memberof CowTradeDTO
     */
    settlement?: string | null;
    /**
     * Buy amount.
     * @type {string}
     * @memberof CowTradeDTO
     */
    buy_amount?: string | null;
    /**
     * Sell amount.
     * @type {string}
     * @memberof CowTradeDTO
     */
    sell_amount?: string | null;
    /**
     * Address of token that is sold.
     * @type {string}
     * @memberof CowTradeDTO
     */
    sell_token?: string | null;
    /**
     * Address of token that is bought.
     * @type {string}
     * @memberof CowTradeDTO
     */
    buy_token?: string | null;
    /**
     * Reference to order.
     * @type {string}
     * @memberof CowTradeDTO
     */
    order?: string | null;
    /**
     * 
     * @type {number}
     * @memberof CowTradeDTO
     */
    vid?: number;
    /**
     * @type {string}
     * @memberof CowTradeDTO
     */
    readonly pool_id?: string | null;
    /**
     * @type {string}
     * @memberof CowTradeDTO
     */
    readonly transaction_id?: string | null;
    /**
     * @type {number}
     * @memberof CowTradeDTO
     */
    readonly evaluated_price?: number;
    /**
     * @type {number}
     * @memberof CowTradeDTO
     */
    readonly evaluated_amount?: number;
    /**
     * @type {TransactionsETradeAggressiveSide}
     * @memberof CowTradeDTO
     */
    evaluated_aggressor?: TransactionsETradeAggressiveSide;
}


