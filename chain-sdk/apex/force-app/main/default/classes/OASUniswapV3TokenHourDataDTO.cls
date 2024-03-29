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
 * Token data aggregated across all pairs that include token.
 */
public class OASUniswapV3TokenHourDataDTO implements OAS.MappedProperties {
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
     * Token address concatendated with date.
     * @return id
     */
    public String id { get; set; }

    /**
     * Unix timestamp for start of hour.
     * @return periodStartUnix
     */
    public Integer periodStartUnix { get; set; }

    /**
     * Pointer to token.
     * @return token
     */
    public String token { get; set; }

    /**
     * Volume in token units.
     * @return volume
     */
    public String volume { get; set; }

    /**
     * Volume in derived USD.
     * @return volumeUsd
     */
    public String volumeUsd { get; set; }

    /**
     * Volume in USD even on pools with less reliable USD values.
     * @return untrackedVolumeUsd
     */
    public String untrackedVolumeUsd { get; set; }

    /**
     * Liquidity across all pools in token units.
     * @return totalValueLocked
     */
    public String totalValueLocked { get; set; }

    /**
     * Liquidity across all pools in derived USD.
     * @return totalValueLockedUsd
     */
    public String totalValueLockedUsd { get; set; }

    /**
     * Price at end of period in USD.
     * @return priceUsd
     */
    public String priceUsd { get; set; }

    /**
     * Fees in USD.
     * @return feesUsd
     */
    public String feesUsd { get; set; }

    /**
     * Opening price USD.
     * @return open
     */
    public String open { get; set; }

    /**
     * High price USD.
     * @return high
     */
    public String high { get; set; }

    /**
     * Low price USD.
     * @return low
     */
    public String low { get; set; }

    /**
     * Close price USD.
     * @return close
     */
    public String close { get; set; }

    /**
     * 
     * @return vid
     */
    public Long vid { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'period_start_unix' => 'periodStartUnix',
        'volume_usd' => 'volumeUsd',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_value_locked' => 'totalValueLocked',
        'total_value_locked_usd' => 'totalValueLockedUsd',
        'price_usd' => 'priceUsd',
        'fees_usd' => 'feesUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'period_start_unix' => 'periodStartUnix',
        'volume_usd' => 'volumeUsd',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_value_locked' => 'totalValueLocked',
        'total_value_locked_usd' => 'totalValueLockedUsd',
        'price_usd' => 'priceUsd',
        'fees_usd' => 'feesUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'period_start_unix' => 'periodStartUnix',
        'volume_usd' => 'volumeUsd',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_value_locked' => 'totalValueLocked',
        'total_value_locked_usd' => 'totalValueLockedUsd',
        'price_usd' => 'priceUsd',
        'fees_usd' => 'feesUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'period_start_unix' => 'periodStartUnix',
        'volume_usd' => 'volumeUsd',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_value_locked' => 'totalValueLocked',
        'total_value_locked_usd' => 'totalValueLockedUsd',
        'price_usd' => 'priceUsd',
        'fees_usd' => 'feesUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'period_start_unix' => 'periodStartUnix',
        'volume_usd' => 'volumeUsd',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_value_locked' => 'totalValueLocked',
        'total_value_locked_usd' => 'totalValueLockedUsd',
        'price_usd' => 'priceUsd',
        'fees_usd' => 'feesUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'period_start_unix' => 'periodStartUnix',
        'volume_usd' => 'volumeUsd',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_value_locked' => 'totalValueLocked',
        'total_value_locked_usd' => 'totalValueLockedUsd',
        'price_usd' => 'priceUsd',
        'fees_usd' => 'feesUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'period_start_unix' => 'periodStartUnix',
        'volume_usd' => 'volumeUsd',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_value_locked' => 'totalValueLocked',
        'total_value_locked_usd' => 'totalValueLockedUsd',
        'price_usd' => 'priceUsd',
        'fees_usd' => 'feesUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'period_start_unix' => 'periodStartUnix',
        'volume_usd' => 'volumeUsd',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_value_locked' => 'totalValueLocked',
        'total_value_locked_usd' => 'totalValueLockedUsd',
        'price_usd' => 'priceUsd',
        'fees_usd' => 'feesUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'period_start_unix' => 'periodStartUnix',
        'volume_usd' => 'volumeUsd',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_value_locked' => 'totalValueLocked',
        'total_value_locked_usd' => 'totalValueLockedUsd',
        'price_usd' => 'priceUsd',
        'fees_usd' => 'feesUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'period_start_unix' => 'periodStartUnix',
        'volume_usd' => 'volumeUsd',
        'untracked_volume_usd' => 'untrackedVolumeUsd',
        'total_value_locked' => 'totalValueLocked',
        'total_value_locked_usd' => 'totalValueLockedUsd',
        'price_usd' => 'priceUsd',
        'fees_usd' => 'feesUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASUniswapV3TokenHourDataDTO getExample() {
        OASUniswapV3TokenHourDataDTO uniswapV3TokenHourDataDTO = new OASUniswapV3TokenHourDataDTO();
          uniswapV3TokenHourDataDTO.entryTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          uniswapV3TokenHourDataDTO.recvTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          uniswapV3TokenHourDataDTO.blockNumber = 123456789L;
          uniswapV3TokenHourDataDTO.id = '';
          uniswapV3TokenHourDataDTO.periodStartUnix = 0;
          uniswapV3TokenHourDataDTO.token = '';
          uniswapV3TokenHourDataDTO.volume = '';
          uniswapV3TokenHourDataDTO.volumeUsd = '';
          uniswapV3TokenHourDataDTO.untrackedVolumeUsd = '';
          uniswapV3TokenHourDataDTO.totalValueLocked = '';
          uniswapV3TokenHourDataDTO.totalValueLockedUsd = '';
          uniswapV3TokenHourDataDTO.priceUsd = '';
          uniswapV3TokenHourDataDTO.feesUsd = '';
          uniswapV3TokenHourDataDTO.open = '';
          uniswapV3TokenHourDataDTO.high = '';
          uniswapV3TokenHourDataDTO.low = '';
          uniswapV3TokenHourDataDTO.close = '';
          uniswapV3TokenHourDataDTO.vid = 123456789L;
        return uniswapV3TokenHourDataDTO;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASUniswapV3TokenHourDataDTO) {           
            OASUniswapV3TokenHourDataDTO uniswapV3TokenHourDataDTO = (OASUniswapV3TokenHourDataDTO) obj;
            return this.entryTime == uniswapV3TokenHourDataDTO.entryTime
                && this.recvTime == uniswapV3TokenHourDataDTO.recvTime
                && this.blockNumber == uniswapV3TokenHourDataDTO.blockNumber
                && this.id == uniswapV3TokenHourDataDTO.id
                && this.periodStartUnix == uniswapV3TokenHourDataDTO.periodStartUnix
                && this.token == uniswapV3TokenHourDataDTO.token
                && this.volume == uniswapV3TokenHourDataDTO.volume
                && this.volumeUsd == uniswapV3TokenHourDataDTO.volumeUsd
                && this.untrackedVolumeUsd == uniswapV3TokenHourDataDTO.untrackedVolumeUsd
                && this.totalValueLocked == uniswapV3TokenHourDataDTO.totalValueLocked
                && this.totalValueLockedUsd == uniswapV3TokenHourDataDTO.totalValueLockedUsd
                && this.priceUsd == uniswapV3TokenHourDataDTO.priceUsd
                && this.feesUsd == uniswapV3TokenHourDataDTO.feesUsd
                && this.open == uniswapV3TokenHourDataDTO.open
                && this.high == uniswapV3TokenHourDataDTO.high
                && this.low == uniswapV3TokenHourDataDTO.low
                && this.close == uniswapV3TokenHourDataDTO.close
                && this.vid == uniswapV3TokenHourDataDTO.vid;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (entryTime == null ? 0 : System.hashCode(entryTime));
        hashCode = (17 * hashCode) + (recvTime == null ? 0 : System.hashCode(recvTime));
        hashCode = (17 * hashCode) + (blockNumber == null ? 0 : System.hashCode(blockNumber));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (periodStartUnix == null ? 0 : System.hashCode(periodStartUnix));
        hashCode = (17 * hashCode) + (token == null ? 0 : System.hashCode(token));
        hashCode = (17 * hashCode) + (volume == null ? 0 : System.hashCode(volume));
        hashCode = (17 * hashCode) + (volumeUsd == null ? 0 : System.hashCode(volumeUsd));
        hashCode = (17 * hashCode) + (untrackedVolumeUsd == null ? 0 : System.hashCode(untrackedVolumeUsd));
        hashCode = (17 * hashCode) + (totalValueLocked == null ? 0 : System.hashCode(totalValueLocked));
        hashCode = (17 * hashCode) + (totalValueLockedUsd == null ? 0 : System.hashCode(totalValueLockedUsd));
        hashCode = (17 * hashCode) + (priceUsd == null ? 0 : System.hashCode(priceUsd));
        hashCode = (17 * hashCode) + (feesUsd == null ? 0 : System.hashCode(feesUsd));
        hashCode = (17 * hashCode) + (open == null ? 0 : System.hashCode(open));
        hashCode = (17 * hashCode) + (high == null ? 0 : System.hashCode(high));
        hashCode = (17 * hashCode) + (low == null ? 0 : System.hashCode(low));
        hashCode = (17 * hashCode) + (close == null ? 0 : System.hashCode(close));
        hashCode = (17 * hashCode) + (vid == null ? 0 : System.hashCode(vid));
        return hashCode;
    }
}

