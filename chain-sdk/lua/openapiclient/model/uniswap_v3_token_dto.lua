--[[
  OnChain API

   This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

  The version of the OpenAPI document: v1
  Contact: support@coinapi.io
  Generated by: https://openapi-generator.tech
]]

-- uniswap_v3_token_dto class
local uniswap_v3_token_dto = {}
local uniswap_v3_token_dto_mt = {
	__name = "uniswap_v3_token_dto";
	__index = uniswap_v3_token_dto;
}

local function cast_uniswap_v3_token_dto(t)
	return setmetatable(t, uniswap_v3_token_dto_mt)
end

local function new_uniswap_v3_token_dto(entry_time, recv_time, block_number, vid, id, symbol, name, decimals, total_supply, volume, volume_usd, untracked_volume_usd, fees_usd, tx_count, pool_count, total_value_locked, total_value_locked_usd, total_value_locked_usd_untracked, derived_eth, whitelist_pools, token_symbol)
	return cast_uniswap_v3_token_dto({
		["entry_time"] = entry_time;
		["recv_time"] = recv_time;
		["block_number"] = block_number;
		["vid"] = vid;
		["id"] = id;
		["symbol"] = symbol;
		["name"] = name;
		["decimals"] = decimals;
		["total_supply"] = total_supply;
		["volume"] = volume;
		["volume_usd"] = volume_usd;
		["untracked_volume_usd"] = untracked_volume_usd;
		["fees_usd"] = fees_usd;
		["tx_count"] = tx_count;
		["pool_count"] = pool_count;
		["total_value_locked"] = total_value_locked;
		["total_value_locked_usd"] = total_value_locked_usd;
		["total_value_locked_usd_untracked"] = total_value_locked_usd_untracked;
		["derived_eth"] = derived_eth;
		["whitelist_pools"] = whitelist_pools;
		["token_symbol"] = token_symbol;
	})
end

return {
	cast = cast_uniswap_v3_token_dto;
	new = new_uniswap_v3_token_dto;
}
