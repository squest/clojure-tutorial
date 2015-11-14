(ns proone.tfor)

;; judulin : list comprehension



(defn foo-one [n]
  (for [i (range n)
        j (range i n)
        :while 
        :let [isqr (* i i)]]
    [i isqr j]))

(defn pita [lim]
  (for [a (range 3 lim)
        b (range a lim)
        :let [asqr (* a a)
              bsqr (* b b)
              csqr (+ asqr bsqr)
              c (Math/sqrt csqr)]
        :when (= (Math/floor c)
                 (Math/ceil c))]
    [a b (int c)]))
