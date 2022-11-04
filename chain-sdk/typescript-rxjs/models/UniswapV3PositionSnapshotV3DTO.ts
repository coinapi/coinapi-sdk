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
 * @interface UniswapV3PositionSnapshotV3DTO
 */
export interface UniswapV3PositionSnapshotV3DTO {
    /**
     * @type {string}
     * @memberof UniswapV3PositionSnapshotV3DTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof UniswapV3PositionSnapshotV3DTO
     */
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     * @type {number}
     * @memberof UniswapV3PositionSnapshotV3DTO
     */
    block_number?: number;
    /**
     * NFT token identifier, format: <NFT token id>#<block number>
     * @type {string}
     * @memberof UniswapV3PositionSnapshotV3DTO
     */
    id?: string | null;
    /**
     * Owner of the NFT.
     * @type {string}
     * @memberof UniswapV3PositionSnapshotV3DTO
     */
    owner?: string | null;
    /**
     * Pool the position is within.
     * @type {string}
     * @memberof UniswapV3PositionSnapshotV3DTO
     */
    pool?: string | null;
    /**
     * Position of which the snap was taken of.
     * @type {string}
     * @memberof UniswapV3PositionSnapshotV3DTO
     */
    position?: string | null;
    /**
     * Timestamp of block in which the snap was created.
     * @type {string}
     * @memberof UniswapV3PositionSnapshotV3DTO
     */
    timestamp?: string | null;
    /**
     * Total position liquidity.
     * @type {string}
     * @memberof UniswapV3PositionSnapshotV3DTO
     */
    liquidity?: string | null;
    /**
     * Amount of token 0 ever deposited to position.
     * @type {string}
     * @memberof UniswapV3PositionSnapshotV3DTO
     */
    deposited_token_0?: string | null;
    /**
     * Amount of token 1 ever deposited to position.
     * @type {string}
     * @memberof UniswapV3PositionSnapshotV3DTO
     */
    deposited_token_1?: string | null;
    /**
     * Amount of token 0 ever withdrawn from position (without fees).
     * @type {string}
     * @memberof UniswapV3PositionSnapshotV3DTO
     */
    withdrawn_token_0?: string | null;
    /**
     * Amount of token 1 ever withdrawn from position (without fees).
     * @type {string}
     * @memberof UniswapV3PositionSnapshotV3DTO
     */
    withdrawn_token_1?: string | null;
    /**
     * All time collected fees in token0.
     * @type {string}
     * @memberof UniswapV3PositionSnapshotV3DTO
     */
    collected_fees_token_0?: string | null;
    /**
     * All time collected fees in token1.
     * @type {string}
     * @memberof UniswapV3PositionSnapshotV3DTO
     */
    collected_fees_token_1?: string | null;
    /**
     * Transaction in which the snapshot was initialized.
     * @type {string}
     * @memberof UniswapV3PositionSnapshotV3DTO
     */
    transaction?: string | null;
    /**
     * Variable needed for fee computation.
     * @type {string}
     * @memberof UniswapV3PositionSnapshotV3DTO
     */
    fee_growth_inside_0_last_x128?: string | null;
    /**
     * Variable needed for fee computation.
     * @type {string}
     * @memberof UniswapV3PositionSnapshotV3DTO
     */
    fee_growth_inside_1_last_x128?: string | null;
    /**
     * 
     * @type {number}
     * @memberof UniswapV3PositionSnapshotV3DTO
     */
    vid?: number;
}
