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
 * Swap are created for each token swap within a pair.
 */
public class OASUniswapV2SwapV2DTO implements OAS.MappedProperties {
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
     * Transaction hash plus index in Transaction swap array.
     * @return id
     */
    public String id { get; set; }

    /**
     * Reference to transaction swap was included in.
     * @return r_transaction
     */
    public String r_transaction { get; set; }

    /**
     * Timestamp of swap, used for sorted lookups.
     * @return timestamp
     */
    public Datetime timestamp { get; set; }

    /**
     * Reference to pair.
     * @return pair
     */
    public String pair { get; set; }

    /**
     * Address that initiated the swap.
     * @return sender
     */
    public String sender { get; set; }

    /**
     * The EOA (Externally Owned Account) that initiated the transaction.
     * @return r_from
     */
    public String r_from { get; set; }

    /**
     * Amount of token0 sold.
     * @return amount0In
     */
    public String amount0In { get; set; }

    /**
     * Amount of token1 sold.
     * @return amount1In
     */
    public String amount1In { get; set; }

    /**
     * Amount of token0 received.
     * @return amount0Out
     */
    public String amount0Out { get; set; }

    /**
     * Amount of token1 received.
     * @return amount1Out
     */
    public String amount1Out { get; set; }

    /**
     * Recipient of output tokens.
     * @return to
     */
    public String to { get; set; }

    /**
     * Get logIndex
     * @return logIndex
     */
    public OASNumericsBigInteger logIndex { get; set; }

    /**
     * Derived amount of tokens sold in USD.
     * @return amountUsd
     */
    public String amountUsd { get; set; }

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
        'transaction' => 'r_transaction',
        'from' => 'r_from',
        'amount_0_in' => 'amount0In',
        'amount_1_in' => 'amount1In',
        'amount_0_out' => 'amount0Out',
        'amount_1_out' => 'amount1Out',
        'log_index' => 'logIndex',
        'amount_usd' => 'amountUsd',
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
        'transaction' => 'r_transaction',
        'from' => 'r_from',
        'amount_0_in' => 'amount0In',
        'amount_1_in' => 'amount1In',
        'amount_0_out' => 'amount0Out',
        'amount_1_out' => 'amount1Out',
        'log_index' => 'logIndex',
        'amount_usd' => 'amountUsd',
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
        'transaction' => 'r_transaction',
        'from' => 'r_from',
        'amount_0_in' => 'amount0In',
        'amount_1_in' => 'amount1In',
        'amount_0_out' => 'amount0Out',
        'amount_1_out' => 'amount1Out',
        'log_index' => 'logIndex',
        'amount_usd' => 'amountUsd',
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
        'transaction' => 'r_transaction',
        'from' => 'r_from',
        'amount_0_in' => 'amount0In',
        'amount_1_in' => 'amount1In',
        'amount_0_out' => 'amount0Out',
        'amount_1_out' => 'amount1Out',
        'log_index' => 'logIndex',
        'amount_usd' => 'amountUsd',
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
        'transaction' => 'r_transaction',
        'from' => 'r_from',
        'amount_0_in' => 'amount0In',
        'amount_1_in' => 'amount1In',
        'amount_0_out' => 'amount0Out',
        'amount_1_out' => 'amount1Out',
        'log_index' => 'logIndex',
        'amount_usd' => 'amountUsd',
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
        'transaction' => 'r_transaction',
        'from' => 'r_from',
        'amount_0_in' => 'amount0In',
        'amount_1_in' => 'amount1In',
        'amount_0_out' => 'amount0Out',
        'amount_1_out' => 'amount1Out',
        'log_index' => 'logIndex',
        'amount_usd' => 'amountUsd',
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
        'transaction' => 'r_transaction',
        'from' => 'r_from',
        'amount_0_in' => 'amount0In',
        'amount_1_in' => 'amount1In',
        'amount_0_out' => 'amount0Out',
        'amount_1_out' => 'amount1Out',
        'log_index' => 'logIndex',
        'amount_usd' => 'amountUsd',
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
        'transaction' => 'r_transaction',
        'from' => 'r_from',
        'amount_0_in' => 'amount0In',
        'amount_1_in' => 'amount1In',
        'amount_0_out' => 'amount0Out',
        'amount_1_out' => 'amount1Out',
        'log_index' => 'logIndex',
        'amount_usd' => 'amountUsd',
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
        'transaction' => 'r_transaction',
        'from' => 'r_from',
        'amount_0_in' => 'amount0In',
        'amount_1_in' => 'amount1In',
        'amount_0_out' => 'amount0Out',
        'amount_1_out' => 'amount1Out',
        'log_index' => 'logIndex',
        'amount_usd' => 'amountUsd',
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
        'transaction' => 'r_transaction',
        'from' => 'r_from',
        'amount_0_in' => 'amount0In',
        'amount_1_in' => 'amount1In',
        'amount_0_out' => 'amount0Out',
        'amount_1_out' => 'amount1Out',
        'log_index' => 'logIndex',
        'amount_usd' => 'amountUsd',
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
        'transaction' => 'r_transaction',
        'from' => 'r_from',
        'amount_0_in' => 'amount0In',
        'amount_1_in' => 'amount1In',
        'amount_0_out' => 'amount0Out',
        'amount_1_out' => 'amount1Out',
        'log_index' => 'logIndex',
        'amount_usd' => 'amountUsd',
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
        'transaction' => 'r_transaction',
        'from' => 'r_from',
        'amount_0_in' => 'amount0In',
        'amount_1_in' => 'amount1In',
        'amount_0_out' => 'amount0Out',
        'amount_1_out' => 'amount1Out',
        'log_index' => 'logIndex',
        'amount_usd' => 'amountUsd',
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
        'transaction' => 'r_transaction',
        'from' => 'r_from',
        'amount_0_in' => 'amount0In',
        'amount_1_in' => 'amount1In',
        'amount_0_out' => 'amount0Out',
        'amount_1_out' => 'amount1Out',
        'log_index' => 'logIndex',
        'amount_usd' => 'amountUsd',
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
        'transaction' => 'r_transaction',
        'from' => 'r_from',
        'amount_0_in' => 'amount0In',
        'amount_1_in' => 'amount1In',
        'amount_0_out' => 'amount0Out',
        'amount_1_out' => 'amount1Out',
        'log_index' => 'logIndex',
        'amount_usd' => 'amountUsd',
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
        'transaction' => 'r_transaction',
        'from' => 'r_from',
        'amount_0_in' => 'amount0In',
        'amount_1_in' => 'amount1In',
        'amount_0_out' => 'amount0Out',
        'amount_1_out' => 'amount1Out',
        'log_index' => 'logIndex',
        'amount_usd' => 'amountUsd',
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
        'transaction' => 'r_transaction',
        'from' => 'r_from',
        'amount_0_in' => 'amount0In',
        'amount_1_in' => 'amount1In',
        'amount_0_out' => 'amount0Out',
        'amount_1_out' => 'amount1Out',
        'log_index' => 'logIndex',
        'amount_usd' => 'amountUsd',
        'evaluated_price' => 'evaluatedPrice',
        'evaluated_amount' => 'evaluatedAmount',
        'evaluated_aggressor' => 'evaluatedAggressor',
        'pool_id' => 'poolId',
        'transaction_id' => 'transactionId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASUniswapV2SwapV2DTO getExample() {
        OASUniswapV2SwapV2DTO uniswapV2SwapV2DTO = new OASUniswapV2SwapV2DTO();
          uniswapV2SwapV2DTO.entryTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          uniswapV2SwapV2DTO.recvTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          uniswapV2SwapV2DTO.blockNumber = 123456789L;
          uniswapV2SwapV2DTO.vid = 123456789L;
          uniswapV2SwapV2DTO.id = '';
          uniswapV2SwapV2DTO.r_transaction = '';
          uniswapV2SwapV2DTO.timestamp = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          uniswapV2SwapV2DTO.pair = '';
          uniswapV2SwapV2DTO.sender = '';
          uniswapV2SwapV2DTO.r_from = '';
          uniswapV2SwapV2DTO.amount0In = '';
          uniswapV2SwapV2DTO.amount1In = '';
          uniswapV2SwapV2DTO.amount0Out = '';
          uniswapV2SwapV2DTO.amount1Out = '';
          uniswapV2SwapV2DTO.to = '';
          uniswapV2SwapV2DTO.logIndex = OASNumericsBigInteger.getExample();
          uniswapV2SwapV2DTO.amountUsd = '';
          uniswapV2SwapV2DTO.evaluatedPrice = 1.3579;
          uniswapV2SwapV2DTO.evaluatedAmount = 1.3579;
          uniswapV2SwapV2DTO.evaluatedAggressor = OASTransactionsETradeAggressiveSide.getExample();
          uniswapV2SwapV2DTO.poolId = '';
          uniswapV2SwapV2DTO.transactionId = '';
        return uniswapV2SwapV2DTO;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASUniswapV2SwapV2DTO) {           
            OASUniswapV2SwapV2DTO uniswapV2SwapV2DTO = (OASUniswapV2SwapV2DTO) obj;
            return this.entryTime == uniswapV2SwapV2DTO.entryTime
                && this.recvTime == uniswapV2SwapV2DTO.recvTime
                && this.blockNumber == uniswapV2SwapV2DTO.blockNumber
                && this.vid == uniswapV2SwapV2DTO.vid
                && this.id == uniswapV2SwapV2DTO.id
                && this.r_transaction == uniswapV2SwapV2DTO.r_transaction
                && this.timestamp == uniswapV2SwapV2DTO.timestamp
                && this.pair == uniswapV2SwapV2DTO.pair
                && this.sender == uniswapV2SwapV2DTO.sender
                && this.r_from == uniswapV2SwapV2DTO.r_from
                && this.amount0In == uniswapV2SwapV2DTO.amount0In
                && this.amount1In == uniswapV2SwapV2DTO.amount1In
                && this.amount0Out == uniswapV2SwapV2DTO.amount0Out
                && this.amount1Out == uniswapV2SwapV2DTO.amount1Out
                && this.to == uniswapV2SwapV2DTO.to
                && this.logIndex == uniswapV2SwapV2DTO.logIndex
                && this.amountUsd == uniswapV2SwapV2DTO.amountUsd
                && this.evaluatedPrice == uniswapV2SwapV2DTO.evaluatedPrice
                && this.evaluatedAmount == uniswapV2SwapV2DTO.evaluatedAmount
                && this.evaluatedAggressor == uniswapV2SwapV2DTO.evaluatedAggressor
                && this.poolId == uniswapV2SwapV2DTO.poolId
                && this.transactionId == uniswapV2SwapV2DTO.transactionId;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (entryTime == null ? 0 : System.hashCode(entryTime));
        hashCode = (17 * hashCode) + (recvTime == null ? 0 : System.hashCode(recvTime));
        hashCode = (17 * hashCode) + (blockNumber == null ? 0 : System.hashCode(blockNumber));
        hashCode = (17 * hashCode) + (vid == null ? 0 : System.hashCode(vid));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (r_transaction == null ? 0 : System.hashCode(r_transaction));
        hashCode = (17 * hashCode) + (timestamp == null ? 0 : System.hashCode(timestamp));
        hashCode = (17 * hashCode) + (pair == null ? 0 : System.hashCode(pair));
        hashCode = (17 * hashCode) + (sender == null ? 0 : System.hashCode(sender));
        hashCode = (17 * hashCode) + (r_from == null ? 0 : System.hashCode(r_from));
        hashCode = (17 * hashCode) + (amount0In == null ? 0 : System.hashCode(amount0In));
        hashCode = (17 * hashCode) + (amount1In == null ? 0 : System.hashCode(amount1In));
        hashCode = (17 * hashCode) + (amount0Out == null ? 0 : System.hashCode(amount0Out));
        hashCode = (17 * hashCode) + (amount1Out == null ? 0 : System.hashCode(amount1Out));
        hashCode = (17 * hashCode) + (to == null ? 0 : System.hashCode(to));
        hashCode = (17 * hashCode) + (logIndex == null ? 0 : System.hashCode(logIndex));
        hashCode = (17 * hashCode) + (amountUsd == null ? 0 : System.hashCode(amountUsd));
        hashCode = (17 * hashCode) + (evaluatedPrice == null ? 0 : System.hashCode(evaluatedPrice));
        hashCode = (17 * hashCode) + (evaluatedAmount == null ? 0 : System.hashCode(evaluatedAmount));
        hashCode = (17 * hashCode) + (evaluatedAggressor == null ? 0 : System.hashCode(evaluatedAggressor));
        hashCode = (17 * hashCode) + (poolId == null ? 0 : System.hashCode(poolId));
        hashCode = (17 * hashCode) + (transactionId == null ? 0 : System.hashCode(transactionId));
        return hashCode;
    }
}
