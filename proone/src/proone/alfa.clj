(ns proone.alfa
  (:require
    [proone.core :as c ]
    [hiccup.core :refer [h html]]
    [hiccup.page :refer [html5]]))

(defn mukain [x]
  (c/mapi (str (c/cube x))))

(defn home-page
  [somebody-to-lo-what-to-lo]
  (html5
    [:head
     [:title "this title"]]
    [:body
     [:div
      [:center
       [:h1 (str "Hello " somebody-to-lo-what-to-lo)]
       [:h1 [:a {:href "http://zenius.net"}
             "This is the link"]]]]]))

(defn pangkat
  [x]
  (if (zero? x)
    (fn [a] 1)
    (fn [a] (* a ((pangkat (dec x)) a)))))

(defn expt
  [a m]
  (if (zero? m)
    1
    (* a (expt a (dec m)))))

(defn sum-primes
  [lim]
  (->> (range 3 (+ lim 1) 2)
       (filter #(every? (fn [x] (pos? (rem % x)))
                        (range 3 (inc (Math/sqrt %)))))
       (reduce +)
       (+ 2)))

(defn sum-primes'
  [lim]
  (->> (transduce
         (filter #(every? (fn [x] (pos? (rem % x)))
                          (range 3 (inc (Math/sqrt %)))))
         + (range 3 (+ lim 1) 2))
       (+ 2)))

(defn ^long sum-sieve
  [^long lim]
  (let [primes (boolean-array (+ lim 1) true)
        llim (+ 1 (int (Math/sqrt lim)))]
    (loop [i (int 3) res (int 2)]
      (if (>= i lim)
        res
        (if (<= i llim)
          (if (aget primes i)
            (do (loop [j (int (* i i))]
                  (when (<= j lim)
                    (aset primes j false)
                    (recur (+ j i i))))
                (recur (+ i 2) (+ res i)))
            (recur (+ i 2) res))
          (if (aget primes i)
            (recur (+ i 2) (+ res i))
            (recur (+ i 2) res)))))))
















