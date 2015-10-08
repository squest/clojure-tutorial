(ns one.c)

;; idiomatic clojure -> clojure & haskell

;; Higher order functions ++ list comprehensions

;; either inputnya function or output function

(defn sum [[x & xs]]
  (if x
    (+ x (sum xs))
    0))

(defn product [[x & xs]]
  (if x
    (*' x (product xs))
    1))

(defn folding [f [x & xs]]
  (if x
    (f x (folding f xs))
    (f)))

(defn kuadratin-semua [[x & xs]]
  (if x
    (cons (* x x) (kuadratin-semua xs))
    []))

(defn pangkat-tiga-in-semua [[x & xs]]
  (if x
    (cons (* x x x) (pangkat-tiga-in-semua xs))
    []))

(defn f-in-semua [f [x & xs]]
  (if x
    (cons (f x) (f-in-semua f xs))
    []))

;; folding -> reduce
;; map -> the same f to all elements


;; jumlah semua kuadrat bil ganjil dari 1 - 100

;; global & local scope

(def kuadrats (map #(* % %) (range 1 100)))

(def memap (zipmap [:a :b :c :d :e :f :g]
                   (range 10 20)))

;; kuadrat bilangan 1-1000 yang hasil kuadratnya itu abis dibagi
;; 19 atau 37

(defn prime?
  [n]
  (->> (range 2 (inc (int (Math/sqrt n))))
       (every? #(pos? (rem n %)))))


;; Outputnya function







