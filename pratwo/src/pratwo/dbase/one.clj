(ns pratwo.dbase.one
  (:require
    [clj-uuid :as uids]
    [couchbase-clj.client :as cc]))

(defn uuid []
  (str (uids/v1)))

(defonce
  conn
  (cc/create-client
    {:bucket "play"
     :uris   ["http://127.0.0.1:8091/pools"]}))

(def data1
  {:nama "yang lain"
   :alamat "ini"
   :scores [1123 23 43 4534 54 67]
   :ctype "person"})



