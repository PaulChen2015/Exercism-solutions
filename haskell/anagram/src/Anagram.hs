module Anagram (anagramsFor) where
import Data.List (sort)
import Data.Char (toLower)

anagramsFor :: String -> [String] -> [String]
anagramsFor xs = filter (isAnagram xs)

isAnagram :: String -> String -> Bool
isAnagram a b = a' /= b' && sort a' == sort b'
                 where
                    a' = lowerStr a
                    b' = lowerStr b
                    lowerStr = map toLower
