# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from openapi_client.apis.path_to_api import path_to_api

import enum


class PathValues(str, enum.Enum):
    DAPPS_COW_TOKENS_HISTORICAL = "/dapps/cow/tokens/historical"
    DAPPS_COW_TRADES_HISTORICAL = "/dapps/cow/trades/historical"
    DAPPS_CURVE_ACCOUNTS_HISTORICAL = "/dapps/curve/accounts/historical"
    DAPPS_CURVE_ADD_LIQUIDITY_EVENTS_HISTORICAL = "/dapps/curve/addLiquidityEvents/historical"
    DAPPS_CURVE_ADMIN_FEE_CHANGE_LOGS_HISTORICAL = "/dapps/curve/adminFeeChangeLogs/historical"
    DAPPS_CURVE_AMPLIFICATION_COEFF_CHANGE_LOGS_HISTORICAL = "/dapps/curve/amplificationCoeffChangeLogs/historical"
    DAPPS_DEX_BATCHES_HISTORICAL = "/dapps/dex/batches/historical"
    DAPPS_UNISWAPV3_BUNDLES_HISTORICAL = "/dapps/uniswapv3/bundles/historical"
    DAPPS_UNISWAPV2_BUNDLES_HISTORICAL = "/dapps/uniswapv2/bundles/historical"
    DAPPS_SUSHISWAP_BUNDLES_HISTORICAL = "/dapps/sushiswap/bundles/historical"
    DAPPS_UNISWAPV3_BUNDLES_CURRENT = "/dapps/uniswapv3/bundles/current"
    DAPPS_UNISWAPV3_BURNS_HISTORICAL = "/dapps/uniswapv3/burns/historical"
    DAPPS_UNISWAPV2_BURNS_HISTORICAL = "/dapps/uniswapv2/burns/historical"
    DAPPS_SUSHISWAP_BURNS_HISTORICAL = "/dapps/sushiswap/burns/historical"
    DAPPS_UNISWAPV3_BURNS_CURRENT = "/dapps/uniswapv3/burns/current"
    DAPPS_CURVE_COINS_HISTORICAL = "/dapps/curve/coins/historical"
    DAPPS_CURVE_CONTRACTS_HISTORICAL = "/dapps/curve/contracts/historical"
    DAPPS_CURVE_CONTRACTS_VERSIONS_HISTORICAL = "/dapps/curve/contractsVersions/historical"
    DAPPS_CURVE_DAILY_VOLUMES_HISTORICAL = "/dapps/curve/dailyVolumes/historical"
    DAPPS_SUSHISWAP_DAY_DATA_HISTORICAL = "/dapps/sushiswap/dayData/historical"
    DAPPS_DEX_DEPOSITS_HISTORICAL = "/dapps/dex/deposits/historical"
    DAPPS_CURVE_EXCHANGES_HISTORICAL = "/dapps/curve/exchanges/historical"
    DAPPS_SUSHISWAP_EXCHANGES_CURRENT = "/dapps/sushiswap/exchanges/current"
    DAPPS_UNISWAPV3_FACTORY_HISTORICAL = "/dapps/uniswapv3/factory/historical"
    DAPPS_UNISWAPV2_FACTORY_HISTORICAL = "/dapps/uniswapv2/factory/historical"
    DAPPS_SUSHISWAP_FACTORY_HISTORICAL = "/dapps/sushiswap/factory/historical"
    DAPPS_UNISWAPV3_FACTORY_CURRENT = "/dapps/uniswapv3/factory/current"
    DAPPS_CURVE_FEE_CHANGE_LOGS_HISTORICAL = "/dapps/curve/feeChangeLogs/historical"
    DAPPS_CURVE_GAUGES_HISTORICAL = "/dapps/curve/gauges/historical"
    DAPPS_CURVE_GAUGES_DEPOSITS_HISTORICAL = "/dapps/curve/gaugesDeposits/historical"
    DAPPS_CURVE_GAUGES_LIQUIDITY_HISTORICAL = "/dapps/curve/gaugesLiquidity/historical"
    DAPPS_CURVE_GAUGES_TOTAL_WEIGHTS_HISTORICAL = "/dapps/curve/gaugesTotalWeights/historical"
    DAPPS_CURVE_GAUGES_TYPES_HISTORICAL = "/dapps/curve/gaugesTypes/historical"
    DAPPS_CURVE_GAUGES_TYPES_WEIGHTS_HISTORICAL = "/dapps/curve/gaugesTypesWeights/historical"
    DAPPS_CURVE_GAUGES_WEIGHTS_HISTORICAL = "/dapps/curve/gaugesWeights/historical"
    DAPPS_CURVE_GAUGES_WEIGHTS_VOTES_HISTORICAL = "/dapps/curve/gaugesWeightsVotes/historical"
    DAPPS_CURVE_GAUGES_WITHDRAWS_HISTORICAL = "/dapps/curve/gaugesWithdraws/historical"
    DAPPS_SUSHISWAP_HOUR_DATA_HISTORICAL = "/dapps/sushiswap/hourData/historical"
    DAPPS_CURVE_HOURLY_VOLUMES_HISTORICAL = "/dapps/curve/hourlyVolumes/historical"
    DAPPS_SUSHISWAP_LIQUIDITY_POSITION_HISTORICAL = "/dapps/sushiswap/liquidityPosition/historical"
    DAPPS_UNISWAPV2_LIQUIDITY_POSITIONS_HISTORICAL = "/dapps/uniswapv2/liquidityPositions/historical"
    DAPPS_SUSHISWAP_LIQUIDITY_POSITION_SNAPSHOTS_HISTORICAL = "/dapps/sushiswap/liquidityPositionSnapshots/historical"
    DAPPS_UNISWAPV2_LIQUIDITY_POSITIONS_SNAPSHOTS_HISTORICAL = "/dapps/uniswapv2/liquidityPositionsSnapshots/historical"
    DAPPS_CURVE_LP_TOKENS_HISTORICAL = "/dapps/curve/lpTokens/historical"
    DAPPS_UNISWAPV3_MINTS_HISTORICAL = "/dapps/uniswapv3/mints/historical"
    DAPPS_UNISWAPV2_MINTS_HISTORICAL = "/dapps/uniswapv2/mints/historical"
    DAPPS_SUSHISWAP_MINTS_HISTORICAL = "/dapps/sushiswap/mints/historical"
    DAPPS_UNISWAPV3_MINTS_CURRENT = "/dapps/uniswapv3/mints/current"
    DAPPS_DEX_ORDERS_HISTORICAL = "/dapps/dex/orders/historical"
    DAPPS_COW_ORDERS_HISTORICAL = "/dapps/cow/orders/historical"
    DAPPS_UNISWAPV3_POOLS_HISTORICAL = "/dapps/uniswapv3/pools/historical"
    DAPPS_UNISWAPV2_POOLS_HISTORICAL = "/dapps/uniswapv2/pools/historical"
    DAPPS_SUSHISWAP_POOLS_HISTORICAL = "/dapps/sushiswap/pools/historical"
    DAPPS_CURVE_POOLS_HISTORICAL = "/dapps/curve/pools/historical"
    DAPPS_UNISWAPV3_POOLS_CURRENT = "/dapps/uniswapv3/pools/current"
    DAPPS_UNISWAPV2_POOLS_CURRENT = "/dapps/uniswapv2/pools/current"
    DAPPS_SUSHISWAP_POOLS_CURRENT = "/dapps/sushiswap/pools/current"
    DAPPS_UNISWAPV3_POOLS_DAY_DATA_HISTORICAL = "/dapps/uniswapv3/poolsDayData/historical"
    DAPPS_UNISWAPV2_POOLS_DAY_DATA_HISTORICAL = "/dapps/uniswapv2/poolsDayData/historical"
    DAPPS_SUSHISWAP_POOLS_DAY_DATA_HISTORICAL = "/dapps/sushiswap/poolsDayData/historical"
    DAPPS_UNISWAPV3_POOLS_DAY_DATA_CURRENT = "/dapps/uniswapv3/poolsDayData/current"
    DAPPS_UNISWAPV3_POOLS_HOUR_DATA_HISTORICAL = "/dapps/uniswapv3/poolsHourData/historical"
    DAPPS_UNISWAPV2_POOLS_HOUR_DATA_HISTORICAL = "/dapps/uniswapv2/poolsHourData/historical"
    DAPPS_SUSHISWAP_POOLS_HOUR_DATA_HISTORICAL = "/dapps/sushiswap/poolsHourData/historical"
    DAPPS_UNISWAPV3_POOLS_HOUR_DATA_CURRENT = "/dapps/uniswapv3/poolsHourData/current"
    DAPPS_UNISWAPV3_POSITIONS_HISTORICAL = "/dapps/uniswapv3/positions/historical"
    DAPPS_UNISWAPV3_POSITIONS_CURRENT = "/dapps/uniswapv3/positions/current"
    DAPPS_UNISWAPV3_POSITION_SNAPSHOTS_CURRENT = "/dapps/uniswapv3/positionSnapshots/current"
    DAPPS_UNISWAPV3_POSITIONS_SNAPSHOTS_HISTORICAL = "/dapps/uniswapv3/positionsSnapshots/historical"
    DAPPS_DEX_PRICES_HISTORICAL = "/dapps/dex/prices/historical"
    DAPPS_CURVE_PROPOSALS_HISTORICAL = "/dapps/curve/proposals/historical"
    DAPPS_CURVE_PROPOSALS_VOTES_HISTORICAL = "/dapps/curve/proposalsVotes/historical"
    DAPPS_CURVE_REMOVE_LIQUIDITY_EVENTS_HISTORICAL = "/dapps/curve/removeLiquidityEvents/historical"
    DAPPS_CURVE_REMOVE_LIQUIDITY_ONE_EVENTS_HISTORICAL = "/dapps/curve/removeLiquidityOneEvents/historical"
    DAPPS_COW_SETTLEMENTS_HISTORICAL = "/dapps/cow/settlements/historical"
    DAPPS_DEX_SOLUTIONS_HISTORICAL = "/dapps/dex/solutions/historical"
    DAPPS_DEX_STATS_HISTORICAL = "/dapps/dex/stats/historical"
    DAPPS_UNISWAPV3_SWAPS_HISTORICAL = "/dapps/uniswapv3/swaps/historical"
    DAPPS_UNISWAPV2_SWAPS_HISTORICAL = "/dapps/uniswapv2/swaps/historical"
    DAPPS_SUSHISWAP_SWAPS_HISTORICAL = "/dapps/sushiswap/swaps/historical"
    DAPPS_UNISWAPV3_SWAPS_CURRENT = "/dapps/uniswapv3/swaps/current"
    DAPPS_UNISWAPV2_SWAPS_CURRENT = "/dapps/uniswapv2/swaps/current"
    DAPPS_SUSHISWAP_SWAPS_CURRENT = "/dapps/sushiswap/swaps/current"
    DAPPS_CURVE_SYSTEM_STATES_HISTORICAL = "/dapps/curve/systemStates/historical"
    DAPPS_UNISWAPV3_TICKS_HISTORICAL = "/dapps/uniswapv3/ticks/historical"
    DAPPS_UNISWAPV3_TICKS_CURRENT = "/dapps/uniswapv3/ticks/current"
    DAPPS_UNISWAPV3_TICKS_DAY_DATA_HISTORICAL = "/dapps/uniswapv3/ticksDayData/historical"
    DAPPS_UNISWAPV3_TICKS_DAY_DATA_CURRENT = "/dapps/uniswapv3/ticksDayData/current"
    DAPPS_UNISWAPV3_TOKENS_HISTORICAL = "/dapps/uniswapv3/tokens/historical"
    DAPPS_UNISWAPV2_TOKENS_HISTORICAL = "/dapps/uniswapv2/tokens/historical"
    DAPPS_SUSHISWAP_TOKENS_HISTORICAL = "/dapps/sushiswap/tokens/historical"
    DAPPS_DEX_TOKENS_HISTORICAL = "/dapps/dex/tokens/historical"
    DAPPS_CURVE_TOKENS_HISTORICAL = "/dapps/curve/tokens/historical"
    DAPPS_UNISWAPV3_TOKENS_CURRENT = "/dapps/uniswapv3/tokens/current"
    DAPPS_UNISWAPV2_TOKENS_CURRENT = "/dapps/uniswapv2/tokens/current"
    DAPPS_SUSHISWAP_TOKENS_CURRENT = "/dapps/sushiswap/tokens/current"
    DAPPS_UNISWAPV3_TOKENS_DAY_DATA_HISTORICAL = "/dapps/uniswapv3/tokensDayData/historical"
    DAPPS_UNISWAPV2_TOKENS_DAY_DATA_HISTORICAL = "/dapps/uniswapv2/tokensDayData/historical"
    DAPPS_SUSHISWAP_TOKENS_DAY_DATA_HISTORICAL = "/dapps/sushiswap/tokensDayData/historical"
    DAPPS_UNISWAPV3_TOKENS_DAY_DATA_CURRENT = "/dapps/uniswapv3/tokensDayData/current"
    DAPPS_UNISWAPV3_TOKENS_HOUR_DATA_HISTORICAL = "/dapps/uniswapv3/tokensHourData/historical"
    DAPPS_UNISWAPV3_TOKENS_HOUR_DATA_CURRENT = "/dapps/uniswapv3/tokensHourData/current"
    DAPPS_DEX_TRADES_HISTORICAL = "/dapps/dex/trades/historical"
    DAPPS_SUSHISWAP_TRADES_CURRENT = "/dapps/sushiswap/trades/current"
    DAPPS_UNISWAPV3_TRANSACTIONS_HISTORICAL = "/dapps/uniswapv3/transactions/historical"
    DAPPS_UNISWAPV2_TRANSACTIONS_HISTORICAL = "/dapps/uniswapv2/transactions/historical"
    DAPPS_SUSHISWAP_TRANSACTIONS_HISTORICAL = "/dapps/sushiswap/transactions/historical"
    DAPPS_CURVE_TRANSFER_OWNERSHIP_EVENTS_HISTORICAL = "/dapps/curve/transferOwnershipEvents/historical"
    DAPPS_CURVE_UNDERLYING_COINS_HISTORICAL = "/dapps/curve/underlyingCoins/historical"
    DAPPS_UNISWAPV3_DAY_DATA_HISTORICAL = "/dapps/uniswapv3/dayData/historical"
    DAPPS_UNISWAPV2_DAY_DATA_HISTORICAL = "/dapps/uniswapv2/dayData/historical"
    DAPPS_UNISWAPV3_DAY_DATA_CURRENT = "/dapps/uniswapv3/dayData/current"
    DAPPS_UNISWAPV2_USERS_HISTORICAL = "/dapps/uniswapv2/users/historical"
    DAPPS_SUSHISWAP_USERS_HISTORICAL = "/dapps/sushiswap/users/historical"
    DAPPS_DEX_USERS_HISTORICAL = "/dapps/dex/users/historical"
    DAPPS_COW_USERS_HISTORICAL = "/dapps/cow/users/historical"
    DAPPS_CURVE_VOTING_APPS_HISTORICAL = "/dapps/curve/votingApps/historical"
    DAPPS_CURVE_WEEKLY_VOLUMES_HISTORICAL = "/dapps/curve/weeklyVolumes/historical"
    DAPPS_DEX_WITHDRAWS_HISTORICAL = "/dapps/dex/withdraws/historical"
    DAPPS_DEX_WITHDRAWS_REQUESTS_HISTORICAL = "/dapps/dex/withdrawsRequests/historical"
