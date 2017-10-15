(ns clojure-fizzbuzz.core
  (:gen-class))

(defn buzz
  [number]
  (if (= (mod number 5) 0)
    "buzz"
    number))

(defn fizz
  [number]
  (if (= (mod number 3) 0)
    "fizz"
    (buzz number)))

(defn fizzbuzz
  [number]
  (if (= (mod number 15) 0)
    "fizzbuzz"
    (fizz number)))

(defn -main
  [& args]
  (loop [iteration 1]
    (println (fizzbuzz iteration))
    (if (> iteration 99)
      (println "Fizzled out!")
      (recur (inc iteration)))))
