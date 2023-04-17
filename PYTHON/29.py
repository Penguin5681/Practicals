# WAP to create list and perform operation like searching element, adding element, update element, removing element, traverse list in both direction left to right and right to left by passing list as argument in user defined function.

li = [1, 2, 3, 4, "Pranav", 5, "Apple"]

def searchEle(List, key):
    for i in List:
        if i == key:
            return True
    return False
        
def addEle(List, Element):
    List.append(Element)
    
def updateEle(List, Element, index):
    List[index] = Element
    
def removeEle(List, index):
    List.pop(index)

def traverseL(li):
    print(li)
    
def traverseR(li):
    print(li[::-1])
