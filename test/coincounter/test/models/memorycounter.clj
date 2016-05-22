(ns coincounter.test.models.memorycounter
  (:use clojure.test
        coincounter.models.memorycounter))

(deftest test-setup
  (testing "initial setup must be 0"
    (let [count (set-counter)]
      (is (= count 0)))))

(deftest test-adding
  (testing "Adding to no number"
    (set-counter)
    (update-counter 1)
    (let [count (deref counter)]
      (is (= count 1)))))

(deftest test-substracting
  (testing "Adding to no number"
    (set-counter)
    (update-counter -1)
    (let [count (deref counter)]
      (is (= count -1)))))
