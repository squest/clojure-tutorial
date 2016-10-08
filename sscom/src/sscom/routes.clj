(ns sscom.routes
  (:require
    [compojure.core :refer [routes GET POST]]
    [compojure.route :refer [resources not-found]]
    [com.stuartsierra.component :as component]))

(declare all-articles main-routes misc-routes all-routes)

(defrecord Routes [database public-directory]
  component/Lifecycle
  (start [this]
    (assoc this
      :tabel (all-routes database public-directory)))
  (stop [this]
    this))

(defn create
  [public-directory]
  (component/using
    (map->Routes {:public-directory public-directory})
    [:database]))

;; These are all private functions

(defn- all-articles [database]
  {:boongan "this is a boongan"})

(defn- main-routes [database]
  (routes
    (GET "/" request
      "Say hi")
    (GET "/articles" request
      (all-articles database))))

(defn- misc-routes [public-directory]
  (routes
    (resources public-directory)
    (not-found "Not found boy")))

(defn- all-routes
  [database public-directory]
  (routes (main-routes database)
          (misc-routes public-directory)))
