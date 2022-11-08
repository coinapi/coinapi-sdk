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
 * Mint entities are created for every emitted Mint event on the Uniswap core contracts. The Mint entity stores key data about the event like token amounts, who sent the transaction, who received the liquidity, and more. This entity can be used to track liquidity provisions on pairs.
 */
export interface UniswapV2MintV2DTO { 
    entry_time?: string;
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     */
    block_number?: number;
    /**
     * Transaction hash plus index in the transaction mint array.
     */
    id?: string | null;
    /**
     * Reference to the transaction Mint was included in.
     */
    transaction?: string | null;
    /**
     * Timestamp of Mint, used to sort recent liquidity provisions.
     */
    timestamp?: string | null;
    /**
     * Reference to pair.
     */
    pair?: string | null;
    /**
     * Recipient of liquidity tokens.
     */
    to?: string | null;
    /**
     * Amount of liquidity tokens minted.
     */
    liquidity?: string | null;
    /**
     * Address that initiated the liquidity provision.
     */
    sender?: string | null;
    /**
     * Amount of token0 provided.
     */
    amount_0?: string | null;
    /**
     * Amount of token1 provided.
     */
    amount_1?: string | null;
    /**
     * Index in the transaction event was emitted.
     */
    log_index?: string | null;
    /**
     * Derived USD value of token0 amount plus token1 amount.
     */
    amount_usd?: string | null;
    /**
     * Address of fee recipient (if fee is on).
     */
    fee_to?: string | null;
    /**
     * Amount of liquidity sent to fee recipient (if fee is on).
     */
    fee_liquidity?: string | null;
    /**
     * 
     */
    vid?: number;
    /**
     * 
     */
    block_range?: string | null;
}

