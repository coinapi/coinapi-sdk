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
 * UniswapV3_PositionDTO.h
 *
 * Positions created through NonfungiblePositionManager. Positions are represented as NFTs (ERC-721 tokens) as opposed to the fungible ERC-20 tokens on Uniswap V1 and V2.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV3_PositionDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV3_PositionDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// Positions created through NonfungiblePositionManager. Positions are represented as NFTs (ERC-721 tokens) as opposed to the fungible ERC-20 tokens on Uniswap V1 and V2.
/// </summary>
class  UniswapV3_PositionDTO
    : public ModelBase
{
public:
    UniswapV3_PositionDTO();
    virtual ~UniswapV3_PositionDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// UniswapV3_PositionDTO members

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
    /// NFT token identifier.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// Owner of the NFT.
    /// </summary>
    utility::string_t getOwner() const;
    bool ownerIsSet() const;
    void unsetOwner();

    void setOwner(const utility::string_t& value);

    /// <summary>
    /// Pool position is within.
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
    /// Lower tick of the position.
    /// </summary>
    utility::string_t getTickLower() const;
    bool tickLowerIsSet() const;
    void unsetTick_lower();

    void setTickLower(const utility::string_t& value);

    /// <summary>
    /// Upper tick of the position.
    /// </summary>
    utility::string_t getTickUpper() const;
    bool tickUpperIsSet() const;
    void unsetTick_upper();

    void setTickUpper(const utility::string_t& value);

    /// <summary>
    /// Total position liquidity.
    /// </summary>
    utility::string_t getLiquidity() const;
    bool liquidityIsSet() const;
    void unsetLiquidity();

    void setLiquidity(const utility::string_t& value);

    /// <summary>
    /// Amount of token 0 ever deposited to position.
    /// </summary>
    utility::string_t getDepositedToken0() const;
    bool depositedToken0IsSet() const;
    void unsetDeposited_token_0();

    void setDepositedToken0(const utility::string_t& value);

    /// <summary>
    /// Amount of token 1 ever deposited to position.
    /// </summary>
    utility::string_t getDepositedToken1() const;
    bool depositedToken1IsSet() const;
    void unsetDeposited_token_1();

    void setDepositedToken1(const utility::string_t& value);

    /// <summary>
    /// Amount of token 0 ever withdrawn from position (without fees).
    /// </summary>
    utility::string_t getWithdrawnToken0() const;
    bool withdrawnToken0IsSet() const;
    void unsetWithdrawn_token_0();

    void setWithdrawnToken0(const utility::string_t& value);

    /// <summary>
    /// Amount of token 1 ever withdrawn from position (without fees).
    /// </summary>
    utility::string_t getWithdrawnToken1() const;
    bool withdrawnToken1IsSet() const;
    void unsetWithdrawn_token_1();

    void setWithdrawnToken1(const utility::string_t& value);

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
    /// Transaction in which the position was initialized.
    /// </summary>
    utility::string_t getTransaction() const;
    bool transactionIsSet() const;
    void unsetTransaction();

    void setTransaction(const utility::string_t& value);

    /// <summary>
    /// Variable needed for fee computation.
    /// </summary>
    utility::string_t getFeeGrowthInside0LastX128() const;
    bool feeGrowthInside0LastX128IsSet() const;
    void unsetFee_growth_inside_0_last_x128();

    void setFeeGrowthInside0LastX128(const utility::string_t& value);

    /// <summary>
    /// Variable needed for fee computation.
    /// </summary>
    utility::string_t getFeeGrowthInside1LastX128() const;
    bool feeGrowthInside1LastX128IsSet() const;
    void unsetFee_growth_inside_1_last_x128();

    void setFeeGrowthInside1LastX128(const utility::string_t& value);

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
    utility::string_t m_Owner;
    bool m_OwnerIsSet;
    utility::string_t m_Pool;
    bool m_PoolIsSet;
    utility::string_t m_Token_0;
    bool m_Token_0IsSet;
    utility::string_t m_Token_1;
    bool m_Token_1IsSet;
    utility::string_t m_Tick_lower;
    bool m_Tick_lowerIsSet;
    utility::string_t m_Tick_upper;
    bool m_Tick_upperIsSet;
    utility::string_t m_Liquidity;
    bool m_LiquidityIsSet;
    utility::string_t m_Deposited_token_0;
    bool m_Deposited_token_0IsSet;
    utility::string_t m_Deposited_token_1;
    bool m_Deposited_token_1IsSet;
    utility::string_t m_Withdrawn_token_0;
    bool m_Withdrawn_token_0IsSet;
    utility::string_t m_Withdrawn_token_1;
    bool m_Withdrawn_token_1IsSet;
    utility::string_t m_Collected_fees_token_0;
    bool m_Collected_fees_token_0IsSet;
    utility::string_t m_Collected_fees_token_1;
    bool m_Collected_fees_token_1IsSet;
    utility::string_t m_Transaction;
    bool m_TransactionIsSet;
    utility::string_t m_Fee_growth_inside_0_last_x128;
    bool m_Fee_growth_inside_0_last_x128IsSet;
    utility::string_t m_Fee_growth_inside_1_last_x128;
    bool m_Fee_growth_inside_1_last_x128IsSet;
    int64_t m_Vid;
    bool m_VidIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_UniswapV3_PositionDTO_H_ */
