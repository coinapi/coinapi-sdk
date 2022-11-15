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
 * UniswapV2Api.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_UniswapV2Api_H_
#define ORG_OPENAPITOOLS_CLIENT_API_UniswapV2Api_H_



#include "CppRestOpenAPIClient/ApiClient.h"

#include "CppRestOpenAPIClient/model/UniswapV2_BundleV2DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV2_BurnV2DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV2_LiquidityPositionSnapshotV2DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV2_LiquidityPositionV2DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV2_MintV2DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV2_PairDayDataV2DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV2_PairHourDataV2DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV2_PairV2DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV2_SwapV2DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV2_TokenDayDataV2DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV2_TokenV2DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV2_TransactionV2DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV2_UniswapDayDataV2DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV2_UniswapFactoryV2DTO.h"
#include "CppRestOpenAPIClient/model/UniswapV2_UserV2DTO.h"
#include <cpprest/details/basic_types.h>
#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  UniswapV2Api 
{
public:

    explicit UniswapV2Api( std::shared_ptr<const ApiClient> apiClient );

    virtual ~UniswapV2Api();

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
    pplx::task<std::vector<std::shared_ptr<UniswapV2_BundleV2DTO>>> uniswapV2_GetBundles__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
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
    pplx::task<std::vector<std::shared_ptr<UniswapV2_BurnV2DTO>>> uniswapV2_GetBurns__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// DayData (historical)
    /// </summary>
    /// <remarks>
    /// Gets uniswapv2 day data.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV2_UniswapDayDataV2DTO>>> uniswapV2_GetDayData__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
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
    pplx::task<std::vector<std::shared_ptr<UniswapV2_UniswapFactoryV2DTO>>> uniswapV2_GetFactory__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
    ) const;
    /// <summary>
    /// LiquidityPositionsSnapshots (historical)
    /// </summary>
    /// <remarks>
    /// Gets liquidity positions snapshots.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV2_LiquidityPositionSnapshotV2DTO>>> uniswapV2_GetLiquidityPositionsSnapshots__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// LiquidityPositions (historical)
    /// </summary>
    /// <remarks>
    /// Gets liquidity positions.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV2_LiquidityPositionV2DTO>>> uniswapV2_GetLiquidityPositions__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
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
    pplx::task<std::vector<std::shared_ptr<UniswapV2_MintV2DTO>>> uniswapV2_GetMints__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
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
    pplx::task<std::vector<std::shared_ptr<UniswapV2_PairDayDataV2DTO>>> uniswapV2_GetPoolsDayData__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// PoolsHourData (historical)
    /// </summary>
    /// <remarks>
    /// Gets pools tracked each our.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV2_PairHourDataV2DTO>>> uniswapV2_GetPoolsHourData__historical(
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
    pplx::task<std::vector<std::shared_ptr<UniswapV2_PairV2DTO>>> uniswapV2_GetPools__current(
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
    pplx::task<std::vector<std::shared_ptr<UniswapV2_PairV2DTO>>> uniswapV2_GetPools__historical(
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
    pplx::task<std::vector<std::shared_ptr<UniswapV2_SwapV2DTO>>> uniswapV2_GetSwaps__current(
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
    pplx::task<std::vector<std::shared_ptr<UniswapV2_SwapV2DTO>>> uniswapV2_GetSwaps__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
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
    pplx::task<std::vector<std::shared_ptr<UniswapV2_TokenDayDataV2DTO>>> uniswapV2_GetTokensDayData__historical(
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
    pplx::task<std::vector<std::shared_ptr<UniswapV2_TokenV2DTO>>> uniswapV2_GetTokens__current(
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
    pplx::task<std::vector<std::shared_ptr<UniswapV2_TokenV2DTO>>> uniswapV2_GetTokens__historical(
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
    pplx::task<std::vector<std::shared_ptr<UniswapV2_TransactionV2DTO>>> uniswapV2_GetTransactions__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
    ) const;
    /// <summary>
    /// Users (historical)
    /// </summary>
    /// <remarks>
    /// Gets users.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    pplx::task<std::vector<std::shared_ptr<UniswapV2_UserV2DTO>>> uniswapV2_GetUsers__historical(
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

#endif /* ORG_OPENAPITOOLS_CLIENT_API_UniswapV2Api_H_ */

