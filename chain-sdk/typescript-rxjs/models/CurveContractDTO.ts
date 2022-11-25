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
 * @interface CurveContractDTO
 */
export interface CurveContractDTO {
    /**
     * @type {string}
     * @memberof CurveContractDTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof CurveContractDTO
     */
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     * @type {number}
     * @memberof CurveContractDTO
     */
    block_number?: number;
    /**
     * 
     * @type {string}
     * @memberof CurveContractDTO
     */
    id?: string | null;
    /**
     * Human-readable description.
     * @type {string}
     * @memberof CurveContractDTO
     */
    description?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurveContractDTO
     */
    added?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurveContractDTO
     */
    added_at_block?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurveContractDTO
     */
    added_at_transaction?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurveContractDTO
     */
    modified?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurveContractDTO
     */
    modified_at_block?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CurveContractDTO
     */
    modified_at_transaction?: string | null;
    /**
     * 
     * @type {number}
     * @memberof CurveContractDTO
     */
    vid?: number;
}
