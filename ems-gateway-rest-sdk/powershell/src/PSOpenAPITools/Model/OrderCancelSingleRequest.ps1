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

Cancel single order request object.

.PARAMETER ExchangeId
Exchange identifier used to identify the routing destination.
.PARAMETER ExchangeOrderId
Unique identifier of the order assigned by the exchange or executing system. One of the properties (`exchange_order_id`, `client_order_id`) is required to identify the new order.
.PARAMETER ClientOrderId
The unique identifier of the order assigned by the client. One of the properties (`exchange_order_id`, `client_order_id`) is required to identify the new order.
.OUTPUTS

OrderCancelSingleRequest<PSCustomObject>
#>

function Initialize-OrderCancelSingleRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ExchangeId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ExchangeOrderId},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ClientOrderId}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => OrderCancelSingleRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $ExchangeId) {
            throw "invalid value for 'ExchangeId', 'ExchangeId' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "exchange_id" = ${ExchangeId}
            "exchange_order_id" = ${ExchangeOrderId}
            "client_order_id" = ${ClientOrderId}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to OrderCancelSingleRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to OrderCancelSingleRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

OrderCancelSingleRequest<PSCustomObject>
#>
function ConvertFrom-JsonToOrderCancelSingleRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => OrderCancelSingleRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in OrderCancelSingleRequest
        $AllProperties = ("exchange_id", "exchange_order_id", "client_order_id")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "exchange_order_id"))) { #optional property not found
            $ExchangeOrderId = $null
        } else {
            $ExchangeOrderId = $JsonParameters.PSobject.Properties["exchange_order_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "client_order_id"))) { #optional property not found
            $ClientOrderId = $null
        } else {
            $ClientOrderId = $JsonParameters.PSobject.Properties["client_order_id"].value
        }

        $PSO = [PSCustomObject]@{
            "exchange_id" = ${ExchangeId}
            "exchange_order_id" = ${ExchangeOrderId}
            "client_order_id" = ${ClientOrderId}
        }

        return $PSO
    }

}

