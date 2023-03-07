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

/*
 * UniswapV3_SwapDTO.h
 *
 * Swap are created for each token swap within a pair.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV3_SwapDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV3_SwapDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/Numerics_BigInteger.h"
#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/Transactions_ETradeAggressiveSide.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class Numerics_BigInteger;

/// <summary>
/// Swap are created for each token swap within a pair.
/// </summary>
class  UniswapV3_SwapDTO
    : public ModelBase
{
public:
    UniswapV3_SwapDTO();
    virtual ~UniswapV3_SwapDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// UniswapV3_SwapDTO members

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
    int64_t getVid() const;
    bool vidIsSet() const;
    void unsetVid();

    void setVid(int64_t value);

    /// <summary>
    /// Identifier, format: (transaction hash) + # + (index in swaps Transaction array).
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// Pointer to transaction.
    /// </summary>
    utility::string_t getTransaction() const;
    bool transactionIsSet() const;
    void unsetTransaction();

    void setTransaction(const utility::string_t& value);

    /// <summary>
    /// Timestamp of transaction.
    /// </summary>
    utility::datetime getTimestamp() const;
    bool timestampIsSet() const;
    void unsetTimestamp();

    void setTimestamp(const utility::datetime& value);

    /// <summary>
    /// Pool swap occured within.
    /// </summary>
    utility::string_t getPool() const;
    bool poolIsSet() const;
    void unsetPool();

    void setPool(const utility::string_t& value);

    /// <summary>
    /// Reference to token0 as stored in pair contract.
    /// </summary>
    utility::string_t getToken0() const;
    bool token0IsSet() const;
    void unsetToken_0();

    void setToken0(const utility::string_t& value);

    /// <summary>
    /// Reference to token1 as stored in pair contract.
    /// </summary>
    utility::string_t getToken1() const;
    bool token1IsSet() const;
    void unsetToken_1();

    void setToken1(const utility::string_t& value);

    /// <summary>
    /// Sender of the swap.
    /// </summary>
    utility::string_t getSender() const;
    bool senderIsSet() const;
    void unsetSender();

    void setSender(const utility::string_t& value);

    /// <summary>
    /// Recipient of the swap.
    /// </summary>
    utility::string_t getRecipient() const;
    bool recipientIsSet() const;
    void unsetRecipient();

    void setRecipient(const utility::string_t& value);

    /// <summary>
    /// Transaction origin: the EOA (Externally Owned Account) that initiated the transaction
    /// </summary>
    utility::string_t getOrigin() const;
    bool originIsSet() const;
    void unsetOrigin();

    void setOrigin(const utility::string_t& value);

    /// <summary>
    /// Delta of token0 swapped.
    /// </summary>
    utility::string_t getAmount0() const;
    bool amount0IsSet() const;
    void unsetAmount_0();

    void setAmount0(const utility::string_t& value);

    /// <summary>
    /// Delta of token1 swapped.
    /// </summary>
    utility::string_t getAmount1() const;
    bool amount1IsSet() const;
    void unsetAmount_1();

    void setAmount1(const utility::string_t& value);

    /// <summary>
    /// Derived amount of tokens sold in USD.
    /// </summary>
    utility::string_t getAmountUsd() const;
    bool amountUsdIsSet() const;
    void unsetAmount_usd();

    void setAmountUsd(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Numerics_BigInteger> getSqrtPriceX96() const;
    bool sqrtPriceX96IsSet() const;
    void unsetSqrt_price_x96();

    void setSqrtPriceX96(const std::shared_ptr<Numerics_BigInteger>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Numerics_BigInteger> getTick() const;
    bool tickIsSet() const;
    void unsetTick();

    void setTick(const std::shared_ptr<Numerics_BigInteger>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Numerics_BigInteger> getLogIndex() const;
    bool logIndexIsSet() const;
    void unsetLog_index();

    void setLogIndex(const std::shared_ptr<Numerics_BigInteger>& value);

    /// <summary>
    /// 
    /// </summary>
    double getEvaluatedPrice() const;
    bool evaluatedPriceIsSet() const;
    void unsetEvaluated_price();

    void setEvaluatedPrice(double value);

    /// <summary>
    /// 
    /// </summary>
    double getEvaluatedAmount() const;
    bool evaluatedAmountIsSet() const;
    void unsetEvaluated_amount();

    void setEvaluatedAmount(double value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Transactions_ETradeAggressiveSide> getEvaluatedAggressor() const;
    bool evaluatedAggressorIsSet() const;
    void unsetEvaluated_aggressor();

    void setEvaluatedAggressor(const std::shared_ptr<Transactions_ETradeAggressiveSide>& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getPoolId() const;
    bool poolIdIsSet() const;
    void unsetPool_id();

    void setPoolId(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTransactionId() const;
    bool transactionIdIsSet() const;
    void unsetTransaction_id();

    void setTransactionId(const utility::string_t& value);


protected:
    utility::datetime m_Entry_time;
    bool m_Entry_timeIsSet;
    utility::datetime m_Recv_time;
    bool m_Recv_timeIsSet;
    int64_t m_Block_number;
    bool m_Block_numberIsSet;
    int64_t m_Vid;
    bool m_VidIsSet;
    utility::string_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Transaction;
    bool m_TransactionIsSet;
    utility::datetime m_Timestamp;
    bool m_TimestampIsSet;
    utility::string_t m_Pool;
    bool m_PoolIsSet;
    utility::string_t m_Token_0;
    bool m_Token_0IsSet;
    utility::string_t m_Token_1;
    bool m_Token_1IsSet;
    utility::string_t m_Sender;
    bool m_SenderIsSet;
    utility::string_t m_Recipient;
    bool m_RecipientIsSet;
    utility::string_t m_Origin;
    bool m_OriginIsSet;
    utility::string_t m_Amount_0;
    bool m_Amount_0IsSet;
    utility::string_t m_Amount_1;
    bool m_Amount_1IsSet;
    utility::string_t m_Amount_usd;
    bool m_Amount_usdIsSet;
    std::shared_ptr<Numerics_BigInteger> m_Sqrt_price_x96;
    bool m_Sqrt_price_x96IsSet;
    std::shared_ptr<Numerics_BigInteger> m_Tick;
    bool m_TickIsSet;
    std::shared_ptr<Numerics_BigInteger> m_Log_index;
    bool m_Log_indexIsSet;
    double m_Evaluated_price;
    bool m_Evaluated_priceIsSet;
    double m_Evaluated_amount;
    bool m_Evaluated_amountIsSet;
    std::shared_ptr<Transactions_ETradeAggressiveSide> m_Evaluated_aggressor;
    bool m_Evaluated_aggressorIsSet;
    utility::string_t m_Pool_id;
    bool m_Pool_idIsSet;
    utility::string_t m_Transaction_id;
    bool m_Transaction_idIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV3_SwapDTO_H_ */
