(ns inbox-peace.views.zen
  (:require [reagent.core  :as reagent :refer [atom]]
            [re-frame.core :refer [subscribe dispatch]]))

(defn app
  []
  (let [x 1]
    (fn []
      [:div.zen
       [:h1 "I win"]
       ])))
