/**
 * OEML - REST API
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol. <br/> This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       <br/><br/> Implemented Standards:   * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)  * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)  * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540) 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.3.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "OrderNewSingleRequest.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




OrderNewSingleRequest::OrderNewSingleRequest()
{
    m_Exchange_id = utility::conversions::to_string_t("");
    m_Exchange_idIsSet = false;
    m_Client_order_id = utility::conversions::to_string_t("");
    m_Client_order_idIsSet = false;
    m_Symbol_id_exchange = utility::conversions::to_string_t("");
    m_Symbol_id_exchangeIsSet = false;
    m_Symbol_id_coinapi = utility::conversions::to_string_t("");
    m_Symbol_id_coinapiIsSet = false;
    m_Amount_order = 0.0;
    m_Amount_orderIsSet = false;
    m_Price = 0.0;
    m_PriceIsSet = false;
    m_SideIsSet = false;
    m_Order_typeIsSet = false;
    m_Time_in_forceIsSet = false;
    m_Expire_timeIsSet = false;
    m_Exec_instIsSet = false;
}

OrderNewSingleRequest::~OrderNewSingleRequest()
{
}

void OrderNewSingleRequest::validate()
{
    // TODO: implement validation
}

web::json::value OrderNewSingleRequest::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Exchange_idIsSet)
    {
        val[utility::conversions::to_string_t(U("exchange_id"))] = ModelBase::toJson(m_Exchange_id);
    }
    if(m_Client_order_idIsSet)
    {
        val[utility::conversions::to_string_t(U("client_order_id"))] = ModelBase::toJson(m_Client_order_id);
    }
    if(m_Symbol_id_exchangeIsSet)
    {
        val[utility::conversions::to_string_t(U("symbol_id_exchange"))] = ModelBase::toJson(m_Symbol_id_exchange);
    }
    if(m_Symbol_id_coinapiIsSet)
    {
        val[utility::conversions::to_string_t(U("symbol_id_coinapi"))] = ModelBase::toJson(m_Symbol_id_coinapi);
    }
    if(m_Amount_orderIsSet)
    {
        val[utility::conversions::to_string_t(U("amount_order"))] = ModelBase::toJson(m_Amount_order);
    }
    if(m_PriceIsSet)
    {
        val[utility::conversions::to_string_t(U("price"))] = ModelBase::toJson(m_Price);
    }
    if(m_SideIsSet)
    {
        val[utility::conversions::to_string_t(U("side"))] = ModelBase::toJson(m_Side);
    }
    if(m_Order_typeIsSet)
    {
        val[utility::conversions::to_string_t(U("order_type"))] = ModelBase::toJson(m_Order_type);
    }
    if(m_Time_in_forceIsSet)
    {
        val[utility::conversions::to_string_t(U("time_in_force"))] = ModelBase::toJson(m_Time_in_force);
    }
    if(m_Expire_timeIsSet)
    {
        val[utility::conversions::to_string_t(U("expire_time"))] = ModelBase::toJson(m_Expire_time);
    }
    if(m_Exec_instIsSet)
    {
        val[utility::conversions::to_string_t(U("exec_inst"))] = ModelBase::toJson(m_Exec_inst);
    }

    return val;
}

bool OrderNewSingleRequest::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("exchange_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("exchange_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_exchange_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_exchange_id);
            setExchangeId(refVal_exchange_id);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("client_order_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("client_order_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_client_order_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_client_order_id);
            setClientOrderId(refVal_client_order_id);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("symbol_id_exchange"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("symbol_id_exchange")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_symbol_id_exchange;
            ok &= ModelBase::fromJson(fieldValue, refVal_symbol_id_exchange);
            setSymbolIdExchange(refVal_symbol_id_exchange);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("symbol_id_coinapi"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("symbol_id_coinapi")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_symbol_id_coinapi;
            ok &= ModelBase::fromJson(fieldValue, refVal_symbol_id_coinapi);
            setSymbolIdCoinapi(refVal_symbol_id_coinapi);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("amount_order"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("amount_order")));
        if(!fieldValue.is_null())
        {
            double refVal_amount_order;
            ok &= ModelBase::fromJson(fieldValue, refVal_amount_order);
            setAmountOrder(refVal_amount_order);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("price"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("price")));
        if(!fieldValue.is_null())
        {
            double refVal_price;
            ok &= ModelBase::fromJson(fieldValue, refVal_price);
            setPrice(refVal_price);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("side"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("side")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OrdSide> refVal_side;
            ok &= ModelBase::fromJson(fieldValue, refVal_side);
            setSide(refVal_side);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("order_type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("order_type")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OrdType> refVal_order_type;
            ok &= ModelBase::fromJson(fieldValue, refVal_order_type);
            setOrderType(refVal_order_type);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("time_in_force"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("time_in_force")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<TimeInForce> refVal_time_in_force;
            ok &= ModelBase::fromJson(fieldValue, refVal_time_in_force);
            setTimeInForce(refVal_time_in_force);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("expire_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("expire_time")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<utility::datetime> refVal_expire_time;
            ok &= ModelBase::fromJson(fieldValue, refVal_expire_time);
            setExpireTime(refVal_expire_time);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("exec_inst"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("exec_inst")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_exec_inst;
            ok &= ModelBase::fromJson(fieldValue, refVal_exec_inst);
            setExecInst(refVal_exec_inst);
        }
    }
    return ok;
}

void OrderNewSingleRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Exchange_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("exchange_id")), m_Exchange_id));
    }
    if(m_Client_order_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("client_order_id")), m_Client_order_id));
    }
    if(m_Symbol_id_exchangeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("symbol_id_exchange")), m_Symbol_id_exchange));
    }
    if(m_Symbol_id_coinapiIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("symbol_id_coinapi")), m_Symbol_id_coinapi));
    }
    if(m_Amount_orderIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("amount_order")), m_Amount_order));
    }
    if(m_PriceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("price")), m_Price));
    }
    if(m_SideIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("side")), m_Side));
    }
    if(m_Order_typeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("order_type")), m_Order_type));
    }
    if(m_Time_in_forceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("time_in_force")), m_Time_in_force));
    }
    if(m_Expire_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("expire_time")), m_Expire_time));
    }
    if(m_Exec_instIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("exec_inst")), m_Exec_inst));
    }
}

bool OrderNewSingleRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("exchange_id"))))
    {
        utility::string_t refVal_exchange_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("exchange_id"))), refVal_exchange_id );
        setExchangeId(refVal_exchange_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("client_order_id"))))
    {
        utility::string_t refVal_client_order_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("client_order_id"))), refVal_client_order_id );
        setClientOrderId(refVal_client_order_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("symbol_id_exchange"))))
    {
        utility::string_t refVal_symbol_id_exchange;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("symbol_id_exchange"))), refVal_symbol_id_exchange );
        setSymbolIdExchange(refVal_symbol_id_exchange);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("symbol_id_coinapi"))))
    {
        utility::string_t refVal_symbol_id_coinapi;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("symbol_id_coinapi"))), refVal_symbol_id_coinapi );
        setSymbolIdCoinapi(refVal_symbol_id_coinapi);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("amount_order"))))
    {
        double refVal_amount_order;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("amount_order"))), refVal_amount_order );
        setAmountOrder(refVal_amount_order);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("price"))))
    {
        double refVal_price;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("price"))), refVal_price );
        setPrice(refVal_price);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("side"))))
    {
        std::shared_ptr<OrdSide> refVal_side;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("side"))), refVal_side );
        setSide(refVal_side);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("order_type"))))
    {
        std::shared_ptr<OrdType> refVal_order_type;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("order_type"))), refVal_order_type );
        setOrderType(refVal_order_type);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("time_in_force"))))
    {
        std::shared_ptr<TimeInForce> refVal_time_in_force;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("time_in_force"))), refVal_time_in_force );
        setTimeInForce(refVal_time_in_force);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("expire_time"))))
    {
        std::shared_ptr<utility::datetime> refVal_expire_time;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("expire_time"))), refVal_expire_time );
        setExpireTime(refVal_expire_time);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("exec_inst"))))
    {
        std::vector<utility::string_t> refVal_exec_inst;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("exec_inst"))), refVal_exec_inst );
        setExecInst(refVal_exec_inst);
    }
    return ok;
}

utility::string_t OrderNewSingleRequest::getExchangeId() const
{
    return m_Exchange_id;
}

void OrderNewSingleRequest::setExchangeId(const utility::string_t& value)
{
    m_Exchange_id = value;
    m_Exchange_idIsSet = true;
}

bool OrderNewSingleRequest::exchangeIdIsSet() const
{
    return m_Exchange_idIsSet;
}

void OrderNewSingleRequest::unsetExchange_id()
{
    m_Exchange_idIsSet = false;
}
utility::string_t OrderNewSingleRequest::getClientOrderId() const
{
    return m_Client_order_id;
}

void OrderNewSingleRequest::setClientOrderId(const utility::string_t& value)
{
    m_Client_order_id = value;
    m_Client_order_idIsSet = true;
}

bool OrderNewSingleRequest::clientOrderIdIsSet() const
{
    return m_Client_order_idIsSet;
}

void OrderNewSingleRequest::unsetClient_order_id()
{
    m_Client_order_idIsSet = false;
}
utility::string_t OrderNewSingleRequest::getSymbolIdExchange() const
{
    return m_Symbol_id_exchange;
}

void OrderNewSingleRequest::setSymbolIdExchange(const utility::string_t& value)
{
    m_Symbol_id_exchange = value;
    m_Symbol_id_exchangeIsSet = true;
}

bool OrderNewSingleRequest::symbolIdExchangeIsSet() const
{
    return m_Symbol_id_exchangeIsSet;
}

void OrderNewSingleRequest::unsetSymbol_id_exchange()
{
    m_Symbol_id_exchangeIsSet = false;
}
utility::string_t OrderNewSingleRequest::getSymbolIdCoinapi() const
{
    return m_Symbol_id_coinapi;
}

void OrderNewSingleRequest::setSymbolIdCoinapi(const utility::string_t& value)
{
    m_Symbol_id_coinapi = value;
    m_Symbol_id_coinapiIsSet = true;
}

bool OrderNewSingleRequest::symbolIdCoinapiIsSet() const
{
    return m_Symbol_id_coinapiIsSet;
}

void OrderNewSingleRequest::unsetSymbol_id_coinapi()
{
    m_Symbol_id_coinapiIsSet = false;
}
double OrderNewSingleRequest::getAmountOrder() const
{
    return m_Amount_order;
}

void OrderNewSingleRequest::setAmountOrder(double value)
{
    m_Amount_order = value;
    m_Amount_orderIsSet = true;
}

bool OrderNewSingleRequest::amountOrderIsSet() const
{
    return m_Amount_orderIsSet;
}

void OrderNewSingleRequest::unsetAmount_order()
{
    m_Amount_orderIsSet = false;
}
double OrderNewSingleRequest::getPrice() const
{
    return m_Price;
}

void OrderNewSingleRequest::setPrice(double value)
{
    m_Price = value;
    m_PriceIsSet = true;
}

bool OrderNewSingleRequest::priceIsSet() const
{
    return m_PriceIsSet;
}

void OrderNewSingleRequest::unsetPrice()
{
    m_PriceIsSet = false;
}
std::shared_ptr<OrdSide> OrderNewSingleRequest::getSide() const
{
    return m_Side;
}

void OrderNewSingleRequest::setSide(const std::shared_ptr<OrdSide>& value)
{
    m_Side = value;
    m_SideIsSet = true;
}

bool OrderNewSingleRequest::sideIsSet() const
{
    return m_SideIsSet;
}

void OrderNewSingleRequest::unsetSide()
{
    m_SideIsSet = false;
}
std::shared_ptr<OrdType> OrderNewSingleRequest::getOrderType() const
{
    return m_Order_type;
}

void OrderNewSingleRequest::setOrderType(const std::shared_ptr<OrdType>& value)
{
    m_Order_type = value;
    m_Order_typeIsSet = true;
}

bool OrderNewSingleRequest::orderTypeIsSet() const
{
    return m_Order_typeIsSet;
}

void OrderNewSingleRequest::unsetOrder_type()
{
    m_Order_typeIsSet = false;
}
std::shared_ptr<TimeInForce> OrderNewSingleRequest::getTimeInForce() const
{
    return m_Time_in_force;
}

void OrderNewSingleRequest::setTimeInForce(const std::shared_ptr<TimeInForce>& value)
{
    m_Time_in_force = value;
    m_Time_in_forceIsSet = true;
}

bool OrderNewSingleRequest::timeInForceIsSet() const
{
    return m_Time_in_forceIsSet;
}

void OrderNewSingleRequest::unsetTime_in_force()
{
    m_Time_in_forceIsSet = false;
}
std::shared_ptr<utility::datetime> OrderNewSingleRequest::getExpireTime() const
{
    return m_Expire_time;
}

void OrderNewSingleRequest::setExpireTime(const std::shared_ptr<utility::datetime>& value)
{
    m_Expire_time = value;
    m_Expire_timeIsSet = true;
}

bool OrderNewSingleRequest::expireTimeIsSet() const
{
    return m_Expire_timeIsSet;
}

void OrderNewSingleRequest::unsetExpire_time()
{
    m_Expire_timeIsSet = false;
}
std::vector<utility::string_t>& OrderNewSingleRequest::getExecInst()
{
    return m_Exec_inst;
}

void OrderNewSingleRequest::setExecInst(const std::vector<utility::string_t>& value)
{
    m_Exec_inst = value;
    m_Exec_instIsSet = true;
}

bool OrderNewSingleRequest::execInstIsSet() const
{
    return m_Exec_instIsSet;
}

void OrderNewSingleRequest::unsetExec_inst()
{
    m_Exec_instIsSet = false;
}
}
}
}
}


