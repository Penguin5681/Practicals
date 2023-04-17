# WAP to create list of words and convert only those words into upper case which start with vowels (a,e,I,o,u) other remain as it is.

li = ['the', 'wheels', 'on', 'the', 'bus', 'go', 'round', 'and', 'round,', 'all', 'through', 'the', 'town']

def convertUpper(li):
    for i in range(len(li)):
        if li[i][0] in "aeiouAEIOU":
            li[i] = li[i].upper()
            
convertUpper(li)
print(li)