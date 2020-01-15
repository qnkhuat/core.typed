(ns clojure.core.typed.annotator.test.runtime-infer.kw-singleton
  {:lang :core.typed
   :core.typed {:features #{:runtime-infer}}
   }
  (:require [clojure.core.typed :as t]
            [clojure.spec.alpha :as s]
            [clojure.pprint :refer [pprint]]))

;; Start: Generated by clojure.core.typed - DO NOT EDIT
(s/def ::a #{:e :c :b :d :f})
(s/def ::AMap (s/keys :req [::a]))
(s/fdef single-out :args (s/cat) :ret ::AMap)
;; End: Generated by clojure.core.typed - DO NOT EDIT
(defn single-out []
  (rand-nth
    [{::a :b}
     {::a :c}
     {::a :d}
     {::a :e}
     {::a :f}]))

(dotimes [_ 100]
  (single-out))
