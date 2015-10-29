(ns squish.core
  (:require [clojure.string :as string]))

(defn squeeze_spaces [str]
  (string/replace str #"\s+" " "))

(defn squish [str]
 ((comp squeeze_spaces string/triml string/trimr) str))
