# WAP to create list of cube and square for up to given number. E.g. if user enter 10 than store cube and square to 1 to 10 into list.

def storeCubeSq(n):
    li = []
    for i in range(1, n + 1):
        li.append(i ** 3)

    for i in range(1, n + 1):
        li.append(i ** 2)
    return li


n = int(input("Enter a number: "))
print(storeCubeSq(n))