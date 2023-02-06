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



#include "CppRestOpenAPIClient/model/OrderCancelSingleRequest.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



OrderCancelSingleRequest::OrderCancelSingleRequest()
{
    m_Exchange_id = utility::conversions::to_string_t("");
    m_Exchange_idIsSet = false;
    m_Exchange_order_id = utility::conversions::to_string_t("");
    m_Exchange_order_idIsSet = false;
    m_Client_order_id = utility::conversions::to_string_t("");
    m_Client_order_idIsSet = false;
}

OrderCancelSingleRequest::~OrderCancelSingleRequest()
{
}

void OrderCancelSingleRequest::validate()
{
    // TODO: implement validation
}

web::json::value OrderCancelSingleRequest::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Exchange_idIsSet)
    {
        val[utility::conversions::to_string_t(U("exchange_id"))] = ModelBase::toJson(m_Exchange_id);
    }
    if(m_Exchange_order_idIsSet)
    {
        val[utility::conversions::to_string_t(U("exchange_order_id"))] = ModelBase::toJson(m_Exchange_order_id);
    }
    if(m_Client_order_idIsSet)
    {
        val[utility::conversions::to_string_t(U("client_order_id"))] = ModelBase::toJson(m_Client_order_id);
    }

    return val;
}

bool OrderCancelSingleRequest::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("exchange_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("exchange_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setExchangeId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setExchangeId);
            setExchangeId(refVal_setExchangeId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("exchange_order_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("exchange_order_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setExchangeOrderId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setExchangeOrderId);
            setExchangeOrderId(refVal_setExchangeOrderId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("client_order_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("client_order_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setClientOrderId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setClientOrderId);
            setClientOrderId(refVal_setClientOrderId);
        }
    }
    return ok;
}

void OrderCancelSingleRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Exchange_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("exchange_id")), m_Exchange_id));
    }
    if(m_Exchange_order_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("exchange_order_id")), m_Exchange_order_id));
    }
    if(m_Client_order_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("client_order_id")), m_Client_order_id));
    }
}

bool OrderCancelSingleRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("exchange_id"))))
    {
        utility::string_t refVal_setExchangeId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("exchange_id"))), refVal_setExchangeId );
        setExchangeId(refVal_setExchangeId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("exchange_order_id"))))
    {
        utility::string_t refVal_setExchangeOrderId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("exchange_order_id"))), refVal_setExchangeOrderId );
        setExchangeOrderId(refVal_setExchangeOrderId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("client_order_id"))))
    {
        utility::string_t refVal_setClientOrderId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("client_order_id"))), refVal_setClientOrderId );
        setClientOrderId(refVal_setClientOrderId);
    }
    return ok;
}

utility::string_t OrderCancelSingleRequest::getExchangeId() const
{
    return m_Exchange_id;
}

void OrderCancelSingleRequest::setExchangeId(const utility::string_t& value)
{
    m_Exchange_id = value;
    m_Exchange_idIsSet = true;
}

bool OrderCancelSingleRequest::exchangeIdIsSet() const
{
    return m_Exchange_idIsSet;
}

void OrderCancelSingleRequest::unsetExchange_id()
{
    m_Exchange_idIsSet = false;
}
utility::string_t OrderCancelSingleRequest::getExchangeOrderId() const
{
    return m_Exchange_order_id;
}

void OrderCancelSingleRequest::setExchangeOrderId(const utility::string_t& value)
{
    m_Exchange_order_id = value;
    m_Exchange_order_idIsSet = true;
}

bool OrderCancelSingleRequest::exchangeOrderIdIsSet() const
{
    return m_Exchange_order_idIsSet;
}

void OrderCancelSingleRequest::unsetExchange_order_id()
{
    m_Exchange_order_idIsSet = false;
}
utility::string_t OrderCancelSingleRequest::getClientOrderId() const
{
    return m_Client_order_id;
}

void OrderCancelSingleRequest::setClientOrderId(const utility::string_t& value)
{
    m_Client_order_id = value;
    m_Client_order_idIsSet = true;
}

bool OrderCancelSingleRequest::clientOrderIdIsSet() const
{
    return m_Client_order_idIsSet;
}

void OrderCancelSingleRequest::unsetClient_order_id()
{
    m_Client_order_idIsSet = false;
}
}
}
}
}


