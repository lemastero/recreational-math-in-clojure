(ns recreational-math.core
  (:gen-class))

(defn hailstone-next [n]
  (if (even? n)
    (/ n 2)
    (inc (* n 3))))

(defn hailstone-numbers [n]
 (if (= n 1)
   '(1)
   (cons n (hailstone-numbers (hailstone-next n)))))
