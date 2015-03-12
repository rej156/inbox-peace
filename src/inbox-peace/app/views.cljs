(ns inbox-peace.views
  (:require [reagent.core  :as reagent :refer [atom]]
            [re-frame.core :refer [subscribe dispatch]]))

(defn app
  []
  (let [x 1]
    (fn []
      [:div.lol
       [:button {:on-click #(set! (.-location js/window) "#/zenmode")} "Inbox Peace"]])))
