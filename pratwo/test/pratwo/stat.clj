(ns pratwo.stat
  (:require
    [clojure.test :refer :all]
    [pratwo.stat :refer :all]))

(deftest testing-freq
  (is (= 2 (+ 1 1)))
  (is (= 10 (reduce + (range 5))))
  (is (= {10 1 12 2} (freq [10 12 12])))
  (is (== 2 (mean (repeat 10 2))))
  (testing "prime function"
    (is (= false (prime? -2)))
    (is (= true (prime? 2)))
    (is (= [] (filter prime? (range 4 100 2))))
    (is (= [3 5 7 11 13 17 19]
           (filter prime? (range 3 20 2))))))
