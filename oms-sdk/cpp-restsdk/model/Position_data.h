/**
 * OMS - REST API .
 * Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ###Lifecycle Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham. ###Lifecycle 2 Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackhama. 
 *
 * The version of the OpenAPI document: v1
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 4.3.1.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * Position_data.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Position_data_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Position_data_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  Position_data
    : public ModelBase
{
public:
    Position_data();
    virtual ~Position_data();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Position_data members

    /// <summary>
    /// Unique position ID
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// The contract for this position.
    /// </summary>
    utility::string_t getSymbolExchange() const;
    bool symbolExchangeIsSet() const;
    void unsetSymbol_exchange();

    void setSymbolExchange(const utility::string_t& value);

    /// <summary>
    /// The coinapi contract for this position.
    /// </summary>
    utility::string_t getSymbolCoinapi() const;
    bool symbolCoinapiIsSet() const;
    void unsetSymbol_coinapi();

    void setSymbolCoinapi(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    double getAvgEntryPrice() const;
    bool avgEntryPriceIsSet() const;
    void unsetAvg_entry_price();

    void setAvgEntryPrice(double value);

    /// <summary>
    /// The current position amount in contracts.
    /// </summary>
    double getQuantity() const;
    bool quantityIsSet() const;
    void unsetQuantity();

    void setQuantity(double value);

    /// <summary>
    /// 
    /// </summary>
    bool isIsBuy() const;
    bool isBuyIsSet() const;
    void unsetIs_buy();

    void setIsBuy(bool value);

    /// <summary>
    /// Unrealised PNL is all the unrealised profit or loss coming from your portfolio&#39;s open positions.
    /// </summary>
    double getUnrealisedPnL() const;
    bool unrealisedPnLIsSet() const;
    void unsetUnrealised_pn_l();

    void setUnrealisedPnL(double value);

    /// <summary>
    /// 1 / initMarginReq.
    /// </summary>
    double getLeverage() const;
    bool leverageIsSet() const;
    void unsetLeverage();

    void setLeverage(double value);

    /// <summary>
    /// True/false depending on whether you set cross margin on this position.
    /// </summary>
    bool isCrossMargin() const;
    bool crossMarginIsSet() const;
    void unsetCross_margin();

    void setCrossMargin(bool value);

    /// <summary>
    /// Once markPrice reaches this price, this position will be liquidated.
    /// </summary>
    double getLiquidationPrice() const;
    bool liquidationPriceIsSet() const;
    void unsetLiquidation_price();

    void setLiquidationPrice(double value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getRawData() const;
    bool rawDataIsSet() const;
    void unsetRaw_data();

    void setRawData(const utility::string_t& value);


protected:
    utility::string_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Symbol_exchange;
    bool m_Symbol_exchangeIsSet;
    utility::string_t m_Symbol_coinapi;
    bool m_Symbol_coinapiIsSet;
    double m_Avg_entry_price;
    bool m_Avg_entry_priceIsSet;
    double m_Quantity;
    bool m_QuantityIsSet;
    bool m_Is_buy;
    bool m_Is_buyIsSet;
    double m_Unrealised_pn_l;
    bool m_Unrealised_pn_lIsSet;
    double m_Leverage;
    bool m_LeverageIsSet;
    bool m_Cross_margin;
    bool m_Cross_marginIsSet;
    double m_Liquidation_price;
    bool m_Liquidation_priceIsSet;
    utility::string_t m_Raw_data;
    bool m_Raw_dataIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Position_data_H_ */
