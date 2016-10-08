(defproject sscom "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [http-kit "2.1.18"]
                 [ring "1.4.0"]
                 [ring/ring-defaults "0.1.5"]
                 [lib-noir "0.9.9"]
                 [com.ashafa/clutch "0.4.0"]
                 [selmer "0.9.1"]
                 [couchbase-clj "0.2.0"]
                 [com.stuartsierra/component "0.3.0"]]
  :main sscom.core)
