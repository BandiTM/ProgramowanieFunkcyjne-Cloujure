(ns zad4)

(defonce persons-atom (atom {}))

(defn add-person!
  [email first-name last-name city street number post-code ]
  (swap! persons-atom assoc
         email {:first-name first-name
                :last-name  last-name
                :city       city
                :street     street
                :number     number
                :postal     post-code
                }))

(defn first-name
  [email]
  (:first-name (@persons-atom email)))

(defn last-name
  [email]
  (:last-name (@persons-atom email)))

(defn city
  [email]
  (:city (@persons-atom email))
  )

(defn street
  [email]
  (:street (@persons-atom email))
  )
(defn number
  [email]
  (:number (@persons-atom email))
  )

(defn  post-code
  [email]
  (:postal (@persons-atom email))
  )

(add-person! "kamilbandura1@gmail.com" "Kamil" "Bandura" "Komorow" "Zarzeczna" "169a" "97-200")
(println (first-name "kamilbandura1@gmail.com") (last-name "kamilbandura1@gmail.com"))
