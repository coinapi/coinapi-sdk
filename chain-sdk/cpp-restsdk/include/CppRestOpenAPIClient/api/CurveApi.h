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
 * CurveApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_CurveApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_CurveApi_H_



#include "CppRestOpenAPIClient/ApiClient.h"

#include "CppRestOpenAPIClient/model/Curve_AccountDTO.h"
#include "CppRestOpenAPIClient/model/Curve_AddLiquidityEventDTO.h"
#include "CppRestOpenAPIClient/model/Curve_AdminFeeChangeLogDTO.h"
#include "CppRestOpenAPIClient/model/Curve_AmplificationCoeffChangeLogDTO.h"
#include "CppRestOpenAPIClient/model/Curve_CoinDTO.h"
#include "CppRestOpenAPIClient/model/Curve_ContractDTO.h"
#include "CppRestOpenAPIClient/model/Curve_ContractVersionDTO.h"
#include "CppRestOpenAPIClient/model/Curve_DailyVolumeDTO.h"
#include "CppRestOpenAPIClient/model/Curve_ExchangeDTO.h"
#include "CppRestOpenAPIClient/model/Curve_FeeChangeLogDTO.h"
#include "CppRestOpenAPIClient/model/Curve_GaugeDTO.h"
#include "CppRestOpenAPIClient/model/Curve_GaugeDepositDTO.h"
#include "CppRestOpenAPIClient/model/Curve_GaugeLiquidityDTO.h"
#include "CppRestOpenAPIClient/model/Curve_GaugeTotalWeightDTO.h"
#include "CppRestOpenAPIClient/model/Curve_GaugeTypeDTO.h"
#include "CppRestOpenAPIClient/model/Curve_GaugeTypeWeightDTO.h"
#include "CppRestOpenAPIClient/model/Curve_GaugeWeightDTO.h"
#include "CppRestOpenAPIClient/model/Curve_GaugeWeightVoteDTO.h"
#include "CppRestOpenAPIClient/model/Curve_GaugeWithdrawDTO.h"
#include "CppRestOpenAPIClient/model/Curve_HourlyVolumeDTO.h"
#include "CppRestOpenAPIClient/model/Curve_LpTokenDTO.h"
#include "CppRestOpenAPIClient/model/Curve_PoolDTO.h"
#include "CppRestOpenAPIClient/model/Curve_ProposalDTO.h"
#include "CppRestOpenAPIClient/model/Curve_ProposalVoteDTO.h"
#include "CppRestOpenAPIClient/model/Curve_RemoveLiquidityEventDTO.h"
#include "CppRestOpenAPIClient/model/Curve_RemoveLiquidityOneEventDTO.h"
#include "CppRestOpenAPIClient/model/Curve_SystemStateDTO.h"
#include "CppRestOpenAPIClient/model/Curve_TokenDTO.h"
#include "CppRestOpenAPIClient/model/Curve_TransferOwnershipEventDTO.h"
#include "CppRestOpenAPIClient/model/Curve_UnderlyingCoinDTO.h"
#include "CppRestOpenAPIClient/model/Curve_VotingAppDTO.h"
#include "CppRestOpenAPIClient/model/Curve_WeeklyVolumeDTO.h"
#include <cpprest/details/basic_types.h>
#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  CurveApi 
{
public:

    explicit CurveApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~CurveApi();

    /// <summary>
    /// GetAccounts (historical)
    /// </summary>
    /// <remarks>
    /// Gets accounts.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    pplx::task<std::vector<std::shared_ptr<Curve_AccountDTO>>> curve_GetAccounts__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
    ) const;
    /// <summary>
    /// GetAddLiquidityEvents (historical)
    /// </summary>
    /// <remarks>
    /// Gets add liquidity events.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Curve_AddLiquidityEventDTO>>> curve_GetAddLiquidityEvents__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// GetAdminFeeChangeLogs (historical)
    /// </summary>
    /// <remarks>
    /// Gets admin fee change logs.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Curve_AdminFeeChangeLogDTO>>> curve_GetAdminFeeChangeLogs__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// GetAmplificationCoeffChangeLogs (historical)
    /// </summary>
    /// <remarks>
    /// Gets amplification coeff change logs.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Curve_AmplificationCoeffChangeLogDTO>>> curve_GetAmplificationCoeffChangeLogs__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// GetCoins (historical)
    /// </summary>
    /// <remarks>
    /// Gets coins.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Curve_CoinDTO>>> curve_GetCoins__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// GetContractsVersions (historical)
    /// </summary>
    /// <remarks>
    /// Gets contracts versions.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Curve_ContractVersionDTO>>> curve_GetContractsVersions__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// GetContracts (historical)
    /// </summary>
    /// <remarks>
    /// Gets contracts.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Curve_ContractDTO>>> curve_GetContracts__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// GetDailyVolumes (historical)
    /// </summary>
    /// <remarks>
    /// Gets daily volumes.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Curve_DailyVolumeDTO>>> curve_GetDailyVolumes__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// GetExchanges (historical) 🔥
    /// </summary>
    /// <remarks>
    /// Gets exchanges.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Curve_ExchangeDTO>>> curve_GetExchanges__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// GetFeeChangeLogs (historical)
    /// </summary>
    /// <remarks>
    /// Gets fee change logs.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Curve_FeeChangeLogDTO>>> curve_GetFeeChangeLogs__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// GetGaugesDeposits (historical)
    /// </summary>
    /// <remarks>
    /// Gets gauges deposits.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    pplx::task<std::vector<std::shared_ptr<Curve_GaugeDepositDTO>>> curve_GetGaugesDeposits__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
    ) const;
    /// <summary>
    /// GetGaugesLiquidity (historical)
    /// </summary>
    /// <remarks>
    /// Gets gauges liquidity.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    pplx::task<std::vector<std::shared_ptr<Curve_GaugeLiquidityDTO>>> curve_GetGaugesLiquidity__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
    ) const;
    /// <summary>
    /// GetGaugesTotalWeights (historical)
    /// </summary>
    /// <remarks>
    /// Gets gauges total weights.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    pplx::task<std::vector<std::shared_ptr<Curve_GaugeTotalWeightDTO>>> curve_GetGaugesTotalWeights__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
    ) const;
    /// <summary>
    /// GetGaugesTypesWeights (historical)
    /// </summary>
    /// <remarks>
    /// Gets gauges types weights.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    pplx::task<std::vector<std::shared_ptr<Curve_GaugeTypeWeightDTO>>> curve_GetGaugesTypesWeights__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
    ) const;
    /// <summary>
    /// GetGaugesTypes (historical)
    /// </summary>
    /// <remarks>
    /// Gets gauges types.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    pplx::task<std::vector<std::shared_ptr<Curve_GaugeTypeDTO>>> curve_GetGaugesTypes__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
    ) const;
    /// <summary>
    /// GetGaugesWeightsVotes (historical)
    /// </summary>
    /// <remarks>
    /// Gets gauges weights votes.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    pplx::task<std::vector<std::shared_ptr<Curve_GaugeWeightVoteDTO>>> curve_GetGaugesWeightsVotes__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
    ) const;
    /// <summary>
    /// GetGaugesWeights (historical)
    /// </summary>
    /// <remarks>
    /// Gets gauges weights.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    pplx::task<std::vector<std::shared_ptr<Curve_GaugeWeightDTO>>> curve_GetGaugesWeights__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
    ) const;
    /// <summary>
    /// GetGaugesWithdraw (historical)
    /// </summary>
    /// <remarks>
    /// Gets gauges withdraws.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    pplx::task<std::vector<std::shared_ptr<Curve_GaugeWithdrawDTO>>> curve_GetGaugesWithdraw__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
    ) const;
    /// <summary>
    /// GetGauges (historical)
    /// </summary>
    /// <remarks>
    /// Gets gauges.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Curve_GaugeDTO>>> curve_GetGauges__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// GetHourlyVolumes (historical)
    /// </summary>
    /// <remarks>
    /// Gets hourly volumes.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Curve_HourlyVolumeDTO>>> curve_GetHourlyVolumes__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// GetLpTokens (historical)
    /// </summary>
    /// <remarks>
    /// Gets lp tokens.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Curve_LpTokenDTO>>> curve_GetLpTokens__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// GetPools (historical) 🔥
    /// </summary>
    /// <remarks>
    /// Gets pools.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Curve_PoolDTO>>> curve_GetPools__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// GetProposalsVotes (historical)
    /// </summary>
    /// <remarks>
    /// Gets proposals votes.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    pplx::task<std::vector<std::shared_ptr<Curve_ProposalVoteDTO>>> curve_GetProposalsVotes__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
    ) const;
    /// <summary>
    /// GetProposals (historical)
    /// </summary>
    /// <remarks>
    /// Gets proposals.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    pplx::task<std::vector<std::shared_ptr<Curve_ProposalDTO>>> curve_GetProposals__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
    ) const;
    /// <summary>
    /// GetRemoveLiquidityEvents (historical)
    /// </summary>
    /// <remarks>
    /// Gets remove liquidity events.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Curve_RemoveLiquidityEventDTO>>> curve_GetRemoveLiquidityEvents__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// GetRemoveLiquidityOneEvents (historical)
    /// </summary>
    /// <remarks>
    /// Gets remove liquidity one events.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Curve_RemoveLiquidityOneEventDTO>>> curve_GetRemoveLiquidityOneEvents__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// GetSystemStates (historical)
    /// </summary>
    /// <remarks>
    /// Gets system states.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    pplx::task<std::vector<std::shared_ptr<Curve_SystemStateDTO>>> curve_GetSystemStates__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
    ) const;
    /// <summary>
    /// GetTokens (historical) 🔥
    /// </summary>
    /// <remarks>
    /// Gets tokens.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="tokenId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Curve_TokenDTO>>> curve_GetTokens__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> tokenId
    ) const;
    /// <summary>
    /// GetTransferOwnershipEvents (historical)
    /// </summary>
    /// <remarks>
    /// Gets transfer ownership events.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Curve_TransferOwnershipEventDTO>>> curve_GetTransferOwnershipEvents__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// GetUnderlyingCoins (historical)
    /// </summary>
    /// <remarks>
    /// Gets underlying coins.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Curve_UnderlyingCoinDTO>>> curve_GetUnderlyingCoins__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;
    /// <summary>
    /// GetVotingApps (historical)
    /// </summary>
    /// <remarks>
    /// Gets voting apps.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    pplx::task<std::vector<std::shared_ptr<Curve_VotingAppDTO>>> curve_GetVotingApps__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate
    ) const;
    /// <summary>
    /// GetWeeklyVolumes (historical)
    /// </summary>
    /// <remarks>
    /// Gets weekly volumes.
    /// </remarks>
    /// <param name="startBlock"> (optional, default to 0L)</param>
    /// <param name="endBlock"> (optional, default to 0L)</param>
    /// <param name="startDate"> (optional, default to utility::datetime())</param>
    /// <param name="endDate"> (optional, default to utility::datetime())</param>
    /// <param name="poolId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Curve_WeeklyVolumeDTO>>> curve_GetWeeklyVolumes__historical(
        boost::optional<int64_t> startBlock,
        boost::optional<int64_t> endBlock,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<utility::string_t> poolId
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_CurveApi_H_ */

