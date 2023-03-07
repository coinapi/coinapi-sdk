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



#include "CppRestOpenAPIClient/model/Dex_BatchDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Dex_BatchDTO::Dex_BatchDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Start_epoch = utility::conversions::to_string_t("");
    m_Start_epochIsSet = false;
    m_End_epoch = utility::conversions::to_string_t("");
    m_End_epochIsSet = false;
    m_Solution = utility::conversions::to_string_t("");
    m_SolutionIsSet = false;
    m_First_solution_epoch = utility::conversions::to_string_t("");
    m_First_solution_epochIsSet = false;
    m_Last_revert_epoch = utility::conversions::to_string_t("");
    m_Last_revert_epochIsSet = false;
    m_Tx_hash = utility::conversions::to_string_t("");
    m_Tx_hashIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

Dex_BatchDTO::~Dex_BatchDTO()
{
}

void Dex_BatchDTO::validate()
{
    // TODO: implement validation
}

web::json::value Dex_BatchDTO::toJson() const
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
    if(m_Start_epochIsSet)
    {
        val[utility::conversions::to_string_t(U("start_epoch"))] = ModelBase::toJson(m_Start_epoch);
    }
    if(m_End_epochIsSet)
    {
        val[utility::conversions::to_string_t(U("end_epoch"))] = ModelBase::toJson(m_End_epoch);
    }
    if(m_SolutionIsSet)
    {
        val[utility::conversions::to_string_t(U("solution"))] = ModelBase::toJson(m_Solution);
    }
    if(m_First_solution_epochIsSet)
    {
        val[utility::conversions::to_string_t(U("first_solution_epoch"))] = ModelBase::toJson(m_First_solution_epoch);
    }
    if(m_Last_revert_epochIsSet)
    {
        val[utility::conversions::to_string_t(U("last_revert_epoch"))] = ModelBase::toJson(m_Last_revert_epoch);
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

bool Dex_BatchDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("start_epoch"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("start_epoch")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setStartEpoch;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStartEpoch);
            setStartEpoch(refVal_setStartEpoch);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("end_epoch"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("end_epoch")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setEndEpoch;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEndEpoch);
            setEndEpoch(refVal_setEndEpoch);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("solution"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("solution")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setSolution;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSolution);
            setSolution(refVal_setSolution);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("first_solution_epoch"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("first_solution_epoch")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setFirstSolutionEpoch;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFirstSolutionEpoch);
            setFirstSolutionEpoch(refVal_setFirstSolutionEpoch);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("last_revert_epoch"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("last_revert_epoch")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setLastRevertEpoch;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLastRevertEpoch);
            setLastRevertEpoch(refVal_setLastRevertEpoch);
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

void Dex_BatchDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_Start_epochIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("start_epoch")), m_Start_epoch));
    }
    if(m_End_epochIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("end_epoch")), m_End_epoch));
    }
    if(m_SolutionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("solution")), m_Solution));
    }
    if(m_First_solution_epochIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("first_solution_epoch")), m_First_solution_epoch));
    }
    if(m_Last_revert_epochIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("last_revert_epoch")), m_Last_revert_epoch));
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

bool Dex_BatchDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("start_epoch"))))
    {
        utility::string_t refVal_setStartEpoch;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("start_epoch"))), refVal_setStartEpoch );
        setStartEpoch(refVal_setStartEpoch);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("end_epoch"))))
    {
        utility::string_t refVal_setEndEpoch;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("end_epoch"))), refVal_setEndEpoch );
        setEndEpoch(refVal_setEndEpoch);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("solution"))))
    {
        utility::string_t refVal_setSolution;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("solution"))), refVal_setSolution );
        setSolution(refVal_setSolution);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("first_solution_epoch"))))
    {
        utility::string_t refVal_setFirstSolutionEpoch;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("first_solution_epoch"))), refVal_setFirstSolutionEpoch );
        setFirstSolutionEpoch(refVal_setFirstSolutionEpoch);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("last_revert_epoch"))))
    {
        utility::string_t refVal_setLastRevertEpoch;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("last_revert_epoch"))), refVal_setLastRevertEpoch );
        setLastRevertEpoch(refVal_setLastRevertEpoch);
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

utility::datetime Dex_BatchDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Dex_BatchDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Dex_BatchDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Dex_BatchDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Dex_BatchDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Dex_BatchDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Dex_BatchDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Dex_BatchDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Dex_BatchDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Dex_BatchDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Dex_BatchDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Dex_BatchDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Dex_BatchDTO::getId() const
{
    return m_Id;
}

void Dex_BatchDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Dex_BatchDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Dex_BatchDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Dex_BatchDTO::getStartEpoch() const
{
    return m_Start_epoch;
}

void Dex_BatchDTO::setStartEpoch(const utility::string_t& value)
{
    m_Start_epoch = value;
    m_Start_epochIsSet = true;
}

bool Dex_BatchDTO::startEpochIsSet() const
{
    return m_Start_epochIsSet;
}

void Dex_BatchDTO::unsetStart_epoch()
{
    m_Start_epochIsSet = false;
}
utility::string_t Dex_BatchDTO::getEndEpoch() const
{
    return m_End_epoch;
}

void Dex_BatchDTO::setEndEpoch(const utility::string_t& value)
{
    m_End_epoch = value;
    m_End_epochIsSet = true;
}

bool Dex_BatchDTO::endEpochIsSet() const
{
    return m_End_epochIsSet;
}

void Dex_BatchDTO::unsetEnd_epoch()
{
    m_End_epochIsSet = false;
}
utility::string_t Dex_BatchDTO::getSolution() const
{
    return m_Solution;
}

void Dex_BatchDTO::setSolution(const utility::string_t& value)
{
    m_Solution = value;
    m_SolutionIsSet = true;
}

bool Dex_BatchDTO::solutionIsSet() const
{
    return m_SolutionIsSet;
}

void Dex_BatchDTO::unsetSolution()
{
    m_SolutionIsSet = false;
}
utility::string_t Dex_BatchDTO::getFirstSolutionEpoch() const
{
    return m_First_solution_epoch;
}

void Dex_BatchDTO::setFirstSolutionEpoch(const utility::string_t& value)
{
    m_First_solution_epoch = value;
    m_First_solution_epochIsSet = true;
}

bool Dex_BatchDTO::firstSolutionEpochIsSet() const
{
    return m_First_solution_epochIsSet;
}

void Dex_BatchDTO::unsetFirst_solution_epoch()
{
    m_First_solution_epochIsSet = false;
}
utility::string_t Dex_BatchDTO::getLastRevertEpoch() const
{
    return m_Last_revert_epoch;
}

void Dex_BatchDTO::setLastRevertEpoch(const utility::string_t& value)
{
    m_Last_revert_epoch = value;
    m_Last_revert_epochIsSet = true;
}

bool Dex_BatchDTO::lastRevertEpochIsSet() const
{
    return m_Last_revert_epochIsSet;
}

void Dex_BatchDTO::unsetLast_revert_epoch()
{
    m_Last_revert_epochIsSet = false;
}
utility::string_t Dex_BatchDTO::getTxHash() const
{
    return m_Tx_hash;
}

void Dex_BatchDTO::setTxHash(const utility::string_t& value)
{
    m_Tx_hash = value;
    m_Tx_hashIsSet = true;
}

bool Dex_BatchDTO::txHashIsSet() const
{
    return m_Tx_hashIsSet;
}

void Dex_BatchDTO::unsetTx_hash()
{
    m_Tx_hashIsSet = false;
}
int64_t Dex_BatchDTO::getVid() const
{
    return m_Vid;
}

void Dex_BatchDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Dex_BatchDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Dex_BatchDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


