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

Mint entities are created for every emitted Mint event on the Uniswap core contracts. The Mint entity stores key data about the event like token amounts, who sent the transaction, and more.

.PARAMETER EntryTime
No description available.
.PARAMETER RecvTime
No description available.
.PARAMETER BlockNumber
Number of block in which entity was recorded.
.PARAMETER Id
Transaction hash + '#' + index in mints Transaction array.
.PARAMETER Transaction
Which txn the mint was included in.
.PARAMETER Timestamp
Time of transaction.
.PARAMETER Pool
Pool address.
.PARAMETER Token0
Reference to token0 as stored in pool contract.
.PARAMETER Token1
Reference to token1 as stored in pool contract.
.PARAMETER Owner
Owner of position where liquidity minted to.
.PARAMETER VarSender
The address that minted the liquidity.
.PARAMETER Origin
Transaction origin: the EOA (Externally Owned Account) that initiated the transaction.
.PARAMETER Amount
Amount of liquidity minted.
.PARAMETER Amount0
Amount of token 0 minted.
.PARAMETER Amount1
Amount of token 1 minted.
.PARAMETER AmountUsd
Derived amount based on available prices of tokens.
.PARAMETER TickLower
Lower tick of the position.
.PARAMETER TickUpper
Upper tick of the position.
.PARAMETER LogIndex
Order within the transaction.
.PARAMETER Vid

.OUTPUTS

UniswapV3MintDTO<PSCustomObject>
#>

function Initialize-UniswapV3MintDTO {
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
        ${Pool},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Token0},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Token1},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Owner},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${VarSender},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Origin},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Amount},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Amount0},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Amount1},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${AmountUsd},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TickLower},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TickUpper},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${LogIndex},
        [Parameter(Position = 19, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${Vid}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => UniswapV3MintDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "transaction" = ${Transaction}
            "timestamp" = ${Timestamp}
            "pool" = ${Pool}
            "token_0" = ${Token0}
            "token_1" = ${Token1}
            "owner" = ${Owner}
            "sender" = ${VarSender}
            "origin" = ${Origin}
            "amount" = ${Amount}
            "amount_0" = ${Amount0}
            "amount_1" = ${Amount1}
            "amount_usd" = ${AmountUsd}
            "tick_lower" = ${TickLower}
            "tick_upper" = ${TickUpper}
            "log_index" = ${LogIndex}
            "vid" = ${Vid}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to UniswapV3MintDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to UniswapV3MintDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

UniswapV3MintDTO<PSCustomObject>
#>
function ConvertFrom-JsonToUniswapV3MintDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => UniswapV3MintDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in UniswapV3MintDTO
        $AllProperties = ("entry_time", "recv_time", "block_number", "id", "transaction", "timestamp", "pool", "token_0", "token_1", "owner", "sender", "origin", "amount", "amount_0", "amount_1", "amount_usd", "tick_lower", "tick_upper", "log_index", "vid")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "pool"))) { #optional property not found
            $Pool = $null
        } else {
            $Pool = $JsonParameters.PSobject.Properties["pool"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "token_0"))) { #optional property not found
            $Token0 = $null
        } else {
            $Token0 = $JsonParameters.PSobject.Properties["token_0"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "token_1"))) { #optional property not found
            $Token1 = $null
        } else {
            $Token1 = $JsonParameters.PSobject.Properties["token_1"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "owner"))) { #optional property not found
            $Owner = $null
        } else {
            $Owner = $JsonParameters.PSobject.Properties["owner"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "sender"))) { #optional property not found
            $VarSender = $null
        } else {
            $VarSender = $JsonParameters.PSobject.Properties["sender"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "origin"))) { #optional property not found
            $Origin = $null
        } else {
            $Origin = $JsonParameters.PSobject.Properties["origin"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "amount"))) { #optional property not found
            $Amount = $null
        } else {
            $Amount = $JsonParameters.PSobject.Properties["amount"].value
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "amount_usd"))) { #optional property not found
            $AmountUsd = $null
        } else {
            $AmountUsd = $JsonParameters.PSobject.Properties["amount_usd"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tick_lower"))) { #optional property not found
            $TickLower = $null
        } else {
            $TickLower = $JsonParameters.PSobject.Properties["tick_lower"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tick_upper"))) { #optional property not found
            $TickUpper = $null
        } else {
            $TickUpper = $JsonParameters.PSobject.Properties["tick_upper"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "log_index"))) { #optional property not found
            $LogIndex = $null
        } else {
            $LogIndex = $JsonParameters.PSobject.Properties["log_index"].value
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
            "pool" = ${Pool}
            "token_0" = ${Token0}
            "token_1" = ${Token1}
            "owner" = ${Owner}
            "sender" = ${VarSender}
            "origin" = ${Origin}
            "amount" = ${Amount}
            "amount_0" = ${Amount0}
            "amount_1" = ${Amount1}
            "amount_usd" = ${AmountUsd}
            "tick_lower" = ${TickLower}
            "tick_upper" = ${TickUpper}
            "log_index" = ${LogIndex}
            "vid" = ${Vid}
        }

        return $PSO
    }

}

