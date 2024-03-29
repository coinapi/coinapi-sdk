/**
 * On Chain Dapps - REST API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.6.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * Dex_BatchDTO.h
 *
 * Batch executed. Every batch will contain at least solution with the a set of trades that are executed in it
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Dex_BatchDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Dex_BatchDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// Batch executed. Every batch will contain at least solution with the a set of trades that are executed in it
/// </summary>
class  Dex_BatchDTO
    : public ModelBase
{
public:
    Dex_BatchDTO();
    virtual ~Dex_BatchDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Dex_BatchDTO members

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
    /// Identifier.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// Start epoch.
    /// </summary>
    utility::string_t getStartEpoch() const;
    bool startEpochIsSet() const;
    void unsetStart_epoch();

    void setStartEpoch(const utility::string_t& value);

    /// <summary>
    /// End epoch.
    /// </summary>
    utility::string_t getEndEpoch() const;
    bool endEpochIsSet() const;
    void unsetEnd_epoch();

    void setEndEpoch(const utility::string_t& value);

    /// <summary>
    /// Reference to solution.
    /// </summary>
    utility::string_t getSolution() const;
    bool solutionIsSet() const;
    void unsetSolution();

    void setSolution(const utility::string_t& value);

    /// <summary>
    /// First solution epoch.
    /// </summary>
    utility::string_t getFirstSolutionEpoch() const;
    bool firstSolutionEpochIsSet() const;
    void unsetFirst_solution_epoch();

    void setFirstSolutionEpoch(const utility::string_t& value);

    /// <summary>
    /// Last revert epoch.
    /// </summary>
    utility::string_t getLastRevertEpoch() const;
    bool lastRevertEpochIsSet() const;
    void unsetLast_revert_epoch();

    void setLastRevertEpoch(const utility::string_t& value);

    /// <summary>
    /// Transaction hash.
    /// </summary>
    utility::string_t getTxHash() const;
    bool txHashIsSet() const;
    void unsetTx_hash();

    void setTxHash(const utility::string_t& value);

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
    utility::string_t m_Start_epoch;
    bool m_Start_epochIsSet;
    utility::string_t m_End_epoch;
    bool m_End_epochIsSet;
    utility::string_t m_Solution;
    bool m_SolutionIsSet;
    utility::string_t m_First_solution_epoch;
    bool m_First_solution_epochIsSet;
    utility::string_t m_Last_revert_epoch;
    bool m_Last_revert_epochIsSet;
    utility::string_t m_Tx_hash;
    bool m_Tx_hashIsSet;
    int64_t m_Vid;
    bool m_VidIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Dex_BatchDTO_H_ */
