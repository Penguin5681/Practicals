# WAP to remove all the duplicate element from list by using single list. 

li = [1, 2, 3, 4, 4, 3, 2, 1]

def rDuplication(anyList):
    st = set(anyList)
    return list(st)

print(rDuplication(li))