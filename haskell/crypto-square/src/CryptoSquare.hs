module CryptoSquare (encode) where

import Data.List (transpose, )
import Data.Char (isAlphaNum, toLower)

encode :: String -> String
encode [] = []
encode xs = (unwords . transpose) ys
            where
                normalized = (map toLower . filter isAlphaNum) xs
                c          = (ceiling . sqrt . fromIntegral . length) normalized
                ys         = chunksOf' c normalized


chunksOf' :: Int -> String -> [String]
chunksOf' _ [] = []
chunksOf' n xs = take n xs : chunksOf n (drop n xs)

