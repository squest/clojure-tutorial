(ns pratwo.intermediate.trans)

(defn prime?
  [^long p]
  (cond
    (< p 2) false
    (== p 2) true
    (even? p) false
    :else (->> (range 3 (inc (int (Math/sqrt p))))
               (map #(rem p %))
               (every? pos?))))


