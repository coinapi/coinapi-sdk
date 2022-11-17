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
    CurveExchangeDTO,
    DexTradeDTO,
    SushiswapBundleDTO,
    SushiswapBurnDTO,
    SushiswapDayDataDTO,
    SushiswapFactoryDTO,
    SushiswapHourDataDTO,
    SushiswapLiquidityPositionDTO,
    SushiswapLiquidityPositionSnapshotDTO,
    SushiswapMintDTO,
    SushiswapPairDTO,
    SushiswapPairDayDataDTO,
    SushiswapPairHourDataDTO,
    SushiswapSwapDTO,
    SushiswapTokenDTO,
    SushiswapTokenDayDataDTO,
    SushiswapTransactionDTO,
    SushiswapUserDTO,
} from '../models';

export interface SushiswapGetBundlesHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
}

export interface SushiswapGetBurnsHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
    pair?: string;
}

export interface SushiswapGetDayDatasHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
}

export interface SushiswapGetFactorysHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
}

export interface SushiswapGetHourDatasHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
}

export interface SushiswapGetLiquidityPositionSnapshotsHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
    user?: string;
    pair?: string;
}

export interface SushiswapGetLiquidityPositionsHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
    user?: string;
    pair?: string;
}

export interface SushiswapGetMintsHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
    pair?: string;
}

export interface SushiswapGetPairDayDatasHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
    pair?: string;
    token0?: string;
    token1?: string;
}

export interface SushiswapGetPairHourDatasHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
    pair?: string;
}

export interface SushiswapGetPairsHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
    name?: string;
    token0?: string;
    token1?: string;
}

export interface SushiswapGetSwapsHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
    pair?: string;
}

export interface SushiswapGetTokenDayDatasHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
}

export interface SushiswapGetTokensHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
    symbol?: string;
    name?: string;
}

export interface SushiswapGetTransactionsHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
}

export interface SushiswapGetUsersHistoricalRequest {
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    id?: string;
}

export interface SushiswapPairsCurrentRequest {
    id?: string;
}

export interface SushiswapSwapsCurrentRequest {
    pair?: string;
}

/**
 * no description
 */
export class SushiswapApi extends BaseAPI {

    /**
     * Gets exchanges.
     * Exchanges (current) 🔥
     */
    curveGetExchangesCurrent(): Observable<Array<CurveExchangeDTO>>
    curveGetExchangesCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<CurveExchangeDTO>>>
    curveGetExchangesCurrent(opts?: OperationOpts): Observable<Array<CurveExchangeDTO> | AjaxResponse<Array<CurveExchangeDTO>>> {
        return this.request<Array<CurveExchangeDTO>>({
            url: '/dapps/sushiswap/exchanges/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets trades.
     * Trades (current) 🔥
     */
    dexGetTradesCurrent(): Observable<Array<DexTradeDTO>>
    dexGetTradesCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<DexTradeDTO>>>
    dexGetTradesCurrent(opts?: OperationOpts): Observable<Array<DexTradeDTO> | AjaxResponse<Array<DexTradeDTO>>> {
        return this.request<Array<DexTradeDTO>>({
            url: '/dapps/sushiswap/trades/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets bundles.
     * Bundles (current)
     */
    sushiswapBundlesCurrent(): Observable<Array<SushiswapBundleDTO>>
    sushiswapBundlesCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapBundleDTO>>>
    sushiswapBundlesCurrent(opts?: OperationOpts): Observable<Array<SushiswapBundleDTO> | AjaxResponse<Array<SushiswapBundleDTO>>> {
        return this.request<Array<SushiswapBundleDTO>>({
            url: '/dapps/sushiswap/bundles/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets burns.
     * Burns (current)
     */
    sushiswapBurnsCurrent(): Observable<Array<SushiswapBurnDTO>>
    sushiswapBurnsCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapBurnDTO>>>
    sushiswapBurnsCurrent(opts?: OperationOpts): Observable<Array<SushiswapBurnDTO> | AjaxResponse<Array<SushiswapBurnDTO>>> {
        return this.request<Array<SushiswapBurnDTO>>({
            url: '/dapps/sushiswap/burns/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets dayDatas.
     * DayDatas (current)
     */
    sushiswapDayDatasCurrent(): Observable<Array<SushiswapDayDataDTO>>
    sushiswapDayDatasCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapDayDataDTO>>>
    sushiswapDayDatasCurrent(opts?: OperationOpts): Observable<Array<SushiswapDayDataDTO> | AjaxResponse<Array<SushiswapDayDataDTO>>> {
        return this.request<Array<SushiswapDayDataDTO>>({
            url: '/dapps/sushiswap/dayDatas/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets factorys.
     * Factorys (current)
     */
    sushiswapFactorysCurrent(): Observable<Array<SushiswapFactoryDTO>>
    sushiswapFactorysCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapFactoryDTO>>>
    sushiswapFactorysCurrent(opts?: OperationOpts): Observable<Array<SushiswapFactoryDTO> | AjaxResponse<Array<SushiswapFactoryDTO>>> {
        return this.request<Array<SushiswapFactoryDTO>>({
            url: '/dapps/sushiswap/factorys/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets bundles.
     * Bundles (historical) 🔥
     */
    sushiswapGetBundlesHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetBundlesHistoricalRequest): Observable<Array<SushiswapBundleDTO>>
    sushiswapGetBundlesHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetBundlesHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapBundleDTO>>>
    sushiswapGetBundlesHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetBundlesHistoricalRequest, opts?: OperationOpts): Observable<Array<SushiswapBundleDTO> | AjaxResponse<Array<SushiswapBundleDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }

        return this.request<Array<SushiswapBundleDTO>>({
            url: '/dapps/sushiswap/bundles/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets burns.
     * Burns (historical) 🔥
     */
    sushiswapGetBurnsHistorical({ startBlock, endBlock, startDate, endDate, id, pair }: SushiswapGetBurnsHistoricalRequest): Observable<Array<SushiswapBurnDTO>>
    sushiswapGetBurnsHistorical({ startBlock, endBlock, startDate, endDate, id, pair }: SushiswapGetBurnsHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapBurnDTO>>>
    sushiswapGetBurnsHistorical({ startBlock, endBlock, startDate, endDate, id, pair }: SushiswapGetBurnsHistoricalRequest, opts?: OperationOpts): Observable<Array<SushiswapBurnDTO> | AjaxResponse<Array<SushiswapBurnDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }
        if (pair != null) { query['pair'] = pair; }

        return this.request<Array<SushiswapBurnDTO>>({
            url: '/dapps/sushiswap/burns/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets dayDatas.
     * DayDatas (historical) 🔥
     */
    sushiswapGetDayDatasHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetDayDatasHistoricalRequest): Observable<Array<SushiswapDayDataDTO>>
    sushiswapGetDayDatasHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetDayDatasHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapDayDataDTO>>>
    sushiswapGetDayDatasHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetDayDatasHistoricalRequest, opts?: OperationOpts): Observable<Array<SushiswapDayDataDTO> | AjaxResponse<Array<SushiswapDayDataDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }

        return this.request<Array<SushiswapDayDataDTO>>({
            url: '/dapps/sushiswap/dayDatas/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets factorys.
     * Factorys (historical) 🔥
     */
    sushiswapGetFactorysHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetFactorysHistoricalRequest): Observable<Array<SushiswapFactoryDTO>>
    sushiswapGetFactorysHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetFactorysHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapFactoryDTO>>>
    sushiswapGetFactorysHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetFactorysHistoricalRequest, opts?: OperationOpts): Observable<Array<SushiswapFactoryDTO> | AjaxResponse<Array<SushiswapFactoryDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }

        return this.request<Array<SushiswapFactoryDTO>>({
            url: '/dapps/sushiswap/factorys/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets hourDatas.
     * HourDatas (historical) 🔥
     */
    sushiswapGetHourDatasHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetHourDatasHistoricalRequest): Observable<Array<SushiswapHourDataDTO>>
    sushiswapGetHourDatasHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetHourDatasHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapHourDataDTO>>>
    sushiswapGetHourDatasHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetHourDatasHistoricalRequest, opts?: OperationOpts): Observable<Array<SushiswapHourDataDTO> | AjaxResponse<Array<SushiswapHourDataDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }

        return this.request<Array<SushiswapHourDataDTO>>({
            url: '/dapps/sushiswap/hourDatas/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets liquidityPositionSnapshots.
     * LiquidityPositionSnapshots (historical) 🔥
     */
    sushiswapGetLiquidityPositionSnapshotsHistorical({ startBlock, endBlock, startDate, endDate, id, user, pair }: SushiswapGetLiquidityPositionSnapshotsHistoricalRequest): Observable<Array<SushiswapLiquidityPositionSnapshotDTO>>
    sushiswapGetLiquidityPositionSnapshotsHistorical({ startBlock, endBlock, startDate, endDate, id, user, pair }: SushiswapGetLiquidityPositionSnapshotsHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapLiquidityPositionSnapshotDTO>>>
    sushiswapGetLiquidityPositionSnapshotsHistorical({ startBlock, endBlock, startDate, endDate, id, user, pair }: SushiswapGetLiquidityPositionSnapshotsHistoricalRequest, opts?: OperationOpts): Observable<Array<SushiswapLiquidityPositionSnapshotDTO> | AjaxResponse<Array<SushiswapLiquidityPositionSnapshotDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }
        if (user != null) { query['user'] = user; }
        if (pair != null) { query['pair'] = pair; }

        return this.request<Array<SushiswapLiquidityPositionSnapshotDTO>>({
            url: '/dapps/sushiswap/liquidityPositionSnapshots/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets liquidityPositions.
     * LiquidityPositions (historical) 🔥
     */
    sushiswapGetLiquidityPositionsHistorical({ startBlock, endBlock, startDate, endDate, id, user, pair }: SushiswapGetLiquidityPositionsHistoricalRequest): Observable<Array<SushiswapLiquidityPositionDTO>>
    sushiswapGetLiquidityPositionsHistorical({ startBlock, endBlock, startDate, endDate, id, user, pair }: SushiswapGetLiquidityPositionsHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapLiquidityPositionDTO>>>
    sushiswapGetLiquidityPositionsHistorical({ startBlock, endBlock, startDate, endDate, id, user, pair }: SushiswapGetLiquidityPositionsHistoricalRequest, opts?: OperationOpts): Observable<Array<SushiswapLiquidityPositionDTO> | AjaxResponse<Array<SushiswapLiquidityPositionDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }
        if (user != null) { query['user'] = user; }
        if (pair != null) { query['pair'] = pair; }

        return this.request<Array<SushiswapLiquidityPositionDTO>>({
            url: '/dapps/sushiswap/liquidityPositions/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets mints.
     * Mints (historical) 🔥
     */
    sushiswapGetMintsHistorical({ startBlock, endBlock, startDate, endDate, id, pair }: SushiswapGetMintsHistoricalRequest): Observable<Array<SushiswapMintDTO>>
    sushiswapGetMintsHistorical({ startBlock, endBlock, startDate, endDate, id, pair }: SushiswapGetMintsHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapMintDTO>>>
    sushiswapGetMintsHistorical({ startBlock, endBlock, startDate, endDate, id, pair }: SushiswapGetMintsHistoricalRequest, opts?: OperationOpts): Observable<Array<SushiswapMintDTO> | AjaxResponse<Array<SushiswapMintDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }
        if (pair != null) { query['pair'] = pair; }

        return this.request<Array<SushiswapMintDTO>>({
            url: '/dapps/sushiswap/mints/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets pairDayDatas.
     * PairDayDatas (historical) 🔥
     */
    sushiswapGetPairDayDatasHistorical({ startBlock, endBlock, startDate, endDate, id, pair, token0, token1 }: SushiswapGetPairDayDatasHistoricalRequest): Observable<Array<SushiswapPairDayDataDTO>>
    sushiswapGetPairDayDatasHistorical({ startBlock, endBlock, startDate, endDate, id, pair, token0, token1 }: SushiswapGetPairDayDatasHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapPairDayDataDTO>>>
    sushiswapGetPairDayDatasHistorical({ startBlock, endBlock, startDate, endDate, id, pair, token0, token1 }: SushiswapGetPairDayDatasHistoricalRequest, opts?: OperationOpts): Observable<Array<SushiswapPairDayDataDTO> | AjaxResponse<Array<SushiswapPairDayDataDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }
        if (pair != null) { query['pair'] = pair; }
        if (token0 != null) { query['token_0'] = token0; }
        if (token1 != null) { query['token_1'] = token1; }

        return this.request<Array<SushiswapPairDayDataDTO>>({
            url: '/dapps/sushiswap/pairDayDatas/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets pairHourDatas.
     * PairHourDatas (historical) 🔥
     */
    sushiswapGetPairHourDatasHistorical({ startBlock, endBlock, startDate, endDate, id, pair }: SushiswapGetPairHourDatasHistoricalRequest): Observable<Array<SushiswapPairHourDataDTO>>
    sushiswapGetPairHourDatasHistorical({ startBlock, endBlock, startDate, endDate, id, pair }: SushiswapGetPairHourDatasHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapPairHourDataDTO>>>
    sushiswapGetPairHourDatasHistorical({ startBlock, endBlock, startDate, endDate, id, pair }: SushiswapGetPairHourDatasHistoricalRequest, opts?: OperationOpts): Observable<Array<SushiswapPairHourDataDTO> | AjaxResponse<Array<SushiswapPairHourDataDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }
        if (pair != null) { query['pair'] = pair; }

        return this.request<Array<SushiswapPairHourDataDTO>>({
            url: '/dapps/sushiswap/pairHourDatas/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets pairs.
     * Pairs (historical) 🔥
     */
    sushiswapGetPairsHistorical({ startBlock, endBlock, startDate, endDate, id, name, token0, token1 }: SushiswapGetPairsHistoricalRequest): Observable<Array<SushiswapPairDTO>>
    sushiswapGetPairsHistorical({ startBlock, endBlock, startDate, endDate, id, name, token0, token1 }: SushiswapGetPairsHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapPairDTO>>>
    sushiswapGetPairsHistorical({ startBlock, endBlock, startDate, endDate, id, name, token0, token1 }: SushiswapGetPairsHistoricalRequest, opts?: OperationOpts): Observable<Array<SushiswapPairDTO> | AjaxResponse<Array<SushiswapPairDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }
        if (name != null) { query['name'] = name; }
        if (token0 != null) { query['token_0'] = token0; }
        if (token1 != null) { query['token_1'] = token1; }

        return this.request<Array<SushiswapPairDTO>>({
            url: '/dapps/sushiswap/pairs/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets pools.
     * Pools (current) 🔥
     */
    sushiswapGetPoolsCurrent(): Observable<Array<SushiswapPairDTO>>
    sushiswapGetPoolsCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapPairDTO>>>
    sushiswapGetPoolsCurrent(opts?: OperationOpts): Observable<Array<SushiswapPairDTO> | AjaxResponse<Array<SushiswapPairDTO>>> {
        return this.request<Array<SushiswapPairDTO>>({
            url: '/dapps/sushiswap/pools/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets swaps.
     * Swaps (historical) 🔥
     */
    sushiswapGetSwapsHistorical({ startBlock, endBlock, startDate, endDate, id, pair }: SushiswapGetSwapsHistoricalRequest): Observable<Array<SushiswapSwapDTO>>
    sushiswapGetSwapsHistorical({ startBlock, endBlock, startDate, endDate, id, pair }: SushiswapGetSwapsHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapSwapDTO>>>
    sushiswapGetSwapsHistorical({ startBlock, endBlock, startDate, endDate, id, pair }: SushiswapGetSwapsHistoricalRequest, opts?: OperationOpts): Observable<Array<SushiswapSwapDTO> | AjaxResponse<Array<SushiswapSwapDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }
        if (pair != null) { query['pair'] = pair; }

        return this.request<Array<SushiswapSwapDTO>>({
            url: '/dapps/sushiswap/swaps/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets tokenDayDatas.
     * TokenDayDatas (historical) 🔥
     */
    sushiswapGetTokenDayDatasHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetTokenDayDatasHistoricalRequest): Observable<Array<SushiswapTokenDayDataDTO>>
    sushiswapGetTokenDayDatasHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetTokenDayDatasHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapTokenDayDataDTO>>>
    sushiswapGetTokenDayDatasHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetTokenDayDatasHistoricalRequest, opts?: OperationOpts): Observable<Array<SushiswapTokenDayDataDTO> | AjaxResponse<Array<SushiswapTokenDayDataDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }

        return this.request<Array<SushiswapTokenDayDataDTO>>({
            url: '/dapps/sushiswap/tokenDayDatas/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets tokens.
     * Tokens (historical) 🔥
     */
    sushiswapGetTokensHistorical({ startBlock, endBlock, startDate, endDate, id, symbol, name }: SushiswapGetTokensHistoricalRequest): Observable<Array<SushiswapTokenDTO>>
    sushiswapGetTokensHistorical({ startBlock, endBlock, startDate, endDate, id, symbol, name }: SushiswapGetTokensHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapTokenDTO>>>
    sushiswapGetTokensHistorical({ startBlock, endBlock, startDate, endDate, id, symbol, name }: SushiswapGetTokensHistoricalRequest, opts?: OperationOpts): Observable<Array<SushiswapTokenDTO> | AjaxResponse<Array<SushiswapTokenDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }
        if (symbol != null) { query['symbol'] = symbol; }
        if (name != null) { query['name'] = name; }

        return this.request<Array<SushiswapTokenDTO>>({
            url: '/dapps/sushiswap/tokens/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets transactions.
     * Transactions (historical) 🔥
     */
    sushiswapGetTransactionsHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetTransactionsHistoricalRequest): Observable<Array<SushiswapTransactionDTO>>
    sushiswapGetTransactionsHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetTransactionsHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapTransactionDTO>>>
    sushiswapGetTransactionsHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetTransactionsHistoricalRequest, opts?: OperationOpts): Observable<Array<SushiswapTransactionDTO> | AjaxResponse<Array<SushiswapTransactionDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }

        return this.request<Array<SushiswapTransactionDTO>>({
            url: '/dapps/sushiswap/transactions/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets users.
     * Users (historical) 🔥
     */
    sushiswapGetUsersHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetUsersHistoricalRequest): Observable<Array<SushiswapUserDTO>>
    sushiswapGetUsersHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetUsersHistoricalRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapUserDTO>>>
    sushiswapGetUsersHistorical({ startBlock, endBlock, startDate, endDate, id }: SushiswapGetUsersHistoricalRequest, opts?: OperationOpts): Observable<Array<SushiswapUserDTO> | AjaxResponse<Array<SushiswapUserDTO>>> {

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (id != null) { query['id'] = id; }

        return this.request<Array<SushiswapUserDTO>>({
            url: '/dapps/sushiswap/users/historical',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets hourDatas.
     * HourDatas (current)
     */
    sushiswapHourDatasCurrent(): Observable<Array<SushiswapHourDataDTO>>
    sushiswapHourDatasCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapHourDataDTO>>>
    sushiswapHourDatasCurrent(opts?: OperationOpts): Observable<Array<SushiswapHourDataDTO> | AjaxResponse<Array<SushiswapHourDataDTO>>> {
        return this.request<Array<SushiswapHourDataDTO>>({
            url: '/dapps/sushiswap/hourDatas/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets liquidityPositionSnapshots.
     * LiquidityPositionSnapshots (current)
     */
    sushiswapLiquidityPositionSnapshotsCurrent(): Observable<Array<SushiswapLiquidityPositionSnapshotDTO>>
    sushiswapLiquidityPositionSnapshotsCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapLiquidityPositionSnapshotDTO>>>
    sushiswapLiquidityPositionSnapshotsCurrent(opts?: OperationOpts): Observable<Array<SushiswapLiquidityPositionSnapshotDTO> | AjaxResponse<Array<SushiswapLiquidityPositionSnapshotDTO>>> {
        return this.request<Array<SushiswapLiquidityPositionSnapshotDTO>>({
            url: '/dapps/sushiswap/liquidityPositionSnapshots/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets liquidityPositions.
     * LiquidityPositions (current)
     */
    sushiswapLiquidityPositionsCurrent(): Observable<Array<SushiswapLiquidityPositionDTO>>
    sushiswapLiquidityPositionsCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapLiquidityPositionDTO>>>
    sushiswapLiquidityPositionsCurrent(opts?: OperationOpts): Observable<Array<SushiswapLiquidityPositionDTO> | AjaxResponse<Array<SushiswapLiquidityPositionDTO>>> {
        return this.request<Array<SushiswapLiquidityPositionDTO>>({
            url: '/dapps/sushiswap/liquidityPositions/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets mints.
     * Mints (current)
     */
    sushiswapMintsCurrent(): Observable<Array<SushiswapMintDTO>>
    sushiswapMintsCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapMintDTO>>>
    sushiswapMintsCurrent(opts?: OperationOpts): Observable<Array<SushiswapMintDTO> | AjaxResponse<Array<SushiswapMintDTO>>> {
        return this.request<Array<SushiswapMintDTO>>({
            url: '/dapps/sushiswap/mints/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets pairDayDatas.
     * PairDayDatas (current)
     */
    sushiswapPairDayDatasCurrent(): Observable<Array<SushiswapPairDayDataDTO>>
    sushiswapPairDayDatasCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapPairDayDataDTO>>>
    sushiswapPairDayDatasCurrent(opts?: OperationOpts): Observable<Array<SushiswapPairDayDataDTO> | AjaxResponse<Array<SushiswapPairDayDataDTO>>> {
        return this.request<Array<SushiswapPairDayDataDTO>>({
            url: '/dapps/sushiswap/pairDayDatas/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets pairHourDatas.
     * PairHourDatas (current)
     */
    sushiswapPairHourDatasCurrent(): Observable<Array<SushiswapPairHourDataDTO>>
    sushiswapPairHourDatasCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapPairHourDataDTO>>>
    sushiswapPairHourDatasCurrent(opts?: OperationOpts): Observable<Array<SushiswapPairHourDataDTO> | AjaxResponse<Array<SushiswapPairHourDataDTO>>> {
        return this.request<Array<SushiswapPairHourDataDTO>>({
            url: '/dapps/sushiswap/pairHourDatas/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets pairs.
     * Pairs (current)
     */
    sushiswapPairsCurrent({ id }: SushiswapPairsCurrentRequest): Observable<Array<SushiswapPairDTO>>
    sushiswapPairsCurrent({ id }: SushiswapPairsCurrentRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapPairDTO>>>
    sushiswapPairsCurrent({ id }: SushiswapPairsCurrentRequest, opts?: OperationOpts): Observable<Array<SushiswapPairDTO> | AjaxResponse<Array<SushiswapPairDTO>>> {

        const query: HttpQuery = {};

        if (id != null) { query['id'] = id; }

        return this.request<Array<SushiswapPairDTO>>({
            url: '/dapps/sushiswap/pairs/current',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets swaps.
     * Swaps (current)
     */
    sushiswapSwapsCurrent({ pair }: SushiswapSwapsCurrentRequest): Observable<Array<SushiswapSwapDTO>>
    sushiswapSwapsCurrent({ pair }: SushiswapSwapsCurrentRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapSwapDTO>>>
    sushiswapSwapsCurrent({ pair }: SushiswapSwapsCurrentRequest, opts?: OperationOpts): Observable<Array<SushiswapSwapDTO> | AjaxResponse<Array<SushiswapSwapDTO>>> {

        const query: HttpQuery = {};

        if (pair != null) { query['pair'] = pair; }

        return this.request<Array<SushiswapSwapDTO>>({
            url: '/dapps/sushiswap/swaps/current',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Gets tokenDayDatas.
     * TokenDayDatas (current)
     */
    sushiswapTokenDayDatasCurrent(): Observable<Array<SushiswapTokenDayDataDTO>>
    sushiswapTokenDayDatasCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapTokenDayDataDTO>>>
    sushiswapTokenDayDatasCurrent(opts?: OperationOpts): Observable<Array<SushiswapTokenDayDataDTO> | AjaxResponse<Array<SushiswapTokenDayDataDTO>>> {
        return this.request<Array<SushiswapTokenDayDataDTO>>({
            url: '/dapps/sushiswap/tokenDayDatas/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets tokens.
     * Tokens (current)
     */
    sushiswapTokensCurrent(): Observable<Array<SushiswapTokenDTO>>
    sushiswapTokensCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapTokenDTO>>>
    sushiswapTokensCurrent(opts?: OperationOpts): Observable<Array<SushiswapTokenDTO> | AjaxResponse<Array<SushiswapTokenDTO>>> {
        return this.request<Array<SushiswapTokenDTO>>({
            url: '/dapps/sushiswap/tokens/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets transactions.
     * Transactions (current)
     */
    sushiswapTransactionsCurrent(): Observable<Array<SushiswapTransactionDTO>>
    sushiswapTransactionsCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapTransactionDTO>>>
    sushiswapTransactionsCurrent(opts?: OperationOpts): Observable<Array<SushiswapTransactionDTO> | AjaxResponse<Array<SushiswapTransactionDTO>>> {
        return this.request<Array<SushiswapTransactionDTO>>({
            url: '/dapps/sushiswap/transactions/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets users.
     * Users (current)
     */
    sushiswapUsersCurrent(): Observable<Array<SushiswapUserDTO>>
    sushiswapUsersCurrent(opts?: OperationOpts): Observable<AjaxResponse<Array<SushiswapUserDTO>>>
    sushiswapUsersCurrent(opts?: OperationOpts): Observable<Array<SushiswapUserDTO> | AjaxResponse<Array<SushiswapUserDTO>>> {
        return this.request<Array<SushiswapUserDTO>>({
            url: '/dapps/sushiswap/users/current',
            method: 'GET',
        }, opts?.responseOpts);
    };

}
