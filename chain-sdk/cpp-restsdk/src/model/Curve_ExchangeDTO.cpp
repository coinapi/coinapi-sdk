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



#include "CppRestOpenAPIClient/model/Curve_ExchangeDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Curve_ExchangeDTO::Curve_ExchangeDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Pool = utility::conversions::to_string_t("");
    m_PoolIsSet = false;
    m_Buyer = utility::conversions::to_string_t("");
    m_BuyerIsSet = false;
    m_Receiver = utility::conversions::to_string_t("");
    m_ReceiverIsSet = false;
    m_Token_sold = utility::conversions::to_string_t("");
    m_Token_soldIsSet = false;
    m_Token_bought = utility::conversions::to_string_t("");
    m_Token_boughtIsSet = false;
    m_Amount_sold = utility::conversions::to_string_t("");
    m_Amount_soldIsSet = false;
    m_Amount_bought = utility::conversions::to_string_t("");
    m_Amount_boughtIsSet = false;
    m_Block = utility::conversions::to_string_t("");
    m_BlockIsSet = false;
    m_Timestamp = utility::conversions::to_string_t("");
    m_TimestampIsSet = false;
    m_Transaction = utility::conversions::to_string_t("");
    m_TransactionIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
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

Curve_ExchangeDTO::~Curve_ExchangeDTO()
{
}

void Curve_ExchangeDTO::validate()
{
    // TODO: implement validation
}

web::json::value Curve_ExchangeDTO::toJson() const
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
    if(m_PoolIsSet)
    {
        val[utility::conversions::to_string_t(U("pool"))] = ModelBase::toJson(m_Pool);
    }
    if(m_BuyerIsSet)
    {
        val[utility::conversions::to_string_t(U("buyer"))] = ModelBase::toJson(m_Buyer);
    }
    if(m_ReceiverIsSet)
    {
        val[utility::conversions::to_string_t(U("receiver"))] = ModelBase::toJson(m_Receiver);
    }
    if(m_Token_soldIsSet)
    {
        val[utility::conversions::to_string_t(U("token_sold"))] = ModelBase::toJson(m_Token_sold);
    }
    if(m_Token_boughtIsSet)
    {
        val[utility::conversions::to_string_t(U("token_bought"))] = ModelBase::toJson(m_Token_bought);
    }
    if(m_Amount_soldIsSet)
    {
        val[utility::conversions::to_string_t(U("amount_sold"))] = ModelBase::toJson(m_Amount_sold);
    }
    if(m_Amount_boughtIsSet)
    {
        val[utility::conversions::to_string_t(U("amount_bought"))] = ModelBase::toJson(m_Amount_bought);
    }
    if(m_BlockIsSet)
    {
        val[utility::conversions::to_string_t(U("block"))] = ModelBase::toJson(m_Block);
    }
    if(m_TimestampIsSet)
    {
        val[utility::conversions::to_string_t(U("timestamp"))] = ModelBase::toJson(m_Timestamp);
    }
    if(m_TransactionIsSet)
    {
        val[utility::conversions::to_string_t(U("transaction"))] = ModelBase::toJson(m_Transaction);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
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

bool Curve_ExchangeDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("buyer"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("buyer")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setBuyer;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBuyer);
            setBuyer(refVal_setBuyer);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("receiver"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("receiver")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setReceiver;
            ok &= ModelBase::fromJson(fieldValue, refVal_setReceiver);
            setReceiver(refVal_setReceiver);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("token_sold"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("token_sold")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTokenSold;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTokenSold);
            setTokenSold(refVal_setTokenSold);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("token_bought"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("token_bought")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTokenBought;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTokenBought);
            setTokenBought(refVal_setTokenBought);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("amount_sold"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("amount_sold")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAmountSold;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAmountSold);
            setAmountSold(refVal_setAmountSold);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("amount_bought"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("amount_bought")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAmountBought;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAmountBought);
            setAmountBought(refVal_setAmountBought);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("block"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("block")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setBlock;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBlock);
            setBlock(refVal_setBlock);
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

void Curve_ExchangeDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_PoolIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pool")), m_Pool));
    }
    if(m_BuyerIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("buyer")), m_Buyer));
    }
    if(m_ReceiverIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("receiver")), m_Receiver));
    }
    if(m_Token_soldIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token_sold")), m_Token_sold));
    }
    if(m_Token_boughtIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token_bought")), m_Token_bought));
    }
    if(m_Amount_soldIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("amount_sold")), m_Amount_sold));
    }
    if(m_Amount_boughtIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("amount_bought")), m_Amount_bought));
    }
    if(m_BlockIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("block")), m_Block));
    }
    if(m_TimestampIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("timestamp")), m_Timestamp));
    }
    if(m_TransactionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("transaction")), m_Transaction));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
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

bool Curve_ExchangeDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("pool"))))
    {
        utility::string_t refVal_setPool;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("pool"))), refVal_setPool );
        setPool(refVal_setPool);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("buyer"))))
    {
        utility::string_t refVal_setBuyer;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("buyer"))), refVal_setBuyer );
        setBuyer(refVal_setBuyer);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("receiver"))))
    {
        utility::string_t refVal_setReceiver;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("receiver"))), refVal_setReceiver );
        setReceiver(refVal_setReceiver);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("token_sold"))))
    {
        utility::string_t refVal_setTokenSold;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("token_sold"))), refVal_setTokenSold );
        setTokenSold(refVal_setTokenSold);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("token_bought"))))
    {
        utility::string_t refVal_setTokenBought;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("token_bought"))), refVal_setTokenBought );
        setTokenBought(refVal_setTokenBought);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("amount_sold"))))
    {
        utility::string_t refVal_setAmountSold;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("amount_sold"))), refVal_setAmountSold );
        setAmountSold(refVal_setAmountSold);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("amount_bought"))))
    {
        utility::string_t refVal_setAmountBought;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("amount_bought"))), refVal_setAmountBought );
        setAmountBought(refVal_setAmountBought);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("block"))))
    {
        utility::string_t refVal_setBlock;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("block"))), refVal_setBlock );
        setBlock(refVal_setBlock);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("timestamp"))))
    {
        utility::string_t refVal_setTimestamp;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("timestamp"))), refVal_setTimestamp );
        setTimestamp(refVal_setTimestamp);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("transaction"))))
    {
        utility::string_t refVal_setTransaction;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("transaction"))), refVal_setTransaction );
        setTransaction(refVal_setTransaction);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
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

utility::datetime Curve_ExchangeDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Curve_ExchangeDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Curve_ExchangeDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Curve_ExchangeDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Curve_ExchangeDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Curve_ExchangeDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Curve_ExchangeDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Curve_ExchangeDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Curve_ExchangeDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Curve_ExchangeDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Curve_ExchangeDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Curve_ExchangeDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Curve_ExchangeDTO::getId() const
{
    return m_Id;
}

void Curve_ExchangeDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Curve_ExchangeDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Curve_ExchangeDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Curve_ExchangeDTO::getPool() const
{
    return m_Pool;
}

void Curve_ExchangeDTO::setPool(const utility::string_t& value)
{
    m_Pool = value;
    m_PoolIsSet = true;
}

bool Curve_ExchangeDTO::poolIsSet() const
{
    return m_PoolIsSet;
}

void Curve_ExchangeDTO::unsetPool()
{
    m_PoolIsSet = false;
}
utility::string_t Curve_ExchangeDTO::getBuyer() const
{
    return m_Buyer;
}

void Curve_ExchangeDTO::setBuyer(const utility::string_t& value)
{
    m_Buyer = value;
    m_BuyerIsSet = true;
}

bool Curve_ExchangeDTO::buyerIsSet() const
{
    return m_BuyerIsSet;
}

void Curve_ExchangeDTO::unsetBuyer()
{
    m_BuyerIsSet = false;
}
utility::string_t Curve_ExchangeDTO::getReceiver() const
{
    return m_Receiver;
}

void Curve_ExchangeDTO::setReceiver(const utility::string_t& value)
{
    m_Receiver = value;
    m_ReceiverIsSet = true;
}

bool Curve_ExchangeDTO::receiverIsSet() const
{
    return m_ReceiverIsSet;
}

void Curve_ExchangeDTO::unsetReceiver()
{
    m_ReceiverIsSet = false;
}
utility::string_t Curve_ExchangeDTO::getTokenSold() const
{
    return m_Token_sold;
}

void Curve_ExchangeDTO::setTokenSold(const utility::string_t& value)
{
    m_Token_sold = value;
    m_Token_soldIsSet = true;
}

bool Curve_ExchangeDTO::tokenSoldIsSet() const
{
    return m_Token_soldIsSet;
}

void Curve_ExchangeDTO::unsetToken_sold()
{
    m_Token_soldIsSet = false;
}
utility::string_t Curve_ExchangeDTO::getTokenBought() const
{
    return m_Token_bought;
}

void Curve_ExchangeDTO::setTokenBought(const utility::string_t& value)
{
    m_Token_bought = value;
    m_Token_boughtIsSet = true;
}

bool Curve_ExchangeDTO::tokenBoughtIsSet() const
{
    return m_Token_boughtIsSet;
}

void Curve_ExchangeDTO::unsetToken_bought()
{
    m_Token_boughtIsSet = false;
}
utility::string_t Curve_ExchangeDTO::getAmountSold() const
{
    return m_Amount_sold;
}

void Curve_ExchangeDTO::setAmountSold(const utility::string_t& value)
{
    m_Amount_sold = value;
    m_Amount_soldIsSet = true;
}

bool Curve_ExchangeDTO::amountSoldIsSet() const
{
    return m_Amount_soldIsSet;
}

void Curve_ExchangeDTO::unsetAmount_sold()
{
    m_Amount_soldIsSet = false;
}
utility::string_t Curve_ExchangeDTO::getAmountBought() const
{
    return m_Amount_bought;
}

void Curve_ExchangeDTO::setAmountBought(const utility::string_t& value)
{
    m_Amount_bought = value;
    m_Amount_boughtIsSet = true;
}

bool Curve_ExchangeDTO::amountBoughtIsSet() const
{
    return m_Amount_boughtIsSet;
}

void Curve_ExchangeDTO::unsetAmount_bought()
{
    m_Amount_boughtIsSet = false;
}
utility::string_t Curve_ExchangeDTO::getBlock() const
{
    return m_Block;
}

void Curve_ExchangeDTO::setBlock(const utility::string_t& value)
{
    m_Block = value;
    m_BlockIsSet = true;
}

bool Curve_ExchangeDTO::blockIsSet() const
{
    return m_BlockIsSet;
}

void Curve_ExchangeDTO::unsetBlock()
{
    m_BlockIsSet = false;
}
utility::string_t Curve_ExchangeDTO::getTimestamp() const
{
    return m_Timestamp;
}

void Curve_ExchangeDTO::setTimestamp(const utility::string_t& value)
{
    m_Timestamp = value;
    m_TimestampIsSet = true;
}

bool Curve_ExchangeDTO::timestampIsSet() const
{
    return m_TimestampIsSet;
}

void Curve_ExchangeDTO::unsetTimestamp()
{
    m_TimestampIsSet = false;
}
utility::string_t Curve_ExchangeDTO::getTransaction() const
{
    return m_Transaction;
}

void Curve_ExchangeDTO::setTransaction(const utility::string_t& value)
{
    m_Transaction = value;
    m_TransactionIsSet = true;
}

bool Curve_ExchangeDTO::transactionIsSet() const
{
    return m_TransactionIsSet;
}

void Curve_ExchangeDTO::unsetTransaction()
{
    m_TransactionIsSet = false;
}
int64_t Curve_ExchangeDTO::getVid() const
{
    return m_Vid;
}

void Curve_ExchangeDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Curve_ExchangeDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Curve_ExchangeDTO::unsetVid()
{
    m_VidIsSet = false;
}
double Curve_ExchangeDTO::getEvaluatedPrice() const
{
    return m_Evaluated_price;
}

void Curve_ExchangeDTO::setEvaluatedPrice(double value)
{
    m_Evaluated_price = value;
    m_Evaluated_priceIsSet = true;
}

bool Curve_ExchangeDTO::evaluatedPriceIsSet() const
{
    return m_Evaluated_priceIsSet;
}

void Curve_ExchangeDTO::unsetEvaluated_price()
{
    m_Evaluated_priceIsSet = false;
}
double Curve_ExchangeDTO::getEvaluatedAmount() const
{
    return m_Evaluated_amount;
}

void Curve_ExchangeDTO::setEvaluatedAmount(double value)
{
    m_Evaluated_amount = value;
    m_Evaluated_amountIsSet = true;
}

bool Curve_ExchangeDTO::evaluatedAmountIsSet() const
{
    return m_Evaluated_amountIsSet;
}

void Curve_ExchangeDTO::unsetEvaluated_amount()
{
    m_Evaluated_amountIsSet = false;
}
std::shared_ptr<Transactions_ETradeAggressiveSide> Curve_ExchangeDTO::getEvaluatedAggressor() const
{
    return m_Evaluated_aggressor;
}

void Curve_ExchangeDTO::setEvaluatedAggressor(const std::shared_ptr<Transactions_ETradeAggressiveSide>& value)
{
    m_Evaluated_aggressor = value;
    m_Evaluated_aggressorIsSet = true;
}

bool Curve_ExchangeDTO::evaluatedAggressorIsSet() const
{
    return m_Evaluated_aggressorIsSet;
}

void Curve_ExchangeDTO::unsetEvaluated_aggressor()
{
    m_Evaluated_aggressorIsSet = false;
}
utility::string_t Curve_ExchangeDTO::getPoolId() const
{
    return m_Pool_id;
}

void Curve_ExchangeDTO::setPoolId(const utility::string_t& value)
{
    m_Pool_id = value;
    m_Pool_idIsSet = true;
}

bool Curve_ExchangeDTO::poolIdIsSet() const
{
    return m_Pool_idIsSet;
}

void Curve_ExchangeDTO::unsetPool_id()
{
    m_Pool_idIsSet = false;
}
utility::string_t Curve_ExchangeDTO::getTransactionId() const
{
    return m_Transaction_id;
}

void Curve_ExchangeDTO::setTransactionId(const utility::string_t& value)
{
    m_Transaction_id = value;
    m_Transaction_idIsSet = true;
}

bool Curve_ExchangeDTO::transactionIdIsSet() const
{
    return m_Transaction_idIsSet;
}

void Curve_ExchangeDTO::unsetTransaction_id()
{
    m_Transaction_idIsSet = false;
}
}
}
}
}


