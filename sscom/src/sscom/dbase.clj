(ns sscom.dbase
  (:require
    [couchbase-clj.client :as couch]
    [com.stuartsierra.component :as component]))

(defrecord Database [uris bucket]
  component/Lifecycle
  (start [this]
    (assoc this
      :connection
      (couch/create-client {:uris uris :bucket bucket})))
  (stop [this]
    (couch/shutdown (:connection this))
    (dissoc this :connection)))

(defn create [uris bucket]
  (map->Database {:uris uris :bucket bucket}))


