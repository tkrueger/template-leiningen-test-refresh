(ns test-refresh.core-test
  (:require [clojure.test :refer :all]
            [test-refresh.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= (hash-map :key1 1, :key2 2) (hash-map :key1 1, :key2 3)))))
