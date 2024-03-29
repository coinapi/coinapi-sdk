--[[
  On Chain Dapps - REST API

   This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

  The version of the OpenAPI document: v1
  Contact: support@coinapi.io
  Generated by: https://openapi-generator.tech
]]

-- uniswap_v3_pool_dto class
local uniswap_v3_pool_dto = {}
local uniswap_v3_pool_dto_mt = {
	__name = "uniswap_v3_pool_dto";
	__index = uniswap_v3_pool_dto;
}

local function cast_uniswap_v3_pool_dto(t)
	return setmetatable(t, uniswap_v3_pool_dto_mt)
end

local function new_uniswap_v3_pool_dto(entry_time, recv_time, block_number, vid, id, created_at_timestamp, token_0, token_1, fee_tier, liquidity, sqrt_price, fee_growth_global_0x128, fee_growth_global_1x128, token_0_price, token_1_price, tick, observation_index, volume_token_0, volume_token_1, volume_usd, untracked_volume_usd, fees_usd, tx_count, collected_fees_token_0, collected_fees_token_1, collected_fees_usd, total_value_locked_token_0, total_value_locked_token_1, total_value_locked_eth, total_value_locked_usd, total_value_locked_usd_untracked, liquidity_provider_count, evaluated_ask)
	return cast_uniswap_v3_pool_dto({
		["entry_time"] = entry_time;
		["recv_time"] = recv_time;
		["block_number"] = block_number;
		["vid"] = vid;
		["id"] = id;
		["created_at_timestamp"] = created_at_timestamp;
		["token_0"] = token_0;
		["token_1"] = token_1;
		["fee_tier"] = fee_tier;
		["liquidity"] = liquidity;
		["sqrt_price"] = sqrt_price;
		["fee_growth_global_0x128"] = fee_growth_global_0x128;
		["fee_growth_global_1x128"] = fee_growth_global_1x128;
		["token_0_price"] = token_0_price;
		["token_1_price"] = token_1_price;
		["tick"] = tick;
		["observation_index"] = observation_index;
		["volume_token_0"] = volume_token_0;
		["volume_token_1"] = volume_token_1;
		["volume_usd"] = volume_usd;
		["untracked_volume_usd"] = untracked_volume_usd;
		["fees_usd"] = fees_usd;
		["tx_count"] = tx_count;
		["collected_fees_token_0"] = collected_fees_token_0;
		["collected_fees_token_1"] = collected_fees_token_1;
		["collected_fees_usd"] = collected_fees_usd;
		["total_value_locked_token_0"] = total_value_locked_token_0;
		["total_value_locked_token_1"] = total_value_locked_token_1;
		["total_value_locked_eth"] = total_value_locked_eth;
		["total_value_locked_usd"] = total_value_locked_usd;
		["total_value_locked_usd_untracked"] = total_value_locked_usd_untracked;
		["liquidity_provider_count"] = liquidity_provider_count;
		["evaluated_ask"] = evaluated_ask;
	})
end

return {
	cast = cast_uniswap_v3_pool_dto;
	new = new_uniswap_v3_pool_dto;
}
