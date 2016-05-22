(ns coincounter.models.memorycounter)

(def counter (ref 0))

(defn set-counter [] (dosync (ref-set counter 0)) (deref counter))

(defn update-counter [quantity] (dosync (alter counter +  quantity)))
