(ns placid-fish.core-test
  (:require [clojure.test :refer :all]
            [placid-fish.core :refer :all]))

(deftest absolute-should-not-throw
  (testing "absolute should not throw"
    (testing "with valid data"
      (is (absolute? "https://example.com")))
    (testing "with nil"
      (is (= nil (absolute? nil))))))
