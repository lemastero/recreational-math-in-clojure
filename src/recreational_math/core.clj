(ns recreational-math.core
  (:gen-class))

(defn hailstone-nubers-by [next-number n]
 (if (= n 1)
   '(1)
   (cons n (hailstone-nubers-by next-number (next-number n)))))

(defn hailstone-next-by [next-for-odd n]
  (if (even? n)
    (/ n 2)
    (next-for-odd n)))

(defn three-n-plus-1 [n]
  (inc (* 3 n)))

(defn hailstone-next [n]
  (hailstone-next-by three-n-plus-1 n))

(defn hailstone-numbers [n]
 (hailstone-nubers-by hailstone-next n))

(defn three-n-plus-1-half [n]
  (/ (three-n-plus-1 n) 2))

(defn hailstone-next-compress [n]
  (hailstone-next-by three-n-plus-1-half n))

(defn hailstone-numbers-compress [n]
 (hailstone-nubers-by hailstone-next-compress n))
