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
 * Deposit of an user.
 * @export
 * @interface DexDepositDTO
 */
export interface DexDepositDTO {
    /**
     * @type {string}
     * @memberof DexDepositDTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof DexDepositDTO
     */
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     * @type {number}
     * @memberof DexDepositDTO
     */
    block_number?: number;
    /**
     * Identifier, format: (transaction hash)-(token id).
     * @type {string}
     * @memberof DexDepositDTO
     */
    id?: string | null;
    /**
     * User address.
     * @type {string}
     * @memberof DexDepositDTO
     */
    user?: string | null;
    /**
     * Token address.
     * @type {string}
     * @memberof DexDepositDTO
     */
    token_address?: string | null;
    /**
     * Amount of deposit.
     * @type {string}
     * @memberof DexDepositDTO
     */
    amount?: string | null;
    /**
     * Identifier (numerical).
     * @type {string}
     * @memberof DexDepositDTO
     */
    batch_id?: string | null;
    /**
     * Create epoch.
     * @type {string}
     * @memberof DexDepositDTO
     */
    create_epoch?: string | null;
    /**
     * Transaction hash.
     * @type {string}
     * @memberof DexDepositDTO
     */
    tx_hash?: string | null;
    /**
     * 
     * @type {number}
     * @memberof DexDepositDTO
     */
    vid?: number;
}
