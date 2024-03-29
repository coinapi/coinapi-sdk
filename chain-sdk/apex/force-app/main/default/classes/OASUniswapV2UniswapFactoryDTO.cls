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
 * The Uniswap Factory entity is responsible for storing aggregate information across all Uniswap pairs. It can be used to view stats about total liquidity, volume, amount of pairs and more.
 */
public class OASUniswapV2UniswapFactoryDTO implements OAS.MappedProperties {
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
     * Factory address.
     * @return id
     */
    public String id { get; set; }

    /**
     * Amount of pairs created by the Uniswap factory.
     * @return pairCount
     */
    public Integer pairCount { get; set; }

    /**
     * All time USD volume across all pairs (USD is derived).
     * @return totalVolumeUsd
     */
    public String totalVolumeUsd { get; set; }

    /**
     * All time volume in ETH across all pairs (ETH is derived).
     * @return totalVolumeEth
     */
    public String totalVolumeEth { get; set; }

    /**
     * Untracked volume USD.
     * @return untrackedVolumeUsd
     */
    public String untrackedVolumeUsd { get; set; }

    /**
     * Total liquidity across all pairs stored as a derived USD amount.
     * @return totalLiquidityUsd
     */
    public String totalLiquidityUsd { get; set; }

    /**
     * Total liquidity across all pairs stored as a derived ETH amount.
     * @return totalLiquidityEth
     */
    public String totalLiquidityEth { get; set; }

    /**
     * All time amount of transactions across all pairs.
     * @return txCount
     */
    public String txCount { get; set; }

    /**
     * .
     * @return vid
     */
    public Long vid { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'pair_count' => 'pairCount',
        'total_volume_usd' => 'totalVolumeUsd',
        'total_volume_eth' => 'totalVolumeEth',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_liquidity_usd' => 'totalLiquidityUsd',
        'total_liquidity_eth' => 'totalLiquidityEth',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'pair_count' => 'pairCount',
        'total_volume_usd' => 'totalVolumeUsd',
        'total_volume_eth' => 'totalVolumeEth',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_liquidity_usd' => 'totalLiquidityUsd',
        'total_liquidity_eth' => 'totalLiquidityEth',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'pair_count' => 'pairCount',
        'total_volume_usd' => 'totalVolumeUsd',
        'total_volume_eth' => 'totalVolumeEth',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_liquidity_usd' => 'totalLiquidityUsd',
        'total_liquidity_eth' => 'totalLiquidityEth',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'pair_count' => 'pairCount',
        'total_volume_usd' => 'totalVolumeUsd',
        'total_volume_eth' => 'totalVolumeEth',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_liquidity_usd' => 'totalLiquidityUsd',
        'total_liquidity_eth' => 'totalLiquidityEth',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'pair_count' => 'pairCount',
        'total_volume_usd' => 'totalVolumeUsd',
        'total_volume_eth' => 'totalVolumeEth',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_liquidity_usd' => 'totalLiquidityUsd',
        'total_liquidity_eth' => 'totalLiquidityEth',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'pair_count' => 'pairCount',
        'total_volume_usd' => 'totalVolumeUsd',
        'total_volume_eth' => 'totalVolumeEth',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_liquidity_usd' => 'totalLiquidityUsd',
        'total_liquidity_eth' => 'totalLiquidityEth',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'pair_count' => 'pairCount',
        'total_volume_usd' => 'totalVolumeUsd',
        'total_volume_eth' => 'totalVolumeEth',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_liquidity_usd' => 'totalLiquidityUsd',
        'total_liquidity_eth' => 'totalLiquidityEth',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'pair_count' => 'pairCount',
        'total_volume_usd' => 'totalVolumeUsd',
        'total_volume_eth' => 'totalVolumeEth',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_liquidity_usd' => 'totalLiquidityUsd',
        'total_liquidity_eth' => 'totalLiquidityEth',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'pair_count' => 'pairCount',
        'total_volume_usd' => 'totalVolumeUsd',
        'total_volume_eth' => 'totalVolumeEth',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_liquidity_usd' => 'totalLiquidityUsd',
        'total_liquidity_eth' => 'totalLiquidityEth',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'pair_count' => 'pairCount',
        'total_volume_usd' => 'totalVolumeUsd',
        'total_volume_eth' => 'totalVolumeEth',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_liquidity_usd' => 'totalLiquidityUsd',
        'total_liquidity_eth' => 'totalLiquidityEth',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASUniswapV2UniswapFactoryDTO getExample() {
        OASUniswapV2UniswapFactoryDTO uniswapV2UniswapFactoryDTO = new OASUniswapV2UniswapFactoryDTO();
          uniswapV2UniswapFactoryDTO.entryTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          uniswapV2UniswapFactoryDTO.recvTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          uniswapV2UniswapFactoryDTO.blockNumber = 123456789L;
          uniswapV2UniswapFactoryDTO.id = '';
          uniswapV2UniswapFactoryDTO.pairCount = 0;
          uniswapV2UniswapFactoryDTO.totalVolumeUsd = '';
          uniswapV2UniswapFactoryDTO.totalVolumeEth = '';
          uniswapV2UniswapFactoryDTO.untrackedVolumeUsd = '';
          uniswapV2UniswapFactoryDTO.totalLiquidityUsd = '';
          uniswapV2UniswapFactoryDTO.totalLiquidityEth = '';
          uniswapV2UniswapFactoryDTO.txCount = '';
          uniswapV2UniswapFactoryDTO.vid = 123456789L;
        return uniswapV2UniswapFactoryDTO;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASUniswapV2UniswapFactoryDTO) {           
            OASUniswapV2UniswapFactoryDTO uniswapV2UniswapFactoryDTO = (OASUniswapV2UniswapFactoryDTO) obj;
            return this.entryTime == uniswapV2UniswapFactoryDTO.entryTime
                && this.recvTime == uniswapV2UniswapFactoryDTO.recvTime
                && this.blockNumber == uniswapV2UniswapFactoryDTO.blockNumber
                && this.id == uniswapV2UniswapFactoryDTO.id
                && this.pairCount == uniswapV2UniswapFactoryDTO.pairCount
                && this.totalVolumeUsd == uniswapV2UniswapFactoryDTO.totalVolumeUsd
                && this.totalVolumeEth == uniswapV2UniswapFactoryDTO.totalVolumeEth
                && this.untrackedVolumeUsd == uniswapV2UniswapFactoryDTO.untrackedVolumeUsd
                && this.totalLiquidityUsd == uniswapV2UniswapFactoryDTO.totalLiquidityUsd
                && this.totalLiquidityEth == uniswapV2UniswapFactoryDTO.totalLiquidityEth
                && this.txCount == uniswapV2UniswapFactoryDTO.txCount
                && this.vid == uniswapV2UniswapFactoryDTO.vid;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (entryTime == null ? 0 : System.hashCode(entryTime));
        hashCode = (17 * hashCode) + (recvTime == null ? 0 : System.hashCode(recvTime));
        hashCode = (17 * hashCode) + (blockNumber == null ? 0 : System.hashCode(blockNumber));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (pairCount == null ? 0 : System.hashCode(pairCount));
        hashCode = (17 * hashCode) + (totalVolumeUsd == null ? 0 : System.hashCode(totalVolumeUsd));
        hashCode = (17 * hashCode) + (totalVolumeEth == null ? 0 : System.hashCode(totalVolumeEth));
        hashCode = (17 * hashCode) + (untrackedVolumeUsd == null ? 0 : System.hashCode(untrackedVolumeUsd));
        hashCode = (17 * hashCode) + (totalLiquidityUsd == null ? 0 : System.hashCode(totalLiquidityUsd));
        hashCode = (17 * hashCode) + (totalLiquidityEth == null ? 0 : System.hashCode(totalLiquidityEth));
        hashCode = (17 * hashCode) + (txCount == null ? 0 : System.hashCode(txCount));
        hashCode = (17 * hashCode) + (vid == null ? 0 : System.hashCode(vid));
        return hashCode;
    }
}

