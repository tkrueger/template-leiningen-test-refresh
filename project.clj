(defproject template-leiningen-test-refresh "0.1.0-SNAPSHOT"
  :description "Template for leinigen plus test-refresh"
  :url "http://github.com/tkrueger/template-leiningen-test-refresh"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                 [org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot test-refresh.core
  :target-path "target/%s"
  :profiles {
             :uberjar {:aot :all}
             :dev {
                   ; auto-runs tests in repl, use with "lein test-refresh"
                   :plugins [[com.jakemccrary/lein-test-refresh "0.15.0"]]

                   ; Humane test ouput, pretty-prints test output and does diffs
                   :dependencies [[pjstadig/humane-test-output "0.8.0"]]
                   :injections [(require 'pjstadig.humane-test-output)
                                (pjstadig.humane-test-output/activate!)]}}

  ; have test-refresh give notifications after each run
  :test-refresh {:notify-command ["terminal-notifier" "-title" "Tests" "-message"]})
