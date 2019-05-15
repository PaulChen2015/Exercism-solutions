def is_pangram(sentence):
    atoz = set('abcdefghijklmnopqrstuvwxyz')
    return (atoz & set(sentence.lower())) == atoz
