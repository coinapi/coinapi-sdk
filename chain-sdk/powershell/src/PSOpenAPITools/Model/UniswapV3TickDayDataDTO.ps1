#
# On Chain Dapps - REST API
#  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
# Version: v1
# Contact: support@coinapi.io
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

Data accumulated and condensed into day stats for each exchange. Entity gets saved only if there is a change during the day

.PARAMETER EntryTime
No description available.
.PARAMETER RecvTime
No description available.
.PARAMETER BlockNumber
Number of block in which entity was recorded.
.PARAMETER Id
Identifier, format: (pool address)-(tick index)-(timestamp).
.PARAMETER Date
Timestamp rounded to current day by dividing by 86400.
.PARAMETER Pool
Pointer to pool.
.PARAMETER Tick
Pointer to tick.
.PARAMETER LiquidityGross
Total liquidity pool has as tick lower or upper at end of period.
.PARAMETER LiquidityNet
How much liquidity changes when tick crossed at end of period.
.PARAMETER VolumeToken0
Hourly volume of token0 with this tick in range.
.PARAMETER VolumeToken1
Hourly volume of token1 with this tick in range.
.PARAMETER VolumeUsd
Hourly volume in derived USD with this tick in range.
.PARAMETER FeesUsd
Fees in USD.
.PARAMETER FeeGrowthOutside0x128
Variable needed for fee computation.
.PARAMETER FeeGrowthOutside1x128
Variable needed for fee computation.
.PARAMETER Vid

.OUTPUTS

UniswapV3TickDayDataDTO<PSCustomObject>
#>

function Initialize-UniswapV3TickDayDataDTO {
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
        ${Date},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Pool},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Tick},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${LiquidityGross},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${LiquidityNet},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${VolumeToken0},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${VolumeToken1},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${VolumeUsd},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FeesUsd},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FeeGrowthOutside0x128},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FeeGrowthOutside1x128},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${Vid}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => UniswapV3TickDayDataDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "date" = ${Date}
            "pool" = ${Pool}
            "tick" = ${Tick}
            "liquidity_gross" = ${LiquidityGross}
            "liquidity_net" = ${LiquidityNet}
            "volume_token_0" = ${VolumeToken0}
            "volume_token_1" = ${VolumeToken1}
            "volume_usd" = ${VolumeUsd}
            "fees_usd" = ${FeesUsd}
            "fee_growth_outside_0x128" = ${FeeGrowthOutside0x128}
            "fee_growth_outside_1x128" = ${FeeGrowthOutside1x128}
            "vid" = ${Vid}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to UniswapV3TickDayDataDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to UniswapV3TickDayDataDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

UniswapV3TickDayDataDTO<PSCustomObject>
#>
function ConvertFrom-JsonToUniswapV3TickDayDataDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => UniswapV3TickDayDataDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in UniswapV3TickDayDataDTO
        $AllProperties = ("entry_time", "recv_time", "block_number", "id", "date", "pool", "tick", "liquidity_gross", "liquidity_net", "volume_token_0", "volume_token_1", "volume_usd", "fees_usd", "fee_growth_outside_0x128", "fee_growth_outside_1x128", "vid")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "date"))) { #optional property not found
            $Date = $null
        } else {
            $Date = $JsonParameters.PSobject.Properties["date"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "pool"))) { #optional property not found
            $Pool = $null
        } else {
            $Pool = $JsonParameters.PSobject.Properties["pool"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tick"))) { #optional property not found
            $Tick = $null
        } else {
            $Tick = $JsonParameters.PSobject.Properties["tick"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "liquidity_gross"))) { #optional property not found
            $LiquidityGross = $null
        } else {
            $LiquidityGross = $JsonParameters.PSobject.Properties["liquidity_gross"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "liquidity_net"))) { #optional property not found
            $LiquidityNet = $null
        } else {
            $LiquidityNet = $JsonParameters.PSobject.Properties["liquidity_net"].value
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fee_growth_outside_0x128"))) { #optional property not found
            $FeeGrowthOutside0x128 = $null
        } else {
            $FeeGrowthOutside0x128 = $JsonParameters.PSobject.Properties["fee_growth_outside_0x128"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fee_growth_outside_1x128"))) { #optional property not found
            $FeeGrowthOutside1x128 = $null
        } else {
            $FeeGrowthOutside1x128 = $JsonParameters.PSobject.Properties["fee_growth_outside_1x128"].value
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
            "date" = ${Date}
            "pool" = ${Pool}
            "tick" = ${Tick}
            "liquidity_gross" = ${LiquidityGross}
            "liquidity_net" = ${LiquidityNet}
            "volume_token_0" = ${VolumeToken0}
            "volume_token_1" = ${VolumeToken1}
            "volume_usd" = ${VolumeUsd}
            "fees_usd" = ${FeesUsd}
            "fee_growth_outside_0x128" = ${FeeGrowthOutside0x128}
            "fee_growth_outside_1x128" = ${FeeGrowthOutside1x128}
            "vid" = ${Vid}
        }

        return $PSO
    }

}

