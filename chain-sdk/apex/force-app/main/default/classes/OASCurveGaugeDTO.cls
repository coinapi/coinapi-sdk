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
 * OASCurveGaugeDTO
 */
public class OASCurveGaugeDTO implements OAS.MappedProperties {
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
     * @return address
     */
    public String address { get; set; }

    /**
     * 
     * @return type
     */
    public String type { get; set; }

    /**
     * 
     * @return pool
     */
    public String pool { get; set; }

    /**
     * 
     * @return created
     */
    public String created { get; set; }

    /**
     * 
     * @return createdAtBlock
     */
    public String createdAtBlock { get; set; }

    /**
     * 
     * @return createdAtTransaction
     */
    public String createdAtTransaction { get; set; }

    /**
     * 
     * @return vid
     */
    public Long vid { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'created_at_block' => 'createdAtBlock',
        'created_at_transaction' => 'createdAtTransaction'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'created_at_block' => 'createdAtBlock',
        'created_at_transaction' => 'createdAtTransaction'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'created_at_block' => 'createdAtBlock',
        'created_at_transaction' => 'createdAtTransaction'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'created_at_block' => 'createdAtBlock',
        'created_at_transaction' => 'createdAtTransaction'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'created_at_block' => 'createdAtBlock',
        'created_at_transaction' => 'createdAtTransaction'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCurveGaugeDTO getExample() {
        OASCurveGaugeDTO curveGaugeDTO = new OASCurveGaugeDTO();
          curveGaugeDTO.entryTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          curveGaugeDTO.recvTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          curveGaugeDTO.blockNumber = 123456789L;
          curveGaugeDTO.id = '';
          curveGaugeDTO.address = '';
          curveGaugeDTO.type = '';
          curveGaugeDTO.pool = '';
          curveGaugeDTO.created = '';
          curveGaugeDTO.createdAtBlock = '';
          curveGaugeDTO.createdAtTransaction = '';
          curveGaugeDTO.vid = 123456789L;
        return curveGaugeDTO;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCurveGaugeDTO) {           
            OASCurveGaugeDTO curveGaugeDTO = (OASCurveGaugeDTO) obj;
            return this.entryTime == curveGaugeDTO.entryTime
                && this.recvTime == curveGaugeDTO.recvTime
                && this.blockNumber == curveGaugeDTO.blockNumber
                && this.id == curveGaugeDTO.id
                && this.address == curveGaugeDTO.address
                && this.type == curveGaugeDTO.type
                && this.pool == curveGaugeDTO.pool
                && this.created == curveGaugeDTO.created
                && this.createdAtBlock == curveGaugeDTO.createdAtBlock
                && this.createdAtTransaction == curveGaugeDTO.createdAtTransaction
                && this.vid == curveGaugeDTO.vid;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (entryTime == null ? 0 : System.hashCode(entryTime));
        hashCode = (17 * hashCode) + (recvTime == null ? 0 : System.hashCode(recvTime));
        hashCode = (17 * hashCode) + (blockNumber == null ? 0 : System.hashCode(blockNumber));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (address == null ? 0 : System.hashCode(address));
        hashCode = (17 * hashCode) + (type == null ? 0 : System.hashCode(type));
        hashCode = (17 * hashCode) + (pool == null ? 0 : System.hashCode(pool));
        hashCode = (17 * hashCode) + (created == null ? 0 : System.hashCode(created));
        hashCode = (17 * hashCode) + (createdAtBlock == null ? 0 : System.hashCode(createdAtBlock));
        hashCode = (17 * hashCode) + (createdAtTransaction == null ? 0 : System.hashCode(createdAtTransaction));
        hashCode = (17 * hashCode) + (vid == null ? 0 : System.hashCode(vid));
        return hashCode;
    }
}
