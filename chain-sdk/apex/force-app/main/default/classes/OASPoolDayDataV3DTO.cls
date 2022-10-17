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
 * OASPoolDayDataV3DTO
 */
public class OASPoolDayDataV3DTO implements OAS.MappedProperties {
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
     * Get blockNumber
     * @return blockNumber
     */
    public Long blockNumber { get; set; }

    /**
     * Get id
     * @return id
     */
    public String id { get; set; }

    /**
     * Get r_date
     * @return r_date
     */
    public Integer r_date { get; set; }

    /**
     * Get pool
     * @return pool
     */
    public String pool { get; set; }

    /**
     * Get liquidity
     * @return liquidity
     */
    public String liquidity { get; set; }

    /**
     * Get sqrtPrice
     * @return sqrtPrice
     */
    public String sqrtPrice { get; set; }

    /**
     * Get token0Price
     * @return token0Price
     */
    public String token0Price { get; set; }

    /**
     * Get token1Price
     * @return token1Price
     */
    public String token1Price { get; set; }

    /**
     * Get tick
     * @return tick
     */
    public String tick { get; set; }

    /**
     * Get feeGrowthGlobal0x128
     * @return feeGrowthGlobal0x128
     */
    public String feeGrowthGlobal0x128 { get; set; }

    /**
     * Get feeGrowthGlobal1x128
     * @return feeGrowthGlobal1x128
     */
    public String feeGrowthGlobal1x128 { get; set; }

    /**
     * Get tvlUsd
     * @return tvlUsd
     */
    public String tvlUsd { get; set; }

    /**
     * Get volumeToken0
     * @return volumeToken0
     */
    public String volumeToken0 { get; set; }

    /**
     * Get volumeToken1
     * @return volumeToken1
     */
    public String volumeToken1 { get; set; }

    /**
     * Get volumeUsd
     * @return volumeUsd
     */
    public String volumeUsd { get; set; }

    /**
     * Get feesUsd
     * @return feesUsd
     */
    public String feesUsd { get; set; }

    /**
     * Get txCount
     * @return txCount
     */
    public String txCount { get; set; }

    /**
     * Get open
     * @return open
     */
    public String open { get; set; }

    /**
     * Get high
     * @return high
     */
    public String high { get; set; }

    /**
     * Get low
     * @return low
     */
    public String low { get; set; }

    /**
     * Get close
     * @return close
     */
    public String close { get; set; }

    /**
     * Get vid
     * @return vid
     */
    public Long vid { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'sqrt_price' => 'sqrtPrice',
        'token_0_price' => 'token0Price',
        'token_1_price' => 'token1Price',
        'fee_growth_global_0x128' => 'feeGrowthGlobal0x128',
        'fee_growth_global_1x128' => 'feeGrowthGlobal1x128',
        'tvl_usd' => 'tvlUsd',
        'volume_token_0' => 'volumeToken0',
        'volume_token_1' => 'volumeToken1',
        'volume_usd' => 'volumeUsd',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'sqrt_price' => 'sqrtPrice',
        'token_0_price' => 'token0Price',
        'token_1_price' => 'token1Price',
        'fee_growth_global_0x128' => 'feeGrowthGlobal0x128',
        'fee_growth_global_1x128' => 'feeGrowthGlobal1x128',
        'tvl_usd' => 'tvlUsd',
        'volume_token_0' => 'volumeToken0',
        'volume_token_1' => 'volumeToken1',
        'volume_usd' => 'volumeUsd',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'sqrt_price' => 'sqrtPrice',
        'token_0_price' => 'token0Price',
        'token_1_price' => 'token1Price',
        'fee_growth_global_0x128' => 'feeGrowthGlobal0x128',
        'fee_growth_global_1x128' => 'feeGrowthGlobal1x128',
        'tvl_usd' => 'tvlUsd',
        'volume_token_0' => 'volumeToken0',
        'volume_token_1' => 'volumeToken1',
        'volume_usd' => 'volumeUsd',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'sqrt_price' => 'sqrtPrice',
        'token_0_price' => 'token0Price',
        'token_1_price' => 'token1Price',
        'fee_growth_global_0x128' => 'feeGrowthGlobal0x128',
        'fee_growth_global_1x128' => 'feeGrowthGlobal1x128',
        'tvl_usd' => 'tvlUsd',
        'volume_token_0' => 'volumeToken0',
        'volume_token_1' => 'volumeToken1',
        'volume_usd' => 'volumeUsd',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'sqrt_price' => 'sqrtPrice',
        'token_0_price' => 'token0Price',
        'token_1_price' => 'token1Price',
        'fee_growth_global_0x128' => 'feeGrowthGlobal0x128',
        'fee_growth_global_1x128' => 'feeGrowthGlobal1x128',
        'tvl_usd' => 'tvlUsd',
        'volume_token_0' => 'volumeToken0',
        'volume_token_1' => 'volumeToken1',
        'volume_usd' => 'volumeUsd',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'sqrt_price' => 'sqrtPrice',
        'token_0_price' => 'token0Price',
        'token_1_price' => 'token1Price',
        'fee_growth_global_0x128' => 'feeGrowthGlobal0x128',
        'fee_growth_global_1x128' => 'feeGrowthGlobal1x128',
        'tvl_usd' => 'tvlUsd',
        'volume_token_0' => 'volumeToken0',
        'volume_token_1' => 'volumeToken1',
        'volume_usd' => 'volumeUsd',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'sqrt_price' => 'sqrtPrice',
        'token_0_price' => 'token0Price',
        'token_1_price' => 'token1Price',
        'fee_growth_global_0x128' => 'feeGrowthGlobal0x128',
        'fee_growth_global_1x128' => 'feeGrowthGlobal1x128',
        'tvl_usd' => 'tvlUsd',
        'volume_token_0' => 'volumeToken0',
        'volume_token_1' => 'volumeToken1',
        'volume_usd' => 'volumeUsd',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'sqrt_price' => 'sqrtPrice',
        'token_0_price' => 'token0Price',
        'token_1_price' => 'token1Price',
        'fee_growth_global_0x128' => 'feeGrowthGlobal0x128',
        'fee_growth_global_1x128' => 'feeGrowthGlobal1x128',
        'tvl_usd' => 'tvlUsd',
        'volume_token_0' => 'volumeToken0',
        'volume_token_1' => 'volumeToken1',
        'volume_usd' => 'volumeUsd',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'sqrt_price' => 'sqrtPrice',
        'token_0_price' => 'token0Price',
        'token_1_price' => 'token1Price',
        'fee_growth_global_0x128' => 'feeGrowthGlobal0x128',
        'fee_growth_global_1x128' => 'feeGrowthGlobal1x128',
        'tvl_usd' => 'tvlUsd',
        'volume_token_0' => 'volumeToken0',
        'volume_token_1' => 'volumeToken1',
        'volume_usd' => 'volumeUsd',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'sqrt_price' => 'sqrtPrice',
        'token_0_price' => 'token0Price',
        'token_1_price' => 'token1Price',
        'fee_growth_global_0x128' => 'feeGrowthGlobal0x128',
        'fee_growth_global_1x128' => 'feeGrowthGlobal1x128',
        'tvl_usd' => 'tvlUsd',
        'volume_token_0' => 'volumeToken0',
        'volume_token_1' => 'volumeToken1',
        'volume_usd' => 'volumeUsd',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'sqrt_price' => 'sqrtPrice',
        'token_0_price' => 'token0Price',
        'token_1_price' => 'token1Price',
        'fee_growth_global_0x128' => 'feeGrowthGlobal0x128',
        'fee_growth_global_1x128' => 'feeGrowthGlobal1x128',
        'tvl_usd' => 'tvlUsd',
        'volume_token_0' => 'volumeToken0',
        'volume_token_1' => 'volumeToken1',
        'volume_usd' => 'volumeUsd',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'sqrt_price' => 'sqrtPrice',
        'token_0_price' => 'token0Price',
        'token_1_price' => 'token1Price',
        'fee_growth_global_0x128' => 'feeGrowthGlobal0x128',
        'fee_growth_global_1x128' => 'feeGrowthGlobal1x128',
        'tvl_usd' => 'tvlUsd',
        'volume_token_0' => 'volumeToken0',
        'volume_token_1' => 'volumeToken1',
        'volume_usd' => 'volumeUsd',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'sqrt_price' => 'sqrtPrice',
        'token_0_price' => 'token0Price',
        'token_1_price' => 'token1Price',
        'fee_growth_global_0x128' => 'feeGrowthGlobal0x128',
        'fee_growth_global_1x128' => 'feeGrowthGlobal1x128',
        'tvl_usd' => 'tvlUsd',
        'volume_token_0' => 'volumeToken0',
        'volume_token_1' => 'volumeToken1',
        'volume_usd' => 'volumeUsd',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'sqrt_price' => 'sqrtPrice',
        'token_0_price' => 'token0Price',
        'token_1_price' => 'token1Price',
        'fee_growth_global_0x128' => 'feeGrowthGlobal0x128',
        'fee_growth_global_1x128' => 'feeGrowthGlobal1x128',
        'tvl_usd' => 'tvlUsd',
        'volume_token_0' => 'volumeToken0',
        'volume_token_1' => 'volumeToken1',
        'volume_usd' => 'volumeUsd',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'date' => 'r_date',
        'sqrt_price' => 'sqrtPrice',
        'token_0_price' => 'token0Price',
        'token_1_price' => 'token1Price',
        'fee_growth_global_0x128' => 'feeGrowthGlobal0x128',
        'fee_growth_global_1x128' => 'feeGrowthGlobal1x128',
        'tvl_usd' => 'tvlUsd',
        'volume_token_0' => 'volumeToken0',
        'volume_token_1' => 'volumeToken1',
        'volume_usd' => 'volumeUsd',
        'fees_usd' => 'feesUsd',
        'tx_count' => 'txCount'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASPoolDayDataV3DTO getExample() {
        OASPoolDayDataV3DTO poolDayDataV3DTO = new OASPoolDayDataV3DTO();
          poolDayDataV3DTO.entryTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          poolDayDataV3DTO.recvTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          poolDayDataV3DTO.blockNumber = 123456789L;
          poolDayDataV3DTO.id = '';
          poolDayDataV3DTO.r_date = 0;
          poolDayDataV3DTO.pool = '';
          poolDayDataV3DTO.liquidity = '';
          poolDayDataV3DTO.sqrtPrice = '';
          poolDayDataV3DTO.token0Price = '';
          poolDayDataV3DTO.token1Price = '';
          poolDayDataV3DTO.tick = '';
          poolDayDataV3DTO.feeGrowthGlobal0x128 = '';
          poolDayDataV3DTO.feeGrowthGlobal1x128 = '';
          poolDayDataV3DTO.tvlUsd = '';
          poolDayDataV3DTO.volumeToken0 = '';
          poolDayDataV3DTO.volumeToken1 = '';
          poolDayDataV3DTO.volumeUsd = '';
          poolDayDataV3DTO.feesUsd = '';
          poolDayDataV3DTO.txCount = '';
          poolDayDataV3DTO.open = '';
          poolDayDataV3DTO.high = '';
          poolDayDataV3DTO.low = '';
          poolDayDataV3DTO.close = '';
          poolDayDataV3DTO.vid = 123456789L;
        return poolDayDataV3DTO;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASPoolDayDataV3DTO) {           
            OASPoolDayDataV3DTO poolDayDataV3DTO = (OASPoolDayDataV3DTO) obj;
            return this.entryTime == poolDayDataV3DTO.entryTime
                && this.recvTime == poolDayDataV3DTO.recvTime
                && this.blockNumber == poolDayDataV3DTO.blockNumber
                && this.id == poolDayDataV3DTO.id
                && this.r_date == poolDayDataV3DTO.r_date
                && this.pool == poolDayDataV3DTO.pool
                && this.liquidity == poolDayDataV3DTO.liquidity
                && this.sqrtPrice == poolDayDataV3DTO.sqrtPrice
                && this.token0Price == poolDayDataV3DTO.token0Price
                && this.token1Price == poolDayDataV3DTO.token1Price
                && this.tick == poolDayDataV3DTO.tick
                && this.feeGrowthGlobal0x128 == poolDayDataV3DTO.feeGrowthGlobal0x128
                && this.feeGrowthGlobal1x128 == poolDayDataV3DTO.feeGrowthGlobal1x128
                && this.tvlUsd == poolDayDataV3DTO.tvlUsd
                && this.volumeToken0 == poolDayDataV3DTO.volumeToken0
                && this.volumeToken1 == poolDayDataV3DTO.volumeToken1
                && this.volumeUsd == poolDayDataV3DTO.volumeUsd
                && this.feesUsd == poolDayDataV3DTO.feesUsd
                && this.txCount == poolDayDataV3DTO.txCount
                && this.open == poolDayDataV3DTO.open
                && this.high == poolDayDataV3DTO.high
                && this.low == poolDayDataV3DTO.low
                && this.close == poolDayDataV3DTO.close
                && this.vid == poolDayDataV3DTO.vid;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (entryTime == null ? 0 : System.hashCode(entryTime));
        hashCode = (17 * hashCode) + (recvTime == null ? 0 : System.hashCode(recvTime));
        hashCode = (17 * hashCode) + (blockNumber == null ? 0 : System.hashCode(blockNumber));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (r_date == null ? 0 : System.hashCode(r_date));
        hashCode = (17 * hashCode) + (pool == null ? 0 : System.hashCode(pool));
        hashCode = (17 * hashCode) + (liquidity == null ? 0 : System.hashCode(liquidity));
        hashCode = (17 * hashCode) + (sqrtPrice == null ? 0 : System.hashCode(sqrtPrice));
        hashCode = (17 * hashCode) + (token0Price == null ? 0 : System.hashCode(token0Price));
        hashCode = (17 * hashCode) + (token1Price == null ? 0 : System.hashCode(token1Price));
        hashCode = (17 * hashCode) + (tick == null ? 0 : System.hashCode(tick));
        hashCode = (17 * hashCode) + (feeGrowthGlobal0x128 == null ? 0 : System.hashCode(feeGrowthGlobal0x128));
        hashCode = (17 * hashCode) + (feeGrowthGlobal1x128 == null ? 0 : System.hashCode(feeGrowthGlobal1x128));
        hashCode = (17 * hashCode) + (tvlUsd == null ? 0 : System.hashCode(tvlUsd));
        hashCode = (17 * hashCode) + (volumeToken0 == null ? 0 : System.hashCode(volumeToken0));
        hashCode = (17 * hashCode) + (volumeToken1 == null ? 0 : System.hashCode(volumeToken1));
        hashCode = (17 * hashCode) + (volumeUsd == null ? 0 : System.hashCode(volumeUsd));
        hashCode = (17 * hashCode) + (feesUsd == null ? 0 : System.hashCode(feesUsd));
        hashCode = (17 * hashCode) + (txCount == null ? 0 : System.hashCode(txCount));
        hashCode = (17 * hashCode) + (open == null ? 0 : System.hashCode(open));
        hashCode = (17 * hashCode) + (high == null ? 0 : System.hashCode(high));
        hashCode = (17 * hashCode) + (low == null ? 0 : System.hashCode(low));
        hashCode = (17 * hashCode) + (close == null ? 0 : System.hashCode(close));
        hashCode = (17 * hashCode) + (vid == null ? 0 : System.hashCode(vid));
        return hashCode;
    }
}
