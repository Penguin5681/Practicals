# WAP to find whether inputted number is Armstrong or not.

num = int(input("Enter a number: "))

digitLen = len(str(num))

sum = 0

for digit in str(num):
    sum += int(digit) ** digitLen

if sum == num:
    print(num, "is an Armstrong number")
else:
    print(num, "is not an Armstrong number")
