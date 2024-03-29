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
 * Tracks pair data across each hour.
 * @export
 * @interface UniswapV2PairHourDataDTO
 */
export interface UniswapV2PairHourDataDTO {
    /**
     * @type {string}
     * @memberof UniswapV2PairHourDataDTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof UniswapV2PairHourDataDTO
     */
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     * @type {number}
     * @memberof UniswapV2PairHourDataDTO
     */
    block_number?: number;
    /**
     * 
     * @type {string}
     * @memberof UniswapV2PairHourDataDTO
     */
    id?: string | null;
    /**
     * Unix timestamp for start of hour.
     * @type {number}
     * @memberof UniswapV2PairHourDataDTO
     */
    hour_start_unix?: number;
    /**
     * Address for pair contract.
     * @type {string}
     * @memberof UniswapV2PairHourDataDTO
     */
    pair?: string | null;
    /**
     * Reserve of token0 (updated during each transaction on pair).
     * @type {string}
     * @memberof UniswapV2PairHourDataDTO
     */
    reserve_0?: string | null;
    /**
     * Reserve of token1 (updated during each transaction on pair).
     * @type {string}
     * @memberof UniswapV2PairHourDataDTO
     */
    reserve_1?: string | null;
    /**
     * Total supply of liquidity token distributed to LPs.
     * @type {string}
     * @memberof UniswapV2PairHourDataDTO
     */
    total_supply?: string | null;
    /**
     * Reserve of token0 plus token1 stored as a derived USD amount.
     * @type {string}
     * @memberof UniswapV2PairHourDataDTO
     */
    reserve_usd?: string | null;
    /**
     * Total amount of token0 swapped throughout hour.
     * @type {string}
     * @memberof UniswapV2PairHourDataDTO
     */
    hourly_volume_token_0?: string | null;
    /**
     * Total amount of token1 swapped throughout hour.
     * @type {string}
     * @memberof UniswapV2PairHourDataDTO
     */
    hourly_volume_token_1?: string | null;
    /**
     * Total volume within pair throughout hour.
     * @type {string}
     * @memberof UniswapV2PairHourDataDTO
     */
    hourly_volume_usd?: string | null;
    /**
     * Amount of transactions on pair throughout hour.
     * @type {string}
     * @memberof UniswapV2PairHourDataDTO
     */
    hourly_txns?: string | null;
    /**
     * 
     * @type {number}
     * @memberof UniswapV2PairHourDataDTO
     */
    vid?: number;
}
