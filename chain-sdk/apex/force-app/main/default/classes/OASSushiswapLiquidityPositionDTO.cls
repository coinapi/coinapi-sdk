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
 * OASSushiswapLiquidityPositionDTO
 */
public class OASSushiswapLiquidityPositionDTO implements OAS.MappedProperties {
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
     * Identifier, format: (pair address)-(user address)
     * @return id
     */
    public String id { get; set; }

    /**
     * User address.
     * @return user
     */
    public String user { get; set; }

    /**
     * Pair address.
     * @return pair
     */
    public String pair { get; set; }

    /**
     * Amount of LP tokens minted for this position.
     * @return liquidityTokenBalance
     */
    public String liquidityTokenBalance { get; set; }

    /**
     * Block number at which position was created.
     * @return block
     */
    public Integer block { get; set; }

    /**
     * Creation time.
     * @return timestamp
     */
    public Integer timestamp { get; set; }

    /**
     * 
     * @return vid
     */
    public Long vid { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'liquidity_token_balance' => 'liquidityTokenBalance'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'liquidity_token_balance' => 'liquidityTokenBalance'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'liquidity_token_balance' => 'liquidityTokenBalance'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'liquidity_token_balance' => 'liquidityTokenBalance'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASSushiswapLiquidityPositionDTO getExample() {
        OASSushiswapLiquidityPositionDTO sushiswapLiquidityPositionDTO = new OASSushiswapLiquidityPositionDTO();
          sushiswapLiquidityPositionDTO.entryTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          sushiswapLiquidityPositionDTO.recvTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          sushiswapLiquidityPositionDTO.blockNumber = 123456789L;
          sushiswapLiquidityPositionDTO.id = '';
          sushiswapLiquidityPositionDTO.user = '';
          sushiswapLiquidityPositionDTO.pair = '';
          sushiswapLiquidityPositionDTO.liquidityTokenBalance = '';
          sushiswapLiquidityPositionDTO.block = 0;
          sushiswapLiquidityPositionDTO.timestamp = 0;
          sushiswapLiquidityPositionDTO.vid = 123456789L;
        return sushiswapLiquidityPositionDTO;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASSushiswapLiquidityPositionDTO) {           
            OASSushiswapLiquidityPositionDTO sushiswapLiquidityPositionDTO = (OASSushiswapLiquidityPositionDTO) obj;
            return this.entryTime == sushiswapLiquidityPositionDTO.entryTime
                && this.recvTime == sushiswapLiquidityPositionDTO.recvTime
                && this.blockNumber == sushiswapLiquidityPositionDTO.blockNumber
                && this.id == sushiswapLiquidityPositionDTO.id
                && this.user == sushiswapLiquidityPositionDTO.user
                && this.pair == sushiswapLiquidityPositionDTO.pair
                && this.liquidityTokenBalance == sushiswapLiquidityPositionDTO.liquidityTokenBalance
                && this.block == sushiswapLiquidityPositionDTO.block
                && this.timestamp == sushiswapLiquidityPositionDTO.timestamp
                && this.vid == sushiswapLiquidityPositionDTO.vid;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (entryTime == null ? 0 : System.hashCode(entryTime));
        hashCode = (17 * hashCode) + (recvTime == null ? 0 : System.hashCode(recvTime));
        hashCode = (17 * hashCode) + (blockNumber == null ? 0 : System.hashCode(blockNumber));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (user == null ? 0 : System.hashCode(user));
        hashCode = (17 * hashCode) + (pair == null ? 0 : System.hashCode(pair));
        hashCode = (17 * hashCode) + (liquidityTokenBalance == null ? 0 : System.hashCode(liquidityTokenBalance));
        hashCode = (17 * hashCode) + (block == null ? 0 : System.hashCode(block));
        hashCode = (17 * hashCode) + (timestamp == null ? 0 : System.hashCode(timestamp));
        hashCode = (17 * hashCode) + (vid == null ? 0 : System.hashCode(vid));
        return hashCode;
    }
}

