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


/**
 * Burn entities are created for every emitted Burn event on the Uniswap core contracts. The Burn entity stores key data about the event like token amounts, who burned LP tokens, who received tokens, and more. This entity can be used to track liquidity removals on pairs.
 */
export interface UniswapV2BurnDTO { 
    entry_time?: string;
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     */
    block_number?: number;
    /**
     * Transaction hash plus index in the transaction burn array
     */
    id?: string | null;
    /**
     * Reference to the transaction Burn was included in.
     */
    transaction?: string | null;
    /**
     * Timestamp of Burn, used to sort recent liquidity removals.
     */
    timestamp?: string | null;
    /**
     * Reference to pair.
     */
    pair?: string | null;
    /**
     * Amount of liquidity tokens burned.
     */
    liquidity?: string | null;
    /**
     * Address that initiated the liquidity removal.
     */
    sender?: string | null;
    /**
     * Amount of token0 removed.
     */
    amount_0?: string | null;
    /**
     * Amount of token1 removed.
     */
    amount_1?: string | null;
    /**
     * Recipient of tokens.
     */
    to?: string | null;
    /**
     * Index in the transaction event was emitted.
     */
    log_index?: string | null;
    /**
     * Derived USD value of token0 amount plus token1 amount.
     */
    amount_usd?: string | null;
    /**
     * 
     */
    needs_complete?: boolean;
    /**
     * Address of fee recipient (if fee is on).
     */
    fee_to?: string | null;
    /**
     * Amount of tokens sent to fee recipient (if fee is on).
     */
    fee_liquidity?: string | null;
    /**
     * 
     */
    vid?: number;
}

