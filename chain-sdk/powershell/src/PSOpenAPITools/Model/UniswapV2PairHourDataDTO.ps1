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

Tracks pair data across each hour.

.PARAMETER EntryTime
No description available.
.PARAMETER RecvTime
No description available.
.PARAMETER BlockNumber
Number of block in which entity was recorded.
.PARAMETER Id

.PARAMETER HourStartUnix
Unix timestamp for start of hour.
.PARAMETER Pair
Address for pair contract.
.PARAMETER Reserve0
Reserve of token0 (updated during each transaction on pair).
.PARAMETER Reserve1
Reserve of token1 (updated during each transaction on pair).
.PARAMETER TotalSupply
Total supply of liquidity token distributed to LPs.
.PARAMETER ReserveUsd
Reserve of token0 plus token1 stored as a derived USD amount.
.PARAMETER HourlyVolumeToken0
Total amount of token0 swapped throughout hour.
.PARAMETER HourlyVolumeToken1
Total amount of token1 swapped throughout hour.
.PARAMETER HourlyVolumeUsd
Total volume within pair throughout hour.
.PARAMETER HourlyTxns
Amount of transactions on pair throughout hour.
.PARAMETER Vid

.OUTPUTS

UniswapV2PairHourDataDTO<PSCustomObject>
#>

function Initialize-UniswapV2PairHourDataDTO {
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
        ${HourStartUnix},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Pair},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Reserve0},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Reserve1},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TotalSupply},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ReserveUsd},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${HourlyVolumeToken0},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${HourlyVolumeToken1},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${HourlyVolumeUsd},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${HourlyTxns},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${Vid}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => UniswapV2PairHourDataDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "hour_start_unix" = ${HourStartUnix}
            "pair" = ${Pair}
            "reserve_0" = ${Reserve0}
            "reserve_1" = ${Reserve1}
            "total_supply" = ${TotalSupply}
            "reserve_usd" = ${ReserveUsd}
            "hourly_volume_token_0" = ${HourlyVolumeToken0}
            "hourly_volume_token_1" = ${HourlyVolumeToken1}
            "hourly_volume_usd" = ${HourlyVolumeUsd}
            "hourly_txns" = ${HourlyTxns}
            "vid" = ${Vid}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to UniswapV2PairHourDataDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to UniswapV2PairHourDataDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

UniswapV2PairHourDataDTO<PSCustomObject>
#>
function ConvertFrom-JsonToUniswapV2PairHourDataDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => UniswapV2PairHourDataDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in UniswapV2PairHourDataDTO
        $AllProperties = ("entry_time", "recv_time", "block_number", "id", "hour_start_unix", "pair", "reserve_0", "reserve_1", "total_supply", "reserve_usd", "hourly_volume_token_0", "hourly_volume_token_1", "hourly_volume_usd", "hourly_txns", "vid")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "hour_start_unix"))) { #optional property not found
            $HourStartUnix = $null
        } else {
            $HourStartUnix = $JsonParameters.PSobject.Properties["hour_start_unix"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "pair"))) { #optional property not found
            $Pair = $null
        } else {
            $Pair = $JsonParameters.PSobject.Properties["pair"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "reserve_0"))) { #optional property not found
            $Reserve0 = $null
        } else {
            $Reserve0 = $JsonParameters.PSobject.Properties["reserve_0"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "reserve_1"))) { #optional property not found
            $Reserve1 = $null
        } else {
            $Reserve1 = $JsonParameters.PSobject.Properties["reserve_1"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "total_supply"))) { #optional property not found
            $TotalSupply = $null
        } else {
            $TotalSupply = $JsonParameters.PSobject.Properties["total_supply"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "reserve_usd"))) { #optional property not found
            $ReserveUsd = $null
        } else {
            $ReserveUsd = $JsonParameters.PSobject.Properties["reserve_usd"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "hourly_volume_token_0"))) { #optional property not found
            $HourlyVolumeToken0 = $null
        } else {
            $HourlyVolumeToken0 = $JsonParameters.PSobject.Properties["hourly_volume_token_0"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "hourly_volume_token_1"))) { #optional property not found
            $HourlyVolumeToken1 = $null
        } else {
            $HourlyVolumeToken1 = $JsonParameters.PSobject.Properties["hourly_volume_token_1"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "hourly_volume_usd"))) { #optional property not found
            $HourlyVolumeUsd = $null
        } else {
            $HourlyVolumeUsd = $JsonParameters.PSobject.Properties["hourly_volume_usd"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "hourly_txns"))) { #optional property not found
            $HourlyTxns = $null
        } else {
            $HourlyTxns = $JsonParameters.PSobject.Properties["hourly_txns"].value
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
            "hour_start_unix" = ${HourStartUnix}
            "pair" = ${Pair}
            "reserve_0" = ${Reserve0}
            "reserve_1" = ${Reserve1}
            "total_supply" = ${TotalSupply}
            "reserve_usd" = ${ReserveUsd}
            "hourly_volume_token_0" = ${HourlyVolumeToken0}
            "hourly_volume_token_1" = ${HourlyVolumeToken1}
            "hourly_volume_usd" = ${HourlyVolumeUsd}
            "hourly_txns" = ${HourlyTxns}
            "vid" = ${Vid}
        }

        return $PSO
    }

}

