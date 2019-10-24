(defproject spa-health-system-lein "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.520"]
                 [ring "1.7.1"]
                 [http-kit "2.3.0"]
                 [clj-http "2.0.0"]
                 [clojure-tools "1.1.3"]
                 [org.clojure/tools.nrepl "0.2.13"]
                 [cider/cider-nrepl "0.22.4"]
                 [org.clojure/tools.deps.alpha "0.8.578"]
                 [reagent "0.9.0-rc2"]]
  :main ^:skip-aot spa-health-system-lein.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
