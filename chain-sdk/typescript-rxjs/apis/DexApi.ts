// tslint:disable
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

import type { Observable } from 'rxjs';
import type { AjaxResponse } from 'rxjs/ajax';
import { BaseAPI } from '../runtime';
import type { OperationOpts, HttpQuery } from '../runtime';
import type {
    DexBatchDTO,
    DexDepositDTO,
    DexOrderDTO,
    DexPriceDTO,
    DexSolutionDTO,
    DexStatsDTO,
    DexTokenDTO,
    DexTradeDTO,
    DexUserDTO,
    DexWithdrawDTO,
    DexWithdrawRequestDTO,
} from '../models';

export interface DexGetBatchesHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
}

export interface DexGetDepositsHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
    user?: string;
}

export interface DexGetOrdersHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
    buyToken?: string;
    sellToken?: string;
}

export interface DexGetPricesHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
}

export interface DexGetSolutionsHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
}

export interface DexGetStatsHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
}

export interface DexGetTokensHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
    address?: string;
    symbol?: string;
    name?: string;
}

export interface DexGetTradesHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
    buyToken?: string;
    sellToken?: string;
}

export interface DexGetUsersHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
}

export interface DexGetWithdrawRequestsHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
    user?: string;
}

export interface DexGetWithdrawsHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
    user?: string;
}

/**
 * no description
 */
export class DexApi extends BaseAPI {

    /**
     * Gets batches.
     * Batches (current)
     */
    dexBatchesCurrent(): Observable<Array<DexBatchDTO>>
    dexBatchesCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<DexBatchDTO>>>
    dexBatchesCurrent(opts?: OperationOpts): Observable<Array<DexBatchDTO> | AjaxResponse<Array<DexBatchDTO>>> {
        return this.request<Array<DexBatchDTO>>({
            url: '/dapps/dex/batches/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets deposits.
     * Deposits (current)
     */
    dexDepositsCurrent(): Observable<Array<DexDepositDTO>>
    dexDepositsCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<DexDepositDTO>>>
    dexDepositsCurrent(opts?: OperationOpts): Observable<Array<DexDepositDTO> | AjaxResponse<Array<DexDepositDTO>>> {
        return this.request<Array<DexDepositDTO>>({
            url: '/dapps/dex/deposits/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets batches.
     * Batches (historical)
     */
    dexGetBatchesHistorical({ startBlock, endBlock, startDate, endDate, id }: DexGetBatchesHistoricalRequest): Observable<Array<DexBatchDTO>>
    dexGetBatchesHistorical({ startBlock, endBlock, startDate, endDate, id }: DexGetBatchesHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<DexBatchDTO>>>
    dexGetBatchesHistorical({ startBlock, endBlock, startDate, endDate, id }: DexGetBatchesHistoricalRequest, opts?: OperationOpts): Observable<Array<DexBatchDTO> | AjaxResponse<Array<DexBatchDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }

        return this.request<Array<DexBatchDTO>>({
            url: '/dapps/dex/batches/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets deposits.
     * Deposits (historical)
     */
    dexGetDepositsHistorical({ startBlock, endBlock, startDate, endDate, id, user }: DexGetDepositsHistoricalRequest): Observable<Array<DexDepositDTO>>
    dexGetDepositsHistorical({ startBlock, endBlock, startDate, endDate, id, user }: DexGetDepositsHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<DexDepositDTO>>>
    dexGetDepositsHistorical({ startBlock, endBlock, startDate, endDate, id, user }: DexGetDepositsHistoricalRequest, opts?: OperationOpts): Observable<Array<DexDepositDTO> | AjaxResponse<Array<DexDepositDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }
        if (user != null) { query['user'] = user; }

        return this.request<Array<DexDepositDTO>>({
            url: '/dapps/dex/deposits/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets orders.
     * Orders (historical)
     */
    dexGetOrdersHistorical({ startBlock, endBlock, startDate, endDate, id, buyToken, sellToken }: DexGetOrdersHistoricalRequest): Observable<Array<DexOrderDTO>>
    dexGetOrdersHistorical({ startBlock, endBlock, startDate, endDate, id, buyToken, sellToken }: DexGetOrdersHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<DexOrderDTO>>>
    dexGetOrdersHistorical({ startBlock, endBlock, startDate, endDate, id, buyToken, sellToken }: DexGetOrdersHistoricalRequest, opts?: OperationOpts): Observable<Array<DexOrderDTO> | AjaxResponse<Array<DexOrderDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }
        if (buyToken != null) { query['buy_token'] = buyToken; }
        if (sellToken != null) { query['sell_token'] = sellToken; }

        return this.request<Array<DexOrderDTO>>({
            url: '/dapps/dex/orders/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets prices.
     * Prices (historical)
     */
    dexGetPricesHistorical({ startBlock, endBlock, startDate, endDate, id }: DexGetPricesHistoricalRequest): Observable<Array<DexPriceDTO>>
    dexGetPricesHistorical({ startBlock, endBlock, startDate, endDate, id }: DexGetPricesHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<DexPriceDTO>>>
    dexGetPricesHistorical({ startBlock, endBlock, startDate, endDate, id }: DexGetPricesHistoricalRequest, opts?: OperationOpts): Observable<Array<DexPriceDTO> | AjaxResponse<Array<DexPriceDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }

        return this.request<Array<DexPriceDTO>>({
            url: '/dapps/dex/prices/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets solutions.
     * Solutions (historical)
     */
    dexGetSolutionsHistorical({ startBlock, endBlock, startDate, endDate, id }: DexGetSolutionsHistoricalRequest): Observable<Array<DexSolutionDTO>>
    dexGetSolutionsHistorical({ startBlock, endBlock, startDate, endDate, id }: DexGetSolutionsHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<DexSolutionDTO>>>
    dexGetSolutionsHistorical({ startBlock, endBlock, startDate, endDate, id }: DexGetSolutionsHistoricalRequest, opts?: OperationOpts): Observable<Array<DexSolutionDTO> | AjaxResponse<Array<DexSolutionDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }

        return this.request<Array<DexSolutionDTO>>({
            url: '/dapps/dex/solutions/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets stats.
     * Stats (historical)
     */
    dexGetStatsHistorical({ startBlock, endBlock, startDate, endDate, id }: DexGetStatsHistoricalRequest): Observable<Array<DexStatsDTO>>
    dexGetStatsHistorical({ startBlock, endBlock, startDate, endDate, id }: DexGetStatsHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<DexStatsDTO>>>
    dexGetStatsHistorical({ startBlock, endBlock, startDate, endDate, id }: DexGetStatsHistoricalRequest, opts?: OperationOpts): Observable<Array<DexStatsDTO> | AjaxResponse<Array<DexStatsDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }

        return this.request<Array<DexStatsDTO>>({
            url: '/dapps/dex/stats/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets tokens.
     * Tokens (historical)
     */
    dexGetTokensHistorical({ startBlock, endBlock, startDate, endDate, id, address, symbol, name }: DexGetTokensHistoricalRequest): Observable<Array<DexTokenDTO>>
    dexGetTokensHistorical({ startBlock, endBlock, startDate, endDate, id, address, symbol, name }: DexGetTokensHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<DexTokenDTO>>>
    dexGetTokensHistorical({ startBlock, endBlock, startDate, endDate, id, address, symbol, name }: DexGetTokensHistoricalRequest, opts?: OperationOpts): Observable<Array<DexTokenDTO> | AjaxResponse<Array<DexTokenDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }
        if (address != null) { query['address'] = address; }
        if (symbol != null) { query['symbol'] = symbol; }
        if (name != null) { query['name'] = name; }

        return this.request<Array<DexTokenDTO>>({
            url: '/dapps/dex/tokens/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets trades.
     * Trades (historical)
     */
    dexGetTradesHistorical({ startBlock, endBlock, startDate, endDate, id, buyToken, sellToken }: DexGetTradesHistoricalRequest): Observable<Array<DexTradeDTO>>
    dexGetTradesHistorical({ startBlock, endBlock, startDate, endDate, id, buyToken, sellToken }: DexGetTradesHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<DexTradeDTO>>>
    dexGetTradesHistorical({ startBlock, endBlock, startDate, endDate, id, buyToken, sellToken }: DexGetTradesHistoricalRequest, opts?: OperationOpts): Observable<Array<DexTradeDTO> | AjaxResponse<Array<DexTradeDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }
        if (buyToken != null) { query['buy_token'] = buyToken; }
        if (sellToken != null) { query['sell_token'] = sellToken; }

        return this.request<Array<DexTradeDTO>>({
            url: '/dapps/dex/trades/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets users.
     * Users (historical)
     */
    dexGetUsersHistorical({ startBlock, endBlock, startDate, endDate, id }: DexGetUsersHistoricalRequest): Observable<Array<DexUserDTO>>
    dexGetUsersHistorical({ startBlock, endBlock, startDate, endDate, id }: DexGetUsersHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<DexUserDTO>>>
    dexGetUsersHistorical({ startBlock, endBlock, startDate, endDate, id }: DexGetUsersHistoricalRequest, opts?: OperationOpts): Observable<Array<DexUserDTO> | AjaxResponse<Array<DexUserDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }

        return this.request<Array<DexUserDTO>>({
            url: '/dapps/dex/users/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets withdrawRequests.
     * WithdrawRequests (historical)
     */
    dexGetWithdrawRequestsHistorical({ startBlock, endBlock, startDate, endDate, id, user }: DexGetWithdrawRequestsHistoricalRequest): Observable<Array<DexWithdrawRequestDTO>>
    dexGetWithdrawRequestsHistorical({ startBlock, endBlock, startDate, endDate, id, user }: DexGetWithdrawRequestsHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<DexWithdrawRequestDTO>>>
    dexGetWithdrawRequestsHistorical({ startBlock, endBlock, startDate, endDate, id, user }: DexGetWithdrawRequestsHistoricalRequest, opts?: OperationOpts): Observable<Array<DexWithdrawRequestDTO> | AjaxResponse<Array<DexWithdrawRequestDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }
        if (user != null) { query['user'] = user; }

        return this.request<Array<DexWithdrawRequestDTO>>({
            url: '/dapps/dex/withdrawRequests/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets withdraws.
     * Withdraws (historical)
     */
    dexGetWithdrawsHistorical({ startBlock, endBlock, startDate, endDate, id, user }: DexGetWithdrawsHistoricalRequest): Observable<Array<DexWithdrawDTO>>
    dexGetWithdrawsHistorical({ startBlock, endBlock, startDate, endDate, id, user }: DexGetWithdrawsHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<DexWithdrawDTO>>>
    dexGetWithdrawsHistorical({ startBlock, endBlock, startDate, endDate, id, user }: DexGetWithdrawsHistoricalRequest, opts?: OperationOpts): Observable<Array<DexWithdrawDTO> | AjaxResponse<Array<DexWithdrawDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }
        if (user != null) { query['user'] = user; }

        return this.request<Array<DexWithdrawDTO>>({
            url: '/dapps/dex/withdraws/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets orders.
     * Orders (current)
     */
    dexOrdersCurrent(): Observable<Array<DexOrderDTO>>
    dexOrdersCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<DexOrderDTO>>>
    dexOrdersCurrent(opts?: OperationOpts): Observable<Array<DexOrderDTO> | AjaxResponse<Array<DexOrderDTO>>> {
        return this.request<Array<DexOrderDTO>>({
            url: '/dapps/dex/orders/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets prices.
     * Prices (current)
     */
    dexPricesCurrent(): Observable<Array<DexPriceDTO>>
    dexPricesCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<DexPriceDTO>>>
    dexPricesCurrent(opts?: OperationOpts): Observable<Array<DexPriceDTO> | AjaxResponse<Array<DexPriceDTO>>> {
        return this.request<Array<DexPriceDTO>>({
            url: '/dapps/dex/prices/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets solutions.
     * Solutions (current)
     */
    dexSolutionsCurrent(): Observable<Array<DexSolutionDTO>>
    dexSolutionsCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<DexSolutionDTO>>>
    dexSolutionsCurrent(opts?: OperationOpts): Observable<Array<DexSolutionDTO> | AjaxResponse<Array<DexSolutionDTO>>> {
        return this.request<Array<DexSolutionDTO>>({
            url: '/dapps/dex/solutions/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets stats.
     * Stats (current)
     */
    dexStatsCurrent(): Observable<Array<DexStatsDTO>>
    dexStatsCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<DexStatsDTO>>>
    dexStatsCurrent(opts?: OperationOpts): Observable<Array<DexStatsDTO> | AjaxResponse<Array<DexStatsDTO>>> {
        return this.request<Array<DexStatsDTO>>({
            url: '/dapps/dex/stats/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets tokens.
     * Tokens (current)
     */
    dexTokensCurrent(): Observable<Array<DexTokenDTO>>
    dexTokensCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<DexTokenDTO>>>
    dexTokensCurrent(opts?: OperationOpts): Observable<Array<DexTokenDTO> | AjaxResponse<Array<DexTokenDTO>>> {
        return this.request<Array<DexTokenDTO>>({
            url: '/dapps/dex/tokens/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets trades.
     * Trades (current)
     */
    dexTradesCurrent(): Observable<Array<DexTradeDTO>>
    dexTradesCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<DexTradeDTO>>>
    dexTradesCurrent(opts?: OperationOpts): Observable<Array<DexTradeDTO> | AjaxResponse<Array<DexTradeDTO>>> {
        return this.request<Array<DexTradeDTO>>({
            url: '/dapps/dex/trades/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets users.
     * Users (current)
     */
    dexUsersCurrent(): Observable<Array<DexUserDTO>>
    dexUsersCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<DexUserDTO>>>
    dexUsersCurrent(opts?: OperationOpts): Observable<Array<DexUserDTO> | AjaxResponse<Array<DexUserDTO>>> {
        return this.request<Array<DexUserDTO>>({
            url: '/dapps/dex/users/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets withdrawRequests.
     * WithdrawRequests (current)
     */
    dexWithdrawRequestsCurrent(): Observable<Array<DexWithdrawRequestDTO>>
    dexWithdrawRequestsCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<DexWithdrawRequestDTO>>>
    dexWithdrawRequestsCurrent(opts?: OperationOpts): Observable<Array<DexWithdrawRequestDTO> | AjaxResponse<Array<DexWithdrawRequestDTO>>> {
        return this.request<Array<DexWithdrawRequestDTO>>({
            url: '/dapps/dex/withdrawRequests/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets withdraws.
     * Withdraws (current)
     */
    dexWithdrawsCurrent(): Observable<Array<DexWithdrawDTO>>
    dexWithdrawsCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<DexWithdrawDTO>>>
    dexWithdrawsCurrent(opts?: OperationOpts): Observable<Array<DexWithdrawDTO> | AjaxResponse<Array<DexWithdrawDTO>>> {
        return this.request<Array<DexWithdrawDTO>>({
            url: '/dapps/dex/withdraws/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

}
