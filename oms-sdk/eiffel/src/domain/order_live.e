note
 description:"[
		OMS - REST API .
 		OMS Project
  		The version of the OpenAPI document: v1
 	    

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class ORDER_LIVE 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    type: detachable STRING_32 
      -- Result type name
    exchange_id: detachable STRING_32 
      -- Exchange name
    id: detachable STRING_32 
      -- Client unique identifier for the trade.
    client_order_id_format_exchange: detachable STRING_32 
      -- Hash client id
    exchange_order_id: detachable STRING_32 
      -- Exchange order id
    amount_open: REAL_32 
      -- Amount open
    amount_filled: REAL_32 
      -- Amount filled
    status: detachable ORDER_STATUS 
      
    time_order: detachable LIST [LIST [STRING_32]] 
      -- History of order status changes
    error_message: detachable STRING_32 
      -- Error message
    client_order_id: detachable STRING_32 
      -- Client unique identifier for the trade.
    symbol_exchange: detachable STRING_32 
      -- The symbol of the order.
    symbol_coinapi: detachable STRING_32 
      -- The CoinAPI symbol of the order.
    amount_order: REAL_32 
      -- Quoted decimal amount to purchase.
    price: REAL_32 
      -- Quoted decimal amount to spend per unit.
    side: detachable STRING_32 
      -- Buy or Sell
    order_type: detachable STRING_32 
      -- The order type.
    time_in_force: detachable TIME_IN_FORCE 
      
    expire_time: detachable DATE 
      -- Required for orders with time_in_force = GOOD_TILL_TIME_EXCHANGE, GOOD_TILL_TIME_OMS
    exec_inst: detachable LIST [STRING_32] 
      -- TODO: description exec inst  | Parameter | Description | |-----------|--------| | `MAKER_OR_CANCEL` | Rests on the continuous order book at a specified price. If any quantity can be filled immediately, the entire order is canceled. | ##### Exec inst options  | Exchange | MAKER_OR_CANCEL | | --- | --- | | BINANCE | X | | BITFINEX | X | | BITMEX | X | | BLOCKCHAINEXCHANGE | X | | BITSTAMP |  | | COINBASE | X | | GEMINI | X | | KRAKEN | X | | POLONIEX | X | | HITBTC |  | | KRAKENFTS | X | 

feature -- Change Element  
 
    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name		
      end

    set_exchange_id (a_name: like exchange_id)
        -- Set 'exchange_id' with 'a_name'.
      do
        exchange_id := a_name
      ensure
        exchange_id_set: exchange_id = a_name		
      end

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name		
      end

    set_client_order_id_format_exchange (a_name: like client_order_id_format_exchange)
        -- Set 'client_order_id_format_exchange' with 'a_name'.
      do
        client_order_id_format_exchange := a_name
      ensure
        client_order_id_format_exchange_set: client_order_id_format_exchange = a_name		
      end

    set_exchange_order_id (a_name: like exchange_order_id)
        -- Set 'exchange_order_id' with 'a_name'.
      do
        exchange_order_id := a_name
      ensure
        exchange_order_id_set: exchange_order_id = a_name		
      end

    set_amount_open (a_name: like amount_open)
        -- Set 'amount_open' with 'a_name'.
      do
        amount_open := a_name
      ensure
        amount_open_set: amount_open = a_name		
      end

    set_amount_filled (a_name: like amount_filled)
        -- Set 'amount_filled' with 'a_name'.
      do
        amount_filled := a_name
      ensure
        amount_filled_set: amount_filled = a_name		
      end

    set_status (a_name: like status)
        -- Set 'status' with 'a_name'.
      do
        status := a_name
      ensure
        status_set: status = a_name		
      end

    set_time_order (a_name: like time_order)
        -- Set 'time_order' with 'a_name'.
      do
        time_order := a_name
      ensure
        time_order_set: time_order = a_name		
      end

    set_error_message (a_name: like error_message)
        -- Set 'error_message' with 'a_name'.
      do
        error_message := a_name
      ensure
        error_message_set: error_message = a_name		
      end

    set_client_order_id (a_name: like client_order_id)
        -- Set 'client_order_id' with 'a_name'.
      do
        client_order_id := a_name
      ensure
        client_order_id_set: client_order_id = a_name		
      end

    set_symbol_exchange (a_name: like symbol_exchange)
        -- Set 'symbol_exchange' with 'a_name'.
      do
        symbol_exchange := a_name
      ensure
        symbol_exchange_set: symbol_exchange = a_name		
      end

    set_symbol_coinapi (a_name: like symbol_coinapi)
        -- Set 'symbol_coinapi' with 'a_name'.
      do
        symbol_coinapi := a_name
      ensure
        symbol_coinapi_set: symbol_coinapi = a_name		
      end

    set_amount_order (a_name: like amount_order)
        -- Set 'amount_order' with 'a_name'.
      do
        amount_order := a_name
      ensure
        amount_order_set: amount_order = a_name		
      end

    set_price (a_name: like price)
        -- Set 'price' with 'a_name'.
      do
        price := a_name
      ensure
        price_set: price = a_name		
      end

    set_side (a_name: like side)
        -- Set 'side' with 'a_name'.
      do
        side := a_name
      ensure
        side_set: side = a_name		
      end

    set_order_type (a_name: like order_type)
        -- Set 'order_type' with 'a_name'.
      do
        order_type := a_name
      ensure
        order_type_set: order_type = a_name		
      end

    set_time_in_force (a_name: like time_in_force)
        -- Set 'time_in_force' with 'a_name'.
      do
        time_in_force := a_name
      ensure
        time_in_force_set: time_in_force = a_name		
      end

    set_expire_time (a_name: like expire_time)
        -- Set 'expire_time' with 'a_name'.
      do
        expire_time := a_name
      ensure
        expire_time_set: expire_time = a_name		
      end

    set_exec_inst (a_name: like exec_inst)
        -- Set 'exec_inst' with 'a_name'.
      do
        exec_inst := a_name
      ensure
        exec_inst_set: exec_inst = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass ORDER_LIVE%N")
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")    
        end  
        if attached exchange_id as l_exchange_id then
          Result.append ("%Nexchange_id:")
          Result.append (l_exchange_id.out)
          Result.append ("%N")    
        end  
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")    
        end  
        if attached client_order_id_format_exchange as l_client_order_id_format_exchange then
          Result.append ("%Nclient_order_id_format_exchange:")
          Result.append (l_client_order_id_format_exchange.out)
          Result.append ("%N")    
        end  
        if attached exchange_order_id as l_exchange_order_id then
          Result.append ("%Nexchange_order_id:")
          Result.append (l_exchange_order_id.out)
          Result.append ("%N")    
        end  
        if attached amount_open as l_amount_open then
          Result.append ("%Namount_open:")
          Result.append (l_amount_open.out)
          Result.append ("%N")    
        end  
        if attached amount_filled as l_amount_filled then
          Result.append ("%Namount_filled:")
          Result.append (l_amount_filled.out)
          Result.append ("%N")    
        end  
        if attached status as l_status then
          Result.append ("%Nstatus:")
          Result.append (l_status.out)
          Result.append ("%N")    
        end  
        if attached time_order as l_time_order then
          across l_time_order as ic loop
            Result.append ("%N time_order:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached error_message as l_error_message then
          Result.append ("%Nerror_message:")
          Result.append (l_error_message.out)
          Result.append ("%N")    
        end  
        if attached client_order_id as l_client_order_id then
          Result.append ("%Nclient_order_id:")
          Result.append (l_client_order_id.out)
          Result.append ("%N")    
        end  
        if attached symbol_exchange as l_symbol_exchange then
          Result.append ("%Nsymbol_exchange:")
          Result.append (l_symbol_exchange.out)
          Result.append ("%N")    
        end  
        if attached symbol_coinapi as l_symbol_coinapi then
          Result.append ("%Nsymbol_coinapi:")
          Result.append (l_symbol_coinapi.out)
          Result.append ("%N")    
        end  
        if attached amount_order as l_amount_order then
          Result.append ("%Namount_order:")
          Result.append (l_amount_order.out)
          Result.append ("%N")    
        end  
        if attached price as l_price then
          Result.append ("%Nprice:")
          Result.append (l_price.out)
          Result.append ("%N")    
        end  
        if attached side as l_side then
          Result.append ("%Nside:")
          Result.append (l_side.out)
          Result.append ("%N")    
        end  
        if attached order_type as l_order_type then
          Result.append ("%Norder_type:")
          Result.append (l_order_type.out)
          Result.append ("%N")    
        end  
        if attached time_in_force as l_time_in_force then
          Result.append ("%Ntime_in_force:")
          Result.append (l_time_in_force.out)
          Result.append ("%N")    
        end  
        if attached expire_time as l_expire_time then
          Result.append ("%Nexpire_time:")
          Result.append (l_expire_time.out)
          Result.append ("%N")    
        end  
        if attached exec_inst as l_exec_inst then
          across l_exec_inst as ic loop
            Result.append ("%N exec_inst:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
      end
end


