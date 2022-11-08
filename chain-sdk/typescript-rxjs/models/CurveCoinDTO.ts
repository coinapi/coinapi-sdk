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
 * @interface CurveCoinDTO
 */
export interface CurveCoinDTO {
    /**
     * @type {string}
     * @memberof CurveCoinDTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof CurveCoinDTO
     */
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     * @type {number}
     * @memberof CurveCoinDTO
     */
    block_number?: number;
    /**
     * Identifier, format: <pool_id>-<coin_index>.
     * @type {string}
     * @memberof CurveCoinDTO
     */
    id?: string | null;
    /**
     * Coin index.
     * @type {number}
     * @memberof CurveCoinDTO
     */
    index?: number;
    /**
     * 
     * @type {string}
     * @memberof CurveCoinDTO
     */
    pool?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurveCoinDTO
     */
    token?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurveCoinDTO
     */
    underlying?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurveCoinDTO
     */
    balance?: string | null;
    /**
     * Exchange rate between this coin and the associated underlying coin within the pool.
     * @type {string}
     * @memberof CurveCoinDTO
     */
    rate?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurveCoinDTO
     */
    updated?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurveCoinDTO
     */
    updated_at_block?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurveCoinDTO
     */
    updated_at_transaction?: string | null;
    /**
     * 
     * @type {number}
     * @memberof CurveCoinDTO
     */
    vid?: number;
    /**
     * 
     * @type {string}
     * @memberof CurveCoinDTO
     */
    block_range?: string | null;
}
