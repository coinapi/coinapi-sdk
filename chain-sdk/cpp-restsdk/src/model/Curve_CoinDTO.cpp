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



#include "CppRestOpenAPIClient/model/Curve_CoinDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Curve_CoinDTO::Curve_CoinDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Index = 0;
    m_IndexIsSet = false;
    m_Pool = utility::conversions::to_string_t("");
    m_PoolIsSet = false;
    m_Token = utility::conversions::to_string_t("");
    m_TokenIsSet = false;
    m_Underlying = utility::conversions::to_string_t("");
    m_UnderlyingIsSet = false;
    m_Balance = utility::conversions::to_string_t("");
    m_BalanceIsSet = false;
    m_Rate = utility::conversions::to_string_t("");
    m_RateIsSet = false;
    m_Updated = utility::conversions::to_string_t("");
    m_UpdatedIsSet = false;
    m_Updated_at_block = utility::conversions::to_string_t("");
    m_Updated_at_blockIsSet = false;
    m_Updated_at_transaction = utility::conversions::to_string_t("");
    m_Updated_at_transactionIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
    m_Block_range = utility::conversions::to_string_t("");
    m_Block_rangeIsSet = false;
}

Curve_CoinDTO::~Curve_CoinDTO()
{
}

void Curve_CoinDTO::validate()
{
    // TODO: implement validation
}

web::json::value Curve_CoinDTO::toJson() const
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
    if(m_IndexIsSet)
    {
        val[utility::conversions::to_string_t(U("index"))] = ModelBase::toJson(m_Index);
    }
    if(m_PoolIsSet)
    {
        val[utility::conversions::to_string_t(U("pool"))] = ModelBase::toJson(m_Pool);
    }
    if(m_TokenIsSet)
    {
        val[utility::conversions::to_string_t(U("token"))] = ModelBase::toJson(m_Token);
    }
    if(m_UnderlyingIsSet)
    {
        val[utility::conversions::to_string_t(U("underlying"))] = ModelBase::toJson(m_Underlying);
    }
    if(m_BalanceIsSet)
    {
        val[utility::conversions::to_string_t(U("balance"))] = ModelBase::toJson(m_Balance);
    }
    if(m_RateIsSet)
    {
        val[utility::conversions::to_string_t(U("rate"))] = ModelBase::toJson(m_Rate);
    }
    if(m_UpdatedIsSet)
    {
        val[utility::conversions::to_string_t(U("updated"))] = ModelBase::toJson(m_Updated);
    }
    if(m_Updated_at_blockIsSet)
    {
        val[utility::conversions::to_string_t(U("updated_at_block"))] = ModelBase::toJson(m_Updated_at_block);
    }
    if(m_Updated_at_transactionIsSet)
    {
        val[utility::conversions::to_string_t(U("updated_at_transaction"))] = ModelBase::toJson(m_Updated_at_transaction);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }
    if(m_Block_rangeIsSet)
    {
        val[utility::conversions::to_string_t(U("block_range"))] = ModelBase::toJson(m_Block_range);
    }

    return val;
}

bool Curve_CoinDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("index"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("index")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setIndex;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIndex);
            setIndex(refVal_setIndex);
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
    if(val.has_field(utility::conversions::to_string_t(U("underlying"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("underlying")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setUnderlying;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUnderlying);
            setUnderlying(refVal_setUnderlying);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("balance"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("balance")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setBalance;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBalance);
            setBalance(refVal_setBalance);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("rate"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("rate")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setRate;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRate);
            setRate(refVal_setRate);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("updated"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("updated")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setUpdated;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUpdated);
            setUpdated(refVal_setUpdated);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("updated_at_block"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("updated_at_block")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setUpdatedAtBlock;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUpdatedAtBlock);
            setUpdatedAtBlock(refVal_setUpdatedAtBlock);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("updated_at_transaction"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("updated_at_transaction")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setUpdatedAtTransaction;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUpdatedAtTransaction);
            setUpdatedAtTransaction(refVal_setUpdatedAtTransaction);
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
    if(val.has_field(utility::conversions::to_string_t(U("block_range"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("block_range")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setBlockRange;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBlockRange);
            setBlockRange(refVal_setBlockRange);
        }
    }
    return ok;
}

void Curve_CoinDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_IndexIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("index")), m_Index));
    }
    if(m_PoolIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pool")), m_Pool));
    }
    if(m_TokenIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token")), m_Token));
    }
    if(m_UnderlyingIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("underlying")), m_Underlying));
    }
    if(m_BalanceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("balance")), m_Balance));
    }
    if(m_RateIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("rate")), m_Rate));
    }
    if(m_UpdatedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("updated")), m_Updated));
    }
    if(m_Updated_at_blockIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("updated_at_block")), m_Updated_at_block));
    }
    if(m_Updated_at_transactionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("updated_at_transaction")), m_Updated_at_transaction));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
    if(m_Block_rangeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("block_range")), m_Block_range));
    }
}

bool Curve_CoinDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("index"))))
    {
        int32_t refVal_setIndex;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("index"))), refVal_setIndex );
        setIndex(refVal_setIndex);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("pool"))))
    {
        utility::string_t refVal_setPool;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("pool"))), refVal_setPool );
        setPool(refVal_setPool);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("token"))))
    {
        utility::string_t refVal_setToken;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("token"))), refVal_setToken );
        setToken(refVal_setToken);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("underlying"))))
    {
        utility::string_t refVal_setUnderlying;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("underlying"))), refVal_setUnderlying );
        setUnderlying(refVal_setUnderlying);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("balance"))))
    {
        utility::string_t refVal_setBalance;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("balance"))), refVal_setBalance );
        setBalance(refVal_setBalance);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("rate"))))
    {
        utility::string_t refVal_setRate;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("rate"))), refVal_setRate );
        setRate(refVal_setRate);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("updated"))))
    {
        utility::string_t refVal_setUpdated;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("updated"))), refVal_setUpdated );
        setUpdated(refVal_setUpdated);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("updated_at_block"))))
    {
        utility::string_t refVal_setUpdatedAtBlock;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("updated_at_block"))), refVal_setUpdatedAtBlock );
        setUpdatedAtBlock(refVal_setUpdatedAtBlock);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("updated_at_transaction"))))
    {
        utility::string_t refVal_setUpdatedAtTransaction;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("updated_at_transaction"))), refVal_setUpdatedAtTransaction );
        setUpdatedAtTransaction(refVal_setUpdatedAtTransaction);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("block_range"))))
    {
        utility::string_t refVal_setBlockRange;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("block_range"))), refVal_setBlockRange );
        setBlockRange(refVal_setBlockRange);
    }
    return ok;
}

utility::datetime Curve_CoinDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Curve_CoinDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Curve_CoinDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Curve_CoinDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Curve_CoinDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Curve_CoinDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Curve_CoinDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Curve_CoinDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Curve_CoinDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Curve_CoinDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Curve_CoinDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Curve_CoinDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Curve_CoinDTO::getId() const
{
    return m_Id;
}

void Curve_CoinDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Curve_CoinDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Curve_CoinDTO::unsetId()
{
    m_IdIsSet = false;
}
int32_t Curve_CoinDTO::getIndex() const
{
    return m_Index;
}

void Curve_CoinDTO::setIndex(int32_t value)
{
    m_Index = value;
    m_IndexIsSet = true;
}

bool Curve_CoinDTO::indexIsSet() const
{
    return m_IndexIsSet;
}

void Curve_CoinDTO::unsetIndex()
{
    m_IndexIsSet = false;
}
utility::string_t Curve_CoinDTO::getPool() const
{
    return m_Pool;
}

void Curve_CoinDTO::setPool(const utility::string_t& value)
{
    m_Pool = value;
    m_PoolIsSet = true;
}

bool Curve_CoinDTO::poolIsSet() const
{
    return m_PoolIsSet;
}

void Curve_CoinDTO::unsetPool()
{
    m_PoolIsSet = false;
}
utility::string_t Curve_CoinDTO::getToken() const
{
    return m_Token;
}

void Curve_CoinDTO::setToken(const utility::string_t& value)
{
    m_Token = value;
    m_TokenIsSet = true;
}

bool Curve_CoinDTO::tokenIsSet() const
{
    return m_TokenIsSet;
}

void Curve_CoinDTO::unsetToken()
{
    m_TokenIsSet = false;
}
utility::string_t Curve_CoinDTO::getUnderlying() const
{
    return m_Underlying;
}

void Curve_CoinDTO::setUnderlying(const utility::string_t& value)
{
    m_Underlying = value;
    m_UnderlyingIsSet = true;
}

bool Curve_CoinDTO::underlyingIsSet() const
{
    return m_UnderlyingIsSet;
}

void Curve_CoinDTO::unsetUnderlying()
{
    m_UnderlyingIsSet = false;
}
utility::string_t Curve_CoinDTO::getBalance() const
{
    return m_Balance;
}

void Curve_CoinDTO::setBalance(const utility::string_t& value)
{
    m_Balance = value;
    m_BalanceIsSet = true;
}

bool Curve_CoinDTO::balanceIsSet() const
{
    return m_BalanceIsSet;
}

void Curve_CoinDTO::unsetBalance()
{
    m_BalanceIsSet = false;
}
utility::string_t Curve_CoinDTO::getRate() const
{
    return m_Rate;
}

void Curve_CoinDTO::setRate(const utility::string_t& value)
{
    m_Rate = value;
    m_RateIsSet = true;
}

bool Curve_CoinDTO::rateIsSet() const
{
    return m_RateIsSet;
}

void Curve_CoinDTO::unsetRate()
{
    m_RateIsSet = false;
}
utility::string_t Curve_CoinDTO::getUpdated() const
{
    return m_Updated;
}

void Curve_CoinDTO::setUpdated(const utility::string_t& value)
{
    m_Updated = value;
    m_UpdatedIsSet = true;
}

bool Curve_CoinDTO::updatedIsSet() const
{
    return m_UpdatedIsSet;
}

void Curve_CoinDTO::unsetUpdated()
{
    m_UpdatedIsSet = false;
}
utility::string_t Curve_CoinDTO::getUpdatedAtBlock() const
{
    return m_Updated_at_block;
}

void Curve_CoinDTO::setUpdatedAtBlock(const utility::string_t& value)
{
    m_Updated_at_block = value;
    m_Updated_at_blockIsSet = true;
}

bool Curve_CoinDTO::updatedAtBlockIsSet() const
{
    return m_Updated_at_blockIsSet;
}

void Curve_CoinDTO::unsetUpdated_at_block()
{
    m_Updated_at_blockIsSet = false;
}
utility::string_t Curve_CoinDTO::getUpdatedAtTransaction() const
{
    return m_Updated_at_transaction;
}

void Curve_CoinDTO::setUpdatedAtTransaction(const utility::string_t& value)
{
    m_Updated_at_transaction = value;
    m_Updated_at_transactionIsSet = true;
}

bool Curve_CoinDTO::updatedAtTransactionIsSet() const
{
    return m_Updated_at_transactionIsSet;
}

void Curve_CoinDTO::unsetUpdated_at_transaction()
{
    m_Updated_at_transactionIsSet = false;
}
int64_t Curve_CoinDTO::getVid() const
{
    return m_Vid;
}

void Curve_CoinDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Curve_CoinDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Curve_CoinDTO::unsetVid()
{
    m_VidIsSet = false;
}
utility::string_t Curve_CoinDTO::getBlockRange() const
{
    return m_Block_range;
}

void Curve_CoinDTO::setBlockRange(const utility::string_t& value)
{
    m_Block_range = value;
    m_Block_rangeIsSet = true;
}

bool Curve_CoinDTO::blockRangeIsSet() const
{
    return m_Block_rangeIsSet;
}

void Curve_CoinDTO::unsetBlock_range()
{
    m_Block_rangeIsSet = false;
}
}
}
}
}


