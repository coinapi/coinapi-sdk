#
# EMS - Managed Cloud REST API
# This section will provide necessary information about the `CoinAPI EMS Managed Cloud REST API` protocol.  <br/><br/> This API is used to manage the overall deployment of **Execution Management System API** (`EMS API`) software,  which means that in this API, you define the accounts, credentials, and configurations for the order destinations or identify the CoinAPI endpoints where you need to connect to access the `EMS API`.  <br/><br/> Implemented Standards:   * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)  * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)  * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)   ### Endpoints <table>   <thead>     <tr>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Production</td>       <td><code>https://ems-mgmt.coinapi.io/</code></td>     </tr>     <tr>       <td>Sandbox</td>       <td><code>https://ems-mgmt-sandbox.coinapi.io/</code></td>     </tr>   </tbody> </table>  ### Authentication  To use resources that require authorized access, you will need to provide an API key to us when making HTTP requests.  There are 2 methods for passing the API key to us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key`  2. Query string parameter named `apikey`  #### Custom authorization header  You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value.  Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: <br/><br/> `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY`  <aside class=""success"">This method is recommended by us and you should use it in production environments.</aside>  #### Query string authorization parameter  You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request.  Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all accounts, then your query string should look like this:  <br/><br/> `GET /v1/accounts?apikey=73034021-THIS-IS-SAMPLE-KEY`  <aside class=""notice""> Query string method may be more practical for development activities. </aside> 
# Version: v1
# Contact: support@coinapi.io
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Delete account

.DESCRIPTION

No description available.

.PARAMETER ExchangeId
Exchange identifier of the account to delete

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

None
#>
function Invoke-DeleteAccount {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String[]]
        ${ExchangeId},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-DeleteAccount' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $LocalVarAccepts = @()
        $LocalVarContentTypes = @()
        $LocalVarQueryParameters = @{}
        $LocalVarHeaderParameters = @{}
        $LocalVarFormParameters = @{}
        $LocalVarPathParameters = @{}
        $LocalVarCookieParameters = @{}
        $LocalVarBodyParameter = $null

        $Configuration = Get-Configuration
        $LocalVarUri = '/v1/accounts'

        if (!$ExchangeId) {
            throw "Error! The required parameter `ExchangeId` missing when calling deleteAccount."
        }
        $LocalVarQueryParameters['exchange_id'] = $ExchangeId

        if ($Configuration["ApiKey"] -and $Configuration["ApiKey"]["APIKeyHeader"]) {
            $LocalVarHeaderParameters['APIKeyHeader'] = $Configuration["ApiKey"]["APIKeyHeader"]
            Write-Verbose ("Using API key 'APIKeyHeader' in the header for authentication in {0}" -f $MyInvocation.MyCommand)
        }

        if ($Configuration["ApiKey"] -and $Configuration["ApiKey"]["APIKeyQueryParam"]) {
            $LocalVarQueryParameters['APIKeyQueryParam'] = $Configuration["ApiKey"]["APIKeyQueryParam"]
            Write-Verbose ("Using API key `APIKeyQueryParam` in the URL query for authentication in {0}" -f $MyInvocation.MyCommand)
        }

        $LocalVarResult = Invoke-ApiClient -Method 'DELETE' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "" `
                                -IsBodyNullable $false

        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}

<#
.SYNOPSIS

Delete all accounts

.DESCRIPTION

No description available.

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

None
#>
function Invoke-DeleteAccountAll {
    [CmdletBinding()]
    Param (
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-DeleteAccountAll' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $LocalVarAccepts = @()
        $LocalVarContentTypes = @()
        $LocalVarQueryParameters = @{}
        $LocalVarHeaderParameters = @{}
        $LocalVarFormParameters = @{}
        $LocalVarPathParameters = @{}
        $LocalVarCookieParameters = @{}
        $LocalVarBodyParameter = $null

        $Configuration = Get-Configuration
        $LocalVarUri = '/v1/accounts/all'

        if ($Configuration["ApiKey"] -and $Configuration["ApiKey"]["APIKeyHeader"]) {
            $LocalVarHeaderParameters['APIKeyHeader'] = $Configuration["ApiKey"]["APIKeyHeader"]
            Write-Verbose ("Using API key 'APIKeyHeader' in the header for authentication in {0}" -f $MyInvocation.MyCommand)
        }

        if ($Configuration["ApiKey"] -and $Configuration["ApiKey"]["APIKeyQueryParam"]) {
            $LocalVarQueryParameters['APIKeyQueryParam'] = $Configuration["ApiKey"]["APIKeyQueryParam"]
            Write-Verbose ("Using API key `APIKeyQueryParam` in the URL query for authentication in {0}" -f $MyInvocation.MyCommand)
        }

        $LocalVarResult = Invoke-ApiClient -Method 'DELETE' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "" `
                                -IsBodyNullable $false

        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}

<#
.SYNOPSIS

Get accounts

.DESCRIPTION

No description available.

.PARAMETER FilterExchangeId
Exchange id of the specific account to provide single account instead of the list of all accounts

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

GetAccount[]
#>
function Get-Account {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String[]]
        ${FilterExchangeId},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Get-Account' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $LocalVarAccepts = @()
        $LocalVarContentTypes = @()
        $LocalVarQueryParameters = @{}
        $LocalVarHeaderParameters = @{}
        $LocalVarFormParameters = @{}
        $LocalVarPathParameters = @{}
        $LocalVarCookieParameters = @{}
        $LocalVarBodyParameter = $null

        $Configuration = Get-Configuration
        # HTTP header 'Accept' (if needed)
        $LocalVarAccepts = @('application/json')

        $LocalVarUri = '/v1/accounts'

        if ($FilterExchangeId) {
            $LocalVarQueryParameters['filter_exchange_id'] = $FilterExchangeId
        }

        if ($Configuration["ApiKey"] -and $Configuration["ApiKey"]["APIKeyHeader"]) {
            $LocalVarHeaderParameters['APIKeyHeader'] = $Configuration["ApiKey"]["APIKeyHeader"]
            Write-Verbose ("Using API key 'APIKeyHeader' in the header for authentication in {0}" -f $MyInvocation.MyCommand)
        }

        if ($Configuration["ApiKey"] -and $Configuration["ApiKey"]["APIKeyQueryParam"]) {
            $LocalVarQueryParameters['APIKeyQueryParam'] = $Configuration["ApiKey"]["APIKeyQueryParam"]
            Write-Verbose ("Using API key `APIKeyQueryParam` in the URL query for authentication in {0}" -f $MyInvocation.MyCommand)
        }

        $LocalVarResult = Invoke-ApiClient -Method 'GET' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "GetAccount[]" `
                                -IsBodyNullable $false

        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}

<#
.SYNOPSIS

Add or update account

.DESCRIPTION

No description available.

.PARAMETER Body
Exchange account object that needs to be add/update to the EMS

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

None
#>
function Invoke-PersistAccount {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [PSCustomObject]
        ${Body},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-PersistAccount' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $LocalVarAccepts = @()
        $LocalVarContentTypes = @()
        $LocalVarQueryParameters = @{}
        $LocalVarHeaderParameters = @{}
        $LocalVarFormParameters = @{}
        $LocalVarPathParameters = @{}
        $LocalVarCookieParameters = @{}
        $LocalVarBodyParameter = $null

        $Configuration = Get-Configuration
        # HTTP header 'Content-Type'
        $LocalVarContentTypes = @('application/json')

        $LocalVarUri = '/v1/accounts'

        if (!$Body) {
            throw "Error! The required parameter `Body` missing when calling persistAccount."
        }

        $LocalVarBodyParameter = $Body | ConvertTo-Json -Depth 100

        if ($Configuration["ApiKey"] -and $Configuration["ApiKey"]["APIKeyHeader"]) {
            $LocalVarHeaderParameters['APIKeyHeader'] = $Configuration["ApiKey"]["APIKeyHeader"]
            Write-Verbose ("Using API key 'APIKeyHeader' in the header for authentication in {0}" -f $MyInvocation.MyCommand)
        }

        if ($Configuration["ApiKey"] -and $Configuration["ApiKey"]["APIKeyQueryParam"]) {
            $LocalVarQueryParameters['APIKeyQueryParam'] = $Configuration["ApiKey"]["APIKeyQueryParam"]
            Write-Verbose ("Using API key `APIKeyQueryParam` in the URL query for authentication in {0}" -f $MyInvocation.MyCommand)
        }

        $LocalVarResult = Invoke-ApiClient -Method 'POST' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "" `
                                -IsBodyNullable $false

        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}

