(ns protractor-cljs.main
  (:require-macros [jasmine-cljs.macros :refer [describe it expect dont-expect
                                                before-each after-each xit xdescribe]]
                   [protractor-cljs.macros :refer [by get-elem browser]]))

(describe "angularjs homepage - cljs"
  (it "should greet the named user"
      (browser :get "http://www.angularjs.org")

      (-> (get-elem (by :model "yourName"))
          (.sendKeys "Julie"))

      (let [greeting (get-elem (by :binding "yourName"))]
        (expect (.getText greeting) :to-equal "Hello Julie!"))))
