class Matrix(object):
    def __init__(self, matrix_string):
        self.rows = [list(map(int, s.split())) for s in matrix_string.split('\n')]
        self.columns = [list(r) for r in zip(*self.rows)]

    def row(self, index):
        return self.rows[index-1]

    def column(self, index):
        # return [r[index - 1] for r in self.rows]
        return self.columns[index-1]
