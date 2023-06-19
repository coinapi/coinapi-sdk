/**
 * EMS - REST API
 * This section will provide necessary information about the `CoinAPI EMS REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>        Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints  <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this: `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.6.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/OrderExecutionReport.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



OrderExecutionReport::OrderExecutionReport()
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
    m_Client_order_id_format_exchange = utility::conversions::to_string_t("");
    m_Client_order_id_format_exchangeIsSet = false;
    m_Exchange_order_id = utility::conversions::to_string_t("");
    m_Exchange_order_idIsSet = false;
    m_Amount_open = 0.0;
    m_Amount_openIsSet = false;
    m_Amount_filled = 0.0;
    m_Amount_filledIsSet = false;
    m_Avg_px = 0.0;
    m_Avg_pxIsSet = false;
    m_StatusIsSet = false;
    m_Status_historyIsSet = false;
    m_Error_message = utility::conversions::to_string_t("");
    m_Error_messageIsSet = false;
    m_FillsIsSet = false;
}

OrderExecutionReport::~OrderExecutionReport()
{
}

void OrderExecutionReport::validate()
{
    // TODO: implement validation
}

web::json::value OrderExecutionReport::toJson() const
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
    if(m_Client_order_id_format_exchangeIsSet)
    {
        val[utility::conversions::to_string_t(U("client_order_id_format_exchange"))] = ModelBase::toJson(m_Client_order_id_format_exchange);
    }
    if(m_Exchange_order_idIsSet)
    {
        val[utility::conversions::to_string_t(U("exchange_order_id"))] = ModelBase::toJson(m_Exchange_order_id);
    }
    if(m_Amount_openIsSet)
    {
        val[utility::conversions::to_string_t(U("amount_open"))] = ModelBase::toJson(m_Amount_open);
    }
    if(m_Amount_filledIsSet)
    {
        val[utility::conversions::to_string_t(U("amount_filled"))] = ModelBase::toJson(m_Amount_filled);
    }
    if(m_Avg_pxIsSet)
    {
        val[utility::conversions::to_string_t(U("avg_px"))] = ModelBase::toJson(m_Avg_px);
    }
    if(m_StatusIsSet)
    {
        val[utility::conversions::to_string_t(U("status"))] = ModelBase::toJson(m_Status);
    }
    if(m_Status_historyIsSet)
    {
        val[utility::conversions::to_string_t(U("status_history"))] = ModelBase::toJson(m_Status_history);
    }
    if(m_Error_messageIsSet)
    {
        val[utility::conversions::to_string_t(U("error_message"))] = ModelBase::toJson(m_Error_message);
    }
    if(m_FillsIsSet)
    {
        val[utility::conversions::to_string_t(U("fills"))] = ModelBase::toJson(m_Fills);
    }

    return val;
}

bool OrderExecutionReport::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("exchange_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("exchange_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setExchangeId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setExchangeId);
            setExchangeId(refVal_setExchangeId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("client_order_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("client_order_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setClientOrderId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setClientOrderId);
            setClientOrderId(refVal_setClientOrderId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("symbol_id_exchange"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("symbol_id_exchange")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setSymbolIdExchange;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSymbolIdExchange);
            setSymbolIdExchange(refVal_setSymbolIdExchange);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("symbol_id_coinapi"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("symbol_id_coinapi")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setSymbolIdCoinapi;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSymbolIdCoinapi);
            setSymbolIdCoinapi(refVal_setSymbolIdCoinapi);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("amount_order"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("amount_order")));
        if(!fieldValue.is_null())
        {
            double refVal_setAmountOrder;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAmountOrder);
            setAmountOrder(refVal_setAmountOrder);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("price"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("price")));
        if(!fieldValue.is_null())
        {
            double refVal_setPrice;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPrice);
            setPrice(refVal_setPrice);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("side"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("side")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OrdSide> refVal_setSide;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSide);
            setSide(refVal_setSide);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("order_type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("order_type")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OrdType> refVal_setOrderType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setOrderType);
            setOrderType(refVal_setOrderType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("time_in_force"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("time_in_force")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<TimeInForce> refVal_setTimeInForce;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTimeInForce);
            setTimeInForce(refVal_setTimeInForce);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("expire_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("expire_time")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<utility::datetime> refVal_setExpireTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setExpireTime);
            setExpireTime(refVal_setExpireTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("exec_inst"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("exec_inst")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setExecInst;
            ok &= ModelBase::fromJson(fieldValue, refVal_setExecInst);
            setExecInst(refVal_setExecInst);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("client_order_id_format_exchange"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("client_order_id_format_exchange")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setClientOrderIdFormatExchange;
            ok &= ModelBase::fromJson(fieldValue, refVal_setClientOrderIdFormatExchange);
            setClientOrderIdFormatExchange(refVal_setClientOrderIdFormatExchange);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("exchange_order_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("exchange_order_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setExchangeOrderId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setExchangeOrderId);
            setExchangeOrderId(refVal_setExchangeOrderId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("amount_open"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("amount_open")));
        if(!fieldValue.is_null())
        {
            double refVal_setAmountOpen;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAmountOpen);
            setAmountOpen(refVal_setAmountOpen);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("amount_filled"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("amount_filled")));
        if(!fieldValue.is_null())
        {
            double refVal_setAmountFilled;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAmountFilled);
            setAmountFilled(refVal_setAmountFilled);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("avg_px"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("avg_px")));
        if(!fieldValue.is_null())
        {
            double refVal_setAvgPx;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAvgPx);
            setAvgPx(refVal_setAvgPx);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("status"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("status")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OrdStatus> refVal_setStatus;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStatus);
            setStatus(refVal_setStatus);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("status_history"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("status_history")));
        if(!fieldValue.is_null())
        {
            std::vector<std::vector<utility::string_t>> refVal_setStatusHistory;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStatusHistory);
            setStatusHistory(refVal_setStatusHistory);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("error_message"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("error_message")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setErrorMessage;
            ok &= ModelBase::fromJson(fieldValue, refVal_setErrorMessage);
            setErrorMessage(refVal_setErrorMessage);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("fills"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("fills")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<Fills>> refVal_setFills;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFills);
            setFills(refVal_setFills);
        }
    }
    return ok;
}

void OrderExecutionReport::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_Client_order_id_format_exchangeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("client_order_id_format_exchange")), m_Client_order_id_format_exchange));
    }
    if(m_Exchange_order_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("exchange_order_id")), m_Exchange_order_id));
    }
    if(m_Amount_openIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("amount_open")), m_Amount_open));
    }
    if(m_Amount_filledIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("amount_filled")), m_Amount_filled));
    }
    if(m_Avg_pxIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("avg_px")), m_Avg_px));
    }
    if(m_StatusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("status")), m_Status));
    }
    if(m_Status_historyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("status_history")), m_Status_history));
    }
    if(m_Error_messageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("error_message")), m_Error_message));
    }
    if(m_FillsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("fills")), m_Fills));
    }
}

bool OrderExecutionReport::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("exchange_id"))))
    {
        utility::string_t refVal_setExchangeId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("exchange_id"))), refVal_setExchangeId );
        setExchangeId(refVal_setExchangeId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("client_order_id"))))
    {
        utility::string_t refVal_setClientOrderId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("client_order_id"))), refVal_setClientOrderId );
        setClientOrderId(refVal_setClientOrderId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("symbol_id_exchange"))))
    {
        utility::string_t refVal_setSymbolIdExchange;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("symbol_id_exchange"))), refVal_setSymbolIdExchange );
        setSymbolIdExchange(refVal_setSymbolIdExchange);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("symbol_id_coinapi"))))
    {
        utility::string_t refVal_setSymbolIdCoinapi;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("symbol_id_coinapi"))), refVal_setSymbolIdCoinapi );
        setSymbolIdCoinapi(refVal_setSymbolIdCoinapi);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("amount_order"))))
    {
        double refVal_setAmountOrder;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("amount_order"))), refVal_setAmountOrder );
        setAmountOrder(refVal_setAmountOrder);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("price"))))
    {
        double refVal_setPrice;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("price"))), refVal_setPrice );
        setPrice(refVal_setPrice);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("side"))))
    {
        std::shared_ptr<OrdSide> refVal_setSide;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("side"))), refVal_setSide );
        setSide(refVal_setSide);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("order_type"))))
    {
        std::shared_ptr<OrdType> refVal_setOrderType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("order_type"))), refVal_setOrderType );
        setOrderType(refVal_setOrderType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("time_in_force"))))
    {
        std::shared_ptr<TimeInForce> refVal_setTimeInForce;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("time_in_force"))), refVal_setTimeInForce );
        setTimeInForce(refVal_setTimeInForce);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("expire_time"))))
    {
        std::shared_ptr<utility::datetime> refVal_setExpireTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("expire_time"))), refVal_setExpireTime );
        setExpireTime(refVal_setExpireTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("exec_inst"))))
    {
        std::vector<utility::string_t> refVal_setExecInst;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("exec_inst"))), refVal_setExecInst );
        setExecInst(refVal_setExecInst);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("client_order_id_format_exchange"))))
    {
        utility::string_t refVal_setClientOrderIdFormatExchange;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("client_order_id_format_exchange"))), refVal_setClientOrderIdFormatExchange );
        setClientOrderIdFormatExchange(refVal_setClientOrderIdFormatExchange);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("exchange_order_id"))))
    {
        utility::string_t refVal_setExchangeOrderId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("exchange_order_id"))), refVal_setExchangeOrderId );
        setExchangeOrderId(refVal_setExchangeOrderId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("amount_open"))))
    {
        double refVal_setAmountOpen;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("amount_open"))), refVal_setAmountOpen );
        setAmountOpen(refVal_setAmountOpen);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("amount_filled"))))
    {
        double refVal_setAmountFilled;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("amount_filled"))), refVal_setAmountFilled );
        setAmountFilled(refVal_setAmountFilled);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("avg_px"))))
    {
        double refVal_setAvgPx;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("avg_px"))), refVal_setAvgPx );
        setAvgPx(refVal_setAvgPx);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("status"))))
    {
        std::shared_ptr<OrdStatus> refVal_setStatus;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("status"))), refVal_setStatus );
        setStatus(refVal_setStatus);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("status_history"))))
    {
        std::vector<std::vector<utility::string_t>> refVal_setStatusHistory;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("status_history"))), refVal_setStatusHistory );
        setStatusHistory(refVal_setStatusHistory);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("error_message"))))
    {
        utility::string_t refVal_setErrorMessage;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("error_message"))), refVal_setErrorMessage );
        setErrorMessage(refVal_setErrorMessage);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("fills"))))
    {
        std::vector<std::shared_ptr<Fills>> refVal_setFills;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("fills"))), refVal_setFills );
        setFills(refVal_setFills);
    }
    return ok;
}

utility::string_t OrderExecutionReport::getExchangeId() const
{
    return m_Exchange_id;
}

void OrderExecutionReport::setExchangeId(const utility::string_t& value)
{
    m_Exchange_id = value;
    m_Exchange_idIsSet = true;
}

bool OrderExecutionReport::exchangeIdIsSet() const
{
    return m_Exchange_idIsSet;
}

void OrderExecutionReport::unsetExchange_id()
{
    m_Exchange_idIsSet = false;
}
utility::string_t OrderExecutionReport::getClientOrderId() const
{
    return m_Client_order_id;
}

void OrderExecutionReport::setClientOrderId(const utility::string_t& value)
{
    m_Client_order_id = value;
    m_Client_order_idIsSet = true;
}

bool OrderExecutionReport::clientOrderIdIsSet() const
{
    return m_Client_order_idIsSet;
}

void OrderExecutionReport::unsetClient_order_id()
{
    m_Client_order_idIsSet = false;
}
utility::string_t OrderExecutionReport::getSymbolIdExchange() const
{
    return m_Symbol_id_exchange;
}

void OrderExecutionReport::setSymbolIdExchange(const utility::string_t& value)
{
    m_Symbol_id_exchange = value;
    m_Symbol_id_exchangeIsSet = true;
}

bool OrderExecutionReport::symbolIdExchangeIsSet() const
{
    return m_Symbol_id_exchangeIsSet;
}

void OrderExecutionReport::unsetSymbol_id_exchange()
{
    m_Symbol_id_exchangeIsSet = false;
}
utility::string_t OrderExecutionReport::getSymbolIdCoinapi() const
{
    return m_Symbol_id_coinapi;
}

void OrderExecutionReport::setSymbolIdCoinapi(const utility::string_t& value)
{
    m_Symbol_id_coinapi = value;
    m_Symbol_id_coinapiIsSet = true;
}

bool OrderExecutionReport::symbolIdCoinapiIsSet() const
{
    return m_Symbol_id_coinapiIsSet;
}

void OrderExecutionReport::unsetSymbol_id_coinapi()
{
    m_Symbol_id_coinapiIsSet = false;
}
double OrderExecutionReport::getAmountOrder() const
{
    return m_Amount_order;
}

void OrderExecutionReport::setAmountOrder(double value)
{
    m_Amount_order = value;
    m_Amount_orderIsSet = true;
}

bool OrderExecutionReport::amountOrderIsSet() const
{
    return m_Amount_orderIsSet;
}

void OrderExecutionReport::unsetAmount_order()
{
    m_Amount_orderIsSet = false;
}
double OrderExecutionReport::getPrice() const
{
    return m_Price;
}

void OrderExecutionReport::setPrice(double value)
{
    m_Price = value;
    m_PriceIsSet = true;
}

bool OrderExecutionReport::priceIsSet() const
{
    return m_PriceIsSet;
}

void OrderExecutionReport::unsetPrice()
{
    m_PriceIsSet = false;
}
std::shared_ptr<OrdSide> OrderExecutionReport::getSide() const
{
    return m_Side;
}

void OrderExecutionReport::setSide(const std::shared_ptr<OrdSide>& value)
{
    m_Side = value;
    m_SideIsSet = true;
}

bool OrderExecutionReport::sideIsSet() const
{
    return m_SideIsSet;
}

void OrderExecutionReport::unsetSide()
{
    m_SideIsSet = false;
}
std::shared_ptr<OrdType> OrderExecutionReport::getOrderType() const
{
    return m_Order_type;
}

void OrderExecutionReport::setOrderType(const std::shared_ptr<OrdType>& value)
{
    m_Order_type = value;
    m_Order_typeIsSet = true;
}

bool OrderExecutionReport::orderTypeIsSet() const
{
    return m_Order_typeIsSet;
}

void OrderExecutionReport::unsetOrder_type()
{
    m_Order_typeIsSet = false;
}
std::shared_ptr<TimeInForce> OrderExecutionReport::getTimeInForce() const
{
    return m_Time_in_force;
}

void OrderExecutionReport::setTimeInForce(const std::shared_ptr<TimeInForce>& value)
{
    m_Time_in_force = value;
    m_Time_in_forceIsSet = true;
}

bool OrderExecutionReport::timeInForceIsSet() const
{
    return m_Time_in_forceIsSet;
}

void OrderExecutionReport::unsetTime_in_force()
{
    m_Time_in_forceIsSet = false;
}
std::shared_ptr<utility::datetime> OrderExecutionReport::getExpireTime() const
{
    return m_Expire_time;
}

void OrderExecutionReport::setExpireTime(const std::shared_ptr<utility::datetime>& value)
{
    m_Expire_time = value;
    m_Expire_timeIsSet = true;
}

bool OrderExecutionReport::expireTimeIsSet() const
{
    return m_Expire_timeIsSet;
}

void OrderExecutionReport::unsetExpire_time()
{
    m_Expire_timeIsSet = false;
}
std::vector<utility::string_t>& OrderExecutionReport::getExecInst()
{
    return m_Exec_inst;
}

void OrderExecutionReport::setExecInst(const std::vector<utility::string_t>& value)
{
    m_Exec_inst = value;
    m_Exec_instIsSet = true;
}

bool OrderExecutionReport::execInstIsSet() const
{
    return m_Exec_instIsSet;
}

void OrderExecutionReport::unsetExec_inst()
{
    m_Exec_instIsSet = false;
}
utility::string_t OrderExecutionReport::getClientOrderIdFormatExchange() const
{
    return m_Client_order_id_format_exchange;
}

void OrderExecutionReport::setClientOrderIdFormatExchange(const utility::string_t& value)
{
    m_Client_order_id_format_exchange = value;
    m_Client_order_id_format_exchangeIsSet = true;
}

bool OrderExecutionReport::clientOrderIdFormatExchangeIsSet() const
{
    return m_Client_order_id_format_exchangeIsSet;
}

void OrderExecutionReport::unsetClient_order_id_format_exchange()
{
    m_Client_order_id_format_exchangeIsSet = false;
}
utility::string_t OrderExecutionReport::getExchangeOrderId() const
{
    return m_Exchange_order_id;
}

void OrderExecutionReport::setExchangeOrderId(const utility::string_t& value)
{
    m_Exchange_order_id = value;
    m_Exchange_order_idIsSet = true;
}

bool OrderExecutionReport::exchangeOrderIdIsSet() const
{
    return m_Exchange_order_idIsSet;
}

void OrderExecutionReport::unsetExchange_order_id()
{
    m_Exchange_order_idIsSet = false;
}
double OrderExecutionReport::getAmountOpen() const
{
    return m_Amount_open;
}

void OrderExecutionReport::setAmountOpen(double value)
{
    m_Amount_open = value;
    m_Amount_openIsSet = true;
}

bool OrderExecutionReport::amountOpenIsSet() const
{
    return m_Amount_openIsSet;
}

void OrderExecutionReport::unsetAmount_open()
{
    m_Amount_openIsSet = false;
}
double OrderExecutionReport::getAmountFilled() const
{
    return m_Amount_filled;
}

void OrderExecutionReport::setAmountFilled(double value)
{
    m_Amount_filled = value;
    m_Amount_filledIsSet = true;
}

bool OrderExecutionReport::amountFilledIsSet() const
{
    return m_Amount_filledIsSet;
}

void OrderExecutionReport::unsetAmount_filled()
{
    m_Amount_filledIsSet = false;
}
double OrderExecutionReport::getAvgPx() const
{
    return m_Avg_px;
}

void OrderExecutionReport::setAvgPx(double value)
{
    m_Avg_px = value;
    m_Avg_pxIsSet = true;
}

bool OrderExecutionReport::avgPxIsSet() const
{
    return m_Avg_pxIsSet;
}

void OrderExecutionReport::unsetAvg_px()
{
    m_Avg_pxIsSet = false;
}
std::shared_ptr<OrdStatus> OrderExecutionReport::getStatus() const
{
    return m_Status;
}

void OrderExecutionReport::setStatus(const std::shared_ptr<OrdStatus>& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}

bool OrderExecutionReport::statusIsSet() const
{
    return m_StatusIsSet;
}

void OrderExecutionReport::unsetStatus()
{
    m_StatusIsSet = false;
}
std::vector<std::vector<utility::string_t>>& OrderExecutionReport::getStatusHistory()
{
    return m_Status_history;
}

void OrderExecutionReport::setStatusHistory(const std::vector<std::vector<utility::string_t>>& value)
{
    m_Status_history = value;
    m_Status_historyIsSet = true;
}

bool OrderExecutionReport::statusHistoryIsSet() const
{
    return m_Status_historyIsSet;
}

void OrderExecutionReport::unsetStatus_history()
{
    m_Status_historyIsSet = false;
}
utility::string_t OrderExecutionReport::getErrorMessage() const
{
    return m_Error_message;
}

void OrderExecutionReport::setErrorMessage(const utility::string_t& value)
{
    m_Error_message = value;
    m_Error_messageIsSet = true;
}

bool OrderExecutionReport::errorMessageIsSet() const
{
    return m_Error_messageIsSet;
}

void OrderExecutionReport::unsetError_message()
{
    m_Error_messageIsSet = false;
}
std::vector<std::shared_ptr<Fills>>& OrderExecutionReport::getFills()
{
    return m_Fills;
}

void OrderExecutionReport::setFills(const std::vector<std::shared_ptr<Fills>>& value)
{
    m_Fills = value;
    m_FillsIsSet = true;
}

bool OrderExecutionReport::fillsIsSet() const
{
    return m_FillsIsSet;
}

void OrderExecutionReport::unsetFills()
{
    m_FillsIsSet = false;
}
}
}
}
}


