(ns zad2)

(defn square
  [x]
  (* x x))

(defn dotrzeciej
  [x]
  (* x x x)
  )

(defn abs
  [x]
  (if (< x 0)
    (- x)
    x))

(defn good-enough?
  [y x]
  (< (abs (- x (dotrzeciej y))) 0.0001)
  )

(defn improve
  [y x]
  (/ (+(/ x (square y)) (* 2 y)) 3)
  )

(defn trzeci
  [y x]
  (if (good-enough? y x)
    y
    (trzeci (improve y x) x)
    )
  )

(println (double (trzeci 3 729)))
(println (trzeci 3 729))
