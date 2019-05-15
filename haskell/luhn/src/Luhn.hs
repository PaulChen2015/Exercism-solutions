module Luhn (isValid) where
import Data.Char

isValid :: String -> Bool
isValid = luhn . reverse . map digitToInt . filter isDigit

luhn :: [Int] -> Bool
luhn xs | length xs <= 1 = False
        | otherwise      = sum (altMap id luhnDouble xs) `mod` 10 == 0

altMap :: (a -> b) -> (a -> b) -> [a] -> [b]
altMap _ _ [] = []
altMap f g (x:xs) = f x : (altMap g f xs)

luhnDouble :: Int -> Int
luhnDouble n | dn > 9    = dn - 9
             | otherwise = dn
           where
             dn = n * 2
