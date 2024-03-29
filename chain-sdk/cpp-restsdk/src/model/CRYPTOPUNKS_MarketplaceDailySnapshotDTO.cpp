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



#include "CppRestOpenAPIClient/model/CRYPTOPUNKS_MarketplaceDailySnapshotDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CRYPTOPUNKS_MarketplaceDailySnapshotDTO::CRYPTOPUNKS_MarketplaceDailySnapshotDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = utility::conversions::to_string_t("");
    m_Block_numberIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
    m_Block_range = utility::conversions::to_string_t("");
    m_Block_rangeIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Marketplace = utility::conversions::to_string_t("");
    m_MarketplaceIsSet = false;
    m_Timestamp = utility::conversions::to_string_t("");
    m_TimestampIsSet = false;
    m_Collection_count = 0;
    m_Collection_countIsSet = false;
    m_Cumulative_trade_volume_eth = utility::conversions::to_string_t("");
    m_Cumulative_trade_volume_ethIsSet = false;
    m_Marketplace_revenue_eth = utility::conversions::to_string_t("");
    m_Marketplace_revenue_ethIsSet = false;
    m_Creator_revenue_eth = utility::conversions::to_string_t("");
    m_Creator_revenue_ethIsSet = false;
    m_Total_revenue_eth = utility::conversions::to_string_t("");
    m_Total_revenue_ethIsSet = false;
    m_Trade_count = 0;
    m_Trade_countIsSet = false;
    m_Cumulative_unique_traders = 0;
    m_Cumulative_unique_tradersIsSet = false;
    m_Daily_active_traders = 0;
    m_Daily_active_tradersIsSet = false;
    m_Daily_traded_collection_count = 0;
    m_Daily_traded_collection_countIsSet = false;
    m_Daily_traded_item_count = 0;
    m_Daily_traded_item_countIsSet = false;
}

CRYPTOPUNKS_MarketplaceDailySnapshotDTO::~CRYPTOPUNKS_MarketplaceDailySnapshotDTO()
{
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::validate()
{
    // TODO: implement validation
}

web::json::value CRYPTOPUNKS_MarketplaceDailySnapshotDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Entry_timeIsSet)
    {
        val[utility::conversions::to_string_t(U("entry_time"))] = ModelBase::toJson(m_Entry_time);
    }
    if(m_Recv_timeIsSet)
    {
        val[utility::conversions::to_string_t(U("recv_time"))] = ModelBase::toJson(m_Recv_time);
    }
    if(m_Block_numberIsSet)
    {
        val[utility::conversions::to_string_t(U("block_number"))] = ModelBase::toJson(m_Block_number);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }
    if(m_Block_rangeIsSet)
    {
        val[utility::conversions::to_string_t(U("block_range"))] = ModelBase::toJson(m_Block_range);
    }
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_MarketplaceIsSet)
    {
        val[utility::conversions::to_string_t(U("marketplace"))] = ModelBase::toJson(m_Marketplace);
    }
    if(m_TimestampIsSet)
    {
        val[utility::conversions::to_string_t(U("timestamp"))] = ModelBase::toJson(m_Timestamp);
    }
    if(m_Collection_countIsSet)
    {
        val[utility::conversions::to_string_t(U("collection_count"))] = ModelBase::toJson(m_Collection_count);
    }
    if(m_Cumulative_trade_volume_ethIsSet)
    {
        val[utility::conversions::to_string_t(U("cumulative_trade_volume_eth"))] = ModelBase::toJson(m_Cumulative_trade_volume_eth);
    }
    if(m_Marketplace_revenue_ethIsSet)
    {
        val[utility::conversions::to_string_t(U("marketplace_revenue_eth"))] = ModelBase::toJson(m_Marketplace_revenue_eth);
    }
    if(m_Creator_revenue_ethIsSet)
    {
        val[utility::conversions::to_string_t(U("creator_revenue_eth"))] = ModelBase::toJson(m_Creator_revenue_eth);
    }
    if(m_Total_revenue_ethIsSet)
    {
        val[utility::conversions::to_string_t(U("total_revenue_eth"))] = ModelBase::toJson(m_Total_revenue_eth);
    }
    if(m_Trade_countIsSet)
    {
        val[utility::conversions::to_string_t(U("trade_count"))] = ModelBase::toJson(m_Trade_count);
    }
    if(m_Cumulative_unique_tradersIsSet)
    {
        val[utility::conversions::to_string_t(U("cumulative_unique_traders"))] = ModelBase::toJson(m_Cumulative_unique_traders);
    }
    if(m_Daily_active_tradersIsSet)
    {
        val[utility::conversions::to_string_t(U("daily_active_traders"))] = ModelBase::toJson(m_Daily_active_traders);
    }
    if(m_Daily_traded_collection_countIsSet)
    {
        val[utility::conversions::to_string_t(U("daily_traded_collection_count"))] = ModelBase::toJson(m_Daily_traded_collection_count);
    }
    if(m_Daily_traded_item_countIsSet)
    {
        val[utility::conversions::to_string_t(U("daily_traded_item_count"))] = ModelBase::toJson(m_Daily_traded_item_count);
    }

    return val;
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("entry_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("entry_time")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setEntryTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEntryTime);
            setEntryTime(refVal_setEntryTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("recv_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("recv_time")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setRecvTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRecvTime);
            setRecvTime(refVal_setRecvTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("block_number"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("block_number")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setBlockNumber;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBlockNumber);
            setBlockNumber(refVal_setBlockNumber);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("vid"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("vid")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setVid;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVid);
            setVid(refVal_setVid);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("block_range"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("block_range")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setBlockRange;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBlockRange);
            setBlockRange(refVal_setBlockRange);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("marketplace"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("marketplace")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setMarketplace;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMarketplace);
            setMarketplace(refVal_setMarketplace);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("timestamp"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("timestamp")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTimestamp;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTimestamp);
            setTimestamp(refVal_setTimestamp);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("collection_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("collection_count")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setCollectionCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCollectionCount);
            setCollectionCount(refVal_setCollectionCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("cumulative_trade_volume_eth"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("cumulative_trade_volume_eth")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCumulativeTradeVolumeEth;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCumulativeTradeVolumeEth);
            setCumulativeTradeVolumeEth(refVal_setCumulativeTradeVolumeEth);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("marketplace_revenue_eth"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("marketplace_revenue_eth")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setMarketplaceRevenueEth;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMarketplaceRevenueEth);
            setMarketplaceRevenueEth(refVal_setMarketplaceRevenueEth);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("creator_revenue_eth"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("creator_revenue_eth")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCreatorRevenueEth;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCreatorRevenueEth);
            setCreatorRevenueEth(refVal_setCreatorRevenueEth);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("total_revenue_eth"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("total_revenue_eth")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTotalRevenueEth;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTotalRevenueEth);
            setTotalRevenueEth(refVal_setTotalRevenueEth);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("trade_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("trade_count")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setTradeCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTradeCount);
            setTradeCount(refVal_setTradeCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("cumulative_unique_traders"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("cumulative_unique_traders")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setCumulativeUniqueTraders;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCumulativeUniqueTraders);
            setCumulativeUniqueTraders(refVal_setCumulativeUniqueTraders);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("daily_active_traders"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("daily_active_traders")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setDailyActiveTraders;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDailyActiveTraders);
            setDailyActiveTraders(refVal_setDailyActiveTraders);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("daily_traded_collection_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("daily_traded_collection_count")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setDailyTradedCollectionCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDailyTradedCollectionCount);
            setDailyTradedCollectionCount(refVal_setDailyTradedCollectionCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("daily_traded_item_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("daily_traded_item_count")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setDailyTradedItemCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDailyTradedItemCount);
            setDailyTradedItemCount(refVal_setDailyTradedItemCount);
        }
    }
    return ok;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Entry_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("entry_time")), m_Entry_time));
    }
    if(m_Recv_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("recv_time")), m_Recv_time));
    }
    if(m_Block_numberIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("block_number")), m_Block_number));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
    if(m_Block_rangeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("block_range")), m_Block_range));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_MarketplaceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("marketplace")), m_Marketplace));
    }
    if(m_TimestampIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("timestamp")), m_Timestamp));
    }
    if(m_Collection_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("collection_count")), m_Collection_count));
    }
    if(m_Cumulative_trade_volume_ethIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("cumulative_trade_volume_eth")), m_Cumulative_trade_volume_eth));
    }
    if(m_Marketplace_revenue_ethIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("marketplace_revenue_eth")), m_Marketplace_revenue_eth));
    }
    if(m_Creator_revenue_ethIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("creator_revenue_eth")), m_Creator_revenue_eth));
    }
    if(m_Total_revenue_ethIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("total_revenue_eth")), m_Total_revenue_eth));
    }
    if(m_Trade_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("trade_count")), m_Trade_count));
    }
    if(m_Cumulative_unique_tradersIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("cumulative_unique_traders")), m_Cumulative_unique_traders));
    }
    if(m_Daily_active_tradersIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("daily_active_traders")), m_Daily_active_traders));
    }
    if(m_Daily_traded_collection_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("daily_traded_collection_count")), m_Daily_traded_collection_count));
    }
    if(m_Daily_traded_item_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("daily_traded_item_count")), m_Daily_traded_item_count));
    }
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("entry_time"))))
    {
        utility::datetime refVal_setEntryTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("entry_time"))), refVal_setEntryTime );
        setEntryTime(refVal_setEntryTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("recv_time"))))
    {
        utility::datetime refVal_setRecvTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("recv_time"))), refVal_setRecvTime );
        setRecvTime(refVal_setRecvTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("block_number"))))
    {
        utility::string_t refVal_setBlockNumber;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("block_number"))), refVal_setBlockNumber );
        setBlockNumber(refVal_setBlockNumber);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("block_range"))))
    {
        utility::string_t refVal_setBlockRange;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("block_range"))), refVal_setBlockRange );
        setBlockRange(refVal_setBlockRange);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("marketplace"))))
    {
        utility::string_t refVal_setMarketplace;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("marketplace"))), refVal_setMarketplace );
        setMarketplace(refVal_setMarketplace);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("timestamp"))))
    {
        utility::string_t refVal_setTimestamp;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("timestamp"))), refVal_setTimestamp );
        setTimestamp(refVal_setTimestamp);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("collection_count"))))
    {
        int32_t refVal_setCollectionCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("collection_count"))), refVal_setCollectionCount );
        setCollectionCount(refVal_setCollectionCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("cumulative_trade_volume_eth"))))
    {
        utility::string_t refVal_setCumulativeTradeVolumeEth;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("cumulative_trade_volume_eth"))), refVal_setCumulativeTradeVolumeEth );
        setCumulativeTradeVolumeEth(refVal_setCumulativeTradeVolumeEth);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("marketplace_revenue_eth"))))
    {
        utility::string_t refVal_setMarketplaceRevenueEth;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("marketplace_revenue_eth"))), refVal_setMarketplaceRevenueEth );
        setMarketplaceRevenueEth(refVal_setMarketplaceRevenueEth);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("creator_revenue_eth"))))
    {
        utility::string_t refVal_setCreatorRevenueEth;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("creator_revenue_eth"))), refVal_setCreatorRevenueEth );
        setCreatorRevenueEth(refVal_setCreatorRevenueEth);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("total_revenue_eth"))))
    {
        utility::string_t refVal_setTotalRevenueEth;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("total_revenue_eth"))), refVal_setTotalRevenueEth );
        setTotalRevenueEth(refVal_setTotalRevenueEth);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("trade_count"))))
    {
        int32_t refVal_setTradeCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("trade_count"))), refVal_setTradeCount );
        setTradeCount(refVal_setTradeCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("cumulative_unique_traders"))))
    {
        int32_t refVal_setCumulativeUniqueTraders;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("cumulative_unique_traders"))), refVal_setCumulativeUniqueTraders );
        setCumulativeUniqueTraders(refVal_setCumulativeUniqueTraders);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("daily_active_traders"))))
    {
        int32_t refVal_setDailyActiveTraders;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("daily_active_traders"))), refVal_setDailyActiveTraders );
        setDailyActiveTraders(refVal_setDailyActiveTraders);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("daily_traded_collection_count"))))
    {
        int32_t refVal_setDailyTradedCollectionCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("daily_traded_collection_count"))), refVal_setDailyTradedCollectionCount );
        setDailyTradedCollectionCount(refVal_setDailyTradedCollectionCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("daily_traded_item_count"))))
    {
        int32_t refVal_setDailyTradedItemCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("daily_traded_item_count"))), refVal_setDailyTradedItemCount );
        setDailyTradedItemCount(refVal_setDailyTradedItemCount);
    }
    return ok;
}

utility::datetime CRYPTOPUNKS_MarketplaceDailySnapshotDTO::getEntryTime() const
{
    return m_Entry_time;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime CRYPTOPUNKS_MarketplaceDailySnapshotDTO::getRecvTime() const
{
    return m_Recv_time;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
utility::string_t CRYPTOPUNKS_MarketplaceDailySnapshotDTO::getBlockNumber() const
{
    return m_Block_number;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::setBlockNumber(const utility::string_t& value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
int64_t CRYPTOPUNKS_MarketplaceDailySnapshotDTO::getVid() const
{
    return m_Vid;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::unsetVid()
{
    m_VidIsSet = false;
}
utility::string_t CRYPTOPUNKS_MarketplaceDailySnapshotDTO::getBlockRange() const
{
    return m_Block_range;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::setBlockRange(const utility::string_t& value)
{
    m_Block_range = value;
    m_Block_rangeIsSet = true;
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::blockRangeIsSet() const
{
    return m_Block_rangeIsSet;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::unsetBlock_range()
{
    m_Block_rangeIsSet = false;
}
utility::string_t CRYPTOPUNKS_MarketplaceDailySnapshotDTO::getId() const
{
    return m_Id;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::idIsSet() const
{
    return m_IdIsSet;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t CRYPTOPUNKS_MarketplaceDailySnapshotDTO::getMarketplace() const
{
    return m_Marketplace;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::setMarketplace(const utility::string_t& value)
{
    m_Marketplace = value;
    m_MarketplaceIsSet = true;
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::marketplaceIsSet() const
{
    return m_MarketplaceIsSet;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::unsetMarketplace()
{
    m_MarketplaceIsSet = false;
}
utility::string_t CRYPTOPUNKS_MarketplaceDailySnapshotDTO::getTimestamp() const
{
    return m_Timestamp;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::setTimestamp(const utility::string_t& value)
{
    m_Timestamp = value;
    m_TimestampIsSet = true;
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::timestampIsSet() const
{
    return m_TimestampIsSet;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::unsetTimestamp()
{
    m_TimestampIsSet = false;
}
int32_t CRYPTOPUNKS_MarketplaceDailySnapshotDTO::getCollectionCount() const
{
    return m_Collection_count;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::setCollectionCount(int32_t value)
{
    m_Collection_count = value;
    m_Collection_countIsSet = true;
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::collectionCountIsSet() const
{
    return m_Collection_countIsSet;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::unsetCollection_count()
{
    m_Collection_countIsSet = false;
}
utility::string_t CRYPTOPUNKS_MarketplaceDailySnapshotDTO::getCumulativeTradeVolumeEth() const
{
    return m_Cumulative_trade_volume_eth;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::setCumulativeTradeVolumeEth(const utility::string_t& value)
{
    m_Cumulative_trade_volume_eth = value;
    m_Cumulative_trade_volume_ethIsSet = true;
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::cumulativeTradeVolumeEthIsSet() const
{
    return m_Cumulative_trade_volume_ethIsSet;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::unsetCumulative_trade_volume_eth()
{
    m_Cumulative_trade_volume_ethIsSet = false;
}
utility::string_t CRYPTOPUNKS_MarketplaceDailySnapshotDTO::getMarketplaceRevenueEth() const
{
    return m_Marketplace_revenue_eth;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::setMarketplaceRevenueEth(const utility::string_t& value)
{
    m_Marketplace_revenue_eth = value;
    m_Marketplace_revenue_ethIsSet = true;
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::marketplaceRevenueEthIsSet() const
{
    return m_Marketplace_revenue_ethIsSet;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::unsetMarketplace_revenue_eth()
{
    m_Marketplace_revenue_ethIsSet = false;
}
utility::string_t CRYPTOPUNKS_MarketplaceDailySnapshotDTO::getCreatorRevenueEth() const
{
    return m_Creator_revenue_eth;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::setCreatorRevenueEth(const utility::string_t& value)
{
    m_Creator_revenue_eth = value;
    m_Creator_revenue_ethIsSet = true;
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::creatorRevenueEthIsSet() const
{
    return m_Creator_revenue_ethIsSet;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::unsetCreator_revenue_eth()
{
    m_Creator_revenue_ethIsSet = false;
}
utility::string_t CRYPTOPUNKS_MarketplaceDailySnapshotDTO::getTotalRevenueEth() const
{
    return m_Total_revenue_eth;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::setTotalRevenueEth(const utility::string_t& value)
{
    m_Total_revenue_eth = value;
    m_Total_revenue_ethIsSet = true;
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::totalRevenueEthIsSet() const
{
    return m_Total_revenue_ethIsSet;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::unsetTotal_revenue_eth()
{
    m_Total_revenue_ethIsSet = false;
}
int32_t CRYPTOPUNKS_MarketplaceDailySnapshotDTO::getTradeCount() const
{
    return m_Trade_count;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::setTradeCount(int32_t value)
{
    m_Trade_count = value;
    m_Trade_countIsSet = true;
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::tradeCountIsSet() const
{
    return m_Trade_countIsSet;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::unsetTrade_count()
{
    m_Trade_countIsSet = false;
}
int32_t CRYPTOPUNKS_MarketplaceDailySnapshotDTO::getCumulativeUniqueTraders() const
{
    return m_Cumulative_unique_traders;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::setCumulativeUniqueTraders(int32_t value)
{
    m_Cumulative_unique_traders = value;
    m_Cumulative_unique_tradersIsSet = true;
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::cumulativeUniqueTradersIsSet() const
{
    return m_Cumulative_unique_tradersIsSet;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::unsetCumulative_unique_traders()
{
    m_Cumulative_unique_tradersIsSet = false;
}
int32_t CRYPTOPUNKS_MarketplaceDailySnapshotDTO::getDailyActiveTraders() const
{
    return m_Daily_active_traders;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::setDailyActiveTraders(int32_t value)
{
    m_Daily_active_traders = value;
    m_Daily_active_tradersIsSet = true;
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::dailyActiveTradersIsSet() const
{
    return m_Daily_active_tradersIsSet;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::unsetDaily_active_traders()
{
    m_Daily_active_tradersIsSet = false;
}
int32_t CRYPTOPUNKS_MarketplaceDailySnapshotDTO::getDailyTradedCollectionCount() const
{
    return m_Daily_traded_collection_count;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::setDailyTradedCollectionCount(int32_t value)
{
    m_Daily_traded_collection_count = value;
    m_Daily_traded_collection_countIsSet = true;
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::dailyTradedCollectionCountIsSet() const
{
    return m_Daily_traded_collection_countIsSet;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::unsetDaily_traded_collection_count()
{
    m_Daily_traded_collection_countIsSet = false;
}
int32_t CRYPTOPUNKS_MarketplaceDailySnapshotDTO::getDailyTradedItemCount() const
{
    return m_Daily_traded_item_count;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::setDailyTradedItemCount(int32_t value)
{
    m_Daily_traded_item_count = value;
    m_Daily_traded_item_countIsSet = true;
}

bool CRYPTOPUNKS_MarketplaceDailySnapshotDTO::dailyTradedItemCountIsSet() const
{
    return m_Daily_traded_item_countIsSet;
}

void CRYPTOPUNKS_MarketplaceDailySnapshotDTO::unsetDaily_traded_item_count()
{
    m_Daily_traded_item_countIsSet = false;
}
}
}
}
}


