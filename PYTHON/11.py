# Write a menu driven program which show use of all arithmetic operators and print its result.

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
    print(x + y)
elif ch == 2:
    print(x - y)
elif ch == 3:
    print(x * y)
elif ch == 4:
    print(x / y)
elif ch == 5:
    print(x // y)
elif ch == 6:
    print(x % y)
elif ch == 7:
    print(x ** y)
else:
    print("Invalid Input!")
