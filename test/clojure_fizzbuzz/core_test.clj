(ns clojure-fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [clojure-fizzbuzz.core :refer :all]))

(deftest buzz-success-test
  (testing "Buzzing"
    (is (= (buzz 5) "buzz"))))

(deftest buzz-fail-test
  (testing "Not buzzing"
    (is (= (buzz 7) 7))))

(deftest fizz-success-test
  (testing "Fizzing")
    (is (= (fizz 3) "fizz")))

(deftest fizz-fail-test
  (testing "Not fizzing"
    (is (= (fizz 2) 2))))

(deftest buzzing-not-fizzing
  (testing "Buzzing rather than fizzing"
    (is (= (fizz 5) "buzz"))))

(deftest fizzbuzz-sucess-test
  (testing "Fizzbuzzing"
    (is (= (fizzbuzz 15) "fizzbuzz"))))

(deftest fizzbuzz-fail-test
  (testing "Not fizzbuzzing"
    (is (= (fizzbuzz 17) 17))))

(deftest fizz-but-not-buzz
  (testing "Fizzing without buzzing"
    (is (= (fizzbuzz 3) "fizz"))))

(deftest buzz-but-not-fizz
  (testing "Buzzing without fizzing"
    (is (= (fizzbuzz 5) "buzz"))))
