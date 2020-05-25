from Parser import Preparation as prep

# Get a full command
command: str = input()

# Split into words
words: list = command.split(' ')

# Get the functions, which is word[0]
func: str = words[0]

# Check if func is a keyword.
if not prep.is_func(func):
    raise IOError
