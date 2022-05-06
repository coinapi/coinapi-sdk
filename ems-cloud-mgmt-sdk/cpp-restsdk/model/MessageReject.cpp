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



#include "MessageReject.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




MessageReject::MessageReject()
{
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_Reject_reasonIsSet = false;
    m_Exchange_id = utility::conversions::to_string_t("");
    m_Exchange_idIsSet = false;
    m_Message = utility::conversions::to_string_t("");
    m_MessageIsSet = false;
    m_Rejected_message = utility::conversions::to_string_t("");
    m_Rejected_messageIsSet = false;
}

MessageReject::~MessageReject()
{
}

void MessageReject::validate()
{
    // TODO: implement validation
}

web::json::value MessageReject::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_Reject_reasonIsSet)
    {
        val[utility::conversions::to_string_t(U("reject_reason"))] = ModelBase::toJson(m_Reject_reason);
    }
    if(m_Exchange_idIsSet)
    {
        val[utility::conversions::to_string_t(U("exchange_id"))] = ModelBase::toJson(m_Exchange_id);
    }
    if(m_MessageIsSet)
    {
        val[utility::conversions::to_string_t(U("message"))] = ModelBase::toJson(m_Message);
    }
    if(m_Rejected_messageIsSet)
    {
        val[utility::conversions::to_string_t(U("rejected_message"))] = ModelBase::toJson(m_Rejected_message);
    }

    return val;
}

bool MessageReject::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("type")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_type;
            ok &= ModelBase::fromJson(fieldValue, refVal_type);
            setType(refVal_type);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("reject_reason"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("reject_reason")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<RejectReason> refVal_reject_reason;
            ok &= ModelBase::fromJson(fieldValue, refVal_reject_reason);
            setRejectReason(refVal_reject_reason);
        }
    }
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
    if(val.has_field(utility::conversions::to_string_t(U("message"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("message")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_message;
            ok &= ModelBase::fromJson(fieldValue, refVal_message);
            setMessage(refVal_message);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("rejected_message"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("rejected_message")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_rejected_message;
            ok &= ModelBase::fromJson(fieldValue, refVal_rejected_message);
            setRejectedMessage(refVal_rejected_message);
        }
    }
    return ok;
}

void MessageReject::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
    if(m_Reject_reasonIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("reject_reason")), m_Reject_reason));
    }
    if(m_Exchange_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("exchange_id")), m_Exchange_id));
    }
    if(m_MessageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("message")), m_Message));
    }
    if(m_Rejected_messageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("rejected_message")), m_Rejected_message));
    }
}

bool MessageReject::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("type"))))
    {
        utility::string_t refVal_type;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("type"))), refVal_type );
        setType(refVal_type);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("reject_reason"))))
    {
        std::shared_ptr<RejectReason> refVal_reject_reason;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("reject_reason"))), refVal_reject_reason );
        setRejectReason(refVal_reject_reason);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("exchange_id"))))
    {
        utility::string_t refVal_exchange_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("exchange_id"))), refVal_exchange_id );
        setExchangeId(refVal_exchange_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("message"))))
    {
        utility::string_t refVal_message;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("message"))), refVal_message );
        setMessage(refVal_message);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("rejected_message"))))
    {
        utility::string_t refVal_rejected_message;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("rejected_message"))), refVal_rejected_message );
        setRejectedMessage(refVal_rejected_message);
    }
    return ok;
}

utility::string_t MessageReject::getType() const
{
    return m_Type;
}

void MessageReject::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool MessageReject::typeIsSet() const
{
    return m_TypeIsSet;
}

void MessageReject::unsetType()
{
    m_TypeIsSet = false;
}
std::shared_ptr<RejectReason> MessageReject::getRejectReason() const
{
    return m_Reject_reason;
}

void MessageReject::setRejectReason(const std::shared_ptr<RejectReason>& value)
{
    m_Reject_reason = value;
    m_Reject_reasonIsSet = true;
}

bool MessageReject::rejectReasonIsSet() const
{
    return m_Reject_reasonIsSet;
}

void MessageReject::unsetReject_reason()
{
    m_Reject_reasonIsSet = false;
}
utility::string_t MessageReject::getExchangeId() const
{
    return m_Exchange_id;
}

void MessageReject::setExchangeId(const utility::string_t& value)
{
    m_Exchange_id = value;
    m_Exchange_idIsSet = true;
}

bool MessageReject::exchangeIdIsSet() const
{
    return m_Exchange_idIsSet;
}

void MessageReject::unsetExchange_id()
{
    m_Exchange_idIsSet = false;
}
utility::string_t MessageReject::getMessage() const
{
    return m_Message;
}

void MessageReject::setMessage(const utility::string_t& value)
{
    m_Message = value;
    m_MessageIsSet = true;
}

bool MessageReject::messageIsSet() const
{
    return m_MessageIsSet;
}

void MessageReject::unsetMessage()
{
    m_MessageIsSet = false;
}
utility::string_t MessageReject::getRejectedMessage() const
{
    return m_Rejected_message;
}

void MessageReject::setRejectedMessage(const utility::string_t& value)
{
    m_Rejected_message = value;
    m_Rejected_messageIsSet = true;
}

bool MessageReject::rejectedMessageIsSet() const
{
    return m_Rejected_messageIsSet;
}

void MessageReject::unsetRejected_message()
{
    m_Rejected_messageIsSet = false;
}
}
}
}
}


