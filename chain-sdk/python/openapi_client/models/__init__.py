# coding: utf-8

# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from openapi_client.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from openapi_client.model.cow_order_dto import CowOrderDTO
from openapi_client.model.cow_settlement_dto import CowSettlementDTO
from openapi_client.model.cow_token_dto import CowTokenDTO
from openapi_client.model.cow_trade_dto import CowTradeDTO
from openapi_client.model.cow_user_dto import CowUserDTO
from openapi_client.model.curve_account_dto import CurveAccountDTO
from openapi_client.model.curve_add_liquidity_event_dto import CurveAddLiquidityEventDTO
from openapi_client.model.curve_admin_fee_change_log_dto import CurveAdminFeeChangeLogDTO
from openapi_client.model.curve_amplification_coeff_change_log_dto import CurveAmplificationCoeffChangeLogDTO
from openapi_client.model.curve_coin_dto import CurveCoinDTO
from openapi_client.model.curve_contract_dto import CurveContractDTO
from openapi_client.model.curve_contract_version_dto import CurveContractVersionDTO
from openapi_client.model.curve_daily_volume_dto import CurveDailyVolumeDTO
from openapi_client.model.curve_exchange_dto import CurveExchangeDTO
from openapi_client.model.curve_fee_change_log_dto import CurveFeeChangeLogDTO
from openapi_client.model.curve_gauge_dto import CurveGaugeDTO
from openapi_client.model.curve_gauge_deposit_dto import CurveGaugeDepositDTO
from openapi_client.model.curve_gauge_liquidity_dto import CurveGaugeLiquidityDTO
from openapi_client.model.curve_gauge_total_weight_dto import CurveGaugeTotalWeightDTO
from openapi_client.model.curve_gauge_type_dto import CurveGaugeTypeDTO
from openapi_client.model.curve_gauge_type_weight_dto import CurveGaugeTypeWeightDTO
from openapi_client.model.curve_gauge_weight_dto import CurveGaugeWeightDTO
from openapi_client.model.curve_gauge_weight_vote_dto import CurveGaugeWeightVoteDTO
from openapi_client.model.curve_gauge_withdraw_dto import CurveGaugeWithdrawDTO
from openapi_client.model.curve_hourly_volume_dto import CurveHourlyVolumeDTO
from openapi_client.model.curve_lp_token_dto import CurveLpTokenDTO
from openapi_client.model.curve_pool_dto import CurvePoolDTO
from openapi_client.model.curve_proposal_dto import CurveProposalDTO
from openapi_client.model.curve_proposal_vote_dto import CurveProposalVoteDTO
from openapi_client.model.curve_remove_liquidity_event_dto import CurveRemoveLiquidityEventDTO
from openapi_client.model.curve_remove_liquidity_one_event_dto import CurveRemoveLiquidityOneEventDTO
from openapi_client.model.curve_system_state_dto import CurveSystemStateDTO
from openapi_client.model.curve_token_dto import CurveTokenDTO
from openapi_client.model.curve_transfer_ownership_event_dto import CurveTransferOwnershipEventDTO
from openapi_client.model.curve_underlying_coin_dto import CurveUnderlyingCoinDTO
from openapi_client.model.curve_voting_app_dto import CurveVotingAppDTO
from openapi_client.model.curve_weekly_volume_dto import CurveWeeklyVolumeDTO
from openapi_client.model.dex_batch_dto import DexBatchDTO
from openapi_client.model.dex_deposit_dto import DexDepositDTO
from openapi_client.model.dex_order_dto import DexOrderDTO
from openapi_client.model.dex_price_dto import DexPriceDTO
from openapi_client.model.dex_solution_dto import DexSolutionDTO
from openapi_client.model.dex_stats_dto import DexStatsDTO
from openapi_client.model.dex_token_dto import DexTokenDTO
from openapi_client.model.dex_trade_dto import DexTradeDTO
from openapi_client.model.dex_user_dto import DexUserDTO
from openapi_client.model.dex_withdraw_dto import DexWithdrawDTO
from openapi_client.model.dex_withdraw_request_dto import DexWithdrawRequestDTO
from openapi_client.model.numerics_big_integer import NumericsBigInteger
from openapi_client.model.sushiswap_bundle_dto import SushiswapBundleDTO
from openapi_client.model.sushiswap_burn_dto import SushiswapBurnDTO
from openapi_client.model.sushiswap_day_data_dto import SushiswapDayDataDTO
from openapi_client.model.sushiswap_factory_dto import SushiswapFactoryDTO
from openapi_client.model.sushiswap_hour_data_dto import SushiswapHourDataDTO
from openapi_client.model.sushiswap_liquidity_position_dto import SushiswapLiquidityPositionDTO
from openapi_client.model.sushiswap_liquidity_position_snapshot_dto import SushiswapLiquidityPositionSnapshotDTO
from openapi_client.model.sushiswap_mint_dto import SushiswapMintDTO
from openapi_client.model.sushiswap_pair_dto import SushiswapPairDTO
from openapi_client.model.sushiswap_pair_day_data_dto import SushiswapPairDayDataDTO
from openapi_client.model.sushiswap_pair_hour_data_dto import SushiswapPairHourDataDTO
from openapi_client.model.sushiswap_swap_dto import SushiswapSwapDTO
from openapi_client.model.sushiswap_token_dto import SushiswapTokenDTO
from openapi_client.model.sushiswap_token_day_data_dto import SushiswapTokenDayDataDTO
from openapi_client.model.sushiswap_transaction_dto import SushiswapTransactionDTO
from openapi_client.model.sushiswap_user_dto import SushiswapUserDTO
from openapi_client.model.transactions_e_trade_aggressive_side import TransactionsETradeAggressiveSide
from openapi_client.model.uniswap_v2_bundle_v2_dto import UniswapV2BundleV2DTO
from openapi_client.model.uniswap_v2_burn_v2_dto import UniswapV2BurnV2DTO
from openapi_client.model.uniswap_v2_liquidity_position_snapshot_v2_dto import UniswapV2LiquidityPositionSnapshotV2DTO
from openapi_client.model.uniswap_v2_liquidity_position_v2_dto import UniswapV2LiquidityPositionV2DTO
from openapi_client.model.uniswap_v2_mint_v2_dto import UniswapV2MintV2DTO
from openapi_client.model.uniswap_v2_pair_day_data_v2_dto import UniswapV2PairDayDataV2DTO
from openapi_client.model.uniswap_v2_pair_hour_data_v2_dto import UniswapV2PairHourDataV2DTO
from openapi_client.model.uniswap_v2_pair_v2_dto import UniswapV2PairV2DTO
from openapi_client.model.uniswap_v2_swap_v2_dto import UniswapV2SwapV2DTO
from openapi_client.model.uniswap_v2_token_day_data_v2_dto import UniswapV2TokenDayDataV2DTO
from openapi_client.model.uniswap_v2_token_v2_dto import UniswapV2TokenV2DTO
from openapi_client.model.uniswap_v2_transaction_v2_dto import UniswapV2TransactionV2DTO
from openapi_client.model.uniswap_v2_uniswap_day_data_v2_dto import UniswapV2UniswapDayDataV2DTO
from openapi_client.model.uniswap_v2_uniswap_factory_v2_dto import UniswapV2UniswapFactoryV2DTO
from openapi_client.model.uniswap_v2_user_v2_dto import UniswapV2UserV2DTO
from openapi_client.model.uniswap_v3_bundle_v3_dto import UniswapV3BundleV3DTO
from openapi_client.model.uniswap_v3_burn_v3_dto import UniswapV3BurnV3DTO
from openapi_client.model.uniswap_v3_factory_v3_dto import UniswapV3FactoryV3DTO
from openapi_client.model.uniswap_v3_mint_v3_dto import UniswapV3MintV3DTO
from openapi_client.model.uniswap_v3_pool_day_data_v3_dto import UniswapV3PoolDayDataV3DTO
from openapi_client.model.uniswap_v3_pool_hour_data_v3_dto import UniswapV3PoolHourDataV3DTO
from openapi_client.model.uniswap_v3_pool_v3_dto import UniswapV3PoolV3DTO
from openapi_client.model.uniswap_v3_position_snapshot_v3_dto import UniswapV3PositionSnapshotV3DTO
from openapi_client.model.uniswap_v3_position_v3_dto import UniswapV3PositionV3DTO
from openapi_client.model.uniswap_v3_swap_v3_dto import UniswapV3SwapV3DTO
from openapi_client.model.uniswap_v3_tick_day_data_v3_dto import UniswapV3TickDayDataV3DTO
from openapi_client.model.uniswap_v3_tick_v3_dto import UniswapV3TickV3DTO
from openapi_client.model.uniswap_v3_token_hour_data_v3_dto import UniswapV3TokenHourDataV3DTO
from openapi_client.model.uniswap_v3_token_v3_dto import UniswapV3TokenV3DTO
from openapi_client.model.uniswap_v3_token_v3_day_data_dto import UniswapV3TokenV3DayDataDTO
from openapi_client.model.uniswap_v3_transaction_v3_dto import UniswapV3TransactionV3DTO
from openapi_client.model.uniswap_v3_uniswap_day_data_v3_dto import UniswapV3UniswapDayDataV3DTO
