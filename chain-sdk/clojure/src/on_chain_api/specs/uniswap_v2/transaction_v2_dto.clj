(ns on-chain-api.specs.uniswap-v2/transaction-v2-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def uniswap-v2/transaction-v2-dto-data
  {
   (ds/opt :entry_time) inst?
   (ds/opt :recv_time) inst?
   (ds/opt :block_number) int?
   (ds/opt :id) string?
   (ds/opt :timestamp) string?
   (ds/opt :mints) (s/coll-of string?)
   (ds/opt :burns) (s/coll-of string?)
   (ds/opt :swaps) (s/coll-of string?)
   (ds/opt :vid) int?
   })

(def uniswap-v2/transaction-v2-dto-spec
  (ds/spec
    {:name ::uniswap-v2/transaction-v2-dto
     :spec uniswap-v2/transaction-v2-dto-data}))
