# PSOpenAPITools - the PowerShell module for the EMS - REST API

This section will provide necessary information about the `CoinAPI EMS REST API` protocol.
<br/>
This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>      
<br/><br/>
Implemented Standards:

  * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)
  * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)
  * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)
   
### Endpoints
<table>
  <thead>
    <tr>
      <th>Deployment method</th>
      <th>Environment</th>
      <th>Url</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Managed Cloud</td>
      <td>Production</td>
      <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>
    </tr>
    <tr>
      <td>Managed Cloud</td>
      <td>Sandbox</td>
      <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>
    </tr>
    <tr>
      <td>Self Hosted</td>
      <td>Production</td>
      <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>
    </tr>
    <tr>
      <td>Self Hosted</td>
      <td>Sandbox</td>
      <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>
    </tr>
  </tbody>
</table>

### Authentication
If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls. 
<br/><br/>
If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:

 1. Custom authorization header named `X-CoinAPI-Key` with the API Key
 2. Query string parameter named `apikey` with the API Key
 3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.

#### Custom authorization header
You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value.
Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like:
<br/><br/>
`X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY`
<aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside>
#### Query string authorization parameter
You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request.
Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this: 
<br/><br/>
`GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY`
<aside class=\"notice\">Query string method may be more practical for development activities.</aside>


This PowerShell module is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: v1
- SDK version: 0.1.2
- Build package: org.openapitools.codegen.languages.PowerShellClientCodegen
    For more information, please visit [https://www.coinapi.io](https://www.coinapi.io)

<a name="frameworks-supported"></a>
## Frameworks supported
- PowerShell 6.2 or later

<a name="dependencies"></a>
## Dependencies

<a name="installation"></a>
## Installation


To install from the source, run the following command to build and install the PowerShell module locally:
```powershell
Build.ps1
Import-Module -Name '.\src\PSOpenAPITools' -Verbose
```

To avoid function name collision, one can use `-Prefix`, e.g. `Import-Module -Name '.\src\PSOpenAPITools' -Prefix prefix`

To uninstall the module, simply run:
```powershell
Remove-Module -FullyQualifiedName @{ModuleName = "PSOpenAPITools"; ModuleVersion = "0.1.2"}
```

<a name="tests"></a>
## Tests

To install and run `Pester`, please execute the following commands in the terminal:

```powershell
Install-module -name Pester -force

Invoke-Pester
```

For troubleshooting, please run `$DebugPreference = 'Continue'` to turn on debugging and disable it with `$DebugPreference = 'SilentlyContinue'` when done with the troubleshooting.

## Documentation for API Endpoints

All URIs are relative to *https://ems-gateway-aws-eu-central-1-dev.coinapi.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BalancesApi* | [**Invoke-V1BalancesGet**](docs/BalancesApi.md#Invoke-V1BalancesGet) | **GET** /v1/balances | Get balances
*OrdersApi* | [**Invoke-V1OrdersCancelAllPost**](docs/OrdersApi.md#Invoke-V1OrdersCancelAllPost) | **POST** /v1/orders/cancel/all | Cancel all orders request
*OrdersApi* | [**Invoke-V1OrdersCancelPost**](docs/OrdersApi.md#Invoke-V1OrdersCancelPost) | **POST** /v1/orders/cancel | Cancel order request
*OrdersApi* | [**Invoke-V1OrdersGet**](docs/OrdersApi.md#Invoke-V1OrdersGet) | **GET** /v1/orders | Get open orders
*OrdersApi* | [**Invoke-V1OrdersHistoryGet**](docs/OrdersApi.md#Invoke-V1OrdersHistoryGet) | **GET** /v1/orders/history | History of order changes
*OrdersApi* | [**Invoke-V1OrdersPost**](docs/OrdersApi.md#Invoke-V1OrdersPost) | **POST** /v1/orders | Send new order
*OrdersApi* | [**Invoke-V1OrdersStatusClientOrderIdGet**](docs/OrdersApi.md#Invoke-V1OrdersStatusClientOrderIdGet) | **GET** /v1/orders/status/{client_order_id} | Get order execution report
*PositionsApi* | [**Invoke-V1PositionsGet**](docs/PositionsApi.md#Invoke-V1PositionsGet) | **GET** /v1/positions | Get open positions


## Documentation for Models

 - [PSOpenAPITools/Model.Balance](docs/Balance.md)
 - [PSOpenAPITools/Model.BalanceDataInner](docs/BalanceDataInner.md)
 - [PSOpenAPITools/Model.Fills](docs/Fills.md)
 - [PSOpenAPITools/Model.MessageError](docs/MessageError.md)
 - [PSOpenAPITools/Model.MessageReject](docs/MessageReject.md)
 - [PSOpenAPITools/Model.OrdSide](docs/OrdSide.md)
 - [PSOpenAPITools/Model.OrdStatus](docs/OrdStatus.md)
 - [PSOpenAPITools/Model.OrdType](docs/OrdType.md)
 - [PSOpenAPITools/Model.OrderCancelAllRequest](docs/OrderCancelAllRequest.md)
 - [PSOpenAPITools/Model.OrderCancelSingleRequest](docs/OrderCancelSingleRequest.md)
 - [PSOpenAPITools/Model.OrderExecutionReport](docs/OrderExecutionReport.md)
 - [PSOpenAPITools/Model.OrderExecutionReportAllOf](docs/OrderExecutionReportAllOf.md)
 - [PSOpenAPITools/Model.OrderHistory](docs/OrderHistory.md)
 - [PSOpenAPITools/Model.OrderNewSingleRequest](docs/OrderNewSingleRequest.md)
 - [PSOpenAPITools/Model.Position](docs/Position.md)
 - [PSOpenAPITools/Model.PositionDataInner](docs/PositionDataInner.md)
 - [PSOpenAPITools/Model.RejectReason](docs/RejectReason.md)
 - [PSOpenAPITools/Model.TimeInForce](docs/TimeInForce.md)
 - [PSOpenAPITools/Model.ValidationError](docs/ValidationError.md)


## Documentation for Authorization

All endpoints do not require authorization.