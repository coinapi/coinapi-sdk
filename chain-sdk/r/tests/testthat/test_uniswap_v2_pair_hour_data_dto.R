# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test UniswapV2PairHourDataDTO")

model_instance <- UniswapV2PairHourDataDTO$new()

test_that("entry_time", {
  # tests for the property `entry_time` (character)

  # uncomment below to test the property
  #expect_equal(model.instance$`entry_time`, "EXPECTED_RESULT")
})

test_that("recv_time", {
  # tests for the property `recv_time` (character)

  # uncomment below to test the property
  #expect_equal(model.instance$`recv_time`, "EXPECTED_RESULT")
})

test_that("block_number", {
  # tests for the property `block_number` (integer)
  # Number of block in which entity was recorded.

  # uncomment below to test the property
  #expect_equal(model.instance$`block_number`, "EXPECTED_RESULT")
})

test_that("id", {
  # tests for the property `id` (character)
  # 

  # uncomment below to test the property
  #expect_equal(model.instance$`id`, "EXPECTED_RESULT")
})

test_that("hour_start_unix", {
  # tests for the property `hour_start_unix` (integer)
  # Unix timestamp for start of hour.

  # uncomment below to test the property
  #expect_equal(model.instance$`hour_start_unix`, "EXPECTED_RESULT")
})

test_that("pair", {
  # tests for the property `pair` (character)
  # Address for pair contract.

  # uncomment below to test the property
  #expect_equal(model.instance$`pair`, "EXPECTED_RESULT")
})

test_that("reserve_0", {
  # tests for the property `reserve_0` (character)
  # Reserve of token0 (updated during each transaction on pair).

  # uncomment below to test the property
  #expect_equal(model.instance$`reserve_0`, "EXPECTED_RESULT")
})

test_that("reserve_1", {
  # tests for the property `reserve_1` (character)
  # Reserve of token1 (updated during each transaction on pair).

  # uncomment below to test the property
  #expect_equal(model.instance$`reserve_1`, "EXPECTED_RESULT")
})

test_that("total_supply", {
  # tests for the property `total_supply` (character)
  # Total supply of liquidity token distributed to LPs.

  # uncomment below to test the property
  #expect_equal(model.instance$`total_supply`, "EXPECTED_RESULT")
})

test_that("reserve_usd", {
  # tests for the property `reserve_usd` (character)
  # Reserve of token0 plus token1 stored as a derived USD amount.

  # uncomment below to test the property
  #expect_equal(model.instance$`reserve_usd`, "EXPECTED_RESULT")
})

test_that("hourly_volume_token_0", {
  # tests for the property `hourly_volume_token_0` (character)
  # Total amount of token0 swapped throughout hour.

  # uncomment below to test the property
  #expect_equal(model.instance$`hourly_volume_token_0`, "EXPECTED_RESULT")
})

test_that("hourly_volume_token_1", {
  # tests for the property `hourly_volume_token_1` (character)
  # Total amount of token1 swapped throughout hour.

  # uncomment below to test the property
  #expect_equal(model.instance$`hourly_volume_token_1`, "EXPECTED_RESULT")
})

test_that("hourly_volume_usd", {
  # tests for the property `hourly_volume_usd` (character)
  # Total volume within pair throughout hour.

  # uncomment below to test the property
  #expect_equal(model.instance$`hourly_volume_usd`, "EXPECTED_RESULT")
})

test_that("hourly_txns", {
  # tests for the property `hourly_txns` (character)
  # Amount of transactions on pair throughout hour.

  # uncomment below to test the property
  #expect_equal(model.instance$`hourly_txns`, "EXPECTED_RESULT")
})

test_that("vid", {
  # tests for the property `vid` (integer)
  # 

  # uncomment below to test the property
  #expect_equal(model.instance$`vid`, "EXPECTED_RESULT")
})
