/**
 * On Chain Dapps - REST API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.2.1.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/UniswapV2_TokenDayDataDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



UniswapV2_TokenDayDataDTO::UniswapV2_TokenDayDataDTO()
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
    m_Token = utility::conversions::to_string_t("");
    m_TokenIsSet = false;
    m_Daily_volume_token = utility::conversions::to_string_t("");
    m_Daily_volume_tokenIsSet = false;
    m_Daily_volume_eth = utility::conversions::to_string_t("");
    m_Daily_volume_ethIsSet = false;
    m_Daily_volume_usd = utility::conversions::to_string_t("");
    m_Daily_volume_usdIsSet = false;
    m_Daily_txns = utility::conversions::to_string_t("");
    m_Daily_txnsIsSet = false;
    m_Total_liquidity_token = utility::conversions::to_string_t("");
    m_Total_liquidity_tokenIsSet = false;
    m_Total_liquidity_eth = utility::conversions::to_string_t("");
    m_Total_liquidity_ethIsSet = false;
    m_Total_liquidity_usd = utility::conversions::to_string_t("");
    m_Total_liquidity_usdIsSet = false;
    m_Price_usd = utility::conversions::to_string_t("");
    m_Price_usdIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

UniswapV2_TokenDayDataDTO::~UniswapV2_TokenDayDataDTO()
{
}

void UniswapV2_TokenDayDataDTO::validate()
{
    // TODO: implement validation
}

web::json::value UniswapV2_TokenDayDataDTO::toJson() const
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
    if(m_TokenIsSet)
    {
        val[utility::conversions::to_string_t(U("token"))] = ModelBase::toJson(m_Token);
    }
    if(m_Daily_volume_tokenIsSet)
    {
        val[utility::conversions::to_string_t(U("daily_volume_token"))] = ModelBase::toJson(m_Daily_volume_token);
    }
    if(m_Daily_volume_ethIsSet)
    {
        val[utility::conversions::to_string_t(U("daily_volume_eth"))] = ModelBase::toJson(m_Daily_volume_eth);
    }
    if(m_Daily_volume_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("daily_volume_usd"))] = ModelBase::toJson(m_Daily_volume_usd);
    }
    if(m_Daily_txnsIsSet)
    {
        val[utility::conversions::to_string_t(U("daily_txns"))] = ModelBase::toJson(m_Daily_txns);
    }
    if(m_Total_liquidity_tokenIsSet)
    {
        val[utility::conversions::to_string_t(U("total_liquidity_token"))] = ModelBase::toJson(m_Total_liquidity_token);
    }
    if(m_Total_liquidity_ethIsSet)
    {
        val[utility::conversions::to_string_t(U("total_liquidity_eth"))] = ModelBase::toJson(m_Total_liquidity_eth);
    }
    if(m_Total_liquidity_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("total_liquidity_usd"))] = ModelBase::toJson(m_Total_liquidity_usd);
    }
    if(m_Price_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("price_usd"))] = ModelBase::toJson(m_Price_usd);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }

    return val;
}

bool UniswapV2_TokenDayDataDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("daily_volume_token"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("daily_volume_token")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDailyVolumeToken;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDailyVolumeToken);
            setDailyVolumeToken(refVal_setDailyVolumeToken);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("daily_volume_eth"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("daily_volume_eth")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDailyVolumeEth;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDailyVolumeEth);
            setDailyVolumeEth(refVal_setDailyVolumeEth);
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
    if(val.has_field(utility::conversions::to_string_t(U("total_liquidity_token"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("total_liquidity_token")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTotalLiquidityToken;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTotalLiquidityToken);
            setTotalLiquidityToken(refVal_setTotalLiquidityToken);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("total_liquidity_eth"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("total_liquidity_eth")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTotalLiquidityEth;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTotalLiquidityEth);
            setTotalLiquidityEth(refVal_setTotalLiquidityEth);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("total_liquidity_usd"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("total_liquidity_usd")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTotalLiquidityUsd;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTotalLiquidityUsd);
            setTotalLiquidityUsd(refVal_setTotalLiquidityUsd);
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

void UniswapV2_TokenDayDataDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_TokenIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token")), m_Token));
    }
    if(m_Daily_volume_tokenIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("daily_volume_token")), m_Daily_volume_token));
    }
    if(m_Daily_volume_ethIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("daily_volume_eth")), m_Daily_volume_eth));
    }
    if(m_Daily_volume_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("daily_volume_usd")), m_Daily_volume_usd));
    }
    if(m_Daily_txnsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("daily_txns")), m_Daily_txns));
    }
    if(m_Total_liquidity_tokenIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("total_liquidity_token")), m_Total_liquidity_token));
    }
    if(m_Total_liquidity_ethIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("total_liquidity_eth")), m_Total_liquidity_eth));
    }
    if(m_Total_liquidity_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("total_liquidity_usd")), m_Total_liquidity_usd));
    }
    if(m_Price_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("price_usd")), m_Price_usd));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
}

bool UniswapV2_TokenDayDataDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("token"))))
    {
        utility::string_t refVal_setToken;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("token"))), refVal_setToken );
        setToken(refVal_setToken);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("daily_volume_token"))))
    {
        utility::string_t refVal_setDailyVolumeToken;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("daily_volume_token"))), refVal_setDailyVolumeToken );
        setDailyVolumeToken(refVal_setDailyVolumeToken);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("daily_volume_eth"))))
    {
        utility::string_t refVal_setDailyVolumeEth;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("daily_volume_eth"))), refVal_setDailyVolumeEth );
        setDailyVolumeEth(refVal_setDailyVolumeEth);
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("total_liquidity_token"))))
    {
        utility::string_t refVal_setTotalLiquidityToken;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("total_liquidity_token"))), refVal_setTotalLiquidityToken );
        setTotalLiquidityToken(refVal_setTotalLiquidityToken);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("total_liquidity_eth"))))
    {
        utility::string_t refVal_setTotalLiquidityEth;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("total_liquidity_eth"))), refVal_setTotalLiquidityEth );
        setTotalLiquidityEth(refVal_setTotalLiquidityEth);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("total_liquidity_usd"))))
    {
        utility::string_t refVal_setTotalLiquidityUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("total_liquidity_usd"))), refVal_setTotalLiquidityUsd );
        setTotalLiquidityUsd(refVal_setTotalLiquidityUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("price_usd"))))
    {
        utility::string_t refVal_setPriceUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("price_usd"))), refVal_setPriceUsd );
        setPriceUsd(refVal_setPriceUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    return ok;
}

utility::datetime UniswapV2_TokenDayDataDTO::getEntryTime() const
{
    return m_Entry_time;
}

void UniswapV2_TokenDayDataDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool UniswapV2_TokenDayDataDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void UniswapV2_TokenDayDataDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime UniswapV2_TokenDayDataDTO::getRecvTime() const
{
    return m_Recv_time;
}

void UniswapV2_TokenDayDataDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool UniswapV2_TokenDayDataDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void UniswapV2_TokenDayDataDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t UniswapV2_TokenDayDataDTO::getBlockNumber() const
{
    return m_Block_number;
}

void UniswapV2_TokenDayDataDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool UniswapV2_TokenDayDataDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void UniswapV2_TokenDayDataDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t UniswapV2_TokenDayDataDTO::getId() const
{
    return m_Id;
}

void UniswapV2_TokenDayDataDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool UniswapV2_TokenDayDataDTO::idIsSet() const
{
    return m_IdIsSet;
}

void UniswapV2_TokenDayDataDTO::unsetId()
{
    m_IdIsSet = false;
}
int32_t UniswapV2_TokenDayDataDTO::getDate() const
{
    return m_date;
}

void UniswapV2_TokenDayDataDTO::setDate(int32_t value)
{
    m_date = value;
    m_dateIsSet = true;
}

bool UniswapV2_TokenDayDataDTO::dateIsSet() const
{
    return m_dateIsSet;
}

void UniswapV2_TokenDayDataDTO::unsetdate()
{
    m_dateIsSet = false;
}
utility::string_t UniswapV2_TokenDayDataDTO::getToken() const
{
    return m_Token;
}

void UniswapV2_TokenDayDataDTO::setToken(const utility::string_t& value)
{
    m_Token = value;
    m_TokenIsSet = true;
}

bool UniswapV2_TokenDayDataDTO::tokenIsSet() const
{
    return m_TokenIsSet;
}

void UniswapV2_TokenDayDataDTO::unsetToken()
{
    m_TokenIsSet = false;
}
utility::string_t UniswapV2_TokenDayDataDTO::getDailyVolumeToken() const
{
    return m_Daily_volume_token;
}

void UniswapV2_TokenDayDataDTO::setDailyVolumeToken(const utility::string_t& value)
{
    m_Daily_volume_token = value;
    m_Daily_volume_tokenIsSet = true;
}

bool UniswapV2_TokenDayDataDTO::dailyVolumeTokenIsSet() const
{
    return m_Daily_volume_tokenIsSet;
}

void UniswapV2_TokenDayDataDTO::unsetDaily_volume_token()
{
    m_Daily_volume_tokenIsSet = false;
}
utility::string_t UniswapV2_TokenDayDataDTO::getDailyVolumeEth() const
{
    return m_Daily_volume_eth;
}

void UniswapV2_TokenDayDataDTO::setDailyVolumeEth(const utility::string_t& value)
{
    m_Daily_volume_eth = value;
    m_Daily_volume_ethIsSet = true;
}

bool UniswapV2_TokenDayDataDTO::dailyVolumeEthIsSet() const
{
    return m_Daily_volume_ethIsSet;
}

void UniswapV2_TokenDayDataDTO::unsetDaily_volume_eth()
{
    m_Daily_volume_ethIsSet = false;
}
utility::string_t UniswapV2_TokenDayDataDTO::getDailyVolumeUsd() const
{
    return m_Daily_volume_usd;
}

void UniswapV2_TokenDayDataDTO::setDailyVolumeUsd(const utility::string_t& value)
{
    m_Daily_volume_usd = value;
    m_Daily_volume_usdIsSet = true;
}

bool UniswapV2_TokenDayDataDTO::dailyVolumeUsdIsSet() const
{
    return m_Daily_volume_usdIsSet;
}

void UniswapV2_TokenDayDataDTO::unsetDaily_volume_usd()
{
    m_Daily_volume_usdIsSet = false;
}
utility::string_t UniswapV2_TokenDayDataDTO::getDailyTxns() const
{
    return m_Daily_txns;
}

void UniswapV2_TokenDayDataDTO::setDailyTxns(const utility::string_t& value)
{
    m_Daily_txns = value;
    m_Daily_txnsIsSet = true;
}

bool UniswapV2_TokenDayDataDTO::dailyTxnsIsSet() const
{
    return m_Daily_txnsIsSet;
}

void UniswapV2_TokenDayDataDTO::unsetDaily_txns()
{
    m_Daily_txnsIsSet = false;
}
utility::string_t UniswapV2_TokenDayDataDTO::getTotalLiquidityToken() const
{
    return m_Total_liquidity_token;
}

void UniswapV2_TokenDayDataDTO::setTotalLiquidityToken(const utility::string_t& value)
{
    m_Total_liquidity_token = value;
    m_Total_liquidity_tokenIsSet = true;
}

bool UniswapV2_TokenDayDataDTO::totalLiquidityTokenIsSet() const
{
    return m_Total_liquidity_tokenIsSet;
}

void UniswapV2_TokenDayDataDTO::unsetTotal_liquidity_token()
{
    m_Total_liquidity_tokenIsSet = false;
}
utility::string_t UniswapV2_TokenDayDataDTO::getTotalLiquidityEth() const
{
    return m_Total_liquidity_eth;
}

void UniswapV2_TokenDayDataDTO::setTotalLiquidityEth(const utility::string_t& value)
{
    m_Total_liquidity_eth = value;
    m_Total_liquidity_ethIsSet = true;
}

bool UniswapV2_TokenDayDataDTO::totalLiquidityEthIsSet() const
{
    return m_Total_liquidity_ethIsSet;
}

void UniswapV2_TokenDayDataDTO::unsetTotal_liquidity_eth()
{
    m_Total_liquidity_ethIsSet = false;
}
utility::string_t UniswapV2_TokenDayDataDTO::getTotalLiquidityUsd() const
{
    return m_Total_liquidity_usd;
}

void UniswapV2_TokenDayDataDTO::setTotalLiquidityUsd(const utility::string_t& value)
{
    m_Total_liquidity_usd = value;
    m_Total_liquidity_usdIsSet = true;
}

bool UniswapV2_TokenDayDataDTO::totalLiquidityUsdIsSet() const
{
    return m_Total_liquidity_usdIsSet;
}

void UniswapV2_TokenDayDataDTO::unsetTotal_liquidity_usd()
{
    m_Total_liquidity_usdIsSet = false;
}
utility::string_t UniswapV2_TokenDayDataDTO::getPriceUsd() const
{
    return m_Price_usd;
}

void UniswapV2_TokenDayDataDTO::setPriceUsd(const utility::string_t& value)
{
    m_Price_usd = value;
    m_Price_usdIsSet = true;
}

bool UniswapV2_TokenDayDataDTO::priceUsdIsSet() const
{
    return m_Price_usdIsSet;
}

void UniswapV2_TokenDayDataDTO::unsetPrice_usd()
{
    m_Price_usdIsSet = false;
}
int64_t UniswapV2_TokenDayDataDTO::getVid() const
{
    return m_Vid;
}

void UniswapV2_TokenDayDataDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool UniswapV2_TokenDayDataDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void UniswapV2_TokenDayDataDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


