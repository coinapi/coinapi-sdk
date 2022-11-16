note
 description:"[
		OnChain API
 		 This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
  		The version of the OpenAPI document: v1
 	    Contact: support@coinapi.io

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class UNISWAP_V2_LIQUIDITY_POSITION_SNAPSHOT_V2_DTO




feature --Access

    entry_time: detachable DATE_TIME
      
    recv_time: detachable DATE_TIME
      
 	block_number: INTEGER_64
    	 -- Number of block in which entity was recorded.
    id: detachable STRING_32
      -- Identifier, format: <pair address>-<user address>
    liquidity_position: detachable STRING_32
      -- Reference to LP identifier.
 	timestamp: INTEGER_32
    	 -- Creation time.
 	block: INTEGER_32
    	 -- Number of block in which LP snapshot was recorded.
    user: detachable STRING_32
      -- Reference to user.
    pair: detachable STRING_32
      -- Reference to the pair liquidity is being provided on.
    token_0_price_usd: detachable STRING_32
      -- Snapshot of token0 price.
    token_1_price_usd: detachable STRING_32
      -- Snapshot of token0 price.
    reserve_0: detachable STRING_32
      -- Snapshot of pair token0 reserves.
    reserve_1: detachable STRING_32
      -- Snapshot of pair token1 reserves.
    reserve_usd: detachable STRING_32
      -- Snapshot of pair reserves in USD.
    liquidity_token_total_supply: detachable STRING_32
      -- Snapshot of pool token supply.
    liquidity_token_balance: detachable STRING_32
      -- Snapshot of users pool token balance.
 	vid: INTEGER_64
    	 -- 
    block_range: detachable STRING_32
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

    set_liquidity_position (a_name: like liquidity_position)
        -- Set 'liquidity_position' with 'a_name'.
      do
        liquidity_position := a_name
      ensure
        liquidity_position_set: liquidity_position = a_name
      end

    set_timestamp (a_name: like timestamp)
        -- Set 'timestamp' with 'a_name'.
      do
        timestamp := a_name
      ensure
        timestamp_set: timestamp = a_name
      end

    set_block (a_name: like block)
        -- Set 'block' with 'a_name'.
      do
        block := a_name
      ensure
        block_set: block = a_name
      end

    set_user (a_name: like user)
        -- Set 'user' with 'a_name'.
      do
        user := a_name
      ensure
        user_set: user = a_name
      end

    set_pair (a_name: like pair)
        -- Set 'pair' with 'a_name'.
      do
        pair := a_name
      ensure
        pair_set: pair = a_name
      end

    set_token_0_price_usd (a_name: like token_0_price_usd)
        -- Set 'token_0_price_usd' with 'a_name'.
      do
        token_0_price_usd := a_name
      ensure
        token_0_price_usd_set: token_0_price_usd = a_name
      end

    set_token_1_price_usd (a_name: like token_1_price_usd)
        -- Set 'token_1_price_usd' with 'a_name'.
      do
        token_1_price_usd := a_name
      ensure
        token_1_price_usd_set: token_1_price_usd = a_name
      end

    set_reserve_0 (a_name: like reserve_0)
        -- Set 'reserve_0' with 'a_name'.
      do
        reserve_0 := a_name
      ensure
        reserve_0_set: reserve_0 = a_name
      end

    set_reserve_1 (a_name: like reserve_1)
        -- Set 'reserve_1' with 'a_name'.
      do
        reserve_1 := a_name
      ensure
        reserve_1_set: reserve_1 = a_name
      end

    set_reserve_usd (a_name: like reserve_usd)
        -- Set 'reserve_usd' with 'a_name'.
      do
        reserve_usd := a_name
      ensure
        reserve_usd_set: reserve_usd = a_name
      end

    set_liquidity_token_total_supply (a_name: like liquidity_token_total_supply)
        -- Set 'liquidity_token_total_supply' with 'a_name'.
      do
        liquidity_token_total_supply := a_name
      ensure
        liquidity_token_total_supply_set: liquidity_token_total_supply = a_name
      end

    set_liquidity_token_balance (a_name: like liquidity_token_balance)
        -- Set 'liquidity_token_balance' with 'a_name'.
      do
        liquidity_token_balance := a_name
      ensure
        liquidity_token_balance_set: liquidity_token_balance = a_name
      end

    set_vid (a_name: like vid)
        -- Set 'vid' with 'a_name'.
      do
        vid := a_name
      ensure
        vid_set: vid = a_name
      end

    set_block_range (a_name: like block_range)
        -- Set 'block_range' with 'a_name'.
      do
        block_range := a_name
      ensure
        block_range_set: block_range = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass UNISWAP_V2_LIQUIDITY_POSITION_SNAPSHOT_V2_DTO%N")
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
        if attached liquidity_position as l_liquidity_position then
          Result.append ("%Nliquidity_position:")
          Result.append (l_liquidity_position.out)
          Result.append ("%N")
        end
        if attached timestamp as l_timestamp then
          Result.append ("%Ntimestamp:")
          Result.append (l_timestamp.out)
          Result.append ("%N")
        end
        if attached block as l_block then
          Result.append ("%Nblock:")
          Result.append (l_block.out)
          Result.append ("%N")
        end
        if attached user as l_user then
          Result.append ("%Nuser:")
          Result.append (l_user.out)
          Result.append ("%N")
        end
        if attached pair as l_pair then
          Result.append ("%Npair:")
          Result.append (l_pair.out)
          Result.append ("%N")
        end
        if attached token_0_price_usd as l_token_0_price_usd then
          Result.append ("%Ntoken_0_price_usd:")
          Result.append (l_token_0_price_usd.out)
          Result.append ("%N")
        end
        if attached token_1_price_usd as l_token_1_price_usd then
          Result.append ("%Ntoken_1_price_usd:")
          Result.append (l_token_1_price_usd.out)
          Result.append ("%N")
        end
        if attached reserve_0 as l_reserve_0 then
          Result.append ("%Nreserve_0:")
          Result.append (l_reserve_0.out)
          Result.append ("%N")
        end
        if attached reserve_1 as l_reserve_1 then
          Result.append ("%Nreserve_1:")
          Result.append (l_reserve_1.out)
          Result.append ("%N")
        end
        if attached reserve_usd as l_reserve_usd then
          Result.append ("%Nreserve_usd:")
          Result.append (l_reserve_usd.out)
          Result.append ("%N")
        end
        if attached liquidity_token_total_supply as l_liquidity_token_total_supply then
          Result.append ("%Nliquidity_token_total_supply:")
          Result.append (l_liquidity_token_total_supply.out)
          Result.append ("%N")
        end
        if attached liquidity_token_balance as l_liquidity_token_balance then
          Result.append ("%Nliquidity_token_balance:")
          Result.append (l_liquidity_token_balance.out)
          Result.append ("%N")
        end
        if attached vid as l_vid then
          Result.append ("%Nvid:")
          Result.append (l_vid.out)
          Result.append ("%N")
        end
        if attached block_range as l_block_range then
          Result.append ("%Nblock_range:")
          Result.append (l_block_range.out)
          Result.append ("%N")
        end
      end
end

