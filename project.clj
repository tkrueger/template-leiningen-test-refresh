(defproject leiningen-test-refresh-template "0.1.0-SNAPSHOT"
  :description "Template for leinigen plus test-refresh"
  :url "http://github.com/tkrueger/templates/leiningen-test-refresh"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                 [org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot test-refresh.core
  :target-path "target/%s"
  :profiles {
             :uberjar {:aot :all}
             :dev {:plugins [[com.jakemccrary/lein-test-refresh "0.15.0"]]}}
  :test-refresh {:notify-command ["terminal-notifier" "-title" "Tests" "-message"]})
