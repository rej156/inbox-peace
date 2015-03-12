(ns inbox-peace.content
  (:require [khroma.runtime :as runtime]
            [khroma.log :as console]
            [reagent.core :as reagent :refer [atom]]
            [re-frame.core :refer [dispatch dispatch-sync]]
            [cljs.core.async :refer [>! <!]]
            [cljsjs.jquery]
            [inbox-peace.views :as views])
  (:require-macros [cljs.core.async.macros :refer [go]]))

(enable-console-print!)

(defn mount-zenmode-button []
(reagent/render [views/app]
                  (get (.getElementsByClassName js/document "aki pp") 0)))

(defn init []
  ;; (let [bg (runtime/connect)]
  ;;   (go (>! bg :lol-i-am-a-content-script)
  ;;       (console/log "Background said: " (<! bg))))

  ;; (dispatch-sync [:initialize-db])
;;  (js/$)
  (.ready (js/$ "#:j") (mount-zenmode-button)))
