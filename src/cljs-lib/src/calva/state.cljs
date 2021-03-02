(ns calva.state)

(defonce state (atom {}))

(defn set-state-value! [key value]
  (swap! state assoc key value))

(defn get-state-value [key]
  (get @state key))

(defn get-state []
  @state)

(comment
  @state
  (swap! state assoc :hello "world")
  (set-state-value! :some-key "some-value")
  (get-state-value :some-key)
  (get-state))