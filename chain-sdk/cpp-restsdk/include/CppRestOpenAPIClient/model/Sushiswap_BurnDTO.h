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
 * Sushiswap_BurnDTO.h
 *
 * Burn entities are created for every emitted Burn event on the Uniswap core contracts. The Burn entity stores key data about the event like token amounts, who burned LP tokens, who received tokens, and more. This entity can be used to track liquidity removals on pairs.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Sushiswap_BurnDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Sushiswap_BurnDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// Burn entities are created for every emitted Burn event on the Uniswap core contracts. The Burn entity stores key data about the event like token amounts, who burned LP tokens, who received tokens, and more. This entity can be used to track liquidity removals on pairs.
/// </summary>
class  Sushiswap_BurnDTO
    : public ModelBase
{
public:
    Sushiswap_BurnDTO();
    virtual ~Sushiswap_BurnDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Sushiswap_BurnDTO members

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
    /// Identifier, format: (transaction id):(transaction.burns.length).
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// Reference to the transaction Burn was included in.
    /// </summary>
    utility::string_t getTransaction() const;
    bool transactionIsSet() const;
    void unsetTransaction();

    void setTransaction(const utility::string_t& value);

    /// <summary>
    /// Timestamp of Burn, used to sort recent liquidity removals.
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
    /// Amount of liquidity tokens burned.
    /// </summary>
    utility::string_t getLiquidity() const;
    bool liquidityIsSet() const;
    void unsetLiquidity();

    void setLiquidity(const utility::string_t& value);

    /// <summary>
    /// Address that initiated the liquidity removal.
    /// </summary>
    utility::string_t getSender() const;
    bool senderIsSet() const;
    void unsetSender();

    void setSender(const utility::string_t& value);

    /// <summary>
    /// Amount of token0 removed.
    /// </summary>
    utility::string_t getAmount0() const;
    bool amount0IsSet() const;
    void unsetAmount_0();

    void setAmount0(const utility::string_t& value);

    /// <summary>
    /// Amount of token1 removed.
    /// </summary>
    utility::string_t getAmount1() const;
    bool amount1IsSet() const;
    void unsetAmount_1();

    void setAmount1(const utility::string_t& value);

    /// <summary>
    /// Recipient of tokens.
    /// </summary>
    utility::string_t getTo() const;
    bool toIsSet() const;
    void unsetTo();

    void setTo(const utility::string_t& value);

    /// <summary>
    /// Index in the transaction event was emitted.
    /// </summary>
    utility::string_t getLogIndex() const;
    bool logIndexIsSet() const;
    void unsetLog_index();

    void setLogIndex(const utility::string_t& value);

    /// <summary>
    /// Derived amount based on available prices of tokens.
    /// </summary>
    utility::string_t getAmountUsd() const;
    bool amountUsdIsSet() const;
    void unsetAmount_usd();

    void setAmountUsd(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    bool isComplete() const;
    bool completeIsSet() const;
    void unsetComplete();

    void setComplete(bool value);

    /// <summary>
    /// Address of fee recipient (if fee is on).
    /// </summary>
    utility::string_t getFeeTo() const;
    bool feeToIsSet() const;
    void unsetFee_to();

    void setFeeTo(const utility::string_t& value);

    /// <summary>
    /// Amount of tokens sent to fee recipient (if fee is on).
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
    utility::string_t m_Liquidity;
    bool m_LiquidityIsSet;
    utility::string_t m_Sender;
    bool m_SenderIsSet;
    utility::string_t m_Amount_0;
    bool m_Amount_0IsSet;
    utility::string_t m_Amount_1;
    bool m_Amount_1IsSet;
    utility::string_t m_To;
    bool m_ToIsSet;
    utility::string_t m_Log_index;
    bool m_Log_indexIsSet;
    utility::string_t m_Amount_usd;
    bool m_Amount_usdIsSet;
    bool m_Complete;
    bool m_CompleteIsSet;
    utility::string_t m_Fee_to;
    bool m_Fee_toIsSet;
    utility::string_t m_Fee_liquidity;
    bool m_Fee_liquidityIsSet;
    int64_t m_Vid;
    bool m_VidIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Sushiswap_BurnDTO_H_ */
