package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BigInteger;

@Canonical
class TokenV3DTO {
    
    Date entryTime
    
    Date recvTime
    /*  */
    Long blockNumber
    /*  */
    Long vid
    /* token address */
    String id
    /* token symbol */
    String symbol
    /* token name */
    String name
    /* token decimals */
    Integer decimals
    
    BigInteger totalSupply
    /* volume in token units */
    String volume
    /* volume in derived USD */
    String volumeUsd
    /* volume in USD even on pools with less reliable USD values */
    String untrackedVolumeUsd
    /* fees in USD */
    String feesUsd
    
    BigInteger txCount
    
    BigInteger poolCount
    /* liquidity across all pools in token units */
    String totalValueLocked
    /* liquidity across all pools in derived USD */
    String totalValueLockedUsd
    /* TVL derived in USD untracked */
    String totalValueLockedUsdUntracked
    /* derived price in ETH */
    String derivedEth
    /* pools token is in that are white listed for USD pricing */
    List<String> whitelistPools = new ArrayList<>()
    
    String tokenSymbol
}
