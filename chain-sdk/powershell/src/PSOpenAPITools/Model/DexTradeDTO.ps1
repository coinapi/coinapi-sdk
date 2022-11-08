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

Trade for a single user, as part of a ring trade. It's part of the solution submitted by a solver for a given batch.

.PARAMETER EntryTime
No description available.
.PARAMETER RecvTime
No description available.
.PARAMETER BlockNumber
Number of block in which entity was recorded.
.PARAMETER Id

.PARAMETER Order

.PARAMETER Owner

.PARAMETER SellVolume

.PARAMETER BuyVolume

.PARAMETER TradeBatchId

.PARAMETER TradeEpoch
The date of the end of the batch.
.PARAMETER BuyToken

.PARAMETER SellToken

.PARAMETER CreateEpoch
The date where the transaction was mined.
.PARAMETER RevertEpoch

.PARAMETER TxHash

.PARAMETER TxLogIndex

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

DexTradeDTO<PSCustomObject>
#>

function Initialize-DexTradeDTO {
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
        ${Order},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Owner},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SellVolume},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${BuyVolume},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TradeBatchId},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TradeEpoch},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${BuyToken},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SellToken},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${CreateEpoch},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${RevertEpoch},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TxHash},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TxLogIndex},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${Vid},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${PoolId},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TransactionId},
        [Parameter(Position = 19, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${EvaluatedPrice},
        [Parameter(Position = 20, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${EvaluatedAmount},
        [Parameter(Position = 21, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${EvaluatedAggressor}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => DexTradeDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "order" = ${Order}
            "owner" = ${Owner}
            "sell_volume" = ${SellVolume}
            "buy_volume" = ${BuyVolume}
            "trade_batch_id" = ${TradeBatchId}
            "trade_epoch" = ${TradeEpoch}
            "buy_token" = ${BuyToken}
            "sell_token" = ${SellToken}
            "create_epoch" = ${CreateEpoch}
            "revert_epoch" = ${RevertEpoch}
            "tx_hash" = ${TxHash}
            "tx_log_index" = ${TxLogIndex}
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

Convert from JSON to DexTradeDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to DexTradeDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

DexTradeDTO<PSCustomObject>
#>
function ConvertFrom-JsonToDexTradeDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => DexTradeDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in DexTradeDTO
        $AllProperties = ("entry_time", "recv_time", "block_number", "id", "order", "owner", "sell_volume", "buy_volume", "trade_batch_id", "trade_epoch", "buy_token", "sell_token", "create_epoch", "revert_epoch", "tx_hash", "tx_log_index", "vid", "pool_id", "transaction_id", "evaluated_price", "evaluated_amount", "evaluated_aggressor")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "order"))) { #optional property not found
            $Order = $null
        } else {
            $Order = $JsonParameters.PSobject.Properties["order"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "owner"))) { #optional property not found
            $Owner = $null
        } else {
            $Owner = $JsonParameters.PSobject.Properties["owner"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "sell_volume"))) { #optional property not found
            $SellVolume = $null
        } else {
            $SellVolume = $JsonParameters.PSobject.Properties["sell_volume"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "buy_volume"))) { #optional property not found
            $BuyVolume = $null
        } else {
            $BuyVolume = $JsonParameters.PSobject.Properties["buy_volume"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "trade_batch_id"))) { #optional property not found
            $TradeBatchId = $null
        } else {
            $TradeBatchId = $JsonParameters.PSobject.Properties["trade_batch_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "trade_epoch"))) { #optional property not found
            $TradeEpoch = $null
        } else {
            $TradeEpoch = $JsonParameters.PSobject.Properties["trade_epoch"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "buy_token"))) { #optional property not found
            $BuyToken = $null
        } else {
            $BuyToken = $JsonParameters.PSobject.Properties["buy_token"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "sell_token"))) { #optional property not found
            $SellToken = $null
        } else {
            $SellToken = $JsonParameters.PSobject.Properties["sell_token"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "create_epoch"))) { #optional property not found
            $CreateEpoch = $null
        } else {
            $CreateEpoch = $JsonParameters.PSobject.Properties["create_epoch"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "revert_epoch"))) { #optional property not found
            $RevertEpoch = $null
        } else {
            $RevertEpoch = $JsonParameters.PSobject.Properties["revert_epoch"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tx_hash"))) { #optional property not found
            $TxHash = $null
        } else {
            $TxHash = $JsonParameters.PSobject.Properties["tx_hash"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tx_log_index"))) { #optional property not found
            $TxLogIndex = $null
        } else {
            $TxLogIndex = $JsonParameters.PSobject.Properties["tx_log_index"].value
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
            "order" = ${Order}
            "owner" = ${Owner}
            "sell_volume" = ${SellVolume}
            "buy_volume" = ${BuyVolume}
            "trade_batch_id" = ${TradeBatchId}
            "trade_epoch" = ${TradeEpoch}
            "buy_token" = ${BuyToken}
            "sell_token" = ${SellToken}
            "create_epoch" = ${CreateEpoch}
            "revert_epoch" = ${RevertEpoch}
            "tx_hash" = ${TxHash}
            "tx_log_index" = ${TxLogIndex}
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

