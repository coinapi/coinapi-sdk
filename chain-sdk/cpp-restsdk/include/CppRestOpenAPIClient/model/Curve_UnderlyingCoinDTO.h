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

/*
 * Curve_UnderlyingCoinDTO.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Curve_UnderlyingCoinDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Curve_UnderlyingCoinDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  Curve_UnderlyingCoinDTO
    : public ModelBase
{
public:
    Curve_UnderlyingCoinDTO();
    virtual ~Curve_UnderlyingCoinDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Curve_UnderlyingCoinDTO members

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
    /// Equals to: &lt;pool_id&gt;-&lt;coin_index&gt;.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// Coin index.
    /// </summary>
    int32_t getIndex() const;
    bool indexIsSet() const;
    void unsetIndex();

    void setIndex(int32_t value);

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
    utility::string_t getToken() const;
    bool tokenIsSet() const;
    void unsetToken();

    void setToken(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getCoin() const;
    bool coinIsSet() const;
    void unsetCoin();

    void setCoin(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getBalance() const;
    bool balanceIsSet() const;
    void unsetBalance();

    void setBalance(const utility::string_t& value);

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
    int32_t m_Index;
    bool m_IndexIsSet;
    utility::string_t m_Pool;
    bool m_PoolIsSet;
    utility::string_t m_Token;
    bool m_TokenIsSet;
    utility::string_t m_Coin;
    bool m_CoinIsSet;
    utility::string_t m_Balance;
    bool m_BalanceIsSet;
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

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Curve_UnderlyingCoinDTO_H_ */
