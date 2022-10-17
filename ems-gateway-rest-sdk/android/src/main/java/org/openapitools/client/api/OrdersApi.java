/**
 * EMS - REST API
 * This section will provide necessary information about the `CoinAPI EMS REST API` protocol. <br/> This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       <br/><br/> Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  <br/><br/> If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: <br/><br/> `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this:  <br/><br/> `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiInvoker;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import org.openapitools.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.openapitools.client.model.MessageError;
import org.openapitools.client.model.MessageReject;
import org.openapitools.client.model.OrderCancelAllRequest;
import org.openapitools.client.model.OrderCancelSingleRequest;
import org.openapitools.client.model.OrderExecutionReport;
import org.openapitools.client.model.OrderHistory;
import org.openapitools.client.model.OrderNewSingleRequest;
import org.openapitools.client.model.ValidationError;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class OrdersApi {
  String basePath = "https://ems-gateway-aws-eu-central-1-dev.coinapi.io";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Cancel all orders request
  * This request cancels all open orders on single specified exchange.
   * @param orderCancelAllRequest OrderCancelAllRequest object.
   * @return MessageReject
  */
  public MessageReject v1OrdersCancelAllPost (OrderCancelAllRequest orderCancelAllRequest) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = orderCancelAllRequest;
    // verify the required parameter 'orderCancelAllRequest' is set
    if (orderCancelAllRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orderCancelAllRequest' when calling v1OrdersCancelAllPost",
        new ApiException(400, "Missing the required parameter 'orderCancelAllRequest' when calling v1OrdersCancelAllPost"));
    }

    // create path and map variables
    String path = "/v1/orders/cancel/all";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (MessageReject) ApiInvoker.deserialize(localVarResponse, "", MessageReject.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Cancel all orders request
   * This request cancels all open orders on single specified exchange.
   * @param orderCancelAllRequest OrderCancelAllRequest object.
  */
  public void v1OrdersCancelAllPost (OrderCancelAllRequest orderCancelAllRequest, final Response.Listener<MessageReject> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = orderCancelAllRequest;

    // verify the required parameter 'orderCancelAllRequest' is set
    if (orderCancelAllRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orderCancelAllRequest' when calling v1OrdersCancelAllPost",
        new ApiException(400, "Missing the required parameter 'orderCancelAllRequest' when calling v1OrdersCancelAllPost"));
    }

    // create path and map variables
    String path = "/v1/orders/cancel/all".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((MessageReject) ApiInvoker.deserialize(localVarResponse,  "", MessageReject.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Cancel order request
  * Request cancel for an existing order. The order can be canceled using the &#x60;client_order_id&#x60; or &#x60;exchange_order_id&#x60;.
   * @param orderCancelSingleRequest OrderCancelSingleRequest object.
   * @return OrderExecutionReport
  */
  public OrderExecutionReport v1OrdersCancelPost (OrderCancelSingleRequest orderCancelSingleRequest) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = orderCancelSingleRequest;
    // verify the required parameter 'orderCancelSingleRequest' is set
    if (orderCancelSingleRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orderCancelSingleRequest' when calling v1OrdersCancelPost",
        new ApiException(400, "Missing the required parameter 'orderCancelSingleRequest' when calling v1OrdersCancelPost"));
    }

    // create path and map variables
    String path = "/v1/orders/cancel";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (OrderExecutionReport) ApiInvoker.deserialize(localVarResponse, "", OrderExecutionReport.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Cancel order request
   * Request cancel for an existing order. The order can be canceled using the &#x60;client_order_id&#x60; or &#x60;exchange_order_id&#x60;.
   * @param orderCancelSingleRequest OrderCancelSingleRequest object.
  */
  public void v1OrdersCancelPost (OrderCancelSingleRequest orderCancelSingleRequest, final Response.Listener<OrderExecutionReport> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = orderCancelSingleRequest;

    // verify the required parameter 'orderCancelSingleRequest' is set
    if (orderCancelSingleRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orderCancelSingleRequest' when calling v1OrdersCancelPost",
        new ApiException(400, "Missing the required parameter 'orderCancelSingleRequest' when calling v1OrdersCancelPost"));
    }

    // create path and map variables
    String path = "/v1/orders/cancel".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((OrderExecutionReport) ApiInvoker.deserialize(localVarResponse,  "", OrderExecutionReport.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get open orders
  * Get last execution reports for open orders across all or single exchange.
   * @param exchangeId Filter the open orders to the specific exchange.
   * @return List<OrderExecutionReport>
  */
  public List<OrderExecutionReport> v1OrdersGet (String exchangeId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/v1/orders";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "exchange_id", exchangeId));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<OrderExecutionReport>) ApiInvoker.deserialize(localVarResponse, "array", OrderExecutionReport.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get open orders
   * Get last execution reports for open orders across all or single exchange.
   * @param exchangeId Filter the open orders to the specific exchange.
  */
  public void v1OrdersGet (String exchangeId, final Response.Listener<List<OrderExecutionReport>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/v1/orders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "exchange_id", exchangeId));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<OrderExecutionReport>) ApiInvoker.deserialize(localVarResponse,  "array", OrderExecutionReport.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * History of order changes
  * Based on the date range, all changes registered in the orderbook.
   * @param timeStart Start date
   * @param timeEnd End date
   * @return List<OrderHistory>
  */
  public List<OrderHistory> v1OrdersHistoryGet (String timeStart, String timeEnd) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'timeStart' is set
    if (timeStart == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'timeStart' when calling v1OrdersHistoryGet",
        new ApiException(400, "Missing the required parameter 'timeStart' when calling v1OrdersHistoryGet"));
    }
    // verify the required parameter 'timeEnd' is set
    if (timeEnd == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'timeEnd' when calling v1OrdersHistoryGet",
        new ApiException(400, "Missing the required parameter 'timeEnd' when calling v1OrdersHistoryGet"));
    }

    // create path and map variables
    String path = "/v1/orders/history";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "time_start", timeStart));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "time_end", timeEnd));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<OrderHistory>) ApiInvoker.deserialize(localVarResponse, "array", OrderHistory.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * History of order changes
   * Based on the date range, all changes registered in the orderbook.
   * @param timeStart Start date   * @param timeEnd End date
  */
  public void v1OrdersHistoryGet (String timeStart, String timeEnd, final Response.Listener<List<OrderHistory>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'timeStart' is set
    if (timeStart == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'timeStart' when calling v1OrdersHistoryGet",
        new ApiException(400, "Missing the required parameter 'timeStart' when calling v1OrdersHistoryGet"));
    }
    // verify the required parameter 'timeEnd' is set
    if (timeEnd == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'timeEnd' when calling v1OrdersHistoryGet",
        new ApiException(400, "Missing the required parameter 'timeEnd' when calling v1OrdersHistoryGet"));
    }

    // create path and map variables
    String path = "/v1/orders/history".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "time_start", timeStart));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "time_end", timeEnd));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<OrderHistory>) ApiInvoker.deserialize(localVarResponse,  "array", OrderHistory.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Send new order
  * This request creating new order for the specific exchange.
   * @param orderNewSingleRequest OrderNewSingleRequest object.
   * @return OrderExecutionReport
  */
  public OrderExecutionReport v1OrdersPost (OrderNewSingleRequest orderNewSingleRequest) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = orderNewSingleRequest;
    // verify the required parameter 'orderNewSingleRequest' is set
    if (orderNewSingleRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orderNewSingleRequest' when calling v1OrdersPost",
        new ApiException(400, "Missing the required parameter 'orderNewSingleRequest' when calling v1OrdersPost"));
    }

    // create path and map variables
    String path = "/v1/orders";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (OrderExecutionReport) ApiInvoker.deserialize(localVarResponse, "", OrderExecutionReport.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Send new order
   * This request creating new order for the specific exchange.
   * @param orderNewSingleRequest OrderNewSingleRequest object.
  */
  public void v1OrdersPost (OrderNewSingleRequest orderNewSingleRequest, final Response.Listener<OrderExecutionReport> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = orderNewSingleRequest;

    // verify the required parameter 'orderNewSingleRequest' is set
    if (orderNewSingleRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orderNewSingleRequest' when calling v1OrdersPost",
        new ApiException(400, "Missing the required parameter 'orderNewSingleRequest' when calling v1OrdersPost"));
    }

    // create path and map variables
    String path = "/v1/orders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((OrderExecutionReport) ApiInvoker.deserialize(localVarResponse,  "", OrderExecutionReport.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get order execution report
  * Get the last order execution report for the specified order. The requested order does not need to be active or opened.
   * @param clientOrderId The unique identifier of the order assigned by the client.
   * @return OrderExecutionReport
  */
  public OrderExecutionReport v1OrdersStatusClientOrderIdGet (String clientOrderId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'clientOrderId' is set
    if (clientOrderId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientOrderId' when calling v1OrdersStatusClientOrderIdGet",
        new ApiException(400, "Missing the required parameter 'clientOrderId' when calling v1OrdersStatusClientOrderIdGet"));
    }

    // create path and map variables
    String path = "/v1/orders/status/{client_order_id}".replaceAll("\\{" + "client_order_id" + "\\}", apiInvoker.escapeString(clientOrderId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (OrderExecutionReport) ApiInvoker.deserialize(localVarResponse, "", OrderExecutionReport.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get order execution report
   * Get the last order execution report for the specified order. The requested order does not need to be active or opened.
   * @param clientOrderId The unique identifier of the order assigned by the client.
  */
  public void v1OrdersStatusClientOrderIdGet (String clientOrderId, final Response.Listener<OrderExecutionReport> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'clientOrderId' is set
    if (clientOrderId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientOrderId' when calling v1OrdersStatusClientOrderIdGet",
        new ApiException(400, "Missing the required parameter 'clientOrderId' when calling v1OrdersStatusClientOrderIdGet"));
    }

    // create path and map variables
    String path = "/v1/orders/status/{client_order_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "client_order_id" + "\\}", apiInvoker.escapeString(clientOrderId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((OrderExecutionReport) ApiInvoker.deserialize(localVarResponse,  "", OrderExecutionReport.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
