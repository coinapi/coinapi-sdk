package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class TokenV3DayDataDTO {
    
    Date entryTime
    
    Date recvTime
    
    Long blockNumber
    
    Long vid
    
    String id
    
    Integer date
    
    String token
    
    String volume
    
    String volumeUsd
    
    String untrackedVolumeUsd
    
    String totalValueLocked
    
    String totalValueLockedUsd
    
    String priceUsd
    
    String feesUsd
    
    String open
    
    String high
    
    String low
    
    String close
}