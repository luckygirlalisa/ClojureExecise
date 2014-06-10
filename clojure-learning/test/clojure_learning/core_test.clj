(ns clojure-learning.core-test
  (:require [clojure.test :refer :all]
            [clojure-learning.core :refer :all]))

(deftest abs-test
  (is (= 2 (abs -2))))

(deftest square-test
  (is (= 4 (square 2))))

(deftest good-enough-test-good
  (is (= true (good_enough 4 2.0001))))

(deftest good-enough-test-sad
  (is (= false (good_enough 4 2.001))))

(deftest improve-test
  (is (= 5/2 (improve 4 1))))

(defn can-accept
  [x]
  (< (abs x) 0.01))

(deftest sqrt-test
  (is (can-accept
       (- 2 (sqrt 4 1)))
  )
)
