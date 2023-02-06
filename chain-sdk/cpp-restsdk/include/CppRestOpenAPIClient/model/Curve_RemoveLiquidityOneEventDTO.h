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

/*
 * Curve_RemoveLiquidityOneEventDTO.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Curve_RemoveLiquidityOneEventDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Curve_RemoveLiquidityOneEventDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  Curve_RemoveLiquidityOneEventDTO
    : public ModelBase
{
public:
    Curve_RemoveLiquidityOneEventDTO();
    virtual ~Curve_RemoveLiquidityOneEventDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Curve_RemoveLiquidityOneEventDTO members

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
    utility::string_t getPool() const;
    bool poolIsSet() const;
    void unsetPool();

    void setPool(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getProvider() const;
    bool providerIsSet() const;
    void unsetProvider();

    void setProvider(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTokenAmount() const;
    bool tokenAmountIsSet() const;
    void unsetToken_amount();

    void setTokenAmount(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getCoinAmount() const;
    bool coinAmountIsSet() const;
    void unsetCoin_amount();

    void setCoinAmount(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getBlock() const;
    bool blockIsSet() const;
    void unsetBlock();

    void setBlock(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTimestamp() const;
    bool timestampIsSet() const;
    void unsetTimestamp();

    void setTimestamp(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTransaction() const;
    bool transactionIsSet() const;
    void unsetTransaction();

    void setTransaction(const utility::string_t& value);

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
    utility::string_t m_Pool;
    bool m_PoolIsSet;
    utility::string_t m_Provider;
    bool m_ProviderIsSet;
    utility::string_t m_Token_amount;
    bool m_Token_amountIsSet;
    utility::string_t m_Coin_amount;
    bool m_Coin_amountIsSet;
    utility::string_t m_Block;
    bool m_BlockIsSet;
    utility::string_t m_Timestamp;
    bool m_TimestampIsSet;
    utility::string_t m_Transaction;
    bool m_TransactionIsSet;
    int64_t m_Vid;
    bool m_VidIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Curve_RemoveLiquidityOneEventDTO_H_ */
