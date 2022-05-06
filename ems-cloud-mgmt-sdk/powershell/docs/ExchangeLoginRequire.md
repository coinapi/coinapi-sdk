# ExchangeLoginRequire
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExchangeId** | **String** | Exchange identifier and optional tag identifying specific account configured when the software will be managing multiple accounts on the same exchange; for eg:  &lt;code&gt;BITSTAMP&lt;/code&gt; &lt;code&gt;BITSTAMP/7c177641-74bd-4dbe-9b01-2497c12a5f70&#x60;&lt;/code&gt; &lt;code&gt;BITSTAMP/2574&lt;/code&gt; Allowed separators between the exchange identifier and the tag: &lt;code&gt;~/.,:;\!@#$%^&amp;*-_+&#x3D;.&lt;/code&gt;  | [optional] 
**LocationId** | **String** | Location identifier | [optional] 
**RequiredParameters** | **String[]** | Parameters required to log into the exchange | [optional] 

## Examples

- Prepare the resource
```powershell
$ExchangeLoginRequire = Initialize-PSOpenAPIToolsExchangeLoginRequire  -ExchangeId null `
 -LocationId null `
 -RequiredParameters null
```

- Convert the resource to JSON
```powershell
$ExchangeLoginRequire | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
