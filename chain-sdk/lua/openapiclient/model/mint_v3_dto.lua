--[[
  OnChain API

   This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

  The version of the OpenAPI document: v1
  Contact: support@coinapi.io
  Generated by: https://openapi-generator.tech
]]

-- mint_v3_dto class
local mint_v3_dto = {}
local mint_v3_dto_mt = {
	__name = "mint_v3_dto";
	__index = mint_v3_dto;
}

local function cast_mint_v3_dto(t)
	return setmetatable(t, mint_v3_dto_mt)
end

local function new_mint_v3_dto(entry_time, recv_time, block_number, id, transaction, timestamp, pool, token_0, token_1, owner, sender, origin, amount, amount_0, amount_1, amount_usd, tick_lower, tick_upper, log_index, vid)
	return cast_mint_v3_dto({
		["entry_time"] = entry_time;
		["recv_time"] = recv_time;
		["block_number"] = block_number;
		["id"] = id;
		["transaction"] = transaction;
		["timestamp"] = timestamp;
		["pool"] = pool;
		["token_0"] = token_0;
		["token_1"] = token_1;
		["owner"] = owner;
		["sender"] = sender;
		["origin"] = origin;
		["amount"] = amount;
		["amount_0"] = amount_0;
		["amount_1"] = amount_1;
		["amount_usd"] = amount_usd;
		["tick_lower"] = tick_lower;
		["tick_upper"] = tick_upper;
		["log_index"] = log_index;
		["vid"] = vid;
	})
end

return {
	cast = cast_mint_v3_dto;
	new = new_mint_v3_dto;
}