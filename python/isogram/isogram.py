def is_isogram(string):
    unique_letters = set()
    letters = [char for char in string.lower() if char.isalpha()];
    for letter in letters:
        if letter in unique_letters:
            return False
        else:
            unique_letters.add(letter)
    return True
