(ns tutone.core)

(def mvec [1 2 3 4 5 6 7])

(def mlist (range 1 20 2))

(def people-in-mylife {:nama "bokir" :julukan "Joni"})

(defn square [x] (* x x))

(defn cube 
  [x]
  (* x x x))

;; Ini komen sesuatu yang ga dibaca sama clojure...

;; eh ini belom beres masih error

(defn pk 
  [a b c]
  (fn [x] 
    (+ (* a (square x))
       (* b x)
       c)))

(defn mutlak 
  [x]
  (if (pos? x) x (- x)))

(defn apanih?
  [x]
  (if (> x 0)
    "positive"
    (if (= x 0) "enol" "negatip")))

(defn apanih?part2
  [x]
  (cond 
    (> x 0) "positive"
    (= x 0) "enol"
    (< x -5) "negatip"
    :else "ga mungkin"))




















