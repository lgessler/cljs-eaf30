(defproject cljs-eaf30 "0.0.2"
  :description "Delete me"
  :url "https://github.com/lgessler/cljs-eaf30.git"
  :license {:name "MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.908"]
                 [org.clojure/data.xml "0.2.0-alpha5"]
                 [com.andrewmcveigh/cljs-time "0.5.0"]]

  :deploy-repositories [["releases"  {:sign-releases false :url "https://clojars.org/repo"}]
                        ["snapshots" {:sign-releases false :url "https://clojars.org/repo"}]]
  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-doo "0.1.10"]]
  :cljsbuild {:builds {:min {:source-paths ["src"]
                             :compiler {:optimizations :advanced}}
                       :dev {:source-paths ["src"]
                             :compiler {:optimizations :whitespace}}
                       :test {:id "test"
                              :source-paths ["src" "test"]
                              :compiler {:output-to "target/cljs-tests.js"
                                         :output-dir "target"
                                         :main cljs-eaf30.runner
                                         :optimizations :none
                                         :target :nodejs}}}})
