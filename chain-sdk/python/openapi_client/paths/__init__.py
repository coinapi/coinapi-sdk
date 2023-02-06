# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from openapi_client.apis.path_to_api import path_to_api

import enum


class PathValues(str, enum.Enum):
    METADATA_CHAINS = "/metadata/chains"
    DAPPS_COW_ORDERS_HISTORICAL = "/dapps/cow/orders/historical"
    DAPPS_COW_ORDERS_CURRENT = "/dapps/cow/orders/current"
    DAPPS_COW_SETTLEMENTS_HISTORICAL = "/dapps/cow/settlements/historical"
    DAPPS_COW_SETTLEMENTS_CURRENT = "/dapps/cow/settlements/current"
    DAPPS_COW_TOKENS_HISTORICAL = "/dapps/cow/tokens/historical"
    DAPPS_COW_TOKENS_CURRENT = "/dapps/cow/tokens/current"
    DAPPS_COW_TRADES_HISTORICAL = "/dapps/cow/trades/historical"
    DAPPS_COW_TRADES_CURRENT = "/dapps/cow/trades/current"
    DAPPS_COW_USERS_HISTORICAL = "/dapps/cow/users/historical"
    DAPPS_COW_USERS_CURRENT = "/dapps/cow/users/current"
    DAPPS_CURVE_ACCOUNTS_HISTORICAL = "/dapps/curve/accounts/historical"
    DAPPS_CURVE_ACCOUNTS_CURRENT = "/dapps/curve/accounts/current"
    DAPPS_CURVE_ADD_LIQUIDITY_EVENTS_HISTORICAL = "/dapps/curve/addLiquidityEvents/historical"
    DAPPS_CURVE_ADD_LIQUIDITY_EVENTS_CURRENT = "/dapps/curve/addLiquidityEvents/current"
    DAPPS_CURVE_ADMIN_FEE_CHANGE_LOGS_HISTORICAL = "/dapps/curve/adminFeeChangeLogs/historical"
    DAPPS_CURVE_ADMIN_FEE_CHANGE_LOGS_CURRENT = "/dapps/curve/adminFeeChangeLogs/current"
    DAPPS_CURVE_AMPLIFICATION_COEFF_CHANGE_LOGS_HISTORICAL = "/dapps/curve/amplificationCoeffChangeLogs/historical"
    DAPPS_CURVE_AMPLIFICATION_COEFF_CHANGE_LOGS_CURRENT = "/dapps/curve/amplificationCoeffChangeLogs/current"
    DAPPS_CURVE_COINS_HISTORICAL = "/dapps/curve/coins/historical"
    DAPPS_CURVE_COINS_CURRENT = "/dapps/curve/coins/current"
    DAPPS_CURVE_CONTRACTS_HISTORICAL = "/dapps/curve/contracts/historical"
    DAPPS_CURVE_CONTRACTS_CURRENT = "/dapps/curve/contracts/current"
    DAPPS_CURVE_CONTRACT_VERSIONS_HISTORICAL = "/dapps/curve/contractVersions/historical"
    DAPPS_CURVE_CONTRACT_VERSIONS_CURRENT = "/dapps/curve/contractVersions/current"
    DAPPS_CURVE_DAILY_VOLUMES_HISTORICAL = "/dapps/curve/dailyVolumes/historical"
    DAPPS_CURVE_DAILY_VOLUMES_CURRENT = "/dapps/curve/dailyVolumes/current"
    DAPPS_CURVE_EXCHANGES_HISTORICAL = "/dapps/curve/exchanges/historical"
    DAPPS_CURVE_EXCHANGES_CURRENT = "/dapps/curve/exchanges/current"
    DAPPS_CURVE_FEE_CHANGE_LOGS_HISTORICAL = "/dapps/curve/feeChangeLogs/historical"
    DAPPS_CURVE_FEE_CHANGE_LOGS_CURRENT = "/dapps/curve/feeChangeLogs/current"
    DAPPS_CURVE_GAUGE_DEPOSITS_HISTORICAL = "/dapps/curve/gaugeDeposits/historical"
    DAPPS_CURVE_GAUGE_DEPOSITS_CURRENT = "/dapps/curve/gaugeDeposits/current"
    DAPPS_CURVE_GAUGES_HISTORICAL = "/dapps/curve/gauges/historical"
    DAPPS_CURVE_GAUGES_CURRENT = "/dapps/curve/gauges/current"
    DAPPS_CURVE_GAUGE_LIQUIDITIES_HISTORICAL = "/dapps/curve/gaugeLiquidities/historical"
    DAPPS_CURVE_GAUGE_LIQUIDITIES_CURRENT = "/dapps/curve/gaugeLiquidities/current"
    DAPPS_CURVE_GAUGE_TOTAL_WEIGHTS_HISTORICAL = "/dapps/curve/gaugeTotalWeights/historical"
    DAPPS_CURVE_GAUGE_TOTAL_WEIGHTS_CURRENT = "/dapps/curve/gaugeTotalWeights/current"
    DAPPS_CURVE_GAUGE_TYPES_HISTORICAL = "/dapps/curve/gaugeTypes/historical"
    DAPPS_CURVE_GAUGE_TYPES_CURRENT = "/dapps/curve/gaugeTypes/current"
    DAPPS_CURVE_GAUGE_TYPE_WEIGHTS_HISTORICAL = "/dapps/curve/gaugeTypeWeights/historical"
    DAPPS_CURVE_GAUGE_TYPE_WEIGHTS_CURRENT = "/dapps/curve/gaugeTypeWeights/current"
    DAPPS_CURVE_GAUGE_WEIGHTS_HISTORICAL = "/dapps/curve/gaugeWeights/historical"
    DAPPS_CURVE_GAUGE_WEIGHTS_CURRENT = "/dapps/curve/gaugeWeights/current"
    DAPPS_CURVE_GAUGE_WEIGHT_VOTES_HISTORICAL = "/dapps/curve/gaugeWeightVotes/historical"
    DAPPS_CURVE_GAUGE_WEIGHT_VOTES_CURRENT = "/dapps/curve/gaugeWeightVotes/current"
    DAPPS_CURVE_GAUGE_WITHDRAWS_HISTORICAL = "/dapps/curve/gaugeWithdraws/historical"
    DAPPS_CURVE_GAUGE_WITHDRAWS_CURRENT = "/dapps/curve/gaugeWithdraws/current"
    DAPPS_CURVE_HOURLY_VOLUMES_HISTORICAL = "/dapps/curve/hourlyVolumes/historical"
    DAPPS_CURVE_HOURLY_VOLUMES_CURRENT = "/dapps/curve/hourlyVolumes/current"
    DAPPS_CURVE_LP_TOKENS_HISTORICAL = "/dapps/curve/lpTokens/historical"
    DAPPS_CURVE_LP_TOKENS_CURRENT = "/dapps/curve/lpTokens/current"
    DAPPS_CURVE_POOLS_HISTORICAL = "/dapps/curve/pools/historical"
    DAPPS_CURVE_POOLS_CURRENT = "/dapps/curve/pools/current"
    DAPPS_CURVE_PROPOSALS_HISTORICAL = "/dapps/curve/proposals/historical"
    DAPPS_CURVE_PROPOSALS_CURRENT = "/dapps/curve/proposals/current"
    DAPPS_CURVE_PROPOSAL_VOTES_HISTORICAL = "/dapps/curve/proposalVotes/historical"
    DAPPS_CURVE_PROPOSAL_VOTES_CURRENT = "/dapps/curve/proposalVotes/current"
    DAPPS_CURVE_REMOVE_LIQUIDITY_EVENTS_HISTORICAL = "/dapps/curve/removeLiquidityEvents/historical"
    DAPPS_CURVE_REMOVE_LIQUIDITY_EVENTS_CURRENT = "/dapps/curve/removeLiquidityEvents/current"
    DAPPS_CURVE_REMOVE_LIQUIDITY_ONE_EVENTS_HISTORICAL = "/dapps/curve/removeLiquidityOneEvents/historical"
    DAPPS_CURVE_REMOVE_LIQUIDITY_ONE_EVENTS_CURRENT = "/dapps/curve/removeLiquidityOneEvents/current"
    DAPPS_CURVE_SYSTEM_STATES_HISTORICAL = "/dapps/curve/systemStates/historical"
    DAPPS_CURVE_SYSTEM_STATES_CURRENT = "/dapps/curve/systemStates/current"
    DAPPS_CURVE_TOKENS_HISTORICAL = "/dapps/curve/tokens/historical"
    DAPPS_CURVE_TOKENS_CURRENT = "/dapps/curve/tokens/current"
    DAPPS_CURVE_TRANSFER_OWNERSHIP_EVENTS_HISTORICAL = "/dapps/curve/transferOwnershipEvents/historical"
    DAPPS_CURVE_TRANSFER_OWNERSHIP_EVENTS_CURRENT = "/dapps/curve/transferOwnershipEvents/current"
    DAPPS_CURVE_UNDERLYING_COINS_HISTORICAL = "/dapps/curve/underlyingCoins/historical"
    DAPPS_CURVE_UNDERLYING_COINS_CURRENT = "/dapps/curve/underlyingCoins/current"
    DAPPS_CURVE_VOTING_APPS_HISTORICAL = "/dapps/curve/votingApps/historical"
    DAPPS_CURVE_VOTING_APPS_CURRENT = "/dapps/curve/votingApps/current"
    DAPPS_CURVE_WEEKLY_VOLUMES_HISTORICAL = "/dapps/curve/weeklyVolumes/historical"
    DAPPS_CURVE_WEEKLY_VOLUMES_CURRENT = "/dapps/curve/weeklyVolumes/current"
    METADATA_DAPPS = "/metadata/dapps"
    METADATA_DAPPS_DAPP_NAME = "/metadata/dapps/{dappName}"
    DAPPS_DEX_BATCHES_HISTORICAL = "/dapps/dex/batches/historical"
    DAPPS_DEX_BATCHES_CURRENT = "/dapps/dex/batches/current"
    DAPPS_DEX_DEPOSITS_HISTORICAL = "/dapps/dex/deposits/historical"
    DAPPS_DEX_DEPOSITS_CURRENT = "/dapps/dex/deposits/current"
    DAPPS_DEX_ORDERS_HISTORICAL = "/dapps/dex/orders/historical"
    DAPPS_DEX_ORDERS_CURRENT = "/dapps/dex/orders/current"
    DAPPS_DEX_PRICES_HISTORICAL = "/dapps/dex/prices/historical"
    DAPPS_DEX_PRICES_CURRENT = "/dapps/dex/prices/current"
    DAPPS_DEX_SOLUTIONS_HISTORICAL = "/dapps/dex/solutions/historical"
    DAPPS_DEX_SOLUTIONS_CURRENT = "/dapps/dex/solutions/current"
    DAPPS_DEX_STATS_HISTORICAL = "/dapps/dex/stats/historical"
    DAPPS_DEX_STATS_CURRENT = "/dapps/dex/stats/current"
    DAPPS_DEX_TOKENS_HISTORICAL = "/dapps/dex/tokens/historical"
    DAPPS_DEX_TOKENS_CURRENT = "/dapps/dex/tokens/current"
    DAPPS_DEX_TRADES_HISTORICAL = "/dapps/dex/trades/historical"
    DAPPS_DEX_TRADES_CURRENT = "/dapps/dex/trades/current"
    DAPPS_DEX_USERS_HISTORICAL = "/dapps/dex/users/historical"
    DAPPS_DEX_USERS_CURRENT = "/dapps/dex/users/current"
    DAPPS_DEX_WITHDRAWS_HISTORICAL = "/dapps/dex/withdraws/historical"
    DAPPS_DEX_WITHDRAWS_CURRENT = "/dapps/dex/withdraws/current"
    DAPPS_DEX_WITHDRAW_REQUESTS_HISTORICAL = "/dapps/dex/withdrawRequests/historical"
    DAPPS_DEX_WITHDRAW_REQUESTS_CURRENT = "/dapps/dex/withdrawRequests/current"
    DAPPS_SUSHISWAP_BUNDLES_HISTORICAL = "/dapps/sushiswap/bundles/historical"
    DAPPS_SUSHISWAP_BUNDLES_CURRENT = "/dapps/sushiswap/bundles/current"
    DAPPS_SUSHISWAP_BURNS_HISTORICAL = "/dapps/sushiswap/burns/historical"
    DAPPS_SUSHISWAP_BURNS_CURRENT = "/dapps/sushiswap/burns/current"
    DAPPS_SUSHISWAP_DAY_DATA_HISTORICAL = "/dapps/sushiswap/dayData/historical"
    DAPPS_SUSHISWAP_DAY_DATA_CURRENT = "/dapps/sushiswap/dayData/current"
    DAPPS_SUSHISWAP_FACTORIES_HISTORICAL = "/dapps/sushiswap/factories/historical"
    DAPPS_SUSHISWAP_FACTORIES_CURRENT = "/dapps/sushiswap/factories/current"
    DAPPS_SUSHISWAP_HOUR_DATA_HISTORICAL = "/dapps/sushiswap/hourData/historical"
    DAPPS_SUSHISWAP_HOUR_DATA_CURRENT = "/dapps/sushiswap/hourData/current"
    DAPPS_SUSHISWAP_LIQUIDITY_POSITIONS_HISTORICAL = "/dapps/sushiswap/liquidityPositions/historical"
    DAPPS_SUSHISWAP_LIQUIDITY_POSITIONS_CURRENT = "/dapps/sushiswap/liquidityPositions/current"
    DAPPS_SUSHISWAP_LIQUIDITY_POSITION_SNAPSHOTS_HISTORICAL = "/dapps/sushiswap/liquidityPositionSnapshots/historical"
    DAPPS_SUSHISWAP_LIQUIDITY_POSITION_SNAPSHOTS_CURRENT = "/dapps/sushiswap/liquidityPositionSnapshots/current"
    DAPPS_SUSHISWAP_MINTS_HISTORICAL = "/dapps/sushiswap/mints/historical"
    DAPPS_SUSHISWAP_MINTS_CURRENT = "/dapps/sushiswap/mints/current"
    DAPPS_SUSHISWAP_PAIR_DAY_DATA_HISTORICAL = "/dapps/sushiswap/pairDayData/historical"
    DAPPS_SUSHISWAP_PAIR_DAY_DATA_CURRENT = "/dapps/sushiswap/pairDayData/current"
    DAPPS_SUSHISWAP_PAIRS_HISTORICAL = "/dapps/sushiswap/pairs/historical"
    DAPPS_SUSHISWAP_PAIRS_CURRENT = "/dapps/sushiswap/pairs/current"
    DAPPS_SUSHISWAP_PAIR_HOUR_DATA_HISTORICAL = "/dapps/sushiswap/pairHourData/historical"
    DAPPS_SUSHISWAP_PAIR_HOUR_DATA_CURRENT = "/dapps/sushiswap/pairHourData/current"
    DAPPS_SUSHISWAP_SWAPS_HISTORICAL = "/dapps/sushiswap/swaps/historical"
    DAPPS_SUSHISWAP_SWAPS_CURRENT = "/dapps/sushiswap/swaps/current"
    DAPPS_SUSHISWAP_TOKEN_DAY_DATA_HISTORICAL = "/dapps/sushiswap/tokenDayData/historical"
    DAPPS_SUSHISWAP_TOKEN_DAY_DATA_CURRENT = "/dapps/sushiswap/tokenDayData/current"
    DAPPS_SUSHISWAP_TOKENS_HISTORICAL = "/dapps/sushiswap/tokens/historical"
    DAPPS_SUSHISWAP_TOKENS_CURRENT = "/dapps/sushiswap/tokens/current"
    DAPPS_SUSHISWAP_TRANSACTIONS_HISTORICAL = "/dapps/sushiswap/transactions/historical"
    DAPPS_SUSHISWAP_TRANSACTIONS_CURRENT = "/dapps/sushiswap/transactions/current"
    DAPPS_SUSHISWAP_USERS_HISTORICAL = "/dapps/sushiswap/users/historical"
    DAPPS_SUSHISWAP_USERS_CURRENT = "/dapps/sushiswap/users/current"
    DAPPS_UNISWAPV2_BUNDLES_HISTORICAL = "/dapps/uniswapv2/bundles/historical"
    DAPPS_UNISWAPV2_BUNDLES_CURRENT = "/dapps/uniswapv2/bundles/current"
    DAPPS_UNISWAPV2_BURNS_HISTORICAL = "/dapps/uniswapv2/burns/historical"
    DAPPS_UNISWAPV2_BURNS_CURRENT = "/dapps/uniswapv2/burns/current"
    DAPPS_UNISWAPV2_LIQUIDITY_POSITIONS_HISTORICAL = "/dapps/uniswapv2/liquidityPositions/historical"
    DAPPS_UNISWAPV2_LIQUIDITY_POSITIONS_CURRENT = "/dapps/uniswapv2/liquidityPositions/current"
    DAPPS_UNISWAPV2_LIQUIDITY_POSITION_SNAPSHOTS_HISTORICAL = "/dapps/uniswapv2/liquidityPositionSnapshots/historical"
    DAPPS_UNISWAPV2_LIQUIDITY_POSITION_SNAPSHOTS_CURRENT = "/dapps/uniswapv2/liquidityPositionSnapshots/current"
    DAPPS_UNISWAPV2_MINTS_HISTORICAL = "/dapps/uniswapv2/mints/historical"
    DAPPS_UNISWAPV2_MINTS_CURRENT = "/dapps/uniswapv2/mints/current"
    DAPPS_UNISWAPV2_PAIR_DAY_DATA_HISTORICAL = "/dapps/uniswapv2/pairDayData/historical"
    DAPPS_UNISWAPV2_PAIR_DAY_DATA_CURRENT = "/dapps/uniswapv2/pairDayData/current"
    DAPPS_UNISWAPV2_PAIRS_HISTORICAL = "/dapps/uniswapv2/pairs/historical"
    DAPPS_UNISWAPV2_PAIRS_CURRENT = "/dapps/uniswapv2/pairs/current"
    DAPPS_UNISWAPV2_PAIR_HOUR_DATA_HISTORICAL = "/dapps/uniswapv2/pairHourData/historical"
    DAPPS_UNISWAPV2_PAIR_HOUR_DATA_CURRENT = "/dapps/uniswapv2/pairHourData/current"
    DAPPS_UNISWAPV2_SWAPS_HISTORICAL = "/dapps/uniswapv2/swaps/historical"
    DAPPS_UNISWAPV2_SWAPS_CURRENT = "/dapps/uniswapv2/swaps/current"
    DAPPS_UNISWAPV2_TOKEN_DAY_DATA_HISTORICAL = "/dapps/uniswapv2/tokenDayData/historical"
    DAPPS_UNISWAPV2_TOKEN_DAY_DATA_CURRENT = "/dapps/uniswapv2/tokenDayData/current"
    DAPPS_UNISWAPV2_TOKENS_HISTORICAL = "/dapps/uniswapv2/tokens/historical"
    DAPPS_UNISWAPV2_TOKENS_CURRENT = "/dapps/uniswapv2/tokens/current"
    DAPPS_UNISWAPV2_TRANSACTIONS_HISTORICAL = "/dapps/uniswapv2/transactions/historical"
    DAPPS_UNISWAPV2_TRANSACTIONS_CURRENT = "/dapps/uniswapv2/transactions/current"
    DAPPS_UNISWAPV2_UNISWAP_DAY_DATA_HISTORICAL = "/dapps/uniswapv2/uniswapDayData/historical"
    DAPPS_UNISWAPV2_UNISWAP_DAY_DATA_CURRENT = "/dapps/uniswapv2/uniswapDayData/current"
    DAPPS_UNISWAPV2_UNISWAP_FACTORIES_HISTORICAL = "/dapps/uniswapv2/uniswapFactories/historical"
    DAPPS_UNISWAPV2_UNISWAP_FACTORIES_CURRENT = "/dapps/uniswapv2/uniswapFactories/current"
    DAPPS_UNISWAPV2_USERS_HISTORICAL = "/dapps/uniswapv2/users/historical"
    DAPPS_UNISWAPV2_USERS_CURRENT = "/dapps/uniswapv2/users/current"
    DAPPS_UNISWAPV3_BUNDLES_HISTORICAL = "/dapps/uniswapv3/bundles/historical"
    DAPPS_UNISWAPV3_BUNDLES_CURRENT = "/dapps/uniswapv3/bundles/current"
    DAPPS_UNISWAPV3_BURNS_HISTORICAL = "/dapps/uniswapv3/burns/historical"
    DAPPS_UNISWAPV3_BURNS_CURRENT = "/dapps/uniswapv3/burns/current"
    DAPPS_UNISWAPV3_FACTORIES_HISTORICAL = "/dapps/uniswapv3/factories/historical"
    DAPPS_UNISWAPV3_FACTORIES_CURRENT = "/dapps/uniswapv3/factories/current"
    DAPPS_UNISWAPV3_MINTS_HISTORICAL = "/dapps/uniswapv3/mints/historical"
    DAPPS_UNISWAPV3_MINTS_CURRENT = "/dapps/uniswapv3/mints/current"
    DAPPS_UNISWAPV3_POOL_DAY_DATA_HISTORICAL = "/dapps/uniswapv3/poolDayData/historical"
    DAPPS_UNISWAPV3_POOL_DAY_DATA_CURRENT = "/dapps/uniswapv3/poolDayData/current"
    DAPPS_UNISWAPV3_POOLS_HISTORICAL = "/dapps/uniswapv3/pools/historical"
    DAPPS_UNISWAPV3_POOLS_CURRENT = "/dapps/uniswapv3/pools/current"
    DAPPS_UNISWAPV3_POOL_HOUR_DATA_HISTORICAL = "/dapps/uniswapv3/poolHourData/historical"
    DAPPS_UNISWAPV3_POOL_HOUR_DATA_CURRENT = "/dapps/uniswapv3/poolHourData/current"
    DAPPS_UNISWAPV3_POSITIONS_HISTORICAL = "/dapps/uniswapv3/positions/historical"
    DAPPS_UNISWAPV3_POSITIONS_CURRENT = "/dapps/uniswapv3/positions/current"
    DAPPS_UNISWAPV3_POSITION_SNAPSHOTS_HISTORICAL = "/dapps/uniswapv3/positionSnapshots/historical"
    DAPPS_UNISWAPV3_POSITION_SNAPSHOTS_CURRENT = "/dapps/uniswapv3/positionSnapshots/current"
    DAPPS_UNISWAPV3_SWAPS_HISTORICAL = "/dapps/uniswapv3/swaps/historical"
    DAPPS_UNISWAPV3_SWAPS_CURRENT = "/dapps/uniswapv3/swaps/current"
    DAPPS_UNISWAPV3_TICK_DAY_DATA_HISTORICAL = "/dapps/uniswapv3/tickDayData/historical"
    DAPPS_UNISWAPV3_TICK_DAY_DATA_CURRENT = "/dapps/uniswapv3/tickDayData/current"
    DAPPS_UNISWAPV3_TICKS_HISTORICAL = "/dapps/uniswapv3/ticks/historical"
    DAPPS_UNISWAPV3_TICKS_CURRENT = "/dapps/uniswapv3/ticks/current"
    DAPPS_UNISWAPV3_TOKENS_HISTORICAL = "/dapps/uniswapv3/tokens/historical"
    DAPPS_UNISWAPV3_TOKENS_CURRENT = "/dapps/uniswapv3/tokens/current"
    DAPPS_UNISWAPV3_TOKEN_HOUR_DATA_HISTORICAL = "/dapps/uniswapv3/tokenHourData/historical"
    DAPPS_UNISWAPV3_TOKEN_HOUR_DATA_CURRENT = "/dapps/uniswapv3/tokenHourData/current"
    DAPPS_UNISWAPV3_TOKEN_V3DAY_DATA_HISTORICAL = "/dapps/uniswapv3/tokenV3DayData/historical"
    DAPPS_UNISWAPV3_TOKEN_V3DAY_DATA_CURRENT = "/dapps/uniswapv3/tokenV3DayData/current"
    DAPPS_UNISWAPV3_TRANSACTIONS_HISTORICAL = "/dapps/uniswapv3/transactions/historical"
    DAPPS_UNISWAPV3_TRANSACTIONS_CURRENT = "/dapps/uniswapv3/transactions/current"
    DAPPS_UNISWAPV3_UNISWAP_DAY_DATA_HISTORICAL = "/dapps/uniswapv3/uniswapDayData/historical"
    DAPPS_UNISWAPV3_UNISWAP_DAY_DATA_CURRENT = "/dapps/uniswapv3/uniswapDayData/current"
