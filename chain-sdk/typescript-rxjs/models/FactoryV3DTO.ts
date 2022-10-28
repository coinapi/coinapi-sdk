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
 * @interface FactoryV3DTO
 */
export interface FactoryV3DTO {
    /**
     * @type {string}
     * @memberof FactoryV3DTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof FactoryV3DTO
     */
    recv_time?: string;
    /**
     * 
     * @type {number}
     * @memberof FactoryV3DTO
     */
    block_number?: number;
    /**
     * 
     * @type {string}
     * @memberof FactoryV3DTO
     */
    id?: string | null;
    /**
     * 
     * @type {string}
     * @memberof FactoryV3DTO
     */
    pool_count?: string | null;
    /**
     * 
     * @type {string}
     * @memberof FactoryV3DTO
     */
    tx_count?: string | null;
    /**
     * 
     * @type {string}
     * @memberof FactoryV3DTO
     */
    total_volume_usd?: string | null;
    /**
     * 
     * @type {string}
     * @memberof FactoryV3DTO
     */
    total_volume_eth?: string | null;
    /**
     * 
     * @type {string}
     * @memberof FactoryV3DTO
     */
    total_fees_usd?: string | null;
    /**
     * 
     * @type {string}
     * @memberof FactoryV3DTO
     */
    total_fees_eth?: string | null;
    /**
     * 
     * @type {string}
     * @memberof FactoryV3DTO
     */
    untracked_volume_usd?: string | null;
    /**
     * 
     * @type {string}
     * @memberof FactoryV3DTO
     */
    total_value_locked_usd?: string | null;
    /**
     * 
     * @type {string}
     * @memberof FactoryV3DTO
     */
    total_value_locked_eth?: string | null;
    /**
     * 
     * @type {string}
     * @memberof FactoryV3DTO
     */
    total_value_locked_usd_untracked?: string | null;
    /**
     * 
     * @type {string}
     * @memberof FactoryV3DTO
     */
    total_value_locked_eth_untracked?: string | null;
    /**
     * 
     * @type {string}
     * @memberof FactoryV3DTO
     */
    owner?: string | null;
    /**
     * 
     * @type {number}
     * @memberof FactoryV3DTO
     */
    vid?: number;
}
