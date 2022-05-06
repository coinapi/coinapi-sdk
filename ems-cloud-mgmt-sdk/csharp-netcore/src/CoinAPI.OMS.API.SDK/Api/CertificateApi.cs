/*
 * EMS - Managed Cloud REST API
 *
 * This section will provide necessary information about the `CoinAPI EMS Managed Cloud REST API` protocol.  <br/><br/> This API is used to manage the overall deployment of **Execution Management System API** (`EMS API`) software,  which means that in this API, you define the accounts, credentials, and configurations for the order destinations or identify the CoinAPI endpoints where you need to connect to access the `EMS API`.  <br/><br/> Implemented Standards:   * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)  * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)  * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)   ### Endpoints <table>   <thead>     <tr>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Production</td>       <td><code>https://ems-mgmt.coinapi.io/</code></td>     </tr>     <tr>       <td>Sandbox</td>       <td><code>https://ems-mgmt-sandbox.coinapi.io/</code></td>     </tr>   </tbody> </table>  ### Authentication  To use resources that require authorized access, you will need to provide an API key to us when making HTTP requests.  There are 2 methods for passing the API key to us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key`  2. Query string parameter named `apikey`  #### Custom authorization header  You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value.  Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: <br/><br/> `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY`  <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside>  #### Query string authorization parameter  You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request.  Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all accounts, then your query string should look like this:  <br/><br/> `GET /v1/accounts?apikey=73034021-THIS-IS-SAMPLE-KEY`  <aside class=\"notice\"> Query string method may be more practical for development activities. </aside> 
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
using CoinAPI.OMS.API.SDK.Client;

namespace CoinAPI.OMS.API.SDK.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICertificateApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get authentication certificate
        /// </summary>
        /// <remarks>
        /// Providing PEM file with the Private Key, Public Key and the Certificate to authenticate to the EMS API.
        /// </remarks>
        /// <exception cref="CoinAPI.OMS.API.SDK.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>string</returns>
        string Certificate();

        /// <summary>
        /// Get authentication certificate
        /// </summary>
        /// <remarks>
        /// Providing PEM file with the Private Key, Public Key and the Certificate to authenticate to the EMS API.
        /// </remarks>
        /// <exception cref="CoinAPI.OMS.API.SDK.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of string</returns>
        ApiResponse<string> CertificateWithHttpInfo();
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICertificateApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get authentication certificate
        /// </summary>
        /// <remarks>
        /// Providing PEM file with the Private Key, Public Key and the Certificate to authenticate to the EMS API.
        /// </remarks>
        /// <exception cref="CoinAPI.OMS.API.SDK.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of string</returns>
        System.Threading.Tasks.Task<string> CertificateAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get authentication certificate
        /// </summary>
        /// <remarks>
        /// Providing PEM file with the Private Key, Public Key and the Certificate to authenticate to the EMS API.
        /// </remarks>
        /// <exception cref="CoinAPI.OMS.API.SDK.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (string)</returns>
        System.Threading.Tasks.Task<ApiResponse<string>> CertificateWithHttpInfoAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICertificateApi : ICertificateApiSync, ICertificateApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class CertificateApi : ICertificateApi
    {
        private CoinAPI.OMS.API.SDK.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="CertificateApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CertificateApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CertificateApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CertificateApi(string basePath)
        {
            this.Configuration = CoinAPI.OMS.API.SDK.Client.Configuration.MergeConfigurations(
                CoinAPI.OMS.API.SDK.Client.GlobalConfiguration.Instance,
                new CoinAPI.OMS.API.SDK.Client.Configuration { BasePath = basePath }
            );
            this.Client = new CoinAPI.OMS.API.SDK.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new CoinAPI.OMS.API.SDK.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = CoinAPI.OMS.API.SDK.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CertificateApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public CertificateApi(CoinAPI.OMS.API.SDK.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = CoinAPI.OMS.API.SDK.Client.Configuration.MergeConfigurations(
                CoinAPI.OMS.API.SDK.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new CoinAPI.OMS.API.SDK.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new CoinAPI.OMS.API.SDK.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = CoinAPI.OMS.API.SDK.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CertificateApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public CertificateApi(CoinAPI.OMS.API.SDK.Client.ISynchronousClient client, CoinAPI.OMS.API.SDK.Client.IAsynchronousClient asyncClient, CoinAPI.OMS.API.SDK.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = CoinAPI.OMS.API.SDK.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public CoinAPI.OMS.API.SDK.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public CoinAPI.OMS.API.SDK.Client.ISynchronousClient Client { get; set; }

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
        public CoinAPI.OMS.API.SDK.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public CoinAPI.OMS.API.SDK.Client.ExceptionFactory ExceptionFactory
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
        /// Get authentication certificate Providing PEM file with the Private Key, Public Key and the Certificate to authenticate to the EMS API.
        /// </summary>
        /// <exception cref="CoinAPI.OMS.API.SDK.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>string</returns>
        public string Certificate()
        {
            CoinAPI.OMS.API.SDK.Client.ApiResponse<string> localVarResponse = CertificateWithHttpInfo();
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get authentication certificate Providing PEM file with the Private Key, Public Key and the Certificate to authenticate to the EMS API.
        /// </summary>
        /// <exception cref="CoinAPI.OMS.API.SDK.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of string</returns>
        public CoinAPI.OMS.API.SDK.Client.ApiResponse<string> CertificateWithHttpInfo()
        {
            CoinAPI.OMS.API.SDK.Client.RequestOptions localVarRequestOptions = new CoinAPI.OMS.API.SDK.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "text/plain"
            };

            var localVarContentType = CoinAPI.OMS.API.SDK.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = CoinAPI.OMS.API.SDK.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }


            // authentication (APIKeyHeader) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("X-CoinAPI-Key")))
            {
                localVarRequestOptions.HeaderParameters.Add("X-CoinAPI-Key", this.Configuration.GetApiKeyWithPrefix("X-CoinAPI-Key"));
            }
            // authentication (APIKeyQueryParam) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("apikey")))
            {
                localVarRequestOptions.QueryParameters.Add(CoinAPI.OMS.API.SDK.Client.ClientUtils.ParameterToMultiMap("", "apikey", this.Configuration.GetApiKeyWithPrefix("apikey")));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Get<string>("/v1/certificate/pem", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("Certificate", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get authentication certificate Providing PEM file with the Private Key, Public Key and the Certificate to authenticate to the EMS API.
        /// </summary>
        /// <exception cref="CoinAPI.OMS.API.SDK.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of string</returns>
        public async System.Threading.Tasks.Task<string> CertificateAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            CoinAPI.OMS.API.SDK.Client.ApiResponse<string> localVarResponse = await CertificateWithHttpInfoAsync(cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get authentication certificate Providing PEM file with the Private Key, Public Key and the Certificate to authenticate to the EMS API.
        /// </summary>
        /// <exception cref="CoinAPI.OMS.API.SDK.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (string)</returns>
        public async System.Threading.Tasks.Task<CoinAPI.OMS.API.SDK.Client.ApiResponse<string>> CertificateWithHttpInfoAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            CoinAPI.OMS.API.SDK.Client.RequestOptions localVarRequestOptions = new CoinAPI.OMS.API.SDK.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "text/plain"
            };

            var localVarContentType = CoinAPI.OMS.API.SDK.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = CoinAPI.OMS.API.SDK.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }


            // authentication (APIKeyHeader) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("X-CoinAPI-Key")))
            {
                localVarRequestOptions.HeaderParameters.Add("X-CoinAPI-Key", this.Configuration.GetApiKeyWithPrefix("X-CoinAPI-Key"));
            }
            // authentication (APIKeyQueryParam) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("apikey")))
            {
                localVarRequestOptions.QueryParameters.Add(CoinAPI.OMS.API.SDK.Client.ClientUtils.ParameterToMultiMap("", "apikey", this.Configuration.GetApiKeyWithPrefix("apikey")));
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<string>("/v1/certificate/pem", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("Certificate", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
