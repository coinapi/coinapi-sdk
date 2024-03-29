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
 * Curve_SystemStateDTO.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Curve_SystemStateDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Curve_SystemStateDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  Curve_SystemStateDTO
    : public ModelBase
{
public:
    Curve_SystemStateDTO();
    virtual ~Curve_SystemStateDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Curve_SystemStateDTO members

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
    /// Singleton ID, equals to &#39;current&#39;.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// Current pool registry address.
    /// </summary>
    utility::string_t getRegistryContract() const;
    bool registryContractIsSet() const;
    void unsetRegistry_contract();

    void setRegistryContract(const utility::string_t& value);

    /// <summary>
    /// Number of contracts in the AddressProvider registry.
    /// </summary>
    utility::string_t getContractCount() const;
    bool contractCountIsSet() const;
    void unsetContract_count();

    void setContractCount(const utility::string_t& value);

    /// <summary>
    /// Number of gauges registered.
    /// </summary>
    utility::string_t getGaugeCount() const;
    bool gaugeCountIsSet() const;
    void unsetGauge_count();

    void setGaugeCount(const utility::string_t& value);

    /// <summary>
    /// Number of gauge types registered.
    /// </summary>
    utility::string_t getGaugeTypeCount() const;
    bool gaugeTypeCountIsSet() const;
    void unsetGauge_type_count();

    void setGaugeTypeCount(const utility::string_t& value);

    /// <summary>
    /// Number of active pools.
    /// </summary>
    utility::string_t getPoolCount() const;
    bool poolCountIsSet() const;
    void unsetPool_count();

    void setPoolCount(const utility::string_t& value);

    /// <summary>
    /// Number of tokens registered.
    /// </summary>
    utility::string_t getTokenCount() const;
    bool tokenCountIsSet() const;
    void unsetToken_count();

    void setTokenCount(const utility::string_t& value);

    /// <summary>
    /// Total number of pools (including removed ones).
    /// </summary>
    utility::string_t getTotalPoolCount() const;
    bool totalPoolCountIsSet() const;
    void unsetTotal_pool_count();

    void setTotalPoolCount(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getUpdated() const;
    bool updatedIsSet() const;
    void unsetUpdated();

    void setUpdated(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getUpdatedAtBlock() const;
    bool updatedAtBlockIsSet() const;
    void unsetUpdated_at_block();

    void setUpdatedAtBlock(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getUpdatedAtTransaction() const;
    bool updatedAtTransactionIsSet() const;
    void unsetUpdated_at_transaction();

    void setUpdatedAtTransaction(const utility::string_t& value);

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
    utility::string_t m_Registry_contract;
    bool m_Registry_contractIsSet;
    utility::string_t m_Contract_count;
    bool m_Contract_countIsSet;
    utility::string_t m_Gauge_count;
    bool m_Gauge_countIsSet;
    utility::string_t m_Gauge_type_count;
    bool m_Gauge_type_countIsSet;
    utility::string_t m_Pool_count;
    bool m_Pool_countIsSet;
    utility::string_t m_Token_count;
    bool m_Token_countIsSet;
    utility::string_t m_Total_pool_count;
    bool m_Total_pool_countIsSet;
    utility::string_t m_Updated;
    bool m_UpdatedIsSet;
    utility::string_t m_Updated_at_block;
    bool m_Updated_at_blockIsSet;
    utility::string_t m_Updated_at_transaction;
    bool m_Updated_at_transactionIsSet;
    int64_t m_Vid;
    bool m_VidIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Curve_SystemStateDTO_H_ */
