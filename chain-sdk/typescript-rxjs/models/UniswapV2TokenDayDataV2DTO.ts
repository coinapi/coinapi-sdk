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
 * Token data aggregated across all pairs that include token.
 * @export
 * @interface UniswapV2TokenDayDataV2DTO
 */
export interface UniswapV2TokenDayDataV2DTO {
    /**
     * @type {string}
     * @memberof UniswapV2TokenDayDataV2DTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof UniswapV2TokenDayDataV2DTO
     */
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     * @type {number}
     * @memberof UniswapV2TokenDayDataV2DTO
     */
    block_number?: number;
    /**
     * Token address and day id (day start timestamp in unix / 86400) concatenated with a dash.
     * @type {string}
     * @memberof UniswapV2TokenDayDataV2DTO
     */
    id?: string | null;
    /**
     * Unix timestamp for start of day.
     * @type {number}
     * @memberof UniswapV2TokenDayDataV2DTO
     */
    date?: number;
    /**
     * Reference to token entity.
     * @type {string}
     * @memberof UniswapV2TokenDayDataV2DTO
     */
    token?: string | null;
    /**
     * Amount of token swapped across all pairs throughout day.
     * @type {string}
     * @memberof UniswapV2TokenDayDataV2DTO
     */
    daily_volume_token?: string | null;
    /**
     * Amount of token swapped across all pairs throughout day stored as a derived amount of ETH.
     * @type {string}
     * @memberof UniswapV2TokenDayDataV2DTO
     */
    daily_volume_eth?: string | null;
    /**
     * Amount of token swapped across all pairs throughout day stored as a derived amount of USD.
     * @type {string}
     * @memberof UniswapV2TokenDayDataV2DTO
     */
    daily_volume_usd?: string | null;
    /**
     * Amount of transactions with this token across all pairs.
     * @type {string}
     * @memberof UniswapV2TokenDayDataV2DTO
     */
    daily_txns?: string | null;
    /**
     * Token amount of token deposited across all pairs.
     * @type {string}
     * @memberof UniswapV2TokenDayDataV2DTO
     */
    total_liquidity_token?: string | null;
    /**
     * Token amount of token deposited across all pairs stored as amount of ETH.
     * @type {string}
     * @memberof UniswapV2TokenDayDataV2DTO
     */
    total_liquidity_eth?: string | null;
    /**
     * Token amount of token deposited across all pairs stored as amount of USD.
     * @type {string}
     * @memberof UniswapV2TokenDayDataV2DTO
     */
    total_liquidity_usd?: string | null;
    /**
     * Price of token in derived USD.
     * @type {string}
     * @memberof UniswapV2TokenDayDataV2DTO
     */
    price_usd?: string | null;
    /**
     * 
     * @type {number}
     * @memberof UniswapV2TokenDayDataV2DTO
     */
    vid?: number;
}
