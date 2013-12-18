(defproject protractor-cljs "0.1.1"
  :description "Library for working with protractor"
  :url "http://github.com/cursivecode/protractor-cljs"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[jasmine-cljs "0.1.3"]]

  :min-lein-version "2.0.0"
  :source-paths ["src/clj"]
  :cljsbuild {:builds {:cljstest {:source-paths ["src/cljs/tests"]
                                  :compiler {:output-to "resources/public/js/tests.js"
                                             :optimizations :simple
                                             :pretty-print true}}}
              })
  
