/**
 * On Chain Dapps - REST API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.6.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/Curve_GaugeWithdrawDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Curve_GaugeWithdrawDTO::Curve_GaugeWithdrawDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Gauge = utility::conversions::to_string_t("");
    m_GaugeIsSet = false;
    m_Provider = utility::conversions::to_string_t("");
    m_ProviderIsSet = false;
    m_Value = utility::conversions::to_string_t("");
    m_ValueIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

Curve_GaugeWithdrawDTO::~Curve_GaugeWithdrawDTO()
{
}

void Curve_GaugeWithdrawDTO::validate()
{
    // TODO: implement validation
}

web::json::value Curve_GaugeWithdrawDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Entry_timeIsSet)
    {
        val[utility::conversions::to_string_t(U("entry_time"))] = ModelBase::toJson(m_Entry_time);
    }
    if(m_Recv_timeIsSet)
    {
        val[utility::conversions::to_string_t(U("recv_time"))] = ModelBase::toJson(m_Recv_time);
    }
    if(m_Block_numberIsSet)
    {
        val[utility::conversions::to_string_t(U("block_number"))] = ModelBase::toJson(m_Block_number);
    }
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_GaugeIsSet)
    {
        val[utility::conversions::to_string_t(U("gauge"))] = ModelBase::toJson(m_Gauge);
    }
    if(m_ProviderIsSet)
    {
        val[utility::conversions::to_string_t(U("provider"))] = ModelBase::toJson(m_Provider);
    }
    if(m_ValueIsSet)
    {
        val[utility::conversions::to_string_t(U("value"))] = ModelBase::toJson(m_Value);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }

    return val;
}

bool Curve_GaugeWithdrawDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("entry_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("entry_time")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setEntryTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEntryTime);
            setEntryTime(refVal_setEntryTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("recv_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("recv_time")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setRecvTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRecvTime);
            setRecvTime(refVal_setRecvTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("block_number"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("block_number")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setBlockNumber;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBlockNumber);
            setBlockNumber(refVal_setBlockNumber);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("gauge"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("gauge")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setGauge;
            ok &= ModelBase::fromJson(fieldValue, refVal_setGauge);
            setGauge(refVal_setGauge);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("provider"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("provider")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setProvider;
            ok &= ModelBase::fromJson(fieldValue, refVal_setProvider);
            setProvider(refVal_setProvider);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("value"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("value")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setValue;
            ok &= ModelBase::fromJson(fieldValue, refVal_setValue);
            setValue(refVal_setValue);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("vid"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("vid")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setVid;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVid);
            setVid(refVal_setVid);
        }
    }
    return ok;
}

void Curve_GaugeWithdrawDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Entry_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("entry_time")), m_Entry_time));
    }
    if(m_Recv_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("recv_time")), m_Recv_time));
    }
    if(m_Block_numberIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("block_number")), m_Block_number));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_GaugeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("gauge")), m_Gauge));
    }
    if(m_ProviderIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("provider")), m_Provider));
    }
    if(m_ValueIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("value")), m_Value));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
}

bool Curve_GaugeWithdrawDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("entry_time"))))
    {
        utility::datetime refVal_setEntryTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("entry_time"))), refVal_setEntryTime );
        setEntryTime(refVal_setEntryTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("recv_time"))))
    {
        utility::datetime refVal_setRecvTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("recv_time"))), refVal_setRecvTime );
        setRecvTime(refVal_setRecvTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("block_number"))))
    {
        int64_t refVal_setBlockNumber;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("block_number"))), refVal_setBlockNumber );
        setBlockNumber(refVal_setBlockNumber);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("gauge"))))
    {
        utility::string_t refVal_setGauge;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("gauge"))), refVal_setGauge );
        setGauge(refVal_setGauge);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("provider"))))
    {
        utility::string_t refVal_setProvider;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("provider"))), refVal_setProvider );
        setProvider(refVal_setProvider);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("value"))))
    {
        utility::string_t refVal_setValue;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("value"))), refVal_setValue );
        setValue(refVal_setValue);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    return ok;
}

utility::datetime Curve_GaugeWithdrawDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Curve_GaugeWithdrawDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Curve_GaugeWithdrawDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Curve_GaugeWithdrawDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Curve_GaugeWithdrawDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Curve_GaugeWithdrawDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Curve_GaugeWithdrawDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Curve_GaugeWithdrawDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Curve_GaugeWithdrawDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Curve_GaugeWithdrawDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Curve_GaugeWithdrawDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Curve_GaugeWithdrawDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Curve_GaugeWithdrawDTO::getId() const
{
    return m_Id;
}

void Curve_GaugeWithdrawDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Curve_GaugeWithdrawDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Curve_GaugeWithdrawDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Curve_GaugeWithdrawDTO::getGauge() const
{
    return m_Gauge;
}

void Curve_GaugeWithdrawDTO::setGauge(const utility::string_t& value)
{
    m_Gauge = value;
    m_GaugeIsSet = true;
}

bool Curve_GaugeWithdrawDTO::gaugeIsSet() const
{
    return m_GaugeIsSet;
}

void Curve_GaugeWithdrawDTO::unsetGauge()
{
    m_GaugeIsSet = false;
}
utility::string_t Curve_GaugeWithdrawDTO::getProvider() const
{
    return m_Provider;
}

void Curve_GaugeWithdrawDTO::setProvider(const utility::string_t& value)
{
    m_Provider = value;
    m_ProviderIsSet = true;
}

bool Curve_GaugeWithdrawDTO::providerIsSet() const
{
    return m_ProviderIsSet;
}

void Curve_GaugeWithdrawDTO::unsetProvider()
{
    m_ProviderIsSet = false;
}
utility::string_t Curve_GaugeWithdrawDTO::getValue() const
{
    return m_Value;
}

void Curve_GaugeWithdrawDTO::setValue(const utility::string_t& value)
{
    m_Value = value;
    m_ValueIsSet = true;
}

bool Curve_GaugeWithdrawDTO::valueIsSet() const
{
    return m_ValueIsSet;
}

void Curve_GaugeWithdrawDTO::unsetValue()
{
    m_ValueIsSet = false;
}
int64_t Curve_GaugeWithdrawDTO::getVid() const
{
    return m_Vid;
}

void Curve_GaugeWithdrawDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Curve_GaugeWithdrawDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Curve_GaugeWithdrawDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


