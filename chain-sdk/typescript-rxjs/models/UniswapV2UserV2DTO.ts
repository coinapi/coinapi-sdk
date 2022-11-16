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
 * A user entity is created for any address that provides liquidity to a pool on Uniswap. This entity can be used to track open positions for users.
 * @export
 * @interface UniswapV2UserV2DTO
 */
export interface UniswapV2UserV2DTO {
    /**
     * @type {string}
     * @memberof UniswapV2UserV2DTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof UniswapV2UserV2DTO
     */
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     * @type {number}
     * @memberof UniswapV2UserV2DTO
     */
    block_number?: number;
    /**
     * User address.
     * @type {string}
     * @memberof UniswapV2UserV2DTO
     */
    id?: string | null;
    /**
     * Total USD value swapped.
     * @type {string}
     * @memberof UniswapV2UserV2DTO
     */
    usd_swapped?: string | null;
    /**
     * 
     * @type {number}
     * @memberof UniswapV2UserV2DTO
     */
    vid?: number;
}
