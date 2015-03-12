(ns inbox-peace.content
  (:require [khroma.runtime :as runtime]
            [khroma.log :as console]
            [reagent.core :as reagent :refer [atom]]
            [re-frame.core :refer [dispatch dispatch-sync]]
            [cljs.core.async :refer [>! <!]])
  (:require-macros [cljs.core.async.macros :refer [go]]))

(enable-console-print!)

(defn init []
  ;; (let [bg (runtime/connect)]
  ;;   (go (>! bg :lol-i-am-a-content-script)
  ;;       (console/log "Background said: " (<! bg))))

  ;; (dispatch-sync [:initialize-db])
  (reagent/render [inbox-peace.views/app]
                  (.getElementById js/document ":j"))
  )
