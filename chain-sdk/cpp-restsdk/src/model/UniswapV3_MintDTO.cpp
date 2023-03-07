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



#include "CppRestOpenAPIClient/model/UniswapV3_MintDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



UniswapV3_MintDTO::UniswapV3_MintDTO()
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
    m_Pool = utility::conversions::to_string_t("");
    m_PoolIsSet = false;
    m_Token_0 = utility::conversions::to_string_t("");
    m_Token_0IsSet = false;
    m_Token_1 = utility::conversions::to_string_t("");
    m_Token_1IsSet = false;
    m_Owner = utility::conversions::to_string_t("");
    m_OwnerIsSet = false;
    m_Sender = utility::conversions::to_string_t("");
    m_SenderIsSet = false;
    m_Origin = utility::conversions::to_string_t("");
    m_OriginIsSet = false;
    m_Amount = utility::conversions::to_string_t("");
    m_AmountIsSet = false;
    m_Amount_0 = utility::conversions::to_string_t("");
    m_Amount_0IsSet = false;
    m_Amount_1 = utility::conversions::to_string_t("");
    m_Amount_1IsSet = false;
    m_Amount_usd = utility::conversions::to_string_t("");
    m_Amount_usdIsSet = false;
    m_Tick_lower = utility::conversions::to_string_t("");
    m_Tick_lowerIsSet = false;
    m_Tick_upper = utility::conversions::to_string_t("");
    m_Tick_upperIsSet = false;
    m_Log_index = utility::conversions::to_string_t("");
    m_Log_indexIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

UniswapV3_MintDTO::~UniswapV3_MintDTO()
{
}

void UniswapV3_MintDTO::validate()
{
    // TODO: implement validation
}

web::json::value UniswapV3_MintDTO::toJson() const
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
    if(m_PoolIsSet)
    {
        val[utility::conversions::to_string_t(U("pool"))] = ModelBase::toJson(m_Pool);
    }
    if(m_Token_0IsSet)
    {
        val[utility::conversions::to_string_t(U("token_0"))] = ModelBase::toJson(m_Token_0);
    }
    if(m_Token_1IsSet)
    {
        val[utility::conversions::to_string_t(U("token_1"))] = ModelBase::toJson(m_Token_1);
    }
    if(m_OwnerIsSet)
    {
        val[utility::conversions::to_string_t(U("owner"))] = ModelBase::toJson(m_Owner);
    }
    if(m_SenderIsSet)
    {
        val[utility::conversions::to_string_t(U("sender"))] = ModelBase::toJson(m_Sender);
    }
    if(m_OriginIsSet)
    {
        val[utility::conversions::to_string_t(U("origin"))] = ModelBase::toJson(m_Origin);
    }
    if(m_AmountIsSet)
    {
        val[utility::conversions::to_string_t(U("amount"))] = ModelBase::toJson(m_Amount);
    }
    if(m_Amount_0IsSet)
    {
        val[utility::conversions::to_string_t(U("amount_0"))] = ModelBase::toJson(m_Amount_0);
    }
    if(m_Amount_1IsSet)
    {
        val[utility::conversions::to_string_t(U("amount_1"))] = ModelBase::toJson(m_Amount_1);
    }
    if(m_Amount_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("amount_usd"))] = ModelBase::toJson(m_Amount_usd);
    }
    if(m_Tick_lowerIsSet)
    {
        val[utility::conversions::to_string_t(U("tick_lower"))] = ModelBase::toJson(m_Tick_lower);
    }
    if(m_Tick_upperIsSet)
    {
        val[utility::conversions::to_string_t(U("tick_upper"))] = ModelBase::toJson(m_Tick_upper);
    }
    if(m_Log_indexIsSet)
    {
        val[utility::conversions::to_string_t(U("log_index"))] = ModelBase::toJson(m_Log_index);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }

    return val;
}

bool UniswapV3_MintDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("pool"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("pool")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPool;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPool);
            setPool(refVal_setPool);
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
    if(val.has_field(utility::conversions::to_string_t(U("owner"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("owner")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setOwner;
            ok &= ModelBase::fromJson(fieldValue, refVal_setOwner);
            setOwner(refVal_setOwner);
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
    if(val.has_field(utility::conversions::to_string_t(U("origin"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("origin")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setOrigin;
            ok &= ModelBase::fromJson(fieldValue, refVal_setOrigin);
            setOrigin(refVal_setOrigin);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("amount"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("amount")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAmount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAmount);
            setAmount(refVal_setAmount);
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
    if(val.has_field(utility::conversions::to_string_t(U("tick_lower"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("tick_lower")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTickLower;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTickLower);
            setTickLower(refVal_setTickLower);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("tick_upper"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("tick_upper")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTickUpper;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTickUpper);
            setTickUpper(refVal_setTickUpper);
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

void UniswapV3_MintDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_PoolIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pool")), m_Pool));
    }
    if(m_Token_0IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token_0")), m_Token_0));
    }
    if(m_Token_1IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token_1")), m_Token_1));
    }
    if(m_OwnerIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("owner")), m_Owner));
    }
    if(m_SenderIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("sender")), m_Sender));
    }
    if(m_OriginIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("origin")), m_Origin));
    }
    if(m_AmountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("amount")), m_Amount));
    }
    if(m_Amount_0IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("amount_0")), m_Amount_0));
    }
    if(m_Amount_1IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("amount_1")), m_Amount_1));
    }
    if(m_Amount_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("amount_usd")), m_Amount_usd));
    }
    if(m_Tick_lowerIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("tick_lower")), m_Tick_lower));
    }
    if(m_Tick_upperIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("tick_upper")), m_Tick_upper));
    }
    if(m_Log_indexIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("log_index")), m_Log_index));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
}

bool UniswapV3_MintDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("pool"))))
    {
        utility::string_t refVal_setPool;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("pool"))), refVal_setPool );
        setPool(refVal_setPool);
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("owner"))))
    {
        utility::string_t refVal_setOwner;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("owner"))), refVal_setOwner );
        setOwner(refVal_setOwner);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("sender"))))
    {
        utility::string_t refVal_setSender;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("sender"))), refVal_setSender );
        setSender(refVal_setSender);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("origin"))))
    {
        utility::string_t refVal_setOrigin;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("origin"))), refVal_setOrigin );
        setOrigin(refVal_setOrigin);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("amount"))))
    {
        utility::string_t refVal_setAmount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("amount"))), refVal_setAmount );
        setAmount(refVal_setAmount);
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("amount_usd"))))
    {
        utility::string_t refVal_setAmountUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("amount_usd"))), refVal_setAmountUsd );
        setAmountUsd(refVal_setAmountUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("tick_lower"))))
    {
        utility::string_t refVal_setTickLower;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("tick_lower"))), refVal_setTickLower );
        setTickLower(refVal_setTickLower);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("tick_upper"))))
    {
        utility::string_t refVal_setTickUpper;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("tick_upper"))), refVal_setTickUpper );
        setTickUpper(refVal_setTickUpper);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("log_index"))))
    {
        utility::string_t refVal_setLogIndex;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("log_index"))), refVal_setLogIndex );
        setLogIndex(refVal_setLogIndex);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    return ok;
}

utility::datetime UniswapV3_MintDTO::getEntryTime() const
{
    return m_Entry_time;
}

void UniswapV3_MintDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool UniswapV3_MintDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void UniswapV3_MintDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime UniswapV3_MintDTO::getRecvTime() const
{
    return m_Recv_time;
}

void UniswapV3_MintDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool UniswapV3_MintDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void UniswapV3_MintDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t UniswapV3_MintDTO::getBlockNumber() const
{
    return m_Block_number;
}

void UniswapV3_MintDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool UniswapV3_MintDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void UniswapV3_MintDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t UniswapV3_MintDTO::getId() const
{
    return m_Id;
}

void UniswapV3_MintDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool UniswapV3_MintDTO::idIsSet() const
{
    return m_IdIsSet;
}

void UniswapV3_MintDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t UniswapV3_MintDTO::getTransaction() const
{
    return m_Transaction;
}

void UniswapV3_MintDTO::setTransaction(const utility::string_t& value)
{
    m_Transaction = value;
    m_TransactionIsSet = true;
}

bool UniswapV3_MintDTO::transactionIsSet() const
{
    return m_TransactionIsSet;
}

void UniswapV3_MintDTO::unsetTransaction()
{
    m_TransactionIsSet = false;
}
utility::string_t UniswapV3_MintDTO::getTimestamp() const
{
    return m_Timestamp;
}

void UniswapV3_MintDTO::setTimestamp(const utility::string_t& value)
{
    m_Timestamp = value;
    m_TimestampIsSet = true;
}

bool UniswapV3_MintDTO::timestampIsSet() const
{
    return m_TimestampIsSet;
}

void UniswapV3_MintDTO::unsetTimestamp()
{
    m_TimestampIsSet = false;
}
utility::string_t UniswapV3_MintDTO::getPool() const
{
    return m_Pool;
}

void UniswapV3_MintDTO::setPool(const utility::string_t& value)
{
    m_Pool = value;
    m_PoolIsSet = true;
}

bool UniswapV3_MintDTO::poolIsSet() const
{
    return m_PoolIsSet;
}

void UniswapV3_MintDTO::unsetPool()
{
    m_PoolIsSet = false;
}
utility::string_t UniswapV3_MintDTO::getToken0() const
{
    return m_Token_0;
}

void UniswapV3_MintDTO::setToken0(const utility::string_t& value)
{
    m_Token_0 = value;
    m_Token_0IsSet = true;
}

bool UniswapV3_MintDTO::token0IsSet() const
{
    return m_Token_0IsSet;
}

void UniswapV3_MintDTO::unsetToken_0()
{
    m_Token_0IsSet = false;
}
utility::string_t UniswapV3_MintDTO::getToken1() const
{
    return m_Token_1;
}

void UniswapV3_MintDTO::setToken1(const utility::string_t& value)
{
    m_Token_1 = value;
    m_Token_1IsSet = true;
}

bool UniswapV3_MintDTO::token1IsSet() const
{
    return m_Token_1IsSet;
}

void UniswapV3_MintDTO::unsetToken_1()
{
    m_Token_1IsSet = false;
}
utility::string_t UniswapV3_MintDTO::getOwner() const
{
    return m_Owner;
}

void UniswapV3_MintDTO::setOwner(const utility::string_t& value)
{
    m_Owner = value;
    m_OwnerIsSet = true;
}

bool UniswapV3_MintDTO::ownerIsSet() const
{
    return m_OwnerIsSet;
}

void UniswapV3_MintDTO::unsetOwner()
{
    m_OwnerIsSet = false;
}
utility::string_t UniswapV3_MintDTO::getSender() const
{
    return m_Sender;
}

void UniswapV3_MintDTO::setSender(const utility::string_t& value)
{
    m_Sender = value;
    m_SenderIsSet = true;
}

bool UniswapV3_MintDTO::senderIsSet() const
{
    return m_SenderIsSet;
}

void UniswapV3_MintDTO::unsetSender()
{
    m_SenderIsSet = false;
}
utility::string_t UniswapV3_MintDTO::getOrigin() const
{
    return m_Origin;
}

void UniswapV3_MintDTO::setOrigin(const utility::string_t& value)
{
    m_Origin = value;
    m_OriginIsSet = true;
}

bool UniswapV3_MintDTO::originIsSet() const
{
    return m_OriginIsSet;
}

void UniswapV3_MintDTO::unsetOrigin()
{
    m_OriginIsSet = false;
}
utility::string_t UniswapV3_MintDTO::getAmount() const
{
    return m_Amount;
}

void UniswapV3_MintDTO::setAmount(const utility::string_t& value)
{
    m_Amount = value;
    m_AmountIsSet = true;
}

bool UniswapV3_MintDTO::amountIsSet() const
{
    return m_AmountIsSet;
}

void UniswapV3_MintDTO::unsetAmount()
{
    m_AmountIsSet = false;
}
utility::string_t UniswapV3_MintDTO::getAmount0() const
{
    return m_Amount_0;
}

void UniswapV3_MintDTO::setAmount0(const utility::string_t& value)
{
    m_Amount_0 = value;
    m_Amount_0IsSet = true;
}

bool UniswapV3_MintDTO::amount0IsSet() const
{
    return m_Amount_0IsSet;
}

void UniswapV3_MintDTO::unsetAmount_0()
{
    m_Amount_0IsSet = false;
}
utility::string_t UniswapV3_MintDTO::getAmount1() const
{
    return m_Amount_1;
}

void UniswapV3_MintDTO::setAmount1(const utility::string_t& value)
{
    m_Amount_1 = value;
    m_Amount_1IsSet = true;
}

bool UniswapV3_MintDTO::amount1IsSet() const
{
    return m_Amount_1IsSet;
}

void UniswapV3_MintDTO::unsetAmount_1()
{
    m_Amount_1IsSet = false;
}
utility::string_t UniswapV3_MintDTO::getAmountUsd() const
{
    return m_Amount_usd;
}

void UniswapV3_MintDTO::setAmountUsd(const utility::string_t& value)
{
    m_Amount_usd = value;
    m_Amount_usdIsSet = true;
}

bool UniswapV3_MintDTO::amountUsdIsSet() const
{
    return m_Amount_usdIsSet;
}

void UniswapV3_MintDTO::unsetAmount_usd()
{
    m_Amount_usdIsSet = false;
}
utility::string_t UniswapV3_MintDTO::getTickLower() const
{
    return m_Tick_lower;
}

void UniswapV3_MintDTO::setTickLower(const utility::string_t& value)
{
    m_Tick_lower = value;
    m_Tick_lowerIsSet = true;
}

bool UniswapV3_MintDTO::tickLowerIsSet() const
{
    return m_Tick_lowerIsSet;
}

void UniswapV3_MintDTO::unsetTick_lower()
{
    m_Tick_lowerIsSet = false;
}
utility::string_t UniswapV3_MintDTO::getTickUpper() const
{
    return m_Tick_upper;
}

void UniswapV3_MintDTO::setTickUpper(const utility::string_t& value)
{
    m_Tick_upper = value;
    m_Tick_upperIsSet = true;
}

bool UniswapV3_MintDTO::tickUpperIsSet() const
{
    return m_Tick_upperIsSet;
}

void UniswapV3_MintDTO::unsetTick_upper()
{
    m_Tick_upperIsSet = false;
}
utility::string_t UniswapV3_MintDTO::getLogIndex() const
{
    return m_Log_index;
}

void UniswapV3_MintDTO::setLogIndex(const utility::string_t& value)
{
    m_Log_index = value;
    m_Log_indexIsSet = true;
}

bool UniswapV3_MintDTO::logIndexIsSet() const
{
    return m_Log_indexIsSet;
}

void UniswapV3_MintDTO::unsetLog_index()
{
    m_Log_indexIsSet = false;
}
int64_t UniswapV3_MintDTO::getVid() const
{
    return m_Vid;
}

void UniswapV3_MintDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool UniswapV3_MintDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void UniswapV3_MintDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


