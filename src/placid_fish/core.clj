(ns placid-fish.core
  (:require [org.bovinegenius.exploding-fish :as ef]))

(defn absolute?
  [path]
  (cond
    (nil? path) nil
    :else (ef/absolute? path)))
