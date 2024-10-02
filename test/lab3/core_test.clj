(ns lab3.core-test
  (:require [clojure.test :refer :all]
            [lab3.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest test-find-first
  (testing "Testing find-first"
    (is (= 1 (test-find-first [0 1 2 -5] odd?)))))
;; (deftest test-find-first [0 1 2 -5] neg?)
;; (deftest test-find-first [0 1 2 5] neg?)
;; (deftest test-find-first [] pos?) 
;; (deftest test-find-first [0 1 3 4 5] even?)
