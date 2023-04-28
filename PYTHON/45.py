# WAP to store output of python script into text file. Open file using with statement.

with open("output.txt", "w") as f:
    f.write("Hello, World!")