--  OMS _ REST API .
--  OMS Project
--
--  The version of the OpenAPI document: v1
--  
--
--  NOTE: This package is auto generated by OpenAPI-Generator 4.3.1.
--  https://openapi-generator.tech
--  Do not edit the class manually.


package body .Models is

   use Swagger.Streams;



   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Messages_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("type", Value.P_Type);
      Into.Write_Entity ("exchange_id", Value.Exchange_Id);
      Into.Write_Entity ("message", Value.Message);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Messages_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Messages_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "type", Value.P_Type);
      Swagger.Streams.Deserialize (Object, "exchange_id", Value.Exchange_Id);
      Swagger.Streams.Deserialize (Object, "message", Value.Message);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Messages_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Messages_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MessagesInfo_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("type", Value.P_Type);
      Into.Write_Entity ("exchange_id", Value.Exchange_Id);
      Into.Write_Entity ("error_message", Value.Error_Message);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MessagesInfo_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MessagesInfo_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "type", Value.P_Type);
      Swagger.Streams.Deserialize (Object, "exchange_id", Value.Exchange_Id);
      Swagger.Streams.Deserialize (Object, "error_message", Value.Error_Message);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MessagesInfo_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : MessagesInfo_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TimeInForce_Type) is
   begin
      Into.Start_Entity (Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TimeInForce_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TimeInForce_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TimeInForce_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TimeInForce_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CancelOrder_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("exchange_id", Value.Exchange_Id);
      Into.Write_Entity ("exchange_order_id", Value.Exchange_Order_Id);
      Into.Write_Entity ("client_order_id", Value.Client_Order_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CancelOrder_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CancelOrder_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "exchange_id", Value.Exchange_Id);
      Swagger.Streams.Deserialize (Object, "exchange_order_id", Value.Exchange_Order_Id);
      Swagger.Streams.Deserialize (Object, "client_order_id", Value.Client_Order_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CancelOrder_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : CancelOrder_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CancelAllOrder_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("exchange_id", Value.Exchange_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CancelAllOrder_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CancelAllOrder_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "exchange_id", Value.Exchange_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CancelAllOrder_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : CancelAllOrder_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MessagesOk_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("type", Value.P_Type);
      Into.Write_Entity ("exchange_id", Value.Exchange_Id);
      Into.Write_Entity ("message", Value.Message);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MessagesOk_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MessagesOk_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "type", Value.P_Type);
      Swagger.Streams.Deserialize (Object, "exchange_id", Value.Exchange_Id);
      Swagger.Streams.Deserialize (Object, "message", Value.Message);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MessagesOk_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : MessagesOk_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in OrderStatus_Type) is
   begin
      Into.Start_Entity (Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in OrderStatus_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out OrderStatus_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out OrderStatus_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : OrderStatus_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in BalanceData_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("id", Value.Id);
      Into.Write_Entity ("symbol_exchange", Value.Symbol_Exchange);
      Into.Write_Entity ("symbol_coinapi", Value.Symbol_Coinapi);
      Into.Write_Entity ("balance", Value.Balance);
      Into.Write_Entity ("available", Value.Available);
      Into.Write_Entity ("locked", Value.Locked);
      Into.Write_Entity ("update_origin", Value.Update_Origin);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in BalanceData_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out BalanceData_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "symbol_exchange", Value.Symbol_Exchange);
      Swagger.Streams.Deserialize (Object, "symbol_coinapi", Value.Symbol_Coinapi);
      Swagger.Streams.Deserialize (Object, "balance", Value.Balance);
      Swagger.Streams.Deserialize (Object, "available", Value.Available);
      Swagger.Streams.Deserialize (Object, "locked", Value.Locked);
      Swagger.Streams.Deserialize (Object, "update_origin", Value.Update_Origin);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out BalanceData_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : BalanceData_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Balance_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("type", Value.P_Type);
      Into.Write_Entity ("exchange_name", Value.Exchange_Name);
      Serialize (Into, "data", Value.Data);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Balance_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Balance_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "type", Value.P_Type);
      Swagger.Streams.Deserialize (Object, "exchange_name", Value.Exchange_Name);
      Deserialize (Object, "data", Value.Data);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Balance_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Balance_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Order_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("type", Value.P_Type);
      Into.Write_Entity ("exchange_name", Value.Exchange_Name);
      Serialize (Into, "data", Value.Data);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Order_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Order_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "type", Value.P_Type);
      Swagger.Streams.Deserialize (Object, "exchange_name", Value.Exchange_Name);
      Deserialize (Object, "data", Value.Data);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Order_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Order_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in NewOrder_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("exchange_id", Value.Exchange_Id);
      Into.Write_Entity ("client_order_id", Value.Client_Order_Id);
      Into.Write_Entity ("symbol_exchange", Value.Symbol_Exchange);
      Into.Write_Entity ("symbol_coinapi", Value.Symbol_Coinapi);
      Serialize (Into, "amount_order", Value.Amount_Order);
      Serialize (Into, "price", Value.Price);
      Into.Write_Entity ("side", Value.Side);
      Into.Write_Entity ("order_type", Value.Order_Type);
      Serialize (Into, "time_in_force", Value.Time_In_Force);
      Serialize (Into, "expire_time", Value.Expire_Time);
      Serialize (Into, "exec_inst", Value.Exec_Inst);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in NewOrder_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out NewOrder_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "exchange_id", Value.Exchange_Id);
      Swagger.Streams.Deserialize (Object, "client_order_id", Value.Client_Order_Id);
      Swagger.Streams.Deserialize (Object, "symbol_exchange", Value.Symbol_Exchange);
      Swagger.Streams.Deserialize (Object, "symbol_coinapi", Value.Symbol_Coinapi);
      Deserialize (Object, "amount_order", Value.Amount_Order);
      Deserialize (Object, "price", Value.Price);
      Swagger.Streams.Deserialize (Object, "side", Value.Side);
      Swagger.Streams.Deserialize (Object, "order_type", Value.Order_Type);
      Deserialize (Object, "time_in_force", Value.Time_In_Force);
      Deserialize (Object, "expire_time", Value.Expire_Time);
      Swagger.Streams.Deserialize (Object, "exec_inst", Value.Exec_Inst);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out NewOrder_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : NewOrder_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in OrderLive_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("type", Value.P_Type);
      Into.Write_Entity ("exchange_id", Value.Exchange_Id);
      Into.Write_Entity ("id", Value.Id);
      Into.Write_Entity ("client_order_id_format_exchange", Value.Client_Order_Id_Format_Exchange);
      Into.Write_Entity ("exchange_order_id", Value.Exchange_Order_Id);
      Serialize (Into, "amount_open", Value.Amount_Open);
      Serialize (Into, "amount_filled", Value.Amount_Filled);
      Serialize (Into, "status", Value.Status);
      Serialize (Into, "time_order", Value.Time_Order);
      Into.Write_Entity ("error_message", Value.Error_Message);
      Into.Write_Entity ("client_order_id", Value.Client_Order_Id);
      Into.Write_Entity ("symbol_exchange", Value.Symbol_Exchange);
      Into.Write_Entity ("symbol_coinapi", Value.Symbol_Coinapi);
      Serialize (Into, "amount_order", Value.Amount_Order);
      Serialize (Into, "price", Value.Price);
      Into.Write_Entity ("side", Value.Side);
      Into.Write_Entity ("order_type", Value.Order_Type);
      Serialize (Into, "time_in_force", Value.Time_In_Force);
      Serialize (Into, "expire_time", Value.Expire_Time);
      Serialize (Into, "exec_inst", Value.Exec_Inst);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in OrderLive_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out OrderLive_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "type", Value.P_Type);
      Swagger.Streams.Deserialize (Object, "exchange_id", Value.Exchange_Id);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "client_order_id_format_exchange", Value.Client_Order_Id_Format_Exchange);
      Swagger.Streams.Deserialize (Object, "exchange_order_id", Value.Exchange_Order_Id);
      Deserialize (Object, "amount_open", Value.Amount_Open);
      Deserialize (Object, "amount_filled", Value.Amount_Filled);
      Deserialize (Object, "status", Value.Status);
      Swagger.Streams.Deserialize (Object, "time_order", Value.Time_Order);
      Swagger.Streams.Deserialize (Object, "error_message", Value.Error_Message);
      Swagger.Streams.Deserialize (Object, "client_order_id", Value.Client_Order_Id);
      Swagger.Streams.Deserialize (Object, "symbol_exchange", Value.Symbol_Exchange);
      Swagger.Streams.Deserialize (Object, "symbol_coinapi", Value.Symbol_Coinapi);
      Deserialize (Object, "amount_order", Value.Amount_Order);
      Deserialize (Object, "price", Value.Price);
      Swagger.Streams.Deserialize (Object, "side", Value.Side);
      Swagger.Streams.Deserialize (Object, "order_type", Value.Order_Type);
      Deserialize (Object, "time_in_force", Value.Time_In_Force);
      Deserialize (Object, "expire_time", Value.Expire_Time);
      Swagger.Streams.Deserialize (Object, "exec_inst", Value.Exec_Inst);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out OrderLive_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : OrderLive_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Position_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("type", Value.P_Type);
      Into.Write_Entity ("exchange_name", Value.Exchange_Name);
      Serialize (Into, "data", Value.Data);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Position_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Position_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "type", Value.P_Type);
      Swagger.Streams.Deserialize (Object, "exchange_name", Value.Exchange_Name);
      Deserialize (Object, "data", Value.Data);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Position_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Position_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CreateOrder400_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("type", Value.P_Type);
      Into.Write_Entity ("title", Value.Title);
      Serialize (Into, "status", Value.Status);
      Into.Write_Entity ("traceId", Value.Trace_Id);
      Into.Write_Entity ("errors", Value.Errors);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CreateOrder400_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CreateOrder400_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "type", Value.P_Type);
      Swagger.Streams.Deserialize (Object, "title", Value.Title);
      Deserialize (Object, "status", Value.Status);
      Swagger.Streams.Deserialize (Object, "traceId", Value.Trace_Id);
      Swagger.Streams.Deserialize (Object, "errors", Value.Errors);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CreateOrder400_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : CreateOrder400_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in OrderData_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("exchange_id", Value.Exchange_Id);
      Into.Write_Entity ("id", Value.Id);
      Into.Write_Entity ("client_order_id_format_exchange", Value.Client_Order_Id_Format_Exchange);
      Into.Write_Entity ("exchange_order_id", Value.Exchange_Order_Id);
      Serialize (Into, "amount_open", Value.Amount_Open);
      Serialize (Into, "amount_filled", Value.Amount_Filled);
      Serialize (Into, "status", Value.Status);
      Serialize (Into, "time_order", Value.Time_Order);
      Into.Write_Entity ("error_message", Value.Error_Message);
      Into.Write_Entity ("client_order_id", Value.Client_Order_Id);
      Into.Write_Entity ("symbol_exchange", Value.Symbol_Exchange);
      Into.Write_Entity ("symbol_coinapi", Value.Symbol_Coinapi);
      Serialize (Into, "amount_order", Value.Amount_Order);
      Serialize (Into, "price", Value.Price);
      Into.Write_Entity ("side", Value.Side);
      Into.Write_Entity ("order_type", Value.Order_Type);
      Serialize (Into, "time_in_force", Value.Time_In_Force);
      Serialize (Into, "expire_time", Value.Expire_Time);
      Serialize (Into, "exec_inst", Value.Exec_Inst);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in OrderData_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out OrderData_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "exchange_id", Value.Exchange_Id);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "client_order_id_format_exchange", Value.Client_Order_Id_Format_Exchange);
      Swagger.Streams.Deserialize (Object, "exchange_order_id", Value.Exchange_Order_Id);
      Deserialize (Object, "amount_open", Value.Amount_Open);
      Deserialize (Object, "amount_filled", Value.Amount_Filled);
      Deserialize (Object, "status", Value.Status);
      Swagger.Streams.Deserialize (Object, "time_order", Value.Time_Order);
      Swagger.Streams.Deserialize (Object, "error_message", Value.Error_Message);
      Swagger.Streams.Deserialize (Object, "client_order_id", Value.Client_Order_Id);
      Swagger.Streams.Deserialize (Object, "symbol_exchange", Value.Symbol_Exchange);
      Swagger.Streams.Deserialize (Object, "symbol_coinapi", Value.Symbol_Coinapi);
      Deserialize (Object, "amount_order", Value.Amount_Order);
      Deserialize (Object, "price", Value.Price);
      Swagger.Streams.Deserialize (Object, "side", Value.Side);
      Swagger.Streams.Deserialize (Object, "order_type", Value.Order_Type);
      Deserialize (Object, "time_in_force", Value.Time_In_Force);
      Deserialize (Object, "expire_time", Value.Expire_Time);
      Swagger.Streams.Deserialize (Object, "exec_inst", Value.Exec_Inst);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out OrderData_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : OrderData_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PositionData_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("id", Value.Id);
      Into.Write_Entity ("symbol_exchange", Value.Symbol_Exchange);
      Into.Write_Entity ("symbol_coinapi", Value.Symbol_Coinapi);
      Serialize (Into, "avg_entry_price", Value.Avg_Entry_Price);
      Serialize (Into, "quantity", Value.Quantity);
      Into.Write_Entity ("is_buy", Value.Is_Buy);
      Serialize (Into, "unrealised_pn_l", Value.Unrealised_Pn_L);
      Serialize (Into, "leverage", Value.Leverage);
      Into.Write_Entity ("cross_margin", Value.Cross_Margin);
      Serialize (Into, "liquidation_price", Value.Liquidation_Price);
      Into.Write_Entity ("raw_data", Value.Raw_Data);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PositionData_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PositionData_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "symbol_exchange", Value.Symbol_Exchange);
      Swagger.Streams.Deserialize (Object, "symbol_coinapi", Value.Symbol_Coinapi);
      Deserialize (Object, "avg_entry_price", Value.Avg_Entry_Price);
      Deserialize (Object, "quantity", Value.Quantity);
      Swagger.Streams.Deserialize (Object, "is_buy", Value.Is_Buy);
      Deserialize (Object, "unrealised_pn_l", Value.Unrealised_Pn_L);
      Deserialize (Object, "leverage", Value.Leverage);
      Swagger.Streams.Deserialize (Object, "cross_margin", Value.Cross_Margin);
      Deserialize (Object, "liquidation_price", Value.Liquidation_Price);
      Swagger.Streams.Deserialize (Object, "raw_data", Value.Raw_Data);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PositionData_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : PositionData_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;



end .Models;
