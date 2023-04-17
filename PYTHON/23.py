# Write a menu driven program to create simple calculator using user defined function.

def add(x, y):
    print(x + y)
def sub(x, y):
    print(x - y)
def multiply(x, y):
    print(x * y)
def divide(x, y):
    print(x / y)
def fDivide(x, y):
    print(x // y)
def mod(x, y):
    print(x % y)
def exp(x, y):
    print(x ** y)

x = float(input("Enter x: "))
y = float(input("Enter y: "))

print("Choose the operation to perform:")
print("1. Addition of two numbers")
print("2. Subtraction of two numbers")
print("3. Multiplication of two numbers")
print("4. Division of two numbers")
print("5. Floor Division of two numbers")
print("6. Modulus of two numbers")
print("7. Exponentiation of two numbers")
ch = int(input())

if ch == 1:
    add(x, y)
elif ch == 2:
    sub(x, y)
elif ch == 3:
    multiply(x, y)
elif ch == 4:
    divide(x, y)
elif ch == 5:
    fDivide(x, y)
elif ch == 6:
    mod(x, y)
elif ch == 7:
    exp(x, y)
else:
    print("Invalid Input Dumbo :|")