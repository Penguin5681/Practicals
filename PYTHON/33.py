# WAP to program to create tuple and perform operation like searching, find length, slicing, also change first and last or entered index element by using concept of slicing and concatenation

tp = (1, 2, 3, 4, "Apple", "Banana", "Kiwi")

def search(anyTuple, key):
    for i in anyTuple:
        if i == key:
            return True
    return False

def findLen(anyTuple):
    len_tuple = 0
    for i in anyTuple:
        len_tuple += 1
    return len_tuple

def update(anyTuple, index, element):
    new_li = list(anyTuple)
    new_li[index] = element
    anyTuple = tuple(new_li)
    return anyTuple
    
def joinTuple(t1, t2):
    return t1 + t2

