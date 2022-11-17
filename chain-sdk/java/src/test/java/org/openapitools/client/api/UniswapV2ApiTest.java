/*
 * OnChain API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import java.time.OffsetDateTime;
import org.openapitools.client.model.UniswapV2BundleDTO;
import org.openapitools.client.model.UniswapV2BurnDTO;
import org.openapitools.client.model.UniswapV2LiquidityPositionDTO;
import org.openapitools.client.model.UniswapV2LiquidityPositionSnapshotDTO;
import org.openapitools.client.model.UniswapV2MintDTO;
import org.openapitools.client.model.UniswapV2PairDTO;
import org.openapitools.client.model.UniswapV2PairDayDataDTO;
import org.openapitools.client.model.UniswapV2PairHourDataDTO;
import org.openapitools.client.model.UniswapV2SwapDTO;
import org.openapitools.client.model.UniswapV2TokenDTO;
import org.openapitools.client.model.UniswapV2TokenDayDataDTO;
import org.openapitools.client.model.UniswapV2TransactionDTO;
import org.openapitools.client.model.UniswapV2UniswapDayDataDTO;
import org.openapitools.client.model.UniswapV2UniswapFactoryDTO;
import org.openapitools.client.model.UniswapV2UserDTO;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UniswapV2Api
 */
@Disabled
public class UniswapV2ApiTest {

    private final UniswapV2Api api = new UniswapV2Api();

    /**
     * Bundles (current)
     *
     * Gets bundles.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2BundlesCurrentTest() throws ApiException {
        List<UniswapV2BundleDTO> response = api.uniswapV2BundlesCurrent();
        // TODO: test validations
    }

    /**
     * Burns (current)
     *
     * Gets burns.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2BurnsCurrentTest() throws ApiException {
        List<UniswapV2BurnDTO> response = api.uniswapV2BurnsCurrent();
        // TODO: test validations
    }

    /**
     * Bundles (historical) 🔥
     *
     * Gets bundles.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2GetBundlesHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        List<UniswapV2BundleDTO> response = api.uniswapV2GetBundlesHistorical(startBlock, endBlock, startDate, endDate, id);
        // TODO: test validations
    }

    /**
     * Burns (historical) 🔥
     *
     * Gets burns.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2GetBurnsHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        String pair = null;
        List<UniswapV2BurnDTO> response = api.uniswapV2GetBurnsHistorical(startBlock, endBlock, startDate, endDate, id, pair);
        // TODO: test validations
    }

    /**
     * LiquidityPositionSnapshots (historical) 🔥
     *
     * Gets liquidityPositionSnapshots.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2GetLiquidityPositionSnapshotsHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        String user = null;
        String pair = null;
        List<UniswapV2LiquidityPositionSnapshotDTO> response = api.uniswapV2GetLiquidityPositionSnapshotsHistorical(startBlock, endBlock, startDate, endDate, id, user, pair);
        // TODO: test validations
    }

    /**
     * LiquidityPositions (historical) 🔥
     *
     * Gets liquidityPositions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2GetLiquidityPositionsHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        String user = null;
        String pair = null;
        List<UniswapV2LiquidityPositionDTO> response = api.uniswapV2GetLiquidityPositionsHistorical(startBlock, endBlock, startDate, endDate, id, user, pair);
        // TODO: test validations
    }

    /**
     * Mints (historical) 🔥
     *
     * Gets mints.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2GetMintsHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        String pair = null;
        List<UniswapV2MintDTO> response = api.uniswapV2GetMintsHistorical(startBlock, endBlock, startDate, endDate, id, pair);
        // TODO: test validations
    }

    /**
     * PairDayDatas (historical) 🔥
     *
     * Gets pairDayDatas.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2GetPairDayDatasHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        String token0 = null;
        String token1 = null;
        List<UniswapV2PairDayDataDTO> response = api.uniswapV2GetPairDayDatasHistorical(startBlock, endBlock, startDate, endDate, id, token0, token1);
        // TODO: test validations
    }

    /**
     * PairHourDatas (historical) 🔥
     *
     * Gets pairHourDatas.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2GetPairHourDatasHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        String pair = null;
        List<UniswapV2PairHourDataDTO> response = api.uniswapV2GetPairHourDatasHistorical(startBlock, endBlock, startDate, endDate, id, pair);
        // TODO: test validations
    }

    /**
     * Pairs (historical) 🔥
     *
     * Gets pairs.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2GetPairsHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        String token0 = null;
        String token1 = null;
        List<UniswapV2PairDTO> response = api.uniswapV2GetPairsHistorical(startBlock, endBlock, startDate, endDate, id, token0, token1);
        // TODO: test validations
    }

    /**
     * Pools (current) 🔥
     *
     * Gets pools.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2GetPoolsCurrentTest() throws ApiException {
        String filterPoolId = null;
        List<UniswapV2PairDTO> response = api.uniswapV2GetPoolsCurrent(filterPoolId);
        // TODO: test validations
    }

    /**
     * Swaps (current) 🔥
     *
     * Gets swaps.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2GetSwapsCurrentTest() throws ApiException {
        List<UniswapV2SwapDTO> response = api.uniswapV2GetSwapsCurrent();
        // TODO: test validations
    }

    /**
     * Swaps (historical) 🔥
     *
     * Gets swaps.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2GetSwapsHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        String pair = null;
        List<UniswapV2SwapDTO> response = api.uniswapV2GetSwapsHistorical(startBlock, endBlock, startDate, endDate, id, pair);
        // TODO: test validations
    }

    /**
     * TokenDayDatas (historical) 🔥
     *
     * Gets tokenDayDatas.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2GetTokenDayDatasHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        List<UniswapV2TokenDayDataDTO> response = api.uniswapV2GetTokenDayDatasHistorical(startBlock, endBlock, startDate, endDate, id);
        // TODO: test validations
    }

    /**
     * Tokens (current) 🔥
     *
     * Gets tokens.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2GetTokensCurrentTest() throws ApiException {
        List<UniswapV2TokenDTO> response = api.uniswapV2GetTokensCurrent();
        // TODO: test validations
    }

    /**
     * Tokens (historical) 🔥
     *
     * Gets tokens.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2GetTokensHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        String symbol = null;
        String name = null;
        List<UniswapV2TokenDTO> response = api.uniswapV2GetTokensHistorical(startBlock, endBlock, startDate, endDate, id, symbol, name);
        // TODO: test validations
    }

    /**
     * Transactions (historical) 🔥
     *
     * Gets transactions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2GetTransactionsHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        List<UniswapV2TransactionDTO> response = api.uniswapV2GetTransactionsHistorical(startBlock, endBlock, startDate, endDate, id);
        // TODO: test validations
    }

    /**
     * UniswapDayDatas (historical) 🔥
     *
     * Gets uniswapDayDatas.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2GetUniswapDayDatasHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        List<UniswapV2UniswapDayDataDTO> response = api.uniswapV2GetUniswapDayDatasHistorical(startBlock, endBlock, startDate, endDate, id);
        // TODO: test validations
    }

    /**
     * UniswapFactorys (historical) 🔥
     *
     * Gets uniswapFactorys.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2GetUniswapFactorysHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        List<UniswapV2UniswapFactoryDTO> response = api.uniswapV2GetUniswapFactorysHistorical(startBlock, endBlock, startDate, endDate, id);
        // TODO: test validations
    }

    /**
     * Users (historical) 🔥
     *
     * Gets users.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2GetUsersHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        List<UniswapV2UserDTO> response = api.uniswapV2GetUsersHistorical(startBlock, endBlock, startDate, endDate, id);
        // TODO: test validations
    }

    /**
     * LiquidityPositionSnapshots (current)
     *
     * Gets liquidityPositionSnapshots.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2LiquidityPositionSnapshotsCurrentTest() throws ApiException {
        List<UniswapV2LiquidityPositionSnapshotDTO> response = api.uniswapV2LiquidityPositionSnapshotsCurrent();
        // TODO: test validations
    }

    /**
     * LiquidityPositions (current)
     *
     * Gets liquidityPositions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2LiquidityPositionsCurrentTest() throws ApiException {
        List<UniswapV2LiquidityPositionDTO> response = api.uniswapV2LiquidityPositionsCurrent();
        // TODO: test validations
    }

    /**
     * Mints (current)
     *
     * Gets mints.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2MintsCurrentTest() throws ApiException {
        List<UniswapV2MintDTO> response = api.uniswapV2MintsCurrent();
        // TODO: test validations
    }

    /**
     * PairDayDatas (current)
     *
     * Gets pairDayDatas.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2PairDayDatasCurrentTest() throws ApiException {
        List<UniswapV2PairDayDataDTO> response = api.uniswapV2PairDayDatasCurrent();
        // TODO: test validations
    }

    /**
     * PairHourDatas (current)
     *
     * Gets pairHourDatas.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2PairHourDatasCurrentTest() throws ApiException {
        List<UniswapV2PairHourDataDTO> response = api.uniswapV2PairHourDatasCurrent();
        // TODO: test validations
    }

    /**
     * Pairs (current)
     *
     * Gets pairs.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2PairsCurrentTest() throws ApiException {
        String id = null;
        List<UniswapV2PairDTO> response = api.uniswapV2PairsCurrent(id);
        // TODO: test validations
    }

    /**
     * TokenDayDatas (current)
     *
     * Gets tokenDayDatas.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2TokenDayDatasCurrentTest() throws ApiException {
        List<UniswapV2TokenDayDataDTO> response = api.uniswapV2TokenDayDatasCurrent();
        // TODO: test validations
    }

    /**
     * Transactions (current)
     *
     * Gets transactions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2TransactionsCurrentTest() throws ApiException {
        List<UniswapV2TransactionDTO> response = api.uniswapV2TransactionsCurrent();
        // TODO: test validations
    }

    /**
     * UniswapDayDatas (current)
     *
     * Gets uniswapDayDatas.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2UniswapDayDatasCurrentTest() throws ApiException {
        List<UniswapV2UniswapDayDataDTO> response = api.uniswapV2UniswapDayDatasCurrent();
        // TODO: test validations
    }

    /**
     * UniswapFactorys (current)
     *
     * Gets uniswapFactorys.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2UniswapFactorysCurrentTest() throws ApiException {
        List<UniswapV2UniswapFactoryDTO> response = api.uniswapV2UniswapFactorysCurrent();
        // TODO: test validations
    }

    /**
     * Users (current)
     *
     * Gets users.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniswapV2UsersCurrentTest() throws ApiException {
        List<UniswapV2UserDTO> response = api.uniswapV2UsersCurrent();
        // TODO: test validations
    }

}
