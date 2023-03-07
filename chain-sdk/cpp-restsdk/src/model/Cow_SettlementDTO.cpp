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



#include "CppRestOpenAPIClient/model/Cow_SettlementDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Cow_SettlementDTO::Cow_SettlementDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Solver = utility::conversions::to_string_t("");
    m_SolverIsSet = false;
    m_Tx_hash = utility::conversions::to_string_t("");
    m_Tx_hashIsSet = false;
    m_First_trade_timestamp = utility::conversions::to_string_t("");
    m_First_trade_timestampIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

Cow_SettlementDTO::~Cow_SettlementDTO()
{
}

void Cow_SettlementDTO::validate()
{
    // TODO: implement validation
}

web::json::value Cow_SettlementDTO::toJson() const
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
    if(m_SolverIsSet)
    {
        val[utility::conversions::to_string_t(U("solver"))] = ModelBase::toJson(m_Solver);
    }
    if(m_Tx_hashIsSet)
    {
        val[utility::conversions::to_string_t(U("tx_hash"))] = ModelBase::toJson(m_Tx_hash);
    }
    if(m_First_trade_timestampIsSet)
    {
        val[utility::conversions::to_string_t(U("first_trade_timestamp"))] = ModelBase::toJson(m_First_trade_timestamp);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }

    return val;
}

bool Cow_SettlementDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("solver"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("solver")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setSolver;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSolver);
            setSolver(refVal_setSolver);
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

void Cow_SettlementDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_SolverIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("solver")), m_Solver));
    }
    if(m_Tx_hashIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("tx_hash")), m_Tx_hash));
    }
    if(m_First_trade_timestampIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("first_trade_timestamp")), m_First_trade_timestamp));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
}

bool Cow_SettlementDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("solver"))))
    {
        utility::string_t refVal_setSolver;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("solver"))), refVal_setSolver );
        setSolver(refVal_setSolver);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("tx_hash"))))
    {
        utility::string_t refVal_setTxHash;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("tx_hash"))), refVal_setTxHash );
        setTxHash(refVal_setTxHash);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("first_trade_timestamp"))))
    {
        utility::string_t refVal_setFirstTradeTimestamp;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("first_trade_timestamp"))), refVal_setFirstTradeTimestamp );
        setFirstTradeTimestamp(refVal_setFirstTradeTimestamp);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    return ok;
}

utility::datetime Cow_SettlementDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Cow_SettlementDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Cow_SettlementDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Cow_SettlementDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Cow_SettlementDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Cow_SettlementDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Cow_SettlementDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Cow_SettlementDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Cow_SettlementDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Cow_SettlementDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Cow_SettlementDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Cow_SettlementDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Cow_SettlementDTO::getId() const
{
    return m_Id;
}

void Cow_SettlementDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Cow_SettlementDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Cow_SettlementDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Cow_SettlementDTO::getSolver() const
{
    return m_Solver;
}

void Cow_SettlementDTO::setSolver(const utility::string_t& value)
{
    m_Solver = value;
    m_SolverIsSet = true;
}

bool Cow_SettlementDTO::solverIsSet() const
{
    return m_SolverIsSet;
}

void Cow_SettlementDTO::unsetSolver()
{
    m_SolverIsSet = false;
}
utility::string_t Cow_SettlementDTO::getTxHash() const
{
    return m_Tx_hash;
}

void Cow_SettlementDTO::setTxHash(const utility::string_t& value)
{
    m_Tx_hash = value;
    m_Tx_hashIsSet = true;
}

bool Cow_SettlementDTO::txHashIsSet() const
{
    return m_Tx_hashIsSet;
}

void Cow_SettlementDTO::unsetTx_hash()
{
    m_Tx_hashIsSet = false;
}
utility::string_t Cow_SettlementDTO::getFirstTradeTimestamp() const
{
    return m_First_trade_timestamp;
}

void Cow_SettlementDTO::setFirstTradeTimestamp(const utility::string_t& value)
{
    m_First_trade_timestamp = value;
    m_First_trade_timestampIsSet = true;
}

bool Cow_SettlementDTO::firstTradeTimestampIsSet() const
{
    return m_First_trade_timestampIsSet;
}

void Cow_SettlementDTO::unsetFirst_trade_timestamp()
{
    m_First_trade_timestampIsSet = false;
}
int64_t Cow_SettlementDTO::getVid() const
{
    return m_Vid;
}

void Cow_SettlementDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Cow_SettlementDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Cow_SettlementDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


