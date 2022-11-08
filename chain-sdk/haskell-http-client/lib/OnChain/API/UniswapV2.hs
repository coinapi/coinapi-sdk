{-
   OnChain API

    This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

   OpenAPI Version: 3.0.1
   OnChain API API version: v1
   Contact: support@coinapi.io
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : OnChain.API.UniswapV2
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module OnChain.API.UniswapV2 where

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


-- ** UniswapV2

-- *** uniswapV2GetBundlesHistorical

-- | @GET \/dapps\/uniswapv2\/bundles\/historical@
-- 
-- GetBundles (historical)
-- 
-- Gets bundles.
-- 
uniswapV2GetBundlesHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest UniswapV2GetBundlesHistorical MimeNoContent [UniswapV2BundleV2DTO] accept
uniswapV2GetBundlesHistorical  _ =
  _mkRequest "GET" ["/dapps/uniswapv2/bundles/historical"]

data UniswapV2GetBundlesHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam UniswapV2GetBundlesHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam UniswapV2GetBundlesHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam UniswapV2GetBundlesHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam UniswapV2GetBundlesHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
-- | @application/json@
instance Produces UniswapV2GetBundlesHistorical MimeJSON
-- | @text/json@
instance Produces UniswapV2GetBundlesHistorical MimeTextJson
-- | @text/plain@
instance Produces UniswapV2GetBundlesHistorical MimePlainText


-- *** uniswapV2GetBurnsHistorical

-- | @GET \/dapps\/uniswapv2\/burns\/historical@
-- 
-- GetBurns (historical)
-- 
-- Gets burns.
-- 
uniswapV2GetBurnsHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest UniswapV2GetBurnsHistorical MimeNoContent [UniswapV2BurnV2DTO] accept
uniswapV2GetBurnsHistorical  _ =
  _mkRequest "GET" ["/dapps/uniswapv2/burns/historical"]

data UniswapV2GetBurnsHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam UniswapV2GetBurnsHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam UniswapV2GetBurnsHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam UniswapV2GetBurnsHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam UniswapV2GetBurnsHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "poolId" - 
instance HasOptionalParam UniswapV2GetBurnsHistorical PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
-- | @application/json@
instance Produces UniswapV2GetBurnsHistorical MimeJSON
-- | @text/json@
instance Produces UniswapV2GetBurnsHistorical MimeTextJson
-- | @text/plain@
instance Produces UniswapV2GetBurnsHistorical MimePlainText


-- *** uniswapV2GetDayDataHistorical

-- | @GET \/dapps\/uniswapv2\/dayData\/historical@
-- 
-- GetDayData (historical)
-- 
-- Gets uniswapv2 day data.
-- 
uniswapV2GetDayDataHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest UniswapV2GetDayDataHistorical MimeNoContent [UniswapV2UniswapDayDataV2DTO] accept
uniswapV2GetDayDataHistorical  _ =
  _mkRequest "GET" ["/dapps/uniswapv2/dayData/historical"]

data UniswapV2GetDayDataHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam UniswapV2GetDayDataHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam UniswapV2GetDayDataHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam UniswapV2GetDayDataHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam UniswapV2GetDayDataHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
-- | @application/json@
instance Produces UniswapV2GetDayDataHistorical MimeJSON
-- | @text/json@
instance Produces UniswapV2GetDayDataHistorical MimeTextJson
-- | @text/plain@
instance Produces UniswapV2GetDayDataHistorical MimePlainText


-- *** uniswapV2GetFactoryHistorical

-- | @GET \/dapps\/uniswapv2\/factory\/historical@
-- 
-- GetFactory (historical)
-- 
-- Gets factory.
-- 
uniswapV2GetFactoryHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest UniswapV2GetFactoryHistorical MimeNoContent [UniswapV2UniswapFactoryV2DTO] accept
uniswapV2GetFactoryHistorical  _ =
  _mkRequest "GET" ["/dapps/uniswapv2/factory/historical"]

data UniswapV2GetFactoryHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam UniswapV2GetFactoryHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam UniswapV2GetFactoryHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam UniswapV2GetFactoryHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam UniswapV2GetFactoryHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
-- | @application/json@
instance Produces UniswapV2GetFactoryHistorical MimeJSON
-- | @text/json@
instance Produces UniswapV2GetFactoryHistorical MimeTextJson
-- | @text/plain@
instance Produces UniswapV2GetFactoryHistorical MimePlainText


-- *** uniswapV2GetLiquidityPositionsHistorical

-- | @GET \/dapps\/uniswapv2\/liquidityPositions\/historical@
-- 
-- GetLiquidityPositions (historical)
-- 
-- Gets liquidity positions.
-- 
uniswapV2GetLiquidityPositionsHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest UniswapV2GetLiquidityPositionsHistorical MimeNoContent [UniswapV2LiquidityPositionV2DTO] accept
uniswapV2GetLiquidityPositionsHistorical  _ =
  _mkRequest "GET" ["/dapps/uniswapv2/liquidityPositions/historical"]

data UniswapV2GetLiquidityPositionsHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam UniswapV2GetLiquidityPositionsHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam UniswapV2GetLiquidityPositionsHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam UniswapV2GetLiquidityPositionsHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam UniswapV2GetLiquidityPositionsHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "poolId" - 
instance HasOptionalParam UniswapV2GetLiquidityPositionsHistorical PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
-- | @application/json@
instance Produces UniswapV2GetLiquidityPositionsHistorical MimeJSON
-- | @text/json@
instance Produces UniswapV2GetLiquidityPositionsHistorical MimeTextJson
-- | @text/plain@
instance Produces UniswapV2GetLiquidityPositionsHistorical MimePlainText


-- *** uniswapV2GetLiquidityPositionsSnapshotsHistorical

-- | @GET \/dapps\/uniswapv2\/liquidityPositionsSnapshots\/historical@
-- 
-- GetLiquidityPositionsSnapshots (historical)
-- 
-- Gets liquidity positions snapshots.
-- 
uniswapV2GetLiquidityPositionsSnapshotsHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest UniswapV2GetLiquidityPositionsSnapshotsHistorical MimeNoContent [UniswapV2LiquidityPositionSnapshotV2DTO] accept
uniswapV2GetLiquidityPositionsSnapshotsHistorical  _ =
  _mkRequest "GET" ["/dapps/uniswapv2/liquidityPositionsSnapshots/historical"]

data UniswapV2GetLiquidityPositionsSnapshotsHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam UniswapV2GetLiquidityPositionsSnapshotsHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam UniswapV2GetLiquidityPositionsSnapshotsHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam UniswapV2GetLiquidityPositionsSnapshotsHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam UniswapV2GetLiquidityPositionsSnapshotsHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "poolId" - 
instance HasOptionalParam UniswapV2GetLiquidityPositionsSnapshotsHistorical PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
-- | @application/json@
instance Produces UniswapV2GetLiquidityPositionsSnapshotsHistorical MimeJSON
-- | @text/json@
instance Produces UniswapV2GetLiquidityPositionsSnapshotsHistorical MimeTextJson
-- | @text/plain@
instance Produces UniswapV2GetLiquidityPositionsSnapshotsHistorical MimePlainText


-- *** uniswapV2GetMintsHistorical

-- | @GET \/dapps\/uniswapv2\/mints\/historical@
-- 
-- GetMints (historical)
-- 
-- Gets mints.
-- 
uniswapV2GetMintsHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest UniswapV2GetMintsHistorical MimeNoContent [UniswapV2MintV2DTO] accept
uniswapV2GetMintsHistorical  _ =
  _mkRequest "GET" ["/dapps/uniswapv2/mints/historical"]

data UniswapV2GetMintsHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam UniswapV2GetMintsHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam UniswapV2GetMintsHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam UniswapV2GetMintsHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam UniswapV2GetMintsHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "poolId" - 
instance HasOptionalParam UniswapV2GetMintsHistorical PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
-- | @application/json@
instance Produces UniswapV2GetMintsHistorical MimeJSON
-- | @text/json@
instance Produces UniswapV2GetMintsHistorical MimeTextJson
-- | @text/plain@
instance Produces UniswapV2GetMintsHistorical MimePlainText


-- *** uniswapV2GetPoolsCurrent

-- | @GET \/dapps\/uniswapv2\/pools\/current@
-- 
-- GetPools (current) 🔥
-- 
-- Gets pools.
-- 
uniswapV2GetPoolsCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest UniswapV2GetPoolsCurrent MimeNoContent [UniswapV2PairV2DTO] accept
uniswapV2GetPoolsCurrent  _ =
  _mkRequest "GET" ["/dapps/uniswapv2/pools/current"]

data UniswapV2GetPoolsCurrent  
instance HasOptionalParam UniswapV2GetPoolsCurrent FilterPoolId where
  applyOptionalParam req (FilterPoolId xs) =
    req `addQuery` toQuery ("filter_pool_id", Just xs)
-- | @application/json@
instance Produces UniswapV2GetPoolsCurrent MimeJSON
-- | @text/json@
instance Produces UniswapV2GetPoolsCurrent MimeTextJson
-- | @text/plain@
instance Produces UniswapV2GetPoolsCurrent MimePlainText


-- *** uniswapV2GetPoolsDayDataHistorical

-- | @GET \/dapps\/uniswapv2\/poolsDayData\/historical@
-- 
-- GetPoolsDayData (historical)
-- 
-- Gets pools day data.
-- 
uniswapV2GetPoolsDayDataHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest UniswapV2GetPoolsDayDataHistorical MimeNoContent [UniswapV2PairDayDataV2DTO] accept
uniswapV2GetPoolsDayDataHistorical  _ =
  _mkRequest "GET" ["/dapps/uniswapv2/poolsDayData/historical"]

data UniswapV2GetPoolsDayDataHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam UniswapV2GetPoolsDayDataHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam UniswapV2GetPoolsDayDataHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam UniswapV2GetPoolsDayDataHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam UniswapV2GetPoolsDayDataHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "poolId" - 
instance HasOptionalParam UniswapV2GetPoolsDayDataHistorical PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
-- | @application/json@
instance Produces UniswapV2GetPoolsDayDataHistorical MimeJSON
-- | @text/json@
instance Produces UniswapV2GetPoolsDayDataHistorical MimeTextJson
-- | @text/plain@
instance Produces UniswapV2GetPoolsDayDataHistorical MimePlainText


-- *** uniswapV2GetPoolsHistorical

-- | @GET \/dapps\/uniswapv2\/pools\/historical@
-- 
-- GetPools (historical) 🔥
-- 
-- Gets pools.
-- 
uniswapV2GetPoolsHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest UniswapV2GetPoolsHistorical MimeNoContent [UniswapV2PairV2DTO] accept
uniswapV2GetPoolsHistorical  _ =
  _mkRequest "GET" ["/dapps/uniswapv2/pools/historical"]

data UniswapV2GetPoolsHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam UniswapV2GetPoolsHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam UniswapV2GetPoolsHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam UniswapV2GetPoolsHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam UniswapV2GetPoolsHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "poolId" - 
instance HasOptionalParam UniswapV2GetPoolsHistorical PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
-- | @application/json@
instance Produces UniswapV2GetPoolsHistorical MimeJSON
-- | @text/json@
instance Produces UniswapV2GetPoolsHistorical MimeTextJson
-- | @text/plain@
instance Produces UniswapV2GetPoolsHistorical MimePlainText


-- *** uniswapV2GetPoolsHourDataHistorical

-- | @GET \/dapps\/uniswapv2\/poolsHourData\/historical@
-- 
-- GetPoolsHourData (historical)
-- 
-- Gets pools tracked each our.
-- 
uniswapV2GetPoolsHourDataHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest UniswapV2GetPoolsHourDataHistorical MimeNoContent [UniswapV2PairHourDataV2DTO] accept
uniswapV2GetPoolsHourDataHistorical  _ =
  _mkRequest "GET" ["/dapps/uniswapv2/poolsHourData/historical"]

data UniswapV2GetPoolsHourDataHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam UniswapV2GetPoolsHourDataHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam UniswapV2GetPoolsHourDataHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam UniswapV2GetPoolsHourDataHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam UniswapV2GetPoolsHourDataHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "poolId" - 
instance HasOptionalParam UniswapV2GetPoolsHourDataHistorical PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
-- | @application/json@
instance Produces UniswapV2GetPoolsHourDataHistorical MimeJSON
-- | @text/json@
instance Produces UniswapV2GetPoolsHourDataHistorical MimeTextJson
-- | @text/plain@
instance Produces UniswapV2GetPoolsHourDataHistorical MimePlainText


-- *** uniswapV2GetSwapsCurrent

-- | @GET \/dapps\/uniswapv2\/swaps\/current@
-- 
-- GetSwaps (current) 🔥
-- 
-- Gets swaps.
-- 
uniswapV2GetSwapsCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest UniswapV2GetSwapsCurrent MimeNoContent [UniswapV2SwapV2DTO] accept
uniswapV2GetSwapsCurrent  _ =
  _mkRequest "GET" ["/dapps/uniswapv2/swaps/current"]

data UniswapV2GetSwapsCurrent  
-- | @application/json@
instance Produces UniswapV2GetSwapsCurrent MimeJSON
-- | @text/json@
instance Produces UniswapV2GetSwapsCurrent MimeTextJson
-- | @text/plain@
instance Produces UniswapV2GetSwapsCurrent MimePlainText


-- *** uniswapV2GetSwapsHistorical

-- | @GET \/dapps\/uniswapv2\/swaps\/historical@
-- 
-- GetSwaps (historical) 🔥
-- 
-- Gets swaps.
-- 
uniswapV2GetSwapsHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest UniswapV2GetSwapsHistorical MimeNoContent [UniswapV2SwapV2DTO] accept
uniswapV2GetSwapsHistorical  _ =
  _mkRequest "GET" ["/dapps/uniswapv2/swaps/historical"]

data UniswapV2GetSwapsHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam UniswapV2GetSwapsHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam UniswapV2GetSwapsHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam UniswapV2GetSwapsHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam UniswapV2GetSwapsHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "poolId" - 
instance HasOptionalParam UniswapV2GetSwapsHistorical PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
-- | @application/json@
instance Produces UniswapV2GetSwapsHistorical MimeJSON
-- | @text/json@
instance Produces UniswapV2GetSwapsHistorical MimeTextJson
-- | @text/plain@
instance Produces UniswapV2GetSwapsHistorical MimePlainText


-- *** uniswapV2GetTokensCurrent

-- | @GET \/dapps\/uniswapv2\/tokens\/current@
-- 
-- GetTokens (current) 🔥
-- 
-- Gets tokens.
-- 
uniswapV2GetTokensCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest UniswapV2GetTokensCurrent MimeNoContent [UniswapV2TokenV2DTO] accept
uniswapV2GetTokensCurrent  _ =
  _mkRequest "GET" ["/dapps/uniswapv2/tokens/current"]

data UniswapV2GetTokensCurrent  
-- | @application/json@
instance Produces UniswapV2GetTokensCurrent MimeJSON
-- | @text/json@
instance Produces UniswapV2GetTokensCurrent MimeTextJson
-- | @text/plain@
instance Produces UniswapV2GetTokensCurrent MimePlainText


-- *** uniswapV2GetTokensDayDataHistorical

-- | @GET \/dapps\/uniswapv2\/tokensDayData\/historical@
-- 
-- GetTokensDayData (historical)
-- 
-- Gets tokens day data.
-- 
uniswapV2GetTokensDayDataHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest UniswapV2GetTokensDayDataHistorical MimeNoContent [UniswapV2TokenDayDataV2DTO] accept
uniswapV2GetTokensDayDataHistorical  _ =
  _mkRequest "GET" ["/dapps/uniswapv2/tokensDayData/historical"]

data UniswapV2GetTokensDayDataHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam UniswapV2GetTokensDayDataHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam UniswapV2GetTokensDayDataHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam UniswapV2GetTokensDayDataHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam UniswapV2GetTokensDayDataHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "tokenId" - 
instance HasOptionalParam UniswapV2GetTokensDayDataHistorical TokenId where
  applyOptionalParam req (TokenId xs) =
    req `addQuery` toQuery ("tokenId", Just xs)
-- | @application/json@
instance Produces UniswapV2GetTokensDayDataHistorical MimeJSON
-- | @text/json@
instance Produces UniswapV2GetTokensDayDataHistorical MimeTextJson
-- | @text/plain@
instance Produces UniswapV2GetTokensDayDataHistorical MimePlainText


-- *** uniswapV2GetTokensHistorical

-- | @GET \/dapps\/uniswapv2\/tokens\/historical@
-- 
-- GetTokens (historical) 🔥
-- 
-- Gets tokens.
-- 
uniswapV2GetTokensHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest UniswapV2GetTokensHistorical MimeNoContent [UniswapV2TokenV2DTO] accept
uniswapV2GetTokensHistorical  _ =
  _mkRequest "GET" ["/dapps/uniswapv2/tokens/historical"]

data UniswapV2GetTokensHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam UniswapV2GetTokensHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam UniswapV2GetTokensHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam UniswapV2GetTokensHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam UniswapV2GetTokensHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "tokenId" - 
instance HasOptionalParam UniswapV2GetTokensHistorical TokenId where
  applyOptionalParam req (TokenId xs) =
    req `addQuery` toQuery ("tokenId", Just xs)
-- | @application/json@
instance Produces UniswapV2GetTokensHistorical MimeJSON
-- | @text/json@
instance Produces UniswapV2GetTokensHistorical MimeTextJson
-- | @text/plain@
instance Produces UniswapV2GetTokensHistorical MimePlainText


-- *** uniswapV2GetTransactionsHistorical

-- | @GET \/dapps\/uniswapv2\/transactions\/historical@
-- 
-- GetTransactions (historical)
-- 
-- Gets transactions.
-- 
uniswapV2GetTransactionsHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest UniswapV2GetTransactionsHistorical MimeNoContent [UniswapV2TransactionV2DTO] accept
uniswapV2GetTransactionsHistorical  _ =
  _mkRequest "GET" ["/dapps/uniswapv2/transactions/historical"]

data UniswapV2GetTransactionsHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam UniswapV2GetTransactionsHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam UniswapV2GetTransactionsHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam UniswapV2GetTransactionsHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam UniswapV2GetTransactionsHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
-- | @application/json@
instance Produces UniswapV2GetTransactionsHistorical MimeJSON
-- | @text/json@
instance Produces UniswapV2GetTransactionsHistorical MimeTextJson
-- | @text/plain@
instance Produces UniswapV2GetTransactionsHistorical MimePlainText


-- *** uniswapV2GetUsersHistorical

-- | @GET \/dapps\/uniswapv2\/users\/historical@
-- 
-- GetUsers (historical)
-- 
-- Gets users.
-- 
uniswapV2GetUsersHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest UniswapV2GetUsersHistorical MimeNoContent [UniswapV2UserV2DTO] accept
uniswapV2GetUsersHistorical  _ =
  _mkRequest "GET" ["/dapps/uniswapv2/users/historical"]

data UniswapV2GetUsersHistorical  

-- | /Optional Param/ "startBlock" - 
instance HasOptionalParam UniswapV2GetUsersHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - 
instance HasOptionalParam UniswapV2GetUsersHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - 
instance HasOptionalParam UniswapV2GetUsersHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - 
instance HasOptionalParam UniswapV2GetUsersHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
-- | @application/json@
instance Produces UniswapV2GetUsersHistorical MimeJSON
-- | @text/json@
instance Produces UniswapV2GetUsersHistorical MimeTextJson
-- | @text/plain@
instance Produces UniswapV2GetUsersHistorical MimePlainText

