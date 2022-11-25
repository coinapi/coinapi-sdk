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
 * @interface CurveUnderlyingCoinDTO
 */
export interface CurveUnderlyingCoinDTO {
    /**
     * @type {string}
     * @memberof CurveUnderlyingCoinDTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof CurveUnderlyingCoinDTO
     */
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     * @type {number}
     * @memberof CurveUnderlyingCoinDTO
     */
    block_number?: number;
    /**
     * Equals to: <pool_id>-<coin_index>.
     * @type {string}
     * @memberof CurveUnderlyingCoinDTO
     */
    id?: string | null;
    /**
     * Coin index.
     * @type {number}
     * @memberof CurveUnderlyingCoinDTO
     */
    index?: number;
    /**
     * 
     * @type {string}
     * @memberof CurveUnderlyingCoinDTO
     */
    pool?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurveUnderlyingCoinDTO
     */
    token?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurveUnderlyingCoinDTO
     */
    coin?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurveUnderlyingCoinDTO
     */
    balance?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurveUnderlyingCoinDTO
     */
    updated?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurveUnderlyingCoinDTO
     */
    updated_at_block?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurveUnderlyingCoinDTO
     */
    updated_at_transaction?: string | null;
    /**
     * 
     * @type {number}
     * @memberof CurveUnderlyingCoinDTO
     */
    vid?: number;
}
