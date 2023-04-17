# WAP to find length of string without using inbuilt function len() function.

def findLength(St):
    len_St = 0
    for i in St:
        len_St += 1
    return len_St

print(findLength("Pranav"))