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
 * UniswapV3_TokenDTO.h
 *
 * Stores aggregated information for a specific token across all pairs that token is included in.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV3_TokenDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV3_TokenDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/Numerics_BigInteger.h"
#include <cpprest/details/basic_types.h>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class Numerics_BigInteger;

/// <summary>
/// Stores aggregated information for a specific token across all pairs that token is included in.
/// </summary>
class  UniswapV3_TokenDTO
    : public ModelBase
{
public:
    UniswapV3_TokenDTO();
    virtual ~UniswapV3_TokenDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// UniswapV3_TokenDTO members

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
    /// Token address.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// Token symbol.
    /// </summary>
    utility::string_t getSymbol() const;
    bool symbolIsSet() const;
    void unsetSymbol();

    void setSymbol(const utility::string_t& value);

    /// <summary>
    /// Token name.
    /// </summary>
    utility::string_t getName() const;
    bool nameIsSet() const;
    void unsetName();

    void setName(const utility::string_t& value);

    /// <summary>
    /// Token decimals.
    /// </summary>
    int32_t getDecimals() const;
    bool decimalsIsSet() const;
    void unsetDecimals();

    void setDecimals(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Numerics_BigInteger> getTotalSupply() const;
    bool totalSupplyIsSet() const;
    void unsetTotal_supply();

    void setTotalSupply(const std::shared_ptr<Numerics_BigInteger>& value);

    /// <summary>
    /// Volume in token units.
    /// </summary>
    utility::string_t getVolume() const;
    bool volumeIsSet() const;
    void unsetVolume();

    void setVolume(const utility::string_t& value);

    /// <summary>
    /// Volume in derived USD.
    /// </summary>
    utility::string_t getVolumeUsd() const;
    bool volumeUsdIsSet() const;
    void unsetVolume_usd();

    void setVolumeUsd(const utility::string_t& value);

    /// <summary>
    /// Volume in USD even on pools with less reliable USD values.
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
    /// 
    /// </summary>
    std::shared_ptr<Numerics_BigInteger> getPoolCount() const;
    bool poolCountIsSet() const;
    void unsetPool_count();

    void setPoolCount(const std::shared_ptr<Numerics_BigInteger>& value);

    /// <summary>
    /// Liquidity across all pools in token units.
    /// </summary>
    utility::string_t getTotalValueLocked() const;
    bool totalValueLockedIsSet() const;
    void unsetTotal_value_locked();

    void setTotalValueLocked(const utility::string_t& value);

    /// <summary>
    /// Liquidity across all pools in derived USD.
    /// </summary>
    utility::string_t getTotalValueLockedUsd() const;
    bool totalValueLockedUsdIsSet() const;
    void unsetTotal_value_locked_usd();

    void setTotalValueLockedUsd(const utility::string_t& value);

    /// <summary>
    /// TVL derived in USD untracked.
    /// </summary>
    utility::string_t getTotalValueLockedUsdUntracked() const;
    bool totalValueLockedUsdUntrackedIsSet() const;
    void unsetTotal_value_locked_usd_untracked();

    void setTotalValueLockedUsdUntracked(const utility::string_t& value);

    /// <summary>
    /// Derived price in ETH.
    /// </summary>
    utility::string_t getDerivedEth() const;
    bool derivedEthIsSet() const;
    void unsetDerived_eth();

    void setDerivedEth(const utility::string_t& value);

    /// <summary>
    /// Pools token is in that are white listed for USD pricing.
    /// </summary>
    std::vector<utility::string_t>& getWhitelistPools();
    bool whitelistPoolsIsSet() const;
    void unsetWhitelist_pools();

    void setWhitelistPools(const std::vector<utility::string_t>& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTokenSymbol() const;
    bool tokenSymbolIsSet() const;
    void unsetToken_symbol();

    void setTokenSymbol(const utility::string_t& value);


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
    utility::string_t m_Symbol;
    bool m_SymbolIsSet;
    utility::string_t m_Name;
    bool m_NameIsSet;
    int32_t m_Decimals;
    bool m_DecimalsIsSet;
    std::shared_ptr<Numerics_BigInteger> m_Total_supply;
    bool m_Total_supplyIsSet;
    utility::string_t m_Volume;
    bool m_VolumeIsSet;
    utility::string_t m_Volume_usd;
    bool m_Volume_usdIsSet;
    utility::string_t m_Untracked_volume_usd;
    bool m_Untracked_volume_usdIsSet;
    utility::string_t m_Fees_usd;
    bool m_Fees_usdIsSet;
    std::shared_ptr<Numerics_BigInteger> m_Tx_count;
    bool m_Tx_countIsSet;
    std::shared_ptr<Numerics_BigInteger> m_Pool_count;
    bool m_Pool_countIsSet;
    utility::string_t m_Total_value_locked;
    bool m_Total_value_lockedIsSet;
    utility::string_t m_Total_value_locked_usd;
    bool m_Total_value_locked_usdIsSet;
    utility::string_t m_Total_value_locked_usd_untracked;
    bool m_Total_value_locked_usd_untrackedIsSet;
    utility::string_t m_Derived_eth;
    bool m_Derived_ethIsSet;
    std::vector<utility::string_t> m_Whitelist_pools;
    bool m_Whitelist_poolsIsSet;
    utility::string_t m_Token_symbol;
    bool m_Token_symbolIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV3_TokenDTO_H_ */
