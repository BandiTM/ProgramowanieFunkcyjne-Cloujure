(ns zad1)

(defn square
  [x]
  (* x x)
  )

(defn abs
  [x]
  (if (< x 0)
    (- x)
    x))

(defn avg
  [x y]
  (/ (+ x y) 2))

(defn improve
  [y x]
  (avg y (/ x y)))

(defn heron-sqrt
  [y x kroki]
  (if (= kroki 0 )
    y
    (heron-sqrt (improve y x) x (dec kroki))
    )
  )

(println (double (heron-sqrt 1 25 2)) )
