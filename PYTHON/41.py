# Create a dictionary which shows the occurrence/ frequency of each character present in string. [hint : if user enter “welcome to parul university” than your my_dict contain {a:1,b:0,c:1,d:0,e:3, f:0….} like this.

my_string = input()

char_count = {}

for char in my_string:
    if char in char_count:
        char_count[char] += 1
    else:
        char_count[char] = 1

print(char_count)
