# Write a python program to create dictionary of binary number up to given range. If user enter 15 than store binary number of 1 to 15 into dictionary and print it in proper format.

n = int(input("Enter the range: "))

binary_dict = {}
for i in range(1, n+1):
    binary_dict[i] = bin(i)[2:].zfill(len(bin(n)[2:]))

for key, value in binary_dict.items():
    print(key, ": ", value)