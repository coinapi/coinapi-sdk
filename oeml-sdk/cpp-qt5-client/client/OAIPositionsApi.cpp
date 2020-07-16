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

#include "OAIPositionsApi.h"
#include "OAIHelpers.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace OpenAPI {

OAIPositionsApi::OAIPositionsApi(const QString &scheme, const QString &host, int port, const QString &basePath, const int timeOut)
    : _scheme(scheme),
      _host(host),
      _port(port),
      _basePath(basePath),
      _timeOut(timeOut),
      isResponseCompressionEnabled(false),
      isRequestCompressionEnabled(false) {}

OAIPositionsApi::~OAIPositionsApi() {
}

void OAIPositionsApi::setScheme(const QString &scheme) {
    _scheme = scheme;
}

void OAIPositionsApi::setHost(const QString &host) {
    _host = host;
}

void OAIPositionsApi::setPort(int port) {
    _port = port;
}

void OAIPositionsApi::setBasePath(const QString &basePath) {
    _basePath = basePath;
}

void OAIPositionsApi::setTimeOut(const int timeOut) {
    _timeOut = timeOut;
}

void OAIPositionsApi::setWorkingDirectory(const QString &path) {
    _workingDirectory = path;
}

void OAIPositionsApi::addHeaders(const QString &key, const QString &value) {
    defaultHeaders.insert(key, value);
}

void OAIPositionsApi::enableRequestCompression() {
    isRequestCompressionEnabled = true;
}

void OAIPositionsApi::enableResponseCompression() {
    isResponseCompressionEnabled = true;
}

void OAIPositionsApi::abortRequests(){
    emit abortRequestsSignal();
}

void OAIPositionsApi::v1PositionsGet(const QString &exchange_id) {
    QString fullPath = QString("%1://%2%3%4%5")
                           .arg(_scheme)
                           .arg(_host)
                           .arg(_port ? ":" + QString::number(_port) : "")
                           .arg(_basePath)
                           .arg("/v1/positions");

    if (fullPath.indexOf("?") > 0)
        fullPath.append("&");
    else
        fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("exchange_id")).append("=").append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(exchange_id)));

    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker(this);
    worker->setTimeOut(_timeOut);
    worker->setWorkingDirectory(_workingDirectory);
    OAIHttpRequestInput input(fullPath, "GET");

    foreach (QString key, this->defaultHeaders.keys()) { input.headers.insert(key, this->defaultHeaders.value(key)); }

    connect(worker, &OAIHttpRequestWorker::on_execution_finished, this, &OAIPositionsApi::v1PositionsGetCallback);
    connect(this, &OAIPositionsApi::abortRequestsSignal, worker, &QObject::deleteLater); 
    worker->execute(&input);
}

void OAIPositionsApi::v1PositionsGetCallback(OAIHttpRequestWorker *worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    } else {
        msg = "Error: " + worker->error_str;
        error_str = QString("%1, %2").arg(worker->error_str).arg(QString(worker->response));
    }
    QList<OAIPosition> output;
    QString json(worker->response);
    QByteArray array(json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    foreach (QJsonValue obj, jsonArray) {
        OAIPosition val;
        ::OpenAPI::fromJsonValue(val, obj);
        output.append(val);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit v1PositionsGetSignal(output);
        emit v1PositionsGetSignalFull(worker, output);
    } else {
        emit v1PositionsGetSignalE(output, error_type, error_str);
        emit v1PositionsGetSignalEFull(worker, error_type, error_str);
    }
}

} // namespace OpenAPI
