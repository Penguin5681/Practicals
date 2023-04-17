# WAP to print list of Armstrong number from given interval.

lBound = int(input("Enter the lower limit: "))
uBound = int(input("Enter the upper limit: "))

for i in range(lBound, uBound + 1):
    digitLen = len(str(i))
    sum = 0
    for n in str(i):
        sum += int(n) ** digitLen
    if sum == i:
        print(i, end=" ")