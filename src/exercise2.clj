(ns exercise2)

(defn only-greater-than-five
  "Filter number less or equal than five,thus leaving only the numbers that are greater than five."
  [x]
  (filter (fn [y] (> y 5) ) x)
)



