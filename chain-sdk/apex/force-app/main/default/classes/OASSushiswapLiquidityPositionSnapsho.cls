/*
 * On Chain Dapps - REST API
 * \nThis section will provide necessary information about the `OnChain API` protocol. \n<br/><br/>\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.        \n                    
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * This entity is used to store data about a user\&#39;s liquidity position over time. This information, along with information from the pair itself can be used to provide position sizes, token deposits, and more. It gets created and never updated.
 */
public class OASSushiswapLiquidityPositionSnapsho implements OAS.MappedProperties {
    /**
     * Get entryTime
     * @return entryTime
     */
    public Datetime entryTime { get; set; }

    /**
     * Get recvTime
     * @return recvTime
     */
    public Datetime recvTime { get; set; }

    /**
     * Number of block in which entity was recorded.
     * @return blockNumber
     */
    public Long blockNumber { get; set; }

    /**
     * Identifier, format: (pair address)-(user address)-(timestamp)
     * @return id
     */
    public String id { get; set; }

    /**
     * Reference to LP identifier.
     * @return liquidityPosition
     */
    public String liquidityPosition { get; set; }

    /**
     * Creation time.
     * @return timestamp
     */
    public Integer timestamp { get; set; }

    /**
     * Block in which snapshot has been created.
     * @return block
     */
    public Integer block { get; set; }

    /**
     * Reference to user.
     * @return user
     */
    public String user { get; set; }

    /**
     * Reference to the pair liquidity is being provided on.
     * @return pair
     */
    public String pair { get; set; }

    /**
     * Snapshot of token0 price in USD.
     * @return token0PriceUsd
     */
    public String token0PriceUsd { get; set; }

    /**
     * Snapshot of token0 price in USD.
     * @return token1PriceUsd
     */
    public String token1PriceUsd { get; set; }

    /**
     * Snapshot of pair token0 reserves.
     * @return reserve0
     */
    public String reserve0 { get; set; }

    /**
     * Snapshot of pair token1 reserves.
     * @return reserve1
     */
    public String reserve1 { get; set; }

    /**
     * Snapshot of pair reserves in USD.
     * @return reserveUsd
     */
    public String reserveUsd { get; set; }

    /**
     * Snapshot of pool token supply.
     * @return liquidityTokenTotalSupply
     */
    public String liquidityTokenTotalSupply { get; set; }

    /**
     * Snapshot of users pool token balance.
     * @return liquidityTokenBalance
     */
    public String liquidityTokenBalance { get; set; }

    /**
     * 
     * @return vid
     */
    public Long vid { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'liquidity_position' => 'liquidityPosition',
        'token_0_price_usd' => 'token0PriceUsd',
        'token_1_price_usd' => 'token1PriceUsd',
        'reserve_0' => 'reserve0',
        'reserve_1' => 'reserve1',
        'reserve_usd' => 'reserveUsd',
        'liquidity_token_total_supply' => 'liquidityTokenTotalSupply',
        'liquidity_token_balance' => 'liquidityTokenBalance'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'liquidity_position' => 'liquidityPosition',
        'token_0_price_usd' => 'token0PriceUsd',
        'token_1_price_usd' => 'token1PriceUsd',
        'reserve_0' => 'reserve0',
        'reserve_1' => 'reserve1',
        'reserve_usd' => 'reserveUsd',
        'liquidity_token_total_supply' => 'liquidityTokenTotalSupply',
        'liquidity_token_balance' => 'liquidityTokenBalance'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'liquidity_position' => 'liquidityPosition',
        'token_0_price_usd' => 'token0PriceUsd',
        'token_1_price_usd' => 'token1PriceUsd',
        'reserve_0' => 'reserve0',
        'reserve_1' => 'reserve1',
        'reserve_usd' => 'reserveUsd',
        'liquidity_token_total_supply' => 'liquidityTokenTotalSupply',
        'liquidity_token_balance' => 'liquidityTokenBalance'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'liquidity_position' => 'liquidityPosition',
        'token_0_price_usd' => 'token0PriceUsd',
        'token_1_price_usd' => 'token1PriceUsd',
        'reserve_0' => 'reserve0',
        'reserve_1' => 'reserve1',
        'reserve_usd' => 'reserveUsd',
        'liquidity_token_total_supply' => 'liquidityTokenTotalSupply',
        'liquidity_token_balance' => 'liquidityTokenBalance'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'liquidity_position' => 'liquidityPosition',
        'token_0_price_usd' => 'token0PriceUsd',
        'token_1_price_usd' => 'token1PriceUsd',
        'reserve_0' => 'reserve0',
        'reserve_1' => 'reserve1',
        'reserve_usd' => 'reserveUsd',
        'liquidity_token_total_supply' => 'liquidityTokenTotalSupply',
        'liquidity_token_balance' => 'liquidityTokenBalance'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'liquidity_position' => 'liquidityPosition',
        'token_0_price_usd' => 'token0PriceUsd',
        'token_1_price_usd' => 'token1PriceUsd',
        'reserve_0' => 'reserve0',
        'reserve_1' => 'reserve1',
        'reserve_usd' => 'reserveUsd',
        'liquidity_token_total_supply' => 'liquidityTokenTotalSupply',
        'liquidity_token_balance' => 'liquidityTokenBalance'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'liquidity_position' => 'liquidityPosition',
        'token_0_price_usd' => 'token0PriceUsd',
        'token_1_price_usd' => 'token1PriceUsd',
        'reserve_0' => 'reserve0',
        'reserve_1' => 'reserve1',
        'reserve_usd' => 'reserveUsd',
        'liquidity_token_total_supply' => 'liquidityTokenTotalSupply',
        'liquidity_token_balance' => 'liquidityTokenBalance'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'liquidity_position' => 'liquidityPosition',
        'token_0_price_usd' => 'token0PriceUsd',
        'token_1_price_usd' => 'token1PriceUsd',
        'reserve_0' => 'reserve0',
        'reserve_1' => 'reserve1',
        'reserve_usd' => 'reserveUsd',
        'liquidity_token_total_supply' => 'liquidityTokenTotalSupply',
        'liquidity_token_balance' => 'liquidityTokenBalance'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'liquidity_position' => 'liquidityPosition',
        'token_0_price_usd' => 'token0PriceUsd',
        'token_1_price_usd' => 'token1PriceUsd',
        'reserve_0' => 'reserve0',
        'reserve_1' => 'reserve1',
        'reserve_usd' => 'reserveUsd',
        'liquidity_token_total_supply' => 'liquidityTokenTotalSupply',
        'liquidity_token_balance' => 'liquidityTokenBalance'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'liquidity_position' => 'liquidityPosition',
        'token_0_price_usd' => 'token0PriceUsd',
        'token_1_price_usd' => 'token1PriceUsd',
        'reserve_0' => 'reserve0',
        'reserve_1' => 'reserve1',
        'reserve_usd' => 'reserveUsd',
        'liquidity_token_total_supply' => 'liquidityTokenTotalSupply',
        'liquidity_token_balance' => 'liquidityTokenBalance'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'liquidity_position' => 'liquidityPosition',
        'token_0_price_usd' => 'token0PriceUsd',
        'token_1_price_usd' => 'token1PriceUsd',
        'reserve_0' => 'reserve0',
        'reserve_1' => 'reserve1',
        'reserve_usd' => 'reserveUsd',
        'liquidity_token_total_supply' => 'liquidityTokenTotalSupply',
        'liquidity_token_balance' => 'liquidityTokenBalance'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASSushiswapLiquidityPositionSnapsho getExample() {
        OASSushiswapLiquidityPositionSnapsho sushiswapLiquidityPositionSnapshotDTO = new OASSushiswapLiquidityPositionSnapsho();
          sushiswapLiquidityPositionSnapshotDTO.entryTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          sushiswapLiquidityPositionSnapshotDTO.recvTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          sushiswapLiquidityPositionSnapshotDTO.blockNumber = 123456789L;
          sushiswapLiquidityPositionSnapshotDTO.id = '';
          sushiswapLiquidityPositionSnapshotDTO.liquidityPosition = '';
          sushiswapLiquidityPositionSnapshotDTO.timestamp = 0;
          sushiswapLiquidityPositionSnapshotDTO.block = 0;
          sushiswapLiquidityPositionSnapshotDTO.user = '';
          sushiswapLiquidityPositionSnapshotDTO.pair = '';
          sushiswapLiquidityPositionSnapshotDTO.token0PriceUsd = '';
          sushiswapLiquidityPositionSnapshotDTO.token1PriceUsd = '';
          sushiswapLiquidityPositionSnapshotDTO.reserve0 = '';
          sushiswapLiquidityPositionSnapshotDTO.reserve1 = '';
          sushiswapLiquidityPositionSnapshotDTO.reserveUsd = '';
          sushiswapLiquidityPositionSnapshotDTO.liquidityTokenTotalSupply = '';
          sushiswapLiquidityPositionSnapshotDTO.liquidityTokenBalance = '';
          sushiswapLiquidityPositionSnapshotDTO.vid = 123456789L;
        return sushiswapLiquidityPositionSnapshotDTO;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASSushiswapLiquidityPositionSnapsho) {           
            OASSushiswapLiquidityPositionSnapsho sushiswapLiquidityPositionSnapshotDTO = (OASSushiswapLiquidityPositionSnapsho) obj;
            return this.entryTime == sushiswapLiquidityPositionSnapshotDTO.entryTime
                && this.recvTime == sushiswapLiquidityPositionSnapshotDTO.recvTime
                && this.blockNumber == sushiswapLiquidityPositionSnapshotDTO.blockNumber
                && this.id == sushiswapLiquidityPositionSnapshotDTO.id
                && this.liquidityPosition == sushiswapLiquidityPositionSnapshotDTO.liquidityPosition
                && this.timestamp == sushiswapLiquidityPositionSnapshotDTO.timestamp
                && this.block == sushiswapLiquidityPositionSnapshotDTO.block
                && this.user == sushiswapLiquidityPositionSnapshotDTO.user
                && this.pair == sushiswapLiquidityPositionSnapshotDTO.pair
                && this.token0PriceUsd == sushiswapLiquidityPositionSnapshotDTO.token0PriceUsd
                && this.token1PriceUsd == sushiswapLiquidityPositionSnapshotDTO.token1PriceUsd
                && this.reserve0 == sushiswapLiquidityPositionSnapshotDTO.reserve0
                && this.reserve1 == sushiswapLiquidityPositionSnapshotDTO.reserve1
                && this.reserveUsd == sushiswapLiquidityPositionSnapshotDTO.reserveUsd
                && this.liquidityTokenTotalSupply == sushiswapLiquidityPositionSnapshotDTO.liquidityTokenTotalSupply
                && this.liquidityTokenBalance == sushiswapLiquidityPositionSnapshotDTO.liquidityTokenBalance
                && this.vid == sushiswapLiquidityPositionSnapshotDTO.vid;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (entryTime == null ? 0 : System.hashCode(entryTime));
        hashCode = (17 * hashCode) + (recvTime == null ? 0 : System.hashCode(recvTime));
        hashCode = (17 * hashCode) + (blockNumber == null ? 0 : System.hashCode(blockNumber));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (liquidityPosition == null ? 0 : System.hashCode(liquidityPosition));
        hashCode = (17 * hashCode) + (timestamp == null ? 0 : System.hashCode(timestamp));
        hashCode = (17 * hashCode) + (block == null ? 0 : System.hashCode(block));
        hashCode = (17 * hashCode) + (user == null ? 0 : System.hashCode(user));
        hashCode = (17 * hashCode) + (pair == null ? 0 : System.hashCode(pair));
        hashCode = (17 * hashCode) + (token0PriceUsd == null ? 0 : System.hashCode(token0PriceUsd));
        hashCode = (17 * hashCode) + (token1PriceUsd == null ? 0 : System.hashCode(token1PriceUsd));
        hashCode = (17 * hashCode) + (reserve0 == null ? 0 : System.hashCode(reserve0));
        hashCode = (17 * hashCode) + (reserve1 == null ? 0 : System.hashCode(reserve1));
        hashCode = (17 * hashCode) + (reserveUsd == null ? 0 : System.hashCode(reserveUsd));
        hashCode = (17 * hashCode) + (liquidityTokenTotalSupply == null ? 0 : System.hashCode(liquidityTokenTotalSupply));
        hashCode = (17 * hashCode) + (liquidityTokenBalance == null ? 0 : System.hashCode(liquidityTokenBalance));
        hashCode = (17 * hashCode) + (vid == null ? 0 : System.hashCode(vid));
        return hashCode;
    }
}

