(ns sscom.core
  (:require [sscom.system :as system]))

(defn -main [& args]
  (system/init)
  (system/start))
