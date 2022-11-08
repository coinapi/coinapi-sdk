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
    ( uniswapV2GetBundlesHistorical
    , uniswapV2GetBurnsHistorical
    , uniswapV2GetDayDataHistorical
    , uniswapV2GetFactoryHistorical
    , uniswapV2GetLiquidityPositionsHistorical
    , uniswapV2GetLiquidityPositionsSnapshotsHistorical
    , uniswapV2GetMintsHistorical
    , uniswapV2GetPoolsCurrent
    , uniswapV2GetPoolsDayDataHistorical
    , uniswapV2GetPoolsHistorical
    , uniswapV2GetPoolsHourDataHistorical
    , uniswapV2GetSwapsCurrent
    , uniswapV2GetSwapsHistorical
    , uniswapV2GetTokensCurrent
    , uniswapV2GetTokensDayDataHistorical
    , uniswapV2GetTokensHistorical
    , uniswapV2GetTransactionsHistorical
    , uniswapV2GetUsersHistorical
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
uniswapV2GetBundlesHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Api.Request (List Api.Data.UniswapV2BundleV2DTO)
uniswapV2GetBundlesHistorical startBlock_query endBlock_query startDate_query endDate_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/bundles/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2BundleV2DTODecoder)



{-| Gets burns.
-}
uniswapV2GetBurnsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.UniswapV2BurnV2DTO)
uniswapV2GetBurnsHistorical startBlock_query endBlock_query startDate_query endDate_query poolId_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/burns/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "poolId", Maybe.map identity poolId_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2BurnV2DTODecoder)



{-| Gets uniswapv2 day data.
-}
uniswapV2GetDayDataHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Api.Request (List Api.Data.UniswapV2UniswapDayDataV2DTO)
uniswapV2GetDayDataHistorical startBlock_query endBlock_query startDate_query endDate_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/dayData/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2UniswapDayDataV2DTODecoder)



{-| Gets factory.
-}
uniswapV2GetFactoryHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Api.Request (List Api.Data.UniswapV2UniswapFactoryV2DTO)
uniswapV2GetFactoryHistorical startBlock_query endBlock_query startDate_query endDate_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/factory/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2UniswapFactoryV2DTODecoder)



{-| Gets liquidity positions.
-}
uniswapV2GetLiquidityPositionsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.UniswapV2LiquidityPositionV2DTO)
uniswapV2GetLiquidityPositionsHistorical startBlock_query endBlock_query startDate_query endDate_query poolId_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/liquidityPositions/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "poolId", Maybe.map identity poolId_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2LiquidityPositionV2DTODecoder)



{-| Gets liquidity positions snapshots.
-}
uniswapV2GetLiquidityPositionsSnapshotsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.UniswapV2LiquidityPositionSnapshotV2DTO)
uniswapV2GetLiquidityPositionsSnapshotsHistorical startBlock_query endBlock_query startDate_query endDate_query poolId_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/liquidityPositionsSnapshots/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "poolId", Maybe.map identity poolId_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2LiquidityPositionSnapshotV2DTODecoder)



{-| Gets mints.
-}
uniswapV2GetMintsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.UniswapV2MintV2DTO)
uniswapV2GetMintsHistorical startBlock_query endBlock_query startDate_query endDate_query poolId_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/mints/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "poolId", Maybe.map identity poolId_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2MintV2DTODecoder)



{-| Gets pools.
-}
uniswapV2GetPoolsCurrent : Maybe String -> Api.Request (List Api.Data.UniswapV2PairV2DTO)
uniswapV2GetPoolsCurrent filterPoolId_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/pools/current"
        []
        [ ( "filter_pool_id", Maybe.map identity filterPoolId_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2PairV2DTODecoder)



{-| Gets pools day data.
-}
uniswapV2GetPoolsDayDataHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.UniswapV2PairDayDataV2DTO)
uniswapV2GetPoolsDayDataHistorical startBlock_query endBlock_query startDate_query endDate_query poolId_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/poolsDayData/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "poolId", Maybe.map identity poolId_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2PairDayDataV2DTODecoder)



{-| Gets pools.
-}
uniswapV2GetPoolsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.UniswapV2PairV2DTO)
uniswapV2GetPoolsHistorical startBlock_query endBlock_query startDate_query endDate_query poolId_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/pools/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "poolId", Maybe.map identity poolId_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2PairV2DTODecoder)



{-| Gets pools tracked each our.
-}
uniswapV2GetPoolsHourDataHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.UniswapV2PairHourDataV2DTO)
uniswapV2GetPoolsHourDataHistorical startBlock_query endBlock_query startDate_query endDate_query poolId_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/poolsHourData/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "poolId", Maybe.map identity poolId_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2PairHourDataV2DTODecoder)



{-| Gets swaps.
-}
uniswapV2GetSwapsCurrent : Api.Request (List Api.Data.UniswapV2SwapV2DTO)
uniswapV2GetSwapsCurrent =
    Api.request
        "GET"
        "/dapps/uniswapv2/swaps/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2SwapV2DTODecoder)



{-| Gets swaps.
-}
uniswapV2GetSwapsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.UniswapV2SwapV2DTO)
uniswapV2GetSwapsHistorical startBlock_query endBlock_query startDate_query endDate_query poolId_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/swaps/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "poolId", Maybe.map identity poolId_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2SwapV2DTODecoder)



{-| Gets tokens.
-}
uniswapV2GetTokensCurrent : Api.Request (List Api.Data.UniswapV2TokenV2DTO)
uniswapV2GetTokensCurrent =
    Api.request
        "GET"
        "/dapps/uniswapv2/tokens/current"
        []
        []
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2TokenV2DTODecoder)



{-| Gets tokens day data.
-}
uniswapV2GetTokensDayDataHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.UniswapV2TokenDayDataV2DTO)
uniswapV2GetTokensDayDataHistorical startBlock_query endBlock_query startDate_query endDate_query tokenId_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/tokensDayData/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "tokenId", Maybe.map identity tokenId_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2TokenDayDataV2DTODecoder)



{-| Gets tokens.
-}
uniswapV2GetTokensHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Maybe String -> Api.Request (List Api.Data.UniswapV2TokenV2DTO)
uniswapV2GetTokensHistorical startBlock_query endBlock_query startDate_query endDate_query tokenId_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/tokens/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ), ( "tokenId", Maybe.map identity tokenId_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2TokenV2DTODecoder)



{-| Gets transactions.
-}
uniswapV2GetTransactionsHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Api.Request (List Api.Data.UniswapV2TransactionV2DTO)
uniswapV2GetTransactionsHistorical startBlock_query endBlock_query startDate_query endDate_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/transactions/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2TransactionV2DTODecoder)



{-| Gets users.
-}
uniswapV2GetUsersHistorical : Maybe Int -> Maybe Int -> Maybe Posix -> Maybe Posix -> Api.Request (List Api.Data.UniswapV2UserV2DTO)
uniswapV2GetUsersHistorical startBlock_query endBlock_query startDate_query endDate_query =
    Api.request
        "GET"
        "/dapps/uniswapv2/users/historical"
        []
        [ ( "startBlock", Maybe.map String.fromInt startBlock_query ), ( "endBlock", Maybe.map String.fromInt endBlock_query ), ( "startDate", Maybe.map Api.Time.dateTimeToString startDate_query ), ( "endDate", Maybe.map Api.Time.dateTimeToString endDate_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.uniswapV2UserV2DTODecoder)
