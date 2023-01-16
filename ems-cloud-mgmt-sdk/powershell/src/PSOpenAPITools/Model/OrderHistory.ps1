#
# EMS - REST API
# This section will provide necessary information about the `CoinAPI EMS REST API` protocol. This API is also available in the Postman application: <a href=""https://postman.coinapi.io/"" target=""_blank"">https://postman.coinapi.io/</a>        Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints  <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=""#ems-docs-sh"">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=""#certificate"">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=""success"">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this: `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=""notice"">Query string method may be more practical for development activities.</aside> 
# Version: v1
# Contact: support@coinapi.io
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER Apikey
Apikey
.PARAMETER ExchangeId
Exchange id
.PARAMETER ClientOrderId
Client order id
.PARAMETER SymbolIdExchange
Symbol id exchange
.PARAMETER SymbolIdCoinapi
Symbol id in coinapi
.PARAMETER AmountOrder
Amount
.PARAMETER Price
Price
.PARAMETER Side
1-buy, 2-sell
.PARAMETER OrderType
Order type
.PARAMETER TimeInForce
Time in force
.PARAMETER ExpireTime
Expire time
.PARAMETER ExecInst
Exec inst
.PARAMETER ClientOrderIdFormatExchange
Client order id format
.PARAMETER ExchangeOrderId
Exchange order id
.PARAMETER AmountOpen
Amount open
.PARAMETER AmountFilled
Amount filled
.PARAMETER AvgPx
Average price
.PARAMETER Status
Status
.PARAMETER StatusHistoryStatus
History status
.PARAMETER StatusHistoryTime
History status time
.PARAMETER ErrorMessageResult
Error message
.PARAMETER ErrorMessageReason
Error message reason
.PARAMETER ErrorMessageMessage
Error message
.PARAMETER FillsTime
Fills time
.PARAMETER FillsPrice
Fills price
.PARAMETER FillsAmount
Fills amount
.PARAMETER CreatedTime
Created time
.OUTPUTS

OrderHistory<PSCustomObject>
#>

function Initialize-OrderHistory {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Apikey},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ExchangeId},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ClientOrderId},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SymbolIdExchange},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SymbolIdCoinapi},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${AmountOrder},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${Price},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${Side},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${OrderType},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TimeInForce},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${ExpireTime},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${ExecInst},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ClientOrderIdFormatExchange},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ExchangeOrderId},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${AmountOpen},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${AmountFilled},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${AvgPx},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Status},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${StatusHistoryStatus},
        [Parameter(Position = 19, ValueFromPipelineByPropertyName = $true)]
        [System.DateTime[]]
        ${StatusHistoryTime},
        [Parameter(Position = 20, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ErrorMessageResult},
        [Parameter(Position = 21, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ErrorMessageReason},
        [Parameter(Position = 22, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ErrorMessageMessage},
        [Parameter(Position = 23, ValueFromPipelineByPropertyName = $true)]
        [System.DateTime[]]
        ${FillsTime},
        [Parameter(Position = 24, ValueFromPipelineByPropertyName = $true)]
        [Decimal[]]
        ${FillsPrice},
        [Parameter(Position = 25, ValueFromPipelineByPropertyName = $true)]
        [Decimal[]]
        ${FillsAmount},
        [Parameter(Position = 26, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${CreatedTime}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => OrderHistory' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "apikey" = ${Apikey}
            "exchangeId" = ${ExchangeId}
            "clientOrderId" = ${ClientOrderId}
            "symbolIdExchange" = ${SymbolIdExchange}
            "symbolIdCoinapi" = ${SymbolIdCoinapi}
            "amountOrder" = ${AmountOrder}
            "price" = ${Price}
            "side" = ${Side}
            "orderType" = ${OrderType}
            "timeInForce" = ${TimeInForce}
            "expireTime" = ${ExpireTime}
            "execInst" = ${ExecInst}
            "clientOrderIdFormatExchange" = ${ClientOrderIdFormatExchange}
            "exchangeOrderId" = ${ExchangeOrderId}
            "amountOpen" = ${AmountOpen}
            "amountFilled" = ${AmountFilled}
            "avgPx" = ${AvgPx}
            "status" = ${Status}
            "statusHistoryStatus" = ${StatusHistoryStatus}
            "statusHistoryTime" = ${StatusHistoryTime}
            "errorMessageResult" = ${ErrorMessageResult}
            "errorMessageReason" = ${ErrorMessageReason}
            "errorMessageMessage" = ${ErrorMessageMessage}
            "fillsTime" = ${FillsTime}
            "fillsPrice" = ${FillsPrice}
            "fillsAmount" = ${FillsAmount}
            "createdTime" = ${CreatedTime}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to OrderHistory<PSCustomObject>

.DESCRIPTION

Convert from JSON to OrderHistory<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

OrderHistory<PSCustomObject>
#>
function ConvertFrom-JsonToOrderHistory {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => OrderHistory' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in OrderHistory
        $AllProperties = ("apikey", "exchangeId", "clientOrderId", "symbolIdExchange", "symbolIdCoinapi", "amountOrder", "price", "side", "orderType", "timeInForce", "expireTime", "execInst", "clientOrderIdFormatExchange", "exchangeOrderId", "amountOpen", "amountFilled", "avgPx", "status", "statusHistoryStatus", "statusHistoryTime", "errorMessageResult", "errorMessageReason", "errorMessageMessage", "fillsTime", "fillsPrice", "fillsAmount", "createdTime")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "apikey"))) { #optional property not found
            $Apikey = $null
        } else {
            $Apikey = $JsonParameters.PSobject.Properties["apikey"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "exchangeId"))) { #optional property not found
            $ExchangeId = $null
        } else {
            $ExchangeId = $JsonParameters.PSobject.Properties["exchangeId"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "clientOrderId"))) { #optional property not found
            $ClientOrderId = $null
        } else {
            $ClientOrderId = $JsonParameters.PSobject.Properties["clientOrderId"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "symbolIdExchange"))) { #optional property not found
            $SymbolIdExchange = $null
        } else {
            $SymbolIdExchange = $JsonParameters.PSobject.Properties["symbolIdExchange"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "symbolIdCoinapi"))) { #optional property not found
            $SymbolIdCoinapi = $null
        } else {
            $SymbolIdCoinapi = $JsonParameters.PSobject.Properties["symbolIdCoinapi"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "amountOrder"))) { #optional property not found
            $AmountOrder = $null
        } else {
            $AmountOrder = $JsonParameters.PSobject.Properties["amountOrder"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "price"))) { #optional property not found
            $Price = $null
        } else {
            $Price = $JsonParameters.PSobject.Properties["price"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "side"))) { #optional property not found
            $Side = $null
        } else {
            $Side = $JsonParameters.PSobject.Properties["side"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "orderType"))) { #optional property not found
            $OrderType = $null
        } else {
            $OrderType = $JsonParameters.PSobject.Properties["orderType"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "timeInForce"))) { #optional property not found
            $TimeInForce = $null
        } else {
            $TimeInForce = $JsonParameters.PSobject.Properties["timeInForce"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "expireTime"))) { #optional property not found
            $ExpireTime = $null
        } else {
            $ExpireTime = $JsonParameters.PSobject.Properties["expireTime"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "execInst"))) { #optional property not found
            $ExecInst = $null
        } else {
            $ExecInst = $JsonParameters.PSobject.Properties["execInst"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "clientOrderIdFormatExchange"))) { #optional property not found
            $ClientOrderIdFormatExchange = $null
        } else {
            $ClientOrderIdFormatExchange = $JsonParameters.PSobject.Properties["clientOrderIdFormatExchange"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "exchangeOrderId"))) { #optional property not found
            $ExchangeOrderId = $null
        } else {
            $ExchangeOrderId = $JsonParameters.PSobject.Properties["exchangeOrderId"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "amountOpen"))) { #optional property not found
            $AmountOpen = $null
        } else {
            $AmountOpen = $JsonParameters.PSobject.Properties["amountOpen"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "amountFilled"))) { #optional property not found
            $AmountFilled = $null
        } else {
            $AmountFilled = $JsonParameters.PSobject.Properties["amountFilled"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "avgPx"))) { #optional property not found
            $AvgPx = $null
        } else {
            $AvgPx = $JsonParameters.PSobject.Properties["avgPx"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "status"))) { #optional property not found
            $Status = $null
        } else {
            $Status = $JsonParameters.PSobject.Properties["status"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "statusHistoryStatus"))) { #optional property not found
            $StatusHistoryStatus = $null
        } else {
            $StatusHistoryStatus = $JsonParameters.PSobject.Properties["statusHistoryStatus"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "statusHistoryTime"))) { #optional property not found
            $StatusHistoryTime = $null
        } else {
            $StatusHistoryTime = $JsonParameters.PSobject.Properties["statusHistoryTime"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "errorMessageResult"))) { #optional property not found
            $ErrorMessageResult = $null
        } else {
            $ErrorMessageResult = $JsonParameters.PSobject.Properties["errorMessageResult"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "errorMessageReason"))) { #optional property not found
            $ErrorMessageReason = $null
        } else {
            $ErrorMessageReason = $JsonParameters.PSobject.Properties["errorMessageReason"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "errorMessageMessage"))) { #optional property not found
            $ErrorMessageMessage = $null
        } else {
            $ErrorMessageMessage = $JsonParameters.PSobject.Properties["errorMessageMessage"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fillsTime"))) { #optional property not found
            $FillsTime = $null
        } else {
            $FillsTime = $JsonParameters.PSobject.Properties["fillsTime"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fillsPrice"))) { #optional property not found
            $FillsPrice = $null
        } else {
            $FillsPrice = $JsonParameters.PSobject.Properties["fillsPrice"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fillsAmount"))) { #optional property not found
            $FillsAmount = $null
        } else {
            $FillsAmount = $JsonParameters.PSobject.Properties["fillsAmount"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "createdTime"))) { #optional property not found
            $CreatedTime = $null
        } else {
            $CreatedTime = $JsonParameters.PSobject.Properties["createdTime"].value
        }

        $PSO = [PSCustomObject]@{
            "apikey" = ${Apikey}
            "exchangeId" = ${ExchangeId}
            "clientOrderId" = ${ClientOrderId}
            "symbolIdExchange" = ${SymbolIdExchange}
            "symbolIdCoinapi" = ${SymbolIdCoinapi}
            "amountOrder" = ${AmountOrder}
            "price" = ${Price}
            "side" = ${Side}
            "orderType" = ${OrderType}
            "timeInForce" = ${TimeInForce}
            "expireTime" = ${ExpireTime}
            "execInst" = ${ExecInst}
            "clientOrderIdFormatExchange" = ${ClientOrderIdFormatExchange}
            "exchangeOrderId" = ${ExchangeOrderId}
            "amountOpen" = ${AmountOpen}
            "amountFilled" = ${AmountFilled}
            "avgPx" = ${AvgPx}
            "status" = ${Status}
            "statusHistoryStatus" = ${StatusHistoryStatus}
            "statusHistoryTime" = ${StatusHistoryTime}
            "errorMessageResult" = ${ErrorMessageResult}
            "errorMessageReason" = ${ErrorMessageReason}
            "errorMessageMessage" = ${ErrorMessageMessage}
            "fillsTime" = ${FillsTime}
            "fillsPrice" = ${FillsPrice}
            "fillsAmount" = ${FillsAmount}
            "createdTime" = ${CreatedTime}
        }

        return $PSO
    }

}

