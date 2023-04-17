# WAP which shows use of slicing on string and any other data structure of python.

def doReverse_str(St):
    return St[::-1]

def printEvenLetters(St):
    return St[::2]

def doReverse_Li(li):
    return li[::-1]

def isPalindrome(St):
    return St == St[::-1]

print(doReverse_str("VANARP"))
print(*doReverse_Li([4, 3, 2, 1]))
# P R A N A V
# V A N A R P