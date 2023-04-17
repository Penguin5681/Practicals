# WAP to find simple interest for given principal amount. Take input of principal amount, rate of interest and year from user. (Interest=(PRN)/100)

p = float(input("Enter Principal Rate: "))
r = float(input("Enter Rate of Interest: "))
n = float(input("Enter time period (In years): "))

print("The SI is:",p * r * n * 0.01)