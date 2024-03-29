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
 * The Uniswap Factory entity is responsible for storing aggregate information across all Uniswap pairs. It can be used to view stats about total liquidity, volume, amount of pairs and more.
 * @export
 * @interface UniswapV3FactoryDTO
 */
export interface UniswapV3FactoryDTO {
    /**
     * @type {string}
     * @memberof UniswapV3FactoryDTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof UniswapV3FactoryDTO
     */
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     * @type {number}
     * @memberof UniswapV3FactoryDTO
     */
    block_number?: number;
    /**
     * Factory address.
     * @type {string}
     * @memberof UniswapV3FactoryDTO
     */
    id?: string | null;
    /**
     * Amount of pools created.
     * @type {string}
     * @memberof UniswapV3FactoryDTO
     */
    pool_count?: string | null;
    /**
     * Amount of transactions all time.
     * @type {string}
     * @memberof UniswapV3FactoryDTO
     */
    tx_count?: string | null;
    /**
     * Total volume all time in derived USD.
     * @type {string}
     * @memberof UniswapV3FactoryDTO
     */
    total_volume_usd?: string | null;
    /**
     * Total volume all time in derived ETH.
     * @type {string}
     * @memberof UniswapV3FactoryDTO
     */
    total_volume_eth?: string | null;
    /**
     * Total swap fees all time in USD.
     * @type {string}
     * @memberof UniswapV3FactoryDTO
     */
    total_fees_usd?: string | null;
    /**
     * All volume even through less reliable USD values.
     * @type {string}
     * @memberof UniswapV3FactoryDTO
     */
    total_fees_eth?: string | null;
    /**
     * All volume even through less reliable USD values.
     * @type {string}
     * @memberof UniswapV3FactoryDTO
     */
    untracked_volume_usd?: string | null;
    /**
     * Total value locked derived in USD.
     * @type {string}
     * @memberof UniswapV3FactoryDTO
     */
    total_value_locked_usd?: string | null;
    /**
     * Total value locked derived in ETH.
     * @type {string}
     * @memberof UniswapV3FactoryDTO
     */
    total_value_locked_eth?: string | null;
    /**
     * Total value locked derived in USD untracked.
     * @type {string}
     * @memberof UniswapV3FactoryDTO
     */
    total_value_locked_usd_untracked?: string | null;
    /**
     * Total value locked derived in ETH untracked.
     * @type {string}
     * @memberof UniswapV3FactoryDTO
     */
    total_value_locked_eth_untracked?: string | null;
    /**
     * Current owner of the factory.
     * @type {string}
     * @memberof UniswapV3FactoryDTO
     */
    owner?: string | null;
    /**
     * 
     * @type {number}
     * @memberof UniswapV3FactoryDTO
     */
    vid?: number;
}
