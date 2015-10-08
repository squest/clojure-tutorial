(ns one.b)

;; expt a m => a^m 
;; re-implement several clojure's functions
;; take drop zipmap map take-while drop-while...

"product (x & xs) 
-> (x & xs) empty? -> 1
-> x * product xs"

(defn product 
  [[x & xs]]
  (if x 
    (* x (product xs))
    1))

"prime? -> 1 & n" "2,3,4,5,6,n-1"

(defn iter-prime 
  [n i]
  (cond 
    (= n i) true
    (zero? (rem n i)) false
    :else (iter-prime n (inc i))))

(defn prime?
  [n]
  (cond (<= n 1) false
    (= n 2) true 
    :else (iter-prime n 2)))

(defn prime?2
  [n]
  (let [iter (fn iter [i]
               (cond (= n i) true
                 (zero? (rem n i)) false 
                 :else (iter (inc i))))]
    (cond (<= n 1) false 
      (= n 2) true 
      :else (iter 2))))

(defn prime?3 
  [n]
  (let [iter (fn iter [i]
               (cond (= n i) true 
                 (zero? (rem n i)) false 
                 :else (iter (+ i 2))))]
    (cond (<= n 1) false 
      (= n 2) true 
      (even? n) false
      :else (iter 3))))

(defn prime?4 
  [n]
  (let [akar-n (Math/sqrt n)
        iter (fn iter [i]
               (cond (> i akar-n) true 
                 (zero? (rem n i)) false
                 :else (iter (+ i 2))))]
    (cond (<= n 1) false 
      (= n 2) true 
      (even? n) false 
      :else (iter 3))))

(defn fak 
  [i]
  (if (<= i 1) 
    1 
    (*' i (fak (dec i)))))

"fak 10000 -> 1000 * fak 9999"
"fak "

(defn sum
  [[x & xs]]
  (if x (+' x (sum xs)) 0))

(defn sum'
  [lst]
  (loop [[x & xs] lst res 0]
    (if x 
      (recur xs (+ res x))
      res)))

(defn jumlah-dari-0-sampe-n
  [n]
  (loop [i 0 res 0]
    (if (> i n)
      res
      (recur (+ i 1) (+ res i)))))

"5"
"loop 0 0"
"loop 1 0"
"loop 2 0+1"
"loop 3 3"
"loop 4 6"
"loop 5 10"
"loop 6 -> 10"











"48"

"2 3 4 6 8 12 16 24"

"a*a = 48, "






















