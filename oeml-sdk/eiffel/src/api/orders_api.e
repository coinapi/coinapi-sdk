note
 description:"[
		OEML - REST API
 		This section will provide necessary information about the `CoinAPI OEML REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       
  		The version of the OpenAPI document: v1
 	    Contact: support@coinapi.io

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"

class
	ORDERS_API

inherit

    API_I


feature -- API Access


	v1_orders_cancel_all_post (order_cancel_all_request: ORDER_CANCEL_ALL_REQUEST): detachable MESSAGE
			-- Cancel all orders request
			-- This request cancels all open orders on single specified exchange.
			-- 
			-- argument: order_cancel_all_request OrderCancelAllRequest object. (required)
			-- 
			-- 
			-- Result MESSAGE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(order_cancel_all_request)
			l_path := "/v1/orders/cancel/all"


			if attached {STRING} api_client.select_header_accept (<<"application/json", "appliction/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { MESSAGE } l_response.data ({ MESSAGE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	v1_orders_cancel_post (order_cancel_single_request: ORDER_CANCEL_SINGLE_REQUEST): detachable ORDER_EXECUTION_REPORT
			-- Cancel order request
			-- Request cancel for an existing order. The order can be canceled using the &#x60;client_order_id&#x60; or &#x60;exchange_order_id&#x60;.
			-- 
			-- argument: order_cancel_single_request OrderCancelSingleRequest object. (required)
			-- 
			-- 
			-- Result ORDER_EXECUTION_REPORT
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(order_cancel_single_request)
			l_path := "/v1/orders/cancel"


			if attached {STRING} api_client.select_header_accept (<<"application/json", "appliction/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { ORDER_EXECUTION_REPORT } l_response.data ({ ORDER_EXECUTION_REPORT }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	v1_orders_get (exchange_id: STRING_32): detachable LIST [ORDER_EXECUTION_REPORT]
			-- Get open orders
			-- Get last execution reports for open orders across all or single exchange.
			-- 
			-- argument: exchange_id Filter the open orders to the specific exchange. (optional, default to null)
			-- 
			-- 
			-- Result LIST [ORDER_EXECUTION_REPORT]
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/v1/orders"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "exchange_id", exchange_id));


			if attached {STRING} api_client.select_header_accept (<<"application/json", "appliction/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { LIST [ORDER_EXECUTION_REPORT] } l_response.data ({ LIST [ORDER_EXECUTION_REPORT] }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	v1_orders_post (order_new_single_request: ORDER_NEW_SINGLE_REQUEST): detachable ORDER_EXECUTION_REPORT
			-- Send new order
			-- This request creating new order for the specific exchange.
			-- 
			-- argument: order_new_single_request OrderNewSingleRequest object. (required)
			-- 
			-- 
			-- Result ORDER_EXECUTION_REPORT
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(order_new_single_request)
			l_path := "/v1/orders"


			if attached {STRING} api_client.select_header_accept (<<"application/json", "appliction/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { ORDER_EXECUTION_REPORT } l_response.data ({ ORDER_EXECUTION_REPORT }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	v1_orders_status_client_order_id_get (client_order_id: STRING_32): detachable ORDER_EXECUTION_REPORT
			-- Get order execution report
			-- Get the last order execution report for the specified order. The requested order does not need to be active or opened.
			-- 
			-- argument: client_order_id The unique identifier of the order assigned by the client. (required)
			-- 
			-- 
			-- Result ORDER_EXECUTION_REPORT
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/v1/orders/status/{client_order_id}"
			l_path.replace_substring_all ("{"+"client_order_id"+"}", api_client.url_encode (client_order_id.out))


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { ORDER_EXECUTION_REPORT } l_response.data ({ ORDER_EXECUTION_REPORT }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	


end
