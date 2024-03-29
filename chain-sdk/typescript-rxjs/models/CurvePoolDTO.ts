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
 * @export
 * @interface CurvePoolDTO
 */
export interface CurvePoolDTO {
    /**
     * @type {string}
     * @memberof CurvePoolDTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof CurvePoolDTO
     */
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     * @type {number}
     * @memberof CurvePoolDTO
     */
    block_number?: number;
    /**
     * Pool address.
     * @type {string}
     * @memberof CurvePoolDTO
     */
    id?: string | null;
    /**
     * Pool\'s human-readable name.
     * @type {string}
     * @memberof CurvePoolDTO
     */
    name?: string | null;
    /**
     * Identify whether pool is a metapool.
     * @type {boolean}
     * @memberof CurvePoolDTO
     */
    is_meta?: boolean;
    /**
     * Registry contract address from where this pool was registered.
     * @type {string}
     * @memberof CurvePoolDTO
     */
    registry_address?: string | null;
    /**
     * Swap contract address.
     * @type {string}
     * @memberof CurvePoolDTO
     */
    swap_address?: string | null;
    /**
     * Address of the token representing LP share.
     * @type {string}
     * @memberof CurvePoolDTO
     */
    lp_token?: string | null;
    /**
     * Number of coins composing the pool.
     * @type {string}
     * @memberof CurvePoolDTO
     */
    coin_count?: string | null;
    /**
     * Number of underlying coins composing the pool.
     * @type {string}
     * @memberof CurvePoolDTO
     */
    underlying_count?: string | null;
    /**
     * Amplification coefficient multiplied by n * (n - 1).
     * @type {string}
     * @memberof CurvePoolDTO
     */
    a?: string | null;
    /**
     * Fee to charge for exchanges.
     * @type {string}
     * @memberof CurvePoolDTO
     */
    fee?: string | null;
    /**
     * Admin fee is represented as a percentage of the total fee collected on a swap.
     * @type {string}
     * @memberof CurvePoolDTO
     */
    admin_fee?: string | null;
    /**
     * Admin address.
     * @type {string}
     * @memberof CurvePoolDTO
     */
    owner?: string | null;
    /**
     * Average dollar value of pool token.
     * @type {string}
     * @memberof CurvePoolDTO
     */
    virtual_price?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurvePoolDTO
     */
    locked?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurvePoolDTO
     */
    added_at?: string;
    /**
     * 
     * @type {string}
     * @memberof CurvePoolDTO
     */
    added_at_block?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurvePoolDTO
     */
    added_at_transaction?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurvePoolDTO
     */
    removed_at?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurvePoolDTO
     */
    removed_at_block?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurvePoolDTO
     */
    removed_at_transaction?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurvePoolDTO
     */
    exchange_count?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurvePoolDTO
     */
    gauge_count?: string | null;
    /**
     * 
     * @type {number}
     * @memberof CurvePoolDTO
     */
    vid?: number;
    /**
     * @type {number}
     * @memberof CurvePoolDTO
     */
    readonly evaluated_ask?: number;
}
