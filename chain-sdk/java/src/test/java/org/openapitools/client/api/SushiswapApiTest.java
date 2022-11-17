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
import org.openapitools.client.model.SushiswapBundleDTO;
import org.openapitools.client.model.SushiswapBurnDTO;
import org.openapitools.client.model.SushiswapDayDataDTO;
import org.openapitools.client.model.SushiswapFactoryDTO;
import org.openapitools.client.model.SushiswapHourDataDTO;
import org.openapitools.client.model.SushiswapLiquidityPositionDTO;
import org.openapitools.client.model.SushiswapLiquidityPositionSnapshotDTO;
import org.openapitools.client.model.SushiswapMintDTO;
import org.openapitools.client.model.SushiswapPairDTO;
import org.openapitools.client.model.SushiswapPairDayDataDTO;
import org.openapitools.client.model.SushiswapPairHourDataDTO;
import org.openapitools.client.model.SushiswapSwapDTO;
import org.openapitools.client.model.SushiswapTokenDTO;
import org.openapitools.client.model.SushiswapTokenDayDataDTO;
import org.openapitools.client.model.SushiswapTransactionDTO;
import org.openapitools.client.model.SushiswapUserDTO;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SushiswapApi
 */
@Disabled
public class SushiswapApiTest {

    private final SushiswapApi api = new SushiswapApi();

    /**
     * Bundles (current)
     *
     * Gets bundles.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapBundlesCurrentTest() throws ApiException {
        List<SushiswapBundleDTO> response = api.sushiswapBundlesCurrent();
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
    public void sushiswapBurnsCurrentTest() throws ApiException {
        List<SushiswapBurnDTO> response = api.sushiswapBurnsCurrent();
        // TODO: test validations
    }

    /**
     * DayData (current)
     *
     * Gets dayData.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapDayDataCurrentTest() throws ApiException {
        List<SushiswapDayDataDTO> response = api.sushiswapDayDataCurrent();
        // TODO: test validations
    }

    /**
     * Factories (current)
     *
     * Gets factories.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapFactoriesCurrentTest() throws ApiException {
        List<SushiswapFactoryDTO> response = api.sushiswapFactoriesCurrent();
        // TODO: test validations
    }

    /**
     * Bundles (historical)
     *
     * Gets bundles.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapGetBundlesHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        List<SushiswapBundleDTO> response = api.sushiswapGetBundlesHistorical(startBlock, endBlock, startDate, endDate, id);
        // TODO: test validations
    }

    /**
     * Burns (historical)
     *
     * Gets burns.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapGetBurnsHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        String pair = null;
        List<SushiswapBurnDTO> response = api.sushiswapGetBurnsHistorical(startBlock, endBlock, startDate, endDate, id, pair);
        // TODO: test validations
    }

    /**
     * DayData (historical)
     *
     * Gets dayData.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapGetDayDataHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        List<SushiswapDayDataDTO> response = api.sushiswapGetDayDataHistorical(startBlock, endBlock, startDate, endDate, id);
        // TODO: test validations
    }

    /**
     * Factories (historical)
     *
     * Gets factories.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapGetFactoriesHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        List<SushiswapFactoryDTO> response = api.sushiswapGetFactoriesHistorical(startBlock, endBlock, startDate, endDate, id);
        // TODO: test validations
    }

    /**
     * HourData (historical)
     *
     * Gets hourData.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapGetHourDataHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        List<SushiswapHourDataDTO> response = api.sushiswapGetHourDataHistorical(startBlock, endBlock, startDate, endDate, id);
        // TODO: test validations
    }

    /**
     * LiquidityPositionSnapshots (historical)
     *
     * Gets liquidityPositionSnapshots.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapGetLiquidityPositionSnapshotsHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        String user = null;
        String pair = null;
        List<SushiswapLiquidityPositionSnapshotDTO> response = api.sushiswapGetLiquidityPositionSnapshotsHistorical(startBlock, endBlock, startDate, endDate, id, user, pair);
        // TODO: test validations
    }

    /**
     * LiquidityPositions (historical)
     *
     * Gets liquidityPositions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapGetLiquidityPositionsHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        String user = null;
        String pair = null;
        List<SushiswapLiquidityPositionDTO> response = api.sushiswapGetLiquidityPositionsHistorical(startBlock, endBlock, startDate, endDate, id, user, pair);
        // TODO: test validations
    }

    /**
     * Mints (historical)
     *
     * Gets mints.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapGetMintsHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        String pair = null;
        List<SushiswapMintDTO> response = api.sushiswapGetMintsHistorical(startBlock, endBlock, startDate, endDate, id, pair);
        // TODO: test validations
    }

    /**
     * PairDayData (historical)
     *
     * Gets pairDayData.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapGetPairDayDataHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        String pair = null;
        String token0 = null;
        String token1 = null;
        List<SushiswapPairDayDataDTO> response = api.sushiswapGetPairDayDataHistorical(startBlock, endBlock, startDate, endDate, id, pair, token0, token1);
        // TODO: test validations
    }

    /**
     * PairHourData (historical)
     *
     * Gets pairHourData.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapGetPairHourDataHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        String pair = null;
        List<SushiswapPairHourDataDTO> response = api.sushiswapGetPairHourDataHistorical(startBlock, endBlock, startDate, endDate, id, pair);
        // TODO: test validations
    }

    /**
     * Pairs (historical)
     *
     * Gets pairs.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapGetPairsHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        String name = null;
        String token0 = null;
        String token1 = null;
        List<SushiswapPairDTO> response = api.sushiswapGetPairsHistorical(startBlock, endBlock, startDate, endDate, id, name, token0, token1);
        // TODO: test validations
    }

    /**
     * Swaps (historical)
     *
     * Gets swaps.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapGetSwapsHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        String pair = null;
        List<SushiswapSwapDTO> response = api.sushiswapGetSwapsHistorical(startBlock, endBlock, startDate, endDate, id, pair);
        // TODO: test validations
    }

    /**
     * TokenDayData (historical)
     *
     * Gets tokenDayData.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapGetTokenDayDataHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        List<SushiswapTokenDayDataDTO> response = api.sushiswapGetTokenDayDataHistorical(startBlock, endBlock, startDate, endDate, id);
        // TODO: test validations
    }

    /**
     * Tokens (historical)
     *
     * Gets tokens.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapGetTokensHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        String symbol = null;
        String name = null;
        List<SushiswapTokenDTO> response = api.sushiswapGetTokensHistorical(startBlock, endBlock, startDate, endDate, id, symbol, name);
        // TODO: test validations
    }

    /**
     * Transactions (historical)
     *
     * Gets transactions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapGetTransactionsHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        List<SushiswapTransactionDTO> response = api.sushiswapGetTransactionsHistorical(startBlock, endBlock, startDate, endDate, id);
        // TODO: test validations
    }

    /**
     * Users (historical)
     *
     * Gets users.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapGetUsersHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String id = null;
        List<SushiswapUserDTO> response = api.sushiswapGetUsersHistorical(startBlock, endBlock, startDate, endDate, id);
        // TODO: test validations
    }

    /**
     * HourData (current)
     *
     * Gets hourData.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapHourDataCurrentTest() throws ApiException {
        List<SushiswapHourDataDTO> response = api.sushiswapHourDataCurrent();
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
    public void sushiswapLiquidityPositionSnapshotsCurrentTest() throws ApiException {
        List<SushiswapLiquidityPositionSnapshotDTO> response = api.sushiswapLiquidityPositionSnapshotsCurrent();
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
    public void sushiswapLiquidityPositionsCurrentTest() throws ApiException {
        List<SushiswapLiquidityPositionDTO> response = api.sushiswapLiquidityPositionsCurrent();
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
    public void sushiswapMintsCurrentTest() throws ApiException {
        List<SushiswapMintDTO> response = api.sushiswapMintsCurrent();
        // TODO: test validations
    }

    /**
     * PairDayData (current)
     *
     * Gets pairDayData.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapPairDayDataCurrentTest() throws ApiException {
        List<SushiswapPairDayDataDTO> response = api.sushiswapPairDayDataCurrent();
        // TODO: test validations
    }

    /**
     * PairHourData (current)
     *
     * Gets pairHourData.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapPairHourDataCurrentTest() throws ApiException {
        List<SushiswapPairHourDataDTO> response = api.sushiswapPairHourDataCurrent();
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
    public void sushiswapPairsCurrentTest() throws ApiException {
        String id = null;
        List<SushiswapPairDTO> response = api.sushiswapPairsCurrent(id);
        // TODO: test validations
    }

    /**
     * Swaps (current)
     *
     * Gets swaps.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapSwapsCurrentTest() throws ApiException {
        String pair = null;
        List<SushiswapSwapDTO> response = api.sushiswapSwapsCurrent(pair);
        // TODO: test validations
    }

    /**
     * TokenDayData (current)
     *
     * Gets tokenDayData.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapTokenDayDataCurrentTest() throws ApiException {
        List<SushiswapTokenDayDataDTO> response = api.sushiswapTokenDayDataCurrent();
        // TODO: test validations
    }

    /**
     * Tokens (current)
     *
     * Gets tokens.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sushiswapTokensCurrentTest() throws ApiException {
        List<SushiswapTokenDTO> response = api.sushiswapTokensCurrent();
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
    public void sushiswapTransactionsCurrentTest() throws ApiException {
        List<SushiswapTransactionDTO> response = api.sushiswapTransactionsCurrent();
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
    public void sushiswapUsersCurrentTest() throws ApiException {
        List<SushiswapUserDTO> response = api.sushiswapUsersCurrent();
        // TODO: test validations
    }

}
