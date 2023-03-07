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
 * UniswapV3_TickDTO.h
 *
 * Ticks are the boundaries between discrete areas in price space.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV3_TickDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV3_TickDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/Numerics_BigInteger.h"
#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class Numerics_BigInteger;

/// <summary>
/// Ticks are the boundaries between discrete areas in price space.
/// </summary>
class  UniswapV3_TickDTO
    : public ModelBase
{
public:
    UniswapV3_TickDTO();
    virtual ~UniswapV3_TickDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// UniswapV3_TickDTO members

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
    /// Identifier, format: (pool address)#(tick index)
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// Pool address.
    /// </summary>
    utility::string_t getPoolAddress() const;
    bool poolAddressIsSet() const;
    void unsetPool_address();

    void setPoolAddress(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Numerics_BigInteger> getTickIdx() const;
    bool tickIdxIsSet() const;
    void unsetTick_idx();

    void setTickIdx(const std::shared_ptr<Numerics_BigInteger>& value);

    /// <summary>
    /// Pool address.
    /// </summary>
    utility::string_t getPool() const;
    bool poolIsSet() const;
    void unsetPool();

    void setPool(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Numerics_BigInteger> getLiquidityGross() const;
    bool liquidityGrossIsSet() const;
    void unsetLiquidity_gross();

    void setLiquidityGross(const std::shared_ptr<Numerics_BigInteger>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Numerics_BigInteger> getLiquidityNet() const;
    bool liquidityNetIsSet() const;
    void unsetLiquidity_net();

    void setLiquidityNet(const std::shared_ptr<Numerics_BigInteger>& value);

    /// <summary>
    /// Calculated price of token0 of tick within this pool - constant.
    /// </summary>
    utility::string_t getPrice0() const;
    bool price0IsSet() const;
    void unsetPrice_0();

    void setPrice0(const utility::string_t& value);

    /// <summary>
    /// Calculated price of token1 of tick within this pool - constant.
    /// </summary>
    utility::string_t getPrice1() const;
    bool price1IsSet() const;
    void unsetPrice_1();

    void setPrice1(const utility::string_t& value);

    /// <summary>
    /// Lifetime volume of token0 with this tick in range.
    /// </summary>
    utility::string_t getVolumeToken0() const;
    bool volumeToken0IsSet() const;
    void unsetVolume_token_0();

    void setVolumeToken0(const utility::string_t& value);

    /// <summary>
    /// Lifetime volume of token1 with this tick in range.
    /// </summary>
    utility::string_t getVolumeToken1() const;
    bool volumeToken1IsSet() const;
    void unsetVolume_token_1();

    void setVolumeToken1(const utility::string_t& value);

    /// <summary>
    /// Lifetime volume in derived USD with this tick in range.
    /// </summary>
    utility::string_t getVolumeUsd() const;
    bool volumeUsdIsSet() const;
    void unsetVolume_usd();

    void setVolumeUsd(const utility::string_t& value);

    /// <summary>
    /// Lifetime volume in untracked USD with this tick in range.
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
    /// All time collected fees in token0.
    /// </summary>
    utility::string_t getCollectedFeesToken0() const;
    bool collectedFeesToken0IsSet() const;
    void unsetCollected_fees_token_0();

    void setCollectedFeesToken0(const utility::string_t& value);

    /// <summary>
    /// All time collected fees in token1.
    /// </summary>
    utility::string_t getCollectedFeesToken1() const;
    bool collectedFeesToken1IsSet() const;
    void unsetCollected_fees_token_1();

    void setCollectedFeesToken1(const utility::string_t& value);

    /// <summary>
    /// All time collected fees in USD.
    /// </summary>
    utility::string_t getCollectedFeesUsd() const;
    bool collectedFeesUsdIsSet() const;
    void unsetCollected_fees_usd();

    void setCollectedFeesUsd(const utility::string_t& value);

    /// <summary>
    /// Created time.
    /// </summary>
    utility::datetime getCreatedAtTimestamp() const;
    bool createdAtTimestampIsSet() const;
    void unsetCreated_at_timestamp();

    void setCreatedAtTimestamp(const utility::datetime& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Numerics_BigInteger> getLiquidityProviderCount() const;
    bool liquidityProviderCountIsSet() const;
    void unsetLiquidity_provider_count();

    void setLiquidityProviderCount(const std::shared_ptr<Numerics_BigInteger>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Numerics_BigInteger> getFeeGrowthOutside0x128() const;
    bool feeGrowthOutside0x128IsSet() const;
    void unsetFee_growth_outside_0x128();

    void setFeeGrowthOutside0x128(const std::shared_ptr<Numerics_BigInteger>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Numerics_BigInteger> getFeeGrowthOutside1x128() const;
    bool feeGrowthOutside1x128IsSet() const;
    void unsetFee_growth_outside_1x128();

    void setFeeGrowthOutside1x128(const std::shared_ptr<Numerics_BigInteger>& value);


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
    utility::string_t m_Pool_address;
    bool m_Pool_addressIsSet;
    std::shared_ptr<Numerics_BigInteger> m_Tick_idx;
    bool m_Tick_idxIsSet;
    utility::string_t m_Pool;
    bool m_PoolIsSet;
    std::shared_ptr<Numerics_BigInteger> m_Liquidity_gross;
    bool m_Liquidity_grossIsSet;
    std::shared_ptr<Numerics_BigInteger> m_Liquidity_net;
    bool m_Liquidity_netIsSet;
    utility::string_t m_Price_0;
    bool m_Price_0IsSet;
    utility::string_t m_Price_1;
    bool m_Price_1IsSet;
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
    utility::string_t m_Collected_fees_token_0;
    bool m_Collected_fees_token_0IsSet;
    utility::string_t m_Collected_fees_token_1;
    bool m_Collected_fees_token_1IsSet;
    utility::string_t m_Collected_fees_usd;
    bool m_Collected_fees_usdIsSet;
    utility::datetime m_Created_at_timestamp;
    bool m_Created_at_timestampIsSet;
    std::shared_ptr<Numerics_BigInteger> m_Liquidity_provider_count;
    bool m_Liquidity_provider_countIsSet;
    std::shared_ptr<Numerics_BigInteger> m_Fee_growth_outside_0x128;
    bool m_Fee_growth_outside_0x128IsSet;
    std::shared_ptr<Numerics_BigInteger> m_Fee_growth_outside_1x128;
    bool m_Fee_growth_outside_1x128IsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV3_TickDTO_H_ */
