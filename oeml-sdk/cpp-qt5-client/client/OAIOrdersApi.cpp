/**
 * OEML - REST API
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAIOrdersApi.h"
#include "OAIHelpers.h"
#include "OAIServerConfiguration.h"
#include <QJsonArray>
#include <QJsonDocument>

namespace OpenAPI {

OAIOrdersApi::OAIOrdersApi(const QString &scheme, const QString &host, int port, const QString &basePath, const int timeOut)
    : _scheme(scheme),
      _host(host),
      _port(port),
      _basePath(basePath),
      _timeOut(timeOut),
      _manager(nullptr),
      isResponseCompressionEnabled(false),
      isRequestCompressionEnabled(false) {
      initializeServerConfigs();
      }

OAIOrdersApi::~OAIOrdersApi() {
}

void OAIOrdersApi::initializeServerConfigs(){

//Default server
QList<OAIServerConfiguration> defaultConf = QList<OAIServerConfiguration>();
//varying endpoint server 
QList<OAIServerConfiguration> serverConf = QList<OAIServerConfiguration>();
defaultConf.append(OAIServerConfiguration(
    "https://13d16e9d-d8b1-4ef4-bc4a-ed8156b2b159.mock.pstmn.io",
    "No description provided",
    QMap<QString, OAIServerVariable>()));
_serverConfigs.insert("v1OrdersCancelAllPost",defaultConf);
_serverIndices.insert("v1OrdersCancelAllPost",0);

_serverConfigs.insert("v1OrdersCancelPost",defaultConf);
_serverIndices.insert("v1OrdersCancelPost",0);

_serverConfigs.insert("v1OrdersGet",defaultConf);
_serverIndices.insert("v1OrdersGet",0);

_serverConfigs.insert("v1OrdersPost",defaultConf);
_serverIndices.insert("v1OrdersPost",0);

_serverConfigs.insert("v1OrdersStatusClientOrderIdGet",defaultConf);
_serverIndices.insert("v1OrdersStatusClientOrderIdGet",0);


}

/**
* returns 0 on success and -1, -2 or -3 on failure.
* -1 when the variable does not exist and -2 if the value is not defined in the enum and -3 if the operation or server index is not found 
*/
int OAIOrdersApi::setDefaultServerValue(int serverIndex, const QString &operation, const QString &variable, const QString &value){
    auto it = _serverConfigs.find(operation);
    if(it != _serverConfigs.end() && serverIndex < it.value().size() ){
      return _serverConfigs[operation][serverIndex].setDefaultValue(variable,value);
    }
    return -3;
}
void OAIOrdersApi::setServerIndex(const QString &operation, int serverIndex){
    if(_serverIndices.contains(operation) && serverIndex < _serverConfigs.find(operation).value().size() )
        _serverIndices[operation] = serverIndex;
}

void OAIOrdersApi::setScheme(const QString &scheme) {
    _scheme = scheme;
}

void OAIOrdersApi::setHost(const QString &host) {
    _host = host;
}

void OAIOrdersApi::setPort(int port) {
    _port = port;
}

void OAIOrdersApi::setApiKey(const QString &apiKeyName, const QString &apiKey){
    _apiKeys.insert(apiKeyName,apiKey);
}

void OAIOrdersApi::setBearerToken(const QString &token){
    _bearerToken = token;
}

void OAIOrdersApi::setUsername(const QString &username) {
    _username = username;
}

void OAIOrdersApi::setPassword(const QString &password) {
    _password = password;
}

void OAIOrdersApi::setBasePath(const QString &basePath) {
    _basePath = basePath;
}

void OAIOrdersApi::setTimeOut(const int timeOut) {
    _timeOut = timeOut;
}

void OAIOrdersApi::setWorkingDirectory(const QString &path) {
    _workingDirectory = path;
}

void OAIOrdersApi::setNetworkAccessManager(QNetworkAccessManager* manager) {
    _manager = manager;  
}

void OAIOrdersApi::addHeaders(const QString &key, const QString &value) {
    defaultHeaders.insert(key, value);
}

void OAIOrdersApi::enableRequestCompression() {
    isRequestCompressionEnabled = true;
}

void OAIOrdersApi::enableResponseCompression() {
    isResponseCompressionEnabled = true;
}

void OAIOrdersApi::abortRequests(){
    emit abortRequestsSignal();
}

void OAIOrdersApi::v1OrdersCancelAllPost(const OAIOrderCancelAllRequest &oai_order_cancel_all_request) {
    QString fullPath = QString(_serverConfigs["v1OrdersCancelAllPost"][_serverIndices.value("v1OrdersCancelAllPost")].URL()+"/v1/orders/cancel/all");


    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker(this, _manager);
    worker->setTimeOut(_timeOut);
    worker->setWorkingDirectory(_workingDirectory);
    OAIHttpRequestInput input(fullPath, "POST");

    QString output = oai_order_cancel_all_request.asJson();
    input.request_body.append(output);

    foreach (QString key, this->defaultHeaders.keys()) { input.headers.insert(key, this->defaultHeaders.value(key)); }

    connect(worker, &OAIHttpRequestWorker::on_execution_finished, this, &OAIOrdersApi::v1OrdersCancelAllPostCallback);
    connect(this, &OAIOrdersApi::abortRequestsSignal, worker, &QObject::deleteLater); 
    worker->execute(&input);
}

void OAIOrdersApi::v1OrdersCancelAllPostCallback(OAIHttpRequestWorker *worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    } else {
        msg = "Error: " + worker->error_str;
        error_str = QString("%1, %2").arg(worker->error_str).arg(QString(worker->response));
    }
    OAIMessage output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit v1OrdersCancelAllPostSignal(output);
        emit v1OrdersCancelAllPostSignalFull(worker, output);
    } else {
        emit v1OrdersCancelAllPostSignalE(output, error_type, error_str);
        emit v1OrdersCancelAllPostSignalEFull(worker, error_type, error_str);
    }
}

void OAIOrdersApi::v1OrdersCancelPost(const OAIOrderCancelSingleRequest &oai_order_cancel_single_request) {
    QString fullPath = QString(_serverConfigs["v1OrdersCancelPost"][_serverIndices.value("v1OrdersCancelPost")].URL()+"/v1/orders/cancel");


    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker(this, _manager);
    worker->setTimeOut(_timeOut);
    worker->setWorkingDirectory(_workingDirectory);
    OAIHttpRequestInput input(fullPath, "POST");

    QString output = oai_order_cancel_single_request.asJson();
    input.request_body.append(output);

    foreach (QString key, this->defaultHeaders.keys()) { input.headers.insert(key, this->defaultHeaders.value(key)); }

    connect(worker, &OAIHttpRequestWorker::on_execution_finished, this, &OAIOrdersApi::v1OrdersCancelPostCallback);
    connect(this, &OAIOrdersApi::abortRequestsSignal, worker, &QObject::deleteLater); 
    worker->execute(&input);
}

void OAIOrdersApi::v1OrdersCancelPostCallback(OAIHttpRequestWorker *worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    } else {
        msg = "Error: " + worker->error_str;
        error_str = QString("%1, %2").arg(worker->error_str).arg(QString(worker->response));
    }
    OAIOrderExecutionReport output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit v1OrdersCancelPostSignal(output);
        emit v1OrdersCancelPostSignalFull(worker, output);
    } else {
        emit v1OrdersCancelPostSignalE(output, error_type, error_str);
        emit v1OrdersCancelPostSignalEFull(worker, error_type, error_str);
    }
}

void OAIOrdersApi::v1OrdersGet(const QString &exchange_id) {
    QString fullPath = QString(_serverConfigs["v1OrdersGet"][_serverIndices.value("v1OrdersGet")].URL()+"/v1/orders");


    if (fullPath.indexOf("?") > 0)
        fullPath.append("&");
    else
        fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("exchange_id")).append("=").append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(exchange_id)));

    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker(this, _manager);
    worker->setTimeOut(_timeOut);
    worker->setWorkingDirectory(_workingDirectory);
    OAIHttpRequestInput input(fullPath, "GET");

    foreach (QString key, this->defaultHeaders.keys()) { input.headers.insert(key, this->defaultHeaders.value(key)); }

    connect(worker, &OAIHttpRequestWorker::on_execution_finished, this, &OAIOrdersApi::v1OrdersGetCallback);
    connect(this, &OAIOrdersApi::abortRequestsSignal, worker, &QObject::deleteLater); 
    worker->execute(&input);
}

void OAIOrdersApi::v1OrdersGetCallback(OAIHttpRequestWorker *worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    } else {
        msg = "Error: " + worker->error_str;
        error_str = QString("%1, %2").arg(worker->error_str).arg(QString(worker->response));
    }
    QList<OAIOrderExecutionReport> output;
    QString json(worker->response);
    QByteArray array(json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    foreach (QJsonValue obj, jsonArray) {
        OAIOrderExecutionReport val;
        ::OpenAPI::fromJsonValue(val, obj);
        output.append(val);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit v1OrdersGetSignal(output);
        emit v1OrdersGetSignalFull(worker, output);
    } else {
        emit v1OrdersGetSignalE(output, error_type, error_str);
        emit v1OrdersGetSignalEFull(worker, error_type, error_str);
    }
}

void OAIOrdersApi::v1OrdersPost(const OAIOrderNewSingleRequest &oai_order_new_single_request) {
    QString fullPath = QString(_serverConfigs["v1OrdersPost"][_serverIndices.value("v1OrdersPost")].URL()+"/v1/orders");


    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker(this, _manager);
    worker->setTimeOut(_timeOut);
    worker->setWorkingDirectory(_workingDirectory);
    OAIHttpRequestInput input(fullPath, "POST");

    QString output = oai_order_new_single_request.asJson();
    input.request_body.append(output);

    foreach (QString key, this->defaultHeaders.keys()) { input.headers.insert(key, this->defaultHeaders.value(key)); }

    connect(worker, &OAIHttpRequestWorker::on_execution_finished, this, &OAIOrdersApi::v1OrdersPostCallback);
    connect(this, &OAIOrdersApi::abortRequestsSignal, worker, &QObject::deleteLater); 
    worker->execute(&input);
}

void OAIOrdersApi::v1OrdersPostCallback(OAIHttpRequestWorker *worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    } else {
        msg = "Error: " + worker->error_str;
        error_str = QString("%1, %2").arg(worker->error_str).arg(QString(worker->response));
    }
    OAIOrderExecutionReport output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit v1OrdersPostSignal(output);
        emit v1OrdersPostSignalFull(worker, output);
    } else {
        emit v1OrdersPostSignalE(output, error_type, error_str);
        emit v1OrdersPostSignalEFull(worker, error_type, error_str);
    }
}

void OAIOrdersApi::v1OrdersStatusClientOrderIdGet(const QString &client_order_id) {
    QString fullPath = QString(_serverConfigs["v1OrdersStatusClientOrderIdGet"][_serverIndices.value("v1OrdersStatusClientOrderIdGet")].URL()+"/v1/orders/status/{client_order_id}");
    QString client_order_idPathParam("{");
    client_order_idPathParam.append("client_order_id").append("}");
    fullPath.replace(client_order_idPathParam, QUrl::toPercentEncoding(::OpenAPI::toStringValue(client_order_id)));
    

    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker(this, _manager);
    worker->setTimeOut(_timeOut);
    worker->setWorkingDirectory(_workingDirectory);
    OAIHttpRequestInput input(fullPath, "GET");

    foreach (QString key, this->defaultHeaders.keys()) { input.headers.insert(key, this->defaultHeaders.value(key)); }

    connect(worker, &OAIHttpRequestWorker::on_execution_finished, this, &OAIOrdersApi::v1OrdersStatusClientOrderIdGetCallback);
    connect(this, &OAIOrdersApi::abortRequestsSignal, worker, &QObject::deleteLater); 
    worker->execute(&input);
}

void OAIOrdersApi::v1OrdersStatusClientOrderIdGetCallback(OAIHttpRequestWorker *worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    } else {
        msg = "Error: " + worker->error_str;
        error_str = QString("%1, %2").arg(worker->error_str).arg(QString(worker->response));
    }
    OAIOrderExecutionReport output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit v1OrdersStatusClientOrderIdGetSignal(output);
        emit v1OrdersStatusClientOrderIdGetSignalFull(worker, output);
    } else {
        emit v1OrdersStatusClientOrderIdGetSignalE(output, error_type, error_str);
        emit v1OrdersStatusClientOrderIdGetSignalEFull(worker, error_type, error_str);
    }
}

} // namespace OpenAPI
