/**
 * EMS - REST API
 * This section will provide necessary information about the `CoinAPI EMS REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>        Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints  <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this: `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.3.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/Balance_data_inner.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Balance_data_inner::Balance_data_inner()
{
    m_Asset_id_exchange = utility::conversions::to_string_t("");
    m_Asset_id_exchangeIsSet = false;
    m_Asset_id_coinapi = utility::conversions::to_string_t("");
    m_Asset_id_coinapiIsSet = false;
    m_Balance = 0.0;
    m_BalanceIsSet = false;
    m_Available = 0.0;
    m_AvailableIsSet = false;
    m_Locked = 0.0;
    m_LockedIsSet = false;
    m_Last_updated_by = utility::conversions::to_string_t("");
    m_Last_updated_byIsSet = false;
    m_Rate_usd = 0.0;
    m_Rate_usdIsSet = false;
    m_Traded = 0.0;
    m_TradedIsSet = false;
}

Balance_data_inner::~Balance_data_inner()
{
}

void Balance_data_inner::validate()
{
    // TODO: implement validation
}

web::json::value Balance_data_inner::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Asset_id_exchangeIsSet)
    {
        val[utility::conversions::to_string_t(U("asset_id_exchange"))] = ModelBase::toJson(m_Asset_id_exchange);
    }
    if(m_Asset_id_coinapiIsSet)
    {
        val[utility::conversions::to_string_t(U("asset_id_coinapi"))] = ModelBase::toJson(m_Asset_id_coinapi);
    }
    if(m_BalanceIsSet)
    {
        val[utility::conversions::to_string_t(U("balance"))] = ModelBase::toJson(m_Balance);
    }
    if(m_AvailableIsSet)
    {
        val[utility::conversions::to_string_t(U("available"))] = ModelBase::toJson(m_Available);
    }
    if(m_LockedIsSet)
    {
        val[utility::conversions::to_string_t(U("locked"))] = ModelBase::toJson(m_Locked);
    }
    if(m_Last_updated_byIsSet)
    {
        val[utility::conversions::to_string_t(U("last_updated_by"))] = ModelBase::toJson(m_Last_updated_by);
    }
    if(m_Rate_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("rate_usd"))] = ModelBase::toJson(m_Rate_usd);
    }
    if(m_TradedIsSet)
    {
        val[utility::conversions::to_string_t(U("traded"))] = ModelBase::toJson(m_Traded);
    }

    return val;
}

bool Balance_data_inner::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("asset_id_exchange"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("asset_id_exchange")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAssetIdExchange;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAssetIdExchange);
            setAssetIdExchange(refVal_setAssetIdExchange);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("asset_id_coinapi"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("asset_id_coinapi")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAssetIdCoinapi;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAssetIdCoinapi);
            setAssetIdCoinapi(refVal_setAssetIdCoinapi);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("balance"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("balance")));
        if(!fieldValue.is_null())
        {
            double refVal_setBalance;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBalance);
            setBalance(refVal_setBalance);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("available"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("available")));
        if(!fieldValue.is_null())
        {
            double refVal_setAvailable;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAvailable);
            setAvailable(refVal_setAvailable);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("locked"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("locked")));
        if(!fieldValue.is_null())
        {
            double refVal_setLocked;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLocked);
            setLocked(refVal_setLocked);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("last_updated_by"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("last_updated_by")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setLastUpdatedBy;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLastUpdatedBy);
            setLastUpdatedBy(refVal_setLastUpdatedBy);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("rate_usd"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("rate_usd")));
        if(!fieldValue.is_null())
        {
            double refVal_setRateUsd;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRateUsd);
            setRateUsd(refVal_setRateUsd);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("traded"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("traded")));
        if(!fieldValue.is_null())
        {
            double refVal_setTraded;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTraded);
            setTraded(refVal_setTraded);
        }
    }
    return ok;
}

void Balance_data_inner::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Asset_id_exchangeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("asset_id_exchange")), m_Asset_id_exchange));
    }
    if(m_Asset_id_coinapiIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("asset_id_coinapi")), m_Asset_id_coinapi));
    }
    if(m_BalanceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("balance")), m_Balance));
    }
    if(m_AvailableIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("available")), m_Available));
    }
    if(m_LockedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("locked")), m_Locked));
    }
    if(m_Last_updated_byIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("last_updated_by")), m_Last_updated_by));
    }
    if(m_Rate_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("rate_usd")), m_Rate_usd));
    }
    if(m_TradedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("traded")), m_Traded));
    }
}

bool Balance_data_inner::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("asset_id_exchange"))))
    {
        utility::string_t refVal_setAssetIdExchange;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("asset_id_exchange"))), refVal_setAssetIdExchange );
        setAssetIdExchange(refVal_setAssetIdExchange);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("asset_id_coinapi"))))
    {
        utility::string_t refVal_setAssetIdCoinapi;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("asset_id_coinapi"))), refVal_setAssetIdCoinapi );
        setAssetIdCoinapi(refVal_setAssetIdCoinapi);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("balance"))))
    {
        double refVal_setBalance;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("balance"))), refVal_setBalance );
        setBalance(refVal_setBalance);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("available"))))
    {
        double refVal_setAvailable;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("available"))), refVal_setAvailable );
        setAvailable(refVal_setAvailable);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("locked"))))
    {
        double refVal_setLocked;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("locked"))), refVal_setLocked );
        setLocked(refVal_setLocked);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("last_updated_by"))))
    {
        utility::string_t refVal_setLastUpdatedBy;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("last_updated_by"))), refVal_setLastUpdatedBy );
        setLastUpdatedBy(refVal_setLastUpdatedBy);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("rate_usd"))))
    {
        double refVal_setRateUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("rate_usd"))), refVal_setRateUsd );
        setRateUsd(refVal_setRateUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("traded"))))
    {
        double refVal_setTraded;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("traded"))), refVal_setTraded );
        setTraded(refVal_setTraded);
    }
    return ok;
}

utility::string_t Balance_data_inner::getAssetIdExchange() const
{
    return m_Asset_id_exchange;
}

void Balance_data_inner::setAssetIdExchange(const utility::string_t& value)
{
    m_Asset_id_exchange = value;
    m_Asset_id_exchangeIsSet = true;
}

bool Balance_data_inner::assetIdExchangeIsSet() const
{
    return m_Asset_id_exchangeIsSet;
}

void Balance_data_inner::unsetAsset_id_exchange()
{
    m_Asset_id_exchangeIsSet = false;
}
utility::string_t Balance_data_inner::getAssetIdCoinapi() const
{
    return m_Asset_id_coinapi;
}

void Balance_data_inner::setAssetIdCoinapi(const utility::string_t& value)
{
    m_Asset_id_coinapi = value;
    m_Asset_id_coinapiIsSet = true;
}

bool Balance_data_inner::assetIdCoinapiIsSet() const
{
    return m_Asset_id_coinapiIsSet;
}

void Balance_data_inner::unsetAsset_id_coinapi()
{
    m_Asset_id_coinapiIsSet = false;
}
double Balance_data_inner::getBalance() const
{
    return m_Balance;
}

void Balance_data_inner::setBalance(double value)
{
    m_Balance = value;
    m_BalanceIsSet = true;
}

bool Balance_data_inner::balanceIsSet() const
{
    return m_BalanceIsSet;
}

void Balance_data_inner::unsetBalance()
{
    m_BalanceIsSet = false;
}
double Balance_data_inner::getAvailable() const
{
    return m_Available;
}

void Balance_data_inner::setAvailable(double value)
{
    m_Available = value;
    m_AvailableIsSet = true;
}

bool Balance_data_inner::availableIsSet() const
{
    return m_AvailableIsSet;
}

void Balance_data_inner::unsetAvailable()
{
    m_AvailableIsSet = false;
}
double Balance_data_inner::getLocked() const
{
    return m_Locked;
}

void Balance_data_inner::setLocked(double value)
{
    m_Locked = value;
    m_LockedIsSet = true;
}

bool Balance_data_inner::lockedIsSet() const
{
    return m_LockedIsSet;
}

void Balance_data_inner::unsetLocked()
{
    m_LockedIsSet = false;
}
utility::string_t Balance_data_inner::getLastUpdatedBy() const
{
    return m_Last_updated_by;
}

void Balance_data_inner::setLastUpdatedBy(const utility::string_t& value)
{
    m_Last_updated_by = value;
    m_Last_updated_byIsSet = true;
}

bool Balance_data_inner::lastUpdatedByIsSet() const
{
    return m_Last_updated_byIsSet;
}

void Balance_data_inner::unsetLast_updated_by()
{
    m_Last_updated_byIsSet = false;
}
double Balance_data_inner::getRateUsd() const
{
    return m_Rate_usd;
}

void Balance_data_inner::setRateUsd(double value)
{
    m_Rate_usd = value;
    m_Rate_usdIsSet = true;
}

bool Balance_data_inner::rateUsdIsSet() const
{
    return m_Rate_usdIsSet;
}

void Balance_data_inner::unsetRate_usd()
{
    m_Rate_usdIsSet = false;
}
double Balance_data_inner::getTraded() const
{
    return m_Traded;
}

void Balance_data_inner::setTraded(double value)
{
    m_Traded = value;
    m_TradedIsSet = true;
}

bool Balance_data_inner::tradedIsSet() const
{
    return m_TradedIsSet;
}

void Balance_data_inner::unsetTraded()
{
    m_TradedIsSet = false;
}
}
}
}
}


