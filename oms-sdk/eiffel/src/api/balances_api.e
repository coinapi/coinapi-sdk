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

class
	BALANCES_API

inherit

    API_I


feature -- API Access


	v1_balances_get (exchange_id: STRING_32): detachable LIST [BALANCE]
			-- Get balances
			-- Returns all of your balances, including available balance.
			-- 
			-- argument: exchange_id Exchange name (optional, default to null)
			-- 
			-- 
			-- Result LIST [BALANCE]
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/v1/balances"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "exchange_id", exchange_id));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { LIST [BALANCE] } l_response.data ({ LIST [BALANCE] }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	


end
