(ns code-wars.roman-numerals-test
  (:require [clojure.test :refer :all]
            [code-wars.roman-numerals :refer :all]))

(deftest a-test
  (testing "translate-roman-numerals"
    (is (= (translate-roman-numerals "XXI") 21))))
