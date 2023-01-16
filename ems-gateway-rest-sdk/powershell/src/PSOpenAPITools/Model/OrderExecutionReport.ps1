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

The order execution report object.

.PARAMETER ExchangeId
Exchange identifier used to identify the routing destination.
.PARAMETER ClientOrderId
The unique identifier of the order assigned by the client.
.PARAMETER SymbolIdExchange
Exchange symbol. One of the properties (`symbol_id_exchange`, `symbol_id_coinapi`) is required to identify the market for the new order.
.PARAMETER SymbolIdCoinapi
CoinAPI symbol. One of the properties (`symbol_id_exchange`, `symbol_id_coinapi`) is required to identify the market for the new order.
.PARAMETER AmountOrder
Order quantity.
.PARAMETER Price
Order price.
.PARAMETER Side
No description available.
.PARAMETER OrderType
No description available.
.PARAMETER TimeInForce
No description available.
.PARAMETER ExpireTime
Expiration time. Conditionaly required for orders with time_in_force = `GOOD_TILL_TIME_EXCHANGE` or `GOOD_TILL_TIME_OEML`.
.PARAMETER ExecInst
Order execution instructions are documented in the separate section: <a href=""#ems-order-params-exec"">EMS / Starter Guide / Order parameters / Execution instructions</a> 
.PARAMETER ClientOrderIdFormatExchange
The unique identifier of the order assigned by the client converted to the exchange order tag format for the purpose of tracking it.
.PARAMETER ExchangeOrderId
Unique identifier of the order assigned by the exchange or executing system.
.PARAMETER AmountOpen
Quantity open for further execution. `amount_open` = `amount_order` - `amount_filled`
.PARAMETER AmountFilled
Total quantity filled.
.PARAMETER AvgPx
Calculated average price of all fills on this order.
.PARAMETER Status
No description available.
.PARAMETER StatusHistory
Timestamped history of order status changes.
.PARAMETER ErrorMessage
Error message.
.PARAMETER Fills
Relay fill information on working orders.
.OUTPUTS

OrderExecutionReport<PSCustomObject>
#>

function Initialize-OrderExecutionReport {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ExchangeId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ClientOrderId},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SymbolIdExchange},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SymbolIdCoinapi},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [Decimal]
        ${AmountOrder},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [Decimal]
        ${Price},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Side},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${OrderType},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${TimeInForce},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${ExpireTime},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("MAKER_OR_CANCEL", "AUCTION_ONLY", "INDICATION_OF_INTEREST")]
        [String[]]
        ${ExecInst},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ClientOrderIdFormatExchange},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ExchangeOrderId},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [Decimal]
        ${AmountOpen},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [Decimal]
        ${AmountFilled},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${AvgPx},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Status},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [String[][]]
        ${StatusHistory},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ErrorMessage},
        [Parameter(Position = 19, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Fills}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => OrderExecutionReport' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $ExchangeId) {
            throw "invalid value for 'ExchangeId', 'ExchangeId' cannot be null."
        }

        if ($null -eq $ClientOrderId) {
            throw "invalid value for 'ClientOrderId', 'ClientOrderId' cannot be null."
        }

        if ($null -eq $AmountOrder) {
            throw "invalid value for 'AmountOrder', 'AmountOrder' cannot be null."
        }

        if ($null -eq $Price) {
            throw "invalid value for 'Price', 'Price' cannot be null."
        }

        if ($null -eq $Side) {
            throw "invalid value for 'Side', 'Side' cannot be null."
        }

        if ($null -eq $OrderType) {
            throw "invalid value for 'OrderType', 'OrderType' cannot be null."
        }

        if ($null -eq $TimeInForce) {
            throw "invalid value for 'TimeInForce', 'TimeInForce' cannot be null."
        }

        if ($null -eq $ClientOrderIdFormatExchange) {
            throw "invalid value for 'ClientOrderIdFormatExchange', 'ClientOrderIdFormatExchange' cannot be null."
        }

        if ($null -eq $AmountOpen) {
            throw "invalid value for 'AmountOpen', 'AmountOpen' cannot be null."
        }

        if ($null -eq $AmountFilled) {
            throw "invalid value for 'AmountFilled', 'AmountFilled' cannot be null."
        }

        if ($null -eq $Status) {
            throw "invalid value for 'Status', 'Status' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "exchange_id" = ${ExchangeId}
            "client_order_id" = ${ClientOrderId}
            "symbol_id_exchange" = ${SymbolIdExchange}
            "symbol_id_coinapi" = ${SymbolIdCoinapi}
            "amount_order" = ${AmountOrder}
            "price" = ${Price}
            "side" = ${Side}
            "order_type" = ${OrderType}
            "time_in_force" = ${TimeInForce}
            "expire_time" = ${ExpireTime}
            "exec_inst" = ${ExecInst}
            "client_order_id_format_exchange" = ${ClientOrderIdFormatExchange}
            "exchange_order_id" = ${ExchangeOrderId}
            "amount_open" = ${AmountOpen}
            "amount_filled" = ${AmountFilled}
            "avg_px" = ${AvgPx}
            "status" = ${Status}
            "status_history" = ${StatusHistory}
            "error_message" = ${ErrorMessage}
            "fills" = ${Fills}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to OrderExecutionReport<PSCustomObject>

.DESCRIPTION

Convert from JSON to OrderExecutionReport<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

OrderExecutionReport<PSCustomObject>
#>
function ConvertFrom-JsonToOrderExecutionReport {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => OrderExecutionReport' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in OrderExecutionReport
        $AllProperties = ("exchange_id", "client_order_id", "symbol_id_exchange", "symbol_id_coinapi", "amount_order", "price", "side", "order_type", "time_in_force", "expire_time", "exec_inst", "client_order_id_format_exchange", "exchange_order_id", "amount_open", "amount_filled", "avg_px", "status", "status_history", "error_message", "fills")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'exchange_id' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "exchange_id"))) {
            throw "Error! JSON cannot be serialized due to the required property 'exchange_id' missing."
        } else {
            $ExchangeId = $JsonParameters.PSobject.Properties["exchange_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "client_order_id"))) {
            throw "Error! JSON cannot be serialized due to the required property 'client_order_id' missing."
        } else {
            $ClientOrderId = $JsonParameters.PSobject.Properties["client_order_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "amount_order"))) {
            throw "Error! JSON cannot be serialized due to the required property 'amount_order' missing."
        } else {
            $AmountOrder = $JsonParameters.PSobject.Properties["amount_order"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "price"))) {
            throw "Error! JSON cannot be serialized due to the required property 'price' missing."
        } else {
            $Price = $JsonParameters.PSobject.Properties["price"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "side"))) {
            throw "Error! JSON cannot be serialized due to the required property 'side' missing."
        } else {
            $Side = $JsonParameters.PSobject.Properties["side"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "order_type"))) {
            throw "Error! JSON cannot be serialized due to the required property 'order_type' missing."
        } else {
            $OrderType = $JsonParameters.PSobject.Properties["order_type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "time_in_force"))) {
            throw "Error! JSON cannot be serialized due to the required property 'time_in_force' missing."
        } else {
            $TimeInForce = $JsonParameters.PSobject.Properties["time_in_force"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "client_order_id_format_exchange"))) {
            throw "Error! JSON cannot be serialized due to the required property 'client_order_id_format_exchange' missing."
        } else {
            $ClientOrderIdFormatExchange = $JsonParameters.PSobject.Properties["client_order_id_format_exchange"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "amount_open"))) {
            throw "Error! JSON cannot be serialized due to the required property 'amount_open' missing."
        } else {
            $AmountOpen = $JsonParameters.PSobject.Properties["amount_open"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "amount_filled"))) {
            throw "Error! JSON cannot be serialized due to the required property 'amount_filled' missing."
        } else {
            $AmountFilled = $JsonParameters.PSobject.Properties["amount_filled"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "status"))) {
            throw "Error! JSON cannot be serialized due to the required property 'status' missing."
        } else {
            $Status = $JsonParameters.PSobject.Properties["status"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "symbol_id_exchange"))) { #optional property not found
            $SymbolIdExchange = $null
        } else {
            $SymbolIdExchange = $JsonParameters.PSobject.Properties["symbol_id_exchange"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "symbol_id_coinapi"))) { #optional property not found
            $SymbolIdCoinapi = $null
        } else {
            $SymbolIdCoinapi = $JsonParameters.PSobject.Properties["symbol_id_coinapi"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "expire_time"))) { #optional property not found
            $ExpireTime = $null
        } else {
            $ExpireTime = $JsonParameters.PSobject.Properties["expire_time"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "exec_inst"))) { #optional property not found
            $ExecInst = $null
        } else {
            $ExecInst = $JsonParameters.PSobject.Properties["exec_inst"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "exchange_order_id"))) { #optional property not found
            $ExchangeOrderId = $null
        } else {
            $ExchangeOrderId = $JsonParameters.PSobject.Properties["exchange_order_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "avg_px"))) { #optional property not found
            $AvgPx = $null
        } else {
            $AvgPx = $JsonParameters.PSobject.Properties["avg_px"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "status_history"))) { #optional property not found
            $StatusHistory = $null
        } else {
            $StatusHistory = $JsonParameters.PSobject.Properties["status_history"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "error_message"))) { #optional property not found
            $ErrorMessage = $null
        } else {
            $ErrorMessage = $JsonParameters.PSobject.Properties["error_message"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fills"))) { #optional property not found
            $Fills = $null
        } else {
            $Fills = $JsonParameters.PSobject.Properties["fills"].value
        }

        $PSO = [PSCustomObject]@{
            "exchange_id" = ${ExchangeId}
            "client_order_id" = ${ClientOrderId}
            "symbol_id_exchange" = ${SymbolIdExchange}
            "symbol_id_coinapi" = ${SymbolIdCoinapi}
            "amount_order" = ${AmountOrder}
            "price" = ${Price}
            "side" = ${Side}
            "order_type" = ${OrderType}
            "time_in_force" = ${TimeInForce}
            "expire_time" = ${ExpireTime}
            "exec_inst" = ${ExecInst}
            "client_order_id_format_exchange" = ${ClientOrderIdFormatExchange}
            "exchange_order_id" = ${ExchangeOrderId}
            "amount_open" = ${AmountOpen}
            "amount_filled" = ${AmountFilled}
            "avg_px" = ${AvgPx}
            "status" = ${Status}
            "status_history" = ${StatusHistory}
            "error_message" = ${ErrorMessage}
            "fills" = ${Fills}
        }

        return $PSO
    }

}

