def raindrops(number, drops=((3, "Pling"), (5, "Plang"), (7, "Plong"))):
    ret = "".join(b for a, b in drops if divisable(number, a))

    return ret if ret else str(number)

def divisable(a, b):
    return a % b == 0
