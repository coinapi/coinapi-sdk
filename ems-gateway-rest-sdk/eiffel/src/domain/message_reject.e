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
class MESSAGE_REJECT




feature --Access

    type: detachable STRING_32
      -- Message type, constant.
    reject_reason: detachable REJECT_REASON
      
    exchange_id: detachable STRING_32
      -- If the message related to exchange, then the identifier of the exchange will be provided.
    message: detachable STRING_32
      -- Message text.
    rejected_message: detachable STRING_32
      -- Value of rejected request, if available.

feature -- Change Element

    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name
      end

    set_reject_reason (a_name: like reject_reason)
        -- Set 'reject_reason' with 'a_name'.
      do
        reject_reason := a_name
      ensure
        reject_reason_set: reject_reason = a_name
      end

    set_exchange_id (a_name: like exchange_id)
        -- Set 'exchange_id' with 'a_name'.
      do
        exchange_id := a_name
      ensure
        exchange_id_set: exchange_id = a_name
      end

    set_message (a_name: like message)
        -- Set 'message' with 'a_name'.
      do
        message := a_name
      ensure
        message_set: message = a_name
      end

    set_rejected_message (a_name: like rejected_message)
        -- Set 'rejected_message' with 'a_name'.
      do
        rejected_message := a_name
      ensure
        rejected_message_set: rejected_message = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass MESSAGE_REJECT%N")
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")
        end
        if attached reject_reason as l_reject_reason then
          Result.append ("%Nreject_reason:")
          Result.append (l_reject_reason.out)
          Result.append ("%N")
        end
        if attached exchange_id as l_exchange_id then
          Result.append ("%Nexchange_id:")
          Result.append (l_exchange_id.out)
          Result.append ("%N")
        end
        if attached message as l_message then
          Result.append ("%Nmessage:")
          Result.append (l_message.out)
          Result.append ("%N")
        end
        if attached rejected_message as l_rejected_message then
          Result.append ("%Nrejected_message:")
          Result.append (l_rejected_message.out)
          Result.append ("%N")
        end
      end
end

