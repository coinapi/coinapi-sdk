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
 * Withdraw of an user.
 * @export
 * @interface DexWithdrawDTO
 */
export interface DexWithdrawDTO {
    /**
     * @type {string}
     * @memberof DexWithdrawDTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof DexWithdrawDTO
     */
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     * @type {number}
     * @memberof DexWithdrawDTO
     */
    block_number?: number;
    /**
     * Identifier, format: <transaction hash>-<id>.
     * @type {string}
     * @memberof DexWithdrawDTO
     */
    id?: string | null;
    /**
     * 
     * @type {string}
     * @memberof DexWithdrawDTO
     */
    user?: string | null;
    /**
     * 
     * @type {string}
     * @memberof DexWithdrawDTO
     */
    token_address?: string | null;
    /**
     * 
     * @type {string}
     * @memberof DexWithdrawDTO
     */
    amount?: string | null;
    /**
     * 
     * @type {string}
     * @memberof DexWithdrawDTO
     */
    create_epoch?: string | null;
    /**
     * 
     * @type {string}
     * @memberof DexWithdrawDTO
     */
    create_batch_id?: string | null;
    /**
     * 
     * @type {string}
     * @memberof DexWithdrawDTO
     */
    tx_hash?: string | null;
    /**
     * 
     * @type {number}
     * @memberof DexWithdrawDTO
     */
    vid?: number;
}