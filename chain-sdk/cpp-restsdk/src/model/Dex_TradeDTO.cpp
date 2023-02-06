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



#include "CppRestOpenAPIClient/model/Dex_TradeDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Dex_TradeDTO::Dex_TradeDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Order = utility::conversions::to_string_t("");
    m_OrderIsSet = false;
    m_Owner = utility::conversions::to_string_t("");
    m_OwnerIsSet = false;
    m_Sell_volume = utility::conversions::to_string_t("");
    m_Sell_volumeIsSet = false;
    m_Buy_volume = utility::conversions::to_string_t("");
    m_Buy_volumeIsSet = false;
    m_Trade_batch_id = utility::conversions::to_string_t("");
    m_Trade_batch_idIsSet = false;
    m_Trade_epoch = utility::conversions::to_string_t("");
    m_Trade_epochIsSet = false;
    m_Buy_token = utility::conversions::to_string_t("");
    m_Buy_tokenIsSet = false;
    m_Sell_token = utility::conversions::to_string_t("");
    m_Sell_tokenIsSet = false;
    m_Create_epoch = utility::conversions::to_string_t("");
    m_Create_epochIsSet = false;
    m_Revert_epoch = utility::conversions::to_string_t("");
    m_Revert_epochIsSet = false;
    m_Tx_hash = utility::conversions::to_string_t("");
    m_Tx_hashIsSet = false;
    m_Tx_log_index = utility::conversions::to_string_t("");
    m_Tx_log_indexIsSet = false;
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

Dex_TradeDTO::~Dex_TradeDTO()
{
}

void Dex_TradeDTO::validate()
{
    // TODO: implement validation
}

web::json::value Dex_TradeDTO::toJson() const
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
    if(m_OrderIsSet)
    {
        val[utility::conversions::to_string_t(U("order"))] = ModelBase::toJson(m_Order);
    }
    if(m_OwnerIsSet)
    {
        val[utility::conversions::to_string_t(U("owner"))] = ModelBase::toJson(m_Owner);
    }
    if(m_Sell_volumeIsSet)
    {
        val[utility::conversions::to_string_t(U("sell_volume"))] = ModelBase::toJson(m_Sell_volume);
    }
    if(m_Buy_volumeIsSet)
    {
        val[utility::conversions::to_string_t(U("buy_volume"))] = ModelBase::toJson(m_Buy_volume);
    }
    if(m_Trade_batch_idIsSet)
    {
        val[utility::conversions::to_string_t(U("trade_batch_id"))] = ModelBase::toJson(m_Trade_batch_id);
    }
    if(m_Trade_epochIsSet)
    {
        val[utility::conversions::to_string_t(U("trade_epoch"))] = ModelBase::toJson(m_Trade_epoch);
    }
    if(m_Buy_tokenIsSet)
    {
        val[utility::conversions::to_string_t(U("buy_token"))] = ModelBase::toJson(m_Buy_token);
    }
    if(m_Sell_tokenIsSet)
    {
        val[utility::conversions::to_string_t(U("sell_token"))] = ModelBase::toJson(m_Sell_token);
    }
    if(m_Create_epochIsSet)
    {
        val[utility::conversions::to_string_t(U("create_epoch"))] = ModelBase::toJson(m_Create_epoch);
    }
    if(m_Revert_epochIsSet)
    {
        val[utility::conversions::to_string_t(U("revert_epoch"))] = ModelBase::toJson(m_Revert_epoch);
    }
    if(m_Tx_hashIsSet)
    {
        val[utility::conversions::to_string_t(U("tx_hash"))] = ModelBase::toJson(m_Tx_hash);
    }
    if(m_Tx_log_indexIsSet)
    {
        val[utility::conversions::to_string_t(U("tx_log_index"))] = ModelBase::toJson(m_Tx_log_index);
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

bool Dex_TradeDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("order"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("order")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setOrder;
            ok &= ModelBase::fromJson(fieldValue, refVal_setOrder);
            setOrder(refVal_setOrder);
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
    if(val.has_field(utility::conversions::to_string_t(U("sell_volume"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("sell_volume")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setSellVolume;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSellVolume);
            setSellVolume(refVal_setSellVolume);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("buy_volume"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("buy_volume")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setBuyVolume;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBuyVolume);
            setBuyVolume(refVal_setBuyVolume);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("trade_batch_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("trade_batch_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTradeBatchId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTradeBatchId);
            setTradeBatchId(refVal_setTradeBatchId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("trade_epoch"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("trade_epoch")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTradeEpoch;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTradeEpoch);
            setTradeEpoch(refVal_setTradeEpoch);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("buy_token"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("buy_token")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setBuyToken;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBuyToken);
            setBuyToken(refVal_setBuyToken);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("sell_token"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("sell_token")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setSellToken;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSellToken);
            setSellToken(refVal_setSellToken);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("create_epoch"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("create_epoch")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCreateEpoch;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCreateEpoch);
            setCreateEpoch(refVal_setCreateEpoch);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("revert_epoch"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("revert_epoch")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setRevertEpoch;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRevertEpoch);
            setRevertEpoch(refVal_setRevertEpoch);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("tx_hash"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("tx_hash")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTxHash;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTxHash);
            setTxHash(refVal_setTxHash);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("tx_log_index"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("tx_log_index")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTxLogIndex;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTxLogIndex);
            setTxLogIndex(refVal_setTxLogIndex);
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

void Dex_TradeDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_OrderIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("order")), m_Order));
    }
    if(m_OwnerIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("owner")), m_Owner));
    }
    if(m_Sell_volumeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("sell_volume")), m_Sell_volume));
    }
    if(m_Buy_volumeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("buy_volume")), m_Buy_volume));
    }
    if(m_Trade_batch_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("trade_batch_id")), m_Trade_batch_id));
    }
    if(m_Trade_epochIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("trade_epoch")), m_Trade_epoch));
    }
    if(m_Buy_tokenIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("buy_token")), m_Buy_token));
    }
    if(m_Sell_tokenIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("sell_token")), m_Sell_token));
    }
    if(m_Create_epochIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("create_epoch")), m_Create_epoch));
    }
    if(m_Revert_epochIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("revert_epoch")), m_Revert_epoch));
    }
    if(m_Tx_hashIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("tx_hash")), m_Tx_hash));
    }
    if(m_Tx_log_indexIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("tx_log_index")), m_Tx_log_index));
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

bool Dex_TradeDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("order"))))
    {
        utility::string_t refVal_setOrder;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("order"))), refVal_setOrder );
        setOrder(refVal_setOrder);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("owner"))))
    {
        utility::string_t refVal_setOwner;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("owner"))), refVal_setOwner );
        setOwner(refVal_setOwner);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("sell_volume"))))
    {
        utility::string_t refVal_setSellVolume;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("sell_volume"))), refVal_setSellVolume );
        setSellVolume(refVal_setSellVolume);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("buy_volume"))))
    {
        utility::string_t refVal_setBuyVolume;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("buy_volume"))), refVal_setBuyVolume );
        setBuyVolume(refVal_setBuyVolume);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("trade_batch_id"))))
    {
        utility::string_t refVal_setTradeBatchId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("trade_batch_id"))), refVal_setTradeBatchId );
        setTradeBatchId(refVal_setTradeBatchId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("trade_epoch"))))
    {
        utility::string_t refVal_setTradeEpoch;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("trade_epoch"))), refVal_setTradeEpoch );
        setTradeEpoch(refVal_setTradeEpoch);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("buy_token"))))
    {
        utility::string_t refVal_setBuyToken;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("buy_token"))), refVal_setBuyToken );
        setBuyToken(refVal_setBuyToken);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("sell_token"))))
    {
        utility::string_t refVal_setSellToken;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("sell_token"))), refVal_setSellToken );
        setSellToken(refVal_setSellToken);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("create_epoch"))))
    {
        utility::string_t refVal_setCreateEpoch;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("create_epoch"))), refVal_setCreateEpoch );
        setCreateEpoch(refVal_setCreateEpoch);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("revert_epoch"))))
    {
        utility::string_t refVal_setRevertEpoch;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("revert_epoch"))), refVal_setRevertEpoch );
        setRevertEpoch(refVal_setRevertEpoch);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("tx_hash"))))
    {
        utility::string_t refVal_setTxHash;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("tx_hash"))), refVal_setTxHash );
        setTxHash(refVal_setTxHash);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("tx_log_index"))))
    {
        utility::string_t refVal_setTxLogIndex;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("tx_log_index"))), refVal_setTxLogIndex );
        setTxLogIndex(refVal_setTxLogIndex);
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

utility::datetime Dex_TradeDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Dex_TradeDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Dex_TradeDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Dex_TradeDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Dex_TradeDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Dex_TradeDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Dex_TradeDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Dex_TradeDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Dex_TradeDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Dex_TradeDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Dex_TradeDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Dex_TradeDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Dex_TradeDTO::getId() const
{
    return m_Id;
}

void Dex_TradeDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Dex_TradeDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Dex_TradeDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Dex_TradeDTO::getOrder() const
{
    return m_Order;
}

void Dex_TradeDTO::setOrder(const utility::string_t& value)
{
    m_Order = value;
    m_OrderIsSet = true;
}

bool Dex_TradeDTO::orderIsSet() const
{
    return m_OrderIsSet;
}

void Dex_TradeDTO::unsetOrder()
{
    m_OrderIsSet = false;
}
utility::string_t Dex_TradeDTO::getOwner() const
{
    return m_Owner;
}

void Dex_TradeDTO::setOwner(const utility::string_t& value)
{
    m_Owner = value;
    m_OwnerIsSet = true;
}

bool Dex_TradeDTO::ownerIsSet() const
{
    return m_OwnerIsSet;
}

void Dex_TradeDTO::unsetOwner()
{
    m_OwnerIsSet = false;
}
utility::string_t Dex_TradeDTO::getSellVolume() const
{
    return m_Sell_volume;
}

void Dex_TradeDTO::setSellVolume(const utility::string_t& value)
{
    m_Sell_volume = value;
    m_Sell_volumeIsSet = true;
}

bool Dex_TradeDTO::sellVolumeIsSet() const
{
    return m_Sell_volumeIsSet;
}

void Dex_TradeDTO::unsetSell_volume()
{
    m_Sell_volumeIsSet = false;
}
utility::string_t Dex_TradeDTO::getBuyVolume() const
{
    return m_Buy_volume;
}

void Dex_TradeDTO::setBuyVolume(const utility::string_t& value)
{
    m_Buy_volume = value;
    m_Buy_volumeIsSet = true;
}

bool Dex_TradeDTO::buyVolumeIsSet() const
{
    return m_Buy_volumeIsSet;
}

void Dex_TradeDTO::unsetBuy_volume()
{
    m_Buy_volumeIsSet = false;
}
utility::string_t Dex_TradeDTO::getTradeBatchId() const
{
    return m_Trade_batch_id;
}

void Dex_TradeDTO::setTradeBatchId(const utility::string_t& value)
{
    m_Trade_batch_id = value;
    m_Trade_batch_idIsSet = true;
}

bool Dex_TradeDTO::tradeBatchIdIsSet() const
{
    return m_Trade_batch_idIsSet;
}

void Dex_TradeDTO::unsetTrade_batch_id()
{
    m_Trade_batch_idIsSet = false;
}
utility::string_t Dex_TradeDTO::getTradeEpoch() const
{
    return m_Trade_epoch;
}

void Dex_TradeDTO::setTradeEpoch(const utility::string_t& value)
{
    m_Trade_epoch = value;
    m_Trade_epochIsSet = true;
}

bool Dex_TradeDTO::tradeEpochIsSet() const
{
    return m_Trade_epochIsSet;
}

void Dex_TradeDTO::unsetTrade_epoch()
{
    m_Trade_epochIsSet = false;
}
utility::string_t Dex_TradeDTO::getBuyToken() const
{
    return m_Buy_token;
}

void Dex_TradeDTO::setBuyToken(const utility::string_t& value)
{
    m_Buy_token = value;
    m_Buy_tokenIsSet = true;
}

bool Dex_TradeDTO::buyTokenIsSet() const
{
    return m_Buy_tokenIsSet;
}

void Dex_TradeDTO::unsetBuy_token()
{
    m_Buy_tokenIsSet = false;
}
utility::string_t Dex_TradeDTO::getSellToken() const
{
    return m_Sell_token;
}

void Dex_TradeDTO::setSellToken(const utility::string_t& value)
{
    m_Sell_token = value;
    m_Sell_tokenIsSet = true;
}

bool Dex_TradeDTO::sellTokenIsSet() const
{
    return m_Sell_tokenIsSet;
}

void Dex_TradeDTO::unsetSell_token()
{
    m_Sell_tokenIsSet = false;
}
utility::string_t Dex_TradeDTO::getCreateEpoch() const
{
    return m_Create_epoch;
}

void Dex_TradeDTO::setCreateEpoch(const utility::string_t& value)
{
    m_Create_epoch = value;
    m_Create_epochIsSet = true;
}

bool Dex_TradeDTO::createEpochIsSet() const
{
    return m_Create_epochIsSet;
}

void Dex_TradeDTO::unsetCreate_epoch()
{
    m_Create_epochIsSet = false;
}
utility::string_t Dex_TradeDTO::getRevertEpoch() const
{
    return m_Revert_epoch;
}

void Dex_TradeDTO::setRevertEpoch(const utility::string_t& value)
{
    m_Revert_epoch = value;
    m_Revert_epochIsSet = true;
}

bool Dex_TradeDTO::revertEpochIsSet() const
{
    return m_Revert_epochIsSet;
}

void Dex_TradeDTO::unsetRevert_epoch()
{
    m_Revert_epochIsSet = false;
}
utility::string_t Dex_TradeDTO::getTxHash() const
{
    return m_Tx_hash;
}

void Dex_TradeDTO::setTxHash(const utility::string_t& value)
{
    m_Tx_hash = value;
    m_Tx_hashIsSet = true;
}

bool Dex_TradeDTO::txHashIsSet() const
{
    return m_Tx_hashIsSet;
}

void Dex_TradeDTO::unsetTx_hash()
{
    m_Tx_hashIsSet = false;
}
utility::string_t Dex_TradeDTO::getTxLogIndex() const
{
    return m_Tx_log_index;
}

void Dex_TradeDTO::setTxLogIndex(const utility::string_t& value)
{
    m_Tx_log_index = value;
    m_Tx_log_indexIsSet = true;
}

bool Dex_TradeDTO::txLogIndexIsSet() const
{
    return m_Tx_log_indexIsSet;
}

void Dex_TradeDTO::unsetTx_log_index()
{
    m_Tx_log_indexIsSet = false;
}
int64_t Dex_TradeDTO::getVid() const
{
    return m_Vid;
}

void Dex_TradeDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Dex_TradeDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Dex_TradeDTO::unsetVid()
{
    m_VidIsSet = false;
}
utility::string_t Dex_TradeDTO::getPoolId() const
{
    return m_Pool_id;
}

void Dex_TradeDTO::setPoolId(const utility::string_t& value)
{
    m_Pool_id = value;
    m_Pool_idIsSet = true;
}

bool Dex_TradeDTO::poolIdIsSet() const
{
    return m_Pool_idIsSet;
}

void Dex_TradeDTO::unsetPool_id()
{
    m_Pool_idIsSet = false;
}
utility::string_t Dex_TradeDTO::getTransactionId() const
{
    return m_Transaction_id;
}

void Dex_TradeDTO::setTransactionId(const utility::string_t& value)
{
    m_Transaction_id = value;
    m_Transaction_idIsSet = true;
}

bool Dex_TradeDTO::transactionIdIsSet() const
{
    return m_Transaction_idIsSet;
}

void Dex_TradeDTO::unsetTransaction_id()
{
    m_Transaction_idIsSet = false;
}
double Dex_TradeDTO::getEvaluatedPrice() const
{
    return m_Evaluated_price;
}

void Dex_TradeDTO::setEvaluatedPrice(double value)
{
    m_Evaluated_price = value;
    m_Evaluated_priceIsSet = true;
}

bool Dex_TradeDTO::evaluatedPriceIsSet() const
{
    return m_Evaluated_priceIsSet;
}

void Dex_TradeDTO::unsetEvaluated_price()
{
    m_Evaluated_priceIsSet = false;
}
double Dex_TradeDTO::getEvaluatedAmount() const
{
    return m_Evaluated_amount;
}

void Dex_TradeDTO::setEvaluatedAmount(double value)
{
    m_Evaluated_amount = value;
    m_Evaluated_amountIsSet = true;
}

bool Dex_TradeDTO::evaluatedAmountIsSet() const
{
    return m_Evaluated_amountIsSet;
}

void Dex_TradeDTO::unsetEvaluated_amount()
{
    m_Evaluated_amountIsSet = false;
}
std::shared_ptr<Transactions_ETradeAggressiveSide> Dex_TradeDTO::getEvaluatedAggressor() const
{
    return m_Evaluated_aggressor;
}

void Dex_TradeDTO::setEvaluatedAggressor(const std::shared_ptr<Transactions_ETradeAggressiveSide>& value)
{
    m_Evaluated_aggressor = value;
    m_Evaluated_aggressorIsSet = true;
}

bool Dex_TradeDTO::evaluatedAggressorIsSet() const
{
    return m_Evaluated_aggressorIsSet;
}

void Dex_TradeDTO::unsetEvaluated_aggressor()
{
    m_Evaluated_aggressorIsSet = false;
}
}
}
}
}


