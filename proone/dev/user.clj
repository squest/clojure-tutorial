(ns user
  (:require [clojure.string :as cs]))

(defn progress [nama]
  (let [res (-> (slurp (str "http://www.4clojure.com/user/" nama))
                (cs/split #"/156")
                first)]
    (subs res (- (count res) 2))))

(defn all []
  (doseq [nama ["skadinyo" "0dsapoetra" "beleje" "calvin91" "wisnuops" "dizqar" "pelaut" "neilt" "azrax" "codxse" "gilangardya" "dhiamonkey"]]
    (println (str "Ucil : " nama))
    (println (str "Progress : " (progress nama)))
    (println "---------------------")))
