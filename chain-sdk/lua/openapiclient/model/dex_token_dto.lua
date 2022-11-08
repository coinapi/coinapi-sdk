--[[
  OnChain API

   This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

  The version of the OpenAPI document: v1
  Contact: support@coinapi.io
  Generated by: https://openapi-generator.tech
]]

-- dex_token_dto class
local dex_token_dto = {}
local dex_token_dto_mt = {
	__name = "dex_token_dto";
	__index = dex_token_dto;
}

local function cast_dex_token_dto(t)
	return setmetatable(t, dex_token_dto_mt)
end

local function new_dex_token_dto(entry_time, recv_time, block_number, id, address, from_batch_id, symbol, decimals, name, sell_volume, create_epoch, tx_hash, vid, token_symbol)
	return cast_dex_token_dto({
		["entry_time"] = entry_time;
		["recv_time"] = recv_time;
		["block_number"] = block_number;
		["id"] = id;
		["address"] = address;
		["from_batch_id"] = from_batch_id;
		["symbol"] = symbol;
		["decimals"] = decimals;
		["name"] = name;
		["sell_volume"] = sell_volume;
		["create_epoch"] = create_epoch;
		["tx_hash"] = tx_hash;
		["vid"] = vid;
		["token_symbol"] = token_symbol;
	})
end

return {
	cast = cast_dex_token_dto;
	new = new_dex_token_dto;
}
