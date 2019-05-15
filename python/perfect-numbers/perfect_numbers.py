def classify(number):
    if number <= 0:
        raise ValueError("Must be a positive integer.")
        
    aliquot_sum = sum(factors(number))
    if aliquot_sum == number:
        return "perfect"
    elif aliquot_sum > number:
        return "abundant"
    else:
        return "deficient"


def factors(n):
    return [f for f in range(1, n//2 + 1) if (n%f) == 0]

