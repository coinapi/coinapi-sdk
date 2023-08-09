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
 * OASCRYPTOPUNKSUserDTO
 */
public class OASCRYPTOPUNKSUserDTO implements OAS.MappedProperties {
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
     * @return vid
     */
    public Long vid { get; set; }

    /**
     * 
     * @return blockRange
     */
    public String blockRange { get; set; }

    /**
     * 
     * @return id
     */
    public String id { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'block_range' => 'blockRange'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'block_range' => 'blockRange'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'block_range' => 'blockRange'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'block_range' => 'blockRange'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCRYPTOPUNKSUserDTO getExample() {
        OASCRYPTOPUNKSUserDTO crYPTOPUNKSUserDTO = new OASCRYPTOPUNKSUserDTO();
          crYPTOPUNKSUserDTO.entryTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          crYPTOPUNKSUserDTO.recvTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          crYPTOPUNKSUserDTO.blockNumber = 123456789L;
          crYPTOPUNKSUserDTO.vid = 123456789L;
          crYPTOPUNKSUserDTO.blockRange = '';
          crYPTOPUNKSUserDTO.id = '';
        return crYPTOPUNKSUserDTO;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCRYPTOPUNKSUserDTO) {           
            OASCRYPTOPUNKSUserDTO crYPTOPUNKSUserDTO = (OASCRYPTOPUNKSUserDTO) obj;
            return this.entryTime == crYPTOPUNKSUserDTO.entryTime
                && this.recvTime == crYPTOPUNKSUserDTO.recvTime
                && this.blockNumber == crYPTOPUNKSUserDTO.blockNumber
                && this.vid == crYPTOPUNKSUserDTO.vid
                && this.blockRange == crYPTOPUNKSUserDTO.blockRange
                && this.id == crYPTOPUNKSUserDTO.id;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (entryTime == null ? 0 : System.hashCode(entryTime));
        hashCode = (17 * hashCode) + (recvTime == null ? 0 : System.hashCode(recvTime));
        hashCode = (17 * hashCode) + (blockNumber == null ? 0 : System.hashCode(blockNumber));
        hashCode = (17 * hashCode) + (vid == null ? 0 : System.hashCode(vid));
        hashCode = (17 * hashCode) + (blockRange == null ? 0 : System.hashCode(blockRange));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        return hashCode;
    }
}
