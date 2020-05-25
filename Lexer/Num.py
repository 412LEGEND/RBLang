import Lexer.Token as token
import Lexer.Tag as tag


class Num(token.Token):
    def __init__(self, v):
        super(tag.Tag.NUM)
        self.value = v

    def toString(self):
        return str(self.value)
