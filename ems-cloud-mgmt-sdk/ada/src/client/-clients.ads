--  EMS _ REST API
--  This section will provide necessary information about the `CoinAPI EMS REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>        Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints  <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems_docs_sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems_gateway_aws_eu_central_1_dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems_gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems_gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self_Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X_CoinAPI_Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X_CoinAPI_Key` and API key as its value. Assuming that your API key is `73034021_THIS_IS_SAMPLE_KEY`, then the authorization header you should send to us will look like: `X_CoinAPI_Key: 73034021_THIS_IS_SAMPLE_KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021_THIS_IS_SAMPLE_KEY` and that you want to request all balances, then your query string should look like this: `GET /v1/balances?apikey=73034021_THIS_IS_SAMPLE_KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
--
--  The version of the OpenAPI document: v1
--  Contact: support@coinapi.io
--
--  NOTE: This package is auto generated by OpenAPI-Generator 6.2.1.
--  https://openapi-generator.tech
--  Do not edit the class manually.

with .Models;
with Swagger.Clients;
package .Clients is
   pragma Style_Checks ("-mr");

   type Client_Type is new Swagger.Clients.Client_Type with null record;

   --  Get balances
   --  Get current currency balance from all or single exchange.
   procedure V_1Balances_Get
      (Client : in out Client_Type;
       Exchange_Id : in Swagger.Nullable_UString;
       Result : out .Models.Balance_Type_Vectors.Vector);

   --  Cancel all orders request
   --  This request cancels all open orders on single specified exchange.
   procedure V_1Orders_Cancel_All_Post
      (Client : in out Client_Type;
       Order_Cancel_All_Request_Type : in .Models.OrderCancelAllRequest_Type;
       Result : out .Models.MessageReject_Type);

   --  Cancel order request
   --  Request cancel for an existing order. The order can be canceled using the `client_order_id` or `exchange_order_id`.
   procedure V_1Orders_Cancel_Post
      (Client : in out Client_Type;
       Order_Cancel_Single_Request_Type : in .Models.OrderCancelSingleRequest_Type;
       Result : out .Models.OrderExecutionReport_Type);

   --  Get open orders
   --  Get last execution reports for open orders across all or single exchange.
   procedure V_1Orders_Get
      (Client : in out Client_Type;
       Exchange_Id : in Swagger.Nullable_UString;
       Result : out .Models.OrderExecutionReport_Type_Vectors.Vector);

   --  History of order changes
   --  Based on the date range, all changes registered in the orderbook.
   procedure V_1Orders_History_Get
      (Client : in out Client_Type;
       Time_Start : in Swagger.UString;
       Time_End : in Swagger.UString;
       Result : out .Models.OrderHistory_Type_Vectors.Vector);

   --  Send new order
   --  This request creating new order for the specific exchange.
   procedure V_1Orders_Post
      (Client : in out Client_Type;
       Order_New_Single_Request_Type : in .Models.OrderNewSingleRequest_Type;
       Result : out .Models.OrderExecutionReport_Type);

   --  Get order execution report
   --  Get the last order execution report for the specified order. The requested order does not need to be active or opened.
   procedure V_1Orders_Status_Client_Order_Id_Get
      (Client : in out Client_Type;
       Client_Order_Id : in Swagger.UString;
       Result : out .Models.OrderExecutionReport_Type);

   --  Get open positions
   --  Get current open positions across all or single exchange.
   procedure V_1Positions_Get
      (Client : in out Client_Type;
       Exchange_Id : in Swagger.Nullable_UString;
       Result : out .Models.Position_Type_Vectors.Vector);

end .Clients;
