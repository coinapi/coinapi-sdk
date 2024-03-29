# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test CRYPTOPUNKSApi")

api_instance <- CRYPTOPUNKSApi$new()

test_that("CRYPTOPUNKSBidsCurrent", {
  # tests for CRYPTOPUNKSBidsCurrent
  # base path: https://onchain.coinapi.io
  # Bids (current)
  # Gets bids.
  # @return [array[CRYPTOPUNKSBidDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CRYPTOPUNKSCollectionDailySnapshotsCurrent", {
  # tests for CRYPTOPUNKSCollectionDailySnapshotsCurrent
  # base path: https://onchain.coinapi.io
  # CollectionDailySnapshots (current)
  # Gets collectionDailySnapshots.
  # @return [array[CRYPTOPUNKSCollectionDailySnapshotDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CRYPTOPUNKSCollectionsCurrent", {
  # tests for CRYPTOPUNKSCollectionsCurrent
  # base path: https://onchain.coinapi.io
  # Collections (current)
  # Gets collections.
  # @return [array[CRYPTOPUNKSCollectionDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CRYPTOPUNKSDataSourcesCurrent", {
  # tests for CRYPTOPUNKSDataSourcesCurrent
  # base path: https://onchain.coinapi.io
  # DataSources (current)
  # Gets dataSources.
  # @return [array[CRYPTOPUNKSDataSourcesDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CRYPTOPUNKSGetBidsHistorical", {
  # tests for CRYPTOPUNKSGetBidsHistorical
  # base path: https://onchain.coinapi.io
  # Bids (historical)
  # Gets bids.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character  (optional)
  # @return [array[CRYPTOPUNKSBidDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CRYPTOPUNKSGetCollectionDailySnapshotsHistorical", {
  # tests for CRYPTOPUNKSGetCollectionDailySnapshotsHistorical
  # base path: https://onchain.coinapi.io
  # CollectionDailySnapshots (historical)
  # Gets collectionDailySnapshots.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @return [array[CRYPTOPUNKSCollectionDailySnapshotDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CRYPTOPUNKSGetCollectionsHistorical", {
  # tests for CRYPTOPUNKSGetCollectionsHistorical
  # base path: https://onchain.coinapi.io
  # Collections (historical)
  # Gets collections.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character  (optional)
  # @return [array[CRYPTOPUNKSCollectionDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CRYPTOPUNKSGetDataSourcesHistorical", {
  # tests for CRYPTOPUNKSGetDataSourcesHistorical
  # base path: https://onchain.coinapi.io
  # DataSources (historical)
  # Gets dataSources.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character  (optional)
  # @return [array[CRYPTOPUNKSDataSourcesDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CRYPTOPUNKSGetItemsHistorical", {
  # tests for CRYPTOPUNKSGetItemsHistorical
  # base path: https://onchain.coinapi.io
  # Items (historical)
  # Gets items.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @return [array[CRYPTOPUNKSItemDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CRYPTOPUNKSGetMarketPlacesHistorical", {
  # tests for CRYPTOPUNKSGetMarketPlacesHistorical
  # base path: https://onchain.coinapi.io
  # MarketPlaces (historical)
  # Gets marketPlaces.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character  (optional)
  # @return [array[CRYPTOPUNKSMarketPlaceDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CRYPTOPUNKSGetMarketplaceDailySnapshotsHistorical", {
  # tests for CRYPTOPUNKSGetMarketplaceDailySnapshotsHistorical
  # base path: https://onchain.coinapi.io
  # MarketplaceDailySnapshots (historical)
  # Gets marketplaceDailySnapshots.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character  (optional)
  # @return [array[CRYPTOPUNKSMarketplaceDailySnapshotDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CRYPTOPUNKSGetTradesHistorical", {
  # tests for CRYPTOPUNKSGetTradesHistorical
  # base path: https://onchain.coinapi.io
  # Trades (historical)
  # Gets trades.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character  (optional)
  # @return [array[CRYPTOPUNKSTradeDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CRYPTOPUNKSGetUsersHistorical", {
  # tests for CRYPTOPUNKSGetUsersHistorical
  # base path: https://onchain.coinapi.io
  # Users (historical)
  # Gets users.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character  (optional)
  # @return [array[CRYPTOPUNKSUserDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CRYPTOPUNKSItemsCurrent", {
  # tests for CRYPTOPUNKSItemsCurrent
  # base path: https://onchain.coinapi.io
  # Items (current)
  # Gets items.
  # @return [array[CRYPTOPUNKSItemDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CRYPTOPUNKSMarketPlacesCurrent", {
  # tests for CRYPTOPUNKSMarketPlacesCurrent
  # base path: https://onchain.coinapi.io
  # MarketPlaces (current)
  # Gets marketPlaces.
  # @return [array[CRYPTOPUNKSMarketPlaceDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CRYPTOPUNKSMarketplaceDailySnapshotsCurrent", {
  # tests for CRYPTOPUNKSMarketplaceDailySnapshotsCurrent
  # base path: https://onchain.coinapi.io
  # MarketplaceDailySnapshots (current)
  # Gets marketplaceDailySnapshots.
  # @return [array[CRYPTOPUNKSMarketplaceDailySnapshotDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CRYPTOPUNKSTradesCurrent", {
  # tests for CRYPTOPUNKSTradesCurrent
  # base path: https://onchain.coinapi.io
  # Trades (current)
  # Gets trades.
  # @return [array[CRYPTOPUNKSTradeDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CRYPTOPUNKSUsersCurrent", {
  # tests for CRYPTOPUNKSUsersCurrent
  # base path: https://onchain.coinapi.io
  # Users (current)
  # Gets users.
  # @return [array[CRYPTOPUNKSUserDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})
