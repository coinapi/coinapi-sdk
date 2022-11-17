/**
 * OnChain API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.2.1.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/UniswapV3_TokenV3DayDataDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



UniswapV3_TokenV3DayDataDTO::UniswapV3_TokenV3DayDataDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_date = 0;
    m_dateIsSet = false;
    m_Token = utility::conversions::to_string_t("");
    m_TokenIsSet = false;
    m_Volume = utility::conversions::to_string_t("");
    m_VolumeIsSet = false;
    m_Volume_usd = utility::conversions::to_string_t("");
    m_Volume_usdIsSet = false;
    m_Untracked_volume_usd = utility::conversions::to_string_t("");
    m_Untracked_volume_usdIsSet = false;
    m_Total_value_locked = utility::conversions::to_string_t("");
    m_Total_value_lockedIsSet = false;
    m_Total_value_locked_usd = utility::conversions::to_string_t("");
    m_Total_value_locked_usdIsSet = false;
    m_Price_usd = utility::conversions::to_string_t("");
    m_Price_usdIsSet = false;
    m_Fees_usd = utility::conversions::to_string_t("");
    m_Fees_usdIsSet = false;
    m_Open = utility::conversions::to_string_t("");
    m_OpenIsSet = false;
    m_High = utility::conversions::to_string_t("");
    m_HighIsSet = false;
    m_Low = utility::conversions::to_string_t("");
    m_LowIsSet = false;
    m_Close = utility::conversions::to_string_t("");
    m_CloseIsSet = false;
}

UniswapV3_TokenV3DayDataDTO::~UniswapV3_TokenV3DayDataDTO()
{
}

void UniswapV3_TokenV3DayDataDTO::validate()
{
    // TODO: implement validation
}

web::json::value UniswapV3_TokenV3DayDataDTO::toJson() const
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
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_dateIsSet)
    {
        val[utility::conversions::to_string_t(U("date"))] = ModelBase::toJson(m_date);
    }
    if(m_TokenIsSet)
    {
        val[utility::conversions::to_string_t(U("token"))] = ModelBase::toJson(m_Token);
    }
    if(m_VolumeIsSet)
    {
        val[utility::conversions::to_string_t(U("volume"))] = ModelBase::toJson(m_Volume);
    }
    if(m_Volume_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("volume_usd"))] = ModelBase::toJson(m_Volume_usd);
    }
    if(m_Untracked_volume_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("untracked_volume_usd"))] = ModelBase::toJson(m_Untracked_volume_usd);
    }
    if(m_Total_value_lockedIsSet)
    {
        val[utility::conversions::to_string_t(U("total_value_locked"))] = ModelBase::toJson(m_Total_value_locked);
    }
    if(m_Total_value_locked_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("total_value_locked_usd"))] = ModelBase::toJson(m_Total_value_locked_usd);
    }
    if(m_Price_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("price_usd"))] = ModelBase::toJson(m_Price_usd);
    }
    if(m_Fees_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("fees_usd"))] = ModelBase::toJson(m_Fees_usd);
    }
    if(m_OpenIsSet)
    {
        val[utility::conversions::to_string_t(U("open"))] = ModelBase::toJson(m_Open);
    }
    if(m_HighIsSet)
    {
        val[utility::conversions::to_string_t(U("high"))] = ModelBase::toJson(m_High);
    }
    if(m_LowIsSet)
    {
        val[utility::conversions::to_string_t(U("low"))] = ModelBase::toJson(m_Low);
    }
    if(m_CloseIsSet)
    {
        val[utility::conversions::to_string_t(U("close"))] = ModelBase::toJson(m_Close);
    }

    return val;
}

bool UniswapV3_TokenV3DayDataDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("date"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("date")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setDate;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDate);
            setDate(refVal_setDate);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("token"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("token")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setToken;
            ok &= ModelBase::fromJson(fieldValue, refVal_setToken);
            setToken(refVal_setToken);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("volume"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("volume")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setVolume;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVolume);
            setVolume(refVal_setVolume);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("volume_usd"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("volume_usd")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setVolumeUsd;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVolumeUsd);
            setVolumeUsd(refVal_setVolumeUsd);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("untracked_volume_usd"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("untracked_volume_usd")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setUntrackedVolumeUsd;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUntrackedVolumeUsd);
            setUntrackedVolumeUsd(refVal_setUntrackedVolumeUsd);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("total_value_locked"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("total_value_locked")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTotalValueLocked;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTotalValueLocked);
            setTotalValueLocked(refVal_setTotalValueLocked);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("total_value_locked_usd"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("total_value_locked_usd")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTotalValueLockedUsd;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTotalValueLockedUsd);
            setTotalValueLockedUsd(refVal_setTotalValueLockedUsd);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("price_usd"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("price_usd")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPriceUsd;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPriceUsd);
            setPriceUsd(refVal_setPriceUsd);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("fees_usd"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("fees_usd")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setFeesUsd;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFeesUsd);
            setFeesUsd(refVal_setFeesUsd);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("open"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("open")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setOpen;
            ok &= ModelBase::fromJson(fieldValue, refVal_setOpen);
            setOpen(refVal_setOpen);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("high"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("high")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setHigh;
            ok &= ModelBase::fromJson(fieldValue, refVal_setHigh);
            setHigh(refVal_setHigh);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("low"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("low")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setLow;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLow);
            setLow(refVal_setLow);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("close"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("close")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setClose;
            ok &= ModelBase::fromJson(fieldValue, refVal_setClose);
            setClose(refVal_setClose);
        }
    }
    return ok;
}

void UniswapV3_TokenV3DayDataDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_dateIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("date")), m_date));
    }
    if(m_TokenIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token")), m_Token));
    }
    if(m_VolumeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("volume")), m_Volume));
    }
    if(m_Volume_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("volume_usd")), m_Volume_usd));
    }
    if(m_Untracked_volume_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("untracked_volume_usd")), m_Untracked_volume_usd));
    }
    if(m_Total_value_lockedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("total_value_locked")), m_Total_value_locked));
    }
    if(m_Total_value_locked_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("total_value_locked_usd")), m_Total_value_locked_usd));
    }
    if(m_Price_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("price_usd")), m_Price_usd));
    }
    if(m_Fees_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("fees_usd")), m_Fees_usd));
    }
    if(m_OpenIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("open")), m_Open));
    }
    if(m_HighIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("high")), m_High));
    }
    if(m_LowIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("low")), m_Low));
    }
    if(m_CloseIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("close")), m_Close));
    }
}

bool UniswapV3_TokenV3DayDataDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("date"))))
    {
        int32_t refVal_setDate;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("date"))), refVal_setDate );
        setDate(refVal_setDate);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("token"))))
    {
        utility::string_t refVal_setToken;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("token"))), refVal_setToken );
        setToken(refVal_setToken);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("volume"))))
    {
        utility::string_t refVal_setVolume;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("volume"))), refVal_setVolume );
        setVolume(refVal_setVolume);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("volume_usd"))))
    {
        utility::string_t refVal_setVolumeUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("volume_usd"))), refVal_setVolumeUsd );
        setVolumeUsd(refVal_setVolumeUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("untracked_volume_usd"))))
    {
        utility::string_t refVal_setUntrackedVolumeUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("untracked_volume_usd"))), refVal_setUntrackedVolumeUsd );
        setUntrackedVolumeUsd(refVal_setUntrackedVolumeUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("total_value_locked"))))
    {
        utility::string_t refVal_setTotalValueLocked;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("total_value_locked"))), refVal_setTotalValueLocked );
        setTotalValueLocked(refVal_setTotalValueLocked);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("total_value_locked_usd"))))
    {
        utility::string_t refVal_setTotalValueLockedUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("total_value_locked_usd"))), refVal_setTotalValueLockedUsd );
        setTotalValueLockedUsd(refVal_setTotalValueLockedUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("price_usd"))))
    {
        utility::string_t refVal_setPriceUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("price_usd"))), refVal_setPriceUsd );
        setPriceUsd(refVal_setPriceUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("fees_usd"))))
    {
        utility::string_t refVal_setFeesUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("fees_usd"))), refVal_setFeesUsd );
        setFeesUsd(refVal_setFeesUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("open"))))
    {
        utility::string_t refVal_setOpen;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("open"))), refVal_setOpen );
        setOpen(refVal_setOpen);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("high"))))
    {
        utility::string_t refVal_setHigh;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("high"))), refVal_setHigh );
        setHigh(refVal_setHigh);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("low"))))
    {
        utility::string_t refVal_setLow;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("low"))), refVal_setLow );
        setLow(refVal_setLow);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("close"))))
    {
        utility::string_t refVal_setClose;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("close"))), refVal_setClose );
        setClose(refVal_setClose);
    }
    return ok;
}

utility::datetime UniswapV3_TokenV3DayDataDTO::getEntryTime() const
{
    return m_Entry_time;
}

void UniswapV3_TokenV3DayDataDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool UniswapV3_TokenV3DayDataDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void UniswapV3_TokenV3DayDataDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime UniswapV3_TokenV3DayDataDTO::getRecvTime() const
{
    return m_Recv_time;
}

void UniswapV3_TokenV3DayDataDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool UniswapV3_TokenV3DayDataDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void UniswapV3_TokenV3DayDataDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t UniswapV3_TokenV3DayDataDTO::getBlockNumber() const
{
    return m_Block_number;
}

void UniswapV3_TokenV3DayDataDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool UniswapV3_TokenV3DayDataDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void UniswapV3_TokenV3DayDataDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
int64_t UniswapV3_TokenV3DayDataDTO::getVid() const
{
    return m_Vid;
}

void UniswapV3_TokenV3DayDataDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool UniswapV3_TokenV3DayDataDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void UniswapV3_TokenV3DayDataDTO::unsetVid()
{
    m_VidIsSet = false;
}
utility::string_t UniswapV3_TokenV3DayDataDTO::getId() const
{
    return m_Id;
}

void UniswapV3_TokenV3DayDataDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool UniswapV3_TokenV3DayDataDTO::idIsSet() const
{
    return m_IdIsSet;
}

void UniswapV3_TokenV3DayDataDTO::unsetId()
{
    m_IdIsSet = false;
}
int32_t UniswapV3_TokenV3DayDataDTO::getDate() const
{
    return m_date;
}

void UniswapV3_TokenV3DayDataDTO::setDate(int32_t value)
{
    m_date = value;
    m_dateIsSet = true;
}

bool UniswapV3_TokenV3DayDataDTO::dateIsSet() const
{
    return m_dateIsSet;
}

void UniswapV3_TokenV3DayDataDTO::unsetdate()
{
    m_dateIsSet = false;
}
utility::string_t UniswapV3_TokenV3DayDataDTO::getToken() const
{
    return m_Token;
}

void UniswapV3_TokenV3DayDataDTO::setToken(const utility::string_t& value)
{
    m_Token = value;
    m_TokenIsSet = true;
}

bool UniswapV3_TokenV3DayDataDTO::tokenIsSet() const
{
    return m_TokenIsSet;
}

void UniswapV3_TokenV3DayDataDTO::unsetToken()
{
    m_TokenIsSet = false;
}
utility::string_t UniswapV3_TokenV3DayDataDTO::getVolume() const
{
    return m_Volume;
}

void UniswapV3_TokenV3DayDataDTO::setVolume(const utility::string_t& value)
{
    m_Volume = value;
    m_VolumeIsSet = true;
}

bool UniswapV3_TokenV3DayDataDTO::volumeIsSet() const
{
    return m_VolumeIsSet;
}

void UniswapV3_TokenV3DayDataDTO::unsetVolume()
{
    m_VolumeIsSet = false;
}
utility::string_t UniswapV3_TokenV3DayDataDTO::getVolumeUsd() const
{
    return m_Volume_usd;
}

void UniswapV3_TokenV3DayDataDTO::setVolumeUsd(const utility::string_t& value)
{
    m_Volume_usd = value;
    m_Volume_usdIsSet = true;
}

bool UniswapV3_TokenV3DayDataDTO::volumeUsdIsSet() const
{
    return m_Volume_usdIsSet;
}

void UniswapV3_TokenV3DayDataDTO::unsetVolume_usd()
{
    m_Volume_usdIsSet = false;
}
utility::string_t UniswapV3_TokenV3DayDataDTO::getUntrackedVolumeUsd() const
{
    return m_Untracked_volume_usd;
}

void UniswapV3_TokenV3DayDataDTO::setUntrackedVolumeUsd(const utility::string_t& value)
{
    m_Untracked_volume_usd = value;
    m_Untracked_volume_usdIsSet = true;
}

bool UniswapV3_TokenV3DayDataDTO::untrackedVolumeUsdIsSet() const
{
    return m_Untracked_volume_usdIsSet;
}

void UniswapV3_TokenV3DayDataDTO::unsetUntracked_volume_usd()
{
    m_Untracked_volume_usdIsSet = false;
}
utility::string_t UniswapV3_TokenV3DayDataDTO::getTotalValueLocked() const
{
    return m_Total_value_locked;
}

void UniswapV3_TokenV3DayDataDTO::setTotalValueLocked(const utility::string_t& value)
{
    m_Total_value_locked = value;
    m_Total_value_lockedIsSet = true;
}

bool UniswapV3_TokenV3DayDataDTO::totalValueLockedIsSet() const
{
    return m_Total_value_lockedIsSet;
}

void UniswapV3_TokenV3DayDataDTO::unsetTotal_value_locked()
{
    m_Total_value_lockedIsSet = false;
}
utility::string_t UniswapV3_TokenV3DayDataDTO::getTotalValueLockedUsd() const
{
    return m_Total_value_locked_usd;
}

void UniswapV3_TokenV3DayDataDTO::setTotalValueLockedUsd(const utility::string_t& value)
{
    m_Total_value_locked_usd = value;
    m_Total_value_locked_usdIsSet = true;
}

bool UniswapV3_TokenV3DayDataDTO::totalValueLockedUsdIsSet() const
{
    return m_Total_value_locked_usdIsSet;
}

void UniswapV3_TokenV3DayDataDTO::unsetTotal_value_locked_usd()
{
    m_Total_value_locked_usdIsSet = false;
}
utility::string_t UniswapV3_TokenV3DayDataDTO::getPriceUsd() const
{
    return m_Price_usd;
}

void UniswapV3_TokenV3DayDataDTO::setPriceUsd(const utility::string_t& value)
{
    m_Price_usd = value;
    m_Price_usdIsSet = true;
}

bool UniswapV3_TokenV3DayDataDTO::priceUsdIsSet() const
{
    return m_Price_usdIsSet;
}

void UniswapV3_TokenV3DayDataDTO::unsetPrice_usd()
{
    m_Price_usdIsSet = false;
}
utility::string_t UniswapV3_TokenV3DayDataDTO::getFeesUsd() const
{
    return m_Fees_usd;
}

void UniswapV3_TokenV3DayDataDTO::setFeesUsd(const utility::string_t& value)
{
    m_Fees_usd = value;
    m_Fees_usdIsSet = true;
}

bool UniswapV3_TokenV3DayDataDTO::feesUsdIsSet() const
{
    return m_Fees_usdIsSet;
}

void UniswapV3_TokenV3DayDataDTO::unsetFees_usd()
{
    m_Fees_usdIsSet = false;
}
utility::string_t UniswapV3_TokenV3DayDataDTO::getOpen() const
{
    return m_Open;
}

void UniswapV3_TokenV3DayDataDTO::setOpen(const utility::string_t& value)
{
    m_Open = value;
    m_OpenIsSet = true;
}

bool UniswapV3_TokenV3DayDataDTO::openIsSet() const
{
    return m_OpenIsSet;
}

void UniswapV3_TokenV3DayDataDTO::unsetOpen()
{
    m_OpenIsSet = false;
}
utility::string_t UniswapV3_TokenV3DayDataDTO::getHigh() const
{
    return m_High;
}

void UniswapV3_TokenV3DayDataDTO::setHigh(const utility::string_t& value)
{
    m_High = value;
    m_HighIsSet = true;
}

bool UniswapV3_TokenV3DayDataDTO::highIsSet() const
{
    return m_HighIsSet;
}

void UniswapV3_TokenV3DayDataDTO::unsetHigh()
{
    m_HighIsSet = false;
}
utility::string_t UniswapV3_TokenV3DayDataDTO::getLow() const
{
    return m_Low;
}

void UniswapV3_TokenV3DayDataDTO::setLow(const utility::string_t& value)
{
    m_Low = value;
    m_LowIsSet = true;
}

bool UniswapV3_TokenV3DayDataDTO::lowIsSet() const
{
    return m_LowIsSet;
}

void UniswapV3_TokenV3DayDataDTO::unsetLow()
{
    m_LowIsSet = false;
}
utility::string_t UniswapV3_TokenV3DayDataDTO::getClose() const
{
    return m_Close;
}

void UniswapV3_TokenV3DayDataDTO::setClose(const utility::string_t& value)
{
    m_Close = value;
    m_CloseIsSet = true;
}

bool UniswapV3_TokenV3DayDataDTO::closeIsSet() const
{
    return m_CloseIsSet;
}

void UniswapV3_TokenV3DayDataDTO::unsetClose()
{
    m_CloseIsSet = false;
}
}
}
}
}

