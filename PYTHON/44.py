# WAP which shows the use of seek() and tell() method to set and to get the position of file pointer.

file = open("data.txt", "r")

file.seek(10)

print("Current position of file pointer:", file.tell())

content = file.read()
print("Content from current position:", content)

file.close()