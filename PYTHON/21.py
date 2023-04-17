# WAP to find sum of natural numbers using for loop as well as while loop.

n = int(input())

def forSum(n):
    sum = 0
    for i in range(1, n + 1):
        sum += i
        
    return sum

def whileSum(n):
    i = n
    sum = 0
    while i != 0:
        sum += i
        i -= 1
    return sum

