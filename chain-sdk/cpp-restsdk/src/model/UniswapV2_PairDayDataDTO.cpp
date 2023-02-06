/**
 * On Chain Dapps - REST API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.3.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/UniswapV2_PairDayDataDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



UniswapV2_PairDayDataDTO::UniswapV2_PairDayDataDTO()
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
    m_Pair_address = utility::conversions::to_string_t("");
    m_Pair_addressIsSet = false;
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
    m_Daily_volume_token_0 = utility::conversions::to_string_t("");
    m_Daily_volume_token_0IsSet = false;
    m_Daily_volume_token_1 = utility::conversions::to_string_t("");
    m_Daily_volume_token_1IsSet = false;
    m_Daily_volume_usd = utility::conversions::to_string_t("");
    m_Daily_volume_usdIsSet = false;
    m_Daily_txns = utility::conversions::to_string_t("");
    m_Daily_txnsIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

UniswapV2_PairDayDataDTO::~UniswapV2_PairDayDataDTO()
{
}

void UniswapV2_PairDayDataDTO::validate()
{
    // TODO: implement validation
}

web::json::value UniswapV2_PairDayDataDTO::toJson() const
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
    if(m_Pair_addressIsSet)
    {
        val[utility::conversions::to_string_t(U("pair_address"))] = ModelBase::toJson(m_Pair_address);
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
    if(m_Daily_volume_token_0IsSet)
    {
        val[utility::conversions::to_string_t(U("daily_volume_token_0"))] = ModelBase::toJson(m_Daily_volume_token_0);
    }
    if(m_Daily_volume_token_1IsSet)
    {
        val[utility::conversions::to_string_t(U("daily_volume_token_1"))] = ModelBase::toJson(m_Daily_volume_token_1);
    }
    if(m_Daily_volume_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("daily_volume_usd"))] = ModelBase::toJson(m_Daily_volume_usd);
    }
    if(m_Daily_txnsIsSet)
    {
        val[utility::conversions::to_string_t(U("daily_txns"))] = ModelBase::toJson(m_Daily_txns);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }

    return val;
}

bool UniswapV2_PairDayDataDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("pair_address"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("pair_address")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPairAddress;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPairAddress);
            setPairAddress(refVal_setPairAddress);
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
    if(val.has_field(utility::conversions::to_string_t(U("daily_volume_token_0"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("daily_volume_token_0")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDailyVolumeToken0;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDailyVolumeToken0);
            setDailyVolumeToken0(refVal_setDailyVolumeToken0);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("daily_volume_token_1"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("daily_volume_token_1")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDailyVolumeToken1;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDailyVolumeToken1);
            setDailyVolumeToken1(refVal_setDailyVolumeToken1);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("daily_volume_usd"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("daily_volume_usd")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDailyVolumeUsd;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDailyVolumeUsd);
            setDailyVolumeUsd(refVal_setDailyVolumeUsd);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("daily_txns"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("daily_txns")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDailyTxns;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDailyTxns);
            setDailyTxns(refVal_setDailyTxns);
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

void UniswapV2_PairDayDataDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_Pair_addressIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pair_address")), m_Pair_address));
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
    if(m_Daily_volume_token_0IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("daily_volume_token_0")), m_Daily_volume_token_0));
    }
    if(m_Daily_volume_token_1IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("daily_volume_token_1")), m_Daily_volume_token_1));
    }
    if(m_Daily_volume_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("daily_volume_usd")), m_Daily_volume_usd));
    }
    if(m_Daily_txnsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("daily_txns")), m_Daily_txns));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
}

bool UniswapV2_PairDayDataDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("pair_address"))))
    {
        utility::string_t refVal_setPairAddress;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("pair_address"))), refVal_setPairAddress );
        setPairAddress(refVal_setPairAddress);
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("daily_volume_token_0"))))
    {
        utility::string_t refVal_setDailyVolumeToken0;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("daily_volume_token_0"))), refVal_setDailyVolumeToken0 );
        setDailyVolumeToken0(refVal_setDailyVolumeToken0);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("daily_volume_token_1"))))
    {
        utility::string_t refVal_setDailyVolumeToken1;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("daily_volume_token_1"))), refVal_setDailyVolumeToken1 );
        setDailyVolumeToken1(refVal_setDailyVolumeToken1);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("daily_volume_usd"))))
    {
        utility::string_t refVal_setDailyVolumeUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("daily_volume_usd"))), refVal_setDailyVolumeUsd );
        setDailyVolumeUsd(refVal_setDailyVolumeUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("daily_txns"))))
    {
        utility::string_t refVal_setDailyTxns;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("daily_txns"))), refVal_setDailyTxns );
        setDailyTxns(refVal_setDailyTxns);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    return ok;
}

utility::datetime UniswapV2_PairDayDataDTO::getEntryTime() const
{
    return m_Entry_time;
}

void UniswapV2_PairDayDataDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool UniswapV2_PairDayDataDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void UniswapV2_PairDayDataDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime UniswapV2_PairDayDataDTO::getRecvTime() const
{
    return m_Recv_time;
}

void UniswapV2_PairDayDataDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool UniswapV2_PairDayDataDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void UniswapV2_PairDayDataDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t UniswapV2_PairDayDataDTO::getBlockNumber() const
{
    return m_Block_number;
}

void UniswapV2_PairDayDataDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool UniswapV2_PairDayDataDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void UniswapV2_PairDayDataDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t UniswapV2_PairDayDataDTO::getId() const
{
    return m_Id;
}

void UniswapV2_PairDayDataDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool UniswapV2_PairDayDataDTO::idIsSet() const
{
    return m_IdIsSet;
}

void UniswapV2_PairDayDataDTO::unsetId()
{
    m_IdIsSet = false;
}
int32_t UniswapV2_PairDayDataDTO::getDate() const
{
    return m_date;
}

void UniswapV2_PairDayDataDTO::setDate(int32_t value)
{
    m_date = value;
    m_dateIsSet = true;
}

bool UniswapV2_PairDayDataDTO::dateIsSet() const
{
    return m_dateIsSet;
}

void UniswapV2_PairDayDataDTO::unsetdate()
{
    m_dateIsSet = false;
}
utility::string_t UniswapV2_PairDayDataDTO::getPairAddress() const
{
    return m_Pair_address;
}

void UniswapV2_PairDayDataDTO::setPairAddress(const utility::string_t& value)
{
    m_Pair_address = value;
    m_Pair_addressIsSet = true;
}

bool UniswapV2_PairDayDataDTO::pairAddressIsSet() const
{
    return m_Pair_addressIsSet;
}

void UniswapV2_PairDayDataDTO::unsetPair_address()
{
    m_Pair_addressIsSet = false;
}
utility::string_t UniswapV2_PairDayDataDTO::getToken0() const
{
    return m_Token_0;
}

void UniswapV2_PairDayDataDTO::setToken0(const utility::string_t& value)
{
    m_Token_0 = value;
    m_Token_0IsSet = true;
}

bool UniswapV2_PairDayDataDTO::token0IsSet() const
{
    return m_Token_0IsSet;
}

void UniswapV2_PairDayDataDTO::unsetToken_0()
{
    m_Token_0IsSet = false;
}
utility::string_t UniswapV2_PairDayDataDTO::getToken1() const
{
    return m_Token_1;
}

void UniswapV2_PairDayDataDTO::setToken1(const utility::string_t& value)
{
    m_Token_1 = value;
    m_Token_1IsSet = true;
}

bool UniswapV2_PairDayDataDTO::token1IsSet() const
{
    return m_Token_1IsSet;
}

void UniswapV2_PairDayDataDTO::unsetToken_1()
{
    m_Token_1IsSet = false;
}
utility::string_t UniswapV2_PairDayDataDTO::getReserve0() const
{
    return m_Reserve_0;
}

void UniswapV2_PairDayDataDTO::setReserve0(const utility::string_t& value)
{
    m_Reserve_0 = value;
    m_Reserve_0IsSet = true;
}

bool UniswapV2_PairDayDataDTO::reserve0IsSet() const
{
    return m_Reserve_0IsSet;
}

void UniswapV2_PairDayDataDTO::unsetReserve_0()
{
    m_Reserve_0IsSet = false;
}
utility::string_t UniswapV2_PairDayDataDTO::getReserve1() const
{
    return m_Reserve_1;
}

void UniswapV2_PairDayDataDTO::setReserve1(const utility::string_t& value)
{
    m_Reserve_1 = value;
    m_Reserve_1IsSet = true;
}

bool UniswapV2_PairDayDataDTO::reserve1IsSet() const
{
    return m_Reserve_1IsSet;
}

void UniswapV2_PairDayDataDTO::unsetReserve_1()
{
    m_Reserve_1IsSet = false;
}
utility::string_t UniswapV2_PairDayDataDTO::getTotalSupply() const
{
    return m_Total_supply;
}

void UniswapV2_PairDayDataDTO::setTotalSupply(const utility::string_t& value)
{
    m_Total_supply = value;
    m_Total_supplyIsSet = true;
}

bool UniswapV2_PairDayDataDTO::totalSupplyIsSet() const
{
    return m_Total_supplyIsSet;
}

void UniswapV2_PairDayDataDTO::unsetTotal_supply()
{
    m_Total_supplyIsSet = false;
}
utility::string_t UniswapV2_PairDayDataDTO::getReserveUsd() const
{
    return m_Reserve_usd;
}

void UniswapV2_PairDayDataDTO::setReserveUsd(const utility::string_t& value)
{
    m_Reserve_usd = value;
    m_Reserve_usdIsSet = true;
}

bool UniswapV2_PairDayDataDTO::reserveUsdIsSet() const
{
    return m_Reserve_usdIsSet;
}

void UniswapV2_PairDayDataDTO::unsetReserve_usd()
{
    m_Reserve_usdIsSet = false;
}
utility::string_t UniswapV2_PairDayDataDTO::getDailyVolumeToken0() const
{
    return m_Daily_volume_token_0;
}

void UniswapV2_PairDayDataDTO::setDailyVolumeToken0(const utility::string_t& value)
{
    m_Daily_volume_token_0 = value;
    m_Daily_volume_token_0IsSet = true;
}

bool UniswapV2_PairDayDataDTO::dailyVolumeToken0IsSet() const
{
    return m_Daily_volume_token_0IsSet;
}

void UniswapV2_PairDayDataDTO::unsetDaily_volume_token_0()
{
    m_Daily_volume_token_0IsSet = false;
}
utility::string_t UniswapV2_PairDayDataDTO::getDailyVolumeToken1() const
{
    return m_Daily_volume_token_1;
}

void UniswapV2_PairDayDataDTO::setDailyVolumeToken1(const utility::string_t& value)
{
    m_Daily_volume_token_1 = value;
    m_Daily_volume_token_1IsSet = true;
}

bool UniswapV2_PairDayDataDTO::dailyVolumeToken1IsSet() const
{
    return m_Daily_volume_token_1IsSet;
}

void UniswapV2_PairDayDataDTO::unsetDaily_volume_token_1()
{
    m_Daily_volume_token_1IsSet = false;
}
utility::string_t UniswapV2_PairDayDataDTO::getDailyVolumeUsd() const
{
    return m_Daily_volume_usd;
}

void UniswapV2_PairDayDataDTO::setDailyVolumeUsd(const utility::string_t& value)
{
    m_Daily_volume_usd = value;
    m_Daily_volume_usdIsSet = true;
}

bool UniswapV2_PairDayDataDTO::dailyVolumeUsdIsSet() const
{
    return m_Daily_volume_usdIsSet;
}

void UniswapV2_PairDayDataDTO::unsetDaily_volume_usd()
{
    m_Daily_volume_usdIsSet = false;
}
utility::string_t UniswapV2_PairDayDataDTO::getDailyTxns() const
{
    return m_Daily_txns;
}

void UniswapV2_PairDayDataDTO::setDailyTxns(const utility::string_t& value)
{
    m_Daily_txns = value;
    m_Daily_txnsIsSet = true;
}

bool UniswapV2_PairDayDataDTO::dailyTxnsIsSet() const
{
    return m_Daily_txnsIsSet;
}

void UniswapV2_PairDayDataDTO::unsetDaily_txns()
{
    m_Daily_txnsIsSet = false;
}
int64_t UniswapV2_PairDayDataDTO::getVid() const
{
    return m_Vid;
}

void UniswapV2_PairDayDataDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool UniswapV2_PairDayDataDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void UniswapV2_PairDayDataDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


