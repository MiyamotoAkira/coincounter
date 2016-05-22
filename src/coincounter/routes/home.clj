(ns coincounter.routes.home
  (:require [compojure.core :refer :all]
            [coincounter.views.layout :as layout]
            [coincounter.models.memorycounter :as store]))

(defn counter [value error]
  (layout/common [:h1 "This is my counter"]
                 [:label#error error]
                 [:label#message "My coins"]
                 [:label#value value]
                 [:a#plus {:href "/plus"} "Plus"]
                 [:a#minus {:href "/minus"} "Minus"]))

(defn home []
  (counter (deref store/counter) ""))

(defn plus []
  (store/update-counter 1)
  (home))

(defn minus []
  (store/update-counter -1)
  (home))

(defroutes home-routes
  (GET "/" [] (home))
  (GET "/plus" [] (plus))
  (GET "/minus" [] (minus)))
