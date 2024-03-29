# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test UniswapV2Api")

api_instance <- UniswapV2Api$new()

test_that("UniswapV2BundlesCurrent", {
  # tests for UniswapV2BundlesCurrent
  # base path: https://onchain.coinapi.io
  # Bundles (current)
  # Gets bundles.
  # @return [array[UniswapV2BundleDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2BurnsCurrent", {
  # tests for UniswapV2BurnsCurrent
  # base path: https://onchain.coinapi.io
  # Burns (current)
  # Gets burns.
  # @return [array[UniswapV2BurnDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2GetBundlesHistorical", {
  # tests for UniswapV2GetBundlesHistorical
  # base path: https://onchain.coinapi.io
  # Bundles (historical)
  # Gets bundles.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character Constant 1. (optional)
  # @return [array[UniswapV2BundleDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2GetBurnsHistorical", {
  # tests for UniswapV2GetBurnsHistorical
  # base path: https://onchain.coinapi.io
  # Burns (historical)
  # Gets burns.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character Transaction hash plus index in the transaction burn array (optional)
  # @param pair character Reference to pair. (optional)
  # @return [array[UniswapV2BurnDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2GetLiquidityPositionSnapshotsHistorical", {
  # tests for UniswapV2GetLiquidityPositionSnapshotsHistorical
  # base path: https://onchain.coinapi.io
  # LiquidityPositionSnapshots (historical)
  # Gets liquidityPositionSnapshots.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character Identifier, format: (pair address)-(user address) (optional)
  # @param user character Reference to user. (optional)
  # @param pair character Reference to the pair liquidity is being provided on. (optional)
  # @return [array[UniswapV2LiquidityPositionSnapshotDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2GetLiquidityPositionsHistorical", {
  # tests for UniswapV2GetLiquidityPositionsHistorical
  # base path: https://onchain.coinapi.io
  # LiquidityPositions (historical)
  # Gets liquidityPositions.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character User address and pair address concatenated with a dash. (optional)
  # @param user character Reference to user. (optional)
  # @param pair character Reference to the pair liquidity is being provided on. (optional)
  # @return [array[UniswapV2LiquidityPositionDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2GetMintsHistorical", {
  # tests for UniswapV2GetMintsHistorical
  # base path: https://onchain.coinapi.io
  # Mints (historical)
  # Gets mints.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character Transaction hash plus index in the transaction mint array. (optional)
  # @param pair character Reference to pair. (optional)
  # @return [array[UniswapV2MintDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2GetPairDayDataHistorical", {
  # tests for UniswapV2GetPairDayDataHistorical
  # base path: https://onchain.coinapi.io
  # PairDayData (historical)
  # Gets pairDayData.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character  (optional)
  # @param token_0 character Reference to token0. (optional)
  # @param token_1 character Reference to token1. (optional)
  # @return [array[UniswapV2PairDayDataDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2GetPairHourDataHistorical", {
  # tests for UniswapV2GetPairHourDataHistorical
  # base path: https://onchain.coinapi.io
  # PairHourData (historical)
  # Gets pairHourData.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character  (optional)
  # @param pair character Address for pair contract. (optional)
  # @return [array[UniswapV2PairHourDataDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2GetPairsHistorical", {
  # tests for UniswapV2GetPairsHistorical
  # base path: https://onchain.coinapi.io
  # Pairs (historical)
  # Gets pairs.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character Pair contract address. (optional)
  # @param token_0 character Reference to token0 as stored in pair contract. (optional)
  # @param token_1 character Reference to token1 as stored in pair contract. (optional)
  # @return [array[UniswapV2PairDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2GetSwapsHistorical", {
  # tests for UniswapV2GetSwapsHistorical
  # base path: https://onchain.coinapi.io
  # Swaps (historical)
  # Gets swaps.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character Transaction hash plus index in Transaction swap array. (optional)
  # @param pair character Reference to pair. (optional)
  # @return [array[UniswapV2SwapDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2GetTokenDayDataHistorical", {
  # tests for UniswapV2GetTokenDayDataHistorical
  # base path: https://onchain.coinapi.io
  # TokenDayData (historical)
  # Gets tokenDayData.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character Token address and day id (day start timestamp in unix / 86400) concatenated with a dash. (optional)
  # @return [array[UniswapV2TokenDayDataDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2GetTokensHistorical", {
  # tests for UniswapV2GetTokensHistorical
  # base path: https://onchain.coinapi.io
  # Tokens (historical)
  # Gets tokens.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character Token address. (optional)
  # @param symbol character Token symbol. (optional)
  # @param name character Token name. (optional)
  # @return [array[UniswapV2TokenDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2GetTransactionsHistorical", {
  # tests for UniswapV2GetTransactionsHistorical
  # base path: https://onchain.coinapi.io
  # Transactions (historical)
  # Gets transactions.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character Ethereum transaction hash. (optional)
  # @return [array[UniswapV2TransactionDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2GetUniswapDayDataHistorical", {
  # tests for UniswapV2GetUniswapDayDataHistorical
  # base path: https://onchain.coinapi.io
  # UniswapDayData (historical)
  # Gets uniswapDayData.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character Unix timestamp for start of day / 86400 giving a unique day index. (optional)
  # @return [array[UniswapV2UniswapDayDataDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2GetUniswapFactoriesHistorical", {
  # tests for UniswapV2GetUniswapFactoriesHistorical
  # base path: https://onchain.coinapi.io
  # UniswapFactories (historical)
  # Gets uniswapFactories.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character Factory address. (optional)
  # @return [array[UniswapV2UniswapFactoryDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2GetUsersHistorical", {
  # tests for UniswapV2GetUsersHistorical
  # base path: https://onchain.coinapi.io
  # Users (historical)
  # Gets users.
  # @param start_block integer The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
  # @param end_block integer The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
  # @param start_date character The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
  # @param end_date character The end date of timeframe. (optional)
  # @param id character User address. (optional)
  # @return [array[UniswapV2UserDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2LiquidityPositionSnapshotsCurrent", {
  # tests for UniswapV2LiquidityPositionSnapshotsCurrent
  # base path: https://onchain.coinapi.io
  # LiquidityPositionSnapshots (current)
  # Gets liquidityPositionSnapshots.
  # @return [array[UniswapV2LiquidityPositionSnapshotDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2LiquidityPositionsCurrent", {
  # tests for UniswapV2LiquidityPositionsCurrent
  # base path: https://onchain.coinapi.io
  # LiquidityPositions (current)
  # Gets liquidityPositions.
  # @return [array[UniswapV2LiquidityPositionDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2MintsCurrent", {
  # tests for UniswapV2MintsCurrent
  # base path: https://onchain.coinapi.io
  # Mints (current)
  # Gets mints.
  # @return [array[UniswapV2MintDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2PairDayDataCurrent", {
  # tests for UniswapV2PairDayDataCurrent
  # base path: https://onchain.coinapi.io
  # PairDayData (current)
  # Gets pairDayData.
  # @return [array[UniswapV2PairDayDataDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2PairHourDataCurrent", {
  # tests for UniswapV2PairHourDataCurrent
  # base path: https://onchain.coinapi.io
  # PairHourData (current)
  # Gets pairHourData.
  # @return [array[UniswapV2PairHourDataDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2PairsCurrent", {
  # tests for UniswapV2PairsCurrent
  # base path: https://onchain.coinapi.io
  # Pairs (current)
  # Gets pairs.
  # @param id character Pair contract address. (optional)
  # @return [array[UniswapV2PairDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2SwapsCurrent", {
  # tests for UniswapV2SwapsCurrent
  # base path: https://onchain.coinapi.io
  # Swaps (current)
  # Gets swaps.
  # @param pair character Reference to pair. (optional)
  # @return [array[UniswapV2SwapDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2TokenDayDataCurrent", {
  # tests for UniswapV2TokenDayDataCurrent
  # base path: https://onchain.coinapi.io
  # TokenDayData (current)
  # Gets tokenDayData.
  # @return [array[UniswapV2TokenDayDataDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2TokensCurrent", {
  # tests for UniswapV2TokensCurrent
  # base path: https://onchain.coinapi.io
  # Tokens (current)
  # Gets tokens.
  # @return [array[UniswapV2TokenDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2TransactionsCurrent", {
  # tests for UniswapV2TransactionsCurrent
  # base path: https://onchain.coinapi.io
  # Transactions (current)
  # Gets transactions.
  # @return [array[UniswapV2TransactionDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2UniswapDayDataCurrent", {
  # tests for UniswapV2UniswapDayDataCurrent
  # base path: https://onchain.coinapi.io
  # UniswapDayData (current)
  # Gets uniswapDayData.
  # @return [array[UniswapV2UniswapDayDataDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2UniswapFactoriesCurrent", {
  # tests for UniswapV2UniswapFactoriesCurrent
  # base path: https://onchain.coinapi.io
  # UniswapFactories (current)
  # Gets uniswapFactories.
  # @return [array[UniswapV2UniswapFactoryDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UniswapV2UsersCurrent", {
  # tests for UniswapV2UsersCurrent
  # base path: https://onchain.coinapi.io
  # Users (current)
  # Gets users.
  # @return [array[UniswapV2UserDTO]]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})
