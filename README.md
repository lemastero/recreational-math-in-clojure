# Recreational math in Clojure

running continuous tests
```bash
lein autoexpect
```

# Collatz conjecture
(1937 Lothar Collatz)

Sequence of positive integers, next integer is

```
f(n) = 3*n + 1 if n is odd
       n/2     if n is even
```

No matter what starting number we pick, this sequence will always reach 1.

For n == 1 there is cycle: 1 -> 4 -> 2 -> 1

For negative starting numbers there are cycles:

Forther reading / implementations:
* https://en.wikipedia.org/wiki/Collatz_conjecture
* Generalized 3n+1: http://www.numbertheory.org/pdfs/matthews-final-revised.pdf
* Marc Chamberland, The 3x+1 Problem: Status and Recent Work, 2013
* https://www.youtube.com/watch?v=t1I9uHF9X5Y
* https://www.youtube.com/watch?v=nxIHhpjE_dg
