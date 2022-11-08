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



#include "CppRestOpenAPIClient/model/Curve_ContractVersionDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Curve_ContractVersionDTO::Curve_ContractVersionDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Contract = utility::conversions::to_string_t("");
    m_ContractIsSet = false;
    m_Address = utility::conversions::to_string_t("");
    m_AddressIsSet = false;
    m_Version = utility::conversions::to_string_t("");
    m_VersionIsSet = false;
    m_Added = utility::conversions::to_string_t("");
    m_AddedIsSet = false;
    m_Added_at_block = utility::conversions::to_string_t("");
    m_Added_at_blockIsSet = false;
    m_Added_at_transaction = utility::conversions::to_string_t("");
    m_Added_at_transactionIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

Curve_ContractVersionDTO::~Curve_ContractVersionDTO()
{
}

void Curve_ContractVersionDTO::validate()
{
    // TODO: implement validation
}

web::json::value Curve_ContractVersionDTO::toJson() const
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
    if(m_ContractIsSet)
    {
        val[utility::conversions::to_string_t(U("contract"))] = ModelBase::toJson(m_Contract);
    }
    if(m_AddressIsSet)
    {
        val[utility::conversions::to_string_t(U("address"))] = ModelBase::toJson(m_Address);
    }
    if(m_VersionIsSet)
    {
        val[utility::conversions::to_string_t(U("version"))] = ModelBase::toJson(m_Version);
    }
    if(m_AddedIsSet)
    {
        val[utility::conversions::to_string_t(U("added"))] = ModelBase::toJson(m_Added);
    }
    if(m_Added_at_blockIsSet)
    {
        val[utility::conversions::to_string_t(U("added_at_block"))] = ModelBase::toJson(m_Added_at_block);
    }
    if(m_Added_at_transactionIsSet)
    {
        val[utility::conversions::to_string_t(U("added_at_transaction"))] = ModelBase::toJson(m_Added_at_transaction);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }

    return val;
}

bool Curve_ContractVersionDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("contract"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("contract")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setContract;
            ok &= ModelBase::fromJson(fieldValue, refVal_setContract);
            setContract(refVal_setContract);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("address"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("address")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAddress;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAddress);
            setAddress(refVal_setAddress);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("version"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("version")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setVersion;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVersion);
            setVersion(refVal_setVersion);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("added"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("added")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAdded;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAdded);
            setAdded(refVal_setAdded);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("added_at_block"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("added_at_block")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAddedAtBlock;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAddedAtBlock);
            setAddedAtBlock(refVal_setAddedAtBlock);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("added_at_transaction"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("added_at_transaction")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAddedAtTransaction;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAddedAtTransaction);
            setAddedAtTransaction(refVal_setAddedAtTransaction);
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

void Curve_ContractVersionDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_ContractIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("contract")), m_Contract));
    }
    if(m_AddressIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("address")), m_Address));
    }
    if(m_VersionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("version")), m_Version));
    }
    if(m_AddedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("added")), m_Added));
    }
    if(m_Added_at_blockIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("added_at_block")), m_Added_at_block));
    }
    if(m_Added_at_transactionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("added_at_transaction")), m_Added_at_transaction));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
}

bool Curve_ContractVersionDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("contract"))))
    {
        utility::string_t refVal_setContract;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("contract"))), refVal_setContract );
        setContract(refVal_setContract);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("address"))))
    {
        utility::string_t refVal_setAddress;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("address"))), refVal_setAddress );
        setAddress(refVal_setAddress);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("version"))))
    {
        utility::string_t refVal_setVersion;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("version"))), refVal_setVersion );
        setVersion(refVal_setVersion);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("added"))))
    {
        utility::string_t refVal_setAdded;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("added"))), refVal_setAdded );
        setAdded(refVal_setAdded);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("added_at_block"))))
    {
        utility::string_t refVal_setAddedAtBlock;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("added_at_block"))), refVal_setAddedAtBlock );
        setAddedAtBlock(refVal_setAddedAtBlock);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("added_at_transaction"))))
    {
        utility::string_t refVal_setAddedAtTransaction;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("added_at_transaction"))), refVal_setAddedAtTransaction );
        setAddedAtTransaction(refVal_setAddedAtTransaction);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    return ok;
}

utility::datetime Curve_ContractVersionDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Curve_ContractVersionDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Curve_ContractVersionDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Curve_ContractVersionDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Curve_ContractVersionDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Curve_ContractVersionDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Curve_ContractVersionDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Curve_ContractVersionDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Curve_ContractVersionDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Curve_ContractVersionDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Curve_ContractVersionDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Curve_ContractVersionDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Curve_ContractVersionDTO::getId() const
{
    return m_Id;
}

void Curve_ContractVersionDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Curve_ContractVersionDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Curve_ContractVersionDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Curve_ContractVersionDTO::getContract() const
{
    return m_Contract;
}

void Curve_ContractVersionDTO::setContract(const utility::string_t& value)
{
    m_Contract = value;
    m_ContractIsSet = true;
}

bool Curve_ContractVersionDTO::contractIsSet() const
{
    return m_ContractIsSet;
}

void Curve_ContractVersionDTO::unsetContract()
{
    m_ContractIsSet = false;
}
utility::string_t Curve_ContractVersionDTO::getAddress() const
{
    return m_Address;
}

void Curve_ContractVersionDTO::setAddress(const utility::string_t& value)
{
    m_Address = value;
    m_AddressIsSet = true;
}

bool Curve_ContractVersionDTO::addressIsSet() const
{
    return m_AddressIsSet;
}

void Curve_ContractVersionDTO::unsetAddress()
{
    m_AddressIsSet = false;
}
utility::string_t Curve_ContractVersionDTO::getVersion() const
{
    return m_Version;
}

void Curve_ContractVersionDTO::setVersion(const utility::string_t& value)
{
    m_Version = value;
    m_VersionIsSet = true;
}

bool Curve_ContractVersionDTO::versionIsSet() const
{
    return m_VersionIsSet;
}

void Curve_ContractVersionDTO::unsetVersion()
{
    m_VersionIsSet = false;
}
utility::string_t Curve_ContractVersionDTO::getAdded() const
{
    return m_Added;
}

void Curve_ContractVersionDTO::setAdded(const utility::string_t& value)
{
    m_Added = value;
    m_AddedIsSet = true;
}

bool Curve_ContractVersionDTO::addedIsSet() const
{
    return m_AddedIsSet;
}

void Curve_ContractVersionDTO::unsetAdded()
{
    m_AddedIsSet = false;
}
utility::string_t Curve_ContractVersionDTO::getAddedAtBlock() const
{
    return m_Added_at_block;
}

void Curve_ContractVersionDTO::setAddedAtBlock(const utility::string_t& value)
{
    m_Added_at_block = value;
    m_Added_at_blockIsSet = true;
}

bool Curve_ContractVersionDTO::addedAtBlockIsSet() const
{
    return m_Added_at_blockIsSet;
}

void Curve_ContractVersionDTO::unsetAdded_at_block()
{
    m_Added_at_blockIsSet = false;
}
utility::string_t Curve_ContractVersionDTO::getAddedAtTransaction() const
{
    return m_Added_at_transaction;
}

void Curve_ContractVersionDTO::setAddedAtTransaction(const utility::string_t& value)
{
    m_Added_at_transaction = value;
    m_Added_at_transactionIsSet = true;
}

bool Curve_ContractVersionDTO::addedAtTransactionIsSet() const
{
    return m_Added_at_transactionIsSet;
}

void Curve_ContractVersionDTO::unsetAdded_at_transaction()
{
    m_Added_at_transactionIsSet = false;
}
int64_t Curve_ContractVersionDTO::getVid() const
{
    return m_Vid;
}

void Curve_ContractVersionDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Curve_ContractVersionDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Curve_ContractVersionDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


