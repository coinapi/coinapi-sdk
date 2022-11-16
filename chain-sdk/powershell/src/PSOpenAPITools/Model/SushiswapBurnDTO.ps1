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

Burn entities are created for every emitted Burn event on the Uniswap core contracts. The Burn entity stores key data about the event like token amounts, who burned LP tokens, who received tokens, and more. This entity can be used to track liquidity removals on pairs.

.PARAMETER EntryTime
No description available.
.PARAMETER RecvTime
No description available.
.PARAMETER BlockNumber
Number of block in which entity was recorded.
.PARAMETER Id
Identifier, format: <transaction id>:<transaction.burns.length>.
.PARAMETER Transaction
Reference to the transaction Burn was included in.
.PARAMETER Timestamp
Timestamp of Burn, used to sort recent liquidity removals.
.PARAMETER Pair
Reference to pair.
.PARAMETER Liquidity
Amount of liquidity tokens burned.
.PARAMETER VarSender
Address that initiated the liquidity removal.
.PARAMETER Amount0
Amount of token0 removed.
.PARAMETER Amount1
Amount of token1 removed.
.PARAMETER To
Recipient of tokens.
.PARAMETER LogIndex
Index in the transaction event was emitted.
.PARAMETER AmountUsd
Derived amount based on available prices of tokens.
.PARAMETER Complete

.PARAMETER FeeTo
Address of fee recipient (if fee is on).
.PARAMETER FeeLiquidity
Amount of tokens sent to fee recipient (if fee is on).
.PARAMETER Vid

.OUTPUTS

SushiswapBurnDTO<PSCustomObject>
#>

function Initialize-SushiswapBurnDTO {
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
        ${Transaction},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Timestamp},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Pair},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Liquidity},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${VarSender},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Amount0},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Amount1},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${To},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${LogIndex},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${AmountUsd},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${Complete},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FeeTo},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FeeLiquidity},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${Vid}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => SushiswapBurnDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "transaction" = ${Transaction}
            "timestamp" = ${Timestamp}
            "pair" = ${Pair}
            "liquidity" = ${Liquidity}
            "sender" = ${VarSender}
            "amount_0" = ${Amount0}
            "amount_1" = ${Amount1}
            "to" = ${To}
            "log_index" = ${LogIndex}
            "amount_usd" = ${AmountUsd}
            "complete" = ${Complete}
            "fee_to" = ${FeeTo}
            "fee_liquidity" = ${FeeLiquidity}
            "vid" = ${Vid}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to SushiswapBurnDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to SushiswapBurnDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

SushiswapBurnDTO<PSCustomObject>
#>
function ConvertFrom-JsonToSushiswapBurnDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => SushiswapBurnDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in SushiswapBurnDTO
        $AllProperties = ("entry_time", "recv_time", "block_number", "id", "transaction", "timestamp", "pair", "liquidity", "sender", "amount_0", "amount_1", "to", "log_index", "amount_usd", "complete", "fee_to", "fee_liquidity", "vid")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "transaction"))) { #optional property not found
            $Transaction = $null
        } else {
            $Transaction = $JsonParameters.PSobject.Properties["transaction"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "timestamp"))) { #optional property not found
            $Timestamp = $null
        } else {
            $Timestamp = $JsonParameters.PSobject.Properties["timestamp"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "pair"))) { #optional property not found
            $Pair = $null
        } else {
            $Pair = $JsonParameters.PSobject.Properties["pair"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "liquidity"))) { #optional property not found
            $Liquidity = $null
        } else {
            $Liquidity = $JsonParameters.PSobject.Properties["liquidity"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "sender"))) { #optional property not found
            $VarSender = $null
        } else {
            $VarSender = $JsonParameters.PSobject.Properties["sender"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "amount_0"))) { #optional property not found
            $Amount0 = $null
        } else {
            $Amount0 = $JsonParameters.PSobject.Properties["amount_0"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "amount_1"))) { #optional property not found
            $Amount1 = $null
        } else {
            $Amount1 = $JsonParameters.PSobject.Properties["amount_1"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "to"))) { #optional property not found
            $To = $null
        } else {
            $To = $JsonParameters.PSobject.Properties["to"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "log_index"))) { #optional property not found
            $LogIndex = $null
        } else {
            $LogIndex = $JsonParameters.PSobject.Properties["log_index"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "amount_usd"))) { #optional property not found
            $AmountUsd = $null
        } else {
            $AmountUsd = $JsonParameters.PSobject.Properties["amount_usd"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "complete"))) { #optional property not found
            $Complete = $null
        } else {
            $Complete = $JsonParameters.PSobject.Properties["complete"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fee_to"))) { #optional property not found
            $FeeTo = $null
        } else {
            $FeeTo = $JsonParameters.PSobject.Properties["fee_to"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fee_liquidity"))) { #optional property not found
            $FeeLiquidity = $null
        } else {
            $FeeLiquidity = $JsonParameters.PSobject.Properties["fee_liquidity"].value
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
            "transaction" = ${Transaction}
            "timestamp" = ${Timestamp}
            "pair" = ${Pair}
            "liquidity" = ${Liquidity}
            "sender" = ${VarSender}
            "amount_0" = ${Amount0}
            "amount_1" = ${Amount1}
            "to" = ${To}
            "log_index" = ${LogIndex}
            "amount_usd" = ${AmountUsd}
            "complete" = ${Complete}
            "fee_to" = ${FeeTo}
            "fee_liquidity" = ${FeeLiquidity}
            "vid" = ${Vid}
        }

        return $PSO
    }

}

