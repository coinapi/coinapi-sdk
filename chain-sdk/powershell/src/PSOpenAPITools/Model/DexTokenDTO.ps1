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

Registered token.

.PARAMETER EntryTime
No description available.
.PARAMETER RecvTime
No description available.
.PARAMETER BlockNumber
Number of block in which entity was recorded.
.PARAMETER Id

.PARAMETER Address

.PARAMETER FromBatchId

.PARAMETER Symbol

.PARAMETER Decimals

.PARAMETER Name

.PARAMETER SellVolume
Cumulative sell volume.
.PARAMETER CreateEpoch

.PARAMETER TxHash

.PARAMETER Vid

.PARAMETER TokenSymbol
No description available.
.OUTPUTS

DexTokenDTO<PSCustomObject>
#>

function Initialize-DexTokenDTO {
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
        [String]
        ${Address},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FromBatchId},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Symbol},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Decimals},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SellVolume},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${CreateEpoch},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TxHash},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${Vid},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TokenSymbol}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => DexTokenDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "address" = ${Address}
            "from_batch_id" = ${FromBatchId}
            "symbol" = ${Symbol}
            "decimals" = ${Decimals}
            "name" = ${Name}
            "sell_volume" = ${SellVolume}
            "create_epoch" = ${CreateEpoch}
            "tx_hash" = ${TxHash}
            "vid" = ${Vid}
            "token_symbol" = ${TokenSymbol}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to DexTokenDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to DexTokenDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

DexTokenDTO<PSCustomObject>
#>
function ConvertFrom-JsonToDexTokenDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => DexTokenDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in DexTokenDTO
        $AllProperties = ("entry_time", "recv_time", "block_number", "id", "address", "from_batch_id", "symbol", "decimals", "name", "sell_volume", "create_epoch", "tx_hash", "vid", "token_symbol")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "address"))) { #optional property not found
            $Address = $null
        } else {
            $Address = $JsonParameters.PSobject.Properties["address"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "from_batch_id"))) { #optional property not found
            $FromBatchId = $null
        } else {
            $FromBatchId = $JsonParameters.PSobject.Properties["from_batch_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "symbol"))) { #optional property not found
            $Symbol = $null
        } else {
            $Symbol = $JsonParameters.PSobject.Properties["symbol"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "decimals"))) { #optional property not found
            $Decimals = $null
        } else {
            $Decimals = $JsonParameters.PSobject.Properties["decimals"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) { #optional property not found
            $Name = $null
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "sell_volume"))) { #optional property not found
            $SellVolume = $null
        } else {
            $SellVolume = $JsonParameters.PSobject.Properties["sell_volume"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "create_epoch"))) { #optional property not found
            $CreateEpoch = $null
        } else {
            $CreateEpoch = $JsonParameters.PSobject.Properties["create_epoch"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tx_hash"))) { #optional property not found
            $TxHash = $null
        } else {
            $TxHash = $JsonParameters.PSobject.Properties["tx_hash"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "vid"))) { #optional property not found
            $Vid = $null
        } else {
            $Vid = $JsonParameters.PSobject.Properties["vid"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "token_symbol"))) { #optional property not found
            $TokenSymbol = $null
        } else {
            $TokenSymbol = $JsonParameters.PSobject.Properties["token_symbol"].value
        }

        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "address" = ${Address}
            "from_batch_id" = ${FromBatchId}
            "symbol" = ${Symbol}
            "decimals" = ${Decimals}
            "name" = ${Name}
            "sell_volume" = ${SellVolume}
            "create_epoch" = ${CreateEpoch}
            "tx_hash" = ${TxHash}
            "vid" = ${Vid}
            "token_symbol" = ${TokenSymbol}
        }

        return $PSO
    }

}

