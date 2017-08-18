(ns exercise3)

(defn fibonacci
  "Give the ith number on the fibonacci sequence."
  [i]
  (
      if (= i 0) 0 (
          if (= i 1) 1 (+ (fibonacci (- i 1)) (fibonacci (- i 2)) )
      )
  )
)


