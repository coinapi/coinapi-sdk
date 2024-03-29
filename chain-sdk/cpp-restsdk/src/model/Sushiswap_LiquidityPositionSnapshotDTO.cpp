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



#include "CppRestOpenAPIClient/model/Sushiswap_LiquidityPositionSnapshotDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Sushiswap_LiquidityPositionSnapshotDTO::Sushiswap_LiquidityPositionSnapshotDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Liquidity_position = utility::conversions::to_string_t("");
    m_Liquidity_positionIsSet = false;
    m_Timestamp = 0;
    m_TimestampIsSet = false;
    m_Block = 0;
    m_BlockIsSet = false;
    m_User = utility::conversions::to_string_t("");
    m_UserIsSet = false;
    m_Pair = utility::conversions::to_string_t("");
    m_PairIsSet = false;
    m_Token_0_price_usd = utility::conversions::to_string_t("");
    m_Token_0_price_usdIsSet = false;
    m_Token_1_price_usd = utility::conversions::to_string_t("");
    m_Token_1_price_usdIsSet = false;
    m_Reserve_0 = utility::conversions::to_string_t("");
    m_Reserve_0IsSet = false;
    m_Reserve_1 = utility::conversions::to_string_t("");
    m_Reserve_1IsSet = false;
    m_Reserve_usd = utility::conversions::to_string_t("");
    m_Reserve_usdIsSet = false;
    m_Liquidity_token_total_supply = utility::conversions::to_string_t("");
    m_Liquidity_token_total_supplyIsSet = false;
    m_Liquidity_token_balance = utility::conversions::to_string_t("");
    m_Liquidity_token_balanceIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

Sushiswap_LiquidityPositionSnapshotDTO::~Sushiswap_LiquidityPositionSnapshotDTO()
{
}

void Sushiswap_LiquidityPositionSnapshotDTO::validate()
{
    // TODO: implement validation
}

web::json::value Sushiswap_LiquidityPositionSnapshotDTO::toJson() const
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
    if(m_Liquidity_positionIsSet)
    {
        val[utility::conversions::to_string_t(U("liquidity_position"))] = ModelBase::toJson(m_Liquidity_position);
    }
    if(m_TimestampIsSet)
    {
        val[utility::conversions::to_string_t(U("timestamp"))] = ModelBase::toJson(m_Timestamp);
    }
    if(m_BlockIsSet)
    {
        val[utility::conversions::to_string_t(U("block"))] = ModelBase::toJson(m_Block);
    }
    if(m_UserIsSet)
    {
        val[utility::conversions::to_string_t(U("user"))] = ModelBase::toJson(m_User);
    }
    if(m_PairIsSet)
    {
        val[utility::conversions::to_string_t(U("pair"))] = ModelBase::toJson(m_Pair);
    }
    if(m_Token_0_price_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("token_0_price_usd"))] = ModelBase::toJson(m_Token_0_price_usd);
    }
    if(m_Token_1_price_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("token_1_price_usd"))] = ModelBase::toJson(m_Token_1_price_usd);
    }
    if(m_Reserve_0IsSet)
    {
        val[utility::conversions::to_string_t(U("reserve_0"))] = ModelBase::toJson(m_Reserve_0);
    }
    if(m_Reserve_1IsSet)
    {
        val[utility::conversions::to_string_t(U("reserve_1"))] = ModelBase::toJson(m_Reserve_1);
    }
    if(m_Reserve_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("reserve_usd"))] = ModelBase::toJson(m_Reserve_usd);
    }
    if(m_Liquidity_token_total_supplyIsSet)
    {
        val[utility::conversions::to_string_t(U("liquidity_token_total_supply"))] = ModelBase::toJson(m_Liquidity_token_total_supply);
    }
    if(m_Liquidity_token_balanceIsSet)
    {
        val[utility::conversions::to_string_t(U("liquidity_token_balance"))] = ModelBase::toJson(m_Liquidity_token_balance);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }

    return val;
}

bool Sushiswap_LiquidityPositionSnapshotDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("liquidity_position"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("liquidity_position")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setLiquidityPosition;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLiquidityPosition);
            setLiquidityPosition(refVal_setLiquidityPosition);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("timestamp"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("timestamp")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setTimestamp;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTimestamp);
            setTimestamp(refVal_setTimestamp);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("block"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("block")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setBlock;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBlock);
            setBlock(refVal_setBlock);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("user"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("user")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setUser;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUser);
            setUser(refVal_setUser);
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
    if(val.has_field(utility::conversions::to_string_t(U("token_0_price_usd"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("token_0_price_usd")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setToken0PriceUsd;
            ok &= ModelBase::fromJson(fieldValue, refVal_setToken0PriceUsd);
            setToken0PriceUsd(refVal_setToken0PriceUsd);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("token_1_price_usd"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("token_1_price_usd")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setToken1PriceUsd;
            ok &= ModelBase::fromJson(fieldValue, refVal_setToken1PriceUsd);
            setToken1PriceUsd(refVal_setToken1PriceUsd);
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
    if(val.has_field(utility::conversions::to_string_t(U("liquidity_token_total_supply"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("liquidity_token_total_supply")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setLiquidityTokenTotalSupply;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLiquidityTokenTotalSupply);
            setLiquidityTokenTotalSupply(refVal_setLiquidityTokenTotalSupply);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("liquidity_token_balance"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("liquidity_token_balance")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setLiquidityTokenBalance;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLiquidityTokenBalance);
            setLiquidityTokenBalance(refVal_setLiquidityTokenBalance);
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

void Sushiswap_LiquidityPositionSnapshotDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_Liquidity_positionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("liquidity_position")), m_Liquidity_position));
    }
    if(m_TimestampIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("timestamp")), m_Timestamp));
    }
    if(m_BlockIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("block")), m_Block));
    }
    if(m_UserIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("user")), m_User));
    }
    if(m_PairIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pair")), m_Pair));
    }
    if(m_Token_0_price_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token_0_price_usd")), m_Token_0_price_usd));
    }
    if(m_Token_1_price_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token_1_price_usd")), m_Token_1_price_usd));
    }
    if(m_Reserve_0IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("reserve_0")), m_Reserve_0));
    }
    if(m_Reserve_1IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("reserve_1")), m_Reserve_1));
    }
    if(m_Reserve_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("reserve_usd")), m_Reserve_usd));
    }
    if(m_Liquidity_token_total_supplyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("liquidity_token_total_supply")), m_Liquidity_token_total_supply));
    }
    if(m_Liquidity_token_balanceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("liquidity_token_balance")), m_Liquidity_token_balance));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
}

bool Sushiswap_LiquidityPositionSnapshotDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("liquidity_position"))))
    {
        utility::string_t refVal_setLiquidityPosition;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("liquidity_position"))), refVal_setLiquidityPosition );
        setLiquidityPosition(refVal_setLiquidityPosition);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("timestamp"))))
    {
        int32_t refVal_setTimestamp;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("timestamp"))), refVal_setTimestamp );
        setTimestamp(refVal_setTimestamp);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("block"))))
    {
        int32_t refVal_setBlock;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("block"))), refVal_setBlock );
        setBlock(refVal_setBlock);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("user"))))
    {
        utility::string_t refVal_setUser;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("user"))), refVal_setUser );
        setUser(refVal_setUser);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("pair"))))
    {
        utility::string_t refVal_setPair;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("pair"))), refVal_setPair );
        setPair(refVal_setPair);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("token_0_price_usd"))))
    {
        utility::string_t refVal_setToken0PriceUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("token_0_price_usd"))), refVal_setToken0PriceUsd );
        setToken0PriceUsd(refVal_setToken0PriceUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("token_1_price_usd"))))
    {
        utility::string_t refVal_setToken1PriceUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("token_1_price_usd"))), refVal_setToken1PriceUsd );
        setToken1PriceUsd(refVal_setToken1PriceUsd);
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("reserve_usd"))))
    {
        utility::string_t refVal_setReserveUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("reserve_usd"))), refVal_setReserveUsd );
        setReserveUsd(refVal_setReserveUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("liquidity_token_total_supply"))))
    {
        utility::string_t refVal_setLiquidityTokenTotalSupply;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("liquidity_token_total_supply"))), refVal_setLiquidityTokenTotalSupply );
        setLiquidityTokenTotalSupply(refVal_setLiquidityTokenTotalSupply);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("liquidity_token_balance"))))
    {
        utility::string_t refVal_setLiquidityTokenBalance;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("liquidity_token_balance"))), refVal_setLiquidityTokenBalance );
        setLiquidityTokenBalance(refVal_setLiquidityTokenBalance);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    return ok;
}

utility::datetime Sushiswap_LiquidityPositionSnapshotDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Sushiswap_LiquidityPositionSnapshotDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Sushiswap_LiquidityPositionSnapshotDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Sushiswap_LiquidityPositionSnapshotDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Sushiswap_LiquidityPositionSnapshotDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Sushiswap_LiquidityPositionSnapshotDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Sushiswap_LiquidityPositionSnapshotDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Sushiswap_LiquidityPositionSnapshotDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Sushiswap_LiquidityPositionSnapshotDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Sushiswap_LiquidityPositionSnapshotDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Sushiswap_LiquidityPositionSnapshotDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Sushiswap_LiquidityPositionSnapshotDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Sushiswap_LiquidityPositionSnapshotDTO::getId() const
{
    return m_Id;
}

void Sushiswap_LiquidityPositionSnapshotDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Sushiswap_LiquidityPositionSnapshotDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Sushiswap_LiquidityPositionSnapshotDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Sushiswap_LiquidityPositionSnapshotDTO::getLiquidityPosition() const
{
    return m_Liquidity_position;
}

void Sushiswap_LiquidityPositionSnapshotDTO::setLiquidityPosition(const utility::string_t& value)
{
    m_Liquidity_position = value;
    m_Liquidity_positionIsSet = true;
}

bool Sushiswap_LiquidityPositionSnapshotDTO::liquidityPositionIsSet() const
{
    return m_Liquidity_positionIsSet;
}

void Sushiswap_LiquidityPositionSnapshotDTO::unsetLiquidity_position()
{
    m_Liquidity_positionIsSet = false;
}
int32_t Sushiswap_LiquidityPositionSnapshotDTO::getTimestamp() const
{
    return m_Timestamp;
}

void Sushiswap_LiquidityPositionSnapshotDTO::setTimestamp(int32_t value)
{
    m_Timestamp = value;
    m_TimestampIsSet = true;
}

bool Sushiswap_LiquidityPositionSnapshotDTO::timestampIsSet() const
{
    return m_TimestampIsSet;
}

void Sushiswap_LiquidityPositionSnapshotDTO::unsetTimestamp()
{
    m_TimestampIsSet = false;
}
int32_t Sushiswap_LiquidityPositionSnapshotDTO::getBlock() const
{
    return m_Block;
}

void Sushiswap_LiquidityPositionSnapshotDTO::setBlock(int32_t value)
{
    m_Block = value;
    m_BlockIsSet = true;
}

bool Sushiswap_LiquidityPositionSnapshotDTO::blockIsSet() const
{
    return m_BlockIsSet;
}

void Sushiswap_LiquidityPositionSnapshotDTO::unsetBlock()
{
    m_BlockIsSet = false;
}
utility::string_t Sushiswap_LiquidityPositionSnapshotDTO::getUser() const
{
    return m_User;
}

void Sushiswap_LiquidityPositionSnapshotDTO::setUser(const utility::string_t& value)
{
    m_User = value;
    m_UserIsSet = true;
}

bool Sushiswap_LiquidityPositionSnapshotDTO::userIsSet() const
{
    return m_UserIsSet;
}

void Sushiswap_LiquidityPositionSnapshotDTO::unsetUser()
{
    m_UserIsSet = false;
}
utility::string_t Sushiswap_LiquidityPositionSnapshotDTO::getPair() const
{
    return m_Pair;
}

void Sushiswap_LiquidityPositionSnapshotDTO::setPair(const utility::string_t& value)
{
    m_Pair = value;
    m_PairIsSet = true;
}

bool Sushiswap_LiquidityPositionSnapshotDTO::pairIsSet() const
{
    return m_PairIsSet;
}

void Sushiswap_LiquidityPositionSnapshotDTO::unsetPair()
{
    m_PairIsSet = false;
}
utility::string_t Sushiswap_LiquidityPositionSnapshotDTO::getToken0PriceUsd() const
{
    return m_Token_0_price_usd;
}

void Sushiswap_LiquidityPositionSnapshotDTO::setToken0PriceUsd(const utility::string_t& value)
{
    m_Token_0_price_usd = value;
    m_Token_0_price_usdIsSet = true;
}

bool Sushiswap_LiquidityPositionSnapshotDTO::token0PriceUsdIsSet() const
{
    return m_Token_0_price_usdIsSet;
}

void Sushiswap_LiquidityPositionSnapshotDTO::unsetToken_0_price_usd()
{
    m_Token_0_price_usdIsSet = false;
}
utility::string_t Sushiswap_LiquidityPositionSnapshotDTO::getToken1PriceUsd() const
{
    return m_Token_1_price_usd;
}

void Sushiswap_LiquidityPositionSnapshotDTO::setToken1PriceUsd(const utility::string_t& value)
{
    m_Token_1_price_usd = value;
    m_Token_1_price_usdIsSet = true;
}

bool Sushiswap_LiquidityPositionSnapshotDTO::token1PriceUsdIsSet() const
{
    return m_Token_1_price_usdIsSet;
}

void Sushiswap_LiquidityPositionSnapshotDTO::unsetToken_1_price_usd()
{
    m_Token_1_price_usdIsSet = false;
}
utility::string_t Sushiswap_LiquidityPositionSnapshotDTO::getReserve0() const
{
    return m_Reserve_0;
}

void Sushiswap_LiquidityPositionSnapshotDTO::setReserve0(const utility::string_t& value)
{
    m_Reserve_0 = value;
    m_Reserve_0IsSet = true;
}

bool Sushiswap_LiquidityPositionSnapshotDTO::reserve0IsSet() const
{
    return m_Reserve_0IsSet;
}

void Sushiswap_LiquidityPositionSnapshotDTO::unsetReserve_0()
{
    m_Reserve_0IsSet = false;
}
utility::string_t Sushiswap_LiquidityPositionSnapshotDTO::getReserve1() const
{
    return m_Reserve_1;
}

void Sushiswap_LiquidityPositionSnapshotDTO::setReserve1(const utility::string_t& value)
{
    m_Reserve_1 = value;
    m_Reserve_1IsSet = true;
}

bool Sushiswap_LiquidityPositionSnapshotDTO::reserve1IsSet() const
{
    return m_Reserve_1IsSet;
}

void Sushiswap_LiquidityPositionSnapshotDTO::unsetReserve_1()
{
    m_Reserve_1IsSet = false;
}
utility::string_t Sushiswap_LiquidityPositionSnapshotDTO::getReserveUsd() const
{
    return m_Reserve_usd;
}

void Sushiswap_LiquidityPositionSnapshotDTO::setReserveUsd(const utility::string_t& value)
{
    m_Reserve_usd = value;
    m_Reserve_usdIsSet = true;
}

bool Sushiswap_LiquidityPositionSnapshotDTO::reserveUsdIsSet() const
{
    return m_Reserve_usdIsSet;
}

void Sushiswap_LiquidityPositionSnapshotDTO::unsetReserve_usd()
{
    m_Reserve_usdIsSet = false;
}
utility::string_t Sushiswap_LiquidityPositionSnapshotDTO::getLiquidityTokenTotalSupply() const
{
    return m_Liquidity_token_total_supply;
}

void Sushiswap_LiquidityPositionSnapshotDTO::setLiquidityTokenTotalSupply(const utility::string_t& value)
{
    m_Liquidity_token_total_supply = value;
    m_Liquidity_token_total_supplyIsSet = true;
}

bool Sushiswap_LiquidityPositionSnapshotDTO::liquidityTokenTotalSupplyIsSet() const
{
    return m_Liquidity_token_total_supplyIsSet;
}

void Sushiswap_LiquidityPositionSnapshotDTO::unsetLiquidity_token_total_supply()
{
    m_Liquidity_token_total_supplyIsSet = false;
}
utility::string_t Sushiswap_LiquidityPositionSnapshotDTO::getLiquidityTokenBalance() const
{
    return m_Liquidity_token_balance;
}

void Sushiswap_LiquidityPositionSnapshotDTO::setLiquidityTokenBalance(const utility::string_t& value)
{
    m_Liquidity_token_balance = value;
    m_Liquidity_token_balanceIsSet = true;
}

bool Sushiswap_LiquidityPositionSnapshotDTO::liquidityTokenBalanceIsSet() const
{
    return m_Liquidity_token_balanceIsSet;
}

void Sushiswap_LiquidityPositionSnapshotDTO::unsetLiquidity_token_balance()
{
    m_Liquidity_token_balanceIsSet = false;
}
int64_t Sushiswap_LiquidityPositionSnapshotDTO::getVid() const
{
    return m_Vid;
}

void Sushiswap_LiquidityPositionSnapshotDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Sushiswap_LiquidityPositionSnapshotDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Sushiswap_LiquidityPositionSnapshotDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


