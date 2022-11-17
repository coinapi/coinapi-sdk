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
class UNISWAP_V2_TOKEN_DAY_DATA_DTO




feature --Access

    entry_time: detachable DATE_TIME
      
    recv_time: detachable DATE_TIME
      
 	block_number: INTEGER_64
    	 -- Number of block in which entity was recorded.
    id: detachable STRING_32
      -- Token address and day id (day start timestamp in unix / 86400) concatenated with a dash.
 	date: INTEGER_32
    	 -- Unix timestamp for start of day.
    token: detachable STRING_32
      -- Reference to token entity.
    daily_volume_token: detachable STRING_32
      -- Amount of token swapped across all pairs throughout day.
    daily_volume_eth: detachable STRING_32
      -- Amount of token swapped across all pairs throughout day stored as a derived amount of ETH.
    daily_volume_usd: detachable STRING_32
      -- Amount of token swapped across all pairs throughout day stored as a derived amount of USD.
    daily_txns: detachable STRING_32
      -- Amount of transactions with this token across all pairs.
    total_liquidity_token: detachable STRING_32
      -- Token amount of token deposited across all pairs.
    total_liquidity_eth: detachable STRING_32
      -- Token amount of token deposited across all pairs stored as amount of ETH.
    total_liquidity_usd: detachable STRING_32
      -- Token amount of token deposited across all pairs stored as amount of USD.
    price_usd: detachable STRING_32
      -- Price of token in derived USD.
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

    set_token (a_name: like token)
        -- Set 'token' with 'a_name'.
      do
        token := a_name
      ensure
        token_set: token = a_name
      end

    set_daily_volume_token (a_name: like daily_volume_token)
        -- Set 'daily_volume_token' with 'a_name'.
      do
        daily_volume_token := a_name
      ensure
        daily_volume_token_set: daily_volume_token = a_name
      end

    set_daily_volume_eth (a_name: like daily_volume_eth)
        -- Set 'daily_volume_eth' with 'a_name'.
      do
        daily_volume_eth := a_name
      ensure
        daily_volume_eth_set: daily_volume_eth = a_name
      end

    set_daily_volume_usd (a_name: like daily_volume_usd)
        -- Set 'daily_volume_usd' with 'a_name'.
      do
        daily_volume_usd := a_name
      ensure
        daily_volume_usd_set: daily_volume_usd = a_name
      end

    set_daily_txns (a_name: like daily_txns)
        -- Set 'daily_txns' with 'a_name'.
      do
        daily_txns := a_name
      ensure
        daily_txns_set: daily_txns = a_name
      end

    set_total_liquidity_token (a_name: like total_liquidity_token)
        -- Set 'total_liquidity_token' with 'a_name'.
      do
        total_liquidity_token := a_name
      ensure
        total_liquidity_token_set: total_liquidity_token = a_name
      end

    set_total_liquidity_eth (a_name: like total_liquidity_eth)
        -- Set 'total_liquidity_eth' with 'a_name'.
      do
        total_liquidity_eth := a_name
      ensure
        total_liquidity_eth_set: total_liquidity_eth = a_name
      end

    set_total_liquidity_usd (a_name: like total_liquidity_usd)
        -- Set 'total_liquidity_usd' with 'a_name'.
      do
        total_liquidity_usd := a_name
      ensure
        total_liquidity_usd_set: total_liquidity_usd = a_name
      end

    set_price_usd (a_name: like price_usd)
        -- Set 'price_usd' with 'a_name'.
      do
        price_usd := a_name
      ensure
        price_usd_set: price_usd = a_name
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
        Result.append("%Nclass UNISWAP_V2_TOKEN_DAY_DATA_DTO%N")
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
        if attached token as l_token then
          Result.append ("%Ntoken:")
          Result.append (l_token.out)
          Result.append ("%N")
        end
        if attached daily_volume_token as l_daily_volume_token then
          Result.append ("%Ndaily_volume_token:")
          Result.append (l_daily_volume_token.out)
          Result.append ("%N")
        end
        if attached daily_volume_eth as l_daily_volume_eth then
          Result.append ("%Ndaily_volume_eth:")
          Result.append (l_daily_volume_eth.out)
          Result.append ("%N")
        end
        if attached daily_volume_usd as l_daily_volume_usd then
          Result.append ("%Ndaily_volume_usd:")
          Result.append (l_daily_volume_usd.out)
          Result.append ("%N")
        end
        if attached daily_txns as l_daily_txns then
          Result.append ("%Ndaily_txns:")
          Result.append (l_daily_txns.out)
          Result.append ("%N")
        end
        if attached total_liquidity_token as l_total_liquidity_token then
          Result.append ("%Ntotal_liquidity_token:")
          Result.append (l_total_liquidity_token.out)
          Result.append ("%N")
        end
        if attached total_liquidity_eth as l_total_liquidity_eth then
          Result.append ("%Ntotal_liquidity_eth:")
          Result.append (l_total_liquidity_eth.out)
          Result.append ("%N")
        end
        if attached total_liquidity_usd as l_total_liquidity_usd then
          Result.append ("%Ntotal_liquidity_usd:")
          Result.append (l_total_liquidity_usd.out)
          Result.append ("%N")
        end
        if attached price_usd as l_price_usd then
          Result.append ("%Nprice_usd:")
          Result.append (l_price_usd.out)
          Result.append ("%N")
        end
        if attached vid as l_vid then
          Result.append ("%Nvid:")
          Result.append (l_vid.out)
          Result.append ("%N")
        end
      end
end

