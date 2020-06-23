--[[
  OMS - REST API .
 
  OMS Project
 
  The version of the OpenAPI document: v1
  
  Generated by: https://openapi-generator.tech
]]

-- cancel_all_order class
local cancel_all_order = {}
local cancel_all_order_mt = {
	__name = "cancel_all_order";
	__index = cancel_all_order;
}

local function cast_cancel_all_order(t)
	return setmetatable(t, cancel_all_order_mt)
end

local function new_cancel_all_order(exchange_id)
	return cast_cancel_all_order({
		["exchange_id"] = exchange_id;
	})
end

return {
	cast = cast_cancel_all_order;
	new = new_cancel_all_order;
}
