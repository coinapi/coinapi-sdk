/*
 * EMS - REST API
 *
 * This section will provide necessary information about the `CoinAPI EMS REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>        Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints  <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this: `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using CoinAPI.EMS.REST.V1.Client;
using CoinAPI.EMS.REST.V1.Model;

namespace CoinAPI.EMS.REST.V1.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IPositionsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get open positions
        /// </summary>
        /// <remarks>
        /// Get current open positions across all or single exchange.
        /// </remarks>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="exchangeId">Filter the balances to the specific exchange. (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>List&lt;Position&gt;</returns>
        List<Position> V1PositionsGet(string exchangeId = default(string), int operationIndex = 0);

        /// <summary>
        /// Get open positions
        /// </summary>
        /// <remarks>
        /// Get current open positions across all or single exchange.
        /// </remarks>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="exchangeId">Filter the balances to the specific exchange. (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of List&lt;Position&gt;</returns>
        ApiResponse<List<Position>> V1PositionsGetWithHttpInfo(string exchangeId = default(string), int operationIndex = 0);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IPositionsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get open positions
        /// </summary>
        /// <remarks>
        /// Get current open positions across all or single exchange.
        /// </remarks>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="exchangeId">Filter the balances to the specific exchange. (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;Position&gt;</returns>
        System.Threading.Tasks.Task<List<Position>> V1PositionsGetAsync(string exchangeId = default(string), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get open positions
        /// </summary>
        /// <remarks>
        /// Get current open positions across all or single exchange.
        /// </remarks>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="exchangeId">Filter the balances to the specific exchange. (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List&lt;Position&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<Position>>> V1PositionsGetWithHttpInfoAsync(string exchangeId = default(string), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IPositionsApi : IPositionsApiSync, IPositionsApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class PositionsApi : IPositionsApi
    {
        private CoinAPI.EMS.REST.V1.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="PositionsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public PositionsApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PositionsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public PositionsApi(string basePath)
        {
            this.Configuration = CoinAPI.EMS.REST.V1.Client.Configuration.MergeConfigurations(
                CoinAPI.EMS.REST.V1.Client.GlobalConfiguration.Instance,
                new CoinAPI.EMS.REST.V1.Client.Configuration { BasePath = basePath }
            );
            this.Client = new CoinAPI.EMS.REST.V1.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new CoinAPI.EMS.REST.V1.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = CoinAPI.EMS.REST.V1.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PositionsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public PositionsApi(CoinAPI.EMS.REST.V1.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = CoinAPI.EMS.REST.V1.Client.Configuration.MergeConfigurations(
                CoinAPI.EMS.REST.V1.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new CoinAPI.EMS.REST.V1.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new CoinAPI.EMS.REST.V1.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = CoinAPI.EMS.REST.V1.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PositionsApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public PositionsApi(CoinAPI.EMS.REST.V1.Client.ISynchronousClient client, CoinAPI.EMS.REST.V1.Client.IAsynchronousClient asyncClient, CoinAPI.EMS.REST.V1.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = CoinAPI.EMS.REST.V1.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public CoinAPI.EMS.REST.V1.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public CoinAPI.EMS.REST.V1.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public string GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public CoinAPI.EMS.REST.V1.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public CoinAPI.EMS.REST.V1.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Get open positions Get current open positions across all or single exchange.
        /// </summary>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="exchangeId">Filter the balances to the specific exchange. (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>List&lt;Position&gt;</returns>
        public List<Position> V1PositionsGet(string exchangeId = default(string), int operationIndex = 0)
        {
            CoinAPI.EMS.REST.V1.Client.ApiResponse<List<Position>> localVarResponse = V1PositionsGetWithHttpInfo(exchangeId);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get open positions Get current open positions across all or single exchange.
        /// </summary>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="exchangeId">Filter the balances to the specific exchange. (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of List&lt;Position&gt;</returns>
        public CoinAPI.EMS.REST.V1.Client.ApiResponse<List<Position>> V1PositionsGetWithHttpInfo(string exchangeId = default(string), int operationIndex = 0)
        {
            CoinAPI.EMS.REST.V1.Client.RequestOptions localVarRequestOptions = new CoinAPI.EMS.REST.V1.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json",
                "appliction/json"
            };

            var localVarContentType = CoinAPI.EMS.REST.V1.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = CoinAPI.EMS.REST.V1.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (exchangeId != null)
            {
                localVarRequestOptions.QueryParameters.Add(CoinAPI.EMS.REST.V1.Client.ClientUtils.ParameterToMultiMap("", "exchange_id", exchangeId));
            }

            localVarRequestOptions.Operation = "PositionsApi.V1PositionsGet";
            localVarRequestOptions.OperationIndex = operationIndex;


            // make the HTTP request
            var localVarResponse = this.Client.Get<List<Position>>("/v1/positions", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("V1PositionsGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get open positions Get current open positions across all or single exchange.
        /// </summary>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="exchangeId">Filter the balances to the specific exchange. (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;Position&gt;</returns>
        public async System.Threading.Tasks.Task<List<Position>> V1PositionsGetAsync(string exchangeId = default(string), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            CoinAPI.EMS.REST.V1.Client.ApiResponse<List<Position>> localVarResponse = await V1PositionsGetWithHttpInfoAsync(exchangeId, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get open positions Get current open positions across all or single exchange.
        /// </summary>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="exchangeId">Filter the balances to the specific exchange. (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List&lt;Position&gt;)</returns>
        public async System.Threading.Tasks.Task<CoinAPI.EMS.REST.V1.Client.ApiResponse<List<Position>>> V1PositionsGetWithHttpInfoAsync(string exchangeId = default(string), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            CoinAPI.EMS.REST.V1.Client.RequestOptions localVarRequestOptions = new CoinAPI.EMS.REST.V1.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json",
                "appliction/json"
            };

            var localVarContentType = CoinAPI.EMS.REST.V1.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = CoinAPI.EMS.REST.V1.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (exchangeId != null)
            {
                localVarRequestOptions.QueryParameters.Add(CoinAPI.EMS.REST.V1.Client.ClientUtils.ParameterToMultiMap("", "exchange_id", exchangeId));
            }

            localVarRequestOptions.Operation = "PositionsApi.V1PositionsGet";
            localVarRequestOptions.OperationIndex = operationIndex;


            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<List<Position>>("/v1/positions", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("V1PositionsGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
