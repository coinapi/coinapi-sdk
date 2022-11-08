--[[
  OnChain API

   This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

  The version of the OpenAPI document: v1
  Contact: support@coinapi.io
  Generated by: https://openapi-generator.tech
]]

-- curve_system_state_dto class
local curve_system_state_dto = {}
local curve_system_state_dto_mt = {
	__name = "curve_system_state_dto";
	__index = curve_system_state_dto;
}

local function cast_curve_system_state_dto(t)
	return setmetatable(t, curve_system_state_dto_mt)
end

local function new_curve_system_state_dto(entry_time, recv_time, block_number, id, registry_contract, contract_count, gauge_count, gauge_type_count, pool_count, token_count, total_pool_count, updated, updated_at_block, updated_at_transaction, vid)
	return cast_curve_system_state_dto({
		["entry_time"] = entry_time;
		["recv_time"] = recv_time;
		["block_number"] = block_number;
		["id"] = id;
		["registry_contract"] = registry_contract;
		["contract_count"] = contract_count;
		["gauge_count"] = gauge_count;
		["gauge_type_count"] = gauge_type_count;
		["pool_count"] = pool_count;
		["token_count"] = token_count;
		["total_pool_count"] = total_pool_count;
		["updated"] = updated;
		["updated_at_block"] = updated_at_block;
		["updated_at_transaction"] = updated_at_transaction;
		["vid"] = vid;
	})
end

return {
	cast = cast_curve_system_state_dto;
	new = new_curve_system_state_dto;
}
