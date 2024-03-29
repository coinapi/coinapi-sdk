note
 description:"[
		On Chain Dapps - REST API
 		 This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
  		The version of the OpenAPI document: v1
 	    Contact: support@coinapi.io

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class UNISWAP_V3_TICK_DAY_DATA_DTO




feature --Access

    entry_time: detachable DATE_TIME
      
    recv_time: detachable DATE_TIME
      
 	block_number: INTEGER_64
    	 -- Number of block in which entity was recorded.
    id: detachable STRING_32
      -- Identifier, format: (pool address)-(tick index)-(timestamp).
 	date: INTEGER_32
    	 -- Timestamp rounded to current day by dividing by 86400.
    pool: detachable STRING_32
      -- Pointer to pool.
    tick: detachable STRING_32
      -- Pointer to tick.
    liquidity_gross: detachable STRING_32
      -- Total liquidity pool has as tick lower or upper at end of period.
    liquidity_net: detachable STRING_32
      -- How much liquidity changes when tick crossed at end of period.
    volume_token_0: detachable STRING_32
      -- Hourly volume of token0 with this tick in range.
    volume_token_1: detachable STRING_32
      -- Hourly volume of token1 with this tick in range.
    volume_usd: detachable STRING_32
      -- Hourly volume in derived USD with this tick in range.
    fees_usd: detachable STRING_32
      -- Fees in USD.
    fee_growth_outside_0x128: detachable STRING_32
      -- Variable needed for fee computation.
    fee_growth_outside_1x128: detachable STRING_32
      -- Variable needed for fee computation.
 	vid: INTEGER_64
    	 -- 

feature -- Change Element

    set_entry_time (a_name: like entry_time)
        -- Set 'entry_time' with 'a_name'.
      do
        entry_time := a_name
      ensure
        entry_time_set: entry_time = a_name
      end

    set_recv_time (a_name: like recv_time)
        -- Set 'recv_time' with 'a_name'.
      do
        recv_time := a_name
      ensure
        recv_time_set: recv_time = a_name
      end

    set_block_number (a_name: like block_number)
        -- Set 'block_number' with 'a_name'.
      do
        block_number := a_name
      ensure
        block_number_set: block_number = a_name
      end

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_date (a_name: like date)
        -- Set 'date' with 'a_name'.
      do
        date := a_name
      ensure
        date_set: date = a_name
      end

    set_pool (a_name: like pool)
        -- Set 'pool' with 'a_name'.
      do
        pool := a_name
      ensure
        pool_set: pool = a_name
      end

    set_tick (a_name: like tick)
        -- Set 'tick' with 'a_name'.
      do
        tick := a_name
      ensure
        tick_set: tick = a_name
      end

    set_liquidity_gross (a_name: like liquidity_gross)
        -- Set 'liquidity_gross' with 'a_name'.
      do
        liquidity_gross := a_name
      ensure
        liquidity_gross_set: liquidity_gross = a_name
      end

    set_liquidity_net (a_name: like liquidity_net)
        -- Set 'liquidity_net' with 'a_name'.
      do
        liquidity_net := a_name
      ensure
        liquidity_net_set: liquidity_net = a_name
      end

    set_volume_token_0 (a_name: like volume_token_0)
        -- Set 'volume_token_0' with 'a_name'.
      do
        volume_token_0 := a_name
      ensure
        volume_token_0_set: volume_token_0 = a_name
      end

    set_volume_token_1 (a_name: like volume_token_1)
        -- Set 'volume_token_1' with 'a_name'.
      do
        volume_token_1 := a_name
      ensure
        volume_token_1_set: volume_token_1 = a_name
      end

    set_volume_usd (a_name: like volume_usd)
        -- Set 'volume_usd' with 'a_name'.
      do
        volume_usd := a_name
      ensure
        volume_usd_set: volume_usd = a_name
      end

    set_fees_usd (a_name: like fees_usd)
        -- Set 'fees_usd' with 'a_name'.
      do
        fees_usd := a_name
      ensure
        fees_usd_set: fees_usd = a_name
      end

    set_fee_growth_outside_0x128 (a_name: like fee_growth_outside_0x128)
        -- Set 'fee_growth_outside_0x128' with 'a_name'.
      do
        fee_growth_outside_0x128 := a_name
      ensure
        fee_growth_outside_0x128_set: fee_growth_outside_0x128 = a_name
      end

    set_fee_growth_outside_1x128 (a_name: like fee_growth_outside_1x128)
        -- Set 'fee_growth_outside_1x128' with 'a_name'.
      do
        fee_growth_outside_1x128 := a_name
      ensure
        fee_growth_outside_1x128_set: fee_growth_outside_1x128 = a_name
      end

    set_vid (a_name: like vid)
        -- Set 'vid' with 'a_name'.
      do
        vid := a_name
      ensure
        vid_set: vid = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass UNISWAP_V3_TICK_DAY_DATA_DTO%N")
        if attached entry_time as l_entry_time then
          Result.append ("%Nentry_time:")
          Result.append (l_entry_time.out)
          Result.append ("%N")
        end
        if attached recv_time as l_recv_time then
          Result.append ("%Nrecv_time:")
          Result.append (l_recv_time.out)
          Result.append ("%N")
        end
        if attached block_number as l_block_number then
          Result.append ("%Nblock_number:")
          Result.append (l_block_number.out)
          Result.append ("%N")
        end
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached date as l_date then
          Result.append ("%Ndate:")
          Result.append (l_date.out)
          Result.append ("%N")
        end
        if attached pool as l_pool then
          Result.append ("%Npool:")
          Result.append (l_pool.out)
          Result.append ("%N")
        end
        if attached tick as l_tick then
          Result.append ("%Ntick:")
          Result.append (l_tick.out)
          Result.append ("%N")
        end
        if attached liquidity_gross as l_liquidity_gross then
          Result.append ("%Nliquidity_gross:")
          Result.append (l_liquidity_gross.out)
          Result.append ("%N")
        end
        if attached liquidity_net as l_liquidity_net then
          Result.append ("%Nliquidity_net:")
          Result.append (l_liquidity_net.out)
          Result.append ("%N")
        end
        if attached volume_token_0 as l_volume_token_0 then
          Result.append ("%Nvolume_token_0:")
          Result.append (l_volume_token_0.out)
          Result.append ("%N")
        end
        if attached volume_token_1 as l_volume_token_1 then
          Result.append ("%Nvolume_token_1:")
          Result.append (l_volume_token_1.out)
          Result.append ("%N")
        end
        if attached volume_usd as l_volume_usd then
          Result.append ("%Nvolume_usd:")
          Result.append (l_volume_usd.out)
          Result.append ("%N")
        end
        if attached fees_usd as l_fees_usd then
          Result.append ("%Nfees_usd:")
          Result.append (l_fees_usd.out)
          Result.append ("%N")
        end
        if attached fee_growth_outside_0x128 as l_fee_growth_outside_0x128 then
          Result.append ("%Nfee_growth_outside_0x128:")
          Result.append (l_fee_growth_outside_0x128.out)
          Result.append ("%N")
        end
        if attached fee_growth_outside_1x128 as l_fee_growth_outside_1x128 then
          Result.append ("%Nfee_growth_outside_1x128:")
          Result.append (l_fee_growth_outside_1x128.out)
          Result.append ("%N")
        end
        if attached vid as l_vid then
          Result.append ("%Nvid:")
          Result.append (l_vid.out)
          Result.append ("%N")
        end
      end
end

