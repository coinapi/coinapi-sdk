--  OEML _ REST API
--  Lorem2 Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ###Lifecycle Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden_Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham. ###Lifecycle 2 Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden_Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackhama. 
--
--  The version of the OpenAPI document: v1
--  
--
--  NOTE: This package is auto generated by OpenAPI-Generator 4.3.1.
--  https://openapi-generator.tech
--  Do not edit the class manually.

with Swagger.Streams;
with Ada.Containers.Vectors;
package .Models is


   --  ------------------------------
   --  Message
   --  ------------------------------
   type Messages_Type is
     record
       P_Type : Swagger.Nullable_UString;
       Exchange_Id : Swagger.Nullable_UString;
       Message : Swagger.Nullable_UString;
     end record;

   package Messages_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => Messages_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Messages_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Messages_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Messages_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Messages_Type_Vectors.Vector);



   --  ------------------------------
   --  Message info
   --  ------------------------------
   type MessagesInfo_Type is
     record
       P_Type : Swagger.Nullable_UString;
       Exchange_Id : Swagger.Nullable_UString;
       Error_Message : Swagger.Nullable_UString;
     end record;

   package MessagesInfo_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => MessagesInfo_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MessagesInfo_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MessagesInfo_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MessagesInfo_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MessagesInfo_Type_Vectors.Vector);




   type TimeInForce_Type is
     record
     end record;

   package TimeInForce_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TimeInForce_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TimeInForce_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TimeInForce_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TimeInForce_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TimeInForce_Type_Vectors.Vector);




   type CancelOrder_Type is
     record
       Exchange_Id : Swagger.Nullable_UString;
       Exchange_Order_Id : Swagger.Nullable_UString;
       Client_Order_Id : Swagger.Nullable_UString;
     end record;

   package CancelOrder_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => CancelOrder_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CancelOrder_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CancelOrder_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CancelOrder_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CancelOrder_Type_Vectors.Vector);




   type CancelAllOrder_Type is
     record
       Exchange_Id : Swagger.Nullable_UString;
     end record;

   package CancelAllOrder_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => CancelAllOrder_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CancelAllOrder_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CancelAllOrder_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CancelAllOrder_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CancelAllOrder_Type_Vectors.Vector);



   --  ------------------------------
   --  Message ok
   --  ------------------------------
   type MessagesOk_Type is
     record
       P_Type : Swagger.Nullable_UString;
       Exchange_Id : Swagger.Nullable_UString;
       Message : Swagger.Nullable_UString;
     end record;

   package MessagesOk_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => MessagesOk_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MessagesOk_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MessagesOk_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MessagesOk_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MessagesOk_Type_Vectors.Vector);




   type OrderStatus_Type is
     record
     end record;

   package OrderStatus_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => OrderStatus_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in OrderStatus_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in OrderStatus_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out OrderStatus_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out OrderStatus_Type_Vectors.Vector);




   type BalanceData_Type is
     record
       Id : Swagger.Nullable_UString;
       Symbol_Exchange : Swagger.Nullable_UString;
       Symbol_Coinapi : Swagger.Nullable_UString;
       Balance : float;
       Available : float;
       Locked : float;
       Update_Origin : Swagger.Nullable_UString;
     end record;

   package BalanceData_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => BalanceData_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in BalanceData_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in BalanceData_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out BalanceData_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out BalanceData_Type_Vectors.Vector);




   type Balance_Type is
     record
       P_Type : Swagger.Nullable_UString;
       Exchange_Name : Swagger.Nullable_UString;
       Data : .Models.BalanceData_Type_Vectors.Vector;
     end record;

   package Balance_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => Balance_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Balance_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Balance_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Balance_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Balance_Type_Vectors.Vector);




   type Order_Type is
     record
       P_Type : Swagger.Nullable_UString;
       Exchange_Name : Swagger.Nullable_UString;
       Data : .Models.OrderData_Type_Vectors.Vector;
     end record;

   package Order_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => Order_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Order_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Order_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Order_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Order_Type_Vectors.Vector);




   type NewOrder_Type is
     record
       Exchange_Id : Swagger.Nullable_UString;
       Client_Order_Id : Swagger.Nullable_UString;
       Symbol_Exchange : Swagger.Nullable_UString;
       Symbol_Coinapi : Swagger.Nullable_UString;
       Amount_Order : Swagger.Number;
       Price : Swagger.Number;
       Side : Swagger.Nullable_UString;
       Order_Type : Swagger.Nullable_UString;
       Time_In_Force : .Models.TimeInForce_Type;
       Expire_Time : Swagger.Nullable_Date;
       Exec_Inst : Swagger.UString_Vectors.Vector;
     end record;

   package NewOrder_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => NewOrder_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in NewOrder_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in NewOrder_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out NewOrder_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out NewOrder_Type_Vectors.Vector);




   type OrderLive_Type is
     record
       P_Type : Swagger.Nullable_UString;
       Exchange_Id : Swagger.Nullable_UString;
       Id : Swagger.Nullable_UString;
       Client_Order_Id_Format_Exchange : Swagger.Nullable_UString;
       Exchange_Order_Id : Swagger.Nullable_UString;
       Amount_Open : Swagger.Number;
       Amount_Filled : Swagger.Number;
       Status : .Models.OrderStatus_Type;
       Time_Order : Swagger.UString_Vectors.Vector_Vectors.Vector;
       Error_Message : Swagger.Nullable_UString;
       Client_Order_Id : Swagger.Nullable_UString;
       Symbol_Exchange : Swagger.Nullable_UString;
       Symbol_Coinapi : Swagger.Nullable_UString;
       Amount_Order : Swagger.Number;
       Price : Swagger.Number;
       Side : Swagger.Nullable_UString;
       Order_Type : Swagger.Nullable_UString;
       Time_In_Force : .Models.TimeInForce_Type;
       Expire_Time : Swagger.Nullable_Date;
       Exec_Inst : Swagger.UString_Vectors.Vector;
     end record;

   package OrderLive_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => OrderLive_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in OrderLive_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in OrderLive_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out OrderLive_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out OrderLive_Type_Vectors.Vector);




   type Position_Type is
     record
       P_Type : Swagger.Nullable_UString;
       Exchange_Name : Swagger.Nullable_UString;
       Data : .Models.PositionData_Type_Vectors.Vector;
     end record;

   package Position_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => Position_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Position_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Position_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Position_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Position_Type_Vectors.Vector);



   --  ------------------------------
   --  Create order validation error (response)
   --  ------------------------------
   type CreateOrder400_Type is
     record
       P_Type : Swagger.Nullable_UString;
       Title : Swagger.Nullable_UString;
       Status : Swagger.Number;
       Trace_Id : Swagger.Nullable_UString;
       Errors : Swagger.Nullable_UString;
     end record;

   package CreateOrder400_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => CreateOrder400_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CreateOrder400_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CreateOrder400_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CreateOrder400_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CreateOrder400_Type_Vectors.Vector);




   type OrderData_Type is
     record
       Exchange_Id : Swagger.Nullable_UString;
       Id : Swagger.Nullable_UString;
       Client_Order_Id_Format_Exchange : Swagger.Nullable_UString;
       Exchange_Order_Id : Swagger.Nullable_UString;
       Amount_Open : Swagger.Number;
       Amount_Filled : Swagger.Number;
       Status : .Models.OrderStatus_Type;
       Time_Order : Swagger.UString_Vectors.Vector_Vectors.Vector;
       Error_Message : Swagger.Nullable_UString;
       Client_Order_Id : Swagger.Nullable_UString;
       Symbol_Exchange : Swagger.Nullable_UString;
       Symbol_Coinapi : Swagger.Nullable_UString;
       Amount_Order : Swagger.Number;
       Price : Swagger.Number;
       Side : Swagger.Nullable_UString;
       Order_Type : Swagger.Nullable_UString;
       Time_In_Force : .Models.TimeInForce_Type;
       Expire_Time : Swagger.Nullable_Date;
       Exec_Inst : Swagger.UString_Vectors.Vector;
     end record;

   package OrderData_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => OrderData_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in OrderData_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in OrderData_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out OrderData_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out OrderData_Type_Vectors.Vector);




   type PositionData_Type is
     record
       Id : Swagger.Nullable_UString;
       Symbol_Exchange : Swagger.Nullable_UString;
       Symbol_Coinapi : Swagger.Nullable_UString;
       Avg_Entry_Price : Swagger.Number;
       Quantity : Swagger.Number;
       Is_Buy : Swagger.Nullable_Boolean;
       Unrealised_Pn_L : Swagger.Number;
       Leverage : Swagger.Number;
       Cross_Margin : Swagger.Nullable_Boolean;
       Liquidation_Price : Swagger.Number;
       Raw_Data : Swagger.Nullable_UString;
     end record;

   package PositionData_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => PositionData_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PositionData_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PositionData_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PositionData_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PositionData_Type_Vectors.Vector);



end .Models;
