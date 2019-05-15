module Prime (nth) where

nth :: Int -> Maybe Integer
nth n | n <= 0    = Nothing
      | otherwise = Just (primes !! (n-1))

primes :: [Integer]
-- primes = [n | n <- [2..], all (\x -> (n `mod` x) /= 0) [2..((round . sqrt) (fromIntegral n))]]
primes = sieve [2..]
         where
            sieve (p:xs) = p : sieve [x | x <- xs, x `rem` p > 0]
