(ns one.a)

(defn square 
  [x]
  (* x x))

(defn cube
  [x]
  (*  x x x))

(defn mutlak
  [x]
  (if (pos? x) x (- x)))

(defn what-this?
  [x]
  (cond
    (pos? x) "positif"
    (neg? x) "negatip"
    :else "enol"))

(def x 123)

(comment 
  nyari => kecap?)

(defn kecap
  [a b c]
  (let [det (Math/sqrt (- (square b) (* 4 a c)))]
    [(/ (+ (- b) det) (* 2 a))
     (/ (- (- b) det) (* 2 a))]))

(defn ngasal1
  [x]
  (let [a (+ x x)]
    (let [b (* a x)]
      (+ a b x))))

(comment 
  (let [a 1]
    (let [b (+ a 10)]
      (* a b (+ a b))))
  
  (let [b (+ 1 10)]
    (* 1 b (+ 1 b)))
  
  (* 1 11 (+ 1 11))
  
  (* 1 11 12))

(comment 
  (* (- 9 3) (+ (* 3 2) 43))
  (* 6 (+ 6 43))
  (* 6 49))

(defn kecap 
  [a b c x?]
  (let [adisk (Math/sqrt (- (square b) (* 4 a c)))]
    (/ (+ (- b) 
          (if (= x? 1) 
            adisk 
            (- adisk)))
       (* 2 a))))

(defn sayhello
  [nama]
  (str "Hello, " nama "!"))

;; n! = n * (n-1)!
;; n! => n == 1 => n! = 1

(defn faktorial
  [n]
  (if (<= n 1) 
    1 
    (* n (faktorial (dec n)))))

(comment 
  (faktorial 4) => (* 4 (faktorial 3)) => (* 4 6) => 24
  (faktorial 3) => (* 3 (faktorial 2)) => (* 3 2)
  (faktorial 2) => (* 2 (faktorial 1)) => (* 2 1)
  (faktorial 1) => 1)

;; sum, product, take, drop, fibo

(defn sum 
  [xs]
  (if (empty? xs)
    0
    (+ (first xs) (sum (rest xs)))))

(defn sum'
  [[x & xs]]
  (if x (+ x (sum' xs)) 0))


(defn drop'
  [n xs]
  (cond 
    (zero? n) xs
    (empty? xs) '()
    :else (drop' (- n 1) (rest xs))))

;; product, take, fibo
;; map, reduce, filter, keep, 
;; zipmap, merge, assoc, dissoc, dll

(comment 
  (drop 3 [1 2 3 4 5 6 7])
  (drop 2 [2 3 4 5 6 7])
  (drop 1 [3 4 5 6 7])
  (drop 0 [3 4 5 6 7]) => xs)

;; destructuring





















