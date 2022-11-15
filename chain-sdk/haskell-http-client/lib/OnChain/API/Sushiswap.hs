{-
   OnChain API

    This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

   OpenAPI Version: 3.0.1
   OnChain API API version: v1
   Contact: support@coinapi.io
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : OnChain.API.Sushiswap
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module OnChain.API.Sushiswap where

import OnChain.Core
import OnChain.MimeTypes
import OnChain.Model as M

import qualified Data.Aeson as A
import qualified Data.ByteString as B
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Typeable, TypeRep, typeOf, typeRep)
import qualified Data.Foldable as P
import qualified Data.Map as Map
import qualified Data.Maybe as P
import qualified Data.Proxy as P (Proxy(..))
import qualified Data.Set as Set
import qualified Data.String as P
import qualified Data.Text as T
import qualified Data.Text.Encoding as T
import qualified Data.Text.Lazy as TL
import qualified Data.Text.Lazy.Encoding as TL
import qualified Data.Time as TI
import qualified Network.HTTP.Client.MultipartFormData as NH
import qualified Network.HTTP.Media as ME
import qualified Network.HTTP.Types as NH
import qualified Web.FormUrlEncoded as WH
import qualified Web.HttpApiData as WH

import Data.Text (Text)
import GHC.Base ((<|>))

import Prelude ((==),(/=),($), (.),(<$>),(<*>),(>>=),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)
import qualified Prelude as P

-- * Operations


-- ** Sushiswap

-- *** curveGetExchangesCurrent

-- | @GET \/dapps\/sushiswap\/exchanges\/current@
-- 
-- Exchanges (current) 🔥
-- 
-- Gets exchanges.
-- 
curveGetExchangesCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest CurveGetExchangesCurrent MimeNoContent [CurveExchangeDTO] accept
curveGetExchangesCurrent  _ =
  _mkRequest "GET" ["/dapps/sushiswap/exchanges/current"]

data CurveGetExchangesCurrent  
-- | @application/json@
instance Produces CurveGetExchangesCurrent MimeJSON
-- | @text/json@
instance Produces CurveGetExchangesCurrent MimeTextJson
-- | @text/plain@
instance Produces CurveGetExchangesCurrent MimePlainText


-- *** dexGetTradesCurrent

-- | @GET \/dapps\/sushiswap\/trades\/current@
-- 
-- Trades (current) 🔥
-- 
-- Gets trades.
-- 
dexGetTradesCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexGetTradesCurrent MimeNoContent [DexTradeDTO] accept
dexGetTradesCurrent  _ =
  _mkRequest "GET" ["/dapps/sushiswap/trades/current"]

data DexGetTradesCurrent  
-- | @application/json@
instance Produces DexGetTradesCurrent MimeJSON
-- | @text/json@
instance Produces DexGetTradesCurrent MimeTextJson
-- | @text/plain@
instance Produces DexGetTradesCurrent MimePlainText


-- *** sushiswapGetBundlesHistorical

-- | @GET \/dapps\/sushiswap\/bundles\/historical-manual@
-- 
-- Bundles (historical)
-- 
-- Gets bundles.
-- 
sushiswapGetBundlesHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetBundlesHistorical MimeNoContent [SushiswapBundleDTO] accept
sushiswapGetBundlesHistorical  _ =
  _mkRequest "GET" ["/dapps/sushiswap/bundles/historical-manual"]

data SushiswapGetBundlesHistorical  

-- | /Optional Param/ "startBlock" - AAAAAAAAAA
instance HasOptionalParam SushiswapGetBundlesHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - BBBBBBBBBBBB
instance HasOptionalParam SushiswapGetBundlesHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - CCCCCCCCC
instance HasOptionalParam SushiswapGetBundlesHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - DDDDDDDDDDD
instance HasOptionalParam SushiswapGetBundlesHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
-- | @application/json@
instance Produces SushiswapGetBundlesHistorical MimeJSON
-- | @text/json@
instance Produces SushiswapGetBundlesHistorical MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetBundlesHistorical MimePlainText


-- *** sushiswapGetBurnsHistorical

-- | @GET \/dapps\/sushiswap\/burns\/historical-manual@
-- 
-- Burns (historical)
-- 
-- Gets burns.
-- 
sushiswapGetBurnsHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetBurnsHistorical MimeNoContent [SushiswapBurnDTO] accept
sushiswapGetBurnsHistorical  _ =
  _mkRequest "GET" ["/dapps/sushiswap/burns/historical-manual"]

data SushiswapGetBurnsHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam SushiswapGetBurnsHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam SushiswapGetBurnsHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam SushiswapGetBurnsHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam SushiswapGetBurnsHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "poolId" - 
instance HasOptionalParam SushiswapGetBurnsHistorical PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
-- | @application/json@
instance Produces SushiswapGetBurnsHistorical MimeJSON
-- | @text/json@
instance Produces SushiswapGetBurnsHistorical MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetBurnsHistorical MimePlainText


-- *** sushiswapGetDayDataHistorical

-- | @GET \/dapps\/sushiswap\/dayData\/historical-manual@
-- 
-- DayData (historical)
-- 
-- Gets day data.
-- 
sushiswapGetDayDataHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetDayDataHistorical MimeNoContent [SushiswapDayDataDTO] accept
sushiswapGetDayDataHistorical  _ =
  _mkRequest "GET" ["/dapps/sushiswap/dayData/historical-manual"]

data SushiswapGetDayDataHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam SushiswapGetDayDataHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam SushiswapGetDayDataHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam SushiswapGetDayDataHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam SushiswapGetDayDataHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
-- | @application/json@
instance Produces SushiswapGetDayDataHistorical MimeJSON
-- | @text/json@
instance Produces SushiswapGetDayDataHistorical MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetDayDataHistorical MimePlainText


-- *** sushiswapGetFactoryHistorical

-- | @GET \/dapps\/sushiswap\/factory\/historical-manual@
-- 
-- Factory (historical)
-- 
-- Gets factory.
-- 
sushiswapGetFactoryHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetFactoryHistorical MimeNoContent [SushiswapFactoryDTO] accept
sushiswapGetFactoryHistorical  _ =
  _mkRequest "GET" ["/dapps/sushiswap/factory/historical-manual"]

data SushiswapGetFactoryHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam SushiswapGetFactoryHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam SushiswapGetFactoryHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam SushiswapGetFactoryHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam SushiswapGetFactoryHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
-- | @application/json@
instance Produces SushiswapGetFactoryHistorical MimeJSON
-- | @text/json@
instance Produces SushiswapGetFactoryHistorical MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetFactoryHistorical MimePlainText


-- *** sushiswapGetHourDataHistorical

-- | @GET \/dapps\/sushiswap\/hourData\/historical-manual@
-- 
-- HourData (historical)
-- 
-- Gets hour data.
-- 
sushiswapGetHourDataHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetHourDataHistorical MimeNoContent [SushiswapHourDataDTO] accept
sushiswapGetHourDataHistorical  _ =
  _mkRequest "GET" ["/dapps/sushiswap/hourData/historical-manual"]

data SushiswapGetHourDataHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam SushiswapGetHourDataHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam SushiswapGetHourDataHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam SushiswapGetHourDataHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam SushiswapGetHourDataHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
-- | @application/json@
instance Produces SushiswapGetHourDataHistorical MimeJSON
-- | @text/json@
instance Produces SushiswapGetHourDataHistorical MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetHourDataHistorical MimePlainText


-- *** sushiswapGetLiquidityPositionHistorical

-- | @GET \/dapps\/sushiswap\/liquidityPosition\/historical-manual@
-- 
-- LiquidityPosition (historical)
-- 
-- Gets liquidity position.
-- 
sushiswapGetLiquidityPositionHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetLiquidityPositionHistorical MimeNoContent [SushiswapLiquidityPositionDTO] accept
sushiswapGetLiquidityPositionHistorical  _ =
  _mkRequest "GET" ["/dapps/sushiswap/liquidityPosition/historical-manual"]

data SushiswapGetLiquidityPositionHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam SushiswapGetLiquidityPositionHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam SushiswapGetLiquidityPositionHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam SushiswapGetLiquidityPositionHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam SushiswapGetLiquidityPositionHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "poolId" - 
instance HasOptionalParam SushiswapGetLiquidityPositionHistorical PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
-- | @application/json@
instance Produces SushiswapGetLiquidityPositionHistorical MimeJSON
-- | @text/json@
instance Produces SushiswapGetLiquidityPositionHistorical MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetLiquidityPositionHistorical MimePlainText


-- *** sushiswapGetLiquidityPositionSnapshotHistorical

-- | @GET \/dapps\/sushiswap\/liquidityPositionSnapshots\/historical-manual@
-- 
-- LiquidityPositionSnapshot (historical)
-- 
-- Gets liquidity position snapshot.
-- 
sushiswapGetLiquidityPositionSnapshotHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetLiquidityPositionSnapshotHistorical MimeNoContent [SushiswapLiquidityPositionSnapshotDTO] accept
sushiswapGetLiquidityPositionSnapshotHistorical  _ =
  _mkRequest "GET" ["/dapps/sushiswap/liquidityPositionSnapshots/historical-manual"]

data SushiswapGetLiquidityPositionSnapshotHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam SushiswapGetLiquidityPositionSnapshotHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam SushiswapGetLiquidityPositionSnapshotHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam SushiswapGetLiquidityPositionSnapshotHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam SushiswapGetLiquidityPositionSnapshotHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "poolId" - 
instance HasOptionalParam SushiswapGetLiquidityPositionSnapshotHistorical PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
-- | @application/json@
instance Produces SushiswapGetLiquidityPositionSnapshotHistorical MimeJSON
-- | @text/json@
instance Produces SushiswapGetLiquidityPositionSnapshotHistorical MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetLiquidityPositionSnapshotHistorical MimePlainText


-- *** sushiswapGetMintsHistorical

-- | @GET \/dapps\/sushiswap\/mints\/historical-manual@
-- 
-- Mints (historical)
-- 
-- Gets mints.
-- 
sushiswapGetMintsHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetMintsHistorical MimeNoContent [SushiswapMintDTO] accept
sushiswapGetMintsHistorical  _ =
  _mkRequest "GET" ["/dapps/sushiswap/mints/historical-manual"]

data SushiswapGetMintsHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam SushiswapGetMintsHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam SushiswapGetMintsHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam SushiswapGetMintsHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam SushiswapGetMintsHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "poolId" - 
instance HasOptionalParam SushiswapGetMintsHistorical PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
-- | @application/json@
instance Produces SushiswapGetMintsHistorical MimeJSON
-- | @text/json@
instance Produces SushiswapGetMintsHistorical MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetMintsHistorical MimePlainText


-- *** sushiswapGetPoolsCurrent

-- | @GET \/dapps\/sushiswap\/pools\/current@
-- 
-- Pools (current) 🔥
-- 
-- Gets pools.
-- 
sushiswapGetPoolsCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetPoolsCurrent MimeNoContent [SushiswapPairDTO] accept
sushiswapGetPoolsCurrent  _ =
  _mkRequest "GET" ["/dapps/sushiswap/pools/current"]

data SushiswapGetPoolsCurrent  
-- | @application/json@
instance Produces SushiswapGetPoolsCurrent MimeJSON
-- | @text/json@
instance Produces SushiswapGetPoolsCurrent MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetPoolsCurrent MimePlainText


-- *** sushiswapGetPoolsDayDataHistorical

-- | @GET \/dapps\/sushiswap\/poolsDayData\/historical-manual@
-- 
-- PoolsDayData (historical)
-- 
-- Gets pools day data.
-- 
sushiswapGetPoolsDayDataHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetPoolsDayDataHistorical MimeNoContent [SushiswapPairDayDataDTO] accept
sushiswapGetPoolsDayDataHistorical  _ =
  _mkRequest "GET" ["/dapps/sushiswap/poolsDayData/historical-manual"]

data SushiswapGetPoolsDayDataHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam SushiswapGetPoolsDayDataHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam SushiswapGetPoolsDayDataHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam SushiswapGetPoolsDayDataHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam SushiswapGetPoolsDayDataHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "poolId" - 
instance HasOptionalParam SushiswapGetPoolsDayDataHistorical PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
-- | @application/json@
instance Produces SushiswapGetPoolsDayDataHistorical MimeJSON
-- | @text/json@
instance Produces SushiswapGetPoolsDayDataHistorical MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetPoolsDayDataHistorical MimePlainText


-- *** sushiswapGetPoolsHistorical

-- | @GET \/dapps\/sushiswap\/pools\/historical-manual@
-- 
-- Pools (historical) 🔥
-- 
-- Gets list of pools for given filters.
-- 
sushiswapGetPoolsHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetPoolsHistorical MimeNoContent [SushiswapPairDTO] accept
sushiswapGetPoolsHistorical  _ =
  _mkRequest "GET" ["/dapps/sushiswap/pools/historical-manual"]

data SushiswapGetPoolsHistorical  

-- | /Optional Param/ "startBlock" - The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
instance HasOptionalParam SushiswapGetPoolsHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
instance HasOptionalParam SushiswapGetPoolsHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
instance HasOptionalParam SushiswapGetPoolsHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - The end date of timeframe
instance HasOptionalParam SushiswapGetPoolsHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "poolId" - The pool address.
instance HasOptionalParam SushiswapGetPoolsHistorical PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
-- | @application/json@
instance Produces SushiswapGetPoolsHistorical MimeJSON
-- | @text/json@
instance Produces SushiswapGetPoolsHistorical MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetPoolsHistorical MimePlainText


-- *** sushiswapGetPoolsHourDataHistorical

-- | @GET \/dapps\/sushiswap\/poolsHourData\/historical-manual@
-- 
-- PoolsHourData (historical)
-- 
-- Gets pools tracked each our.
-- 
sushiswapGetPoolsHourDataHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetPoolsHourDataHistorical MimeNoContent [SushiswapPairHourDataDTO] accept
sushiswapGetPoolsHourDataHistorical  _ =
  _mkRequest "GET" ["/dapps/sushiswap/poolsHourData/historical-manual"]

data SushiswapGetPoolsHourDataHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam SushiswapGetPoolsHourDataHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam SushiswapGetPoolsHourDataHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam SushiswapGetPoolsHourDataHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam SushiswapGetPoolsHourDataHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "poolId" - 
instance HasOptionalParam SushiswapGetPoolsHourDataHistorical PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
-- | @application/json@
instance Produces SushiswapGetPoolsHourDataHistorical MimeJSON
-- | @text/json@
instance Produces SushiswapGetPoolsHourDataHistorical MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetPoolsHourDataHistorical MimePlainText


-- *** sushiswapGetSwapsCurrent

-- | @GET \/dapps\/sushiswap\/swaps\/current@
-- 
-- Swaps (current) 🔥
-- 
-- Gets swaps.
-- 
sushiswapGetSwapsCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetSwapsCurrent MimeNoContent [SushiswapSwapDTO] accept
sushiswapGetSwapsCurrent  _ =
  _mkRequest "GET" ["/dapps/sushiswap/swaps/current"]

data SushiswapGetSwapsCurrent  
-- | @application/json@
instance Produces SushiswapGetSwapsCurrent MimeJSON
-- | @text/json@
instance Produces SushiswapGetSwapsCurrent MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetSwapsCurrent MimePlainText


-- *** sushiswapGetSwapsHistorical

-- | @GET \/dapps\/sushiswap\/swaps\/historical-manual@
-- 
-- Swaps (historical) 🔥
-- 
-- Gets list of swaps for given filters.
-- 
sushiswapGetSwapsHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetSwapsHistorical MimeNoContent [SushiswapSwapDTO] accept
sushiswapGetSwapsHistorical  _ =
  _mkRequest "GET" ["/dapps/sushiswap/swaps/historical-manual"]

data SushiswapGetSwapsHistorical  

-- | /Optional Param/ "startBlock" - The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
instance HasOptionalParam SushiswapGetSwapsHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
instance HasOptionalParam SushiswapGetSwapsHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
instance HasOptionalParam SushiswapGetSwapsHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - The end date of timeframe
instance HasOptionalParam SushiswapGetSwapsHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "poolId" - The pool address.
instance HasOptionalParam SushiswapGetSwapsHistorical PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
-- | @application/json@
instance Produces SushiswapGetSwapsHistorical MimeJSON
-- | @text/json@
instance Produces SushiswapGetSwapsHistorical MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetSwapsHistorical MimePlainText


-- *** sushiswapGetTokensCurrent

-- | @GET \/dapps\/sushiswap\/tokens\/current@
-- 
-- Tokens (current) 🔥
-- 
-- Gets tokens.
-- 
sushiswapGetTokensCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetTokensCurrent MimeNoContent [SushiswapTokenDTO] accept
sushiswapGetTokensCurrent  _ =
  _mkRequest "GET" ["/dapps/sushiswap/tokens/current"]

data SushiswapGetTokensCurrent  
-- | @application/json@
instance Produces SushiswapGetTokensCurrent MimeJSON
-- | @text/json@
instance Produces SushiswapGetTokensCurrent MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetTokensCurrent MimePlainText


-- *** sushiswapGetTokensDayDataHistorical

-- | @GET \/dapps\/sushiswap\/tokensDayData\/historical-manual@
-- 
-- TokensDayData (historical)
-- 
-- Gets tokens day data.
-- 
sushiswapGetTokensDayDataHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetTokensDayDataHistorical MimeNoContent [SushiswapTokenDayDataDTO] accept
sushiswapGetTokensDayDataHistorical  _ =
  _mkRequest "GET" ["/dapps/sushiswap/tokensDayData/historical-manual"]

data SushiswapGetTokensDayDataHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam SushiswapGetTokensDayDataHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam SushiswapGetTokensDayDataHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam SushiswapGetTokensDayDataHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam SushiswapGetTokensDayDataHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "tokenId" - 
instance HasOptionalParam SushiswapGetTokensDayDataHistorical TokenId where
  applyOptionalParam req (TokenId xs) =
    req `addQuery` toQuery ("tokenId", Just xs)
-- | @application/json@
instance Produces SushiswapGetTokensDayDataHistorical MimeJSON
-- | @text/json@
instance Produces SushiswapGetTokensDayDataHistorical MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetTokensDayDataHistorical MimePlainText


-- *** sushiswapGetTokensHistorical

-- | @GET \/dapps\/sushiswap\/tokens\/historical-manual@
-- 
-- Tokens (historical) 🔥
-- 
-- Gets list of tokens for given filters.
-- 
sushiswapGetTokensHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetTokensHistorical MimeNoContent [SushiswapTokenDTO] accept
sushiswapGetTokensHistorical  _ =
  _mkRequest "GET" ["/dapps/sushiswap/tokens/historical-manual"]

data SushiswapGetTokensHistorical  

-- | /Optional Param/ "startBlock" - The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
instance HasOptionalParam SushiswapGetTokensHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
instance HasOptionalParam SushiswapGetTokensHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
instance HasOptionalParam SushiswapGetTokensHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - The end date of timeframe
instance HasOptionalParam SushiswapGetTokensHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "tokenId" - The token address.
instance HasOptionalParam SushiswapGetTokensHistorical TokenId where
  applyOptionalParam req (TokenId xs) =
    req `addQuery` toQuery ("tokenId", Just xs)
-- | @application/json@
instance Produces SushiswapGetTokensHistorical MimeJSON
-- | @text/json@
instance Produces SushiswapGetTokensHistorical MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetTokensHistorical MimePlainText


-- *** sushiswapGetTransactionsHistorical

-- | @GET \/dapps\/sushiswap\/transactions\/historical-manual@
-- 
-- Transactions (historical)
-- 
-- Gets transactions.
-- 
sushiswapGetTransactionsHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetTransactionsHistorical MimeNoContent [SushiswapTransactionDTO] accept
sushiswapGetTransactionsHistorical  _ =
  _mkRequest "GET" ["/dapps/sushiswap/transactions/historical-manual"]

data SushiswapGetTransactionsHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam SushiswapGetTransactionsHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam SushiswapGetTransactionsHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam SushiswapGetTransactionsHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam SushiswapGetTransactionsHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
-- | @application/json@
instance Produces SushiswapGetTransactionsHistorical MimeJSON
-- | @text/json@
instance Produces SushiswapGetTransactionsHistorical MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetTransactionsHistorical MimePlainText


-- *** sushiswapGetUsersHistorical

-- | @GET \/dapps\/sushiswap\/users\/historical-manual@
-- 
-- Users (historical)
-- 
-- Gets users.
-- 
sushiswapGetUsersHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetUsersHistorical MimeNoContent [SushiswapUserDTO] accept
sushiswapGetUsersHistorical  _ =
  _mkRequest "GET" ["/dapps/sushiswap/users/historical-manual"]

data SushiswapGetUsersHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam SushiswapGetUsersHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam SushiswapGetUsersHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam SushiswapGetUsersHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam SushiswapGetUsersHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
-- | @application/json@
instance Produces SushiswapGetUsersHistorical MimeJSON
-- | @text/json@
instance Produces SushiswapGetUsersHistorical MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetUsersHistorical MimePlainText

