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
 * UniswapV3_BurnDTO.h
 *
 * Burn entities are created for every emitted Burn event on the Uniswap core contracts. The Burn entity stores key data about the event like token amounts, who burned, who received tokens, and more. This entity can be used to track liquidity removals on pairs.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV3_BurnDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV3_BurnDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// Burn entities are created for every emitted Burn event on the Uniswap core contracts. The Burn entity stores key data about the event like token amounts, who burned, who received tokens, and more. This entity can be used to track liquidity removals on pairs.
/// </summary>
class  UniswapV3_BurnDTO
    : public ModelBase
{
public:
    UniswapV3_BurnDTO();
    virtual ~UniswapV3_BurnDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// UniswapV3_BurnDTO members

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
    /// Transaction hash + &#39;#&#39; + index in mints Transaction array.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// Transaction burn was included in.
    /// </summary>
    utility::string_t getTransaction() const;
    bool transactionIsSet() const;
    void unsetTransaction();

    void setTransaction(const utility::string_t& value);

    /// <summary>
    /// Pool position is within.
    /// </summary>
    utility::string_t getPool() const;
    bool poolIsSet() const;
    void unsetPool();

    void setPool(const utility::string_t& value);

    /// <summary>
    /// Reference to token0 as stored in pool contract.
    /// </summary>
    utility::string_t getToken0() const;
    bool token0IsSet() const;
    void unsetToken_0();

    void setToken0(const utility::string_t& value);

    /// <summary>
    /// Reference to token1 as stored in pool contract.
    /// </summary>
    utility::string_t getToken1() const;
    bool token1IsSet() const;
    void unsetToken_1();

    void setToken1(const utility::string_t& value);

    /// <summary>
    /// Timestamp.
    /// </summary>
    utility::string_t getTimestamp() const;
    bool timestampIsSet() const;
    void unsetTimestamp();

    void setTimestamp(const utility::string_t& value);

    /// <summary>
    /// Owner of position where liquidity was burned.
    /// </summary>
    utility::string_t getOwner() const;
    bool ownerIsSet() const;
    void unsetOwner();

    void setOwner(const utility::string_t& value);

    /// <summary>
    /// Transaction origin: the EOA (Externally Owned Account) that initiated the transaction.
    /// </summary>
    utility::string_t getOrigin() const;
    bool originIsSet() const;
    void unsetOrigin();

    void setOrigin(const utility::string_t& value);

    /// <summary>
    /// Amount of liquidity burned.
    /// </summary>
    utility::string_t getAmount() const;
    bool amountIsSet() const;
    void unsetAmount();

    void setAmount(const utility::string_t& value);

    /// <summary>
    /// Amount of token 0 burned.
    /// </summary>
    utility::string_t getAmount0() const;
    bool amount0IsSet() const;
    void unsetAmount_0();

    void setAmount0(const utility::string_t& value);

    /// <summary>
    /// Amount of token 1 burned.
    /// </summary>
    utility::string_t getAmount1() const;
    bool amount1IsSet() const;
    void unsetAmount_1();

    void setAmount1(const utility::string_t& value);

    /// <summary>
    /// Derived amount based on available prices of tokens.
    /// </summary>
    utility::string_t getAmountUsd() const;
    bool amountUsdIsSet() const;
    void unsetAmount_usd();

    void setAmountUsd(const utility::string_t& value);

    /// <summary>
    /// Lower tick of position.
    /// </summary>
    utility::string_t getTickLower() const;
    bool tickLowerIsSet() const;
    void unsetTick_lower();

    void setTickLower(const utility::string_t& value);

    /// <summary>
    /// Upper tick of position.
    /// </summary>
    utility::string_t getTickUpper() const;
    bool tickUpperIsSet() const;
    void unsetTick_upper();

    void setTickUpper(const utility::string_t& value);

    /// <summary>
    /// Position within the transactions.
    /// </summary>
    utility::string_t getLogIndex() const;
    bool logIndexIsSet() const;
    void unsetLog_index();

    void setLogIndex(const utility::string_t& value);

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
    utility::string_t m_Transaction;
    bool m_TransactionIsSet;
    utility::string_t m_Pool;
    bool m_PoolIsSet;
    utility::string_t m_Token_0;
    bool m_Token_0IsSet;
    utility::string_t m_Token_1;
    bool m_Token_1IsSet;
    utility::string_t m_Timestamp;
    bool m_TimestampIsSet;
    utility::string_t m_Owner;
    bool m_OwnerIsSet;
    utility::string_t m_Origin;
    bool m_OriginIsSet;
    utility::string_t m_Amount;
    bool m_AmountIsSet;
    utility::string_t m_Amount_0;
    bool m_Amount_0IsSet;
    utility::string_t m_Amount_1;
    bool m_Amount_1IsSet;
    utility::string_t m_Amount_usd;
    bool m_Amount_usdIsSet;
    utility::string_t m_Tick_lower;
    bool m_Tick_lowerIsSet;
    utility::string_t m_Tick_upper;
    bool m_Tick_upperIsSet;
    utility::string_t m_Log_index;
    bool m_Log_indexIsSet;
    int64_t m_Vid;
    bool m_VidIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV3_BurnDTO_H_ */
