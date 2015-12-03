(ns pratwo.two
  (:require
    [pratwo.core :refer :all]
    [pratwo.one :refer [mapin] :as one]))

(defn another-one
  []
  (mapin 10))

(defn pake-one
  []
  (one/mapin 10))

(defn semua []
  (+ (cube 100) (square 20)))
