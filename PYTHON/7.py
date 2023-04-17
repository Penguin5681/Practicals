# WAP to swap value of two variables with all five possibilities:

# 1 Using temp variable 
# 2 Using + and - Operator 
# 3 Using // and * Operator 
# 4 Using ^ (XOR) operator 
# 5 By using concept of different value to multiple variable allocation concept


def temp(x, y):
    print("Before Swap: x =",x, "y =",y)
    temp = x
    x = y
    y = temp
    print("After Swap: x =",x, "y =",y)
    
def plusMinus(x, y):
    print("Before Swap: x =",x, "y =",y)
    x = x + y
    y = x - y
    x = x - y
    print("After Swap: x =",x, "y =",y)
    
def floorMultiply(x, y):
    print("Before Swap: x =",x, "y =",y)
    x = x * y
    y = x // y
    x = x // y
    print("After Swap: x =",x, "y =",y)
    
def xorOP(x, y):
    print("Before Swap: x =",x, "y =",y)
    x = x ^ y
    y = x ^ y
    x = x ^ y
    print("After Swap: x =",x, "y =",y)

def multiVar(x, y):
    print("Before Swap: x =",x, "y =",y)
    x, y = y, x
    print("After Swap: x =",x, "y =",y)
    
