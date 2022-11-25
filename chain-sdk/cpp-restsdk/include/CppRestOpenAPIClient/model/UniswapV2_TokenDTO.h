/**
 * On Chain Dapps - REST API
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
 * UniswapV2_TokenDTO.h
 *
 * Stores aggregated information for a specific token across all pairs that token is included in.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV2_TokenDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV2_TokenDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/Numerics_BigInteger.h"
#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class Numerics_BigInteger;

/// <summary>
/// Stores aggregated information for a specific token across all pairs that token is included in.
/// </summary>
class  UniswapV2_TokenDTO
    : public ModelBase
{
public:
    UniswapV2_TokenDTO();
    virtual ~UniswapV2_TokenDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// UniswapV2_TokenDTO members

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
    /// Amount of token traded all time across all pairs.
    /// </summary>
    utility::string_t getTradeVolume() const;
    bool tradeVolumeIsSet() const;
    void unsetTrade_volume();

    void setTradeVolume(const utility::string_t& value);

    /// <summary>
    /// Amount of token in USD traded all time across pairs (only for tokens with liquidity above minimum threshold).
    /// </summary>
    utility::string_t getTradeVolumeUsd() const;
    bool tradeVolumeUsdIsSet() const;
    void unsetTrade_volume_usd();

    void setTradeVolumeUsd(const utility::string_t& value);

    /// <summary>
    /// Amount of token in USD traded all time across pairs (no minimum liquidity threshold).
    /// </summary>
    utility::string_t getUntrackedVolumeUsd() const;
    bool untrackedVolumeUsdIsSet() const;
    void unsetUntracked_volume_usd();

    void setUntrackedVolumeUsd(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Numerics_BigInteger> getTxCount() const;
    bool txCountIsSet() const;
    void unsetTx_count();

    void setTxCount(const std::shared_ptr<Numerics_BigInteger>& value);

    /// <summary>
    /// Total amount of token provided as liquidity across all pairs.
    /// </summary>
    utility::string_t getTotalLiquidity() const;
    bool totalLiquidityIsSet() const;
    void unsetTotal_liquidity();

    void setTotalLiquidity(const utility::string_t& value);

    /// <summary>
    /// ETH per token.
    /// </summary>
    utility::string_t getDerivedEth() const;
    bool derivedEthIsSet() const;
    void unsetDerived_eth();

    void setDerivedEth(const utility::string_t& value);

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
    utility::string_t m_Trade_volume;
    bool m_Trade_volumeIsSet;
    utility::string_t m_Trade_volume_usd;
    bool m_Trade_volume_usdIsSet;
    utility::string_t m_Untracked_volume_usd;
    bool m_Untracked_volume_usdIsSet;
    std::shared_ptr<Numerics_BigInteger> m_Tx_count;
    bool m_Tx_countIsSet;
    utility::string_t m_Total_liquidity;
    bool m_Total_liquidityIsSet;
    utility::string_t m_Derived_eth;
    bool m_Derived_ethIsSet;
    utility::string_t m_Token_symbol;
    bool m_Token_symbolIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV2_TokenDTO_H_ */
