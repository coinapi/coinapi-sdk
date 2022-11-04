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
 * SushiswapPairDTO.h
 *
 * Information about a pair. Includes references to each token within the pair, volume information, liquidity information, and more. The pair entity mirrors the pair smart contract, and also contains aggregated information about use.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_SushiswapPairDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_SushiswapPairDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// Information about a pair. Includes references to each token within the pair, volume information, liquidity information, and more. The pair entity mirrors the pair smart contract, and also contains aggregated information about use.
/// </summary>
class  SushiswapPairDTO
    : public ModelBase
{
public:
    SushiswapPairDTO();
    virtual ~SushiswapPairDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// SushiswapPairDTO members

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
    /// Pair contract address.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// Factory contract address.
    /// </summary>
    utility::string_t getFactory() const;
    bool factoryIsSet() const;
    void unsetFactory();

    void setFactory(const utility::string_t& value);

    /// <summary>
    /// Friendly name, format: &lt;token0 name&gt;-&lt;token1 name&gt;
    /// </summary>
    utility::string_t getName() const;
    bool nameIsSet() const;
    void unsetName();

    void setName(const utility::string_t& value);

    /// <summary>
    /// Reference to token0 as stored in pair contract.
    /// </summary>
    utility::string_t getToken0() const;
    bool token0IsSet() const;
    void unsetToken_0();

    void setToken0(const utility::string_t& value);

    /// <summary>
    /// Reference to token0 as stored in pair contract.
    /// </summary>
    utility::string_t getToken1() const;
    bool token1IsSet() const;
    void unsetToken_1();

    void setToken1(const utility::string_t& value);

    /// <summary>
    /// Reserve of token0.
    /// </summary>
    utility::string_t getReserve0() const;
    bool reserve0IsSet() const;
    void unsetReserve_0();

    void setReserve0(const utility::string_t& value);

    /// <summary>
    /// Reserve of token1.
    /// </summary>
    utility::string_t getReserve1() const;
    bool reserve1IsSet() const;
    void unsetReserve_1();

    void setReserve1(const utility::string_t& value);

    /// <summary>
    /// Total supply of liquidity token distributed to LPs.
    /// </summary>
    utility::string_t getTotalSupply() const;
    bool totalSupplyIsSet() const;
    void unsetTotal_supply();

    void setTotalSupply(const utility::string_t& value);

    /// <summary>
    /// Total liquidity in pair stored as an amount of ETH.
    /// </summary>
    utility::string_t getReserveEth() const;
    bool reserveEthIsSet() const;
    void unsetReserve_eth();

    void setReserveEth(const utility::string_t& value);

    /// <summary>
    /// Total liquidity amount in pair stored as an amount of USD.
    /// </summary>
    utility::string_t getReserveUsd() const;
    bool reserveUsdIsSet() const;
    void unsetReserve_usd();

    void setReserveUsd(const utility::string_t& value);

    /// <summary>
    /// Total liquidity with only tracked amount.
    /// </summary>
    utility::string_t getTrackedReserveEth() const;
    bool trackedReserveEthIsSet() const;
    void unsetTracked_reserve_eth();

    void setTrackedReserveEth(const utility::string_t& value);

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
    /// Amount of token0 swapped on this pair.
    /// </summary>
    utility::string_t getVolumeToken0() const;
    bool volumeToken0IsSet() const;
    void unsetVolume_token_0();

    void setVolumeToken0(const utility::string_t& value);

    /// <summary>
    /// Amount of token1 swapped on this pair.
    /// </summary>
    utility::string_t getVolumeToken1() const;
    bool volumeToken1IsSet() const;
    void unsetVolume_token_1();

    void setVolumeToken1(const utility::string_t& value);

    /// <summary>
    /// Total amount swapped all time in this pair stored in USD (only tracked if USD liquidity is above minimum threshold).
    /// </summary>
    utility::string_t getVolumeUsd() const;
    bool volumeUsdIsSet() const;
    void unsetVolume_usd();

    void setVolumeUsd(const utility::string_t& value);

    /// <summary>
    /// Total amount swapped all time in this pair stored in USD, no minimum liquidity threshold.
    /// </summary>
    utility::string_t getUntrackedVolumeUsd() const;
    bool untrackedVolumeUsdIsSet() const;
    void unsetUntracked_volume_usd();

    void setUntrackedVolumeUsd(const utility::string_t& value);

    /// <summary>
    /// All time amount of transactions on this pair.
    /// </summary>
    utility::string_t getTxCount() const;
    bool txCountIsSet() const;
    void unsetTx_count();

    void setTxCount(const utility::string_t& value);

    /// <summary>
    /// Total number of LPs.
    /// </summary>
    utility::string_t getLiquidityProviderCount() const;
    bool liquidityProviderCountIsSet() const;
    void unsetLiquidity_provider_count();

    void setLiquidityProviderCount(const utility::string_t& value);

    /// <summary>
    /// Timestamp.
    /// </summary>
    utility::string_t getTimestamp() const;
    bool timestampIsSet() const;
    void unsetTimestamp();

    void setTimestamp(const utility::string_t& value);

    /// <summary>
    /// Block number in which pair information was created in.
    /// </summary>
    utility::string_t getBlock() const;
    bool blockIsSet() const;
    void unsetBlock();

    void setBlock(const utility::string_t& value);

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
    utility::string_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Factory;
    bool m_FactoryIsSet;
    utility::string_t m_Name;
    bool m_NameIsSet;
    utility::string_t m_Token_0;
    bool m_Token_0IsSet;
    utility::string_t m_Token_1;
    bool m_Token_1IsSet;
    utility::string_t m_Reserve_0;
    bool m_Reserve_0IsSet;
    utility::string_t m_Reserve_1;
    bool m_Reserve_1IsSet;
    utility::string_t m_Total_supply;
    bool m_Total_supplyIsSet;
    utility::string_t m_Reserve_eth;
    bool m_Reserve_ethIsSet;
    utility::string_t m_Reserve_usd;
    bool m_Reserve_usdIsSet;
    utility::string_t m_Tracked_reserve_eth;
    bool m_Tracked_reserve_ethIsSet;
    utility::string_t m_Token_0_price;
    bool m_Token_0_priceIsSet;
    utility::string_t m_Token_1_price;
    bool m_Token_1_priceIsSet;
    utility::string_t m_Volume_token_0;
    bool m_Volume_token_0IsSet;
    utility::string_t m_Volume_token_1;
    bool m_Volume_token_1IsSet;
    utility::string_t m_Volume_usd;
    bool m_Volume_usdIsSet;
    utility::string_t m_Untracked_volume_usd;
    bool m_Untracked_volume_usdIsSet;
    utility::string_t m_Tx_count;
    bool m_Tx_countIsSet;
    utility::string_t m_Liquidity_provider_count;
    bool m_Liquidity_provider_countIsSet;
    utility::string_t m_Timestamp;
    bool m_TimestampIsSet;
    utility::string_t m_Block;
    bool m_BlockIsSet;
    int64_t m_Vid;
    bool m_VidIsSet;
    double m_Evaluated_ask;
    bool m_Evaluated_askIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_SushiswapPairDTO_H_ */
