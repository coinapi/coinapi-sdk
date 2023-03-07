/**
 * On Chain Dapps - REST API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/Sushiswap_MintDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Sushiswap_MintDTO::Sushiswap_MintDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Transaction = utility::conversions::to_string_t("");
    m_TransactionIsSet = false;
    m_Timestamp = utility::conversions::to_string_t("");
    m_TimestampIsSet = false;
    m_Pair = utility::conversions::to_string_t("");
    m_PairIsSet = false;
    m_To = utility::conversions::to_string_t("");
    m_ToIsSet = false;
    m_Liquidity = utility::conversions::to_string_t("");
    m_LiquidityIsSet = false;
    m_Sender = utility::conversions::to_string_t("");
    m_SenderIsSet = false;
    m_Amount_0 = utility::conversions::to_string_t("");
    m_Amount_0IsSet = false;
    m_Amount_1 = utility::conversions::to_string_t("");
    m_Amount_1IsSet = false;
    m_Log_index = utility::conversions::to_string_t("");
    m_Log_indexIsSet = false;
    m_Amount_usd = utility::conversions::to_string_t("");
    m_Amount_usdIsSet = false;
    m_Fee_to = utility::conversions::to_string_t("");
    m_Fee_toIsSet = false;
    m_Fee_liquidity = utility::conversions::to_string_t("");
    m_Fee_liquidityIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

Sushiswap_MintDTO::~Sushiswap_MintDTO()
{
}

void Sushiswap_MintDTO::validate()
{
    // TODO: implement validation
}

web::json::value Sushiswap_MintDTO::toJson() const
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
    if(m_TransactionIsSet)
    {
        val[utility::conversions::to_string_t(U("transaction"))] = ModelBase::toJson(m_Transaction);
    }
    if(m_TimestampIsSet)
    {
        val[utility::conversions::to_string_t(U("timestamp"))] = ModelBase::toJson(m_Timestamp);
    }
    if(m_PairIsSet)
    {
        val[utility::conversions::to_string_t(U("pair"))] = ModelBase::toJson(m_Pair);
    }
    if(m_ToIsSet)
    {
        val[utility::conversions::to_string_t(U("to"))] = ModelBase::toJson(m_To);
    }
    if(m_LiquidityIsSet)
    {
        val[utility::conversions::to_string_t(U("liquidity"))] = ModelBase::toJson(m_Liquidity);
    }
    if(m_SenderIsSet)
    {
        val[utility::conversions::to_string_t(U("sender"))] = ModelBase::toJson(m_Sender);
    }
    if(m_Amount_0IsSet)
    {
        val[utility::conversions::to_string_t(U("amount_0"))] = ModelBase::toJson(m_Amount_0);
    }
    if(m_Amount_1IsSet)
    {
        val[utility::conversions::to_string_t(U("amount_1"))] = ModelBase::toJson(m_Amount_1);
    }
    if(m_Log_indexIsSet)
    {
        val[utility::conversions::to_string_t(U("log_index"))] = ModelBase::toJson(m_Log_index);
    }
    if(m_Amount_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("amount_usd"))] = ModelBase::toJson(m_Amount_usd);
    }
    if(m_Fee_toIsSet)
    {
        val[utility::conversions::to_string_t(U("fee_to"))] = ModelBase::toJson(m_Fee_to);
    }
    if(m_Fee_liquidityIsSet)
    {
        val[utility::conversions::to_string_t(U("fee_liquidity"))] = ModelBase::toJson(m_Fee_liquidity);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }

    return val;
}

bool Sushiswap_MintDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("transaction"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("transaction")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTransaction;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTransaction);
            setTransaction(refVal_setTransaction);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("timestamp"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("timestamp")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTimestamp;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTimestamp);
            setTimestamp(refVal_setTimestamp);
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
    if(val.has_field(utility::conversions::to_string_t(U("to"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("to")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTo;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTo);
            setTo(refVal_setTo);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("liquidity"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("liquidity")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setLiquidity;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLiquidity);
            setLiquidity(refVal_setLiquidity);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("sender"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("sender")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setSender;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSender);
            setSender(refVal_setSender);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("amount_0"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("amount_0")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAmount0;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAmount0);
            setAmount0(refVal_setAmount0);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("amount_1"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("amount_1")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAmount1;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAmount1);
            setAmount1(refVal_setAmount1);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("log_index"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("log_index")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setLogIndex;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLogIndex);
            setLogIndex(refVal_setLogIndex);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("amount_usd"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("amount_usd")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAmountUsd;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAmountUsd);
            setAmountUsd(refVal_setAmountUsd);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("fee_to"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("fee_to")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setFeeTo;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFeeTo);
            setFeeTo(refVal_setFeeTo);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("fee_liquidity"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("fee_liquidity")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setFeeLiquidity;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFeeLiquidity);
            setFeeLiquidity(refVal_setFeeLiquidity);
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

void Sushiswap_MintDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_TransactionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("transaction")), m_Transaction));
    }
    if(m_TimestampIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("timestamp")), m_Timestamp));
    }
    if(m_PairIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pair")), m_Pair));
    }
    if(m_ToIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("to")), m_To));
    }
    if(m_LiquidityIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("liquidity")), m_Liquidity));
    }
    if(m_SenderIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("sender")), m_Sender));
    }
    if(m_Amount_0IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("amount_0")), m_Amount_0));
    }
    if(m_Amount_1IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("amount_1")), m_Amount_1));
    }
    if(m_Log_indexIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("log_index")), m_Log_index));
    }
    if(m_Amount_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("amount_usd")), m_Amount_usd));
    }
    if(m_Fee_toIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("fee_to")), m_Fee_to));
    }
    if(m_Fee_liquidityIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("fee_liquidity")), m_Fee_liquidity));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
}

bool Sushiswap_MintDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("transaction"))))
    {
        utility::string_t refVal_setTransaction;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("transaction"))), refVal_setTransaction );
        setTransaction(refVal_setTransaction);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("timestamp"))))
    {
        utility::string_t refVal_setTimestamp;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("timestamp"))), refVal_setTimestamp );
        setTimestamp(refVal_setTimestamp);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("pair"))))
    {
        utility::string_t refVal_setPair;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("pair"))), refVal_setPair );
        setPair(refVal_setPair);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("to"))))
    {
        utility::string_t refVal_setTo;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("to"))), refVal_setTo );
        setTo(refVal_setTo);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("liquidity"))))
    {
        utility::string_t refVal_setLiquidity;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("liquidity"))), refVal_setLiquidity );
        setLiquidity(refVal_setLiquidity);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("sender"))))
    {
        utility::string_t refVal_setSender;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("sender"))), refVal_setSender );
        setSender(refVal_setSender);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("amount_0"))))
    {
        utility::string_t refVal_setAmount0;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("amount_0"))), refVal_setAmount0 );
        setAmount0(refVal_setAmount0);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("amount_1"))))
    {
        utility::string_t refVal_setAmount1;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("amount_1"))), refVal_setAmount1 );
        setAmount1(refVal_setAmount1);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("log_index"))))
    {
        utility::string_t refVal_setLogIndex;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("log_index"))), refVal_setLogIndex );
        setLogIndex(refVal_setLogIndex);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("amount_usd"))))
    {
        utility::string_t refVal_setAmountUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("amount_usd"))), refVal_setAmountUsd );
        setAmountUsd(refVal_setAmountUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("fee_to"))))
    {
        utility::string_t refVal_setFeeTo;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("fee_to"))), refVal_setFeeTo );
        setFeeTo(refVal_setFeeTo);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("fee_liquidity"))))
    {
        utility::string_t refVal_setFeeLiquidity;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("fee_liquidity"))), refVal_setFeeLiquidity );
        setFeeLiquidity(refVal_setFeeLiquidity);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    return ok;
}

utility::datetime Sushiswap_MintDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Sushiswap_MintDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Sushiswap_MintDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Sushiswap_MintDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Sushiswap_MintDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Sushiswap_MintDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Sushiswap_MintDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Sushiswap_MintDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Sushiswap_MintDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Sushiswap_MintDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Sushiswap_MintDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Sushiswap_MintDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Sushiswap_MintDTO::getId() const
{
    return m_Id;
}

void Sushiswap_MintDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Sushiswap_MintDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Sushiswap_MintDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Sushiswap_MintDTO::getTransaction() const
{
    return m_Transaction;
}

void Sushiswap_MintDTO::setTransaction(const utility::string_t& value)
{
    m_Transaction = value;
    m_TransactionIsSet = true;
}

bool Sushiswap_MintDTO::transactionIsSet() const
{
    return m_TransactionIsSet;
}

void Sushiswap_MintDTO::unsetTransaction()
{
    m_TransactionIsSet = false;
}
utility::string_t Sushiswap_MintDTO::getTimestamp() const
{
    return m_Timestamp;
}

void Sushiswap_MintDTO::setTimestamp(const utility::string_t& value)
{
    m_Timestamp = value;
    m_TimestampIsSet = true;
}

bool Sushiswap_MintDTO::timestampIsSet() const
{
    return m_TimestampIsSet;
}

void Sushiswap_MintDTO::unsetTimestamp()
{
    m_TimestampIsSet = false;
}
utility::string_t Sushiswap_MintDTO::getPair() const
{
    return m_Pair;
}

void Sushiswap_MintDTO::setPair(const utility::string_t& value)
{
    m_Pair = value;
    m_PairIsSet = true;
}

bool Sushiswap_MintDTO::pairIsSet() const
{
    return m_PairIsSet;
}

void Sushiswap_MintDTO::unsetPair()
{
    m_PairIsSet = false;
}
utility::string_t Sushiswap_MintDTO::getTo() const
{
    return m_To;
}

void Sushiswap_MintDTO::setTo(const utility::string_t& value)
{
    m_To = value;
    m_ToIsSet = true;
}

bool Sushiswap_MintDTO::toIsSet() const
{
    return m_ToIsSet;
}

void Sushiswap_MintDTO::unsetTo()
{
    m_ToIsSet = false;
}
utility::string_t Sushiswap_MintDTO::getLiquidity() const
{
    return m_Liquidity;
}

void Sushiswap_MintDTO::setLiquidity(const utility::string_t& value)
{
    m_Liquidity = value;
    m_LiquidityIsSet = true;
}

bool Sushiswap_MintDTO::liquidityIsSet() const
{
    return m_LiquidityIsSet;
}

void Sushiswap_MintDTO::unsetLiquidity()
{
    m_LiquidityIsSet = false;
}
utility::string_t Sushiswap_MintDTO::getSender() const
{
    return m_Sender;
}

void Sushiswap_MintDTO::setSender(const utility::string_t& value)
{
    m_Sender = value;
    m_SenderIsSet = true;
}

bool Sushiswap_MintDTO::senderIsSet() const
{
    return m_SenderIsSet;
}

void Sushiswap_MintDTO::unsetSender()
{
    m_SenderIsSet = false;
}
utility::string_t Sushiswap_MintDTO::getAmount0() const
{
    return m_Amount_0;
}

void Sushiswap_MintDTO::setAmount0(const utility::string_t& value)
{
    m_Amount_0 = value;
    m_Amount_0IsSet = true;
}

bool Sushiswap_MintDTO::amount0IsSet() const
{
    return m_Amount_0IsSet;
}

void Sushiswap_MintDTO::unsetAmount_0()
{
    m_Amount_0IsSet = false;
}
utility::string_t Sushiswap_MintDTO::getAmount1() const
{
    return m_Amount_1;
}

void Sushiswap_MintDTO::setAmount1(const utility::string_t& value)
{
    m_Amount_1 = value;
    m_Amount_1IsSet = true;
}

bool Sushiswap_MintDTO::amount1IsSet() const
{
    return m_Amount_1IsSet;
}

void Sushiswap_MintDTO::unsetAmount_1()
{
    m_Amount_1IsSet = false;
}
utility::string_t Sushiswap_MintDTO::getLogIndex() const
{
    return m_Log_index;
}

void Sushiswap_MintDTO::setLogIndex(const utility::string_t& value)
{
    m_Log_index = value;
    m_Log_indexIsSet = true;
}

bool Sushiswap_MintDTO::logIndexIsSet() const
{
    return m_Log_indexIsSet;
}

void Sushiswap_MintDTO::unsetLog_index()
{
    m_Log_indexIsSet = false;
}
utility::string_t Sushiswap_MintDTO::getAmountUsd() const
{
    return m_Amount_usd;
}

void Sushiswap_MintDTO::setAmountUsd(const utility::string_t& value)
{
    m_Amount_usd = value;
    m_Amount_usdIsSet = true;
}

bool Sushiswap_MintDTO::amountUsdIsSet() const
{
    return m_Amount_usdIsSet;
}

void Sushiswap_MintDTO::unsetAmount_usd()
{
    m_Amount_usdIsSet = false;
}
utility::string_t Sushiswap_MintDTO::getFeeTo() const
{
    return m_Fee_to;
}

void Sushiswap_MintDTO::setFeeTo(const utility::string_t& value)
{
    m_Fee_to = value;
    m_Fee_toIsSet = true;
}

bool Sushiswap_MintDTO::feeToIsSet() const
{
    return m_Fee_toIsSet;
}

void Sushiswap_MintDTO::unsetFee_to()
{
    m_Fee_toIsSet = false;
}
utility::string_t Sushiswap_MintDTO::getFeeLiquidity() const
{
    return m_Fee_liquidity;
}

void Sushiswap_MintDTO::setFeeLiquidity(const utility::string_t& value)
{
    m_Fee_liquidity = value;
    m_Fee_liquidityIsSet = true;
}

bool Sushiswap_MintDTO::feeLiquidityIsSet() const
{
    return m_Fee_liquidityIsSet;
}

void Sushiswap_MintDTO::unsetFee_liquidity()
{
    m_Fee_liquidityIsSet = false;
}
int64_t Sushiswap_MintDTO::getVid() const
{
    return m_Vid;
}

void Sushiswap_MintDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Sushiswap_MintDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Sushiswap_MintDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


