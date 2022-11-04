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
class UNISWAP_V3_TOKEN_V3_DAY_DATA_DTO




feature --Access

    entry_time: detachable DATE_TIME
      
    recv_time: detachable DATE_TIME
      
 	block_number: INTEGER_64
    	 -- Number of block in which entity was recorded.
 	vid: INTEGER_64
    	 -- 
    id: detachable STRING_32
      -- Token address concatendated with date.
 	date: INTEGER_32
    	 -- Timestamp rounded to current day by dividing by 86400.
    token: detachable STRING_32
      -- Pointer to token.
    volume: detachable STRING_32
      -- Volume in token units.
    volume_usd: detachable STRING_32
      -- Volume in derived USD.
    untracked_volume_usd: detachable STRING_32
      -- Volume in USD even on pools with less reliable USD values.
    total_value_locked: detachable STRING_32
      -- Liquidity across all pools in token units.
    total_value_locked_usd: detachable STRING_32
      -- Liquidity across all pools in derived USD.
    price_usd: detachable STRING_32
      -- Price at end of period in USD.
    fees_usd: detachable STRING_32
      -- Fees in USD.
    open: detachable STRING_32
      -- Opening price USD.
    high: detachable STRING_32
      -- High price USD.
    low: detachable STRING_32
      -- Low price USD.
    close: detachable STRING_32
      -- Close price USD.

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

    set_vid (a_name: like vid)
        -- Set 'vid' with 'a_name'.
      do
        vid := a_name
      ensure
        vid_set: vid = a_name
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

    set_token (a_name: like token)
        -- Set 'token' with 'a_name'.
      do
        token := a_name
      ensure
        token_set: token = a_name
      end

    set_volume (a_name: like volume)
        -- Set 'volume' with 'a_name'.
      do
        volume := a_name
      ensure
        volume_set: volume = a_name
      end

    set_volume_usd (a_name: like volume_usd)
        -- Set 'volume_usd' with 'a_name'.
      do
        volume_usd := a_name
      ensure
        volume_usd_set: volume_usd = a_name
      end

    set_untracked_volume_usd (a_name: like untracked_volume_usd)
        -- Set 'untracked_volume_usd' with 'a_name'.
      do
        untracked_volume_usd := a_name
      ensure
        untracked_volume_usd_set: untracked_volume_usd = a_name
      end

    set_total_value_locked (a_name: like total_value_locked)
        -- Set 'total_value_locked' with 'a_name'.
      do
        total_value_locked := a_name
      ensure
        total_value_locked_set: total_value_locked = a_name
      end

    set_total_value_locked_usd (a_name: like total_value_locked_usd)
        -- Set 'total_value_locked_usd' with 'a_name'.
      do
        total_value_locked_usd := a_name
      ensure
        total_value_locked_usd_set: total_value_locked_usd = a_name
      end

    set_price_usd (a_name: like price_usd)
        -- Set 'price_usd' with 'a_name'.
      do
        price_usd := a_name
      ensure
        price_usd_set: price_usd = a_name
      end

    set_fees_usd (a_name: like fees_usd)
        -- Set 'fees_usd' with 'a_name'.
      do
        fees_usd := a_name
      ensure
        fees_usd_set: fees_usd = a_name
      end

    set_open (a_name: like open)
        -- Set 'open' with 'a_name'.
      do
        open := a_name
      ensure
        open_set: open = a_name
      end

    set_high (a_name: like high)
        -- Set 'high' with 'a_name'.
      do
        high := a_name
      ensure
        high_set: high = a_name
      end

    set_low (a_name: like low)
        -- Set 'low' with 'a_name'.
      do
        low := a_name
      ensure
        low_set: low = a_name
      end

    set_close (a_name: like close)
        -- Set 'close' with 'a_name'.
      do
        close := a_name
      ensure
        close_set: close = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass UNISWAP_V3_TOKEN_V3_DAY_DATA_DTO%N")
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
        if attached vid as l_vid then
          Result.append ("%Nvid:")
          Result.append (l_vid.out)
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
        if attached token as l_token then
          Result.append ("%Ntoken:")
          Result.append (l_token.out)
          Result.append ("%N")
        end
        if attached volume as l_volume then
          Result.append ("%Nvolume:")
          Result.append (l_volume.out)
          Result.append ("%N")
        end
        if attached volume_usd as l_volume_usd then
          Result.append ("%Nvolume_usd:")
          Result.append (l_volume_usd.out)
          Result.append ("%N")
        end
        if attached untracked_volume_usd as l_untracked_volume_usd then
          Result.append ("%Nuntracked_volume_usd:")
          Result.append (l_untracked_volume_usd.out)
          Result.append ("%N")
        end
        if attached total_value_locked as l_total_value_locked then
          Result.append ("%Ntotal_value_locked:")
          Result.append (l_total_value_locked.out)
          Result.append ("%N")
        end
        if attached total_value_locked_usd as l_total_value_locked_usd then
          Result.append ("%Ntotal_value_locked_usd:")
          Result.append (l_total_value_locked_usd.out)
          Result.append ("%N")
        end
        if attached price_usd as l_price_usd then
          Result.append ("%Nprice_usd:")
          Result.append (l_price_usd.out)
          Result.append ("%N")
        end
        if attached fees_usd as l_fees_usd then
          Result.append ("%Nfees_usd:")
          Result.append (l_fees_usd.out)
          Result.append ("%N")
        end
        if attached open as l_open then
          Result.append ("%Nopen:")
          Result.append (l_open.out)
          Result.append ("%N")
        end
        if attached high as l_high then
          Result.append ("%Nhigh:")
          Result.append (l_high.out)
          Result.append ("%N")
        end
        if attached low as l_low then
          Result.append ("%Nlow:")
          Result.append (l_low.out)
          Result.append ("%N")
        end
        if attached close as l_close then
          Result.append ("%Nclose:")
          Result.append (l_close.out)
          Result.append ("%N")
        end
      end
end

