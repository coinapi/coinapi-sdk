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
import { BaseAPI, throwIfNullOrUndefined, encodeURI } from '../runtime';
import type { OperationOpts, HttpQuery } from '../runtime';

export interface ChainsChainIdDappsCurveUnderlyingCoinHistoricalGetRequest {
    chainId: string;
    startBlock?: number;
    endBlock?: number;
    startDate?: string;
    endDate?: string;
    poolId?: string;
}

/**
 * no description
 */
export class UnderlyingCoinApi extends BaseAPI {

    /**
     */
    chainsChainIdDappsCurveUnderlyingCoinHistoricalGet({ chainId, startBlock, endBlock, startDate, endDate, poolId }: ChainsChainIdDappsCurveUnderlyingCoinHistoricalGetRequest): Observable<void>
    chainsChainIdDappsCurveUnderlyingCoinHistoricalGet({ chainId, startBlock, endBlock, startDate, endDate, poolId }: ChainsChainIdDappsCurveUnderlyingCoinHistoricalGetRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>>
    chainsChainIdDappsCurveUnderlyingCoinHistoricalGet({ chainId, startBlock, endBlock, startDate, endDate, poolId }: ChainsChainIdDappsCurveUnderlyingCoinHistoricalGetRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>> {
        throwIfNullOrUndefined(chainId, 'chainId', 'chainsChainIdDappsCurveUnderlyingCoinHistoricalGet');

        const query: HttpQuery = {};

        if (startBlock != null) { query['startBlock'] = startBlock; }
        if (endBlock != null) { query['endBlock'] = endBlock; }
        if (startDate != null) { query['startDate'] = (startDate as any).toISOString(); }
        if (endDate != null) { query['endDate'] = (endDate as any).toISOString(); }
        if (poolId != null) { query['poolId'] = poolId; }

        return this.request<void>({
            url: '/chains/{chain_id}/dapps/curve/underlyingCoin/historical'.replace('{chain_id}', encodeURI(chainId)),
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

}
