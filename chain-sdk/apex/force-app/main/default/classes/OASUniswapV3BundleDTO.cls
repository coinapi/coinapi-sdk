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
 * The Bundle is used as a global store of derived ETH price in USD. This provides a strong estimate for the USD price of ETH.
 */
public class OASUniswapV3BundleDTO implements OAS.MappedProperties {
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
     * Price of ETH in usd.
     * @return ethPriceUsd
     */
    public String ethPriceUsd { get; set; }

    /**
     * 
     * @return vid
     */
    public Long vid { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'eth_price_usd' => 'ethPriceUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'eth_price_usd' => 'ethPriceUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'eth_price_usd' => 'ethPriceUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'entry_time' => 'entryTime',
        'recv_time' => 'recvTime',
        'block_number' => 'blockNumber',
        'eth_price_usd' => 'ethPriceUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASUniswapV3BundleDTO getExample() {
        OASUniswapV3BundleDTO uniswapV3BundleDTO = new OASUniswapV3BundleDTO();
          uniswapV3BundleDTO.entryTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          uniswapV3BundleDTO.recvTime = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          uniswapV3BundleDTO.blockNumber = 123456789L;
          uniswapV3BundleDTO.id = '';
          uniswapV3BundleDTO.ethPriceUsd = '';
          uniswapV3BundleDTO.vid = 123456789L;
        return uniswapV3BundleDTO;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASUniswapV3BundleDTO) {           
            OASUniswapV3BundleDTO uniswapV3BundleDTO = (OASUniswapV3BundleDTO) obj;
            return this.entryTime == uniswapV3BundleDTO.entryTime
                && this.recvTime == uniswapV3BundleDTO.recvTime
                && this.blockNumber == uniswapV3BundleDTO.blockNumber
                && this.id == uniswapV3BundleDTO.id
                && this.ethPriceUsd == uniswapV3BundleDTO.ethPriceUsd
                && this.vid == uniswapV3BundleDTO.vid;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (entryTime == null ? 0 : System.hashCode(entryTime));
        hashCode = (17 * hashCode) + (recvTime == null ? 0 : System.hashCode(recvTime));
        hashCode = (17 * hashCode) + (blockNumber == null ? 0 : System.hashCode(blockNumber));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (ethPriceUsd == null ? 0 : System.hashCode(ethPriceUsd));
        hashCode = (17 * hashCode) + (vid == null ? 0 : System.hashCode(vid));
        return hashCode;
    }
}

