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

import * as models from './models';

/**
 * Order submitted by an user. It has a validity (dates) so they can only be executed from/until some given batches. Partial executions of this trades must respect the limit price.
 */
export interface DexOrderDTO {
    entry_time?: string;

    recv_time?: string;

    /**
     * Number of block in which entity was recorded.
     */
    block_number?: number;

    /**
     * Identifier, format: <owner address>-<order id>
     */
    id?: string;

    /**
     * Reference to owner.
     */
    owner?: string;

    /**
     * Order id.
     */
    order_id?: number;

    /**
     * Batch id from which order became valid.
     */
    from_batch_id?: string;

    /**
     * Start of epoch in which order was placed and became valid.
     */
    from_epoch?: string;

    /**
     * Batch id until which trade was still valid.
     */
    until_batch_id?: string;

    /**
     * End of epoch in which order was placed.
     */
    until_epoch?: string;

    /**
     * Identifier of token that was bought.
     */
    buy_token?: string;

    /**
     * Identifier of token that was sold.
     */
    sell_token?: string;

    /**
     * Price enumerator.
     */
    price_numerator?: string;

    /**
     * Price denominator.
     */
    price_denominator?: string;

    /**
     * Maximum sell amount.
     */
    max_sell_amount?: string;

    /**
     * Minimum receive amount.
     */
    min_receive_amount?: string;

    /**
     * Sold volume.
     */
    sold_volume?: string;

    /**
     * Bought volume.
     */
    bought_volume?: string;

    /**
     * Epoch in which order was created.
     */
    create_epoch?: string;

    /**
     * Epoch in which order was cancelled.
     */
    cancel_epoch?: string;

    /**
     * Epoch in which order was deleted.
     */
    delete_epoch?: string;

    /**
     * Transaction hash.
     */
    tx_hash?: string;

    /**
     * Event index within transaction.
     */
    tx_log_index?: string;

    /**
     * 
     */
    vid?: number;

}
