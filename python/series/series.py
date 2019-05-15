def slices(series, length):
    size = len(series)

    if length > size or length <= 0:
        raise ValueError(f'Invaild length: {length}')

    return [series[i:i+length] for i in range(0, size - length + 1)]
