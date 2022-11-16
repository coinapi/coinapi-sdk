/**
 * OnChain API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as $ from 'jquery';
import * as models from '../model/models';
import { COLLECTION_FORMATS } from '../variables';
import { Configuration } from '../configuration';

/* tslint:disable:no-unused-variable member-ordering */


export class DexApi {
    protected basePath = 'https://onchain.coinapi.io';
    public defaultHeaders: Array<string> = [];
    public defaultExtraJQueryAjaxSettings?: JQueryAjaxSettings = undefined;
    public configuration: Configuration = new Configuration();

    constructor(basePath?: string, configuration?: Configuration, defaultExtraJQueryAjaxSettings?: JQueryAjaxSettings) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
        }
        if (defaultExtraJQueryAjaxSettings) {
            this.defaultExtraJQueryAjaxSettings = defaultExtraJQueryAjaxSettings;
        }
    }

    private extendObj<T1 extends object, T2 extends T1>(objA: T2, objB: T2): T1|T2 {
        for (let key in objB) {
            if (objB.hasOwnProperty(key)) {
                objA[key] = objB[key];
            }
        }
        return objA;
    }

    /**
     * Gets batchs.
     * @summary Batchs (historical) 🔥
     * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
     * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
     * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
     * @param endDate The end date of timeframe.
     * @param id Identifier.
     */
    public dexGetBatchsHistorical(startBlock?: number, endBlock?: number, startDate?: string, endDate?: string, id?: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body: Array<models.DexBatchDTO>;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/dapps/dex/batchs/historical';

        let queryParameters: any = {};
        let headerParams: any = {};
        if (startBlock !== null && startBlock !== undefined) {
            queryParameters['startBlock'] = <string><any>startBlock;
        }
        if (endBlock !== null && endBlock !== undefined) {
            queryParameters['endBlock'] = <string><any>endBlock;
        }
        if (startDate !== null && startDate !== undefined) {
            queryParameters['startDate'] = startDate.toISOString();
        }
        if (endDate !== null && endDate !== undefined) {
            queryParameters['endDate'] = endDate.toISOString();
        }
        if (id !== null && id !== undefined) {
            queryParameters['id'] = <string><any>id;
        }

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'text/plain', 
            'application/json', 
            'text/json'
        ];


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body: Array<models.DexBatchDTO>;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: Array<models.DexBatchDTO>, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

    /**
     * Gets deposits.
     * @summary Deposits (historical) 🔥
     * @param startBlock 
     * @param endBlock 
     * @param startDate 
     * @param endDate 
     * @param id 
     * @param user 
     */
    public dexGetDepositsHistorical(startBlock?: number, endBlock?: number, startDate?: string, endDate?: string, id?: string, user?: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body: Array<models.DexDepositDTO>;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/dapps/dex/deposits/historical';

        let queryParameters: any = {};
        let headerParams: any = {};
        if (startBlock !== null && startBlock !== undefined) {
            queryParameters['startBlock'] = <string><any>startBlock;
        }
        if (endBlock !== null && endBlock !== undefined) {
            queryParameters['endBlock'] = <string><any>endBlock;
        }
        if (startDate !== null && startDate !== undefined) {
            queryParameters['startDate'] = startDate.toISOString();
        }
        if (endDate !== null && endDate !== undefined) {
            queryParameters['endDate'] = endDate.toISOString();
        }
        if (id !== null && id !== undefined) {
            queryParameters['id'] = <string><any>id;
        }
        if (user !== null && user !== undefined) {
            queryParameters['user'] = <string><any>user;
        }

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'text/plain', 
            'application/json', 
            'text/json'
        ];


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body: Array<models.DexDepositDTO>;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: Array<models.DexDepositDTO>, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

    /**
     * Gets orders.
     * @summary Orders (historical) 🔥
     * @param startBlock 
     * @param endBlock 
     * @param startDate 
     * @param endDate 
     * @param id 
     * @param buyToken 
     * @param sellToken 
     */
    public dexGetOrdersHistorical(startBlock?: number, endBlock?: number, startDate?: string, endDate?: string, id?: string, buyToken?: string, sellToken?: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body: Array<models.DexOrderDTO>;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/dapps/dex/orders/historical';

        let queryParameters: any = {};
        let headerParams: any = {};
        if (startBlock !== null && startBlock !== undefined) {
            queryParameters['startBlock'] = <string><any>startBlock;
        }
        if (endBlock !== null && endBlock !== undefined) {
            queryParameters['endBlock'] = <string><any>endBlock;
        }
        if (startDate !== null && startDate !== undefined) {
            queryParameters['startDate'] = startDate.toISOString();
        }
        if (endDate !== null && endDate !== undefined) {
            queryParameters['endDate'] = endDate.toISOString();
        }
        if (id !== null && id !== undefined) {
            queryParameters['id'] = <string><any>id;
        }
        if (buyToken !== null && buyToken !== undefined) {
            queryParameters['buy_token'] = <string><any>buyToken;
        }
        if (sellToken !== null && sellToken !== undefined) {
            queryParameters['sell_token'] = <string><any>sellToken;
        }

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'text/plain', 
            'application/json', 
            'text/json'
        ];


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body: Array<models.DexOrderDTO>;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: Array<models.DexOrderDTO>, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

    /**
     * Gets prices.
     * @summary Prices (historical) 🔥
     * @param startBlock 
     * @param endBlock 
     * @param startDate 
     * @param endDate 
     * @param id 
     */
    public dexGetPricesHistorical(startBlock?: number, endBlock?: number, startDate?: string, endDate?: string, id?: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body: Array<models.DexPriceDTO>;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/dapps/dex/prices/historical';

        let queryParameters: any = {};
        let headerParams: any = {};
        if (startBlock !== null && startBlock !== undefined) {
            queryParameters['startBlock'] = <string><any>startBlock;
        }
        if (endBlock !== null && endBlock !== undefined) {
            queryParameters['endBlock'] = <string><any>endBlock;
        }
        if (startDate !== null && startDate !== undefined) {
            queryParameters['startDate'] = startDate.toISOString();
        }
        if (endDate !== null && endDate !== undefined) {
            queryParameters['endDate'] = endDate.toISOString();
        }
        if (id !== null && id !== undefined) {
            queryParameters['id'] = <string><any>id;
        }

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'text/plain', 
            'application/json', 
            'text/json'
        ];


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body: Array<models.DexPriceDTO>;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: Array<models.DexPriceDTO>, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

    /**
     * Gets solutions.
     * @summary Solutions (historical) 🔥
     * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
     * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
     * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
     * @param endDate The end date of timeframe.
     * @param id 
     */
    public dexGetSolutionsHistorical(startBlock?: number, endBlock?: number, startDate?: string, endDate?: string, id?: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body: Array<models.DexSolutionDTO>;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/dapps/dex/solutions/historical';

        let queryParameters: any = {};
        let headerParams: any = {};
        if (startBlock !== null && startBlock !== undefined) {
            queryParameters['startBlock'] = <string><any>startBlock;
        }
        if (endBlock !== null && endBlock !== undefined) {
            queryParameters['endBlock'] = <string><any>endBlock;
        }
        if (startDate !== null && startDate !== undefined) {
            queryParameters['startDate'] = startDate.toISOString();
        }
        if (endDate !== null && endDate !== undefined) {
            queryParameters['endDate'] = endDate.toISOString();
        }
        if (id !== null && id !== undefined) {
            queryParameters['id'] = <string><any>id;
        }

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'text/plain', 
            'application/json', 
            'text/json'
        ];


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body: Array<models.DexSolutionDTO>;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: Array<models.DexSolutionDTO>, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

    /**
     * Gets statss.
     * @summary Statss (historical) 🔥
     * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
     * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
     * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
     * @param endDate The end date of timeframe.
     * @param id 
     */
    public dexGetStatssHistorical(startBlock?: number, endBlock?: number, startDate?: string, endDate?: string, id?: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body: Array<models.DexStatsDTO>;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/dapps/dex/statss/historical';

        let queryParameters: any = {};
        let headerParams: any = {};
        if (startBlock !== null && startBlock !== undefined) {
            queryParameters['startBlock'] = <string><any>startBlock;
        }
        if (endBlock !== null && endBlock !== undefined) {
            queryParameters['endBlock'] = <string><any>endBlock;
        }
        if (startDate !== null && startDate !== undefined) {
            queryParameters['startDate'] = startDate.toISOString();
        }
        if (endDate !== null && endDate !== undefined) {
            queryParameters['endDate'] = endDate.toISOString();
        }
        if (id !== null && id !== undefined) {
            queryParameters['id'] = <string><any>id;
        }

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'text/plain', 
            'application/json', 
            'text/json'
        ];


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body: Array<models.DexStatsDTO>;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: Array<models.DexStatsDTO>, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

    /**
     * Gets tokens.
     * @summary Tokens (historical) 🔥
     * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
     * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
     * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
     * @param endDate The end date of timeframe.
     * @param id 
     * @param address 
     * @param symbol 
     * @param name 
     */
    public dexGetTokensHistorical(startBlock?: number, endBlock?: number, startDate?: string, endDate?: string, id?: string, address?: string, symbol?: string, name?: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body: Array<models.DexTokenDTO>;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/dapps/dex/tokens/historical';

        let queryParameters: any = {};
        let headerParams: any = {};
        if (startBlock !== null && startBlock !== undefined) {
            queryParameters['startBlock'] = <string><any>startBlock;
        }
        if (endBlock !== null && endBlock !== undefined) {
            queryParameters['endBlock'] = <string><any>endBlock;
        }
        if (startDate !== null && startDate !== undefined) {
            queryParameters['startDate'] = startDate.toISOString();
        }
        if (endDate !== null && endDate !== undefined) {
            queryParameters['endDate'] = endDate.toISOString();
        }
        if (id !== null && id !== undefined) {
            queryParameters['id'] = <string><any>id;
        }
        if (address !== null && address !== undefined) {
            queryParameters['address'] = <string><any>address;
        }
        if (symbol !== null && symbol !== undefined) {
            queryParameters['symbol'] = <string><any>symbol;
        }
        if (name !== null && name !== undefined) {
            queryParameters['name'] = <string><any>name;
        }

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'text/plain', 
            'application/json', 
            'text/json'
        ];


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body: Array<models.DexTokenDTO>;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: Array<models.DexTokenDTO>, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

    /**
     * Gets trades.
     * @summary Trades (historical) 🔥
     * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
     * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
     * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
     * @param endDate The end date of timeframe.
     * @param id 
     * @param buyToken 
     * @param sellToken 
     */
    public dexGetTradesHistorical(startBlock?: number, endBlock?: number, startDate?: string, endDate?: string, id?: string, buyToken?: string, sellToken?: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body: Array<models.DexTradeDTO>;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/dapps/dex/trades/historical';

        let queryParameters: any = {};
        let headerParams: any = {};
        if (startBlock !== null && startBlock !== undefined) {
            queryParameters['startBlock'] = <string><any>startBlock;
        }
        if (endBlock !== null && endBlock !== undefined) {
            queryParameters['endBlock'] = <string><any>endBlock;
        }
        if (startDate !== null && startDate !== undefined) {
            queryParameters['startDate'] = startDate.toISOString();
        }
        if (endDate !== null && endDate !== undefined) {
            queryParameters['endDate'] = endDate.toISOString();
        }
        if (id !== null && id !== undefined) {
            queryParameters['id'] = <string><any>id;
        }
        if (buyToken !== null && buyToken !== undefined) {
            queryParameters['buy_token'] = <string><any>buyToken;
        }
        if (sellToken !== null && sellToken !== undefined) {
            queryParameters['sell_token'] = <string><any>sellToken;
        }

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'text/plain', 
            'application/json', 
            'text/json'
        ];


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body: Array<models.DexTradeDTO>;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: Array<models.DexTradeDTO>, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

    /**
     * Gets users.
     * @summary Users (historical) 🔥
     * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
     * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
     * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
     * @param endDate The end date of timeframe.
     * @param id 
     */
    public dexGetUsersHistorical(startBlock?: number, endBlock?: number, startDate?: string, endDate?: string, id?: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body: Array<models.DexUserDTO>;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/dapps/dex/users/historical';

        let queryParameters: any = {};
        let headerParams: any = {};
        if (startBlock !== null && startBlock !== undefined) {
            queryParameters['startBlock'] = <string><any>startBlock;
        }
        if (endBlock !== null && endBlock !== undefined) {
            queryParameters['endBlock'] = <string><any>endBlock;
        }
        if (startDate !== null && startDate !== undefined) {
            queryParameters['startDate'] = startDate.toISOString();
        }
        if (endDate !== null && endDate !== undefined) {
            queryParameters['endDate'] = endDate.toISOString();
        }
        if (id !== null && id !== undefined) {
            queryParameters['id'] = <string><any>id;
        }

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'text/plain', 
            'application/json', 
            'text/json'
        ];


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body: Array<models.DexUserDTO>;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: Array<models.DexUserDTO>, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

    /**
     * Gets withdrawrequests.
     * @summary WithdrawRequests (historical) 🔥
     * @param startBlock 
     * @param endBlock 
     * @param startDate 
     * @param endDate 
     * @param id 
     * @param user 
     */
    public dexGetWithdrawRequestsHistorical(startBlock?: number, endBlock?: number, startDate?: string, endDate?: string, id?: string, user?: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body: Array<models.DexWithdrawRequestDTO>;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/dapps/dex/withdrawrequests/historical';

        let queryParameters: any = {};
        let headerParams: any = {};
        if (startBlock !== null && startBlock !== undefined) {
            queryParameters['startBlock'] = <string><any>startBlock;
        }
        if (endBlock !== null && endBlock !== undefined) {
            queryParameters['endBlock'] = <string><any>endBlock;
        }
        if (startDate !== null && startDate !== undefined) {
            queryParameters['startDate'] = startDate.toISOString();
        }
        if (endDate !== null && endDate !== undefined) {
            queryParameters['endDate'] = endDate.toISOString();
        }
        if (id !== null && id !== undefined) {
            queryParameters['id'] = <string><any>id;
        }
        if (user !== null && user !== undefined) {
            queryParameters['user'] = <string><any>user;
        }

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'text/plain', 
            'application/json', 
            'text/json'
        ];


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body: Array<models.DexWithdrawRequestDTO>;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: Array<models.DexWithdrawRequestDTO>, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

    /**
     * Gets withdraws.
     * @summary Withdraws (historical) 🔥
     * @param startBlock 
     * @param endBlock 
     * @param startDate 
     * @param endDate 
     * @param id 
     * @param user 
     */
    public dexGetWithdrawsHistorical(startBlock?: number, endBlock?: number, startDate?: string, endDate?: string, id?: string, user?: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body: Array<models.DexWithdrawDTO>;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/dapps/dex/withdraws/historical';

        let queryParameters: any = {};
        let headerParams: any = {};
        if (startBlock !== null && startBlock !== undefined) {
            queryParameters['startBlock'] = <string><any>startBlock;
        }
        if (endBlock !== null && endBlock !== undefined) {
            queryParameters['endBlock'] = <string><any>endBlock;
        }
        if (startDate !== null && startDate !== undefined) {
            queryParameters['startDate'] = startDate.toISOString();
        }
        if (endDate !== null && endDate !== undefined) {
            queryParameters['endDate'] = endDate.toISOString();
        }
        if (id !== null && id !== undefined) {
            queryParameters['id'] = <string><any>id;
        }
        if (user !== null && user !== undefined) {
            queryParameters['user'] = <string><any>user;
        }

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'text/plain', 
            'application/json', 
            'text/json'
        ];


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body: Array<models.DexWithdrawDTO>;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: Array<models.DexWithdrawDTO>, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

}
