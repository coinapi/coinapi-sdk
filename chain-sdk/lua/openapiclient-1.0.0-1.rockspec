package = "openapiclient"
version = "1.0.0-1"
source = {
	url = "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
}

description = {
	summary = "API client generated by OpenAPI Generator",
	detailed = [[
 This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             ]],
	homepage = "https://openapi-generator.tech",
	license = "Unlicense",
	maintainer = "OpenAPI Generator contributors",
}

dependencies = {
	"lua >= 5.2",
	"http",
	"dkjson",
	"basexx"
}

build = {
	type = "builtin",
	modules = {
		["openapiclient.api.accounts_api"] = "openapiclient/api/accounts_api.lua";
		["openapiclient.api.add_liquidity_event_api"] = "openapiclient/api/add_liquidity_event_api.lua";
		["openapiclient.api.admin_fee_change_log_api"] = "openapiclient/api/admin_fee_change_log_api.lua";
		["openapiclient.api.amplification_coeff_change_log_api"] = "openapiclient/api/amplification_coeff_change_log_api.lua";
		["openapiclient.api.batch_api"] = "openapiclient/api/batch_api.lua";
		["openapiclient.api.bundles_api"] = "openapiclient/api/bundles_api.lua";
		["openapiclient.api.burns_api"] = "openapiclient/api/burns_api.lua";
		["openapiclient.api.coins_api"] = "openapiclient/api/coins_api.lua";
		["openapiclient.api.contracts_api"] = "openapiclient/api/contracts_api.lua";
		["openapiclient.api.contracts_version_api"] = "openapiclient/api/contracts_version_api.lua";
		["openapiclient.api.daily_volume_api"] = "openapiclient/api/daily_volume_api.lua";
		["openapiclient.api.day_data_api"] = "openapiclient/api/day_data_api.lua";
		["openapiclient.api.deposit_api"] = "openapiclient/api/deposit_api.lua";
		["openapiclient.api.factory_api"] = "openapiclient/api/factory_api.lua";
		["openapiclient.api.fee_change_log_api"] = "openapiclient/api/fee_change_log_api.lua";
		["openapiclient.api.gauge_api"] = "openapiclient/api/gauge_api.lua";
		["openapiclient.api.gauge_deposit_api"] = "openapiclient/api/gauge_deposit_api.lua";
		["openapiclient.api.gauge_liquidity_api"] = "openapiclient/api/gauge_liquidity_api.lua";
		["openapiclient.api.gauge_total_weight_api"] = "openapiclient/api/gauge_total_weight_api.lua";
		["openapiclient.api.gauge_type_api"] = "openapiclient/api/gauge_type_api.lua";
		["openapiclient.api.gauge_type_weight_api"] = "openapiclient/api/gauge_type_weight_api.lua";
		["openapiclient.api.gauge_weight_api"] = "openapiclient/api/gauge_weight_api.lua";
		["openapiclient.api.gauge_weight_vote_api"] = "openapiclient/api/gauge_weight_vote_api.lua";
		["openapiclient.api.gauge_withdraw_api"] = "openapiclient/api/gauge_withdraw_api.lua";
		["openapiclient.api.hour_data_api"] = "openapiclient/api/hour_data_api.lua";
		["openapiclient.api.hourly_volume_api"] = "openapiclient/api/hourly_volume_api.lua";
		["openapiclient.api.liquidity_position_api"] = "openapiclient/api/liquidity_position_api.lua";
		["openapiclient.api.liquidity_position_snapshots_api"] = "openapiclient/api/liquidity_position_snapshots_api.lua";
		["openapiclient.api.lp_token_api"] = "openapiclient/api/lp_token_api.lua";
		["openapiclient.api.mints_api"] = "openapiclient/api/mints_api.lua";
		["openapiclient.api.orders_api"] = "openapiclient/api/orders_api.lua";
		["openapiclient.api.poi_api"] = "openapiclient/api/poi_api.lua";
		["openapiclient.api.pool_day_data_api"] = "openapiclient/api/pool_day_data_api.lua";
		["openapiclient.api.pool_hour_data_api"] = "openapiclient/api/pool_hour_data_api.lua";
		["openapiclient.api.pools_api"] = "openapiclient/api/pools_api.lua";
		["openapiclient.api.position_snapshot_api"] = "openapiclient/api/position_snapshot_api.lua";
		["openapiclient.api.positions_api"] = "openapiclient/api/positions_api.lua";
		["openapiclient.api.prices_api"] = "openapiclient/api/prices_api.lua";
		["openapiclient.api.proposals_api"] = "openapiclient/api/proposals_api.lua";
		["openapiclient.api.proposals_vote_api"] = "openapiclient/api/proposals_vote_api.lua";
		["openapiclient.api.remove_liquidity_event_api"] = "openapiclient/api/remove_liquidity_event_api.lua";
		["openapiclient.api.remove_liquidity_one_event_api"] = "openapiclient/api/remove_liquidity_one_event_api.lua";
		["openapiclient.api.settlement_api"] = "openapiclient/api/settlement_api.lua";
		["openapiclient.api.solution_api"] = "openapiclient/api/solution_api.lua";
		["openapiclient.api.stats_api"] = "openapiclient/api/stats_api.lua";
		["openapiclient.api.sushiswap_api"] = "openapiclient/api/sushiswap_api.lua";
		["openapiclient.api.swaps_api"] = "openapiclient/api/swaps_api.lua";
		["openapiclient.api.system_state_api"] = "openapiclient/api/system_state_api.lua";
		["openapiclient.api.tick_day_data_api"] = "openapiclient/api/tick_day_data_api.lua";
		["openapiclient.api.ticks_api"] = "openapiclient/api/ticks_api.lua";
		["openapiclient.api.token_day_data_api"] = "openapiclient/api/token_day_data_api.lua";
		["openapiclient.api.token_hour_data_api"] = "openapiclient/api/token_hour_data_api.lua";
		["openapiclient.api.tokens_api"] = "openapiclient/api/tokens_api.lua";
		["openapiclient.api.trades_api"] = "openapiclient/api/trades_api.lua";
		["openapiclient.api.transactions_api"] = "openapiclient/api/transactions_api.lua";
		["openapiclient.api.transfer_ownership_event_api"] = "openapiclient/api/transfer_ownership_event_api.lua";
		["openapiclient.api.underlying_coin_api"] = "openapiclient/api/underlying_coin_api.lua";
		["openapiclient.api.uniswap_day_data_api"] = "openapiclient/api/uniswap_day_data_api.lua";
		["openapiclient.api.uniswap_v2_api"] = "openapiclient/api/uniswap_v2_api.lua";
		["openapiclient.api.uniswap_v3_api"] = "openapiclient/api/uniswap_v3_api.lua";
		["openapiclient.api.users_api"] = "openapiclient/api/users_api.lua";
		["openapiclient.api.voting_app_api"] = "openapiclient/api/voting_app_api.lua";
		["openapiclient.api.weekly_volume_api"] = "openapiclient/api/weekly_volume_api.lua";
		["openapiclient.api.withdraw_api"] = "openapiclient/api/withdraw_api.lua";
		["openapiclient.api.withdraw_request_api"] = "openapiclient/api/withdraw_request_api.lua";
		["openapiclient.model.big_integer"] = "openapiclient/model/big_integer.lua";
		["openapiclient.model.bundle_v3_dto"] = "openapiclient/model/bundle_v3_dto.lua";
		["openapiclient.model.burn_v3_dto"] = "openapiclient/model/burn_v3_dto.lua";
		["openapiclient.model.e_trade_aggressive_side"] = "openapiclient/model/e_trade_aggressive_side.lua";
		["openapiclient.model.factory_v3_dto"] = "openapiclient/model/factory_v3_dto.lua";
		["openapiclient.model.mint_v3_dto"] = "openapiclient/model/mint_v3_dto.lua";
		["openapiclient.model.pair_dto"] = "openapiclient/model/pair_dto.lua";
		["openapiclient.model.pair_v2_dto"] = "openapiclient/model/pair_v2_dto.lua";
		["openapiclient.model.pool_day_data_v3_dto"] = "openapiclient/model/pool_day_data_v3_dto.lua";
		["openapiclient.model.pool_hour_data_v3_dto"] = "openapiclient/model/pool_hour_data_v3_dto.lua";
		["openapiclient.model.pool_v3_dto"] = "openapiclient/model/pool_v3_dto.lua";
		["openapiclient.model.position_snapshot_v3_dto"] = "openapiclient/model/position_snapshot_v3_dto.lua";
		["openapiclient.model.position_v3_dto"] = "openapiclient/model/position_v3_dto.lua";
		["openapiclient.model.swap_dto"] = "openapiclient/model/swap_dto.lua";
		["openapiclient.model.swap_v2_dto"] = "openapiclient/model/swap_v2_dto.lua";
		["openapiclient.model.swap_v3_dto"] = "openapiclient/model/swap_v3_dto.lua";
		["openapiclient.model.tick_day_data_v3_dto"] = "openapiclient/model/tick_day_data_v3_dto.lua";
		["openapiclient.model.tick_v3_dto"] = "openapiclient/model/tick_v3_dto.lua";
		["openapiclient.model.token_dto"] = "openapiclient/model/token_dto.lua";
		["openapiclient.model.token_hour_data_v3_dto"] = "openapiclient/model/token_hour_data_v3_dto.lua";
		["openapiclient.model.token_v2_dto"] = "openapiclient/model/token_v2_dto.lua";
		["openapiclient.model.token_v3_day_data_dto"] = "openapiclient/model/token_v3_day_data_dto.lua";
		["openapiclient.model.token_v3_dto"] = "openapiclient/model/token_v3_dto.lua";
		["openapiclient.model.uniswap_day_data_v3_dto"] = "openapiclient/model/uniswap_day_data_v3_dto.lua";
	}
}
