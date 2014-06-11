(ns factorial.core-test
  (:require [clojure.test :refer :all]
            [factorial.core :refer :all]))

(deftest factorial-test
  (is (= 1 (factorial 1))))
