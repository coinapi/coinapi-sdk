/**
 * OEML - REST API
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol. <br/> This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       <br/><br/> Implemented Standards:   * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)  * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)  * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540) 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.3.0.
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


