(ns one.d)

;; pure functions => cuma depends on input
;; input yang sama => output sama
;; ga melakukan side-effects

;; impure functions => procedures

(def my-value 123)

(def my-var (atom 123))

;; my-var => []
;; (atom 'value)
;; (reset nama-atom 'value-baru)

;; jumlah 1-1000 yang kelipatan 3 or 5

(defn sol1a [lim]
  (->> (range lim)
       (filter #(or (zero? (rem % 3)) (zero? (rem % 5))))
       (reduce +)
       time))

(defn sol1f [lim]
  (->> (range lim)
       (keep #(when (or (zero? (rem % 3)) (zero? (rem % 5))) %))
       (reduce +)
       time))

(defn sol1b [lim]
  (time (- (+ (reduce + (range 3 lim 3))
              (apply + (range 5 lim 5)))
           (reduce + (range 15 lim 15)))))

(defn sol1c [lim]
  (->> (for [i (range lim)
             :when (or (zero? (rem i 3)) (zero? (rem i 5)))] i)
       (reduce +)
       time))

(defn sol1d [lim]
  (time (let [sum (atom 0)]
          (dotimes [i lim]
            (if (or (zero? (rem i 3)) (zero? (rem i 5)))
              (reset! sum (+ @sum i))))
          @sum)))

(defn sol1e [lim]
  (time (loop [i 1 sum 0]
          (if (>= i lim)
            sum
            (if (or (zero? (rem i 3)) (zero? (rem i 5)))
              (recur (+ i 1) (+ sum i))
              (recur (+ i 1) sum))))))

(defn fibo [n]
  (if (<= n 1) 1 (+ (fibo (dec n)) (fibo (- n 2)))))

(def mfibo
  (memoize
   (fn [n] (if (<= n 1) 1 (+ (mfibo (dec n)) (mfibo (- n 2)))))))

(defn sol2a [lim]
  (->> (range)
       (map fibo)
       (take-while (partial > lim))
       (filter even?)
       (reduce +)
       time))

(defn sol2b [lim]
  (->> (range)
       (map mfibo)
       (take-while (partial > lim))
       (filter even?)
       (reduce +)
       time))

(defn lfibo [n]
  (->> (iterate #(let [[a b] %] [b (+' a b)]) [1 1])
       (map first)
       (take n)))

;; fibo 10 => fibo 9 + fibo 8
;; fibo 9 => fibo 8 + fibo 7

;; pure functions => y = f (x)

(defn collatz [n]
  (cond (== n 1) 1
        (even? n) (+ 1 (collatz (quot n 2)))
        :else (+ 1 (collatz (+ 1 (* 3 n))))))

(defn sol14 [lim]
  (->> (range 1 lim)
       (map (juxt collatz identity))
       (apply max-key first)
       time))

;; sort-by group-by partition-by max-key merge-with
;; take-while drop-while reduce 




























