# WAP to find maximum (largest) number among three numbers.

x = int(input("Enter x: "))
y = int(input("Enter y: "))
z = int(input("Enter z: "))
if x > y and x > z:
    print("Number 1 is greatest among three numbers")
elif y > x and y > z:
    print("Number 2 is greatest among three numbers")
else:
    print("Number 3 is greatest among three numbers")
