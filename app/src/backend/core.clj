(ns src.backend.core
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [ring.util.response :refer :all]))

(defn handler [request]
  (-> (response "Hello Friend!")
      (content-type "text/html")))

(run-jetty handler {:port 3002})

