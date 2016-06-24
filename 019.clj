; Last element (using `last` is not allowed)
(= ((fn [x] (nth x (- (count x) 1))) [1 2 3 4 5]) 5)
(= ((fn [x] (nth x (- (count x) 1))) '(5 4 3)) 3)
(= ((fn [x] (nth x (- (count x) 1))) ["b" "c" "d"]) "d")
; or using shorthand anonymous function
(= (#(nth % (- (count %) 1)) [1 2 3 4 5]) 5)
(= (#(nth % (- (count %) 1)) '(5 4 3)) 3)
(= (#(nth % (- (count %) 1)) ["b" "c" "d"]) "d")
