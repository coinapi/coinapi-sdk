<?php
/**
 * UniswapDayDataApi
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * OnChain API
 *
 * This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 6.2.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Api;

use GuzzleHttp\Client;
use GuzzleHttp\ClientInterface;
use GuzzleHttp\Exception\ConnectException;
use GuzzleHttp\Exception\RequestException;
use GuzzleHttp\Psr7\MultipartStream;
use GuzzleHttp\Psr7\Request;
use GuzzleHttp\RequestOptions;
use OpenAPI\Client\ApiException;
use OpenAPI\Client\Configuration;
use OpenAPI\Client\HeaderSelector;
use OpenAPI\Client\ObjectSerializer;

/**
 * UniswapDayDataApi Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class UniswapDayDataApi
{
    /**
     * @var ClientInterface
     */
    protected $client;

    /**
     * @var Configuration
     */
    protected $config;

    /**
     * @var HeaderSelector
     */
    protected $headerSelector;

    /**
     * @var int Host index
     */
    protected $hostIndex;

    /**
     * @param ClientInterface $client
     * @param Configuration   $config
     * @param HeaderSelector  $selector
     * @param int             $hostIndex (Optional) host index to select the list of hosts if defined in the OpenAPI spec
     */
    public function __construct(
        ClientInterface $client = null,
        Configuration $config = null,
        HeaderSelector $selector = null,
        $hostIndex = 0
    ) {
        $this->client = $client ?: new Client();
        $this->config = $config ?: new Configuration();
        $this->headerSelector = $selector ?: new HeaderSelector();
        $this->hostIndex = $hostIndex;
    }

    /**
     * Set the host index
     *
     * @param int $hostIndex Host index (required)
     */
    public function setHostIndex($hostIndex): void
    {
        $this->hostIndex = $hostIndex;
    }

    /**
     * Get the host index
     *
     * @return int Host index
     */
    public function getHostIndex()
    {
        return $this->hostIndex;
    }

    /**
     * @return Configuration
     */
    public function getConfig()
    {
        return $this->config;
    }

    /**
     * Operation chainsChainIdDappsUniswapv2DayDataHistoricalGet
     *
     * @param  string $chain_id chain_id (required)
     * @param  int $start_block start_block (optional)
     * @param  int $end_block end_block (optional)
     * @param  \DateTime $start_date start_date (optional)
     * @param  \DateTime $end_date end_date (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return void
     */
    public function chainsChainIdDappsUniswapv2DayDataHistoricalGet($chain_id, $start_block = null, $end_block = null, $start_date = null, $end_date = null)
    {
        $this->chainsChainIdDappsUniswapv2DayDataHistoricalGetWithHttpInfo($chain_id, $start_block, $end_block, $start_date, $end_date);
    }

    /**
     * Operation chainsChainIdDappsUniswapv2DayDataHistoricalGetWithHttpInfo
     *
     * @param  string $chain_id (required)
     * @param  int $start_block (optional)
     * @param  int $end_block (optional)
     * @param  \DateTime $start_date (optional)
     * @param  \DateTime $end_date (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function chainsChainIdDappsUniswapv2DayDataHistoricalGetWithHttpInfo($chain_id, $start_block = null, $end_block = null, $start_date = null, $end_date = null)
    {
        $request = $this->chainsChainIdDappsUniswapv2DayDataHistoricalGetRequest($chain_id, $start_block, $end_block, $start_date, $end_date);

        try {
            $options = $this->createHttpClientOption();
            try {
                $response = $this->client->send($request, $options);
            } catch (RequestException $e) {
                throw new ApiException(
                    "[{$e->getCode()}] {$e->getMessage()}",
                    (int) $e->getCode(),
                    $e->getResponse() ? $e->getResponse()->getHeaders() : null,
                    $e->getResponse() ? (string) $e->getResponse()->getBody() : null
                );
            } catch (ConnectException $e) {
                throw new ApiException(
                    "[{$e->getCode()}] {$e->getMessage()}",
                    (int) $e->getCode(),
                    null,
                    null
                );
            }

            $statusCode = $response->getStatusCode();

            if ($statusCode < 200 || $statusCode > 299) {
                throw new ApiException(
                    sprintf(
                        '[%d] Error connecting to the API (%s)',
                        $statusCode,
                        (string) $request->getUri()
                    ),
                    $statusCode,
                    $response->getHeaders(),
                    (string) $response->getBody()
                );
            }

            return [null, $statusCode, $response->getHeaders()];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
            
            }
            throw $e;
        }
    }

    /**
     * Operation chainsChainIdDappsUniswapv2DayDataHistoricalGetAsync
     *
     * @param  string $chain_id (required)
     * @param  int $start_block (optional)
     * @param  int $end_block (optional)
     * @param  \DateTime $start_date (optional)
     * @param  \DateTime $end_date (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function chainsChainIdDappsUniswapv2DayDataHistoricalGetAsync($chain_id, $start_block = null, $end_block = null, $start_date = null, $end_date = null)
    {
        return $this->chainsChainIdDappsUniswapv2DayDataHistoricalGetAsyncWithHttpInfo($chain_id, $start_block, $end_block, $start_date, $end_date)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation chainsChainIdDappsUniswapv2DayDataHistoricalGetAsyncWithHttpInfo
     *
     * @param  string $chain_id (required)
     * @param  int $start_block (optional)
     * @param  int $end_block (optional)
     * @param  \DateTime $start_date (optional)
     * @param  \DateTime $end_date (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function chainsChainIdDappsUniswapv2DayDataHistoricalGetAsyncWithHttpInfo($chain_id, $start_block = null, $end_block = null, $start_date = null, $end_date = null)
    {
        $returnType = '';
        $request = $this->chainsChainIdDappsUniswapv2DayDataHistoricalGetRequest($chain_id, $start_block, $end_block, $start_date, $end_date);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    return [null, $response->getStatusCode(), $response->getHeaders()];
                },
                function ($exception) {
                    $response = $exception->getResponse();
                    $statusCode = $response->getStatusCode();
                    throw new ApiException(
                        sprintf(
                            '[%d] Error connecting to the API (%s)',
                            $statusCode,
                            $exception->getRequest()->getUri()
                        ),
                        $statusCode,
                        $response->getHeaders(),
                        (string) $response->getBody()
                    );
                }
            );
    }

    /**
     * Create request for operation 'chainsChainIdDappsUniswapv2DayDataHistoricalGet'
     *
     * @param  string $chain_id (required)
     * @param  int $start_block (optional)
     * @param  int $end_block (optional)
     * @param  \DateTime $start_date (optional)
     * @param  \DateTime $end_date (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    public function chainsChainIdDappsUniswapv2DayDataHistoricalGetRequest($chain_id, $start_block = null, $end_block = null, $start_date = null, $end_date = null)
    {

        // verify the required parameter 'chain_id' is set
        if ($chain_id === null || (is_array($chain_id) && count($chain_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $chain_id when calling chainsChainIdDappsUniswapv2DayDataHistoricalGet'
            );
        }





        $resourcePath = '/chains/{chain_id}/dapps/uniswapv2/dayData/historical';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;

        // query params
        $queryParams = array_merge($queryParams, ObjectSerializer::toQueryValue(
            $start_block,
            'startBlock', // param base name
            'integer', // openApiType
            'form', // style
            true, // explode
            false // required
        ) ?? []);
        // query params
        $queryParams = array_merge($queryParams, ObjectSerializer::toQueryValue(
            $end_block,
            'endBlock', // param base name
            'integer', // openApiType
            'form', // style
            true, // explode
            false // required
        ) ?? []);
        // query params
        $queryParams = array_merge($queryParams, ObjectSerializer::toQueryValue(
            $start_date,
            'startDate', // param base name
            'string', // openApiType
            'form', // style
            true, // explode
            false // required
        ) ?? []);
        // query params
        $queryParams = array_merge($queryParams, ObjectSerializer::toQueryValue(
            $end_date,
            'endDate', // param base name
            'string', // openApiType
            'form', // style
            true, // explode
            false // required
        ) ?? []);


        // path params
        if ($chain_id !== null) {
            $resourcePath = str_replace(
                '{' . 'chain_id' . '}',
                ObjectSerializer::toPathValue($chain_id),
                $resourcePath
            );
        }


        if ($multipart) {
            $headers = $this->headerSelector->selectHeadersForMultipart(
                []
            );
        } else {
            $headers = $this->headerSelector->selectHeaders(
                [],
                []
            );
        }

        // for model (json/xml)
        if (count($formParams) > 0) {
            if ($multipart) {
                $multipartContents = [];
                foreach ($formParams as $formParamName => $formParamValue) {
                    $formParamValueItems = is_array($formParamValue) ? $formParamValue : [$formParamValue];
                    foreach ($formParamValueItems as $formParamValueItem) {
                        $multipartContents[] = [
                            'name' => $formParamName,
                            'contents' => $formParamValueItem
                        ];
                    }
                }
                // for HTTP post (form)
                $httpBody = new MultipartStream($multipartContents);

            } elseif ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode($formParams);

            } else {
                // for HTTP post (form)
                $httpBody = ObjectSerializer::buildQuery($formParams);
            }
        }


        $defaultHeaders = [];
        if ($this->config->getUserAgent()) {
            $defaultHeaders['User-Agent'] = $this->config->getUserAgent();
        }

        $headers = array_merge(
            $defaultHeaders,
            $headerParams,
            $headers
        );

        $operationHost = $this->config->getHost();
        $query = ObjectSerializer::buildQuery($queryParams);
        return new Request(
            'GET',
            $operationHost . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Operation chainsChainIdDappsUniswapv3DayDataHistoricalGet
     *
     * @param  string $chain_id chain_id (required)
     * @param  int $start_block start_block (optional)
     * @param  int $end_block end_block (optional)
     * @param  \DateTime $start_date start_date (optional)
     * @param  \DateTime $end_date end_date (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return void
     */
    public function chainsChainIdDappsUniswapv3DayDataHistoricalGet($chain_id, $start_block = null, $end_block = null, $start_date = null, $end_date = null)
    {
        $this->chainsChainIdDappsUniswapv3DayDataHistoricalGetWithHttpInfo($chain_id, $start_block, $end_block, $start_date, $end_date);
    }

    /**
     * Operation chainsChainIdDappsUniswapv3DayDataHistoricalGetWithHttpInfo
     *
     * @param  string $chain_id (required)
     * @param  int $start_block (optional)
     * @param  int $end_block (optional)
     * @param  \DateTime $start_date (optional)
     * @param  \DateTime $end_date (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function chainsChainIdDappsUniswapv3DayDataHistoricalGetWithHttpInfo($chain_id, $start_block = null, $end_block = null, $start_date = null, $end_date = null)
    {
        $request = $this->chainsChainIdDappsUniswapv3DayDataHistoricalGetRequest($chain_id, $start_block, $end_block, $start_date, $end_date);

        try {
            $options = $this->createHttpClientOption();
            try {
                $response = $this->client->send($request, $options);
            } catch (RequestException $e) {
                throw new ApiException(
                    "[{$e->getCode()}] {$e->getMessage()}",
                    (int) $e->getCode(),
                    $e->getResponse() ? $e->getResponse()->getHeaders() : null,
                    $e->getResponse() ? (string) $e->getResponse()->getBody() : null
                );
            } catch (ConnectException $e) {
                throw new ApiException(
                    "[{$e->getCode()}] {$e->getMessage()}",
                    (int) $e->getCode(),
                    null,
                    null
                );
            }

            $statusCode = $response->getStatusCode();

            if ($statusCode < 200 || $statusCode > 299) {
                throw new ApiException(
                    sprintf(
                        '[%d] Error connecting to the API (%s)',
                        $statusCode,
                        (string) $request->getUri()
                    ),
                    $statusCode,
                    $response->getHeaders(),
                    (string) $response->getBody()
                );
            }

            return [null, $statusCode, $response->getHeaders()];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
            
            }
            throw $e;
        }
    }

    /**
     * Operation chainsChainIdDappsUniswapv3DayDataHistoricalGetAsync
     *
     * @param  string $chain_id (required)
     * @param  int $start_block (optional)
     * @param  int $end_block (optional)
     * @param  \DateTime $start_date (optional)
     * @param  \DateTime $end_date (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function chainsChainIdDappsUniswapv3DayDataHistoricalGetAsync($chain_id, $start_block = null, $end_block = null, $start_date = null, $end_date = null)
    {
        return $this->chainsChainIdDappsUniswapv3DayDataHistoricalGetAsyncWithHttpInfo($chain_id, $start_block, $end_block, $start_date, $end_date)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation chainsChainIdDappsUniswapv3DayDataHistoricalGetAsyncWithHttpInfo
     *
     * @param  string $chain_id (required)
     * @param  int $start_block (optional)
     * @param  int $end_block (optional)
     * @param  \DateTime $start_date (optional)
     * @param  \DateTime $end_date (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function chainsChainIdDappsUniswapv3DayDataHistoricalGetAsyncWithHttpInfo($chain_id, $start_block = null, $end_block = null, $start_date = null, $end_date = null)
    {
        $returnType = '';
        $request = $this->chainsChainIdDappsUniswapv3DayDataHistoricalGetRequest($chain_id, $start_block, $end_block, $start_date, $end_date);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    return [null, $response->getStatusCode(), $response->getHeaders()];
                },
                function ($exception) {
                    $response = $exception->getResponse();
                    $statusCode = $response->getStatusCode();
                    throw new ApiException(
                        sprintf(
                            '[%d] Error connecting to the API (%s)',
                            $statusCode,
                            $exception->getRequest()->getUri()
                        ),
                        $statusCode,
                        $response->getHeaders(),
                        (string) $response->getBody()
                    );
                }
            );
    }

    /**
     * Create request for operation 'chainsChainIdDappsUniswapv3DayDataHistoricalGet'
     *
     * @param  string $chain_id (required)
     * @param  int $start_block (optional)
     * @param  int $end_block (optional)
     * @param  \DateTime $start_date (optional)
     * @param  \DateTime $end_date (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    public function chainsChainIdDappsUniswapv3DayDataHistoricalGetRequest($chain_id, $start_block = null, $end_block = null, $start_date = null, $end_date = null)
    {

        // verify the required parameter 'chain_id' is set
        if ($chain_id === null || (is_array($chain_id) && count($chain_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $chain_id when calling chainsChainIdDappsUniswapv3DayDataHistoricalGet'
            );
        }





        $resourcePath = '/chains/{chain_id}/dapps/uniswapv3/dayData/historical';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;

        // query params
        $queryParams = array_merge($queryParams, ObjectSerializer::toQueryValue(
            $start_block,
            'startBlock', // param base name
            'integer', // openApiType
            'form', // style
            true, // explode
            false // required
        ) ?? []);
        // query params
        $queryParams = array_merge($queryParams, ObjectSerializer::toQueryValue(
            $end_block,
            'endBlock', // param base name
            'integer', // openApiType
            'form', // style
            true, // explode
            false // required
        ) ?? []);
        // query params
        $queryParams = array_merge($queryParams, ObjectSerializer::toQueryValue(
            $start_date,
            'startDate', // param base name
            'string', // openApiType
            'form', // style
            true, // explode
            false // required
        ) ?? []);
        // query params
        $queryParams = array_merge($queryParams, ObjectSerializer::toQueryValue(
            $end_date,
            'endDate', // param base name
            'string', // openApiType
            'form', // style
            true, // explode
            false // required
        ) ?? []);


        // path params
        if ($chain_id !== null) {
            $resourcePath = str_replace(
                '{' . 'chain_id' . '}',
                ObjectSerializer::toPathValue($chain_id),
                $resourcePath
            );
        }


        if ($multipart) {
            $headers = $this->headerSelector->selectHeadersForMultipart(
                []
            );
        } else {
            $headers = $this->headerSelector->selectHeaders(
                [],
                []
            );
        }

        // for model (json/xml)
        if (count($formParams) > 0) {
            if ($multipart) {
                $multipartContents = [];
                foreach ($formParams as $formParamName => $formParamValue) {
                    $formParamValueItems = is_array($formParamValue) ? $formParamValue : [$formParamValue];
                    foreach ($formParamValueItems as $formParamValueItem) {
                        $multipartContents[] = [
                            'name' => $formParamName,
                            'contents' => $formParamValueItem
                        ];
                    }
                }
                // for HTTP post (form)
                $httpBody = new MultipartStream($multipartContents);

            } elseif ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode($formParams);

            } else {
                // for HTTP post (form)
                $httpBody = ObjectSerializer::buildQuery($formParams);
            }
        }


        $defaultHeaders = [];
        if ($this->config->getUserAgent()) {
            $defaultHeaders['User-Agent'] = $this->config->getUserAgent();
        }

        $headers = array_merge(
            $defaultHeaders,
            $headerParams,
            $headers
        );

        $operationHost = $this->config->getHost();
        $query = ObjectSerializer::buildQuery($queryParams);
        return new Request(
            'GET',
            $operationHost . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Create http client option
     *
     * @throws \RuntimeException on file opening failure
     * @return array of http client options
     */
    protected function createHttpClientOption()
    {
        $options = [];
        if ($this->config->getDebug()) {
            $options[RequestOptions::DEBUG] = fopen($this->config->getDebugFile(), 'a');
            if (!$options[RequestOptions::DEBUG]) {
                throw new \RuntimeException('Failed to open the debug file: ' . $this->config->getDebugFile());
            }
        }

        return $options;
    }
}
