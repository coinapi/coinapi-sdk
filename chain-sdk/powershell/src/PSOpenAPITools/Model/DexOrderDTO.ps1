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

Order submitted by an user. It has a validity (dates) so they can only be executed from/until some given batches. Partial executions of this trades must respect the limit price.

.PARAMETER EntryTime
No description available.
.PARAMETER RecvTime
No description available.
.PARAMETER BlockNumber
Number of block in which entity was recorded.
.PARAMETER Id
Identifier, format: (owner address)-(order id)
.PARAMETER Owner
Reference to owner.
.PARAMETER OrderId
Order id.
.PARAMETER FromBatchId
Batch id from which order became valid.
.PARAMETER FromEpoch
Start of epoch in which order was placed and became valid.
.PARAMETER UntilBatchId
Batch id until which trade was still valid.
.PARAMETER UntilEpoch
End of epoch in which order was placed.
.PARAMETER BuyToken
Identifier of token that was bought.
.PARAMETER SellToken
Identifier of token that was sold.
.PARAMETER PriceNumerator
Price enumerator.
.PARAMETER PriceDenominator
Price denominator.
.PARAMETER MaxSellAmount
Maximum sell amount.
.PARAMETER MinReceiveAmount
Minimum receive amount.
.PARAMETER SoldVolume
Sold volume.
.PARAMETER BoughtVolume
Bought volume.
.PARAMETER CreateEpoch
Epoch in which order was created.
.PARAMETER CancelEpoch
Epoch in which order was cancelled.
.PARAMETER DeleteEpoch
Epoch in which order was deleted.
.PARAMETER TxHash
Transaction hash.
.PARAMETER TxLogIndex
Event index within transaction.
.PARAMETER Vid

.OUTPUTS

DexOrderDTO<PSCustomObject>
#>

function Initialize-DexOrderDTO {
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
        ${Owner},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${OrderId},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FromBatchId},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FromEpoch},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${UntilBatchId},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${UntilEpoch},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${BuyToken},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SellToken},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${PriceNumerator},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${PriceDenominator},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${MaxSellAmount},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${MinReceiveAmount},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SoldVolume},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${BoughtVolume},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${CreateEpoch},
        [Parameter(Position = 19, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${CancelEpoch},
        [Parameter(Position = 20, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${DeleteEpoch},
        [Parameter(Position = 21, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TxHash},
        [Parameter(Position = 22, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TxLogIndex},
        [Parameter(Position = 23, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${Vid}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => DexOrderDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "owner" = ${Owner}
            "order_id" = ${OrderId}
            "from_batch_id" = ${FromBatchId}
            "from_epoch" = ${FromEpoch}
            "until_batch_id" = ${UntilBatchId}
            "until_epoch" = ${UntilEpoch}
            "buy_token" = ${BuyToken}
            "sell_token" = ${SellToken}
            "price_numerator" = ${PriceNumerator}
            "price_denominator" = ${PriceDenominator}
            "max_sell_amount" = ${MaxSellAmount}
            "min_receive_amount" = ${MinReceiveAmount}
            "sold_volume" = ${SoldVolume}
            "bought_volume" = ${BoughtVolume}
            "create_epoch" = ${CreateEpoch}
            "cancel_epoch" = ${CancelEpoch}
            "delete_epoch" = ${DeleteEpoch}
            "tx_hash" = ${TxHash}
            "tx_log_index" = ${TxLogIndex}
            "vid" = ${Vid}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to DexOrderDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to DexOrderDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

DexOrderDTO<PSCustomObject>
#>
function ConvertFrom-JsonToDexOrderDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => DexOrderDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in DexOrderDTO
        $AllProperties = ("entry_time", "recv_time", "block_number", "id", "owner", "order_id", "from_batch_id", "from_epoch", "until_batch_id", "until_epoch", "buy_token", "sell_token", "price_numerator", "price_denominator", "max_sell_amount", "min_receive_amount", "sold_volume", "bought_volume", "create_epoch", "cancel_epoch", "delete_epoch", "tx_hash", "tx_log_index", "vid")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "owner"))) { #optional property not found
            $Owner = $null
        } else {
            $Owner = $JsonParameters.PSobject.Properties["owner"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "order_id"))) { #optional property not found
            $OrderId = $null
        } else {
            $OrderId = $JsonParameters.PSobject.Properties["order_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "from_batch_id"))) { #optional property not found
            $FromBatchId = $null
        } else {
            $FromBatchId = $JsonParameters.PSobject.Properties["from_batch_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "from_epoch"))) { #optional property not found
            $FromEpoch = $null
        } else {
            $FromEpoch = $JsonParameters.PSobject.Properties["from_epoch"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "until_batch_id"))) { #optional property not found
            $UntilBatchId = $null
        } else {
            $UntilBatchId = $JsonParameters.PSobject.Properties["until_batch_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "until_epoch"))) { #optional property not found
            $UntilEpoch = $null
        } else {
            $UntilEpoch = $JsonParameters.PSobject.Properties["until_epoch"].value
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "price_numerator"))) { #optional property not found
            $PriceNumerator = $null
        } else {
            $PriceNumerator = $JsonParameters.PSobject.Properties["price_numerator"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "price_denominator"))) { #optional property not found
            $PriceDenominator = $null
        } else {
            $PriceDenominator = $JsonParameters.PSobject.Properties["price_denominator"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "max_sell_amount"))) { #optional property not found
            $MaxSellAmount = $null
        } else {
            $MaxSellAmount = $JsonParameters.PSobject.Properties["max_sell_amount"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "min_receive_amount"))) { #optional property not found
            $MinReceiveAmount = $null
        } else {
            $MinReceiveAmount = $JsonParameters.PSobject.Properties["min_receive_amount"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "sold_volume"))) { #optional property not found
            $SoldVolume = $null
        } else {
            $SoldVolume = $JsonParameters.PSobject.Properties["sold_volume"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "bought_volume"))) { #optional property not found
            $BoughtVolume = $null
        } else {
            $BoughtVolume = $JsonParameters.PSobject.Properties["bought_volume"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "create_epoch"))) { #optional property not found
            $CreateEpoch = $null
        } else {
            $CreateEpoch = $JsonParameters.PSobject.Properties["create_epoch"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "cancel_epoch"))) { #optional property not found
            $CancelEpoch = $null
        } else {
            $CancelEpoch = $JsonParameters.PSobject.Properties["cancel_epoch"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "delete_epoch"))) { #optional property not found
            $DeleteEpoch = $null
        } else {
            $DeleteEpoch = $JsonParameters.PSobject.Properties["delete_epoch"].value
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

        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "owner" = ${Owner}
            "order_id" = ${OrderId}
            "from_batch_id" = ${FromBatchId}
            "from_epoch" = ${FromEpoch}
            "until_batch_id" = ${UntilBatchId}
            "until_epoch" = ${UntilEpoch}
            "buy_token" = ${BuyToken}
            "sell_token" = ${SellToken}
            "price_numerator" = ${PriceNumerator}
            "price_denominator" = ${PriceDenominator}
            "max_sell_amount" = ${MaxSellAmount}
            "min_receive_amount" = ${MinReceiveAmount}
            "sold_volume" = ${SoldVolume}
            "bought_volume" = ${BoughtVolume}
            "create_epoch" = ${CreateEpoch}
            "cancel_epoch" = ${CancelEpoch}
            "delete_epoch" = ${DeleteEpoch}
            "tx_hash" = ${TxHash}
            "tx_log_index" = ${TxLogIndex}
            "vid" = ${Vid}
        }

        return $PSO
    }

}

