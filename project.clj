(defproject dysentery "0.2.1-SNAPSHOT"
  :description "Exploring ways to participate in a Pioneer Pro DJ Link network"
  :url "http://github.com/brunchboy/dysentery"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [com.taoensso/timbre "4.10.0"]
                 [selmer "1.10.8"]]
  :main dysentery.core
  :uberjar-name "dysentery.jar"

  :profiles {:dev {:repl-options {:init-ns dysentery.core
                                  :welcome (println "dysentery loaded.")}
                   :jvm-opts ["-XX:-OmitStackTraceInFastThrow"]}
             :uberjar {:aot :all}}

  :min-lein-version "2.0.0")
