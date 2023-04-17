# WAP to solve quadratic equation
import math
import cmath

a = float(input("Enter co-ef of x^2: "))
b = float(input("Enter co-ed of x: "))
c = float(input("Enter constant: "))

d = (b * b) - (4 * a * c)

if d == 1:
    print("Single Root Exists!")
    Root = ((-b) / (2 * a))
    print(Root)
elif d > 0:
    print("Two Roots exists!")
    Root1 = ((-b) + math.sqrt(d)) / (2 * a)
    Root2 = ((-b) - math.sqrt(d)) / (2 * a)
    print(Root1)
    print(Root2)
else:
    print("Imaginary Roots Exists!")
    ImgRoot1 = ((-b) + cmath.sqrt(d)) / (2 * a)
    ImgRoot2 = ((-b) - cmath.sqrt(d)) / (2 * a)
    print(ImgRoot1)
    print(ImgRoot2)