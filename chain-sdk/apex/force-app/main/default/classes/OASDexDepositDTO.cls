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
 * Deposit of an user.
 */
public class OASDexDepositDTO implements OAS.MappedProperties {
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
     * Identifier, format: (transaction hash)-(token id).
     * @return id
     */
    public String id { get; set; }

    /**
     * User address.
     * @return user
     */
    public String user { get; set; }

    /**
     * Token address.
     * @return tokenAddress
     */
    public String tokenAddress { get; set; }

    /**
     * Amount of deposit.
     * @return amount
     */
    public String amount { get; set; }

    /**
     * Identifier (numerical).
     * @return batchId
     */
    public String batchId { get; set; }

    /**
     * Create epoch.
     * @return createEpoch
     */
    public String createEpoch { get; set; }

    /**
     * Transaction hash.
     * @return txHash
     */
    public String txHash { get; set; }

    /**
     * 
     * @return vid
     */
    public Long vid { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_address' => 'tokenAddress',
        'batch_id' => 'batchId',
        'create_epoch' => 'createEpoch',
        'tx_hash' => 'txHash'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_address' => 'tokenAddress',
        'batch_id' => 'batchId',
        'create_epoch' => 'createEpoch',
        'tx_hash' => 'txHash'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_address' => 'tokenAddress',
        'batch_id' => 'batchId',
        'create_epoch' => 'createEpoch',
        'tx_hash' => 'txHash'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_address' => 'tokenAddress',
        'batch_id' => 'batchId',
        'create_epoch' => 'createEpoch',
        'tx_hash' => 'txHash'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_address' => 'tokenAddress',
        'batch_id' => 'batchId',
        'create_epoch' => 'createEpoch',
        'tx_hash' => 'txHash'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_address' => 'tokenAddress',
        'batch_id' => 'batchId',
        'create_epoch' => 'createEpoch',
        'tx_hash' => 'txHash'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_address' => 'tokenAddress',
        'batch_id' => 'batchId',
        'create_epoch' => 'createEpoch',
        'tx_hash' => 'txHash'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASDexDepositDTO getExample() {
        OASDexDepositDTO dexDepositDTO = new OASDexDepositDTO();
          dexDepositDTO.entryTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          dexDepositDTO.recvTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          dexDepositDTO.blockNumber = 123456789L;
          dexDepositDTO.id = '';
          dexDepositDTO.user = '';
          dexDepositDTO.tokenAddress = '';
          dexDepositDTO.amount = '';
          dexDepositDTO.batchId = '';
          dexDepositDTO.createEpoch = '';
          dexDepositDTO.txHash = '';
          dexDepositDTO.vid = 123456789L;
        return dexDepositDTO;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASDexDepositDTO) {           
            OASDexDepositDTO dexDepositDTO = (OASDexDepositDTO) obj;
            return this.entryTime == dexDepositDTO.entryTime
                && this.recvTime == dexDepositDTO.recvTime
                && this.blockNumber == dexDepositDTO.blockNumber
                && this.id == dexDepositDTO.id
                && this.user == dexDepositDTO.user
                && this.tokenAddress == dexDepositDTO.tokenAddress
                && this.amount == dexDepositDTO.amount
                && this.batchId == dexDepositDTO.batchId
                && this.createEpoch == dexDepositDTO.createEpoch
                && this.txHash == dexDepositDTO.txHash
                && this.vid == dexDepositDTO.vid;
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
        hashCode = (17 * hashCode) + (tokenAddress == null ? 0 : System.hashCode(tokenAddress));
        hashCode = (17 * hashCode) + (amount == null ? 0 : System.hashCode(amount));
        hashCode = (17 * hashCode) + (batchId == null ? 0 : System.hashCode(batchId));
        hashCode = (17 * hashCode) + (createEpoch == null ? 0 : System.hashCode(createEpoch));
        hashCode = (17 * hashCode) + (txHash == null ? 0 : System.hashCode(txHash));
        hashCode = (17 * hashCode) + (vid == null ? 0 : System.hashCode(vid));
        return hashCode;
    }
}

