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
 * Sushiswap_LiquidityPositionSnapshotDTO.h
 *
 * This entity is used to store data about a user&#39;s liquidity position over time. This information, along with information from the pair itself can be used to provide position sizes, token deposits, and more. It gets created and never updated.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Sushiswap_LiquidityPositionSnapshotDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Sushiswap_LiquidityPositionSnapshotDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// This entity is used to store data about a user&#39;s liquidity position over time. This information, along with information from the pair itself can be used to provide position sizes, token deposits, and more. It gets created and never updated.
/// </summary>
class  Sushiswap_LiquidityPositionSnapshotDTO
    : public ModelBase
{
public:
    Sushiswap_LiquidityPositionSnapshotDTO();
    virtual ~Sushiswap_LiquidityPositionSnapshotDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Sushiswap_LiquidityPositionSnapshotDTO members

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
    /// Identifier, format: (pair address)-(user address)-(timestamp)
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// Reference to LP identifier.
    /// </summary>
    utility::string_t getLiquidityPosition() const;
    bool liquidityPositionIsSet() const;
    void unsetLiquidity_position();

    void setLiquidityPosition(const utility::string_t& value);

    /// <summary>
    /// Creation time.
    /// </summary>
    int32_t getTimestamp() const;
    bool timestampIsSet() const;
    void unsetTimestamp();

    void setTimestamp(int32_t value);

    /// <summary>
    /// Block in which snapshot has been created.
    /// </summary>
    int32_t getBlock() const;
    bool blockIsSet() const;
    void unsetBlock();

    void setBlock(int32_t value);

    /// <summary>
    /// Reference to user.
    /// </summary>
    utility::string_t getUser() const;
    bool userIsSet() const;
    void unsetUser();

    void setUser(const utility::string_t& value);

    /// <summary>
    /// Reference to the pair liquidity is being provided on.
    /// </summary>
    utility::string_t getPair() const;
    bool pairIsSet() const;
    void unsetPair();

    void setPair(const utility::string_t& value);

    /// <summary>
    /// Snapshot of token0 price in USD.
    /// </summary>
    utility::string_t getToken0PriceUsd() const;
    bool token0PriceUsdIsSet() const;
    void unsetToken_0_price_usd();

    void setToken0PriceUsd(const utility::string_t& value);

    /// <summary>
    /// Snapshot of token0 price in USD.
    /// </summary>
    utility::string_t getToken1PriceUsd() const;
    bool token1PriceUsdIsSet() const;
    void unsetToken_1_price_usd();

    void setToken1PriceUsd(const utility::string_t& value);

    /// <summary>
    /// Snapshot of pair token0 reserves.
    /// </summary>
    utility::string_t getReserve0() const;
    bool reserve0IsSet() const;
    void unsetReserve_0();

    void setReserve0(const utility::string_t& value);

    /// <summary>
    /// Snapshot of pair token1 reserves.
    /// </summary>
    utility::string_t getReserve1() const;
    bool reserve1IsSet() const;
    void unsetReserve_1();

    void setReserve1(const utility::string_t& value);

    /// <summary>
    /// Snapshot of pair reserves in USD.
    /// </summary>
    utility::string_t getReserveUsd() const;
    bool reserveUsdIsSet() const;
    void unsetReserve_usd();

    void setReserveUsd(const utility::string_t& value);

    /// <summary>
    /// Snapshot of pool token supply.
    /// </summary>
    utility::string_t getLiquidityTokenTotalSupply() const;
    bool liquidityTokenTotalSupplyIsSet() const;
    void unsetLiquidity_token_total_supply();

    void setLiquidityTokenTotalSupply(const utility::string_t& value);

    /// <summary>
    /// Snapshot of users pool token balance.
    /// </summary>
    utility::string_t getLiquidityTokenBalance() const;
    bool liquidityTokenBalanceIsSet() const;
    void unsetLiquidity_token_balance();

    void setLiquidityTokenBalance(const utility::string_t& value);

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
    utility::string_t m_Liquidity_position;
    bool m_Liquidity_positionIsSet;
    int32_t m_Timestamp;
    bool m_TimestampIsSet;
    int32_t m_Block;
    bool m_BlockIsSet;
    utility::string_t m_User;
    bool m_UserIsSet;
    utility::string_t m_Pair;
    bool m_PairIsSet;
    utility::string_t m_Token_0_price_usd;
    bool m_Token_0_price_usdIsSet;
    utility::string_t m_Token_1_price_usd;
    bool m_Token_1_price_usdIsSet;
    utility::string_t m_Reserve_0;
    bool m_Reserve_0IsSet;
    utility::string_t m_Reserve_1;
    bool m_Reserve_1IsSet;
    utility::string_t m_Reserve_usd;
    bool m_Reserve_usdIsSet;
    utility::string_t m_Liquidity_token_total_supply;
    bool m_Liquidity_token_total_supplyIsSet;
    utility::string_t m_Liquidity_token_balance;
    bool m_Liquidity_token_balanceIsSet;
    int64_t m_Vid;
    bool m_VidIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Sushiswap_LiquidityPositionSnapshotDTO_H_ */
