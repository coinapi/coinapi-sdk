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
Identifier, format: <pair id>-<hour start timestamp>.
.PARAMETER Date
Hour start timestamp.
.PARAMETER Pair
Reference to pair.
.PARAMETER Reserve0
Reserve of token0 (updated during each transaction on pair).
.PARAMETER Reserve1
Reserve of token1 (updated during each transaction on pair).
.PARAMETER ReserveUsd
Reserve of token0 plus token1 stored as a derived USD amount.
.PARAMETER VolumeToken0
Total amount of token0 swapped throughout hour.
.PARAMETER VolumeToken1
Total amount of token1 swapped throughout hour.
.PARAMETER VolumeUsd
Total volume within pair throughout hour.
.PARAMETER TxCount
Amount of transactions on pair throughout hour.
.PARAMETER Vid

.OUTPUTS

SushiswapPairHourDataDTO<PSCustomObject>
#>

function Initialize-SushiswapPairHourDataDTO {
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
        ${Pair},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Reserve0},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Reserve1},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ReserveUsd},
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
        ${TxCount},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${Vid}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => SushiswapPairHourDataDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "date" = ${Date}
            "pair" = ${Pair}
            "reserve_0" = ${Reserve0}
            "reserve_1" = ${Reserve1}
            "reserve_usd" = ${ReserveUsd}
            "volume_token_0" = ${VolumeToken0}
            "volume_token_1" = ${VolumeToken1}
            "volume_usd" = ${VolumeUsd}
            "tx_count" = ${TxCount}
            "vid" = ${Vid}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to SushiswapPairHourDataDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to SushiswapPairHourDataDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

SushiswapPairHourDataDTO<PSCustomObject>
#>
function ConvertFrom-JsonToSushiswapPairHourDataDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => SushiswapPairHourDataDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in SushiswapPairHourDataDTO
        $AllProperties = ("entry_time", "recv_time", "block_number", "id", "date", "pair", "reserve_0", "reserve_1", "reserve_usd", "volume_token_0", "volume_token_1", "volume_usd", "tx_count", "vid")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "reserve_usd"))) { #optional property not found
            $ReserveUsd = $null
        } else {
            $ReserveUsd = $JsonParameters.PSobject.Properties["reserve_usd"].value
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tx_count"))) { #optional property not found
            $TxCount = $null
        } else {
            $TxCount = $JsonParameters.PSobject.Properties["tx_count"].value
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
            "pair" = ${Pair}
            "reserve_0" = ${Reserve0}
            "reserve_1" = ${Reserve1}
            "reserve_usd" = ${ReserveUsd}
            "volume_token_0" = ${VolumeToken0}
            "volume_token_1" = ${VolumeToken1}
            "volume_usd" = ${VolumeUsd}
            "tx_count" = ${TxCount}
            "vid" = ${Vid}
        }

        return $PSO
    }

}

