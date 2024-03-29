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
 * @interface UniswapV3TransactionDTO
 */
export interface UniswapV3TransactionDTO {
    /**
     * @type {string}
     * @memberof UniswapV3TransactionDTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof UniswapV3TransactionDTO
     */
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     * @type {number}
     * @memberof UniswapV3TransactionDTO
     */
    block_number?: number;
    /**
     * Transaction hash.
     * @type {string}
     * @memberof UniswapV3TransactionDTO
     */
    id?: string | null;
    /**
     * Timestamp txn was confirmed.
     * @type {string}
     * @memberof UniswapV3TransactionDTO
     */
    timestamp?: string | null;
    /**
     * Gas used during txn execution.
     * @type {string}
     * @memberof UniswapV3TransactionDTO
     */
    gas_used?: string | null;
    /**
     * 
     * @type {string}
     * @memberof UniswapV3TransactionDTO
     */
    gas_price?: string | null;
    /**
     * 
     * @type {number}
     * @memberof UniswapV3TransactionDTO
     */
    vid?: number;
}
