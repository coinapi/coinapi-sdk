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

/**
 * Tracks data across all pairs aggregated into a daily bucket.
 * @export
 * @interface UniswapV2UniswapDayDataDTO
 */
export interface UniswapV2UniswapDayDataDTO {
    /**
     * @type {string}
     * @memberof UniswapV2UniswapDayDataDTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof UniswapV2UniswapDayDataDTO
     */
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     * @type {number}
     * @memberof UniswapV2UniswapDayDataDTO
     */
    block_number?: number;
    /**
     * Unix timestamp for start of day / 86400 giving a unique day index.
     * @type {string}
     * @memberof UniswapV2UniswapDayDataDTO
     */
    id?: string | null;
    /**
     * Unix timestamp for start of day.
     * @type {number}
     * @memberof UniswapV2UniswapDayDataDTO
     */
    date?: number;
    /**
     * Total volume across all pairs on this day, stored as a derived amount of ETH.
     * @type {string}
     * @memberof UniswapV2UniswapDayDataDTO
     */
    daily_volume_eth?: string | null;
    /**
     * Total volume across all pairs on this day, stored as a derived amount of USD.
     * @type {string}
     * @memberof UniswapV2UniswapDayDataDTO
     */
    daily_volume_usd?: string | null;
    /**
     * Total volume across all pairs on this day, untracked.
     * @type {string}
     * @memberof UniswapV2UniswapDayDataDTO
     */
    daily_volume_untracked?: string | null;
    /**
     * All time volume across all pairs in ETH up to and including this day.
     * @type {string}
     * @memberof UniswapV2UniswapDayDataDTO
     */
    total_volume_eth?: string | null;
    /**
     * Total liquidity across all pairs in ETH up to and including this day.
     * @type {string}
     * @memberof UniswapV2UniswapDayDataDTO
     */
    total_liquidity_eth?: string | null;
    /**
     * All time volume across all pairs in USD up to and including this day.
     * @type {string}
     * @memberof UniswapV2UniswapDayDataDTO
     */
    total_volume_usd?: string | null;
    /**
     * Total liquidity across all pairs in USD up to and including this day.
     * @type {string}
     * @memberof UniswapV2UniswapDayDataDTO
     */
    total_liquidity_usd?: string | null;
    /**
     * Number of transactions throughout this day.
     * @type {string}
     * @memberof UniswapV2UniswapDayDataDTO
     */
    tx_count?: string | null;
    /**
     * 
     * @type {number}
     * @memberof UniswapV2UniswapDayDataDTO
     */
    vid?: number;
}
