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



#include "Balance.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




Balance::Balance()
{
    m_Exchange_id = utility::conversions::to_string_t("");
    m_Exchange_idIsSet = false;
    m_DataIsSet = false;
}

Balance::~Balance()
{
}

void Balance::validate()
{
    // TODO: implement validation
}

web::json::value Balance::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Exchange_idIsSet)
    {
        val[utility::conversions::to_string_t(U("exchange_id"))] = ModelBase::toJson(m_Exchange_id);
    }
    if(m_DataIsSet)
    {
        val[utility::conversions::to_string_t(U("data"))] = ModelBase::toJson(m_Data);
    }

    return val;
}

bool Balance::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("exchange_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("exchange_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_exchange_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_exchange_id);
            setExchangeId(refVal_exchange_id);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("data"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("data")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<Balance_data>> refVal_data;
            ok &= ModelBase::fromJson(fieldValue, refVal_data);
            setData(refVal_data);
        }
    }
    return ok;
}

void Balance::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_DataIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("data")), m_Data));
    }
}

bool Balance::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("exchange_id"))))
    {
        utility::string_t refVal_exchange_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("exchange_id"))), refVal_exchange_id );
        setExchangeId(refVal_exchange_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("data"))))
    {
        std::vector<std::shared_ptr<Balance_data>> refVal_data;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("data"))), refVal_data );
        setData(refVal_data);
    }
    return ok;
}

utility::string_t Balance::getExchangeId() const
{
    return m_Exchange_id;
}

void Balance::setExchangeId(const utility::string_t& value)
{
    m_Exchange_id = value;
    m_Exchange_idIsSet = true;
}

bool Balance::exchangeIdIsSet() const
{
    return m_Exchange_idIsSet;
}

void Balance::unsetExchange_id()
{
    m_Exchange_idIsSet = false;
}
std::vector<std::shared_ptr<Balance_data>>& Balance::getData()
{
    return m_Data;
}

void Balance::setData(const std::vector<std::shared_ptr<Balance_data>>& value)
{
    m_Data = value;
    m_DataIsSet = true;
}

bool Balance::dataIsSet() const
{
    return m_DataIsSet;
}

void Balance::unsetData()
{
    m_DataIsSet = false;
}
}
}
}
}


