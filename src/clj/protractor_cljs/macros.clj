(ns protractor-cljs.macros
  (:require [clojure.string :as s]
            [jasmine-cljs.macros :refer [key->method]]))

(defmacro by [k & body]
  `(~(key->method k) js/by ~@body))

(defmacro browser [k & body]
  `(~(key->method k) js/browser ~@body))

(defmacro get-elem [& body]
  `(js/element ~@body))

