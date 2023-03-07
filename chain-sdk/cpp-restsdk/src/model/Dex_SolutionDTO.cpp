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



#include "CppRestOpenAPIClient/model/Dex_SolutionDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Dex_SolutionDTO::Dex_SolutionDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Batch = utility::conversions::to_string_t("");
    m_BatchIsSet = false;
    m_Solver = utility::conversions::to_string_t("");
    m_SolverIsSet = false;
    m_Fee_reward = utility::conversions::to_string_t("");
    m_Fee_rewardIsSet = false;
    m_Objective_value = utility::conversions::to_string_t("");
    m_Objective_valueIsSet = false;
    m_Utility = utility::conversions::to_string_t("");
    m_UtilityIsSet = false;
    m_TradesIsSet = false;
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
}

Dex_SolutionDTO::~Dex_SolutionDTO()
{
}

void Dex_SolutionDTO::validate()
{
    // TODO: implement validation
}

web::json::value Dex_SolutionDTO::toJson() const
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
    if(m_BatchIsSet)
    {
        val[utility::conversions::to_string_t(U("batch"))] = ModelBase::toJson(m_Batch);
    }
    if(m_SolverIsSet)
    {
        val[utility::conversions::to_string_t(U("solver"))] = ModelBase::toJson(m_Solver);
    }
    if(m_Fee_rewardIsSet)
    {
        val[utility::conversions::to_string_t(U("fee_reward"))] = ModelBase::toJson(m_Fee_reward);
    }
    if(m_Objective_valueIsSet)
    {
        val[utility::conversions::to_string_t(U("objective_value"))] = ModelBase::toJson(m_Objective_value);
    }
    if(m_UtilityIsSet)
    {
        val[utility::conversions::to_string_t(U("utility"))] = ModelBase::toJson(m_Utility);
    }
    if(m_TradesIsSet)
    {
        val[utility::conversions::to_string_t(U("trades"))] = ModelBase::toJson(m_Trades);
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

    return val;
}

bool Dex_SolutionDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("batch"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("batch")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setBatch;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBatch);
            setBatch(refVal_setBatch);
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
    if(val.has_field(utility::conversions::to_string_t(U("fee_reward"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("fee_reward")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setFeeReward;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFeeReward);
            setFeeReward(refVal_setFeeReward);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("objective_value"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("objective_value")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setObjectiveValue;
            ok &= ModelBase::fromJson(fieldValue, refVal_setObjectiveValue);
            setObjectiveValue(refVal_setObjectiveValue);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("utility"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("utility")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setUtility;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUtility);
            setUtility(refVal_setUtility);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("trades"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("trades")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setTrades;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTrades);
            setTrades(refVal_setTrades);
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
    return ok;
}

void Dex_SolutionDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_BatchIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("batch")), m_Batch));
    }
    if(m_SolverIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("solver")), m_Solver));
    }
    if(m_Fee_rewardIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("fee_reward")), m_Fee_reward));
    }
    if(m_Objective_valueIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("objective_value")), m_Objective_value));
    }
    if(m_UtilityIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("utility")), m_Utility));
    }
    if(m_TradesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("trades")), m_Trades));
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
}

bool Dex_SolutionDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("batch"))))
    {
        utility::string_t refVal_setBatch;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("batch"))), refVal_setBatch );
        setBatch(refVal_setBatch);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("solver"))))
    {
        utility::string_t refVal_setSolver;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("solver"))), refVal_setSolver );
        setSolver(refVal_setSolver);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("fee_reward"))))
    {
        utility::string_t refVal_setFeeReward;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("fee_reward"))), refVal_setFeeReward );
        setFeeReward(refVal_setFeeReward);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("objective_value"))))
    {
        utility::string_t refVal_setObjectiveValue;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("objective_value"))), refVal_setObjectiveValue );
        setObjectiveValue(refVal_setObjectiveValue);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("utility"))))
    {
        utility::string_t refVal_setUtility;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("utility"))), refVal_setUtility );
        setUtility(refVal_setUtility);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("trades"))))
    {
        std::vector<utility::string_t> refVal_setTrades;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("trades"))), refVal_setTrades );
        setTrades(refVal_setTrades);
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
    return ok;
}

utility::datetime Dex_SolutionDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Dex_SolutionDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Dex_SolutionDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Dex_SolutionDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Dex_SolutionDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Dex_SolutionDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Dex_SolutionDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Dex_SolutionDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Dex_SolutionDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Dex_SolutionDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Dex_SolutionDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Dex_SolutionDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Dex_SolutionDTO::getId() const
{
    return m_Id;
}

void Dex_SolutionDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Dex_SolutionDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Dex_SolutionDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Dex_SolutionDTO::getBatch() const
{
    return m_Batch;
}

void Dex_SolutionDTO::setBatch(const utility::string_t& value)
{
    m_Batch = value;
    m_BatchIsSet = true;
}

bool Dex_SolutionDTO::batchIsSet() const
{
    return m_BatchIsSet;
}

void Dex_SolutionDTO::unsetBatch()
{
    m_BatchIsSet = false;
}
utility::string_t Dex_SolutionDTO::getSolver() const
{
    return m_Solver;
}

void Dex_SolutionDTO::setSolver(const utility::string_t& value)
{
    m_Solver = value;
    m_SolverIsSet = true;
}

bool Dex_SolutionDTO::solverIsSet() const
{
    return m_SolverIsSet;
}

void Dex_SolutionDTO::unsetSolver()
{
    m_SolverIsSet = false;
}
utility::string_t Dex_SolutionDTO::getFeeReward() const
{
    return m_Fee_reward;
}

void Dex_SolutionDTO::setFeeReward(const utility::string_t& value)
{
    m_Fee_reward = value;
    m_Fee_rewardIsSet = true;
}

bool Dex_SolutionDTO::feeRewardIsSet() const
{
    return m_Fee_rewardIsSet;
}

void Dex_SolutionDTO::unsetFee_reward()
{
    m_Fee_rewardIsSet = false;
}
utility::string_t Dex_SolutionDTO::getObjectiveValue() const
{
    return m_Objective_value;
}

void Dex_SolutionDTO::setObjectiveValue(const utility::string_t& value)
{
    m_Objective_value = value;
    m_Objective_valueIsSet = true;
}

bool Dex_SolutionDTO::objectiveValueIsSet() const
{
    return m_Objective_valueIsSet;
}

void Dex_SolutionDTO::unsetObjective_value()
{
    m_Objective_valueIsSet = false;
}
utility::string_t Dex_SolutionDTO::getUtility() const
{
    return m_Utility;
}

void Dex_SolutionDTO::setUtility(const utility::string_t& value)
{
    m_Utility = value;
    m_UtilityIsSet = true;
}

bool Dex_SolutionDTO::utilityIsSet() const
{
    return m_UtilityIsSet;
}

void Dex_SolutionDTO::unsetUtility()
{
    m_UtilityIsSet = false;
}
std::vector<utility::string_t>& Dex_SolutionDTO::getTrades()
{
    return m_Trades;
}

void Dex_SolutionDTO::setTrades(const std::vector<utility::string_t>& value)
{
    m_Trades = value;
    m_TradesIsSet = true;
}

bool Dex_SolutionDTO::tradesIsSet() const
{
    return m_TradesIsSet;
}

void Dex_SolutionDTO::unsetTrades()
{
    m_TradesIsSet = false;
}
utility::string_t Dex_SolutionDTO::getCreateEpoch() const
{
    return m_Create_epoch;
}

void Dex_SolutionDTO::setCreateEpoch(const utility::string_t& value)
{
    m_Create_epoch = value;
    m_Create_epochIsSet = true;
}

bool Dex_SolutionDTO::createEpochIsSet() const
{
    return m_Create_epochIsSet;
}

void Dex_SolutionDTO::unsetCreate_epoch()
{
    m_Create_epochIsSet = false;
}
utility::string_t Dex_SolutionDTO::getRevertEpoch() const
{
    return m_Revert_epoch;
}

void Dex_SolutionDTO::setRevertEpoch(const utility::string_t& value)
{
    m_Revert_epoch = value;
    m_Revert_epochIsSet = true;
}

bool Dex_SolutionDTO::revertEpochIsSet() const
{
    return m_Revert_epochIsSet;
}

void Dex_SolutionDTO::unsetRevert_epoch()
{
    m_Revert_epochIsSet = false;
}
utility::string_t Dex_SolutionDTO::getTxHash() const
{
    return m_Tx_hash;
}

void Dex_SolutionDTO::setTxHash(const utility::string_t& value)
{
    m_Tx_hash = value;
    m_Tx_hashIsSet = true;
}

bool Dex_SolutionDTO::txHashIsSet() const
{
    return m_Tx_hashIsSet;
}

void Dex_SolutionDTO::unsetTx_hash()
{
    m_Tx_hashIsSet = false;
}
utility::string_t Dex_SolutionDTO::getTxLogIndex() const
{
    return m_Tx_log_index;
}

void Dex_SolutionDTO::setTxLogIndex(const utility::string_t& value)
{
    m_Tx_log_index = value;
    m_Tx_log_indexIsSet = true;
}

bool Dex_SolutionDTO::txLogIndexIsSet() const
{
    return m_Tx_log_indexIsSet;
}

void Dex_SolutionDTO::unsetTx_log_index()
{
    m_Tx_log_indexIsSet = false;
}
int64_t Dex_SolutionDTO::getVid() const
{
    return m_Vid;
}

void Dex_SolutionDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Dex_SolutionDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Dex_SolutionDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


