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

-- *** dappsSushiswapBundlesHistoricalGet

-- | @GET \/dapps\/sushiswap\/bundles\/historical@
-- 
dappsSushiswapBundlesHistoricalGet
  :: OnChainRequest DappsSushiswapBundlesHistoricalGet MimeNoContent NoContent MimeNoContent
dappsSushiswapBundlesHistoricalGet =
  _mkRequest "GET" ["/dapps/sushiswap/bundles/historical"]

data DappsSushiswapBundlesHistoricalGet  
instance HasOptionalParam DappsSushiswapBundlesHistoricalGet StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam DappsSushiswapBundlesHistoricalGet EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam DappsSushiswapBundlesHistoricalGet StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam DappsSushiswapBundlesHistoricalGet EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance Produces DappsSushiswapBundlesHistoricalGet MimeNoContent


-- *** dappsSushiswapBurnsHistoricalGet

-- | @GET \/dapps\/sushiswap\/burns\/historical@
-- 
dappsSushiswapBurnsHistoricalGet
  :: OnChainRequest DappsSushiswapBurnsHistoricalGet MimeNoContent NoContent MimeNoContent
dappsSushiswapBurnsHistoricalGet =
  _mkRequest "GET" ["/dapps/sushiswap/burns/historical"]

data DappsSushiswapBurnsHistoricalGet  
instance HasOptionalParam DappsSushiswapBurnsHistoricalGet StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam DappsSushiswapBurnsHistoricalGet EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam DappsSushiswapBurnsHistoricalGet StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam DappsSushiswapBurnsHistoricalGet EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance HasOptionalParam DappsSushiswapBurnsHistoricalGet PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
instance Produces DappsSushiswapBurnsHistoricalGet MimeNoContent


-- *** dappsSushiswapDayDataHistoricalGet

-- | @GET \/dapps\/sushiswap\/dayData\/historical@
-- 
dappsSushiswapDayDataHistoricalGet
  :: OnChainRequest DappsSushiswapDayDataHistoricalGet MimeNoContent NoContent MimeNoContent
dappsSushiswapDayDataHistoricalGet =
  _mkRequest "GET" ["/dapps/sushiswap/dayData/historical"]

data DappsSushiswapDayDataHistoricalGet  
instance HasOptionalParam DappsSushiswapDayDataHistoricalGet StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam DappsSushiswapDayDataHistoricalGet EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam DappsSushiswapDayDataHistoricalGet StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam DappsSushiswapDayDataHistoricalGet EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance Produces DappsSushiswapDayDataHistoricalGet MimeNoContent


-- *** dappsSushiswapFactoryHistoricalGet

-- | @GET \/dapps\/sushiswap\/factory\/historical@
-- 
dappsSushiswapFactoryHistoricalGet
  :: OnChainRequest DappsSushiswapFactoryHistoricalGet MimeNoContent NoContent MimeNoContent
dappsSushiswapFactoryHistoricalGet =
  _mkRequest "GET" ["/dapps/sushiswap/factory/historical"]

data DappsSushiswapFactoryHistoricalGet  
instance HasOptionalParam DappsSushiswapFactoryHistoricalGet StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam DappsSushiswapFactoryHistoricalGet EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam DappsSushiswapFactoryHistoricalGet StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam DappsSushiswapFactoryHistoricalGet EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance Produces DappsSushiswapFactoryHistoricalGet MimeNoContent


-- *** dappsSushiswapHourDataHistoricalGet

-- | @GET \/dapps\/sushiswap\/hourData\/historical@
-- 
dappsSushiswapHourDataHistoricalGet
  :: OnChainRequest DappsSushiswapHourDataHistoricalGet MimeNoContent NoContent MimeNoContent
dappsSushiswapHourDataHistoricalGet =
  _mkRequest "GET" ["/dapps/sushiswap/hourData/historical"]

data DappsSushiswapHourDataHistoricalGet  
instance HasOptionalParam DappsSushiswapHourDataHistoricalGet StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam DappsSushiswapHourDataHistoricalGet EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam DappsSushiswapHourDataHistoricalGet StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam DappsSushiswapHourDataHistoricalGet EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance Produces DappsSushiswapHourDataHistoricalGet MimeNoContent


-- *** dappsSushiswapLiquidityPositionHistoricalGet

-- | @GET \/dapps\/sushiswap\/liquidityPosition\/historical@
-- 
dappsSushiswapLiquidityPositionHistoricalGet
  :: OnChainRequest DappsSushiswapLiquidityPositionHistoricalGet MimeNoContent NoContent MimeNoContent
dappsSushiswapLiquidityPositionHistoricalGet =
  _mkRequest "GET" ["/dapps/sushiswap/liquidityPosition/historical"]

data DappsSushiswapLiquidityPositionHistoricalGet  
instance HasOptionalParam DappsSushiswapLiquidityPositionHistoricalGet StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam DappsSushiswapLiquidityPositionHistoricalGet EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam DappsSushiswapLiquidityPositionHistoricalGet StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam DappsSushiswapLiquidityPositionHistoricalGet EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance HasOptionalParam DappsSushiswapLiquidityPositionHistoricalGet PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
instance Produces DappsSushiswapLiquidityPositionHistoricalGet MimeNoContent


-- *** dappsSushiswapLiquidityPositionSnapshotsHistoricalGet

-- | @GET \/dapps\/sushiswap\/liquidityPositionSnapshots\/historical@
-- 
dappsSushiswapLiquidityPositionSnapshotsHistoricalGet
  :: OnChainRequest DappsSushiswapLiquidityPositionSnapshotsHistoricalGet MimeNoContent NoContent MimeNoContent
dappsSushiswapLiquidityPositionSnapshotsHistoricalGet =
  _mkRequest "GET" ["/dapps/sushiswap/liquidityPositionSnapshots/historical"]

data DappsSushiswapLiquidityPositionSnapshotsHistoricalGet  
instance HasOptionalParam DappsSushiswapLiquidityPositionSnapshotsHistoricalGet StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam DappsSushiswapLiquidityPositionSnapshotsHistoricalGet EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam DappsSushiswapLiquidityPositionSnapshotsHistoricalGet StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam DappsSushiswapLiquidityPositionSnapshotsHistoricalGet EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance HasOptionalParam DappsSushiswapLiquidityPositionSnapshotsHistoricalGet PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
instance Produces DappsSushiswapLiquidityPositionSnapshotsHistoricalGet MimeNoContent


-- *** dappsSushiswapMintsHistoricalGet

-- | @GET \/dapps\/sushiswap\/mints\/historical@
-- 
dappsSushiswapMintsHistoricalGet
  :: OnChainRequest DappsSushiswapMintsHistoricalGet MimeNoContent NoContent MimeNoContent
dappsSushiswapMintsHistoricalGet =
  _mkRequest "GET" ["/dapps/sushiswap/mints/historical"]

data DappsSushiswapMintsHistoricalGet  
instance HasOptionalParam DappsSushiswapMintsHistoricalGet StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam DappsSushiswapMintsHistoricalGet EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam DappsSushiswapMintsHistoricalGet StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam DappsSushiswapMintsHistoricalGet EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance HasOptionalParam DappsSushiswapMintsHistoricalGet PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
instance Produces DappsSushiswapMintsHistoricalGet MimeNoContent


-- *** dappsSushiswapPoolDayDataHistoricalGet

-- | @GET \/dapps\/sushiswap\/poolDayData\/historical@
-- 
dappsSushiswapPoolDayDataHistoricalGet
  :: OnChainRequest DappsSushiswapPoolDayDataHistoricalGet MimeNoContent NoContent MimeNoContent
dappsSushiswapPoolDayDataHistoricalGet =
  _mkRequest "GET" ["/dapps/sushiswap/poolDayData/historical"]

data DappsSushiswapPoolDayDataHistoricalGet  
instance HasOptionalParam DappsSushiswapPoolDayDataHistoricalGet StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam DappsSushiswapPoolDayDataHistoricalGet EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam DappsSushiswapPoolDayDataHistoricalGet StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam DappsSushiswapPoolDayDataHistoricalGet EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance HasOptionalParam DappsSushiswapPoolDayDataHistoricalGet PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
instance Produces DappsSushiswapPoolDayDataHistoricalGet MimeNoContent


-- *** dappsSushiswapPoolHourDataHistoricalGet

-- | @GET \/dapps\/sushiswap\/poolHourData\/historical@
-- 
dappsSushiswapPoolHourDataHistoricalGet
  :: OnChainRequest DappsSushiswapPoolHourDataHistoricalGet MimeNoContent NoContent MimeNoContent
dappsSushiswapPoolHourDataHistoricalGet =
  _mkRequest "GET" ["/dapps/sushiswap/poolHourData/historical"]

data DappsSushiswapPoolHourDataHistoricalGet  
instance HasOptionalParam DappsSushiswapPoolHourDataHistoricalGet StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam DappsSushiswapPoolHourDataHistoricalGet EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam DappsSushiswapPoolHourDataHistoricalGet StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam DappsSushiswapPoolHourDataHistoricalGet EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance HasOptionalParam DappsSushiswapPoolHourDataHistoricalGet PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
instance Produces DappsSushiswapPoolHourDataHistoricalGet MimeNoContent


-- *** dappsSushiswapTokenDayDataHistoricalGet

-- | @GET \/dapps\/sushiswap\/tokenDayData\/historical@
-- 
dappsSushiswapTokenDayDataHistoricalGet
  :: OnChainRequest DappsSushiswapTokenDayDataHistoricalGet MimeNoContent NoContent MimeNoContent
dappsSushiswapTokenDayDataHistoricalGet =
  _mkRequest "GET" ["/dapps/sushiswap/tokenDayData/historical"]

data DappsSushiswapTokenDayDataHistoricalGet  
instance HasOptionalParam DappsSushiswapTokenDayDataHistoricalGet StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam DappsSushiswapTokenDayDataHistoricalGet EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam DappsSushiswapTokenDayDataHistoricalGet StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam DappsSushiswapTokenDayDataHistoricalGet EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance HasOptionalParam DappsSushiswapTokenDayDataHistoricalGet TokenId where
  applyOptionalParam req (TokenId xs) =
    req `addQuery` toQuery ("tokenId", Just xs)
instance Produces DappsSushiswapTokenDayDataHistoricalGet MimeNoContent


-- *** dappsSushiswapTransactionsHistoricalGet

-- | @GET \/dapps\/sushiswap\/transactions\/historical@
-- 
dappsSushiswapTransactionsHistoricalGet
  :: OnChainRequest DappsSushiswapTransactionsHistoricalGet MimeNoContent NoContent MimeNoContent
dappsSushiswapTransactionsHistoricalGet =
  _mkRequest "GET" ["/dapps/sushiswap/transactions/historical"]

data DappsSushiswapTransactionsHistoricalGet  
instance HasOptionalParam DappsSushiswapTransactionsHistoricalGet StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam DappsSushiswapTransactionsHistoricalGet EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam DappsSushiswapTransactionsHistoricalGet StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam DappsSushiswapTransactionsHistoricalGet EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance Produces DappsSushiswapTransactionsHistoricalGet MimeNoContent


-- *** dappsSushiswapUsersHistoricalGet

-- | @GET \/dapps\/sushiswap\/users\/historical@
-- 
dappsSushiswapUsersHistoricalGet
  :: OnChainRequest DappsSushiswapUsersHistoricalGet MimeNoContent NoContent MimeNoContent
dappsSushiswapUsersHistoricalGet =
  _mkRequest "GET" ["/dapps/sushiswap/users/historical"]

data DappsSushiswapUsersHistoricalGet  
instance HasOptionalParam DappsSushiswapUsersHistoricalGet StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam DappsSushiswapUsersHistoricalGet EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam DappsSushiswapUsersHistoricalGet StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam DappsSushiswapUsersHistoricalGet EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance Produces DappsSushiswapUsersHistoricalGet MimeNoContent


-- *** sushiswapGetPoolsCurrent

-- | @GET \/dapps\/sushiswap\/pools\/current@
-- 
-- Sushiswap.GetPools (current)
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


-- *** sushiswapGetPoolsHistorical

-- | @GET \/dapps\/sushiswap\/pools\/historical@
-- 
-- Sushiswap.GetPools (historical)
-- 
-- Gets list of pools for given filters.
-- 
sushiswapGetPoolsHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetPoolsHistorical MimeNoContent [SushiswapPairDTO] accept
sushiswapGetPoolsHistorical  _ =
  _mkRequest "GET" ["/dapps/sushiswap/pools/historical"]

data SushiswapGetPoolsHistorical  
instance HasOptionalParam SushiswapGetPoolsHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam SushiswapGetPoolsHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam SushiswapGetPoolsHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam SushiswapGetPoolsHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance HasOptionalParam SushiswapGetPoolsHistorical PoolId where
  applyOptionalParam req (PoolId xs) =
    req `addQuery` toQuery ("poolId", Just xs)
-- | @application/json@
instance Produces SushiswapGetPoolsHistorical MimeJSON
-- | @text/json@
instance Produces SushiswapGetPoolsHistorical MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetPoolsHistorical MimePlainText


-- *** sushiswapGetSwapsCurrent

-- | @GET \/dapps\/sushiswap\/swaps\/current@
-- 
-- Sushiswap.GetSwaps (current)
-- 
-- Gets swaps.
-- 
sushiswapGetSwapsCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetSwapsCurrent MimeNoContent SushiswapSwapDTO accept
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

-- | @GET \/dapps\/sushiswap\/swaps\/historical@
-- 
-- Sushiswap.GetSwaps (historical)
-- 
-- Gets list of swaps for given filters.
-- 
sushiswapGetSwapsHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetSwapsHistorical MimeNoContent [SushiswapSwapDTO] accept
sushiswapGetSwapsHistorical  _ =
  _mkRequest "GET" ["/dapps/sushiswap/swaps/historical"]

data SushiswapGetSwapsHistorical  
instance HasOptionalParam SushiswapGetSwapsHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam SushiswapGetSwapsHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam SushiswapGetSwapsHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam SushiswapGetSwapsHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
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
-- Sushiswap.GetTokens (current)
-- 
-- Gets tokens.
-- 
sushiswapGetTokensCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetTokensCurrent MimeNoContent SushiswapTokenDTO accept
sushiswapGetTokensCurrent  _ =
  _mkRequest "GET" ["/dapps/sushiswap/tokens/current"]

data SushiswapGetTokensCurrent  
-- | @application/json@
instance Produces SushiswapGetTokensCurrent MimeJSON
-- | @text/json@
instance Produces SushiswapGetTokensCurrent MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetTokensCurrent MimePlainText


-- *** sushiswapGetTokensHistorical

-- | @GET \/dapps\/sushiswap\/tokens\/historical@
-- 
-- Sushiswap.GetTokens (historical)
-- 
-- Gets list of tokens for given filters.
-- 
sushiswapGetTokensHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest SushiswapGetTokensHistorical MimeNoContent [SushiswapTokenDTO] accept
sushiswapGetTokensHistorical  _ =
  _mkRequest "GET" ["/dapps/sushiswap/tokens/historical"]

data SushiswapGetTokensHistorical  
instance HasOptionalParam SushiswapGetTokensHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam SushiswapGetTokensHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam SushiswapGetTokensHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam SushiswapGetTokensHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance HasOptionalParam SushiswapGetTokensHistorical TokenId where
  applyOptionalParam req (TokenId xs) =
    req `addQuery` toQuery ("tokenId", Just xs)
-- | @application/json@
instance Produces SushiswapGetTokensHistorical MimeJSON
-- | @text/json@
instance Produces SushiswapGetTokensHistorical MimeTextJson
-- | @text/plain@
instance Produces SushiswapGetTokensHistorical MimePlainText

