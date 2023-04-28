# Write a Python script to generate and print a dictionary that contains a number (between 1 and n) in the form (x, x*x). Expected Output : {1: 1, 2: 4, 3: 9, 4: 16, 5: 25} where value of n is enter by user.

n = int(input("Enter the value of n: "))

my_dict = {}
for x in range(1, n+1):
    my_dict[x] = x*x

print(my_dict)
