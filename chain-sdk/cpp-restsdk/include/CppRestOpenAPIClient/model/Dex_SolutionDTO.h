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

/*
 * Dex_SolutionDTO.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Dex_SolutionDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Dex_SolutionDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  Dex_SolutionDTO
    : public ModelBase
{
public:
    Dex_SolutionDTO();
    virtual ~Dex_SolutionDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Dex_SolutionDTO members

    /// <summary>
    /// 
    /// </summary>
    utility::datetime getEntryTime() const;
    bool entryTimeIsSet() const;
    void unsetEntry_time();

    void setEntryTime(const utility::datetime& value);

    /// <summary>
    /// 
    /// </summary>
    utility::datetime getRecvTime() const;
    bool recvTimeIsSet() const;
    void unsetRecv_time();

    void setRecvTime(const utility::datetime& value);

    /// <summary>
    /// Number of block in which entity was recorded.
    /// </summary>
    int64_t getBlockNumber() const;
    bool blockNumberIsSet() const;
    void unsetBlock_number();

    void setBlockNumber(int64_t value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getBatch() const;
    bool batchIsSet() const;
    void unsetBatch();

    void setBatch(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getSolver() const;
    bool solverIsSet() const;
    void unsetSolver();

    void setSolver(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getFeeReward() const;
    bool feeRewardIsSet() const;
    void unsetFee_reward();

    void setFeeReward(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getObjectiveValue() const;
    bool objectiveValueIsSet() const;
    void unsetObjective_value();

    void setObjectiveValue(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getUtility() const;
    bool utilityIsSet() const;
    void unsetUtility();

    void setUtility(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<utility::string_t>& getTrades();
    bool tradesIsSet() const;
    void unsetTrades();

    void setTrades(const std::vector<utility::string_t>& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getCreateEpoch() const;
    bool createEpochIsSet() const;
    void unsetCreate_epoch();

    void setCreateEpoch(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getRevertEpoch() const;
    bool revertEpochIsSet() const;
    void unsetRevert_epoch();

    void setRevertEpoch(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTxHash() const;
    bool txHashIsSet() const;
    void unsetTx_hash();

    void setTxHash(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTxLogIndex() const;
    bool txLogIndexIsSet() const;
    void unsetTx_log_index();

    void setTxLogIndex(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    int64_t getVid() const;
    bool vidIsSet() const;
    void unsetVid();

    void setVid(int64_t value);


protected:
    utility::datetime m_Entry_time;
    bool m_Entry_timeIsSet;
    utility::datetime m_Recv_time;
    bool m_Recv_timeIsSet;
    int64_t m_Block_number;
    bool m_Block_numberIsSet;
    utility::string_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Batch;
    bool m_BatchIsSet;
    utility::string_t m_Solver;
    bool m_SolverIsSet;
    utility::string_t m_Fee_reward;
    bool m_Fee_rewardIsSet;
    utility::string_t m_Objective_value;
    bool m_Objective_valueIsSet;
    utility::string_t m_Utility;
    bool m_UtilityIsSet;
    std::vector<utility::string_t> m_Trades;
    bool m_TradesIsSet;
    utility::string_t m_Create_epoch;
    bool m_Create_epochIsSet;
    utility::string_t m_Revert_epoch;
    bool m_Revert_epochIsSet;
    utility::string_t m_Tx_hash;
    bool m_Tx_hashIsSet;
    utility::string_t m_Tx_log_index;
    bool m_Tx_log_indexIsSet;
    int64_t m_Vid;
    bool m_VidIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Dex_SolutionDTO_H_ */
