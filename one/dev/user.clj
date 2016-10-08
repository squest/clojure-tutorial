(ns user)

(defn foo [a-list]
  (reduce #(+ % %2) a-list))

;; [1 2 3 4 5]
;; (+ 1 2) => 3
;; (+ 3 3) => 6
;; (+ 6 4) => 10
;; (+ 10 5) => 15


(defn foo-too [l]
  (reduce (fn [a b] (cons b (reverse a))) [] l))

;; [] 0 => [0]
;; [0] 1 => (1 0)
;; (1 0) 2 => (2 0 1)

(defn prime? [n]
  (->> (range 2 (inc (int (Math/sqrt n))))
       (every? #(pos? (rem n %)))))
