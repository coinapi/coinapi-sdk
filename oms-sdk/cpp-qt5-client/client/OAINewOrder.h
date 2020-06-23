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

/*
 * OAINewOrder.h
 *
 * 
 */

#ifndef OAINewOrder_H
#define OAINewOrder_H

#include <QJsonObject>

#include "OAITimeInForce.h"
#include <QDate>
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAINewOrder : public OAIObject {
public:
    OAINewOrder();
    OAINewOrder(QString json);
    ~OAINewOrder() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getExchangeId() const;
    void setExchangeId(const QString &exchange_id);
    bool is_exchange_id_Set() const;
    bool is_exchange_id_Valid() const;

    QString getClientOrderId() const;
    void setClientOrderId(const QString &client_order_id);
    bool is_client_order_id_Set() const;
    bool is_client_order_id_Valid() const;

    QString getSymbolExchange() const;
    void setSymbolExchange(const QString &symbol_exchange);
    bool is_symbol_exchange_Set() const;
    bool is_symbol_exchange_Valid() const;

    QString getSymbolCoinapi() const;
    void setSymbolCoinapi(const QString &symbol_coinapi);
    bool is_symbol_coinapi_Set() const;
    bool is_symbol_coinapi_Valid() const;

    double getAmountOrder() const;
    void setAmountOrder(const double &amount_order);
    bool is_amount_order_Set() const;
    bool is_amount_order_Valid() const;

    double getPrice() const;
    void setPrice(const double &price);
    bool is_price_Set() const;
    bool is_price_Valid() const;

    QString getSide() const;
    void setSide(const QString &side);
    bool is_side_Set() const;
    bool is_side_Valid() const;

    QString getOrderType() const;
    void setOrderType(const QString &order_type);
    bool is_order_type_Set() const;
    bool is_order_type_Valid() const;

    OAITimeInForce getTimeInForce() const;
    void setTimeInForce(const OAITimeInForce &time_in_force);
    bool is_time_in_force_Set() const;
    bool is_time_in_force_Valid() const;

    QDate getExpireTime() const;
    void setExpireTime(const QDate &expire_time);
    bool is_expire_time_Set() const;
    bool is_expire_time_Valid() const;

    QList<QString> getExecInst() const;
    void setExecInst(const QList<QString> &exec_inst);
    bool is_exec_inst_Set() const;
    bool is_exec_inst_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString exchange_id;
    bool m_exchange_id_isSet;
    bool m_exchange_id_isValid;

    QString client_order_id;
    bool m_client_order_id_isSet;
    bool m_client_order_id_isValid;

    QString symbol_exchange;
    bool m_symbol_exchange_isSet;
    bool m_symbol_exchange_isValid;

    QString symbol_coinapi;
    bool m_symbol_coinapi_isSet;
    bool m_symbol_coinapi_isValid;

    double amount_order;
    bool m_amount_order_isSet;
    bool m_amount_order_isValid;

    double price;
    bool m_price_isSet;
    bool m_price_isValid;

    QString side;
    bool m_side_isSet;
    bool m_side_isValid;

    QString order_type;
    bool m_order_type_isSet;
    bool m_order_type_isValid;

    OAITimeInForce time_in_force;
    bool m_time_in_force_isSet;
    bool m_time_in_force_isValid;

    QDate expire_time;
    bool m_expire_time_isSet;
    bool m_expire_time_isValid;

    QList<QString> exec_inst;
    bool m_exec_inst_isSet;
    bool m_exec_inst_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAINewOrder)

#endif // OAINewOrder_H
