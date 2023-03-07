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



#include "CppRestOpenAPIClient/model/Curve_UnderlyingCoinDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Curve_UnderlyingCoinDTO::Curve_UnderlyingCoinDTO()
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
    m_Coin = utility::conversions::to_string_t("");
    m_CoinIsSet = false;
    m_Balance = utility::conversions::to_string_t("");
    m_BalanceIsSet = false;
    m_Updated = utility::conversions::to_string_t("");
    m_UpdatedIsSet = false;
    m_Updated_at_block = utility::conversions::to_string_t("");
    m_Updated_at_blockIsSet = false;
    m_Updated_at_transaction = utility::conversions::to_string_t("");
    m_Updated_at_transactionIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

Curve_UnderlyingCoinDTO::~Curve_UnderlyingCoinDTO()
{
}

void Curve_UnderlyingCoinDTO::validate()
{
    // TODO: implement validation
}

web::json::value Curve_UnderlyingCoinDTO::toJson() const
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
    if(m_CoinIsSet)
    {
        val[utility::conversions::to_string_t(U("coin"))] = ModelBase::toJson(m_Coin);
    }
    if(m_BalanceIsSet)
    {
        val[utility::conversions::to_string_t(U("balance"))] = ModelBase::toJson(m_Balance);
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

    return val;
}

bool Curve_UnderlyingCoinDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("coin"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("coin")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCoin;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCoin);
            setCoin(refVal_setCoin);
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
    return ok;
}

void Curve_UnderlyingCoinDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_CoinIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("coin")), m_Coin));
    }
    if(m_BalanceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("balance")), m_Balance));
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
}

bool Curve_UnderlyingCoinDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("coin"))))
    {
        utility::string_t refVal_setCoin;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("coin"))), refVal_setCoin );
        setCoin(refVal_setCoin);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("balance"))))
    {
        utility::string_t refVal_setBalance;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("balance"))), refVal_setBalance );
        setBalance(refVal_setBalance);
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
    return ok;
}

utility::datetime Curve_UnderlyingCoinDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Curve_UnderlyingCoinDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Curve_UnderlyingCoinDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Curve_UnderlyingCoinDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Curve_UnderlyingCoinDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Curve_UnderlyingCoinDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Curve_UnderlyingCoinDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Curve_UnderlyingCoinDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Curve_UnderlyingCoinDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Curve_UnderlyingCoinDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Curve_UnderlyingCoinDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Curve_UnderlyingCoinDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Curve_UnderlyingCoinDTO::getId() const
{
    return m_Id;
}

void Curve_UnderlyingCoinDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Curve_UnderlyingCoinDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Curve_UnderlyingCoinDTO::unsetId()
{
    m_IdIsSet = false;
}
int32_t Curve_UnderlyingCoinDTO::getIndex() const
{
    return m_Index;
}

void Curve_UnderlyingCoinDTO::setIndex(int32_t value)
{
    m_Index = value;
    m_IndexIsSet = true;
}

bool Curve_UnderlyingCoinDTO::indexIsSet() const
{
    return m_IndexIsSet;
}

void Curve_UnderlyingCoinDTO::unsetIndex()
{
    m_IndexIsSet = false;
}
utility::string_t Curve_UnderlyingCoinDTO::getPool() const
{
    return m_Pool;
}

void Curve_UnderlyingCoinDTO::setPool(const utility::string_t& value)
{
    m_Pool = value;
    m_PoolIsSet = true;
}

bool Curve_UnderlyingCoinDTO::poolIsSet() const
{
    return m_PoolIsSet;
}

void Curve_UnderlyingCoinDTO::unsetPool()
{
    m_PoolIsSet = false;
}
utility::string_t Curve_UnderlyingCoinDTO::getToken() const
{
    return m_Token;
}

void Curve_UnderlyingCoinDTO::setToken(const utility::string_t& value)
{
    m_Token = value;
    m_TokenIsSet = true;
}

bool Curve_UnderlyingCoinDTO::tokenIsSet() const
{
    return m_TokenIsSet;
}

void Curve_UnderlyingCoinDTO::unsetToken()
{
    m_TokenIsSet = false;
}
utility::string_t Curve_UnderlyingCoinDTO::getCoin() const
{
    return m_Coin;
}

void Curve_UnderlyingCoinDTO::setCoin(const utility::string_t& value)
{
    m_Coin = value;
    m_CoinIsSet = true;
}

bool Curve_UnderlyingCoinDTO::coinIsSet() const
{
    return m_CoinIsSet;
}

void Curve_UnderlyingCoinDTO::unsetCoin()
{
    m_CoinIsSet = false;
}
utility::string_t Curve_UnderlyingCoinDTO::getBalance() const
{
    return m_Balance;
}

void Curve_UnderlyingCoinDTO::setBalance(const utility::string_t& value)
{
    m_Balance = value;
    m_BalanceIsSet = true;
}

bool Curve_UnderlyingCoinDTO::balanceIsSet() const
{
    return m_BalanceIsSet;
}

void Curve_UnderlyingCoinDTO::unsetBalance()
{
    m_BalanceIsSet = false;
}
utility::string_t Curve_UnderlyingCoinDTO::getUpdated() const
{
    return m_Updated;
}

void Curve_UnderlyingCoinDTO::setUpdated(const utility::string_t& value)
{
    m_Updated = value;
    m_UpdatedIsSet = true;
}

bool Curve_UnderlyingCoinDTO::updatedIsSet() const
{
    return m_UpdatedIsSet;
}

void Curve_UnderlyingCoinDTO::unsetUpdated()
{
    m_UpdatedIsSet = false;
}
utility::string_t Curve_UnderlyingCoinDTO::getUpdatedAtBlock() const
{
    return m_Updated_at_block;
}

void Curve_UnderlyingCoinDTO::setUpdatedAtBlock(const utility::string_t& value)
{
    m_Updated_at_block = value;
    m_Updated_at_blockIsSet = true;
}

bool Curve_UnderlyingCoinDTO::updatedAtBlockIsSet() const
{
    return m_Updated_at_blockIsSet;
}

void Curve_UnderlyingCoinDTO::unsetUpdated_at_block()
{
    m_Updated_at_blockIsSet = false;
}
utility::string_t Curve_UnderlyingCoinDTO::getUpdatedAtTransaction() const
{
    return m_Updated_at_transaction;
}

void Curve_UnderlyingCoinDTO::setUpdatedAtTransaction(const utility::string_t& value)
{
    m_Updated_at_transaction = value;
    m_Updated_at_transactionIsSet = true;
}

bool Curve_UnderlyingCoinDTO::updatedAtTransactionIsSet() const
{
    return m_Updated_at_transactionIsSet;
}

void Curve_UnderlyingCoinDTO::unsetUpdated_at_transaction()
{
    m_Updated_at_transactionIsSet = false;
}
int64_t Curve_UnderlyingCoinDTO::getVid() const
{
    return m_Vid;
}

void Curve_UnderlyingCoinDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Curve_UnderlyingCoinDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Curve_UnderlyingCoinDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


