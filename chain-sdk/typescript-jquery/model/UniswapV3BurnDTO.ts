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
 * Burn entities are created for every emitted Burn event on the Uniswap core contracts. The Burn entity stores key data about the event like token amounts, who burned, who received tokens, and more. This entity can be used to track liquidity removals on pairs.
 */
export interface UniswapV3BurnDTO {
    entry_time?: string;

    recv_time?: string;

    /**
     * Number of block in which entity was recorded.
     */
    block_number?: number;

    /**
     * Transaction hash + \'#\' + index in mints Transaction array.
     */
    id?: string;

    /**
     * Transaction burn was included in.
     */
    transaction?: string;

    /**
     * Pool position is within.
     */
    pool?: string;

    /**
     * Reference to token0 as stored in pool contract.
     */
    token_0?: string;

    /**
     * Reference to token1 as stored in pool contract.
     */
    token_1?: string;

    /**
     * Timestamp.
     */
    timestamp?: string;

    /**
     * Owner of position where liquidity was burned.
     */
    owner?: string;

    /**
     * Transaction origin: the EOA (Externally Owned Account) that initiated the transaction.
     */
    origin?: string;

    /**
     * Amount of liquidity burned.
     */
    amount?: string;

    /**
     * Amount of token 0 burned.
     */
    amount_0?: string;

    /**
     * Amount of token 1 burned.
     */
    amount_1?: string;

    /**
     * Derived amount based on available prices of tokens.
     */
    amount_usd?: string;

    /**
     * Lower tick of position.
     */
    tick_lower?: string;

    /**
     * Upper tick of position.
     */
    tick_upper?: string;

    /**
     * Position within the transactions.
     */
    log_index?: string;

    /**
     * 
     */
    vid?: number;

}
