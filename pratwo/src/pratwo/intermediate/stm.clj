(ns pratwo.intermediate.stm)

(def something (range 10))

(defonce someone "joni")

;; Atom <- easiest one

(defonce some-number (atom 0))

;; Processor 2cores/4cores/8cores

;; Ref => more sophiscated

(defonce a-ref (ref 0))

(defn prime?
  [^long p]
  (cond
    (< p 2) false
    (== p 2) true
    (even? p) false
    :else (->> (range 3 (inc (int (Math/sqrt p))))
               (map #(rem p %))
               (every? pos?))))

(defn sum-primes
  [^long lim]
  (->> (range (inc lim))
       (filter prime?)
       (reduce +)))

(defonce scores
         (atom (for [i (range 200000)]
                 {:nama (str "joni-" i)
                  :score (rand-int 100)})))

(defn sorter []
  (loop []
    (reset! scores (sort-by :score @scores))
    (println (take 10 @scores))
    (do (Thread/sleep 5000)
        (recur))))








