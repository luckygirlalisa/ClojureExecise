(ns factorial.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn caculate-positive-factorial
  [x]
  (cond
   (> x 1) (* x (caculate-positive-factorial (- x 1)))
   :else 1
   ))

(defn factorial
  [x]
  (cond
    (< x 0) (throw (Exception. "Negative does not have factorial."))
   :else (caculate-positive-factorial x)
  )
)
(factorial 4)
