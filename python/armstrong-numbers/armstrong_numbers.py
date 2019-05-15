def is_armstrong(number):
    strnum = str(number)
    result = sum([int(i) ** len(strnum) for i in strnum])
    return result == number
