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
 * @interface CRYPTOPUNKSDataSourcesDTO
 */
export interface CRYPTOPUNKSDataSourcesDTO {
    /**
     * @type {string}
     * @memberof CRYPTOPUNKSDataSourcesDTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof CRYPTOPUNKSDataSourcesDTO
     */
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     * @type {number}
     * @memberof CRYPTOPUNKSDataSourcesDTO
     */
    block_number?: number;
    /**
     * 
     * @type {number}
     * @memberof CRYPTOPUNKSDataSourcesDTO
     */
    vid?: number;
    /**
     * 
     * @type {string}
     * @memberof CRYPTOPUNKSDataSourcesDTO
     */
    block_range?: string | null;
    /**
     * 
     * @type {number}
     * @memberof CRYPTOPUNKSDataSourcesDTO
     */
    causality_region?: number;
    /**
     * 
     * @type {number}
     * @memberof CRYPTOPUNKSDataSourcesDTO
     */
    manifest_idx?: number;
    /**
     * 
     * @type {number}
     * @memberof CRYPTOPUNKSDataSourcesDTO
     */
    parent?: number | null;
    /**
     * 
     * @type {string}
     * @memberof CRYPTOPUNKSDataSourcesDTO
     */
    id?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CRYPTOPUNKSDataSourcesDTO
     */
    param?: string | null;
    /**
     * 
     * @type {string}
     * @memberof CRYPTOPUNKSDataSourcesDTO
     */
    context?: string | null;
    /**
     * 
     * @type {number}
     * @memberof CRYPTOPUNKSDataSourcesDTO
     */
    done_at?: number | null;
}
