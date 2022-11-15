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
    CowOrderDTO,
    CowSettlementDTO,
    CowTokenDTO,
    CowTradeDTO,
    CowUserDTO,
} from '../models';

export interface CowGetOrdersHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
}

export interface CowGetSettlementsHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
}

export interface CowGetTokensHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    tokenId?: string;
}

export interface CowGetTradesHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
}

export interface CowGetUsersHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
}

/**
 * no description
 */
export class CowApi extends BaseAPI {

    /**
     * Gets orders.
     * Orders (historical)
     */
    cowGetOrdersHistorical({ startBlock, endBlock, startDate, endDate }: CowGetOrdersHistoricalRequest): Observable<Array<CowOrderDTO>>
    cowGetOrdersHistorical({ startBlock, endBlock, startDate, endDate }: CowGetOrdersHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<CowOrderDTO>>>
    cowGetOrdersHistorical({ startBlock, endBlock, startDate, endDate }: CowGetOrdersHistoricalRequest, opts?: OperationOpts): Observable<Array<CowOrderDTO> | AjaxResponse<Array<CowOrderDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }

        return this.request<Array<CowOrderDTO>>({
            url: '/dapps/cow/orders/historical-manual',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets settlements.
     * Settlements (historical)
     */
    cowGetSettlementsHistorical({ startBlock, endBlock, startDate, endDate }: CowGetSettlementsHistoricalRequest): Observable<Array<CowSettlementDTO>>
    cowGetSettlementsHistorical({ startBlock, endBlock, startDate, endDate }: CowGetSettlementsHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<CowSettlementDTO>>>
    cowGetSettlementsHistorical({ startBlock, endBlock, startDate, endDate }: CowGetSettlementsHistoricalRequest, opts?: OperationOpts): Observable<Array<CowSettlementDTO> | AjaxResponse<Array<CowSettlementDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }

        return this.request<Array<CowSettlementDTO>>({
            url: '/dapps/cow/settlements/historical-manual',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets tokens.
     * Tokens (historical) 🔥
     */
    cowGetTokensHistorical({ startBlock, endBlock, startDate, endDate, tokenId }: CowGetTokensHistoricalRequest): Observable<Array<CowTokenDTO>>
    cowGetTokensHistorical({ startBlock, endBlock, startDate, endDate, tokenId }: CowGetTokensHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<CowTokenDTO>>>
    cowGetTokensHistorical({ startBlock, endBlock, startDate, endDate, tokenId }: CowGetTokensHistoricalRequest, opts?: OperationOpts): Observable<Array<CowTokenDTO> | AjaxResponse<Array<CowTokenDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (tokenId != null) { query['tokenId'] = tokenId; }

        return this.request<Array<CowTokenDTO>>({
            url: '/dapps/cow/tokens/historical-manual',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets trades.
     * Trades (historical) 🔥
     */
    cowGetTradesHistorical({ startBlock, endBlock, startDate, endDate }: CowGetTradesHistoricalRequest): Observable<Array<CowTradeDTO>>
    cowGetTradesHistorical({ startBlock, endBlock, startDate, endDate }: CowGetTradesHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<CowTradeDTO>>>
    cowGetTradesHistorical({ startBlock, endBlock, startDate, endDate }: CowGetTradesHistoricalRequest, opts?: OperationOpts): Observable<Array<CowTradeDTO> | AjaxResponse<Array<CowTradeDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }

        return this.request<Array<CowTradeDTO>>({
            url: '/dapps/cow/trades/historical-manual',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets users.
     * Users (historical)
     */
    cowGetUsersHistorical({ startBlock, endBlock, startDate, endDate }: CowGetUsersHistoricalRequest): Observable<Array<CowUserDTO>>
    cowGetUsersHistorical({ startBlock, endBlock, startDate, endDate }: CowGetUsersHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<CowUserDTO>>>
    cowGetUsersHistorical({ startBlock, endBlock, startDate, endDate }: CowGetUsersHistoricalRequest, opts?: OperationOpts): Observable<Array<CowUserDTO> | AjaxResponse<Array<CowUserDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }

        return this.request<Array<CowUserDTO>>({
            url: '/dapps/cow/users/historical-manual',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

}
