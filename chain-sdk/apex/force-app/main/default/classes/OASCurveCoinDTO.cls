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
 * OASCurveCoinDTO
 */
public class OASCurveCoinDTO implements OAS.MappedProperties {
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
     * Identifier, format: (pool_id)-(coin_index).
     * @return id
     */
    public String id { get; set; }

    /**
     * Coin index.
     * @return index
     */
    public Integer index { get; set; }

    /**
     * 
     * @return pool
     */
    public String pool { get; set; }

    /**
     * 
     * @return token
     */
    public String token { get; set; }

    /**
     * 
     * @return underlying
     */
    public String underlying { get; set; }

    /**
     * 
     * @return balance
     */
    public String balance { get; set; }

    /**
     * Exchange rate between this coin and the associated underlying coin within the pool.
     * @return rate
     */
    public String rate { get; set; }

    /**
     * 
     * @return updated
     */
    public String updated { get; set; }

    /**
     * 
     * @return updatedAtBlock
     */
    public String updatedAtBlock { get; set; }

    /**
     * 
     * @return updatedAtTransaction
     */
    public String updatedAtTransaction { get; set; }

    /**
     * 
     * @return vid
     */
    public Long vid { get; set; }

    /**
     * 
     * @return blockRange
     */
    public String blockRange { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'updated_at_block' => 'updatedAtBlock',
        'updated_at_transaction' => 'updatedAtTransaction',
        'block_range' => 'blockRange'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'updated_at_block' => 'updatedAtBlock',
        'updated_at_transaction' => 'updatedAtTransaction',
        'block_range' => 'blockRange'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'updated_at_block' => 'updatedAtBlock',
        'updated_at_transaction' => 'updatedAtTransaction',
        'block_range' => 'blockRange'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'updated_at_block' => 'updatedAtBlock',
        'updated_at_transaction' => 'updatedAtTransaction',
        'block_range' => 'blockRange'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'updated_at_block' => 'updatedAtBlock',
        'updated_at_transaction' => 'updatedAtTransaction',
        'block_range' => 'blockRange'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'updated_at_block' => 'updatedAtBlock',
        'updated_at_transaction' => 'updatedAtTransaction',
        'block_range' => 'blockRange'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCurveCoinDTO getExample() {
        OASCurveCoinDTO curveCoinDTO = new OASCurveCoinDTO();
          curveCoinDTO.entryTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          curveCoinDTO.recvTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          curveCoinDTO.blockNumber = 123456789L;
          curveCoinDTO.id = '';
          curveCoinDTO.index = 0;
          curveCoinDTO.pool = '';
          curveCoinDTO.token = '';
          curveCoinDTO.underlying = '';
          curveCoinDTO.balance = '';
          curveCoinDTO.rate = '';
          curveCoinDTO.updated = '';
          curveCoinDTO.updatedAtBlock = '';
          curveCoinDTO.updatedAtTransaction = '';
          curveCoinDTO.vid = 123456789L;
          curveCoinDTO.blockRange = '';
        return curveCoinDTO;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCurveCoinDTO) {           
            OASCurveCoinDTO curveCoinDTO = (OASCurveCoinDTO) obj;
            return this.entryTime == curveCoinDTO.entryTime
                && this.recvTime == curveCoinDTO.recvTime
                && this.blockNumber == curveCoinDTO.blockNumber
                && this.id == curveCoinDTO.id
                && this.index == curveCoinDTO.index
                && this.pool == curveCoinDTO.pool
                && this.token == curveCoinDTO.token
                && this.underlying == curveCoinDTO.underlying
                && this.balance == curveCoinDTO.balance
                && this.rate == curveCoinDTO.rate
                && this.updated == curveCoinDTO.updated
                && this.updatedAtBlock == curveCoinDTO.updatedAtBlock
                && this.updatedAtTransaction == curveCoinDTO.updatedAtTransaction
                && this.vid == curveCoinDTO.vid
                && this.blockRange == curveCoinDTO.blockRange;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (entryTime == null ? 0 : System.hashCode(entryTime));
        hashCode = (17 * hashCode) + (recvTime == null ? 0 : System.hashCode(recvTime));
        hashCode = (17 * hashCode) + (blockNumber == null ? 0 : System.hashCode(blockNumber));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (index == null ? 0 : System.hashCode(index));
        hashCode = (17 * hashCode) + (pool == null ? 0 : System.hashCode(pool));
        hashCode = (17 * hashCode) + (token == null ? 0 : System.hashCode(token));
        hashCode = (17 * hashCode) + (underlying == null ? 0 : System.hashCode(underlying));
        hashCode = (17 * hashCode) + (balance == null ? 0 : System.hashCode(balance));
        hashCode = (17 * hashCode) + (rate == null ? 0 : System.hashCode(rate));
        hashCode = (17 * hashCode) + (updated == null ? 0 : System.hashCode(updated));
        hashCode = (17 * hashCode) + (updatedAtBlock == null ? 0 : System.hashCode(updatedAtBlock));
        hashCode = (17 * hashCode) + (updatedAtTransaction == null ? 0 : System.hashCode(updatedAtTransaction));
        hashCode = (17 * hashCode) + (vid == null ? 0 : System.hashCode(vid));
        hashCode = (17 * hashCode) + (blockRange == null ? 0 : System.hashCode(blockRange));
        return hashCode;
    }
}

