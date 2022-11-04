// tslint:disable
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
 * Data accumulated and condensed into day stats for each pool.
 * @export
 * @interface UniswapV3PoolDayDataV3DTO
 */
export interface UniswapV3PoolDayDataV3DTO {
    /**
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     * @type {number}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    block_number?: number;
    /**
     * Identifier, format: <pool address>-<day id>.
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    id?: string | null;
    /**
     * Timestamp rounded to current day by dividing by 86400
     * @type {number}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    date?: number;
    /**
     * Pointer to pool.
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    pool?: string | null;
    /**
     * In range liquidity at end of period.
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    liquidity?: string | null;
    /**
     * Current price tracker at end of period.
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    sqrt_price?: string | null;
    /**
     * Price of token0 - derived from sqrtPrice.
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    token_0_price?: string | null;
    /**
     * Price of token1 - derived from sqrtPrice.
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    token_1_price?: string | null;
    /**
     * Current tick at end of period.
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    tick?: string | null;
    /**
     * Tracker for global fee growth.
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    fee_growth_global_0x128?: string | null;
    /**
     * Tracker for global fee growth.
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    fee_growth_global_1x128?: string | null;
    /**
     * Total value locked derived in USD at end of period.
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    tvl_usd?: string | null;
    /**
     * Volume in token0.
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    volume_token_0?: string | null;
    /**
     * Volume in token1.
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    volume_token_1?: string | null;
    /**
     * Volume in USD.
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    volume_usd?: string | null;
    /**
     * Fees in USD.
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    fees_usd?: string | null;
    /**
     * Number of transactions during period.
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    tx_count?: string | null;
    /**
     * Opening price of token0.
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    open?: string | null;
    /**
     * High price of token0.
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    high?: string | null;
    /**
     * Low price of token0.
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    low?: string | null;
    /**
     * Close price of token0.
     * @type {string}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    close?: string | null;
    /**
     * 
     * @type {number}
     * @memberof UniswapV3PoolDayDataV3DTO
     */
    vid?: number;
}