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
import org.openapitools.client.model.CowOrderDTO;
import org.openapitools.client.model.CowSettlementDTO;
import org.openapitools.client.model.CowTokenDTO;
import org.openapitools.client.model.CowTradeDTO;
import org.openapitools.client.model.CowUserDTO;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CowApi
 */
@Disabled
public class CowApiTest {

    private final CowApi api = new CowApi();

    /**
     * Orders (historical)
     *
     * Gets orders.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cowGetOrdersHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        List<CowOrderDTO> response = api.cowGetOrdersHistorical(startBlock, endBlock, startDate, endDate);
        // TODO: test validations
    }

    /**
     * Settlements (historical)
     *
     * Gets settlements.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cowGetSettlementsHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        List<CowSettlementDTO> response = api.cowGetSettlementsHistorical(startBlock, endBlock, startDate, endDate);
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
    public void cowGetTokensHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String tokenId = null;
        List<CowTokenDTO> response = api.cowGetTokensHistorical(startBlock, endBlock, startDate, endDate, tokenId);
        // TODO: test validations
    }

    /**
     * Trades (historical) 🔥
     *
     * Gets trades.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cowGetTradesHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        List<CowTradeDTO> response = api.cowGetTradesHistorical(startBlock, endBlock, startDate, endDate);
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
    public void cowGetUsersHistoricalTest() throws ApiException {
        Long startBlock = null;
        Long endBlock = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        List<CowUserDTO> response = api.cowGetUsersHistorical(startBlock, endBlock, startDate, endDate);
        // TODO: test validations
    }

}
