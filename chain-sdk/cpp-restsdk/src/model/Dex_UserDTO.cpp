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



#include "CppRestOpenAPIClient/model/Dex_UserDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Dex_UserDTO::Dex_UserDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_From_batch_id = utility::conversions::to_string_t("");
    m_From_batch_idIsSet = false;
    m_Create_epoch = utility::conversions::to_string_t("");
    m_Create_epochIsSet = false;
    m_Tx_hash = utility::conversions::to_string_t("");
    m_Tx_hashIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

Dex_UserDTO::~Dex_UserDTO()
{
}

void Dex_UserDTO::validate()
{
    // TODO: implement validation
}

web::json::value Dex_UserDTO::toJson() const
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
    if(m_From_batch_idIsSet)
    {
        val[utility::conversions::to_string_t(U("from_batch_id"))] = ModelBase::toJson(m_From_batch_id);
    }
    if(m_Create_epochIsSet)
    {
        val[utility::conversions::to_string_t(U("create_epoch"))] = ModelBase::toJson(m_Create_epoch);
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

bool Dex_UserDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("from_batch_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("from_batch_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setFromBatchId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFromBatchId);
            setFromBatchId(refVal_setFromBatchId);
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

void Dex_UserDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_From_batch_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("from_batch_id")), m_From_batch_id));
    }
    if(m_Create_epochIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("create_epoch")), m_Create_epoch));
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

bool Dex_UserDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("from_batch_id"))))
    {
        utility::string_t refVal_setFromBatchId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("from_batch_id"))), refVal_setFromBatchId );
        setFromBatchId(refVal_setFromBatchId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("create_epoch"))))
    {
        utility::string_t refVal_setCreateEpoch;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("create_epoch"))), refVal_setCreateEpoch );
        setCreateEpoch(refVal_setCreateEpoch);
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

utility::datetime Dex_UserDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Dex_UserDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Dex_UserDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Dex_UserDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Dex_UserDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Dex_UserDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Dex_UserDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Dex_UserDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Dex_UserDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Dex_UserDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Dex_UserDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Dex_UserDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Dex_UserDTO::getId() const
{
    return m_Id;
}

void Dex_UserDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Dex_UserDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Dex_UserDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Dex_UserDTO::getFromBatchId() const
{
    return m_From_batch_id;
}

void Dex_UserDTO::setFromBatchId(const utility::string_t& value)
{
    m_From_batch_id = value;
    m_From_batch_idIsSet = true;
}

bool Dex_UserDTO::fromBatchIdIsSet() const
{
    return m_From_batch_idIsSet;
}

void Dex_UserDTO::unsetFrom_batch_id()
{
    m_From_batch_idIsSet = false;
}
utility::string_t Dex_UserDTO::getCreateEpoch() const
{
    return m_Create_epoch;
}

void Dex_UserDTO::setCreateEpoch(const utility::string_t& value)
{
    m_Create_epoch = value;
    m_Create_epochIsSet = true;
}

bool Dex_UserDTO::createEpochIsSet() const
{
    return m_Create_epochIsSet;
}

void Dex_UserDTO::unsetCreate_epoch()
{
    m_Create_epochIsSet = false;
}
utility::string_t Dex_UserDTO::getTxHash() const
{
    return m_Tx_hash;
}

void Dex_UserDTO::setTxHash(const utility::string_t& value)
{
    m_Tx_hash = value;
    m_Tx_hashIsSet = true;
}

bool Dex_UserDTO::txHashIsSet() const
{
    return m_Tx_hashIsSet;
}

void Dex_UserDTO::unsetTx_hash()
{
    m_Tx_hashIsSet = false;
}
int64_t Dex_UserDTO::getVid() const
{
    return m_Vid;
}

void Dex_UserDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Dex_UserDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Dex_UserDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


