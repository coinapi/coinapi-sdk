note
 description:"[
		EMS - REST API
 		This section will provide necessary information about the `CoinAPI EMS REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>        Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints  <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this: `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
  		The version of the OpenAPI document: v1
 	    Contact: support@coinapi.io

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class ORDER_NEW_SINGLE_REQUEST




feature --Access

    exchange_id: detachable STRING_32
      -- Exchange identifier used to identify the routing destination.
    client_order_id: detachable STRING_32
      -- The unique identifier of the order assigned by the client.
    symbol_id_exchange: detachable STRING_32
      -- Exchange symbol. One of the properties (`symbol_id_exchange`, `symbol_id_coinapi`) is required to identify the market for the new order.
    symbol_id_coinapi: detachable STRING_32
      -- CoinAPI symbol. One of the properties (`symbol_id_exchange`, `symbol_id_coinapi`) is required to identify the market for the new order.
 	amount_order: REAL_32
    	 -- Order quantity.
 	price: REAL_32
    	 -- Order price.
    side: detachable ORD_SIDE
      
    order_type: detachable ORD_TYPE
      
    time_in_force: detachable TIME_IN_FORCE
      
    expire_time: detachable DATE
      -- Expiration time. Conditionaly required for orders with time_in_force = `GOOD_TILL_TIME_EXCHANGE` or `GOOD_TILL_TIME_OEML`.
    exec_inst: detachable LIST [STRING_32]
      -- Order execution instructions are documented in the separate section: <a href=\"#ems-order-params-exec\">EMS / Starter Guide / Order parameters / Execution instructions</a> 

feature -- Change Element

    set_exchange_id (a_name: like exchange_id)
        -- Set 'exchange_id' with 'a_name'.
      do
        exchange_id := a_name
      ensure
        exchange_id_set: exchange_id = a_name
      end

    set_client_order_id (a_name: like client_order_id)
        -- Set 'client_order_id' with 'a_name'.
      do
        client_order_id := a_name
      ensure
        client_order_id_set: client_order_id = a_name
      end

    set_symbol_id_exchange (a_name: like symbol_id_exchange)
        -- Set 'symbol_id_exchange' with 'a_name'.
      do
        symbol_id_exchange := a_name
      ensure
        symbol_id_exchange_set: symbol_id_exchange = a_name
      end

    set_symbol_id_coinapi (a_name: like symbol_id_coinapi)
        -- Set 'symbol_id_coinapi' with 'a_name'.
      do
        symbol_id_coinapi := a_name
      ensure
        symbol_id_coinapi_set: symbol_id_coinapi = a_name
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

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass ORDER_NEW_SINGLE_REQUEST%N")
        if attached exchange_id as l_exchange_id then
          Result.append ("%Nexchange_id:")
          Result.append (l_exchange_id.out)
          Result.append ("%N")
        end
        if attached client_order_id as l_client_order_id then
          Result.append ("%Nclient_order_id:")
          Result.append (l_client_order_id.out)
          Result.append ("%N")
        end
        if attached symbol_id_exchange as l_symbol_id_exchange then
          Result.append ("%Nsymbol_id_exchange:")
          Result.append (l_symbol_id_exchange.out)
          Result.append ("%N")
        end
        if attached symbol_id_coinapi as l_symbol_id_coinapi then
          Result.append ("%Nsymbol_id_coinapi:")
          Result.append (l_symbol_id_coinapi.out)
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

