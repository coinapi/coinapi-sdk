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
 * OASCurveRemoveLiquidityOneEventDTO
 */
public class OASCurveRemoveLiquidityOneEventDTO implements OAS.MappedProperties {
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
     * 
     * @return id
     */
    public String id { get; set; }

    /**
     * 
     * @return pool
     */
    public String pool { get; set; }

    /**
     * 
     * @return provider
     */
    public String provider { get; set; }

    /**
     * 
     * @return tokenAmount
     */
    public String tokenAmount { get; set; }

    /**
     * 
     * @return coinAmount
     */
    public String coinAmount { get; set; }

    /**
     * 
     * @return block
     */
    public String block { get; set; }

    /**
     * 
     * @return timestamp
     */
    public String timestamp { get; set; }

    /**
     * 
     * @return r_transaction
     */
    public String r_transaction { get; set; }

    /**
     * 
     * @return vid
     */
    public Long vid { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_amount' => 'tokenAmount',
        'coin_amount' => 'coinAmount',
        'transaction' => 'r_transaction'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_amount' => 'tokenAmount',
        'coin_amount' => 'coinAmount',
        'transaction' => 'r_transaction'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_amount' => 'tokenAmount',
        'coin_amount' => 'coinAmount',
        'transaction' => 'r_transaction'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_amount' => 'tokenAmount',
        'coin_amount' => 'coinAmount',
        'transaction' => 'r_transaction'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_amount' => 'tokenAmount',
        'coin_amount' => 'coinAmount',
        'transaction' => 'r_transaction'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_amount' => 'tokenAmount',
        'coin_amount' => 'coinAmount',
        'transaction' => 'r_transaction'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCurveRemoveLiquidityOneEventDTO getExample() {
        OASCurveRemoveLiquidityOneEventDTO curveRemoveLiquidityOneEventDTO = new OASCurveRemoveLiquidityOneEventDTO();
          curveRemoveLiquidityOneEventDTO.entryTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          curveRemoveLiquidityOneEventDTO.recvTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          curveRemoveLiquidityOneEventDTO.blockNumber = 123456789L;
          curveRemoveLiquidityOneEventDTO.id = '';
          curveRemoveLiquidityOneEventDTO.pool = '';
          curveRemoveLiquidityOneEventDTO.provider = '';
          curveRemoveLiquidityOneEventDTO.tokenAmount = '';
          curveRemoveLiquidityOneEventDTO.coinAmount = '';
          curveRemoveLiquidityOneEventDTO.block = '';
          curveRemoveLiquidityOneEventDTO.timestamp = '';
          curveRemoveLiquidityOneEventDTO.r_transaction = '';
          curveRemoveLiquidityOneEventDTO.vid = 123456789L;
        return curveRemoveLiquidityOneEventDTO;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCurveRemoveLiquidityOneEventDTO) {           
            OASCurveRemoveLiquidityOneEventDTO curveRemoveLiquidityOneEventDTO = (OASCurveRemoveLiquidityOneEventDTO) obj;
            return this.entryTime == curveRemoveLiquidityOneEventDTO.entryTime
                && this.recvTime == curveRemoveLiquidityOneEventDTO.recvTime
                && this.blockNumber == curveRemoveLiquidityOneEventDTO.blockNumber
                && this.id == curveRemoveLiquidityOneEventDTO.id
                && this.pool == curveRemoveLiquidityOneEventDTO.pool
                && this.provider == curveRemoveLiquidityOneEventDTO.provider
                && this.tokenAmount == curveRemoveLiquidityOneEventDTO.tokenAmount
                && this.coinAmount == curveRemoveLiquidityOneEventDTO.coinAmount
                && this.block == curveRemoveLiquidityOneEventDTO.block
                && this.timestamp == curveRemoveLiquidityOneEventDTO.timestamp
                && this.r_transaction == curveRemoveLiquidityOneEventDTO.r_transaction
                && this.vid == curveRemoveLiquidityOneEventDTO.vid;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (entryTime == null ? 0 : System.hashCode(entryTime));
        hashCode = (17 * hashCode) + (recvTime == null ? 0 : System.hashCode(recvTime));
        hashCode = (17 * hashCode) + (blockNumber == null ? 0 : System.hashCode(blockNumber));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (pool == null ? 0 : System.hashCode(pool));
        hashCode = (17 * hashCode) + (provider == null ? 0 : System.hashCode(provider));
        hashCode = (17 * hashCode) + (tokenAmount == null ? 0 : System.hashCode(tokenAmount));
        hashCode = (17 * hashCode) + (coinAmount == null ? 0 : System.hashCode(coinAmount));
        hashCode = (17 * hashCode) + (block == null ? 0 : System.hashCode(block));
        hashCode = (17 * hashCode) + (timestamp == null ? 0 : System.hashCode(timestamp));
        hashCode = (17 * hashCode) + (r_transaction == null ? 0 : System.hashCode(r_transaction));
        hashCode = (17 * hashCode) + (vid == null ? 0 : System.hashCode(vid));
        return hashCode;
    }
}

