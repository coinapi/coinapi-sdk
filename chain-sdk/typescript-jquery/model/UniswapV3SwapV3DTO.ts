/**
 * OnChain API
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
 * Swap are created for each token swap within a pair.
 */
export interface UniswapV3SwapV3DTO {
    entry_time?: string;

    recv_time?: string;

    /**
     * Number of block in which entity was recorded.
     */
    block_number?: number;

    /**
     * 
     */
    vid?: number;

    /**
     * Identifier, format: transaction hash + \"#\" + index in swaps Transaction array.
     */
    id?: string;

    /**
     * Pointer to transaction.
     */
    transaction?: string;

    /**
     * Timestamp of transaction.
     */
    timestamp?: string;

    /**
     * Pool swap occured within.
     */
    pool?: string;

    /**
     * Reference to token0 as stored in pair contract.
     */
    token_0?: string;

    /**
     * Reference to token1 as stored in pair contract.
     */
    token_1?: string;

    /**
     * Sender of the swap.
     */
    sender?: string;

    /**
     * Recipient of the swap.
     */
    recipient?: string;

    /**
     * Transaction origin: the EOA (Externally Owned Account) that initiated the transaction
     */
    origin?: string;

    /**
     * Delta of token0 swapped.
     */
    amount_0?: string;

    /**
     * Delta of token1 swapped.
     */
    amount_1?: string;

    /**
     * Derived amount of tokens sold in USD.
     */
    amount_usd?: string;

    sqrt_price_x96?: models.NumericsBigInteger;

    tick?: models.NumericsBigInteger;

    log_index?: models.NumericsBigInteger;

    evaluated_price?: number;

    evaluated_amount?: number;

    evaluated_aggressor?: models.TransactionsETradeAggressiveSide;

    pool_id?: string;

    transaction_id?: string;

}
