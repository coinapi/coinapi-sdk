# openapi-java-client

EMS - Managed Cloud REST API
- API version: v1
  - Build date: 2022-05-06T09:35:06.920152Z[Etc/UTC]

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
2. Maven (3.8.3+)/Gradle (7.2+)

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
  <artifactId>openapi-java-client</artifactId>
  <version>v1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:v1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-v1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ems-mgmt-sandbox.coinapi.io");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQueryParam
    ApiKeyAuth APIKeyQueryParam = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQueryParam");
    APIKeyQueryParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQueryParam.setApiKeyPrefix("Token");

    AccountApi apiInstance = new AccountApi(defaultClient);
    List<String> exchangeId = Arrays.asList(); // List<String> | Exchange identifier of the account to delete
    try {
      apiInstance.deleteAccount(exchangeId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#deleteAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://ems-mgmt-sandbox.coinapi.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**deleteAccount**](docs/AccountApi.md#deleteAccount) | **DELETE** /v1/accounts | Delete account
*AccountApi* | [**deleteAccountAll**](docs/AccountApi.md#deleteAccountAll) | **DELETE** /v1/accounts/all | Delete all accounts
*AccountApi* | [**getAccount**](docs/AccountApi.md#getAccount) | **GET** /v1/accounts | Get accounts
*AccountApi* | [**persistAccount**](docs/AccountApi.md#persistAccount) | **POST** /v1/accounts | Add or update account
*CertificateApi* | [**certificate**](docs/CertificateApi.md#certificate) | **GET** /v1/certificate/pem | Get authentication certificate
*EndpointsApi* | [**endpoints**](docs/EndpointsApi.md#endpoints) | **GET** /v1/endpoints | Get API endpoints
*ExchangeApi* | [**exchangeLoginRequire**](docs/ExchangeApi.md#exchangeLoginRequire) | **GET** /v1/exchanges | Get exchange configuration
*LocationApi* | [**locations**](docs/LocationApi.md#locations) | **GET** /v1/locations | Get site locations


## Documentation for Models

 - [AccountData](docs/AccountData.md)
 - [AccountEndpoint](docs/AccountEndpoint.md)
 - [AccountInfo](docs/AccountInfo.md)
 - [ExchangeLoginRequire](docs/ExchangeLoginRequire.md)
 - [GetAccount](docs/GetAccount.md)
 - [KeyValue](docs/KeyValue.md)
 - [Locations](docs/Locations.md)
 - [UpdateAccount](docs/UpdateAccount.md)


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


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@coinapi.io
