--[[
  OMS - REST API .
 
  OMS Project
 
  The version of the OpenAPI document: v1
  
  Generated by: https://openapi-generator.tech
]]

-- create_order400 class
local create_order400 = {}
local create_order400_mt = {
	__name = "create_order400";
	__index = create_order400;
}

local function cast_create_order400(t)
	return setmetatable(t, create_order400_mt)
end

local function new_create_order400(type, title, status, trace_id, errors)
	return cast_create_order400({
		["type"] = type;
		["title"] = title;
		["status"] = status;
		["traceId"] = trace_id;
		["errors"] = errors;
	})
end

return {
	cast = cast_create_order400;
	new = new_create_order400;
}
