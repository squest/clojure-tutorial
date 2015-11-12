(ns proone.core
  (:require
    [clojure.set :as cs :refer [difference intersection]]
    [clojure.string :as st :refer :all]))

(defn cube [x]
  (* x x x))

(defn mapi [x]
  (str x "asdxdsa" (apply str (reverse x))))
