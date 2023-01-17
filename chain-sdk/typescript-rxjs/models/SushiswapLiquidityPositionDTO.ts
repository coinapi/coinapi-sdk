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
 * @interface SushiswapLiquidityPositionDTO
 */
export interface SushiswapLiquidityPositionDTO {
    /**
     * @type {string}
     * @memberof SushiswapLiquidityPositionDTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof SushiswapLiquidityPositionDTO
     */
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     * @type {number}
     * @memberof SushiswapLiquidityPositionDTO
     */
    block_number?: number;
    /**
     * Identifier, format: (pair address)-(user address)
     * @type {string}
     * @memberof SushiswapLiquidityPositionDTO
     */
    id?: string | null;
    /**
     * User address.
     * @type {string}
     * @memberof SushiswapLiquidityPositionDTO
     */
    user?: string | null;
    /**
     * Pair address.
     * @type {string}
     * @memberof SushiswapLiquidityPositionDTO
     */
    pair?: string | null;
    /**
     * Amount of LP tokens minted for this position.
     * @type {string}
     * @memberof SushiswapLiquidityPositionDTO
     */
    liquidity_token_balance?: string | null;
    /**
     * Block number at which position was created.
     * @type {number}
     * @memberof SushiswapLiquidityPositionDTO
     */
    block?: number;
    /**
     * Creation time.
     * @type {number}
     * @memberof SushiswapLiquidityPositionDTO
     */
    timestamp?: number;
    /**
     * 
     * @type {number}
     * @memberof SushiswapLiquidityPositionDTO
     */
    vid?: number;
}
