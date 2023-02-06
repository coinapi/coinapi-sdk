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



#include "CppRestOpenAPIClient/model/UniswapV3_SwapDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



UniswapV3_SwapDTO::UniswapV3_SwapDTO()
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
    m_Transaction = utility::conversions::to_string_t("");
    m_TransactionIsSet = false;
    m_Timestamp = utility::datetime();
    m_TimestampIsSet = false;
    m_Pool = utility::conversions::to_string_t("");
    m_PoolIsSet = false;
    m_Token_0 = utility::conversions::to_string_t("");
    m_Token_0IsSet = false;
    m_Token_1 = utility::conversions::to_string_t("");
    m_Token_1IsSet = false;
    m_Sender = utility::conversions::to_string_t("");
    m_SenderIsSet = false;
    m_Recipient = utility::conversions::to_string_t("");
    m_RecipientIsSet = false;
    m_Origin = utility::conversions::to_string_t("");
    m_OriginIsSet = false;
    m_Amount_0 = utility::conversions::to_string_t("");
    m_Amount_0IsSet = false;
    m_Amount_1 = utility::conversions::to_string_t("");
    m_Amount_1IsSet = false;
    m_Amount_usd = utility::conversions::to_string_t("");
    m_Amount_usdIsSet = false;
    m_Sqrt_price_x96IsSet = false;
    m_TickIsSet = false;
    m_Log_indexIsSet = false;
    m_Evaluated_price = 0.0;
    m_Evaluated_priceIsSet = false;
    m_Evaluated_amount = 0.0;
    m_Evaluated_amountIsSet = false;
    m_Evaluated_aggressorIsSet = false;
    m_Pool_id = utility::conversions::to_string_t("");
    m_Pool_idIsSet = false;
    m_Transaction_id = utility::conversions::to_string_t("");
    m_Transaction_idIsSet = false;
}

UniswapV3_SwapDTO::~UniswapV3_SwapDTO()
{
}

void UniswapV3_SwapDTO::validate()
{
    // TODO: implement validation
}

web::json::value UniswapV3_SwapDTO::toJson() const
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
    if(m_SenderIsSet)
    {
        val[utility::conversions::to_string_t(U("sender"))] = ModelBase::toJson(m_Sender);
    }
    if(m_RecipientIsSet)
    {
        val[utility::conversions::to_string_t(U("recipient"))] = ModelBase::toJson(m_Recipient);
    }
    if(m_OriginIsSet)
    {
        val[utility::conversions::to_string_t(U("origin"))] = ModelBase::toJson(m_Origin);
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
    if(m_Sqrt_price_x96IsSet)
    {
        val[utility::conversions::to_string_t(U("sqrt_price_x96"))] = ModelBase::toJson(m_Sqrt_price_x96);
    }
    if(m_TickIsSet)
    {
        val[utility::conversions::to_string_t(U("tick"))] = ModelBase::toJson(m_Tick);
    }
    if(m_Log_indexIsSet)
    {
        val[utility::conversions::to_string_t(U("log_index"))] = ModelBase::toJson(m_Log_index);
    }
    if(m_Evaluated_priceIsSet)
    {
        val[utility::conversions::to_string_t(U("evaluated_price"))] = ModelBase::toJson(m_Evaluated_price);
    }
    if(m_Evaluated_amountIsSet)
    {
        val[utility::conversions::to_string_t(U("evaluated_amount"))] = ModelBase::toJson(m_Evaluated_amount);
    }
    if(m_Evaluated_aggressorIsSet)
    {
        val[utility::conversions::to_string_t(U("evaluated_aggressor"))] = ModelBase::toJson(m_Evaluated_aggressor);
    }
    if(m_Pool_idIsSet)
    {
        val[utility::conversions::to_string_t(U("pool_id"))] = ModelBase::toJson(m_Pool_id);
    }
    if(m_Transaction_idIsSet)
    {
        val[utility::conversions::to_string_t(U("transaction_id"))] = ModelBase::toJson(m_Transaction_id);
    }

    return val;
}

bool UniswapV3_SwapDTO::fromJson(const web::json::value& val)
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
            utility::datetime refVal_setTimestamp;
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
    if(val.has_field(utility::conversions::to_string_t(U("recipient"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("recipient")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setRecipient;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRecipient);
            setRecipient(refVal_setRecipient);
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
    if(val.has_field(utility::conversions::to_string_t(U("sqrt_price_x96"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("sqrt_price_x96")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Numerics_BigInteger> refVal_setSqrtPriceX96;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSqrtPriceX96);
            setSqrtPriceX96(refVal_setSqrtPriceX96);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("tick"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("tick")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Numerics_BigInteger> refVal_setTick;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTick);
            setTick(refVal_setTick);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("log_index"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("log_index")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Numerics_BigInteger> refVal_setLogIndex;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLogIndex);
            setLogIndex(refVal_setLogIndex);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("evaluated_price"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("evaluated_price")));
        if(!fieldValue.is_null())
        {
            double refVal_setEvaluatedPrice;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEvaluatedPrice);
            setEvaluatedPrice(refVal_setEvaluatedPrice);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("evaluated_amount"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("evaluated_amount")));
        if(!fieldValue.is_null())
        {
            double refVal_setEvaluatedAmount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEvaluatedAmount);
            setEvaluatedAmount(refVal_setEvaluatedAmount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("evaluated_aggressor"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("evaluated_aggressor")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Transactions_ETradeAggressiveSide> refVal_setEvaluatedAggressor;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEvaluatedAggressor);
            setEvaluatedAggressor(refVal_setEvaluatedAggressor);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("pool_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("pool_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPoolId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPoolId);
            setPoolId(refVal_setPoolId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("transaction_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("transaction_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTransactionId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTransactionId);
            setTransactionId(refVal_setTransactionId);
        }
    }
    return ok;
}

void UniswapV3_SwapDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_SenderIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("sender")), m_Sender));
    }
    if(m_RecipientIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("recipient")), m_Recipient));
    }
    if(m_OriginIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("origin")), m_Origin));
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
    if(m_Sqrt_price_x96IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("sqrt_price_x96")), m_Sqrt_price_x96));
    }
    if(m_TickIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("tick")), m_Tick));
    }
    if(m_Log_indexIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("log_index")), m_Log_index));
    }
    if(m_Evaluated_priceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("evaluated_price")), m_Evaluated_price));
    }
    if(m_Evaluated_amountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("evaluated_amount")), m_Evaluated_amount));
    }
    if(m_Evaluated_aggressorIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("evaluated_aggressor")), m_Evaluated_aggressor));
    }
    if(m_Pool_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pool_id")), m_Pool_id));
    }
    if(m_Transaction_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("transaction_id")), m_Transaction_id));
    }
}

bool UniswapV3_SwapDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("transaction"))))
    {
        utility::string_t refVal_setTransaction;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("transaction"))), refVal_setTransaction );
        setTransaction(refVal_setTransaction);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("timestamp"))))
    {
        utility::datetime refVal_setTimestamp;
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("sender"))))
    {
        utility::string_t refVal_setSender;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("sender"))), refVal_setSender );
        setSender(refVal_setSender);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("recipient"))))
    {
        utility::string_t refVal_setRecipient;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("recipient"))), refVal_setRecipient );
        setRecipient(refVal_setRecipient);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("origin"))))
    {
        utility::string_t refVal_setOrigin;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("origin"))), refVal_setOrigin );
        setOrigin(refVal_setOrigin);
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("sqrt_price_x96"))))
    {
        std::shared_ptr<Numerics_BigInteger> refVal_setSqrtPriceX96;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("sqrt_price_x96"))), refVal_setSqrtPriceX96 );
        setSqrtPriceX96(refVal_setSqrtPriceX96);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("tick"))))
    {
        std::shared_ptr<Numerics_BigInteger> refVal_setTick;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("tick"))), refVal_setTick );
        setTick(refVal_setTick);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("log_index"))))
    {
        std::shared_ptr<Numerics_BigInteger> refVal_setLogIndex;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("log_index"))), refVal_setLogIndex );
        setLogIndex(refVal_setLogIndex);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("evaluated_price"))))
    {
        double refVal_setEvaluatedPrice;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("evaluated_price"))), refVal_setEvaluatedPrice );
        setEvaluatedPrice(refVal_setEvaluatedPrice);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("evaluated_amount"))))
    {
        double refVal_setEvaluatedAmount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("evaluated_amount"))), refVal_setEvaluatedAmount );
        setEvaluatedAmount(refVal_setEvaluatedAmount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("evaluated_aggressor"))))
    {
        std::shared_ptr<Transactions_ETradeAggressiveSide> refVal_setEvaluatedAggressor;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("evaluated_aggressor"))), refVal_setEvaluatedAggressor );
        setEvaluatedAggressor(refVal_setEvaluatedAggressor);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("pool_id"))))
    {
        utility::string_t refVal_setPoolId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("pool_id"))), refVal_setPoolId );
        setPoolId(refVal_setPoolId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("transaction_id"))))
    {
        utility::string_t refVal_setTransactionId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("transaction_id"))), refVal_setTransactionId );
        setTransactionId(refVal_setTransactionId);
    }
    return ok;
}

utility::datetime UniswapV3_SwapDTO::getEntryTime() const
{
    return m_Entry_time;
}

void UniswapV3_SwapDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool UniswapV3_SwapDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void UniswapV3_SwapDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime UniswapV3_SwapDTO::getRecvTime() const
{
    return m_Recv_time;
}

void UniswapV3_SwapDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool UniswapV3_SwapDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void UniswapV3_SwapDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t UniswapV3_SwapDTO::getBlockNumber() const
{
    return m_Block_number;
}

void UniswapV3_SwapDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool UniswapV3_SwapDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void UniswapV3_SwapDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
int64_t UniswapV3_SwapDTO::getVid() const
{
    return m_Vid;
}

void UniswapV3_SwapDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool UniswapV3_SwapDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void UniswapV3_SwapDTO::unsetVid()
{
    m_VidIsSet = false;
}
utility::string_t UniswapV3_SwapDTO::getId() const
{
    return m_Id;
}

void UniswapV3_SwapDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool UniswapV3_SwapDTO::idIsSet() const
{
    return m_IdIsSet;
}

void UniswapV3_SwapDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t UniswapV3_SwapDTO::getTransaction() const
{
    return m_Transaction;
}

void UniswapV3_SwapDTO::setTransaction(const utility::string_t& value)
{
    m_Transaction = value;
    m_TransactionIsSet = true;
}

bool UniswapV3_SwapDTO::transactionIsSet() const
{
    return m_TransactionIsSet;
}

void UniswapV3_SwapDTO::unsetTransaction()
{
    m_TransactionIsSet = false;
}
utility::datetime UniswapV3_SwapDTO::getTimestamp() const
{
    return m_Timestamp;
}

void UniswapV3_SwapDTO::setTimestamp(const utility::datetime& value)
{
    m_Timestamp = value;
    m_TimestampIsSet = true;
}

bool UniswapV3_SwapDTO::timestampIsSet() const
{
    return m_TimestampIsSet;
}

void UniswapV3_SwapDTO::unsetTimestamp()
{
    m_TimestampIsSet = false;
}
utility::string_t UniswapV3_SwapDTO::getPool() const
{
    return m_Pool;
}

void UniswapV3_SwapDTO::setPool(const utility::string_t& value)
{
    m_Pool = value;
    m_PoolIsSet = true;
}

bool UniswapV3_SwapDTO::poolIsSet() const
{
    return m_PoolIsSet;
}

void UniswapV3_SwapDTO::unsetPool()
{
    m_PoolIsSet = false;
}
utility::string_t UniswapV3_SwapDTO::getToken0() const
{
    return m_Token_0;
}

void UniswapV3_SwapDTO::setToken0(const utility::string_t& value)
{
    m_Token_0 = value;
    m_Token_0IsSet = true;
}

bool UniswapV3_SwapDTO::token0IsSet() const
{
    return m_Token_0IsSet;
}

void UniswapV3_SwapDTO::unsetToken_0()
{
    m_Token_0IsSet = false;
}
utility::string_t UniswapV3_SwapDTO::getToken1() const
{
    return m_Token_1;
}

void UniswapV3_SwapDTO::setToken1(const utility::string_t& value)
{
    m_Token_1 = value;
    m_Token_1IsSet = true;
}

bool UniswapV3_SwapDTO::token1IsSet() const
{
    return m_Token_1IsSet;
}

void UniswapV3_SwapDTO::unsetToken_1()
{
    m_Token_1IsSet = false;
}
utility::string_t UniswapV3_SwapDTO::getSender() const
{
    return m_Sender;
}

void UniswapV3_SwapDTO::setSender(const utility::string_t& value)
{
    m_Sender = value;
    m_SenderIsSet = true;
}

bool UniswapV3_SwapDTO::senderIsSet() const
{
    return m_SenderIsSet;
}

void UniswapV3_SwapDTO::unsetSender()
{
    m_SenderIsSet = false;
}
utility::string_t UniswapV3_SwapDTO::getRecipient() const
{
    return m_Recipient;
}

void UniswapV3_SwapDTO::setRecipient(const utility::string_t& value)
{
    m_Recipient = value;
    m_RecipientIsSet = true;
}

bool UniswapV3_SwapDTO::recipientIsSet() const
{
    return m_RecipientIsSet;
}

void UniswapV3_SwapDTO::unsetRecipient()
{
    m_RecipientIsSet = false;
}
utility::string_t UniswapV3_SwapDTO::getOrigin() const
{
    return m_Origin;
}

void UniswapV3_SwapDTO::setOrigin(const utility::string_t& value)
{
    m_Origin = value;
    m_OriginIsSet = true;
}

bool UniswapV3_SwapDTO::originIsSet() const
{
    return m_OriginIsSet;
}

void UniswapV3_SwapDTO::unsetOrigin()
{
    m_OriginIsSet = false;
}
utility::string_t UniswapV3_SwapDTO::getAmount0() const
{
    return m_Amount_0;
}

void UniswapV3_SwapDTO::setAmount0(const utility::string_t& value)
{
    m_Amount_0 = value;
    m_Amount_0IsSet = true;
}

bool UniswapV3_SwapDTO::amount0IsSet() const
{
    return m_Amount_0IsSet;
}

void UniswapV3_SwapDTO::unsetAmount_0()
{
    m_Amount_0IsSet = false;
}
utility::string_t UniswapV3_SwapDTO::getAmount1() const
{
    return m_Amount_1;
}

void UniswapV3_SwapDTO::setAmount1(const utility::string_t& value)
{
    m_Amount_1 = value;
    m_Amount_1IsSet = true;
}

bool UniswapV3_SwapDTO::amount1IsSet() const
{
    return m_Amount_1IsSet;
}

void UniswapV3_SwapDTO::unsetAmount_1()
{
    m_Amount_1IsSet = false;
}
utility::string_t UniswapV3_SwapDTO::getAmountUsd() const
{
    return m_Amount_usd;
}

void UniswapV3_SwapDTO::setAmountUsd(const utility::string_t& value)
{
    m_Amount_usd = value;
    m_Amount_usdIsSet = true;
}

bool UniswapV3_SwapDTO::amountUsdIsSet() const
{
    return m_Amount_usdIsSet;
}

void UniswapV3_SwapDTO::unsetAmount_usd()
{
    m_Amount_usdIsSet = false;
}
std::shared_ptr<Numerics_BigInteger> UniswapV3_SwapDTO::getSqrtPriceX96() const
{
    return m_Sqrt_price_x96;
}

void UniswapV3_SwapDTO::setSqrtPriceX96(const std::shared_ptr<Numerics_BigInteger>& value)
{
    m_Sqrt_price_x96 = value;
    m_Sqrt_price_x96IsSet = true;
}

bool UniswapV3_SwapDTO::sqrtPriceX96IsSet() const
{
    return m_Sqrt_price_x96IsSet;
}

void UniswapV3_SwapDTO::unsetSqrt_price_x96()
{
    m_Sqrt_price_x96IsSet = false;
}
std::shared_ptr<Numerics_BigInteger> UniswapV3_SwapDTO::getTick() const
{
    return m_Tick;
}

void UniswapV3_SwapDTO::setTick(const std::shared_ptr<Numerics_BigInteger>& value)
{
    m_Tick = value;
    m_TickIsSet = true;
}

bool UniswapV3_SwapDTO::tickIsSet() const
{
    return m_TickIsSet;
}

void UniswapV3_SwapDTO::unsetTick()
{
    m_TickIsSet = false;
}
std::shared_ptr<Numerics_BigInteger> UniswapV3_SwapDTO::getLogIndex() const
{
    return m_Log_index;
}

void UniswapV3_SwapDTO::setLogIndex(const std::shared_ptr<Numerics_BigInteger>& value)
{
    m_Log_index = value;
    m_Log_indexIsSet = true;
}

bool UniswapV3_SwapDTO::logIndexIsSet() const
{
    return m_Log_indexIsSet;
}

void UniswapV3_SwapDTO::unsetLog_index()
{
    m_Log_indexIsSet = false;
}
double UniswapV3_SwapDTO::getEvaluatedPrice() const
{
    return m_Evaluated_price;
}

void UniswapV3_SwapDTO::setEvaluatedPrice(double value)
{
    m_Evaluated_price = value;
    m_Evaluated_priceIsSet = true;
}

bool UniswapV3_SwapDTO::evaluatedPriceIsSet() const
{
    return m_Evaluated_priceIsSet;
}

void UniswapV3_SwapDTO::unsetEvaluated_price()
{
    m_Evaluated_priceIsSet = false;
}
double UniswapV3_SwapDTO::getEvaluatedAmount() const
{
    return m_Evaluated_amount;
}

void UniswapV3_SwapDTO::setEvaluatedAmount(double value)
{
    m_Evaluated_amount = value;
    m_Evaluated_amountIsSet = true;
}

bool UniswapV3_SwapDTO::evaluatedAmountIsSet() const
{
    return m_Evaluated_amountIsSet;
}

void UniswapV3_SwapDTO::unsetEvaluated_amount()
{
    m_Evaluated_amountIsSet = false;
}
std::shared_ptr<Transactions_ETradeAggressiveSide> UniswapV3_SwapDTO::getEvaluatedAggressor() const
{
    return m_Evaluated_aggressor;
}

void UniswapV3_SwapDTO::setEvaluatedAggressor(const std::shared_ptr<Transactions_ETradeAggressiveSide>& value)
{
    m_Evaluated_aggressor = value;
    m_Evaluated_aggressorIsSet = true;
}

bool UniswapV3_SwapDTO::evaluatedAggressorIsSet() const
{
    return m_Evaluated_aggressorIsSet;
}

void UniswapV3_SwapDTO::unsetEvaluated_aggressor()
{
    m_Evaluated_aggressorIsSet = false;
}
utility::string_t UniswapV3_SwapDTO::getPoolId() const
{
    return m_Pool_id;
}

void UniswapV3_SwapDTO::setPoolId(const utility::string_t& value)
{
    m_Pool_id = value;
    m_Pool_idIsSet = true;
}

bool UniswapV3_SwapDTO::poolIdIsSet() const
{
    return m_Pool_idIsSet;
}

void UniswapV3_SwapDTO::unsetPool_id()
{
    m_Pool_idIsSet = false;
}
utility::string_t UniswapV3_SwapDTO::getTransactionId() const
{
    return m_Transaction_id;
}

void UniswapV3_SwapDTO::setTransactionId(const utility::string_t& value)
{
    m_Transaction_id = value;
    m_Transaction_idIsSet = true;
}

bool UniswapV3_SwapDTO::transactionIdIsSet() const
{
    return m_Transaction_idIsSet;
}

void UniswapV3_SwapDTO::unsetTransaction_id()
{
    m_Transaction_idIsSet = false;
}
}
}
}
}


