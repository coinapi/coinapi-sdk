{-
   OnChain API

    This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

   OpenAPI Version: 3.0.1
   OnChain API API version: v1
   Contact: support@coinapi.io
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : OnChain.API.Dex
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module OnChain.API.Dex where

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


-- ** Dex

-- *** dexBatchsCurrent

-- | @GET \/dapps\/dex\/batchs\/current@
-- 
-- Batchs (current)
-- 
-- Gets batchs.
-- 
dexBatchsCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexBatchsCurrent MimeNoContent [DexBatchDTO] accept
dexBatchsCurrent  _ =
  _mkRequest "GET" ["/dapps/dex/batchs/current"]

data DexBatchsCurrent  
-- | @application/json@
instance Produces DexBatchsCurrent MimeJSON
-- | @text/json@
instance Produces DexBatchsCurrent MimeTextJson
-- | @text/plain@
instance Produces DexBatchsCurrent MimePlainText


-- *** dexDepositsCurrent

-- | @GET \/dapps\/dex\/deposits\/current@
-- 
-- Deposits (current)
-- 
-- Gets deposits.
-- 
dexDepositsCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexDepositsCurrent MimeNoContent [DexDepositDTO] accept
dexDepositsCurrent  _ =
  _mkRequest "GET" ["/dapps/dex/deposits/current"]

data DexDepositsCurrent  
-- | @application/json@
instance Produces DexDepositsCurrent MimeJSON
-- | @text/json@
instance Produces DexDepositsCurrent MimeTextJson
-- | @text/plain@
instance Produces DexDepositsCurrent MimePlainText


-- *** dexGetBatchsHistorical

-- | @GET \/dapps\/dex\/batchs\/historical@
-- 
-- Batchs (historical) 🔥
-- 
-- Gets batchs.
-- 
dexGetBatchsHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexGetBatchsHistorical MimeNoContent [DexBatchDTO] accept
dexGetBatchsHistorical  _ =
  _mkRequest "GET" ["/dapps/dex/batchs/historical"]

data DexGetBatchsHistorical  

-- | /Optional Param/ "startBlock" - The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
instance HasOptionalParam DexGetBatchsHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
instance HasOptionalParam DexGetBatchsHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
instance HasOptionalParam DexGetBatchsHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - The end date of timeframe.
instance HasOptionalParam DexGetBatchsHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "id" - Identifier.
instance HasOptionalParam DexGetBatchsHistorical Id where
  applyOptionalParam req (Id xs) =
    req `addQuery` toQuery ("id", Just xs)
-- | @application/json@
instance Produces DexGetBatchsHistorical MimeJSON
-- | @text/json@
instance Produces DexGetBatchsHistorical MimeTextJson
-- | @text/plain@
instance Produces DexGetBatchsHistorical MimePlainText


-- *** dexGetDepositsHistorical

-- | @GET \/dapps\/dex\/deposits\/historical@
-- 
-- Deposits (historical) 🔥
-- 
-- Gets deposits.
-- 
dexGetDepositsHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexGetDepositsHistorical MimeNoContent [DexDepositDTO] accept
dexGetDepositsHistorical  _ =
  _mkRequest "GET" ["/dapps/dex/deposits/historical"]

data DexGetDepositsHistorical  
instance HasOptionalParam DexGetDepositsHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam DexGetDepositsHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam DexGetDepositsHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam DexGetDepositsHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance HasOptionalParam DexGetDepositsHistorical Id where
  applyOptionalParam req (Id xs) =
    req `addQuery` toQuery ("id", Just xs)
instance HasOptionalParam DexGetDepositsHistorical User where
  applyOptionalParam req (User xs) =
    req `addQuery` toQuery ("user", Just xs)
-- | @application/json@
instance Produces DexGetDepositsHistorical MimeJSON
-- | @text/json@
instance Produces DexGetDepositsHistorical MimeTextJson
-- | @text/plain@
instance Produces DexGetDepositsHistorical MimePlainText


-- *** dexGetOrdersHistorical

-- | @GET \/dapps\/dex\/orders\/historical@
-- 
-- Orders (historical) 🔥
-- 
-- Gets orders.
-- 
dexGetOrdersHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexGetOrdersHistorical MimeNoContent [DexOrderDTO] accept
dexGetOrdersHistorical  _ =
  _mkRequest "GET" ["/dapps/dex/orders/historical"]

data DexGetOrdersHistorical  
instance HasOptionalParam DexGetOrdersHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam DexGetOrdersHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam DexGetOrdersHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam DexGetOrdersHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance HasOptionalParam DexGetOrdersHistorical Id where
  applyOptionalParam req (Id xs) =
    req `addQuery` toQuery ("id", Just xs)
instance HasOptionalParam DexGetOrdersHistorical BuyToken where
  applyOptionalParam req (BuyToken xs) =
    req `addQuery` toQuery ("buy_token", Just xs)
instance HasOptionalParam DexGetOrdersHistorical SellToken where
  applyOptionalParam req (SellToken xs) =
    req `addQuery` toQuery ("sell_token", Just xs)
-- | @application/json@
instance Produces DexGetOrdersHistorical MimeJSON
-- | @text/json@
instance Produces DexGetOrdersHistorical MimeTextJson
-- | @text/plain@
instance Produces DexGetOrdersHistorical MimePlainText


-- *** dexGetPricesHistorical

-- | @GET \/dapps\/dex\/prices\/historical@
-- 
-- Prices (historical) 🔥
-- 
-- Gets prices.
-- 
dexGetPricesHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexGetPricesHistorical MimeNoContent [DexPriceDTO] accept
dexGetPricesHistorical  _ =
  _mkRequest "GET" ["/dapps/dex/prices/historical"]

data DexGetPricesHistorical  
instance HasOptionalParam DexGetPricesHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam DexGetPricesHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam DexGetPricesHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam DexGetPricesHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance HasOptionalParam DexGetPricesHistorical Id where
  applyOptionalParam req (Id xs) =
    req `addQuery` toQuery ("id", Just xs)
-- | @application/json@
instance Produces DexGetPricesHistorical MimeJSON
-- | @text/json@
instance Produces DexGetPricesHistorical MimeTextJson
-- | @text/plain@
instance Produces DexGetPricesHistorical MimePlainText


-- *** dexGetSolutionsHistorical

-- | @GET \/dapps\/dex\/solutions\/historical@
-- 
-- Solutions (historical) 🔥
-- 
-- Gets solutions.
-- 
dexGetSolutionsHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexGetSolutionsHistorical MimeNoContent [DexSolutionDTO] accept
dexGetSolutionsHistorical  _ =
  _mkRequest "GET" ["/dapps/dex/solutions/historical"]

data DexGetSolutionsHistorical  

-- | /Optional Param/ "startBlock" - The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
instance HasOptionalParam DexGetSolutionsHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
instance HasOptionalParam DexGetSolutionsHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
instance HasOptionalParam DexGetSolutionsHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - The end date of timeframe.
instance HasOptionalParam DexGetSolutionsHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "id" - 
instance HasOptionalParam DexGetSolutionsHistorical Id where
  applyOptionalParam req (Id xs) =
    req `addQuery` toQuery ("id", Just xs)
-- | @application/json@
instance Produces DexGetSolutionsHistorical MimeJSON
-- | @text/json@
instance Produces DexGetSolutionsHistorical MimeTextJson
-- | @text/plain@
instance Produces DexGetSolutionsHistorical MimePlainText


-- *** dexGetStatssHistorical

-- | @GET \/dapps\/dex\/statss\/historical@
-- 
-- Statss (historical) 🔥
-- 
-- Gets statss.
-- 
dexGetStatssHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexGetStatssHistorical MimeNoContent [DexStatsDTO] accept
dexGetStatssHistorical  _ =
  _mkRequest "GET" ["/dapps/dex/statss/historical"]

data DexGetStatssHistorical  

-- | /Optional Param/ "startBlock" - The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
instance HasOptionalParam DexGetStatssHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
instance HasOptionalParam DexGetStatssHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
instance HasOptionalParam DexGetStatssHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - The end date of timeframe.
instance HasOptionalParam DexGetStatssHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "id" - 
instance HasOptionalParam DexGetStatssHistorical Id where
  applyOptionalParam req (Id xs) =
    req `addQuery` toQuery ("id", Just xs)
-- | @application/json@
instance Produces DexGetStatssHistorical MimeJSON
-- | @text/json@
instance Produces DexGetStatssHistorical MimeTextJson
-- | @text/plain@
instance Produces DexGetStatssHistorical MimePlainText


-- *** dexGetTokensHistorical

-- | @GET \/dapps\/dex\/tokens\/historical@
-- 
-- Tokens (historical) 🔥
-- 
-- Gets tokens.
-- 
dexGetTokensHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexGetTokensHistorical MimeNoContent [DexTokenDTO] accept
dexGetTokensHistorical  _ =
  _mkRequest "GET" ["/dapps/dex/tokens/historical"]

data DexGetTokensHistorical  

-- | /Optional Param/ "startBlock" - The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
instance HasOptionalParam DexGetTokensHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
instance HasOptionalParam DexGetTokensHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
instance HasOptionalParam DexGetTokensHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - The end date of timeframe.
instance HasOptionalParam DexGetTokensHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "id" - 
instance HasOptionalParam DexGetTokensHistorical Id where
  applyOptionalParam req (Id xs) =
    req `addQuery` toQuery ("id", Just xs)

-- | /Optional Param/ "address" - 
instance HasOptionalParam DexGetTokensHistorical Address where
  applyOptionalParam req (Address xs) =
    req `addQuery` toQuery ("address", Just xs)

-- | /Optional Param/ "symbol" - 
instance HasOptionalParam DexGetTokensHistorical Symbol where
  applyOptionalParam req (Symbol xs) =
    req `addQuery` toQuery ("symbol", Just xs)

-- | /Optional Param/ "name" - 
instance HasOptionalParam DexGetTokensHistorical Name where
  applyOptionalParam req (Name xs) =
    req `addQuery` toQuery ("name", Just xs)
-- | @application/json@
instance Produces DexGetTokensHistorical MimeJSON
-- | @text/json@
instance Produces DexGetTokensHistorical MimeTextJson
-- | @text/plain@
instance Produces DexGetTokensHistorical MimePlainText


-- *** dexGetTradesHistorical

-- | @GET \/dapps\/dex\/trades\/historical@
-- 
-- Trades (historical) 🔥
-- 
-- Gets trades.
-- 
dexGetTradesHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexGetTradesHistorical MimeNoContent [DexTradeDTO] accept
dexGetTradesHistorical  _ =
  _mkRequest "GET" ["/dapps/dex/trades/historical"]

data DexGetTradesHistorical  

-- | /Optional Param/ "startBlock" - The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
instance HasOptionalParam DexGetTradesHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
instance HasOptionalParam DexGetTradesHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
instance HasOptionalParam DexGetTradesHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - The end date of timeframe.
instance HasOptionalParam DexGetTradesHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "id" - 
instance HasOptionalParam DexGetTradesHistorical Id where
  applyOptionalParam req (Id xs) =
    req `addQuery` toQuery ("id", Just xs)

-- | /Optional Param/ "buy_token" - 
instance HasOptionalParam DexGetTradesHistorical BuyToken where
  applyOptionalParam req (BuyToken xs) =
    req `addQuery` toQuery ("buy_token", Just xs)

-- | /Optional Param/ "sell_token" - 
instance HasOptionalParam DexGetTradesHistorical SellToken where
  applyOptionalParam req (SellToken xs) =
    req `addQuery` toQuery ("sell_token", Just xs)
-- | @application/json@
instance Produces DexGetTradesHistorical MimeJSON
-- | @text/json@
instance Produces DexGetTradesHistorical MimeTextJson
-- | @text/plain@
instance Produces DexGetTradesHistorical MimePlainText


-- *** dexGetUsersHistorical

-- | @GET \/dapps\/dex\/users\/historical@
-- 
-- Users (historical) 🔥
-- 
-- Gets users.
-- 
dexGetUsersHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexGetUsersHistorical MimeNoContent [DexUserDTO] accept
dexGetUsersHistorical  _ =
  _mkRequest "GET" ["/dapps/dex/users/historical"]

data DexGetUsersHistorical  

-- | /Optional Param/ "startBlock" - The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
instance HasOptionalParam DexGetUsersHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)

-- | /Optional Param/ "endBlock" - The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
instance HasOptionalParam DexGetUsersHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)

-- | /Optional Param/ "startDate" - The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
instance HasOptionalParam DexGetUsersHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)

-- | /Optional Param/ "endDate" - The end date of timeframe.
instance HasOptionalParam DexGetUsersHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)

-- | /Optional Param/ "id" - 
instance HasOptionalParam DexGetUsersHistorical Id where
  applyOptionalParam req (Id xs) =
    req `addQuery` toQuery ("id", Just xs)
-- | @application/json@
instance Produces DexGetUsersHistorical MimeJSON
-- | @text/json@
instance Produces DexGetUsersHistorical MimeTextJson
-- | @text/plain@
instance Produces DexGetUsersHistorical MimePlainText


-- *** dexGetWithdrawRequestsHistorical

-- | @GET \/dapps\/dex\/withdrawRequests\/historical@
-- 
-- WithdrawRequests (historical) 🔥
-- 
-- Gets withdrawRequests.
-- 
dexGetWithdrawRequestsHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexGetWithdrawRequestsHistorical MimeNoContent [DexWithdrawRequestDTO] accept
dexGetWithdrawRequestsHistorical  _ =
  _mkRequest "GET" ["/dapps/dex/withdrawRequests/historical"]

data DexGetWithdrawRequestsHistorical  
instance HasOptionalParam DexGetWithdrawRequestsHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam DexGetWithdrawRequestsHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam DexGetWithdrawRequestsHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam DexGetWithdrawRequestsHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance HasOptionalParam DexGetWithdrawRequestsHistorical Id where
  applyOptionalParam req (Id xs) =
    req `addQuery` toQuery ("id", Just xs)
instance HasOptionalParam DexGetWithdrawRequestsHistorical User where
  applyOptionalParam req (User xs) =
    req `addQuery` toQuery ("user", Just xs)
-- | @application/json@
instance Produces DexGetWithdrawRequestsHistorical MimeJSON
-- | @text/json@
instance Produces DexGetWithdrawRequestsHistorical MimeTextJson
-- | @text/plain@
instance Produces DexGetWithdrawRequestsHistorical MimePlainText


-- *** dexGetWithdrawsHistorical

-- | @GET \/dapps\/dex\/withdraws\/historical@
-- 
-- Withdraws (historical) 🔥
-- 
-- Gets withdraws.
-- 
dexGetWithdrawsHistorical
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexGetWithdrawsHistorical MimeNoContent [DexWithdrawDTO] accept
dexGetWithdrawsHistorical  _ =
  _mkRequest "GET" ["/dapps/dex/withdraws/historical"]

data DexGetWithdrawsHistorical  
instance HasOptionalParam DexGetWithdrawsHistorical StartBlock where
  applyOptionalParam req (StartBlock xs) =
    req `addQuery` toQuery ("startBlock", Just xs)
instance HasOptionalParam DexGetWithdrawsHistorical EndBlock where
  applyOptionalParam req (EndBlock xs) =
    req `addQuery` toQuery ("endBlock", Just xs)
instance HasOptionalParam DexGetWithdrawsHistorical StartDate where
  applyOptionalParam req (StartDate xs) =
    req `addQuery` toQuery ("startDate", Just xs)
instance HasOptionalParam DexGetWithdrawsHistorical EndDate where
  applyOptionalParam req (EndDate xs) =
    req `addQuery` toQuery ("endDate", Just xs)
instance HasOptionalParam DexGetWithdrawsHistorical Id where
  applyOptionalParam req (Id xs) =
    req `addQuery` toQuery ("id", Just xs)
instance HasOptionalParam DexGetWithdrawsHistorical User where
  applyOptionalParam req (User xs) =
    req `addQuery` toQuery ("user", Just xs)
-- | @application/json@
instance Produces DexGetWithdrawsHistorical MimeJSON
-- | @text/json@
instance Produces DexGetWithdrawsHistorical MimeTextJson
-- | @text/plain@
instance Produces DexGetWithdrawsHistorical MimePlainText


-- *** dexOrdersCurrent

-- | @GET \/dapps\/dex\/orders\/current@
-- 
-- Orders (current)
-- 
-- Gets orders.
-- 
dexOrdersCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexOrdersCurrent MimeNoContent [DexOrderDTO] accept
dexOrdersCurrent  _ =
  _mkRequest "GET" ["/dapps/dex/orders/current"]

data DexOrdersCurrent  
-- | @application/json@
instance Produces DexOrdersCurrent MimeJSON
-- | @text/json@
instance Produces DexOrdersCurrent MimeTextJson
-- | @text/plain@
instance Produces DexOrdersCurrent MimePlainText


-- *** dexPricesCurrent

-- | @GET \/dapps\/dex\/prices\/current@
-- 
-- Prices (current)
-- 
-- Gets prices.
-- 
dexPricesCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexPricesCurrent MimeNoContent [DexPriceDTO] accept
dexPricesCurrent  _ =
  _mkRequest "GET" ["/dapps/dex/prices/current"]

data DexPricesCurrent  
-- | @application/json@
instance Produces DexPricesCurrent MimeJSON
-- | @text/json@
instance Produces DexPricesCurrent MimeTextJson
-- | @text/plain@
instance Produces DexPricesCurrent MimePlainText


-- *** dexSolutionsCurrent

-- | @GET \/dapps\/dex\/solutions\/current@
-- 
-- Solutions (current)
-- 
-- Gets solutions.
-- 
dexSolutionsCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexSolutionsCurrent MimeNoContent [DexSolutionDTO] accept
dexSolutionsCurrent  _ =
  _mkRequest "GET" ["/dapps/dex/solutions/current"]

data DexSolutionsCurrent  
-- | @application/json@
instance Produces DexSolutionsCurrent MimeJSON
-- | @text/json@
instance Produces DexSolutionsCurrent MimeTextJson
-- | @text/plain@
instance Produces DexSolutionsCurrent MimePlainText


-- *** dexStatssCurrent

-- | @GET \/dapps\/dex\/statss\/current@
-- 
-- Statss (current)
-- 
-- Gets statss.
-- 
dexStatssCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexStatssCurrent MimeNoContent [DexStatsDTO] accept
dexStatssCurrent  _ =
  _mkRequest "GET" ["/dapps/dex/statss/current"]

data DexStatssCurrent  
-- | @application/json@
instance Produces DexStatssCurrent MimeJSON
-- | @text/json@
instance Produces DexStatssCurrent MimeTextJson
-- | @text/plain@
instance Produces DexStatssCurrent MimePlainText


-- *** dexTokensCurrent

-- | @GET \/dapps\/dex\/tokens\/current@
-- 
-- Tokens (current)
-- 
-- Gets tokens.
-- 
dexTokensCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexTokensCurrent MimeNoContent [DexTokenDTO] accept
dexTokensCurrent  _ =
  _mkRequest "GET" ["/dapps/dex/tokens/current"]

data DexTokensCurrent  
-- | @application/json@
instance Produces DexTokensCurrent MimeJSON
-- | @text/json@
instance Produces DexTokensCurrent MimeTextJson
-- | @text/plain@
instance Produces DexTokensCurrent MimePlainText


-- *** dexTradesCurrent

-- | @GET \/dapps\/dex\/trades\/current@
-- 
-- Trades (current)
-- 
-- Gets trades.
-- 
dexTradesCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexTradesCurrent MimeNoContent [DexTradeDTO] accept
dexTradesCurrent  _ =
  _mkRequest "GET" ["/dapps/dex/trades/current"]

data DexTradesCurrent  
-- | @application/json@
instance Produces DexTradesCurrent MimeJSON
-- | @text/json@
instance Produces DexTradesCurrent MimeTextJson
-- | @text/plain@
instance Produces DexTradesCurrent MimePlainText


-- *** dexUsersCurrent

-- | @GET \/dapps\/dex\/users\/current@
-- 
-- Users (current)
-- 
-- Gets users.
-- 
dexUsersCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexUsersCurrent MimeNoContent [DexUserDTO] accept
dexUsersCurrent  _ =
  _mkRequest "GET" ["/dapps/dex/users/current"]

data DexUsersCurrent  
-- | @application/json@
instance Produces DexUsersCurrent MimeJSON
-- | @text/json@
instance Produces DexUsersCurrent MimeTextJson
-- | @text/plain@
instance Produces DexUsersCurrent MimePlainText


-- *** dexWithdrawRequestsCurrent

-- | @GET \/dapps\/dex\/withdrawRequests\/current@
-- 
-- WithdrawRequests (current)
-- 
-- Gets withdrawRequests.
-- 
dexWithdrawRequestsCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexWithdrawRequestsCurrent MimeNoContent [DexWithdrawRequestDTO] accept
dexWithdrawRequestsCurrent  _ =
  _mkRequest "GET" ["/dapps/dex/withdrawRequests/current"]

data DexWithdrawRequestsCurrent  
-- | @application/json@
instance Produces DexWithdrawRequestsCurrent MimeJSON
-- | @text/json@
instance Produces DexWithdrawRequestsCurrent MimeTextJson
-- | @text/plain@
instance Produces DexWithdrawRequestsCurrent MimePlainText


-- *** dexWithdrawsCurrent

-- | @GET \/dapps\/dex\/withdraws\/current@
-- 
-- Withdraws (current)
-- 
-- Gets withdraws.
-- 
dexWithdrawsCurrent
  :: Accept accept -- ^ request accept ('MimeType')
  -> OnChainRequest DexWithdrawsCurrent MimeNoContent [DexWithdrawDTO] accept
dexWithdrawsCurrent  _ =
  _mkRequest "GET" ["/dapps/dex/withdraws/current"]

data DexWithdrawsCurrent  
-- | @application/json@
instance Produces DexWithdrawsCurrent MimeJSON
-- | @text/json@
instance Produces DexWithdrawsCurrent MimeTextJson
-- | @text/plain@
instance Produces DexWithdrawsCurrent MimePlainText

