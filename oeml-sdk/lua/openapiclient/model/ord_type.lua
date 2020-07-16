--[[
  OEML - REST API
 
  This section will provide necessary information about the `CoinAPI OEML REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       
 
  The version of the OpenAPI document: v1
  Contact: support@coinapi.io
  Generated by: https://openapi-generator.tech
]]

-- ord_type class
local ord_type = {}
local ord_type_mt = {
	__name = "ord_type";
	__index = ord_type;
}

local function cast_ord_type(t)
	return setmetatable(t, ord_type_mt)
end

local function new_ord_type()
	return cast_ord_type({
	})
end

return {
	cast = cast_ord_type;
	new = new_ord_type;
}
