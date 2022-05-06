/**
 * EMS - Managed Cloud REST API
 * This section will provide necessary information about the `CoinAPI EMS Managed Cloud REST API` protocol.  <br/><br/> This API is used to manage the overall deployment of **Execution Management System API** (`EMS API`) software,  which means that in this API, you define the accounts, credentials, and configurations for the order destinations or identify the CoinAPI endpoints where you need to connect to access the `EMS API`.  <br/><br/> Implemented Standards:   * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)  * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)  * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)   ### Endpoints <table>   <thead>     <tr>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Production</td>       <td><code>https://ems-mgmt.coinapi.io/</code></td>     </tr>     <tr>       <td>Sandbox</td>       <td><code>https://ems-mgmt-sandbox.coinapi.io/</code></td>     </tr>   </tbody> </table>  ### Authentication  To use resources that require authorized access, you will need to provide an API key to us when making HTTP requests.  There are 2 methods for passing the API key to us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key`  2. Query string parameter named `apikey`  #### Custom authorization header  You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value.  Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: <br/><br/> `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY`  <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside>  #### Query string authorization parameter  You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request.  Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all accounts, then your query string should look like this:  <br/><br/> `GET /v1/accounts?apikey=73034021-THIS-IS-SAMPLE-KEY`  <aside class=\"notice\"> Query string method may be more practical for development activities. </aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * AccountApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_AccountApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_AccountApi_H_



#include "ApiClient.h"

#include "model/AccountData.h"
#include "model/GetAccount.h"
#include <cpprest/details/basic_types.h>
#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  AccountApi 
{
public:

    explicit AccountApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~AccountApi();

    /// <summary>
    /// Delete account
    /// </summary>
    /// <remarks>
    /// Delete specific exchange account maintained by the EMS API for your subscription.
    /// </remarks>
    /// <param name="exchangeId">Exchange identifier of the account to delete</param>
    pplx::task<void> deleteAccount(
        std::vector<utility::string_t> exchangeId
    ) const;
    /// <summary>
    /// Delete all accounts
    /// </summary>
    /// <remarks>
    /// Delete all exchange accounts maintained by the EMS API for your subscription.
    /// </remarks>
    pplx::task<void> deleteAccountAll(
    ) const;
    /// <summary>
    /// Get accounts
    /// </summary>
    /// <remarks>
    /// Get all accounts maintained for your subscription in the EMS API.
    /// </remarks>
    /// <param name="filterExchangeId">Exchange id of the specific account to provide single account instead of the list of all accounts (optional, default to std::vector&lt;std::shared_ptr&lt;utility::string_t&gt;&gt;())</param>
    pplx::task<std::vector<std::shared_ptr<GetAccount>>> getAccount(
        boost::optional<std::vector<utility::string_t>> filterExchangeId
    ) const;
    /// <summary>
    /// Add or update account
    /// </summary>
    /// <remarks>
    /// Add new or update existing exchange account for your subscription in the EMS API.
    /// </remarks>
    /// <param name="body">Exchange account object that needs to be add/update to the EMS</param>
    pplx::task<void> persistAccount(
        std::shared_ptr<AccountData> body
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_AccountApi_H_ */
