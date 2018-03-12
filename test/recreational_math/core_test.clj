(ns recreational-math.core-test
  (:require [expectations :refer :all]
            [recreational-math.core :refer :all]))

;; hailstone-next
(expect (hailstone-next 1) 4)
(expect (hailstone-next 4) 2)
(expect (hailstone-next 2) 1)

;; hailstone-numbers
(expect (hailstone-numbers 1) '(1))
(expect (hailstone-numbers 2) '(2 1))
(expect (hailstone-numbers 3) '(3 10 5 16 8 4 2 1))
(expect (hailstone-numbers 6) '(6 3 10 5 16 8 4 2 1))
(expect
  (hailstone-numbers 7)
  '(7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1))
