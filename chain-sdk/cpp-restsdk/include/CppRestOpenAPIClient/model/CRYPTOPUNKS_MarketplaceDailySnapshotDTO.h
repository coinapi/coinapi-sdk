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
 * CRYPTOPUNKS_MarketplaceDailySnapshotDTO.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CRYPTOPUNKS_MarketplaceDailySnapshotDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CRYPTOPUNKS_MarketplaceDailySnapshotDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  CRYPTOPUNKS_MarketplaceDailySnapshotDTO
    : public ModelBase
{
public:
    CRYPTOPUNKS_MarketplaceDailySnapshotDTO();
    virtual ~CRYPTOPUNKS_MarketplaceDailySnapshotDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CRYPTOPUNKS_MarketplaceDailySnapshotDTO members

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
    /// 
    /// </summary>
    utility::string_t getBlockNumber() const;
    bool blockNumberIsSet() const;
    void unsetBlock_number();

    void setBlockNumber(const utility::string_t& value);

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
    utility::string_t getBlockRange() const;
    bool blockRangeIsSet() const;
    void unsetBlock_range();

    void setBlockRange(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getMarketplace() const;
    bool marketplaceIsSet() const;
    void unsetMarketplace();

    void setMarketplace(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTimestamp() const;
    bool timestampIsSet() const;
    void unsetTimestamp();

    void setTimestamp(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getCollectionCount() const;
    bool collectionCountIsSet() const;
    void unsetCollection_count();

    void setCollectionCount(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getCumulativeTradeVolumeEth() const;
    bool cumulativeTradeVolumeEthIsSet() const;
    void unsetCumulative_trade_volume_eth();

    void setCumulativeTradeVolumeEth(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getMarketplaceRevenueEth() const;
    bool marketplaceRevenueEthIsSet() const;
    void unsetMarketplace_revenue_eth();

    void setMarketplaceRevenueEth(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getCreatorRevenueEth() const;
    bool creatorRevenueEthIsSet() const;
    void unsetCreator_revenue_eth();

    void setCreatorRevenueEth(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTotalRevenueEth() const;
    bool totalRevenueEthIsSet() const;
    void unsetTotal_revenue_eth();

    void setTotalRevenueEth(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getTradeCount() const;
    bool tradeCountIsSet() const;
    void unsetTrade_count();

    void setTradeCount(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getCumulativeUniqueTraders() const;
    bool cumulativeUniqueTradersIsSet() const;
    void unsetCumulative_unique_traders();

    void setCumulativeUniqueTraders(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getDailyActiveTraders() const;
    bool dailyActiveTradersIsSet() const;
    void unsetDaily_active_traders();

    void setDailyActiveTraders(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getDailyTradedCollectionCount() const;
    bool dailyTradedCollectionCountIsSet() const;
    void unsetDaily_traded_collection_count();

    void setDailyTradedCollectionCount(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getDailyTradedItemCount() const;
    bool dailyTradedItemCountIsSet() const;
    void unsetDaily_traded_item_count();

    void setDailyTradedItemCount(int32_t value);


protected:
    utility::datetime m_Entry_time;
    bool m_Entry_timeIsSet;
    utility::datetime m_Recv_time;
    bool m_Recv_timeIsSet;
    utility::string_t m_Block_number;
    bool m_Block_numberIsSet;
    int64_t m_Vid;
    bool m_VidIsSet;
    utility::string_t m_Block_range;
    bool m_Block_rangeIsSet;
    utility::string_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Marketplace;
    bool m_MarketplaceIsSet;
    utility::string_t m_Timestamp;
    bool m_TimestampIsSet;
    int32_t m_Collection_count;
    bool m_Collection_countIsSet;
    utility::string_t m_Cumulative_trade_volume_eth;
    bool m_Cumulative_trade_volume_ethIsSet;
    utility::string_t m_Marketplace_revenue_eth;
    bool m_Marketplace_revenue_ethIsSet;
    utility::string_t m_Creator_revenue_eth;
    bool m_Creator_revenue_ethIsSet;
    utility::string_t m_Total_revenue_eth;
    bool m_Total_revenue_ethIsSet;
    int32_t m_Trade_count;
    bool m_Trade_countIsSet;
    int32_t m_Cumulative_unique_traders;
    bool m_Cumulative_unique_tradersIsSet;
    int32_t m_Daily_active_traders;
    bool m_Daily_active_tradersIsSet;
    int32_t m_Daily_traded_collection_count;
    bool m_Daily_traded_collection_countIsSet;
    int32_t m_Daily_traded_item_count;
    bool m_Daily_traded_item_countIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CRYPTOPUNKS_MarketplaceDailySnapshotDTO_H_ */
