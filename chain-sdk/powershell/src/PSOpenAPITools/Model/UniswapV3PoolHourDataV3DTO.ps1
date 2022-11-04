#
# OnChain API
#  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
# Version: v1
# Contact: support@coinapi.io
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

Hourly stats tracker for pool.

.PARAMETER EntryTime
No description available.
.PARAMETER RecvTime
No description available.
.PARAMETER BlockNumber
Number of block in which entity was recorded.
.PARAMETER Id
Identifier, format: <pool address>-<day id>
.PARAMETER PeriodStartUnix
Unix timestamp for start of hour.
.PARAMETER Pool
Pointer to pool.
.PARAMETER Liquidity
In range liquidity at end of period.
.PARAMETER SqrtPrice
Current price tracker at end of period.
.PARAMETER Token0Price
Price of token0 - derived from sqrtPrice.
.PARAMETER Token1Price
Price of token1 - derived from sqrtPrice.
.PARAMETER Tick
Current tick at end of period.
.PARAMETER FeeGrowthGlobal0x128
Tracker for global fee growth.
.PARAMETER FeeGrowthGlobal1x128
Tracker for global fee growth.
.PARAMETER TvlUsd
Total value locked derived in USD at end of period.
.PARAMETER VolumeToken0
Volume in token0.
.PARAMETER VolumeToken1
Volume in token1.
.PARAMETER VolumeUsd
Volume in USD.
.PARAMETER FeesUsd
Fees in USD.
.PARAMETER TxCount
Number of transactions during period.
.PARAMETER Open
Opening price of token0.
.PARAMETER High
High price of token0.
.PARAMETER Low
Low price of token0.
.PARAMETER Close
Close price of token0.
.PARAMETER Vid

.OUTPUTS

UniswapV3PoolHourDataV3DTO<PSCustomObject>
#>

function Initialize-UniswapV3PoolHourDataV3DTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${EntryTime},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${RecvTime},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${BlockNumber},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Id},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${PeriodStartUnix},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Pool},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Liquidity},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SqrtPrice},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Token0Price},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Token1Price},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Tick},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FeeGrowthGlobal0x128},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FeeGrowthGlobal1x128},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TvlUsd},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${VolumeToken0},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${VolumeToken1},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${VolumeUsd},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FeesUsd},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TxCount},
        [Parameter(Position = 19, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Open},
        [Parameter(Position = 20, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${High},
        [Parameter(Position = 21, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Low},
        [Parameter(Position = 22, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Close},
        [Parameter(Position = 23, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${Vid}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => UniswapV3PoolHourDataV3DTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "period_start_unix" = ${PeriodStartUnix}
            "pool" = ${Pool}
            "liquidity" = ${Liquidity}
            "sqrt_price" = ${SqrtPrice}
            "token_0_price" = ${Token0Price}
            "token_1_price" = ${Token1Price}
            "tick" = ${Tick}
            "fee_growth_global_0x128" = ${FeeGrowthGlobal0x128}
            "fee_growth_global_1x128" = ${FeeGrowthGlobal1x128}
            "tvl_usd" = ${TvlUsd}
            "volume_token_0" = ${VolumeToken0}
            "volume_token_1" = ${VolumeToken1}
            "volume_usd" = ${VolumeUsd}
            "fees_usd" = ${FeesUsd}
            "tx_count" = ${TxCount}
            "open" = ${Open}
            "high" = ${High}
            "low" = ${Low}
            "close" = ${Close}
            "vid" = ${Vid}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to UniswapV3PoolHourDataV3DTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to UniswapV3PoolHourDataV3DTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

UniswapV3PoolHourDataV3DTO<PSCustomObject>
#>
function ConvertFrom-JsonToUniswapV3PoolHourDataV3DTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => UniswapV3PoolHourDataV3DTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in UniswapV3PoolHourDataV3DTO
        $AllProperties = ("entry_time", "recv_time", "block_number", "id", "period_start_unix", "pool", "liquidity", "sqrt_price", "token_0_price", "token_1_price", "tick", "fee_growth_global_0x128", "fee_growth_global_1x128", "tvl_usd", "volume_token_0", "volume_token_1", "volume_usd", "fees_usd", "tx_count", "open", "high", "low", "close", "vid")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "entry_time"))) { #optional property not found
            $EntryTime = $null
        } else {
            $EntryTime = $JsonParameters.PSobject.Properties["entry_time"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "recv_time"))) { #optional property not found
            $RecvTime = $null
        } else {
            $RecvTime = $JsonParameters.PSobject.Properties["recv_time"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "block_number"))) { #optional property not found
            $BlockNumber = $null
        } else {
            $BlockNumber = $JsonParameters.PSobject.Properties["block_number"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) { #optional property not found
            $Id = $null
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "period_start_unix"))) { #optional property not found
            $PeriodStartUnix = $null
        } else {
            $PeriodStartUnix = $JsonParameters.PSobject.Properties["period_start_unix"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "pool"))) { #optional property not found
            $Pool = $null
        } else {
            $Pool = $JsonParameters.PSobject.Properties["pool"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "liquidity"))) { #optional property not found
            $Liquidity = $null
        } else {
            $Liquidity = $JsonParameters.PSobject.Properties["liquidity"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "sqrt_price"))) { #optional property not found
            $SqrtPrice = $null
        } else {
            $SqrtPrice = $JsonParameters.PSobject.Properties["sqrt_price"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "token_0_price"))) { #optional property not found
            $Token0Price = $null
        } else {
            $Token0Price = $JsonParameters.PSobject.Properties["token_0_price"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "token_1_price"))) { #optional property not found
            $Token1Price = $null
        } else {
            $Token1Price = $JsonParameters.PSobject.Properties["token_1_price"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tick"))) { #optional property not found
            $Tick = $null
        } else {
            $Tick = $JsonParameters.PSobject.Properties["tick"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fee_growth_global_0x128"))) { #optional property not found
            $FeeGrowthGlobal0x128 = $null
        } else {
            $FeeGrowthGlobal0x128 = $JsonParameters.PSobject.Properties["fee_growth_global_0x128"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fee_growth_global_1x128"))) { #optional property not found
            $FeeGrowthGlobal1x128 = $null
        } else {
            $FeeGrowthGlobal1x128 = $JsonParameters.PSobject.Properties["fee_growth_global_1x128"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tvl_usd"))) { #optional property not found
            $TvlUsd = $null
        } else {
            $TvlUsd = $JsonParameters.PSobject.Properties["tvl_usd"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "volume_token_0"))) { #optional property not found
            $VolumeToken0 = $null
        } else {
            $VolumeToken0 = $JsonParameters.PSobject.Properties["volume_token_0"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "volume_token_1"))) { #optional property not found
            $VolumeToken1 = $null
        } else {
            $VolumeToken1 = $JsonParameters.PSobject.Properties["volume_token_1"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "volume_usd"))) { #optional property not found
            $VolumeUsd = $null
        } else {
            $VolumeUsd = $JsonParameters.PSobject.Properties["volume_usd"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fees_usd"))) { #optional property not found
            $FeesUsd = $null
        } else {
            $FeesUsd = $JsonParameters.PSobject.Properties["fees_usd"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tx_count"))) { #optional property not found
            $TxCount = $null
        } else {
            $TxCount = $JsonParameters.PSobject.Properties["tx_count"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "open"))) { #optional property not found
            $Open = $null
        } else {
            $Open = $JsonParameters.PSobject.Properties["open"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "high"))) { #optional property not found
            $High = $null
        } else {
            $High = $JsonParameters.PSobject.Properties["high"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "low"))) { #optional property not found
            $Low = $null
        } else {
            $Low = $JsonParameters.PSobject.Properties["low"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "close"))) { #optional property not found
            $Close = $null
        } else {
            $Close = $JsonParameters.PSobject.Properties["close"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "vid"))) { #optional property not found
            $Vid = $null
        } else {
            $Vid = $JsonParameters.PSobject.Properties["vid"].value
        }

        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "period_start_unix" = ${PeriodStartUnix}
            "pool" = ${Pool}
            "liquidity" = ${Liquidity}
            "sqrt_price" = ${SqrtPrice}
            "token_0_price" = ${Token0Price}
            "token_1_price" = ${Token1Price}
            "tick" = ${Tick}
            "fee_growth_global_0x128" = ${FeeGrowthGlobal0x128}
            "fee_growth_global_1x128" = ${FeeGrowthGlobal1x128}
            "tvl_usd" = ${TvlUsd}
            "volume_token_0" = ${VolumeToken0}
            "volume_token_1" = ${VolumeToken1}
            "volume_usd" = ${VolumeUsd}
            "fees_usd" = ${FeesUsd}
            "tx_count" = ${TxCount}
            "open" = ${Open}
            "high" = ${High}
            "low" = ${Low}
            "close" = ${Close}
            "vid" = ${Vid}
        }

        return $PSO
    }

}

