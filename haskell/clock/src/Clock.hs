module Clock (addDelta, fromHourMin, toString) where
    
import Text.Printf (printf)

data Clock = Clock Int Int
             deriving (Eq)

fromHourMin :: Int -> Int -> Clock
fromHourMin hour min = Clock h m
                       where
                        (hr, m) = min `divMod` 60
                        h       = (hour + hr) `mod` 24

toString :: Clock -> String
toString (Clock h m) = printf "%02d:%02d" h m

addDelta :: Int -> Int -> Clock -> Clock
addDelta hour min (Clock h m) = fromHourMin (hour + h) (min + m)
