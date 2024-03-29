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
 * Data accumulated and condensed into day stats for all of Uniswap.
 */
public class OASUniswapV3UniswapDayDataDTO implements OAS.MappedProperties {
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
     * Timestamp rounded to current day by dividing by 86400.
     * @return id
     */
    public String id { get; set; }

    /**
     * Timestamp rounded to current day by dividing by 86400.
     * @return r_date
     */
    public Integer r_date { get; set; }

    /**
     * Total volume across all pairs on this day, stored as a derived amount of ETH.
     * @return volumeEth
     */
    public String volumeEth { get; set; }

    /**
     * Total volume across all pairs on this day, stored as a derived amount of USD.
     * @return volumeUsd
     */
    public String volumeUsd { get; set; }

    /**
     * Total daily volume in Uniswap derived in terms of USD untracked.
     * @return volumeUsdUntracked
     */
    public String volumeUsdUntracked { get; set; }

    /**
     * Fees in USD
     * @return feesUsd
     */
    public String feesUsd { get; set; }

    /**
     * Get txCount
     * @return txCount
     */
    public OASNumericsBigInteger txCount { get; set; }

    /**
     * Tvl in terms of USD.
     * @return tvlUsd
     */
    public String tvlUsd { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'volume_eth' => 'volumeEth',
        'volume_usd' => 'volumeUsd',
        'volume_usd_untracked' => 'volumeUsdUntracked',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount',
        'tvl_usd' => 'tvlUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'volume_eth' => 'volumeEth',
        'volume_usd' => 'volumeUsd',
        'volume_usd_untracked' => 'volumeUsdUntracked',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount',
        'tvl_usd' => 'tvlUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'volume_eth' => 'volumeEth',
        'volume_usd' => 'volumeUsd',
        'volume_usd_untracked' => 'volumeUsdUntracked',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount',
        'tvl_usd' => 'tvlUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'volume_eth' => 'volumeEth',
        'volume_usd' => 'volumeUsd',
        'volume_usd_untracked' => 'volumeUsdUntracked',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount',
        'tvl_usd' => 'tvlUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'volume_eth' => 'volumeEth',
        'volume_usd' => 'volumeUsd',
        'volume_usd_untracked' => 'volumeUsdUntracked',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount',
        'tvl_usd' => 'tvlUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'volume_eth' => 'volumeEth',
        'volume_usd' => 'volumeUsd',
        'volume_usd_untracked' => 'volumeUsdUntracked',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount',
        'tvl_usd' => 'tvlUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'volume_eth' => 'volumeEth',
        'volume_usd' => 'volumeUsd',
        'volume_usd_untracked' => 'volumeUsdUntracked',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount',
        'tvl_usd' => 'tvlUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'volume_eth' => 'volumeEth',
        'volume_usd' => 'volumeUsd',
        'volume_usd_untracked' => 'volumeUsdUntracked',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount',
        'tvl_usd' => 'tvlUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'volume_eth' => 'volumeEth',
        'volume_usd' => 'volumeUsd',
        'volume_usd_untracked' => 'volumeUsdUntracked',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount',
        'tvl_usd' => 'tvlUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'volume_eth' => 'volumeEth',
        'volume_usd' => 'volumeUsd',
        'volume_usd_untracked' => 'volumeUsdUntracked',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount',
        'tvl_usd' => 'tvlUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASUniswapV3UniswapDayDataDTO getExample() {
        OASUniswapV3UniswapDayDataDTO uniswapV3UniswapDayDataDTO = new OASUniswapV3UniswapDayDataDTO();
          uniswapV3UniswapDayDataDTO.entryTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          uniswapV3UniswapDayDataDTO.recvTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          uniswapV3UniswapDayDataDTO.blockNumber = 123456789L;
          uniswapV3UniswapDayDataDTO.vid = 123456789L;
          uniswapV3UniswapDayDataDTO.id = '';
          uniswapV3UniswapDayDataDTO.r_date = 0;
          uniswapV3UniswapDayDataDTO.volumeEth = '';
          uniswapV3UniswapDayDataDTO.volumeUsd = '';
          uniswapV3UniswapDayDataDTO.volumeUsdUntracked = '';
          uniswapV3UniswapDayDataDTO.feesUsd = '';
          uniswapV3UniswapDayDataDTO.txCount = OASNumericsBigInteger.getExample();
          uniswapV3UniswapDayDataDTO.tvlUsd = '';
        return uniswapV3UniswapDayDataDTO;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASUniswapV3UniswapDayDataDTO) {           
            OASUniswapV3UniswapDayDataDTO uniswapV3UniswapDayDataDTO = (OASUniswapV3UniswapDayDataDTO) obj;
            return this.entryTime == uniswapV3UniswapDayDataDTO.entryTime
                && this.recvTime == uniswapV3UniswapDayDataDTO.recvTime
                && this.blockNumber == uniswapV3UniswapDayDataDTO.blockNumber
                && this.vid == uniswapV3UniswapDayDataDTO.vid
                && this.id == uniswapV3UniswapDayDataDTO.id
                && this.r_date == uniswapV3UniswapDayDataDTO.r_date
                && this.volumeEth == uniswapV3UniswapDayDataDTO.volumeEth
                && this.volumeUsd == uniswapV3UniswapDayDataDTO.volumeUsd
                && this.volumeUsdUntracked == uniswapV3UniswapDayDataDTO.volumeUsdUntracked
                && this.feesUsd == uniswapV3UniswapDayDataDTO.feesUsd
                && this.txCount == uniswapV3UniswapDayDataDTO.txCount
                && this.tvlUsd == uniswapV3UniswapDayDataDTO.tvlUsd;
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
        hashCode = (17 * hashCode) + (r_date == null ? 0 : System.hashCode(r_date));
        hashCode = (17 * hashCode) + (volumeEth == null ? 0 : System.hashCode(volumeEth));
        hashCode = (17 * hashCode) + (volumeUsd == null ? 0 : System.hashCode(volumeUsd));
        hashCode = (17 * hashCode) + (volumeUsdUntracked == null ? 0 : System.hashCode(volumeUsdUntracked));
        hashCode = (17 * hashCode) + (feesUsd == null ? 0 : System.hashCode(feesUsd));
        hashCode = (17 * hashCode) + (txCount == null ? 0 : System.hashCode(txCount));
        hashCode = (17 * hashCode) + (tvlUsd == null ? 0 : System.hashCode(tvlUsd));
        return hashCode;
    }
}

