# WAP menu driven program to find area of triangle, circle, rectangle, square and cylinder

def areaTriangle(b, h):
    return 0.5 * b * h

def areaCircle(r):
    return 3.14 * r * r

def areaRectangle(l, b):
    return l * b

def areaSquare(a):
    return a * a

def areaCylinder(r, h):
    return 2 * 3.14 * r * (r + h)

print("Enter 1 to calculate area of triangle")
print("Enter 2 to calculate area of circle")
print("Enter 3 to calculate area of rectangle")
print("Enter 4 to calculate area of square")
print("Enter 5 to calculate area of cylinder")

ch = int(input())

if ch == 1:
    b = float(input("Enter Base: "))
    h = float(input("Enter Altitude: "))
    print("Area =",areaTriangle(b, h))
elif ch == 2:
    r = float(input("Enter Radius: "))
    print("Area =",areaCircle(r))
elif ch == 3:
    l = float(input("Enter length: "))
    b = float(input("Enter breath: "))
    print("Area =",areaRectangle(l, b))
elif ch == 4:
    b = float(input("Enter Side: "))
    print("Area =",areaSquare(b))
elif ch == 5:
    r = float(input("Enter Base Radius: "))
    h = float(input("Enter Altitude: "))
    print("Area =",areaCylinder(r, h))
else:
    print("Invalid Input!")