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
 * UniswapV3Api.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_UniswapV3Api_H_
#define ORG_OPENAPITOOLS_CLIENT_API_UniswapV3Api_H_



#include "CppRestOpenAPIClient/ApiClient.h"

#include "CppRestOpenAPIClient/model/UniswapV3_BundleV3DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV3_BurnV3DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV3_FactoryV3DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV3_MintV3DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV3_PoolDayDataV3DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV3_PoolHourDataV3DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV3_PoolV3DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV3_PositionSnapshotV3DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV3_PositionV3DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV3_SwapV3DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV3_TickDayDataV3DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV3_TickV3DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV3_TokenHourDataV3DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV3_TokenV3DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV3_TokenV3DayDataDTO.h"
#include "CppRestOpenAPIClient/model/UniswapV3_TransactionV3DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV3_UniswapDayDataV3DTO.h"
#include <cpprest/details/basic_types.h>
#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  UniswapV3Api 
{
public:

    explicit UniswapV3Api( std::shared_ptr<const ApiClient> apiClient );

    virtual ~UniswapV3Api();

    /// <summary>
    /// Bundles (current)
    /// </summary>
    /// <remarks>
    /// Gets bundles.
    /// </remarks>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_BundleV3DTO>>> uniswapV3_GetBundles__current(
    ) const;
    /// <summary>
    /// Bundles (historical)
    /// </summary>
    /// <remarks>
    /// Gets bundles.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_BundleV3DTO>>> uniswapV3_GetBundles__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
    ) const;
    /// <summary>
    /// Burns (current)
    /// </summary>
    /// <remarks>
    /// Gets burns.
    /// </remarks>
    /// <param name="filterPoolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_BurnV3DTO>>> uniswapV3_GetBurns__current(
        boost::optional<utility::string_t> filterPoolId
    ) const;
    /// <summary>
    /// Burns (historical)
    /// </summary>
    /// <remarks>
    /// Gets burns.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_BurnV3DTO>>> uniswapV3_GetBurns__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// DayData (current)
    /// </summary>
    /// <remarks>
    /// Gets uniswapv3 day data.
    /// </remarks>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_UniswapDayDataV3DTO>>> uniswapV3_GetDayData__current(
    ) const;
    /// <summary>
    /// DayData (historical)
    /// </summary>
    /// <remarks>
    /// Gets uniswapv3 day data.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_UniswapDayDataV3DTO>>> uniswapV3_GetDayData__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
    ) const;
    /// <summary>
    /// Factory (current)
    /// </summary>
    /// <remarks>
    /// Gets factory.
    /// </remarks>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_FactoryV3DTO>>> uniswapV3_GetFactory__current(
    ) const;
    /// <summary>
    /// Factory (historical)
    /// </summary>
    /// <remarks>
    /// Gets factory.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_FactoryV3DTO>>> uniswapV3_GetFactory__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
    ) const;
    /// <summary>
    /// Mints (current)
    /// </summary>
    /// <remarks>
    /// Gets mints.
    /// </remarks>
    /// <param name="filterPoolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_MintV3DTO>>> uniswapV3_GetMints__current(
        boost::optional<utility::string_t> filterPoolId
    ) const;
    /// <summary>
    /// Mints (historical)
    /// </summary>
    /// <remarks>
    /// Gets mints.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_MintV3DTO>>> uniswapV3_GetMints__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// PoolsDayData (current)
    /// </summary>
    /// <remarks>
    /// Gets pools day data.
    /// </remarks>
    /// <param name="filterPoolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_PoolDayDataV3DTO>>> uniswapV3_GetPoolsDayData__current(
        boost::optional<utility::string_t> filterPoolId
    ) const;
    /// <summary>
    /// PoolsDayData (historical)
    /// </summary>
    /// <remarks>
    /// Gets pools day data.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_PoolDayDataV3DTO>>> uniswapV3_GetPoolsDayData__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// PoolsHourData (current)
    /// </summary>
    /// <remarks>
    /// Gets pools hour data.
    /// </remarks>
    /// <param name="filterPoolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_PoolHourDataV3DTO>>> uniswapV3_GetPoolsHourData__current(
        boost::optional<utility::string_t> filterPoolId
    ) const;
    /// <summary>
    /// PoolsHourData (historical)
    /// </summary>
    /// <remarks>
    /// Gets pools hour data.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_PoolHourDataV3DTO>>> uniswapV3_GetPoolsHourData__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// Pools (current) 🔥
    /// </summary>
    /// <remarks>
    /// Gets pools.
    /// </remarks>
    /// <param name="filterPoolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_PoolV3DTO>>> uniswapV3_GetPools__current(
        boost::optional<utility::string_t> filterPoolId
    ) const;
    /// <summary>
    /// Pools (historical) 🔥
    /// </summary>
    /// <remarks>
    /// Gets pools.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_PoolV3DTO>>> uniswapV3_GetPools__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// PositionsSnaphots (historical)
    /// </summary>
    /// <remarks>
    /// Gets positions snapshots.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_PositionSnapshotV3DTO>>> uniswapV3_GetPositionsSnaphots__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// PositionsSnapshots (current)
    /// </summary>
    /// <remarks>
    /// Gets positions snapshots.
    /// </remarks>
    /// <param name="filterPoolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_PositionSnapshotV3DTO>>> uniswapV3_GetPositionsSnapshots__current(
        boost::optional<utility::string_t> filterPoolId
    ) const;
    /// <summary>
    /// Positions (current)
    /// </summary>
    /// <remarks>
    /// Gets positions.
    /// </remarks>
    /// <param name="filterPoolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_PositionV3DTO>>> uniswapV3_GetPositions__current(
        boost::optional<utility::string_t> filterPoolId
    ) const;
    /// <summary>
    /// Positions (historical)
    /// </summary>
    /// <remarks>
    /// Gets positions.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_PositionV3DTO>>> uniswapV3_GetPositions__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// Swaps (current) 🔥
    /// </summary>
    /// <remarks>
    /// Gets swaps.
    /// </remarks>
    /// <param name="filterPoolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_SwapV3DTO>>> uniswapV3_GetSwaps__current(
        boost::optional<utility::string_t> filterPoolId
    ) const;
    /// <summary>
    /// Swaps (historical) 🔥
    /// </summary>
    /// <remarks>
    /// Gets swaps.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_SwapV3DTO>>> uniswapV3_GetSwaps__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// TicksDayData (current)
    /// </summary>
    /// <remarks>
    /// Gets ticks day data.
    /// </remarks>
    /// <param name="filterPoolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_TickDayDataV3DTO>>> uniswapV3_GetTicksDayData__current(
        boost::optional<utility::string_t> filterPoolId
    ) const;
    /// <summary>
    /// TicksDayData (historical)
    /// </summary>
    /// <remarks>
    /// Gets ticks day data.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_TickDayDataV3DTO>>> uniswapV3_GetTicksDayData__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// Ticks (current)
    /// </summary>
    /// <remarks>
    /// Gets ticks.
    /// </remarks>
    /// <param name="filterPoolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_TickV3DTO>>> uniswapV3_GetTicks__current(
        boost::optional<utility::string_t> filterPoolId
    ) const;
    /// <summary>
    /// Ticks (historical)
    /// </summary>
    /// <remarks>
    /// Gets ticks.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_TickV3DTO>>> uniswapV3_GetTicks__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// TokensDayData (current)
    /// </summary>
    /// <remarks>
    /// Gets tokens day data.
    /// </remarks>
    /// <param name="filterTokenId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_TokenV3DayDataDTO>>> uniswapV3_GetTokensDayData__current(
        boost::optional<utility::string_t> filterTokenId
    ) const;
    /// <summary>
    /// TokensDayData (historical)
    /// </summary>
    /// <remarks>
    /// Gets tokens day data.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="tokenId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_TokenV3DayDataDTO>>> uniswapV3_GetTokensDayData__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> tokenId
    ) const;
    /// <summary>
    /// TokensHourData (current)
    /// </summary>
    /// <remarks>
    /// Gets tokens hour data.
    /// </remarks>
    /// <param name="filterTokenId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_TokenHourDataV3DTO>>> uniswapV3_GetTokensHourData__current(
        boost::optional<utility::string_t> filterTokenId
    ) const;
    /// <summary>
    /// TokensHourData (historical)
    /// </summary>
    /// <remarks>
    /// Gets tokens hour data.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="tokenId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_TokenHourDataV3DTO>>> uniswapV3_GetTokensHourData__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> tokenId
    ) const;
    /// <summary>
    /// Tokens (current) 🔥
    /// </summary>
    /// <remarks>
    /// Gets tokens.
    /// </remarks>
    /// <param name="filterTokenId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_TokenV3DTO>>> uniswapV3_GetTokens__current(
        boost::optional<utility::string_t> filterTokenId
    ) const;
    /// <summary>
    /// Tokens (historical) 🔥
    /// </summary>
    /// <remarks>
    /// Gets tokens.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="tokenId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_TokenV3DTO>>> uniswapV3_GetTokens__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> tokenId
    ) const;
    /// <summary>
    /// Transactions (historical)
    /// </summary>
    /// <remarks>
    /// Gets transactions.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV3_TransactionV3DTO>>> uniswapV3_GetTransactions__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_UniswapV3Api_H_ */

