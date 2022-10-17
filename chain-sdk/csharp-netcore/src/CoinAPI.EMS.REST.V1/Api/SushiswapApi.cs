/*
 * OnChain API
 *
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
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
    public interface ISushiswapApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// GetPools
        /// </summary>
        /// <remarks>
        /// Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry&#39;s standard dummy text ever since the 1500s.
        /// </remarks>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>List&lt;PairDTO&gt;</returns>
        List<PairDTO> ChainsChainIdDappsSushiswapPoolsCurrentGet(string chainId, int operationIndex = 0);

        /// <summary>
        /// GetPools
        /// </summary>
        /// <remarks>
        /// Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry&#39;s standard dummy text ever since the 1500s.
        /// </remarks>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of List&lt;PairDTO&gt;</returns>
        ApiResponse<List<PairDTO>> ChainsChainIdDappsSushiswapPoolsCurrentGetWithHttpInfo(string chainId, int operationIndex = 0);
        /// <summary>
        /// GetSwaps
        /// </summary>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>List&lt;SwapDTO&gt;</returns>
        List<SwapDTO> ChainsChainIdDappsSushiswapSwapsCurrentGet(string chainId, int operationIndex = 0);

        /// <summary>
        /// GetSwaps
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of List&lt;SwapDTO&gt;</returns>
        ApiResponse<List<SwapDTO>> ChainsChainIdDappsSushiswapSwapsCurrentGetWithHttpInfo(string chainId, int operationIndex = 0);
        /// <summary>
        /// GetTokens
        /// </summary>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>List&lt;TokenDTO&gt;</returns>
        List<TokenDTO> ChainsChainIdDappsSushiswapTokensCurrentGet(string chainId, int operationIndex = 0);

        /// <summary>
        /// GetTokens
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of List&lt;TokenDTO&gt;</returns>
        ApiResponse<List<TokenDTO>> ChainsChainIdDappsSushiswapTokensCurrentGetWithHttpInfo(string chainId, int operationIndex = 0);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ISushiswapApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// GetPools
        /// </summary>
        /// <remarks>
        /// Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry&#39;s standard dummy text ever since the 1500s.
        /// </remarks>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;PairDTO&gt;</returns>
        System.Threading.Tasks.Task<List<PairDTO>> ChainsChainIdDappsSushiswapPoolsCurrentGetAsync(string chainId, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// GetPools
        /// </summary>
        /// <remarks>
        /// Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry&#39;s standard dummy text ever since the 1500s.
        /// </remarks>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List&lt;PairDTO&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<PairDTO>>> ChainsChainIdDappsSushiswapPoolsCurrentGetWithHttpInfoAsync(string chainId, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// GetSwaps
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;SwapDTO&gt;</returns>
        System.Threading.Tasks.Task<List<SwapDTO>> ChainsChainIdDappsSushiswapSwapsCurrentGetAsync(string chainId, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// GetSwaps
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List&lt;SwapDTO&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<SwapDTO>>> ChainsChainIdDappsSushiswapSwapsCurrentGetWithHttpInfoAsync(string chainId, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// GetTokens
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;TokenDTO&gt;</returns>
        System.Threading.Tasks.Task<List<TokenDTO>> ChainsChainIdDappsSushiswapTokensCurrentGetAsync(string chainId, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// GetTokens
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List&lt;TokenDTO&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<TokenDTO>>> ChainsChainIdDappsSushiswapTokensCurrentGetWithHttpInfoAsync(string chainId, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ISushiswapApi : ISushiswapApiSync, ISushiswapApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class SushiswapApi : ISushiswapApi
    {
        private CoinAPI.EMS.REST.V1.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="SushiswapApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SushiswapApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="SushiswapApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SushiswapApi(string basePath)
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
        /// Initializes a new instance of the <see cref="SushiswapApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public SushiswapApi(CoinAPI.EMS.REST.V1.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="SushiswapApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public SushiswapApi(CoinAPI.EMS.REST.V1.Client.ISynchronousClient client, CoinAPI.EMS.REST.V1.Client.IAsynchronousClient asyncClient, CoinAPI.EMS.REST.V1.Client.IReadableConfiguration configuration)
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
        /// GetPools Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry&#39;s standard dummy text ever since the 1500s.
        /// </summary>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>List&lt;PairDTO&gt;</returns>
        public List<PairDTO> ChainsChainIdDappsSushiswapPoolsCurrentGet(string chainId, int operationIndex = 0)
        {
            CoinAPI.EMS.REST.V1.Client.ApiResponse<List<PairDTO>> localVarResponse = ChainsChainIdDappsSushiswapPoolsCurrentGetWithHttpInfo(chainId);
            return localVarResponse.Data;
        }

        /// <summary>
        /// GetPools Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry&#39;s standard dummy text ever since the 1500s.
        /// </summary>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of List&lt;PairDTO&gt;</returns>
        public CoinAPI.EMS.REST.V1.Client.ApiResponse<List<PairDTO>> ChainsChainIdDappsSushiswapPoolsCurrentGetWithHttpInfo(string chainId, int operationIndex = 0)
        {
            // verify the required parameter 'chainId' is set
            if (chainId == null)
            {
                throw new CoinAPI.EMS.REST.V1.Client.ApiException(400, "Missing required parameter 'chainId' when calling SushiswapApi->ChainsChainIdDappsSushiswapPoolsCurrentGet");
            }

            CoinAPI.EMS.REST.V1.Client.RequestOptions localVarRequestOptions = new CoinAPI.EMS.REST.V1.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "text/plain",
                "application/json",
                "text/json"
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

            localVarRequestOptions.PathParameters.Add("chain_id", CoinAPI.EMS.REST.V1.Client.ClientUtils.ParameterToString(chainId)); // path parameter

            localVarRequestOptions.Operation = "SushiswapApi.ChainsChainIdDappsSushiswapPoolsCurrentGet";
            localVarRequestOptions.OperationIndex = operationIndex;


            // make the HTTP request
            var localVarResponse = this.Client.Get<List<PairDTO>>("/chains/{chain_id}/dapps/sushiswap/pools/current", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ChainsChainIdDappsSushiswapPoolsCurrentGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// GetPools Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry&#39;s standard dummy text ever since the 1500s.
        /// </summary>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;PairDTO&gt;</returns>
        public async System.Threading.Tasks.Task<List<PairDTO>> ChainsChainIdDappsSushiswapPoolsCurrentGetAsync(string chainId, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            CoinAPI.EMS.REST.V1.Client.ApiResponse<List<PairDTO>> localVarResponse = await ChainsChainIdDappsSushiswapPoolsCurrentGetWithHttpInfoAsync(chainId, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// GetPools Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry&#39;s standard dummy text ever since the 1500s.
        /// </summary>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List&lt;PairDTO&gt;)</returns>
        public async System.Threading.Tasks.Task<CoinAPI.EMS.REST.V1.Client.ApiResponse<List<PairDTO>>> ChainsChainIdDappsSushiswapPoolsCurrentGetWithHttpInfoAsync(string chainId, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'chainId' is set
            if (chainId == null)
            {
                throw new CoinAPI.EMS.REST.V1.Client.ApiException(400, "Missing required parameter 'chainId' when calling SushiswapApi->ChainsChainIdDappsSushiswapPoolsCurrentGet");
            }


            CoinAPI.EMS.REST.V1.Client.RequestOptions localVarRequestOptions = new CoinAPI.EMS.REST.V1.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "text/plain",
                "application/json",
                "text/json"
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

            localVarRequestOptions.PathParameters.Add("chain_id", CoinAPI.EMS.REST.V1.Client.ClientUtils.ParameterToString(chainId)); // path parameter

            localVarRequestOptions.Operation = "SushiswapApi.ChainsChainIdDappsSushiswapPoolsCurrentGet";
            localVarRequestOptions.OperationIndex = operationIndex;


            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<List<PairDTO>>("/chains/{chain_id}/dapps/sushiswap/pools/current", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ChainsChainIdDappsSushiswapPoolsCurrentGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// GetSwaps 
        /// </summary>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>List&lt;SwapDTO&gt;</returns>
        public List<SwapDTO> ChainsChainIdDappsSushiswapSwapsCurrentGet(string chainId, int operationIndex = 0)
        {
            CoinAPI.EMS.REST.V1.Client.ApiResponse<List<SwapDTO>> localVarResponse = ChainsChainIdDappsSushiswapSwapsCurrentGetWithHttpInfo(chainId);
            return localVarResponse.Data;
        }

        /// <summary>
        /// GetSwaps 
        /// </summary>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of List&lt;SwapDTO&gt;</returns>
        public CoinAPI.EMS.REST.V1.Client.ApiResponse<List<SwapDTO>> ChainsChainIdDappsSushiswapSwapsCurrentGetWithHttpInfo(string chainId, int operationIndex = 0)
        {
            // verify the required parameter 'chainId' is set
            if (chainId == null)
            {
                throw new CoinAPI.EMS.REST.V1.Client.ApiException(400, "Missing required parameter 'chainId' when calling SushiswapApi->ChainsChainIdDappsSushiswapSwapsCurrentGet");
            }

            CoinAPI.EMS.REST.V1.Client.RequestOptions localVarRequestOptions = new CoinAPI.EMS.REST.V1.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "text/plain",
                "application/json",
                "text/json"
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

            localVarRequestOptions.PathParameters.Add("chain_id", CoinAPI.EMS.REST.V1.Client.ClientUtils.ParameterToString(chainId)); // path parameter

            localVarRequestOptions.Operation = "SushiswapApi.ChainsChainIdDappsSushiswapSwapsCurrentGet";
            localVarRequestOptions.OperationIndex = operationIndex;


            // make the HTTP request
            var localVarResponse = this.Client.Get<List<SwapDTO>>("/chains/{chain_id}/dapps/sushiswap/swaps/current", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ChainsChainIdDappsSushiswapSwapsCurrentGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// GetSwaps 
        /// </summary>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;SwapDTO&gt;</returns>
        public async System.Threading.Tasks.Task<List<SwapDTO>> ChainsChainIdDappsSushiswapSwapsCurrentGetAsync(string chainId, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            CoinAPI.EMS.REST.V1.Client.ApiResponse<List<SwapDTO>> localVarResponse = await ChainsChainIdDappsSushiswapSwapsCurrentGetWithHttpInfoAsync(chainId, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// GetSwaps 
        /// </summary>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List&lt;SwapDTO&gt;)</returns>
        public async System.Threading.Tasks.Task<CoinAPI.EMS.REST.V1.Client.ApiResponse<List<SwapDTO>>> ChainsChainIdDappsSushiswapSwapsCurrentGetWithHttpInfoAsync(string chainId, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'chainId' is set
            if (chainId == null)
            {
                throw new CoinAPI.EMS.REST.V1.Client.ApiException(400, "Missing required parameter 'chainId' when calling SushiswapApi->ChainsChainIdDappsSushiswapSwapsCurrentGet");
            }


            CoinAPI.EMS.REST.V1.Client.RequestOptions localVarRequestOptions = new CoinAPI.EMS.REST.V1.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "text/plain",
                "application/json",
                "text/json"
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

            localVarRequestOptions.PathParameters.Add("chain_id", CoinAPI.EMS.REST.V1.Client.ClientUtils.ParameterToString(chainId)); // path parameter

            localVarRequestOptions.Operation = "SushiswapApi.ChainsChainIdDappsSushiswapSwapsCurrentGet";
            localVarRequestOptions.OperationIndex = operationIndex;


            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<List<SwapDTO>>("/chains/{chain_id}/dapps/sushiswap/swaps/current", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ChainsChainIdDappsSushiswapSwapsCurrentGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// GetTokens 
        /// </summary>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>List&lt;TokenDTO&gt;</returns>
        public List<TokenDTO> ChainsChainIdDappsSushiswapTokensCurrentGet(string chainId, int operationIndex = 0)
        {
            CoinAPI.EMS.REST.V1.Client.ApiResponse<List<TokenDTO>> localVarResponse = ChainsChainIdDappsSushiswapTokensCurrentGetWithHttpInfo(chainId);
            return localVarResponse.Data;
        }

        /// <summary>
        /// GetTokens 
        /// </summary>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of List&lt;TokenDTO&gt;</returns>
        public CoinAPI.EMS.REST.V1.Client.ApiResponse<List<TokenDTO>> ChainsChainIdDappsSushiswapTokensCurrentGetWithHttpInfo(string chainId, int operationIndex = 0)
        {
            // verify the required parameter 'chainId' is set
            if (chainId == null)
            {
                throw new CoinAPI.EMS.REST.V1.Client.ApiException(400, "Missing required parameter 'chainId' when calling SushiswapApi->ChainsChainIdDappsSushiswapTokensCurrentGet");
            }

            CoinAPI.EMS.REST.V1.Client.RequestOptions localVarRequestOptions = new CoinAPI.EMS.REST.V1.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "text/plain",
                "application/json",
                "text/json"
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

            localVarRequestOptions.PathParameters.Add("chain_id", CoinAPI.EMS.REST.V1.Client.ClientUtils.ParameterToString(chainId)); // path parameter

            localVarRequestOptions.Operation = "SushiswapApi.ChainsChainIdDappsSushiswapTokensCurrentGet";
            localVarRequestOptions.OperationIndex = operationIndex;


            // make the HTTP request
            var localVarResponse = this.Client.Get<List<TokenDTO>>("/chains/{chain_id}/dapps/sushiswap/tokens/current", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ChainsChainIdDappsSushiswapTokensCurrentGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// GetTokens 
        /// </summary>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;TokenDTO&gt;</returns>
        public async System.Threading.Tasks.Task<List<TokenDTO>> ChainsChainIdDappsSushiswapTokensCurrentGetAsync(string chainId, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            CoinAPI.EMS.REST.V1.Client.ApiResponse<List<TokenDTO>> localVarResponse = await ChainsChainIdDappsSushiswapTokensCurrentGetWithHttpInfoAsync(chainId, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// GetTokens 
        /// </summary>
        /// <exception cref="CoinAPI.EMS.REST.V1.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chainId">Chain id</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List&lt;TokenDTO&gt;)</returns>
        public async System.Threading.Tasks.Task<CoinAPI.EMS.REST.V1.Client.ApiResponse<List<TokenDTO>>> ChainsChainIdDappsSushiswapTokensCurrentGetWithHttpInfoAsync(string chainId, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'chainId' is set
            if (chainId == null)
            {
                throw new CoinAPI.EMS.REST.V1.Client.ApiException(400, "Missing required parameter 'chainId' when calling SushiswapApi->ChainsChainIdDappsSushiswapTokensCurrentGet");
            }


            CoinAPI.EMS.REST.V1.Client.RequestOptions localVarRequestOptions = new CoinAPI.EMS.REST.V1.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "text/plain",
                "application/json",
                "text/json"
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

            localVarRequestOptions.PathParameters.Add("chain_id", CoinAPI.EMS.REST.V1.Client.ClientUtils.ParameterToString(chainId)); // path parameter

            localVarRequestOptions.Operation = "SushiswapApi.ChainsChainIdDappsSushiswapTokensCurrentGet";
            localVarRequestOptions.OperationIndex = operationIndex;


            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<List<TokenDTO>>("/chains/{chain_id}/dapps/sushiswap/tokens/current", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ChainsChainIdDappsSushiswapTokensCurrentGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}