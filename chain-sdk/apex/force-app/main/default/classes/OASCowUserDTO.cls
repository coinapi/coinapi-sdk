/*
 * OnChain API
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
 * OASCowUserDTO
 */
public class OASCowUserDTO implements OAS.MappedProperties {
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
     * User\'s address.
     * @return id
     */
    public String id { get; set; }

    /**
     * User\'s address.
     * @return address
     */
    public String address { get; set; }

    /**
     * First trade block timestamp.
     * @return firstTradeTimestamp
     */
    public String firstTradeTimestamp { get; set; }

    /**
     * Determines if user has solved a settlement.
     * @return isSolver
     */
    public Boolean isSolver { get; set; }

    /**
     * 
     * @return vid
     */
    public Long vid { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'first_trade_timestamp' => 'firstTradeTimestamp',
        'is_solver' => 'isSolver'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'first_trade_timestamp' => 'firstTradeTimestamp',
        'is_solver' => 'isSolver'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'first_trade_timestamp' => 'firstTradeTimestamp',
        'is_solver' => 'isSolver'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'first_trade_timestamp' => 'firstTradeTimestamp',
        'is_solver' => 'isSolver'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'first_trade_timestamp' => 'firstTradeTimestamp',
        'is_solver' => 'isSolver'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCowUserDTO getExample() {
        OASCowUserDTO cowUserDTO = new OASCowUserDTO();
          cowUserDTO.entryTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          cowUserDTO.recvTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          cowUserDTO.blockNumber = 123456789L;
          cowUserDTO.id = '';
          cowUserDTO.address = '';
          cowUserDTO.firstTradeTimestamp = '';
          cowUserDTO.isSolver = true;
          cowUserDTO.vid = 123456789L;
        return cowUserDTO;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCowUserDTO) {           
            OASCowUserDTO cowUserDTO = (OASCowUserDTO) obj;
            return this.entryTime == cowUserDTO.entryTime
                && this.recvTime == cowUserDTO.recvTime
                && this.blockNumber == cowUserDTO.blockNumber
                && this.id == cowUserDTO.id
                && this.address == cowUserDTO.address
                && this.firstTradeTimestamp == cowUserDTO.firstTradeTimestamp
                && this.isSolver == cowUserDTO.isSolver
                && this.vid == cowUserDTO.vid;
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
        hashCode = (17 * hashCode) + (firstTradeTimestamp == null ? 0 : System.hashCode(firstTradeTimestamp));
        hashCode = (17 * hashCode) + (isSolver == null ? 0 : System.hashCode(isSolver));
        hashCode = (17 * hashCode) + (vid == null ? 0 : System.hashCode(vid));
        return hashCode;
    }
}
