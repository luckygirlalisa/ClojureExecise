(ns clojure-learning.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.
(defn abs
  [x]
  (cond
   (< x 0) (- x)
   :else x
  )
)
(abs -3)
(abs 3)

(defn square
  [x]
  (* x x)
)
(square 2)

(defn good_enough
  [x guess]
  (< (abs (- x (square guess))) 0.001)
)
(good_enough 4 2.001)
(good_enough 4 2.0001)

(defn improve
  [x guess]
  (/ (+ guess (/ x guess)) 2)
)
(improve 4 1)

(defn sqrt
  [x guess]
  (cond
   (good_enough x guess) (double guess)
   :else (sqrt x (improve x guess))
   )
)
(sqrt 4 1)
