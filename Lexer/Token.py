class Token:
    # Test method:
    # attempt = Token(...)
    # print(attempt.toString())

    def __init__(self, t):
        self.tag = t

    def toString(self):
        return str(self.tag)
