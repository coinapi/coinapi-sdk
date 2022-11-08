(ns on-chain-api.specs.uniswap-v2/token-day-data-v2-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def uniswap-v2/token-day-data-v2-dto-data
  {
   (ds/opt :entry_time) inst?
   (ds/opt :recv_time) inst?
   (ds/opt :block_number) int?
   (ds/opt :id) string?
   (ds/opt :date) int?
   (ds/opt :token) string?
   (ds/opt :daily_volume_token) string?
   (ds/opt :daily_volume_eth) string?
   (ds/opt :daily_volume_usd) string?
   (ds/opt :daily_txns) string?
   (ds/opt :total_liquidity_token) string?
   (ds/opt :total_liquidity_eth) string?
   (ds/opt :total_liquidity_usd) string?
   (ds/opt :price_usd) string?
   (ds/opt :vid) int?
   })

(def uniswap-v2/token-day-data-v2-dto-spec
  (ds/spec
    {:name ::uniswap-v2/token-day-data-v2-dto
     :spec uniswap-v2/token-day-data-v2-dto-data}))
