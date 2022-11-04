(ns on-chain-api.specs.uniswap-v3-bundle-v3-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def uniswap-v3-bundle-v3-dto-data
  {
   (ds/opt :entry_time) inst?
   (ds/opt :recv_time) inst?
   (ds/opt :block_number) int?
   (ds/opt :id) string?
   (ds/opt :eth_price_usd) string?
   (ds/opt :vid) int?
   })

(def uniswap-v3-bundle-v3-dto-spec
  (ds/spec
    {:name ::uniswap-v3-bundle-v3-dto
     :spec uniswap-v3-bundle-v3-dto-data}))
