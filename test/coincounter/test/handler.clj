(ns coincounter.test.handler
  (:use clojure.test
        ring.mock.request
        coincounter.handler))

(deftest test-app
  (testing "main route"
    (let [response (app (request :get "/"))]
      (is (= (:status response) 200))
      (is (.contains (:body response) "This is my counter"))))

  (testing "not-found route"
    (let [response (app (request :get "/invalid"))]
      (is (= (:status response) 404)))))
