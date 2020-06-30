part of openapi.api;

class OrderStatus {
  /// The underlying value of this enum member.
  final String value;

  const OrderStatus._internal(this.value);

  /// Order statuses ##### Status description  | Name | Possible transitions to | Status description  | --- | --- | --- | | RECEIVED | REJECTED, ROUTING | We received an order and will send it to the exchange immedaitely | ROUTING | ROUTED | We are in the process of sending order to the exchange | ROUTED | REJECTED, NEW, PARTIALLY_FILLED, FILLED, CANCELED | Order was sent to the exchange from our side, but it&#39;s not yet active in order book | NEW | PARTIALLY_FILLED, FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s untouched | PENDING_CANCEL | NEW, PARTIALLY_FILLED, FILLED, CANCELED | We received order cancel request and relayed it succesfully to the exchange.  | PARTIALLY_FILLED | FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s partially filled | FILLED | | Order is no longer active in the order book as was completely filled  | CANCELED | | Order is no longer active in the order book as was canceled | REJECTED | | Order was rejected by OMS or exchange. ##### Status transitions  | Source Status | Destination status | Description | --- | --- | --- | | | RECEIVED | OMS received new order from you | | NEW | OMS received unseen new order from the exchange (order was relayed to the exchnage outside the OMS) | | PARTIALLY_FILLED | OMS received unseen partially filled order from the exchange (order was relayed to the exchnage outside the OMS) | RECEIVED | REJECTED | OMS rejected your order | RECEIVED | ROUTING | We started relaying order to the exchange | ROUTING | ROUTED | Order was relayed to the exchange and we are waiting to be active in the order book | ROUTED | REJECTED | Exchange rejected your order | ROUTED | NEW | Exchange accepted your passive order into order book | ROUTED | PARTIALLY_FILLED | Exchange actively filled part of your order and the remaining was accepted into order book | ROUTED | FILLED | Exchange actively filled your order in whole. | ROUTED | CANCELED | Exchange canceled your order before accepting it to the order book. | NEW | PARTIALLY_FILLED | Part of your order was filled. | NEW | FILLED | Whole order was filled. | NEW | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | NEW | CANCELED | Your order was canceled. | PARTIALLY_FILLED | FILLED | Remaining active part of the order was filled succesfully. | PARTIALLY_FILLED | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | PARTIALLY_FILLED | CANCELED | Your order was canceled. | PENDING_CANCEL | NEW | Exchange responded to the cancelation message that your order is fully active in the order book. | PENDING_CANCEL | PARTIALLY_FILLED | Your order was filled partially after we relayed cancelation message to the exchange. | PENDING_CANCEL | FILLED | Your order was completely filled before the cancel was executed by the exchange. | PENDING_CANCEL | CANCELED | Your order was canceled. 
  static const OrderStatus rECEIVED_ = const OrderStatus._internal("RECEIVED");
  /// Order statuses ##### Status description  | Name | Possible transitions to | Status description  | --- | --- | --- | | RECEIVED | REJECTED, ROUTING | We received an order and will send it to the exchange immedaitely | ROUTING | ROUTED | We are in the process of sending order to the exchange | ROUTED | REJECTED, NEW, PARTIALLY_FILLED, FILLED, CANCELED | Order was sent to the exchange from our side, but it&#39;s not yet active in order book | NEW | PARTIALLY_FILLED, FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s untouched | PENDING_CANCEL | NEW, PARTIALLY_FILLED, FILLED, CANCELED | We received order cancel request and relayed it succesfully to the exchange.  | PARTIALLY_FILLED | FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s partially filled | FILLED | | Order is no longer active in the order book as was completely filled  | CANCELED | | Order is no longer active in the order book as was canceled | REJECTED | | Order was rejected by OMS or exchange. ##### Status transitions  | Source Status | Destination status | Description | --- | --- | --- | | | RECEIVED | OMS received new order from you | | NEW | OMS received unseen new order from the exchange (order was relayed to the exchnage outside the OMS) | | PARTIALLY_FILLED | OMS received unseen partially filled order from the exchange (order was relayed to the exchnage outside the OMS) | RECEIVED | REJECTED | OMS rejected your order | RECEIVED | ROUTING | We started relaying order to the exchange | ROUTING | ROUTED | Order was relayed to the exchange and we are waiting to be active in the order book | ROUTED | REJECTED | Exchange rejected your order | ROUTED | NEW | Exchange accepted your passive order into order book | ROUTED | PARTIALLY_FILLED | Exchange actively filled part of your order and the remaining was accepted into order book | ROUTED | FILLED | Exchange actively filled your order in whole. | ROUTED | CANCELED | Exchange canceled your order before accepting it to the order book. | NEW | PARTIALLY_FILLED | Part of your order was filled. | NEW | FILLED | Whole order was filled. | NEW | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | NEW | CANCELED | Your order was canceled. | PARTIALLY_FILLED | FILLED | Remaining active part of the order was filled succesfully. | PARTIALLY_FILLED | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | PARTIALLY_FILLED | CANCELED | Your order was canceled. | PENDING_CANCEL | NEW | Exchange responded to the cancelation message that your order is fully active in the order book. | PENDING_CANCEL | PARTIALLY_FILLED | Your order was filled partially after we relayed cancelation message to the exchange. | PENDING_CANCEL | FILLED | Your order was completely filled before the cancel was executed by the exchange. | PENDING_CANCEL | CANCELED | Your order was canceled. 
  static const OrderStatus rOUTING_ = const OrderStatus._internal("ROUTING");
  /// Order statuses ##### Status description  | Name | Possible transitions to | Status description  | --- | --- | --- | | RECEIVED | REJECTED, ROUTING | We received an order and will send it to the exchange immedaitely | ROUTING | ROUTED | We are in the process of sending order to the exchange | ROUTED | REJECTED, NEW, PARTIALLY_FILLED, FILLED, CANCELED | Order was sent to the exchange from our side, but it&#39;s not yet active in order book | NEW | PARTIALLY_FILLED, FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s untouched | PENDING_CANCEL | NEW, PARTIALLY_FILLED, FILLED, CANCELED | We received order cancel request and relayed it succesfully to the exchange.  | PARTIALLY_FILLED | FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s partially filled | FILLED | | Order is no longer active in the order book as was completely filled  | CANCELED | | Order is no longer active in the order book as was canceled | REJECTED | | Order was rejected by OMS or exchange. ##### Status transitions  | Source Status | Destination status | Description | --- | --- | --- | | | RECEIVED | OMS received new order from you | | NEW | OMS received unseen new order from the exchange (order was relayed to the exchnage outside the OMS) | | PARTIALLY_FILLED | OMS received unseen partially filled order from the exchange (order was relayed to the exchnage outside the OMS) | RECEIVED | REJECTED | OMS rejected your order | RECEIVED | ROUTING | We started relaying order to the exchange | ROUTING | ROUTED | Order was relayed to the exchange and we are waiting to be active in the order book | ROUTED | REJECTED | Exchange rejected your order | ROUTED | NEW | Exchange accepted your passive order into order book | ROUTED | PARTIALLY_FILLED | Exchange actively filled part of your order and the remaining was accepted into order book | ROUTED | FILLED | Exchange actively filled your order in whole. | ROUTED | CANCELED | Exchange canceled your order before accepting it to the order book. | NEW | PARTIALLY_FILLED | Part of your order was filled. | NEW | FILLED | Whole order was filled. | NEW | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | NEW | CANCELED | Your order was canceled. | PARTIALLY_FILLED | FILLED | Remaining active part of the order was filled succesfully. | PARTIALLY_FILLED | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | PARTIALLY_FILLED | CANCELED | Your order was canceled. | PENDING_CANCEL | NEW | Exchange responded to the cancelation message that your order is fully active in the order book. | PENDING_CANCEL | PARTIALLY_FILLED | Your order was filled partially after we relayed cancelation message to the exchange. | PENDING_CANCEL | FILLED | Your order was completely filled before the cancel was executed by the exchange. | PENDING_CANCEL | CANCELED | Your order was canceled. 
  static const OrderStatus rOUTED_ = const OrderStatus._internal("ROUTED");
  /// Order statuses ##### Status description  | Name | Possible transitions to | Status description  | --- | --- | --- | | RECEIVED | REJECTED, ROUTING | We received an order and will send it to the exchange immedaitely | ROUTING | ROUTED | We are in the process of sending order to the exchange | ROUTED | REJECTED, NEW, PARTIALLY_FILLED, FILLED, CANCELED | Order was sent to the exchange from our side, but it&#39;s not yet active in order book | NEW | PARTIALLY_FILLED, FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s untouched | PENDING_CANCEL | NEW, PARTIALLY_FILLED, FILLED, CANCELED | We received order cancel request and relayed it succesfully to the exchange.  | PARTIALLY_FILLED | FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s partially filled | FILLED | | Order is no longer active in the order book as was completely filled  | CANCELED | | Order is no longer active in the order book as was canceled | REJECTED | | Order was rejected by OMS or exchange. ##### Status transitions  | Source Status | Destination status | Description | --- | --- | --- | | | RECEIVED | OMS received new order from you | | NEW | OMS received unseen new order from the exchange (order was relayed to the exchnage outside the OMS) | | PARTIALLY_FILLED | OMS received unseen partially filled order from the exchange (order was relayed to the exchnage outside the OMS) | RECEIVED | REJECTED | OMS rejected your order | RECEIVED | ROUTING | We started relaying order to the exchange | ROUTING | ROUTED | Order was relayed to the exchange and we are waiting to be active in the order book | ROUTED | REJECTED | Exchange rejected your order | ROUTED | NEW | Exchange accepted your passive order into order book | ROUTED | PARTIALLY_FILLED | Exchange actively filled part of your order and the remaining was accepted into order book | ROUTED | FILLED | Exchange actively filled your order in whole. | ROUTED | CANCELED | Exchange canceled your order before accepting it to the order book. | NEW | PARTIALLY_FILLED | Part of your order was filled. | NEW | FILLED | Whole order was filled. | NEW | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | NEW | CANCELED | Your order was canceled. | PARTIALLY_FILLED | FILLED | Remaining active part of the order was filled succesfully. | PARTIALLY_FILLED | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | PARTIALLY_FILLED | CANCELED | Your order was canceled. | PENDING_CANCEL | NEW | Exchange responded to the cancelation message that your order is fully active in the order book. | PENDING_CANCEL | PARTIALLY_FILLED | Your order was filled partially after we relayed cancelation message to the exchange. | PENDING_CANCEL | FILLED | Your order was completely filled before the cancel was executed by the exchange. | PENDING_CANCEL | CANCELED | Your order was canceled. 
  static const OrderStatus nEW_ = const OrderStatus._internal("NEW");
  /// Order statuses ##### Status description  | Name | Possible transitions to | Status description  | --- | --- | --- | | RECEIVED | REJECTED, ROUTING | We received an order and will send it to the exchange immedaitely | ROUTING | ROUTED | We are in the process of sending order to the exchange | ROUTED | REJECTED, NEW, PARTIALLY_FILLED, FILLED, CANCELED | Order was sent to the exchange from our side, but it&#39;s not yet active in order book | NEW | PARTIALLY_FILLED, FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s untouched | PENDING_CANCEL | NEW, PARTIALLY_FILLED, FILLED, CANCELED | We received order cancel request and relayed it succesfully to the exchange.  | PARTIALLY_FILLED | FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s partially filled | FILLED | | Order is no longer active in the order book as was completely filled  | CANCELED | | Order is no longer active in the order book as was canceled | REJECTED | | Order was rejected by OMS or exchange. ##### Status transitions  | Source Status | Destination status | Description | --- | --- | --- | | | RECEIVED | OMS received new order from you | | NEW | OMS received unseen new order from the exchange (order was relayed to the exchnage outside the OMS) | | PARTIALLY_FILLED | OMS received unseen partially filled order from the exchange (order was relayed to the exchnage outside the OMS) | RECEIVED | REJECTED | OMS rejected your order | RECEIVED | ROUTING | We started relaying order to the exchange | ROUTING | ROUTED | Order was relayed to the exchange and we are waiting to be active in the order book | ROUTED | REJECTED | Exchange rejected your order | ROUTED | NEW | Exchange accepted your passive order into order book | ROUTED | PARTIALLY_FILLED | Exchange actively filled part of your order and the remaining was accepted into order book | ROUTED | FILLED | Exchange actively filled your order in whole. | ROUTED | CANCELED | Exchange canceled your order before accepting it to the order book. | NEW | PARTIALLY_FILLED | Part of your order was filled. | NEW | FILLED | Whole order was filled. | NEW | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | NEW | CANCELED | Your order was canceled. | PARTIALLY_FILLED | FILLED | Remaining active part of the order was filled succesfully. | PARTIALLY_FILLED | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | PARTIALLY_FILLED | CANCELED | Your order was canceled. | PENDING_CANCEL | NEW | Exchange responded to the cancelation message that your order is fully active in the order book. | PENDING_CANCEL | PARTIALLY_FILLED | Your order was filled partially after we relayed cancelation message to the exchange. | PENDING_CANCEL | FILLED | Your order was completely filled before the cancel was executed by the exchange. | PENDING_CANCEL | CANCELED | Your order was canceled. 
  static const OrderStatus pENDINGCANCEL_ = const OrderStatus._internal("PENDING_CANCEL");
  /// Order statuses ##### Status description  | Name | Possible transitions to | Status description  | --- | --- | --- | | RECEIVED | REJECTED, ROUTING | We received an order and will send it to the exchange immedaitely | ROUTING | ROUTED | We are in the process of sending order to the exchange | ROUTED | REJECTED, NEW, PARTIALLY_FILLED, FILLED, CANCELED | Order was sent to the exchange from our side, but it&#39;s not yet active in order book | NEW | PARTIALLY_FILLED, FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s untouched | PENDING_CANCEL | NEW, PARTIALLY_FILLED, FILLED, CANCELED | We received order cancel request and relayed it succesfully to the exchange.  | PARTIALLY_FILLED | FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s partially filled | FILLED | | Order is no longer active in the order book as was completely filled  | CANCELED | | Order is no longer active in the order book as was canceled | REJECTED | | Order was rejected by OMS or exchange. ##### Status transitions  | Source Status | Destination status | Description | --- | --- | --- | | | RECEIVED | OMS received new order from you | | NEW | OMS received unseen new order from the exchange (order was relayed to the exchnage outside the OMS) | | PARTIALLY_FILLED | OMS received unseen partially filled order from the exchange (order was relayed to the exchnage outside the OMS) | RECEIVED | REJECTED | OMS rejected your order | RECEIVED | ROUTING | We started relaying order to the exchange | ROUTING | ROUTED | Order was relayed to the exchange and we are waiting to be active in the order book | ROUTED | REJECTED | Exchange rejected your order | ROUTED | NEW | Exchange accepted your passive order into order book | ROUTED | PARTIALLY_FILLED | Exchange actively filled part of your order and the remaining was accepted into order book | ROUTED | FILLED | Exchange actively filled your order in whole. | ROUTED | CANCELED | Exchange canceled your order before accepting it to the order book. | NEW | PARTIALLY_FILLED | Part of your order was filled. | NEW | FILLED | Whole order was filled. | NEW | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | NEW | CANCELED | Your order was canceled. | PARTIALLY_FILLED | FILLED | Remaining active part of the order was filled succesfully. | PARTIALLY_FILLED | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | PARTIALLY_FILLED | CANCELED | Your order was canceled. | PENDING_CANCEL | NEW | Exchange responded to the cancelation message that your order is fully active in the order book. | PENDING_CANCEL | PARTIALLY_FILLED | Your order was filled partially after we relayed cancelation message to the exchange. | PENDING_CANCEL | FILLED | Your order was completely filled before the cancel was executed by the exchange. | PENDING_CANCEL | CANCELED | Your order was canceled. 
  static const OrderStatus pARTIALLYFILLED_ = const OrderStatus._internal("PARTIALLY_FILLED");
  /// Order statuses ##### Status description  | Name | Possible transitions to | Status description  | --- | --- | --- | | RECEIVED | REJECTED, ROUTING | We received an order and will send it to the exchange immedaitely | ROUTING | ROUTED | We are in the process of sending order to the exchange | ROUTED | REJECTED, NEW, PARTIALLY_FILLED, FILLED, CANCELED | Order was sent to the exchange from our side, but it&#39;s not yet active in order book | NEW | PARTIALLY_FILLED, FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s untouched | PENDING_CANCEL | NEW, PARTIALLY_FILLED, FILLED, CANCELED | We received order cancel request and relayed it succesfully to the exchange.  | PARTIALLY_FILLED | FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s partially filled | FILLED | | Order is no longer active in the order book as was completely filled  | CANCELED | | Order is no longer active in the order book as was canceled | REJECTED | | Order was rejected by OMS or exchange. ##### Status transitions  | Source Status | Destination status | Description | --- | --- | --- | | | RECEIVED | OMS received new order from you | | NEW | OMS received unseen new order from the exchange (order was relayed to the exchnage outside the OMS) | | PARTIALLY_FILLED | OMS received unseen partially filled order from the exchange (order was relayed to the exchnage outside the OMS) | RECEIVED | REJECTED | OMS rejected your order | RECEIVED | ROUTING | We started relaying order to the exchange | ROUTING | ROUTED | Order was relayed to the exchange and we are waiting to be active in the order book | ROUTED | REJECTED | Exchange rejected your order | ROUTED | NEW | Exchange accepted your passive order into order book | ROUTED | PARTIALLY_FILLED | Exchange actively filled part of your order and the remaining was accepted into order book | ROUTED | FILLED | Exchange actively filled your order in whole. | ROUTED | CANCELED | Exchange canceled your order before accepting it to the order book. | NEW | PARTIALLY_FILLED | Part of your order was filled. | NEW | FILLED | Whole order was filled. | NEW | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | NEW | CANCELED | Your order was canceled. | PARTIALLY_FILLED | FILLED | Remaining active part of the order was filled succesfully. | PARTIALLY_FILLED | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | PARTIALLY_FILLED | CANCELED | Your order was canceled. | PENDING_CANCEL | NEW | Exchange responded to the cancelation message that your order is fully active in the order book. | PENDING_CANCEL | PARTIALLY_FILLED | Your order was filled partially after we relayed cancelation message to the exchange. | PENDING_CANCEL | FILLED | Your order was completely filled before the cancel was executed by the exchange. | PENDING_CANCEL | CANCELED | Your order was canceled. 
  static const OrderStatus fILLED_ = const OrderStatus._internal("FILLED");
  /// Order statuses ##### Status description  | Name | Possible transitions to | Status description  | --- | --- | --- | | RECEIVED | REJECTED, ROUTING | We received an order and will send it to the exchange immedaitely | ROUTING | ROUTED | We are in the process of sending order to the exchange | ROUTED | REJECTED, NEW, PARTIALLY_FILLED, FILLED, CANCELED | Order was sent to the exchange from our side, but it&#39;s not yet active in order book | NEW | PARTIALLY_FILLED, FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s untouched | PENDING_CANCEL | NEW, PARTIALLY_FILLED, FILLED, CANCELED | We received order cancel request and relayed it succesfully to the exchange.  | PARTIALLY_FILLED | FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s partially filled | FILLED | | Order is no longer active in the order book as was completely filled  | CANCELED | | Order is no longer active in the order book as was canceled | REJECTED | | Order was rejected by OMS or exchange. ##### Status transitions  | Source Status | Destination status | Description | --- | --- | --- | | | RECEIVED | OMS received new order from you | | NEW | OMS received unseen new order from the exchange (order was relayed to the exchnage outside the OMS) | | PARTIALLY_FILLED | OMS received unseen partially filled order from the exchange (order was relayed to the exchnage outside the OMS) | RECEIVED | REJECTED | OMS rejected your order | RECEIVED | ROUTING | We started relaying order to the exchange | ROUTING | ROUTED | Order was relayed to the exchange and we are waiting to be active in the order book | ROUTED | REJECTED | Exchange rejected your order | ROUTED | NEW | Exchange accepted your passive order into order book | ROUTED | PARTIALLY_FILLED | Exchange actively filled part of your order and the remaining was accepted into order book | ROUTED | FILLED | Exchange actively filled your order in whole. | ROUTED | CANCELED | Exchange canceled your order before accepting it to the order book. | NEW | PARTIALLY_FILLED | Part of your order was filled. | NEW | FILLED | Whole order was filled. | NEW | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | NEW | CANCELED | Your order was canceled. | PARTIALLY_FILLED | FILLED | Remaining active part of the order was filled succesfully. | PARTIALLY_FILLED | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | PARTIALLY_FILLED | CANCELED | Your order was canceled. | PENDING_CANCEL | NEW | Exchange responded to the cancelation message that your order is fully active in the order book. | PENDING_CANCEL | PARTIALLY_FILLED | Your order was filled partially after we relayed cancelation message to the exchange. | PENDING_CANCEL | FILLED | Your order was completely filled before the cancel was executed by the exchange. | PENDING_CANCEL | CANCELED | Your order was canceled. 
  static const OrderStatus cANCELED_ = const OrderStatus._internal("CANCELED");
  /// Order statuses ##### Status description  | Name | Possible transitions to | Status description  | --- | --- | --- | | RECEIVED | REJECTED, ROUTING | We received an order and will send it to the exchange immedaitely | ROUTING | ROUTED | We are in the process of sending order to the exchange | ROUTED | REJECTED, NEW, PARTIALLY_FILLED, FILLED, CANCELED | Order was sent to the exchange from our side, but it&#39;s not yet active in order book | NEW | PARTIALLY_FILLED, FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s untouched | PENDING_CANCEL | NEW, PARTIALLY_FILLED, FILLED, CANCELED | We received order cancel request and relayed it succesfully to the exchange.  | PARTIALLY_FILLED | FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s partially filled | FILLED | | Order is no longer active in the order book as was completely filled  | CANCELED | | Order is no longer active in the order book as was canceled | REJECTED | | Order was rejected by OMS or exchange. ##### Status transitions  | Source Status | Destination status | Description | --- | --- | --- | | | RECEIVED | OMS received new order from you | | NEW | OMS received unseen new order from the exchange (order was relayed to the exchnage outside the OMS) | | PARTIALLY_FILLED | OMS received unseen partially filled order from the exchange (order was relayed to the exchnage outside the OMS) | RECEIVED | REJECTED | OMS rejected your order | RECEIVED | ROUTING | We started relaying order to the exchange | ROUTING | ROUTED | Order was relayed to the exchange and we are waiting to be active in the order book | ROUTED | REJECTED | Exchange rejected your order | ROUTED | NEW | Exchange accepted your passive order into order book | ROUTED | PARTIALLY_FILLED | Exchange actively filled part of your order and the remaining was accepted into order book | ROUTED | FILLED | Exchange actively filled your order in whole. | ROUTED | CANCELED | Exchange canceled your order before accepting it to the order book. | NEW | PARTIALLY_FILLED | Part of your order was filled. | NEW | FILLED | Whole order was filled. | NEW | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | NEW | CANCELED | Your order was canceled. | PARTIALLY_FILLED | FILLED | Remaining active part of the order was filled succesfully. | PARTIALLY_FILLED | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | PARTIALLY_FILLED | CANCELED | Your order was canceled. | PENDING_CANCEL | NEW | Exchange responded to the cancelation message that your order is fully active in the order book. | PENDING_CANCEL | PARTIALLY_FILLED | Your order was filled partially after we relayed cancelation message to the exchange. | PENDING_CANCEL | FILLED | Your order was completely filled before the cancel was executed by the exchange. | PENDING_CANCEL | CANCELED | Your order was canceled. 
  static const OrderStatus rEJECTED_ = const OrderStatus._internal("REJECTED");

  static OrderStatus fromJson(String value) {
    return new OrderStatusTypeTransformer().decode(value);
  }
  
  static List<OrderStatus> listFromJson(List<dynamic> json) {
    return json == null ? new List<OrderStatus>() : json.map((value) => OrderStatus.fromJson(value)).toList();
  }
}

class OrderStatusTypeTransformer {

  dynamic encode(OrderStatus data) {
    return data.value;
  }

  OrderStatus decode(dynamic data) {
    switch (data) {
      case "RECEIVED": return OrderStatus.rECEIVED_;
      case "ROUTING": return OrderStatus.rOUTING_;
      case "ROUTED": return OrderStatus.rOUTED_;
      case "NEW": return OrderStatus.nEW_;
      case "PENDING_CANCEL": return OrderStatus.pENDINGCANCEL_;
      case "PARTIALLY_FILLED": return OrderStatus.pARTIALLYFILLED_;
      case "FILLED": return OrderStatus.fILLED_;
      case "CANCELED": return OrderStatus.cANCELED_;
      case "REJECTED": return OrderStatus.rEJECTED_;
      default: throw('Unknown enum value to decode: $data');
    }
  }
}

