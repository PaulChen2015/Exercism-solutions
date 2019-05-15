module LeapYear (isLeapYear) where

isLeapYear :: Integer -> Bool
isLeapYear year | isDivisableBy 400 = True
                | isDivisableBy 100 = False
                | isDivisableBy 4   = True
                | otherwise         = False
  where isDivisableBy x = year `rem` x == 0
