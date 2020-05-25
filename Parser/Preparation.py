funcs = ["deff", "defs", "defb", "if"]
keywords = ["and", "or", "not", "concat", "add", "sub", "multi", "divid"]


def is_func(word: str) -> bool:
    # Detect keywords
    # Test method: print(is_func(...))

    if funcs.__contains__(word):
        return True
    else:
        return False


def is_key(word: str) -> bool:
    # Detect keywords
    # Test method: print(is_key(...))

    if keywords.__contains__(word):
        return True
    else:
        return False
