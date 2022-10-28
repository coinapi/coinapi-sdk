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
 * @export
 * @interface TokenDTO
 */
export interface TokenDTO {
    /**
     * @type {string}
     * @memberof TokenDTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof TokenDTO
     */
    recv_time?: string;
    /**
     * 
     * @type {number}
     * @memberof TokenDTO
     */
    block_number?: number;
    /**
     * 
     * @type {string}
     * @memberof TokenDTO
     */
    id?: string | null;
    /**
     * 
     * @type {string}
     * @memberof TokenDTO
     */
    factory?: string | null;
    /**
     * 
     * @type {string}
     * @memberof TokenDTO
     */
    symbol?: string | null;
    /**
     * 
     * @type {string}
     * @memberof TokenDTO
     */
    name?: string | null;
    /**
     * 
     * @type {string}
     * @memberof TokenDTO
     */
    decimals?: string | null;
    /**
     * 
     * @type {string}
     * @memberof TokenDTO
     */
    total_supply?: string | null;
    /**
     * 
     * @type {string}
     * @memberof TokenDTO
     */
    volume?: string | null;
    /**
     * 
     * @type {string}
     * @memberof TokenDTO
     */
    volume_usd?: string | null;
    /**
     * 
     * @type {string}
     * @memberof TokenDTO
     */
    untracked_volume_usd?: string | null;
    /**
     * 
     * @type {string}
     * @memberof TokenDTO
     */
    tx_count?: string | null;
    /**
     * 
     * @type {string}
     * @memberof TokenDTO
     */
    liquidity?: string | null;
    /**
     * 
     * @type {string}
     * @memberof TokenDTO
     */
    derived_eth?: string | null;
    /**
     * 
     * @type {Array<string>}
     * @memberof TokenDTO
     */
    whitelist_pairs?: Array<string> | null;
    /**
     * 
     * @type {number}
     * @memberof TokenDTO
     */
    vid?: number;
    /**
     * @type {string}
     * @memberof TokenDTO
     */
    readonly token_symbol?: string | null;
}
