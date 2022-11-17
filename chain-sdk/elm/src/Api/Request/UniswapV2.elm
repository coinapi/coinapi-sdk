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


module Api.Request.UniswapV2 exposing
    ( uniswapV2BundlesCurrent
    , uniswapV2BurnsCurrent
    , uniswapV2GetBundlesHistorical
    , uniswapV2GetBurnsHistorical
    , uniswapV2GetLiquidityPositionSnapshotsHistorical
    , uniswapV2GetLiquidityPositionsHistorical
    , uniswapV2GetMintsHistorical
    , uniswapV2GetPairDayDataHistorical
    , uniswapV2GetPairHourDataHistorical
    , uniswapV2GetPairsHistorical
    , uniswapV2GetSwapsHistorical
    , uniswapV2GetTokenDayDataHistorical
    , uniswapV2GetTokensHistorical
    , uniswapV2GetTransactionsHistorical
    , uniswapV2GetUniswapDayDataHistorical
    , uniswapV2GetUniswapFactoriesHistorical
    , uniswapV2GetUsersHistorical
    , uniswapV2LiquidityPositionSnapshotsCurrent
    , uniswapV2LiquidityPositionsCurrent
    , uniswapV2MintsCurrent
    , uniswapV2PairDayDataCurrent
    , uniswapV2PairHourDataCurrent
    , uniswapV2PairsCurrent
    , uniswapV2SwapsCurrent
    , uniswapV2TokenDayDataCurrent
    , uniswapV2TokensCurrent
    , uniswapV2TransactionsCurrent
    , uniswapV2UniswapDayDataCurrent
    , uniswapV2UniswapFactoriesCurrent
    , uniswapV2UsersCurrent
    )

import Api
import Api.Data
import Api.Time exposing (Posix)
import Dict
import Http
import Json.Decode
import Json.Encode



{-| Gets bundles.
-}
uniswapV2BundlesCurrent : Api.Request (List Api.Data.UniswapV2BundleDTO)
uniswapV2BundlesCurrent =
    Api.request
        "GET"
        "/dapps/uniswapv2/bundles/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2BundleDTODecoder)



{-| Gets burns.
-}
uniswapV2BurnsCurrent : Api.Request (List Api.Data.UniswapV2BurnDTO)
uniswapV2BurnsCurrent =
    Api.request
        "GET"
        "/dapps/uniswapv2/burns/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2BurnDTODecoder)



{-| Gets bundles.
-}
uniswapV2GetBundlesHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.UniswapV2BundleDTO)
uniswapV2GetBundlesHistorical startBlock_query endBlock_query startDate_query endDate_query id_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/bundles/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2BundleDTODecoder)



{-| Gets burns.
-}
uniswapV2GetBurnsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Api.Request (List Api.Data.UniswapV2BurnDTO)
uniswapV2GetBurnsHistorical startBlock_query endBlock_query startDate_query endDate_query id_query pair_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/burns/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "pair", Maybe.map identity pair_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2BurnDTODecoder)



{-| Gets liquidityPositionSnapshots.
-}
uniswapV2GetLiquidityPositionSnapshotsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Maybe String -> Api.Request (List Api.Data.UniswapV2LiquidityPositionSnapshotDTO)
uniswapV2GetLiquidityPositionSnapshotsHistorical startBlock_query endBlock_query startDate_query endDate_query id_query user_query pair_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/liquidityPositionSnapshots/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "user", Maybe.map identity user_query ), ( "pair", Maybe.map identity pair_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2LiquidityPositionSnapshotDTODecoder)



{-| Gets liquidityPositions.
-}
uniswapV2GetLiquidityPositionsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Maybe String -> Api.Request (List Api.Data.UniswapV2LiquidityPositionDTO)
uniswapV2GetLiquidityPositionsHistorical startBlock_query endBlock_query startDate_query endDate_query id_query user_query pair_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/liquidityPositions/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "user", Maybe.map identity user_query ), ( "pair", Maybe.map identity pair_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2LiquidityPositionDTODecoder)



{-| Gets mints.
-}
uniswapV2GetMintsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Api.Request (List Api.Data.UniswapV2MintDTO)
uniswapV2GetMintsHistorical startBlock_query endBlock_query startDate_query endDate_query id_query pair_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/mints/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "pair", Maybe.map identity pair_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2MintDTODecoder)



{-| Gets pairDayData.
-}
uniswapV2GetPairDayDataHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Maybe String -> Api.Request (List Api.Data.UniswapV2PairDayDataDTO)
uniswapV2GetPairDayDataHistorical startBlock_query endBlock_query startDate_query endDate_query id_query token0_query token1_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/pairDayData/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "token_0", Maybe.map identity token0_query ), ( "token_1", Maybe.map identity token1_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2PairDayDataDTODecoder)



{-| Gets pairHourData.
-}
uniswapV2GetPairHourDataHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Api.Request (List Api.Data.UniswapV2PairHourDataDTO)
uniswapV2GetPairHourDataHistorical startBlock_query endBlock_query startDate_query endDate_query id_query pair_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/pairHourData/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "pair", Maybe.map identity pair_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2PairHourDataDTODecoder)



{-| Gets pairs.
-}
uniswapV2GetPairsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Maybe String -> Api.Request (List Api.Data.UniswapV2PairDTO)
uniswapV2GetPairsHistorical startBlock_query endBlock_query startDate_query endDate_query id_query token0_query token1_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/pairs/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "token_0", Maybe.map identity token0_query ), ( "token_1", Maybe.map identity token1_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2PairDTODecoder)



{-| Gets swaps.
-}
uniswapV2GetSwapsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Api.Request (List Api.Data.UniswapV2SwapDTO)
uniswapV2GetSwapsHistorical startBlock_query endBlock_query startDate_query endDate_query id_query pair_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/swaps/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "pair", Maybe.map identity pair_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2SwapDTODecoder)



{-| Gets tokenDayData.
-}
uniswapV2GetTokenDayDataHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.UniswapV2TokenDayDataDTO)
uniswapV2GetTokenDayDataHistorical startBlock_query endBlock_query startDate_query endDate_query id_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/tokenDayData/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2TokenDayDataDTODecoder)



{-| Gets tokens.
-}
uniswapV2GetTokensHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Maybe String -> Maybe String -> Api.Request (List Api.Data.UniswapV2TokenDTO)
uniswapV2GetTokensHistorical startBlock_query endBlock_query startDate_query endDate_query id_query symbol_query name_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/tokens/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ), ( "symbol", Maybe.map identity symbol_query ), ( "name", Maybe.map identity name_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2TokenDTODecoder)



{-| Gets transactions.
-}
uniswapV2GetTransactionsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.UniswapV2TransactionDTO)
uniswapV2GetTransactionsHistorical startBlock_query endBlock_query startDate_query endDate_query id_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/transactions/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2TransactionDTODecoder)



{-| Gets uniswapDayData.
-}
uniswapV2GetUniswapDayDataHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.UniswapV2UniswapDayDataDTO)
uniswapV2GetUniswapDayDataHistorical startBlock_query endBlock_query startDate_query endDate_query id_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/uniswapDayData/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2UniswapDayDataDTODecoder)



{-| Gets uniswapFactories.
-}
uniswapV2GetUniswapFactoriesHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.UniswapV2UniswapFactoryDTO)
uniswapV2GetUniswapFactoriesHistorical startBlock_query endBlock_query startDate_query endDate_query id_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/uniswapFactories/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2UniswapFactoryDTODecoder)



{-| Gets users.
-}
uniswapV2GetUsersHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.UniswapV2UserDTO)
uniswapV2GetUsersHistorical startBlock_query endBlock_query startDate_query endDate_query id_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/users/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2UserDTODecoder)



{-| Gets liquidityPositionSnapshots.
-}
uniswapV2LiquidityPositionSnapshotsCurrent : Api.Request (List Api.Data.UniswapV2LiquidityPositionSnapshotDTO)
uniswapV2LiquidityPositionSnapshotsCurrent =
    Api.request
        "GET"
        "/dapps/uniswapv2/liquidityPositionSnapshots/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2LiquidityPositionSnapshotDTODecoder)



{-| Gets liquidityPositions.
-}
uniswapV2LiquidityPositionsCurrent : Api.Request (List Api.Data.UniswapV2LiquidityPositionDTO)
uniswapV2LiquidityPositionsCurrent =
    Api.request
        "GET"
        "/dapps/uniswapv2/liquidityPositions/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2LiquidityPositionDTODecoder)



{-| Gets mints.
-}
uniswapV2MintsCurrent : Api.Request (List Api.Data.UniswapV2MintDTO)
uniswapV2MintsCurrent =
    Api.request
        "GET"
        "/dapps/uniswapv2/mints/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2MintDTODecoder)



{-| Gets pairDayData.
-}
uniswapV2PairDayDataCurrent : Api.Request (List Api.Data.UniswapV2PairDayDataDTO)
uniswapV2PairDayDataCurrent =
    Api.request
        "GET"
        "/dapps/uniswapv2/pairDayData/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2PairDayDataDTODecoder)



{-| Gets pairHourData.
-}
uniswapV2PairHourDataCurrent : Api.Request (List Api.Data.UniswapV2PairHourDataDTO)
uniswapV2PairHourDataCurrent =
    Api.request
        "GET"
        "/dapps/uniswapv2/pairHourData/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2PairHourDataDTODecoder)



{-| Gets pairs.
-}
uniswapV2PairsCurrent : Maybe String -> Api.Request (List Api.Data.UniswapV2PairDTO)
uniswapV2PairsCurrent id_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/pairs/current"
        []
        [ ( "id", Maybe.map identity id_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2PairDTODecoder)



{-| Gets swaps.
-}
uniswapV2SwapsCurrent : Maybe String -> Api.Request (List Api.Data.UniswapV2SwapDTO)
uniswapV2SwapsCurrent pair_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/swaps/current"
        []
        [ ( "pair", Maybe.map identity pair_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2SwapDTODecoder)



{-| Gets tokenDayData.
-}
uniswapV2TokenDayDataCurrent : Api.Request (List Api.Data.UniswapV2TokenDayDataDTO)
uniswapV2TokenDayDataCurrent =
    Api.request
        "GET"
        "/dapps/uniswapv2/tokenDayData/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2TokenDayDataDTODecoder)



{-| Gets tokens.
-}
uniswapV2TokensCurrent : Api.Request (List Api.Data.UniswapV2TokenDTO)
uniswapV2TokensCurrent =
    Api.request
        "GET"
        "/dapps/uniswapv2/tokens/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2TokenDTODecoder)



{-| Gets transactions.
-}
uniswapV2TransactionsCurrent : Api.Request (List Api.Data.UniswapV2TransactionDTO)
uniswapV2TransactionsCurrent =
    Api.request
        "GET"
        "/dapps/uniswapv2/transactions/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2TransactionDTODecoder)



{-| Gets uniswapDayData.
-}
uniswapV2UniswapDayDataCurrent : Api.Request (List Api.Data.UniswapV2UniswapDayDataDTO)
uniswapV2UniswapDayDataCurrent =
    Api.request
        "GET"
        "/dapps/uniswapv2/uniswapDayData/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2UniswapDayDataDTODecoder)



{-| Gets uniswapFactories.
-}
uniswapV2UniswapFactoriesCurrent : Api.Request (List Api.Data.UniswapV2UniswapFactoryDTO)
uniswapV2UniswapFactoriesCurrent =
    Api.request
        "GET"
        "/dapps/uniswapv2/uniswapFactories/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2UniswapFactoryDTODecoder)



{-| Gets users.
-}
uniswapV2UsersCurrent : Api.Request (List Api.Data.UniswapV2UserDTO)
uniswapV2UsersCurrent =
    Api.request
        "GET"
        "/dapps/uniswapv2/users/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2UserDTODecoder)
