import random
from string import ascii_uppercase as alpha

class Robot(object):
    names = set()

    def __init__(self):
        self.reset()

    def _uniquename(self):
        while True:
            name = self._getname()
            if name not in self.names:
                self.names.add(name)
                return name

    def _getname(self):
        return random.choice(alpha) + random.choice(alpha) + str(random.randint(100, 1000))

    def reset(self):
        self.name = self._uniquename()
