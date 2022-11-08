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

Trade entity.

.PARAMETER EntryTime
No description available.
.PARAMETER RecvTime
No description available.
.PARAMETER BlockNumber
Number of block in which entity was recorded.
.PARAMETER Id
Identifier, format: <order id>|<transaction hash>|<event index>.
.PARAMETER Timestamp
Block's timestamp.
.PARAMETER GasPrice
Transaction's gas price.
.PARAMETER GasLimit
Transaction's gas limit.
.PARAMETER FeeAmount
Trade's fee amount.
.PARAMETER TxHash
Trade event transaction hash.
.PARAMETER Settlement
Reference to settlement.
.PARAMETER BuyAmount
Buy amount.
.PARAMETER SellAmount
Sell amount.
.PARAMETER SellToken
Address of token that is sold.
.PARAMETER BuyToken
Address of token that is bought.
.PARAMETER Order
Reference to order.
.PARAMETER Vid

.PARAMETER PoolId
No description available.
.PARAMETER TransactionId
No description available.
.PARAMETER EvaluatedPrice
No description available.
.PARAMETER EvaluatedAmount
No description available.
.PARAMETER EvaluatedAggressor
No description available.
.OUTPUTS

CowTradeDTO<PSCustomObject>
#>

function Initialize-CowTradeDTO {
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
        ${Timestamp},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${GasPrice},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${GasLimit},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FeeAmount},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TxHash},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Settlement},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${BuyAmount},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SellAmount},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SellToken},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${BuyToken},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Order},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${Vid},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${PoolId},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TransactionId},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${EvaluatedPrice},
        [Parameter(Position = 19, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${EvaluatedAmount},
        [Parameter(Position = 20, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${EvaluatedAggressor}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CowTradeDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "timestamp" = ${Timestamp}
            "gas_price" = ${GasPrice}
            "gas_limit" = ${GasLimit}
            "fee_amount" = ${FeeAmount}
            "tx_hash" = ${TxHash}
            "settlement" = ${Settlement}
            "buy_amount" = ${BuyAmount}
            "sell_amount" = ${SellAmount}
            "sell_token" = ${SellToken}
            "buy_token" = ${BuyToken}
            "order" = ${Order}
            "vid" = ${Vid}
            "pool_id" = ${PoolId}
            "transaction_id" = ${TransactionId}
            "evaluated_price" = ${EvaluatedPrice}
            "evaluated_amount" = ${EvaluatedAmount}
            "evaluated_aggressor" = ${EvaluatedAggressor}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CowTradeDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to CowTradeDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CowTradeDTO<PSCustomObject>
#>
function ConvertFrom-JsonToCowTradeDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CowTradeDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CowTradeDTO
        $AllProperties = ("entry_time", "recv_time", "block_number", "id", "timestamp", "gas_price", "gas_limit", "fee_amount", "tx_hash", "settlement", "buy_amount", "sell_amount", "sell_token", "buy_token", "order", "vid", "pool_id", "transaction_id", "evaluated_price", "evaluated_amount", "evaluated_aggressor")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "timestamp"))) { #optional property not found
            $Timestamp = $null
        } else {
            $Timestamp = $JsonParameters.PSobject.Properties["timestamp"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "gas_price"))) { #optional property not found
            $GasPrice = $null
        } else {
            $GasPrice = $JsonParameters.PSobject.Properties["gas_price"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "gas_limit"))) { #optional property not found
            $GasLimit = $null
        } else {
            $GasLimit = $JsonParameters.PSobject.Properties["gas_limit"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fee_amount"))) { #optional property not found
            $FeeAmount = $null
        } else {
            $FeeAmount = $JsonParameters.PSobject.Properties["fee_amount"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tx_hash"))) { #optional property not found
            $TxHash = $null
        } else {
            $TxHash = $JsonParameters.PSobject.Properties["tx_hash"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "settlement"))) { #optional property not found
            $Settlement = $null
        } else {
            $Settlement = $JsonParameters.PSobject.Properties["settlement"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "buy_amount"))) { #optional property not found
            $BuyAmount = $null
        } else {
            $BuyAmount = $JsonParameters.PSobject.Properties["buy_amount"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "sell_amount"))) { #optional property not found
            $SellAmount = $null
        } else {
            $SellAmount = $JsonParameters.PSobject.Properties["sell_amount"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "sell_token"))) { #optional property not found
            $SellToken = $null
        } else {
            $SellToken = $JsonParameters.PSobject.Properties["sell_token"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "buy_token"))) { #optional property not found
            $BuyToken = $null
        } else {
            $BuyToken = $JsonParameters.PSobject.Properties["buy_token"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "order"))) { #optional property not found
            $Order = $null
        } else {
            $Order = $JsonParameters.PSobject.Properties["order"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "vid"))) { #optional property not found
            $Vid = $null
        } else {
            $Vid = $JsonParameters.PSobject.Properties["vid"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "pool_id"))) { #optional property not found
            $PoolId = $null
        } else {
            $PoolId = $JsonParameters.PSobject.Properties["pool_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "transaction_id"))) { #optional property not found
            $TransactionId = $null
        } else {
            $TransactionId = $JsonParameters.PSobject.Properties["transaction_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "evaluated_price"))) { #optional property not found
            $EvaluatedPrice = $null
        } else {
            $EvaluatedPrice = $JsonParameters.PSobject.Properties["evaluated_price"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "evaluated_amount"))) { #optional property not found
            $EvaluatedAmount = $null
        } else {
            $EvaluatedAmount = $JsonParameters.PSobject.Properties["evaluated_amount"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "evaluated_aggressor"))) { #optional property not found
            $EvaluatedAggressor = $null
        } else {
            $EvaluatedAggressor = $JsonParameters.PSobject.Properties["evaluated_aggressor"].value
        }

        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "timestamp" = ${Timestamp}
            "gas_price" = ${GasPrice}
            "gas_limit" = ${GasLimit}
            "fee_amount" = ${FeeAmount}
            "tx_hash" = ${TxHash}
            "settlement" = ${Settlement}
            "buy_amount" = ${BuyAmount}
            "sell_amount" = ${SellAmount}
            "sell_token" = ${SellToken}
            "buy_token" = ${BuyToken}
            "order" = ${Order}
            "vid" = ${Vid}
            "pool_id" = ${PoolId}
            "transaction_id" = ${TransactionId}
            "evaluated_price" = ${EvaluatedPrice}
            "evaluated_amount" = ${EvaluatedAmount}
            "evaluated_aggressor" = ${EvaluatedAggressor}
        }

        return $PSO
    }

}

