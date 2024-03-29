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
 * Sushiswap_PairHourDataDTO.h
 *
 * Tracks pair data across each hour.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Sushiswap_PairHourDataDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Sushiswap_PairHourDataDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// Tracks pair data across each hour.
/// </summary>
class  Sushiswap_PairHourDataDTO
    : public ModelBase
{
public:
    Sushiswap_PairHourDataDTO();
    virtual ~Sushiswap_PairHourDataDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Sushiswap_PairHourDataDTO members

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
    /// Identifier, format: (pair id)-(hour start timestamp).
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// Hour start timestamp.
    /// </summary>
    int32_t getDate() const;
    bool dateIsSet() const;
    void unsetdate();

    void setDate(int32_t value);

    /// <summary>
    /// Reference to pair.
    /// </summary>
    utility::string_t getPair() const;
    bool pairIsSet() const;
    void unsetPair();

    void setPair(const utility::string_t& value);

    /// <summary>
    /// Reserve of token0 (updated during each transaction on pair).
    /// </summary>
    utility::string_t getReserve0() const;
    bool reserve0IsSet() const;
    void unsetReserve_0();

    void setReserve0(const utility::string_t& value);

    /// <summary>
    /// Reserve of token1 (updated during each transaction on pair).
    /// </summary>
    utility::string_t getReserve1() const;
    bool reserve1IsSet() const;
    void unsetReserve_1();

    void setReserve1(const utility::string_t& value);

    /// <summary>
    /// Reserve of token0 plus token1 stored as a derived USD amount.
    /// </summary>
    utility::string_t getReserveUsd() const;
    bool reserveUsdIsSet() const;
    void unsetReserve_usd();

    void setReserveUsd(const utility::string_t& value);

    /// <summary>
    /// Total amount of token0 swapped throughout hour.
    /// </summary>
    utility::string_t getVolumeToken0() const;
    bool volumeToken0IsSet() const;
    void unsetVolume_token_0();

    void setVolumeToken0(const utility::string_t& value);

    /// <summary>
    /// Total amount of token1 swapped throughout hour.
    /// </summary>
    utility::string_t getVolumeToken1() const;
    bool volumeToken1IsSet() const;
    void unsetVolume_token_1();

    void setVolumeToken1(const utility::string_t& value);

    /// <summary>
    /// Total volume within pair throughout hour.
    /// </summary>
    utility::string_t getVolumeUsd() const;
    bool volumeUsdIsSet() const;
    void unsetVolume_usd();

    void setVolumeUsd(const utility::string_t& value);

    /// <summary>
    /// Amount of transactions on pair throughout hour.
    /// </summary>
    utility::string_t getTxCount() const;
    bool txCountIsSet() const;
    void unsetTx_count();

    void setTxCount(const utility::string_t& value);

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
    utility::string_t m_Pair;
    bool m_PairIsSet;
    utility::string_t m_Reserve_0;
    bool m_Reserve_0IsSet;
    utility::string_t m_Reserve_1;
    bool m_Reserve_1IsSet;
    utility::string_t m_Reserve_usd;
    bool m_Reserve_usdIsSet;
    utility::string_t m_Volume_token_0;
    bool m_Volume_token_0IsSet;
    utility::string_t m_Volume_token_1;
    bool m_Volume_token_1IsSet;
    utility::string_t m_Volume_usd;
    bool m_Volume_usdIsSet;
    utility::string_t m_Tx_count;
    bool m_Tx_countIsSet;
    int64_t m_Vid;
    bool m_VidIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Sushiswap_PairHourDataDTO_H_ */
