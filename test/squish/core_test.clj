(ns squish.core-test
  (:require [clojure.test :refer :all]
            [squish.core :refer :all]))

(deftest test-squish
  (testing "Squish return a string which was cleaned from whitespaces"
    (is (= "Multi-line string" (squish "Multi-line
            string" )))
    (is (= "foo bar boo" (squish "  foo   bar    \n   \t   boo   ")))))
