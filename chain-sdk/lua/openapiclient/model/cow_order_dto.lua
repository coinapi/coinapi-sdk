--[[
  On Chain Dapps - REST API

   This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

  The version of the OpenAPI document: v1
  Contact: support@coinapi.io
  Generated by: https://openapi-generator.tech
]]

-- cow_order_dto class
local cow_order_dto = {}
local cow_order_dto_mt = {
	__name = "cow_order_dto";
	__index = cow_order_dto;
}

local function cast_cow_order_dto(t)
	return setmetatable(t, cow_order_dto_mt)
end

local function new_cow_order_dto(entry_time, recv_time, block_number, id, owner, trades_timestamp, invalidate_timestamp, presign_timestamp, is_signed, is_valid, vid)
	return cast_cow_order_dto({
		["entry_time"] = entry_time;
		["recv_time"] = recv_time;
		["block_number"] = block_number;
		["id"] = id;
		["owner"] = owner;
		["trades_timestamp"] = trades_timestamp;
		["invalidate_timestamp"] = invalidate_timestamp;
		["presign_timestamp"] = presign_timestamp;
		["is_signed"] = is_signed;
		["is_valid"] = is_valid;
		["vid"] = vid;
	})
end

return {
	cast = cast_cow_order_dto;
	new = new_cow_order_dto;
}
