# WAP to print multiplication table in proper format for entered number using for loop as well as while loop.

def tableFor():
    n = int(input("Enter a number: "))
    for i in range(1, n - 1):
        print(n,"x",i,"=",n * i)
    
def tableWhile():
    n = int(input("Enter a number: "))
    i = 1
    while i <= 10:
        print(n,"x",i,"=",n * i)
        i += 1
    
