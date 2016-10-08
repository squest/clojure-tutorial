(ns user
  (:require [clojure.string :as cs]))

(def users
  (atom ["skadinyo" "0dsapoetra" "beleje" "calvin91" "awol" "leledumbo" "wisnuops" "dizqar"
         "pelaut" "neilt" "azrax" "codxse" "gilangardya" "dhiamonkey"]))

(defn progress [nama]
  (let [res (-> (slurp (str "http://www.4clojure.com/user/" nama))
                (cs/split #"/156")
                first)]
    (subs res (- (count res) 2))))

(defn all []
  (doseq [nama @users]
    (println (str "Ucil : " nama))
    (println (str "Progress : " (progress nama)))
    (println "---------------------")))
