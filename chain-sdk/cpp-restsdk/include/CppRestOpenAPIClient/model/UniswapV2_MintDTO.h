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
 * UniswapV2_MintDTO.h
 *
 * Mint entities are created for every emitted Mint event on the Uniswap core contracts. The Mint entity stores key data about the event like token amounts, who sent the transaction, who received the liquidity, and more. This entity can be used to track liquidity provisions on pairs.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV2_MintDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV2_MintDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// Mint entities are created for every emitted Mint event on the Uniswap core contracts. The Mint entity stores key data about the event like token amounts, who sent the transaction, who received the liquidity, and more. This entity can be used to track liquidity provisions on pairs.
/// </summary>
class  UniswapV2_MintDTO
    : public ModelBase
{
public:
    UniswapV2_MintDTO();
    virtual ~UniswapV2_MintDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// UniswapV2_MintDTO members

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
    /// Transaction hash plus index in the transaction mint array.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// Reference to the transaction Mint was included in.
    /// </summary>
    utility::string_t getTransaction() const;
    bool transactionIsSet() const;
    void unsetTransaction();

    void setTransaction(const utility::string_t& value);

    /// <summary>
    /// Timestamp of Mint, used to sort recent liquidity provisions.
    /// </summary>
    utility::string_t getTimestamp() const;
    bool timestampIsSet() const;
    void unsetTimestamp();

    void setTimestamp(const utility::string_t& value);

    /// <summary>
    /// Reference to pair.
    /// </summary>
    utility::string_t getPair() const;
    bool pairIsSet() const;
    void unsetPair();

    void setPair(const utility::string_t& value);

    /// <summary>
    /// Recipient of liquidity tokens.
    /// </summary>
    utility::string_t getTo() const;
    bool toIsSet() const;
    void unsetTo();

    void setTo(const utility::string_t& value);

    /// <summary>
    /// Amount of liquidity tokens minted.
    /// </summary>
    utility::string_t getLiquidity() const;
    bool liquidityIsSet() const;
    void unsetLiquidity();

    void setLiquidity(const utility::string_t& value);

    /// <summary>
    /// Address that initiated the liquidity provision.
    /// </summary>
    utility::string_t getSender() const;
    bool senderIsSet() const;
    void unsetSender();

    void setSender(const utility::string_t& value);

    /// <summary>
    /// Amount of token0 provided.
    /// </summary>
    utility::string_t getAmount0() const;
    bool amount0IsSet() const;
    void unsetAmount_0();

    void setAmount0(const utility::string_t& value);

    /// <summary>
    /// Amount of token1 provided.
    /// </summary>
    utility::string_t getAmount1() const;
    bool amount1IsSet() const;
    void unsetAmount_1();

    void setAmount1(const utility::string_t& value);

    /// <summary>
    /// Index in the transaction event was emitted.
    /// </summary>
    utility::string_t getLogIndex() const;
    bool logIndexIsSet() const;
    void unsetLog_index();

    void setLogIndex(const utility::string_t& value);

    /// <summary>
    /// Derived USD value of token0 amount plus token1 amount.
    /// </summary>
    utility::string_t getAmountUsd() const;
    bool amountUsdIsSet() const;
    void unsetAmount_usd();

    void setAmountUsd(const utility::string_t& value);

    /// <summary>
    /// Address of fee recipient (if fee is on).
    /// </summary>
    utility::string_t getFeeTo() const;
    bool feeToIsSet() const;
    void unsetFee_to();

    void setFeeTo(const utility::string_t& value);

    /// <summary>
    /// Amount of liquidity sent to fee recipient (if fee is on).
    /// </summary>
    utility::string_t getFeeLiquidity() const;
    bool feeLiquidityIsSet() const;
    void unsetFee_liquidity();

    void setFeeLiquidity(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    int64_t getVid() const;
    bool vidIsSet() const;
    void unsetVid();

    void setVid(int64_t value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getBlockRange() const;
    bool blockRangeIsSet() const;
    void unsetBlock_range();

    void setBlockRange(const utility::string_t& value);


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
    utility::string_t m_Timestamp;
    bool m_TimestampIsSet;
    utility::string_t m_Pair;
    bool m_PairIsSet;
    utility::string_t m_To;
    bool m_ToIsSet;
    utility::string_t m_Liquidity;
    bool m_LiquidityIsSet;
    utility::string_t m_Sender;
    bool m_SenderIsSet;
    utility::string_t m_Amount_0;
    bool m_Amount_0IsSet;
    utility::string_t m_Amount_1;
    bool m_Amount_1IsSet;
    utility::string_t m_Log_index;
    bool m_Log_indexIsSet;
    utility::string_t m_Amount_usd;
    bool m_Amount_usdIsSet;
    utility::string_t m_Fee_to;
    bool m_Fee_toIsSet;
    utility::string_t m_Fee_liquidity;
    bool m_Fee_liquidityIsSet;
    int64_t m_Vid;
    bool m_VidIsSet;
    utility::string_t m_Block_range;
    bool m_Block_rangeIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV2_MintDTO_H_ */
