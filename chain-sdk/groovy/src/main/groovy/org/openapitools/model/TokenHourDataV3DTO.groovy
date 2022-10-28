package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class TokenHourDataV3DTO {
    
    Date entryTime
    
    Date recvTime
    /*  */
    Long blockNumber
    /* token address concatendated with date */
    String id
    /* unix timestamp for start of hour */
    Integer periodStartUnix
    /* pointer to token */
    String token
    /* volume in token units */
    String volume
    /* volume in derived USD */
    String volumeUsd
    /* volume in USD even on pools with less reliable USD values */
    String untrackedVolumeUsd
    /* liquidity across all pools in token units */
    String totalValueLocked
    /* liquidity across all pools in derived USD */
    String totalValueLockedUsd
    /* price at end of period in USD */
    String priceUsd
    /* fees in USD */
    String feesUsd
    /* opening price USD */
    String open
    /* high price USD */
    String high
    /* low price USD */
    String low
    /* close price USD */
    String close
    /*  */
    Long vid
}
