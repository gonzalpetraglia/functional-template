(ns exercise4)


(defn summary
  "Give the sum of the number that are stored in whatever structure is x."
  [x]
  
    (reduce + 0 x)
  
)
