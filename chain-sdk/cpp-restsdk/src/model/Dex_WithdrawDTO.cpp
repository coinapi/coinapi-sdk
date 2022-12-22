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



#include "CppRestOpenAPIClient/model/Dex_WithdrawDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Dex_WithdrawDTO::Dex_WithdrawDTO()
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
    m_Token_address = utility::conversions::to_string_t("");
    m_Token_addressIsSet = false;
    m_Amount = utility::conversions::to_string_t("");
    m_AmountIsSet = false;
    m_Create_epoch = utility::conversions::to_string_t("");
    m_Create_epochIsSet = false;
    m_Create_batch_id = utility::conversions::to_string_t("");
    m_Create_batch_idIsSet = false;
    m_Tx_hash = utility::conversions::to_string_t("");
    m_Tx_hashIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

Dex_WithdrawDTO::~Dex_WithdrawDTO()
{
}

void Dex_WithdrawDTO::validate()
{
    // TODO: implement validation
}

web::json::value Dex_WithdrawDTO::toJson() const
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
    if(m_Token_addressIsSet)
    {
        val[utility::conversions::to_string_t(U("token_address"))] = ModelBase::toJson(m_Token_address);
    }
    if(m_AmountIsSet)
    {
        val[utility::conversions::to_string_t(U("amount"))] = ModelBase::toJson(m_Amount);
    }
    if(m_Create_epochIsSet)
    {
        val[utility::conversions::to_string_t(U("create_epoch"))] = ModelBase::toJson(m_Create_epoch);
    }
    if(m_Create_batch_idIsSet)
    {
        val[utility::conversions::to_string_t(U("create_batch_id"))] = ModelBase::toJson(m_Create_batch_id);
    }
    if(m_Tx_hashIsSet)
    {
        val[utility::conversions::to_string_t(U("tx_hash"))] = ModelBase::toJson(m_Tx_hash);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }

    return val;
}

bool Dex_WithdrawDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("token_address"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("token_address")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTokenAddress;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTokenAddress);
            setTokenAddress(refVal_setTokenAddress);
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
    if(val.has_field(utility::conversions::to_string_t(U("create_batch_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("create_batch_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCreateBatchId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCreateBatchId);
            setCreateBatchId(refVal_setCreateBatchId);
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

void Dex_WithdrawDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_Token_addressIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token_address")), m_Token_address));
    }
    if(m_AmountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("amount")), m_Amount));
    }
    if(m_Create_epochIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("create_epoch")), m_Create_epoch));
    }
    if(m_Create_batch_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("create_batch_id")), m_Create_batch_id));
    }
    if(m_Tx_hashIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("tx_hash")), m_Tx_hash));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
}

bool Dex_WithdrawDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("token_address"))))
    {
        utility::string_t refVal_setTokenAddress;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("token_address"))), refVal_setTokenAddress );
        setTokenAddress(refVal_setTokenAddress);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("amount"))))
    {
        utility::string_t refVal_setAmount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("amount"))), refVal_setAmount );
        setAmount(refVal_setAmount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("create_epoch"))))
    {
        utility::string_t refVal_setCreateEpoch;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("create_epoch"))), refVal_setCreateEpoch );
        setCreateEpoch(refVal_setCreateEpoch);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("create_batch_id"))))
    {
        utility::string_t refVal_setCreateBatchId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("create_batch_id"))), refVal_setCreateBatchId );
        setCreateBatchId(refVal_setCreateBatchId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("tx_hash"))))
    {
        utility::string_t refVal_setTxHash;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("tx_hash"))), refVal_setTxHash );
        setTxHash(refVal_setTxHash);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    return ok;
}

utility::datetime Dex_WithdrawDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Dex_WithdrawDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Dex_WithdrawDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Dex_WithdrawDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Dex_WithdrawDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Dex_WithdrawDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Dex_WithdrawDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Dex_WithdrawDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Dex_WithdrawDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Dex_WithdrawDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Dex_WithdrawDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Dex_WithdrawDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Dex_WithdrawDTO::getId() const
{
    return m_Id;
}

void Dex_WithdrawDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Dex_WithdrawDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Dex_WithdrawDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Dex_WithdrawDTO::getUser() const
{
    return m_User;
}

void Dex_WithdrawDTO::setUser(const utility::string_t& value)
{
    m_User = value;
    m_UserIsSet = true;
}

bool Dex_WithdrawDTO::userIsSet() const
{
    return m_UserIsSet;
}

void Dex_WithdrawDTO::unsetUser()
{
    m_UserIsSet = false;
}
utility::string_t Dex_WithdrawDTO::getTokenAddress() const
{
    return m_Token_address;
}

void Dex_WithdrawDTO::setTokenAddress(const utility::string_t& value)
{
    m_Token_address = value;
    m_Token_addressIsSet = true;
}

bool Dex_WithdrawDTO::tokenAddressIsSet() const
{
    return m_Token_addressIsSet;
}

void Dex_WithdrawDTO::unsetToken_address()
{
    m_Token_addressIsSet = false;
}
utility::string_t Dex_WithdrawDTO::getAmount() const
{
    return m_Amount;
}

void Dex_WithdrawDTO::setAmount(const utility::string_t& value)
{
    m_Amount = value;
    m_AmountIsSet = true;
}

bool Dex_WithdrawDTO::amountIsSet() const
{
    return m_AmountIsSet;
}

void Dex_WithdrawDTO::unsetAmount()
{
    m_AmountIsSet = false;
}
utility::string_t Dex_WithdrawDTO::getCreateEpoch() const
{
    return m_Create_epoch;
}

void Dex_WithdrawDTO::setCreateEpoch(const utility::string_t& value)
{
    m_Create_epoch = value;
    m_Create_epochIsSet = true;
}

bool Dex_WithdrawDTO::createEpochIsSet() const
{
    return m_Create_epochIsSet;
}

void Dex_WithdrawDTO::unsetCreate_epoch()
{
    m_Create_epochIsSet = false;
}
utility::string_t Dex_WithdrawDTO::getCreateBatchId() const
{
    return m_Create_batch_id;
}

void Dex_WithdrawDTO::setCreateBatchId(const utility::string_t& value)
{
    m_Create_batch_id = value;
    m_Create_batch_idIsSet = true;
}

bool Dex_WithdrawDTO::createBatchIdIsSet() const
{
    return m_Create_batch_idIsSet;
}

void Dex_WithdrawDTO::unsetCreate_batch_id()
{
    m_Create_batch_idIsSet = false;
}
utility::string_t Dex_WithdrawDTO::getTxHash() const
{
    return m_Tx_hash;
}

void Dex_WithdrawDTO::setTxHash(const utility::string_t& value)
{
    m_Tx_hash = value;
    m_Tx_hashIsSet = true;
}

bool Dex_WithdrawDTO::txHashIsSet() const
{
    return m_Tx_hashIsSet;
}

void Dex_WithdrawDTO::unsetTx_hash()
{
    m_Tx_hashIsSet = false;
}
int64_t Dex_WithdrawDTO::getVid() const
{
    return m_Vid;
}

void Dex_WithdrawDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Dex_WithdrawDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Dex_WithdrawDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}

