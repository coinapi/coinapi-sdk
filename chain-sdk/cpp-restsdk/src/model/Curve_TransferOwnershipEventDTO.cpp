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



#include "CppRestOpenAPIClient/model/Curve_TransferOwnershipEventDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Curve_TransferOwnershipEventDTO::Curve_TransferOwnershipEventDTO()
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
    m_New_admin = utility::conversions::to_string_t("");
    m_New_adminIsSet = false;
    m_Block = utility::conversions::to_string_t("");
    m_BlockIsSet = false;
    m_Timestamp = utility::conversions::to_string_t("");
    m_TimestampIsSet = false;
    m_Transaction = utility::conversions::to_string_t("");
    m_TransactionIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

Curve_TransferOwnershipEventDTO::~Curve_TransferOwnershipEventDTO()
{
}

void Curve_TransferOwnershipEventDTO::validate()
{
    // TODO: implement validation
}

web::json::value Curve_TransferOwnershipEventDTO::toJson() const
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
    if(m_New_adminIsSet)
    {
        val[utility::conversions::to_string_t(U("new_admin"))] = ModelBase::toJson(m_New_admin);
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

    return val;
}

bool Curve_TransferOwnershipEventDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("new_admin"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("new_admin")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setNewAdmin;
            ok &= ModelBase::fromJson(fieldValue, refVal_setNewAdmin);
            setNewAdmin(refVal_setNewAdmin);
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
    return ok;
}

void Curve_TransferOwnershipEventDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_New_adminIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("new_admin")), m_New_admin));
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
}

bool Curve_TransferOwnershipEventDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("new_admin"))))
    {
        utility::string_t refVal_setNewAdmin;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("new_admin"))), refVal_setNewAdmin );
        setNewAdmin(refVal_setNewAdmin);
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
    return ok;
}

utility::datetime Curve_TransferOwnershipEventDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Curve_TransferOwnershipEventDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Curve_TransferOwnershipEventDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Curve_TransferOwnershipEventDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Curve_TransferOwnershipEventDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Curve_TransferOwnershipEventDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Curve_TransferOwnershipEventDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Curve_TransferOwnershipEventDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Curve_TransferOwnershipEventDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Curve_TransferOwnershipEventDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Curve_TransferOwnershipEventDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Curve_TransferOwnershipEventDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Curve_TransferOwnershipEventDTO::getId() const
{
    return m_Id;
}

void Curve_TransferOwnershipEventDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Curve_TransferOwnershipEventDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Curve_TransferOwnershipEventDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Curve_TransferOwnershipEventDTO::getPool() const
{
    return m_Pool;
}

void Curve_TransferOwnershipEventDTO::setPool(const utility::string_t& value)
{
    m_Pool = value;
    m_PoolIsSet = true;
}

bool Curve_TransferOwnershipEventDTO::poolIsSet() const
{
    return m_PoolIsSet;
}

void Curve_TransferOwnershipEventDTO::unsetPool()
{
    m_PoolIsSet = false;
}
utility::string_t Curve_TransferOwnershipEventDTO::getNewAdmin() const
{
    return m_New_admin;
}

void Curve_TransferOwnershipEventDTO::setNewAdmin(const utility::string_t& value)
{
    m_New_admin = value;
    m_New_adminIsSet = true;
}

bool Curve_TransferOwnershipEventDTO::newAdminIsSet() const
{
    return m_New_adminIsSet;
}

void Curve_TransferOwnershipEventDTO::unsetNew_admin()
{
    m_New_adminIsSet = false;
}
utility::string_t Curve_TransferOwnershipEventDTO::getBlock() const
{
    return m_Block;
}

void Curve_TransferOwnershipEventDTO::setBlock(const utility::string_t& value)
{
    m_Block = value;
    m_BlockIsSet = true;
}

bool Curve_TransferOwnershipEventDTO::blockIsSet() const
{
    return m_BlockIsSet;
}

void Curve_TransferOwnershipEventDTO::unsetBlock()
{
    m_BlockIsSet = false;
}
utility::string_t Curve_TransferOwnershipEventDTO::getTimestamp() const
{
    return m_Timestamp;
}

void Curve_TransferOwnershipEventDTO::setTimestamp(const utility::string_t& value)
{
    m_Timestamp = value;
    m_TimestampIsSet = true;
}

bool Curve_TransferOwnershipEventDTO::timestampIsSet() const
{
    return m_TimestampIsSet;
}

void Curve_TransferOwnershipEventDTO::unsetTimestamp()
{
    m_TimestampIsSet = false;
}
utility::string_t Curve_TransferOwnershipEventDTO::getTransaction() const
{
    return m_Transaction;
}

void Curve_TransferOwnershipEventDTO::setTransaction(const utility::string_t& value)
{
    m_Transaction = value;
    m_TransactionIsSet = true;
}

bool Curve_TransferOwnershipEventDTO::transactionIsSet() const
{
    return m_TransactionIsSet;
}

void Curve_TransferOwnershipEventDTO::unsetTransaction()
{
    m_TransactionIsSet = false;
}
int64_t Curve_TransferOwnershipEventDTO::getVid() const
{
    return m_Vid;
}

void Curve_TransferOwnershipEventDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Curve_TransferOwnershipEventDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Curve_TransferOwnershipEventDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}

