(ns pratwo.stat)

(defn freq
  ([lst]
   (frequencies lst))
  ([lst ks]
    (->> (map #(select-keys % ks) lst)
         (map #(frequencies (val %)))
         (zipmap ks))))

(defn mean
  [lst]
  (double (/ (reduce + lst) (count lst))))

(defn prime?
  [p]
  (cond (< p 2) false
        (== p 2) true
        (even? p) false
        :else (->> (range 3 (inc (Math/sqrt p)) 2)
                   (every? #(pos? (rem p %))))))