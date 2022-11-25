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

No description available.

.PARAMETER EntryTime
No description available.
.PARAMETER RecvTime
No description available.
.PARAMETER BlockNumber
Number of block in which entity was recorded.
.PARAMETER Id

.PARAMETER Pool

.PARAMETER Buyer

.PARAMETER Receiver

.PARAMETER TokenSold

.PARAMETER TokenBought

.PARAMETER AmountSold

.PARAMETER AmountBought

.PARAMETER Block

.PARAMETER Timestamp

.PARAMETER Transaction

.PARAMETER Vid

.PARAMETER EvaluatedPrice
No description available.
.PARAMETER EvaluatedAmount
No description available.
.PARAMETER EvaluatedAggressor
No description available.
.PARAMETER PoolId
No description available.
.PARAMETER TransactionId
No description available.
.OUTPUTS

CurveExchangeDTO<PSCustomObject>
#>

function Initialize-CurveExchangeDTO {
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
        ${Pool},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Buyer},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Receiver},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TokenSold},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TokenBought},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${AmountSold},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${AmountBought},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Block},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Timestamp},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Transaction},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${Vid},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${EvaluatedPrice},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${EvaluatedAmount},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${EvaluatedAggressor},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${PoolId},
        [Parameter(Position = 19, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TransactionId}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CurveExchangeDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "pool" = ${Pool}
            "buyer" = ${Buyer}
            "receiver" = ${Receiver}
            "token_sold" = ${TokenSold}
            "token_bought" = ${TokenBought}
            "amount_sold" = ${AmountSold}
            "amount_bought" = ${AmountBought}
            "block" = ${Block}
            "timestamp" = ${Timestamp}
            "transaction" = ${Transaction}
            "vid" = ${Vid}
            "evaluated_price" = ${EvaluatedPrice}
            "evaluated_amount" = ${EvaluatedAmount}
            "evaluated_aggressor" = ${EvaluatedAggressor}
            "pool_id" = ${PoolId}
            "transaction_id" = ${TransactionId}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CurveExchangeDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to CurveExchangeDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CurveExchangeDTO<PSCustomObject>
#>
function ConvertFrom-JsonToCurveExchangeDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CurveExchangeDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CurveExchangeDTO
        $AllProperties = ("entry_time", "recv_time", "block_number", "id", "pool", "buyer", "receiver", "token_sold", "token_bought", "amount_sold", "amount_bought", "block", "timestamp", "transaction", "vid", "evaluated_price", "evaluated_amount", "evaluated_aggressor", "pool_id", "transaction_id")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "pool"))) { #optional property not found
            $Pool = $null
        } else {
            $Pool = $JsonParameters.PSobject.Properties["pool"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "buyer"))) { #optional property not found
            $Buyer = $null
        } else {
            $Buyer = $JsonParameters.PSobject.Properties["buyer"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "receiver"))) { #optional property not found
            $Receiver = $null
        } else {
            $Receiver = $JsonParameters.PSobject.Properties["receiver"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "token_sold"))) { #optional property not found
            $TokenSold = $null
        } else {
            $TokenSold = $JsonParameters.PSobject.Properties["token_sold"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "token_bought"))) { #optional property not found
            $TokenBought = $null
        } else {
            $TokenBought = $JsonParameters.PSobject.Properties["token_bought"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "amount_sold"))) { #optional property not found
            $AmountSold = $null
        } else {
            $AmountSold = $JsonParameters.PSobject.Properties["amount_sold"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "amount_bought"))) { #optional property not found
            $AmountBought = $null
        } else {
            $AmountBought = $JsonParameters.PSobject.Properties["amount_bought"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "block"))) { #optional property not found
            $Block = $null
        } else {
            $Block = $JsonParameters.PSobject.Properties["block"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "timestamp"))) { #optional property not found
            $Timestamp = $null
        } else {
            $Timestamp = $JsonParameters.PSobject.Properties["timestamp"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "transaction"))) { #optional property not found
            $Transaction = $null
        } else {
            $Transaction = $JsonParameters.PSobject.Properties["transaction"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "vid"))) { #optional property not found
            $Vid = $null
        } else {
            $Vid = $JsonParameters.PSobject.Properties["vid"].value
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

        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "pool" = ${Pool}
            "buyer" = ${Buyer}
            "receiver" = ${Receiver}
            "token_sold" = ${TokenSold}
            "token_bought" = ${TokenBought}
            "amount_sold" = ${AmountSold}
            "amount_bought" = ${AmountBought}
            "block" = ${Block}
            "timestamp" = ${Timestamp}
            "transaction" = ${Transaction}
            "vid" = ${Vid}
            "evaluated_price" = ${EvaluatedPrice}
            "evaluated_amount" = ${EvaluatedAmount}
            "evaluated_aggressor" = ${EvaluatedAggressor}
            "pool_id" = ${PoolId}
            "transaction_id" = ${TransactionId}
        }

        return $PSO
    }

}

