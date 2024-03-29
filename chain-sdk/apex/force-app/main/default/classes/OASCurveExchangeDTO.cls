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
 * OASCurveExchangeDTO
 */
public class OASCurveExchangeDTO implements OAS.MappedProperties {
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
     * @return buyer
     */
    public String buyer { get; set; }

    /**
     * 
     * @return receiver
     */
    public String receiver { get; set; }

    /**
     * 
     * @return tokenSold
     */
    public String tokenSold { get; set; }

    /**
     * 
     * @return tokenBought
     */
    public String tokenBought { get; set; }

    /**
     * 
     * @return amountSold
     */
    public String amountSold { get; set; }

    /**
     * 
     * @return amountBought
     */
    public String amountBought { get; set; }

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

    /**
     * Get evaluatedPrice
     * @return evaluatedPrice
     */
    public Double evaluatedPrice { get; private set; }

    /**
     * Get evaluatedAmount
     * @return evaluatedAmount
     */
    public Double evaluatedAmount { get; private set; }

    /**
     * Get evaluatedAggressor
     * @return evaluatedAggressor
     */
    public OASTransactionsETradeAggressiveSide evaluatedAggressor { get; set; }

    /**
     * Get poolId
     * @return poolId
     */
    public String poolId { get; private set; }

    /**
     * Get transactionId
     * @return transactionId
     */
    public String transactionId { get; private set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_sold' => 'tokenSold',
        'token_bought' => 'tokenBought',
        'amount_sold' => 'amountSold',
        'amount_bought' => 'amountBought',
        'transaction' => 'r_transaction',
        'evaluated_price' => 'evaluatedPrice',
        'evaluated_amount' => 'evaluatedAmount',
        'evaluated_aggressor' => 'evaluatedAggressor',
        'pool_id' => 'poolId',
        'transaction_id' => 'transactionId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_sold' => 'tokenSold',
        'token_bought' => 'tokenBought',
        'amount_sold' => 'amountSold',
        'amount_bought' => 'amountBought',
        'transaction' => 'r_transaction',
        'evaluated_price' => 'evaluatedPrice',
        'evaluated_amount' => 'evaluatedAmount',
        'evaluated_aggressor' => 'evaluatedAggressor',
        'pool_id' => 'poolId',
        'transaction_id' => 'transactionId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_sold' => 'tokenSold',
        'token_bought' => 'tokenBought',
        'amount_sold' => 'amountSold',
        'amount_bought' => 'amountBought',
        'transaction' => 'r_transaction',
        'evaluated_price' => 'evaluatedPrice',
        'evaluated_amount' => 'evaluatedAmount',
        'evaluated_aggressor' => 'evaluatedAggressor',
        'pool_id' => 'poolId',
        'transaction_id' => 'transactionId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_sold' => 'tokenSold',
        'token_bought' => 'tokenBought',
        'amount_sold' => 'amountSold',
        'amount_bought' => 'amountBought',
        'transaction' => 'r_transaction',
        'evaluated_price' => 'evaluatedPrice',
        'evaluated_amount' => 'evaluatedAmount',
        'evaluated_aggressor' => 'evaluatedAggressor',
        'pool_id' => 'poolId',
        'transaction_id' => 'transactionId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_sold' => 'tokenSold',
        'token_bought' => 'tokenBought',
        'amount_sold' => 'amountSold',
        'amount_bought' => 'amountBought',
        'transaction' => 'r_transaction',
        'evaluated_price' => 'evaluatedPrice',
        'evaluated_amount' => 'evaluatedAmount',
        'evaluated_aggressor' => 'evaluatedAggressor',
        'pool_id' => 'poolId',
        'transaction_id' => 'transactionId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_sold' => 'tokenSold',
        'token_bought' => 'tokenBought',
        'amount_sold' => 'amountSold',
        'amount_bought' => 'amountBought',
        'transaction' => 'r_transaction',
        'evaluated_price' => 'evaluatedPrice',
        'evaluated_amount' => 'evaluatedAmount',
        'evaluated_aggressor' => 'evaluatedAggressor',
        'pool_id' => 'poolId',
        'transaction_id' => 'transactionId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_sold' => 'tokenSold',
        'token_bought' => 'tokenBought',
        'amount_sold' => 'amountSold',
        'amount_bought' => 'amountBought',
        'transaction' => 'r_transaction',
        'evaluated_price' => 'evaluatedPrice',
        'evaluated_amount' => 'evaluatedAmount',
        'evaluated_aggressor' => 'evaluatedAggressor',
        'pool_id' => 'poolId',
        'transaction_id' => 'transactionId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_sold' => 'tokenSold',
        'token_bought' => 'tokenBought',
        'amount_sold' => 'amountSold',
        'amount_bought' => 'amountBought',
        'transaction' => 'r_transaction',
        'evaluated_price' => 'evaluatedPrice',
        'evaluated_amount' => 'evaluatedAmount',
        'evaluated_aggressor' => 'evaluatedAggressor',
        'pool_id' => 'poolId',
        'transaction_id' => 'transactionId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_sold' => 'tokenSold',
        'token_bought' => 'tokenBought',
        'amount_sold' => 'amountSold',
        'amount_bought' => 'amountBought',
        'transaction' => 'r_transaction',
        'evaluated_price' => 'evaluatedPrice',
        'evaluated_amount' => 'evaluatedAmount',
        'evaluated_aggressor' => 'evaluatedAggressor',
        'pool_id' => 'poolId',
        'transaction_id' => 'transactionId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_sold' => 'tokenSold',
        'token_bought' => 'tokenBought',
        'amount_sold' => 'amountSold',
        'amount_bought' => 'amountBought',
        'transaction' => 'r_transaction',
        'evaluated_price' => 'evaluatedPrice',
        'evaluated_amount' => 'evaluatedAmount',
        'evaluated_aggressor' => 'evaluatedAggressor',
        'pool_id' => 'poolId',
        'transaction_id' => 'transactionId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_sold' => 'tokenSold',
        'token_bought' => 'tokenBought',
        'amount_sold' => 'amountSold',
        'amount_bought' => 'amountBought',
        'transaction' => 'r_transaction',
        'evaluated_price' => 'evaluatedPrice',
        'evaluated_amount' => 'evaluatedAmount',
        'evaluated_aggressor' => 'evaluatedAggressor',
        'pool_id' => 'poolId',
        'transaction_id' => 'transactionId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_sold' => 'tokenSold',
        'token_bought' => 'tokenBought',
        'amount_sold' => 'amountSold',
        'amount_bought' => 'amountBought',
        'transaction' => 'r_transaction',
        'evaluated_price' => 'evaluatedPrice',
        'evaluated_amount' => 'evaluatedAmount',
        'evaluated_aggressor' => 'evaluatedAggressor',
        'pool_id' => 'poolId',
        'transaction_id' => 'transactionId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'token_sold' => 'tokenSold',
        'token_bought' => 'tokenBought',
        'amount_sold' => 'amountSold',
        'amount_bought' => 'amountBought',
        'transaction' => 'r_transaction',
        'evaluated_price' => 'evaluatedPrice',
        'evaluated_amount' => 'evaluatedAmount',
        'evaluated_aggressor' => 'evaluatedAggressor',
        'pool_id' => 'poolId',
        'transaction_id' => 'transactionId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCurveExchangeDTO getExample() {
        OASCurveExchangeDTO curveExchangeDTO = new OASCurveExchangeDTO();
          curveExchangeDTO.entryTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          curveExchangeDTO.recvTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          curveExchangeDTO.blockNumber = 123456789L;
          curveExchangeDTO.id = '';
          curveExchangeDTO.pool = '';
          curveExchangeDTO.buyer = '';
          curveExchangeDTO.receiver = '';
          curveExchangeDTO.tokenSold = '';
          curveExchangeDTO.tokenBought = '';
          curveExchangeDTO.amountSold = '';
          curveExchangeDTO.amountBought = '';
          curveExchangeDTO.block = '';
          curveExchangeDTO.timestamp = '';
          curveExchangeDTO.r_transaction = '';
          curveExchangeDTO.vid = 123456789L;
          curveExchangeDTO.evaluatedPrice = 1.3579;
          curveExchangeDTO.evaluatedAmount = 1.3579;
          curveExchangeDTO.evaluatedAggressor = OASTransactionsETradeAggressiveSide.getExample();
          curveExchangeDTO.poolId = '';
          curveExchangeDTO.transactionId = '';
        return curveExchangeDTO;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCurveExchangeDTO) {           
            OASCurveExchangeDTO curveExchangeDTO = (OASCurveExchangeDTO) obj;
            return this.entryTime == curveExchangeDTO.entryTime
                && this.recvTime == curveExchangeDTO.recvTime
                && this.blockNumber == curveExchangeDTO.blockNumber
                && this.id == curveExchangeDTO.id
                && this.pool == curveExchangeDTO.pool
                && this.buyer == curveExchangeDTO.buyer
                && this.receiver == curveExchangeDTO.receiver
                && this.tokenSold == curveExchangeDTO.tokenSold
                && this.tokenBought == curveExchangeDTO.tokenBought
                && this.amountSold == curveExchangeDTO.amountSold
                && this.amountBought == curveExchangeDTO.amountBought
                && this.block == curveExchangeDTO.block
                && this.timestamp == curveExchangeDTO.timestamp
                && this.r_transaction == curveExchangeDTO.r_transaction
                && this.vid == curveExchangeDTO.vid
                && this.evaluatedPrice == curveExchangeDTO.evaluatedPrice
                && this.evaluatedAmount == curveExchangeDTO.evaluatedAmount
                && this.evaluatedAggressor == curveExchangeDTO.evaluatedAggressor
                && this.poolId == curveExchangeDTO.poolId
                && this.transactionId == curveExchangeDTO.transactionId;
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
        hashCode = (17 * hashCode) + (buyer == null ? 0 : System.hashCode(buyer));
        hashCode = (17 * hashCode) + (receiver == null ? 0 : System.hashCode(receiver));
        hashCode = (17 * hashCode) + (tokenSold == null ? 0 : System.hashCode(tokenSold));
        hashCode = (17 * hashCode) + (tokenBought == null ? 0 : System.hashCode(tokenBought));
        hashCode = (17 * hashCode) + (amountSold == null ? 0 : System.hashCode(amountSold));
        hashCode = (17 * hashCode) + (amountBought == null ? 0 : System.hashCode(amountBought));
        hashCode = (17 * hashCode) + (block == null ? 0 : System.hashCode(block));
        hashCode = (17 * hashCode) + (timestamp == null ? 0 : System.hashCode(timestamp));
        hashCode = (17 * hashCode) + (r_transaction == null ? 0 : System.hashCode(r_transaction));
        hashCode = (17 * hashCode) + (vid == null ? 0 : System.hashCode(vid));
        hashCode = (17 * hashCode) + (evaluatedPrice == null ? 0 : System.hashCode(evaluatedPrice));
        hashCode = (17 * hashCode) + (evaluatedAmount == null ? 0 : System.hashCode(evaluatedAmount));
        hashCode = (17 * hashCode) + (evaluatedAggressor == null ? 0 : System.hashCode(evaluatedAggressor));
        hashCode = (17 * hashCode) + (poolId == null ? 0 : System.hashCode(poolId));
        hashCode = (17 * hashCode) + (transactionId == null ? 0 : System.hashCode(transactionId));
        return hashCode;
    }
}

