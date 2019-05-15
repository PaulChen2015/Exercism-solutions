module Acronym (abbreviate) where

import Data.Char (toUpper, isLetter, isUpper)

abbreviate :: String -> String
abbreviate xs = map toUpper (filter isLetter (acr xs True))

acr :: String -> Bool -> String
acr [] _ = []
acr (x:xs) b | b || isUpper x = x : acr (dropWhile (isUpper) xs) False
             | x `elem` " -"  = acr xs True
             | otherwise      = acr xs b
