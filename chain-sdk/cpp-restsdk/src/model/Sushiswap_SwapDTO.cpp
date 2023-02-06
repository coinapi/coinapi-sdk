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



#include "CppRestOpenAPIClient/model/Sushiswap_SwapDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Sushiswap_SwapDTO::Sushiswap_SwapDTO()
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
    m_Sender = utility::conversions::to_string_t("");
    m_SenderIsSet = false;
    m_Amount_0_in = utility::conversions::to_string_t("");
    m_Amount_0_inIsSet = false;
    m_Amount_1_in = utility::conversions::to_string_t("");
    m_Amount_1_inIsSet = false;
    m_Amount_0_out = utility::conversions::to_string_t("");
    m_Amount_0_outIsSet = false;
    m_Amount_1_out = utility::conversions::to_string_t("");
    m_Amount_1_outIsSet = false;
    m_To = utility::conversions::to_string_t("");
    m_ToIsSet = false;
    m_Log_index = utility::conversions::to_string_t("");
    m_Log_indexIsSet = false;
    m_Amount_usd = utility::conversions::to_string_t("");
    m_Amount_usdIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
    m_Pool_id = utility::conversions::to_string_t("");
    m_Pool_idIsSet = false;
    m_Transaction_id = utility::conversions::to_string_t("");
    m_Transaction_idIsSet = false;
    m_Evaluated_price = 0.0;
    m_Evaluated_priceIsSet = false;
    m_Evaluated_amount = 0.0;
    m_Evaluated_amountIsSet = false;
    m_Evaluated_aggressorIsSet = false;
}

Sushiswap_SwapDTO::~Sushiswap_SwapDTO()
{
}

void Sushiswap_SwapDTO::validate()
{
    // TODO: implement validation
}

web::json::value Sushiswap_SwapDTO::toJson() const
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
    if(m_SenderIsSet)
    {
        val[utility::conversions::to_string_t(U("sender"))] = ModelBase::toJson(m_Sender);
    }
    if(m_Amount_0_inIsSet)
    {
        val[utility::conversions::to_string_t(U("amount_0_in"))] = ModelBase::toJson(m_Amount_0_in);
    }
    if(m_Amount_1_inIsSet)
    {
        val[utility::conversions::to_string_t(U("amount_1_in"))] = ModelBase::toJson(m_Amount_1_in);
    }
    if(m_Amount_0_outIsSet)
    {
        val[utility::conversions::to_string_t(U("amount_0_out"))] = ModelBase::toJson(m_Amount_0_out);
    }
    if(m_Amount_1_outIsSet)
    {
        val[utility::conversions::to_string_t(U("amount_1_out"))] = ModelBase::toJson(m_Amount_1_out);
    }
    if(m_ToIsSet)
    {
        val[utility::conversions::to_string_t(U("to"))] = ModelBase::toJson(m_To);
    }
    if(m_Log_indexIsSet)
    {
        val[utility::conversions::to_string_t(U("log_index"))] = ModelBase::toJson(m_Log_index);
    }
    if(m_Amount_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("amount_usd"))] = ModelBase::toJson(m_Amount_usd);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }
    if(m_Pool_idIsSet)
    {
        val[utility::conversions::to_string_t(U("pool_id"))] = ModelBase::toJson(m_Pool_id);
    }
    if(m_Transaction_idIsSet)
    {
        val[utility::conversions::to_string_t(U("transaction_id"))] = ModelBase::toJson(m_Transaction_id);
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

    return val;
}

bool Sushiswap_SwapDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("amount_0_in"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("amount_0_in")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAmount0In;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAmount0In);
            setAmount0In(refVal_setAmount0In);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("amount_1_in"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("amount_1_in")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAmount1In;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAmount1In);
            setAmount1In(refVal_setAmount1In);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("amount_0_out"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("amount_0_out")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAmount0Out;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAmount0Out);
            setAmount0Out(refVal_setAmount0Out);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("amount_1_out"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("amount_1_out")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAmount1Out;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAmount1Out);
            setAmount1Out(refVal_setAmount1Out);
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
    return ok;
}

void Sushiswap_SwapDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_SenderIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("sender")), m_Sender));
    }
    if(m_Amount_0_inIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("amount_0_in")), m_Amount_0_in));
    }
    if(m_Amount_1_inIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("amount_1_in")), m_Amount_1_in));
    }
    if(m_Amount_0_outIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("amount_0_out")), m_Amount_0_out));
    }
    if(m_Amount_1_outIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("amount_1_out")), m_Amount_1_out));
    }
    if(m_ToIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("to")), m_To));
    }
    if(m_Log_indexIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("log_index")), m_Log_index));
    }
    if(m_Amount_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("amount_usd")), m_Amount_usd));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
    if(m_Pool_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pool_id")), m_Pool_id));
    }
    if(m_Transaction_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("transaction_id")), m_Transaction_id));
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
}

bool Sushiswap_SwapDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("sender"))))
    {
        utility::string_t refVal_setSender;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("sender"))), refVal_setSender );
        setSender(refVal_setSender);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("amount_0_in"))))
    {
        utility::string_t refVal_setAmount0In;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("amount_0_in"))), refVal_setAmount0In );
        setAmount0In(refVal_setAmount0In);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("amount_1_in"))))
    {
        utility::string_t refVal_setAmount1In;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("amount_1_in"))), refVal_setAmount1In );
        setAmount1In(refVal_setAmount1In);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("amount_0_out"))))
    {
        utility::string_t refVal_setAmount0Out;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("amount_0_out"))), refVal_setAmount0Out );
        setAmount0Out(refVal_setAmount0Out);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("amount_1_out"))))
    {
        utility::string_t refVal_setAmount1Out;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("amount_1_out"))), refVal_setAmount1Out );
        setAmount1Out(refVal_setAmount1Out);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("to"))))
    {
        utility::string_t refVal_setTo;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("to"))), refVal_setTo );
        setTo(refVal_setTo);
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
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
    return ok;
}

utility::datetime Sushiswap_SwapDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Sushiswap_SwapDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Sushiswap_SwapDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Sushiswap_SwapDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Sushiswap_SwapDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Sushiswap_SwapDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Sushiswap_SwapDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Sushiswap_SwapDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Sushiswap_SwapDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Sushiswap_SwapDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Sushiswap_SwapDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Sushiswap_SwapDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Sushiswap_SwapDTO::getId() const
{
    return m_Id;
}

void Sushiswap_SwapDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Sushiswap_SwapDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Sushiswap_SwapDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Sushiswap_SwapDTO::getTransaction() const
{
    return m_Transaction;
}

void Sushiswap_SwapDTO::setTransaction(const utility::string_t& value)
{
    m_Transaction = value;
    m_TransactionIsSet = true;
}

bool Sushiswap_SwapDTO::transactionIsSet() const
{
    return m_TransactionIsSet;
}

void Sushiswap_SwapDTO::unsetTransaction()
{
    m_TransactionIsSet = false;
}
utility::string_t Sushiswap_SwapDTO::getTimestamp() const
{
    return m_Timestamp;
}

void Sushiswap_SwapDTO::setTimestamp(const utility::string_t& value)
{
    m_Timestamp = value;
    m_TimestampIsSet = true;
}

bool Sushiswap_SwapDTO::timestampIsSet() const
{
    return m_TimestampIsSet;
}

void Sushiswap_SwapDTO::unsetTimestamp()
{
    m_TimestampIsSet = false;
}
utility::string_t Sushiswap_SwapDTO::getPair() const
{
    return m_Pair;
}

void Sushiswap_SwapDTO::setPair(const utility::string_t& value)
{
    m_Pair = value;
    m_PairIsSet = true;
}

bool Sushiswap_SwapDTO::pairIsSet() const
{
    return m_PairIsSet;
}

void Sushiswap_SwapDTO::unsetPair()
{
    m_PairIsSet = false;
}
utility::string_t Sushiswap_SwapDTO::getSender() const
{
    return m_Sender;
}

void Sushiswap_SwapDTO::setSender(const utility::string_t& value)
{
    m_Sender = value;
    m_SenderIsSet = true;
}

bool Sushiswap_SwapDTO::senderIsSet() const
{
    return m_SenderIsSet;
}

void Sushiswap_SwapDTO::unsetSender()
{
    m_SenderIsSet = false;
}
utility::string_t Sushiswap_SwapDTO::getAmount0In() const
{
    return m_Amount_0_in;
}

void Sushiswap_SwapDTO::setAmount0In(const utility::string_t& value)
{
    m_Amount_0_in = value;
    m_Amount_0_inIsSet = true;
}

bool Sushiswap_SwapDTO::amount0InIsSet() const
{
    return m_Amount_0_inIsSet;
}

void Sushiswap_SwapDTO::unsetAmount_0_in()
{
    m_Amount_0_inIsSet = false;
}
utility::string_t Sushiswap_SwapDTO::getAmount1In() const
{
    return m_Amount_1_in;
}

void Sushiswap_SwapDTO::setAmount1In(const utility::string_t& value)
{
    m_Amount_1_in = value;
    m_Amount_1_inIsSet = true;
}

bool Sushiswap_SwapDTO::amount1InIsSet() const
{
    return m_Amount_1_inIsSet;
}

void Sushiswap_SwapDTO::unsetAmount_1_in()
{
    m_Amount_1_inIsSet = false;
}
utility::string_t Sushiswap_SwapDTO::getAmount0Out() const
{
    return m_Amount_0_out;
}

void Sushiswap_SwapDTO::setAmount0Out(const utility::string_t& value)
{
    m_Amount_0_out = value;
    m_Amount_0_outIsSet = true;
}

bool Sushiswap_SwapDTO::amount0OutIsSet() const
{
    return m_Amount_0_outIsSet;
}

void Sushiswap_SwapDTO::unsetAmount_0_out()
{
    m_Amount_0_outIsSet = false;
}
utility::string_t Sushiswap_SwapDTO::getAmount1Out() const
{
    return m_Amount_1_out;
}

void Sushiswap_SwapDTO::setAmount1Out(const utility::string_t& value)
{
    m_Amount_1_out = value;
    m_Amount_1_outIsSet = true;
}

bool Sushiswap_SwapDTO::amount1OutIsSet() const
{
    return m_Amount_1_outIsSet;
}

void Sushiswap_SwapDTO::unsetAmount_1_out()
{
    m_Amount_1_outIsSet = false;
}
utility::string_t Sushiswap_SwapDTO::getTo() const
{
    return m_To;
}

void Sushiswap_SwapDTO::setTo(const utility::string_t& value)
{
    m_To = value;
    m_ToIsSet = true;
}

bool Sushiswap_SwapDTO::toIsSet() const
{
    return m_ToIsSet;
}

void Sushiswap_SwapDTO::unsetTo()
{
    m_ToIsSet = false;
}
utility::string_t Sushiswap_SwapDTO::getLogIndex() const
{
    return m_Log_index;
}

void Sushiswap_SwapDTO::setLogIndex(const utility::string_t& value)
{
    m_Log_index = value;
    m_Log_indexIsSet = true;
}

bool Sushiswap_SwapDTO::logIndexIsSet() const
{
    return m_Log_indexIsSet;
}

void Sushiswap_SwapDTO::unsetLog_index()
{
    m_Log_indexIsSet = false;
}
utility::string_t Sushiswap_SwapDTO::getAmountUsd() const
{
    return m_Amount_usd;
}

void Sushiswap_SwapDTO::setAmountUsd(const utility::string_t& value)
{
    m_Amount_usd = value;
    m_Amount_usdIsSet = true;
}

bool Sushiswap_SwapDTO::amountUsdIsSet() const
{
    return m_Amount_usdIsSet;
}

void Sushiswap_SwapDTO::unsetAmount_usd()
{
    m_Amount_usdIsSet = false;
}
int64_t Sushiswap_SwapDTO::getVid() const
{
    return m_Vid;
}

void Sushiswap_SwapDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Sushiswap_SwapDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Sushiswap_SwapDTO::unsetVid()
{
    m_VidIsSet = false;
}
utility::string_t Sushiswap_SwapDTO::getPoolId() const
{
    return m_Pool_id;
}

void Sushiswap_SwapDTO::setPoolId(const utility::string_t& value)
{
    m_Pool_id = value;
    m_Pool_idIsSet = true;
}

bool Sushiswap_SwapDTO::poolIdIsSet() const
{
    return m_Pool_idIsSet;
}

void Sushiswap_SwapDTO::unsetPool_id()
{
    m_Pool_idIsSet = false;
}
utility::string_t Sushiswap_SwapDTO::getTransactionId() const
{
    return m_Transaction_id;
}

void Sushiswap_SwapDTO::setTransactionId(const utility::string_t& value)
{
    m_Transaction_id = value;
    m_Transaction_idIsSet = true;
}

bool Sushiswap_SwapDTO::transactionIdIsSet() const
{
    return m_Transaction_idIsSet;
}

void Sushiswap_SwapDTO::unsetTransaction_id()
{
    m_Transaction_idIsSet = false;
}
double Sushiswap_SwapDTO::getEvaluatedPrice() const
{
    return m_Evaluated_price;
}

void Sushiswap_SwapDTO::setEvaluatedPrice(double value)
{
    m_Evaluated_price = value;
    m_Evaluated_priceIsSet = true;
}

bool Sushiswap_SwapDTO::evaluatedPriceIsSet() const
{
    return m_Evaluated_priceIsSet;
}

void Sushiswap_SwapDTO::unsetEvaluated_price()
{
    m_Evaluated_priceIsSet = false;
}
double Sushiswap_SwapDTO::getEvaluatedAmount() const
{
    return m_Evaluated_amount;
}

void Sushiswap_SwapDTO::setEvaluatedAmount(double value)
{
    m_Evaluated_amount = value;
    m_Evaluated_amountIsSet = true;
}

bool Sushiswap_SwapDTO::evaluatedAmountIsSet() const
{
    return m_Evaluated_amountIsSet;
}

void Sushiswap_SwapDTO::unsetEvaluated_amount()
{
    m_Evaluated_amountIsSet = false;
}
std::shared_ptr<Transactions_ETradeAggressiveSide> Sushiswap_SwapDTO::getEvaluatedAggressor() const
{
    return m_Evaluated_aggressor;
}

void Sushiswap_SwapDTO::setEvaluatedAggressor(const std::shared_ptr<Transactions_ETradeAggressiveSide>& value)
{
    m_Evaluated_aggressor = value;
    m_Evaluated_aggressorIsSet = true;
}

bool Sushiswap_SwapDTO::evaluatedAggressorIsSet() const
{
    return m_Evaluated_aggressorIsSet;
}

void Sushiswap_SwapDTO::unsetEvaluated_aggressor()
{
    m_Evaluated_aggressorIsSet = false;
}
}
}
}
}


