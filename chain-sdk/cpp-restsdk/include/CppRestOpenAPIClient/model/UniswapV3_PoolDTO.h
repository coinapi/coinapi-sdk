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
 * UniswapV3_PoolDTO.h
 *
 * Information about a pool. Includes references to each token within the pool, volume information, liquidity information, and more. The pool entity mirrors the pool smart contract, and also contains aggregated information about use.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV3_PoolDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV3_PoolDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/Numerics_BigInteger.h"
#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class Numerics_BigInteger;

/// <summary>
/// Information about a pool. Includes references to each token within the pool, volume information, liquidity information, and more. The pool entity mirrors the pool smart contract, and also contains aggregated information about use.
/// </summary>
class  UniswapV3_PoolDTO
    : public ModelBase
{
public:
    UniswapV3_PoolDTO();
    virtual ~UniswapV3_PoolDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// UniswapV3_PoolDTO members

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
    /// Pool address.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// Creation time.
    /// </summary>
    utility::datetime getCreatedAtTimestamp() const;
    bool createdAtTimestampIsSet() const;
    void unsetCreated_at_timestamp();

    void setCreatedAtTimestamp(const utility::datetime& value);

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
    /// 
    /// </summary>
    std::shared_ptr<Numerics_BigInteger> getFeeTier() const;
    bool feeTierIsSet() const;
    void unsetFee_tier();

    void setFeeTier(const std::shared_ptr<Numerics_BigInteger>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Numerics_BigInteger> getLiquidity() const;
    bool liquidityIsSet() const;
    void unsetLiquidity();

    void setLiquidity(const std::shared_ptr<Numerics_BigInteger>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Numerics_BigInteger> getSqrtPrice() const;
    bool sqrtPriceIsSet() const;
    void unsetSqrt_price();

    void setSqrtPrice(const std::shared_ptr<Numerics_BigInteger>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Numerics_BigInteger> getFeeGrowthGlobal0x128() const;
    bool feeGrowthGlobal0x128IsSet() const;
    void unsetFee_growth_global_0x128();

    void setFeeGrowthGlobal0x128(const std::shared_ptr<Numerics_BigInteger>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Numerics_BigInteger> getFeeGrowthGlobal1x128() const;
    bool feeGrowthGlobal1x128IsSet() const;
    void unsetFee_growth_global_1x128();

    void setFeeGrowthGlobal1x128(const std::shared_ptr<Numerics_BigInteger>& value);

    /// <summary>
    /// Token0 per token1.
    /// </summary>
    utility::string_t getToken0Price() const;
    bool token0PriceIsSet() const;
    void unsetToken_0_price();

    void setToken0Price(const utility::string_t& value);

    /// <summary>
    /// Token1 per token0.
    /// </summary>
    utility::string_t getToken1Price() const;
    bool token1PriceIsSet() const;
    void unsetToken_1_price();

    void setToken1Price(const utility::string_t& value);

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
    std::shared_ptr<Numerics_BigInteger> getObservationIndex() const;
    bool observationIndexIsSet() const;
    void unsetObservation_index();

    void setObservationIndex(const std::shared_ptr<Numerics_BigInteger>& value);

    /// <summary>
    /// All time token0 swapped.
    /// </summary>
    utility::string_t getVolumeToken0() const;
    bool volumeToken0IsSet() const;
    void unsetVolume_token_0();

    void setVolumeToken0(const utility::string_t& value);

    /// <summary>
    /// All time token1 swapped.
    /// </summary>
    utility::string_t getVolumeToken1() const;
    bool volumeToken1IsSet() const;
    void unsetVolume_token_1();

    void setVolumeToken1(const utility::string_t& value);

    /// <summary>
    /// All time USD swapped.
    /// </summary>
    utility::string_t getVolumeUsd() const;
    bool volumeUsdIsSet() const;
    void unsetVolume_usd();

    void setVolumeUsd(const utility::string_t& value);

    /// <summary>
    /// All time USD swapped, unfiltered for unreliable USD pools.
    /// </summary>
    utility::string_t getUntrackedVolumeUsd() const;
    bool untrackedVolumeUsdIsSet() const;
    void unsetUntracked_volume_usd();

    void setUntrackedVolumeUsd(const utility::string_t& value);

    /// <summary>
    /// Fees in USD.
    /// </summary>
    utility::string_t getFeesUsd() const;
    bool feesUsdIsSet() const;
    void unsetFees_usd();

    void setFeesUsd(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Numerics_BigInteger> getTxCount() const;
    bool txCountIsSet() const;
    void unsetTx_count();

    void setTxCount(const std::shared_ptr<Numerics_BigInteger>& value);

    /// <summary>
    /// All time fees collected token0.
    /// </summary>
    utility::string_t getCollectedFeesToken0() const;
    bool collectedFeesToken0IsSet() const;
    void unsetCollected_fees_token_0();

    void setCollectedFeesToken0(const utility::string_t& value);

    /// <summary>
    /// All time fees collected token1.
    /// </summary>
    utility::string_t getCollectedFeesToken1() const;
    bool collectedFeesToken1IsSet() const;
    void unsetCollected_fees_token_1();

    void setCollectedFeesToken1(const utility::string_t& value);

    /// <summary>
    /// All time fees collected derived USD.
    /// </summary>
    utility::string_t getCollectedFeesUsd() const;
    bool collectedFeesUsdIsSet() const;
    void unsetCollected_fees_usd();

    void setCollectedFeesUsd(const utility::string_t& value);

    /// <summary>
    /// Total token 0 across all ticks.
    /// </summary>
    utility::string_t getTotalValueLockedToken0() const;
    bool totalValueLockedToken0IsSet() const;
    void unsetTotal_value_locked_token_0();

    void setTotalValueLockedToken0(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTotalValueLockedToken1() const;
    bool totalValueLockedToken1IsSet() const;
    void unsetTotal_value_locked_token_1();

    void setTotalValueLockedToken1(const utility::string_t& value);

    /// <summary>
    /// Total token 1 across all ticks.
    /// </summary>
    utility::string_t getTotalValueLockedEth() const;
    bool totalValueLockedEthIsSet() const;
    void unsetTotal_value_locked_eth();

    void setTotalValueLockedEth(const utility::string_t& value);

    /// <summary>
    /// Total value locked USD.
    /// </summary>
    utility::string_t getTotalValueLockedUsd() const;
    bool totalValueLockedUsdIsSet() const;
    void unsetTotal_value_locked_usd();

    void setTotalValueLockedUsd(const utility::string_t& value);

    /// <summary>
    /// Total value locked derived ETH.
    /// </summary>
    utility::string_t getTotalValueLockedUsdUntracked() const;
    bool totalValueLockedUsdUntrackedIsSet() const;
    void unsetTotal_value_locked_usd_untracked();

    void setTotalValueLockedUsdUntracked(const utility::string_t& value);

    /// <summary>
    /// Liquidity providers count, used to detect new exchanges.
    /// </summary>
    utility::string_t getLiquidityProviderCount() const;
    bool liquidityProviderCountIsSet() const;
    void unsetLiquidity_provider_count();

    void setLiquidityProviderCount(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    double getEvaluatedAsk() const;
    bool evaluatedAskIsSet() const;
    void unsetEvaluated_ask();

    void setEvaluatedAsk(double value);


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
    utility::datetime m_Created_at_timestamp;
    bool m_Created_at_timestampIsSet;
    utility::string_t m_Token_0;
    bool m_Token_0IsSet;
    utility::string_t m_Token_1;
    bool m_Token_1IsSet;
    std::shared_ptr<Numerics_BigInteger> m_Fee_tier;
    bool m_Fee_tierIsSet;
    std::shared_ptr<Numerics_BigInteger> m_Liquidity;
    bool m_LiquidityIsSet;
    std::shared_ptr<Numerics_BigInteger> m_Sqrt_price;
    bool m_Sqrt_priceIsSet;
    std::shared_ptr<Numerics_BigInteger> m_Fee_growth_global_0x128;
    bool m_Fee_growth_global_0x128IsSet;
    std::shared_ptr<Numerics_BigInteger> m_Fee_growth_global_1x128;
    bool m_Fee_growth_global_1x128IsSet;
    utility::string_t m_Token_0_price;
    bool m_Token_0_priceIsSet;
    utility::string_t m_Token_1_price;
    bool m_Token_1_priceIsSet;
    std::shared_ptr<Numerics_BigInteger> m_Tick;
    bool m_TickIsSet;
    std::shared_ptr<Numerics_BigInteger> m_Observation_index;
    bool m_Observation_indexIsSet;
    utility::string_t m_Volume_token_0;
    bool m_Volume_token_0IsSet;
    utility::string_t m_Volume_token_1;
    bool m_Volume_token_1IsSet;
    utility::string_t m_Volume_usd;
    bool m_Volume_usdIsSet;
    utility::string_t m_Untracked_volume_usd;
    bool m_Untracked_volume_usdIsSet;
    utility::string_t m_Fees_usd;
    bool m_Fees_usdIsSet;
    std::shared_ptr<Numerics_BigInteger> m_Tx_count;
    bool m_Tx_countIsSet;
    utility::string_t m_Collected_fees_token_0;
    bool m_Collected_fees_token_0IsSet;
    utility::string_t m_Collected_fees_token_1;
    bool m_Collected_fees_token_1IsSet;
    utility::string_t m_Collected_fees_usd;
    bool m_Collected_fees_usdIsSet;
    utility::string_t m_Total_value_locked_token_0;
    bool m_Total_value_locked_token_0IsSet;
    utility::string_t m_Total_value_locked_token_1;
    bool m_Total_value_locked_token_1IsSet;
    utility::string_t m_Total_value_locked_eth;
    bool m_Total_value_locked_ethIsSet;
    utility::string_t m_Total_value_locked_usd;
    bool m_Total_value_locked_usdIsSet;
    utility::string_t m_Total_value_locked_usd_untracked;
    bool m_Total_value_locked_usd_untrackedIsSet;
    utility::string_t m_Liquidity_provider_count;
    bool m_Liquidity_provider_countIsSet;
    double m_Evaluated_ask;
    bool m_Evaluated_askIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV3_PoolDTO_H_ */
