li1 = [1, 2, 3, 4]
li2 = [1, 4, 6, 7]

# Finding common elements in a list

def c1(li1, li2):
    newLi = []
    for i in li1:
        for j in li2:
            if i == j: newLi.append(i)
    return newLi

def c2(li1, li2):
    li1 = set(li1)
    li2 = set(li2)
    commonEle = li1.intersection(li2)
    return commonEle

def c3(li1, li2):
    commonEle = [i for i in li1 if i in li2]
    return commonEle

# Filtering the list (Even/Odd in this example)

li = [1, 4, 5, 6, 7, 9, 0, 3]

def filterEven(li):
    newLi = [i for i in li if i % 2 == 0]
    return newLi

def filterOdd(li):
    newLi = [i for i in li if i % 2 != 0]
    return newLi

# List slicing and element searching

def listSlice(start, stop, step, li):
    return li[start:stop:step]

def listSearch(li, target):     
    for i in li:
        if i == target:
            return True
    return False

# Recursion

def findFact(n):
    if n <= 1: return 1
    return n * findFact(n - 1)

# Comprehensions (List, Dictionary, String, Set)

def listComprehend():
    numbers = [1, 2, 3, 4, 5, 6]
    evenSquares = [i ** 2 for i in numbers if i % 2 == 0]
    print(evenSquares)
    
def dictComprehend():
    numbers = [1, 2, 3, 4, 5, 6]
    evenCubes = {key: key ** 3 for key in numbers if key % 2 == 0}
    print(evenCubes)

def strComprehend():
    name = "pranav sinha"
    fullName = "".join([ch.upper() for ch in name])
    print(fullName)
    
def setComprehend():
    numbers = [1, 2, 3, 4, 5, 6]
    oddNum = {num for num in numbers if num % 2 != 0}
    print(oddNum)

# isAnagram??

def isAnagram(str1, str2):
    return sorted(str1) == sorted(str2)

# Count the occurrences of each character in a string

def countHowMany(St):
    result = {}
    for i in St:
        result[i] = St.count(i)
    return result
    
# Remove vowels from a string

def removeVowel(St):
    vowels = "AEIOUaeiou"
    return "".join([ch for ch in St if ch not in vowels]) 
    
print(removeVowel("AEIoX"))
