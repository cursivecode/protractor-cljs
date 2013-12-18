(defproject protractor-cljs "0.1.0"
  :description "Library for working with protractor"
  :url "http://github.com/cursivecode/protractor-cljs"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2120"]
                 [jasmine-cljs "0.1.2"]
                 ]

  :min-lein-version "2.0.0"
  :source-paths ["src/clj"]
  :cljsbuild {:builds {:cljstest {:source-paths ["src/cljs/tests"]
                                  :compiler {:output-to "resources/public/js/tests.js"
                                             :optimizations :simple
                                             :pretty-print true}}}
              })
  
