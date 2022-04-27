(ns placid-fish.core
  (:require [org.bovinegenius.exploding-fish :as ef]))

(defn absolute?
  [path]
  (try (ef/absolute? path)
       (catch Exception _ false)))
