(ns sscom.system
  (:require
    [com.stuartsierra.component :as component]
    [sscom.dbase :as db]
    [sscom.routes :as routes]
    [sscom.server :as server]
    [clojure.tools.namespace.repl :refer [refresh]]))

(defn create-system
  [config-file]
  (let [{:keys [port db public-directory]}
        (->> config-file slurp read-string)
        {:keys [uris bucket]} db]
    (component/system-map
      :database (db/create uris bucket)
      :routes (routes/create public-directory)
      :server (server/create port))))

(def conf "resources/config.edn")

(defonce system (create-system conf))

(defn init []
  "Function to initiate the system"
  (alter-var-root
    #'system
    (constantly (create-system conf))))

(defn start
  "Function to start the system, that is starting all the components and resolving
  the dependencies of each component."
  []
  (alter-var-root
    #'system
    component/start))

(defn stop
  "Function to stop the system, and stop all of its components according to the
  dependencies of each component."
  []
  (alter-var-root
    #'system
    (fn [s] (component/stop s))))

(defn go
  "The function to be called from the REPL for starting the system"
  []
  (init)
  (start)
  system)

(defn reset
  "Reset the system in REPL after changing some codes"
  []
  (stop)
  (refresh :after 'sscom.system/go))