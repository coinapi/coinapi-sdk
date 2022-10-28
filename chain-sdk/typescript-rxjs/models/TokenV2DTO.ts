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

import type {
    BigInteger,
} from './';

/**
 * Stores aggregated information for a specific token across all pairs that token is included in.
 * @export
 * @interface TokenV2DTO
 */
export interface TokenV2DTO {
    /**
     * @type {string}
     * @memberof TokenV2DTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof TokenV2DTO
     */
    recv_time?: string;
    /**
     * 
     * @type {number}
     * @memberof TokenV2DTO
     */
    block_number?: number;
    /**
     * 
     * @type {number}
     * @memberof TokenV2DTO
     */
    vid?: number;
    /**
     * token address
     * @type {string}
     * @memberof TokenV2DTO
     */
    id?: string | null;
    /**
     * token symbol
     * @type {string}
     * @memberof TokenV2DTO
     */
    symbol?: string | null;
    /**
     * token name
     * @type {string}
     * @memberof TokenV2DTO
     */
    name?: string | null;
    /**
     * token decimals
     * @type {number}
     * @memberof TokenV2DTO
     */
    decimals?: number;
    /**
     * @type {BigInteger}
     * @memberof TokenV2DTO
     */
    total_supply?: BigInteger;
    /**
     * amount of token traded all time across all pairs
     * @type {string}
     * @memberof TokenV2DTO
     */
    trade_volume?: string | null;
    /**
     * amount of token in USD traded all time across pairs (only for tokens with liquidity above minimum threshold)
     * @type {string}
     * @memberof TokenV2DTO
     */
    trade_volume_usd?: string | null;
    /**
     * amount of token in USD traded all time across pairs (no minimum liquidity threshold)
     * @type {string}
     * @memberof TokenV2DTO
     */
    untracked_volume_usd?: string | null;
    /**
     * @type {BigInteger}
     * @memberof TokenV2DTO
     */
    tx_count?: BigInteger;
    /**
     * total amount of token provided as liquidity across all pairs
     * @type {string}
     * @memberof TokenV2DTO
     */
    total_liquidity?: string | null;
    /**
     * ETH per token
     * @type {string}
     * @memberof TokenV2DTO
     */
    derived_eth?: string | null;
    /**
     * @type {string}
     * @memberof TokenV2DTO
     */
    readonly token_symbol?: string | null;
}
