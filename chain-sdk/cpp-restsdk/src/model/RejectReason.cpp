/**
 * EMS - REST API
 * This section will provide necessary information about the `CoinAPI EMS REST API` protocol. <br/> This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       <br/><br/> Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  <br/><br/> If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: <br/><br/> `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this:  <br/><br/> `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.2.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/RejectReason.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

RejectReason::eRejectReason toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("OTHER")))
        return RejectReason::eRejectReason::RejectReason_OTHER;
    if (val == utility::conversions::to_string_t(U("EXCHANGE_UNREACHABLE")))
        return RejectReason::eRejectReason::RejectReason_EXCHANGE_UNREACHABLE;
    if (val == utility::conversions::to_string_t(U("EXCHANGE_RESPONSE_TIMEOUT")))
        return RejectReason::eRejectReason::RejectReason_EXCHANGE_RESPONSE_TIMEOUT;
    if (val == utility::conversions::to_string_t(U("ORDER_ID_NOT_FOUND")))
        return RejectReason::eRejectReason::RejectReason_ORDER_ID_NOT_FOUND;
    if (val == utility::conversions::to_string_t(U("INVALID_TYPE")))
        return RejectReason::eRejectReason::RejectReason_INVALID_TYPE;
    if (val == utility::conversions::to_string_t(U("METHOD_NOT_SUPPORTED")))
        return RejectReason::eRejectReason::RejectReason_METHOD_NOT_SUPPORTED;
    if (val == utility::conversions::to_string_t(U("JSON_ERROR")))
        return RejectReason::eRejectReason::RejectReason_JSON_ERROR;
    return {};
}

EnumUnderlyingType fromEnum(RejectReason::eRejectReason e)
{
    switch (e)
    {
    case RejectReason::eRejectReason::RejectReason_OTHER:
        return U("OTHER");
    case RejectReason::eRejectReason::RejectReason_EXCHANGE_UNREACHABLE:
        return U("EXCHANGE_UNREACHABLE");
    case RejectReason::eRejectReason::RejectReason_EXCHANGE_RESPONSE_TIMEOUT:
        return U("EXCHANGE_RESPONSE_TIMEOUT");
    case RejectReason::eRejectReason::RejectReason_ORDER_ID_NOT_FOUND:
        return U("ORDER_ID_NOT_FOUND");
    case RejectReason::eRejectReason::RejectReason_INVALID_TYPE:
        return U("INVALID_TYPE");
    case RejectReason::eRejectReason::RejectReason_METHOD_NOT_SUPPORTED:
        return U("METHOD_NOT_SUPPORTED");
    case RejectReason::eRejectReason::RejectReason_JSON_ERROR:
        return U("JSON_ERROR");
    default:
        break;
    }
    return {};
}
}

RejectReason::RejectReason()
{
}

RejectReason::~RejectReason()
{
}

void RejectReason::validate()
{
    // TODO: implement validation
}

web::json::value RejectReason::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool RejectReason::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void RejectReason::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool RejectReason::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

RejectReason::eRejectReason RejectReason::getValue() const
{
   return m_value;
}

void RejectReason::setValue(RejectReason::eRejectReason const value)
{
   m_value = value;
}


}
}
}
}

