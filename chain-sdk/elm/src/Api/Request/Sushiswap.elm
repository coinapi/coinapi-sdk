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


module Api.Request.Sushiswap exposing
    ( curveGetExchangesCurrent
    , dexGetTradesCurrent
    , sushiswapBundlesCurrent
    , sushiswapBurnsCurrent
    , sushiswapDayDatasCurrent
    , sushiswapFactorysCurrent
    , sushiswapGetBundlesHistorical
    , sushiswapGetBurnsHistorical
    , sushiswapGetDayDatasHistorical
    , sushiswapGetFactorysHistorical
    , sushiswapGetHourDatasHistorical
    , sushiswapGetLiquidityPositionSnapshotsHistorical
    , sushiswapGetLiquidityPositionsHistorical
    , sushiswapGetMintsHistorical
    , sushiswapGetPairDayDatasHistorical
    , sushiswapGetPairHourDatasHistorical
    , sushiswapGetPairsHistorical
    , sushiswapGetPoolsCurrent
    , sushiswapGetSwapsHistorical
    , sushiswapGetTokenDayDatasHistorical
    , sushiswapGetTokensHistorical
    , sushiswapGetTransactionsHistorical
    , sushiswapGetUsersHistorical
    , sushiswapHourDatasCurrent
    , sushiswapLiquidityPositionSnapshotsCurrent
    , sushiswapLiquidityPositionsCurrent
    , sushiswapMintsCurrent
    , sushiswapPairDayDatasCurrent
    , sushiswapPairHourDatasCurrent
    , sushiswapPairsCurrent
    , sushiswapSwapsCurrent
    , sushiswapTokenDayDatasCurrent
    , sushiswapTokensCurrent
    , sushiswapTransactionsCurrent
    , sushiswapUsersCurrent
    )

import Api
import Api.Data
import Api.Time exposing (Posix)
import Dict
import Http
import Json.Decode
import Json.Encode



{-| Gets exchanges.
-}
curveGetExchangesCurrent : Api.Request (List Api.Data.CurveExchangeDTO)
curveGetExchangesCurrent =
    Api.request
        "GET"
        "/dapps/sushiswap/exchanges/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.curveExchangeDTODecoder)



{-| Gets trades.
-}
dexGetTradesCurrent : Api.Request (List Api.Data.DexTradeDTO)
dexGetTradesCurrent =
    Api.request
        "GET"
        "/dapps/sushiswap/trades/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.dexTradeDTODecoder)



{-| Gets bundles.
-}
sushiswapBundlesCurrent : Api.Request (List Api.Data.SushiswapBundleDTO)
sushiswapBundlesCurrent =
    Api.request
        "GET"
        "/dapps/sushiswap/bundles/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapBundleDTODecoder)



{-| Gets burns.
-}
sushiswapBurnsCurrent : Api.Request (List Api.Data.SushiswapBurnDTO)
sushiswapBurnsCurrent =
    Api.request
        "GET"
        "/dapps/sushiswap/burns/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapBurnDTODecoder)



{-| Gets dayDatas.
-}
sushiswapDayDatasCurrent : Api.Request (List Api.Data.SushiswapDayDataDTO)
sushiswapDayDatasCurrent =
    Api.request
        "GET"
        "/dapps/sushiswap/dayDatas/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapDayDataDTODecoder)



{-| Gets factorys.
-}
sushiswapFactorysCurrent : Api.Request (List Api.Data.SushiswapFactoryDTO)
sushiswapFactorysCurrent =
    Api.request
        "GET"
        "/dapps/sushiswap/factorys/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapFactoryDTODecoder)



{-| Gets bundles.
-}
sushiswapGetBundlesHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.SushiswapBundleDTO)
sushiswapGetBundlesHistorical startBlock_query endBlock_query startDate_query endDate_query id_query =
    Api.request
        "GET"
        "/dapps/sushiswap/bundles/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapBundleDTODecoder)



{-| Gets burns.
-}
sushiswapGetBurnsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Api.Request (List Api.Data.SushiswapBurnDTO)
sushiswapGetBurnsHistorical startBlock_query endBlock_query startDate_query endDate_query id_query pair_query =
    Api.request
        "GET"
        "/dapps/sushiswap/burns/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "pair", Maybe.map identity pair_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapBurnDTODecoder)



{-| Gets dayDatas.
-}
sushiswapGetDayDatasHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.SushiswapDayDataDTO)
sushiswapGetDayDatasHistorical startBlock_query endBlock_query startDate_query endDate_query id_query =
    Api.request
        "GET"
        "/dapps/sushiswap/dayDatas/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapDayDataDTODecoder)



{-| Gets factorys.
-}
sushiswapGetFactorysHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.SushiswapFactoryDTO)
sushiswapGetFactorysHistorical startBlock_query endBlock_query startDate_query endDate_query id_query =
    Api.request
        "GET"
        "/dapps/sushiswap/factorys/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapFactoryDTODecoder)



{-| Gets hourDatas.
-}
sushiswapGetHourDatasHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.SushiswapHourDataDTO)
sushiswapGetHourDatasHistorical startBlock_query endBlock_query startDate_query endDate_query id_query =
    Api.request
        "GET"
        "/dapps/sushiswap/hourDatas/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapHourDataDTODecoder)



{-| Gets liquidityPositionSnapshots.
-}
sushiswapGetLiquidityPositionSnapshotsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Maybe String -> Api.Request (List Api.Data.SushiswapLiquidityPositionSnapshotDTO)
sushiswapGetLiquidityPositionSnapshotsHistorical startBlock_query endBlock_query startDate_query endDate_query id_query user_query pair_query =
    Api.request
        "GET"
        "/dapps/sushiswap/liquidityPositionSnapshots/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "user", Maybe.map identity user_query ), ( "pair", Maybe.map identity pair_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapLiquidityPositionSnapshotDTODecoder)



{-| Gets liquidityPositions.
-}
sushiswapGetLiquidityPositionsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Maybe String -> Api.Request (List Api.Data.SushiswapLiquidityPositionDTO)
sushiswapGetLiquidityPositionsHistorical startBlock_query endBlock_query startDate_query endDate_query id_query user_query pair_query =
    Api.request
        "GET"
        "/dapps/sushiswap/liquidityPositions/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "user", Maybe.map identity user_query ), ( "pair", Maybe.map identity pair_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapLiquidityPositionDTODecoder)



{-| Gets mints.
-}
sushiswapGetMintsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Api.Request (List Api.Data.SushiswapMintDTO)
sushiswapGetMintsHistorical startBlock_query endBlock_query startDate_query endDate_query id_query pair_query =
    Api.request
        "GET"
        "/dapps/sushiswap/mints/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "pair", Maybe.map identity pair_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapMintDTODecoder)



{-| Gets pairDayDatas.
-}
sushiswapGetPairDayDatasHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Maybe String -> Maybe String -> Api.Request (List Api.Data.SushiswapPairDayDataDTO)
sushiswapGetPairDayDatasHistorical startBlock_query endBlock_query startDate_query endDate_query id_query pair_query token0_query token1_query =
    Api.request
        "GET"
        "/dapps/sushiswap/pairDayDatas/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "pair", Maybe.map identity pair_query ), ( "token_0", Maybe.map identity token0_query ), ( "token_1", Maybe.map identity token1_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapPairDayDataDTODecoder)



{-| Gets pairHourDatas.
-}
sushiswapGetPairHourDatasHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Api.Request (List Api.Data.SushiswapPairHourDataDTO)
sushiswapGetPairHourDatasHistorical startBlock_query endBlock_query startDate_query endDate_query id_query pair_query =
    Api.request
        "GET"
        "/dapps/sushiswap/pairHourDatas/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "pair", Maybe.map identity pair_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapPairHourDataDTODecoder)



{-| Gets pairs.
-}
sushiswapGetPairsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Maybe String -> Maybe String -> Api.Request (List Api.Data.SushiswapPairDTO)
sushiswapGetPairsHistorical startBlock_query endBlock_query startDate_query endDate_query id_query name_query token0_query token1_query =
    Api.request
        "GET"
        "/dapps/sushiswap/pairs/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "name", Maybe.map identity name_query ), ( "token_0", Maybe.map identity token0_query ), ( "token_1", Maybe.map identity token1_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapPairDTODecoder)



{-| Gets pools.
-}
sushiswapGetPoolsCurrent : Api.Request (List Api.Data.SushiswapPairDTO)
sushiswapGetPoolsCurrent =
    Api.request
        "GET"
        "/dapps/sushiswap/pools/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapPairDTODecoder)



{-| Gets swaps.
-}
sushiswapGetSwapsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Api.Request (List Api.Data.SushiswapSwapDTO)
sushiswapGetSwapsHistorical startBlock_query endBlock_query startDate_query endDate_query id_query pair_query =
    Api.request
        "GET"
        "/dapps/sushiswap/swaps/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "pair", Maybe.map identity pair_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapSwapDTODecoder)



{-| Gets tokenDayDatas.
-}
sushiswapGetTokenDayDatasHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.SushiswapTokenDayDataDTO)
sushiswapGetTokenDayDatasHistorical startBlock_query endBlock_query startDate_query endDate_query id_query =
    Api.request
        "GET"
        "/dapps/sushiswap/tokenDayDatas/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapTokenDayDataDTODecoder)



{-| Gets tokens.
-}
sushiswapGetTokensHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Maybe String -> Api.Request (List Api.Data.SushiswapTokenDTO)
sushiswapGetTokensHistorical startBlock_query endBlock_query startDate_query endDate_query id_query symbol_query name_query =
    Api.request
        "GET"
        "/dapps/sushiswap/tokens/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "symbol", Maybe.map identity symbol_query ), ( "name", Maybe.map identity name_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapTokenDTODecoder)



{-| Gets transactions.
-}
sushiswapGetTransactionsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.SushiswapTransactionDTO)
sushiswapGetTransactionsHistorical startBlock_query endBlock_query startDate_query endDate_query id_query =
    Api.request
        "GET"
        "/dapps/sushiswap/transactions/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapTransactionDTODecoder)



{-| Gets users.
-}
sushiswapGetUsersHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.SushiswapUserDTO)
sushiswapGetUsersHistorical startBlock_query endBlock_query startDate_query endDate_query id_query =
    Api.request
        "GET"
        "/dapps/sushiswap/users/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapUserDTODecoder)



{-| Gets hourDatas.
-}
sushiswapHourDatasCurrent : Api.Request (List Api.Data.SushiswapHourDataDTO)
sushiswapHourDatasCurrent =
    Api.request
        "GET"
        "/dapps/sushiswap/hourDatas/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapHourDataDTODecoder)



{-| Gets liquidityPositionSnapshots.
-}
sushiswapLiquidityPositionSnapshotsCurrent : Api.Request (List Api.Data.SushiswapLiquidityPositionSnapshotDTO)
sushiswapLiquidityPositionSnapshotsCurrent =
    Api.request
        "GET"
        "/dapps/sushiswap/liquidityPositionSnapshots/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapLiquidityPositionSnapshotDTODecoder)



{-| Gets liquidityPositions.
-}
sushiswapLiquidityPositionsCurrent : Api.Request (List Api.Data.SushiswapLiquidityPositionDTO)
sushiswapLiquidityPositionsCurrent =
    Api.request
        "GET"
        "/dapps/sushiswap/liquidityPositions/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapLiquidityPositionDTODecoder)



{-| Gets mints.
-}
sushiswapMintsCurrent : Api.Request (List Api.Data.SushiswapMintDTO)
sushiswapMintsCurrent =
    Api.request
        "GET"
        "/dapps/sushiswap/mints/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapMintDTODecoder)



{-| Gets pairDayDatas.
-}
sushiswapPairDayDatasCurrent : Api.Request (List Api.Data.SushiswapPairDayDataDTO)
sushiswapPairDayDatasCurrent =
    Api.request
        "GET"
        "/dapps/sushiswap/pairDayDatas/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapPairDayDataDTODecoder)



{-| Gets pairHourDatas.
-}
sushiswapPairHourDatasCurrent : Api.Request (List Api.Data.SushiswapPairHourDataDTO)
sushiswapPairHourDatasCurrent =
    Api.request
        "GET"
        "/dapps/sushiswap/pairHourDatas/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapPairHourDataDTODecoder)



{-| Gets pairs.
-}
sushiswapPairsCurrent : Maybe String -> Api.Request (List Api.Data.SushiswapPairDTO)
sushiswapPairsCurrent id_query =
    Api.request
        "GET"
        "/dapps/sushiswap/pairs/current"
        []
        [ ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapPairDTODecoder)



{-| Gets swaps.
-}
sushiswapSwapsCurrent : Maybe String -> Api.Request (List Api.Data.SushiswapSwapDTO)
sushiswapSwapsCurrent pair_query =
    Api.request
        "GET"
        "/dapps/sushiswap/swaps/current"
        []
        [ ( "pair", Maybe.map identity pair_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapSwapDTODecoder)



{-| Gets tokenDayDatas.
-}
sushiswapTokenDayDatasCurrent : Api.Request (List Api.Data.SushiswapTokenDayDataDTO)
sushiswapTokenDayDatasCurrent =
    Api.request
        "GET"
        "/dapps/sushiswap/tokenDayDatas/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapTokenDayDataDTODecoder)



{-| Gets tokens.
-}
sushiswapTokensCurrent : Api.Request (List Api.Data.SushiswapTokenDTO)
sushiswapTokensCurrent =
    Api.request
        "GET"
        "/dapps/sushiswap/tokens/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapTokenDTODecoder)



{-| Gets transactions.
-}
sushiswapTransactionsCurrent : Api.Request (List Api.Data.SushiswapTransactionDTO)
sushiswapTransactionsCurrent =
    Api.request
        "GET"
        "/dapps/sushiswap/transactions/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapTransactionDTODecoder)



{-| Gets users.
-}
sushiswapUsersCurrent : Api.Request (List Api.Data.SushiswapUserDTO)
sushiswapUsersCurrent =
    Api.request
        "GET"
        "/dapps/sushiswap/users/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.sushiswapUserDTODecoder)
