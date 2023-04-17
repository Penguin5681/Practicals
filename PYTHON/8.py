# WAP to check entered number is positive, negative, zero, odd or even using if else statement

x = float(input("Enter a number: "))
if x > 0:
   print("Positive x")
   if x % 2 == 0:
     print("Even!")
   else:
     print("Odd!")

elif x == 0:
   print("Zero!")
else:
   print("Negative!")
