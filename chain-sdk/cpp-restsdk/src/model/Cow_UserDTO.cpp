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



#include "CppRestOpenAPIClient/model/Cow_UserDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Cow_UserDTO::Cow_UserDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Address = utility::conversions::to_string_t("");
    m_AddressIsSet = false;
    m_First_trade_timestamp = utility::conversions::to_string_t("");
    m_First_trade_timestampIsSet = false;
    m_Is_solver = false;
    m_Is_solverIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

Cow_UserDTO::~Cow_UserDTO()
{
}

void Cow_UserDTO::validate()
{
    // TODO: implement validation
}

web::json::value Cow_UserDTO::toJson() const
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
    if(m_AddressIsSet)
    {
        val[utility::conversions::to_string_t(U("address"))] = ModelBase::toJson(m_Address);
    }
    if(m_First_trade_timestampIsSet)
    {
        val[utility::conversions::to_string_t(U("first_trade_timestamp"))] = ModelBase::toJson(m_First_trade_timestamp);
    }
    if(m_Is_solverIsSet)
    {
        val[utility::conversions::to_string_t(U("is_solver"))] = ModelBase::toJson(m_Is_solver);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }

    return val;
}

bool Cow_UserDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("first_trade_timestamp"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("first_trade_timestamp")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setFirstTradeTimestamp;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFirstTradeTimestamp);
            setFirstTradeTimestamp(refVal_setFirstTradeTimestamp);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("is_solver"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("is_solver")));
        if(!fieldValue.is_null())
        {
            bool refVal_setIsSolver;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIsSolver);
            setIsSolver(refVal_setIsSolver);
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

void Cow_UserDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_AddressIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("address")), m_Address));
    }
    if(m_First_trade_timestampIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("first_trade_timestamp")), m_First_trade_timestamp));
    }
    if(m_Is_solverIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("is_solver")), m_Is_solver));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
}

bool Cow_UserDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("address"))))
    {
        utility::string_t refVal_setAddress;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("address"))), refVal_setAddress );
        setAddress(refVal_setAddress);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("first_trade_timestamp"))))
    {
        utility::string_t refVal_setFirstTradeTimestamp;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("first_trade_timestamp"))), refVal_setFirstTradeTimestamp );
        setFirstTradeTimestamp(refVal_setFirstTradeTimestamp);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("is_solver"))))
    {
        bool refVal_setIsSolver;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("is_solver"))), refVal_setIsSolver );
        setIsSolver(refVal_setIsSolver);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    return ok;
}

utility::datetime Cow_UserDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Cow_UserDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Cow_UserDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Cow_UserDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Cow_UserDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Cow_UserDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Cow_UserDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Cow_UserDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Cow_UserDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Cow_UserDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Cow_UserDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Cow_UserDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Cow_UserDTO::getId() const
{
    return m_Id;
}

void Cow_UserDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Cow_UserDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Cow_UserDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Cow_UserDTO::getAddress() const
{
    return m_Address;
}

void Cow_UserDTO::setAddress(const utility::string_t& value)
{
    m_Address = value;
    m_AddressIsSet = true;
}

bool Cow_UserDTO::addressIsSet() const
{
    return m_AddressIsSet;
}

void Cow_UserDTO::unsetAddress()
{
    m_AddressIsSet = false;
}
utility::string_t Cow_UserDTO::getFirstTradeTimestamp() const
{
    return m_First_trade_timestamp;
}

void Cow_UserDTO::setFirstTradeTimestamp(const utility::string_t& value)
{
    m_First_trade_timestamp = value;
    m_First_trade_timestampIsSet = true;
}

bool Cow_UserDTO::firstTradeTimestampIsSet() const
{
    return m_First_trade_timestampIsSet;
}

void Cow_UserDTO::unsetFirst_trade_timestamp()
{
    m_First_trade_timestampIsSet = false;
}
bool Cow_UserDTO::isIsSolver() const
{
    return m_Is_solver;
}

void Cow_UserDTO::setIsSolver(bool value)
{
    m_Is_solver = value;
    m_Is_solverIsSet = true;
}

bool Cow_UserDTO::isSolverIsSet() const
{
    return m_Is_solverIsSet;
}

void Cow_UserDTO::unsetIs_solver()
{
    m_Is_solverIsSet = false;
}
int64_t Cow_UserDTO::getVid() const
{
    return m_Vid;
}

void Cow_UserDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Cow_UserDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Cow_UserDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


