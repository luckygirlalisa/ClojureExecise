(ns clojure-learning.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn abs
  [x]
  (cond
   (< x 0) (- x)
   :else x
  )
)

(defn square
  [x]
  (* x x)
)

(defn good_enough
  [x guess]
  (< (abs (- x (square guess))) 0.001)
)

(defn improve
  [x guess]
  (/ (+ guess (/ x guess)) 2)
)

(defn sqrt
  [x guess]
  (cond
   (good_enough x guess) (double guess)
   :else (sqrt x (improve x guess))
   )
)
