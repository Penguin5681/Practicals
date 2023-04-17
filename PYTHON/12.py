# Write a menu driven program to convert kilometre to miles, Celsius to Fahrenheit, meter to centimetre, acer to square meter.

print("Choose the operation to perform:")
print("1. Convert Kilometer to Miles")
print("2. Convert Celsius to Fahrenheit")
print("3. Convert Meter to Centimeter")
print("4. Convert Acer to Square meter")

ch = int(input())

if ch == 1:
    km = float(input("Enter Value: "))
    print(km / 1.609344)
elif ch == 2:
    c = float(input("Enter Value: "))
    print((c * 9 / 5) + 32)
elif ch == 3:
    m = float(input("Enter Value: "))
    print(m * 100)
elif ch == 4:
    a = float(input("Enter Value: "))
    print(a * 4047)
else:
    print("Invalid Input!")