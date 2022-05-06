/**
 * EMS - REST API
 * This section will provide necessary information about the `CoinAPI EMS REST API` protocol. <br/> This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       <br/><br/> Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  <br/><br/> If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: <br/><br/> `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this:  <br/><br/> `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "OrdStatus.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



namespace
{
using EnumUnderlyingType = utility::string_t;

OrdStatus::eOrdStatus toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("RECEIVED")))
        return OrdStatus::eOrdStatus::OrdStatus_RECEIVED;
    if (val == utility::conversions::to_string_t(U("ROUTING")))
        return OrdStatus::eOrdStatus::OrdStatus_ROUTING;
    if (val == utility::conversions::to_string_t(U("ROUTED")))
        return OrdStatus::eOrdStatus::OrdStatus_ROUTED;
    if (val == utility::conversions::to_string_t(U("NEW")))
        return OrdStatus::eOrdStatus::OrdStatus_NEW;
    if (val == utility::conversions::to_string_t(U("PENDING_CANCEL")))
        return OrdStatus::eOrdStatus::OrdStatus_PENDING_CANCEL;
    if (val == utility::conversions::to_string_t(U("PARTIALLY_FILLED")))
        return OrdStatus::eOrdStatus::OrdStatus_PARTIALLY_FILLED;
    if (val == utility::conversions::to_string_t(U("FILLED")))
        return OrdStatus::eOrdStatus::OrdStatus_FILLED;
    if (val == utility::conversions::to_string_t(U("CANCELED")))
        return OrdStatus::eOrdStatus::OrdStatus_CANCELED;
    if (val == utility::conversions::to_string_t(U("REJECTED")))
        return OrdStatus::eOrdStatus::OrdStatus_REJECTED;
    return {};
}

EnumUnderlyingType fromEnum(OrdStatus::eOrdStatus e)
{
    switch (e)
    {
    case OrdStatus::eOrdStatus::OrdStatus_RECEIVED:
        return U("RECEIVED");
    case OrdStatus::eOrdStatus::OrdStatus_ROUTING:
        return U("ROUTING");
    case OrdStatus::eOrdStatus::OrdStatus_ROUTED:
        return U("ROUTED");
    case OrdStatus::eOrdStatus::OrdStatus_NEW:
        return U("NEW");
    case OrdStatus::eOrdStatus::OrdStatus_PENDING_CANCEL:
        return U("PENDING_CANCEL");
    case OrdStatus::eOrdStatus::OrdStatus_PARTIALLY_FILLED:
        return U("PARTIALLY_FILLED");
    case OrdStatus::eOrdStatus::OrdStatus_FILLED:
        return U("FILLED");
    case OrdStatus::eOrdStatus::OrdStatus_CANCELED:
        return U("CANCELED");
    case OrdStatus::eOrdStatus::OrdStatus_REJECTED:
        return U("REJECTED");
    default:
        break;
    }
    return {};
}
}

OrdStatus::OrdStatus()
{
}

OrdStatus::~OrdStatus()
{
}

void OrdStatus::validate()
{
    // TODO: implement validation
}

web::json::value OrdStatus::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool OrdStatus::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void OrdStatus::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool OrdStatus::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }
    {
        EnumUnderlyingType e;
        ok = ModelBase::fromHttpContent(multipart->getContent(namePrefix), e);
        if (ok)
        {
            auto v = toEnum(e);
            setValue(v);
        }
    }
    return ok;
}

OrdStatus::eOrdStatus OrdStatus::getValue() const
{
   return m_value;
}

void OrdStatus::setValue(OrdStatus::eOrdStatus const value)
{
   m_value = value;
}


}
}
}
}


