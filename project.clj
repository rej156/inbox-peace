(defproject inbox-peace "0.1.0-SNAPSHOT"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-3058"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [khroma "0.0.2"]
                 [cljsjs/jquery "1.9.0-0"]
                 [re-frame "0.2.0"]
                 [secretary "1.2.2-SNAPSHOT"]]
  :source-paths ["src"]
  :profiles {:dev {:plugins [[com.cemerick/austin "0.1.6"]
                             [lein-cljsbuild "1.0.5"]
                             [lein-chromebuild "0.2.1"]]

                   :cljsbuild {:builds {:main
                                        {:source-paths ["src"]
                                         :compiler {:output-to "target/unpacked/inbox_peace.js"
                                                    :output-dir "target/js"
                                                    :optimizations :whitespace
                                                    :pretty-print true}}}}
                   }})
