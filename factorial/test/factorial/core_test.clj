(ns factorial.core-test
  (:require [clojure.test :refer :all]
            [factorial.core :refer :all]))

;(deftest factorial-test-negative
 ; (is (thrown? Exception)))

(deftest factorial-test-0
  (is (= 1 (factorial 0))))

(deftest factorial-test
  (is (= 1 (factorial 1))))

(deftest factorial-test1
  (is (= 2 (factorial 2))))

(deftest factorial-test2
  (is (= 6 (factorial 3))))

