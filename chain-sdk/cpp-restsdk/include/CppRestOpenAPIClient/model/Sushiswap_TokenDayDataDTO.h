/**
 * On Chain Dapps - REST API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.3.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * Sushiswap_TokenDayDataDTO.h
 *
 * Token data aggregated across all pairs that include token.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Sushiswap_TokenDayDataDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Sushiswap_TokenDayDataDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// Token data aggregated across all pairs that include token.
/// </summary>
class  Sushiswap_TokenDayDataDTO
    : public ModelBase
{
public:
    Sushiswap_TokenDayDataDTO();
    virtual ~Sushiswap_TokenDayDataDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Sushiswap_TokenDayDataDTO members

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
    /// Identifier, day start timestamp in unix / 86400.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// Unix timestamp for start of day.
    /// </summary>
    int32_t getDate() const;
    bool dateIsSet() const;
    void unsetdate();

    void setDate(int32_t value);

    /// <summary>
    /// Reference to token entity.
    /// </summary>
    utility::string_t getToken() const;
    bool tokenIsSet() const;
    void unsetToken();

    void setToken(const utility::string_t& value);

    /// <summary>
    /// Amount of token swapped across all pairs throughout day.
    /// </summary>
    utility::string_t getVolume() const;
    bool volumeIsSet() const;
    void unsetVolume();

    void setVolume(const utility::string_t& value);

    /// <summary>
    /// Amount of token swapped across all pairs throughout day stored as a derived amount of ETH.
    /// </summary>
    utility::string_t getVolumeEth() const;
    bool volumeEthIsSet() const;
    void unsetVolume_eth();

    void setVolumeEth(const utility::string_t& value);

    /// <summary>
    /// Amount of token swapped across all pairs throughout day stored as a derived amount of USD.
    /// </summary>
    utility::string_t getVolumeUsd() const;
    bool volumeUsdIsSet() const;
    void unsetVolume_usd();

    void setVolumeUsd(const utility::string_t& value);

    /// <summary>
    /// Amount of transactions with this token across all pairs.
    /// </summary>
    utility::string_t getTxCount() const;
    bool txCountIsSet() const;
    void unsetTx_count();

    void setTxCount(const utility::string_t& value);

    /// <summary>
    /// Token amount of token deposited across all pairs.
    /// </summary>
    utility::string_t getLiquidity() const;
    bool liquidityIsSet() const;
    void unsetLiquidity();

    void setLiquidity(const utility::string_t& value);

    /// <summary>
    /// Token amount of token deposited across all pairs stored as amount of ETH.
    /// </summary>
    utility::string_t getLiquidityEth() const;
    bool liquidityEthIsSet() const;
    void unsetLiquidity_eth();

    void setLiquidityEth(const utility::string_t& value);

    /// <summary>
    /// Token amount of token deposited across all pairs stored as amount of USD.
    /// </summary>
    utility::string_t getLiquidityUsd() const;
    bool liquidityUsdIsSet() const;
    void unsetLiquidity_usd();

    void setLiquidityUsd(const utility::string_t& value);

    /// <summary>
    /// Price of token in derived USD.
    /// </summary>
    utility::string_t getPriceUsd() const;
    bool priceUsdIsSet() const;
    void unsetPrice_usd();

    void setPriceUsd(const utility::string_t& value);

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
    int32_t m_date;
    bool m_dateIsSet;
    utility::string_t m_Token;
    bool m_TokenIsSet;
    utility::string_t m_Volume;
    bool m_VolumeIsSet;
    utility::string_t m_Volume_eth;
    bool m_Volume_ethIsSet;
    utility::string_t m_Volume_usd;
    bool m_Volume_usdIsSet;
    utility::string_t m_Tx_count;
    bool m_Tx_countIsSet;
    utility::string_t m_Liquidity;
    bool m_LiquidityIsSet;
    utility::string_t m_Liquidity_eth;
    bool m_Liquidity_ethIsSet;
    utility::string_t m_Liquidity_usd;
    bool m_Liquidity_usdIsSet;
    utility::string_t m_Price_usd;
    bool m_Price_usdIsSet;
    int64_t m_Vid;
    bool m_VidIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Sushiswap_TokenDayDataDTO_H_ */
