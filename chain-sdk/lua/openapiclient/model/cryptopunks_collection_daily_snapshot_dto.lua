--[[
  On Chain Dapps - REST API

   This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

  The version of the OpenAPI document: v1
  Contact: support@coinapi.io
  Generated by: https://openapi-generator.tech
]]

-- cryptopunks_collection_daily_snapshot_dto class
local cryptopunks_collection_daily_snapshot_dto = {}
local cryptopunks_collection_daily_snapshot_dto_mt = {
	__name = "cryptopunks_collection_daily_snapshot_dto";
	__index = cryptopunks_collection_daily_snapshot_dto;
}

local function cast_cryptopunks_collection_daily_snapshot_dto(t)
	return setmetatable(t, cryptopunks_collection_daily_snapshot_dto_mt)
end

local function new_cryptopunks_collection_daily_snapshot_dto(entry_time, recv_time, block_number, vid, block_range, id, collection, timestamp, royalty_fee, daily_min_sale_price, daily_max_sale_price, cumulative_trade_volume_eth, daily_trade_volume_eth, marketplace_revenue_eth, creator_revenue_eth, total_revenue_eth, trade_count, daily_traded_item_count)
	return cast_cryptopunks_collection_daily_snapshot_dto({
		["entry_time"] = entry_time;
		["recv_time"] = recv_time;
		["block_number"] = block_number;
		["vid"] = vid;
		["block_range"] = block_range;
		["id"] = id;
		["collection"] = collection;
		["timestamp"] = timestamp;
		["royalty_fee"] = royalty_fee;
		["daily_min_sale_price"] = daily_min_sale_price;
		["daily_max_sale_price"] = daily_max_sale_price;
		["cumulative_trade_volume_eth"] = cumulative_trade_volume_eth;
		["daily_trade_volume_eth"] = daily_trade_volume_eth;
		["marketplace_revenue_eth"] = marketplace_revenue_eth;
		["creator_revenue_eth"] = creator_revenue_eth;
		["total_revenue_eth"] = total_revenue_eth;
		["trade_count"] = trade_count;
		["daily_traded_item_count"] = daily_traded_item_count;
	})
end

return {
	cast = cast_cryptopunks_collection_daily_snapshot_dto;
	new = new_cryptopunks_collection_daily_snapshot_dto;
}
