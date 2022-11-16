{-
   OnChain API
    This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

   The version of the OpenAPI document: v1
   Contact: support@coinapi.io

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.Dex exposing
    ( dexGetBatchsHistorical
    , dexGetDepositsHistorical
    , dexGetOrdersHistorical
    , dexGetPricesHistorical
    , dexGetSolutionsHistorical
    , dexGetStatssHistorical
    , dexGetTokensHistorical
    , dexGetTradesHistorical
    , dexGetUsersHistorical
    , dexGetWithdrawRequestsHistorical
    , dexGetWithdrawsHistorical
    )

import Api
import Api.Data
import Api.Time exposing (Posix)
import Dict
import Http
import Json.Decode
import Json.Encode



{-| Gets batchs.
-}
dexGetBatchsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.DexBatchDTO)
dexGetBatchsHistorical startBlock_query endBlock_query startDate_query endDate_query id_query =
    Api.request
        "GET"
        "/dapps/dex/batchs/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.dexBatchDTODecoder)



{-| Gets deposits.
-}
dexGetDepositsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Api.Request (List Api.Data.DexDepositDTO)
dexGetDepositsHistorical startBlock_query endBlock_query startDate_query endDate_query id_query user_query =
    Api.request
        "GET"
        "/dapps/dex/deposits/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "user", Maybe.map identity user_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.dexDepositDTODecoder)



{-| Gets orders.
-}
dexGetOrdersHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Maybe String -> Api.Request (List Api.Data.DexOrderDTO)
dexGetOrdersHistorical startBlock_query endBlock_query startDate_query endDate_query id_query buyToken_query sellToken_query =
    Api.request
        "GET"
        "/dapps/dex/orders/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "buy_token", Maybe.map identity buyToken_query ), ( "sell_token", Maybe.map identity sellToken_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.dexOrderDTODecoder)



{-| Gets prices.
-}
dexGetPricesHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.DexPriceDTO)
dexGetPricesHistorical startBlock_query endBlock_query startDate_query endDate_query id_query =
    Api.request
        "GET"
        "/dapps/dex/prices/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.dexPriceDTODecoder)



{-| Gets solutions.
-}
dexGetSolutionsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.DexSolutionDTO)
dexGetSolutionsHistorical startBlock_query endBlock_query startDate_query endDate_query id_query =
    Api.request
        "GET"
        "/dapps/dex/solutions/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.dexSolutionDTODecoder)



{-| Gets statss.
-}
dexGetStatssHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.DexStatsDTO)
dexGetStatssHistorical startBlock_query endBlock_query startDate_query endDate_query id_query =
    Api.request
        "GET"
        "/dapps/dex/statss/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.dexStatsDTODecoder)



{-| Gets tokens.
-}
dexGetTokensHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Maybe String -> Maybe String -> Api.Request (List Api.Data.DexTokenDTO)
dexGetTokensHistorical startBlock_query endBlock_query startDate_query endDate_query id_query address_query symbol_query name_query =
    Api.request
        "GET"
        "/dapps/dex/tokens/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "address", Maybe.map identity address_query ), ( "symbol", Maybe.map identity symbol_query ), ( "name", Maybe.map identity name_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.dexTokenDTODecoder)



{-| Gets trades.
-}
dexGetTradesHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Maybe String -> Api.Request (List Api.Data.DexTradeDTO)
dexGetTradesHistorical startBlock_query endBlock_query startDate_query endDate_query id_query buyToken_query sellToken_query =
    Api.request
        "GET"
        "/dapps/dex/trades/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "buy_token", Maybe.map identity buyToken_query ), ( "sell_token", Maybe.map identity sellToken_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.dexTradeDTODecoder)



{-| Gets users.
-}
dexGetUsersHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.DexUserDTO)
dexGetUsersHistorical startBlock_query endBlock_query startDate_query endDate_query id_query =
    Api.request
        "GET"
        "/dapps/dex/users/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.dexUserDTODecoder)



{-| Gets withdrawrequests.
-}
dexGetWithdrawRequestsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Api.Request (List Api.Data.DexWithdrawRequestDTO)
dexGetWithdrawRequestsHistorical startBlock_query endBlock_query startDate_query endDate_query id_query user_query =
    Api.request
        "GET"
        "/dapps/dex/withdrawrequests/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "user", Maybe.map identity user_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.dexWithdrawRequestDTODecoder)



{-| Gets withdraws.
-}
dexGetWithdrawsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Api.Request (List Api.Data.DexWithdrawDTO)
dexGetWithdrawsHistorical startBlock_query endBlock_query startDate_query endDate_query id_query user_query =
    Api.request
        "GET"
        "/dapps/dex/withdraws/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "user", Maybe.map identity user_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.dexWithdrawDTODecoder)
