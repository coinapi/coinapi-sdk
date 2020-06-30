{-
   OEML - REST API

   Lorem2 Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ###Lifecycle Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham. ###Lifecycle 2 Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackhama. 

   OpenAPI Version: 3.0.0
   OEML - REST API API version: v1
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : OEML-REST.Lens
-}

{-# LANGUAGE KindSignatures #-}
{-# LANGUAGE NamedFieldPuns #-}
{-# LANGUAGE RankNTypes #-}
{-# LANGUAGE RecordWildCards #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-matches -fno-warn-unused-binds -fno-warn-unused-imports #-}

module OEML-REST.ModelLens where

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Data, Typeable)
import qualified Data.Map as Map
import qualified Data.Set as Set
import qualified Data.Time as TI

import Data.Text (Text)

import Prelude (($), (.),(<$>),(<*>),(=<<),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)
import qualified Prelude as P

import OEML-REST.Model
import OEML-REST.Core


-- * Balance

-- | 'balanceType' Lens
balanceTypeL :: Lens_' Balance (Maybe Text)
balanceTypeL f Balance{..} = (\balanceType -> Balance { balanceType, ..} ) <$> f balanceType
{-# INLINE balanceTypeL #-}

-- | 'balanceExchangeName' Lens
balanceExchangeNameL :: Lens_' Balance (Maybe Text)
balanceExchangeNameL f Balance{..} = (\balanceExchangeName -> Balance { balanceExchangeName, ..} ) <$> f balanceExchangeName
{-# INLINE balanceExchangeNameL #-}

-- | 'balanceData' Lens
balanceDataL :: Lens_' Balance (Maybe [BalanceData])
balanceDataL f Balance{..} = (\balanceData -> Balance { balanceData, ..} ) <$> f balanceData
{-# INLINE balanceDataL #-}



-- * BalanceData

-- | 'balanceDataId' Lens
balanceDataIdL :: Lens_' BalanceData (Maybe Text)
balanceDataIdL f BalanceData{..} = (\balanceDataId -> BalanceData { balanceDataId, ..} ) <$> f balanceDataId
{-# INLINE balanceDataIdL #-}

-- | 'balanceDataSymbolExchange' Lens
balanceDataSymbolExchangeL :: Lens_' BalanceData (Maybe Text)
balanceDataSymbolExchangeL f BalanceData{..} = (\balanceDataSymbolExchange -> BalanceData { balanceDataSymbolExchange, ..} ) <$> f balanceDataSymbolExchange
{-# INLINE balanceDataSymbolExchangeL #-}

-- | 'balanceDataSymbolCoinapi' Lens
balanceDataSymbolCoinapiL :: Lens_' BalanceData (Maybe Text)
balanceDataSymbolCoinapiL f BalanceData{..} = (\balanceDataSymbolCoinapi -> BalanceData { balanceDataSymbolCoinapi, ..} ) <$> f balanceDataSymbolCoinapi
{-# INLINE balanceDataSymbolCoinapiL #-}

-- | 'balanceDataBalance' Lens
balanceDataBalanceL :: Lens_' BalanceData (Maybe Float)
balanceDataBalanceL f BalanceData{..} = (\balanceDataBalance -> BalanceData { balanceDataBalance, ..} ) <$> f balanceDataBalance
{-# INLINE balanceDataBalanceL #-}

-- | 'balanceDataAvailable' Lens
balanceDataAvailableL :: Lens_' BalanceData (Maybe Float)
balanceDataAvailableL f BalanceData{..} = (\balanceDataAvailable -> BalanceData { balanceDataAvailable, ..} ) <$> f balanceDataAvailable
{-# INLINE balanceDataAvailableL #-}

-- | 'balanceDataLocked' Lens
balanceDataLockedL :: Lens_' BalanceData (Maybe Float)
balanceDataLockedL f BalanceData{..} = (\balanceDataLocked -> BalanceData { balanceDataLocked, ..} ) <$> f balanceDataLocked
{-# INLINE balanceDataLockedL #-}

-- | 'balanceDataUpdateOrigin' Lens
balanceDataUpdateOriginL :: Lens_' BalanceData (Maybe E'UpdateOrigin)
balanceDataUpdateOriginL f BalanceData{..} = (\balanceDataUpdateOrigin -> BalanceData { balanceDataUpdateOrigin, ..} ) <$> f balanceDataUpdateOrigin
{-# INLINE balanceDataUpdateOriginL #-}



-- * CancelAllOrder

-- | 'cancelAllOrderExchangeId' Lens
cancelAllOrderExchangeIdL :: Lens_' CancelAllOrder (Maybe Text)
cancelAllOrderExchangeIdL f CancelAllOrder{..} = (\cancelAllOrderExchangeId -> CancelAllOrder { cancelAllOrderExchangeId, ..} ) <$> f cancelAllOrderExchangeId
{-# INLINE cancelAllOrderExchangeIdL #-}



-- * CancelOrder

-- | 'cancelOrderExchangeId' Lens
cancelOrderExchangeIdL :: Lens_' CancelOrder (Maybe Text)
cancelOrderExchangeIdL f CancelOrder{..} = (\cancelOrderExchangeId -> CancelOrder { cancelOrderExchangeId, ..} ) <$> f cancelOrderExchangeId
{-# INLINE cancelOrderExchangeIdL #-}

-- | 'cancelOrderExchangeOrderId' Lens
cancelOrderExchangeOrderIdL :: Lens_' CancelOrder (Maybe Text)
cancelOrderExchangeOrderIdL f CancelOrder{..} = (\cancelOrderExchangeOrderId -> CancelOrder { cancelOrderExchangeOrderId, ..} ) <$> f cancelOrderExchangeOrderId
{-# INLINE cancelOrderExchangeOrderIdL #-}

-- | 'cancelOrderClientOrderId' Lens
cancelOrderClientOrderIdL :: Lens_' CancelOrder (Maybe Text)
cancelOrderClientOrderIdL f CancelOrder{..} = (\cancelOrderClientOrderId -> CancelOrder { cancelOrderClientOrderId, ..} ) <$> f cancelOrderClientOrderId
{-# INLINE cancelOrderClientOrderIdL #-}



-- * CreateOrder400

-- | 'createOrder400Type' Lens
createOrder400TypeL :: Lens_' CreateOrder400 (Maybe Text)
createOrder400TypeL f CreateOrder400{..} = (\createOrder400Type -> CreateOrder400 { createOrder400Type, ..} ) <$> f createOrder400Type
{-# INLINE createOrder400TypeL #-}

-- | 'createOrder400Title' Lens
createOrder400TitleL :: Lens_' CreateOrder400 (Maybe Text)
createOrder400TitleL f CreateOrder400{..} = (\createOrder400Title -> CreateOrder400 { createOrder400Title, ..} ) <$> f createOrder400Title
{-# INLINE createOrder400TitleL #-}

-- | 'createOrder400Status' Lens
createOrder400StatusL :: Lens_' CreateOrder400 (Maybe Double)
createOrder400StatusL f CreateOrder400{..} = (\createOrder400Status -> CreateOrder400 { createOrder400Status, ..} ) <$> f createOrder400Status
{-# INLINE createOrder400StatusL #-}

-- | 'createOrder400TraceId' Lens
createOrder400TraceIdL :: Lens_' CreateOrder400 (Maybe Text)
createOrder400TraceIdL f CreateOrder400{..} = (\createOrder400TraceId -> CreateOrder400 { createOrder400TraceId, ..} ) <$> f createOrder400TraceId
{-# INLINE createOrder400TraceIdL #-}

-- | 'createOrder400Errors' Lens
createOrder400ErrorsL :: Lens_' CreateOrder400 (Maybe Text)
createOrder400ErrorsL f CreateOrder400{..} = (\createOrder400Errors -> CreateOrder400 { createOrder400Errors, ..} ) <$> f createOrder400Errors
{-# INLINE createOrder400ErrorsL #-}



-- * Messages

-- | 'messagesType' Lens
messagesTypeL :: Lens_' Messages (Maybe Text)
messagesTypeL f Messages{..} = (\messagesType -> Messages { messagesType, ..} ) <$> f messagesType
{-# INLINE messagesTypeL #-}

-- | 'messagesExchangeId' Lens
messagesExchangeIdL :: Lens_' Messages (Maybe Text)
messagesExchangeIdL f Messages{..} = (\messagesExchangeId -> Messages { messagesExchangeId, ..} ) <$> f messagesExchangeId
{-# INLINE messagesExchangeIdL #-}

-- | 'messagesMessage' Lens
messagesMessageL :: Lens_' Messages (Maybe Text)
messagesMessageL f Messages{..} = (\messagesMessage -> Messages { messagesMessage, ..} ) <$> f messagesMessage
{-# INLINE messagesMessageL #-}



-- * MessagesInfo

-- | 'messagesInfoType' Lens
messagesInfoTypeL :: Lens_' MessagesInfo (Maybe Text)
messagesInfoTypeL f MessagesInfo{..} = (\messagesInfoType -> MessagesInfo { messagesInfoType, ..} ) <$> f messagesInfoType
{-# INLINE messagesInfoTypeL #-}

-- | 'messagesInfoExchangeId' Lens
messagesInfoExchangeIdL :: Lens_' MessagesInfo (Maybe Text)
messagesInfoExchangeIdL f MessagesInfo{..} = (\messagesInfoExchangeId -> MessagesInfo { messagesInfoExchangeId, ..} ) <$> f messagesInfoExchangeId
{-# INLINE messagesInfoExchangeIdL #-}

-- | 'messagesInfoErrorMessage' Lens
messagesInfoErrorMessageL :: Lens_' MessagesInfo (Maybe Text)
messagesInfoErrorMessageL f MessagesInfo{..} = (\messagesInfoErrorMessage -> MessagesInfo { messagesInfoErrorMessage, ..} ) <$> f messagesInfoErrorMessage
{-# INLINE messagesInfoErrorMessageL #-}



-- * MessagesOk

-- | 'messagesOkType' Lens
messagesOkTypeL :: Lens_' MessagesOk (Maybe Text)
messagesOkTypeL f MessagesOk{..} = (\messagesOkType -> MessagesOk { messagesOkType, ..} ) <$> f messagesOkType
{-# INLINE messagesOkTypeL #-}

-- | 'messagesOkExchangeId' Lens
messagesOkExchangeIdL :: Lens_' MessagesOk (Maybe Text)
messagesOkExchangeIdL f MessagesOk{..} = (\messagesOkExchangeId -> MessagesOk { messagesOkExchangeId, ..} ) <$> f messagesOkExchangeId
{-# INLINE messagesOkExchangeIdL #-}

-- | 'messagesOkMessage' Lens
messagesOkMessageL :: Lens_' MessagesOk (Maybe Text)
messagesOkMessageL f MessagesOk{..} = (\messagesOkMessage -> MessagesOk { messagesOkMessage, ..} ) <$> f messagesOkMessage
{-# INLINE messagesOkMessageL #-}



-- * NewOrder

-- | 'newOrderExchangeId' Lens
newOrderExchangeIdL :: Lens_' NewOrder (Maybe Text)
newOrderExchangeIdL f NewOrder{..} = (\newOrderExchangeId -> NewOrder { newOrderExchangeId, ..} ) <$> f newOrderExchangeId
{-# INLINE newOrderExchangeIdL #-}

-- | 'newOrderClientOrderId' Lens
newOrderClientOrderIdL :: Lens_' NewOrder (Maybe Text)
newOrderClientOrderIdL f NewOrder{..} = (\newOrderClientOrderId -> NewOrder { newOrderClientOrderId, ..} ) <$> f newOrderClientOrderId
{-# INLINE newOrderClientOrderIdL #-}

-- | 'newOrderSymbolExchange' Lens
newOrderSymbolExchangeL :: Lens_' NewOrder (Maybe Text)
newOrderSymbolExchangeL f NewOrder{..} = (\newOrderSymbolExchange -> NewOrder { newOrderSymbolExchange, ..} ) <$> f newOrderSymbolExchange
{-# INLINE newOrderSymbolExchangeL #-}

-- | 'newOrderSymbolCoinapi' Lens
newOrderSymbolCoinapiL :: Lens_' NewOrder (Maybe Text)
newOrderSymbolCoinapiL f NewOrder{..} = (\newOrderSymbolCoinapi -> NewOrder { newOrderSymbolCoinapi, ..} ) <$> f newOrderSymbolCoinapi
{-# INLINE newOrderSymbolCoinapiL #-}

-- | 'newOrderAmountOrder' Lens
newOrderAmountOrderL :: Lens_' NewOrder (Maybe Double)
newOrderAmountOrderL f NewOrder{..} = (\newOrderAmountOrder -> NewOrder { newOrderAmountOrder, ..} ) <$> f newOrderAmountOrder
{-# INLINE newOrderAmountOrderL #-}

-- | 'newOrderPrice' Lens
newOrderPriceL :: Lens_' NewOrder (Maybe Double)
newOrderPriceL f NewOrder{..} = (\newOrderPrice -> NewOrder { newOrderPrice, ..} ) <$> f newOrderPrice
{-# INLINE newOrderPriceL #-}

-- | 'newOrderSide' Lens
newOrderSideL :: Lens_' NewOrder (Maybe E'Side)
newOrderSideL f NewOrder{..} = (\newOrderSide -> NewOrder { newOrderSide, ..} ) <$> f newOrderSide
{-# INLINE newOrderSideL #-}

-- | 'newOrderOrderType' Lens
newOrderOrderTypeL :: Lens_' NewOrder (Maybe E'OrderType)
newOrderOrderTypeL f NewOrder{..} = (\newOrderOrderType -> NewOrder { newOrderOrderType, ..} ) <$> f newOrderOrderType
{-# INLINE newOrderOrderTypeL #-}

-- | 'newOrderTimeInForce' Lens
newOrderTimeInForceL :: Lens_' NewOrder (Maybe TimeInForce)
newOrderTimeInForceL f NewOrder{..} = (\newOrderTimeInForce -> NewOrder { newOrderTimeInForce, ..} ) <$> f newOrderTimeInForce
{-# INLINE newOrderTimeInForceL #-}

-- | 'newOrderExpireTime' Lens
newOrderExpireTimeL :: Lens_' NewOrder (Maybe Date)
newOrderExpireTimeL f NewOrder{..} = (\newOrderExpireTime -> NewOrder { newOrderExpireTime, ..} ) <$> f newOrderExpireTime
{-# INLINE newOrderExpireTimeL #-}

-- | 'newOrderExecInst' Lens
newOrderExecInstL :: Lens_' NewOrder (Maybe [E'ExecInst])
newOrderExecInstL f NewOrder{..} = (\newOrderExecInst -> NewOrder { newOrderExecInst, ..} ) <$> f newOrderExecInst
{-# INLINE newOrderExecInstL #-}



-- * Order

-- | 'orderType' Lens
orderTypeL :: Lens_' Order (Maybe Text)
orderTypeL f Order{..} = (\orderType -> Order { orderType, ..} ) <$> f orderType
{-# INLINE orderTypeL #-}

-- | 'orderExchangeName' Lens
orderExchangeNameL :: Lens_' Order (Maybe Text)
orderExchangeNameL f Order{..} = (\orderExchangeName -> Order { orderExchangeName, ..} ) <$> f orderExchangeName
{-# INLINE orderExchangeNameL #-}

-- | 'orderData' Lens
orderDataL :: Lens_' Order (Maybe [OrderData])
orderDataL f Order{..} = (\orderData -> Order { orderData, ..} ) <$> f orderData
{-# INLINE orderDataL #-}



-- * OrderData

-- | 'orderDataExchangeId' Lens
orderDataExchangeIdL :: Lens_' OrderData (Maybe Text)
orderDataExchangeIdL f OrderData{..} = (\orderDataExchangeId -> OrderData { orderDataExchangeId, ..} ) <$> f orderDataExchangeId
{-# INLINE orderDataExchangeIdL #-}

-- | 'orderDataId' Lens
orderDataIdL :: Lens_' OrderData (Maybe Text)
orderDataIdL f OrderData{..} = (\orderDataId -> OrderData { orderDataId, ..} ) <$> f orderDataId
{-# INLINE orderDataIdL #-}

-- | 'orderDataClientOrderIdFormatExchange' Lens
orderDataClientOrderIdFormatExchangeL :: Lens_' OrderData (Maybe Text)
orderDataClientOrderIdFormatExchangeL f OrderData{..} = (\orderDataClientOrderIdFormatExchange -> OrderData { orderDataClientOrderIdFormatExchange, ..} ) <$> f orderDataClientOrderIdFormatExchange
{-# INLINE orderDataClientOrderIdFormatExchangeL #-}

-- | 'orderDataExchangeOrderId' Lens
orderDataExchangeOrderIdL :: Lens_' OrderData (Maybe Text)
orderDataExchangeOrderIdL f OrderData{..} = (\orderDataExchangeOrderId -> OrderData { orderDataExchangeOrderId, ..} ) <$> f orderDataExchangeOrderId
{-# INLINE orderDataExchangeOrderIdL #-}

-- | 'orderDataAmountOpen' Lens
orderDataAmountOpenL :: Lens_' OrderData (Maybe Double)
orderDataAmountOpenL f OrderData{..} = (\orderDataAmountOpen -> OrderData { orderDataAmountOpen, ..} ) <$> f orderDataAmountOpen
{-# INLINE orderDataAmountOpenL #-}

-- | 'orderDataAmountFilled' Lens
orderDataAmountFilledL :: Lens_' OrderData (Maybe Double)
orderDataAmountFilledL f OrderData{..} = (\orderDataAmountFilled -> OrderData { orderDataAmountFilled, ..} ) <$> f orderDataAmountFilled
{-# INLINE orderDataAmountFilledL #-}

-- | 'orderDataStatus' Lens
orderDataStatusL :: Lens_' OrderData (Maybe OrderStatus)
orderDataStatusL f OrderData{..} = (\orderDataStatus -> OrderData { orderDataStatus, ..} ) <$> f orderDataStatus
{-# INLINE orderDataStatusL #-}

-- | 'orderDataTimeOrder' Lens
orderDataTimeOrderL :: Lens_' OrderData (Maybe [[Text]])
orderDataTimeOrderL f OrderData{..} = (\orderDataTimeOrder -> OrderData { orderDataTimeOrder, ..} ) <$> f orderDataTimeOrder
{-# INLINE orderDataTimeOrderL #-}

-- | 'orderDataErrorMessage' Lens
orderDataErrorMessageL :: Lens_' OrderData (Maybe Text)
orderDataErrorMessageL f OrderData{..} = (\orderDataErrorMessage -> OrderData { orderDataErrorMessage, ..} ) <$> f orderDataErrorMessage
{-# INLINE orderDataErrorMessageL #-}

-- | 'orderDataClientOrderId' Lens
orderDataClientOrderIdL :: Lens_' OrderData (Maybe Text)
orderDataClientOrderIdL f OrderData{..} = (\orderDataClientOrderId -> OrderData { orderDataClientOrderId, ..} ) <$> f orderDataClientOrderId
{-# INLINE orderDataClientOrderIdL #-}

-- | 'orderDataSymbolExchange' Lens
orderDataSymbolExchangeL :: Lens_' OrderData (Maybe Text)
orderDataSymbolExchangeL f OrderData{..} = (\orderDataSymbolExchange -> OrderData { orderDataSymbolExchange, ..} ) <$> f orderDataSymbolExchange
{-# INLINE orderDataSymbolExchangeL #-}

-- | 'orderDataSymbolCoinapi' Lens
orderDataSymbolCoinapiL :: Lens_' OrderData (Maybe Text)
orderDataSymbolCoinapiL f OrderData{..} = (\orderDataSymbolCoinapi -> OrderData { orderDataSymbolCoinapi, ..} ) <$> f orderDataSymbolCoinapi
{-# INLINE orderDataSymbolCoinapiL #-}

-- | 'orderDataAmountOrder' Lens
orderDataAmountOrderL :: Lens_' OrderData (Maybe Double)
orderDataAmountOrderL f OrderData{..} = (\orderDataAmountOrder -> OrderData { orderDataAmountOrder, ..} ) <$> f orderDataAmountOrder
{-# INLINE orderDataAmountOrderL #-}

-- | 'orderDataPrice' Lens
orderDataPriceL :: Lens_' OrderData (Maybe Double)
orderDataPriceL f OrderData{..} = (\orderDataPrice -> OrderData { orderDataPrice, ..} ) <$> f orderDataPrice
{-# INLINE orderDataPriceL #-}

-- | 'orderDataSide' Lens
orderDataSideL :: Lens_' OrderData (Maybe E'Side)
orderDataSideL f OrderData{..} = (\orderDataSide -> OrderData { orderDataSide, ..} ) <$> f orderDataSide
{-# INLINE orderDataSideL #-}

-- | 'orderDataOrderType' Lens
orderDataOrderTypeL :: Lens_' OrderData (Maybe E'OrderType)
orderDataOrderTypeL f OrderData{..} = (\orderDataOrderType -> OrderData { orderDataOrderType, ..} ) <$> f orderDataOrderType
{-# INLINE orderDataOrderTypeL #-}

-- | 'orderDataTimeInForce' Lens
orderDataTimeInForceL :: Lens_' OrderData (Maybe TimeInForce)
orderDataTimeInForceL f OrderData{..} = (\orderDataTimeInForce -> OrderData { orderDataTimeInForce, ..} ) <$> f orderDataTimeInForce
{-# INLINE orderDataTimeInForceL #-}

-- | 'orderDataExpireTime' Lens
orderDataExpireTimeL :: Lens_' OrderData (Maybe Date)
orderDataExpireTimeL f OrderData{..} = (\orderDataExpireTime -> OrderData { orderDataExpireTime, ..} ) <$> f orderDataExpireTime
{-# INLINE orderDataExpireTimeL #-}

-- | 'orderDataExecInst' Lens
orderDataExecInstL :: Lens_' OrderData (Maybe [E'ExecInst])
orderDataExecInstL f OrderData{..} = (\orderDataExecInst -> OrderData { orderDataExecInst, ..} ) <$> f orderDataExecInst
{-# INLINE orderDataExecInstL #-}



-- * OrderLive

-- | 'orderLiveType' Lens
orderLiveTypeL :: Lens_' OrderLive (Maybe Text)
orderLiveTypeL f OrderLive{..} = (\orderLiveType -> OrderLive { orderLiveType, ..} ) <$> f orderLiveType
{-# INLINE orderLiveTypeL #-}

-- | 'orderLiveExchangeId' Lens
orderLiveExchangeIdL :: Lens_' OrderLive (Maybe Text)
orderLiveExchangeIdL f OrderLive{..} = (\orderLiveExchangeId -> OrderLive { orderLiveExchangeId, ..} ) <$> f orderLiveExchangeId
{-# INLINE orderLiveExchangeIdL #-}

-- | 'orderLiveId' Lens
orderLiveIdL :: Lens_' OrderLive (Maybe Text)
orderLiveIdL f OrderLive{..} = (\orderLiveId -> OrderLive { orderLiveId, ..} ) <$> f orderLiveId
{-# INLINE orderLiveIdL #-}

-- | 'orderLiveClientOrderIdFormatExchange' Lens
orderLiveClientOrderIdFormatExchangeL :: Lens_' OrderLive (Maybe Text)
orderLiveClientOrderIdFormatExchangeL f OrderLive{..} = (\orderLiveClientOrderIdFormatExchange -> OrderLive { orderLiveClientOrderIdFormatExchange, ..} ) <$> f orderLiveClientOrderIdFormatExchange
{-# INLINE orderLiveClientOrderIdFormatExchangeL #-}

-- | 'orderLiveExchangeOrderId' Lens
orderLiveExchangeOrderIdL :: Lens_' OrderLive (Maybe Text)
orderLiveExchangeOrderIdL f OrderLive{..} = (\orderLiveExchangeOrderId -> OrderLive { orderLiveExchangeOrderId, ..} ) <$> f orderLiveExchangeOrderId
{-# INLINE orderLiveExchangeOrderIdL #-}

-- | 'orderLiveAmountOpen' Lens
orderLiveAmountOpenL :: Lens_' OrderLive (Maybe Double)
orderLiveAmountOpenL f OrderLive{..} = (\orderLiveAmountOpen -> OrderLive { orderLiveAmountOpen, ..} ) <$> f orderLiveAmountOpen
{-# INLINE orderLiveAmountOpenL #-}

-- | 'orderLiveAmountFilled' Lens
orderLiveAmountFilledL :: Lens_' OrderLive (Maybe Double)
orderLiveAmountFilledL f OrderLive{..} = (\orderLiveAmountFilled -> OrderLive { orderLiveAmountFilled, ..} ) <$> f orderLiveAmountFilled
{-# INLINE orderLiveAmountFilledL #-}

-- | 'orderLiveStatus' Lens
orderLiveStatusL :: Lens_' OrderLive (Maybe OrderStatus)
orderLiveStatusL f OrderLive{..} = (\orderLiveStatus -> OrderLive { orderLiveStatus, ..} ) <$> f orderLiveStatus
{-# INLINE orderLiveStatusL #-}

-- | 'orderLiveTimeOrder' Lens
orderLiveTimeOrderL :: Lens_' OrderLive (Maybe [[Text]])
orderLiveTimeOrderL f OrderLive{..} = (\orderLiveTimeOrder -> OrderLive { orderLiveTimeOrder, ..} ) <$> f orderLiveTimeOrder
{-# INLINE orderLiveTimeOrderL #-}

-- | 'orderLiveErrorMessage' Lens
orderLiveErrorMessageL :: Lens_' OrderLive (Maybe Text)
orderLiveErrorMessageL f OrderLive{..} = (\orderLiveErrorMessage -> OrderLive { orderLiveErrorMessage, ..} ) <$> f orderLiveErrorMessage
{-# INLINE orderLiveErrorMessageL #-}

-- | 'orderLiveClientOrderId' Lens
orderLiveClientOrderIdL :: Lens_' OrderLive (Maybe Text)
orderLiveClientOrderIdL f OrderLive{..} = (\orderLiveClientOrderId -> OrderLive { orderLiveClientOrderId, ..} ) <$> f orderLiveClientOrderId
{-# INLINE orderLiveClientOrderIdL #-}

-- | 'orderLiveSymbolExchange' Lens
orderLiveSymbolExchangeL :: Lens_' OrderLive (Maybe Text)
orderLiveSymbolExchangeL f OrderLive{..} = (\orderLiveSymbolExchange -> OrderLive { orderLiveSymbolExchange, ..} ) <$> f orderLiveSymbolExchange
{-# INLINE orderLiveSymbolExchangeL #-}

-- | 'orderLiveSymbolCoinapi' Lens
orderLiveSymbolCoinapiL :: Lens_' OrderLive (Maybe Text)
orderLiveSymbolCoinapiL f OrderLive{..} = (\orderLiveSymbolCoinapi -> OrderLive { orderLiveSymbolCoinapi, ..} ) <$> f orderLiveSymbolCoinapi
{-# INLINE orderLiveSymbolCoinapiL #-}

-- | 'orderLiveAmountOrder' Lens
orderLiveAmountOrderL :: Lens_' OrderLive (Maybe Double)
orderLiveAmountOrderL f OrderLive{..} = (\orderLiveAmountOrder -> OrderLive { orderLiveAmountOrder, ..} ) <$> f orderLiveAmountOrder
{-# INLINE orderLiveAmountOrderL #-}

-- | 'orderLivePrice' Lens
orderLivePriceL :: Lens_' OrderLive (Maybe Double)
orderLivePriceL f OrderLive{..} = (\orderLivePrice -> OrderLive { orderLivePrice, ..} ) <$> f orderLivePrice
{-# INLINE orderLivePriceL #-}

-- | 'orderLiveSide' Lens
orderLiveSideL :: Lens_' OrderLive (Maybe E'Side)
orderLiveSideL f OrderLive{..} = (\orderLiveSide -> OrderLive { orderLiveSide, ..} ) <$> f orderLiveSide
{-# INLINE orderLiveSideL #-}

-- | 'orderLiveOrderType' Lens
orderLiveOrderTypeL :: Lens_' OrderLive (Maybe E'OrderType)
orderLiveOrderTypeL f OrderLive{..} = (\orderLiveOrderType -> OrderLive { orderLiveOrderType, ..} ) <$> f orderLiveOrderType
{-# INLINE orderLiveOrderTypeL #-}

-- | 'orderLiveTimeInForce' Lens
orderLiveTimeInForceL :: Lens_' OrderLive (Maybe TimeInForce)
orderLiveTimeInForceL f OrderLive{..} = (\orderLiveTimeInForce -> OrderLive { orderLiveTimeInForce, ..} ) <$> f orderLiveTimeInForce
{-# INLINE orderLiveTimeInForceL #-}

-- | 'orderLiveExpireTime' Lens
orderLiveExpireTimeL :: Lens_' OrderLive (Maybe Date)
orderLiveExpireTimeL f OrderLive{..} = (\orderLiveExpireTime -> OrderLive { orderLiveExpireTime, ..} ) <$> f orderLiveExpireTime
{-# INLINE orderLiveExpireTimeL #-}

-- | 'orderLiveExecInst' Lens
orderLiveExecInstL :: Lens_' OrderLive (Maybe [E'ExecInst])
orderLiveExecInstL f OrderLive{..} = (\orderLiveExecInst -> OrderLive { orderLiveExecInst, ..} ) <$> f orderLiveExecInst
{-# INLINE orderLiveExecInstL #-}



-- * OrderStatus



-- * Position

-- | 'positionType' Lens
positionTypeL :: Lens_' Position (Maybe Text)
positionTypeL f Position{..} = (\positionType -> Position { positionType, ..} ) <$> f positionType
{-# INLINE positionTypeL #-}

-- | 'positionExchangeName' Lens
positionExchangeNameL :: Lens_' Position (Maybe Text)
positionExchangeNameL f Position{..} = (\positionExchangeName -> Position { positionExchangeName, ..} ) <$> f positionExchangeName
{-# INLINE positionExchangeNameL #-}

-- | 'positionData' Lens
positionDataL :: Lens_' Position (Maybe [PositionData])
positionDataL f Position{..} = (\positionData -> Position { positionData, ..} ) <$> f positionData
{-# INLINE positionDataL #-}



-- * PositionData

-- | 'positionDataId' Lens
positionDataIdL :: Lens_' PositionData (Maybe Text)
positionDataIdL f PositionData{..} = (\positionDataId -> PositionData { positionDataId, ..} ) <$> f positionDataId
{-# INLINE positionDataIdL #-}

-- | 'positionDataSymbolExchange' Lens
positionDataSymbolExchangeL :: Lens_' PositionData (Maybe Text)
positionDataSymbolExchangeL f PositionData{..} = (\positionDataSymbolExchange -> PositionData { positionDataSymbolExchange, ..} ) <$> f positionDataSymbolExchange
{-# INLINE positionDataSymbolExchangeL #-}

-- | 'positionDataSymbolCoinapi' Lens
positionDataSymbolCoinapiL :: Lens_' PositionData (Maybe Text)
positionDataSymbolCoinapiL f PositionData{..} = (\positionDataSymbolCoinapi -> PositionData { positionDataSymbolCoinapi, ..} ) <$> f positionDataSymbolCoinapi
{-# INLINE positionDataSymbolCoinapiL #-}

-- | 'positionDataAvgEntryPrice' Lens
positionDataAvgEntryPriceL :: Lens_' PositionData (Maybe Double)
positionDataAvgEntryPriceL f PositionData{..} = (\positionDataAvgEntryPrice -> PositionData { positionDataAvgEntryPrice, ..} ) <$> f positionDataAvgEntryPrice
{-# INLINE positionDataAvgEntryPriceL #-}

-- | 'positionDataQuantity' Lens
positionDataQuantityL :: Lens_' PositionData (Maybe Double)
positionDataQuantityL f PositionData{..} = (\positionDataQuantity -> PositionData { positionDataQuantity, ..} ) <$> f positionDataQuantity
{-# INLINE positionDataQuantityL #-}

-- | 'positionDataIsBuy' Lens
positionDataIsBuyL :: Lens_' PositionData (Maybe Bool)
positionDataIsBuyL f PositionData{..} = (\positionDataIsBuy -> PositionData { positionDataIsBuy, ..} ) <$> f positionDataIsBuy
{-# INLINE positionDataIsBuyL #-}

-- | 'positionDataUnrealisedPnL' Lens
positionDataUnrealisedPnLL :: Lens_' PositionData (Maybe Double)
positionDataUnrealisedPnLL f PositionData{..} = (\positionDataUnrealisedPnL -> PositionData { positionDataUnrealisedPnL, ..} ) <$> f positionDataUnrealisedPnL
{-# INLINE positionDataUnrealisedPnLL #-}

-- | 'positionDataLeverage' Lens
positionDataLeverageL :: Lens_' PositionData (Maybe Double)
positionDataLeverageL f PositionData{..} = (\positionDataLeverage -> PositionData { positionDataLeverage, ..} ) <$> f positionDataLeverage
{-# INLINE positionDataLeverageL #-}

-- | 'positionDataCrossMargin' Lens
positionDataCrossMarginL :: Lens_' PositionData (Maybe Bool)
positionDataCrossMarginL f PositionData{..} = (\positionDataCrossMargin -> PositionData { positionDataCrossMargin, ..} ) <$> f positionDataCrossMargin
{-# INLINE positionDataCrossMarginL #-}

-- | 'positionDataLiquidationPrice' Lens
positionDataLiquidationPriceL :: Lens_' PositionData (Maybe Double)
positionDataLiquidationPriceL f PositionData{..} = (\positionDataLiquidationPrice -> PositionData { positionDataLiquidationPrice, ..} ) <$> f positionDataLiquidationPrice
{-# INLINE positionDataLiquidationPriceL #-}

-- | 'positionDataRawData' Lens
positionDataRawDataL :: Lens_' PositionData (Maybe Text)
positionDataRawDataL f PositionData{..} = (\positionDataRawData -> PositionData { positionDataRawData, ..} ) <$> f positionDataRawData
{-# INLINE positionDataRawDataL #-}



-- * TimeInForce


