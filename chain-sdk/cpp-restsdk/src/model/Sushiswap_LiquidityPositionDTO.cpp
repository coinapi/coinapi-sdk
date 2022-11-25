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



#include "CppRestOpenAPIClient/model/Sushiswap_LiquidityPositionDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Sushiswap_LiquidityPositionDTO::Sushiswap_LiquidityPositionDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_User = utility::conversions::to_string_t("");
    m_UserIsSet = false;
    m_Pair = utility::conversions::to_string_t("");
    m_PairIsSet = false;
    m_Liquidity_token_balance = utility::conversions::to_string_t("");
    m_Liquidity_token_balanceIsSet = false;
    m_Block = 0;
    m_BlockIsSet = false;
    m_Timestamp = 0;
    m_TimestampIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

Sushiswap_LiquidityPositionDTO::~Sushiswap_LiquidityPositionDTO()
{
}

void Sushiswap_LiquidityPositionDTO::validate()
{
    // TODO: implement validation
}

web::json::value Sushiswap_LiquidityPositionDTO::toJson() const
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
    if(m_UserIsSet)
    {
        val[utility::conversions::to_string_t(U("user"))] = ModelBase::toJson(m_User);
    }
    if(m_PairIsSet)
    {
        val[utility::conversions::to_string_t(U("pair"))] = ModelBase::toJson(m_Pair);
    }
    if(m_Liquidity_token_balanceIsSet)
    {
        val[utility::conversions::to_string_t(U("liquidity_token_balance"))] = ModelBase::toJson(m_Liquidity_token_balance);
    }
    if(m_BlockIsSet)
    {
        val[utility::conversions::to_string_t(U("block"))] = ModelBase::toJson(m_Block);
    }
    if(m_TimestampIsSet)
    {
        val[utility::conversions::to_string_t(U("timestamp"))] = ModelBase::toJson(m_Timestamp);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }

    return val;
}

bool Sushiswap_LiquidityPositionDTO::fromJson(const web::json::value& val)
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

void Sushiswap_LiquidityPositionDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_UserIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("user")), m_User));
    }
    if(m_PairIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pair")), m_Pair));
    }
    if(m_Liquidity_token_balanceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("liquidity_token_balance")), m_Liquidity_token_balance));
    }
    if(m_BlockIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("block")), m_Block));
    }
    if(m_TimestampIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("timestamp")), m_Timestamp));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
}

bool Sushiswap_LiquidityPositionDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("liquidity_token_balance"))))
    {
        utility::string_t refVal_setLiquidityTokenBalance;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("liquidity_token_balance"))), refVal_setLiquidityTokenBalance );
        setLiquidityTokenBalance(refVal_setLiquidityTokenBalance);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("block"))))
    {
        int32_t refVal_setBlock;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("block"))), refVal_setBlock );
        setBlock(refVal_setBlock);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("timestamp"))))
    {
        int32_t refVal_setTimestamp;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("timestamp"))), refVal_setTimestamp );
        setTimestamp(refVal_setTimestamp);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    return ok;
}

utility::datetime Sushiswap_LiquidityPositionDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Sushiswap_LiquidityPositionDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Sushiswap_LiquidityPositionDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Sushiswap_LiquidityPositionDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Sushiswap_LiquidityPositionDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Sushiswap_LiquidityPositionDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Sushiswap_LiquidityPositionDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Sushiswap_LiquidityPositionDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Sushiswap_LiquidityPositionDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Sushiswap_LiquidityPositionDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Sushiswap_LiquidityPositionDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Sushiswap_LiquidityPositionDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Sushiswap_LiquidityPositionDTO::getId() const
{
    return m_Id;
}

void Sushiswap_LiquidityPositionDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Sushiswap_LiquidityPositionDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Sushiswap_LiquidityPositionDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Sushiswap_LiquidityPositionDTO::getUser() const
{
    return m_User;
}

void Sushiswap_LiquidityPositionDTO::setUser(const utility::string_t& value)
{
    m_User = value;
    m_UserIsSet = true;
}

bool Sushiswap_LiquidityPositionDTO::userIsSet() const
{
    return m_UserIsSet;
}

void Sushiswap_LiquidityPositionDTO::unsetUser()
{
    m_UserIsSet = false;
}
utility::string_t Sushiswap_LiquidityPositionDTO::getPair() const
{
    return m_Pair;
}

void Sushiswap_LiquidityPositionDTO::setPair(const utility::string_t& value)
{
    m_Pair = value;
    m_PairIsSet = true;
}

bool Sushiswap_LiquidityPositionDTO::pairIsSet() const
{
    return m_PairIsSet;
}

void Sushiswap_LiquidityPositionDTO::unsetPair()
{
    m_PairIsSet = false;
}
utility::string_t Sushiswap_LiquidityPositionDTO::getLiquidityTokenBalance() const
{
    return m_Liquidity_token_balance;
}

void Sushiswap_LiquidityPositionDTO::setLiquidityTokenBalance(const utility::string_t& value)
{
    m_Liquidity_token_balance = value;
    m_Liquidity_token_balanceIsSet = true;
}

bool Sushiswap_LiquidityPositionDTO::liquidityTokenBalanceIsSet() const
{
    return m_Liquidity_token_balanceIsSet;
}

void Sushiswap_LiquidityPositionDTO::unsetLiquidity_token_balance()
{
    m_Liquidity_token_balanceIsSet = false;
}
int32_t Sushiswap_LiquidityPositionDTO::getBlock() const
{
    return m_Block;
}

void Sushiswap_LiquidityPositionDTO::setBlock(int32_t value)
{
    m_Block = value;
    m_BlockIsSet = true;
}

bool Sushiswap_LiquidityPositionDTO::blockIsSet() const
{
    return m_BlockIsSet;
}

void Sushiswap_LiquidityPositionDTO::unsetBlock()
{
    m_BlockIsSet = false;
}
int32_t Sushiswap_LiquidityPositionDTO::getTimestamp() const
{
    return m_Timestamp;
}

void Sushiswap_LiquidityPositionDTO::setTimestamp(int32_t value)
{
    m_Timestamp = value;
    m_TimestampIsSet = true;
}

bool Sushiswap_LiquidityPositionDTO::timestampIsSet() const
{
    return m_TimestampIsSet;
}

void Sushiswap_LiquidityPositionDTO::unsetTimestamp()
{
    m_TimestampIsSet = false;
}
int64_t Sushiswap_LiquidityPositionDTO::getVid() const
{
    return m_Vid;
}

void Sushiswap_LiquidityPositionDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Sushiswap_LiquidityPositionDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Sushiswap_LiquidityPositionDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


