(ns pratwo.one
  (:require
    [pratwo.core :as co]
    [clojure.string :as cs]
    [clojure.java.io :as io]
    [clojure.set :as st]))

(defn mapin
  [num]
  (map co/square (range num)))
