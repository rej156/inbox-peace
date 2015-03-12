(ns inbox-peace.content
  (:require [khroma.runtime :as runtime]
            [khroma.log :as console]
            [reagent.core :as reagent :refer [atom]]
            [re-frame.core :refer [dispatch dispatch-sync]]
            [cljs.core.async :refer [>! <!]]
            [cljsjs.jquery]
            [inbox-peace.views.zen :as zen]
            [inbox-peace.views :as views])
  (:require-macros [cljs.core.async.macros :refer [go]]))

(enable-console-print!)

(defn mount-zenmode-button []
  (reagent/render [views/app]
                  (.getElementById js/document "zen")))

(defn mount-zenmode-app []
  (reagent/render [zen/app]
                  (.getElementById js/document "zen")))

(defn init []
  ;; (let [bg (runtime/connect)]
  ;;   (go (>! bg :lol-i-am-a-content-script)
  ;;       (console/log "Background said: " (<! bg))))

  ;; (dispatch-sync [:initialize-db])
;;  (js/$)
  ;;(mount-zenmode-button)
   (mount-zenmode-button)
  )
