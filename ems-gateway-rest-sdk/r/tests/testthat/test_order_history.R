# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test OrderHistory")

model_instance <- OrderHistory$new()

test_that("apikey", {
  # tests for the property `apikey` (character)
  # Apikey

  # uncomment below to test the property
  #expect_equal(model.instance$`apikey`, "EXPECTED_RESULT")
})

test_that("exchangeId", {
  # tests for the property `exchangeId` (character)
  # Exchange id

  # uncomment below to test the property
  #expect_equal(model.instance$`exchangeId`, "EXPECTED_RESULT")
})

test_that("clientOrderId", {
  # tests for the property `clientOrderId` (character)
  # Client order id

  # uncomment below to test the property
  #expect_equal(model.instance$`clientOrderId`, "EXPECTED_RESULT")
})

test_that("symbolIdExchange", {
  # tests for the property `symbolIdExchange` (character)
  # Symbol id exchange

  # uncomment below to test the property
  #expect_equal(model.instance$`symbolIdExchange`, "EXPECTED_RESULT")
})

test_that("symbolIdCoinapi", {
  # tests for the property `symbolIdCoinapi` (character)
  # Symbol id in coinapi

  # uncomment below to test the property
  #expect_equal(model.instance$`symbolIdCoinapi`, "EXPECTED_RESULT")
})

test_that("amountOrder", {
  # tests for the property `amountOrder` (numeric)
  # Amount

  # uncomment below to test the property
  #expect_equal(model.instance$`amountOrder`, "EXPECTED_RESULT")
})

test_that("price", {
  # tests for the property `price` (numeric)
  # Price

  # uncomment below to test the property
  #expect_equal(model.instance$`price`, "EXPECTED_RESULT")
})

test_that("side", {
  # tests for the property `side` (numeric)
  # 1-buy, 2-sell

  # uncomment below to test the property
  #expect_equal(model.instance$`side`, "EXPECTED_RESULT")
})

test_that("orderType", {
  # tests for the property `orderType` (character)
  # Order type

  # uncomment below to test the property
  #expect_equal(model.instance$`orderType`, "EXPECTED_RESULT")
})

test_that("timeInForce", {
  # tests for the property `timeInForce` (character)
  # Time in force

  # uncomment below to test the property
  #expect_equal(model.instance$`timeInForce`, "EXPECTED_RESULT")
})

test_that("expireTime", {
  # tests for the property `expireTime` (character)
  # Expire time

  # uncomment below to test the property
  #expect_equal(model.instance$`expireTime`, "EXPECTED_RESULT")
})

test_that("execInst", {
  # tests for the property `execInst` (array[character])
  # Exec inst

  # uncomment below to test the property
  #expect_equal(model.instance$`execInst`, "EXPECTED_RESULT")
})

test_that("clientOrderIdFormatExchange", {
  # tests for the property `clientOrderIdFormatExchange` (character)
  # Client order id format

  # uncomment below to test the property
  #expect_equal(model.instance$`clientOrderIdFormatExchange`, "EXPECTED_RESULT")
})

test_that("exchangeOrderId", {
  # tests for the property `exchangeOrderId` (character)
  # Exchange order id

  # uncomment below to test the property
  #expect_equal(model.instance$`exchangeOrderId`, "EXPECTED_RESULT")
})

test_that("amountOpen", {
  # tests for the property `amountOpen` (numeric)
  # Amount open

  # uncomment below to test the property
  #expect_equal(model.instance$`amountOpen`, "EXPECTED_RESULT")
})

test_that("amountFilled", {
  # tests for the property `amountFilled` (numeric)
  # Amount filled

  # uncomment below to test the property
  #expect_equal(model.instance$`amountFilled`, "EXPECTED_RESULT")
})

test_that("avgPx", {
  # tests for the property `avgPx` (numeric)
  # Average price

  # uncomment below to test the property
  #expect_equal(model.instance$`avgPx`, "EXPECTED_RESULT")
})

test_that("status", {
  # tests for the property `status` (character)
  # Status

  # uncomment below to test the property
  #expect_equal(model.instance$`status`, "EXPECTED_RESULT")
})

test_that("statusHistoryStatus", {
  # tests for the property `statusHistoryStatus` (array[character])
  # History status

  # uncomment below to test the property
  #expect_equal(model.instance$`statusHistoryStatus`, "EXPECTED_RESULT")
})

test_that("statusHistoryTime", {
  # tests for the property `statusHistoryTime` (array[character])
  # History status time

  # uncomment below to test the property
  #expect_equal(model.instance$`statusHistoryTime`, "EXPECTED_RESULT")
})

test_that("errorMessageResult", {
  # tests for the property `errorMessageResult` (character)
  # Error message

  # uncomment below to test the property
  #expect_equal(model.instance$`errorMessageResult`, "EXPECTED_RESULT")
})

test_that("errorMessageReason", {
  # tests for the property `errorMessageReason` (character)
  # Error message reason

  # uncomment below to test the property
  #expect_equal(model.instance$`errorMessageReason`, "EXPECTED_RESULT")
})

test_that("errorMessageMessage", {
  # tests for the property `errorMessageMessage` (character)
  # Error message

  # uncomment below to test the property
  #expect_equal(model.instance$`errorMessageMessage`, "EXPECTED_RESULT")
})

test_that("fillsTime", {
  # tests for the property `fillsTime` (array[character])
  # Fills time

  # uncomment below to test the property
  #expect_equal(model.instance$`fillsTime`, "EXPECTED_RESULT")
})

test_that("fillsPrice", {
  # tests for the property `fillsPrice` (array[numeric])
  # Fills price

  # uncomment below to test the property
  #expect_equal(model.instance$`fillsPrice`, "EXPECTED_RESULT")
})

test_that("fillsAmount", {
  # tests for the property `fillsAmount` (array[numeric])
  # Fills amount

  # uncomment below to test the property
  #expect_equal(model.instance$`fillsAmount`, "EXPECTED_RESULT")
})

test_that("createdTime", {
  # tests for the property `createdTime` (character)
  # Created time

  # uncomment below to test the property
  #expect_equal(model.instance$`createdTime`, "EXPECTED_RESULT")
})
