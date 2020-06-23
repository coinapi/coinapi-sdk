/**
 * OMS - REST API .
 * OMS Project
 *
 * The version of the OpenAPI document: v1
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAIPosition_data.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIPosition_data::OAIPosition_data(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIPosition_data::OAIPosition_data() {
    this->initializeModel();
}

OAIPosition_data::~OAIPosition_data() {}

void OAIPosition_data::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_symbol_exchange_isSet = false;
    m_symbol_exchange_isValid = false;

    m_symbol_coinapi_isSet = false;
    m_symbol_coinapi_isValid = false;

    m_avg_entry_price_isSet = false;
    m_avg_entry_price_isValid = false;

    m_quantity_isSet = false;
    m_quantity_isValid = false;

    m_is_buy_isSet = false;
    m_is_buy_isValid = false;

    m_unrealised_pn_l_isSet = false;
    m_unrealised_pn_l_isValid = false;

    m_leverage_isSet = false;
    m_leverage_isValid = false;

    m_cross_margin_isSet = false;
    m_cross_margin_isValid = false;

    m_liquidation_price_isSet = false;
    m_liquidation_price_isValid = false;

    m_raw_data_isSet = false;
    m_raw_data_isValid = false;
}

void OAIPosition_data::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIPosition_data::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_symbol_exchange_isValid = ::OpenAPI::fromJsonValue(symbol_exchange, json[QString("symbol_exchange")]);
    m_symbol_exchange_isSet = !json[QString("symbol_exchange")].isNull() && m_symbol_exchange_isValid;

    m_symbol_coinapi_isValid = ::OpenAPI::fromJsonValue(symbol_coinapi, json[QString("symbol_coinapi")]);
    m_symbol_coinapi_isSet = !json[QString("symbol_coinapi")].isNull() && m_symbol_coinapi_isValid;

    m_avg_entry_price_isValid = ::OpenAPI::fromJsonValue(avg_entry_price, json[QString("avg_entry_price")]);
    m_avg_entry_price_isSet = !json[QString("avg_entry_price")].isNull() && m_avg_entry_price_isValid;

    m_quantity_isValid = ::OpenAPI::fromJsonValue(quantity, json[QString("quantity")]);
    m_quantity_isSet = !json[QString("quantity")].isNull() && m_quantity_isValid;

    m_is_buy_isValid = ::OpenAPI::fromJsonValue(is_buy, json[QString("is_buy")]);
    m_is_buy_isSet = !json[QString("is_buy")].isNull() && m_is_buy_isValid;

    m_unrealised_pn_l_isValid = ::OpenAPI::fromJsonValue(unrealised_pn_l, json[QString("unrealised_pn_l")]);
    m_unrealised_pn_l_isSet = !json[QString("unrealised_pn_l")].isNull() && m_unrealised_pn_l_isValid;

    m_leverage_isValid = ::OpenAPI::fromJsonValue(leverage, json[QString("leverage")]);
    m_leverage_isSet = !json[QString("leverage")].isNull() && m_leverage_isValid;

    m_cross_margin_isValid = ::OpenAPI::fromJsonValue(cross_margin, json[QString("cross_margin")]);
    m_cross_margin_isSet = !json[QString("cross_margin")].isNull() && m_cross_margin_isValid;

    m_liquidation_price_isValid = ::OpenAPI::fromJsonValue(liquidation_price, json[QString("liquidation_price")]);
    m_liquidation_price_isSet = !json[QString("liquidation_price")].isNull() && m_liquidation_price_isValid;

    m_raw_data_isValid = ::OpenAPI::fromJsonValue(raw_data, json[QString("raw_data")]);
    m_raw_data_isSet = !json[QString("raw_data")].isNull() && m_raw_data_isValid;
}

QString OAIPosition_data::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIPosition_data::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_symbol_exchange_isSet) {
        obj.insert(QString("symbol_exchange"), ::OpenAPI::toJsonValue(symbol_exchange));
    }
    if (m_symbol_coinapi_isSet) {
        obj.insert(QString("symbol_coinapi"), ::OpenAPI::toJsonValue(symbol_coinapi));
    }
    if (m_avg_entry_price_isSet) {
        obj.insert(QString("avg_entry_price"), ::OpenAPI::toJsonValue(avg_entry_price));
    }
    if (m_quantity_isSet) {
        obj.insert(QString("quantity"), ::OpenAPI::toJsonValue(quantity));
    }
    if (m_is_buy_isSet) {
        obj.insert(QString("is_buy"), ::OpenAPI::toJsonValue(is_buy));
    }
    if (m_unrealised_pn_l_isSet) {
        obj.insert(QString("unrealised_pn_l"), ::OpenAPI::toJsonValue(unrealised_pn_l));
    }
    if (m_leverage_isSet) {
        obj.insert(QString("leverage"), ::OpenAPI::toJsonValue(leverage));
    }
    if (m_cross_margin_isSet) {
        obj.insert(QString("cross_margin"), ::OpenAPI::toJsonValue(cross_margin));
    }
    if (m_liquidation_price_isSet) {
        obj.insert(QString("liquidation_price"), ::OpenAPI::toJsonValue(liquidation_price));
    }
    if (m_raw_data_isSet) {
        obj.insert(QString("raw_data"), ::OpenAPI::toJsonValue(raw_data));
    }
    return obj;
}

QString OAIPosition_data::getId() const {
    return id;
}
void OAIPosition_data::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIPosition_data::is_id_Set() const{
    return m_id_isSet;
}

bool OAIPosition_data::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIPosition_data::getSymbolExchange() const {
    return symbol_exchange;
}
void OAIPosition_data::setSymbolExchange(const QString &symbol_exchange) {
    this->symbol_exchange = symbol_exchange;
    this->m_symbol_exchange_isSet = true;
}

bool OAIPosition_data::is_symbol_exchange_Set() const{
    return m_symbol_exchange_isSet;
}

bool OAIPosition_data::is_symbol_exchange_Valid() const{
    return m_symbol_exchange_isValid;
}

QString OAIPosition_data::getSymbolCoinapi() const {
    return symbol_coinapi;
}
void OAIPosition_data::setSymbolCoinapi(const QString &symbol_coinapi) {
    this->symbol_coinapi = symbol_coinapi;
    this->m_symbol_coinapi_isSet = true;
}

bool OAIPosition_data::is_symbol_coinapi_Set() const{
    return m_symbol_coinapi_isSet;
}

bool OAIPosition_data::is_symbol_coinapi_Valid() const{
    return m_symbol_coinapi_isValid;
}

double OAIPosition_data::getAvgEntryPrice() const {
    return avg_entry_price;
}
void OAIPosition_data::setAvgEntryPrice(const double &avg_entry_price) {
    this->avg_entry_price = avg_entry_price;
    this->m_avg_entry_price_isSet = true;
}

bool OAIPosition_data::is_avg_entry_price_Set() const{
    return m_avg_entry_price_isSet;
}

bool OAIPosition_data::is_avg_entry_price_Valid() const{
    return m_avg_entry_price_isValid;
}

double OAIPosition_data::getQuantity() const {
    return quantity;
}
void OAIPosition_data::setQuantity(const double &quantity) {
    this->quantity = quantity;
    this->m_quantity_isSet = true;
}

bool OAIPosition_data::is_quantity_Set() const{
    return m_quantity_isSet;
}

bool OAIPosition_data::is_quantity_Valid() const{
    return m_quantity_isValid;
}

bool OAIPosition_data::isIsBuy() const {
    return is_buy;
}
void OAIPosition_data::setIsBuy(const bool &is_buy) {
    this->is_buy = is_buy;
    this->m_is_buy_isSet = true;
}

bool OAIPosition_data::is_is_buy_Set() const{
    return m_is_buy_isSet;
}

bool OAIPosition_data::is_is_buy_Valid() const{
    return m_is_buy_isValid;
}

double OAIPosition_data::getUnrealisedPnL() const {
    return unrealised_pn_l;
}
void OAIPosition_data::setUnrealisedPnL(const double &unrealised_pn_l) {
    this->unrealised_pn_l = unrealised_pn_l;
    this->m_unrealised_pn_l_isSet = true;
}

bool OAIPosition_data::is_unrealised_pn_l_Set() const{
    return m_unrealised_pn_l_isSet;
}

bool OAIPosition_data::is_unrealised_pn_l_Valid() const{
    return m_unrealised_pn_l_isValid;
}

double OAIPosition_data::getLeverage() const {
    return leverage;
}
void OAIPosition_data::setLeverage(const double &leverage) {
    this->leverage = leverage;
    this->m_leverage_isSet = true;
}

bool OAIPosition_data::is_leverage_Set() const{
    return m_leverage_isSet;
}

bool OAIPosition_data::is_leverage_Valid() const{
    return m_leverage_isValid;
}

bool OAIPosition_data::isCrossMargin() const {
    return cross_margin;
}
void OAIPosition_data::setCrossMargin(const bool &cross_margin) {
    this->cross_margin = cross_margin;
    this->m_cross_margin_isSet = true;
}

bool OAIPosition_data::is_cross_margin_Set() const{
    return m_cross_margin_isSet;
}

bool OAIPosition_data::is_cross_margin_Valid() const{
    return m_cross_margin_isValid;
}

double OAIPosition_data::getLiquidationPrice() const {
    return liquidation_price;
}
void OAIPosition_data::setLiquidationPrice(const double &liquidation_price) {
    this->liquidation_price = liquidation_price;
    this->m_liquidation_price_isSet = true;
}

bool OAIPosition_data::is_liquidation_price_Set() const{
    return m_liquidation_price_isSet;
}

bool OAIPosition_data::is_liquidation_price_Valid() const{
    return m_liquidation_price_isValid;
}

QString OAIPosition_data::getRawData() const {
    return raw_data;
}
void OAIPosition_data::setRawData(const QString &raw_data) {
    this->raw_data = raw_data;
    this->m_raw_data_isSet = true;
}

bool OAIPosition_data::is_raw_data_Set() const{
    return m_raw_data_isSet;
}

bool OAIPosition_data::is_raw_data_Valid() const{
    return m_raw_data_isValid;
}

bool OAIPosition_data::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_symbol_exchange_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_symbol_coinapi_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_avg_entry_price_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_quantity_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_buy_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_unrealised_pn_l_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_leverage_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_cross_margin_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_liquidation_price_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_raw_data_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIPosition_data::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
