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



#include "CppRestOpenAPIClient/model/Sushiswap_PairDayDataDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Sushiswap_PairDayDataDTO::Sushiswap_PairDayDataDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_date = 0;
    m_dateIsSet = false;
    m_Pair = utility::conversions::to_string_t("");
    m_PairIsSet = false;
    m_Token_0 = utility::conversions::to_string_t("");
    m_Token_0IsSet = false;
    m_Token_1 = utility::conversions::to_string_t("");
    m_Token_1IsSet = false;
    m_Reserve_0 = utility::conversions::to_string_t("");
    m_Reserve_0IsSet = false;
    m_Reserve_1 = utility::conversions::to_string_t("");
    m_Reserve_1IsSet = false;
    m_Total_supply = utility::conversions::to_string_t("");
    m_Total_supplyIsSet = false;
    m_Reserve_usd = utility::conversions::to_string_t("");
    m_Reserve_usdIsSet = false;
    m_Volume_token_0 = utility::conversions::to_string_t("");
    m_Volume_token_0IsSet = false;
    m_Volume_token_1 = utility::conversions::to_string_t("");
    m_Volume_token_1IsSet = false;
    m_Volume_usd = utility::conversions::to_string_t("");
    m_Volume_usdIsSet = false;
    m_Tx_count = utility::conversions::to_string_t("");
    m_Tx_countIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

Sushiswap_PairDayDataDTO::~Sushiswap_PairDayDataDTO()
{
}

void Sushiswap_PairDayDataDTO::validate()
{
    // TODO: implement validation
}

web::json::value Sushiswap_PairDayDataDTO::toJson() const
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
    if(m_dateIsSet)
    {
        val[utility::conversions::to_string_t(U("date"))] = ModelBase::toJson(m_date);
    }
    if(m_PairIsSet)
    {
        val[utility::conversions::to_string_t(U("pair"))] = ModelBase::toJson(m_Pair);
    }
    if(m_Token_0IsSet)
    {
        val[utility::conversions::to_string_t(U("token_0"))] = ModelBase::toJson(m_Token_0);
    }
    if(m_Token_1IsSet)
    {
        val[utility::conversions::to_string_t(U("token_1"))] = ModelBase::toJson(m_Token_1);
    }
    if(m_Reserve_0IsSet)
    {
        val[utility::conversions::to_string_t(U("reserve_0"))] = ModelBase::toJson(m_Reserve_0);
    }
    if(m_Reserve_1IsSet)
    {
        val[utility::conversions::to_string_t(U("reserve_1"))] = ModelBase::toJson(m_Reserve_1);
    }
    if(m_Total_supplyIsSet)
    {
        val[utility::conversions::to_string_t(U("total_supply"))] = ModelBase::toJson(m_Total_supply);
    }
    if(m_Reserve_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("reserve_usd"))] = ModelBase::toJson(m_Reserve_usd);
    }
    if(m_Volume_token_0IsSet)
    {
        val[utility::conversions::to_string_t(U("volume_token_0"))] = ModelBase::toJson(m_Volume_token_0);
    }
    if(m_Volume_token_1IsSet)
    {
        val[utility::conversions::to_string_t(U("volume_token_1"))] = ModelBase::toJson(m_Volume_token_1);
    }
    if(m_Volume_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("volume_usd"))] = ModelBase::toJson(m_Volume_usd);
    }
    if(m_Tx_countIsSet)
    {
        val[utility::conversions::to_string_t(U("tx_count"))] = ModelBase::toJson(m_Tx_count);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }

    return val;
}

bool Sushiswap_PairDayDataDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("pair"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("pair")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPair;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPair);
            setPair(refVal_setPair);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("token_0"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("token_0")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setToken0;
            ok &= ModelBase::fromJson(fieldValue, refVal_setToken0);
            setToken0(refVal_setToken0);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("token_1"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("token_1")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setToken1;
            ok &= ModelBase::fromJson(fieldValue, refVal_setToken1);
            setToken1(refVal_setToken1);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("reserve_0"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("reserve_0")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setReserve0;
            ok &= ModelBase::fromJson(fieldValue, refVal_setReserve0);
            setReserve0(refVal_setReserve0);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("reserve_1"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("reserve_1")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setReserve1;
            ok &= ModelBase::fromJson(fieldValue, refVal_setReserve1);
            setReserve1(refVal_setReserve1);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("total_supply"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("total_supply")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTotalSupply;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTotalSupply);
            setTotalSupply(refVal_setTotalSupply);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("reserve_usd"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("reserve_usd")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setReserveUsd;
            ok &= ModelBase::fromJson(fieldValue, refVal_setReserveUsd);
            setReserveUsd(refVal_setReserveUsd);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("volume_token_0"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("volume_token_0")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setVolumeToken0;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVolumeToken0);
            setVolumeToken0(refVal_setVolumeToken0);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("volume_token_1"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("volume_token_1")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setVolumeToken1;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVolumeToken1);
            setVolumeToken1(refVal_setVolumeToken1);
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
    if(val.has_field(utility::conversions::to_string_t(U("tx_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("tx_count")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTxCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTxCount);
            setTxCount(refVal_setTxCount);
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

void Sushiswap_PairDayDataDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_dateIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("date")), m_date));
    }
    if(m_PairIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pair")), m_Pair));
    }
    if(m_Token_0IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token_0")), m_Token_0));
    }
    if(m_Token_1IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token_1")), m_Token_1));
    }
    if(m_Reserve_0IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("reserve_0")), m_Reserve_0));
    }
    if(m_Reserve_1IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("reserve_1")), m_Reserve_1));
    }
    if(m_Total_supplyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("total_supply")), m_Total_supply));
    }
    if(m_Reserve_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("reserve_usd")), m_Reserve_usd));
    }
    if(m_Volume_token_0IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("volume_token_0")), m_Volume_token_0));
    }
    if(m_Volume_token_1IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("volume_token_1")), m_Volume_token_1));
    }
    if(m_Volume_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("volume_usd")), m_Volume_usd));
    }
    if(m_Tx_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("tx_count")), m_Tx_count));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
}

bool Sushiswap_PairDayDataDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("date"))))
    {
        int32_t refVal_setDate;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("date"))), refVal_setDate );
        setDate(refVal_setDate);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("pair"))))
    {
        utility::string_t refVal_setPair;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("pair"))), refVal_setPair );
        setPair(refVal_setPair);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("token_0"))))
    {
        utility::string_t refVal_setToken0;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("token_0"))), refVal_setToken0 );
        setToken0(refVal_setToken0);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("token_1"))))
    {
        utility::string_t refVal_setToken1;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("token_1"))), refVal_setToken1 );
        setToken1(refVal_setToken1);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("reserve_0"))))
    {
        utility::string_t refVal_setReserve0;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("reserve_0"))), refVal_setReserve0 );
        setReserve0(refVal_setReserve0);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("reserve_1"))))
    {
        utility::string_t refVal_setReserve1;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("reserve_1"))), refVal_setReserve1 );
        setReserve1(refVal_setReserve1);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("total_supply"))))
    {
        utility::string_t refVal_setTotalSupply;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("total_supply"))), refVal_setTotalSupply );
        setTotalSupply(refVal_setTotalSupply);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("reserve_usd"))))
    {
        utility::string_t refVal_setReserveUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("reserve_usd"))), refVal_setReserveUsd );
        setReserveUsd(refVal_setReserveUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("volume_token_0"))))
    {
        utility::string_t refVal_setVolumeToken0;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("volume_token_0"))), refVal_setVolumeToken0 );
        setVolumeToken0(refVal_setVolumeToken0);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("volume_token_1"))))
    {
        utility::string_t refVal_setVolumeToken1;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("volume_token_1"))), refVal_setVolumeToken1 );
        setVolumeToken1(refVal_setVolumeToken1);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("volume_usd"))))
    {
        utility::string_t refVal_setVolumeUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("volume_usd"))), refVal_setVolumeUsd );
        setVolumeUsd(refVal_setVolumeUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("tx_count"))))
    {
        utility::string_t refVal_setTxCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("tx_count"))), refVal_setTxCount );
        setTxCount(refVal_setTxCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    return ok;
}

utility::datetime Sushiswap_PairDayDataDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Sushiswap_PairDayDataDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Sushiswap_PairDayDataDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Sushiswap_PairDayDataDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Sushiswap_PairDayDataDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Sushiswap_PairDayDataDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Sushiswap_PairDayDataDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Sushiswap_PairDayDataDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Sushiswap_PairDayDataDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Sushiswap_PairDayDataDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Sushiswap_PairDayDataDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Sushiswap_PairDayDataDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Sushiswap_PairDayDataDTO::getId() const
{
    return m_Id;
}

void Sushiswap_PairDayDataDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Sushiswap_PairDayDataDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Sushiswap_PairDayDataDTO::unsetId()
{
    m_IdIsSet = false;
}
int32_t Sushiswap_PairDayDataDTO::getDate() const
{
    return m_date;
}

void Sushiswap_PairDayDataDTO::setDate(int32_t value)
{
    m_date = value;
    m_dateIsSet = true;
}

bool Sushiswap_PairDayDataDTO::dateIsSet() const
{
    return m_dateIsSet;
}

void Sushiswap_PairDayDataDTO::unsetdate()
{
    m_dateIsSet = false;
}
utility::string_t Sushiswap_PairDayDataDTO::getPair() const
{
    return m_Pair;
}

void Sushiswap_PairDayDataDTO::setPair(const utility::string_t& value)
{
    m_Pair = value;
    m_PairIsSet = true;
}

bool Sushiswap_PairDayDataDTO::pairIsSet() const
{
    return m_PairIsSet;
}

void Sushiswap_PairDayDataDTO::unsetPair()
{
    m_PairIsSet = false;
}
utility::string_t Sushiswap_PairDayDataDTO::getToken0() const
{
    return m_Token_0;
}

void Sushiswap_PairDayDataDTO::setToken0(const utility::string_t& value)
{
    m_Token_0 = value;
    m_Token_0IsSet = true;
}

bool Sushiswap_PairDayDataDTO::token0IsSet() const
{
    return m_Token_0IsSet;
}

void Sushiswap_PairDayDataDTO::unsetToken_0()
{
    m_Token_0IsSet = false;
}
utility::string_t Sushiswap_PairDayDataDTO::getToken1() const
{
    return m_Token_1;
}

void Sushiswap_PairDayDataDTO::setToken1(const utility::string_t& value)
{
    m_Token_1 = value;
    m_Token_1IsSet = true;
}

bool Sushiswap_PairDayDataDTO::token1IsSet() const
{
    return m_Token_1IsSet;
}

void Sushiswap_PairDayDataDTO::unsetToken_1()
{
    m_Token_1IsSet = false;
}
utility::string_t Sushiswap_PairDayDataDTO::getReserve0() const
{
    return m_Reserve_0;
}

void Sushiswap_PairDayDataDTO::setReserve0(const utility::string_t& value)
{
    m_Reserve_0 = value;
    m_Reserve_0IsSet = true;
}

bool Sushiswap_PairDayDataDTO::reserve0IsSet() const
{
    return m_Reserve_0IsSet;
}

void Sushiswap_PairDayDataDTO::unsetReserve_0()
{
    m_Reserve_0IsSet = false;
}
utility::string_t Sushiswap_PairDayDataDTO::getReserve1() const
{
    return m_Reserve_1;
}

void Sushiswap_PairDayDataDTO::setReserve1(const utility::string_t& value)
{
    m_Reserve_1 = value;
    m_Reserve_1IsSet = true;
}

bool Sushiswap_PairDayDataDTO::reserve1IsSet() const
{
    return m_Reserve_1IsSet;
}

void Sushiswap_PairDayDataDTO::unsetReserve_1()
{
    m_Reserve_1IsSet = false;
}
utility::string_t Sushiswap_PairDayDataDTO::getTotalSupply() const
{
    return m_Total_supply;
}

void Sushiswap_PairDayDataDTO::setTotalSupply(const utility::string_t& value)
{
    m_Total_supply = value;
    m_Total_supplyIsSet = true;
}

bool Sushiswap_PairDayDataDTO::totalSupplyIsSet() const
{
    return m_Total_supplyIsSet;
}

void Sushiswap_PairDayDataDTO::unsetTotal_supply()
{
    m_Total_supplyIsSet = false;
}
utility::string_t Sushiswap_PairDayDataDTO::getReserveUsd() const
{
    return m_Reserve_usd;
}

void Sushiswap_PairDayDataDTO::setReserveUsd(const utility::string_t& value)
{
    m_Reserve_usd = value;
    m_Reserve_usdIsSet = true;
}

bool Sushiswap_PairDayDataDTO::reserveUsdIsSet() const
{
    return m_Reserve_usdIsSet;
}

void Sushiswap_PairDayDataDTO::unsetReserve_usd()
{
    m_Reserve_usdIsSet = false;
}
utility::string_t Sushiswap_PairDayDataDTO::getVolumeToken0() const
{
    return m_Volume_token_0;
}

void Sushiswap_PairDayDataDTO::setVolumeToken0(const utility::string_t& value)
{
    m_Volume_token_0 = value;
    m_Volume_token_0IsSet = true;
}

bool Sushiswap_PairDayDataDTO::volumeToken0IsSet() const
{
    return m_Volume_token_0IsSet;
}

void Sushiswap_PairDayDataDTO::unsetVolume_token_0()
{
    m_Volume_token_0IsSet = false;
}
utility::string_t Sushiswap_PairDayDataDTO::getVolumeToken1() const
{
    return m_Volume_token_1;
}

void Sushiswap_PairDayDataDTO::setVolumeToken1(const utility::string_t& value)
{
    m_Volume_token_1 = value;
    m_Volume_token_1IsSet = true;
}

bool Sushiswap_PairDayDataDTO::volumeToken1IsSet() const
{
    return m_Volume_token_1IsSet;
}

void Sushiswap_PairDayDataDTO::unsetVolume_token_1()
{
    m_Volume_token_1IsSet = false;
}
utility::string_t Sushiswap_PairDayDataDTO::getVolumeUsd() const
{
    return m_Volume_usd;
}

void Sushiswap_PairDayDataDTO::setVolumeUsd(const utility::string_t& value)
{
    m_Volume_usd = value;
    m_Volume_usdIsSet = true;
}

bool Sushiswap_PairDayDataDTO::volumeUsdIsSet() const
{
    return m_Volume_usdIsSet;
}

void Sushiswap_PairDayDataDTO::unsetVolume_usd()
{
    m_Volume_usdIsSet = false;
}
utility::string_t Sushiswap_PairDayDataDTO::getTxCount() const
{
    return m_Tx_count;
}

void Sushiswap_PairDayDataDTO::setTxCount(const utility::string_t& value)
{
    m_Tx_count = value;
    m_Tx_countIsSet = true;
}

bool Sushiswap_PairDayDataDTO::txCountIsSet() const
{
    return m_Tx_countIsSet;
}

void Sushiswap_PairDayDataDTO::unsetTx_count()
{
    m_Tx_countIsSet = false;
}
int64_t Sushiswap_PairDayDataDTO::getVid() const
{
    return m_Vid;
}

void Sushiswap_PairDayDataDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Sushiswap_PairDayDataDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Sushiswap_PairDayDataDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


