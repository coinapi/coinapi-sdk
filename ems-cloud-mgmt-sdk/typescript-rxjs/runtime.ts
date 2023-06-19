// tslint:disable
/**
 * EMS - REST API
 * This section will provide necessary information about the `CoinAPI EMS REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>        Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints  <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this: `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { of } from 'rxjs';
import type { Observable } from 'rxjs';
import { ajax } from 'rxjs/ajax';
import type { AjaxConfig, AjaxResponse } from 'rxjs/ajax';
import { map, concatMap } from 'rxjs/operators';
import { servers } from './servers';

export const BASE_PATH = servers[0].getUrl();

export interface ConfigurationParameters {
    basePath?: string; // override base path
    middleware?: Middleware[]; // middleware to apply before/after rxjs requests
    username?: string; // parameter for basic security
    password?: string; // parameter for basic security
    apiKey?: string | ((name: string) => string); // parameter for apiKey security
    accessToken?: string | ((name?: string, scopes?: string[]) => string); // parameter for oauth2 security
}

export class Configuration {
    constructor(private configuration: ConfigurationParameters = {}) {}

    get basePath(): string {
        return this.configuration.basePath ?? BASE_PATH;
    }

    get middleware(): Middleware[] {
        return this.configuration.middleware ?? [];
    }

    get username(): string | undefined {
        return this.configuration.username;
    }

    get password(): string | undefined {
        return this.configuration.password;
    }

    get apiKey(): ((name: string) => string) | undefined {
        const { apiKey } = this.configuration;
        return apiKey ? (typeof apiKey === 'string' ? () => apiKey : apiKey) : undefined;
    }

    get accessToken(): ((name: string, scopes?: string[]) => string) | undefined {
        const { accessToken } = this.configuration;
        return accessToken ? (typeof accessToken === 'string' ? () => accessToken : accessToken) : undefined;
    }
}

/**
 * This is the base class for all generated API classes.
 */
export class BaseAPI {
    private middleware: Middleware[] = [];

    constructor(protected configuration = new Configuration()) {
        this.middleware = configuration.middleware;
    }

    withMiddleware = (middlewares: Middleware[]): this => {
        const next = this.clone();
        next.middleware = next.middleware.concat(middlewares);
        return next;
    };

    withPreMiddleware = (preMiddlewares: Array<Middleware['pre']>) =>
        this.withMiddleware(preMiddlewares.map((pre) => ({ pre })));

    withPostMiddleware = (postMiddlewares: Array<Middleware['post']>) =>
        this.withMiddleware(postMiddlewares.map((post) => ({ post })));

    protected request<T>(requestOpts: RequestOpts): Observable<T>
    protected request<T>(requestOpts: RequestOpts, responseOpts?: ResponseOpts): Observable<AjaxResponse<T>>
    protected request<T>(requestOpts: RequestOpts, responseOpts?: ResponseOpts): Observable<T | AjaxResponse<T>> {
        return this.rxjsRequest<T>(this.createRequestArgs(requestOpts)).pipe(
            map((res) => {
                const { status, response } = res;
                if (status >= 200 && status < 300) {
                    return responseOpts?.response === 'raw' ? res : response;
                }
                throw res;
            })
        );
    }

    private createRequestArgs = ({ url: baseUrl, query, method, headers, body, responseType }: RequestOpts): AjaxConfig => {
        // only add the queryString to the URL if there are query parameters.
        // this is done to avoid urls ending with a '?' character which buggy webservers
        // do not handle correctly sometimes.
        const url = `${this.configuration.basePath}${baseUrl}${query && Object.keys(query).length ? `?${queryString(query)}`: ''}`;

        return {
            url,
            method,
            headers,
            body: body instanceof FormData ? body : JSON.stringify(body),
            responseType: responseType ?? 'json',
        };
    }

    private rxjsRequest = <T>(params: AjaxConfig): Observable<AjaxResponse<T>> =>
        of(params).pipe(
            map((request) => {
                this.middleware.filter((item) => item.pre).forEach((mw) => (request = mw.pre!(request)));
                return request;
            }),
            concatMap((args) =>
                ajax<T>(args).pipe(
                    map((response) => {
                        this.middleware.filter((item) => item.post).forEach((mw) => (response = mw.post!(response)));
                        return response;
                    })
                )
            )
        );

    /**
     * Create a shallow clone of `this` by constructing a new instance
     * and then shallow cloning data members.
     */
    private clone = (): this =>
        Object.assign(Object.create(Object.getPrototypeOf(this)), this);
}

/**
 * @deprecated
 * export for not being a breaking change
 */
export class RequiredError extends Error {
    override name: 'RequiredError' = 'RequiredError';
}

export const COLLECTION_FORMATS = {
    csv: ',',
    ssv: ' ',
    tsv: '\t',
    pipes: '|',
};

export type Json = any;
export type HttpMethod = 'GET' | 'POST' | 'PUT' | 'PATCH' | 'DELETE' | 'OPTIONS' | 'HEAD';
export type HttpHeaders = { [key: string]: string };
export type HttpQuery = Partial<{ [key: string]: string | number | null | boolean | Array<string | number | null | boolean> }>; // partial is needed for strict mode
export type HttpBody = Json | FormData;

export interface RequestOpts extends AjaxConfig {
    // TODO: replace custom 'query' prop with 'queryParams'
    query?: HttpQuery; // additional prop
    // the following props have improved types over AjaxRequest
    method: HttpMethod;
    headers?: HttpHeaders;
    body?: HttpBody;
}

export interface ResponseOpts {
    response?: 'raw';
}

export interface OperationOpts {
    responseOpts?: ResponseOpts;
}

export const encodeURI = (value: any) => encodeURIComponent(`${value}`);

const queryString = (params: HttpQuery): string => Object.entries(params)
    .map(([key, value]) => value instanceof Array
        ? value.map((val) => `${encodeURI(key)}=${encodeURI(val)}`).join('&')
        : `${encodeURI(key)}=${encodeURI(value)}`
    )
    .join('&');

export const throwIfNullOrUndefined = (value: any, paramName: string, nickname: string) => {
    if (value == null) {
        throw new Error(`Parameter "${paramName}" was null or undefined when calling "${nickname}".`);
    }
};

export interface Middleware {
    pre?(request: AjaxConfig): AjaxConfig;
    post?(response: AjaxResponse<any>): AjaxResponse<any>;
}
