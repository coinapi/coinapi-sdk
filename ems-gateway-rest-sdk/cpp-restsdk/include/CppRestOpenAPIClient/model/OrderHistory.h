/**
 * EMS - REST API
 * This section will provide necessary information about the `CoinAPI EMS REST API` protocol. <br/> This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       <br/><br/> Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  <br/><br/> If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: <br/><br/> `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this:  <br/><br/> `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.2.1.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OrderHistory.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OrderHistory_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OrderHistory_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  OrderHistory
    : public ModelBase
{
public:
    OrderHistory();
    virtual ~OrderHistory();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// OrderHistory members

    /// <summary>
    /// Apikey
    /// </summary>
    utility::string_t getApikey() const;
    bool apikeyIsSet() const;
    void unsetApikey();

    void setApikey(const utility::string_t& value);

    /// <summary>
    /// Exchange id
    /// </summary>
    utility::string_t getExchangeId() const;
    bool exchangeIdIsSet() const;
    void unsetExchangeId();

    void setExchangeId(const utility::string_t& value);

    /// <summary>
    /// Client order id
    /// </summary>
    utility::string_t getClientOrderId() const;
    bool clientOrderIdIsSet() const;
    void unsetClientOrderId();

    void setClientOrderId(const utility::string_t& value);

    /// <summary>
    /// Symbol id exchange
    /// </summary>
    utility::string_t getSymbolIdExchange() const;
    bool symbolIdExchangeIsSet() const;
    void unsetSymbolIdExchange();

    void setSymbolIdExchange(const utility::string_t& value);

    /// <summary>
    /// Symbol id in coinapi
    /// </summary>
    utility::string_t getSymbolIdCoinapi() const;
    bool symbolIdCoinapiIsSet() const;
    void unsetSymbolIdCoinapi();

    void setSymbolIdCoinapi(const utility::string_t& value);

    /// <summary>
    /// Amount
    /// </summary>
    double getAmountOrder() const;
    bool amountOrderIsSet() const;
    void unsetAmountOrder();

    void setAmountOrder(double value);

    /// <summary>
    /// Price
    /// </summary>
    double getPrice() const;
    bool priceIsSet() const;
    void unsetPrice();

    void setPrice(double value);

    /// <summary>
    /// 1-buy, 2-sell
    /// </summary>
    double getSide() const;
    bool sideIsSet() const;
    void unsetSide();

    void setSide(double value);

    /// <summary>
    /// Order type
    /// </summary>
    utility::string_t getOrderType() const;
    bool orderTypeIsSet() const;
    void unsetOrderType();

    void setOrderType(const utility::string_t& value);

    /// <summary>
    /// Time in force
    /// </summary>
    utility::string_t getTimeInForce() const;
    bool timeInForceIsSet() const;
    void unsetTimeInForce();

    void setTimeInForce(const utility::string_t& value);

    /// <summary>
    /// Expire time
    /// </summary>
    std::shared_ptr<utility::datetime> getExpireTime() const;
    bool expireTimeIsSet() const;
    void unsetExpireTime();

    void setExpireTime(const std::shared_ptr<utility::datetime>& value);

    /// <summary>
    /// Exec inst
    /// </summary>
    std::vector<utility::string_t>& getExecInst();
    bool execInstIsSet() const;
    void unsetExecInst();

    void setExecInst(const std::vector<utility::string_t>& value);

    /// <summary>
    /// Client order id format
    /// </summary>
    utility::string_t getClientOrderIdFormatExchange() const;
    bool clientOrderIdFormatExchangeIsSet() const;
    void unsetClientOrderIdFormatExchange();

    void setClientOrderIdFormatExchange(const utility::string_t& value);

    /// <summary>
    /// Exchange order id
    /// </summary>
    utility::string_t getExchangeOrderId() const;
    bool exchangeOrderIdIsSet() const;
    void unsetExchangeOrderId();

    void setExchangeOrderId(const utility::string_t& value);

    /// <summary>
    /// Amount open
    /// </summary>
    double getAmountOpen() const;
    bool amountOpenIsSet() const;
    void unsetAmountOpen();

    void setAmountOpen(double value);

    /// <summary>
    /// Amount filled
    /// </summary>
    double getAmountFilled() const;
    bool amountFilledIsSet() const;
    void unsetAmountFilled();

    void setAmountFilled(double value);

    /// <summary>
    /// Average price
    /// </summary>
    double getAvgPx() const;
    bool avgPxIsSet() const;
    void unsetAvgPx();

    void setAvgPx(double value);

    /// <summary>
    /// Status
    /// </summary>
    utility::string_t getStatus() const;
    bool statusIsSet() const;
    void unsetStatus();

    void setStatus(const utility::string_t& value);

    /// <summary>
    /// History status
    /// </summary>
    std::vector<utility::string_t>& getStatusHistoryStatus();
    bool statusHistoryStatusIsSet() const;
    void unsetStatusHistoryStatus();

    void setStatusHistoryStatus(const std::vector<utility::string_t>& value);

    /// <summary>
    /// History status time
    /// </summary>
    std::vector<std::shared_ptr<utility::datetime>>& getStatusHistoryTime();
    bool statusHistoryTimeIsSet() const;
    void unsetStatusHistoryTime();

    void setStatusHistoryTime(const std::vector<std::shared_ptr<utility::datetime>>& value);

    /// <summary>
    /// Error message
    /// </summary>
    utility::string_t getErrorMessageResult() const;
    bool errorMessageResultIsSet() const;
    void unsetErrorMessageResult();

    void setErrorMessageResult(const utility::string_t& value);

    /// <summary>
    /// Error message reason
    /// </summary>
    utility::string_t getErrorMessageReason() const;
    bool errorMessageReasonIsSet() const;
    void unsetErrorMessageReason();

    void setErrorMessageReason(const utility::string_t& value);

    /// <summary>
    /// Error message
    /// </summary>
    utility::string_t getErrorMessageMessage() const;
    bool errorMessageMessageIsSet() const;
    void unsetErrorMessageMessage();

    void setErrorMessageMessage(const utility::string_t& value);

    /// <summary>
    /// Fills time
    /// </summary>
    std::vector<std::shared_ptr<utility::datetime>>& getFillsTime();
    bool fillsTimeIsSet() const;
    void unsetFillsTime();

    void setFillsTime(const std::vector<std::shared_ptr<utility::datetime>>& value);

    /// <summary>
    /// Fills price
    /// </summary>
    std::vector<double>& getFillsPrice();
    bool fillsPriceIsSet() const;
    void unsetFillsPrice();

    void setFillsPrice(std::vector<double> value);

    /// <summary>
    /// Fills amount
    /// </summary>
    std::vector<double>& getFillsAmount();
    bool fillsAmountIsSet() const;
    void unsetFillsAmount();

    void setFillsAmount(std::vector<double> value);

    /// <summary>
    /// Created time
    /// </summary>
    std::shared_ptr<utility::datetime> getCreatedTime() const;
    bool createdTimeIsSet() const;
    void unsetCreatedTime();

    void setCreatedTime(const std::shared_ptr<utility::datetime>& value);


protected:
    utility::string_t m_Apikey;
    bool m_ApikeyIsSet;
    utility::string_t m_ExchangeId;
    bool m_ExchangeIdIsSet;
    utility::string_t m_ClientOrderId;
    bool m_ClientOrderIdIsSet;
    utility::string_t m_SymbolIdExchange;
    bool m_SymbolIdExchangeIsSet;
    utility::string_t m_SymbolIdCoinapi;
    bool m_SymbolIdCoinapiIsSet;
    double m_AmountOrder;
    bool m_AmountOrderIsSet;
    double m_Price;
    bool m_PriceIsSet;
    double m_Side;
    bool m_SideIsSet;
    utility::string_t m_OrderType;
    bool m_OrderTypeIsSet;
    utility::string_t m_TimeInForce;
    bool m_TimeInForceIsSet;
    std::shared_ptr<utility::datetime> m_ExpireTime;
    bool m_ExpireTimeIsSet;
    std::vector<utility::string_t> m_ExecInst;
    bool m_ExecInstIsSet;
    utility::string_t m_ClientOrderIdFormatExchange;
    bool m_ClientOrderIdFormatExchangeIsSet;
    utility::string_t m_ExchangeOrderId;
    bool m_ExchangeOrderIdIsSet;
    double m_AmountOpen;
    bool m_AmountOpenIsSet;
    double m_AmountFilled;
    bool m_AmountFilledIsSet;
    double m_AvgPx;
    bool m_AvgPxIsSet;
    utility::string_t m_Status;
    bool m_StatusIsSet;
    std::vector<utility::string_t> m_StatusHistoryStatus;
    bool m_StatusHistoryStatusIsSet;
    std::vector<std::shared_ptr<utility::datetime>> m_StatusHistoryTime;
    bool m_StatusHistoryTimeIsSet;
    utility::string_t m_ErrorMessageResult;
    bool m_ErrorMessageResultIsSet;
    utility::string_t m_ErrorMessageReason;
    bool m_ErrorMessageReasonIsSet;
    utility::string_t m_ErrorMessageMessage;
    bool m_ErrorMessageMessageIsSet;
    std::vector<std::shared_ptr<utility::datetime>> m_FillsTime;
    bool m_FillsTimeIsSet;
    std::vector<double> m_FillsPrice;
    bool m_FillsPriceIsSet;
    std::vector<double> m_FillsAmount;
    bool m_FillsAmountIsSet;
    std::shared_ptr<utility::datetime> m_CreatedTime;
    bool m_CreatedTimeIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OrderHistory_H_ */
