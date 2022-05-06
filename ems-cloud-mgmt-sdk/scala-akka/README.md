# openapi-client

EMS - Managed Cloud REST API
- API version: v1

This section will provide necessary information about the `CoinAPI EMS Managed Cloud REST API` protocol. 
<br/><br/>
This API is used to manage the overall deployment of **Execution Management System API** (`EMS API`) software, 
which means that in this API, you define the accounts, credentials, and configurations for the order destinations or identify the CoinAPI endpoints where you need to connect to access the `EMS API`. 
<br/><br/>
Implemented Standards:

 * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)
 * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)
 * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)
 
### Endpoints
<table>
  <thead>
    <tr>
      <th>Environment</th>
      <th>Url</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Production</td>
      <td><code>https://ems-mgmt.coinapi.io/</code></td>
    </tr>
    <tr>
      <td>Sandbox</td>
      <td><code>https://ems-mgmt-sandbox.coinapi.io/</code></td>
    </tr>
  </tbody>
</table>

### Authentication

To use resources that require authorized access, you will need to provide an API key to us when making HTTP requests.

There are 2 methods for passing the API key to us, you only need to use one:

 1. Custom authorization header named `X-CoinAPI-Key`
 2. Query string parameter named `apikey`

#### Custom authorization header

You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value.

Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like:
<br/><br/>
`X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY`

<aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside>

#### Query string authorization parameter

You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request.

Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all accounts, then your query string should look like this: 
<br/><br/>
`GET /v1/accounts?apikey=73034021-THIS-IS-SAMPLE-KEY`

<aside class=\"notice\">
Query string method may be more practical for development activities.
</aside>


  For more information, please visit [https://www.coinapi.io](https://www.coinapi.io)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle/SBT

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-client:1.0.0"
```

### SBT users

```scala
libraryDependencies += "org.openapitools" % "openapi-client" % "1.0.0"
```

## Getting Started

## Documentation for API Endpoints

All URIs are relative to *https://ems-mgmt-sandbox.coinapi.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | **deleteAccount** | **DELETE** /v1/accounts | Delete account
*AccountApi* | **deleteAccountAll** | **DELETE** /v1/accounts/all | Delete all accounts
*AccountApi* | **getAccount** | **GET** /v1/accounts | Get accounts
*AccountApi* | **persistAccount** | **POST** /v1/accounts | Add or update account
*CertificateApi* | **certificate** | **GET** /v1/certificate/pem | Get authentication certificate
*EndpointsApi* | **endpoints** | **GET** /v1/endpoints | Get API endpoints
*ExchangeApi* | **exchangeLoginRequire** | **GET** /v1/exchanges | Get exchange configuration
*LocationApi* | **locations** | **GET** /v1/locations | Get site locations


## Documentation for Models

 - [AccountData](AccountData.md)
 - [AccountEndpoint](AccountEndpoint.md)
 - [AccountInfo](AccountInfo.md)
 - [ExchangeLoginRequire](ExchangeLoginRequire.md)
 - [GetAccount](GetAccount.md)
 - [KeyValue](KeyValue.md)
 - [Locations](Locations.md)
 - [UpdateAccount](UpdateAccount.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### APIKeyHeader

- **Type**: API key
- **API key parameter name**: X-CoinAPI-Key
- **Location**: HTTP header

### APIKeyQueryParam

- **Type**: API key
- **API key parameter name**: apikey
- **Location**: URL query string


## Author

support@coinapi.io
