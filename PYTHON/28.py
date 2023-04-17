# Write a program to perform all bitwise operation using user defined function.

def bitAND(x, y):
    return x & y

def bitOR(x, y):
    return x | y

def bitXOR(x, y):
    return x ^ y

def bitNOT(x):
    return ~x

def bitLS(x, n):
    return x << n

def bitRS(x, n):
    return x >> n

print(bitAND(10, 5))
print(bitOR(12, 4))
print(bitXOR(12, 14))
print(bitNOT(-13))
print(bitLS(10, 2))
print(bitRS(10, 1))