class HighScores(object):
    def __init__(self, scores):
        self.scores = scores

    def latest(self):
        try:
            return self.scores[-1]
        except:
            pass

    def personal_best(self):
        try:
            return max(self.scores)
        except:
            pass

    def personal_top_three(self):
        return sorted(self.scores, reverse=True)[:3]