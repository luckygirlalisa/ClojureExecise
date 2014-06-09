(ns clojure-learning.core-test
  (:require [clojure.test :refer :all]
            [clojure-learning.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest abs-test
  (is (= 2 (abs -2))))

(deftest square-test
  (is (= 4 (square 2))))
