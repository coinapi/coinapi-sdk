--  OMS _ REST API .
--  Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ###Lifecycle Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden_Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham. ###Lifecycle 2 Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden_Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackhama. 
--
--  The version of the OpenAPI document: v1
--  
--
--  NOTE: This package is auto generated by OpenAPI-Generator 4.3.1.
--  https://openapi-generator.tech
--  Do not edit the class manually.

with .Models;
with Swagger.Clients;
package .Clients is

   type Client_Type is new Swagger.Clients.Client_Type with null record;

   --  Get balances
   --  Returns all of your balances, including available balance.
   procedure V1_Balances_Get
      (Client : in out Client_Type;
       Exchange_Id : in Swagger.Nullable_UString;
       Result : out .Models.Balance_Type_Vectors.Vector);

   --  Cancel all order
   --  Cancel all existing order.
   procedure V1_Orders_Cancel_All_Post
      (Client : in out Client_Type;
       Cancel_All_Order_Type : in .Models.CancelAllOrder_Type;
       Result : out .Models.MessagesOk_Type);

   --  Cancel order
   --  Cancel an existing order, can be used to cancel margin, exchange, and derivative orders. You can cancel the order by the internal order ID or exchange order ID.
   procedure V1_Orders_Cancel_Post
      (Client : in out Client_Type;
       Cancel_Order_Type : in .Models.CancelOrder_Type;
       Result : out .Models.OrderLive_Type);

   --  Get orders
   --  List your current open orders.
   procedure V1_Orders_Get
      (Client : in out Client_Type;
       Exchange_Id : in Swagger.Nullable_UString;
       Result : out .Models.Order_Type_Vectors.Vector);

   --  Create new order
   --  You can place two types of orders: limit and market. Orders can only be placed if your account has sufficient funds.
   procedure V1_Orders_Post
      (Client : in out Client_Type;
       New_Order_Type : in .Models.NewOrder_Type;
       Result : out .Models.OrderLive_Type);

   --  Get positions
   --  Returns all of your positions.
   procedure V1_Positions_Get
      (Client : in out Client_Type;
       Exchange_Id : in Swagger.Nullable_UString;
       Result : out .Models.Position_Type_Vectors.Vector);

end .Clients;
