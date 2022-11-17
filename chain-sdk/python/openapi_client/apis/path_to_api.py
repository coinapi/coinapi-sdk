import typing_extensions

from openapi_client.paths import PathValues
from openapi_client.apis.paths.dapps_cow_orders_historical import DappsCowOrdersHistorical
from openapi_client.apis.paths.dapps_cow_orders_current import DappsCowOrdersCurrent
from openapi_client.apis.paths.dapps_cow_settlements_historical import DappsCowSettlementsHistorical
from openapi_client.apis.paths.dapps_cow_settlements_current import DappsCowSettlementsCurrent
from openapi_client.apis.paths.dapps_cow_tokens_historical import DappsCowTokensHistorical
from openapi_client.apis.paths.dapps_cow_tokens_current import DappsCowTokensCurrent
from openapi_client.apis.paths.dapps_cow_trades_historical import DappsCowTradesHistorical
from openapi_client.apis.paths.dapps_cow_trades_current import DappsCowTradesCurrent
from openapi_client.apis.paths.dapps_cow_users_historical import DappsCowUsersHistorical
from openapi_client.apis.paths.dapps_cow_users_current import DappsCowUsersCurrent
from openapi_client.apis.paths.dapps_curve_accounts_historical import DappsCurveAccountsHistorical
from openapi_client.apis.paths.dapps_curve_accounts_current import DappsCurveAccountsCurrent
from openapi_client.apis.paths.dapps_curve_add_liquidity_events_historical import DappsCurveAddLiquidityEventsHistorical
from openapi_client.apis.paths.dapps_curve_add_liquidity_events_current import DappsCurveAddLiquidityEventsCurrent
from openapi_client.apis.paths.dapps_curve_admin_fee_change_logs_historical import DappsCurveAdminFeeChangeLogsHistorical
from openapi_client.apis.paths.dapps_curve_admin_fee_change_logs_current import DappsCurveAdminFeeChangeLogsCurrent
from openapi_client.apis.paths.dapps_curve_amplification_coeff_change_logs_historical import DappsCurveAmplificationCoeffChangeLogsHistorical
from openapi_client.apis.paths.dapps_curve_amplification_coeff_change_logs_current import DappsCurveAmplificationCoeffChangeLogsCurrent
from openapi_client.apis.paths.dapps_curve_coins_historical import DappsCurveCoinsHistorical
from openapi_client.apis.paths.dapps_curve_coins_current import DappsCurveCoinsCurrent
from openapi_client.apis.paths.dapps_curve_contracts_historical import DappsCurveContractsHistorical
from openapi_client.apis.paths.dapps_curve_contracts_current import DappsCurveContractsCurrent
from openapi_client.apis.paths.dapps_curve_contract_versions_historical import DappsCurveContractVersionsHistorical
from openapi_client.apis.paths.dapps_curve_contract_versions_current import DappsCurveContractVersionsCurrent
from openapi_client.apis.paths.dapps_curve_daily_volumes_historical import DappsCurveDailyVolumesHistorical
from openapi_client.apis.paths.dapps_curve_daily_volumes_current import DappsCurveDailyVolumesCurrent
from openapi_client.apis.paths.dapps_curve_exchanges_historical import DappsCurveExchangesHistorical
from openapi_client.apis.paths.dapps_curve_exchanges_current import DappsCurveExchangesCurrent
from openapi_client.apis.paths.dapps_curve_fee_change_logs_historical import DappsCurveFeeChangeLogsHistorical
from openapi_client.apis.paths.dapps_curve_fee_change_logs_current import DappsCurveFeeChangeLogsCurrent
from openapi_client.apis.paths.dapps_curve_gauge_deposits_historical import DappsCurveGaugeDepositsHistorical
from openapi_client.apis.paths.dapps_curve_gauge_deposits_current import DappsCurveGaugeDepositsCurrent
from openapi_client.apis.paths.dapps_curve_gauges_historical import DappsCurveGaugesHistorical
from openapi_client.apis.paths.dapps_curve_gauges_current import DappsCurveGaugesCurrent
from openapi_client.apis.paths.dapps_curve_gauge_liquiditys_historical import DappsCurveGaugeLiquiditysHistorical
from openapi_client.apis.paths.dapps_curve_gauge_liquiditys_current import DappsCurveGaugeLiquiditysCurrent
from openapi_client.apis.paths.dapps_curve_gauge_total_weights_historical import DappsCurveGaugeTotalWeightsHistorical
from openapi_client.apis.paths.dapps_curve_gauge_total_weights_current import DappsCurveGaugeTotalWeightsCurrent
from openapi_client.apis.paths.dapps_curve_gauge_types_historical import DappsCurveGaugeTypesHistorical
from openapi_client.apis.paths.dapps_curve_gauge_types_current import DappsCurveGaugeTypesCurrent
from openapi_client.apis.paths.dapps_curve_gauge_type_weights_historical import DappsCurveGaugeTypeWeightsHistorical
from openapi_client.apis.paths.dapps_curve_gauge_type_weights_current import DappsCurveGaugeTypeWeightsCurrent
from openapi_client.apis.paths.dapps_curve_gauge_weights_historical import DappsCurveGaugeWeightsHistorical
from openapi_client.apis.paths.dapps_curve_gauge_weights_current import DappsCurveGaugeWeightsCurrent
from openapi_client.apis.paths.dapps_curve_gauge_weight_votes_historical import DappsCurveGaugeWeightVotesHistorical
from openapi_client.apis.paths.dapps_curve_gauge_weight_votes_current import DappsCurveGaugeWeightVotesCurrent
from openapi_client.apis.paths.dapps_curve_gauge_withdraws_historical import DappsCurveGaugeWithdrawsHistorical
from openapi_client.apis.paths.dapps_curve_gauge_withdraws_current import DappsCurveGaugeWithdrawsCurrent
from openapi_client.apis.paths.dapps_curve_hourly_volumes_historical import DappsCurveHourlyVolumesHistorical
from openapi_client.apis.paths.dapps_curve_hourly_volumes_current import DappsCurveHourlyVolumesCurrent
from openapi_client.apis.paths.dapps_curve_lp_tokens_historical import DappsCurveLpTokensHistorical
from openapi_client.apis.paths.dapps_curve_lp_tokens_current import DappsCurveLpTokensCurrent
from openapi_client.apis.paths.dapps_curve_pools_historical import DappsCurvePoolsHistorical
from openapi_client.apis.paths.dapps_curve_pools_current import DappsCurvePoolsCurrent
from openapi_client.apis.paths.dapps_curve_proposals_historical import DappsCurveProposalsHistorical
from openapi_client.apis.paths.dapps_curve_proposals_current import DappsCurveProposalsCurrent
from openapi_client.apis.paths.dapps_curve_proposal_votes_historical import DappsCurveProposalVotesHistorical
from openapi_client.apis.paths.dapps_curve_proposal_votes_current import DappsCurveProposalVotesCurrent
from openapi_client.apis.paths.dapps_curve_remove_liquidity_events_historical import DappsCurveRemoveLiquidityEventsHistorical
from openapi_client.apis.paths.dapps_curve_remove_liquidity_events_current import DappsCurveRemoveLiquidityEventsCurrent
from openapi_client.apis.paths.dapps_curve_remove_liquidity_one_events_historical import DappsCurveRemoveLiquidityOneEventsHistorical
from openapi_client.apis.paths.dapps_curve_remove_liquidity_one_events_current import DappsCurveRemoveLiquidityOneEventsCurrent
from openapi_client.apis.paths.dapps_curve_system_states_historical import DappsCurveSystemStatesHistorical
from openapi_client.apis.paths.dapps_curve_system_states_current import DappsCurveSystemStatesCurrent
from openapi_client.apis.paths.dapps_curve_tokens_historical import DappsCurveTokensHistorical
from openapi_client.apis.paths.dapps_curve_tokens_current import DappsCurveTokensCurrent
from openapi_client.apis.paths.dapps_curve_transfer_ownership_events_historical import DappsCurveTransferOwnershipEventsHistorical
from openapi_client.apis.paths.dapps_curve_transfer_ownership_events_current import DappsCurveTransferOwnershipEventsCurrent
from openapi_client.apis.paths.dapps_curve_underlying_coins_historical import DappsCurveUnderlyingCoinsHistorical
from openapi_client.apis.paths.dapps_curve_underlying_coins_current import DappsCurveUnderlyingCoinsCurrent
from openapi_client.apis.paths.dapps_curve_voting_apps_historical import DappsCurveVotingAppsHistorical
from openapi_client.apis.paths.dapps_curve_voting_apps_current import DappsCurveVotingAppsCurrent
from openapi_client.apis.paths.dapps_curve_weekly_volumes_historical import DappsCurveWeeklyVolumesHistorical
from openapi_client.apis.paths.dapps_curve_weekly_volumes_current import DappsCurveWeeklyVolumesCurrent
from openapi_client.apis.paths.dapps_dex_batchs_historical import DappsDexBatchsHistorical
from openapi_client.apis.paths.dapps_dex_batchs_current import DappsDexBatchsCurrent
from openapi_client.apis.paths.dapps_dex_deposits_historical import DappsDexDepositsHistorical
from openapi_client.apis.paths.dapps_dex_deposits_current import DappsDexDepositsCurrent
from openapi_client.apis.paths.dapps_dex_orders_historical import DappsDexOrdersHistorical
from openapi_client.apis.paths.dapps_dex_orders_current import DappsDexOrdersCurrent
from openapi_client.apis.paths.dapps_dex_prices_historical import DappsDexPricesHistorical
from openapi_client.apis.paths.dapps_dex_prices_current import DappsDexPricesCurrent
from openapi_client.apis.paths.dapps_dex_solutions_historical import DappsDexSolutionsHistorical
from openapi_client.apis.paths.dapps_dex_solutions_current import DappsDexSolutionsCurrent
from openapi_client.apis.paths.dapps_dex_statss_historical import DappsDexStatssHistorical
from openapi_client.apis.paths.dapps_dex_statss_current import DappsDexStatssCurrent
from openapi_client.apis.paths.dapps_dex_tokens_historical import DappsDexTokensHistorical
from openapi_client.apis.paths.dapps_dex_tokens_current import DappsDexTokensCurrent
from openapi_client.apis.paths.dapps_dex_trades_historical import DappsDexTradesHistorical
from openapi_client.apis.paths.dapps_dex_trades_current import DappsDexTradesCurrent
from openapi_client.apis.paths.dapps_dex_users_historical import DappsDexUsersHistorical
from openapi_client.apis.paths.dapps_dex_users_current import DappsDexUsersCurrent
from openapi_client.apis.paths.dapps_dex_withdraws_historical import DappsDexWithdrawsHistorical
from openapi_client.apis.paths.dapps_dex_withdraws_current import DappsDexWithdrawsCurrent
from openapi_client.apis.paths.dapps_dex_withdraw_requests_historical import DappsDexWithdrawRequestsHistorical
from openapi_client.apis.paths.dapps_dex_withdraw_requests_current import DappsDexWithdrawRequestsCurrent
from openapi_client.apis.paths.dapps_sushiswap_bundles_historical import DappsSushiswapBundlesHistorical
from openapi_client.apis.paths.dapps_sushiswap_bundles_current import DappsSushiswapBundlesCurrent
from openapi_client.apis.paths.dapps_sushiswap_burns_historical import DappsSushiswapBurnsHistorical
from openapi_client.apis.paths.dapps_sushiswap_burns_current import DappsSushiswapBurnsCurrent
from openapi_client.apis.paths.dapps_sushiswap_day_datas_historical import DappsSushiswapDayDatasHistorical
from openapi_client.apis.paths.dapps_sushiswap_day_datas_current import DappsSushiswapDayDatasCurrent
from openapi_client.apis.paths.dapps_sushiswap_factorys_historical import DappsSushiswapFactorysHistorical
from openapi_client.apis.paths.dapps_sushiswap_factorys_current import DappsSushiswapFactorysCurrent
from openapi_client.apis.paths.dapps_sushiswap_hour_datas_historical import DappsSushiswapHourDatasHistorical
from openapi_client.apis.paths.dapps_sushiswap_hour_datas_current import DappsSushiswapHourDatasCurrent
from openapi_client.apis.paths.dapps_sushiswap_liquidity_positions_historical import DappsSushiswapLiquidityPositionsHistorical
from openapi_client.apis.paths.dapps_sushiswap_liquidity_positions_current import DappsSushiswapLiquidityPositionsCurrent
from openapi_client.apis.paths.dapps_sushiswap_liquidity_position_snapshots_historical import DappsSushiswapLiquidityPositionSnapshotsHistorical
from openapi_client.apis.paths.dapps_sushiswap_liquidity_position_snapshots_current import DappsSushiswapLiquidityPositionSnapshotsCurrent
from openapi_client.apis.paths.dapps_sushiswap_mints_historical import DappsSushiswapMintsHistorical
from openapi_client.apis.paths.dapps_sushiswap_mints_current import DappsSushiswapMintsCurrent
from openapi_client.apis.paths.dapps_sushiswap_pair_day_datas_historical import DappsSushiswapPairDayDatasHistorical
from openapi_client.apis.paths.dapps_sushiswap_pair_day_datas_current import DappsSushiswapPairDayDatasCurrent
from openapi_client.apis.paths.dapps_sushiswap_pairs_historical import DappsSushiswapPairsHistorical
from openapi_client.apis.paths.dapps_sushiswap_pairs_current import DappsSushiswapPairsCurrent
from openapi_client.apis.paths.dapps_sushiswap_pair_hour_datas_historical import DappsSushiswapPairHourDatasHistorical
from openapi_client.apis.paths.dapps_sushiswap_pair_hour_datas_current import DappsSushiswapPairHourDatasCurrent
from openapi_client.apis.paths.dapps_sushiswap_swaps_historical import DappsSushiswapSwapsHistorical
from openapi_client.apis.paths.dapps_sushiswap_swaps_current import DappsSushiswapSwapsCurrent
from openapi_client.apis.paths.dapps_sushiswap_token_day_datas_historical import DappsSushiswapTokenDayDatasHistorical
from openapi_client.apis.paths.dapps_sushiswap_token_day_datas_current import DappsSushiswapTokenDayDatasCurrent
from openapi_client.apis.paths.dapps_sushiswap_tokens_historical import DappsSushiswapTokensHistorical
from openapi_client.apis.paths.dapps_sushiswap_tokens_current import DappsSushiswapTokensCurrent
from openapi_client.apis.paths.dapps_sushiswap_transactions_historical import DappsSushiswapTransactionsHistorical
from openapi_client.apis.paths.dapps_sushiswap_transactions_current import DappsSushiswapTransactionsCurrent
from openapi_client.apis.paths.dapps_sushiswap_users_historical import DappsSushiswapUsersHistorical
from openapi_client.apis.paths.dapps_sushiswap_users_current import DappsSushiswapUsersCurrent
from openapi_client.apis.paths.dapps_uniswapv2_bundles_historical import DappsUniswapv2BundlesHistorical
from openapi_client.apis.paths.dapps_uniswapv2_bundles_current import DappsUniswapv2BundlesCurrent
from openapi_client.apis.paths.dapps_uniswapv2_burns_historical import DappsUniswapv2BurnsHistorical
from openapi_client.apis.paths.dapps_uniswapv2_burns_current import DappsUniswapv2BurnsCurrent
from openapi_client.apis.paths.dapps_uniswapv2_liquidity_positions_historical import DappsUniswapv2LiquidityPositionsHistorical
from openapi_client.apis.paths.dapps_uniswapv2_liquidity_positions_current import DappsUniswapv2LiquidityPositionsCurrent
from openapi_client.apis.paths.dapps_uniswapv2_liquidity_position_snapshots_historical import DappsUniswapv2LiquidityPositionSnapshotsHistorical
from openapi_client.apis.paths.dapps_uniswapv2_liquidity_position_snapshots_current import DappsUniswapv2LiquidityPositionSnapshotsCurrent
from openapi_client.apis.paths.dapps_uniswapv2_mints_historical import DappsUniswapv2MintsHistorical
from openapi_client.apis.paths.dapps_uniswapv2_mints_current import DappsUniswapv2MintsCurrent
from openapi_client.apis.paths.dapps_uniswapv2_pair_day_datas_historical import DappsUniswapv2PairDayDatasHistorical
from openapi_client.apis.paths.dapps_uniswapv2_pair_day_datas_current import DappsUniswapv2PairDayDatasCurrent
from openapi_client.apis.paths.dapps_uniswapv2_pairs_historical import DappsUniswapv2PairsHistorical
from openapi_client.apis.paths.dapps_uniswapv2_pairs_current import DappsUniswapv2PairsCurrent
from openapi_client.apis.paths.dapps_uniswapv2_pair_hour_datas_historical import DappsUniswapv2PairHourDatasHistorical
from openapi_client.apis.paths.dapps_uniswapv2_pair_hour_datas_current import DappsUniswapv2PairHourDatasCurrent
from openapi_client.apis.paths.dapps_uniswapv2_swaps_historical import DappsUniswapv2SwapsHistorical
from openapi_client.apis.paths.dapps_uniswapv2_swaps_current import DappsUniswapv2SwapsCurrent
from openapi_client.apis.paths.dapps_uniswapv2_token_day_datas_historical import DappsUniswapv2TokenDayDatasHistorical
from openapi_client.apis.paths.dapps_uniswapv2_token_day_datas_current import DappsUniswapv2TokenDayDatasCurrent
from openapi_client.apis.paths.dapps_uniswapv2_tokens_historical import DappsUniswapv2TokensHistorical
from openapi_client.apis.paths.dapps_uniswapv2_tokens_current import DappsUniswapv2TokensCurrent
from openapi_client.apis.paths.dapps_uniswapv2_transactions_historical import DappsUniswapv2TransactionsHistorical
from openapi_client.apis.paths.dapps_uniswapv2_transactions_current import DappsUniswapv2TransactionsCurrent
from openapi_client.apis.paths.dapps_uniswapv2_uniswap_day_datas_historical import DappsUniswapv2UniswapDayDatasHistorical
from openapi_client.apis.paths.dapps_uniswapv2_uniswap_day_datas_current import DappsUniswapv2UniswapDayDatasCurrent
from openapi_client.apis.paths.dapps_uniswapv2_uniswap_factorys_historical import DappsUniswapv2UniswapFactorysHistorical
from openapi_client.apis.paths.dapps_uniswapv2_uniswap_factorys_current import DappsUniswapv2UniswapFactorysCurrent
from openapi_client.apis.paths.dapps_uniswapv2_users_historical import DappsUniswapv2UsersHistorical
from openapi_client.apis.paths.dapps_uniswapv2_users_current import DappsUniswapv2UsersCurrent
from openapi_client.apis.paths.dapps_uniswapv3_bundles_historical import DappsUniswapv3BundlesHistorical
from openapi_client.apis.paths.dapps_uniswapv3_bundles_current import DappsUniswapv3BundlesCurrent
from openapi_client.apis.paths.dapps_uniswapv3_burns_historical import DappsUniswapv3BurnsHistorical
from openapi_client.apis.paths.dapps_uniswapv3_burns_current import DappsUniswapv3BurnsCurrent
from openapi_client.apis.paths.dapps_uniswapv3_factorys_historical import DappsUniswapv3FactorysHistorical
from openapi_client.apis.paths.dapps_uniswapv3_factorys_current import DappsUniswapv3FactorysCurrent
from openapi_client.apis.paths.dapps_uniswapv3_mints_historical import DappsUniswapv3MintsHistorical
from openapi_client.apis.paths.dapps_uniswapv3_mints_current import DappsUniswapv3MintsCurrent
from openapi_client.apis.paths.dapps_uniswapv3_pool_day_datas_historical import DappsUniswapv3PoolDayDatasHistorical
from openapi_client.apis.paths.dapps_uniswapv3_pool_day_datas_current import DappsUniswapv3PoolDayDatasCurrent
from openapi_client.apis.paths.dapps_uniswapv3_pools_historical import DappsUniswapv3PoolsHistorical
from openapi_client.apis.paths.dapps_uniswapv3_pools_current import DappsUniswapv3PoolsCurrent
from openapi_client.apis.paths.dapps_uniswapv3_pool_hour_datas_historical import DappsUniswapv3PoolHourDatasHistorical
from openapi_client.apis.paths.dapps_uniswapv3_pool_hour_datas_current import DappsUniswapv3PoolHourDatasCurrent
from openapi_client.apis.paths.dapps_uniswapv3_positions_historical import DappsUniswapv3PositionsHistorical
from openapi_client.apis.paths.dapps_uniswapv3_positions_current import DappsUniswapv3PositionsCurrent
from openapi_client.apis.paths.dapps_uniswapv3_position_snapshots_historical import DappsUniswapv3PositionSnapshotsHistorical
from openapi_client.apis.paths.dapps_uniswapv3_position_snapshots_current import DappsUniswapv3PositionSnapshotsCurrent
from openapi_client.apis.paths.dapps_uniswapv3_swaps_historical import DappsUniswapv3SwapsHistorical
from openapi_client.apis.paths.dapps_uniswapv3_swaps_current import DappsUniswapv3SwapsCurrent
from openapi_client.apis.paths.dapps_uniswapv3_tick_day_datas_historical import DappsUniswapv3TickDayDatasHistorical
from openapi_client.apis.paths.dapps_uniswapv3_tick_day_datas_current import DappsUniswapv3TickDayDatasCurrent
from openapi_client.apis.paths.dapps_uniswapv3_ticks_historical import DappsUniswapv3TicksHistorical
from openapi_client.apis.paths.dapps_uniswapv3_ticks_current import DappsUniswapv3TicksCurrent
from openapi_client.apis.paths.dapps_uniswapv3_tokens_historical import DappsUniswapv3TokensHistorical
from openapi_client.apis.paths.dapps_uniswapv3_tokens_current import DappsUniswapv3TokensCurrent
from openapi_client.apis.paths.dapps_uniswapv3_token_hour_datas_historical import DappsUniswapv3TokenHourDatasHistorical
from openapi_client.apis.paths.dapps_uniswapv3_token_hour_datas_current import DappsUniswapv3TokenHourDatasCurrent
from openapi_client.apis.paths.dapps_uniswapv3_token_v3_day_datas_historical import DappsUniswapv3TokenV3DayDatasHistorical
from openapi_client.apis.paths.dapps_uniswapv3_token_v3_day_datas_current import DappsUniswapv3TokenV3DayDatasCurrent
from openapi_client.apis.paths.dapps_uniswapv3_transactions_historical import DappsUniswapv3TransactionsHistorical
from openapi_client.apis.paths.dapps_uniswapv3_transactions_current import DappsUniswapv3TransactionsCurrent
from openapi_client.apis.paths.dapps_uniswapv3_uniswap_day_datas_historical import DappsUniswapv3UniswapDayDatasHistorical
from openapi_client.apis.paths.dapps_uniswapv3_uniswap_day_datas_current import DappsUniswapv3UniswapDayDatasCurrent

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
        PathValues.DAPPS_COW_ORDERS_HISTORICAL: DappsCowOrdersHistorical,
        PathValues.DAPPS_COW_ORDERS_CURRENT: DappsCowOrdersCurrent,
        PathValues.DAPPS_COW_SETTLEMENTS_HISTORICAL: DappsCowSettlementsHistorical,
        PathValues.DAPPS_COW_SETTLEMENTS_CURRENT: DappsCowSettlementsCurrent,
        PathValues.DAPPS_COW_TOKENS_HISTORICAL: DappsCowTokensHistorical,
        PathValues.DAPPS_COW_TOKENS_CURRENT: DappsCowTokensCurrent,
        PathValues.DAPPS_COW_TRADES_HISTORICAL: DappsCowTradesHistorical,
        PathValues.DAPPS_COW_TRADES_CURRENT: DappsCowTradesCurrent,
        PathValues.DAPPS_COW_USERS_HISTORICAL: DappsCowUsersHistorical,
        PathValues.DAPPS_COW_USERS_CURRENT: DappsCowUsersCurrent,
        PathValues.DAPPS_CURVE_ACCOUNTS_HISTORICAL: DappsCurveAccountsHistorical,
        PathValues.DAPPS_CURVE_ACCOUNTS_CURRENT: DappsCurveAccountsCurrent,
        PathValues.DAPPS_CURVE_ADD_LIQUIDITY_EVENTS_HISTORICAL: DappsCurveAddLiquidityEventsHistorical,
        PathValues.DAPPS_CURVE_ADD_LIQUIDITY_EVENTS_CURRENT: DappsCurveAddLiquidityEventsCurrent,
        PathValues.DAPPS_CURVE_ADMIN_FEE_CHANGE_LOGS_HISTORICAL: DappsCurveAdminFeeChangeLogsHistorical,
        PathValues.DAPPS_CURVE_ADMIN_FEE_CHANGE_LOGS_CURRENT: DappsCurveAdminFeeChangeLogsCurrent,
        PathValues.DAPPS_CURVE_AMPLIFICATION_COEFF_CHANGE_LOGS_HISTORICAL: DappsCurveAmplificationCoeffChangeLogsHistorical,
        PathValues.DAPPS_CURVE_AMPLIFICATION_COEFF_CHANGE_LOGS_CURRENT: DappsCurveAmplificationCoeffChangeLogsCurrent,
        PathValues.DAPPS_CURVE_COINS_HISTORICAL: DappsCurveCoinsHistorical,
        PathValues.DAPPS_CURVE_COINS_CURRENT: DappsCurveCoinsCurrent,
        PathValues.DAPPS_CURVE_CONTRACTS_HISTORICAL: DappsCurveContractsHistorical,
        PathValues.DAPPS_CURVE_CONTRACTS_CURRENT: DappsCurveContractsCurrent,
        PathValues.DAPPS_CURVE_CONTRACT_VERSIONS_HISTORICAL: DappsCurveContractVersionsHistorical,
        PathValues.DAPPS_CURVE_CONTRACT_VERSIONS_CURRENT: DappsCurveContractVersionsCurrent,
        PathValues.DAPPS_CURVE_DAILY_VOLUMES_HISTORICAL: DappsCurveDailyVolumesHistorical,
        PathValues.DAPPS_CURVE_DAILY_VOLUMES_CURRENT: DappsCurveDailyVolumesCurrent,
        PathValues.DAPPS_CURVE_EXCHANGES_HISTORICAL: DappsCurveExchangesHistorical,
        PathValues.DAPPS_CURVE_EXCHANGES_CURRENT: DappsCurveExchangesCurrent,
        PathValues.DAPPS_CURVE_FEE_CHANGE_LOGS_HISTORICAL: DappsCurveFeeChangeLogsHistorical,
        PathValues.DAPPS_CURVE_FEE_CHANGE_LOGS_CURRENT: DappsCurveFeeChangeLogsCurrent,
        PathValues.DAPPS_CURVE_GAUGE_DEPOSITS_HISTORICAL: DappsCurveGaugeDepositsHistorical,
        PathValues.DAPPS_CURVE_GAUGE_DEPOSITS_CURRENT: DappsCurveGaugeDepositsCurrent,
        PathValues.DAPPS_CURVE_GAUGES_HISTORICAL: DappsCurveGaugesHistorical,
        PathValues.DAPPS_CURVE_GAUGES_CURRENT: DappsCurveGaugesCurrent,
        PathValues.DAPPS_CURVE_GAUGE_LIQUIDITYS_HISTORICAL: DappsCurveGaugeLiquiditysHistorical,
        PathValues.DAPPS_CURVE_GAUGE_LIQUIDITYS_CURRENT: DappsCurveGaugeLiquiditysCurrent,
        PathValues.DAPPS_CURVE_GAUGE_TOTAL_WEIGHTS_HISTORICAL: DappsCurveGaugeTotalWeightsHistorical,
        PathValues.DAPPS_CURVE_GAUGE_TOTAL_WEIGHTS_CURRENT: DappsCurveGaugeTotalWeightsCurrent,
        PathValues.DAPPS_CURVE_GAUGE_TYPES_HISTORICAL: DappsCurveGaugeTypesHistorical,
        PathValues.DAPPS_CURVE_GAUGE_TYPES_CURRENT: DappsCurveGaugeTypesCurrent,
        PathValues.DAPPS_CURVE_GAUGE_TYPE_WEIGHTS_HISTORICAL: DappsCurveGaugeTypeWeightsHistorical,
        PathValues.DAPPS_CURVE_GAUGE_TYPE_WEIGHTS_CURRENT: DappsCurveGaugeTypeWeightsCurrent,
        PathValues.DAPPS_CURVE_GAUGE_WEIGHTS_HISTORICAL: DappsCurveGaugeWeightsHistorical,
        PathValues.DAPPS_CURVE_GAUGE_WEIGHTS_CURRENT: DappsCurveGaugeWeightsCurrent,
        PathValues.DAPPS_CURVE_GAUGE_WEIGHT_VOTES_HISTORICAL: DappsCurveGaugeWeightVotesHistorical,
        PathValues.DAPPS_CURVE_GAUGE_WEIGHT_VOTES_CURRENT: DappsCurveGaugeWeightVotesCurrent,
        PathValues.DAPPS_CURVE_GAUGE_WITHDRAWS_HISTORICAL: DappsCurveGaugeWithdrawsHistorical,
        PathValues.DAPPS_CURVE_GAUGE_WITHDRAWS_CURRENT: DappsCurveGaugeWithdrawsCurrent,
        PathValues.DAPPS_CURVE_HOURLY_VOLUMES_HISTORICAL: DappsCurveHourlyVolumesHistorical,
        PathValues.DAPPS_CURVE_HOURLY_VOLUMES_CURRENT: DappsCurveHourlyVolumesCurrent,
        PathValues.DAPPS_CURVE_LP_TOKENS_HISTORICAL: DappsCurveLpTokensHistorical,
        PathValues.DAPPS_CURVE_LP_TOKENS_CURRENT: DappsCurveLpTokensCurrent,
        PathValues.DAPPS_CURVE_POOLS_HISTORICAL: DappsCurvePoolsHistorical,
        PathValues.DAPPS_CURVE_POOLS_CURRENT: DappsCurvePoolsCurrent,
        PathValues.DAPPS_CURVE_PROPOSALS_HISTORICAL: DappsCurveProposalsHistorical,
        PathValues.DAPPS_CURVE_PROPOSALS_CURRENT: DappsCurveProposalsCurrent,
        PathValues.DAPPS_CURVE_PROPOSAL_VOTES_HISTORICAL: DappsCurveProposalVotesHistorical,
        PathValues.DAPPS_CURVE_PROPOSAL_VOTES_CURRENT: DappsCurveProposalVotesCurrent,
        PathValues.DAPPS_CURVE_REMOVE_LIQUIDITY_EVENTS_HISTORICAL: DappsCurveRemoveLiquidityEventsHistorical,
        PathValues.DAPPS_CURVE_REMOVE_LIQUIDITY_EVENTS_CURRENT: DappsCurveRemoveLiquidityEventsCurrent,
        PathValues.DAPPS_CURVE_REMOVE_LIQUIDITY_ONE_EVENTS_HISTORICAL: DappsCurveRemoveLiquidityOneEventsHistorical,
        PathValues.DAPPS_CURVE_REMOVE_LIQUIDITY_ONE_EVENTS_CURRENT: DappsCurveRemoveLiquidityOneEventsCurrent,
        PathValues.DAPPS_CURVE_SYSTEM_STATES_HISTORICAL: DappsCurveSystemStatesHistorical,
        PathValues.DAPPS_CURVE_SYSTEM_STATES_CURRENT: DappsCurveSystemStatesCurrent,
        PathValues.DAPPS_CURVE_TOKENS_HISTORICAL: DappsCurveTokensHistorical,
        PathValues.DAPPS_CURVE_TOKENS_CURRENT: DappsCurveTokensCurrent,
        PathValues.DAPPS_CURVE_TRANSFER_OWNERSHIP_EVENTS_HISTORICAL: DappsCurveTransferOwnershipEventsHistorical,
        PathValues.DAPPS_CURVE_TRANSFER_OWNERSHIP_EVENTS_CURRENT: DappsCurveTransferOwnershipEventsCurrent,
        PathValues.DAPPS_CURVE_UNDERLYING_COINS_HISTORICAL: DappsCurveUnderlyingCoinsHistorical,
        PathValues.DAPPS_CURVE_UNDERLYING_COINS_CURRENT: DappsCurveUnderlyingCoinsCurrent,
        PathValues.DAPPS_CURVE_VOTING_APPS_HISTORICAL: DappsCurveVotingAppsHistorical,
        PathValues.DAPPS_CURVE_VOTING_APPS_CURRENT: DappsCurveVotingAppsCurrent,
        PathValues.DAPPS_CURVE_WEEKLY_VOLUMES_HISTORICAL: DappsCurveWeeklyVolumesHistorical,
        PathValues.DAPPS_CURVE_WEEKLY_VOLUMES_CURRENT: DappsCurveWeeklyVolumesCurrent,
        PathValues.DAPPS_DEX_BATCHS_HISTORICAL: DappsDexBatchsHistorical,
        PathValues.DAPPS_DEX_BATCHS_CURRENT: DappsDexBatchsCurrent,
        PathValues.DAPPS_DEX_DEPOSITS_HISTORICAL: DappsDexDepositsHistorical,
        PathValues.DAPPS_DEX_DEPOSITS_CURRENT: DappsDexDepositsCurrent,
        PathValues.DAPPS_DEX_ORDERS_HISTORICAL: DappsDexOrdersHistorical,
        PathValues.DAPPS_DEX_ORDERS_CURRENT: DappsDexOrdersCurrent,
        PathValues.DAPPS_DEX_PRICES_HISTORICAL: DappsDexPricesHistorical,
        PathValues.DAPPS_DEX_PRICES_CURRENT: DappsDexPricesCurrent,
        PathValues.DAPPS_DEX_SOLUTIONS_HISTORICAL: DappsDexSolutionsHistorical,
        PathValues.DAPPS_DEX_SOLUTIONS_CURRENT: DappsDexSolutionsCurrent,
        PathValues.DAPPS_DEX_STATSS_HISTORICAL: DappsDexStatssHistorical,
        PathValues.DAPPS_DEX_STATSS_CURRENT: DappsDexStatssCurrent,
        PathValues.DAPPS_DEX_TOKENS_HISTORICAL: DappsDexTokensHistorical,
        PathValues.DAPPS_DEX_TOKENS_CURRENT: DappsDexTokensCurrent,
        PathValues.DAPPS_DEX_TRADES_HISTORICAL: DappsDexTradesHistorical,
        PathValues.DAPPS_DEX_TRADES_CURRENT: DappsDexTradesCurrent,
        PathValues.DAPPS_DEX_USERS_HISTORICAL: DappsDexUsersHistorical,
        PathValues.DAPPS_DEX_USERS_CURRENT: DappsDexUsersCurrent,
        PathValues.DAPPS_DEX_WITHDRAWS_HISTORICAL: DappsDexWithdrawsHistorical,
        PathValues.DAPPS_DEX_WITHDRAWS_CURRENT: DappsDexWithdrawsCurrent,
        PathValues.DAPPS_DEX_WITHDRAW_REQUESTS_HISTORICAL: DappsDexWithdrawRequestsHistorical,
        PathValues.DAPPS_DEX_WITHDRAW_REQUESTS_CURRENT: DappsDexWithdrawRequestsCurrent,
        PathValues.DAPPS_SUSHISWAP_BUNDLES_HISTORICAL: DappsSushiswapBundlesHistorical,
        PathValues.DAPPS_SUSHISWAP_BUNDLES_CURRENT: DappsSushiswapBundlesCurrent,
        PathValues.DAPPS_SUSHISWAP_BURNS_HISTORICAL: DappsSushiswapBurnsHistorical,
        PathValues.DAPPS_SUSHISWAP_BURNS_CURRENT: DappsSushiswapBurnsCurrent,
        PathValues.DAPPS_SUSHISWAP_DAY_DATAS_HISTORICAL: DappsSushiswapDayDatasHistorical,
        PathValues.DAPPS_SUSHISWAP_DAY_DATAS_CURRENT: DappsSushiswapDayDatasCurrent,
        PathValues.DAPPS_SUSHISWAP_FACTORYS_HISTORICAL: DappsSushiswapFactorysHistorical,
        PathValues.DAPPS_SUSHISWAP_FACTORYS_CURRENT: DappsSushiswapFactorysCurrent,
        PathValues.DAPPS_SUSHISWAP_HOUR_DATAS_HISTORICAL: DappsSushiswapHourDatasHistorical,
        PathValues.DAPPS_SUSHISWAP_HOUR_DATAS_CURRENT: DappsSushiswapHourDatasCurrent,
        PathValues.DAPPS_SUSHISWAP_LIQUIDITY_POSITIONS_HISTORICAL: DappsSushiswapLiquidityPositionsHistorical,
        PathValues.DAPPS_SUSHISWAP_LIQUIDITY_POSITIONS_CURRENT: DappsSushiswapLiquidityPositionsCurrent,
        PathValues.DAPPS_SUSHISWAP_LIQUIDITY_POSITION_SNAPSHOTS_HISTORICAL: DappsSushiswapLiquidityPositionSnapshotsHistorical,
        PathValues.DAPPS_SUSHISWAP_LIQUIDITY_POSITION_SNAPSHOTS_CURRENT: DappsSushiswapLiquidityPositionSnapshotsCurrent,
        PathValues.DAPPS_SUSHISWAP_MINTS_HISTORICAL: DappsSushiswapMintsHistorical,
        PathValues.DAPPS_SUSHISWAP_MINTS_CURRENT: DappsSushiswapMintsCurrent,
        PathValues.DAPPS_SUSHISWAP_PAIR_DAY_DATAS_HISTORICAL: DappsSushiswapPairDayDatasHistorical,
        PathValues.DAPPS_SUSHISWAP_PAIR_DAY_DATAS_CURRENT: DappsSushiswapPairDayDatasCurrent,
        PathValues.DAPPS_SUSHISWAP_PAIRS_HISTORICAL: DappsSushiswapPairsHistorical,
        PathValues.DAPPS_SUSHISWAP_PAIRS_CURRENT: DappsSushiswapPairsCurrent,
        PathValues.DAPPS_SUSHISWAP_PAIR_HOUR_DATAS_HISTORICAL: DappsSushiswapPairHourDatasHistorical,
        PathValues.DAPPS_SUSHISWAP_PAIR_HOUR_DATAS_CURRENT: DappsSushiswapPairHourDatasCurrent,
        PathValues.DAPPS_SUSHISWAP_SWAPS_HISTORICAL: DappsSushiswapSwapsHistorical,
        PathValues.DAPPS_SUSHISWAP_SWAPS_CURRENT: DappsSushiswapSwapsCurrent,
        PathValues.DAPPS_SUSHISWAP_TOKEN_DAY_DATAS_HISTORICAL: DappsSushiswapTokenDayDatasHistorical,
        PathValues.DAPPS_SUSHISWAP_TOKEN_DAY_DATAS_CURRENT: DappsSushiswapTokenDayDatasCurrent,
        PathValues.DAPPS_SUSHISWAP_TOKENS_HISTORICAL: DappsSushiswapTokensHistorical,
        PathValues.DAPPS_SUSHISWAP_TOKENS_CURRENT: DappsSushiswapTokensCurrent,
        PathValues.DAPPS_SUSHISWAP_TRANSACTIONS_HISTORICAL: DappsSushiswapTransactionsHistorical,
        PathValues.DAPPS_SUSHISWAP_TRANSACTIONS_CURRENT: DappsSushiswapTransactionsCurrent,
        PathValues.DAPPS_SUSHISWAP_USERS_HISTORICAL: DappsSushiswapUsersHistorical,
        PathValues.DAPPS_SUSHISWAP_USERS_CURRENT: DappsSushiswapUsersCurrent,
        PathValues.DAPPS_UNISWAPV2_BUNDLES_HISTORICAL: DappsUniswapv2BundlesHistorical,
        PathValues.DAPPS_UNISWAPV2_BUNDLES_CURRENT: DappsUniswapv2BundlesCurrent,
        PathValues.DAPPS_UNISWAPV2_BURNS_HISTORICAL: DappsUniswapv2BurnsHistorical,
        PathValues.DAPPS_UNISWAPV2_BURNS_CURRENT: DappsUniswapv2BurnsCurrent,
        PathValues.DAPPS_UNISWAPV2_LIQUIDITY_POSITIONS_HISTORICAL: DappsUniswapv2LiquidityPositionsHistorical,
        PathValues.DAPPS_UNISWAPV2_LIQUIDITY_POSITIONS_CURRENT: DappsUniswapv2LiquidityPositionsCurrent,
        PathValues.DAPPS_UNISWAPV2_LIQUIDITY_POSITION_SNAPSHOTS_HISTORICAL: DappsUniswapv2LiquidityPositionSnapshotsHistorical,
        PathValues.DAPPS_UNISWAPV2_LIQUIDITY_POSITION_SNAPSHOTS_CURRENT: DappsUniswapv2LiquidityPositionSnapshotsCurrent,
        PathValues.DAPPS_UNISWAPV2_MINTS_HISTORICAL: DappsUniswapv2MintsHistorical,
        PathValues.DAPPS_UNISWAPV2_MINTS_CURRENT: DappsUniswapv2MintsCurrent,
        PathValues.DAPPS_UNISWAPV2_PAIR_DAY_DATAS_HISTORICAL: DappsUniswapv2PairDayDatasHistorical,
        PathValues.DAPPS_UNISWAPV2_PAIR_DAY_DATAS_CURRENT: DappsUniswapv2PairDayDatasCurrent,
        PathValues.DAPPS_UNISWAPV2_PAIRS_HISTORICAL: DappsUniswapv2PairsHistorical,
        PathValues.DAPPS_UNISWAPV2_PAIRS_CURRENT: DappsUniswapv2PairsCurrent,
        PathValues.DAPPS_UNISWAPV2_PAIR_HOUR_DATAS_HISTORICAL: DappsUniswapv2PairHourDatasHistorical,
        PathValues.DAPPS_UNISWAPV2_PAIR_HOUR_DATAS_CURRENT: DappsUniswapv2PairHourDatasCurrent,
        PathValues.DAPPS_UNISWAPV2_SWAPS_HISTORICAL: DappsUniswapv2SwapsHistorical,
        PathValues.DAPPS_UNISWAPV2_SWAPS_CURRENT: DappsUniswapv2SwapsCurrent,
        PathValues.DAPPS_UNISWAPV2_TOKEN_DAY_DATAS_HISTORICAL: DappsUniswapv2TokenDayDatasHistorical,
        PathValues.DAPPS_UNISWAPV2_TOKEN_DAY_DATAS_CURRENT: DappsUniswapv2TokenDayDatasCurrent,
        PathValues.DAPPS_UNISWAPV2_TOKENS_HISTORICAL: DappsUniswapv2TokensHistorical,
        PathValues.DAPPS_UNISWAPV2_TOKENS_CURRENT: DappsUniswapv2TokensCurrent,
        PathValues.DAPPS_UNISWAPV2_TRANSACTIONS_HISTORICAL: DappsUniswapv2TransactionsHistorical,
        PathValues.DAPPS_UNISWAPV2_TRANSACTIONS_CURRENT: DappsUniswapv2TransactionsCurrent,
        PathValues.DAPPS_UNISWAPV2_UNISWAP_DAY_DATAS_HISTORICAL: DappsUniswapv2UniswapDayDatasHistorical,
        PathValues.DAPPS_UNISWAPV2_UNISWAP_DAY_DATAS_CURRENT: DappsUniswapv2UniswapDayDatasCurrent,
        PathValues.DAPPS_UNISWAPV2_UNISWAP_FACTORYS_HISTORICAL: DappsUniswapv2UniswapFactorysHistorical,
        PathValues.DAPPS_UNISWAPV2_UNISWAP_FACTORYS_CURRENT: DappsUniswapv2UniswapFactorysCurrent,
        PathValues.DAPPS_UNISWAPV2_USERS_HISTORICAL: DappsUniswapv2UsersHistorical,
        PathValues.DAPPS_UNISWAPV2_USERS_CURRENT: DappsUniswapv2UsersCurrent,
        PathValues.DAPPS_UNISWAPV3_BUNDLES_HISTORICAL: DappsUniswapv3BundlesHistorical,
        PathValues.DAPPS_UNISWAPV3_BUNDLES_CURRENT: DappsUniswapv3BundlesCurrent,
        PathValues.DAPPS_UNISWAPV3_BURNS_HISTORICAL: DappsUniswapv3BurnsHistorical,
        PathValues.DAPPS_UNISWAPV3_BURNS_CURRENT: DappsUniswapv3BurnsCurrent,
        PathValues.DAPPS_UNISWAPV3_FACTORYS_HISTORICAL: DappsUniswapv3FactorysHistorical,
        PathValues.DAPPS_UNISWAPV3_FACTORYS_CURRENT: DappsUniswapv3FactorysCurrent,
        PathValues.DAPPS_UNISWAPV3_MINTS_HISTORICAL: DappsUniswapv3MintsHistorical,
        PathValues.DAPPS_UNISWAPV3_MINTS_CURRENT: DappsUniswapv3MintsCurrent,
        PathValues.DAPPS_UNISWAPV3_POOL_DAY_DATAS_HISTORICAL: DappsUniswapv3PoolDayDatasHistorical,
        PathValues.DAPPS_UNISWAPV3_POOL_DAY_DATAS_CURRENT: DappsUniswapv3PoolDayDatasCurrent,
        PathValues.DAPPS_UNISWAPV3_POOLS_HISTORICAL: DappsUniswapv3PoolsHistorical,
        PathValues.DAPPS_UNISWAPV3_POOLS_CURRENT: DappsUniswapv3PoolsCurrent,
        PathValues.DAPPS_UNISWAPV3_POOL_HOUR_DATAS_HISTORICAL: DappsUniswapv3PoolHourDatasHistorical,
        PathValues.DAPPS_UNISWAPV3_POOL_HOUR_DATAS_CURRENT: DappsUniswapv3PoolHourDatasCurrent,
        PathValues.DAPPS_UNISWAPV3_POSITIONS_HISTORICAL: DappsUniswapv3PositionsHistorical,
        PathValues.DAPPS_UNISWAPV3_POSITIONS_CURRENT: DappsUniswapv3PositionsCurrent,
        PathValues.DAPPS_UNISWAPV3_POSITION_SNAPSHOTS_HISTORICAL: DappsUniswapv3PositionSnapshotsHistorical,
        PathValues.DAPPS_UNISWAPV3_POSITION_SNAPSHOTS_CURRENT: DappsUniswapv3PositionSnapshotsCurrent,
        PathValues.DAPPS_UNISWAPV3_SWAPS_HISTORICAL: DappsUniswapv3SwapsHistorical,
        PathValues.DAPPS_UNISWAPV3_SWAPS_CURRENT: DappsUniswapv3SwapsCurrent,
        PathValues.DAPPS_UNISWAPV3_TICK_DAY_DATAS_HISTORICAL: DappsUniswapv3TickDayDatasHistorical,
        PathValues.DAPPS_UNISWAPV3_TICK_DAY_DATAS_CURRENT: DappsUniswapv3TickDayDatasCurrent,
        PathValues.DAPPS_UNISWAPV3_TICKS_HISTORICAL: DappsUniswapv3TicksHistorical,
        PathValues.DAPPS_UNISWAPV3_TICKS_CURRENT: DappsUniswapv3TicksCurrent,
        PathValues.DAPPS_UNISWAPV3_TOKENS_HISTORICAL: DappsUniswapv3TokensHistorical,
        PathValues.DAPPS_UNISWAPV3_TOKENS_CURRENT: DappsUniswapv3TokensCurrent,
        PathValues.DAPPS_UNISWAPV3_TOKEN_HOUR_DATAS_HISTORICAL: DappsUniswapv3TokenHourDatasHistorical,
        PathValues.DAPPS_UNISWAPV3_TOKEN_HOUR_DATAS_CURRENT: DappsUniswapv3TokenHourDatasCurrent,
        PathValues.DAPPS_UNISWAPV3_TOKEN_V3DAY_DATAS_HISTORICAL: DappsUniswapv3TokenV3DayDatasHistorical,
        PathValues.DAPPS_UNISWAPV3_TOKEN_V3DAY_DATAS_CURRENT: DappsUniswapv3TokenV3DayDatasCurrent,
        PathValues.DAPPS_UNISWAPV3_TRANSACTIONS_HISTORICAL: DappsUniswapv3TransactionsHistorical,
        PathValues.DAPPS_UNISWAPV3_TRANSACTIONS_CURRENT: DappsUniswapv3TransactionsCurrent,
        PathValues.DAPPS_UNISWAPV3_UNISWAP_DAY_DATAS_HISTORICAL: DappsUniswapv3UniswapDayDatasHistorical,
        PathValues.DAPPS_UNISWAPV3_UNISWAP_DAY_DATAS_CURRENT: DappsUniswapv3UniswapDayDatasCurrent,
    }
)

path_to_api = PathToApi(
    {
        PathValues.DAPPS_COW_ORDERS_HISTORICAL: DappsCowOrdersHistorical,
        PathValues.DAPPS_COW_ORDERS_CURRENT: DappsCowOrdersCurrent,
        PathValues.DAPPS_COW_SETTLEMENTS_HISTORICAL: DappsCowSettlementsHistorical,
        PathValues.DAPPS_COW_SETTLEMENTS_CURRENT: DappsCowSettlementsCurrent,
        PathValues.DAPPS_COW_TOKENS_HISTORICAL: DappsCowTokensHistorical,
        PathValues.DAPPS_COW_TOKENS_CURRENT: DappsCowTokensCurrent,
        PathValues.DAPPS_COW_TRADES_HISTORICAL: DappsCowTradesHistorical,
        PathValues.DAPPS_COW_TRADES_CURRENT: DappsCowTradesCurrent,
        PathValues.DAPPS_COW_USERS_HISTORICAL: DappsCowUsersHistorical,
        PathValues.DAPPS_COW_USERS_CURRENT: DappsCowUsersCurrent,
        PathValues.DAPPS_CURVE_ACCOUNTS_HISTORICAL: DappsCurveAccountsHistorical,
        PathValues.DAPPS_CURVE_ACCOUNTS_CURRENT: DappsCurveAccountsCurrent,
        PathValues.DAPPS_CURVE_ADD_LIQUIDITY_EVENTS_HISTORICAL: DappsCurveAddLiquidityEventsHistorical,
        PathValues.DAPPS_CURVE_ADD_LIQUIDITY_EVENTS_CURRENT: DappsCurveAddLiquidityEventsCurrent,
        PathValues.DAPPS_CURVE_ADMIN_FEE_CHANGE_LOGS_HISTORICAL: DappsCurveAdminFeeChangeLogsHistorical,
        PathValues.DAPPS_CURVE_ADMIN_FEE_CHANGE_LOGS_CURRENT: DappsCurveAdminFeeChangeLogsCurrent,
        PathValues.DAPPS_CURVE_AMPLIFICATION_COEFF_CHANGE_LOGS_HISTORICAL: DappsCurveAmplificationCoeffChangeLogsHistorical,
        PathValues.DAPPS_CURVE_AMPLIFICATION_COEFF_CHANGE_LOGS_CURRENT: DappsCurveAmplificationCoeffChangeLogsCurrent,
        PathValues.DAPPS_CURVE_COINS_HISTORICAL: DappsCurveCoinsHistorical,
        PathValues.DAPPS_CURVE_COINS_CURRENT: DappsCurveCoinsCurrent,
        PathValues.DAPPS_CURVE_CONTRACTS_HISTORICAL: DappsCurveContractsHistorical,
        PathValues.DAPPS_CURVE_CONTRACTS_CURRENT: DappsCurveContractsCurrent,
        PathValues.DAPPS_CURVE_CONTRACT_VERSIONS_HISTORICAL: DappsCurveContractVersionsHistorical,
        PathValues.DAPPS_CURVE_CONTRACT_VERSIONS_CURRENT: DappsCurveContractVersionsCurrent,
        PathValues.DAPPS_CURVE_DAILY_VOLUMES_HISTORICAL: DappsCurveDailyVolumesHistorical,
        PathValues.DAPPS_CURVE_DAILY_VOLUMES_CURRENT: DappsCurveDailyVolumesCurrent,
        PathValues.DAPPS_CURVE_EXCHANGES_HISTORICAL: DappsCurveExchangesHistorical,
        PathValues.DAPPS_CURVE_EXCHANGES_CURRENT: DappsCurveExchangesCurrent,
        PathValues.DAPPS_CURVE_FEE_CHANGE_LOGS_HISTORICAL: DappsCurveFeeChangeLogsHistorical,
        PathValues.DAPPS_CURVE_FEE_CHANGE_LOGS_CURRENT: DappsCurveFeeChangeLogsCurrent,
        PathValues.DAPPS_CURVE_GAUGE_DEPOSITS_HISTORICAL: DappsCurveGaugeDepositsHistorical,
        PathValues.DAPPS_CURVE_GAUGE_DEPOSITS_CURRENT: DappsCurveGaugeDepositsCurrent,
        PathValues.DAPPS_CURVE_GAUGES_HISTORICAL: DappsCurveGaugesHistorical,
        PathValues.DAPPS_CURVE_GAUGES_CURRENT: DappsCurveGaugesCurrent,
        PathValues.DAPPS_CURVE_GAUGE_LIQUIDITYS_HISTORICAL: DappsCurveGaugeLiquiditysHistorical,
        PathValues.DAPPS_CURVE_GAUGE_LIQUIDITYS_CURRENT: DappsCurveGaugeLiquiditysCurrent,
        PathValues.DAPPS_CURVE_GAUGE_TOTAL_WEIGHTS_HISTORICAL: DappsCurveGaugeTotalWeightsHistorical,
        PathValues.DAPPS_CURVE_GAUGE_TOTAL_WEIGHTS_CURRENT: DappsCurveGaugeTotalWeightsCurrent,
        PathValues.DAPPS_CURVE_GAUGE_TYPES_HISTORICAL: DappsCurveGaugeTypesHistorical,
        PathValues.DAPPS_CURVE_GAUGE_TYPES_CURRENT: DappsCurveGaugeTypesCurrent,
        PathValues.DAPPS_CURVE_GAUGE_TYPE_WEIGHTS_HISTORICAL: DappsCurveGaugeTypeWeightsHistorical,
        PathValues.DAPPS_CURVE_GAUGE_TYPE_WEIGHTS_CURRENT: DappsCurveGaugeTypeWeightsCurrent,
        PathValues.DAPPS_CURVE_GAUGE_WEIGHTS_HISTORICAL: DappsCurveGaugeWeightsHistorical,
        PathValues.DAPPS_CURVE_GAUGE_WEIGHTS_CURRENT: DappsCurveGaugeWeightsCurrent,
        PathValues.DAPPS_CURVE_GAUGE_WEIGHT_VOTES_HISTORICAL: DappsCurveGaugeWeightVotesHistorical,
        PathValues.DAPPS_CURVE_GAUGE_WEIGHT_VOTES_CURRENT: DappsCurveGaugeWeightVotesCurrent,
        PathValues.DAPPS_CURVE_GAUGE_WITHDRAWS_HISTORICAL: DappsCurveGaugeWithdrawsHistorical,
        PathValues.DAPPS_CURVE_GAUGE_WITHDRAWS_CURRENT: DappsCurveGaugeWithdrawsCurrent,
        PathValues.DAPPS_CURVE_HOURLY_VOLUMES_HISTORICAL: DappsCurveHourlyVolumesHistorical,
        PathValues.DAPPS_CURVE_HOURLY_VOLUMES_CURRENT: DappsCurveHourlyVolumesCurrent,
        PathValues.DAPPS_CURVE_LP_TOKENS_HISTORICAL: DappsCurveLpTokensHistorical,
        PathValues.DAPPS_CURVE_LP_TOKENS_CURRENT: DappsCurveLpTokensCurrent,
        PathValues.DAPPS_CURVE_POOLS_HISTORICAL: DappsCurvePoolsHistorical,
        PathValues.DAPPS_CURVE_POOLS_CURRENT: DappsCurvePoolsCurrent,
        PathValues.DAPPS_CURVE_PROPOSALS_HISTORICAL: DappsCurveProposalsHistorical,
        PathValues.DAPPS_CURVE_PROPOSALS_CURRENT: DappsCurveProposalsCurrent,
        PathValues.DAPPS_CURVE_PROPOSAL_VOTES_HISTORICAL: DappsCurveProposalVotesHistorical,
        PathValues.DAPPS_CURVE_PROPOSAL_VOTES_CURRENT: DappsCurveProposalVotesCurrent,
        PathValues.DAPPS_CURVE_REMOVE_LIQUIDITY_EVENTS_HISTORICAL: DappsCurveRemoveLiquidityEventsHistorical,
        PathValues.DAPPS_CURVE_REMOVE_LIQUIDITY_EVENTS_CURRENT: DappsCurveRemoveLiquidityEventsCurrent,
        PathValues.DAPPS_CURVE_REMOVE_LIQUIDITY_ONE_EVENTS_HISTORICAL: DappsCurveRemoveLiquidityOneEventsHistorical,
        PathValues.DAPPS_CURVE_REMOVE_LIQUIDITY_ONE_EVENTS_CURRENT: DappsCurveRemoveLiquidityOneEventsCurrent,
        PathValues.DAPPS_CURVE_SYSTEM_STATES_HISTORICAL: DappsCurveSystemStatesHistorical,
        PathValues.DAPPS_CURVE_SYSTEM_STATES_CURRENT: DappsCurveSystemStatesCurrent,
        PathValues.DAPPS_CURVE_TOKENS_HISTORICAL: DappsCurveTokensHistorical,
        PathValues.DAPPS_CURVE_TOKENS_CURRENT: DappsCurveTokensCurrent,
        PathValues.DAPPS_CURVE_TRANSFER_OWNERSHIP_EVENTS_HISTORICAL: DappsCurveTransferOwnershipEventsHistorical,
        PathValues.DAPPS_CURVE_TRANSFER_OWNERSHIP_EVENTS_CURRENT: DappsCurveTransferOwnershipEventsCurrent,
        PathValues.DAPPS_CURVE_UNDERLYING_COINS_HISTORICAL: DappsCurveUnderlyingCoinsHistorical,
        PathValues.DAPPS_CURVE_UNDERLYING_COINS_CURRENT: DappsCurveUnderlyingCoinsCurrent,
        PathValues.DAPPS_CURVE_VOTING_APPS_HISTORICAL: DappsCurveVotingAppsHistorical,
        PathValues.DAPPS_CURVE_VOTING_APPS_CURRENT: DappsCurveVotingAppsCurrent,
        PathValues.DAPPS_CURVE_WEEKLY_VOLUMES_HISTORICAL: DappsCurveWeeklyVolumesHistorical,
        PathValues.DAPPS_CURVE_WEEKLY_VOLUMES_CURRENT: DappsCurveWeeklyVolumesCurrent,
        PathValues.DAPPS_DEX_BATCHS_HISTORICAL: DappsDexBatchsHistorical,
        PathValues.DAPPS_DEX_BATCHS_CURRENT: DappsDexBatchsCurrent,
        PathValues.DAPPS_DEX_DEPOSITS_HISTORICAL: DappsDexDepositsHistorical,
        PathValues.DAPPS_DEX_DEPOSITS_CURRENT: DappsDexDepositsCurrent,
        PathValues.DAPPS_DEX_ORDERS_HISTORICAL: DappsDexOrdersHistorical,
        PathValues.DAPPS_DEX_ORDERS_CURRENT: DappsDexOrdersCurrent,
        PathValues.DAPPS_DEX_PRICES_HISTORICAL: DappsDexPricesHistorical,
        PathValues.DAPPS_DEX_PRICES_CURRENT: DappsDexPricesCurrent,
        PathValues.DAPPS_DEX_SOLUTIONS_HISTORICAL: DappsDexSolutionsHistorical,
        PathValues.DAPPS_DEX_SOLUTIONS_CURRENT: DappsDexSolutionsCurrent,
        PathValues.DAPPS_DEX_STATSS_HISTORICAL: DappsDexStatssHistorical,
        PathValues.DAPPS_DEX_STATSS_CURRENT: DappsDexStatssCurrent,
        PathValues.DAPPS_DEX_TOKENS_HISTORICAL: DappsDexTokensHistorical,
        PathValues.DAPPS_DEX_TOKENS_CURRENT: DappsDexTokensCurrent,
        PathValues.DAPPS_DEX_TRADES_HISTORICAL: DappsDexTradesHistorical,
        PathValues.DAPPS_DEX_TRADES_CURRENT: DappsDexTradesCurrent,
        PathValues.DAPPS_DEX_USERS_HISTORICAL: DappsDexUsersHistorical,
        PathValues.DAPPS_DEX_USERS_CURRENT: DappsDexUsersCurrent,
        PathValues.DAPPS_DEX_WITHDRAWS_HISTORICAL: DappsDexWithdrawsHistorical,
        PathValues.DAPPS_DEX_WITHDRAWS_CURRENT: DappsDexWithdrawsCurrent,
        PathValues.DAPPS_DEX_WITHDRAW_REQUESTS_HISTORICAL: DappsDexWithdrawRequestsHistorical,
        PathValues.DAPPS_DEX_WITHDRAW_REQUESTS_CURRENT: DappsDexWithdrawRequestsCurrent,
        PathValues.DAPPS_SUSHISWAP_BUNDLES_HISTORICAL: DappsSushiswapBundlesHistorical,
        PathValues.DAPPS_SUSHISWAP_BUNDLES_CURRENT: DappsSushiswapBundlesCurrent,
        PathValues.DAPPS_SUSHISWAP_BURNS_HISTORICAL: DappsSushiswapBurnsHistorical,
        PathValues.DAPPS_SUSHISWAP_BURNS_CURRENT: DappsSushiswapBurnsCurrent,
        PathValues.DAPPS_SUSHISWAP_DAY_DATAS_HISTORICAL: DappsSushiswapDayDatasHistorical,
        PathValues.DAPPS_SUSHISWAP_DAY_DATAS_CURRENT: DappsSushiswapDayDatasCurrent,
        PathValues.DAPPS_SUSHISWAP_FACTORYS_HISTORICAL: DappsSushiswapFactorysHistorical,
        PathValues.DAPPS_SUSHISWAP_FACTORYS_CURRENT: DappsSushiswapFactorysCurrent,
        PathValues.DAPPS_SUSHISWAP_HOUR_DATAS_HISTORICAL: DappsSushiswapHourDatasHistorical,
        PathValues.DAPPS_SUSHISWAP_HOUR_DATAS_CURRENT: DappsSushiswapHourDatasCurrent,
        PathValues.DAPPS_SUSHISWAP_LIQUIDITY_POSITIONS_HISTORICAL: DappsSushiswapLiquidityPositionsHistorical,
        PathValues.DAPPS_SUSHISWAP_LIQUIDITY_POSITIONS_CURRENT: DappsSushiswapLiquidityPositionsCurrent,
        PathValues.DAPPS_SUSHISWAP_LIQUIDITY_POSITION_SNAPSHOTS_HISTORICAL: DappsSushiswapLiquidityPositionSnapshotsHistorical,
        PathValues.DAPPS_SUSHISWAP_LIQUIDITY_POSITION_SNAPSHOTS_CURRENT: DappsSushiswapLiquidityPositionSnapshotsCurrent,
        PathValues.DAPPS_SUSHISWAP_MINTS_HISTORICAL: DappsSushiswapMintsHistorical,
        PathValues.DAPPS_SUSHISWAP_MINTS_CURRENT: DappsSushiswapMintsCurrent,
        PathValues.DAPPS_SUSHISWAP_PAIR_DAY_DATAS_HISTORICAL: DappsSushiswapPairDayDatasHistorical,
        PathValues.DAPPS_SUSHISWAP_PAIR_DAY_DATAS_CURRENT: DappsSushiswapPairDayDatasCurrent,
        PathValues.DAPPS_SUSHISWAP_PAIRS_HISTORICAL: DappsSushiswapPairsHistorical,
        PathValues.DAPPS_SUSHISWAP_PAIRS_CURRENT: DappsSushiswapPairsCurrent,
        PathValues.DAPPS_SUSHISWAP_PAIR_HOUR_DATAS_HISTORICAL: DappsSushiswapPairHourDatasHistorical,
        PathValues.DAPPS_SUSHISWAP_PAIR_HOUR_DATAS_CURRENT: DappsSushiswapPairHourDatasCurrent,
        PathValues.DAPPS_SUSHISWAP_SWAPS_HISTORICAL: DappsSushiswapSwapsHistorical,
        PathValues.DAPPS_SUSHISWAP_SWAPS_CURRENT: DappsSushiswapSwapsCurrent,
        PathValues.DAPPS_SUSHISWAP_TOKEN_DAY_DATAS_HISTORICAL: DappsSushiswapTokenDayDatasHistorical,
        PathValues.DAPPS_SUSHISWAP_TOKEN_DAY_DATAS_CURRENT: DappsSushiswapTokenDayDatasCurrent,
        PathValues.DAPPS_SUSHISWAP_TOKENS_HISTORICAL: DappsSushiswapTokensHistorical,
        PathValues.DAPPS_SUSHISWAP_TOKENS_CURRENT: DappsSushiswapTokensCurrent,
        PathValues.DAPPS_SUSHISWAP_TRANSACTIONS_HISTORICAL: DappsSushiswapTransactionsHistorical,
        PathValues.DAPPS_SUSHISWAP_TRANSACTIONS_CURRENT: DappsSushiswapTransactionsCurrent,
        PathValues.DAPPS_SUSHISWAP_USERS_HISTORICAL: DappsSushiswapUsersHistorical,
        PathValues.DAPPS_SUSHISWAP_USERS_CURRENT: DappsSushiswapUsersCurrent,
        PathValues.DAPPS_UNISWAPV2_BUNDLES_HISTORICAL: DappsUniswapv2BundlesHistorical,
        PathValues.DAPPS_UNISWAPV2_BUNDLES_CURRENT: DappsUniswapv2BundlesCurrent,
        PathValues.DAPPS_UNISWAPV2_BURNS_HISTORICAL: DappsUniswapv2BurnsHistorical,
        PathValues.DAPPS_UNISWAPV2_BURNS_CURRENT: DappsUniswapv2BurnsCurrent,
        PathValues.DAPPS_UNISWAPV2_LIQUIDITY_POSITIONS_HISTORICAL: DappsUniswapv2LiquidityPositionsHistorical,
        PathValues.DAPPS_UNISWAPV2_LIQUIDITY_POSITIONS_CURRENT: DappsUniswapv2LiquidityPositionsCurrent,
        PathValues.DAPPS_UNISWAPV2_LIQUIDITY_POSITION_SNAPSHOTS_HISTORICAL: DappsUniswapv2LiquidityPositionSnapshotsHistorical,
        PathValues.DAPPS_UNISWAPV2_LIQUIDITY_POSITION_SNAPSHOTS_CURRENT: DappsUniswapv2LiquidityPositionSnapshotsCurrent,
        PathValues.DAPPS_UNISWAPV2_MINTS_HISTORICAL: DappsUniswapv2MintsHistorical,
        PathValues.DAPPS_UNISWAPV2_MINTS_CURRENT: DappsUniswapv2MintsCurrent,
        PathValues.DAPPS_UNISWAPV2_PAIR_DAY_DATAS_HISTORICAL: DappsUniswapv2PairDayDatasHistorical,
        PathValues.DAPPS_UNISWAPV2_PAIR_DAY_DATAS_CURRENT: DappsUniswapv2PairDayDatasCurrent,
        PathValues.DAPPS_UNISWAPV2_PAIRS_HISTORICAL: DappsUniswapv2PairsHistorical,
        PathValues.DAPPS_UNISWAPV2_PAIRS_CURRENT: DappsUniswapv2PairsCurrent,
        PathValues.DAPPS_UNISWAPV2_PAIR_HOUR_DATAS_HISTORICAL: DappsUniswapv2PairHourDatasHistorical,
        PathValues.DAPPS_UNISWAPV2_PAIR_HOUR_DATAS_CURRENT: DappsUniswapv2PairHourDatasCurrent,
        PathValues.DAPPS_UNISWAPV2_SWAPS_HISTORICAL: DappsUniswapv2SwapsHistorical,
        PathValues.DAPPS_UNISWAPV2_SWAPS_CURRENT: DappsUniswapv2SwapsCurrent,
        PathValues.DAPPS_UNISWAPV2_TOKEN_DAY_DATAS_HISTORICAL: DappsUniswapv2TokenDayDatasHistorical,
        PathValues.DAPPS_UNISWAPV2_TOKEN_DAY_DATAS_CURRENT: DappsUniswapv2TokenDayDatasCurrent,
        PathValues.DAPPS_UNISWAPV2_TOKENS_HISTORICAL: DappsUniswapv2TokensHistorical,
        PathValues.DAPPS_UNISWAPV2_TOKENS_CURRENT: DappsUniswapv2TokensCurrent,
        PathValues.DAPPS_UNISWAPV2_TRANSACTIONS_HISTORICAL: DappsUniswapv2TransactionsHistorical,
        PathValues.DAPPS_UNISWAPV2_TRANSACTIONS_CURRENT: DappsUniswapv2TransactionsCurrent,
        PathValues.DAPPS_UNISWAPV2_UNISWAP_DAY_DATAS_HISTORICAL: DappsUniswapv2UniswapDayDatasHistorical,
        PathValues.DAPPS_UNISWAPV2_UNISWAP_DAY_DATAS_CURRENT: DappsUniswapv2UniswapDayDatasCurrent,
        PathValues.DAPPS_UNISWAPV2_UNISWAP_FACTORYS_HISTORICAL: DappsUniswapv2UniswapFactorysHistorical,
        PathValues.DAPPS_UNISWAPV2_UNISWAP_FACTORYS_CURRENT: DappsUniswapv2UniswapFactorysCurrent,
        PathValues.DAPPS_UNISWAPV2_USERS_HISTORICAL: DappsUniswapv2UsersHistorical,
        PathValues.DAPPS_UNISWAPV2_USERS_CURRENT: DappsUniswapv2UsersCurrent,
        PathValues.DAPPS_UNISWAPV3_BUNDLES_HISTORICAL: DappsUniswapv3BundlesHistorical,
        PathValues.DAPPS_UNISWAPV3_BUNDLES_CURRENT: DappsUniswapv3BundlesCurrent,
        PathValues.DAPPS_UNISWAPV3_BURNS_HISTORICAL: DappsUniswapv3BurnsHistorical,
        PathValues.DAPPS_UNISWAPV3_BURNS_CURRENT: DappsUniswapv3BurnsCurrent,
        PathValues.DAPPS_UNISWAPV3_FACTORYS_HISTORICAL: DappsUniswapv3FactorysHistorical,
        PathValues.DAPPS_UNISWAPV3_FACTORYS_CURRENT: DappsUniswapv3FactorysCurrent,
        PathValues.DAPPS_UNISWAPV3_MINTS_HISTORICAL: DappsUniswapv3MintsHistorical,
        PathValues.DAPPS_UNISWAPV3_MINTS_CURRENT: DappsUniswapv3MintsCurrent,
        PathValues.DAPPS_UNISWAPV3_POOL_DAY_DATAS_HISTORICAL: DappsUniswapv3PoolDayDatasHistorical,
        PathValues.DAPPS_UNISWAPV3_POOL_DAY_DATAS_CURRENT: DappsUniswapv3PoolDayDatasCurrent,
        PathValues.DAPPS_UNISWAPV3_POOLS_HISTORICAL: DappsUniswapv3PoolsHistorical,
        PathValues.DAPPS_UNISWAPV3_POOLS_CURRENT: DappsUniswapv3PoolsCurrent,
        PathValues.DAPPS_UNISWAPV3_POOL_HOUR_DATAS_HISTORICAL: DappsUniswapv3PoolHourDatasHistorical,
        PathValues.DAPPS_UNISWAPV3_POOL_HOUR_DATAS_CURRENT: DappsUniswapv3PoolHourDatasCurrent,
        PathValues.DAPPS_UNISWAPV3_POSITIONS_HISTORICAL: DappsUniswapv3PositionsHistorical,
        PathValues.DAPPS_UNISWAPV3_POSITIONS_CURRENT: DappsUniswapv3PositionsCurrent,
        PathValues.DAPPS_UNISWAPV3_POSITION_SNAPSHOTS_HISTORICAL: DappsUniswapv3PositionSnapshotsHistorical,
        PathValues.DAPPS_UNISWAPV3_POSITION_SNAPSHOTS_CURRENT: DappsUniswapv3PositionSnapshotsCurrent,
        PathValues.DAPPS_UNISWAPV3_SWAPS_HISTORICAL: DappsUniswapv3SwapsHistorical,
        PathValues.DAPPS_UNISWAPV3_SWAPS_CURRENT: DappsUniswapv3SwapsCurrent,
        PathValues.DAPPS_UNISWAPV3_TICK_DAY_DATAS_HISTORICAL: DappsUniswapv3TickDayDatasHistorical,
        PathValues.DAPPS_UNISWAPV3_TICK_DAY_DATAS_CURRENT: DappsUniswapv3TickDayDatasCurrent,
        PathValues.DAPPS_UNISWAPV3_TICKS_HISTORICAL: DappsUniswapv3TicksHistorical,
        PathValues.DAPPS_UNISWAPV3_TICKS_CURRENT: DappsUniswapv3TicksCurrent,
        PathValues.DAPPS_UNISWAPV3_TOKENS_HISTORICAL: DappsUniswapv3TokensHistorical,
        PathValues.DAPPS_UNISWAPV3_TOKENS_CURRENT: DappsUniswapv3TokensCurrent,
        PathValues.DAPPS_UNISWAPV3_TOKEN_HOUR_DATAS_HISTORICAL: DappsUniswapv3TokenHourDatasHistorical,
        PathValues.DAPPS_UNISWAPV3_TOKEN_HOUR_DATAS_CURRENT: DappsUniswapv3TokenHourDatasCurrent,
        PathValues.DAPPS_UNISWAPV3_TOKEN_V3DAY_DATAS_HISTORICAL: DappsUniswapv3TokenV3DayDatasHistorical,
        PathValues.DAPPS_UNISWAPV3_TOKEN_V3DAY_DATAS_CURRENT: DappsUniswapv3TokenV3DayDatasCurrent,
        PathValues.DAPPS_UNISWAPV3_TRANSACTIONS_HISTORICAL: DappsUniswapv3TransactionsHistorical,
        PathValues.DAPPS_UNISWAPV3_TRANSACTIONS_CURRENT: DappsUniswapv3TransactionsCurrent,
        PathValues.DAPPS_UNISWAPV3_UNISWAP_DAY_DATAS_HISTORICAL: DappsUniswapv3UniswapDayDatasHistorical,
        PathValues.DAPPS_UNISWAPV3_UNISWAP_DAY_DATAS_CURRENT: DappsUniswapv3UniswapDayDatasCurrent,
    }
)
