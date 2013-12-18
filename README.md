# protractor-cljs

protractor-cljs is a library for working with the protractor testing framework

## Installation

Add the following dependency to your `project.clj` file:

```
  [protractor-cljs "0.1.1"]
```    

## Usage

protractor-cljs uses [jasmine-cljs](https://github.com/cursivecode/jasmine-cljs)    

```clojure  
(ns yourapp
  (:require-macros [jasmine-cljs.macros :refer [describe it expect dont-expect
                                                before-each after-each xit xdescribe]]
                   [protractor-cljs.macros :refer [by get-elem browser]]))
```    

## protractor-cljs - Protractor test
```clojure
(describe "angularjs homepage - cljs"
  (it "should greet the named user"
      (browser :get "http://www.angularjs.org")

      (-> (get-elem (by :model "yourName"))
          (.sendKeys "Julie"))

      (let [greeting (get-elem (by :binding "yourName"))]
        (expect (.getText greeting) :to-equal "Hello Julie!"))))
```
## Differences

* The global variable ```element``` provided by protractor is ```get-elem```      
* The global variables ```by``` and ```browser``` are functions that take a keyword and args  

## License

Copyright © 2013 Michael Doaty

Distributed under the Eclipse Public License, same as Clojure.