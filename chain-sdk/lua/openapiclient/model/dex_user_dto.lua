--[[
  On Chain Dapps - REST API

   This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

  The version of the OpenAPI document: v1
  Contact: support@coinapi.io
  Generated by: https://openapi-generator.tech
]]

-- dex_user_dto class
local dex_user_dto = {}
local dex_user_dto_mt = {
	__name = "dex_user_dto";
	__index = dex_user_dto;
}

local function cast_dex_user_dto(t)
	return setmetatable(t, dex_user_dto_mt)
end

local function new_dex_user_dto(entry_time, recv_time, block_number, id, from_batch_id, create_epoch, tx_hash, vid)
	return cast_dex_user_dto({
		["entry_time"] = entry_time;
		["recv_time"] = recv_time;
		["block_number"] = block_number;
		["id"] = id;
		["from_batch_id"] = from_batch_id;
		["create_epoch"] = create_epoch;
		["tx_hash"] = tx_hash;
		["vid"] = vid;
	})
end

return {
	cast = cast_dex_user_dto;
	new = new_dex_user_dto;
}
